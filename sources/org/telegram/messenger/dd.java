package org.telegram.messenger;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.TwoStepVerificationActivity;
public final class dd implements Runnable {
    public final int f17648a;
    public final boolean f17649b;
    public final boolean f17650c;
    public final Object d;
    public final Object f17651e;
    public final Object f17652f;
    public final Object h;

    public dd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f17648a = 0;
        this.d = messagesController;
        this.f17651e = tL_error;
        this.f17652f = n2Var;
        this.h = tL_channels_editAdmin;
        this.f17649b = z10;
        this.f17650c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f17648a;
        Object obj = this.h;
        Object obj2 = this.f17652f;
        Object obj3 = this.f17651e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$100((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f17649b, this.f17650c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$28((ArrayList) obj3, (ArrayList) obj2, this.f17649b, this.f17650c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (this.f17649b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f20314a0 = false;
                    actionBarLayout.f20351s.setScaleX(1.0f);
                    actionBarLayout.f20351s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f20310p1;
                    actionBarLayout.T(n2Var, this.f17650c);
                    actionBarLayout.f20351s.setTranslationX(0.0f);
                }
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f17649b, this.f17650c, (Runnable) obj);
                return;
        }
    }

    public dd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f17648a = i10;
        this.d = notificationCenterDelegate;
        this.f17651e = obj;
        this.f17652f = obj2;
        this.f17649b = z10;
        this.f17650c = z11;
        this.h = obj3;
    }

    public dd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2) {
        this.f17648a = 2;
        this.d = actionBarLayout;
        this.f17649b = z10;
        this.f17651e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f17650c = z11;
        this.f17652f = n2Var;
        this.h = n2Var2;
    }
}
