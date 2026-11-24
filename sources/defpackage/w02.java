package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class w02 extends View {
    public final byte a = 0;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public w02(ViewGroup viewGroup, int i) {
        super(viewGroup.getContext());
        this.c = new ArrayList();
        this.e = new vl6(this, (byte) 10);
        this.d = viewGroup;
        this.b = i;
    }

    public final void a() {
        vl6 vl6Var = (vl6) this.e;
        ArrayList arrayList = (ArrayList) this.c;
        boolean isEmpty = arrayList.isEmpty();
        int i = this.b;
        if (isEmpty && getVisibility() != 8) {
            kk7.f(i).e.remove(vl6Var);
            kk7.f(i).d(vl6Var);
        } else if (!arrayList.isEmpty() && getVisibility() != 0) {
            kk7.f(i).e.remove(vl6Var);
            setVisibility(0);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                jz4 jz4Var = (jz4) this.d;
                wjb wjbVar = (wjb) obj;
                int i = this.b;
                jz4Var.b(bkb.p1(0.5f, bkb.v0(i, wjbVar)));
                jz4Var.draw(canvas);
                jz4 jz4Var2 = (jz4) this.e;
                jz4Var2.b(bkb.p1(0.95f, bkb.v0(i, wjbVar)));
                jz4Var2.draw(canvas);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (!arrayList.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((n17) arrayList.get(i2)).a(canvas);
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
                int i5 = gl.m;
                jz4 jz4Var = (jz4) this.d;
                jz4Var.c(gl.L(12.0f) + i5, 0);
                jz4Var.setBounds(0, 0, i, gl.L(52.0f) + i5);
                jz4 jz4Var2 = (jz4) this.e;
                jz4Var2.c(i5 / 3, 0);
                jz4Var2.setBounds(0, 0, i, i5);
                return;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                return;
        }
    }

    public w02(int i, wjb wjbVar, Context context) {
        super(context);
        this.d = new jz4(2);
        this.e = new jz4(2);
        this.c = wjbVar;
        this.b = i;
    }
}
