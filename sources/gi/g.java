package gi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import hi.m3;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.li;
import v4.c1;
import v4.t;
import v4.x0;
public final class g extends t {
    public final int Q;
    public final KeyEvent.Callback R;

    public g(int i7, FrameLayout frameLayout) {
        super(3);
        this.Q = i7;
        this.R = frameLayout;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                if (((jw0) this.R).R1 != null && gd.f24314a0) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public void b0(x0 x0Var, c1 c1Var) {
        switch (this.Q) {
            case 1:
                super.b0(x0Var, c1Var);
                m3 m3Var = (m3) this.R;
                if (m3Var.V) {
                    m3Var.V = false;
                    m3Var.a();
                    return;
                }
                return;
            default:
                super.b0(x0Var, c1Var);
                return;
        }
    }

    @Override
    public int o0(int i7, x0 x0Var, c1 c1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).f13645b) {
                    i7 = 0;
                }
                return super.o0(i7, x0Var, c1Var);
            default:
                return super.o0(i7, x0Var, c1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, c1 c1Var, int i7) {
        switch (this.Q) {
            case 2:
                ej ejVar = new ej(this, recyclerView.getContext());
                ejVar.f59190a = i7;
                w0(ejVar);
                return;
            case 3:
                bm bmVar = new bm(this, recyclerView.getContext());
                bmVar.f59190a = i7;
                w0(bmVar);
                return;
            default:
                super.v0(recyclerView, c1Var, i7);
                return;
        }
    }

    @Override
    public boolean y0() {
        switch (this.Q) {
            case 0:
                return false;
            case 1:
            default:
                return super.y0();
            case 2:
                return false;
            case 3:
                return false;
        }
    }

    public g(li liVar, int i7, int i10) {
        super(i7);
        this.Q = i10;
        this.R = liVar;
    }

    public g(jw0 jw0Var) {
        super(5);
        this.Q = 4;
        this.R = jw0Var;
    }
}
