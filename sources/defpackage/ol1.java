package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class ol1 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;

    public ol1(Object obj, byte b) {
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
                pl1 pl1Var = (pl1) obj;
                pl1Var.c.setPivotX(textView.getMeasuredWidth() * 0.7f);
                pl1Var.b.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            case 1:
                view.post((da7) obj);
                return;
            case 2:
                yw4 yw4Var = (yw4) obj;
                if (i4 - i2 != i8 - i6) {
                    gm.c3(new ow4(yw4Var, (byte) 2));
                    return;
                }
                return;
            case 3:
                bu5 bu5Var = (bu5) obj;
                if (bu5Var.E()) {
                    bu5Var.P();
                    return;
                }
                return;
            case 4:
                ((mx5) obj).d();
                return;
            case 5:
                ((bm9) obj).a0();
                return;
            case 6:
                ((daa) obj).p0();
                return;
            case 7:
                y1b y1bVar = (y1b) obj;
                qz8 qz8Var = y1bVar.h;
                if (qz8Var != null && qz8Var.getLayout() != null) {
                    y1bVar.G = qz8Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
            case 8:
                mqc mqcVar = (mqc) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    for (lqc lqcVar : mqcVar.f.values()) {
                        lqcVar.K = false;
                    }
                    mqcVar.f0();
                    return;
                }
                return;
            default:
                pqc pqcVar = (pqc) obj;
                if (i4 - i2 < i8 - i6) {
                    ArrayList arrayList = pqcVar.w;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        nsc nscVar = (nsc) obj2;
                        if (nscVar.hasFocus()) {
                            nscVar.requestRectangleOnScreen(new Rect(0, 0, nscVar.getWidth(), nscVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
