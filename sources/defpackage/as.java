package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class as extends x46 {
    public final byte I;

    public as(wf1 wf1Var) {
        this.I = (byte) 2;
    }

    @Override
    public final int V0(c89 c89Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 12:
                return hl.L(4000.0f);
            default:
                return super.V0(c89Var);
        }
    }

    @Override
    public final boolean e() {
        switch (this.I) {
            case 7:
                return false;
            default:
                return super.e();
        }
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.I) {
            case 2:
                z46 z46Var = new z46(recyclerView.getContext(), 0);
                z46Var.a = i;
                v0(z46Var);
                return;
            case 11:
                rb8 rb8Var = new rb8(recyclerView.getContext());
                rb8Var.a = i;
                v0(rb8Var);
                return;
            default:
                super.u0(recyclerView, c89Var, i);
                return;
        }
    }

    @Override
    public final boolean x0() {
        switch (this.I) {
            case 0:
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
                return false;
            case 1:
            case 4:
            case 7:
            case 11:
            case 12:
            default:
                return super.x0();
            case 2:
            case 15:
            case 16:
                return true;
        }
    }

    public as(byte b, int i, boolean z) {
        super(i, z);
        this.I = b;
    }

    public as(byte b) {
        this.I = b;
    }
}
