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
    public final g f5086b;

    public c(g gVar) {
        super(6);
        this.f5086b = gVar;
    }

    @Override
    public final Object Q0(Object obj) {
        xf b10 = zf.b();
        g gVar = this.f5086b;
        Context b11 = gVar.b();
        ?? obj2 = new Object();
        obj2.f51143b = new AtomicLong(-1L);
        obj2.f51142a = new j(b11, p6.b.f44228k, new p("mlkit:vision"), i.f6356c);
        return new f(gVar, (bc.e) obj, b10, obj2);
    }
}
