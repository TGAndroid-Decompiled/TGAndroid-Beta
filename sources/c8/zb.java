package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class zb {
    public static LanguageIdentifierImpl a() {
        String a10;
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.f55379b;
        eVar.getClass();
        y7.e9 e9Var = aVar.f55378a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, e9Var, (Executor) aVar.f55380c.f53434a.get());
        ab.b0 b0Var = new ab.b0(15, false);
        b0Var.d = languageIdentifierImpl.f7910f;
        ?? obj = new Object();
        obj.f58908b = LanguageIdentifierImpl.k();
        b0Var.f909e = new y7.l7(obj);
        a8.wa waVar = new a8.wa(b0Var, 1);
        Task task = e9Var.f58923e;
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = q6.j.f53799c.a(e9Var.f58925g);
        }
        pb.m.f53453a.execute(new a8.pa(e9Var, waVar, y7.n6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a10, 7));
        ((tb.e) languageIdentifierImpl.d.get()).f53444b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
