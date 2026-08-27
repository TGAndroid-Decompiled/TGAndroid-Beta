package lh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;

public final class u {

    public static ArrayList f16881f;

    public final String f16882a;

    public final int f16883b;

    public final int f16884c;
    public final int[] d;

    public final ArrayList f16885e = new ArrayList();

    public u(String str) {
        str = str == null ? "." : str;
        this.f16882a = str;
        String[] strArrSplit = str.split("/");
        int length = strArrSplit.length;
        this.f16884c = length;
        this.d = new int[length];
        int iMax = 0;
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            this.d[i10] = strArrSplit[i10].length();
            iMax = Math.max(iMax, strArrSplit[i10].length());
        }
        this.f16883b = iMax;
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            for (int i12 = 0; i12 < strArrSplit[i11].length(); i12++) {
                this.f16885e.add(new t(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f16881f == null) {
            ArrayList arrayList = new ArrayList();
            f16881f = arrayList;
            arrayList.add(new u("./."));
            f16881f.add(new u(".."));
            f16881f.add(new u("../."));
            f16881f.add(new u("./.."));
            f16881f.add(new u("././."));
            f16881f.add(new u("..."));
            f16881f.add(new u("../.."));
            f16881f.add(new u("./../.."));
            f16881f.add(new u("../../."));
            f16881f.add(new u("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f16881f.add(new u("../../../.."));
                f16881f.add(new u(".../.../..."));
                f16881f.add(new u("..../..../...."));
                f16881f.add(new u(".../.../.../..."));
            }
        }
        return f16881f;
    }

    public static int b() {
        ArrayList arrayListA = a();
        int size = arrayListA.size();
        int iMax = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListA.get(i10);
            i10++;
            iMax = Math.max(iMax, ((u) obj).f16885e.size());
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        return TextUtils.equals(this.f16882a, ((u) obj).f16882a);
    }

    public final String toString() {
        return this.f16882a;
    }
}
