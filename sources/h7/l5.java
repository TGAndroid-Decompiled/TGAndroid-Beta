package h7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;
public abstract class l5 {
    public static LanguageIdentifierImpl a() {
        String a2;
        eb.a aVar = (eb.a) ab.h.c().a(eb.a.class);
        eb.e eVar = aVar.f5845b;
        eVar.getClass();
        a9 a9Var = aVar.f5844a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, a9Var, (Executor) aVar.f5846c.f305a.get());
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(9, false);
        sVar.d = languageIdentifierImpl.f5228f;
        androidx.biometric.e eVar2 = new androidx.biometric.e(17, false);
        eVar2.f1031c = LanguageIdentifierImpl.k();
        sVar.f5187e = new h7(eVar2);
        ag.j2 j2Var = new ag.j2(sVar, 1);
        Task task = a9Var.f7557e;
        if (task.isSuccessful()) {
            a2 = (String) task.getResult();
        } else {
            a2 = z5.i.f50633c.a(a9Var.f7559g);
        }
        ab.q.f333a.execute(new c2.p(a9Var, j2Var, k6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, a2, false, 4));
        ((eb.e) languageIdentifierImpl.d.get()).f316b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
