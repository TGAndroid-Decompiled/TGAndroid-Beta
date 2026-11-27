package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class cs extends la {
    public final ds d;

    public cs(ds dsVar) {
        this.d = dsVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
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
            return ((bs) arrayList.get(i)).a;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        if (i >= 0 && i < this.d.h.size()) {
            bs bsVar = (bs) this.d.h.get(i);
            int i2 = i + 1;
            int i3 = 0;
            if (i2 < this.d.h.size() && ((bs) this.d.h.get(i2)).a == bsVar.a) {
                z = true;
            } else {
                z = false;
            }
            int i4 = f89Var.f;
            if (i4 == 0) {
                ((mf5) f89Var.a).setText(bsVar.c);
            } else if (i4 == 2) {
                ilb ilbVar = (ilb) f89Var.a;
                if (TextUtils.isEmpty(bsVar.c)) {
                    ilbVar.setFixedSize(12);
                    ilbVar.setText(null);
                    return;
                }
                ilbVar.setFixedSize(0);
                ilbVar.setText(bsVar.c);
            } else if (i4 == 1) {
                wkb wkbVar = (wkb) f89Var.a;
                byte b = bsVar.d;
                if (b == 1) {
                    z2 = this.d.d.keep_archived_unmuted;
                    wkbVar.setCheckBoxIcon(0);
                } else if (b == 4) {
                    z2 = this.d.d.keep_archived_folders;
                    wkbVar.setCheckBoxIcon(0);
                } else if (b == 7) {
                    ds dsVar = this.d;
                    boolean z3 = dsVar.d.archive_and_mute_new_noncontact_peers;
                    if (!dsVar.getUserConfig().p() && !this.d.getMessagesController().k4.T0.f) {
                        i3 = 2131232529;
                    }
                    wkbVar.setCheckBoxIcon(i3);
                    z2 = z3;
                } else {
                    return;
                }
                wkbVar.f(bsVar.c, z2, z);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View ilbVar;
        ds dsVar = this.d;
        if (i == 0) {
            ilbVar = new mf5(dsVar.getParentActivity());
        } else if (i == 1) {
            ilbVar = new wkb(dsVar.getParentActivity());
        } else {
            ilbVar = new ilb(dsVar.getParentActivity());
        }
        return new f89(ilbVar);
    }
}
