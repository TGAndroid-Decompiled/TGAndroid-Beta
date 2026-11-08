package org.telegram.messenger;

import java.util.ArrayList;
public final class gj {
    public final CharSequence f22677a;
    public final int f22678b;
    public final int f22679c;
    public final float d;
    public final ArrayList f22680e = new ArrayList();
    public final boolean f22681f;
    public final boolean f22682g;
    public final boolean h;
    public final boolean f22683i;
    public final boolean f22684j;
    public final boolean f22685k;

    public gj(org.telegram.messenger.ij r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gj.<init>(org.telegram.messenger.ij, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(gj gjVar) {
        if (gjVar != null) {
            ArrayList arrayList = gjVar.f22680e;
            int i7 = 0;
            while (true) {
                ArrayList arrayList2 = this.f22680e;
                if (i7 < Math.min(arrayList2.size(), arrayList.size())) {
                    ((fj) arrayList2.get(i7)).G = ((fj) arrayList.get(i7)).G;
                    i7++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b() {
        int i7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f22680e;
            if (i10 < arrayList.size()) {
                int i12 = ((fj) arrayList.get(i10)).f22425f;
                fj fjVar = (fj) arrayList.get(i10);
                if (fjVar.J && fjVar.f()) {
                    i7 = fjVar.F;
                } else {
                    i7 = fjVar.f22429w;
                }
                i11 += i7 + i12 + ((fj) arrayList.get(i10)).h;
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final int c(org.telegram.ui.Cells.x1 x1Var) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22680e;
            if (i7 < arrayList.size()) {
                i10 += ((fj) arrayList.get(i7)).j(x1Var) + ((fj) arrayList.get(i7)).f22425f + ((fj) arrayList.get(i7)).h;
                i7++;
            } else {
                return i10;
            }
        }
    }
}
