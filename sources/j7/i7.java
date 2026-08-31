package j7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class i7 {
    public static LanguageIdentifierImpl a() {
        String a2;
        gb.a aVar = (gb.a) cb.h.c().a(gb.a.class);
        gb.e eVar = aVar.f6985b;
        eVar.getClass();
        c9 c9Var = aVar.f6984a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, c9Var, (Executor) aVar.f6986c.f2405a.get());
        ?? obj = new Object();
        obj.f4082c = languageIdentifierImpl.f4124f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(24, false);
        eVar2.f528c = LanguageIdentifierImpl.k();
        obj.d = new j7(eVar2);
        b4.e0 e0Var = new b4.e0((com.google.firebase.messaging.s) obj, 1);
        Task task = c9Var.f9578e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = b6.j.f1739c.a(c9Var.f9580g);
        }
        cb.o.f2429a.execute(new c2.p(c9Var, e0Var, m6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, false, 4));
        ((gb.e) languageIdentifierImpl.d.get()).f2416b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
