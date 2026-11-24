package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class chb extends b84 {
    public final Rect o;
    public final ehb p;

    public chb(ehb ehbVar, ehb ehbVar2) {
        super(ehbVar2);
        this.p = ehbVar;
        this.o = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        int i;
        ehb ehbVar = this.p;
        int childCount = ehbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xgb d = ehbVar.d(i2);
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
        ehb ehbVar = this.p;
        int childCount = ehbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xgb d = ehbVar.d(i);
            if (d.k > 0 && d.l > 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
    }

    @Override
    public final void l(int i, u4 u4Var) {
        String str;
        Rect rect = this.o;
        if (i >= 0) {
            ehb ehbVar = this.p;
            if (i < ehbVar.getChildCount()) {
                xgb d = ehbVar.d(i);
                int i2 = d.p;
                int i3 = d.q;
                rect.set(i2, i3, d.k + i2, d.l + i3);
                u4Var.h(rect);
                u4Var.i("android.widget.TextView");
                u4Var.a.setEnabled(true);
                wgb wgbVar = d.b;
                if (wgbVar != null) {
                    str = wgbVar.getText();
                } else {
                    str = null;
                }
                u4Var.o((str == null || str.length() == 0) ? " " : " ");
                TL_iv.pageTableCell pagetablecell = d.c;
                if (pagetablecell != null && pagetablecell.header) {
                    u4Var.k(true);
                    return;
                }
                return;
            }
        }
        rect.set(0, 0, 1, 1);
        u4Var.h(rect);
        u4Var.p(false);
        u4Var.j("");
    }
}
