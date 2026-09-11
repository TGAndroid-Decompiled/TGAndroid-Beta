package di;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class t {
    public static ArrayList f8147f;
    public final String f8148a;
    public final int f8149b;
    public final int f8150c;
    public final int[] d;
    public final ArrayList f8151e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f8148a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f8150c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.f8149b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.f8151e.add(new s(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f8147f == null) {
            ArrayList arrayList = new ArrayList();
            f8147f = arrayList;
            arrayList.add(new t("./."));
            f8147f.add(new t(".."));
            f8147f.add(new t("../."));
            f8147f.add(new t("./.."));
            f8147f.add(new t("././."));
            f8147f.add(new t("..."));
            f8147f.add(new t("../.."));
            f8147f.add(new t("./../.."));
            f8147f.add(new t("../../."));
            f8147f.add(new t("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f8147f.add(new t("../../../.."));
                f8147f.add(new t(".../.../..."));
                f8147f.add(new t("..../..../...."));
                f8147f.add(new t(".../.../.../..."));
            }
        }
        return f8147f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((t) obj).f8151e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f8148a, ((t) obj).f8148a);
        }
        return false;
    }

    public final String toString() {
        return this.f8148a;
    }
}
