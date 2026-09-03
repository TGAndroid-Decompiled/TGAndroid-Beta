package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import kf.k0;
public final class d implements e {
    public static final Locale[] f14190c = new Locale[0];
    public final Locale[] f14191a;
    public final String f14192b;

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
            this.f14191a = f14190c;
            this.f14192b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i10 = 0; i10 < localeArr.length; i10++) {
            Locale locale = localeArr[i10];
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
                    if (i10 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(k0.k(i10, "list[", "] is null"));
            }
        }
        this.f14191a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f14192b = sb.toString();
    }

    @Override
    public final String a() {
        return this.f14192b;
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
        Locale[] localeArr = ((d) obj).f14191a;
        Locale[] localeArr2 = this.f14191a;
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
            Locale[] localeArr = this.f14191a;
            if (i10 < localeArr.length) {
                return localeArr[i10];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i10 = 1;
        for (Locale locale : this.f14191a) {
            i10 = (i10 * 31) + locale.hashCode();
        }
        return i10;
    }

    @Override
    public final int size() {
        return this.f14191a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i10 = 0;
        while (true) {
            Locale[] localeArr = this.f14191a;
            if (i10 < localeArr.length) {
                sb.append(localeArr[i10]);
                if (i10 < localeArr.length - 1) {
                    sb.append(',');
                }
                i10++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
