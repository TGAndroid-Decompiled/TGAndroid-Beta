package ai;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a6;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class h1 {
    public static ArrayList f1216a;
    public static long f1217b;
    public static CountDownLatch f1218c;
    public static long d;

    public static synchronized ArrayList a() {
        synchronized (h1.class) {
            try {
                if (f1216a == null) {
                    String string = mp.g1().getString("speech_models", null);
                    if (string == null) {
                        return null;
                    }
                    SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                    int readInt32 = serializedData.readInt32(true);
                    ArrayList arrayList = new ArrayList(readInt32);
                    for (int i7 = 0; i7 < readInt32; i7++) {
                        arrayList.add(TLRPC.TL_transcriptionModel.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                    }
                    serializedData.cleanup();
                    f1216a = arrayList;
                }
                return f1216a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean b() {
        z5 n10;
        a6 q10 = a6.q(i10.l());
        int e10 = org.telegram.messenger.t0.e();
        if (e10 == 1) {
            n10 = q10.p();
        } else if (e10 == 2) {
            n10 = q10.o();
        } else {
            n10 = q10.n();
        }
        if (n10 != null && n10.f28360g) {
            return true;
        }
        return false;
    }

    public static int c(org.telegram.tgnet.TLRPC.TL_transcriptionModel r25, java.io.File r26, boolean r27, ai.g1 r28) {
        throw new UnsupportedOperationException("Method not decompiled: ai.h1.c(org.telegram.tgnet.TLRPC$TL_transcriptionModel, java.io.File, boolean, ai.g1):int");
    }

    public static boolean d() {
        long j3;
        ArrayList a10 = a();
        long currentTimeMillis = System.currentTimeMillis() - mp.g1().getLong("speech_models_checked", 0L);
        if (a10 != null) {
            if (a10.isEmpty()) {
                j3 = 3600000;
            } else {
                j3 = 86400000;
            }
            if (currentTimeMillis <= j3) {
                if (!a10.isEmpty() || f1217b != 0) {
                    if ((s2.f26831c + "/" + DictationAsr.h0()).equals(mp.g1().getString("speech_models_build", null))) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static synchronized CountDownLatch e() {
        synchronized (h1.class) {
            CountDownLatch countDownLatch = f1218c;
            if (countDownLatch != null) {
                return countDownLatch;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = f1217b;
            if (j3 != 0 && elapsedRealtime - j3 < 60000) {
                return null;
            }
            int l10 = i10.l();
            if (!i10.r(l10)) {
                return null;
            }
            f1217b = elapsedRealtime;
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            f1218c = countDownLatch2;
            TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
            tL_messages_getTranscriptionModels.version = DictationAsr.h0();
            ConnectionsManager.getInstance(l10).sendRequest(tL_messages_getTranscriptionModels, new b1(countDownLatch2, 0));
            return countDownLatch2;
        }
    }

    public static TLRPC.TL_transcriptionModel f(ArrayList arrayList, String... strArr) {
        if (arrayList == null) {
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
            String[] strArr3 = (String[]) tL_transcriptionModel.languages.toArray(new String[0]);
            Arrays.sort(strArr3);
            if (Arrays.equals(strArr2, strArr3)) {
                return tL_transcriptionModel;
            }
        }
        return null;
    }

    public static void g(File file) {
        SharedPreferences.Editor edit = mp.g1().edit();
        edit.remove("speech_doc_" + file.getName()).apply();
    }

    public static boolean h() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = d;
        if (j3 == 0 || elapsedRealtime - j3 > 60000) {
            d = elapsedRealtime;
            if (d()) {
                e();
            }
        }
        ArrayList a10 = a();
        if (a10 != null) {
            int size = a10.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = a10.get(i7);
                i7++;
                TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj;
                if (!tL_transcriptionModel.languages.isEmpty() && !tL_transcriptionModel.languages.contains("tinylid") && !tL_transcriptionModel.languages.contains("silero-vad")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(TLRPC.TL_transcriptionModel tL_transcriptionModel, File file) {
        if (tL_transcriptionModel != null && file.exists()) {
            SharedPreferences g12 = mp.g1();
            if (g12.getLong("speech_doc_" + file.getName(), 0L) != tL_transcriptionModel.document.f28498id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void j() {
        CountDownLatch e10 = e();
        if (e10 != null) {
            new Thread(new c1(e10, 0), "DictationModels").start();
        }
    }

    public static void k(ArrayList arrayList) {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((TLRPC.TL_transcriptionModel) obj).serializeToStream(serializedData);
        }
        SharedPreferences.Editor putLong = mp.g1().edit().putString("speech_models", Base64.encodeToString(serializedData.toByteArray(), 2)).putLong("speech_models_checked", System.currentTimeMillis());
        putLong.putString("speech_models_build", s2.f26831c + "/" + DictationAsr.h0()).apply();
        serializedData.cleanup();
    }
}
