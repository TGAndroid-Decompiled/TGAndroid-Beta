package ih;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.wi0;
public final class c extends Path {
    public final View f7548a;
    public final Layout f7549b;
    public final Stack f7550c;
    public final List d;
    public final int e;
    public final int f7551f;
    public final ArrayList f7552g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f7548a = view;
        this.f7549b = layout;
        this.f7550c = stack;
        this.d = list;
        this.e = i10;
        this.f7551f = i11;
        this.f7552g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        k kVar;
        float f14;
        Stack stack = this.f7550c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            kVar = (k) stack.remove(0);
        } else {
            kVar = new k();
        }
        kVar.f7605y = false;
        ArrayList arrayList = this.f7552g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                wi0 wi0Var = (wi0) arrayList.get(i10);
                if (f15 >= wi0Var.f30297b && f15 <= wi0Var.f30298c) {
                    kVar.f7605y = true;
                    break;
                }
                i10++;
            }
        }
        kVar.f7595n = -1.0f;
        ValueAnimator valueAnimator = kVar.f7599r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kVar.f7597p = true;
        int max = (int) Math.max(f10, this.e);
        int i11 = (int) f11;
        int i12 = this.f7551f;
        if (i12 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i12;
        }
        kVar.setBounds(max, i11, (int) Math.min(f12, f14), (int) f13);
        kVar.h(this.f7549b.getPaint().getColor());
        kVar.f7601t = ft.f24966c;
        int width = kVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = k.B;
        int b10 = k7.n.b(width * i13, i13, k.A);
        Stack stack2 = kVar.f7587c;
        kVar.d = b10;
        while (kVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f7548a;
        if (view != null) {
            kVar.f7590i = view;
        }
        this.d.add(kVar);
    }
}
