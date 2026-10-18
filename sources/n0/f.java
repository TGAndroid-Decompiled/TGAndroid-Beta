package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f16998a;

    public f(Object obj) {
        this.f16998a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f16998a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f16998a;
    }

    public final boolean equals(Object obj) {
        return this.f16998a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f16998a.get(i10);
    }

    public final int hashCode() {
        return this.f16998a.hashCode();
    }

    @Override
    public final int size() {
        return this.f16998a.size();
    }

    public final String toString() {
        return this.f16998a.toString();
    }
}
