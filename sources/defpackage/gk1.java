package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class gk1 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;

    public gk1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        TextView textView;
        TextView textView2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hk1 hk1Var = (hk1) obj;
                hk1Var.c.setPivotX(textView.getMeasuredWidth() * 0.7f);
                hk1Var.b.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            case 1:
                view.post((b87) obj);
                return;
            case 2:
                xu4 xu4Var = (xu4) obj;
                if (i4 - i2 != i8 - i6) {
                    gl.c3(new nu4(xu4Var, (byte) 2));
                    return;
                }
                return;
            case 3:
                cs5 cs5Var = (cs5) obj;
                if (cs5Var.E()) {
                    cs5Var.P();
                    return;
                }
                return;
            case 4:
                ((mv5) obj).d();
                return;
            case 5:
                ((ak9) obj).a0();
                return;
            case 6:
                ((d8a) obj).o0();
                return;
            case 7:
                xza xzaVar = (xza) obj;
                px8 px8Var = xzaVar.h;
                if (px8Var != null && px8Var.getLayout() != null) {
                    xzaVar.G = px8Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
            case 8:
                koc kocVar = (koc) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    for (joc jocVar : kocVar.f.values()) {
                        jocVar.K = false;
                    }
                    kocVar.f0();
                    return;
                }
                return;
            default:
                noc nocVar = (noc) obj;
                if (i4 - i2 < i8 - i6) {
                    ArrayList arrayList = nocVar.w;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        lqc lqcVar = (lqc) obj2;
                        if (lqcVar.hasFocus()) {
                            lqcVar.requestRectangleOnScreen(new Rect(0, 0, lqcVar.getWidth(), lqcVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
