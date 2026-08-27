package org.telegram.messenger;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Debug;
import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.time.FastDateFormat;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

public class FileLog {
    private static volatile FileLog Instance = null;
    public static boolean databaseIsMalformed = false;
    private static long dumpedHeap = 0;
    private static HashSet<String> excludeRequests = null;
    private static ma.a exclusionStrategy = null;
    private static ma.g gson = null;
    private static boolean gsonDisabled = false;
    private static final String mtproto_tag = "MTProto";
    private static HashSet<String> privateFields = null;
    private static final String tag = "tmessages";
    private boolean initied;
    private boolean initiing;
    private OutputStreamWriter streamWriter = null;
    private FastDateFormat dateFormat = null;
    private FastDateFormat fileDateFormat = null;
    private DispatchQueue logQueue = null;
    private File currentFile = null;
    private File networkFile = null;
    private File tonlibFile = null;
    private OutputStreamWriter tlStreamWriter = null;
    private File tlRequestsFile = null;

    public static class ByteArrayHexAdapter extends ma.u {
        @Override
        public byte[] read(ua.a aVar) {
            String strV = aVar.v();
            int length = strV.length();
            byte[] bArr = new byte[length / 2];
            for (int i10 = 0; i10 < length; i10 += 2) {
                bArr[i10 / 2] = (byte) (Character.digit(strV.charAt(i10 + 1), 16) + (Character.digit(strV.charAt(i10), 16) << 4));
            }
            return bArr;
        }

        @Override
        public void write(ua.b bVar, byte[] bArr) {
            if (bArr == null) {
                bVar.i();
                return;
            }
            StringBuilder sb2 = new StringBuilder((bArr.length * 2) + 2);
            sb2.append("0x");
            for (byte b10 : bArr) {
                sb2.append(String.format("%02x", Integer.valueOf(b10 & 255)));
            }
            bVar.r(sb2.toString());
        }
    }

    public static class IgnoreSentException extends Exception {
        public IgnoreSentException(String str) {
            super(str);
        }
    }

    public static class TLObjectDeserializer implements ma.o {
        private TLObjectDeserializer() {
        }

        @Override
        public ma.i serialize(TLObject tLObject, Type type, ma.n nVar) {
            ma.l lVar = new ma.l();
            String name = tLObject.getClass().getName();
            if (name.startsWith("org.telegram.tgnet.")) {
                name = name.substring(19);
            }
            lVar.o("_", name == null ? ma.k.f17910a : new ma.m(name));
            try {
                for (Field field : tLObject.getClass().getFields()) {
                    if (FileLog.privateFields == null || !FileLog.privateFields.contains(field.getName())) {
                        field.setAccessible(true);
                        try {
                            Object obj = field.get(tLObject);
                            if (obj != null) {
                                Class<?> cls = obj.getClass();
                                if (!cls.isInstance(DispatchQueue.class) && !cls.isInstance(org.telegram.ui.Components.x5.class) && !cls.isInstance(ColorStateList.class) && !cls.isInstance(Context.class)) {
                                    lVar.o(field.getName(), ((m5.o) nVar).z(obj));
                                }
                            } else {
                                lVar.o(field.getName(), ((m5.o) nVar).z(obj));
                            }
                        } catch (IllegalAccessException e9) {
                            e9.printStackTrace();
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return lVar;
        }
    }

    private FileLog() {
    }

    private static void checkGson() {
        if (gson == null) {
            HashSet<String> hashSet = new HashSet<>();
            privateFields = hashSet;
            hashSet.add("message");
            privateFields.add("phone");
            privateFields.add("about");
            privateFields.add("status_text");
            privateFields.add("bytes");
            privateFields.add("secret");
            privateFields.add("stripped_thumb");
            privateFields.add("strippedBitmap");
            privateFields.add("networkType");
            privateFields.add("disableFree");
            privateFields.add("mContext");
            privateFields.add("priority");
            privateFields.add("constructor");
            privateFields.add("constructorName");
            privateFields.add("parentRichText");
            privateFields.add("parentBlock");
            for (int i10 = 0; i10 < 32; i10++) {
                privateFields.add("FLAG_" + i10);
            }
            HashSet<String> hashSet2 = new HashSet<>();
            excludeRequests = hashSet2;
            hashSet2.add("TL_upload_getFile");
            excludeRequests.add("TL_upload_getWebFile");
            exclusionStrategy = new ma.a() {
                @Override
                public boolean shouldSkipClass(Class<?> cls) {
                    return cls.isInstance(DispatchQueue.class) || cls.isInstance(org.telegram.ui.Components.x5.class) || cls.isInstance(ColorStateList.class) || cls.isInstance(Context.class);
                }

                @Override
                public boolean shouldSkipField(ma.b bVar) {
                    HashSet hashSet3 = FileLog.privateFields;
                    Field field = bVar.f17893a;
                    Field field2 = bVar.f17893a;
                    if (hashSet3.contains(field.getName())) {
                        return true;
                    }
                    return "message".equalsIgnoreCase(field2.getName()) && String.class.equals(field2.getGenericType());
                }
            };
            oa.f fVar = oa.f.f19384c;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ma.c cVar = ma.g.h;
            ma.p pVar = ma.g.f17901i;
            ma.q qVar = ma.g.f17902j;
            ArrayDeque arrayDeque = new ArrayDeque();
            ma.a aVar = exclusionStrategy;
            Objects.requireNonNull(aVar);
            oa.f fVarA = fVar.clone();
            ArrayList arrayList3 = new ArrayList(fVar.f19385a);
            fVarA.f19385a = arrayList3;
            arrayList3.add(aVar);
            ByteArrayHexAdapter byteArrayHexAdapter = new ByteArrayHexAdapter();
            boolean z10 = byteArrayHexAdapter instanceof ma.o;
            if (ma.i.class.isAssignableFrom(byte[].class)) {
                throw new IllegalArgumentException("Cannot override built-in adapter for " + byte[].class);
            }
            if (z10) {
                ta.a aVar2 = new ta.a(byte[].class);
                arrayList.add(new pa.z(byteArrayHexAdapter, aVar2, aVar2.f48152b == aVar2.f48151a, null));
            }
            ta.a aVar3 = new ta.a(byte[].class);
            pa.x0 x0Var = pa.h1.f45624a;
            arrayList.add(new pa.x0(aVar3, byteArrayHexAdapter, 2));
            RuntimeClassNameTypeAdapterFactory runtimeClassNameTypeAdapterFactoryOf = RuntimeClassNameTypeAdapterFactory.of(TLObject.class, "type_", exclusionStrategy);
            Objects.requireNonNull(runtimeClassNameTypeAdapterFactoryOf);
            arrayList.add(runtimeClassNameTypeAdapterFactoryOf);
            TLObjectDeserializer tLObjectDeserializer = new TLObjectDeserializer();
            if (ma.i.class.isAssignableFrom(TLObject.class)) {
                throw new IllegalArgumentException("Cannot override built-in adapter for " + TLObject.class);
            }
            arrayList2.add(new pa.z(tLObjectDeserializer, null, false, TLObject.class));
            ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
            arrayList4.addAll(arrayList);
            Collections.reverse(arrayList4);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            Collections.reverse(arrayList5);
            arrayList4.addAll(arrayList5);
            boolean z11 = sa.f.f47825a;
            gson = new ma.g(fVarA, new HashMap(map), cVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList4, pVar, qVar, new ArrayList(arrayDeque));
        }
    }

    public static void cleanupLogs() {
        File[] fileArrListFiles;
        ensureInitied();
        File logsDir = AndroidUtilities.getLogsDir();
        if (logsDir == null || (fileArrListFiles = logsDir.listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if ((getInstance().currentFile == null || !file.getAbsolutePath().equals(getInstance().currentFile.getAbsolutePath())) && ((getInstance().networkFile == null || !file.getAbsolutePath().equals(getInstance().networkFile.getAbsolutePath())) && (getInstance().tonlibFile == null || !file.getAbsolutePath().equals(getInstance().tonlibFile.getAbsolutePath())))) {
                file.delete();
            }
        }
    }

    public static void disableGson(boolean z10) {
        gsonDisabled = z10;
    }

    public static void dumpANR() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                e("ANR thread dump\n" + sb2.toString());
                getInstance().dumpMemory(false);
                return;
            }
            Map.Entry<Thread, StackTraceElement[]> next = it.next();
            Thread key = next.getKey();
            StackTraceElement[] value = next.getValue();
            sb2.append("Thread: ");
            sb2.append(key.getName());
            sb2.append("\n");
            for (StackTraceElement stackTraceElement : value) {
                sb2.append("\tat ");
                sb2.append(stackTraceElement);
                sb2.append("\n");
            }
            sb2.append("\n\n");
        }
    }

    public static void dumpResponseAndRequest(final int i10, TLObject tLObject, TLObject tLObject2, final TLRPC.TL_error tL_error, final long j10, final long j11, final int i11) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            String simpleName = tLObject.getClass().getSimpleName();
            checkGson();
            if (excludeRequests.contains(simpleName) && tL_error == null) {
                return;
            }
            try {
                final String str = "req -> " + simpleName + " : " + gson.e(tLObject);
                String str2 = "null";
                if (tLObject2 != null) {
                    str2 = "res -> " + tLObject2.getClass().getSimpleName() + " : " + gson.e(tLObject2);
                } else if (tL_error != null) {
                    str2 = "err -> " + tL_error.getClass().getSimpleName() + " : " + gson.e(tL_error);
                }
                final String str3 = str2;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                getInstance().logQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        FileLog.lambda$dumpResponseAndRequest$0(j10, j11, i11, i10, jCurrentTimeMillis, str, str3, tL_error);
                    }
                });
            } catch (Throwable th) {
                e(th, BuildVars.DEBUG_PRIVATE_VERSION);
            }
        }
    }

    public static void dumpUnparsedMessage(TLObject tLObject, long j10, int i10) {
        if (BuildVars.DEBUG_PRIVATE_VERSION && BuildVars.LOGS_ENABLED && tLObject != null) {
            try {
                checkGson();
                getInstance().dateFormat.format(System.currentTimeMillis());
                StringBuilder sb2 = new StringBuilder("receive message -> ");
                sb2.append(tLObject.getClass().getSimpleName());
                sb2.append(" : ");
                sb2.append(gsonDisabled ? tLObject : gson.e(tLObject));
                getInstance().logQueue.postRunnable(new x4(System.currentTimeMillis(), j10, i10, sb2.toString()));
            } catch (Throwable unused) {
            }
        }
    }

    public static void e(String str, Throwable th) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e("tmessages", str, th);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new d2(7, str, th));
            }
        }
    }

    public static void ensureInitied() {
        getInstance().init();
    }

    public static void fatal(Throwable th) {
        fatal(th, true);
    }

    public static FileLog getInstance() {
        FileLog fileLog;
        FileLog fileLog2 = Instance;
        if (fileLog2 != null) {
            return fileLog2;
        }
        synchronized (FileLog.class) {
            try {
                fileLog = Instance;
                if (fileLog == null) {
                    fileLog = new FileLog();
                    Instance = fileLog;
                    if (BuildVars.LOGS_ENABLED) {
                        fileLog.init();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fileLog;
    }

    public static String getNetworkLogPath() {
        if (!BuildVars.LOGS_ENABLED) {
            return "";
        }
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                return "";
            }
            getInstance().networkFile = new File(logsDir, getInstance().fileDateFormat.format(System.currentTimeMillis()) + "_net.txt");
            return getInstance().networkFile.getAbsolutePath();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String getTonlibLogPath() {
        if (!BuildVars.LOGS_ENABLED) {
            return "";
        }
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                return "";
            }
            getInstance().tonlibFile = new File(logsDir, getInstance().dateFormat.format(System.currentTimeMillis()) + "_tonlib.txt");
            return getInstance().tonlibFile.getAbsolutePath();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    private void init() {
        if (this.initied) {
            return;
        }
        this.initiing = true;
        Locale locale = Locale.US;
        this.dateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss.SSS", locale);
        FastDateFormat fastDateFormat = FastDateFormat.getInstance("dd_MM_yyyy_HH_mm_ss", locale);
        this.fileDateFormat = fastDateFormat;
        String str = fastDateFormat.format(System.currentTimeMillis());
        try {
            File logsDir = AndroidUtilities.getLogsDir();
            if (logsDir == null) {
                return;
            }
            this.currentFile = new File(logsDir, str + ".txt");
            this.tlRequestsFile = new File(logsDir, str + "_mtproto.txt");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            this.logQueue = new DispatchQueue("logQueue");
            this.currentFile.createNewFile();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(this.currentFile));
            this.streamWriter = outputStreamWriter;
            outputStreamWriter.write("-----start log " + str + "-----\n");
            this.streamWriter.flush();
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(this.tlRequestsFile));
            this.tlStreamWriter = outputStreamWriter2;
            outputStreamWriter2.write("-----start log " + str + "-----\n");
            this.tlStreamWriter.flush();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.initied = true;
    }

    public static void lambda$d$6(String str) {
        try {
            getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " D/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e9) {
            e9.printStackTrace();
            if (AndroidUtilities.isENOSPC(e9)) {
                LaunchActivity.E(1);
            }
        }
    }

    public static void lambda$dumpResponseAndRequest$0(long j10, long j11, int i10, int i11, long j12, String str, String str2, TLRPC.TL_error tL_error) {
        try {
            String str3 = "requestMsgId=" + j10 + " requestingTime=" + (System.currentTimeMillis() - j11) + " request_token=" + i10 + " account=" + i11;
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j12) + " " + str3);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str2);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            if (tL_error != null) {
                Log.e("MTProto", str3);
                Log.e("MTProto", str);
                Log.e("MTProto", str2);
                Log.e("MTProto", " ");
                return;
            }
            Log.d("MTProto", str3);
            Log.d("MTProto", str);
            Log.d("MTProto", str2);
            Log.d("MTProto", " ");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void lambda$dumpUnparsedMessage$1(long j10, long j11, int i10, String str) {
        try {
            getInstance().tlStreamWriter.write(getInstance().dateFormat.format(j10) + " msgId=" + j11 + " account=" + i10);
            getInstance().tlStreamWriter.write("\n");
            getInstance().tlStreamWriter.write(str);
            getInstance().tlStreamWriter.write("\n\n");
            getInstance().tlStreamWriter.flush();
            Log.d("MTProto", "msgId=" + j11 + " account=" + i10);
            Log.d("MTProto", str);
            Log.d("MTProto", " ");
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void lambda$e$2(String str, Throwable th) {
        try {
            getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.write(th.toString());
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement + "\n");
            }
            getInstance().streamWriter.flush();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void lambda$e$3(String str) {
        try {
            getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void lambda$e$4(Throwable th) {
        try {
            getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement + "\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement2 + "\n");
                }
            }
            getInstance().streamWriter.flush();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static void lambda$fatal$5(Throwable th) {
        try {
            getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th + "\n");
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTraceElement + "\n");
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                for (StackTraceElement stackTraceElement2 : cause.getStackTrace()) {
                    getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTraceElement2 + "\n");
                }
            }
            getInstance().streamWriter.flush();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            System.exit(2);
        }
    }

    public static void lambda$w$7(String str) {
        try {
            getInstance().streamWriter.write(getInstance().dateFormat.format(System.currentTimeMillis()) + " W/tmessages: " + str + "\n");
            getInstance().streamWriter.flush();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private static boolean needSent(Throwable th) {
        return ((th instanceof InterruptedException) || (th instanceof MediaCodecVideoConvertor.ConversionCanceledException) || (th instanceof IgnoreSentException)) ? false : true;
    }

    public static void w(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.w("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new u1(str, 1));
            }
        }
    }

    public void dumpMemory(boolean z10) {
        if (z10 || System.currentTimeMillis() - dumpedHeap >= 30000) {
            dumpedHeap = System.currentTimeMillis();
            try {
                Debug.dumpHprofData(new File(AndroidUtilities.getLogsDir(), getInstance().dateFormat.format(System.currentTimeMillis()) + "_heap.hprof").getAbsolutePath());
            } catch (Exception e9) {
                e(e9);
            }
        }
    }

    public static void d(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.d("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new u1(str, 3));
            }
        }
    }

    public static void fatal(Throwable th, boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            if (th instanceof OutOfMemoryError) {
                getInstance().dumpMemory(false);
            }
            if (z10 && BuildVars.DEBUG_VERSION && needSent(th)) {
                AndroidUtilities.appCenterLog(th);
            }
            ensureInitied();
            th.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new f3(1, th));
                return;
            }
            th.printStackTrace();
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                System.exit(2);
            }
        }
    }

    public static void e(String str) {
        if (BuildVars.LOGS_ENABLED) {
            ensureInitied();
            Log.e("tmessages", str);
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new u1(str, 2));
            }
        }
    }

    public static void e(Throwable th) {
        e(th, true);
    }

    public static void e(Throwable th, boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            if (BuildVars.DEBUG_VERSION && needSent(th) && z10) {
                AndroidUtilities.appCenterLog(th);
            }
            if (BuildVars.DEBUG_VERSION && th.getMessage() != null && th.getMessage().contains("disk image is malformed") && !databaseIsMalformed) {
                d("copy malformed files");
                databaseIsMalformed = true;
                File file = new File(ApplicationLoader.getFilesDirFixed(), "malformed_database/");
                file.mkdirs();
                ArrayList<File> databaseFiles = MessagesStorage.getInstance(UserConfig.selectedAccount).getDatabaseFiles();
                for (int i10 = 0; i10 < databaseFiles.size(); i10++) {
                    try {
                        AndroidUtilities.copyFile(databaseFiles.get(i10), new File(file, databaseFiles.get(i10).getName()));
                    } catch (IOException e9) {
                        e(e9);
                    }
                }
            }
            ensureInitied();
            th.printStackTrace();
            if (getInstance().streamWriter != null) {
                getInstance().logQueue.postRunnable(new f3(0, th));
            } else {
                th.printStackTrace();
            }
        }
    }
}
