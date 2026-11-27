package defpackage;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
public final class tae extends tg7 {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final l8d f;

    public tae(Context context, l8d l8dVar) {
        this.e = context;
        this.f = l8dVar;
        l8dVar.getClass();
    }

    @Override
    public final void b() {
        xve.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        xve.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        ThickLanguageIdentifier thickLanguageIdentifier = this.d;
        if (thickLanguageIdentifier != null) {
            thickLanguageIdentifier.c();
            this.d = null;
        }
    }

    public final String e(String str) {
        String str2;
        if (this.d == null) {
            b();
        }
        if (!str.isEmpty()) {
            ThickLanguageIdentifier thickLanguageIdentifier = this.d;
            xve.h(thickLanguageIdentifier);
            ArrayList a = thickLanguageIdentifier.a(str);
            int size = a.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Object obj = a.get(i);
                    i++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.a)) {
                        str2 = identifiedLanguage.a;
                        break;
                    }
                } else {
                    str2 = "";
                    break;
                }
            }
            if (str2.isEmpty()) {
                return "und";
            }
            if ("iw".equals(str2)) {
                return "he";
            }
            return str2;
        }
        return "und";
    }
}
