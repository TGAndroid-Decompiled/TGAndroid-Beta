package g7;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.nl.languageid.internal.LanguageIdentifierImpl;
import java.util.concurrent.Executor;

public abstract class g0 {
    public static LanguageIdentifierImpl a() {
        db.a aVar = (db.a) za.g.c().a(db.a.class);
        db.e eVar = aVar.f4877b;
        eVar.getClass();
        b9 b9Var = aVar.f4876a;
        LanguageIdentifierImpl languageIdentifierImpl = new LanguageIdentifierImpl(eVar, b9Var, (Executor) aVar.f4878c.f50282a.get());
        com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(8, false);
        tVar.d = languageIdentifierImpl.f4661f;
        a5.n nVar = new a5.n(17, false);
        nVar.f101c = LanguageIdentifierImpl.k();
        tVar.f4621e = new h7(nVar);
        b6.a aVar2 = new b6.a(tVar, 1);
        Task task = b9Var.f6423e;
        String strA = task.isSuccessful() ? (String) task.getResult() : y5.i.f49650c.a(b9Var.f6425g);
        za.m.f50301a.execute(new bf.e(b9Var, aVar2, l6.ON_DEVICE_LANGUAGE_IDENTIFICATION_CREATE, strA, false, 4));
        ((db.e) languageIdentifierImpl.d.get()).f50292b.incrementAndGet();
        return languageIdentifierImpl;
    }
}
