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
public final class fd implements Runnable {
    public final int f18426a;
    public final boolean f18427b;
    public final boolean f18428c;
    public final Object d;
    public final Object e;
    public final Object f18429f;
    public final Object h;

    public fd(MessagesController messagesController, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z10, boolean z11) {
        this.f18426a = 0;
        this.d = messagesController;
        this.e = tL_error;
        this.f18429f = o2Var;
        this.h = tL_channels_editAdmin;
        this.f18427b = z10;
        this.f18428c = z11;
    }

    @Override
    public final void run() {
        int i10 = this.f18426a;
        Object obj = this.h;
        Object obj2 = this.f18429f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                ((MessagesController) obj4).lambda$setUserAdminRole$100((TLRPC.TL_error) obj3, (org.telegram.ui.ActionBar.o2) obj2, (TLRPC.TL_channels_editAdmin) obj, this.f18427b, this.f18428c);
                return;
            case 1:
                ((NotificationsController) obj4).lambda$processNewMessages$28((ArrayList) obj3, (ArrayList) obj2, this.f18427b, this.f18428c, (CountDownLatch) obj);
                return;
            case 2:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                if (this.f18427b) {
                    actionBarLayout.h = true;
                    actionBarLayout.J = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.f20614a0 = false;
                    actionBarLayout.f20653s.setScaleX(1.0f);
                    actionBarLayout.f20653s.setScaleY(1.0f);
                } else {
                    Drawable drawable = ActionBarLayout.f20610v1;
                    actionBarLayout.U(o2Var, this.f18428c);
                    actionBarLayout.f20653s.setTranslationX(0.0f);
                }
                if (o2Var != null) {
                    o2Var.onTransitionAnimationEnd(false, false);
                }
                o2Var2.onTransitionAnimationEnd(true, false);
                o2Var2.onBecomeFullyVisible();
                return;
            default:
                TwoStepVerificationActivity.a0((TwoStepVerificationActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, this.f18427b, this.f18428c, (Runnable) obj);
                return;
        }
    }

    public fd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, Object obj2, boolean z10, boolean z11, Object obj3, int i10) {
        this.f18426a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f18429f = obj2;
        this.f18427b = z10;
        this.f18428c = z11;
        this.h = obj3;
    }

    public fd(ActionBarLayout actionBarLayout, boolean z10, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z11, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.o2 o2Var2) {
        this.f18426a = 2;
        this.d = actionBarLayout;
        this.f18427b = z10;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f18428c = z11;
        this.f18429f = o2Var;
        this.h = o2Var2;
    }
}
