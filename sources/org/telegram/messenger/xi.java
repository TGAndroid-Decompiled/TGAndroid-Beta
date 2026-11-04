package org.telegram.messenger;

import java.util.ArrayList;
public final class xi {
    public final CharSequence f26384a;
    public final int f26385b;
    public final int f26386c;
    public final float d;
    public final ArrayList f26387e = new ArrayList();
    public final boolean f26388f;
    public final boolean f26389g;
    public final boolean h;
    public final boolean f26390i;
    public final boolean f26391j;
    public final boolean f26392k;

    public xi(org.telegram.messenger.zi r37, java.lang.CharSequence r38, android.text.TextPaint r39, int r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xi.<init>(org.telegram.messenger.zi, java.lang.CharSequence, android.text.TextPaint, int):void");
    }

    public final void a(xi xiVar) {
        if (xiVar != null) {
            ArrayList arrayList = xiVar.f26387e;
            int i3 = 0;
            while (true) {
                ArrayList arrayList2 = this.f26387e;
                if (i3 < Math.min(arrayList2.size(), arrayList.size())) {
                    ((wi) arrayList2.get(i3)).H = ((wi) arrayList.get(i3)).H;
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final int b() {
        int i3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f26387e;
            if (i10 < arrayList.size()) {
                int i12 = ((wi) arrayList.get(i10)).f26211f;
                wi wiVar = (wi) arrayList.get(i10);
                if (wiVar.K && wiVar.f()) {
                    i3 = wiVar.G;
                } else {
                    i3 = wiVar.f26215w;
                }
                i11 += i3 + i12 + ((wi) arrayList.get(i10)).h;
                i10++;
            } else {
                return i11;
            }
        }
    }

    public final int c(org.telegram.ui.Cells.x1 x1Var) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26387e;
            if (i3 < arrayList.size()) {
                i10 += ((wi) arrayList.get(i3)).j(x1Var) + ((wi) arrayList.get(i3)).f26211f + ((wi) arrayList.get(i3)).h;
                i3++;
            } else {
                return i10;
            }
        }
    }
}
