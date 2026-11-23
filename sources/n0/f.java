package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f21145a;

    public f(Object obj) {
        this.f21145a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f21145a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f21145a;
    }

    public final boolean equals(Object obj) {
        return this.f21145a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i7) {
        return this.f21145a.get(i7);
    }

    public final int hashCode() {
        return this.f21145a.hashCode();
    }

    @Override
    public final int size() {
        return this.f21145a.size();
    }

    public final String toString() {
        return this.f21145a.toString();
    }
}
