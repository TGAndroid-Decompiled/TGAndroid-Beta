package defpackage;

import java.util.ArrayList;
public final class p47 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final float d;
    public final ArrayList e = new ArrayList();
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public p47(defpackage.r47 r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p47.<init>(r47, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(p47 p47Var) {
        if (p47Var != null) {
            ArrayList arrayList = p47Var.e;
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.e;
                if (i < Math.min(arrayList2.size(), arrayList.size())) {
                    ((o47) arrayList2.get(i)).H = ((o47) arrayList.get(i)).H;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 < arrayList.size()) {
                int i4 = ((o47) arrayList.get(i2)).f;
                o47 o47Var = (o47) arrayList.get(i2);
                if (o47Var.K && o47Var.f()) {
                    i = o47Var.G;
                } else {
                    i = o47Var.w;
                }
                i3 += i + i4 + ((o47) arrayList.get(i2)).h;
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final int c(dc2 dc2Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                i2 += ((o47) arrayList.get(i)).j(dc2Var) + ((o47) arrayList.get(i)).f + ((o47) arrayList.get(i)).h;
                i++;
            } else {
                return i2;
            }
        }
    }
}
