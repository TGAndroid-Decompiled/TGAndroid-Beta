package cc;

import ai.c1;
import android.content.Context;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import java.util.concurrent.atomic.AtomicLong;
import n6.p;
import rb.g;
import z7.ag;
import z7.yf;
public final class c extends c1 {
    public final g f5088b;

    public c(g gVar) {
        super(6);
        this.f5088b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        yf b10 = ag.b();
        g gVar = this.f5088b;
        Context b11 = gVar.b();
        ?? obj2 = new Object();
        obj2.f51174b = new AtomicLong(-1L);
        obj2.f51173a = new j(b11, p6.b.f44256k, new p("mlkit:vision"), i.f6358c);
        return new f(gVar, (bc.e) obj, b10, obj2);
    }
}
