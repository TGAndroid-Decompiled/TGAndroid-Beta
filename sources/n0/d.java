package n0;

import j3.r0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
public final class d implements e {
    public static final Locale[] f18251c = new Locale[0];
    public final Locale[] f18252a;
    public final String f18253b;

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
            this.f18252a = f18251c;
            this.f18253b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb2 = new StringBuilder();
        for (int i9 = 0; i9 < localeArr.length; i9++) {
            Locale locale = localeArr[i9];
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
                    if (i9 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(r0.m(i9, "list[", "] is null"));
            }
        }
        this.f18252a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f18253b = sb2.toString();
    }

    @Override
    public final String a() {
        return this.f18253b;
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
        Locale[] localeArr = ((d) obj).f18252a;
        Locale[] localeArr2 = this.f18252a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i9 = 0; i9 < localeArr2.length; i9++) {
            if (!localeArr2[i9].equals(localeArr[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Locale get(int i9) {
        if (i9 >= 0) {
            Locale[] localeArr = this.f18252a;
            if (i9 < localeArr.length) {
                return localeArr[i9];
            }
            return null;
        }
        return null;
    }

    public final int hashCode() {
        int i9 = 1;
        for (Locale locale : this.f18252a) {
            i9 = (i9 * 31) + locale.hashCode();
        }
        return i9;
    }

    @Override
    public final int size() {
        return this.f18252a.length;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        int i9 = 0;
        while (true) {
            Locale[] localeArr = this.f18252a;
            if (i9 < localeArr.length) {
                sb2.append(localeArr[i9]);
                if (i9 < localeArr.length - 1) {
                    sb2.append(',');
                }
                i9++;
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
