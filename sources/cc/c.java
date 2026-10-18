package cc;

import ai.c1;
import android.content.Context;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import java.util.concurrent.atomic.AtomicLong;
import n6.p;
import rb.g;
import z7.xf;
import z7.zf;
public final class c extends c1 {
    public final g f5089b;

    public c(g gVar) {
        super(6);
        this.f5089b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        xf b10 = zf.b();
        g gVar = this.f5089b;
        Context b11 = gVar.b();
        ?? obj2 = new Object();
        obj2.f51141b = new AtomicLong(-1L);
        obj2.f51140a = new j(b11, p6.b.f44231k, new p("mlkit:vision"), i.f6357c);
        return new f(gVar, (bc.e) obj, b10, obj2);
    }
}
