package eh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.ws;

public final class c extends Path {

    public final View f5470a;

    public final Layout f5471b;

    public final Stack f5472c;
    public final List d;

    public final int f5473e;

    public final int f5474f;

    public final ArrayList f5475g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f5470a = view;
        this.f5471b = layout;
        this.f5472c = stack;
        this.d = list;
        this.f5473e = i10;
        this.f5474f = i11;
        this.f5475g = arrayList;
    }

    @Override
    public final void addRect(float f10, float f11, float f12, float f13, Path.Direction direction) {
        Stack stack = this.f5472c;
        k kVar = (stack == null || stack.isEmpty()) ? new k() : (k) stack.remove(0);
        kVar.f5532y = false;
        ArrayList arrayList = this.f5475g;
        if (arrayList != null) {
            float f14 = (f11 + f13) / 2.0f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                di0 di0Var = (di0) arrayList.get(i10);
                if (f14 >= di0Var.f27777b && f14 <= di0Var.f27778c) {
                    kVar.f5532y = true;
                    break;
                }
            }
        }
        kVar.f5522n = -1.0f;
        ValueAnimator valueAnimator = kVar.f5526r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        kVar.f5524p = true;
        int iMax = (int) Math.max(f10, this.f5473e);
        int i11 = (int) f11;
        int i12 = this.f5474f;
        kVar.setBounds(iMax, i11, (int) Math.min(f12, i12 <= 0 ? 2.1474836E9f : i12), (int) f13);
        kVar.h(this.f5471b.getPaint().getColor());
        kVar.f5528t = ws.f34318c;
        int iWidth = kVar.getBounds().width() / AndroidUtilities.dp(6.0f);
        int i13 = k.B;
        int iB = h7.n.b(iWidth * i13, i13, k.A);
        Stack stack2 = kVar.f5513c;
        kVar.d = iB;
        while (kVar.h.size() + stack2.size() < iB) {
            stack2.push(new e());
        }
        View view = this.f5470a;
        if (view != null) {
            kVar.f5517i = view;
        }
        this.d.add(kVar);
    }
}
