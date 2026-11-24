package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class gt extends q59 {
    public final Context c;
    public final ht d;

    public gt(ht htVar, Context context) {
        this.d = htVar;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
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
        ht htVar = this.d;
        if (i < htVar.y || i >= htVar.E) {
            if (i == htVar.F) {
                return 1;
            }
            if (i != htVar.G && i != htVar.x) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        boolean z;
        int i3;
        View view = u69Var.a;
        ht htVar = this.d;
        ArrayList arrayList = htVar.h;
        if (d(i) == 0) {
            int i4 = i - htVar.y;
            et etVar = (et) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i4);
            boolean z2 = true;
            if (i4 != arrayList.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            etVar.b(stickerSetCovered, z);
            mu8 mu8Var = etVar.f;
            i3 = ((d) htVar).currentAccount;
            boolean D0 = hs6.d0(i3).D0(stickerSetCovered.set.id, true);
            etVar.a(D0, false, false);
            vh6 vh6Var = htVar.a;
            if (D0) {
                vh6Var.l(stickerSetCovered.set.id);
                if (mu8Var != null) {
                    mu8Var.a(false, false);
                }
            } else {
                if (vh6Var.h(stickerSetCovered.set.id) < 0) {
                    z2 = false;
                }
                if (mu8Var != null) {
                    mu8Var.a(z2, false);
                }
            }
            etVar.setOnCheckedChangeListener(new o(this, stickerSetCovered, (byte) 13));
        } else if (d(i) == 2) {
            njb njbVar = (njb) view;
            if (i == htVar.x) {
                njbVar.setTopPadding(17);
                njbVar.setBottomPadding(10);
                if (htVar.I == 5) {
                    i2 = 2131754100;
                } else {
                    i2 = 2131754089;
                }
                njbVar.setText(jb6.M0(i2, null));
                return;
            }
            njbVar.setTopPadding(10);
            njbVar.setBottomPadding(17);
            njbVar.setText(null);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        View view = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    view = new njb(context);
                }
            } else {
                view = new pa6(context);
            }
        } else {
            et etVar = new et(context, true);
            anb.h(cmb.c6, null, etVar);
            view = etVar;
        }
        view.setLayoutParams(new g69(-1, -2));
        return new u69(view);
    }
}
