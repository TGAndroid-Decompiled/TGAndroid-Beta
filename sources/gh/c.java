package gh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import i7.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.mi0;
public final class c extends Path {
    public final View f7362a;
    public final Layout f7363b;
    public final Stack f7364c;
    public final List d;
    public final int f7365e;
    public final int f7366f;
    public final ArrayList f7367g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f7362a = view;
        this.f7363b = layout;
        this.f7364c = stack;
        this.d = list;
        this.f7365e = i10;
        this.f7366f = i11;
        this.f7367g = arrayList;
    }

    @Override
    public final void addRect(float f9, float f10, float f11, float f12, Path.Direction direction) {
        k kVar;
        float f13;
        Stack stack = this.f7364c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            kVar = (k) stack.remove(0);
        } else {
            kVar = new k();
        }
        kVar.f7424y = false;
        ArrayList arrayList = this.f7367g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                mi0 mi0Var = (mi0) arrayList.get(i10);
                if (f14 >= mi0Var.f30708b && f14 <= mi0Var.f30709c) {
                    kVar.f7424y = true;
                    break;
                }
                i10++;
            }
        }
        kVar.f7414n = -1.0f;
        ValueAnimator valueAnimator = kVar.f7418r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kVar.f7416p = true;
        int max = (int) Math.max(f9, this.f7365e);
        int i11 = (int) f10;
        int i12 = this.f7366f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        kVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        kVar.h(this.f7363b.getPaint().getColor());
        kVar.f7420t = ct.f27566c;
        int width = kVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = k.B;
        int b10 = w.b(width * i13, i13, k.A);
        Stack stack2 = kVar.f7405c;
        kVar.d = b10;
        while (kVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f7362a;
        if (view != null) {
            kVar.f7409i = view;
        }
        this.d.add(kVar);
    }
}
