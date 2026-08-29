package mh;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.z71;
public final class a extends z71 {
    public final int P = 0;
    public Object Q;
    public final FrameLayout R;

    public a(kr0 kr0Var, Context context, jr0 jr0Var) {
        super(context, null);
        this.R = kr0Var;
        this.Q = jr0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.P) {
            case 0:
                return !((fr0) this.R).C.f32111y1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.P) {
            case 0:
                fr0 fr0Var = (fr0) this.R;
                String currentLang = fr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    fr0Var.C.L0();
                    return;
                }
                return;
            default:
                ((jr0) this.Q).d.J0(((kr0) this.R).f44686n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.P) {
            case 0:
                fr0 fr0Var = (fr0) this.R;
                String currentLang = fr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    fr0Var.C.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i10, boolean z10) {
        switch (this.P) {
            case 1:
                int i11 = ((kr0) this.R).f44686n.U.get(i10, -1);
                qu0 qu0Var = ((jr0) this.Q).d;
                if (i11 <= 0) {
                    qu0.t(qu0Var, 8, z10);
                    return;
                } else {
                    qu0.t(qu0Var, qu0Var.i1(i11).f31773a, z10);
                    return;
                }
            default:
                super.y(i10, z10);
                return;
        }
    }

    @Override
    public final void z(int i10) {
        switch (this.P) {
            case 0:
                fr0 fr0Var = (fr0) this.R;
                String currentLang = fr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.Q, currentLang)) {
                    this.Q = currentLang;
                    fr0Var.C.L0();
                    return;
                }
                return;
            default:
                ((kr0) this.R).f44686n.U.get(i10, -1);
                ((jr0) this.Q).d.J0(1.0f);
                return;
        }
    }

    public a(fr0 fr0Var, Context context) {
        super(context, null);
        this.R = fr0Var;
    }
}
