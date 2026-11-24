package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class bt extends ka {
    public final ct d;

    public bt(ct ctVar) {
        this.d = ctVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
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
            return ((at) arrayList.get(i)).a;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        if (i >= 0 && i < this.d.h.size()) {
            at atVar = (at) this.d.h.get(i);
            int i2 = i + 1;
            int i3 = 0;
            if (i2 < this.d.h.size() && ((at) this.d.h.get(i2)).a == atVar.a) {
                z = true;
            } else {
                z = false;
            }
            int i4 = u69Var.f;
            if (i4 == 0) {
                ((jf5) u69Var.a).setText(atVar.c);
            } else if (i4 == 2) {
                njb njbVar = (njb) u69Var.a;
                if (TextUtils.isEmpty(atVar.c)) {
                    njbVar.setFixedSize(12);
                    njbVar.setText(null);
                    return;
                }
                njbVar.setFixedSize(0);
                njbVar.setText(atVar.c);
            } else if (i4 == 1) {
                bjb bjbVar = (bjb) u69Var.a;
                byte b = atVar.d;
                if (b == 1) {
                    z2 = this.d.d.keep_archived_unmuted;
                    bjbVar.setCheckBoxIcon(0);
                } else if (b == 4) {
                    z2 = this.d.d.keep_archived_folders;
                    bjbVar.setCheckBoxIcon(0);
                } else if (b == 7) {
                    ct ctVar = this.d;
                    boolean z3 = ctVar.d.archive_and_mute_new_noncontact_peers;
                    if (!ctVar.getUserConfig().p() && !this.d.getMessagesController().l4.L0.f) {
                        i3 = 2131232530;
                    }
                    bjbVar.setCheckBoxIcon(i3);
                    z2 = z3;
                } else {
                    return;
                }
                bjbVar.f(atVar.c, z2, z);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View njbVar;
        ct ctVar = this.d;
        if (i == 0) {
            njbVar = new jf5(ctVar.getParentActivity());
        } else if (i == 1) {
            njbVar = new bjb(ctVar.getParentActivity());
        } else {
            njbVar = new njb(ctVar.getParentActivity());
        }
        return new u69(njbVar);
    }
}
