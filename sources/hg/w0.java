package hg;

import ai.o8;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ci.rc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.u61;
import w7.w5;
public final class w0 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public is f11419a;
    public org.telegram.ui.ActionBar.u0 f11420b;
    public p71 f11421c;
    public b0 d;
    public final int[] f11422e;
    public final String[] f11423f;
    public boolean h;
    public int f11424n;
    public TL_account.TL_businessGreetingMessage f11425r;
    public boolean f11426s;
    public boolean v;
    public int f11427w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f11422e = iArr;
        this.f11424n = -4;
        this.f11427w = 7;
        this.f11423f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f11422e;
            if (i10 < iArr2.length) {
                this.f11423f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(w0 w0Var, ArrayList arrayList, h71 h71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        u61 u61Var = new u61(2);
        u61Var.f31071l = string;
        u61Var.f31074o = string2;
        u61Var.f31072m = "RestrictedEmoji";
        u61Var.f31073n = "👋";
        arrayList.add(u61Var);
        u61 i10 = u61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f11426s);
        arrayList.add(i10);
        arrayList.add(u61.B(null));
        if (w0Var.f11426s) {
            b2 d = c2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                u61 u61Var2 = new u61(17);
                u61Var2.G = d;
                arrayList.add(u61Var2);
            } else {
                u61 c10 = u61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f31076q = true;
                arrayList.add(c10);
            }
            arrayList.add(u61.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            u61 w10 = u61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(w0Var.v);
            arrayList.add(w10);
            u61 w11 = u61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!w0Var.v);
            arrayList.add(w11);
            arrayList.add(u61.B(null));
            w0Var.d.a(arrayList, h71Var, true);
            c.p(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.f11422e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f11427w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f11423f;
            ai.y1 y1Var = new ai.y1(w0Var, 25);
            u61 u61Var3 = new u61(14);
            u61Var3.f31075p = strArr;
            u61Var3.f31084z = i11;
            u61Var3.C = y1Var;
            u61Var3.B = -1L;
            arrayList.add(u61Var3);
            c.p(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11420b == null) {
            return;
        }
        boolean W = W();
        this.f11420b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11420b.animate();
            if (W) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (W) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (W) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f11420b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f11420b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f11420b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        b0 b0Var;
        if (this.h) {
            boolean z11 = this.f11426s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11425r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f11427w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((b0Var = this.d) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f11419a.f27268c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("hello");
            boolean z10 = this.f11426s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11421c.z1(2);
                int i10 = -this.f11424n;
                this.f11424n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f11421c)) {
            } else {
                this.f11419a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f11426s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f11172a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f11427w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f11172a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f11427w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new o8(this, 13));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        h71 h71Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f11425r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11426s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f11427w = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        b0 b0Var = this.d;
        if (b0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        p71 p71Var = this.f11421c;
        if (p71Var != null && (h71Var = p71Var.W2) != null) {
            h71Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f20895v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11419a = new is(mutate, new lq(h6.x0(null, i10, false)));
        this.f11420b = this.actionBar.p().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11419a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20504a7, false));
        b0 b0Var = new b0(this, new rc(this, 22));
        this.d = b0Var;
        b0Var.f11167n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11425r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        p71 p71Var = new p71(this, new bi.v(this, 25), new v0(this, 2), null);
        this.f11421c = p71Var;
        p71Var.p1();
        p71 p71Var2 = this.f11421c;
        p71Var2.W2.f26679r = false;
        frameLayout.addView(p71Var2, w5.d(-1.0f, -1));
        this.actionBar.B(this.f11421c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            p71 p71Var = this.f11421c;
            if (p71Var != null && (h71Var = p71Var.W2) != null) {
                h71Var.N(true);
            }
            V(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Y();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (W()) {
            if (z10) {
                if (!this.f11426s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f20142a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        c2.f(this.currentAccount).h();
        Y();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f11421c.setPadding(0, 0, 0, i13);
        this.f11421c.setClipToPadding(false);
    }
}
