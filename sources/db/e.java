package db;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import y5.l;
import za.i;

public final class e extends i {
    public ThickLanguageIdentifier d;

    public final Context f4886e;

    public final cb.a f4887f;

    public final boolean f4888g;

    public e(Context context, cb.a aVar) {
        this.f4886e = context;
        this.f4887f = aVar;
        aVar.getClass();
        this.f4888g = true;
    }

    @Override
    public final void b() throws va.a {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f50291a.d).get()));
        if (this.d == null) {
            this.f4887f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.f4886e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f50291a.d).get()));
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        if (thickLanguageIdentifier != null) {
            thickLanguageIdentifier.c();
            this.d = null;
        }
    }

    public final String e(String str) throws va.a {
        String str2;
        if (this.d == null) {
            b();
        }
        if (str.isEmpty()) {
            return "und";
        }
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        l.h(thickLanguageIdentifier);
        ArrayList arrayListA = thickLanguageIdentifier.a(str);
        int size = arrayListA.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                str2 = "";
                break;
            }
            Object obj = arrayListA.get(i10);
            i10++;
            IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
            if (!"unknown".equals(identifiedLanguage.f4652a)) {
                str2 = identifiedLanguage.f4652a;
                break;
            }
        }
        if (str2.isEmpty()) {
            return "und";
        }
        return "iw".equals(str2) ? "he" : str2;
    }
}
