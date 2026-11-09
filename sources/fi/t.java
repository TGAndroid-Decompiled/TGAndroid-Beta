package fi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class t {
    public static ArrayList f12823f;
    public final String f12824a;
    public final int f12825b;
    public final int f12826c;
    public final int[] d;
    public final ArrayList f12827e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f12824a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f12826c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f12825b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f12827e.add(new s(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f12823f == null) {
            ArrayList arrayList = new ArrayList();
            f12823f = arrayList;
            arrayList.add(new t("./."));
            f12823f.add(new t(".."));
            f12823f.add(new t("../."));
            f12823f.add(new t("./.."));
            f12823f.add(new t("././."));
            f12823f.add(new t("..."));
            f12823f.add(new t("../.."));
            f12823f.add(new t("./../.."));
            f12823f.add(new t("../../."));
            f12823f.add(new t("../../.."));
            boolean z9 = org.telegram.messenger.r2.f25212a;
        }
        return f12823f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((t) obj).f12827e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f12824a, ((t) obj).f12824a);
        }
        return false;
    }

    public final String toString() {
        return this.f12824a;
    }
}
