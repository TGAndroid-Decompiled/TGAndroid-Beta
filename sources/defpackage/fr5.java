package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class fr5 extends n39 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final zr9 e;
    public int f;
    public Runnable h;
    public final jr5 n;

    public fr5(jr5 jr5Var) {
        this.n = jr5Var;
        zr9 zr9Var = new zr9(false);
        this.e = zr9Var;
        zr9Var.a = new ry4(this, (byte) 13);
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.c.size();
        zr9 zr9Var = this.e;
        int size2 = zr9Var.d.size();
        int size3 = zr9Var.e.size();
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
    public final void t(defpackage.s49 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr5.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        Context context = viewGroup.getContext();
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    zkb.h(bkb.d7, null, frameLayout);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232728);
                    frameLayout.a = drawable;
                    zkb.x(frameLayout, drawable, bkb.Pi, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.b = textView;
                    ir2.t(textView, 1, 14.0f);
                    zkb.X(textView, bkb.Qi, null);
                    int i3 = 3;
                    if (k96.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView.setGravity(i2 | 16);
                    if (k96.a0) {
                        i3 = 5;
                    }
                    frameLayout.addView(textView, nme.d(-1, -1.0f, i3 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new sb((byte) 17, context, this);
            }
        } else {
            view = new za5(context, 1, 0, false);
        }
        return new s49(view);
    }
}
