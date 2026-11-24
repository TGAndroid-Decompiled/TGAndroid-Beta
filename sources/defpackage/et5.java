package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class et5 extends q59 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final bu9 e;
    public int f;
    public Runnable h;
    public final it5 n;

    public et5(it5 it5Var) {
        this.n = it5Var;
        bu9 bu9Var = new bu9(false);
        this.e = bu9Var;
        bu9Var.a = new wx4(this, (byte) 16);
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.c.size();
        bu9 bu9Var = this.e;
        int size2 = bu9Var.d.size();
        int size3 = bu9Var.e.size();
        int i = size + size2;
        if (size3 != 0) {
            i += size3 + 1;
        }
        int i2 = i + 2;
        this.f = i2;
        return i2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == this.f - 1) {
            return 4;
        }
        if (i - 1 != this.e.d.size() + this.c.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.u69 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et5.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        Context context = viewGroup.getContext();
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    anb.h(cmb.d7, null, frameLayout);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232740);
                    frameLayout.a = drawable;
                    anb.x(frameLayout, drawable, cmb.Pi, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.b = textView;
                    ts2.s(textView, 1, 14.0f);
                    anb.X(textView, cmb.Qi, null);
                    int i3 = 3;
                    if (jb6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView.setGravity(i2 | 16);
                    if (jb6.a0) {
                        i3 = 5;
                    }
                    frameLayout.addView(textView, qoe.d(-1, -1.0f, i3 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new sb((byte) 18, context, this);
            }
        } else {
            view = new xc5(context, 1, 0, false);
        }
        return new u69(view);
    }
}
