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
public final class c2 {
    public static final int[] f1135j0 = {1000, 2000, 5000, 10000};
    public static final String[][] f1136k0 = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
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
    public final x1 P;
    public final ArrayList Q;
    public int R;
    public boolean S;
    public boolean T;
    public int U;
    public final o1 V;
    public boolean W;
    public int X;
    public int Y;
    public int Z;
    public final Context f1137a;
    public int f1138a0;
    public final int f1139b;
    public int f1140b0;
    public final long f1141c;
    public boolean f1142c0;
    public final a2 d;
    public String f1143d0;
    public final boolean f1144e;
    public final x1 f1145e0;
    public final Handler f1146f = new Handler(Looper.getMainLooper());
    public long f1147f0;
    public final i2 f1148g;
    public final x1 f1149g0;
    public SpeechRecognizer h;
    public long f1150h0;
    public boolean f1151i;
    public long f1152i0;
    public boolean f1153j;
    public int f1154k;
    public int f1155l;
    public int f1156m;
    public int f1157n;
    public long f1158o;
    public long f1159p;
    public ArrayList f1160q;
    public String f1161r;
    public int f1162s;
    public int f1163t;
    public z f1164u;
    public y v;
    public int f1165w;
    public int f1166x;
    public android.support.v4.media.session.a0 f1167y;
    public boolean f1168z;

    public c2(Context context, int i7, long j3, boolean z10, a2 a2Var) {
        i2 i2Var = new i2();
        this.f1148g = i2Var;
        this.f1160q = new ArrayList();
        this.f1163t = -1;
        this.f1166x = -1;
        this.B = "";
        this.P = new x1(this, 0);
        this.Q = new ArrayList();
        this.U = -1;
        this.V = new o1(this, 3);
        this.f1145e0 = new x1(this, 1);
        this.f1149g0 = new x1(this, 2);
        this.f1137a = context.getApplicationContext();
        this.f1139b = i7;
        this.f1141c = j3;
        this.f1144e = z10;
        this.d = a2Var;
        i2Var.f1244g = new a3.l(13);
    }

    public static String a(Bundle bundle) {
        ArrayList<String> stringArrayList;
        if (bundle != null && (stringArrayList = bundle.getStringArrayList("results_recognition")) != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        return null;
    }

    public final void b(Runnable runnable, long j3) {
        this.f1152i0 += j3;
        this.f1146f.postAtTime(new a1.e(17, this, runnable), SystemClock.uptimeMillis() + this.f1152i0);
    }

    public final void c() {
        this.f1153j = true;
        this.f1146f.removeCallbacksAndMessages(null);
        w wVar = this.A;
        if (wVar != null) {
            wVar.f1578l = true;
        }
        d();
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.f1164u;
        if (zVar != null) {
            zVar.d();
            this.f1164u = null;
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
        this.d.i(q(this.f1148g.n()));
        Handler handler = this.f1146f;
        o1 o1Var = this.V;
        handler.removeCallbacks(o1Var);
        if (this.T && !this.f1153j && !this.f1151i) {
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
            wVar.f1578l = true;
        }
        d();
        y yVar = this.v;
        if (yVar != null) {
            yVar.a();
            this.v = null;
        }
        z zVar = this.f1164u;
        if (zVar != null) {
            zVar.d();
            this.f1164u = null;
        }
        if (this.U >= 0) {
            ConnectionsManager.getInstance(this.f1139b).cancelRequest(this.U, true);
        }
        if (this.f1168z) {
            q10 = this.B;
        } else {
            q10 = q(this.f1148g.n());
        }
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.f1154k);
        u10.append(" chars=");
        u10.append(q10.length());
        Log.d("Dictation", u10.toString());
        this.d.a(q10, str);
    }

    public final void g() {
        w wVar = this.A;
        if (wVar == null) {
            z zVar = this.f1164u;
            if (zVar != null) {
                zVar.d();
                return;
            }
            return;
        }
        wVar.f1581o = new o1(this, 4);
        wVar.f1577k = true;
    }

    public final boolean h(String str) {
        String str2;
        String str3;
        if (DictationAsr.x() && d.h() && Build.VERSION.SDK_INT >= 33 && this.f1164u != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f1160q;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                String str4 = (String) obj;
                if (DictationAsr.R(Locale.forLanguageTag(str4.replace('_', '-')).getLanguage(), this.f1167y, false) == null) {
                    arrayList.add(str4);
                }
            }
            if (!arrayList.isEmpty()) {
                if (str != null && !"other".equals(str)) {
                    HashMap hashMap = u0.f1549a;
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
                                if (u0.d(str2, str)) {
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
                    wVar.f1578l = true;
                    this.A = null;
                }
                this.f1146f.removeCallbacks(this.P);
                this.f1168z = false;
                this.B = "";
                this.d.l(0, "");
                r(str5);
                v(str5, "tinylid: no model");
                this.f1166x = 0;
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
        if (!this.f1153j && i7 != this.f1163t) {
            i2 i2Var = this.f1148g;
            int i13 = 0;
            if (!i2Var.h(i7) && i7 != this.f1154k) {
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
            n10.append(SystemClock.elapsedRealtime() - this.f1158o);
            n10.append(" ms");
            Log.d("Dictation", n10.toString());
            if (z10) {
                if (i2Var.f1240b.isEmpty() && i2Var.f1241c.isEmpty() && SystemClock.elapsedRealtime() - this.f1158o < 1000 && i10 != 7 && i10 != 6) {
                    this.f1166x = this.f1165w;
                }
                i2Var.g(i7, "error " + i10);
                e();
                this.f1159p = SystemClock.elapsedRealtime();
                if (this.f1151i && !l()) {
                    f(null);
                } else if (!this.f1144e) {
                    if (i10 != 7 && i10 != 6) {
                        if (i10 == 11 && (i12 = this.f1155l) < 4) {
                            this.f1155l = i12 + 1;
                            d();
                            n(i7, 300L);
                            return;
                        } else if ((i10 == 12 || i10 == 13) && (i11 = this.f1157n) < 2) {
                            this.f1157n = i11 + 1;
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
                    if (SystemClock.elapsedRealtime() - this.f1158o < 1000) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = this.f1156m + 1;
                    }
                    this.f1156m = i13;
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
        if (!this.f1153j && i7 != this.f1163t) {
            i2 i2Var = this.f1148g;
            boolean h = i2Var.h(i7);
            StringBuilder m10 = i5.c.m(i7, "session ", " onResults ");
            m10.append(i2.c(str));
            if (h) {
                str2 = "";
            } else {
                str2 = " (stale)";
            }
            p5.c.t(m10, str2, "Dictation");
            if (h) {
                if (!i2Var.h(i7)) {
                    StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                    m11.append(i2Var.f1242e);
                    m11.append(", open ");
                    m11.append(i2Var.f1243f);
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
                        ArrayList o10 = i2.o(i2Var.f1240b);
                        if (!o10.isEmpty() && i2.m(o4, o10, Math.min(3, o10.size()))) {
                            i2Var.f1240b = "";
                            i2Var.f1241c = trim;
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
                this.f1159p = SystemClock.elapsedRealtime();
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
                m10.append(i2Var.f1242e);
                m10.append(", open ");
                m10.append(i2Var.f1243f);
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
                r(this.f1161r);
            }
        }
    }

    public final boolean l() {
        y yVar;
        if (this.L && (yVar = this.v) != null && this.f1164u != null && yVar.d < this.f1164u.c() - 3200) {
            return true;
        }
        return false;
    }

    public final void m() {
        AudioRecord audioRecord;
        if (!this.f1144e && this.f1164u == null && !this.f1153j) {
            z zVar = this.J;
            if (zVar != null) {
                this.f1164u = zVar;
                zVar.f1632g = new u1(this, 0);
                this.f1167y = DictationAsr.P(u0.c(this.f1137a, this.f1141c), true);
                return;
            }
            android.support.v4.media.session.a0 P = DictationAsr.P(u0.c(this.f1137a, this.f1141c), true);
            this.f1167y = P;
            if (Build.VERSION.SDK_INT >= 33 || P != null) {
                z zVar2 = new z();
                this.f1164u = zVar2;
                u1 u1Var = new u1(this, 1);
                try {
                    audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 12800));
                    zVar2.f1630e = audioRecord;
                } catch (Exception e10) {
                    Log.e("Dictation", "audio capture", e10);
                    AudioRecord audioRecord2 = zVar2.f1630e;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    zVar2.f1630e = null;
                }
                if (audioRecord.getState() != 1) {
                    zVar2.f1630e.release();
                    zVar2.f1630e = null;
                    Log.d("Dictation", "own audio capture unavailable → the recogniser's microphone");
                    this.f1164u = null;
                    return;
                }
                zVar2.f1630e.startRecording();
                Thread thread = new Thread(new a1.e(11, zVar2, u1Var), "DictationAudio");
                zVar2.f1631f = thread;
                thread.start();
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
        this.f1167y = a0Var;
        DictationAsr.Y((t) a0Var.f1704b, new u() {
            @Override
            public final void a(boolean z10) {
                c2 c2Var = c2.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (!c2Var.f1153j && i10 == c2Var.C) {
                    if (!z10) {
                        c2Var.f("speech model download failed");
                        return;
                    }
                    w wVar = c2Var.A;
                    if (wVar != null) {
                        wVar.f1578l = true;
                    }
                    w wVar2 = new w(c2Var.f1164u, a0Var2, new r1(c2Var, i10, a0Var2, 0));
                    c2Var.A = wVar2;
                    new Thread(new a3.f(wVar2, 5), "DictationAsr").start();
                    if (c2Var.f1151i) {
                        c2Var.g();
                    }
                }
            }
        });
    }

    public final void p(String str) {
        t H;
        if (!this.f1153j && this.f1168z && this.f1164u != null && (H = DictationAsr.H(str)) != null) {
            this.D = false;
            this.f1146f.removeCallbacks(this.P);
            r(str);
            o(new android.support.v4.media.session.a0(H, str, this.f1160q, false, 7));
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
            z1 z1Var = (z1) obj;
            int i11 = z1Var.f1636a;
            int i12 = z1Var.f1636a;
            String str2 = z1Var.f1637b;
            if (i11 >= i7 && str.startsWith(str2, i11)) {
                sb2.append((CharSequence) str, i7, i12);
                sb2.append(z1Var.f1638c);
                i7 = str2.length() + i12;
            }
        }
        sb2.append((CharSequence) str, Math.min(i7, str.length()), str.length());
        return sb2.toString();
    }

    public final void r(String str) {
        if (str != null && !u0.d(str, this.K)) {
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
        char c10 = ' ';
        if (this.f1164u != null) {
            str2 = " (captured " + (this.f1164u.c() / 32) + " ms already)";
        } else {
            str2 = "";
        }
        p5.c.t(sb2, str2, "Dictation");
        boolean z11 = true;
        final int i12 = 1;
        Handler handler = this.f1146f;
        if (z10) {
            this.f1150h0 = SystemClock.elapsedRealtime();
            long j11 = 0;
            this.f1152i0 = 0L;
            handler.post(this.f1149g0);
            b(new org.telegram.messenger.j2(0), 500L);
            int i13 = 0;
            while (i13 < 5) {
                final int i14 = i13 + 1;
                String[] strArr = f1136k0[i13];
                String str5 = strArr[0];
                String str6 = strArr[i12];
                if (i13 == 0) {
                    j3 = j11;
                } else {
                    j3 = 140;
                }
                b(new m1(this, i14, 2), j3);
                if (i13 == 2) {
                    b(new o1(this, 6), 60L);
                }
                int i15 = 3;
                if (str5.equals("~")) {
                    b(new m1(this, i14, 3), 5000L);
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
                                    public final c2 f1392b;

                                    {
                                        this.f1392b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                c2 c2Var = this.f1392b;
                                                c2Var.getClass();
                                                c2Var.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var.k(i14, sb4);
                                                return;
                                            case 1:
                                                this.f1392b.j(i14, sb4);
                                                return;
                                            case 2:
                                                c2 c2Var2 = this.f1392b;
                                                c2Var2.getClass();
                                                c2Var2.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var2.k(i14, sb4);
                                                return;
                                            default:
                                                this.f1392b.k(i14, sb4);
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
                                    public final c2 f1392b;

                                    {
                                        this.f1392b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                c2 c2Var = this.f1392b;
                                                c2Var.getClass();
                                                c2Var.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var.k(i14, sb6);
                                                return;
                                            case 1:
                                                this.f1392b.j(i14, sb6);
                                                return;
                                            case 2:
                                                c2 c2Var2 = this.f1392b;
                                                c2Var2.getClass();
                                                c2Var2.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var2.k(i14, sb6);
                                                return;
                                            default:
                                                this.f1392b.k(i14, sb6);
                                                return;
                                        }
                                    }
                                }, length2);
                                i10 = 3;
                                b(new Runnable(this) {
                                    public final c2 f1392b;

                                    {
                                        this.f1392b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                c2 c2Var = this.f1392b;
                                                c2Var.getClass();
                                                c2Var.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var.k(i14, sb4);
                                                return;
                                            case 1:
                                                this.f1392b.j(i14, sb4);
                                                return;
                                            case 2:
                                                c2 c2Var2 = this.f1392b;
                                                c2Var2.getClass();
                                                c2Var2.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                                c2Var2.k(i14, sb4);
                                                return;
                                            default:
                                                this.f1392b.k(i14, sb4);
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
                        public final c2 f1392b;

                        {
                            this.f1392b = this;
                        }

                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    c2 c2Var = this.f1392b;
                                    c2Var.getClass();
                                    c2Var.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                    c2Var.k(i14, str3);
                                    return;
                                case 1:
                                    this.f1392b.j(i14, str3);
                                    return;
                                case 2:
                                    c2 c2Var2 = this.f1392b;
                                    c2Var2.getClass();
                                    c2Var2.f1147f0 = SystemClock.elapsedRealtime() + 400;
                                    c2Var2.k(i14, str3);
                                    return;
                                default:
                                    this.f1392b.k(i14, str3);
                                    return;
                            }
                        }
                    }, 900L);
                }
                i13 = i14;
                c10 = ' ';
                j11 = 0;
            }
            b(new o1(this, 0), 1300L);
            return;
        }
        if (this.f1164u == null) {
            m();
        }
        long j12 = this.f1141c;
        Context context = this.f1137a;
        this.f1160q = u0.c(context, j12);
        android.support.v4.media.session.a0 a0Var2 = this.f1167y;
        if (a0Var2 == null || this.f1164u == null) {
            z11 = false;
        }
        this.f1168z = z11;
        String str9 = null;
        if (z11) {
            boolean v = DictationAsr.v();
            this.D = v;
            if (v) {
                ExecutorService executorService = DictationLid.f43030a;
                if (DictationAsr.v()) {
                    DictationLid.d(context);
                }
                String string = mp.g1().getString("tinylid_lang", null);
                if (string != null) {
                    a0Var = DictationAsr.R(string, this.f1167y, false);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    this.f1167y = a0Var;
                }
                handler.postDelayed(this.P, 700L);
            } else {
                r(this.f1167y.i());
            }
            StringBuilder sb7 = new StringBuilder("tinyasr route: ");
            sb7.append(this.f1167y);
            sb7.append(" (candidates ");
            sb7.append(this.f1160q);
            sb7.append(", last sure ");
            ExecutorService executorService2 = DictationLid.f43030a;
            sb7.append(mp.g1().getString("tinylid_lang", null));
            sb7.append(")");
            Log.d("Dictation", sb7.toString());
            o(this.f1167y);
        } else if (a0Var2 != null) {
            f("microphone error");
        } else if (!DictationAsr.x()) {
            f("speech recognition unavailable");
        } else {
            if (this.f1164u != null) {
                DictationLid.k(context);
                handler.postDelayed(this.f1145e0, 700L);
            }
            Log.d("Dictation", "language candidates " + this.f1160q);
            if (!this.f1160q.isEmpty()) {
                str9 = (String) this.f1160q.get(0);
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
        if (!this.f1153j) {
            Context context = this.f1137a;
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
            int i7 = this.f1154k + 1;
            this.f1154k = i7;
            this.f1148g.b(i7);
            i2 i2Var = this.f1148g;
            if (this.f1164u != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 != this.T) {
                this.T = z10;
                this.f1146f.removeCallbacks(this.V);
                int i10 = this.R;
                if (z10) {
                    n10 = i2Var.f1239a.toString();
                } else {
                    n10 = i2Var.n();
                }
                this.R = Math.max(i10, n10.length());
            }
            this.f1158o = SystemClock.elapsedRealtime();
            StringBuilder m10 = i5.c.m(i7, "session ", " start lang=");
            int i11 = this.f1157n;
            String str3 = "en-US";
            if (i11 == 0) {
                str = this.f1161r;
            } else if (i11 == 2) {
                str = "en-US";
            } else {
                str = null;
            }
            m10.append(str);
            if (this.f1159p > 0) {
                str2 = a8.p0.r(new StringBuilder(" gap="), this.f1158o - this.f1159p, "ms");
            } else {
                str2 = "";
            }
            p5.c.t(m10, str2, "Dictation");
            this.h.setRecognitionListener(new b2(this, i7));
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            int i12 = this.f1157n;
            if (i12 == 0) {
                str3 = this.f1161r;
            } else if (i12 != 2) {
                str3 = null;
            }
            if (str3 != null) {
                intent.putExtra("android.speech.extra.LANGUAGE", str3);
            }
            intent.putExtra("android.speech.extra.PREFER_OFFLINE", false);
            intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
            if (this.M != null && this.f1157n == 0 && Build.VERSION.SDK_INT >= 34) {
                intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION", true);
                intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_DETECTION_ALLOWED_LANGUAGES", this.M);
                intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_SWITCH", "balanced");
                intent.putStringArrayListExtra("android.speech.extra.LANGUAGE_SWITCH_ALLOWED_LANGUAGES", this.M);
            }
            if (this.f1164u != null) {
                int i13 = this.f1166x;
                if (i13 < 0) {
                    y yVar2 = this.v;
                    if (yVar2 != null) {
                        i13 = yVar2.d;
                    } else {
                        i13 = 0;
                    }
                }
                this.f1166x = -1;
                y yVar3 = this.v;
                if (yVar3 != null) {
                    yVar3.a();
                }
                z zVar = this.f1164u;
                zVar.getClass();
                try {
                    yVar = new y(zVar, Math.max(0, Math.min(i13, zVar.c())), 48000, 64);
                } catch (Exception e11) {
                    Log.e("Dictation", "feed", e11);
                }
                this.v = yVar;
                this.f1165w = i13;
                if (yVar != null) {
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE", yVar.f1615a);
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE_CHANNEL_COUNT", 1);
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE_ENCODING", 2);
                    intent.putExtra("android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE", 16000);
                    Log.d("Dictation", "session " + this.f1154k + " audio from " + ((i13 * 1000) / 32000) + " ms (captured " + ((this.f1164u.c() * 1000) / 32000) + " ms)");
                }
            }
            if (this.f1164u == null) {
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
        if (this.f1153j) {
            return;
        }
        this.f1151i = true;
        Log.d("Dictation", "stop requested (session " + this.f1154k + ")");
        boolean z10 = this.f1144e;
        Handler handler = this.f1146f;
        i2 i2Var = this.f1148g;
        if (z10) {
            handler.removeCallbacksAndMessages(null);
            i2Var.g(this.f1154k, "stop");
            e();
            handler.postDelayed(new o1(this, 2), 350L);
        } else if (this.f1168z) {
            if (this.D && !this.F && !this.G && DictationLid.f() && (zVar = this.f1164u) != null) {
                this.G = true;
                int i7 = this.C;
                zVar.d();
                z zVar2 = this.f1164u;
                DictationLid.j(zVar2.b(0, zVar2.c()), 500, new s1(this, i7, 0));
                return;
            }
            g();
        } else if (i2Var.f1240b.isEmpty() && i2Var.f1241c.isEmpty()) {
            Log.d("Dictation", "stop: current session is empty → finish now");
            i2Var.g(this.f1154k, "stop-empty");
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
        this.f1157n = 0;
        this.f1161r = str;
        Log.d("Dictation", p5.c.l("language ", str, " (", str2, ")"));
    }
}
