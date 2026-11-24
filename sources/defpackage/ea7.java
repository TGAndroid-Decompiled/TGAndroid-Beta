package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.TwoStepVerificationActivity;
public final class ea7 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ea7(oc7 oc7Var, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.e = oc7Var;
        this.f = tL_error;
        this.d = dVar;
        this.h = tL_channels_editAdmin;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ik.c0(((oc7) obj4).currentAccount, (TLRPC.TL_error) obj3, (d) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(z2), Boolean.valueOf(z));
                return;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                d dVar = (d) obj2;
                d dVar2 = (d) obj;
                Drawable drawable = ActionBarLayout.w1;
                if (z2) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.b0 = false;
                    actionBarLayout.s.setScaleX(1.0f);
                    actionBarLayout.s.setScaleY(1.0f);
                } else {
                    actionBarLayout.V(dVar, z);
                    actionBarLayout.s.setTranslationX(0.0f);
                }
                if (dVar != null) {
                    dVar.onTransitionAnimationEnd(false, false);
                }
                dVar2.onTransitionAnimationEnd(true, false);
                dVar2.onBecomeFullyVisible();
                return;
            case 2:
                ((lo7) obj4).D((ArrayList) obj3, (ArrayList) obj2, this.b, this.c, (CountDownLatch) obj);
                return;
            default:
                ((TwoStepVerificationActivity) obj4).l0((TLRPC.TL_error) obj3, (TLObject) obj2, this.b, this.c, (Runnable) obj);
                return;
        }
    }

    public ea7(jm7 jm7Var, Object obj, Object obj2, boolean z, boolean z2, Object obj3, byte b) {
        this.a = b;
        this.e = jm7Var;
        this.f = obj;
        this.d = obj2;
        this.b = z;
        this.c = z2;
        this.h = obj3;
    }

    public ea7(ActionBarLayout actionBarLayout, boolean z, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z2, d dVar, d dVar2) {
        this.a = (byte) 1;
        this.e = actionBarLayout;
        this.b = z;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.c = z2;
        this.d = dVar;
        this.h = dVar2;
    }
}
