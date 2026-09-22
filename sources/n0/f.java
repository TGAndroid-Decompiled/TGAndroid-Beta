package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f14850a;

    public f(Object obj) {
        this.f14850a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f14850a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f14850a;
    }

    public final boolean equals(Object obj) {
        return this.f14850a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f14850a.get(i10);
    }

    public final int hashCode() {
        return this.f14850a.hashCode();
    }

    @Override
    public final int size() {
        return this.f14850a.size();
    }

    public final String toString() {
        return this.f14850a.toString();
    }
}
