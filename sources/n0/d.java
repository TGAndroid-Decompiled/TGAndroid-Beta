package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
public final class d implements e {
    public static final Locale[] f13678c = new Locale[0];
    public final Locale[] f13679a;
    public final String f13680b;

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
            this.f13679a = f13678c;
            this.f13680b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
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
                    if (i10 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(hc.b.k(i10, "list[", "] is null"));
            }
        }
        this.f13679a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f13680b = sb2.toString();
    }

    @Override
    public final String a() {
        return this.f13680b;
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
        Locale[] localeArr = ((d) obj).f13679a;
        Locale[] localeArr2 = this.f13679a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < localeArr2.length; i10++) {
            if (!localeArr2[i10].equals(localeArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Locale get(int i10) {
        if (i10 >= 0) {
            Locale[] localeArr = this.f13679a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f13679a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override
    public final int size() {
        return this.f13679a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f13679a;
            if (i10 < localeArr.length) {
                sb2.append(localeArr[i10]);
                if (i10 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i10++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
