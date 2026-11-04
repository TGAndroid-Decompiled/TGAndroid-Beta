package b8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class gf {
    public static LanguageIdentifierImpl a() {
        String a10;
        qb.a aVar = (qb.a) mb.g.c().a(qb.a.class);
        qb.e eVar = aVar.f53824b;
        eVar.getClass();
        x7.b9 b9Var = aVar.f53823a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, b9Var, (Executor) aVar.f53825c.f19226a.get());
        ?? obj = new Object();
        obj.f60313c = languageIdentifierImpl.f7965f;
        p7.d dVar = new p7.d(24, false);
        dVar.d = LanguageIdentifierImpl.k();
        obj.d = new x7.i7(dVar);
        kg kgVar = new kg((za.p) obj, 1);
        Task task = b9Var.f58249e;
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = p6.j.f53268c.a(b9Var.f58251g);
        }
        mb.m.f19245a.execute(new cg(b9Var, kgVar, x7.k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a10, 6));
        ((qb.e) languageIdentifierImpl.d.get()).f19236b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
