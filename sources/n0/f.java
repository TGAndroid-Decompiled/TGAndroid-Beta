package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f16999a;

    public f(Object obj) {
        this.f16999a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f16999a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f16999a;
    }

    public final boolean equals(Object obj) {
        return this.f16999a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f16999a.get(i10);
    }

    public final int hashCode() {
        return this.f16999a.hashCode();
    }

    @Override
    public final int size() {
        return this.f16999a.size();
    }

    public final String toString() {
        return this.f16999a.toString();
    }
}
