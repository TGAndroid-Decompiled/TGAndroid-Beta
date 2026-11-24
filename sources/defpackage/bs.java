package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bs extends ka {
    public final cs d;

    public bs(cs csVar) {
        this.d = csVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 2 && i != 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.h.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.d.h;
        if (i >= 0 && i < arrayList.size()) {
            return ((as) arrayList.get(i)).a;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        if (i >= 0 && i < this.d.h.size()) {
            as asVar = (as) this.d.h.get(i);
            int i2 = i + 1;
            int i3 = 0;
            if (i2 < this.d.h.size() && ((as) this.d.h.get(i2)).a == asVar.a) {
                z = true;
            } else {
                z = false;
            }
            int i4 = s49Var.f;
            if (i4 == 0) {
                ((ld5) s49Var.a).setText(asVar.c);
            } else if (i4 == 2) {
                mhb mhbVar = (mhb) s49Var.a;
                if (TextUtils.isEmpty(asVar.c)) {
                    mhbVar.setFixedSize(12);
                    mhbVar.setText(null);
                    return;
                }
                mhbVar.setFixedSize(0);
                mhbVar.setText(asVar.c);
            } else if (i4 == 1) {
                ahb ahbVar = (ahb) s49Var.a;
                byte b = asVar.d;
                if (b == 1) {
                    z2 = this.d.d.keep_archived_unmuted;
                    ahbVar.setCheckBoxIcon(0);
                } else if (b == 4) {
                    z2 = this.d.d.keep_archived_folders;
                    ahbVar.setCheckBoxIcon(0);
                } else if (b == 7) {
                    cs csVar = this.d;
                    boolean z3 = csVar.d.archive_and_mute_new_noncontact_peers;
                    if (!csVar.getUserConfig().p() && !this.d.getMessagesController().k4.L0.f) {
                        i3 = 2131232518;
                    }
                    ahbVar.setCheckBoxIcon(i3);
                    z2 = z3;
                } else {
                    return;
                }
                ahbVar.f(asVar.c, z2, z);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View mhbVar;
        cs csVar = this.d;
        if (i == 0) {
            mhbVar = new ld5(csVar.getParentActivity());
        } else if (i == 1) {
            mhbVar = new ahb(csVar.getParentActivity());
        } else {
            mhbVar = new mhb(csVar.getParentActivity());
        }
        return new s49(mhbVar);
    }
}
