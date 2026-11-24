package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class h22 extends View {
    public final byte a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h22(ViewGroup viewGroup, int i) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new pg6(this, (byte) 17);
        this.d = viewGroup;
        this.b = i;
    }

    public final void a() {
        pg6 pg6Var = (pg6) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i = this.b;
        if (isEmpty && getVisibility() != 8) {
            nm7.f(i).e.remove(pg6Var);
            nm7.f(i).d(pg6Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            nm7.f(i).e.remove(pg6Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                i15 i15Var = (i15) this.d;
                ylb ylbVar = (ylb) obj;
                int i = this.b;
                i15Var.b(cmb.p1(0.5f, cmb.v0(i, ylbVar)));
                i15Var.draw(canvas);
                i15 i15Var2 = (i15) this.e;
                i15Var2.b(cmb.p1(0.95f, cmb.v0(i, ylbVar)));
                i15Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((n37) arrayList.get(i2)).a(canvas);
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                int i5 = gm.m;
                i15 i15Var = (i15) this.d;
                i15Var.c(gm.L(12.0f) + i5, 0);
                i15Var.setBounds(0, 0, i, gm.L(52.0f) + i5);
                i15 i15Var2 = (i15) this.e;
                i15Var2.c(i5 / 3, 0);
                i15Var2.setBounds(0, 0, i, i5);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    public h22(int i, ylb ylbVar, Context context) {
        super(context);
        this.d = new i15(2);
        this.e = new i15(2);
        this.c = ylbVar;
        this.b = i;
    }
}
