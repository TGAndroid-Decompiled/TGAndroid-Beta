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
    public static final Pattern f16806i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern f16807j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f16808a;
    public final b0 f16809b;
    public final z3.k d;
    public final boolean f16811e;
    public c3.q f16812f;
    public int h;
    public final v f16810c = new v();
    public byte[] f16813g = new byte[1024];

    public t(String str, b0 b0Var, z3.k kVar, boolean z10) {
        this.f16808a = str;
        this.f16809b = b0Var;
        this.d = kVar;
        this.f16811e = z10;
    }

    public final h0 a(long j3) {
        h0 f22 = this.f16812f.f2(0, 3);
        b2.r rVar = new b2.r();
        rVar.f3583q = r0.n("text/vtt");
        rVar.d = this.f16808a;
        rVar.v = j3;
        hg.c.u(rVar, f22);
        this.f16812f.k1();
        return f22;
    }

    @Override
    public final boolean b(c3.p pVar) {
        c3.l lVar = (c3.l) pVar;
        lVar.f(this.f16813g, 0, 6, false);
        byte[] bArr = this.f16813g;
        v vVar = this.f16810c;
        vVar.H(6, bArr);
        if (i4.i.a(vVar)) {
            return true;
        }
        lVar.f(this.f16813g, 6, 3, false);
        vVar.H(9, this.f16813g);
        return i4.i.a(vVar);
    }

    @Override
    public final void g(c3.q qVar) {
        if (this.f16811e) {
            qVar = new com.google.firebase.messaging.m(qVar, this.d);
        }
        this.f16812f = qVar;
        qVar.d2(new c3.t(-9223372036854775807L));
    }

    @Override
    public final void h(long j3, long j10) {
        throw new IllegalStateException();
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8749b;
        return a1.f8712e;
    }

    @Override
    public final int m(c3.p pVar, c3.s sVar) {
        String k10;
        int length;
        this.f16812f.getClass();
        int length2 = (int) pVar.getLength();
        int i10 = this.h;
        byte[] bArr = this.f16813g;
        if (i10 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.f16813g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f16813g;
        int i11 = this.h;
        int read = pVar.read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.h + read;
            this.h = i12;
            if (length2 == -1 || i12 != length2) {
                return 0;
            }
        }
        v vVar = new v(this.f16813g);
        i4.i.d(vVar);
        String k11 = vVar.k(StandardCharsets.UTF_8);
        long j3 = 0;
        long j10 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(k11)) {
                if (k11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f16806i.matcher(k11);
                    if (matcher2.find()) {
                        Matcher matcher3 = f16807j.matcher(k11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j10 = i4.i.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = d0.f8529a;
                            j3 = d0.X(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
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
                    } else if (i4.i.f12006a.matcher(k12).matches()) {
                        do {
                            k10 = vVar.k(StandardCharsets.UTF_8);
                            if (k10 != null) {
                            }
                        } while (!k10.isEmpty());
                    } else {
                        Matcher matcher4 = i4.h.f12003a.matcher(k12);
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
                String str2 = d0.f8529a;
                long b10 = this.f16809b.b(d0.X((j3 + c10) - j10, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                h0 a2 = a(b10 - c10);
                byte[] bArr3 = this.f16813g;
                int i13 = this.h;
                v vVar2 = this.f16810c;
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
