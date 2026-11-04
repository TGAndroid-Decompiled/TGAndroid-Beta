package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f20113a;

    public f(Object obj) {
        this.f20113a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f20113a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f20113a;
    }

    public final boolean equals(Object obj) {
        return this.f20113a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i3) {
        return this.f20113a.get(i3);
    }

    public final int hashCode() {
        return this.f20113a.hashCode();
    }

    @Override
    public final int size() {
        return this.f20113a.size();
    }

    public final String toString() {
        return this.f20113a.toString();
    }
}
