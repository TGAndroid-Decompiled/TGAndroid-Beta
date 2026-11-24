package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
public final class mb6 implements nb6 {
    public static final Locale[] c = new Locale[0];
    public final Locale[] a;
    public final String b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        lb6 lb6Var = lb6.b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            u36.j("Can not parse language tag: [en-Latn]");
        }
    }

    public mb6(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                gxc.d(td4.o(i, "list[", "] is null"));
                throw null;
            }
        }
        this.a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.b = sb.toString();
    }

    @Override
    public final String a() {
        return this.b;
    }

    @Override
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mb6)) {
            return false;
        }
        Locale[] localeArr = ((mb6) obj).a;
        Locale[] localeArr2 = this.a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override
    public final int size() {
        return this.a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
