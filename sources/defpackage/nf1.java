package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nf1 extends q59 {
    public final uf1 c;

    public nf1(uf1 uf1Var) {
        this.c = uf1Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i;
        uf1 uf1Var = this.c;
        r59 r59Var = uf1Var.b;
        ArrayList arrayList = uf1Var.w;
        if (r59Var != null) {
            ArrayList arrayList2 = r59Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                r59Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                uf1Var.b.L2.add(Long.valueOf(gm.u2(3, arrayList.size() + 3)));
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
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        boolean z;
        uf1 uf1Var = this.c;
        long j = uf1Var.y;
        int i4 = u69Var.f;
        View view = u69Var.a;
        if (i4 != 0) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) uf1Var.w.get(i - 4);
                    qf1 qf1Var = (qf1) view;
                    if (tL_username.editable) {
                        uf1Var.F = qf1Var;
                    } else if (uf1Var.F == qf1Var) {
                        uf1Var.F = null;
                    }
                    if (i < b() - 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qf1Var.a(tL_username, z, false, uf1Var.y);
                    return;
                }
                uf1Var.n = true;
                of1 of1Var = (of1) view;
                uf1Var.E = of1Var;
                of1Var.a.setText(uf1Var.r);
                uf1Var.n = false;
                return;
            }
            njb njbVar = (njb) view;
            if (j != 0) {
                i3 = 2131752890;
            } else {
                i3 = 2131743328;
            }
            njbVar.setText(jb6.M0(i3, null));
            return;
        }
        jf5 jf5Var = (jf5) view;
        if (i == 0) {
            if (j != 0) {
                i2 = 2131752938;
            } else {
                i2 = 2131745232;
            }
        } else {
            i2 = 2131743329;
        }
        jf5Var.setText(jb6.M0(i2, null));
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        uf1 uf1Var = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return new u69(new mf1(this, uf1Var.getParentActivity(), uf1Var.getResourceProvider()));
                    }
                    return new u69(new of1(uf1Var, uf1Var.getParentActivity()));
                }
                return new u69(new njb(uf1Var.getParentActivity()));
            }
            tf1 tf1Var = new tf1(uf1Var, uf1Var.getParentActivity());
            tf1Var.setTag(-33024);
            return new u69(tf1Var);
        }
        return new u69(new jf5(uf1Var.getParentActivity()));
    }
}
