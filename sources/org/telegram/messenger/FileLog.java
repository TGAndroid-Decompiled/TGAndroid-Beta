package org.telegram.messenger;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.Log;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.ui.LaunchActivity;
public class FileLog {
    private static volatile FileLog Instance = null;
    public static boolean databaseIsMalformed = false;
    private static HashSet<String> excludeRequests = null;
    private static Gson gson = null;
    private static final String mtproto_tag = "MTProto";
    private static final String tag = "tmessages";
    private boolean initied;
    private OutputStreamWriter streamWriter = null;
    private FastDateFormat dateFormat = null;
    private DispatchQueue logQueue = null;
    private File currentFile = null;
    private File networkFile = null;
    private File tonlibFile = null;
    private OutputStreamWriter tlStreamWriter = null;
    private File tlRequestsFile = null;

    public static FileLog getInstance() {
        FileLog fileLog = Instance;
        if (fileLog == null) {
            synchronized (FileLog.class) {
                fileLog = Instance;
                if (fileLog == null) {
                    fileLog = new FileLog();
                    Instance = fileLog;
                }
            }
        }
        return fileLog;
    }

    public FileLog() {
        if (BuildVars.LOGS_ENABLED) {
            init();
        }
    }

    public static void dumpResponseAndRequest(TLObject tLObject, TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error, final long j, final long j2, final int i) {
        if (!BuildVars.DEBUG_PRIVATE_VERSION || !BuildVars.LOGS_ENABLED || tLObject == null || SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        String simpleName = tLObject.getClass().getSimpleName();
        checkGson();
        if (excludeRequests.contains(simpleName) && tLRPC$TL_error == null) {
            return;
        }
        try {
            final String str = "req -> " + simpleName + " : " + gson.toJson(tLObject);
            String str2 = "null";
            if (tLObject2 != null) {
                str2 = "res -> " + tLObject2.getClass().getSimpleName() + " : " + gson.toJson(tLObject2);
            } else if (tLRPC$TL_error != null) {
                str2 = "err -> " + TLRPC$TL_error.class.getSimpleName() + " : " + gson.toJson(tLRPC$TL_error);
            }
            final String str3 = str2;
            final long currentTimeMillis = System.currentTimeMillis();
            getInstance().logQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    FileLog.lambda$dumpResponseAndRequest$0(j, j2, i, currentTimeMillis, str, str3);
                }
            });
        } catch (Throwable th) {
            e(th, BuildVars.DEBUG_PRIVATE_VERSION);
        }
    }

    public static void lambda$dumpResponseAndRequest$0(long j, long j2, int i, long j3, String str, String str2) {
        try {
            String str3 = "requestMsgId=" + j + " requestingTime=" + (System.currentTimeMillis() - j2) + " request_token=" + i;
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j3) + " " + str3);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str2);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            Log.d(mtproto_tag, str3);
            Log.d(mtproto_tag, str);
            Log.d(mtproto_tag, str2);
            Log.d(mtproto_tag, " ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dumpUnparsedMessage(TLObject tLObject, final long j) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null && SharedConfig.getDevicePerformanceClass() != 0) {
            try {
                checkGson();
                getInstance().dateFormat.format(System.currentTimeMillis());
                final String str = "receive message -> " + tLObject.getClass().getSimpleName() + " : " + gson.toJson(tLObject);
                final long currentTimeMillis = System.currentTimeMillis();
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$dumpUnparsedMessage$1(currentTimeMillis, str, j);
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public static void lambda$dumpUnparsedMessage$1(long j, String str, long j2) {
        try {
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j));
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            Log.d(mtproto_tag, "msgId=" + j2);
            Log.d(mtproto_tag, str);
            Log.d(mtproto_tag, " ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void checkGson() {
        if (gson == null) {
            final HashSet hashSet = new HashSet();
            hashSet.add("message");
            hashSet.add("phone");
            hashSet.add("about");
            hashSet.add("status_text");
            hashSet.add("bytes");
            hashSet.add("secret");
            hashSet.add("stripped_thumb");
            hashSet.add("strippedBitmap");
            hashSet.add("networkType");
            hashSet.add("disableFree");
            hashSet.add("mContext");
            HashSet<String> hashSet2 = new HashSet<>();
            excludeRequests = hashSet2;
            hashSet2.add("TL_upload_getFile");
            excludeRequests.add("TL_upload_getWebFile");
            gson = new GsonBuilder().addSerializationExclusionStrategy(new ExclusionStrategy() {
                @Override
                public boolean shouldSkipField(FieldAttributes fieldAttributes) {
                    return hashSet.contains(fieldAttributes.getName());
                }

                @Override
                public boolean shouldSkipClass(Class<?> cls) {
                    return cls.isInstance(ColorStateList.class) || cls.isInstance(Context.class);
                }
            }).registerTypeAdapterFactory(RuntimeClassNameTypeAdapterFactory.of(TLObject.class, "type_")).create();
        }
    }

    public void init() {
        File logsDir;
        if (this.initied) {
            return;
        }
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", Locale.US);
        this.dateFormat = fastDateFormat;
        String format = fastDateFormat.format(System.currentTimeMillis());
        try {
            logsDir = AndroidUtilities.getLogsDir();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (logsDir == null) {
            return;
        }
        this.currentFile = new File(logsDir, format + ".txt");
        this.tlRequestsFile = new File(logsDir, format + "_mtproto.txt");
        try {
            this.logQueue = new DispatchQueue("logQueue");
            this.currentFile.createNewFile();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.currentFile));
            this.streamWriter = outputStreamWriter;
            outputStreamWriter.write("-----start log " + format + "-----\n");
            this.streamWriter.flush();
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.tlRequestsFile));
            this.tlStreamWriter = outputStreamWriter2;
            outputStreamWriter2.write("-----start log " + format + "-----\n");
            this.tlStreamWriter.flush();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.initied = true;
    }

    public static void ensureInitied() {
        getInstance().init();
    }

    public static String getNetworkLogPath() {
        if (BuildVars.LOGS_ENABLED) {
            try {
                File logsDir = AndroidUtilities.getLogsDir();
                if (logsDir == null) {
                    return BuildConfig.APP_CENTER_HASH;
                }
                FileLog fileLog = getInstance();
                fileLog.networkFile = new File(logsDir, getInstance().dateFormat.format(System.currentTimeMillis()) + "_net.txt");
                return getInstance().networkFile.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
                return BuildConfig.APP_CENTER_HASH;
            }
        }
        return BuildConfig.APP_CENTER_HASH;
    }

    public static String getTonlibLogPath() {
        if (BuildVars.LOGS_ENABLED) {
            try {
                File logsDir = AndroidUtilities.getLogsDir();
                if (logsDir == null) {
                    return BuildConfig.APP_CENTER_HASH;
                }
                FileLog fileLog = getInstance();
                fileLog.tonlibFile = new File(logsDir, getInstance().dateFormat.format(System.currentTimeMillis()) + "_tonlib.txt");
                return getInstance().tonlibFile.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
                return BuildConfig.APP_CENTER_HASH;
            }
        }
        return BuildConfig.APP_CENTER_HASH;
    }

    public static void e(final String str, final Throwable th) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e(tag, str, th);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$e$2(str, th);
                    }
                });
            }
        }
    }

    public static void lambda$e$2(String str, Throwable th) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.write(th.toString());
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void e(final String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e(tag, str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$e$3(str);
                    }
                });
            }
        }
    }

    public static void lambda$e$3(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void e(Throwable th) {
        e(th, true);
    }

    public static void e(final Throwable th, boolean z) {
        if (BuildVars.LOGS_ENABLED) {
            if (BuildVars.DEBUG_VERSION && needSent(th) && z) {
                AndroidUtilities.appCenterLog(th);
            }
            if (BuildVars.DEBUG_VERSION && th.getMessage() != null && th.getMessage().contains("disk image is malformed") && !databaseIsMalformed) {
                d("copy malformed files");
                databaseIsMalformed = true;
                File file = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                file.mkdirs();
                ArrayList<File> databaseFiles = MessagesStorage.getInstance(UserConfig.selectedAccount).getDatabaseFiles();
                for (int i = 0; i < databaseFiles.size(); i++) {
                    try {
                        AndroidUtilities.copyFile(databaseFiles.get(i), new File(file, databaseFiles.get(i).getName()));
                    } catch (IOException e) {
                        e(e);
                    }
                }
            }
            ensureInitied();
            th.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$e$4(th);
                    }
                });
            } else {
                th.printStackTrace();
            }
        }
    }

    public static void lambda$e$4(Throwable th) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + stackTrace[i] + "\n");
            }
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fatal(Throwable th) {
        fatal(th, true);
    }

    public static void fatal(final Throwable th, boolean z) {
        if (BuildVars.LOGS_ENABLED) {
            if (BuildVars.DEBUG_VERSION && needSent(th) && z) {
                AndroidUtilities.appCenterLog(th);
            }
            ensureInitied();
            th.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$fatal$5(th);
                    }
                });
                return;
            }
            th.printStackTrace();
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                System.exit(2);
            }
        }
    }

    public static void lambda$fatal$5(Throwable th) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (int i = 0; i < stackTrace.length; i++) {
                OutputStreamWriter outputStreamWriter2 = getInstance().streamWriter;
                outputStreamWriter2.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + stackTrace[i] + "\n");
            }
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            System.exit(2);
        }
    }

    private static boolean needSent(Throwable th) {
        return ((th instanceof InterruptedException) || (th instanceof MediaCodecVideoConvertor.ConversionCanceledException) || (th instanceof IgnoreSentException)) ? false : true;
    }

    public static void d(final String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.d(tag, str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$d$6(str);
                    }
                });
            }
        }
    }

    public static void lambda$d$6(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " D/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
            if (AndroidUtilities.isENOSPC(e)) {
                LaunchActivity.checkFreeDiscSpaceStatic(1);
            }
        }
    }

    public static void w(final String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.w(tag, str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$w$7(str);
                    }
                });
            }
        }
    }

    public static void lambda$w$7(String str) {
        try {
            OutputStreamWriter outputStreamWriter = getInstance().streamWriter;
            outputStreamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cleanupLogs() {
        File[] listFiles;
        ensureInitied();
        File logsDir = AndroidUtilities.getLogsDir();
        if (logsDir == null || (listFiles = logsDir.listFiles()) == null) {
            return;
        }
        for (File file : listFiles) {
            if ((getInstance().currentFile == null || !file.getAbsolutePath().equals(getInstance().currentFile.getAbsolutePath())) && ((getInstance().networkFile == null || !file.getAbsolutePath().equals(getInstance().networkFile.getAbsolutePath())) && (getInstance().tonlibFile == null || !file.getAbsolutePath().equals(getInstance().tonlibFile.getAbsolutePath())))) {
                file.delete();
            }
        }
    }

    public static class IgnoreSentException extends Exception {
        public IgnoreSentException(String str) {
            super(str);
        }
    }
}
