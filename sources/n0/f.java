package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f21055a;

    public f(Object obj) {
        this.f21055a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f21055a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f21055a;
    }

    public final boolean equals(Object obj) {
        return this.f21055a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i7) {
        return this.f21055a.get(i7);
    }

    public final int hashCode() {
        return this.f21055a.hashCode();
    }

    @Override
    public final int size() {
        return this.f21055a.size();
    }

    public final String toString() {
        return this.f21055a.toString();
    }
}
