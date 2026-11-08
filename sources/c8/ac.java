package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class ac {
    public static LanguageIdentifierImpl a() {
        String a10;
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.f55470b;
        eVar.getClass();
        y7.e9 e9Var = aVar.f55469a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, e9Var, (Executor) aVar.f55471c.f53525a.get());
        ab.b0 b0Var = new ab.b0(15, false);
        b0Var.d = languageIdentifierImpl.f7910f;
        ?? obj = new Object();
        obj.f59002b = LanguageIdentifierImpl.k();
        b0Var.f909e = new y7.l7(obj);
        a8.wa waVar = new a8.wa(b0Var, 1);
        Task task = e9Var.f59017e;
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = q6.j.f53891c.a(e9Var.f59019g);
        }
        pb.m.f53544a.execute(new a8.pa(e9Var, waVar, y7.n6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a10, 7));
        ((tb.e) languageIdentifierImpl.d.get()).f53535b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
