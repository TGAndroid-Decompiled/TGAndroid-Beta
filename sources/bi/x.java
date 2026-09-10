package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;
public final class x {
    public static ArrayList f3851f;
    public final String f3852a;
    public final int f3853b;
    public final int f3854c;
    public final int[] d;
    public final ArrayList e = new ArrayList();

    public x(String str) {
        str = str == null ? "." : str;
        this.f3852a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.f3854c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.f3853b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.e.add(new w(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f3851f == null) {
            ArrayList arrayList = new ArrayList();
            f3851f = arrayList;
            arrayList.add(new x("./."));
            f3851f.add(new x(".."));
            f3851f.add(new x("../."));
            f3851f.add(new x("./.."));
            f3851f.add(new x("././."));
            f3851f.add(new x("..."));
            f3851f.add(new x("../.."));
            f3851f.add(new x("./../.."));
            f3851f.add(new x("../../."));
            f3851f.add(new x("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f3851f.add(new x("../../../.."));
                f3851f.add(new x(".../.../..."));
                f3851f.add(new x("..../..../...."));
                f3851f.add(new x(".../.../.../..."));
            }
        }
        return f3851f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((x) obj).e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return TextUtils.equals(this.f3852a, ((x) obj).f3852a);
        }
        return false;
    }

    public final String toString() {
        return this.f3852a;
    }
}
