package o4;

import android.text.TextUtils;
import d5.f0;
import d5.z;
import h3.s0;
import h3.t0;
import h3.t1;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m3.w;

public final class v implements m3.k {

    public static final Pattern f19291g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(-?\\d+)");

    public final String f19292a;

    public final f0 f19293b;
    public m3.m d;

    public int f19296f;

    public final z f19294c = new z();

    public byte[] f19295e = new byte[1024];

    public v(String str, f0 f0Var) {
        this.f19292a = str;
        this.f19293b = f0Var;
    }

    public final w a(long j10) {
        w wVarC = this.d.C(0, 3);
        s0 s0Var = new s0();
        s0Var.f8135o = "text/vtt";
        s0Var.f8125c = this.f19292a;
        s0Var.f8139s = j10;
        wVarC.c(new t0(s0Var));
        this.d.A();
        return wVarC;
    }

    @Override
    public final int b(m3.l lVar, m3.n nVar) throws t1, EOFException, InterruptedIOException {
        String strF;
        this.d.getClass();
        int i10 = (int) ((m3.h) lVar).f17612c;
        int i11 = this.f19296f;
        byte[] bArr = this.f19295e;
        if (i11 == bArr.length) {
            this.f19295e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f19295e;
        int i12 = this.f19296f;
        int i13 = ((m3.h) lVar).read(bArr2, i12, bArr2.length - i12);
        if (i13 != -1) {
            int i14 = this.f19296f + i13;
            this.f19296f = i14;
            if (i10 == -1 || i14 != i10) {
                return 0;
            }
        }
        z zVar = new z(this.f19295e);
        a5.m.d(zVar);
        String strF2 = zVar.f(o8.d.f19363c);
        long j10 = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strF2)) {
                while (true) {
                    String strF3 = zVar.f(o8.d.f19363c);
                    if (strF3 == null) {
                        break;
                    }
                    if (a5.m.f97a.matcher(strF3).matches()) {
                        do {
                            strF = zVar.f(o8.d.f19363c);
                            if (strF == null) {
                                break;
                            }
                        } while (!strF.isEmpty());
                    } else {
                        Matcher matcher2 = a5.k.f92a.matcher(strF3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = a5.m.c(strGroup);
                long jB = this.f19293b.b(((((j10 + jC2) - jC) * 90000) / 1000000) % 8589934592L);
                w wVarA = a(jB - jC2);
                byte[] bArr3 = this.f19295e;
                int i15 = this.f19296f;
                z zVar2 = this.f19294c;
                zVar2.A(i15, bArr3);
                wVarA.a(this.f19296f, zVar2);
                wVarA.e(jB, 1, this.f19296f, 0, null);
                return -1;
            }
            if (strF2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f19291g.matcher(strF2);
                if (!matcher3.find()) {
                    throw t1.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strF2), null);
                }
                Matcher matcher4 = h.matcher(strF2);
                if (!matcher4.find()) {
                    throw t1.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strF2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = a5.m.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j10 = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strF2 = zVar.f(o8.d.f19363c);
        }
    }

    @Override
    public final void c(m3.m mVar) {
        this.d = mVar;
        mVar.n(new m3.o(-9223372036854775807L));
    }

    @Override
    public final boolean f(m3.l lVar) {
        m3.h hVar = (m3.h) lVar;
        hVar.g(this.f19295e, 0, 6, false);
        byte[] bArr = this.f19295e;
        z zVar = this.f19294c;
        zVar.A(6, bArr);
        if (a5.m.a(zVar)) {
            return true;
        }
        hVar.g(this.f19295e, 6, 3, false);
        zVar.A(9, this.f19295e);
        return a5.m.a(zVar);
    }

    @Override
    public final void g(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override
    public final void release() {
    }
}
