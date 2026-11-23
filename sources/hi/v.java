package hi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class v {
    public static ArrayList f15587f;
    public final String f15588a;
    public final int f15589b;
    public final int f15590c;
    public final int[] d;
    public final ArrayList f15591e = new ArrayList();

    public v(String str) {
        str = str == null ? "." : str;
        this.f15588a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f15590c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f15589b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f15591e.add(new u(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f15587f == null) {
            ArrayList arrayList = new ArrayList();
            f15587f = arrayList;
            arrayList.add(new v("./."));
            f15587f.add(new v(".."));
            f15587f.add(new v("../."));
            f15587f.add(new v("./.."));
            f15587f.add(new v("././."));
            f15587f.add(new v("..."));
            f15587f.add(new v("../.."));
            f15587f.add(new v("./../.."));
            f15587f.add(new v("../../."));
            f15587f.add(new v("../../.."));
            boolean z10 = org.telegram.messenger.s2.f26730a;
        }
        return f15587f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((v) obj).f15591e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return TextUtils.equals(this.f15588a, ((v) obj).f15588a);
        }
        return false;
    }

    public final String toString() {
        return this.f15588a;
    }
}
