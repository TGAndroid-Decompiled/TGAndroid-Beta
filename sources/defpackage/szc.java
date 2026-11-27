package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class szc implements e84 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final usb b;
    public final uif d;
    public final boolean e;
    public g84 f;
    public int h;
    public final ey7 c = new ey7();
    public byte[] g = new byte[1024];

    public szc(String str, usb usbVar, uif uifVar, boolean z) {
        this.a = str;
        this.b = usbVar;
        this.d = uifVar;
        this.e = z;
    }

    @Override
    public final int b(f84 f84Var, v11 v11Var) {
        String n;
        int length;
        this.f.getClass();
        int i2 = (int) ((cb3) f84Var).c;
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
        int read = ((cb3) f84Var).read(bArr, i4, bArr.length - i4);
        if (read != -1) {
            int i5 = this.h + read;
            this.h = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        ey7 ey7Var = new ey7(this.g);
        tzc.d(ey7Var);
        String n2 = ey7Var.n(StandardCharsets.UTF_8);
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
                            j3 = tzc.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = gcc.a;
                            j2 = gcc.b0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw hy7.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n2), null);
                        }
                    } else {
                        throw hy7.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n2), null);
                    }
                }
                n2 = ey7Var.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n3 = ey7Var.n(StandardCharsets.UTF_8);
                    if (n3 == null) {
                        break;
                    } else if (tzc.a.matcher(n3).matches()) {
                        do {
                            n = ey7Var.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher4 = rzc.a.matcher(n3);
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
                long c = tzc.c(group3);
                String str2 = gcc.a;
                long b = this.b.b(gcc.b0((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                x1c g = g(b - c);
                byte[] bArr2 = this.g;
                int i6 = this.h;
                ey7 ey7Var2 = this.c;
                ey7Var2.L(i6, bArr2);
                g.e(this.h, ey7Var2);
                g.a(b, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final boolean c(f84 f84Var) {
        cb3 cb3Var = (cb3) f84Var;
        cb3Var.d(this.g, 0, 6, false);
        byte[] bArr = this.g;
        ey7 ey7Var = this.c;
        ey7Var.L(6, bArr);
        if (tzc.a(ey7Var)) {
            return true;
        }
        cb3Var.d(this.g, 6, 3, false);
        ey7Var.L(9, this.g);
        return tzc.a(ey7Var);
    }

    @Override
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        no5 no5Var = po5.b;
        return j99.e;
    }

    @Override
    public final void f(g84 g84Var) {
        if (this.e) {
            g84Var = new vh4(g84Var, this.d);
        }
        this.f = g84Var;
        g84Var.m0(new qc0(-9223372036854775807L));
    }

    public final x1c g(long j2) {
        x1c e0 = this.f.e0(0, 3);
        jo4 jo4Var = new jo4();
        jo4Var.s = dg7.n("text/vtt");
        jo4Var.d = this.a;
        jo4Var.x = j2;
        xnb.v(jo4Var, e0);
        this.f.D();
        return e0;
    }

    @Override
    public final e84 a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
