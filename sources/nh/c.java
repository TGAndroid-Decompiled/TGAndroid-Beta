package nh;

import android.animation.ValueAnimator;
import android.graphics.Path;
import android.text.Layout;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.vs;
import w7.u;
public final class c extends Path {
    public final View f13805a;
    public final Layout f13806b;
    public final Stack f13807c;
    public final List d;
    public final int e;
    public final int f13808f;
    public final ArrayList f13809g;

    public c(View view, Layout layout, Stack stack, List list, int i10, int i11, ArrayList arrayList) {
        this.f13805a = view;
        this.f13806b = layout;
        this.f13807c = stack;
        this.d = list;
        this.e = i10;
        this.f13808f = i11;
        this.f13809g = arrayList;
    }

    @Override
    public final void addRect(float f7, float f10, float f11, float f12, Path.Direction direction) {
        i iVar;
        float f13;
        Stack stack = this.f13807c;
        int i10 = 0;
        if (stack != null && !stack.isEmpty()) {
            iVar = (i) stack.remove(0);
        } else {
            iVar = new i();
        }
        iVar.f13860y = false;
        ArrayList arrayList = this.f13809g;
        if (arrayList != null) {
            float f14 = (f10 + f12) / 2.0f;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                th0 th0Var = (th0) arrayList.get(i10);
                if (f14 >= th0Var.f30658b && f14 <= th0Var.f30659c) {
                    iVar.f13860y = true;
                    break;
                }
                i10++;
            }
        }
        iVar.f13850n = -1.0f;
        ValueAnimator valueAnimator = iVar.f13854r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        iVar.f13852p = true;
        int max = (int) Math.max(f7, this.e);
        int i11 = (int) f10;
        int i12 = this.f13808f;
        if (i12 <= 0) {
            f13 = 2.1474836E9f;
        } else {
            f13 = i12;
        }
        iVar.setBounds(max, i11, (int) Math.min(f11, f13), (int) f12);
        iVar.h(this.f13806b.getPaint().getColor());
        iVar.f13856t = vs.f31898c;
        int width = iVar.getBounds().width() / i0.L(6.0f);
        int i13 = i.B;
        int b10 = u.b(width * i13, i13, i.A);
        Stack stack2 = iVar.f13842c;
        iVar.d = b10;
        while (iVar.h.size() + stack2.size() < b10) {
            stack2.push(new Object());
        }
        View view = this.f13805a;
        if (view != null) {
            iVar.f13845i = view;
        }
        this.d.add(iVar);
    }
}
