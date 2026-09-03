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
public final class wd implements Runnable {
    public final int f20542a;
    public final boolean f20543b;
    public final boolean f20544c;
    public final Object d;
    public final Object f20545e;
    public final Object f20546f;
    public final Object h;

    public wd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z4, boolean z10) {
        this.f20542a = 0;
        this.d = messagesController;
        this.f20545e = tL_error;
        this.f20546f = p2Var;
        this.h = tL_channels_editAdmin;
        this.f20543b = z4;
        this.f20544c = z10;
    }

    @Override
    public final void run() {
        int i10 = this.f20542a;
        Object obj = this.h;
        Object obj2 = this.f20546f;
        Object obj3 = this.f20545e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.p2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f20543b, this.f20544c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f20543b, this.f20544c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                if (this.f20543b) {
                    actionBarLayout.h = true;
                    actionBarLayout.G = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.U = false;
                    actionBarLayout.f21145s.setScaleX(1.0f);
                    actionBarLayout.f21145s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f21107m1;
                    actionBarLayout.T(p2Var, this.f20544c);
                    actionBarLayout.f21145s.setTranslationX(0.0f);
                }
                if (p2Var != null) {
                    p2Var.onTransitionAnimationEnd(false, false);
                }
                p2Var2.onTransitionAnimationEnd(true, false);
                p2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f20543b, this.f20544c, (Runnable) obj);
                return;
        }
    }

    public wd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z4, boolean z10, Object obj3, int i10) {
        this.f20542a = i10;
        this.d = notificationCenterDelegate;
        this.f20545e = obj;
        this.f20546f = obj2;
        this.f20543b = z4;
        this.f20544c = z10;
        this.h = obj3;
    }

    public wd(ActionBarLayout actionBarLayout, boolean z4, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.p2 p2Var2) {
        this.f20542a = 2;
        this.d = actionBarLayout;
        this.f20543b = z4;
        this.f20545e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f20544c = z10;
        this.f20546f = p2Var;
        this.h = p2Var2;
    }
}
