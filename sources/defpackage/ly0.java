package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ly0 extends c79 {
    public final byte c;
    public final Context d;
    public final Object e;
    public final KeyEvent.Callback f;

    public ly0(m22 m22Var, Context context) {
        this.c = (byte) 1;
        this.f = m22Var;
        this.e = new ArrayList();
        this.d = context;
    }

    @Override
    public final void B(l79 l79Var) {
        switch (this.c) {
            case 0:
                ((c79) this.e).B(new ky0(this, l79Var));
                return;
            default:
                super.B(l79Var);
                return;
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
                return ((c79) this.e).D(f89Var);
            default:
                if (f89Var.f == 0) {
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
                return ((c79) obj).b() + 1;
            default:
                return ((ArrayList) obj).size();
        }
    }

    @Override
    public final int d(int i) {
        int i2 = 0;
        switch (this.c) {
            case 0:
                ny0 ny0Var = (ny0) this.f;
                if (ny0Var.J1) {
                    i2 = b() - 1;
                }
                if (i == i2) {
                    return -1000;
                }
                return ((c79) this.e).d(i - (!ny0Var.J1 ? 1 : 0));
            default:
                return 0;
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        byte b = this.c;
        Object obj = this.e;
        KeyEvent.Callback callback = this.f;
        int i2 = 0;
        switch (b) {
            case 0:
                ny0 ny0Var = (ny0) callback;
                if (ny0Var.J1) {
                    i2 = b() - 1;
                }
                if (i != i2) {
                    ((c79) obj).t(f89Var, i - (!ny0Var.J1 ? 1 : 0));
                    return;
                }
                return;
            default:
                evc evcVar = (evc) f89Var.a;
                evcVar.d(1, false, false);
                evcVar.setSize(((m22) callback).r);
                evcVar.e(((ArrayList) obj).get(i), 1, 0, null);
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                if (i == -1000) {
                    return new f89(new tb((ny0) this.f, context));
                }
                return ((c79) this.e).x(viewGroup, i);
            default:
                l22 l22Var = new l22(this, context);
                l22Var.b = false;
                return new f89(l22Var);
        }
    }

    public ly0(ny0 ny0Var, c79 c79Var, Context context) {
        this.c = (byte) 0;
        this.f = ny0Var;
        this.e = c79Var;
        this.d = context;
    }
}
