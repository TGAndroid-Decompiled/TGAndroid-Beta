package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f16491a;

    public f(Object obj) {
        this.f16491a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f16491a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f16491a;
    }

    public final boolean equals(Object obj) {
        return this.f16491a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f16491a.get(i10);
    }

    public final int hashCode() {
        return this.f16491a.hashCode();
    }

    @Override
    public final int size() {
        return this.f16491a.size();
    }

    public final String toString() {
        return this.f16491a.toString();
    }
}
