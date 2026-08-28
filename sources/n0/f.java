package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f18254a;

    public f(Object obj) {
        this.f18254a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f18254a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f18254a;
    }

    public final boolean equals(Object obj) {
        return this.f18254a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i9) {
        return this.f18254a.get(i9);
    }

    public final int hashCode() {
        return this.f18254a.hashCode();
    }

    @Override
    public final int size() {
        return this.f18254a.size();
    }

    public final String toString() {
        return this.f18254a.toString();
    }
}
