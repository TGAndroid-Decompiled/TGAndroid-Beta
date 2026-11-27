package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class sp7 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public rp7 f;
    public final sv9 h;
    public final NotificationsCustomSettingsActivity n;

    public sp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.h = sv9Var;
        sv9Var.a = new bm6(this, (byte) 19);
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final Object E(int i) {
        ArrayList arrayList = this.h.e;
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        int k = bs2.k(1, i, this.d);
        if (k >= 0 && k < arrayList.size()) {
            return arrayList.get(k);
        }
        return null;
    }

    public final void F(String str) {
        boolean z;
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.h.f(null, null);
            sv9 sv9Var = this.h;
            int i = this.n.s;
            if (i != 1 && i != 3) {
                z = true;
            } else {
                z = false;
            }
            sv9Var.g(null, true, z, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        to3 to3Var = Utilities.g;
        rp7 rp7Var = new rp7(this, str, (byte) 0);
        this.f = rp7Var;
        to3Var.d(rp7Var, 300L);
    }

    @Override
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        if (!arrayList.isEmpty()) {
            return arrayList.size() + 1 + size;
        }
        return size;
    }

    @Override
    public final int d(int i) {
        if (i == this.d.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((p55) view).setText(ob6.M0(2131754369, "AddToExceptions"));
            return;
        }
        vac vacVar = (vac) view;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        boolean z2 = false;
        if (i < size) {
            vp7 vp7Var = (vp7) arrayList.get(i);
            CharSequence charSequence = (CharSequence) this.e.get(i);
            if (i == this.d.size() - 1) {
                z = false;
            }
            vacVar.f(vp7Var, charSequence, z);
            vacVar.setAddButtonVisible(false);
            return;
        }
        int k = bs2.k(1, i, arrayList);
        ArrayList arrayList2 = this.h.e;
        TLObject tLObject = (TLObject) arrayList2.get(k);
        String M0 = ob6.M0(2131747619, "NotificationsOn");
        if (k != arrayList2.size() - 1) {
            z2 = true;
        }
        vacVar.d(tLObject, null, M0, z2);
        vacVar.setAddButtonVisible(true);
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View vacVar;
        if (i != 0) {
            vacVar = new p55(this.c, null);
            vacVar.setBackgroundColor(0);
            vacVar.setTag(-33024);
        } else {
            vacVar = new vac(4, 0, null, this.c, false, true);
        }
        return new f89(vacVar);
    }
}
