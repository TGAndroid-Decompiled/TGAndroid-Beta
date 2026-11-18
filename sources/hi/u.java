package hi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class u {
    public static ArrayList f15505f;
    public final String f15506a;
    public final int f15507b;
    public final int f15508c;
    public final int[] d;
    public final ArrayList f15509e = new ArrayList();

    public u(String str) {
        str = str == null ? "." : str;
        this.f15506a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f15508c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f15507b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f15509e.add(new t(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f15505f == null) {
            ArrayList arrayList = new ArrayList();
            f15505f = arrayList;
            arrayList.add(new u("./."));
            f15505f.add(new u(".."));
            f15505f.add(new u("../."));
            f15505f.add(new u("./.."));
            f15505f.add(new u("././."));
            f15505f.add(new u("..."));
            f15505f.add(new u("../.."));
            f15505f.add(new u("./../.."));
            f15505f.add(new u("../../."));
            f15505f.add(new u("../../.."));
            boolean z10 = org.telegram.messenger.s2.f26721a;
        }
        return f15505f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((u) obj).f15509e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return TextUtils.equals(this.f15506a, ((u) obj).f15506a);
        }
        return false;
    }

    public final String toString() {
        return this.f15506a;
    }
}
