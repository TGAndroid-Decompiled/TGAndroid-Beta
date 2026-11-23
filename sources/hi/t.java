package hi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class t {
    public static ArrayList f15349f;
    public final String f15350a;
    public final int f15351b;
    public final int f15352c;
    public final int[] d;
    public final ArrayList f15353e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f15350a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f15352c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f15351b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f15353e.add(new s(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f15349f == null) {
            ArrayList arrayList = new ArrayList();
            f15349f = arrayList;
            arrayList.add(new t("./."));
            f15349f.add(new t(".."));
            f15349f.add(new t("../."));
            f15349f.add(new t("./.."));
            f15349f.add(new t("././."));
            f15349f.add(new t("..."));
            f15349f.add(new t("../.."));
            f15349f.add(new t("./../.."));
            f15349f.add(new t("../../."));
            f15349f.add(new t("../../.."));
            boolean z10 = org.telegram.messenger.s2.f26694a;
        }
        return f15349f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((t) obj).f15353e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f15350a, ((t) obj).f15350a);
        }
        return false;
    }

    public final String toString() {
        return this.f15350a;
    }
}
