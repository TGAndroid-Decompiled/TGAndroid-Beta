package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f16487a;

    public f(Object obj) {
        this.f16487a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f16487a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f16487a;
    }

    public final boolean equals(Object obj) {
        return this.f16487a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f16487a.get(i10);
    }

    public final int hashCode() {
        return this.f16487a.hashCode();
    }

    @Override
    public final int size() {
        return this.f16487a.size();
    }

    public final String toString() {
        return this.f16487a.toString();
    }
}
