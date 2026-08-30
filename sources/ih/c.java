package ih;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.vi0;
public final class c extends Path {
    public final View f7566a;
    public final Layout f7567b;
    public final Stack f7568c;
    public final List d;
    public final int e;
    public final int f7569f;
    public final ArrayList f7570g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f7566a = view;
        this.f7567b = layout;
        this.f7568c = stack;
        this.d = list;
        this.e = i10;
        this.f7569f = i11;
        this.f7570g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        k kVar;
        float f14;
        Stack stack = this.f7568c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            kVar = (k) stack.remove(0);
        } else {
            kVar = new k();
        }
        kVar.f7623y = false;
        ArrayList arrayList = this.f7570g;
        if (arrayList != null) {
            float f15 = (f11 + f13) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                vi0 vi0Var = (vi0) arrayList.get(i10);
                if (f15 >= vi0Var.f29495b && f15 <= vi0Var.f29496c) {
                    kVar.f7623y = true;
                    break;
                }
                i10++;
            }
        }
        kVar.f7613n = -1.0f;
        ValueAnimator valueAnimator = kVar.f7617r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kVar.f7615p = true;
        int max = (int) Math.max(f10, this.e);
        int i11 = (int) f11;
        int i12 = this.f7569f;
        if (i12 <= 0) {
            f14 = 2.1474836E9f;
        } else {
            f14 = i12;
        }
        kVar.setBounds(max, i11, (int) Math.min(f12, f14), (int) f13);
        kVar.h(this.f7567b.getPaint().getColor());
        kVar.f7619t = gt.f25247c;
        int width = kVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = k.B;
        int b10 = k7.n.b(width * i13, i13, k.A);
        Stack stack2 = kVar.f7605c;
        kVar.d = b10;
        while (kVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f7566a;
        if (view != null) {
            kVar.f7608i = view;
        }
        this.d.add(kVar);
    }
}
