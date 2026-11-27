package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class ar0 extends u55 {
    public final byte Q;
    public final KeyEvent.Callback R;

    public ar0(s4b s4bVar) {
        super(5);
        this.Q = (byte) 4;
        this.R = s4bVar;
    }

    @Override
    public final boolean X0() {
        switch (this.Q) {
            case 4:
                if (((s4b) this.R).Q1 != null && ob6.a0) {
                    return true;
                }
                return false;
            default:
                return super.X0();
        }
    }

    @Override
    public final void a0(oh2 oh2Var, c89 c89Var) {
        switch (this.Q) {
            case 3:
                super.a0(oh2Var, c89Var);
                wt4 wt4Var = (wt4) this.R;
                if (wt4Var.V) {
                    wt4Var.V = false;
                    wt4Var.a();
                    return;
                }
                return;
            default:
                super.a0(oh2Var, c89Var);
                return;
        }
    }

    @Override
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        switch (this.Q) {
            case 0:
                if (((gr0) this.R).b) {
                    i = 0;
                }
                return super.n0(i, oh2Var, c89Var);
            default:
                return super.n0(i, oh2Var, c89Var);
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.Q) {
            case 1:
                k22 k22Var = new k22(this, recyclerView.getContext());
                k22Var.a = i;
                v0(k22Var);
                return;
            case 2:
                o52 o52Var = new o52(this, recyclerView.getContext());
                o52Var.a = i;
                v0(o52Var);
                return;
            default:
                super.u0(recyclerView, c89Var, i);
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

    public ar0(f12 f12Var, int i, byte b) {
        super(i);
        this.Q = b;
        this.R = f12Var;
    }
}
