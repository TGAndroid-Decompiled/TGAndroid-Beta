package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.z7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import w7.z5;
public final class w0 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public ds f11678a;
    public org.telegram.ui.ActionBar.u0 f11679b;
    public i71 f11680c;
    public a0 d;
    public final int[] e;
    public final String[] f11681f;
    public boolean h;
    public int f11682n;
    public TL_account.TL_businessGreetingMessage f11683r;
    public boolean f11684s;
    public boolean v;
    public int f11685w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f11682n = -4;
        this.f11685w = 7;
        this.f11681f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f11681f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(w0 w0Var, ArrayList arrayList, a71 a71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        m61 m61Var = new m61(2);
        m61Var.f26946l = string;
        m61Var.f26949o = string2;
        m61Var.f26947m = "RestrictedEmoji";
        m61Var.f26948n = "👋";
        arrayList.add(m61Var);
        m61 i10 = m61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f11684s);
        arrayList.add(i10);
        arrayList.add(m61.B(null));
        if (w0Var.f11684s) {
            a2 d = b2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                m61 m61Var2 = new m61(17);
                m61Var2.G = d;
                arrayList.add(m61Var2);
            } else {
                m61 c10 = m61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f26951q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
            i2.d.p(R.string.BusinessRecipients, arrayList);
            m61 w9 = m61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w9.K(w0Var.v);
            arrayList.add(w9);
            m61 w10 = m61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!w0Var.v);
            arrayList.add(w10);
            arrayList.add(m61.B(null));
            w0Var.d.a(arrayList, a71Var, true);
            i2.d.B(R.string.BusinessGreetRecipientsInfo, arrayList);
            i2.d.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f11685w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f11681f;
            bi.o1 o1Var = new bi.o1(w0Var, 25);
            m61 m61Var3 = new m61(14);
            m61Var3.f26950p = strArr;
            m61Var3.f26959z = i11;
            m61Var3.C = o1Var;
            m61Var3.B = -1L;
            arrayList.add(m61Var3);
            i2.d.B(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11679b == null) {
            return;
        }
        boolean W = W();
        this.f11679b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11679b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f11679b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f11679b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f11679b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.f11684s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11683r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f11685w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((a0Var = this.d) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f11678a.f24174c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("hello");
            boolean z10 = this.f11684s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11680c.z1(2);
                int i10 = -this.f11682n;
                this.f11682n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f11680c)) {
            } else {
                this.f11678a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f11684s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f11438a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f11685w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f11438a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f11685w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new z7(this, 13));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        a71 a71Var;
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
        this.f11683r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11684s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f11685w = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        a0 a0Var = this.d;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        i71 i71Var = this.f11680c;
        if (i71Var != null && (a71Var = i71Var.W2) != null) {
            a71Var.N(true);
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f19935v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11678a = new ds(mutate, new gq(g6.x0(null, i10, false)));
        this.f11679b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11678a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19543a7, false));
        a0 a0Var = new a0(this, new t0(this, 1));
        this.d = a0Var;
        a0Var.f11435n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11683r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        i71 i71Var = new i71(this, new ci.u(this, 25), new v0(this, 2), null);
        this.f11680c = i71Var;
        i71Var.p1();
        i71 i71Var2 = this.f11680c;
        i71Var2.W2.f23145r = false;
        frameLayout.addView(i71Var2, z5.d(-1.0f, -1));
        this.actionBar.B(this.f11680c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            i71 i71Var = this.f11680c;
            if (i71Var != null && (a71Var = i71Var.W2) != null) {
                a71Var.N(true);
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
                if (!this.f11684s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f19248a);
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
        this.f11680c.setPadding(0, 0, 0, i13);
        this.f11680c.setClipToPadding(false);
    }
}
