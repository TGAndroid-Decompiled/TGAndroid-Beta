package n0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import k2.p1;
public final class d implements e {
    public static final Locale[] f20110c = new Locale[0];
    public final Locale[] f20111a;
    public final String f20112b;

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
            this.f20111a = f20110c;
            this.f20112b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < localeArr.length; i3++) {
            Locale locale = localeArr[i3];
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
                    if (i3 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(p1.j(i3, "list[", "] is null"));
            }
        }
        this.f20111a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f20112b = sb2.toString();
    }

    @Override
    public final String a() {
        return this.f20112b;
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
        Locale[] localeArr = ((d) obj).f20111a;
        Locale[] localeArr2 = this.f20111a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < localeArr2.length; i3++) {
            if (!localeArr2[i3].equals(localeArr[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Locale get(int i3) {
        if (i3 >= 0) {
            Locale[] localeArr = this.f20111a;
            if (i3 < localeArr.length) {
                return localeArr[i3];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i3 = 1;
        for (Locale locale : this.f20111a) {
            i3 = (i3 * 31) + locale.hashCode();
        }
        return i3;
    }

    @Override
    public final int size() {
        return this.f20111a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f20111a;
            if (i3 < localeArr.length) {
                sb2.append(localeArr[i3]);
                if (i3 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i3++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
