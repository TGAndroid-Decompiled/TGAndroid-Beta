package ai;

import android.content.Context;
import android.media.AudioRecord;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.mp;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class w1 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final u1 A;
    public long B;
    public final u1 C;
    public long D;
    public long E;
    public final Context f1564a;
    public final long f1565b;
    public final v1 f1566c;
    public final boolean d;
    public final Handler f1567e = new Handler(Looper.getMainLooper());
    public final c2 f1568f;
    public boolean f1569g;
    public boolean h;
    public int f1570i;
    public ArrayList f1571j;
    public v f1572k;
    public android.support.v4.media.session.a0 f1573l;
    public boolean f1574m;
    public t f1575n;
    public String f1576o;
    public int f1577p;
    public boolean f1578q;
    public boolean f1579r;
    public boolean f1580s;
    public boolean f1581t;
    public int f1582u;
    public int v;
    public v f1583w;
    public String f1584x;
    public int f1585y;
    public int f1586z;

    public w1(Context context, int i7, long j3, boolean z10, v1 v1Var) {
        c2 c2Var = new c2();
        this.f1568f = c2Var;
        this.f1571j = new ArrayList();
        this.f1576o = "";
        this.A = new u1(this, 0);
        this.C = new u1(this, 1);
        this.f1564a = context.getApplicationContext();
        this.f1565b = j3;
        this.d = z10;
        this.f1566c = v1Var;
        c2Var.f1155g = new a3.l(13);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        android.support.v4.media.session.a0 a0Var = this.f1573l;
        q[] qVarArr = DictationAsr.f43143a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = (List) a0Var.d;
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.L(str, a0Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j3) {
        this.E += j3;
        this.f1567e.postAtTime(new a1.e(17, this, runnable), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.f1567e.removeCallbacksAndMessages(null);
        t tVar = this.f1575n;
        if (tVar != null) {
            tVar.f1532l = true;
        }
        v vVar = this.f1572k;
        if (vVar != null) {
            vVar.d();
            this.f1572k = null;
        }
    }

    public final void d(String str) {
        String m10;
        if (this.h) {
            return;
        }
        this.h = true;
        this.f1567e.removeCallbacksAndMessages(null);
        t tVar = this.f1575n;
        if (tVar != null) {
            tVar.f1532l = true;
        }
        v vVar = this.f1572k;
        if (vVar != null) {
            vVar.d();
            this.f1572k = null;
        }
        if (this.f1574m) {
            m10 = this.f1576o;
        } else {
            m10 = this.f1568f.m();
        }
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.f1570i);
        u10.append(" chars=");
        u10.append(m10.length());
        Log.d("Dictation", u10.toString());
        this.f1566c.a(m10, str);
    }

    public final void e() {
        t tVar = this.f1575n;
        if (tVar == null) {
            v vVar = this.f1572k;
            if (vVar != null) {
                vVar.d();
                return;
            }
            return;
        }
        tVar.f1535o = new k1(this, 2);
        tVar.f1531k = true;
    }

    public final void f(int i7, String str) {
        String str2;
        String trim;
        boolean z10;
        if (!this.h) {
            c2 c2Var = this.f1568f;
            boolean g10 = c2Var.g(i7);
            StringBuilder m10 = i5.c.m(i7, "session ", " final ");
            m10.append(c2.b(str));
            if (g10) {
                str2 = "";
            } else {
                str2 = " (stale)";
            }
            p5.c.t(m10, str2, "Dictation");
            if (g10) {
                if (!c2Var.g(i7)) {
                    StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                    m11.append(c2Var.f1153e);
                    m11.append(", open ");
                    m11.append(c2Var.f1154f);
                    m11.append("): ");
                    m11.append(c2.b(str));
                    c2Var.i(m11.toString());
                    z10 = false;
                } else {
                    String m12 = c2Var.m();
                    if (str == null) {
                        trim = "";
                    } else {
                        trim = str.trim();
                    }
                    if (!trim.isEmpty()) {
                        ArrayList n10 = c2.n(trim);
                        ArrayList n11 = c2.n(c2Var.f1151b);
                        if (!n11.isEmpty() && c2.l(n10, n11, Math.min(3, n11.size()))) {
                            c2Var.f1151b = "";
                            c2Var.f1152c = trim;
                        } else {
                            c2Var.a(trim, c2Var.d);
                        }
                    }
                    c2Var.c("final");
                    z10 = !m12.equals(c2Var.m());
                }
                if (z10) {
                    this.f1566c.r(c2Var.m());
                }
                if (this.f1569g) {
                    d(null);
                }
            }
        }
    }

    public final void g(int i7, String str) {
        if (!this.h) {
            c2 c2Var = this.f1568f;
            boolean z10 = false;
            if (!c2Var.g(i7)) {
                StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
                m10.append(c2Var.f1153e);
                m10.append(", open ");
                m10.append(c2Var.f1154f);
                m10.append("): ");
                m10.append(c2.b(str));
                c2Var.i(m10.toString());
            } else if (str != null) {
                String m11 = c2Var.m();
                String trim = str.trim();
                if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                    z10 = true;
                }
                c2Var.a(trim, z10);
                z10 = !m11.equals(c2Var.m());
            }
            if (z10 && !this.f1569g) {
                this.f1566c.r(c2Var.m());
            }
        }
    }

    public final void h() {
        AudioRecord audioRecord;
        if (!this.d && this.f1572k == null && !this.h) {
            v vVar = this.f1583w;
            if (vVar != null) {
                this.f1572k = vVar;
                vVar.f1557g = new q1(this, 0);
                this.f1573l = DictationAsr.W(s0.c(this.f1564a, this.f1565b));
                return;
            }
            android.support.v4.media.session.a0 W = DictationAsr.W(s0.c(this.f1564a, this.f1565b));
            this.f1573l = W;
            if (W != null) {
                v vVar2 = new v();
                this.f1572k = vVar2;
                q1 q1Var = new q1(this, 1);
                try {
                    audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 12800));
                    vVar2.f1555e = audioRecord;
                } catch (Exception e10) {
                    Log.e("Dictation", "audio capture", e10);
                    AudioRecord audioRecord2 = vVar2.f1555e;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    vVar2.f1555e = null;
                }
                if (audioRecord.getState() != 1) {
                    vVar2.f1555e.release();
                    vVar2.f1555e = null;
                    Log.d("Dictation", "own audio capture unavailable");
                    this.f1572k = null;
                    return;
                }
                vVar2.f1555e.startRecording();
                Thread thread = new Thread(new a1.e(11, vVar2, q1Var), "DictationAudio");
                vVar2.f1556f = thread;
                thread.start();
            }
        }
    }

    public final void i(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.f1577p + 1;
        this.f1577p = i7;
        this.f1573l = a0Var;
        DictationAsr.i0((q) a0Var.f1676b, false, new r() {
            @Override
            public final void a(boolean z10) {
                w1 w1Var = w1.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (!w1Var.h && i10 == w1Var.f1577p) {
                    if (!z10) {
                        w1Var.d("speech model download failed");
                        return;
                    }
                    t tVar = w1Var.f1575n;
                    if (tVar != null) {
                        tVar.f1532l = true;
                    }
                    t tVar2 = new t(w1Var.f1572k, a0Var2, new o1(w1Var, i10, a0Var2, 0));
                    w1Var.f1575n = tVar2;
                    new Thread(new a3.f(tVar2, 5), "DictationAsr").start();
                    if (w1Var.f1569g) {
                        w1Var.e();
                    }
                }
            }
        });
    }

    public final void j(String str) {
        q M;
        if (!this.h && this.f1574m && this.f1572k != null && (M = DictationAsr.M(str)) != null) {
            this.f1578q = false;
            this.f1567e.removeCallbacks(this.A);
            k(str);
            i(new android.support.v4.media.session.a0(M, str, this.f1571j, false, 7));
        }
    }

    public final void k(String str) {
        boolean equals;
        if (str != null) {
            String str2 = this.f1584x;
            HashMap hashMap = s0.f1519a;
            if (str2 == null) {
                equals = false;
            } else {
                equals = Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage());
            }
            if (!equals) {
                this.f1584x = str;
                this.f1566c.P(str);
            }
        }
    }

    public final void l() {
        String str;
        String str2;
        android.support.v4.media.session.a0 a0Var;
        long j3;
        int i7;
        int i10;
        long j10;
        String str3;
        char c10;
        int i11;
        StringBuilder sb2 = new StringBuilder("start ");
        boolean z10 = this.d;
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
        if (this.f1572k != null) {
            str2 = " (captured " + (this.f1572k.c() / 32) + " ms already)";
        } else {
            str2 = "";
        }
        p5.c.t(sb2, str2, "Dictation");
        final int i12 = 0;
        Handler handler = this.f1567e;
        final int i13 = 1;
        if (z10) {
            this.D = SystemClock.elapsedRealtime();
            long j11 = 0;
            this.E = 0L;
            handler.post(this.C);
            b(new org.telegram.messenger.j2(0), 500L);
            int i14 = 0;
            while (i14 < 5) {
                final int i15 = i14 + 1;
                String[] strArr = G[i14];
                String str4 = strArr[i12];
                final String str5 = strArr[i13];
                if (i14 == 0) {
                    j3 = j11;
                } else {
                    j3 = 140;
                }
                b(new Runnable(this) {
                    public final w1 f1508b;

                    {
                        this.f1508b = this;
                    }

                    @Override
                    public final void run() {
                        boolean z11;
                        String str6;
                        switch (i12) {
                            case 0:
                                w1 w1Var = this.f1508b;
                                int i16 = i15;
                                w1Var.f1570i = i16;
                                c2 c2Var = w1Var.f1568f;
                                if (c2Var.f1154f) {
                                    c2Var.c("superseded");
                                }
                                c2Var.f1153e = i16;
                                c2Var.f1154f = true;
                                c2Var.f1151b = "";
                                c2Var.f1152c = "";
                                c2Var.d = false;
                                c2Var.i("session " + i16 + " begin");
                                Log.d("Dictation", "session " + i16 + " start (simulated)");
                                return;
                            default:
                                w1 w1Var2 = this.f1508b;
                                c2 c2Var2 = w1Var2.f1568f;
                                if (!w1Var2.h) {
                                    int i17 = i15;
                                    if (!c2Var2.g(i17) && i17 != w1Var2.f1570i) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    StringBuilder m10 = i5.c.m(i17, "session ", " no match");
                                    if (z11) {
                                        str6 = "";
                                    } else {
                                        str6 = " (stale, ignored)";
                                    }
                                    p5.c.t(m10, str6, "Dictation");
                                    if (z11) {
                                        c2Var2.f(i17, "no match");
                                        w1Var2.f1566c.r(c2Var2.m());
                                        if (w1Var2.f1569g) {
                                            w1Var2.d(null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, j3);
                char c12 = 2;
                if (i14 == 2) {
                    b(new k1(this, 3), 60L);
                }
                if (str4.equals("~")) {
                    b(new Runnable(this) {
                        public final w1 f1508b;

                        {
                            this.f1508b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z11;
                            String str6;
                            switch (i13) {
                                case 0:
                                    w1 w1Var = this.f1508b;
                                    int i16 = i15;
                                    w1Var.f1570i = i16;
                                    c2 c2Var = w1Var.f1568f;
                                    if (c2Var.f1154f) {
                                        c2Var.c("superseded");
                                    }
                                    c2Var.f1153e = i16;
                                    c2Var.f1154f = true;
                                    c2Var.f1151b = "";
                                    c2Var.f1152c = "";
                                    c2Var.d = false;
                                    c2Var.i("session " + i16 + " begin");
                                    Log.d("Dictation", "session " + i16 + " start (simulated)");
                                    return;
                                default:
                                    w1 w1Var2 = this.f1508b;
                                    c2 c2Var2 = w1Var2.f1568f;
                                    if (!w1Var2.h) {
                                        int i17 = i15;
                                        if (!c2Var2.g(i17) && i17 != w1Var2.f1570i) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        StringBuilder m10 = i5.c.m(i17, "session ", " no match");
                                        if (z11) {
                                            str6 = "";
                                        } else {
                                            str6 = " (stale, ignored)";
                                        }
                                        p5.c.t(m10, str6, "Dictation");
                                        if (z11) {
                                            c2Var2.f(i17, "no match");
                                            w1Var2.f1566c.r(c2Var2.m());
                                            if (w1Var2.f1569g) {
                                                w1Var2.d(null);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                            }
                        }
                    }, 5000L);
                    i7 = i13;
                } else {
                    String[] split = str4.split(" \\| ");
                    int length = split.length;
                    int i16 = i12;
                    while (i16 < length) {
                        String[] split2 = split[i16].split(" ");
                        StringBuilder sb3 = new StringBuilder();
                        int i17 = i12;
                        while (i17 < split2.length) {
                            if (i17 > 0) {
                                sb3.append(c11);
                            }
                            sb3.append(split2[i17]);
                            final String sb4 = sb3.toString();
                            if (i14 == 3) {
                                if (split2[i17].equals("now")) {
                                    i11 = 300;
                                } else if (split2[i17].equals("text")) {
                                    i11 = 800;
                                } else if (split2[i17].equals("word")) {
                                    i11 = 1100;
                                } else if (split2[i17].equals("pause")) {
                                    i11 = 1500;
                                } else {
                                    i11 = i12;
                                }
                                i10 = i17;
                                j10 = i11;
                            } else {
                                i10 = i17;
                                j10 = 0;
                            }
                            int i18 = i14;
                            long length2 = (split2[i10].length() * 24) + j10 + 170 + ((long) (Math.random() * 60.0d));
                            if (!split2[i10].equals("feature") && !split2[i10].equals("office")) {
                                b(new Runnable(this) {
                                    public final w1 f1365b;

                                    {
                                        this.f1365b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                this.f1365b.f(i15, sb4);
                                                return;
                                            case 1:
                                                w1 w1Var = this.f1365b;
                                                w1Var.getClass();
                                                w1Var.B = SystemClock.elapsedRealtime() + 400;
                                                w1Var.g(i15, sb4);
                                                return;
                                            case 2:
                                                this.f1365b.g(i15, sb4);
                                                return;
                                            default:
                                                w1 w1Var2 = this.f1365b;
                                                w1Var2.getClass();
                                                w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                                w1Var2.g(i15, sb4);
                                                return;
                                        }
                                    }
                                }, length2);
                                c10 = 2;
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(sb4.substring(0, sb4.length() - split2[i10].length()));
                                if (split2[i10].equals("feature")) {
                                    str3 = "feet";
                                } else {
                                    str3 = "offers";
                                }
                                sb5.append(str3);
                                final String sb6 = sb5.toString();
                                b(new Runnable(this) {
                                    public final w1 f1365b;

                                    {
                                        this.f1365b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                this.f1365b.f(i15, sb6);
                                                return;
                                            case 1:
                                                w1 w1Var = this.f1365b;
                                                w1Var.getClass();
                                                w1Var.B = SystemClock.elapsedRealtime() + 400;
                                                w1Var.g(i15, sb6);
                                                return;
                                            case 2:
                                                this.f1365b.g(i15, sb6);
                                                return;
                                            default:
                                                w1 w1Var2 = this.f1365b;
                                                w1Var2.getClass();
                                                w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                                w1Var2.g(i15, sb6);
                                                return;
                                        }
                                    }
                                }, length2);
                                c10 = 2;
                                b(new Runnable(this) {
                                    public final w1 f1365b;

                                    {
                                        this.f1365b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                this.f1365b.f(i15, sb4);
                                                return;
                                            case 1:
                                                w1 w1Var = this.f1365b;
                                                w1Var.getClass();
                                                w1Var.B = SystemClock.elapsedRealtime() + 400;
                                                w1Var.g(i15, sb4);
                                                return;
                                            case 2:
                                                this.f1365b.g(i15, sb4);
                                                return;
                                            default:
                                                w1 w1Var2 = this.f1365b;
                                                w1Var2.getClass();
                                                w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                                w1Var2.g(i15, sb4);
                                                return;
                                        }
                                    }
                                }, 180L);
                            }
                            i17 = i10 + 1;
                            c12 = c10;
                            i14 = i18;
                            i12 = 0;
                            c11 = ' ';
                        }
                        b(new org.telegram.messenger.j2(0), 650L);
                        i16++;
                        i14 = i14;
                        i12 = 0;
                        c11 = ' ';
                    }
                    i7 = 1;
                    if (str5.startsWith("!")) {
                        str5 = str5.substring(1);
                    }
                    b(new Runnable(this) {
                        public final w1 f1365b;

                        {
                            this.f1365b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f1365b.f(i15, str5);
                                    return;
                                case 1:
                                    w1 w1Var = this.f1365b;
                                    w1Var.getClass();
                                    w1Var.B = SystemClock.elapsedRealtime() + 400;
                                    w1Var.g(i15, str5);
                                    return;
                                case 2:
                                    this.f1365b.g(i15, str5);
                                    return;
                                default:
                                    w1 w1Var2 = this.f1365b;
                                    w1Var2.getClass();
                                    w1Var2.B = SystemClock.elapsedRealtime() + 400;
                                    w1Var2.g(i15, str5);
                                    return;
                            }
                        }
                    }, 900L);
                }
                i14 = i15;
                i13 = i7;
                i12 = 0;
                c11 = ' ';
                j11 = 0;
            }
            b(new k1(this, i13), 1300L);
            return;
        }
        if (this.f1572k == null) {
            h();
        }
        long j12 = this.f1565b;
        Context context = this.f1564a;
        this.f1571j = s0.c(context, j12);
        if (this.f1573l == null) {
            d("speech recognition unavailable");
        } else if (this.f1572k == null) {
            d("microphone error");
        } else {
            this.f1574m = true;
            boolean z11 = DictationAsr.z();
            this.f1578q = z11;
            if (z11) {
                ExecutorService executorService = DictationLid.f43150a;
                if (DictationAsr.z()) {
                    DictationLid.d(context);
                }
                String string = mp.g1().getString("tinylid_lang", null);
                if (string != null) {
                    a0Var = DictationAsr.Y(string, this.f1573l, false);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    this.f1573l = a0Var;
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.f1573l.i());
            }
            StringBuilder sb7 = new StringBuilder("tinyasr route: ");
            sb7.append(this.f1573l);
            sb7.append(" (candidates ");
            sb7.append(this.f1571j);
            sb7.append(", last sure ");
            ExecutorService executorService2 = DictationLid.f43150a;
            sb7.append(mp.g1().getString("tinylid_lang", null));
            sb7.append(")");
            Log.d("Dictation", sb7.toString());
            i(this.f1573l);
        }
    }

    public final void m() {
        v vVar;
        if (this.h) {
            return;
        }
        this.f1569g = true;
        Log.d("Dictation", "stop requested (session " + this.f1570i + ")");
        if (this.d) {
            Handler handler = this.f1567e;
            handler.removeCallbacksAndMessages(null);
            this.f1568f.f(this.f1570i, "stop");
            this.f1566c.r(this.f1568f.m());
            handler.postDelayed(new k1(this, 0), 350L);
        } else if (this.f1574m) {
            if (this.f1578q && !this.f1580s && !this.f1581t && DictationLid.f43152c != 0 && (vVar = this.f1572k) != null) {
                this.f1581t = true;
                int i7 = this.f1577p;
                vVar.d();
                v vVar2 = this.f1572k;
                DictationLid.h(500, new n1(this, i7, 0), a(), vVar2.b(0, vVar2.c()));
                return;
            }
            e();
        } else {
            d(null);
        }
    }
}
