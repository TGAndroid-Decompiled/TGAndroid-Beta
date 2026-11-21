package org.telegram.messenger;

import java.util.ArrayList;
public final class dj {
    public final CharSequence f23558a;
    public final int f23559b;
    public final int f23560c;
    public final float d;
    public final ArrayList f23561e = new ArrayList();
    public final boolean f23562f;
    public final boolean f23563g;
    public final boolean h;
    public final boolean f23564i;
    public final boolean f23565j;
    public final boolean f23566k;

    public dj(org.telegram.messenger.fj r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dj.<init>(org.telegram.messenger.fj, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(dj djVar) {
        if (djVar != null) {
            ArrayList arrayList = djVar.f23561e;
            int i7 = 0;
            while (true) {
                ArrayList arrayList2 = this.f23561e;
                if (i7 < Math.min(arrayList2.size(), arrayList.size())) {
                    ((cj) arrayList2.get(i7)).H = ((cj) arrayList.get(i7)).H;
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
            ArrayList arrayList = this.f23561e;
            if (i10 < arrayList.size()) {
                int i12 = ((cj) arrayList.get(i10)).f23390f;
                cj cjVar = (cj) arrayList.get(i10);
                if (cjVar.K && cjVar.f()) {
                    i7 = cjVar.G;
                } else {
                    i7 = cjVar.f23394w;
                }
                i11 += i7 + i12 + ((cj) arrayList.get(i10)).h;
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
            ArrayList arrayList = this.f23561e;
            if (i7 < arrayList.size()) {
                i10 += ((cj) arrayList.get(i7)).j(y1Var) + ((cj) arrayList.get(i7)).f23390f + ((cj) arrayList.get(i7)).h;
                i7++;
            } else {
                return i10;
            }
        }
    }
}
