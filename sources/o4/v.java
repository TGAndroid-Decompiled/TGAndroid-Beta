package o4;

import android.text.TextUtils;
import d5.e0;
import d5.y;
import h3.s0;
import h3.t0;
import h3.t1;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.w;
public final class v implements m3.k {
    public static final Pattern f18944g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String f18945a;
    public final e0 f18946b;
    public m3.m d;
    public int f18949f;
    public final y f18947c = new y();
    public byte[] f18948e = new byte[1024];

    public v(String str, e0 e0Var) {
        this.f18945a = str;
        this.f18946b = e0Var;
    }

    public final w a(long j10) {
        w I = this.d.I(0, 3);
        s0 s0Var = new s0();
        s0Var.f9705o = "text/vtt";
        s0Var.f9695c = this.f18945a;
        s0Var.f9709s = j10;
        I.c(new t0(s0Var));
        this.d.B();
        return I;
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) {
        String f10;
        int length;
        this.d.getClass();
        int i9 = (int) ((m3.h) lVar).f17236c;
        int i10 = this.f18949f;
        byte[] bArr = this.f18948e;
        if (i10 == bArr.length) {
            if (i9 != -1) {
                length = i9;
            } else {
                length = bArr.length;
            }
            this.f18948e = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f18948e;
        int i11 = this.f18949f;
        int read = ((m3.h) lVar).read(bArr2, i11, bArr2.length - i11);
        if (read != -1) {
            int i12 = this.f18949f + read;
            this.f18949f = i12;
            if (i9 == -1 || i12 != i9) {
                return 0;
            }
        }
        y yVar = new y(this.f18948e);
        a5.l.d(yVar);
        String f11 = yVar.f(n8.d.f18513c);
        long j10 = 0;
        long j11 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(f11)) {
                if (f11.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f18944g.matcher(f11);
                    if (matcher2.find()) {
                        Matcher matcher3 = h.matcher(f11);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j11 = a5.l.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            j10 = (Long.parseLong(group2) * 1000000) / 90000;
                        } else {
                            throw t1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(f11), null);
                        }
                    } else {
                        throw t1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(f11), null);
                    }
                }
                f11 = yVar.f(n8.d.f18513c);
            } else {
                while (true) {
                    String f12 = yVar.f(n8.d.f18513c);
                    if (f12 == null) {
                        break;
                    } else if (a5.l.f95a.matcher(f12).matches()) {
                        do {
                            f10 = yVar.f(n8.d.f18513c);
                            if (f10 != null) {
                            }
                        } while (!f10.isEmpty());
                    } else {
                        Matcher matcher4 = a5.j.f90a.matcher(f12);
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
                long c10 = a5.l.c(group3);
                long b10 = this.f18946b.b(((((j10 + c10) - j11) * 90000) / 1000000) % 8589934592L);
                w a2 = a(b10 - c10);
                byte[] bArr3 = this.f18948e;
                int i13 = this.f18949f;
                y yVar2 = this.f18947c;
                yVar2.A(i13, bArr3);
                a2.a(this.f18949f, yVar2);
                a2.e(b10, 1, this.f18949f, 0, null);
                return -1;
            }
        }
    }

    @Override
    public final void c(m3.m mVar) {
        this.d = mVar;
        mVar.y(new m3.o(-9223372036854775807L));
    }

    @Override
    public final boolean f(m3.l lVar) {
        m3.h hVar = (m3.h) lVar;
        hVar.g(this.f18948e, 0, 6, false);
        byte[] bArr = this.f18948e;
        y yVar = this.f18947c;
        yVar.A(6, bArr);
        if (a5.l.a(yVar)) {
            return true;
        }
        hVar.g(this.f18948e, 6, 3, false);
        yVar.A(9, this.f18948e);
        return a5.l.a(yVar);
    }

    @Override
    public final void g(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final void release() {
    }
}
