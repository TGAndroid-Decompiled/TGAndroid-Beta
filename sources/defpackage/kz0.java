package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class kz0 extends q59 {
    public final byte c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f;

    public kz0(h32 h32Var, Context context) {
        this.c = (byte) 1;
        this.f = h32Var;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public final void B(a69 a69Var) {
        switch (this.c) {
            case 0:
                ((q59) this.e).B(new jz0(this, a69Var));
                return;
            default:
                super.B(a69Var);
                return;
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
                return ((q59) this.e).D(u69Var);
            default:
                if (u69Var.f == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((q59) obj).b() + 1;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override
    public final int d(int i) {
        int i2 = 0;
        switch (this.c) {
            case 0:
                mz0 mz0Var = (mz0) this.f;
                if (mz0Var.J1) {
                    i2 = b() - 1;
                }
                if (i == i2) {
                    return -1000;
                }
                return ((q59) this.e).d(i - (!mz0Var.J1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        byte b = this.c;
        Object obj = this.e;
        KeyEvent.Callback callback = this.f;
        int i2 = 0;
        switch (b) {
            case 0:
                mz0 mz0Var = (mz0) callback;
                if (mz0Var.J1) {
                    i2 = b() - 1;
                }
                if (i != i2) {
                    ((q59) obj).t(u69Var, i - (!mz0Var.J1 ? 1 : 0));
                    return;
                }
                return;
            default:
                ssc sscVar = (ssc) u69Var.a;
                sscVar.d(1, false, false);
                sscVar.setSize(((h32) callback).r);
                sscVar.e(((ArrayList) obj).get(i), 1, 0, null);
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                if (i == -1000) {
                    return new u69(new sb((mz0) this.f, context));
                }
                return ((q59) this.e).x(viewGroup, i);
            default:
                g32 g32Var = new g32(this, context);
                g32Var.b = false;
                return new u69(g32Var);
        }
    }

    public kz0(mz0 mz0Var, q59 q59Var, Context context) {
        this.c = (byte) 0;
        this.f = mz0Var;
        this.e = q59Var;
        this.d = context;
    }
}
