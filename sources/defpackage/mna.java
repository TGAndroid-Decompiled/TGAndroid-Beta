package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
public final class mna extends Path {
    public final View a;
    public final Layout b;
    public final Stack c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final ArrayList g;

    public mna(View view, Layout layout, Stack stack, ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
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
        rna rnaVar;
        float f5;
        Stack stack = this.c;
        int i = 0;
        if (stack != null && !stack.isEmpty()) {
            rnaVar = (rna) stack.remove(0);
        } else {
            rnaVar = new rna();
        }
        rnaVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f6 = (f2 + f4) / 2.0f;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                b09 b09Var = (b09) arrayList.get(i);
                if (f6 >= b09Var.b && f6 <= b09Var.c) {
                    rnaVar.y = true;
                    break;
                }
                i++;
            }
        }
        rnaVar.n = -1.0f;
        ValueAnimator valueAnimator = rnaVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rnaVar.p = true;
        int max = (int) Math.max(f, this.e);
        int i2 = (int) f2;
        int i3 = this.f;
        if (i3 <= 0) {
            f5 = 2.1474836E9f;
        } else {
            f5 = i3;
        }
        rnaVar.setBounds(max, i2, (int) Math.min(f3, f5), (int) f4);
        rnaVar.h(this.b.getPaint().getColor());
        rnaVar.t = vt3.c;
        int width = rnaVar.getBounds().width() / gm.L(6.0f);
        byte b = rna.B;
        int b2 = pqe.b(width * b, b, rna.A);
        Stack stack2 = rnaVar.c;
        rnaVar.d = b2;
        while (rnaVar.h.size() + stack2.size() < b2) {
            stack2.push(new Object());
        }
        View view = this.a;
        if (view != null) {
            rnaVar.i = view;
        }
        this.d.add(rnaVar);
    }
}
