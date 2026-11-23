package hi;

import android.text.TextUtils;
import java.util.ArrayList;
public final class c0 {
    public static ArrayList f14246f;
    public final String f14247a;
    public final int f14248b;
    public final int f14249c;
    public final int[] d;
    public final ArrayList f14250e = new ArrayList();

    public c0(String str) {
        str = str == null ? "." : str;
        this.f14247a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f14249c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.f14248b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f14250e.add(new b0(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f14246f == null) {
            ArrayList arrayList = new ArrayList();
            f14246f = arrayList;
            arrayList.add(new c0("./."));
            f14246f.add(new c0(".."));
            f14246f.add(new c0("../."));
            f14246f.add(new c0("./.."));
            f14246f.add(new c0("././."));
            f14246f.add(new c0("..."));
            f14246f.add(new c0("../.."));
            f14246f.add(new c0("./../.."));
            f14246f.add(new c0("../../."));
            f14246f.add(new c0("../../.."));
            boolean z10 = org.telegram.messenger.s2.f26829a;
        }
        return f14246f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((c0) obj).f14250e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return TextUtils.equals(this.f14247a, ((c0) obj).f14247a);
        }
        return false;
    }

    public final String toString() {
        return this.f14247a;
    }
}
