package hi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class u {
    public static ArrayList f15508f;
    public final String f15509a;
    public final int f15510b;
    public final int f15511c;
    public final int[] d;
    public final ArrayList f15512e = new ArrayList();

    public u(String str) {
        str = str == null ? "." : str;
        this.f15509a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f15511c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f15510b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f15512e.add(new t(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f15508f == null) {
            ArrayList arrayList = new ArrayList();
            f15508f = arrayList;
            arrayList.add(new u("./."));
            f15508f.add(new u(".."));
            f15508f.add(new u("../."));
            f15508f.add(new u("./.."));
            f15508f.add(new u("././."));
            f15508f.add(new u("..."));
            f15508f.add(new u("../.."));
            f15508f.add(new u("./../.."));
            f15508f.add(new u("../../."));
            f15508f.add(new u("../../.."));
            boolean z10 = org.telegram.messenger.s2.f26723a;
        }
        return f15508f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((u) obj).f15512e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return TextUtils.equals(this.f15509a, ((u) obj).f15509a);
        }
        return false;
    }

    public final String toString() {
        return this.f15509a;
    }
}
