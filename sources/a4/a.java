package a4;

import f3.a0;
import f3.b0;
import f3.c0;
import h2.l0;
import java.math.BigInteger;
public final class a implements b0 {
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
    public final a0 f(long j3) {
        b bVar = this.f147a;
        long j10 = bVar.f149b;
        BigInteger valueOf = BigInteger.valueOf((bVar.d.f185i * j3) / 1000000);
        long j11 = bVar.f150c;
        c0 c0Var = new c0(j3, l0.j((valueOf.multiply(BigInteger.valueOf(j11 - j10)).divide(BigInteger.valueOf(bVar.f152f)).longValue() + j10) - 30000, bVar.f149b, j11 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override
    public final long h() {
        b bVar = this.f147a;
        return (bVar.f152f * 1000000) / bVar.d.f185i;
    }
}
