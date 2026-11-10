package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f20129a;

    public f(Object obj) {
        this.f20129a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f20129a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f20129a;
    }

    public final boolean equals(Object obj) {
        return this.f20129a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i7) {
        return this.f20129a.get(i7);
    }

    public final int hashCode() {
        return this.f20129a.hashCode();
    }

    @Override
    public final int size() {
        return this.f20129a.size();
    }

    public final String toString() {
        return this.f20129a.toString();
    }
}
