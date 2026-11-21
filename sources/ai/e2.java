package ai;

import android.content.Context;
import android.content.Intent;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.speech.SpeechRecognizer;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class e2 {
    public static final int[] f1160j0 = {1000, 2000, 5000, 10000};
    public static final String[][] f1161k0 = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public w A;
    public String B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public z J;
    public String K;
    public boolean L;
    public ArrayList M;
    public int N;
    public int O;
    public final z1 P;
    public final ArrayList Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public final q1 V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;
    public final Context f1162a;
    public int f1163a0;
    public final int f1164b;
    public int f1165b0;
    public final long f1166c;
    public boolean f1167c0;
    public final c2 d;
    public String f1168d0;
    public final boolean f1169e;
    public final z1 f1170e0;
    public final Handler f1171f = new Handler(Looper.getMainLooper());
    public long f1172f0;
    public final k2 f1173g;
    public final z1 f1174g0;
    public SpeechRecognizer h;
    public long f1175h0;
    public boolean f1176i;
    public long f1177i0;
    public boolean f1178j;
    public int f1179k;
    public int f1180l;
    public int f1181m;
    public int f1182n;
    public long f1183o;
    public long f1184p;
    public ArrayList f1185q;
    public String f1186r;
    public int f1187s;
    public int f1188t;
    public z f1189u;
    public y v;
    public int f1190w;
    public int f1191x;
    public android.support.v4.media.session.a0 f1192y;
    public boolean f1193z;

    public e2(Context context, int i7, long j3, boolean z10, c2 c2Var) {
        k2 k2Var = new k2();
        this.f1173g = k2Var;
        this.f1185q = new ArrayList();
        this.f1188t = -1;
        this.f1191x = -1;
        this.B = "";
        this.P = new z1(this, 0);
        this.Q = new ArrayList();
        this.U = -1;
        this.V = new q1(this, 3);
        this.f1170e0 = new z1(this, 1);
        this.f1174g0 = new z1(this, 2);
        this.f1162a = context.getApplicationContext();
        this.f1164b = i7;
        this.f1166c = j3;
        this.f1169e = z10;
        this.d = c2Var;
        k2Var.f1270g = new a3.l(13);
    }

    public static String a(Bundle bundle) {
        ArrayList<String> stringArrayList;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("results_recognition")) != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        return null;
    }

    public final void b(Runnable runnable, long j3) {
        this.f1177i0 += j3;
        this.f1171f.postAtTime(new a1.e(17, this, runnable), SystemClock.uptimeMillis() + this.f1177i0);
    }

    public final void c() {
        this.f1178j = true;
        this.f1171f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.f1585l = true;
        }
        d();
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.f1189u;
        if (zVar != null) {
            zVar.d();
            this.f1189u = null;
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
        this.d.i(q(this.f1173g.n()));
        Handler handler = this.f1171f;
        q1 q1Var = this.V;
        handler.removeCallbacks(q1Var);
        if (this.T && !this.f1178j && !this.f1176i) {
            handler.postDelayed(q1Var, 2000L);
        }
    }

    public final void f(String str) {
        String q10;
        if (this.f1178j) {
            return;
        }
        this.f1178j = true;
        this.f1171f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.f1585l = true;
        }
        d();
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.f1189u;
        if (zVar != null) {
            zVar.d();
            this.f1189u = null;
        }
        if (this.U >= 0) {
            ConnectionsManager.getInstance(this.f1164b).cancelRequest(this.U, true);
        }
        if (this.f1193z) {
            q10 = this.B;
        } else {
            q10 = q(this.f1173g.n());
        }
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.f1179k);
        u10.append(" chars=");
        u10.append(q10.length());
        Log.d("Dictation", u10.toString());
        this.d.a(q10, str);
    }

    public final void g() {
        w wVar = this.A;
        if (wVar == null) {
            z zVar = this.f1189u;
            if (zVar != null) {
                zVar.d();
                return;
            }
            return;
        }
        wVar.f1588o = new q1(this, 4);
        wVar.f1584k = true;
    }

    public final boolean h(String str) {
        String str2;
        String str3;
        if (DictationAsr.z() && d.i() && Build.VERSION.SDK_INT >= 33 && this.f1189u != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f1185q;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String str4 = (String) obj;
                if (DictationAsr.V(Locale.forLanguageTag(str4.replace('_', '-')).getLanguage(), this.f1192y, false) == null) {
                    arrayList.add(str4);
                }
            }
            if (!arrayList.isEmpty()) {
                if (str != null && !"other".equals(str)) {
                    HashMap hashMap = w0.f1589a;
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
                                if (w0.d(str2, str)) {
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
                this.M = arrayList;
                StringBuilder sb2 = new StringBuilder("tinyasr → Google in ");
                sb2.append(str5);
                if (this.M == null) {
                    str3 = "";
                } else {
                    str3 = " detecting among " + this.M;
                }
                sb2.append(str3);
                sb2.append(" (tinylid: ");
                sb2.append(str);
                sb2.append(", no model for it)");
                Log.d("Dictation", sb2.toString());
                this.C++;
                w wVar = this.A;
                if (wVar != null) {
                    wVar.f1585l = true;
                    this.A = null;
                }
                this.f1171f.removeCallbacks(this.P);
                this.f1193z = false;
                this.B = "";
                this.d.l(0, "");
                r(str5);
                v(str5, "tinylid: no model");
                this.f1191x = 0;
                this.X = 0;
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
        if (!this.f1178j && i7 != this.f1188t) {
            k2 k2Var = this.f1173g;
            int i13 = 0;
            if (!k2Var.h(i7) && i7 != this.f1179k) {
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
            n10.append(this.f1176i);
            n10.append(" after ");
            n10.append(SystemClock.elapsedRealtime() - this.f1183o);
            n10.append(" ms");
            Log.d("Dictation", n10.toString());
            if (z10) {
                if (k2Var.f1266b.isEmpty() && k2Var.f1267c.isEmpty() && SystemClock.elapsedRealtime() - this.f1183o < 1000 && i10 != 7 && i10 != 6) {
                    this.f1191x = this.f1190w;
                }
                k2Var.g(i7, "error " + i10);
                e();
                this.f1184p = SystemClock.elapsedRealtime();
                if (this.f1176i && !l()) {
                    f(null);
                } else if (!this.f1169e) {
                    if (i10 != 7 && i10 != 6) {
                        if (i10 == 11 && (i12 = this.f1180l) < 4) {
                            this.f1180l = i12 + 1;
                            d();
                            n(i7, 300L);
                            return;
                        } else if ((i10 == 12 || i10 == 13) && (i11 = this.f1182n) < 2) {
                            this.f1182n = i11 + 1;
                            d();
                            n(i7, 60L);
                            return;
                        } else if (i10 != 8 && i10 != 5) {
                            if (i10 != 1 && i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 9) {
                                        if (i10 != 12 && i10 != 13) {
                                            str3 = i5.c.j(i10, "speech recognition stopped (", ")");
                                        } else {
                                            str3 = "speech recognition language unavailable";
                                        }
                                    } else {
                                        str3 = "microphone permission needed";
                                    }
                                } else {
                                    str3 = "microphone error";
                                }
                            } else {
                                str3 = "no connection for speech recognition";
                            }
                            f(str3);
                            return;
                        } else {
                            d();
                            n(i7, 250L);
                            return;
                        }
                    }
                    if (SystemClock.elapsedRealtime() - this.f1183o < 1000) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = this.f1181m + 1;
                    }
                    this.f1181m = i13;
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
        if (!this.f1178j && i7 != this.f1188t) {
            k2 k2Var = this.f1173g;
            boolean h = k2Var.h(i7);
            StringBuilder m10 = i5.c.m(i7, "session ", " onResults ");
            m10.append(k2.c(str));
            if (h) {
                str2 = "";
            } else {
                str2 = " (stale)";
            }
            p5.c.t(m10, str2, "Dictation");
            if (h) {
                if (!k2Var.h(i7)) {
                    StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                    m11.append(k2Var.f1268e);
                    m11.append(", open ");
                    m11.append(k2Var.f1269f);
                    m11.append("): ");
                    m11.append(k2.c(str));
                    k2Var.j(m11.toString());
                    z10 = false;
                } else {
                    String n10 = k2Var.n();
                    if (str == null) {
                        trim = "";
                    } else {
                        trim = str.trim();
                    }
                    if (!trim.isEmpty()) {
                        ArrayList o4 = k2.o(trim);
                        ArrayList o10 = k2.o(k2Var.f1266b);
                        if (!o10.isEmpty() && k2.m(o4, o10, Math.min(3, o10.size()))) {
                            k2Var.f1266b = "";
                            k2Var.f1267c = trim;
                        } else {
                            k2Var.a(trim, k2Var.d);
                        }
                    }
                    k2Var.d("final");
                    z10 = !n10.equals(k2Var.n());
                }
                if (z10) {
                    e();
                }
                this.f1184p = SystemClock.elapsedRealtime();
                if (this.f1176i && !l()) {
                    f(null);
                } else {
                    n(i7, 0L);
                }
            }
        }
    }

    public final void k(int i7, String str) {
        if (!this.f1178j) {
            k2 k2Var = this.f1173g;
            boolean z10 = false;
            if (!k2Var.h(i7)) {
                StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
                m10.append(k2Var.f1268e);
                m10.append(", open ");
                m10.append(k2Var.f1269f);
                m10.append("): ");
                m10.append(k2.c(str));
                k2Var.j(m10.toString());
            } else if (str != null) {
                String n10 = k2Var.n();
                String trim = str.trim();
                if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                    z10 = true;
                }
                k2Var.a(trim, z10);
                z10 = !n10.equals(k2Var.n());
            }
            if (z10 && !this.f1176i) {
                e();
            }
            if (str != null && !str.trim().isEmpty()) {
                r(this.f1186r);
            }
        }
    }

    public final boolean l() {
        y yVar;
        if (this.L && (yVar = this.v) != null && this.f1189u != null && yVar.d < this.f1189u.c() - 3200) {
            return true;
        }
        return false;
    }

    public final void m() {
        AudioRecord audioRecord;
        if (!this.f1169e && this.f1189u == null && !this.f1178j) {
            z zVar = this.J;
            if (zVar != null) {
                this.f1189u = zVar;
                zVar.f1640g = new w1(this, 0);
                this.f1192y = DictationAsr.T(w0.c(this.f1162a, this.f1166c), true);
                return;
            }
            android.support.v4.media.session.a0 T = DictationAsr.T(w0.c(this.f1162a, this.f1166c), true);
            this.f1192y = T;
            if (Build.VERSION.SDK_INT >= 33 || T != null) {
                z zVar2 = new z();
                this.f1189u = zVar2;
                w1 w1Var = new w1(this, 1);
                try {
                    audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 12800));
                    zVar2.f1638e = audioRecord;
                } catch (Exception e10) {
                    Log.e("Dictation", "audio capture", e10);
                    AudioRecord audioRecord2 = zVar2.f1638e;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    zVar2.f1638e = null;
                }
                if (audioRecord.getState() != 1) {
                    zVar2.f1638e.release();
                    zVar2.f1638e = null;
                    Log.d("Dictation", "own audio capture unavailable → the recogniser's microphone");
                    this.f1189u = null;
                    return;
                }
                zVar2.f1638e.startRecording();
                Thread thread = new Thread(new a1.e(11, zVar2, w1Var), "DictationAudio");
                zVar2.f1639f = thread;
                thread.start();
            }
        }
    }

    public final void n(int i7, long j3) {
        if (!this.f1178j) {
            if ((!this.f1176i || l()) && !this.f1169e) {
                this.f1171f.postDelayed(new o1(this, i7, 0), j3);
            }
        }
    }

    public final void o(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.C + 1;
        this.C = i7;
        this.f1192y = a0Var;
        DictationAsr.f0((t) a0Var.f1717b, new u() {
            @Override
            public final void a(boolean z10) {
                e2 e2Var = e2.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (!e2Var.f1178j && i10 == e2Var.C) {
                    if (!z10) {
                        e2Var.f("speech model download failed");
                        return;
                    }
                    w wVar = e2Var.A;
                    if (wVar != null) {
                        wVar.f1585l = true;
                    }
                    w wVar2 = new w(e2Var.f1189u, a0Var2, new t1(e2Var, i10, a0Var2, 0));
                    e2Var.A = wVar2;
                    new Thread(new a3.f(wVar2, 5), "DictationAsr").start();
                    if (e2Var.f1176i) {
                        e2Var.g();
                    }
                }
            }
        });
    }

    public final void p(String str) {
        t J;
        if (!this.f1178j && this.f1193z && this.f1189u != null && (J = DictationAsr.J(str)) != null) {
            this.D = false;
            this.f1171f.removeCallbacks(this.P);
            r(str);
            o(new android.support.v4.media.session.a0(J, str, this.f1185q, false, 7));
        }
    }

    public final String q(String str) {
        ArrayList arrayList = this.Q;
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
            b2 b2Var = (b2) obj;
            int i11 = b2Var.f1128a;
            int i12 = b2Var.f1128a;
            String str2 = b2Var.f1129b;
            if (i11 >= i7 && str.startsWith(str2, i11)) {
                sb2.append((CharSequence) str, i7, i12);
                sb2.append(b2Var.f1130c);
                i7 = str2.length() + i12;
            }
        }
        sb2.append((CharSequence) str, Math.min(i7, str.length()), str.length());
        return sb2.toString();
    }

    public final void r(String str) {
        if (str != null && !w0.d(str, this.K)) {
            this.K = str;
            this.d.x(str);
        }
    }

    public final void s() {
        String str;
        String str2;
        android.support.v4.media.session.a0 a0Var;
        long j3;
        final String str3;
        int i7;
        long j10;
        String str4;
        int i10;
        int i11;
        StringBuilder sb2 = new StringBuilder("start ");
        boolean z10 = this.f1169e;
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
        char c10 = ' ';
        if (this.f1189u != null) {
            str2 = " (captured " + (this.f1189u.c() / 32) + " ms already)";
        } else {
            str2 = "";
        }
        p5.c.t(sb2, str2, "Dictation");
        boolean z11 = true;
        final int i12 = 1;
        Handler handler = this.f1171f;
        if (z10) {
            this.f1175h0 = SystemClock.elapsedRealtime();
            long j11 = 0;
            this.f1177i0 = 0L;
            handler.post(this.f1174g0);
            b(new org.telegram.messenger.j2(0), 500L);
            int i13 = 0;
            while (i13 < 5) {
                final int i14 = i13 + 1;
                String[] strArr = f1161k0[i13];
                String str5 = strArr[0];
                String str6 = strArr[i12];
                if (i13 == 0) {
                    j3 = j11;
                } else {
                    j3 = 140;
                }
                b(new o1(this, i14, 2), j3);
                if (i13 == 2) {
                    b(new q1(this, 6), 60L);
                }
                int i15 = 3;
                if (str5.equals("~")) {
                    b(new o1(this, i14, 3), 5000L);
                } else {
                    String[] split = str5.split(" \\| ");
                    int length = split.length;
                    int i16 = 0;
                    while (i16 < length) {
                        String[] split2 = split[i16].split(" ");
                        StringBuilder sb3 = new StringBuilder();
                        int i17 = 0;
                        while (i17 < split2.length) {
                            if (i17 > 0) {
                                sb3.append(c10);
                            }
                            sb3.append(split2[i17]);
                            final String sb4 = sb3.toString();
                            if (i13 == i15) {
                                if (split2[i17].equals("now")) {
                                    i11 = 300;
                                } else if (split2[i17].equals("text")) {
                                    i11 = 800;
                                } else if (split2[i17].equals("word")) {
                                    i11 = 1100;
                                } else if (split2[i17].equals("pause")) {
                                    i11 = 1500;
                                } else {
                                    i11 = 0;
                                }
                                i7 = i16;
                                j10 = i11;
                            } else {
                                i7 = i16;
                                j10 = 0;
                            }
                            String str7 = str6;
                            long length2 = (split2[i17].length() * 24) + j10 + 170 + ((long) (Math.random() * 60.0d));
                            if (!split2[i17].equals("feature") && !split2[i17].equals("office")) {
                                b(new Runnable(this) {
                                    public final e2 f1414b;

                                    {
                                        this.f1414b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                e2 e2Var = this.f1414b;
                                                e2Var.getClass();
                                                e2Var.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                                e2Var.k(i14, sb4);
                                                return;
                                            case 1:
                                                this.f1414b.j(i14, sb4);
                                                return;
                                            case 2:
                                                e2 e2Var2 = this.f1414b;
                                                e2Var2.getClass();
                                                e2Var2.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                                e2Var2.k(i14, sb4);
                                                return;
                                            default:
                                                this.f1414b.k(i14, sb4);
                                                return;
                                        }
                                    }
                                }, length2);
                                i10 = 3;
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(sb4.substring(0, sb4.length() - split2[i17].length()));
                                if (split2[i17].equals("feature")) {
                                    str4 = "feet";
                                } else {
                                    str4 = "offers";
                                }
                                sb5.append(str4);
                                final String sb6 = sb5.toString();
                                b(new Runnable(this) {
                                    public final e2 f1414b;

                                    {
                                        this.f1414b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                e2 e2Var = this.f1414b;
                                                e2Var.getClass();
                                                e2Var.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                                e2Var.k(i14, sb6);
                                                return;
                                            case 1:
                                                this.f1414b.j(i14, sb6);
                                                return;
                                            case 2:
                                                e2 e2Var2 = this.f1414b;
                                                e2Var2.getClass();
                                                e2Var2.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                                e2Var2.k(i14, sb6);
                                                return;
                                            default:
                                                this.f1414b.k(i14, sb6);
                                                return;
                                        }
                                    }
                                }, length2);
                                i10 = 3;
                                b(new Runnable(this) {
                                    public final e2 f1414b;

                                    {
                                        this.f1414b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                e2 e2Var = this.f1414b;
                                                e2Var.getClass();
                                                e2Var.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                                e2Var.k(i14, sb4);
                                                return;
                                            case 1:
                                                this.f1414b.j(i14, sb4);
                                                return;
                                            case 2:
                                                e2 e2Var2 = this.f1414b;
                                                e2Var2.getClass();
                                                e2Var2.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                                e2Var2.k(i14, sb4);
                                                return;
                                            default:
                                                this.f1414b.k(i14, sb4);
                                                return;
                                        }
                                    }
                                }, 180L);
                            }
                            i17++;
                            i15 = i10;
                            i16 = i7;
                            str6 = str7;
                            c10 = ' ';
                        }
                        b(new org.telegram.messenger.j2(0), 650L);
                        i16++;
                        c10 = ' ';
                    }
                    String str8 = str6;
                    if (str8.startsWith("!")) {
                        i12 = 1;
                        str3 = str8.substring(1);
                    } else {
                        i12 = 1;
                        str3 = str8;
                    }
                    b(new Runnable(this) {
                        public final e2 f1414b;

                        {
                            this.f1414b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    e2 e2Var = this.f1414b;
                                    e2Var.getClass();
                                    e2Var.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                    e2Var.k(i14, str3);
                                    return;
                                case 1:
                                    this.f1414b.j(i14, str3);
                                    return;
                                case 2:
                                    e2 e2Var2 = this.f1414b;
                                    e2Var2.getClass();
                                    e2Var2.f1172f0 = SystemClock.elapsedRealtime() + 400;
                                    e2Var2.k(i14, str3);
                                    return;
                                default:
                                    this.f1414b.k(i14, str3);
                                    return;
                            }
                        }
                    }, 900L);
                }
                i13 = i14;
                c10 = ' ';
                j11 = 0;
            }
            b(new q1(this, 0), 1300L);
            return;
        }
        if (this.f1189u == null) {
            m();
        }
        long j12 = this.f1166c;
        Context context = this.f1162a;
        this.f1185q = w0.c(context, j12);
        android.support.v4.media.session.a0 a0Var2 = this.f1192y;
        if (a0Var2 == null || this.f1189u == null) {
            z11 = false;
        }
        this.f1193z = z11;
        String str9 = null;
        if (z11) {
            boolean x10 = DictationAsr.x();
            this.D = x10;
            if (x10) {
                ExecutorService executorService = DictationLid.f43071a;
                if (DictationAsr.x()) {
                    DictationLid.d(context);
                }
                String string = mp.g1().getString("tinylid_lang", null);
                if (string != null) {
                    a0Var = DictationAsr.V(string, this.f1192y, false);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    this.f1192y = a0Var;
                }
                handler.postDelayed(this.P, 700L);
            } else {
                r(this.f1192y.i());
            }
            StringBuilder sb7 = new StringBuilder("tinyasr route: ");
            sb7.append(this.f1192y);
            sb7.append(" (candidates ");
            sb7.append(this.f1185q);
            sb7.append(", last sure ");
            ExecutorService executorService2 = DictationLid.f43071a;
            sb7.append(mp.g1().getString("tinylid_lang", null));
            sb7.append(")");
            Log.d("Dictation", sb7.toString());
            o(this.f1192y);
        } else if (a0Var2 != null) {
            f("microphone error");
        } else if (!DictationAsr.z()) {
            f("speech recognition unavailable");
        } else {
            if (this.f1189u != null) {
                DictationLid.k(context);
                handler.postDelayed(this.f1170e0, 700L);
            }
            Log.d("Dictation", "language candidates " + this.f1185q);
            if (!this.f1185q.isEmpty()) {
                str9 = (String) this.f1185q.get(0);
            }
            v(str9, "start");
            t();
        }
    }

    public final void t() {
        boolean z10;
        String str;
        String str2;
        String n10;
        if (!this.f1178j) {
            Context context = this.f1162a;
            y yVar = null;
            if (this.h == null) {
                try {
                    if (SpeechRecognizer.isRecognitionAvailable(context)) {
                        this.h = SpeechRecognizer.createSpeechRecognizer(context);
                    }
                } catch (Exception e10) {
                    Log.e("Dictation", "create recognizer", e10);
                    this.h = null;
                }
                if (this.h == null) {
                    f("speech recognition unavailable on this device");
                    return;
                }
            }
            int i7 = this.f1179k + 1;
            this.f1179k = i7;
            this.f1173g.b(i7);
            k2 k2Var = this.f1173g;
            if (this.f1189u != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.T) {
                this.T = z10;
                this.f1171f.removeCallbacks(this.V);
                int i10 = this.R;
                if (z10) {
                    n10 = k2Var.f1265a.toString();
                } else {
                    n10 = k2Var.n();
                }
                this.R = Math.max(i10, n10.length());
            }
            this.f1183o = SystemClock.elapsedRealtime();
            StringBuilder m10 = i5.c.m(i7, "session ", " start lang=");
            int i11 = this.f1182n;
            String str3 = "en-US";
            if (i11 == 0) {
                str = this.f1186r;
            } else if (i11 == 2) {
                str = "en-US";
            } else {
                str = null;
            }
            m10.append(str);
            if (this.f1184p > 0) {
                str2 = a8.p0.r(new StringBuilder(" gap="), this.f1183o - this.f1184p, "ms");
            } else {
                str2 = "";
            }
            p5.c.t(m10, str2, "Dictation");
            this.h.setRecognitionListener(new d2(this, i7));
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            int i12 = this.f1182n;
            if (i12 == 0) {
                str3 = this.f1186r;
            } else if (i12 != 2) {
                str3 = null;
            }
            if (str3 != null) {
                intent.putExtra("android.speech.extra.LANGUAGE", str3);
            }
            intent.putExtra("android.speech.extra.PREFER_OFFLINE", false);
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            if (this.M != null && this.f1182n == 0 && Build.VERSION.SDK_INT >= 34) {
                intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION", true);
                intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_DETECTION_ALLOWED_LANGUAGES", this.M);
                intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH", "balanced");
                intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_SWITCH_ALLOWED_LANGUAGES", this.M);
            }
            if (this.f1189u != null) {
                int i13 = this.f1191x;
                if (i13 < 0) {
                    y yVar2 = this.v;
                    if (yVar2 != null) {
                        i13 = yVar2.d;
                    } else {
                        i13 = 0;
                    }
                }
                this.f1191x = -1;
                y yVar3 = this.v;
                if (yVar3 != null) {
                    yVar3.a();
                }
                z zVar = this.f1189u;
                zVar.getClass();
                try {
                    yVar = new y(zVar, Math.max(0, Math.min(i13, zVar.c())), 48000, 64);
                } catch (Exception e11) {
                    Log.e("Dictation", "feed", e11);
                }
                this.v = yVar;
                this.f1190w = i13;
                if (yVar != null) {
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE", yVar.f1609a);
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
                    Log.d("Dictation", "session " + this.f1179k + " audio from " + ((i13 * 1000) / 32000) + " ms (captured " + ((this.f1189u.c() * 1000) / 32000) + " ms)");
                }
            }
            if (this.f1189u == null) {
                intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 3000);
                intent.putExtra("android.speech.extras.SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS", 2500);
                intent.putExtra("android.speech.extras.SPEECH_INPUT_MINIMUM_LENGTH_MILLIS", 15000);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                intent.putExtra("android.speech.extra.HIDE_PARTIAL_TRAILING_PUNCTUATION", false);
                intent.putExtra("android.speech.extra.MASK_OFFENSIVE_WORDS", false);
            }
            try {
                this.h.startListening(intent);
            } catch (Exception e12) {
                Log.e("Dictation", "startListening", e12);
                f("speech recognition failed to start");
            }
        }
    }

    public final void u() {
        z zVar;
        if (this.f1178j) {
            return;
        }
        this.f1176i = true;
        Log.d("Dictation", "stop requested (session " + this.f1179k + ")");
        boolean z10 = this.f1169e;
        Handler handler = this.f1171f;
        k2 k2Var = this.f1173g;
        if (z10) {
            handler.removeCallbacksAndMessages(null);
            k2Var.g(this.f1179k, "stop");
            e();
            handler.postDelayed(new q1(this, 2), 350L);
        } else if (this.f1193z) {
            if (this.D && !this.F && !this.G && DictationLid.f() && (zVar = this.f1189u) != null) {
                this.G = true;
                int i7 = this.C;
                zVar.d();
                z zVar2 = this.f1189u;
                DictationLid.j(zVar2.b(0, zVar2.c()), 500, new u1(this, i7, 0));
                return;
            }
            g();
        } else if (k2Var.f1266b.isEmpty() && k2Var.f1267c.isEmpty()) {
            Log.d("Dictation", "stop: current session is empty → finish now");
            k2Var.g(this.f1179k, "stop-empty");
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
            handler.postDelayed(new q1(this, 1), 1600L);
        }
    }

    public final void v(String str, String str2) {
        this.f1182n = 0;
        this.f1186r = str;
        Log.d("Dictation", p5.c.l("language ", str, " (", str2, ")"));
    }
}
