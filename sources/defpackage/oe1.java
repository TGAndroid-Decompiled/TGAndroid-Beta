package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oe1 extends c79 {
    public final ve1 c;

    public oe1(ve1 ve1Var) {
        this.c = ve1Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i;
        ve1 ve1Var = this.c;
        d79 d79Var = ve1Var.b;
        ArrayList arrayList = ve1Var.w;
        if (d79Var != null) {
            ArrayList arrayList2 = d79Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                d79Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                ve1Var.b.L2.add(Long.valueOf(hl.u2(3, arrayList.size() + 3)));
            }
        }
        if (arrayList.size() > 0) {
            i = arrayList.size() + 2;
        } else {
            i = 0;
        }
        return i + 3;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 0;
        }
        if (i == b() - 1) {
            return 2;
        }
        return 4;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        boolean z;
        ve1 ve1Var = this.c;
        long j = ve1Var.y;
        int i4 = f89Var.f;
        View view = f89Var.a;
        if (i4 != 0) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) ve1Var.w.get(i - 4);
                    re1 re1Var = (re1) view;
                    if (tL_username.editable) {
                        ve1Var.F = re1Var;
                    } else if (ve1Var.F == re1Var) {
                        ve1Var.F = null;
                    }
                    if (i < b() - 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    re1Var.a(tL_username, z, false, ve1Var.y);
                    return;
                }
                ve1Var.n = true;
                pe1 pe1Var = (pe1) view;
                ve1Var.E = pe1Var;
                pe1Var.a.setText(ve1Var.r);
                ve1Var.n = false;
                return;
            }
            ilb ilbVar = (ilb) view;
            if (j != 0) {
                i3 = 2131752918;
            } else {
                i3 = 2131743296;
            }
            ilbVar.setText(ob6.M0(i3, null));
            return;
        }
        mf5 mf5Var = (mf5) view;
        if (i == 0) {
            if (j != 0) {
                i2 = 2131752966;
            } else {
                i2 = 2131745226;
            }
        } else {
            i2 = 2131743297;
        }
        mf5Var.setText(ob6.M0(i2, null));
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        ve1 ve1Var = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return new f89(new ne1(this, ve1Var.getParentActivity(), ve1Var.getResourceProvider()));
                    }
                    return new f89(new pe1(ve1Var, ve1Var.getParentActivity()));
                }
                return new f89(new ilb(ve1Var.getParentActivity()));
            }
            ue1 ue1Var = new ue1(ve1Var, ve1Var.getParentActivity());
            ue1Var.setTag(-33024);
            return new f89(ue1Var);
        }
        return new f89(new mf5(ve1Var.getParentActivity()));
    }
}
