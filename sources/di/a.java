package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.os0;
import org.telegram.ui.Components.ps0;
import org.telegram.ui.Components.uv0;
public final class a extends e91 {
    public final int T = 0;
    public Object U;
    public final FrameLayout V;

    public a(ps0 ps0Var, Context context, os0 os0Var) {
        super(context, null);
        this.V = ps0Var;
        this.U = os0Var;
    }

    @Override
    public boolean i(MotionEvent motionEvent) {
        switch (this.T) {
            case 0:
                return !((js0) this.V).G.C1;
            default:
                return super.i(motionEvent);
        }
    }

    @Override
    public final void w(boolean z10) {
        switch (this.T) {
            case 0:
                js0 js0Var = (js0) this.V;
                String currentLang = js0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    js0Var.G.N0();
                    return;
                }
                return;
            default:
                ((os0) this.U).d.L0(((ps0) this.V).f36522n.getAnimatingIndicatorProgress());
                return;
        }
    }

    @Override
    public void x(int i10) {
        switch (this.T) {
            case 0:
                js0 js0Var = (js0) this.V;
                String currentLang = js0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    js0Var.G.N0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void y(int i10, boolean z10) {
        switch (this.T) {
            case 1:
                int i11 = ((ps0) this.V).f36522n.f25397b0.get(i10, -1);
                uv0 uv0Var = ((os0) this.U).d;
                if (i11 <= 0) {
                    uv0.u(uv0Var, 8, z10);
                    return;
                } else {
                    uv0.u(uv0Var, uv0Var.k1(i11).f30684a, z10);
                    return;
                }
            default:
                super.y(i10, z10);
                return;
        }
    }

    @Override
    public final void z(int i10) {
        switch (this.T) {
            case 0:
                js0 js0Var = (js0) this.V;
                String currentLang = js0Var.getCurrentLang();
                if (!TextUtils.equals((String) this.U, currentLang)) {
                    this.U = currentLang;
                    js0Var.G.N0();
                    return;
                }
                return;
            default:
                ((ps0) this.V).f36522n.f25397b0.get(i10, -1);
                ((os0) this.U).d.L0(1.0f);
                return;
        }
    }

    public a(js0 js0Var, Context context) {
        super(context, null);
        this.V = js0Var;
    }
}
