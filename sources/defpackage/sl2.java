package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
public final class sl2 {
    public static ArrayList f;
    public final String a;
    public final int b;
    public final int c;
    public final int[] d;
    public final ArrayList e = new ArrayList();

    public sl2(String str) {
        str = str == null ? "." : str;
        this.a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.c = length;
        this.d = new int[length];
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            this.d[i2] = split[i2].length();
            i = Math.max(i, split[i2].length());
        }
        this.b = i;
        for (int i3 = 0; i3 < split.length; i3++) {
            for (int i4 = 0; i4 < split[i3].length(); i4++) {
                this.e.add(new rl2(this, i4, i3));
            }
        }
    }

    public static ArrayList a() {
        if (f == null) {
            ArrayList arrayList = new ArrayList();
            f = arrayList;
            arrayList.add(new sl2("./."));
            f.add(new sl2(".."));
            f.add(new sl2("../."));
            f.add(new sl2("./.."));
            f.add(new sl2("././."));
            f.add(new sl2("..."));
            f.add(new sl2("../.."));
            f.add(new sl2("./../.."));
            f.add(new sl2("../../."));
            f.add(new sl2("../../.."));
            boolean z = e21.a;
        }
        return f;
    }

    public static int b() {
        ArrayList a = a();
        int size = a.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = a.get(i2);
            i2++;
            i = Math.max(i, ((sl2) obj).e.size());
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sl2) {
            return TextUtils.equals(this.a, ((sl2) obj).a);
        }
        return false;
    }

    public final String toString() {
        return this.a;
    }
}
