package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
public final class ipa extends Path {
    public final View a;
    public final Layout b;
    public final Stack c;
    public final ArrayList d;
    public final int e;
    public final int f;
    public final ArrayList g;

    public ipa(View view, Layout layout, Stack stack, ArrayList arrayList, int i, int i2, ArrayList arrayList2) {
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
        npa npaVar;
        float f5;
        Stack stack = this.c;
        int i = 0;
        if (stack != null && !stack.isEmpty()) {
            npaVar = (npa) stack.remove(0);
        } else {
            npaVar = new npa();
        }
        npaVar.y = false;
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            float f6 = (f2 + f4) / 2.0f;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                n19 n19Var = (n19) arrayList.get(i);
                if (f6 >= n19Var.b && f6 <= n19Var.c) {
                    npaVar.y = true;
                    break;
                }
                i++;
            }
        }
        npaVar.n = -1.0f;
        ValueAnimator valueAnimator = npaVar.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        npaVar.p = true;
        int max = (int) Math.max(f, this.e);
        int i2 = (int) f2;
        int i3 = this.f;
        if (i3 <= 0) {
            f5 = 2.1474836E9f;
        } else {
            f5 = i3;
        }
        npaVar.setBounds(max, i2, (int) Math.min(f3, f5), (int) f4);
        npaVar.h(this.b.getPaint().getColor());
        npaVar.t = dt3.c;
        int width = npaVar.getBounds().width() / hl.L(6.0f);
        byte b = npa.B;
        int b2 = ete.b(width * b, b, npa.A);
        Stack stack2 = npaVar.c;
        npaVar.d = b2;
        while (npaVar.h.size() + stack2.size() < b2) {
            stack2.push(new Object());
        }
        View view = this.a;
        if (view != null) {
            npaVar.i = view;
        }
        this.d.add(npaVar);
    }
}
