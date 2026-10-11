package ci;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class t {
    public static ArrayList f5972f;
    public final String f5973a;
    public final int f5974b;
    public final int f5975c;
    public final int[] d;
    public final ArrayList f5976e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.f5973a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f5975c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.f5974b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.f5976e.add(new s(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f5972f == null) {
            ArrayList arrayList = new ArrayList();
            f5972f = arrayList;
            arrayList.add(new t("./."));
            f5972f.add(new t(".."));
            f5972f.add(new t("../."));
            f5972f.add(new t("./.."));
            f5972f.add(new t("././."));
            f5972f.add(new t("..."));
            f5972f.add(new t("../.."));
            f5972f.add(new t("./../.."));
            f5972f.add(new t("../../."));
            f5972f.add(new t("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f5972f.add(new t("../../../.."));
                f5972f.add(new t(".../.../..."));
                f5972f.add(new t("..../..../...."));
                f5972f.add(new t(".../.../.../..."));
            }
        }
        return f5972f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((t) obj).f5976e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return TextUtils.equals(this.f5973a, ((t) obj).f5973a);
        }
        return false;
    }

    public final String toString() {
        return this.f5973a;
    }
}
