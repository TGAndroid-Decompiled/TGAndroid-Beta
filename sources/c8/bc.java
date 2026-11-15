package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class bc {
    public static LanguageIdentifierImpl a() {
        String a10;
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.f57065b;
        eVar.getClass();
        y7.d9 d9Var = aVar.f57064a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, d9Var, (Executor) aVar.f57066c.f54942a.get());
        ?? obj = new Object();
        obj.f60057c = languageIdentifierImpl.f7297f;
        ?? obj2 = new Object();
        obj2.f60246b = LanguageIdentifierImpl.k();
        obj.d = new y7.k7(obj2);
        a8.xa xaVar = new a8.xa((xi.e) obj, 1);
        Task task = d9Var.f60230e;
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = q6.j.f55340c.a(d9Var.f60232g);
        }
        pb.n.f54964a.execute(new a8.qa(d9Var, xaVar, y7.l6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a10, 7));
        ((tb.e) languageIdentifierImpl.d.get()).f54952b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
