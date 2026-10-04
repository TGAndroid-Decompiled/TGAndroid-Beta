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
public final class sd implements Runnable {
    public final int f19154a;
    public final boolean f19155b;
    public final boolean f19156c;
    public final Object d;
    public final Object f19157e;
    public final Object f19158f;
    public final Object h;

    public sd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f19154a = 0;
        this.d = messagesController;
        this.f19157e = tL_error;
        this.f19158f = n2Var;
        this.h = tL_channels_editAdmin;
        this.f19155b = z10;
        this.f19156c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f19154a;
        Object obj = this.h;
        Object obj2 = this.f19158f;
        Object obj3 = this.f19157e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$101((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.n2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f19155b, this.f19156c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$27((ArrayList) obj3, (ArrayList) obj2, this.f19155b, this.f19156c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (this.f19155b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f20312a0 = false;
                    actionBarLayout.f20349s.setScaleX(1.0f);
                    actionBarLayout.f20349s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f20308p1;
                    actionBarLayout.T(n2Var, this.f19156c);
                    actionBarLayout.f20349s.setTranslationX(0.0f);
                }
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.Z((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f19155b, this.f19156c, (Runnable) obj);
                return;
        }
    }

    public sd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f19154a = i10;
        this.d = notificationCenterDelegate;
        this.f19157e = obj;
        this.f19158f = obj2;
        this.f19155b = z10;
        this.f19156c = z11;
        this.h = obj3;
    }

    public sd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.n2 n2Var2) {
        this.f19154a = 2;
        this.d = actionBarLayout;
        this.f19155b = z10;
        this.f19157e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f19156c = z11;
        this.f19158f = n2Var;
        this.h = n2Var2;
    }
}
