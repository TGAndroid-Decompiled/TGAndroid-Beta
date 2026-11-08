package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
public final class d implements e {
    public static final Locale[] f20121c = new Locale[0];
    public final Locale[] f20122a;
    public final String f20123b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public d(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f20122a = f20121c;
            this.f20123b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb2.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb2.append('-');
                        sb2.append(locale2.getCountry());
                    }
                    if (i7 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(jg.g.k(i7, "list[", "] is null"));
            }
        }
        this.f20122a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f20123b = sb2.toString();
    }

    @Override
    public final String a() {
        return this.f20123b;
    }

    @Override
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Locale[] localeArr = ((d) obj).f20122a;
        Locale[] localeArr2 = this.f20122a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i7 = 0; i7 < localeArr2.length; i7++) {
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Locale get(int i7) {
        if (i7 >= 0) {
            Locale[] localeArr = this.f20122a;
            if (i7 < localeArr.length) {
                return localeArr[i7];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i7 = 1;
        for (Locale locale : this.f20122a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    @Override
    public final int size() {
        return this.f20122a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f20122a;
            if (i7 < localeArr.length) {
                sb2.append(localeArr[i7]);
                if (i7 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i7++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
