package j7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class e7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        gb.a aVar = (gb.a) cb.h.c().a(gb.a.class);
        gb.e eVar = aVar.f6491b;
        eVar.getClass();
        c9 c9Var = aVar.f6490a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, c9Var, (Executor) aVar.f6492c.f2237a.get());
        ?? obj = new Object();
        obj.f4006c = languageIdentifierImpl.f4049f;
        af.d dVar = new af.d(24, false);
        dVar.f160c = LanguageIdentifierImpl.k();
        obj.d = new j7(dVar);
        b4.e0 e0Var = new b4.e0((com.google.firebase.messaging.r) obj, 1);
        Task task = c9Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = b6.j.f1619c.a(c9Var.f8951g);
        }
        cb.o.f2260a.execute(new c2.p(c9Var, e0Var, m6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, false, 4));
        ((gb.e) languageIdentifierImpl.d.get()).f2248b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
