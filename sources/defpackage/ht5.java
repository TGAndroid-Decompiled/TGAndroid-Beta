package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
public final class ht5 extends c79 {
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();
    public final sv9 e;
    public int f;
    public Runnable h;
    public final lt5 n;

    public ht5(lt5 lt5Var) {
        this.n = lt5Var;
        sv9 sv9Var = new sv9(false);
        this.e = sv9Var;
        sv9Var.a = new e05(this, (byte) 15);
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int size = this.c.size();
        sv9 sv9Var = this.e;
        int size2 = sv9Var.d.size();
        int size3 = sv9Var.e.size();
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
    public final void t(defpackage.f89 r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht5.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        Context context = viewGroup.getContext();
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    ?? frameLayout = new FrameLayout(context);
                    yob.h(aob.e7, null, frameLayout);
                    Drawable drawable = frameLayout.getResources().getDrawable(2131232739);
                    frameLayout.a = drawable;
                    yob.x(frameLayout, drawable, aob.Qi, null, PorterDuff.Mode.MULTIPLY);
                    TextView textView = new TextView(frameLayout.getContext());
                    frameLayout.b = textView;
                    bs2.t(textView, 1, 14.0f);
                    yob.X(textView, aob.Ri, null);
                    int i3 = 3;
                    if (ob6.a0) {
                        i2 = 5;
                    } else {
                        i2 = 3;
                    }
                    textView.setGravity(i2 | 16);
                    if (ob6.a0) {
                        i3 = 5;
                    }
                    frameLayout.addView(textView, tre.d(-1, -1.0f, i3 | 48, 16.0f, 0.0f, 16.0f, 0.0f));
                    view = frameLayout;
                } else {
                    view = new View(context);
                }
            } else {
                view = new tb((byte) 18, context, this);
            }
        } else {
            view = new bd5(context, 1, 0, false);
        }
        return new f89(view);
    }
}
