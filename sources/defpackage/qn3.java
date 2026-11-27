package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
public abstract class qn3 {
    public static ArrayList a;
    public static long b;
    public static CountDownLatch c;
    public static long d;

    public static synchronized ArrayList a() {
        synchronized (qn3.class) {
            if (a == null) {
                String string = uc7.e1().getString("speech_models", null);
                if (string == null) {
                    return null;
                }
                SerializedData serializedData = new SerializedData(Base64.decode(string, 0));
                int readInt32 = serializedData.readInt32(true);
                ArrayList arrayList = new ArrayList(readInt32);
                for (int i = 0; i < readInt32; i++) {
                    arrayList.add(TLRPC.TL_transcriptionModel.TLdeserialize(serializedData, serializedData.readInt32(true), true));
                }
                serializedData.cleanup();
                a = arrayList;
            }
            return a;
        }
    }

    public static boolean b() {
        kq3 n;
        lq3 q = lq3.q(yac.k());
        int e = a.e();
        if (e == 1) {
            n = q.p();
        } else if (e == 2) {
            n = q.o();
        } else {
            n = q.n();
        }
        if (n != null && n.g) {
            return true;
        }
        return false;
    }

    public static int c(org.telegram.tgnet.TLRPC.TL_transcriptionModel r23, java.io.File r24, boolean r25, defpackage.pn3 r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn3.c(org.telegram.tgnet.TLRPC$TL_transcriptionModel, java.io.File, boolean, pn3):int");
    }

    public static boolean d() {
        long j;
        ArrayList a2 = a();
        long currentTimeMillis = System.currentTimeMillis() - uc7.e1().getLong("speech_models_checked", 0L);
        if (a2 != null) {
            if (a2.isEmpty()) {
                j = 3600000;
            } else {
                j = 86400000;
            }
            if (currentTimeMillis <= j) {
                if (!a2.isEmpty() || b != 0) {
                    if ((f11.c + "/" + DictationAsr.j0()).equals(uc7.e1().getString("speech_models_build", null))) {
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
        synchronized (qn3.class) {
            CountDownLatch countDownLatch = c;
            if (countDownLatch != null) {
                return countDownLatch;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = b;
            if (j != 0 && elapsedRealtime - j < 60000) {
                return null;
            }
            int k = yac.k();
            if (!yac.q(k)) {
                return null;
            }
            b = elapsedRealtime;
            CountDownLatch countDownLatch2 = new CountDownLatch(1);
            c = countDownLatch2;
            TLRPC.TL_messages_getTranscriptionModels tL_messages_getTranscriptionModels = new TLRPC.TL_messages_getTranscriptionModels();
            tL_messages_getTranscriptionModels.version = DictationAsr.j0();
            ConnectionsManager.getInstance(k).sendRequest(tL_messages_getTranscriptionModels, new ye(countDownLatch2, (byte) 20));
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
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
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
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.remove("speech_doc_" + file.getName()).apply();
    }

    public static boolean h() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = d;
        if (j == 0 || elapsedRealtime - j > 60000) {
            d = elapsedRealtime;
            if (d()) {
                e();
            }
        }
        ArrayList a2 = a();
        if (a2 != null) {
            int size = a2.size();
            int i = 0;
            while (i < size) {
                Object obj = a2.get(i);
                i++;
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
            SharedPreferences e1 = uc7.e1();
            if (e1.getLong("speech_doc_" + file.getName(), 0L) != tL_transcriptionModel.document.id) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void j() {
        CountDownLatch e = e();
        if (e != null) {
            new Thread(new nn3(e, (byte) 0), "DictationModels").start();
        }
    }

    public static void k(ArrayList arrayList) {
        SerializedData serializedData = new SerializedData();
        serializedData.writeInt32(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((TLRPC.TL_transcriptionModel) obj).serializeToStream(serializedData);
        }
        SharedPreferences.Editor putLong = uc7.e1().edit().putString("speech_models", Base64.encodeToString(serializedData.toByteArray(), 2)).putLong("speech_models_checked", System.currentTimeMillis());
        putLong.putString("speech_models_build", f11.c + "/" + DictationAsr.j0()).apply();
        serializedData.cleanup();
    }
}
