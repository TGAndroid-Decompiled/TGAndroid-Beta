package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class t {
    public static ArrayList f5936f;
    public final String f5937a;
    public final int f5938b;
    public final int f5939c;
    public final int[] d;
    public final ArrayList f5940e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f5937a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f5939c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.f5938b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.f5940e.add(new s(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f5936f == null) {
            ArrayList arrayList = new ArrayList();
            f5936f = arrayList;
            arrayList.add(new t("./."));
            f5936f.add(new t(".."));
            f5936f.add(new t("../."));
            f5936f.add(new t("./.."));
            f5936f.add(new t("././."));
            f5936f.add(new t("..."));
            f5936f.add(new t("../.."));
            f5936f.add(new t("./../.."));
            f5936f.add(new t("../../."));
            f5936f.add(new t("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f5936f.add(new t("../../../.."));
                f5936f.add(new t(".../.../..."));
                f5936f.add(new t("..../..../...."));
                f5936f.add(new t(".../.../.../..."));
            }
        }
        return f5936f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((t) obj).f5940e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f5937a, ((t) obj).f5937a);
        }
        return false;
    }

    public final String toString() {
        return this.f5937a;
    }
}
