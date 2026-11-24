package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class n04 extends pr7 {
    public final t14 c;

    public n04(t14 t14Var) {
        this.c = t14Var;
    }

    @Override
    public final void a(gec gecVar, Object obj) {
        gecVar.removeView((View) obj);
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
                return k96.M0(2131754755, null);
            }
            return k96.M0(2131754879, null);
        }
        return k96.M0(2131751184, null);
    }

    @Override
    public final Object e(gec gecVar, int i) {
        FrameLayout frameLayout = ((p14) this.c.e.get(i)).b;
        gecVar.addView(frameLayout);
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
