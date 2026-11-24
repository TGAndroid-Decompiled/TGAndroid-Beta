package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fe1 extends n39 {
    public final me1 c;

    public fe1(me1 me1Var) {
        this.c = me1Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        int i;
        me1 me1Var = this.c;
        o39 o39Var = me1Var.b;
        ArrayList arrayList = me1Var.w;
        if (o39Var != null) {
            ArrayList arrayList2 = o39Var.L2;
            if (arrayList2 != null) {
                arrayList2.clear();
            } else {
                o39Var.L2 = new ArrayList();
            }
            if (arrayList.size() > 0) {
                me1Var.b.L2.add(Long.valueOf(gl.u2(3, arrayList.size() + 3)));
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
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        boolean z;
        me1 me1Var = this.c;
        long j = me1Var.y;
        int i4 = s49Var.f;
        View view = s49Var.a;
        if (i4 != 0) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) me1Var.w.get(i - 4);
                    ie1 ie1Var = (ie1) view;
                    if (tL_username.editable) {
                        me1Var.F = ie1Var;
                    } else if (me1Var.F == ie1Var) {
                        me1Var.F = null;
                    }
                    if (i < b() - 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ie1Var.a(tL_username, z, false, me1Var.y);
                    return;
                }
                me1Var.n = true;
                ge1 ge1Var = (ge1) view;
                me1Var.E = ge1Var;
                ge1Var.a.setText(me1Var.r);
                me1Var.n = false;
                return;
            }
            mhb mhbVar = (mhb) view;
            if (j != 0) {
                i3 = 2131752925;
            } else {
                i3 = 2131743402;
            }
            mhbVar.setText(k96.M0(i3, null));
            return;
        }
        ld5 ld5Var = (ld5) view;
        if (i == 0) {
            if (j != 0) {
                i2 = 2131752973;
            } else {
                i2 = 2131745306;
            }
        } else {
            i2 = 2131743403;
        }
        ld5Var.setText(k96.M0(i2, null));
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        me1 me1Var = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return new s49(new ee1(this, me1Var.getParentActivity(), me1Var.getResourceProvider()));
                    }
                    return new s49(new ge1(me1Var, me1Var.getParentActivity()));
                }
                return new s49(new mhb(me1Var.getParentActivity()));
            }
            le1 le1Var = new le1(me1Var, me1Var.getParentActivity());
            le1Var.setTag(-33024);
            return new s49(le1Var);
        }
        return new s49(new ld5(me1Var.getParentActivity()));
    }
}
