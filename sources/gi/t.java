package gi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class t {
    public static ArrayList f13585f;
    public final String f13586a;
    public final int f13587b;
    public final int f13588c;
    public final int[] d;
    public final ArrayList f13589e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f13586a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f13588c = length;
        this.d = new int[length];
        int i3 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i3 = Math.max(i3, split[i10].length());
        }
        this.f13587b = i3;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f13589e.add(new s(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f13585f == null) {
            ArrayList arrayList = new ArrayList();
            f13585f = arrayList;
            arrayList.add(new t("./."));
            f13585f.add(new t(".."));
            f13585f.add(new t("../."));
            f13585f.add(new t("./.."));
            f13585f.add(new t("././."));
            f13585f.add(new t("..."));
            f13585f.add(new t("../.."));
            f13585f.add(new t("./../.."));
            f13585f.add(new t("../../."));
            f13585f.add(new t("../../.."));
            boolean z10 = org.telegram.messenger.r2.f25040a;
        }
        return f13585f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i3 = Math.max(i3, ((t) obj).f13589e.size());
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f13586a, ((t) obj).f13586a);
        }
        return false;
    }

    public final String toString() {
        return this.f13586a;
    }
}
