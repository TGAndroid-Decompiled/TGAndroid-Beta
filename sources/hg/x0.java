package hg;

import ai.n8;
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
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.w51;
import w7.y5;
public final class x0 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public rr f10448a;
    public org.telegram.ui.ActionBar.u0 f10449b;
    public s61 f10450c;
    public c0 d;
    public final int[] e;
    public final String[] f10451f;
    public boolean h;
    public int f10452n;
    public TL_account.TL_businessGreetingMessage f10453r;
    public boolean f10454s;
    public boolean v;
    public int f10455w;

    public x0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f10452n = -4;
        this.f10455w = 7;
        this.f10451f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f10451f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(x0 x0Var, ArrayList arrayList, k61 k61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        w51 w51Var = new w51(2);
        w51Var.f29895l = string;
        w51Var.f29898o = string2;
        w51Var.f29896m = "RestrictedEmoji";
        w51Var.f29897n = "👋";
        arrayList.add(w51Var);
        w51 i10 = w51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(x0Var.f10454s);
        arrayList.add(i10);
        arrayList.add(w51.B(null));
        if (x0Var.f10454s) {
            b2 d = c2.f(x0Var.currentAccount).d("hello");
            if (d != null) {
                w51 w51Var2 = new w51(17);
                w51Var2.G = d;
                arrayList.add(w51Var2);
            } else {
                w51 c10 = w51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f29900q = true;
                arrayList.add(c10);
            }
            arrayList.add(w51.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            w51 w10 = w51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(x0Var.v);
            arrayList.add(w10);
            w51 w11 = w51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!x0Var.v);
            arrayList.add(w11);
            arrayList.add(w51.B(null));
            x0Var.d.a(arrayList, k61Var, true);
            c.n(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = x0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == x0Var.f10455w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = x0Var.f10451f;
            ai.y1 y1Var = new ai.y1(x0Var, 25);
            w51 w51Var3 = new w51(14);
            w51Var3.f29899p = strArr;
            w51Var3.f29908z = i11;
            w51Var3.C = y1Var;
            w51Var3.B = -1L;
            arrayList.add(w51Var3);
            c.n(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10449b == null) {
            return;
        }
        boolean W = W();
        this.f10449b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10449b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f10449b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f10449b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f10449b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        c0 c0Var;
        if (this.h) {
            boolean z11 = this.f10454s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f10453r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f10455w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((c0Var = this.d) != null && c0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f10448a.f28047c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("hello");
            boolean z10 = this.f10454s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f10450c.y1(2);
                int i10 = -this.f10452n;
                this.f10452n = i10;
                AndroidUtilities.shakeViewSpring(y12, i10);
            } else if (z10 && !this.d.k(this.f10450c)) {
            } else {
                this.f10448a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f10454s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f10205a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f10455w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f10205a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f10455w;
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

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        k61 k61Var;
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
        this.f10453r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10454s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f10455w = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        c0 c0Var = this.d;
        if (c0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            c0Var.j(tL_businessRecipients);
        }
        s61 s61Var = this.f10450c;
        if (s61Var != null && (k61Var = s61Var.Y2) != null) {
            k61Var.N(true);
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
        int i10 = h6.f19392v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10448a = new rr(mutate, new vp(h6.w0(null, i10, false)));
        this.f10449b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10448a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f19003a7, false));
        c0 c0Var = new c0(this, new rc(this, 22));
        this.d = c0Var;
        c0Var.f10220n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f10453r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        c0Var.j(tL_businessRecipients);
        s61 s61Var = new s61(this, new bi.v(this, 25), new w0(this, 2), null);
        this.f10450c = s61Var;
        s61Var.p1();
        s61 s61Var2 = this.f10450c;
        s61Var2.Y2.f25644r = false;
        frameLayout.addView(s61Var2, y5.c(-1.0f, -1));
        this.actionBar.z(this.f10450c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k61 k61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            s61 s61Var = this.f10450c;
            if (s61Var != null && (k61Var = s61Var.Y2) != null) {
                k61Var.N(true);
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
                if (!this.f10454s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new w0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new w0(this, 1));
                showDialog(alertDialog$Builder.f18661a);
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
        this.f10450c.setPadding(0, 0, 0, i13);
        this.f10450c.setClipToPadding(false);
    }
}
