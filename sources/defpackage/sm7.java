package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class sm7 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public rm7 f;
    public final zr9 h;
    public final NotificationsCustomSettingsActivity n;

    public sm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.h = zr9Var;
        zr9Var.a = new im6(this, (byte) 14);
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final Object E(int i) {
        ArrayList arrayList = this.h.e;
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        int k = ir2.k(1, i, this.d);
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
            zr9 zr9Var = this.h;
            int i = this.n.s;
            if (i != 1 && i != 3) {
                z = true;
            } else {
                z = false;
            }
            zr9Var.g(null, true, z, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        co3 co3Var = Utilities.g;
        rm7 rm7Var = new rm7(this, str, (byte) 0);
        this.f = rm7Var;
        co3Var.d(rm7Var, 300L);
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
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((l35) view).setText(k96.M0(2131754373, "AddToExceptions"));
            return;
        }
        v6c v6cVar = (v6c) view;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        boolean z2 = false;
        if (i < size) {
            vm7 vm7Var = (vm7) arrayList.get(i);
            CharSequence charSequence = (CharSequence) this.e.get(i);
            if (i == this.d.size() - 1) {
                z = false;
            }
            v6cVar.f(vm7Var, charSequence, z);
            v6cVar.setAddButtonVisible(false);
            return;
        }
        int k = ir2.k(1, i, arrayList);
        ArrayList arrayList2 = this.h.e;
        TLObject tLObject = (TLObject) arrayList2.get(k);
        String M0 = k96.M0(2131747699, "NotificationsOn");
        if (k != arrayList2.size() - 1) {
            z2 = true;
        }
        v6cVar.d(tLObject, null, M0, z2);
        v6cVar.setAddButtonVisible(true);
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View v6cVar;
        if (i != 0) {
            v6cVar = new l35(this.c, null);
            v6cVar.setBackgroundColor(0);
            v6cVar.setTag(-33024);
        } else {
            v6cVar = new v6c(4, 0, null, this.c, false, true);
        }
        return new s49(v6cVar);
    }
}
