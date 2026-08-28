package dh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.xs;
public final class c extends Path {
    public final View f4571a;
    public final Layout f4572b;
    public final Stack f4573c;
    public final List d;
    public final int f4574e;
    public final int f4575f;
    public final ArrayList f4576g;

    public c(View view, Layout layout, Stack stack, List list, int i9, int i10, ArrayList arrayList) {
        this.f4571a = view;
        this.f4572b = layout;
        this.f4573c = stack;
        this.d = list;
        this.f4574e = i9;
        this.f4575f = i10;
        this.f4576g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        l lVar;
        float f14;
        Stack stack = this.f4573c;
        int i9 = 0;
        if (stack != null && !stack.isEmpty()) {
            lVar = (l) stack.remove(0);
        } else {
            lVar = new l();
        }
        lVar.f4634y = false;
        ArrayList arrayList = this.f4576g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                bi0 bi0Var = (bi0) arrayList.get(i9);
                if (f15 >= bi0Var.f27217b && f15 <= bi0Var.f27218c) {
                    lVar.f4634y = true;
                    break;
                }
                i9++;
            }
        }
        lVar.f4624n = -1.0f;
        ValueAnimator valueAnimator = lVar.f4628r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        lVar.f4626p = true;
        int max = (int) Math.max(f10, this.f4574e);
        int i10 = (int) f11;
        int i11 = this.f4575f;
        if (i11 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i11;
        }
        lVar.setBounds(max, i10, (int) Math.min(f12, f14), (int) f13);
        lVar.h(this.f4572b.getPaint().getColor());
        lVar.f4630t = xs.f34753c;
        int width = lVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i12 = l.B;
        int b10 = g7.n.b(width * i12, i12, l.A);
        Stack stack2 = lVar.f4615c;
        lVar.d = b10;
        while (lVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f4571a;
        if (view != null) {
            lVar.f4619i = view;
        }
        this.d.add(lVar);
    }
}
