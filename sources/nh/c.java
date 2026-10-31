package nh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.vs;
import w7.u;
public final class c extends Path {
    public final View f13804a;
    public final Layout f13805b;
    public final Stack f13806c;
    public final List d;
    public final int e;
    public final int f13807f;
    public final ArrayList f13808g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f13804a = view;
        this.f13805b = layout;
        this.f13806c = stack;
        this.d = list;
        this.e = i10;
        this.f13807f = i11;
        this.f13808g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        i iVar;
        float f13;
        Stack stack = this.f13806c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            iVar = (i) stack.remove(0);
        } else {
            iVar = new i();
        }
        iVar.f13859y = false;
        ArrayList arrayList = this.f13808g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                sh0 sh0Var = (sh0) arrayList.get(i10);
                if (f14 >= sh0Var.f30243b && f14 <= sh0Var.f30244c) {
                    iVar.f13859y = true;
                    break;
                }
                i10++;
            }
        }
        iVar.f13849n = -1.0f;
        ValueAnimator valueAnimator = iVar.f13853r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        iVar.f13851p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f13807f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        iVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        iVar.h(this.f13805b.getPaint().getColor());
        iVar.f13855t = vs.f31838c;
        int width = iVar.getBounds().width() / i0.L(6.0f);
        int i13 = i.B;
        int b10 = u.b(width * i13, i13, i.A);
        Stack stack2 = iVar.f13841c;
        iVar.d = b10;
        while (iVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f13804a;
        if (view != null) {
            iVar.f13844i = view;
        }
        this.d.add(iVar);
    }
}
