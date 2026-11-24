package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class ar0 extends r35 {
    public final byte Q;
    public final KeyEvent.Callback R;

    public ar0(u0b u0bVar) {
        super(5);
        this.Q = (byte) 4;
        this.R = u0bVar;
    }

    @Override
    public final boolean X0() {
        switch (this.Q) {
            case 4:
                if (((u0b) this.R).Q1 != null && k96.a0) {
                    return true;
                }
                return false;
            default:
                return super.X0();
        }
    }

    @Override
    public final void a0(wg2 wg2Var, p49 p49Var) {
        switch (this.Q) {
            case 3:
                super.a0(wg2Var, p49Var);
                sr4 sr4Var = (sr4) this.R;
                if (sr4Var.V) {
                    sr4Var.V = false;
                    sr4Var.a();
                    return;
                }
                return;
            default:
                super.a0(wg2Var, p49Var);
                return;
        }
    }

    @Override
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        switch (this.Q) {
            case 0:
                if (((gr0) this.R).b) {
                    i = 0;
                }
                return super.n0(i, wg2Var, p49Var);
            default:
                return super.n0(i, wg2Var, p49Var);
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.Q) {
            case 1:
                t12 t12Var = new t12(this, recyclerView.getContext());
                t12Var.a = i;
                v0(t12Var);
                return;
            case 2:
                y42 y42Var = new y42(this, recyclerView.getContext());
                y42Var.a = i;
                v0(y42Var);
                return;
            default:
                super.u0(recyclerView, p49Var, i);
                return;
        }
    }

    @Override
    public final boolean x0() {
        switch (this.Q) {
            case 0:
            case 1:
            case 2:
                return false;
            default:
                return super.x0();
        }
    }

    public ar0(FrameLayout frameLayout, byte b) {
        super(3);
        this.Q = b;
        this.R = frameLayout;
    }

    public ar0(p02 p02Var, int i, byte b) {
        super(i);
        this.Q = b;
        this.R = p02Var;
    }
}
