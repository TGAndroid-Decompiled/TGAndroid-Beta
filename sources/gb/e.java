package gb;

import android.content.Context;
import b6.m;
import cb.j;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
public final class e extends j {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final fb.a f6500f;
    public final boolean f6501g;

    public e(Context context, fb.a aVar) {
        this.e = context;
        this.f6500f = aVar;
        aVar.getClass();
        this.f6501g = true;
    }

    @Override
    public final void b() {
        m.k(Thread.currentThread().equals(((AtomicReference) this.f2224a.d).get()));
        if (this.d == null) {
            this.f6500f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        m.k(Thread.currentThread().equals(((AtomicReference) this.f2224a.d).get()));
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
            m.h(thickLanguageIdentifier);
            ArrayList a2 = thickLanguageIdentifier.a(str);
            int size = a2.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = a2.get(i10);
                    i10++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f4060a)) {
                        str2 = identifiedLanguage.f4060a;
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
