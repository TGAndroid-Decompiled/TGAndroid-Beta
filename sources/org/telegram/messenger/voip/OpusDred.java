package org.telegram.messenger.voip;

import android.content.SharedPreferences;
import android.os.SystemClock;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class OpusDred {
    private static final long DOWNLOAD_TIMEOUT_MS = 120000;
    private static final long GROUP_CALL_WAIT_MS = 2000;
    private static final String PREFS_MODIFIED = "opus_dred_weights_modified";
    private static final String PREFS_SIZE = "opus_dred_weights_size";
    private static final long RETRY_AFTER_MS = 60000;
    private static final int VOIP_MODELS_VERSION = 1;
    private static final String WEIGHTS_SHA256 = "f4aed08a74ad36089194989e17514f0d9cd17ecde4d5c866470ea764387a84c8";
    private static final long WEIGHTS_SIZE = 1998208;
    private static boolean checkedOnDisk;
    private static Runnable downloadCleanup;
    private static int downloadGeneration;
    private static boolean downloading;
    private static long lastFailureTime;
    private static volatile String verifiedPath;
    private static boolean waitedInVain;
    private static final ArrayList<Runnable> waiters = new ArrayList<>();

    public static final class GroupSettings {
        public static final GroupSettings NONE = new GroupSettings(null, 0, false);
        public final int fixedPacketLossPercent;
        public final boolean receiveEnabled;
        public final String weightsPath;

        public GroupSettings(String str, int i, boolean z) {
            this.weightsPath = str;
            this.fixedPacketLossPercent = i;
            this.receiveEnabled = z;
        }
    }

    private OpusDred() {
    }

    public static void download(int i) {
        if (!yac.h(i).o()) {
            failed(qd4.n(i, "account ", " is not logged in"));
            return;
        }
        TLRPC.TL_messages_getVoipModels tL_messages_getVoipModels = new TLRPC.TL_messages_getVoipModels();
        tL_messages_getVoipModels.version = 1;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getVoipModels, new fw0(i, (byte) 3));
    }

    public static void downloadEnded() {
        int i = 0;
        downloading = false;
        downloadGeneration++;
        Runnable runnable = downloadCleanup;
        if (runnable != null) {
            runnable.run();
            downloadCleanup = null;
        }
        ArrayList<Runnable> arrayList = waiters;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int size = arrayList2.size();
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    private static void failed(String str) {
        cc4.d("OpusDred: no weights: " + str);
        lastFailureTime = SystemClock.elapsedRealtime();
        downloadEnded();
    }

    public static GroupSettings forGroupCall(int i) {
        boolean z;
        if (isKilled(i)) {
            return GroupSettings.NONE;
        }
        prefetch(i);
        String str = verifiedPath;
        if (str == null) {
            return GroupSettings.NONE;
        }
        int groupLossPercent = groupLossPercent(i);
        if (!isGroupReceiveKilled(i) && !isLowEndDevice()) {
            z = true;
        } else {
            z = false;
        }
        return new GroupSettings(str, groupLossPercent, z);
    }

    private static int groupLossPercent(int i) {
        return uc7.s1(i).k4.J.f();
    }

    private static boolean isGroupReceiveKilled(int i) {
        return uc7.s1(i).k4.K.f;
    }

    private static boolean isKilled(int i) {
        return uc7.s1(i).k4.L.f;
    }

    private static boolean isLowEndDevice() {
        if (xea.o() == 0) {
            return true;
        }
        return false;
    }

    private static boolean isSavedBlob(File file) {
        if (file.exists() && file.length() == 1998208 && prefs().getLong("opus_dred_weights_size", -1L) == file.length() && prefs().getLong("opus_dred_weights_modified", -1L) == file.lastModified()) {
            return true;
        }
        return false;
    }

    private static boolean isTheBlob(File file) {
        if (file != null && file.length() == 1998208) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[65536];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        boolean equalsIgnoreCase = "f4aed08a74ad36089194989e17514f0d9cd17ecde4d5c866470ea764387a84c8".equalsIgnoreCase(Utilities.f(messageDigest.digest()));
                        fileInputStream.close();
                        return equalsIgnoreCase;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return false;
    }

    public static void lambda$download$7(org.telegram.tgnet.TLObject r4, org.telegram.tgnet.TLRPC.TL_error r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.OpusDred.lambda$download$7(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error, int):void");
    }

    public static void lambda$download$8(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new l65(tLObject, tL_error, i, (byte) 19));
    }

    public static void lambda$loadDocument$10(File file) {
        hl.c3(new wh4((byte) 3, save(file)));
    }

    public static void lambda$loadDocument$11(String str, jn7 jn7Var, fn7[] fn7VarArr, int i, TLRPC.Document document, int i2, int i3, Object[] objArr) {
        File J;
        if (objArr.length >= 1 && str.equals(objArr[0])) {
            jn7Var.n(fn7VarArr[0], jn7.Y1);
            fn7 fn7Var = fn7VarArr[0];
            int i4 = jn7.Z1;
            jn7Var.n(fn7Var, i4);
            if (i2 == i4) {
                failed("download failed");
                return;
            }
            if (objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    J = (File) obj;
                    Utilities.e.c(new jn3(J, (byte) 3));
                }
            }
            xb4.G(i);
            J = xb4.J(document, null, true, true);
            Utilities.e.c(new jn3(J, (byte) 3));
        }
    }

    public static void lambda$loadDocument$12(jn7 jn7Var, fn7[] fn7VarArr) {
        jn7Var.n(fn7VarArr[0], jn7.Y1);
        jn7Var.n(fn7VarArr[0], jn7.Z1);
    }

    public static void lambda$loadDocument$9(boolean z) {
        if (z) {
            verifiedPath = weightsFile().getAbsolutePath();
            cc4.b("OpusDred: weights saved");
            downloadEnded();
            return;
        }
        failed("the downloaded file is not the blob");
    }

    public static void lambda$prefetch$3(int i) {
        if (downloading && downloadGeneration == i) {
            failed("timed out");
        }
    }

    public static void lambda$prefetch$5(int i) {
        if (!checkedOnDisk) {
            checkedOnDisk = true;
            File weightsFile = weightsFile();
            if (isSavedBlob(weightsFile) || (weightsFile.exists() && isTheBlob(weightsFile) && markSaved(weightsFile))) {
                verifiedPath = weightsFile.getAbsolutePath();
                hl.c3(new pg6((byte) 10));
                return;
            }
        }
        hl.c3(new gw0(i, (byte) 11));
    }

    public static void lambda$prefetch$6(int i) {
        if (verifiedPath == null && !downloading) {
            if (lastFailureTime == 0 || SystemClock.elapsedRealtime() - lastFailureTime >= 60000) {
                downloading = true;
                int i2 = downloadGeneration + 1;
                downloadGeneration = i2;
                hl.d3(new gw0(i2, (byte) 12), 120000L);
                Utilities.e.c(new gw0(i, (byte) 9));
            }
        }
    }

    public static void lambda$whenReadyForGroupCall$0(boolean[] zArr, Runnable[] runnableArr, Runnable[] runnableArr2, Runnable runnable) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        waiters.remove(runnableArr[0]);
        hl.r(runnableArr2[0]);
        runnable.run();
    }

    public static void lambda$whenReadyForGroupCall$1(boolean[] zArr, Runnable[] runnableArr) {
        if (zArr[0]) {
            return;
        }
        waitedInVain = true;
        cc4.b("OpusDred: no weights after 2000 ms, the call starts without DRED");
        runnableArr[0].run();
    }

    public static void lambda$whenReadyForGroupCall$2(Runnable runnable) {
        if (verifiedPath == null && downloading) {
            boolean[] zArr = new boolean[1];
            Runnable[] runnableArr = {new oy6(zArr, runnableArr, r4, runnable, (byte) 14)};
            Runnable[] runnableArr2 = {new x77(zArr, runnableArr, (byte) 1)};
            waiters.add(runnableArr[0]);
            hl.d3(runnableArr2[0], 2000L);
            return;
        }
        runnable.run();
    }

    private static void loadDocument(final int i, final TLRPC.Document document) {
        final String r = xb4.r(null, document);
        final jn7 f = jn7.f(i);
        fn7 fn7Var = new fn7() {
            @Override
            public final void didReceivedNotification(int i2, int i3, Object[] objArr) {
                OpusDred.lambda$loadDocument$11(r, f, r3, i, document, i2, i3, objArr);
            }
        };
        final fn7[] fn7VarArr = {fn7Var};
        f.a(fn7Var, jn7.Y1);
        f.a(fn7VarArr[0], jn7.Z1);
        downloadCleanup = new at7(f, fn7VarArr);
        xb4.G(i).X(document, null, 3, 1);
    }

    private static boolean markSaved(File file) {
        prefs().edit().putLong("opus_dred_weights_size", file.length()).putLong("opus_dred_weights_modified", file.lastModified()).apply();
        return true;
    }

    public static void prefetch(int i) {
        if (verifiedPath == null && !isKilled(i)) {
            hl.c3(new gw0(i, (byte) 10));
        }
    }

    private static SharedPreferences prefs() {
        return uc7.e1();
    }

    private static boolean save(File file) {
        if (isTheBlob(file)) {
            File weightsDir = weightsDir();
            if (weightsDir.isDirectory() || weightsDir.mkdirs()) {
                File weightsFile = weightsFile();
                File file2 = new File(weightsDir, weightsFile.getName() + ".tmp");
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        byte[] bArr = new byte[65536];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        fileInputStream.close();
                        if (isTheBlob(file2) && file2.renameTo(weightsFile)) {
                            markSaved(weightsFile);
                            file.delete();
                            return true;
                        }
                        file2.delete();
                        return false;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    file2.delete();
                    return false;
                }
            }
        }
        return false;
    }

    private static File weightsDir() {
        return new File(org.telegram.messenger.a.h(), "opus_dred");
    }

    private static File weightsFile() {
        return new File(weightsDir(), "weights-f4aed08a74ad3608.bin");
    }

    public static String weightsForPrivateCall(int i) {
        if (isKilled(i)) {
            return null;
        }
        prefetch(i);
        return verifiedPath;
    }

    public static void whenReadyForGroupCall(int i, Runnable runnable) {
        if (!isKilled(i) && verifiedPath == null && !waitedInVain) {
            prefetch(i);
            hl.c3(new dt2(runnable, (byte) 4));
            return;
        }
        runnable.run();
    }
}
