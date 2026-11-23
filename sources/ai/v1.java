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
import org.telegram.messenger.np;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class v1 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final t1 A;
    public long B;
    public final t1 C;
    public long D;
    public long E;
    public final Context f1552a;
    public final long f1553b;
    public final u1 f1554c;
    public final boolean d;
    public final Handler f1555e = new Handler(Looper.getMainLooper());
    public final b2 f1556f;
    public boolean f1557g;
    public boolean h;
    public int f1558i;
    public ArrayList f1559j;
    public u f1560k;
    public android.support.v4.media.session.a0 f1561l;
    public boolean f1562m;
    public s f1563n;
    public String f1564o;
    public int f1565p;
    public boolean f1566q;
    public boolean f1567r;
    public boolean f1568s;
    public boolean f1569t;
    public int f1570u;
    public int v;
    public u f1571w;
    public String f1572x;
    public int f1573y;
    public int f1574z;

    public v1(Context context, int i7, long j3, boolean z10, u1 u1Var) {
        b2 b2Var = new b2();
        this.f1556f = b2Var;
        this.f1559j = new ArrayList();
        this.f1564o = "";
        this.A = new t1(this, 0);
        this.C = new t1(this, 1);
        this.f1552a = context.getApplicationContext();
        this.f1553b = j3;
        this.d = z10;
        this.f1554c = u1Var;
        b2Var.f1141g = new a3.l(13);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        android.support.v4.media.session.a0 a0Var = this.f1561l;
        p[] pVarArr = DictationAsr.f43033a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List list = (List) a0Var.d;
        if (list != null) {
            linkedHashSet.addAll(list);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.H(str, a0Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j3) {
        this.E += j3;
        this.f1555e.postAtTime(new a1.e(15, this, runnable), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.f1555e.removeCallbacksAndMessages(null);
        s sVar = this.f1563n;
        if (sVar != null) {
            sVar.f1520l = true;
        }
        u uVar = this.f1560k;
        if (uVar != null) {
            uVar.d();
            this.f1560k = null;
        }
    }

    public final void d(String str) {
        String m10;
        if (this.h) {
            return;
        }
        this.h = true;
        this.f1555e.removeCallbacksAndMessages(null);
        s sVar = this.f1563n;
        if (sVar != null) {
            sVar.f1520l = true;
        }
        u uVar = this.f1560k;
        if (uVar != null) {
            uVar.d();
            this.f1560k = null;
        }
        if (this.f1562m) {
            m10 = this.f1564o;
        } else {
            m10 = this.f1556f.m();
        }
        StringBuilder u10 = a8.p0.u("finish error=", str, " sessions=");
        u10.append(this.f1558i);
        u10.append(" chars=");
        u10.append(m10.length());
        Log.d("Dictation", u10.toString());
        this.f1554c.a(m10, str);
    }

    public final void e() {
        s sVar = this.f1563n;
        if (sVar == null) {
            u uVar = this.f1560k;
            if (uVar != null) {
                uVar.d();
                return;
            }
            return;
        }
        sVar.f1523o = new j1(this, 2);
        sVar.f1519k = true;
    }

    public final void f(int i7, String str) {
        String str2;
        String trim;
        boolean z10;
        if (!this.h) {
            b2 b2Var = this.f1556f;
            boolean g10 = b2Var.g(i7);
            StringBuilder m10 = i5.c.m(i7, "session ", " final ");
            m10.append(b2.b(str));
            if (g10) {
                str2 = "";
            } else {
                str2 = " (stale)";
            }
            p5.c.t(m10, str2, "Dictation");
            if (g10) {
                if (!b2Var.g(i7)) {
                    StringBuilder m11 = i5.c.m(i7, "session ", " STALE final ignored (current ");
                    m11.append(b2Var.f1139e);
                    m11.append(", open ");
                    m11.append(b2Var.f1140f);
                    m11.append("): ");
                    m11.append(b2.b(str));
                    b2Var.i(m11.toString());
                    z10 = false;
                } else {
                    String m12 = b2Var.m();
                    if (str == null) {
                        trim = "";
                    } else {
                        trim = str.trim();
                    }
                    if (!trim.isEmpty()) {
                        ArrayList n10 = b2.n(trim);
                        ArrayList n11 = b2.n(b2Var.f1137b);
                        if (!n11.isEmpty() && b2.l(n10, n11, Math.min(3, n11.size()))) {
                            b2Var.f1137b = "";
                            b2Var.f1138c = trim;
                        } else {
                            b2Var.a(trim, b2Var.d);
                        }
                    }
                    b2Var.c("final");
                    z10 = !m12.equals(b2Var.m());
                }
                if (z10) {
                    this.f1554c.i(b2Var.m());
                }
                if (this.f1557g) {
                    d(null);
                }
            }
        }
    }

    public final void g(int i7, String str) {
        if (!this.h) {
            b2 b2Var = this.f1556f;
            boolean z10 = false;
            if (!b2Var.g(i7)) {
                StringBuilder m10 = i5.c.m(i7, "session ", " STALE partial ignored (current ");
                m10.append(b2Var.f1139e);
                m10.append(", open ");
                m10.append(b2Var.f1140f);
                m10.append("): ");
                m10.append(b2.b(str));
                b2Var.i(m10.toString());
            } else if (str != null) {
                String m11 = b2Var.m();
                String trim = str.trim();
                if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                    z10 = true;
                }
                b2Var.a(trim, z10);
                z10 = !m11.equals(b2Var.m());
            }
            if (z10 && !this.f1557g) {
                this.f1554c.i(b2Var.m());
            }
        }
    }

    public final void h() {
        AudioRecord audioRecord;
        if (!this.d && this.f1560k == null && !this.h) {
            u uVar = this.f1571w;
            if (uVar != null) {
                this.f1560k = uVar;
                uVar.f1545g = new p1(this, 0);
                this.f1561l = DictationAsr.S(r0.c(this.f1552a, this.f1553b));
                return;
            }
            android.support.v4.media.session.a0 S = DictationAsr.S(r0.c(this.f1552a, this.f1553b));
            this.f1561l = S;
            if (S != null) {
                u uVar2 = new u();
                this.f1560k = uVar2;
                p1 p1Var = new p1(this, 1);
                try {
                    audioRecord = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 12800));
                    uVar2.f1543e = audioRecord;
                } catch (Exception e10) {
                    Log.e("Dictation", "audio capture", e10);
                    AudioRecord audioRecord2 = uVar2.f1543e;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    uVar2.f1543e = null;
                }
                if (audioRecord.getState() != 1) {
                    uVar2.f1543e.release();
                    uVar2.f1543e = null;
                    Log.d("Dictation", "own audio capture unavailable");
                    this.f1560k = null;
                    return;
                }
                uVar2.f1543e.startRecording();
                Thread thread = new Thread(new a1.e(9, uVar2, p1Var), "DictationAudio");
                uVar2.f1544f = thread;
                thread.start();
            }
        }
    }

    public final void i(final android.support.v4.media.session.a0 a0Var) {
        final int i7 = this.f1565p + 1;
        this.f1565p = i7;
        this.f1561l = a0Var;
        DictationAsr.e0((p) a0Var.f1675b, new q() {
            @Override
            public final void a(boolean z10) {
                v1 v1Var = v1.this;
                int i10 = i7;
                android.support.v4.media.session.a0 a0Var2 = a0Var;
                if (!v1Var.h && i10 == v1Var.f1565p) {
                    if (!z10) {
                        v1Var.d("speech model download failed");
                        return;
                    }
                    s sVar = v1Var.f1563n;
                    if (sVar != null) {
                        sVar.f1520l = true;
                    }
                    s sVar2 = new s(v1Var.f1560k, a0Var2, new n1(v1Var, i10, a0Var2, 0));
                    v1Var.f1563n = sVar2;
                    new Thread(new a3.f(sVar2, 5), "DictationAsr").start();
                    if (v1Var.f1557g) {
                        v1Var.e();
                    }
                }
            }
        });
    }

    public final void j(String str) {
        p I;
        if (!this.h && this.f1562m && this.f1560k != null && (I = DictationAsr.I(str)) != null) {
            this.f1566q = false;
            this.f1555e.removeCallbacks(this.A);
            k(str);
            i(new android.support.v4.media.session.a0(I, str, this.f1559j, false, 7));
        }
    }

    public final void k(String str) {
        boolean equals;
        if (str != null) {
            String str2 = this.f1572x;
            HashMap hashMap = r0.f1507a;
            if (str2 == null) {
                equals = false;
            } else {
                equals = Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage());
            }
            if (!equals) {
                this.f1572x = str;
                this.f1554c.x(str);
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
        if (this.f1560k != null) {
            str2 = " (captured " + (this.f1560k.c() / 32) + " ms already)";
        } else {
            str2 = "";
        }
        p5.c.t(sb2, str2, "Dictation");
        final int i12 = 0;
        Handler handler = this.f1555e;
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
                    public final v1 f1496b;

                    {
                        this.f1496b = this;
                    }

                    @Override
                    public final void run() {
                        boolean z11;
                        String str6;
                        switch (i12) {
                            case 0:
                                v1 v1Var = this.f1496b;
                                int i16 = i15;
                                v1Var.f1558i = i16;
                                b2 b2Var = v1Var.f1556f;
                                if (b2Var.f1140f) {
                                    b2Var.c("superseded");
                                }
                                b2Var.f1139e = i16;
                                b2Var.f1140f = true;
                                b2Var.f1137b = "";
                                b2Var.f1138c = "";
                                b2Var.d = false;
                                b2Var.i("session " + i16 + " begin");
                                Log.d("Dictation", "session " + i16 + " start (simulated)");
                                return;
                            default:
                                v1 v1Var2 = this.f1496b;
                                b2 b2Var2 = v1Var2.f1556f;
                                if (!v1Var2.h) {
                                    int i17 = i15;
                                    if (!b2Var2.g(i17) && i17 != v1Var2.f1558i) {
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
                                        b2Var2.f(i17, "no match");
                                        v1Var2.f1554c.i(b2Var2.m());
                                        if (v1Var2.f1557g) {
                                            v1Var2.d(null);
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
                    b(new j1(this, 3), 60L);
                }
                if (str4.equals("~")) {
                    b(new Runnable(this) {
                        public final v1 f1496b;

                        {
                            this.f1496b = this;
                        }

                        @Override
                        public final void run() {
                            boolean z11;
                            String str6;
                            switch (i13) {
                                case 0:
                                    v1 v1Var = this.f1496b;
                                    int i16 = i15;
                                    v1Var.f1558i = i16;
                                    b2 b2Var = v1Var.f1556f;
                                    if (b2Var.f1140f) {
                                        b2Var.c("superseded");
                                    }
                                    b2Var.f1139e = i16;
                                    b2Var.f1140f = true;
                                    b2Var.f1137b = "";
                                    b2Var.f1138c = "";
                                    b2Var.d = false;
                                    b2Var.i("session " + i16 + " begin");
                                    Log.d("Dictation", "session " + i16 + " start (simulated)");
                                    return;
                                default:
                                    v1 v1Var2 = this.f1496b;
                                    b2 b2Var2 = v1Var2.f1556f;
                                    if (!v1Var2.h) {
                                        int i17 = i15;
                                        if (!b2Var2.g(i17) && i17 != v1Var2.f1558i) {
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
                                            b2Var2.f(i17, "no match");
                                            v1Var2.f1554c.i(b2Var2.m());
                                            if (v1Var2.f1557g) {
                                                v1Var2.d(null);
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
                                    public final v1 f1350b;

                                    {
                                        this.f1350b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                this.f1350b.f(i15, sb4);
                                                return;
                                            case 1:
                                                v1 v1Var = this.f1350b;
                                                v1Var.getClass();
                                                v1Var.B = SystemClock.elapsedRealtime() + 400;
                                                v1Var.g(i15, sb4);
                                                return;
                                            case 2:
                                                this.f1350b.g(i15, sb4);
                                                return;
                                            default:
                                                v1 v1Var2 = this.f1350b;
                                                v1Var2.getClass();
                                                v1Var2.B = SystemClock.elapsedRealtime() + 400;
                                                v1Var2.g(i15, sb4);
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
                                    public final v1 f1350b;

                                    {
                                        this.f1350b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                this.f1350b.f(i15, sb6);
                                                return;
                                            case 1:
                                                v1 v1Var = this.f1350b;
                                                v1Var.getClass();
                                                v1Var.B = SystemClock.elapsedRealtime() + 400;
                                                v1Var.g(i15, sb6);
                                                return;
                                            case 2:
                                                this.f1350b.g(i15, sb6);
                                                return;
                                            default:
                                                v1 v1Var2 = this.f1350b;
                                                v1Var2.getClass();
                                                v1Var2.B = SystemClock.elapsedRealtime() + 400;
                                                v1Var2.g(i15, sb6);
                                                return;
                                        }
                                    }
                                }, length2);
                                c10 = 2;
                                b(new Runnable(this) {
                                    public final v1 f1350b;

                                    {
                                        this.f1350b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (r4) {
                                            case 0:
                                                this.f1350b.f(i15, sb4);
                                                return;
                                            case 1:
                                                v1 v1Var = this.f1350b;
                                                v1Var.getClass();
                                                v1Var.B = SystemClock.elapsedRealtime() + 400;
                                                v1Var.g(i15, sb4);
                                                return;
                                            case 2:
                                                this.f1350b.g(i15, sb4);
                                                return;
                                            default:
                                                v1 v1Var2 = this.f1350b;
                                                v1Var2.getClass();
                                                v1Var2.B = SystemClock.elapsedRealtime() + 400;
                                                v1Var2.g(i15, sb4);
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
                        public final v1 f1350b;

                        {
                            this.f1350b = this;
                        }

                        @Override
                        public final void run() {
                            switch (r4) {
                                case 0:
                                    this.f1350b.f(i15, str5);
                                    return;
                                case 1:
                                    v1 v1Var = this.f1350b;
                                    v1Var.getClass();
                                    v1Var.B = SystemClock.elapsedRealtime() + 400;
                                    v1Var.g(i15, str5);
                                    return;
                                case 2:
                                    this.f1350b.g(i15, str5);
                                    return;
                                default:
                                    v1 v1Var2 = this.f1350b;
                                    v1Var2.getClass();
                                    v1Var2.B = SystemClock.elapsedRealtime() + 400;
                                    v1Var2.g(i15, str5);
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
            b(new j1(this, i13), 1300L);
            return;
        }
        if (this.f1560k == null) {
            h();
        }
        long j12 = this.f1553b;
        Context context = this.f1552a;
        this.f1559j = r0.c(context, j12);
        if (this.f1561l == null) {
            d("speech recognition unavailable");
        } else if (this.f1560k == null) {
            d("microphone error");
        } else {
            this.f1562m = true;
            boolean x10 = DictationAsr.x();
            this.f1566q = x10;
            if (x10) {
                ExecutorService executorService = DictationLid.f43040a;
                if (DictationAsr.x()) {
                    DictationLid.d(context);
                }
                String string = np.g1().getString("tinylid_lang", null);
                if (string != null) {
                    a0Var = DictationAsr.U(string, this.f1561l, false);
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    this.f1561l = a0Var;
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.f1561l.i());
            }
            StringBuilder sb7 = new StringBuilder("tinyasr route: ");
            sb7.append(this.f1561l);
            sb7.append(" (candidates ");
            sb7.append(this.f1559j);
            sb7.append(", last sure ");
            ExecutorService executorService2 = DictationLid.f43040a;
            sb7.append(np.g1().getString("tinylid_lang", null));
            sb7.append(")");
            Log.d("Dictation", sb7.toString());
            i(this.f1561l);
        }
    }

    public final void m() {
        u uVar;
        if (this.h) {
            return;
        }
        this.f1557g = true;
        Log.d("Dictation", "stop requested (session " + this.f1558i + ")");
        if (this.d) {
            Handler handler = this.f1555e;
            handler.removeCallbacksAndMessages(null);
            this.f1556f.f(this.f1558i, "stop");
            this.f1554c.i(this.f1556f.m());
            handler.postDelayed(new j1(this, 0), 350L);
        } else if (this.f1562m) {
            if (this.f1566q && !this.f1568s && !this.f1569t && DictationLid.f43042c != 0 && (uVar = this.f1560k) != null) {
                this.f1569t = true;
                int i7 = this.f1565p;
                uVar.d();
                u uVar2 = this.f1560k;
                DictationLid.h(500, new m1(this, i7, 0), a(), uVar2.b(0, uVar2.c()));
                return;
            }
            e();
        } else {
            d(null);
        }
    }
}
