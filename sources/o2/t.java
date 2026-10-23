package o2;

import android.text.TextUtils;
import b2.v0;
import b2.w0;
import c3.u;
import c3.v;
import e2.k0;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.o1;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class t implements c3.q {
    public static final Pattern f17732i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f17733j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f17734a;
    public final k0 f17735b;
    public final z3.k d;
    public final boolean e;
    public c3.s f17737f;
    public int h;
    public final x f17736c = new x();
    public byte[] f17738g = new byte[1024];

    public t(String str, k0 k0Var, z3.k kVar, boolean z10) {
        this.f17734a = str;
        this.f17735b = k0Var;
        this.d = kVar;
        this.e = z10;
    }

    @Override
    public final boolean a(c3.r rVar) {
        c3.l lVar = (c3.l) rVar;
        lVar.j(this.f17738g, 0, 6, false);
        byte[] bArr = this.f17738g;
        x xVar = this.f17736c;
        xVar.L(6, bArr);
        if (i4.i.a(xVar)) {
            return true;
        }
        lVar.j(this.f17738g, 6, 3, false);
        xVar.L(9, this.f17738g);
        return i4.i.a(xVar);
    }

    @Override
    public final void c(c3.s sVar) {
        if (this.e) {
            sVar = new c2.b(sVar, this.d);
        }
        this.f17737f = sVar;
        sVar.g0(new v(-9223372036854775807L));
    }

    @Override
    public final void d(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r rVar, u uVar) {
        String n10;
        int length;
        this.f17737f.getClass();
        int length2 = (int) rVar.getLength();
        int i10 = this.h;
        byte[] bArr = this.f17738g;
        if (i10 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f17738g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f17738g;
        int i11 = this.h;
        int read = rVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.h + read;
            this.h = i12;
            if (length2 == -1 || i12 != length2) {
                return 0;
            }
        }
        x xVar = new x(this.f17738g);
        i4.i.d(xVar);
        String n11 = xVar.n(StandardCharsets.UTF_8);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n11)) {
                if (n11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f17732i.matcher(n11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f17733j.matcher(n11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = i4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = m0.f8259a;
                            j10 = m0.a0(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw w0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n11));
                        }
                    } else {
                        throw w0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n11));
                    }
                }
                n11 = xVar.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n12 = xVar.n(StandardCharsets.UTF_8);
                    if (n12 == null) {
                        break;
                    } else if (i4.i.f12734a.matcher(n12).matches()) {
                        do {
                            n10 = xVar.n(StandardCharsets.UTF_8);
                            if (n10 != null) {
                            }
                        } while (!n10.isEmpty());
                    } else {
                        Matcher matcher4 = i4.h.f12731a.matcher(n12);
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
                String str2 = m0.f8259a;
                long b10 = this.f17735b.b(m0.a0((j10 + c10) - j11, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                c3.l0 g10 = g(b10 - c10);
                byte[] bArr3 = this.f17738g;
                int i13 = this.h;
                x xVar2 = this.f17736c;
                xVar2.L(i13, bArr3);
                g10.d(this.h, xVar2);
                g10.c(b10, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    public final c3.l0 g(long j10) {
        c3.l0 j02 = this.f17737f.j0(0, 3);
        b2.v vVar = new b2.v();
        vVar.f4082r = v0.n("text/vtt");
        vVar.d = this.f17734a;
        vVar.f4086w = j10;
        o1.v(vVar, j02);
        this.f17737f.C();
        return j02;
    }

    @Override
    public final c3.q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
