package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class cvc implements j74 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final uob b;
    public final eef d;
    public final boolean e;
    public l74 f;
    public int h;
    public final xu7 c = new xu7();
    public byte[] g = new byte[1024];

    public cvc(String str, uob uobVar, eef eefVar, boolean z) {
        this.a = str;
        this.b = uobVar;
        this.d = eefVar;
        this.e = z;
    }

    @Override
    public final int b(k74 k74Var, m11 m11Var) {
        String n;
        int length;
        this.f.getClass();
        int i2 = (int) ((ja3) k74Var).c;
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
            if (i2 != -1) {
                length = i2;
            } else {
                length = bArr.length;
            }
            bArr = Arrays.copyOf(bArr, (length * 3) / 2);
            this.g = bArr;
        }
        int i4 = this.h;
        int read = ((ja3) k74Var).read(bArr, i4, bArr.length - i4);
        if (read != -1) {
            int i5 = this.h + read;
            this.h = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        xu7 xu7Var = new xu7(this.g);
        dvc.d(xu7Var);
        String n2 = xu7Var.n(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n2)) {
                if (n2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = i.matcher(n2);
                    if (matcher2.find()) {
                        Matcher matcher3 = j.matcher(n2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j3 = dvc.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = g8c.a;
                            j2 = g8c.b0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw av7.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n2), null);
                        }
                    } else {
                        throw av7.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n2), null);
                    }
                }
                n2 = xu7Var.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n3 = xu7Var.n(StandardCharsets.UTF_8);
                    if (n3 == null) {
                        break;
                    } else if (dvc.a.matcher(n3).matches()) {
                        do {
                            n = xu7Var.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher4 = bvc.a.matcher(n3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c = dvc.c(group3);
                String str2 = g8c.a;
                long b = this.b.b(g8c.b0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                wxb g = g(b - c);
                byte[] bArr2 = this.g;
                int i6 = this.h;
                xu7 xu7Var2 = this.c;
                xu7Var2.L(i6, bArr2);
                g.e(this.h, xu7Var2);
                g.a(b, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final boolean c(k74 k74Var) {
        ja3 ja3Var = (ja3) k74Var;
        ja3Var.d(this.g, 0, 6, false);
        byte[] bArr = this.g;
        xu7 xu7Var = this.c;
        xu7Var.L(6, bArr);
        if (dvc.a(xu7Var)) {
            return true;
        }
        ja3Var.d(this.g, 6, 3, false);
        xu7Var.L(9, this.g);
        return dvc.a(xu7Var);
    }

    @Override
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        km5 km5Var = mm5.b;
        return w59.e;
    }

    @Override
    public final void f(l74 l74Var) {
        if (this.e) {
            l74Var = new xf4(l74Var, this.d);
        }
        this.f = l74Var;
        l74Var.f0(new oc0(-9223372036854775807L));
    }

    public final wxb g(long j2) {
        wxb T = this.f.T(0, 3);
        em4 em4Var = new em4();
        em4Var.s = ud7.n("text/vtt");
        em4Var.d = this.a;
        em4Var.x = j2;
        yjb.v(em4Var, T);
        this.f.B();
        return T;
    }

    @Override
    public final j74 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
