package org.telegram.messenger;

import java.util.ArrayList;
public final class ej {
    public final CharSequence f23307a;
    public final int f23308b;
    public final int f23309c;
    public final float d;
    public final ArrayList f23310e = new ArrayList();
    public final boolean f23311f;
    public final boolean f23312g;
    public final boolean h;
    public final boolean f23313i;
    public final boolean f23314j;
    public final boolean f23315k;

    public ej(org.telegram.messenger.gj r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ej.<init>(org.telegram.messenger.gj, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(ej ejVar) {
        if (ejVar != null) {
            ArrayList arrayList = ejVar.f23310e;
            int i7 = 0;
            while (true) {
                ArrayList arrayList2 = this.f23310e;
                if (i7 < Math.min(arrayList2.size(), arrayList.size())) {
                    ((dj) arrayList2.get(i7)).H = ((dj) arrayList.get(i7)).H;
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
            ArrayList arrayList = this.f23310e;
            if (i10 < arrayList.size()) {
                int i12 = ((dj) arrayList.get(i10)).f23094f;
                dj djVar = (dj) arrayList.get(i10);
                if (djVar.K && djVar.f()) {
                    i7 = djVar.G;
                } else {
                    i7 = djVar.f23098w;
                }
                i11 += i7 + i12 + ((dj) arrayList.get(i10)).h;
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
            ArrayList arrayList = this.f23310e;
            if (i7 < arrayList.size()) {
                i10 += ((dj) arrayList.get(i7)).j(x1Var) + ((dj) arrayList.get(i7)).f23094f + ((dj) arrayList.get(i7)).h;
                i7++;
            } else {
                return i10;
            }
        }
    }
}
