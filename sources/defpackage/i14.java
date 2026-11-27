package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class i14 extends vu7 {
    public final o24 c;

    public i14(o24 o24Var) {
        this.c = o24Var;
    }

    @Override
    public final void a(fic ficVar, Object obj) {
        ficVar.removeView((View) obj);
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
                return ob6.M0(2131754751, null);
            }
            return ob6.M0(2131754875, null);
        }
        return ob6.M0(2131751161, null);
    }

    @Override
    public final Object e(fic ficVar, int i) {
        FrameLayout frameLayout = ((k24) this.c.e.get(i)).b;
        ficVar.addView(frameLayout);
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
