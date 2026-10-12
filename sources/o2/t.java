package o2;

import android.text.TextUtils;
import b2.w;
import b2.w0;
import b2.x0;
import c3.i0;
import e2.k0;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class t implements c3.o {
    public static final Pattern f16578i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f16579j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f16580a;
    public final k0 f16581b;
    public final z3.l d;
    public final boolean e;
    public c3.q f16583f;
    public int h;
    public final x f16582c = new x();
    public byte[] f16584g = new byte[1024];

    public t(String str, k0 k0Var, z3.l lVar, boolean z10) {
        this.f16580a = str;
        this.f16581b = k0Var;
        this.d = lVar;
        this.e = z10;
    }

    @Override
    public final boolean a(c3.p pVar) {
        c3.l lVar = (c3.l) pVar;
        lVar.j(this.f16584g, 0, 6, false);
        byte[] bArr = this.f16584g;
        x xVar = this.f16582c;
        xVar.L(6, bArr);
        if (i4.i.a(xVar)) {
            return true;
        }
        lVar.j(this.f16584g, 6, 3, false);
        xVar.L(9, this.f16584g);
        return i4.i.a(xVar);
    }

    @Override
    public final void c(c3.q qVar) {
        if (this.e) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f16583f = qVar;
        qVar.K(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8592b;
        return x1.e;
    }

    @Override
    public final int f(c3.p pVar, c3.s sVar) {
        String n10;
        int length;
        this.f16583f.getClass();
        int length2 = (int) pVar.getLength();
        int i10 = this.h;
        byte[] bArr = this.f16584g;
        if (i10 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f16584g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f16584g;
        int i11 = this.h;
        int read = pVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.h + read;
            this.h = i12;
            if (length2 == -1 || i12 != length2) {
                return 0;
            }
        }
        x xVar = new x(this.f16584g);
        i4.i.d(xVar);
        String n11 = xVar.n(StandardCharsets.UTF_8);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n11)) {
                if (n11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f16578i.matcher(n11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f16579j.matcher(n11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = i4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = m0.f8372a;
                            j10 = m0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw x0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n11));
                        }
                    } else {
                        throw x0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n11));
                    }
                }
                n11 = xVar.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n12 = xVar.n(StandardCharsets.UTF_8);
                    if (n12 == null) {
                        break;
                    } else if (i4.i.f11313a.matcher(n12).matches()) {
                        do {
                            n10 = xVar.n(StandardCharsets.UTF_8);
                            if (n10 != null) {
                            }
                        } while (!n10.isEmpty());
                    } else {
                        Matcher matcher4 = i4.h.f11310a.matcher(n12);
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
                long c10 = i4.i.c(group3);
                String str2 = m0.f8372a;
                long b10 = this.f16581b.b(m0.a0((j10 + c10) - j11, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                i0 g10 = g(b10 - c10);
                byte[] bArr3 = this.f16584g;
                int i13 = this.h;
                x xVar2 = this.f16582c;
                xVar2.L(i13, bArr3);
                g10.d(this.h, xVar2);
                g10.c(b10, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    public final i0 g(long j10) {
        i0 a02 = this.f16583f.a0(0, 3);
        w wVar = new w();
        wVar.f2466r = w0.n("text/vtt");
        wVar.d = this.f16580a;
        wVar.f2470w = j10;
        i2.d.s(wVar, a02);
        this.f16583f.D();
        return a02;
    }

    @Override
    public final c3.o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
