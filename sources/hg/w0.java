package hg;

import ai.n8;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ci.qc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class w0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public sr f11377a;
    public org.telegram.ui.ActionBar.v0 f11378b;
    public c71 f11379c;
    public b0 d;
    public final int[] f11380e;
    public final String[] f11381f;
    public boolean h;
    public int f11382n;
    public TL_account.TL_businessGreetingMessage f11383r;
    public boolean f11384s;
    public boolean v;
    public int f11385w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f11380e = iArr;
        this.f11382n = -4;
        this.f11385w = 7;
        this.f11381f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f11380e;
            if (i10 < iArr2.length) {
                this.f11381f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void S(w0 w0Var, ArrayList arrayList, u61 u61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        g61 g61Var = new g61(2);
        g61Var.f26674l = string;
        g61Var.f26677o = string2;
        g61Var.f26675m = "RestrictedEmoji";
        g61Var.f26676n = "👋";
        arrayList.add(g61Var);
        g61 i10 = g61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f11384s);
        arrayList.add(i10);
        arrayList.add(g61.B(null));
        if (w0Var.f11384s) {
            a2 d = b2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                g61 g61Var2 = new g61(17);
                g61Var2.G = d;
                arrayList.add(g61Var2);
            } else {
                g61 c10 = g61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f26679q = true;
                arrayList.add(c10);
            }
            arrayList.add(g61.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            g61 w10 = g61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(w0Var.v);
            arrayList.add(w10);
            g61 w11 = g61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!w0Var.v);
            arrayList.add(w11);
            arrayList.add(g61.B(null));
            w0Var.d.a(arrayList, u61Var, true);
            c.n(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.f11380e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f11385w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f11381f;
            ai.y1 y1Var = new ai.y1(w0Var, 25);
            g61 g61Var3 = new g61(14);
            g61Var3.f26678p = strArr;
            g61Var3.f26687z = i11;
            g61Var3.C = y1Var;
            g61Var3.B = -1L;
            arrayList.add(g61Var3);
            c.n(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void T(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11378b == null) {
            return;
        }
        boolean U = U();
        this.f11378b.setEnabled(U);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11378b.animate();
            if (U) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (U) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (U) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f11378b;
        if (U) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f11378b;
        if (U) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f11378b;
        if (U) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean U() {
        boolean z10;
        b0 b0Var;
        if (this.h) {
            boolean z11 = this.f11384s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11383r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f11385w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((b0Var = this.d) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.f11377a.f30870c <= 0.0f) {
            if (!U()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("hello");
            boolean z10 = this.f11384s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View A1 = this.f11379c.A1(2);
                int i10 = -this.f11382n;
                this.f11382n = i10;
                AndroidUtilities.shakeViewSpring(A1, i10);
            } else if (z10 && !this.d.k(this.f11379c)) {
            } else {
                this.f11377a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f11384s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f11104a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f11385w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f11104a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f11385w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new n8(this, 13));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void X() {
        boolean z10;
        int i10;
        boolean z11;
        u61 u61Var;
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
        this.f11383r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11384s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f11385w = i10;
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
        c71 c71Var = this.f11379c;
        if (c71Var != null && (u61Var = c71Var.f25250f3) != null) {
            u61Var.N(true);
        }
        T(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.f21159v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11377a = new sr(mutate, new wp(i6.w0(null, i10, false)));
        this.f11378b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11377a);
        T(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new qc(this, 22));
        this.d = b0Var;
        b0Var.f11124n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11383r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        c71 c71Var = new c71(this, new bi.v(this, 25), new v0(this, 2), null);
        this.f11379c = c71Var;
        c71Var.s1();
        this.f11379c.setSectionsDrawBackground(true);
        c71 c71Var2 = this.f11379c;
        c71Var2.f25250f3.f31313r = false;
        frameLayout.addView(c71Var2, z5.c(-1.0f, -1));
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            c71 c71Var = this.f11379c;
            if (c71Var != null && (u61Var = c71Var.f25250f3) != null) {
                u61Var.N(true);
            }
            T(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f11379c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (U()) {
            if (z10) {
                if (!this.f11384s) {
                    W();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f20372a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        b2.f(this.currentAccount).h();
        X();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }
}
