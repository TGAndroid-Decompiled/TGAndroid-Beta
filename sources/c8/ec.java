package c8;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class ec {
    public static LanguageIdentifierImpl a() {
        String a10;
        tb.a aVar = (tb.a) pb.g.c().a(tb.a.class);
        tb.e eVar = aVar.f57684b;
        eVar.getClass();
        y7.d9 d9Var = aVar.f57683a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, d9Var, (Executor) aVar.f57685c.f55563a.get());
        ?? obj = new Object();
        obj.f60668c = languageIdentifierImpl.f7612f;
        ?? obj2 = new Object();
        obj2.f60857b = LanguageIdentifierImpl.k();
        obj.d = new y7.k7(obj2);
        a8.xa xaVar = new a8.xa((xi.e) obj, 1);
        Task task = d9Var.f60841e;
        if (task.isSuccessful()) {
            a10 = (String) task.getResult();
        } else {
            a10 = q6.j.f55959c.a(d9Var.f60843g);
        }
        pb.n.f55585a.execute(new a8.qa(d9Var, xaVar, y7.l6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a10, 7));
        ((tb.e) languageIdentifierImpl.d.get()).f55573b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
