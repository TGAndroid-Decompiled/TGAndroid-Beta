package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class u {
    public static ArrayList f16114f;
    public final String f16115a;
    public final int f16116b;
    public final int f16117c;
    public final int[] d;
    public final ArrayList f16118e = new ArrayList();

    public u(String str) {
        str = str == null ? "." : str;
        this.f16115a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f16117c = length;
        this.d = new int[length];
        int i9 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i9 = Math.max(i9, split[i10].length());
        }
        this.f16116b = i9;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.f16118e.add(new t(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f16114f == null) {
            ArrayList arrayList = new ArrayList();
            f16114f = arrayList;
            arrayList.add(new u("./."));
            f16114f.add(new u(".."));
            f16114f.add(new u("../."));
            f16114f.add(new u("./.."));
            f16114f.add(new u("././."));
            f16114f.add(new u("..."));
            f16114f.add(new u("../.."));
            f16114f.add(new u("./../.."));
            f16114f.add(new u("../../."));
            f16114f.add(new u("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f16114f.add(new u("../../../.."));
                f16114f.add(new u(".../.../..."));
                f16114f.add(new u("..../..../...."));
                f16114f.add(new u(".../.../.../..."));
            }
        }
        return f16114f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a2.get(i10);
            i10++;
            i9 = Math.max(i9, ((u) obj).f16118e.size());
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return TextUtils.equals(this.f16115a, ((u) obj).f16115a);
        }
        return false;
    }

    public final String toString() {
        return this.f16115a;
    }
}
