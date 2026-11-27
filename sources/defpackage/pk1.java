package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
public final class pk1 implements View.OnLayoutChangeListener {
    public final byte a;
    public final Object b;

    public pk1(Object obj, byte b) {
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
                qk1 qk1Var = (qk1) obj;
                qk1Var.c.setPivotX(textView.getMeasuredWidth() * 0.7f);
                qk1Var.b.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
            case 1:
                view.post((la7) obj);
                return;
            case 2:
                bx4 bx4Var = (bx4) obj;
                if (i4 - i2 != i8 - i6) {
                    hl.c3(new qw4(bx4Var, (byte) 2));
                    return;
                }
                return;
            case 3:
                fu5 fu5Var = (fu5) obj;
                if (fu5Var.E()) {
                    fu5Var.P();
                    return;
                }
                return;
            case 4:
                ((rx5) obj).d();
                return;
            case 5:
                ((on9) obj).a0();
                return;
            case 6:
                ((tba) obj).o0();
                return;
            case 7:
                u3b u3bVar = (u3b) obj;
                c19 c19Var = u3bVar.h;
                if (c19Var != null && c19Var.getLayout() != null) {
                    u3bVar.G = c19Var.getLayout().getLineWidth(0);
                    return;
                }
                return;
            case 8:
                wsc wscVar = (wsc) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    for (vsc vscVar : wscVar.f.values()) {
                        vscVar.K = false;
                    }
                    wscVar.f0();
                    return;
                }
                return;
            default:
                atc atcVar = (atc) obj;
                if (i4 - i2 < i8 - i6) {
                    ArrayList arrayList = atcVar.w;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj2 = arrayList.get(i9);
                        i9++;
                        zuc zucVar = (zuc) obj2;
                        if (zucVar.hasFocus()) {
                            zucVar.requestRectangleOnScreen(new Rect(0, 0, zucVar.getWidth(), zucVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
