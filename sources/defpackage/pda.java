package defpackage;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class pda implements View.OnClickListener {
    public final byte a;
    public final nha b;

    public pda(nha nhaVar, byte b) {
        this.a = b;
        this.b = nhaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        nha nhaVar = this.b;
        switch (b) {
            case 0:
                int closestTab = nhaVar.getClosestTab();
                bu5 I = bu5.I(nhaVar.y1, view);
                I.J = false;
                if (nhaVar.K(closestTab, new x59(I, (byte) 12))) {
                    if (closestTab != 13 && closestTab != 11) {
                        I.b0 = true;
                    } else {
                        I.b0(0.0f, -gm.L(52.0f));
                    }
                    I.s = (short) 0;
                    I.a0();
                    return;
                }
                return;
            case 1:
                zja zjaVar = nhaVar.J;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = zjaVar.b;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.d();
                }
                if (nhaVar.K(nhaVar.getClosestTab(), new et8(nhaVar, (byte) 11))) {
                    zjaVar.U(null, null);
                    return;
                }
                return;
            case 2:
                nhaVar.E(true);
                return;
            case 3:
                oea oeaVar = nhaVar.c0;
                lea leaVar = nhaVar.b0;
                if (nhaVar.t0.getAlpha() >= 0.1f) {
                    if (leaVar != null && leaVar.g()) {
                        leaVar.i();
                    }
                    if (oeaVar != null && oeaVar.f) {
                        mha t1 = nhaVar.t1(nhaVar.s1(nhaVar.getClosestTab()));
                        iga P = nhaVar.P(t1.a);
                        if (P != null) {
                            oeaVar.setReorderingAlbums(false);
                            sea seaVar = P.h;
                            for (int i = 0; i < seaVar.getChildCount(); i++) {
                                View childAt = seaVar.getChildAt(i);
                                if (childAt instanceof sha) {
                                    ((sha) childAt).l(false, true);
                                }
                            }
                            lha lhaVar = t1.c;
                            if (lhaVar != null && lhaVar.y) {
                                lhaVar.y = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                d dVar = nhaVar.y1;
                dVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                v9b.C(dVar.getParentActivity(), dVar.getCurrentAccount()).Q(null);
                return;
        }
    }
}
