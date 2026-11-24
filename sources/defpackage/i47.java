package defpackage;

import java.util.ArrayList;
public final class i47 {
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

    public i47(defpackage.k47 r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i47.<init>(k47, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(i47 i47Var) {
        if (i47Var != null) {
            ArrayList arrayList = i47Var.e;
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.e;
                if (i < Math.min(arrayList2.size(), arrayList.size())) {
                    ((h47) arrayList2.get(i)).H = ((h47) arrayList.get(i)).H;
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
                int i4 = ((h47) arrayList.get(i2)).f;
                h47 h47Var = (h47) arrayList.get(i2);
                if (h47Var.K && h47Var.f()) {
                    i = h47Var.G;
                } else {
                    i = h47Var.w;
                }
                i3 += i + i4 + ((h47) arrayList.get(i2)).h;
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final int c(yc2 yc2Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i < arrayList.size()) {
                i2 += ((h47) arrayList.get(i)).j(yc2Var) + ((h47) arrayList.get(i)).f + ((h47) arrayList.get(i)).h;
                i++;
            } else {
                return i2;
            }
        }
    }
}
