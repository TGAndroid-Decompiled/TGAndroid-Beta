package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class hs extends c79 {
    public final Context c;
    public final is d;

    public hs(is isVar, Context context) {
        this.d = isVar;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.H;
    }

    @Override
    public final int d(int i) {
        is isVar = this.d;
        if (i < isVar.y || i >= isVar.E) {
            if (i == isVar.F) {
                return 1;
            }
            if (i != isVar.G && i != isVar.x) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        int i2;
        boolean z;
        int i3;
        View view = f89Var.a;
        is isVar = this.d;
        ArrayList arrayList = isVar.h;
        if (d(i) == 0) {
            int i4 = i - isVar.y;
            fs fsVar = (fs) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i4);
            boolean z2 = true;
            if (i4 != arrayList.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            fsVar.b(stickerSetCovered, z);
            uv8 uv8Var = fsVar.f;
            i3 = ((e) isVar).currentAccount;
            boolean D0 = ls6.d0(i3).D0(stickerSetCovered.set.id, true);
            fsVar.a(D0, false, false);
            zh6 zh6Var = isVar.a;
            if (D0) {
                zh6Var.l(stickerSetCovered.set.id);
                if (uv8Var != null) {
                    uv8Var.a(false, false);
                }
            } else {
                if (zh6Var.h(stickerSetCovered.set.id) < 0) {
                    z2 = false;
                }
                if (uv8Var != null) {
                    uv8Var.a(z2, false);
                }
            }
            fsVar.setOnCheckedChangeListener(new o(this, stickerSetCovered, (byte) 13));
        } else if (d(i) == 2) {
            ilb ilbVar = (ilb) view;
            if (i == isVar.x) {
                ilbVar.setTopPadding(17);
                ilbVar.setBottomPadding(10);
                if (isVar.I == 5) {
                    i2 = 2131754128;
                } else {
                    i2 = 2131754117;
                }
                ilbVar.setText(ob6.M0(i2, null));
                return;
            }
            ilbVar.setTopPadding(10);
            ilbVar.setBottomPadding(17);
            ilbVar.setText(null);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        View view = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    view = new ilb(context);
                }
            } else {
                view = new ua6(context);
            }
        } else {
            fs fsVar = new fs(context, true);
            yob.h(aob.d6, null, fsVar);
            view = fsVar;
        }
        view.setLayoutParams(new r79(-1, -2));
        return new f89(view);
    }
}
