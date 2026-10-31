package n0;

import android.os.LocaleList;
import java.util.Locale;
public final class f implements e {
    public final LocaleList f13406a;

    public f(Object obj) {
        this.f13406a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.f13406a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.f13406a;
    }

    public final boolean equals(Object obj) {
        return this.f13406a.equals(((e) obj).b());
    }

    @Override
    public final Locale get(int i10) {
        return this.f13406a.get(i10);
    }

    public final int hashCode() {
        return this.f13406a.hashCode();
    }

    @Override
    public final int size() {
        return this.f13406a.size();
    }

    public final String toString() {
        return this.f13406a.toString();
    }
}
