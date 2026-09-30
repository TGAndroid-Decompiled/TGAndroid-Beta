package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f15094a;

    public f(Object obj) {
        this.f15094a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f15094a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f15094a;
    }

    public final boolean equals(Object obj) {
        return this.f15094a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f15094a.get(i10);
    }

    public final int hashCode() {
        return this.f15094a.hashCode();
    }

    @Override
    public final int size() {
        return this.f15094a.size();
    }

    public final String toString() {
        return this.f15094a.toString();
    }
}
