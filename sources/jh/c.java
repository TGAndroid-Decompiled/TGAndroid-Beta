package jh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.xi0;
public final class c extends Path {
    public final View f10092a;
    public final Layout f10093b;
    public final Stack f10094c;
    public final List d;
    public final int f10095e;
    public final int f10096f;
    public final ArrayList f10097g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f10092a = view;
        this.f10093b = layout;
        this.f10094c = stack;
        this.d = list;
        this.f10095e = i10;
        this.f10096f = i11;
        this.f10097g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        k kVar;
        float f14;
        Stack stack = this.f10094c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            kVar = (k) stack.remove(0);
        } else {
            kVar = new k();
        }
        kVar.f10154y = false;
        ArrayList arrayList = this.f10097g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                xi0 xi0Var = (xi0) arrayList.get(i10);
                if (f15 >= xi0Var.f33121b && f15 <= xi0Var.f33122c) {
                    kVar.f10154y = true;
                    break;
                }
                i10++;
            }
        }
        kVar.f10144n = -1.0f;
        ValueAnimator valueAnimator = kVar.f10148r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kVar.f10146p = true;
        int max = (int) Math.max(f10, this.f10095e);
        int i11 = (int) f11;
        int i12 = this.f10096f;
        if (i12 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i12;
        }
        kVar.setBounds(max, i11, (int) Math.min(f12, f14), (int) f13);
        kVar.h(this.f10093b.getPaint().getColor());
        kVar.f10150t = jt.f28198c;
        int width = kVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = k.B;
        int b10 = k7.o.b(width * i13, i13, k.A);
        Stack stack2 = kVar.f10135c;
        kVar.d = b10;
        while (kVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f10092a;
        if (view != null) {
            kVar.f10139i = view;
        }
        this.d.add(kVar);
    }
}
