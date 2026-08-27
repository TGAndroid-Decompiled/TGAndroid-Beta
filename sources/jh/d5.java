package jh;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

public final class d5 extends i4 {
    public final i9 J;
    public final k5 K;

    public d5(Context context, k5 k5Var, i9 i9Var) {
        super(context);
        this.K = k5Var;
        this.J = i9Var;
        this.f13445w = -1;
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.E = new GestureDetector(new bg.e(1, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.D = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.b.k(-16777216, 160)});
    }

    @Override
    public final void b(int i10) {
        e9 e9Var;
        k5 k5Var = this.K;
        e5 e5Var = k5Var.A;
        if (k5Var.f13585w) {
            return;
        }
        if (e5Var.getCurrentItem() != i10) {
            try {
                e5Var.x(i10, false);
            } catch (Throwable th) {
                FileLog.e(th);
                e5Var.getAdapter().g();
                e5Var.x(i10, false);
            }
        }
        i9 i9Var = this.J;
        if (i9Var.K0 == null || (e9Var = i9Var.f13498p0) == null) {
            return;
        }
        if (i10 < 10) {
            e9Var.e(false);
        } else if (i10 >= this.A.size() - 10) {
            i9Var.f13498p0.e(true);
        }
    }
}
