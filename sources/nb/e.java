package nb;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import jb.i;
import n6.l;
public final class e extends i {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final mb.a f13745f;
    public final boolean f13746g;

    public e(Context context, mb.a aVar) {
        this.e = context;
        this.f13745f = aVar;
        aVar.getClass();
        this.f13746g = true;
    }

    @Override
    public final void b() {
        l.j(Thread.currentThread().equals(((AtomicReference) this.f9787a.d).get()));
        if (this.d == null) {
            this.f13745f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        l.j(Thread.currentThread().equals(((AtomicReference) this.f9787a.d).get()));
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
            l.g(thickLanguageIdentifier);
            ArrayList a2 = thickLanguageIdentifier.a(str);
            int size = a2.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = a2.get(i10);
                    i10++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f5603a)) {
                        str2 = identifiedLanguage.f5603a;
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
