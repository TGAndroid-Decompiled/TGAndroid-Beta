package o2;

import android.text.TextUtils;
import b2.r0;
import b2.s0;
import c3.h0;
import e2.b0;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class t implements c3.o {
    public static final Pattern f16968i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f16969j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f16970a;
    public final b0 f16971b;
    public final z3.k d;
    public final boolean f16973e;
    public c3.q f16974f;
    public int h;
    public final v f16972c = new v();
    public byte[] f16975g = new byte[1024];

    public t(String str, b0 b0Var, z3.k kVar, boolean z10) {
        this.f16970a = str;
        this.f16971b = b0Var;
        this.d = kVar;
        this.f16973e = z10;
    }

    public final h0 a(long j3) {
        h0 R1 = this.f16974f.R1(0, 3);
        b2.r rVar = new b2.r();
        rVar.f2339q = r0.n("text/vtt");
        rVar.d = this.f16970a;
        rVar.v = j3;
        i2.g.u(rVar, R1);
        this.f16974f.Z0();
        return R1;
    }

    @Override
    public final boolean b(c3.p pVar) {
        c3.l lVar = (c3.l) pVar;
        lVar.j(this.f16975g, 0, 6, false);
        byte[] bArr = this.f16975g;
        v vVar = this.f16972c;
        vVar.H(6, bArr);
        if (i4.i.a(vVar)) {
            return true;
        }
        lVar.j(this.f16975g, 6, 3, false);
        vVar.H(9, this.f16975g);
        return i4.i.a(vVar);
    }

    @Override
    public final void g(c3.q qVar) {
        if (this.f16973e) {
            qVar = new com.google.firebase.messaging.m(qVar, this.d);
        }
        this.f16974f = qVar;
        qVar.P1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        String k10;
        int length;
        this.f16974f.getClass();
        int length2 = (int) pVar.getLength();
        int i10 = this.h;
        byte[] bArr = this.f16975g;
        if (i10 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f16975g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f16975g;
        int i11 = this.h;
        int read = pVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.h + read;
            this.h = i12;
            if (length2 == -1 || i12 != length2) {
                return 0;
            }
        }
        v vVar = new v(this.f16975g);
        i4.i.d(vVar);
        String k11 = vVar.k(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(k11)) {
                if (k11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f16968i.matcher(k11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f16969j.matcher(k11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = i4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = d0.f8765a;
                            j3 = d0.Y(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw s0.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(k11));
                        }
                    } else {
                        throw s0.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(k11));
                    }
                }
                k11 = vVar.k(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String k12 = vVar.k(StandardCharsets.UTF_8);
                    if (k12 == null) {
                        break;
                    } else if (i4.i.f11879a.matcher(k12).matches()) {
                        do {
                            k10 = vVar.k(StandardCharsets.UTF_8);
                            if (k10 != null) {
                            }
                        } while (!k10.isEmpty());
                    } else {
                        Matcher matcher4 = i4.h.f11876a.matcher(k12);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c10 = i4.i.c(group3);
                String str2 = d0.f8765a;
                long b10 = this.f16971b.b(d0.Y((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                h0 a2 = a(b10 - c10);
                byte[] bArr3 = this.f16975g;
                int i13 = this.h;
                v vVar2 = this.f16972c;
                vVar2.H(i13, bArr3);
                a2.d(this.h, vVar2);
                a2.c(b10, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final c3.o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
