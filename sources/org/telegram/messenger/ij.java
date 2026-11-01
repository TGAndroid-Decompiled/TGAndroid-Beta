package org.telegram.messenger;

import java.util.ArrayList;
public final class ij {
    public final CharSequence f16294a;
    public final int f16295b;
    public final int f16296c;
    public final float d;
    public final ArrayList e = new ArrayList();
    public final boolean f16297f;
    public final boolean f16298g;
    public final boolean h;
    public final boolean f16299i;
    public final boolean f16300j;
    public final boolean f16301k;

    public ij(org.telegram.messenger.kj r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ij.<init>(org.telegram.messenger.kj, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(ij ijVar) {
        if (ijVar != null) {
            ArrayList arrayList = ijVar.e;
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.e;
                if (i10 < Math.min(arrayList2.size(), arrayList.size())) {
                    ((hj) arrayList2.get(i10)).G = ((hj) arrayList.get(i10)).G;
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
                int i13 = ((hj) arrayList.get(i11)).f16066f;
                hj hjVar = (hj) arrayList.get(i11);
                if (hjVar.J && hjVar.f()) {
                    i10 = hjVar.F;
                } else {
                    i10 = hjVar.f16070w;
                }
                i12 += i10 + i13 + ((hj) arrayList.get(i11)).h;
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
                i11 += ((hj) arrayList.get(i10)).j(x1Var) + ((hj) arrayList.get(i10)).f16066f + ((hj) arrayList.get(i10)).h;
                i10++;
            } else {
                return i11;
            }
        }
    }
}
