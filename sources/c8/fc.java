package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class fc {
    public static LanguageIdentifierImpl a() {
        String a10;
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.f57763b;
        eVar.getClass();
        y7.e9 e9Var = aVar.f57762a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, e9Var, (Executor) aVar.f57764c.f55641a.get());
        ?? obj = new Object();
        obj.f60751c = languageIdentifierImpl.f7574f;
        y7.s2 s2Var = new y7.s2(2, false);
        s2Var.f61064c = LanguageIdentifierImpl.k();
        obj.d = new y7.l7(s2Var);
        a8.xa xaVar = new a8.xa((xi.e) obj, 1);
        Task task = e9Var.f60930e;
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = q6.j.f56037c.a(e9Var.f60932g);
        }
        pb.n.f55663a.execute(new a8.qa(e9Var, xaVar, y7.m6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a10, 7));
        ((tb.e) languageIdentifierImpl.d.get()).f55651b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
