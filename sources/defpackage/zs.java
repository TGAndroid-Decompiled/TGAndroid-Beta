package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class zs extends u46 {
    public final byte I;

    public zs(vg1 vg1Var) {
        this.I = (byte) 2;
    }

    @Override
    public final int V0(r69 r69Var) {
        switch (this.I) {
            case 4:
                return 5000;
            case 12:
                return gm.L(4000.0f);
            default:
                return super.V0(r69Var);
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
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        switch (this.I) {
            case 2:
                w46 w46Var = new w46(recyclerView.getContext(), 0);
                w46Var.a = i;
                v0(w46Var);
                return;
            case 11:
                ca8 ca8Var = new ca8(recyclerView.getContext());
                ca8Var.a = i;
                v0(ca8Var);
                return;
            default:
                super.u0(recyclerView, r69Var, i);
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

    public zs(byte b, int i, boolean z) {
        super(i, z);
        this.I = b;
    }

    public zs(byte b) {
        this.I = b;
    }
}
