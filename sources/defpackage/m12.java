package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class m12 extends View {
    public final byte a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public m12(ViewGroup viewGroup, int i) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new z96(this, (byte) 23);
        this.d = viewGroup;
        this.b = i;
    }

    public final void a() {
        z96 z96Var = (z96) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i = this.b;
        if (isEmpty && getVisibility() != 8) {
            jn7.f(i).e.remove(z96Var);
            jn7.f(i).d(z96Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            jn7.f(i).e.remove(z96Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                n15 n15Var = (n15) this.d;
                vnb vnbVar = (vnb) obj;
                int i = this.b;
                n15Var.b(aob.p1(0.5f, aob.v0(i, vnbVar)));
                n15Var.draw(canvas);
                n15 n15Var2 = (n15) this.e;
                n15Var2.b(aob.p1(0.95f, aob.v0(i, vnbVar)));
                n15Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((u37) arrayList.get(i2)).a(canvas);
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
                int i5 = hl.m;
                n15 n15Var = (n15) this.d;
                n15Var.c(hl.L(12.0f) + i5, 0);
                n15Var.setBounds(0, 0, i, hl.L(52.0f) + i5);
                n15 n15Var2 = (n15) this.e;
                n15Var2.c(i5 / 3, 0);
                n15Var2.setBounds(0, 0, i, i5);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    public m12(int i, vnb vnbVar, Context context) {
        super(context);
        this.d = new n15(2);
        this.e = new n15(2);
        this.c = vnbVar;
        this.b = i;
    }
}
