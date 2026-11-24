package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
public final class as0 extends q55 {
    public final byte Q;
    public final KeyEvent.Callback R;

    public as0(x2b x2bVar) {
        super(5);
        this.Q = (byte) 4;
        this.R = x2bVar;
    }

    @Override
    public final boolean X0() {
        switch (this.Q) {
            case 4:
                if (((x2b) this.R).Q1 != null && jb6.a0) {
                    return true;
                }
                return false;
            default:
                return super.X0();
        }
    }

    @Override
    public final void a0(ki2 ki2Var, r69 r69Var) {
        switch (this.Q) {
            case 3:
                super.a0(ki2Var, r69Var);
                tt4 tt4Var = (tt4) this.R;
                if (tt4Var.V) {
                    tt4Var.V = false;
                    tt4Var.a();
                    return;
                }
                return;
            default:
                super.a0(ki2Var, r69Var);
                return;
        }
    }

    @Override
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        switch (this.Q) {
            case 0:
                if (((gs0) this.R).b) {
                    i = 0;
                }
                return super.n0(i, ki2Var, r69Var);
            default:
                return super.n0(i, ki2Var, r69Var);
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.Q) {
            case 1:
                f32 f32Var = new f32(this, recyclerView.getContext());
                f32Var.a = i;
                v0(f32Var);
                return;
            case 2:
                j62 j62Var = new j62(this, recyclerView.getContext());
                j62Var.a = i;
                v0(j62Var);
                return;
            default:
                super.u0(recyclerView, r69Var, i);
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

    public as0(FrameLayout frameLayout, byte b) {
        super(3);
        this.Q = b;
        this.R = frameLayout;
    }

    public as0(a22 a22Var, int i, byte b) {
        super(i);
        this.Q = b;
        this.R = a22Var;
    }
}
