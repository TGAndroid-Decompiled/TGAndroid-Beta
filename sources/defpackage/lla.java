package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
public final class lla extends Path {
    public final View a;
    public final Layout b;
    public final Stack c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final ArrayList g;

    public lla(View view, Layout layout, Stack stack, ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
        this.a = view;
        this.b = layout;
        this.c = stack;
        this.d = arrayList;
        this.e = i;
        this.f = i2;
        this.g = arrayList2;
    }

    @Override
    public final void addRect(float f, float f2, float f3, float f4, Path.Direction direction) {
        qla qlaVar;
        float f5;
        Stack stack = this.c;
        int i = 0;
        if (stack != null && !stack.isEmpty()) {
            qlaVar = (qla) stack.remove(0);
        } else {
            qlaVar = new qla();
        }
        qlaVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f6 = (f2 + f4) / 2.0f;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                ay8 ay8Var = (ay8) arrayList.get(i);
                if (f6 >= ay8Var.b && f6 <= ay8Var.c) {
                    qlaVar.y = true;
                    break;
                }
                i++;
            }
        }
        qlaVar.n = -1.0f;
        ValueAnimator valueAnimator = qlaVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        qlaVar.p = true;
        int max = (int) Math.max(f, this.e);
        int i2 = (int) f2;
        int i3 = this.f;
        if (i3 <= 0) {
            f5 = 2.1474836E9f;
        } else {
            f5 = i3;
        }
        qlaVar.setBounds(max, i2, (int) Math.min(f3, f5), (int) f4);
        qlaVar.h(this.b.getPaint().getColor());
        qlaVar.t = ls3.c;
        int width = qlaVar.getBounds().width() / gl.L(6.0f);
        byte b = qla.B;
        int b2 = moe.b(width * b, b, qla.A);
        Stack stack2 = qlaVar.c;
        qlaVar.d = b2;
        while (qlaVar.h.size() + stack2.size() < b2) {
            stack2.push(new Object());
        }
        View view = this.a;
        if (view != null) {
            qlaVar.i = view;
        }
        this.d.add(qlaVar);
    }
}
