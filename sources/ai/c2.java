package ai;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class c2 {
    public static final int[] f1136l0 = {1000, 2000, 5000, 10000};
    public static final String[][] m0 = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public w A;
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public ParcelFileDescriptor J;
    public Thread K;
    public z L;
    public String M;
    public boolean N;
    public ArrayList O;
    public int P;
    public int Q;
    public final x1 R;
    public final ArrayList S;
    public int T;
    public boolean U;
    public boolean V;
    public int W;
    public final o1 X;
    public boolean Y;
    public int Z;
    public final Context f1137a;
    public int f1138a0;
    public final int f1139b;
    public int f1140b0;
    public final long f1141c;
    public int f1142c0;
    public final a2 d;
    public int f1143d0;
    public final boolean f1144e;
    public boolean f1145e0;
    public final Handler f1146f = new Handler(Looper.getMainLooper());
    public String f1147f0;
    public final i2 f1148g;
    public final x1 f1149g0;
    public SpeechRecognizer h;
    public long f1150h0;
    public boolean f1151i;
    public final x1 f1152i0;
    public boolean f1153j;
    public long f1154j0;
    public int f1155k;
    public long f1156k0;
    public int f1157l;
    public int f1158m;
    public int f1159n;
    public long f1160o;
    public long f1161p;
    public ArrayList f1162q;
    public String f1163r;
    public int f1164s;
    public int f1165t;
    public z f1166u;
    public y v;
    public int f1167w;
    public int f1168x;
    public android.support.v4.media.session.a0 f1169y;
    public boolean f1170z;

    public c2(Context context, int i7, long j3, boolean z10, a2 a2Var) {
        i2 i2Var = new i2();
        this.f1148g = i2Var;
        this.f1162q = new ArrayList();
        this.f1165t = -1;
        this.f1168x = -1;
        this.B = "";
        this.R = new x1(this, 0);
        this.S = new ArrayList();
        this.W = -1;
        this.X = new o1(this, 3);
        this.f1149g0 = new x1(this, 1);
        this.f1152i0 = new x1(this, 2);
        this.f1137a = context.getApplicationContext();
        this.f1139b = i7;
        this.f1141c = j3;
        this.f1144e = z10;
        this.d = a2Var;
        i2Var.f1252g = new a3.l(13);
    }

    public static String a(Bundle bundle) {
        ArrayList<String> stringArrayList;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("results_recognition")) != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        return null;
    }

    public final void b(Runnable runnable, long j3) {
        this.f1156k0 += j3;
        this.f1146f.postAtTime(new a1.e(18, this, runnable), SystemClock.uptimeMillis() + this.f1156k0);
    }

    public final void c() {
        this.f1153j = true;
        this.f1146f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.f1587l = true;
        }
        d();
        Thread thread = this.K;
        if (thread != null) {
            thread.interrupt();
            this.K = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.J;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused) {
            }
            this.J = null;
        }
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.f1166u;
        if (zVar != null) {
            zVar.d();
            this.f1166u = null;
        }
    }

    public final void d() {
        SpeechRecognizer speechRecognizer = this.h;
        if (speechRecognizer != null) {
            try {
                speechRecognizer.cancel();
            } catch (Exception unused) {
            }
            try {
                this.h.destroy();
            } catch (Exception unused2) {
            }
            this.h = null;
        }
    }

    public final void e() {
        this.d.r(q(this.f1148g.n()));
        Handler handler = this.f1146f;
        o1 o1Var = this.X;
        handler.removeCallbacks(o1Var);
        if (this.V && !this.f1153j && !this.f1151i) {
            handler.postDelayed(o1Var, 2000L);
        }
    }

    public final void f(String str) {
        String q10;
        if (this.f1153j) {
            return;
        }
        this.f1153j = true;
        this.f1146f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.f1587l = true;
        }
        d();
        Thread thread = this.K;
        if (thread != null) {
            thread.interrupt();
            this.K = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.J;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused) {
            }
            this.J = null;
        }
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.f1166u;
        if (zVar != null) {
            zVar.d();
            this.f1166u = null;
        }
        if (this.W >= 0) {
            ConnectionsManager.getInstance(this.f1139b).cancelRequest(this.W, true);
        }
        if (this.f1170z) {
            q10 = this.B;
        } else {
            q10 = q(this.f1148g.n());
        }
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.f1155k);
        u10.append(" chars=");
        u10.append(q10.length());
        Log.d("Dictation", u10.toString());
        this.d.a(q10, str);
    }

    public final void g() {
        w wVar = this.A;
        if (wVar == null) {
            z zVar = this.f1166u;
            if (zVar != null) {
                zVar.d();
                return;
            }
            return;
        }
        wVar.f1590o = new o1(this, 4);
        wVar.f1586k = true;
    }

    public final boolean h(String str) {
        String str2;
        String str3;
        if (DictationAsr.x() && d.h() && Build.VERSION.SDK_INT >= 33 && this.f1166u != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f1162q;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String str4 = (String) obj;
                if (DictationAsr.R(Locale.forLanguageTag(str4.replace('_', '-')).getLanguage(), this.f1169y, false) == null) {
                    arrayList.add(str4);
                }
            }
            if (!arrayList.isEmpty()) {
                if (str != null && !"other".equals(str)) {
                    HashMap hashMap = u0.f1558a;
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj2 = arrayList.get(i10);
                            i10++;
                            str2 = (String) obj2;
                            if (str2.equalsIgnoreCase(str)) {
                                break;
                            }
                        } else {
                            int size3 = arrayList.size();
                            int i11 = 0;
                            while (i11 < size3) {
                                Object obj3 = arrayList.get(i11);
                                i11++;
                                str2 = (String) obj3;
                                if (u0.c(str2, str)) {
                                    break;
                                }
                            }
                        }
                    }
                }
                str2 = null;
                if (str2 != null) {
                    arrayList.remove(str2);
                    arrayList.add(0, str2);
                }
                String str5 = (String) arrayList.get(0);
                if (arrayList.size() <= 1) {
                    arrayList = null;
                }
                this.O = arrayList;
                StringBuilder sb2 = new StringBuilder("tinyasr → Google in ");
                sb2.append(str5);
                if (this.O == null) {
                    str3 = "";
                } else {
                    str3 = " detecting among " + this.O;
                }
                sb2.append(str3);
                sb2.append(" (tinylid: ");
                sb2.append(str);
                sb2.append(", no model for it)");
                Log.d("Dictation", sb2.toString());
                this.C++;
                w wVar = this.A;
                if (wVar != null) {
                    wVar.f1587l = true;
                    this.A = null;
                }
                this.f1146f.removeCallbacks(this.R);
                this.f1170z = false;
                this.B = "";
                this.d.M(0, "");
                r(str5);
                v(str5, "tinylid: no model");
                this.f1168x = 0;
                this.Z = 0;
                t();
                return true;
            }
        }
        return false;
    }

    public final void i(int i7, int i10) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        long j3;
        int i11;
        String str3;
        int i12;
        if (!this.f1153j && i7 != this.f1165t) {
            i2 i2Var = this.f1148g;
            int i13 = 0;
            if (!i2Var.h(i7) && i7 != this.f1155k) {
                z10 = false;
            } else {
                z10 = true;
            }
            StringBuilder n10 = i5.c.n("session ", i7, " onError ", i10, " (");
            switch (i10) {
                case 1:
                    str = "NETWORK_TIMEOUT";
                    break;
                case 2:
                    str = "NETWORK";
                    break;
                case 3:
                    str = "AUDIO";
                    break;
                case 4:
                    str = "SERVER";
                    break;
                case 5:
                    str = "CLIENT";
                    break;
                case 6:
                    str = "SPEECH_TIMEOUT";
                    break;
                case 7:
                    str = "NO_MATCH";
                    break;
                case 8:
                    str = "BUSY";
                    break;
                case 9:
                    str = "PERMISSIONS";
                    break;
                case 10:
                    str = "TOO_MANY_REQUESTS";
                    break;
                case 11:
                    str = "SERVER_DISCONNECTED";
                    break;
                case 12:
                    str = "LANGUAGE_NOT_SUPPORTED";
                    break;
                case 13:
                    str = "LANGUAGE_UNAVAILABLE";
                    break;
                default:
                    str = "?";
                    break;
            }
            n10.append(str);
            n10.append(")");
            if (z10) {
                str2 = "";
            } else {
                str2 = " (stale, ignored)";
            }
            n10.append(str2);
            n10.append(" stop=");
            n10.append(this.f1151i);
            n10.append(" after ");
            n10.append(SystemClock.elapsedRealtime() - this.f1160o);
            n10.append(" ms");
            Log.d("Dictation", n10.toString());
            if (z10) {
                if (i2Var.f1248b.isEmpty() && i2Var.f1249c.isEmpty() && SystemClock.elapsedRealtime() - this.f1160o < 1000 && i10 != 7 && i10 != 6) {
                    this.f1168x = this.f1167w;
                }
                i2Var.g(i7, "error " + i10);
                e();
                this.f1161p = SystemClock.elapsedRealtime();
                if (this.f1151i && !l()) {
                    f(null);
                } else if (!this.f1144e) {
                    if (i10 != 7 && i10 != 6) {
                        if (i10 == 11 && (i12 = this.f1157l) < 4) {
                            this.f1157l = i12 + 1;
                            d();
                            n(i7, 300L);
                            return;
                        } else if ((i10 == 12 || i10 == 13) && (i11 = this.f1159n) < 2) {
                            this.f1159n = i11 + 1;
                            d();
                            n(i7, 60L);
                            return;
                        } else if (i10 != 8 && i10 != 5) {
                            if (i10 != 1 && i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 9) {
                                        if (i10 != 12 && i10 != 13) {
                                            str3 = i5.c.j(i10, "Speech recognition stopped (", ")");
                                        } else {
                                            str3 = "Speech recognition language isn't available";
                                        }
                                    } else {
                                        str3 = "Microphone permission needed";
                                    }
                                } else {
                                    str3 = "Microphone error";
                                }
                            } else {
                                str3 = "No connection for speech recognition";
                            }
                            f(str3);
                            return;
                        } else {
                            d();
                            n(i7, 250L);
                            return;
                        }
                    }
                    if (SystemClock.elapsedRealtime() - this.f1160o < 1000) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = this.f1158m + 1;
                    }
                    this.f1158m = i13;
                    if (z11) {
                        j3 = Math.min(1000L, i13 * 120);
                    } else {
                        j3 = 0;
                    }
                    n(i7, j3);
                }
            }
        }
    }

    public final void j(int i7, String str) {
        String str2;
        String trim;
        boolean z10;
        if (!this.f1153j && i7 != this.f1165t) {
            i2 i2Var = this.f1148g;
            boolean h = i2Var.h(i7);
            StringBuilder m10 = i5.c.m(i7, "session ", " onResults \"");
            m10.append(i2.c(str));
            m10.append("\"");
            if (h) {
                str2 = "";
            } else {
                str2 = " (stale)";
            }
            r.b.t(m10, str2, "Dictation");
            if (h) {
                if (!i2Var.h(i7)) {
                    StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                    m11.append(i2Var.f1250e);
                    m11.append(", open ");
                    m11.append(i2Var.f1251f);
                    m11.append("): ");
                    m11.append(i2.c(str));
                    i2Var.j(m11.toString());
                    z10 = false;
                } else {
                    String n10 = i2Var.n();
                    if (str == null) {
                        trim = "";
                    } else {
                        trim = str.trim();
                    }
                    if (!trim.isEmpty()) {
                        ArrayList o4 = i2.o(trim);
                        ArrayList o10 = i2.o(i2Var.f1248b);
                        if (!o10.isEmpty() && i2.m(o4, o10, Math.min(3, o10.size()))) {
                            i2Var.f1248b = "";
                            i2Var.f1249c = trim;
                        } else {
                            i2Var.a(trim, i2Var.d);
                        }
                    }
                    i2Var.d("final");
                    z10 = !n10.equals(i2Var.n());
                }
                if (z10) {
                    e();
                }
                this.f1161p = SystemClock.elapsedRealtime();
                if (this.f1151i && !l()) {
                    f(null);
                } else {
                    n(i7, 0L);
                }
            }
        }
    }

    public final void k(int i7, String str) {
        if (!this.f1153j) {
            i2 i2Var = this.f1148g;
            boolean z10 = false;
            if (!i2Var.h(i7)) {
                StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
                m10.append(i2Var.f1250e);
                m10.append(", open ");
                m10.append(i2Var.f1251f);
                m10.append("): ");
                m10.append(i2.c(str));
                i2Var.j(m10.toString());
            } else if (str != null) {
                String n10 = i2Var.n();
                String trim = str.trim();
                if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                    z10 = true;
                }
                i2Var.a(trim, z10);
                z10 = !n10.equals(i2Var.n());
            }
            if (z10 && !this.f1151i) {
                e();
            }
            if (str != null && !str.trim().isEmpty()) {
                r(this.f1163r);
            }
        }
    }

    public final boolean l() {
        y yVar;
        if (this.N && (yVar = this.v) != null && this.f1166u != null && yVar.d < this.f1166u.c() - 3200) {
            return true;
        }
        return false;
    }

    public final void m() {
        AudioRecord audioRecord;
        File file;
        if (!this.f1144e && this.f1166u == null && !this.f1153j) {
            z zVar = this.L;
            if (zVar != null) {
                this.f1166u = zVar;
                zVar.f1641g = new u1(this, 0);
                this.f1169y = DictationAsr.P(u0.b(this.f1137a, this.f1141c), true);
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                File externalFilesDir = this.f1137a.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    file = null;
                } else {
                    file = new File(externalFilesDir, "dictation_test.pcm");
                }
                if (file != null && file.exists()) {
                    try {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        this.J = createPipe[0];
                        ParcelFileDescriptor parcelFileDescriptor = createPipe[1];
                        Log.d("Dictation", "test source: " + file + " (" + file.length() + " bytes)");
                        Thread thread = new Thread(new a1.e(19, file, parcelFileDescriptor), "DictationTestFeeder");
                        this.K = thread;
                        thread.start();
                    } catch (Exception e10) {
                        Log.e("Dictation", "test source", e10);
                        this.J = null;
                    }
                }
            }
            android.support.v4.media.session.a0 P = DictationAsr.P(u0.b(this.f1137a, this.f1141c), true);
            this.f1169y = P;
            if ((Build.VERSION.SDK_INT >= 33 || P != null) && this.J == null) {
                z zVar2 = new z();
                this.f1166u = zVar2;
                u1 u1Var = new u1(this, 1);
                try {
                    audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 12800));
                    zVar2.f1639e = audioRecord;
                } catch (Exception e11) {
                    Log.e("Dictation", "audio capture", e11);
                    AudioRecord audioRecord2 = zVar2.f1639e;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    zVar2.f1639e = null;
                }
                if (audioRecord.getState() != 1) {
                    zVar2.f1639e.release();
                    zVar2.f1639e = null;
                    Log.d("Dictation", "own audio capture unavailable → the recogniser's microphone");
                    this.f1166u = null;
                    return;
                }
                zVar2.f1639e.startRecording();
                Thread thread2 = new Thread(new a1.e(12, zVar2, u1Var), "DictationAudio");
                zVar2.f1640f = thread2;
                thread2.start();
            }
        }
    }

    public final void n(int i7, long j3) {
        if (!this.f1153j) {
            if ((!this.f1151i || l()) && !this.f1144e) {
                this.f1146f.postDelayed(new m1(this, i7, 0), j3);
            }
        }
    }

    public final void o(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.C + 1;
        this.C = i7;
        this.f1169y = a0Var;
        DictationAsr.V((t) a0Var.f1713b, new u() {
            @Override
            public final void a(boolean z10) {
                c2 c2Var = c2.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (!c2Var.f1153j && i10 == c2Var.C) {
                    if (!z10) {
                        c2Var.f("Couldn't download the speech recognition model");
                        return;
                    }
                    w wVar = c2Var.A;
                    if (wVar != null) {
                        wVar.f1587l = true;
                    }
                    w wVar2 = new w(c2Var.f1166u, a0Var2, new r1(c2Var, i10, a0Var2, 0));
                    c2Var.A = wVar2;
                    new Thread(new a3.f(wVar2, 4), "DictationAsr").start();
                    if (c2Var.f1151i) {
                        c2Var.g();
                    }
                }
            }
        });
    }

    public final void p(String str) {
        t H;
        if (!this.f1153j && this.f1170z && this.f1166u != null && (H = DictationAsr.H(str)) != null) {
            this.D = false;
            this.f1146f.removeCallbacks(this.R);
            r(str);
            o(new android.support.v4.media.session.a0(H, str, this.f1162q, false, 7));
        }
    }

    public final String q(String str) {
        ArrayList arrayList = this.S;
        if (arrayList.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z1 z1Var = (z1) obj;
            int i11 = z1Var.f1645a;
            int i12 = z1Var.f1645a;
            String str2 = z1Var.f1646b;
            if (i11 >= i7 && str.startsWith(str2, i11)) {
                sb2.append((CharSequence) str, i7, i12);
                sb2.append(z1Var.f1647c);
                i7 = str2.length() + i12;
            }
        }
        sb2.append((CharSequence) str, Math.min(i7, str.length()), str.length());
        return sb2.toString();
    }

    public final void r(String str) {
        if (str != null && !u0.c(str, this.M)) {
            this.M = str;
            this.d.P(str);
        }
    }

    public final void s() {
        String str;
        String str2;
        android.support.v4.media.session.a0 a0Var;
        long j3;
        long j10;
        String str3;
        char c10;
        int i7;
        int i10;
        StringBuilder sb2 = new StringBuilder("start ");
        boolean z10 = this.f1144e;
        if (z10) {
            str = "SIMULATED";
        } else {
            str = "real";
        }
        sb2.append(str);
        sb2.append(" sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(" locale=");
        sb2.append(Locale.getDefault());
        char c11 = ' ';
        if (this.f1166u != null) {
            str2 = " (captured " + (this.f1166u.c() / 32) + " ms already)";
        } else {
            str2 = "";
        }
        r.b.t(sb2, str2, "Dictation");
        boolean z11 = true;
        final int i11 = 1;
        Handler handler = this.f1146f;
        if (z10) {
            this.f1154j0 = SystemClock.elapsedRealtime();
            long j11 = 0;
            this.f1156k0 = 0L;
            handler.post(this.f1152i0);
            b(new o(28), 500L);
            int i12 = 0;
            while (i12 < 5) {
                final int i13 = i12 + 1;
                String[] strArr = m0[i12];
                String str4 = strArr[0];
                final String str5 = strArr[i11];
                if (i12 == 0) {
                    j3 = j11;
                } else {
                    j3 = 140;
                }
                char c12 = 2;
                b(new m1(this, i13, 2), j3);
                if (i12 == 2) {
                    b(new o1(this, 6), 60L);
                }
                int i14 = 3;
                if (str4.equals("~")) {
                    b(new m1(this, i13, 3), 5000L);
                } else {
                    String[] split = str4.split(" \\| ");
                    int length = split.length;
                    int i15 = 0;
                    while (i15 < length) {
                        String[] split2 = split[i15].split(" ");
                        StringBuilder sb3 = new StringBuilder();
                        int i16 = 0;
                        while (i16 < split2.length) {
                            if (i16 > 0) {
                                sb3.append(c11);
                            }
                            sb3.append(split2[i16]);
                            final String sb4 = sb3.toString();
                            if (i12 == i14) {
                                if (split2[i16].equals("now")) {
                                    i10 = 300;
                                } else if (split2[i16].equals("text")) {
                                    i10 = 800;
                                } else if (split2[i16].equals("word")) {
                                    i10 = 1100;
                                } else if (split2[i16].equals("pause")) {
                                    i10 = 1500;
                                } else {
                                    i10 = 0;
                                }
                                j10 = i10;
                            } else {
                                j10 = 0;
                            }
                            int i17 = i16;
                            long length2 = (split2[i16].length() * 24) + j10 + 170 + ((long) (Math.random() * 60.0d));
                            if (!split2[i17].equals("feature") && !split2[i17].equals("office")) {
                                b(new Runnable(this) {
                                    public final c2 f1401b;

                                    {
                                        this.f1401b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                c2 c2Var = this.f1401b;
                                                c2Var.getClass();
                                                c2Var.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var.k(i13, sb4);
                                                return;
                                            case 1:
                                                this.f1401b.j(i13, sb4);
                                                return;
                                            case 2:
                                                c2 c2Var2 = this.f1401b;
                                                c2Var2.getClass();
                                                c2Var2.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var2.k(i13, sb4);
                                                return;
                                            default:
                                                this.f1401b.k(i13, sb4);
                                                return;
                                        }
                                    }
                                }, length2);
                                i7 = 3;
                                c10 = 2;
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(sb4.substring(0, sb4.length() - split2[i17].length()));
                                if (split2[i17].equals("feature")) {
                                    str3 = "feet";
                                } else {
                                    str3 = "offers";
                                }
                                sb5.append(str3);
                                final String sb6 = sb5.toString();
                                c10 = 2;
                                b(new Runnable(this) {
                                    public final c2 f1401b;

                                    {
                                        this.f1401b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                c2 c2Var = this.f1401b;
                                                c2Var.getClass();
                                                c2Var.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var.k(i13, sb6);
                                                return;
                                            case 1:
                                                this.f1401b.j(i13, sb6);
                                                return;
                                            case 2:
                                                c2 c2Var2 = this.f1401b;
                                                c2Var2.getClass();
                                                c2Var2.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var2.k(i13, sb6);
                                                return;
                                            default:
                                                this.f1401b.k(i13, sb6);
                                                return;
                                        }
                                    }
                                }, length2);
                                i7 = 3;
                                b(new Runnable(this) {
                                    public final c2 f1401b;

                                    {
                                        this.f1401b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                c2 c2Var = this.f1401b;
                                                c2Var.getClass();
                                                c2Var.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var.k(i13, sb4);
                                                return;
                                            case 1:
                                                this.f1401b.j(i13, sb4);
                                                return;
                                            case 2:
                                                c2 c2Var2 = this.f1401b;
                                                c2Var2.getClass();
                                                c2Var2.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var2.k(i13, sb4);
                                                return;
                                            default:
                                                this.f1401b.k(i13, sb4);
                                                return;
                                        }
                                    }
                                }, 180L);
                            }
                            i16 = i17 + 1;
                            c12 = c10;
                            i14 = i7;
                            c11 = ' ';
                        }
                        b(new o(28), 650L);
                        i15++;
                        i14 = i14;
                        c11 = ' ';
                    }
                    if (str5.startsWith("!")) {
                        i11 = 1;
                        str5 = str5.substring(1);
                    } else {
                        i11 = 1;
                    }
                    b(new Runnable(this) {
                        public final c2 f1401b;

                        {
                            this.f1401b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    c2 c2Var = this.f1401b;
                                    c2Var.getClass();
                                    c2Var.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                    c2Var.k(i13, str5);
                                    return;
                                case 1:
                                    this.f1401b.j(i13, str5);
                                    return;
                                case 2:
                                    c2 c2Var2 = this.f1401b;
                                    c2Var2.getClass();
                                    c2Var2.f1150h0 = SystemClock.elapsedRealtime() + 400;
                                    c2Var2.k(i13, str5);
                                    return;
                                default:
                                    this.f1401b.k(i13, str5);
                                    return;
                            }
                        }
                    }, 900L);
                }
                i12 = i13;
                c11 = ' ';
                j11 = 0;
            }
            b(new o1(this, 0), 1300L);
            return;
        }
        if (this.f1166u == null && this.J == null) {
            m();
        }
        long j12 = this.f1141c;
        Context context = this.f1137a;
        this.f1162q = u0.b(context, j12);
        android.support.v4.media.session.a0 a0Var2 = this.f1169y;
        if (a0Var2 == null || this.f1166u == null) {
            z11 = false;
        }
        this.f1170z = z11;
        String str6 = null;
        if (z11) {
            boolean v = DictationAsr.v();
            this.D = v;
            if (v) {
                ExecutorService executorService = DictationLid.f42585a;
                if (DictationAsr.v()) {
                    DictationLid.d(context);
                }
                String string = np.e1().getString("tinylid_lang", null);
                if (string != null) {
                    a0Var = DictationAsr.R(string, this.f1169y, false);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    this.f1169y = a0Var;
                }
                handler.postDelayed(this.R, 700L);
            } else {
                r(this.f1169y.i());
            }
            StringBuilder sb7 = new StringBuilder("tinyasr route: ");
            sb7.append(this.f1169y);
            sb7.append(" (candidates ");
            sb7.append(this.f1162q);
            sb7.append(", last sure ");
            ExecutorService executorService2 = DictationLid.f42585a;
            sb7.append(np.e1().getString("tinylid_lang", null));
            sb7.append(")");
            Log.d("Dictation", sb7.toString());
            o(this.f1169y);
        } else if (a0Var2 != null) {
            f("Microphone error");
        } else if (!DictationAsr.x()) {
            f("Speech recognition isn't available");
        } else {
            if (this.f1166u != null) {
                DictationLid.k(context);
                handler.postDelayed(this.f1149g0, 700L);
            }
            Log.d("Dictation", "language candidates " + this.f1162q);
            if (!this.f1162q.isEmpty()) {
                str6 = (String) this.f1162q.get(0);
            }
            v(str6, "start");
            t();
        }
    }

    public final void t() {
        throw new UnsupportedOperationException("Method not decompiled: ai.c2.t():void");
    }

    public final void u() {
        z zVar;
        if (this.f1153j) {
            return;
        }
        this.f1151i = true;
        Log.d("Dictation", "stop requested (session " + this.f1155k + ")");
        boolean z10 = this.f1144e;
        Handler handler = this.f1146f;
        i2 i2Var = this.f1148g;
        if (z10) {
            handler.removeCallbacksAndMessages(null);
            i2Var.g(this.f1155k, "stop");
            e();
            handler.postDelayed(new o1(this, 2), 350L);
        } else if (this.f1170z) {
            if (this.D && !this.F && !this.G && DictationLid.f() && (zVar = this.f1166u) != null) {
                this.G = true;
                int i7 = this.C;
                zVar.d();
                z zVar2 = this.f1166u;
                DictationLid.j(zVar2.b(0, zVar2.c()), 500, new s1(this, i7, 0));
                return;
            }
            g();
        } else if (i2Var.f1248b.isEmpty() && i2Var.f1249c.isEmpty()) {
            Log.d("Dictation", "stop: current session is empty → finish now");
            i2Var.g(this.f1155k, "stop-empty");
            f(null);
        } else {
            try {
                SpeechRecognizer speechRecognizer = this.h;
                if (speechRecognizer != null) {
                    speechRecognizer.stopListening();
                }
            } catch (Exception e10) {
                Log.e("Dictation", "stopListening", e10);
            }
            handler.postDelayed(new o1(this, 1), 1600L);
        }
    }

    public final void v(String str, String str2) {
        this.f1159n = 0;
        this.f1163r = str;
        Log.d("Dictation", r.b.l("language ", str, " (", str2, ")"));
    }
}
