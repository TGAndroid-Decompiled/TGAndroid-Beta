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
import hg.k0;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class t implements c3.o {
    public static final Pattern f15459i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f15460j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f15461a;
    public final b0 f15462b;
    public final z3.k d;
    public final boolean e;
    public c3.q f15464f;
    public int h;
    public final v f15463c = new v();
    public byte[] f15465g = new byte[1024];

    public t(String str, b0 b0Var, z3.k kVar, boolean z10) {
        this.f15461a = str;
        this.f15462b = b0Var;
        this.d = kVar;
        this.e = z10;
    }

    @Override
    public final boolean a(c3.p pVar) {
        c3.l lVar = (c3.l) pVar;
        lVar.h(this.f15465g, 0, 6, false);
        byte[] bArr = this.f15465g;
        v vVar = this.f15463c;
        vVar.H(6, bArr);
        if (i4.i.a(vVar)) {
            return true;
        }
        lVar.h(this.f15465g, 6, 3, false);
        vVar.H(9, this.f15465g);
        return i4.i.a(vVar);
    }

    public final h0 b(long j3) {
        h0 Z1 = this.f15464f.Z1(0, 3);
        b2.r rVar = new b2.r();
        rVar.f3248q = r0.n("text/vtt");
        rVar.d = this.f15461a;
        rVar.v = j3;
        k0.u(rVar, Z1);
        this.f15464f.e1();
        return Z1;
    }

    @Override
    public final void g(c3.q qVar) {
        if (this.e) {
            qVar = new com.google.firebase.messaging.m(qVar, this.d);
        }
        this.f15464f = qVar;
        qVar.X1(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8079b;
        return a1.e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        String k10;
        int length;
        this.f15464f.getClass();
        int length2 = (int) pVar.getLength();
        int i10 = this.h;
        byte[] bArr = this.f15465g;
        if (i10 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f15465g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f15465g;
        int i11 = this.h;
        int read = pVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.h + read;
            this.h = i12;
            if (length2 == -1 || i12 != length2) {
                return 0;
            }
        }
        v vVar = new v(this.f15465g);
        i4.i.d(vVar);
        String k11 = vVar.k(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(k11)) {
                if (k11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f15459i.matcher(k11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f15460j.matcher(k11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = i4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = d0.f7883a;
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
                    } else if (i4.i.f10987a.matcher(k12).matches()) {
                        do {
                            k10 = vVar.k(StandardCharsets.UTF_8);
                            if (k10 != null) {
                            }
                        } while (!k10.isEmpty());
                    } else {
                        Matcher matcher4 = i4.h.f10984a.matcher(k12);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c10 = i4.i.c(group3);
                String str2 = d0.f7883a;
                long b10 = this.f15462b.b(d0.Y((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                h0 b11 = b(b10 - c10);
                byte[] bArr3 = this.f15465g;
                int i13 = this.h;
                v vVar2 = this.f15463c;
                vVar2.H(i13, bArr3);
                b11.d(this.h, vVar2);
                b11.c(b10, 1, this.h, 0, null);
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
