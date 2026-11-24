package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class cfb extends s64 {
    public final Rect o;
    public final efb p;

    public cfb(efb efbVar, efb efbVar2) {
        super(efbVar2);
        this.p = efbVar;
        this.o = new Rect();
    }

    @Override
    public final int g(float f, float f2) {
        int i;
        efb efbVar = this.p;
        int childCount = efbVar.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            xeb d = efbVar.d(i2);
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
        efb efbVar = this.p;
        int childCount = efbVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            xeb d = efbVar.d(i);
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
            efb efbVar = this.p;
            if (i < efbVar.getChildCount()) {
                xeb d = efbVar.d(i);
                int i2 = d.p;
                int i3 = d.q;
                rect.set(i2, i3, d.k + i2, d.l + i3);
                u4Var.h(rect);
                u4Var.i("android.widget.TextView");
                u4Var.a.setEnabled(true);
                web webVar = d.b;
                if (webVar != null) {
                    str = webVar.getText();
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
