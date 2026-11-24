package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class gs extends n39 {
    public final Context c;
    public final hs d;

    public gs(hs hsVar, Context context) {
        this.d = hsVar;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
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
        hs hsVar = this.d;
        if (i < hsVar.y || i >= hsVar.E) {
            if (i == hsVar.F) {
                return 1;
            }
            if (i != hsVar.G && i != hsVar.x) {
                return 0;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        int i3;
        View view = s49Var.a;
        hs hsVar = this.d;
        ArrayList arrayList = hsVar.h;
        if (d(i) == 0) {
            int i4 = i - hsVar.y;
            es esVar = (es) view;
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i4);
            boolean z2 = true;
            if (i4 != arrayList.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            esVar.b(stickerSetCovered, z);
            ls8 ls8Var = esVar.f;
            i3 = ((d) hsVar).currentAccount;
            boolean D0 = hq6.d0(i3).D0(stickerSetCovered.set.id, true);
            esVar.a(D0, false, false);
            vf6 vf6Var = hsVar.a;
            if (D0) {
                vf6Var.l(stickerSetCovered.set.id);
                if (ls8Var != null) {
                    ls8Var.a(false, false);
                }
            } else {
                if (vf6Var.h(stickerSetCovered.set.id) < 0) {
                    z2 = false;
                }
                if (ls8Var != null) {
                    ls8Var.a(z2, false);
                }
            }
            esVar.setOnCheckedChangeListener(new o(this, stickerSetCovered, (byte) 13));
        } else if (d(i) == 2) {
            mhb mhbVar = (mhb) view;
            if (i == hsVar.x) {
                mhbVar.setTopPadding(17);
                mhbVar.setBottomPadding(10);
                if (hsVar.I == 5) {
                    i2 = 2131754132;
                } else {
                    i2 = 2131754121;
                }
                mhbVar.setText(k96.M0(i2, null));
                return;
            }
            mhbVar.setTopPadding(10);
            mhbVar.setBottomPadding(17);
            mhbVar.setText(null);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        View view = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    view = new mhb(context);
                }
            } else {
                view = new q86(context);
            }
        } else {
            es esVar = new es(context, true);
            zkb.h(bkb.c6, null, esVar);
            view = esVar;
        }
        view.setLayoutParams(new e49(-1, -2));
        return new s49(view);
    }
}
