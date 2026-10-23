package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f17062a;

    public f(Object obj) {
        this.f17062a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f17062a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f17062a;
    }

    public final boolean equals(Object obj) {
        return this.f17062a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f17062a.get(i10);
    }

    public final int hashCode() {
        return this.f17062a.hashCode();
    }

    @Override
    public final int size() {
        return this.f17062a.size();
    }

    public final String toString() {
        return this.f17062a.toString();
    }
}
