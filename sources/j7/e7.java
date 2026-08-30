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
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, c9Var, (Executor) aVar.f6492c.f2214a.get());
        com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(9, false);
        rVar.d = languageIdentifierImpl.f4068f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(24, false);
        eVar2.f479c = LanguageIdentifierImpl.k();
        rVar.e = new j7(eVar2);
        b4.e0 e0Var = new b4.e0(rVar, 1);
        Task task = c9Var.e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = b6.j.f1608c.a(c9Var.f8969g);
        }
        cb.o.f2237a.execute(new c2.p(c9Var, e0Var, m6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, false, 4));
        ((gb.e) languageIdentifierImpl.d.get()).f2225b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
