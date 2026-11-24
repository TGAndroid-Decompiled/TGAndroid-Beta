package defpackage;

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
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
public final class ln3 {
    public static final int[] F = {1000, 2000, 5000, 10000};
    public static final String[][] G = {new String[]{"hey guys how are you", "Hey guys, how are you?"}, new String[]{"what do you think about this new feature | I recorded it this morning on my way to the office", "!I recorded it this morning on my way to the office."}, new String[]{"~", ""}, new String[]{"I think dictation looks really nice now and the text keeps every word even when I pause for a while", "I think dictation looks really nice now, and the text keeps every word even when I pause for a while."}, new String[]{"let's test it a bit more | then ship it to everyone this week if nobody finds a problem", "!Then ship it to everyone this week if nobody finds a problem."}};
    public final jn3 A;
    public long B;
    public final jn3 C;
    public long D;
    public long E;
    public final Context a;
    public final long b;
    public final kn3 c;
    public final boolean d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final rn3 f;
    public boolean g;
    public boolean h;
    public int i;
    public ArrayList j;
    public am3 k;
    public xl3 l;
    public boolean m;
    public yl3 n;
    public String o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public am3 w;
    public String x;
    public int y;
    public int z;

    public ln3(Context context, int i, long j, boolean z, kn3 kn3Var) {
        rn3 rn3Var = new rn3();
        this.f = rn3Var;
        this.j = new ArrayList();
        this.o = "";
        this.A = new jn3(this, (byte) 0);
        this.C = new jn3(this, (byte) 1);
        this.a = context.getApplicationContext();
        this.b = j;
        this.d = z;
        this.c = kn3Var;
        rn3Var.g = new k93((byte) 15);
    }

    public final String a() {
        String[] strArr = DictationLid.d;
        xl3 xl3Var = this.l;
        vl3[] vl3VarArr = DictationAsr.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = (ArrayList) xl3Var.d;
        if (arrayList != null) {
            linkedHashSet.addAll(arrayList);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!linkedHashSet.contains(str) && DictationAsr.K(str, xl3Var, false, true) != null) {
                    linkedHashSet.add(str);
                }
            }
        }
        return TextUtils.join(",", linkedHashSet);
    }

    public final void b(Runnable runnable, long j) {
        this.E += j;
        this.e.postAtTime(new wc3(this, runnable, (byte) 23), SystemClock.uptimeMillis() + this.E);
    }

    public final void c() {
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        yl3 yl3Var = this.n;
        if (yl3Var != null) {
            yl3Var.l = true;
        }
        am3 am3Var = this.k;
        if (am3Var != null) {
            am3Var.d();
            this.k = null;
        }
    }

    public final void d(String str) {
        String m;
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.removeCallbacksAndMessages(null);
        yl3 yl3Var = this.n;
        if (yl3Var != null) {
            yl3Var.l = true;
        }
        am3 am3Var = this.k;
        if (am3Var != null) {
            am3Var.d();
            this.k = null;
        }
        if (this.m) {
            m = this.o;
        } else {
            m = this.f.m();
        }
        StringBuilder p = ug8.p("finish error=", str, " sessions=");
        p.append(this.i);
        p.append(" chars=");
        p.append(m.length());
        Log.d("Dictation", p.toString());
        this.c.a(m, str);
    }

    public final void e() {
        yl3 yl3Var = this.n;
        if (yl3Var == null) {
            am3 am3Var = this.k;
            if (am3Var != null) {
                am3Var.d();
                return;
            }
            return;
        }
        yl3Var.o = new cn3(this, (byte) 2);
        yl3Var.k = true;
    }

    public final void f(int i, String str) {
        String str2;
        boolean z;
        if (!this.h) {
            rn3 rn3Var = this.f;
            boolean g = rn3Var.g(i);
            StringBuilder m = de9.m(i, "session ", " final ");
            m.append(rn3.b(str));
            if (g) {
                str2 = "";
            } else {
                str2 = " (stale)";
            }
            ir2.x(m, str2, "Dictation");
            if (g) {
                if (!rn3Var.g(i)) {
                    StringBuilder m2 = de9.m(i, "session ", " STALE final ignored (current ");
                    m2.append(rn3Var.e);
                    m2.append(", open ");
                    m2.append(rn3Var.f);
                    m2.append("): ");
                    m2.append(rn3.b(str));
                    rn3Var.i(m2.toString());
                    z = false;
                } else {
                    String m3 = rn3Var.m();
                    String trim = str.trim();
                    if (!trim.isEmpty()) {
                        ArrayList n = rn3.n(trim);
                        ArrayList n2 = rn3.n(rn3Var.b);
                        if (!n2.isEmpty() && rn3.l(n, n2, Math.min(3, n2.size()))) {
                            rn3Var.b = "";
                            rn3Var.c = trim;
                        } else {
                            rn3Var.a(trim, rn3Var.d);
                        }
                    }
                    rn3Var.c("final");
                    z = !m3.equals(rn3Var.m());
                }
                if (z) {
                    this.c.e(rn3Var.m());
                }
                if (this.g) {
                    d(null);
                }
            }
        }
    }

    public final void g(int i, String str) {
        if (!this.h) {
            rn3 rn3Var = this.f;
            boolean z = false;
            if (!rn3Var.g(i)) {
                StringBuilder m = de9.m(i, "session ", " STALE partial ignored (current ");
                m.append(rn3Var.e);
                m.append(", open ");
                m.append(rn3Var.f);
                m.append("): ");
                m.append(rn3.b(str));
                rn3Var.i(m.toString());
            } else {
                String m2 = rn3Var.m();
                String trim = str.trim();
                if (!str.isEmpty() && Character.isWhitespace(str.charAt(0))) {
                    z = true;
                }
                rn3Var.a(trim, z);
                z = !m2.equals(rn3Var.m());
            }
            if (z && !this.g) {
                this.c.e(rn3Var.m());
            }
        }
    }

    public final void h() {
        int state;
        AudioRecord audioRecord;
        if (!this.d && this.k == null && !this.h) {
            am3 am3Var = this.w;
            if (am3Var != null) {
                this.k = am3Var;
                am3Var.g = new gn3(this, (byte) 0);
                this.l = DictationAsr.V(qm3.c(this.a, this.b));
                return;
            }
            xl3 V = DictationAsr.V(qm3.c(this.a, this.b));
            this.l = V;
            if (V != null) {
                am3 am3Var2 = new am3();
                this.k = am3Var2;
                gn3 gn3Var = new gn3(this, (byte) 1);
                try {
                    AudioRecord audioRecord2 = new AudioRecord(6, 16000, 16, 2, Math.max(AudioRecord.getMinBufferSize(16000, 16, 2), 12800));
                    am3Var2.e = audioRecord2;
                    state = audioRecord2.getState();
                    audioRecord = am3Var2.e;
                } catch (Exception e) {
                    Log.e("Dictation", "audio capture", e);
                    AudioRecord audioRecord3 = am3Var2.e;
                    if (audioRecord3 != null) {
                        audioRecord3.release();
                    }
                    am3Var2.e = null;
                }
                if (state != 1) {
                    audioRecord.release();
                    am3Var2.e = null;
                    Log.d("Dictation", "own audio capture unavailable");
                    this.k = null;
                    return;
                }
                audioRecord.startRecording();
                Thread thread = new Thread(new wc3(am3Var2, gn3Var, (byte) 17), "DictationAudio");
                am3Var2.f = thread;
                thread.start();
            }
        }
    }

    public final void i(final xl3 xl3Var) {
        final int i = this.p + 1;
        this.p = i;
        this.l = xl3Var;
        DictationAsr.i0((vl3) xl3Var.b, false, new wl3() {
            @Override
            public final void a(boolean z) {
                ln3 ln3Var = ln3.this;
                int i2 = i;
                xl3 xl3Var2 = xl3Var;
                if (!ln3Var.h && i2 == ln3Var.p) {
                    if (!z) {
                        ln3Var.d("speech model download failed");
                        return;
                    }
                    yl3 yl3Var = ln3Var.n;
                    if (yl3Var != null) {
                        yl3Var.l = true;
                    }
                    yl3 yl3Var2 = new yl3(ln3Var.k, xl3Var2, new zf(ln3Var, i2, xl3Var2, (byte) 4));
                    ln3Var.n = yl3Var2;
                    new Thread(new li3(yl3Var2, (byte) 9), "DictationAsr").start();
                    if (ln3Var.g) {
                        ln3Var.e();
                    }
                }
            }
        });
    }

    public final void j(String str) {
        vl3 L;
        if (!this.h && this.m && this.k != null && (L = DictationAsr.L(str)) != null) {
            this.q = false;
            this.e.removeCallbacks(this.A);
            k(str);
            i(new xl3(L, str, this.j, (byte) 0));
        }
    }

    public final void k(String str) {
        boolean equals;
        if (str != null) {
            String str2 = this.x;
            HashMap hashMap = qm3.a;
            if (str2 == null) {
                equals = false;
            } else {
                equals = Locale.forLanguageTag(str.replace('_', '-')).getLanguage().equals(Locale.forLanguageTag(str2.replace('_', '-')).getLanguage());
            }
            if (!equals) {
                this.x = str;
                this.c.g(str);
            }
        }
    }

    public final void l() {
        String str;
        String str2;
        xl3 xl3Var;
        long j;
        byte b;
        String[] strArr;
        long j2;
        String str3;
        byte b2;
        StringBuilder sb = new StringBuilder("start ");
        boolean z = this.d;
        if (z) {
            str = "SIMULATED";
        } else {
            str = "real";
        }
        sb.append(str);
        sb.append(" sdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(" locale=");
        sb.append(Locale.getDefault());
        char c = ' ';
        if (this.k != null) {
            str2 = " (captured " + (this.k.c() / 32) + " ms already)";
        } else {
            str2 = "";
        }
        ir2.x(sb, str2, "Dictation");
        final byte b3 = 0;
        Handler handler = this.e;
        final byte b4 = 1;
        if (z) {
            this.D = SystemClock.elapsedRealtime();
            long j3 = 0;
            this.E = 0L;
            handler.post(this.C);
            b(new jc((byte) 10), 500L);
            int i = 0;
            while (i < 5) {
                final int i2 = i + 1;
                String[] strArr2 = G[i];
                String str4 = strArr2[b3];
                final String str5 = strArr2[b4];
                if (i == 0) {
                    j = j3;
                } else {
                    j = 140;
                }
                b(new Runnable(this) {
                    public final ln3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        byte b5 = b3;
                        String str6 = "";
                        boolean z2 = true;
                        int i3 = i2;
                        ln3 ln3Var = this.b;
                        switch (b5) {
                            case 0:
                                ln3Var.i = i3;
                                rn3 rn3Var = ln3Var.f;
                                if (rn3Var.f) {
                                    rn3Var.c("superseded");
                                }
                                rn3Var.e = i3;
                                rn3Var.f = true;
                                rn3Var.b = "";
                                rn3Var.c = "";
                                rn3Var.d = false;
                                rn3Var.i("session " + i3 + " begin");
                                Log.d("Dictation", "session " + i3 + " start (simulated)");
                                return;
                            default:
                                rn3 rn3Var2 = ln3Var.f;
                                if (!ln3Var.h) {
                                    if (!rn3Var2.g(i3) && i3 != ln3Var.i) {
                                        z2 = false;
                                    }
                                    StringBuilder m = de9.m(i3, "session ", " no match");
                                    if (!z2) {
                                        str6 = " (stale, ignored)";
                                    }
                                    ir2.x(m, str6, "Dictation");
                                    if (z2) {
                                        rn3Var2.f(i3, "no match");
                                        ln3Var.c.e(rn3Var2.m());
                                        if (ln3Var.g) {
                                            ln3Var.d(null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                }, j);
                if (i == 2) {
                    b(new cn3(this, (byte) 3), 60L);
                }
                if (str4.equals("~")) {
                    b(new Runnable(this) {
                        public final ln3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b5 = b4;
                            String str6 = "";
                            boolean z2 = true;
                            int i3 = i2;
                            ln3 ln3Var = this.b;
                            switch (b5) {
                                case 0:
                                    ln3Var.i = i3;
                                    rn3 rn3Var = ln3Var.f;
                                    if (rn3Var.f) {
                                        rn3Var.c("superseded");
                                    }
                                    rn3Var.e = i3;
                                    rn3Var.f = true;
                                    rn3Var.b = "";
                                    rn3Var.c = "";
                                    rn3Var.d = false;
                                    rn3Var.i("session " + i3 + " begin");
                                    Log.d("Dictation", "session " + i3 + " start (simulated)");
                                    return;
                                default:
                                    rn3 rn3Var2 = ln3Var.f;
                                    if (!ln3Var.h) {
                                        if (!rn3Var2.g(i3) && i3 != ln3Var.i) {
                                            z2 = false;
                                        }
                                        StringBuilder m = de9.m(i3, "session ", " no match");
                                        if (!z2) {
                                            str6 = " (stale, ignored)";
                                        }
                                        ir2.x(m, str6, "Dictation");
                                        if (z2) {
                                            rn3Var2.f(i3, "no match");
                                            ln3Var.c.e(rn3Var2.m());
                                            if (ln3Var.g) {
                                                ln3Var.d(null);
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
                    b = b4;
                } else {
                    String[] split = str4.split(" \\| ");
                    int length = split.length;
                    int i3 = b3;
                    while (i3 < length) {
                        String[] split2 = split[i3].split(" ");
                        StringBuilder sb2 = new StringBuilder();
                        int i4 = b3;
                        while (i4 < split2.length) {
                            if (i4 > 0) {
                                sb2.append(c);
                            }
                            sb2.append(split2[i4]);
                            final String sb3 = sb2.toString();
                            if (i == 3) {
                                if (split2[i4].equals("now")) {
                                    b2 = 300;
                                } else if (split2[i4].equals("text")) {
                                    b2 = 800;
                                } else if (split2[i4].equals("word")) {
                                    b2 = 1100;
                                } else if (split2[i4].equals("pause")) {
                                    b2 = 1500;
                                } else {
                                    b2 = b3;
                                }
                                strArr = split2;
                                j2 = b2;
                            } else {
                                strArr = split2;
                                j2 = 0;
                            }
                            int i5 = i;
                            long length2 = (strArr[i4].length() * 24) + j2 + 170 + ((long) (Math.random() * 60.0d));
                            if (!strArr[i4].equals("feature") && !strArr[i4].equals("office")) {
                                b(new Runnable(this) {
                                    public final ln3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b5 = r4;
                                        String str6 = sb3;
                                        int i6 = i2;
                                        ln3 ln3Var = this.b;
                                        switch (b5) {
                                            case 0:
                                                ln3Var.f(i6, str6);
                                                return;
                                            case 1:
                                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                                ln3Var.g(i6, str6);
                                                return;
                                            case 2:
                                                ln3Var.g(i6, str6);
                                                return;
                                            default:
                                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                                ln3Var.g(i6, str6);
                                                return;
                                        }
                                    }
                                }, length2);
                            } else {
                                String substring = sb3.substring(0, sb3.length() - strArr[i4].length());
                                if (strArr[i4].equals("feature")) {
                                    str3 = "feet";
                                } else {
                                    str3 = "offers";
                                }
                                final String concat = substring.concat(str3);
                                b(new Runnable(this) {
                                    public final ln3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b5 = r4;
                                        String str6 = concat;
                                        int i6 = i2;
                                        ln3 ln3Var = this.b;
                                        switch (b5) {
                                            case 0:
                                                ln3Var.f(i6, str6);
                                                return;
                                            case 1:
                                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                                ln3Var.g(i6, str6);
                                                return;
                                            case 2:
                                                ln3Var.g(i6, str6);
                                                return;
                                            default:
                                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                                ln3Var.g(i6, str6);
                                                return;
                                        }
                                    }
                                }, length2);
                                b(new Runnable(this) {
                                    public final ln3 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override
                                    public final void run() {
                                        byte b5 = r4;
                                        String str6 = sb3;
                                        int i6 = i2;
                                        ln3 ln3Var = this.b;
                                        switch (b5) {
                                            case 0:
                                                ln3Var.f(i6, str6);
                                                return;
                                            case 1:
                                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                                ln3Var.g(i6, str6);
                                                return;
                                            case 2:
                                                ln3Var.g(i6, str6);
                                                return;
                                            default:
                                                ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                                ln3Var.g(i6, str6);
                                                return;
                                        }
                                    }
                                }, 180L);
                            }
                            i4++;
                            split2 = strArr;
                            i = i5;
                            b3 = 0;
                            c = ' ';
                        }
                        b(new jc((byte) 10), 650L);
                        i3++;
                        i = i;
                        b3 = 0;
                        c = ' ';
                    }
                    b = 1;
                    if (str5.startsWith("!")) {
                        str5 = str5.substring(1);
                    }
                    b(new Runnable(this) {
                        public final ln3 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b5 = r4;
                            String str6 = str5;
                            int i6 = i2;
                            ln3 ln3Var = this.b;
                            switch (b5) {
                                case 0:
                                    ln3Var.f(i6, str6);
                                    return;
                                case 1:
                                    ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                    ln3Var.g(i6, str6);
                                    return;
                                case 2:
                                    ln3Var.g(i6, str6);
                                    return;
                                default:
                                    ln3Var.B = SystemClock.elapsedRealtime() + 400;
                                    ln3Var.g(i6, str6);
                                    return;
                            }
                        }
                    }, 900L);
                }
                i = i2;
                b4 = b;
                b3 = 0;
                c = ' ';
                j3 = 0;
            }
            b(new cn3(this, b4), 1300L);
            return;
        }
        if (this.k == null) {
            h();
        }
        long j4 = this.b;
        Context context = this.a;
        this.j = qm3.c(context, j4);
        if (this.l == null) {
            d("speech recognition unavailable");
        } else if (this.k == null) {
            d("microphone error");
        } else {
            this.m = true;
            boolean x = DictationAsr.x();
            this.q = x;
            if (x) {
                ExecutorService executorService = DictationLid.a;
                if (DictationAsr.x()) {
                    DictationLid.a(context);
                }
                String string = na7.c1().getString("tinylid_lang", null);
                if (string != null) {
                    xl3Var = DictationAsr.X(string, this.l, false);
                } else {
                    xl3Var = null;
                }
                if (xl3Var != null) {
                    this.l = xl3Var;
                }
                handler.postDelayed(this.A, 700L);
            } else {
                k(this.l.u());
            }
            StringBuilder sb4 = new StringBuilder("tinyasr route: ");
            sb4.append(this.l);
            sb4.append(" (candidates ");
            sb4.append(this.j);
            sb4.append(", last sure ");
            ExecutorService executorService2 = DictationLid.a;
            sb4.append(na7.c1().getString("tinylid_lang", null));
            sb4.append(")");
            Log.d("Dictation", sb4.toString());
            i(this.l);
        }
    }

    public final void m() {
        am3 am3Var;
        if (this.h) {
            return;
        }
        this.g = true;
        Log.d("Dictation", "stop requested (session " + this.i + ")");
        if (this.d) {
            Handler handler = this.e;
            handler.removeCallbacksAndMessages(null);
            this.f.f(this.i, "stop");
            this.c.e(this.f.m());
            handler.postDelayed(new cn3(this, (byte) 0), 350L);
        } else if (this.m) {
            if (this.q && !this.s && !this.t && DictationLid.c != 0 && (am3Var = this.k) != null) {
                this.t = true;
                int i = this.p;
                am3Var.d();
                am3 am3Var2 = this.k;
                DictationLid.h(500, new jh(this, i, (byte) 7), a(), am3Var2.b(0, am3Var2.c()));
                return;
            }
            e();
        } else {
            d(null);
        }
    }
}
