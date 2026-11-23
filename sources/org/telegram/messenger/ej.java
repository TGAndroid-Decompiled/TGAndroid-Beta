package org.telegram.messenger;

import java.util.ArrayList;
public final class ej {
    public final CharSequence f23682a;
    public final int f23683b;
    public final int f23684c;
    public final float d;
    public final ArrayList f23685e = new ArrayList();
    public final boolean f23686f;
    public final boolean f23687g;
    public final boolean h;
    public final boolean f23688i;
    public final boolean f23689j;
    public final boolean f23690k;

    public ej(org.telegram.messenger.gj r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ej.<init>(org.telegram.messenger.gj, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(ej ejVar) {
        if (ejVar != null) {
            ArrayList arrayList = ejVar.f23685e;
            int i7 = 0;
            while (true) {
                ArrayList arrayList2 = this.f23685e;
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
            ArrayList arrayList = this.f23685e;
            if (i10 < arrayList.size()) {
                int i12 = ((dj) arrayList.get(i10)).f23526f;
                dj djVar = (dj) arrayList.get(i10);
                if (djVar.K && djVar.f()) {
                    i7 = djVar.G;
                } else {
                    i7 = djVar.f23530w;
                }
                i11 += i7 + i12 + ((dj) arrayList.get(i10)).h;
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final int c(org.telegram.ui.Cells.y1 y1Var) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f23685e;
            if (i7 < arrayList.size()) {
                i10 += ((dj) arrayList.get(i7)).j(y1Var) + ((dj) arrayList.get(i7)).f23526f + ((dj) arrayList.get(i7)).h;
                i7++;
            } else {
                return i10;
            }
        }
    }
}
