package fi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class t {
    public static ArrayList f12824f;
    public final String f12825a;
    public final int f12826b;
    public final int f12827c;
    public final int[] d;
    public final ArrayList f12828e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f12825a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f12827c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f12826b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f12828e.add(new s(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f12824f == null) {
            ArrayList arrayList = new ArrayList();
            f12824f = arrayList;
            arrayList.add(new t("./."));
            f12824f.add(new t(".."));
            f12824f.add(new t("../."));
            f12824f.add(new t("./.."));
            f12824f.add(new t("././."));
            f12824f.add(new t("..."));
            f12824f.add(new t("../.."));
            f12824f.add(new t("./../.."));
            f12824f.add(new t("../../."));
            f12824f.add(new t("../../.."));
            boolean z9 = org.telegram.messenger.r2.f25212a;
        }
        return f12824f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((t) obj).f12828e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f12825a, ((t) obj).f12825a);
        }
        return false;
    }

    public final String toString() {
        return this.f12825a;
    }
}
