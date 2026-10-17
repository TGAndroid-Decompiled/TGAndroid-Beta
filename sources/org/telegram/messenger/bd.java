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
public final class bd implements Runnable {
    public final int f17942a;
    public final boolean f17943b;
    public final boolean f17944c;
    public final Object d;
    public final Object e;
    public final Object f17945f;
    public final Object h;

    public bd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f17942a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f17945f = n2Var;
        this.h = tL_channels_editAdmin;
        this.f17943b = z10;
        this.f17944c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f17942a;
        Object obj = this.h;
        Object obj2 = this.f17945f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$100((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f17943b, this.f17944c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$28((ArrayList) obj3, (ArrayList) obj2, this.f17943b, this.f17944c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (this.f17943b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f20543a0 = false;
                    actionBarLayout.f20579s.setScaleX(1.0f);
                    actionBarLayout.f20579s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f20539p1;
                    actionBarLayout.T(n2Var, this.f17944c);
                    actionBarLayout.f20579s.setTranslationX(0.0f);
                }
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f17943b, this.f17944c, (Runnable) obj);
                return;
        }
    }

    public bd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f17942a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f17945f = obj2;
        this.f17943b = z10;
        this.f17944c = z11;
        this.h = obj3;
    }

    public bd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2) {
        this.f17942a = 2;
        this.d = actionBarLayout;
        this.f17943b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f17944c = z11;
        this.f17945f = n2Var;
        this.h = n2Var2;
    }
}
