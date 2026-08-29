package eb;

import ab.j;
import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import z5.l;
public final class e extends j {
    public ThickLanguageIdentifier d;
    public final Context f5854e;
    public final db.a f5855f;
    public final boolean f5856g;

    public e(Context context, db.a aVar) {
        this.f5854e = context;
        this.f5855f = aVar;
        aVar.getClass();
        this.f5856g = true;
    }

    @Override
    public final void b() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f315a.d).get()));
        if (this.d == null) {
            this.f5855f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.f5854e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        l.k(Thread.currentThread().equals(((AtomicReference) this.f315a.d).get()));
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
            l.h(thickLanguageIdentifier);
            ArrayList a2 = thickLanguageIdentifier.a(str);
            int size = a2.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = a2.get(i10);
                    i10++;
                    IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
                    if (!"unknown".equals(identifiedLanguage.f5219a)) {
                        str2 = identifiedLanguage.f5219a;
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
