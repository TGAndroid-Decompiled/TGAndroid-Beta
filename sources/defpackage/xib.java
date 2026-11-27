package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class xib extends m74 {
    public final Rect o;
    public final zib p;

    public xib(zib zibVar, zib zibVar2) {
        super(zibVar2);
        this.p = zibVar;
        this.o = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        int i;
        zib zibVar = this.p;
        int childCount = zibVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            sib d = zibVar.d(i2);
            int i3 = d.k;
            if (i3 > 0 && (i = d.l) > 0) {
                int i4 = d.p;
                if (f >= i4 && f < i4 + i3) {
                    int i5 = d.q;
                    if (f2 >= i5 && f2 < i5 + i) {
                        return i2;
                    }
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override
    public final void h(ArrayList arrayList) {
        zib zibVar = this.p;
        int childCount = zibVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            sib d = zibVar.d(i);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
    }

    @Override
    public final void l(int i, v4 v4Var) {
        String str;
        Rect rect = this.o;
        if (i >= 0) {
            zib zibVar = this.p;
            if (i < zibVar.getChildCount()) {
                sib d = zibVar.d(i);
                int i2 = d.p;
                int i3 = d.q;
                rect.set(i2, i3, d.k + i2, d.l + i3);
                v4Var.h(rect);
                v4Var.i("android.widget.TextView");
                v4Var.a.setEnabled(true);
                rib ribVar = d.b;
                if (ribVar != null) {
                    str = ribVar.getText();
                } else {
                    str = null;
                }
                v4Var.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.c;
                if (pagetablecell != null && pagetablecell.header) {
                    v4Var.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        v4Var.h(rect);
        v4Var.p(false);
        v4Var.j("");
    }
}
