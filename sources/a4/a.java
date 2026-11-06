package a4;

import f3.b0;
import f3.c0;
import f3.d0;
import h2.m0;
import java.math.BigInteger;
public final class a implements c0 {
    public final b f147a;

    public a(b bVar) {
        this.f147a = bVar;
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final b0 f(long j3) {
        b bVar = this.f147a;
        long j10 = bVar.f149b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f185i * j3) / 1000000);
        long j11 = bVar.f150c;
        d0 d0Var = new d0(j3, m0.j((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f152f)).longValue() + j10) - 30000, bVar.f149b, j11 - 1));
        return new b0(d0Var, d0Var);
    }

    @Override
    public final long h() {
        b bVar = this.f147a;
        return (bVar.f152f * 1000000) / bVar.d.f185i;
    }
}
