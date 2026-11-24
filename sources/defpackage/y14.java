package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class y14 extends qt7 {
    public final e34 c;

    public y14(e34 e34Var) {
        this.c = e34Var;
    }

    @Override
    public final void a(ggc ggcVar, Object obj) {
        ggcVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.c.e.size();
    }

    @Override
    public final CharSequence d(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return jb6.M0(2131754755, null);
            }
            return jb6.M0(2131754879, null);
        }
        return jb6.M0(2131751133, null);
    }

    @Override
    public final Object e(ggc ggcVar, int i) {
        FrameLayout frameLayout = ((a34) this.c.e.get(i)).b;
        ggcVar.addView(frameLayout);
        return frameLayout;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
