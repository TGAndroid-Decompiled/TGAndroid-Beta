package fi;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import gi.d3;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.xv0;
import u4.a1;
import u4.s;
public final class g extends s {
    public final int Q;
    public final KeyEvent.Callback R;

    public g(int i3, FrameLayout frameLayout) {
        super(3);
        this.Q = i3;
        this.R = frameLayout;
    }

    @Override
    public boolean Y0() {
        switch (this.Q) {
            case 4:
                if (((xv0) this.R).O1 != null && bd.f21784a0) {
                    return true;
                }
                return false;
            default:
                return super.Y0();
        }
    }

    @Override
    public void b0(tf.e eVar, a1 a1Var) {
        switch (this.Q) {
            case 1:
                super.b0(eVar, a1Var);
                d3 d3Var = (d3) this.R;
                if (d3Var.V) {
                    d3Var.V = false;
                    d3Var.a();
                    return;
                }
                return;
            default:
                super.b0(eVar, a1Var);
                return;
        }
    }

    @Override
    public int o0(int i3, tf.e eVar, a1 a1Var) {
        switch (this.Q) {
            case 0:
                if (((m) this.R).f11617b) {
                    i3 = 0;
                }
                return super.o0(i3, eVar, a1Var);
            default:
                return super.o0(i3, eVar, a1Var);
        }
    }

    @Override
    public void v0(RecyclerView recyclerView, a1 a1Var, int i3) {
        switch (this.Q) {
            case 2:
                oi oiVar = new oi(this, recyclerView.getContext());
                oiVar.f55704a = i3;
                w0(oiVar);
                return;
            case 3:
                ml mlVar = new ml(this, recyclerView.getContext());
                mlVar.f55704a = i3;
                w0(mlVar);
                return;
            default:
                super.v0(recyclerView, a1Var, i3);
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

    public g(th thVar, int i3, int i10) {
        super(i3);
        this.Q = i10;
        this.R = thVar;
    }

    public g(xv0 xv0Var) {
        super(5);
        this.Q = 4;
        this.R = xv0Var;
    }
}
