package org.telegram.messenger;

import java.util.ArrayList;
public final class hj {
    public final CharSequence f15901a;
    public final int f15902b;
    public final int f15903c;
    public final float d;
    public final ArrayList e = new ArrayList();
    public final boolean f15904f;
    public final boolean f15905g;
    public final boolean h;
    public final boolean f15906i;
    public final boolean f15907j;
    public final boolean f15908k;

    public hj(org.telegram.messenger.jj r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hj.<init>(org.telegram.messenger.jj, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(hj hjVar) {
        if (hjVar != null) {
            ArrayList arrayList = hjVar.e;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.e;
                if (i10 < Math.min(arrayList2.size(), arrayList.size())) {
                    ((gj) arrayList2.get(i10)).G = ((gj) arrayList.get(i10)).G;
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b() {
        int i10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 < arrayList.size()) {
                int i13 = ((gj) arrayList.get(i11)).f15717f;
                gj gjVar = (gj) arrayList.get(i11);
                if (gjVar.J && gjVar.f()) {
                    i10 = gjVar.F;
                } else {
                    i10 = gjVar.f15721w;
                }
                i12 += i10 + i13 + ((gj) arrayList.get(i11)).h;
                i11++;
            } else {
                return i12;
            }
        }
    }

    public final int c(org.telegram.ui.Cells.x1 x1Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                i11 += ((gj) arrayList.get(i10)).j(x1Var) + ((gj) arrayList.get(i10)).f15717f + ((gj) arrayList.get(i10)).h;
                i10++;
            } else {
                return i11;
            }
        }
    }
}
