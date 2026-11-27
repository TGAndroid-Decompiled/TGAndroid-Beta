package defpackage;

import android.os.LocaleList;
import java.util.Locale;
public final class tb6 implements sb6 {
    public final LocaleList a;

    public tb6(Object obj) {
        this.a = (LocaleList) obj;
    }

    @Override
    public final String a() {
        return this.a.toLanguageTags();
    }

    @Override
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((sb6) obj).b());
    }

    @Override
    public final Locale get(int i) {
        return this.a.get(i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }
}
