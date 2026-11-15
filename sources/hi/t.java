package hi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class t {
    public static ArrayList f15120f;
    public final String f15121a;
    public final int f15122b;
    public final int f15123c;
    public final int[] d;
    public final ArrayList f15124e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f15121a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f15123c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f15122b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f15124e.add(new s(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f15120f == null) {
            ArrayList arrayList = new ArrayList();
            f15120f = arrayList;
            arrayList.add(new t("./."));
            f15120f.add(new t(".."));
            f15120f.add(new t("../."));
            f15120f.add(new t("./.."));
            f15120f.add(new t("././."));
            f15120f.add(new t("..."));
            f15120f.add(new t("../.."));
            f15120f.add(new t("./../.."));
            f15120f.add(new t("../../."));
            f15120f.add(new t("../../.."));
            boolean z10 = org.telegram.messenger.r2.f26198a;
        }
        return f15120f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((t) obj).f15124e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f15121a, ((t) obj).f15121a);
        }
        return false;
    }

    public final String toString() {
        return this.f15121a;
    }
}
