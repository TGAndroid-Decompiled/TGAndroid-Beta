package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.NotificationsCustomSettingsActivity;
public final class wo7 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public vo7 f;
    public final bu9 h;
    public final NotificationsCustomSettingsActivity n;

    public wo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.h = bu9Var;
        bu9Var.a = new cj6(this, (byte) 17);
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final Object E(int i) {
        ArrayList arrayList = this.h.e;
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        int k = ts2.k(1, i, this.d);
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
            bu9 bu9Var = this.h;
            int i = this.n.s;
            if (i != 1 && i != 3) {
                z = true;
            } else {
                z = false;
            }
            bu9Var.g(null, true, z, true, false, 0L, false, 0, 0);
            f();
            return;
        }
        mp3 mp3Var = Utilities.g;
        vo7 vo7Var = new vo7(this, str, (byte) 0);
        this.f = vo7Var;
        mp3Var.d(vo7Var, 300L);
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
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((l55) view).setText(jb6.M0(2131754373, "AddToExceptions"));
            return;
        }
        w8c w8cVar = (w8c) view;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        boolean z2 = false;
        if (i < size) {
            zo7 zo7Var = (zo7) arrayList.get(i);
            CharSequence charSequence = (CharSequence) this.e.get(i);
            if (i == this.d.size() - 1) {
                z = false;
            }
            w8cVar.f(zo7Var, charSequence, z);
            w8cVar.setAddButtonVisible(false);
            return;
        }
        int k = ts2.k(1, i, arrayList);
        ArrayList arrayList2 = this.h.e;
        TLObject tLObject = (TLObject) arrayList2.get(k);
        String M0 = jb6.M0(2131747625, "NotificationsOn");
        if (k != arrayList2.size() - 1) {
            z2 = true;
        }
        w8cVar.d(tLObject, null, M0, z2);
        w8cVar.setAddButtonVisible(true);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View w8cVar;
        if (i != 0) {
            w8cVar = new l55(this.c, null);
            w8cVar.setBackgroundColor(0);
            w8cVar.setTag(-33024);
        } else {
            w8cVar = new w8c(4, 0, null, this.c, false, true);
        }
        return new u69(w8cVar);
    }
}
