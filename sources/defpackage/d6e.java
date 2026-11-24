package defpackage;

import android.content.Context;
import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import com.google.mlkit.nl.languageid.bundled.internal.ThickLanguageIdentifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
public final class d6e extends je7 {
    public ThickLanguageIdentifier d;
    public final Context e;
    public final u3d f;

    public d6e(Context context, u3d u3dVar) {
        this.e = context;
        this.f = u3dVar;
        u3dVar.getClass();
    }

    @Override
    public final void b() {
        fre.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
        if (this.d == null) {
            this.f.getClass();
            ThickLanguageIdentifier thickLanguageIdentifier = new ThickLanguageIdentifier(this.e);
            this.d = thickLanguageIdentifier;
            thickLanguageIdentifier.b();
        }
    }

    @Override
    public final void c() {
        fre.k(Thread.currentThread().equals(((AtomicReference) this.a.d).get()));
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
            fre.h(thickLanguageIdentifier);
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
