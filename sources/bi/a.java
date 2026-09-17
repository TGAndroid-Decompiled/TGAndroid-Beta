package bi;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.j81;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.zu0;
public final class a extends j81 {
    public final int U = 0;
    public Object V;
    public final FrameLayout W;

    public a(ur0 ur0Var, Context context, sr0 sr0Var) {
        super(context, null);
        this.W = ur0Var;
        this.V = sr0Var;
    }

    @Override
    public final void A(int i10) {
        switch (this.U) {
            case 0:
                nr0 nr0Var = (nr0) this.W;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    nr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((ur0) this.W).f32645n.f24873b0.get(i10, -1);
                ((sr0) this.V).d.J0(1.0f);
                return;
        }
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.U) {
            case 0:
                return !((nr0) this.W).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.U) {
            case 0:
                nr0 nr0Var = (nr0) this.W;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    nr0Var.G.L0();
                    return;
                }
                return;
            default:
                ((sr0) this.V).d.J0(((ur0) this.W).f32645n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void y(int i10) {
        switch (this.U) {
            case 0:
                nr0 nr0Var = (nr0) this.W;
                String currentLang = nr0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.V, currentLang)) {
                    this.V = currentLang;
                    nr0Var.G.L0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void z(int i10, boolean z10) {
        switch (this.U) {
            case 1:
                int i11 = ((ur0) this.W).f32645n.f24873b0.get(i10, -1);
                zu0 zu0Var = ((sr0) this.V).d;
                if (i11 <= 0) {
                    zu0.t(zu0Var, 8, z10);
                    return;
                } else {
                    zu0.t(zu0Var, zu0Var.i1(i11).f30325a, z10);
                    return;
                }
            default:
                super.z(i10, z10);
                return;
        }
    }

    public a(nr0 nr0Var, Context context) {
        super(context, null);
        this.W = nr0Var;
    }
}
