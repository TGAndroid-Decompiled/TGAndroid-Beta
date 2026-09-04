package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.v7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.v51;
import w7.x5;
public final class w0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public or f12257a;
    public org.telegram.ui.ActionBar.v0 f12258b;
    public d61 f12259c;
    public a0 d;
    public final int[] f12260e;
    public final String[] f12261f;
    public boolean h;
    public int f12262n;
    public TL_account.TL_businessGreetingMessage f12263r;
    public boolean f12264s;
    public boolean v;
    public int f12265w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f12260e = iArr;
        this.f12262n = -4;
        this.f12265w = 7;
        this.f12261f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f12260e;
            if (i10 < iArr2.length) {
                this.f12261f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(w0 w0Var, ArrayList arrayList, v51 v51Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        h51 h51Var = new h51(2);
        h51Var.f26594l = string;
        h51Var.f26597o = string2;
        h51Var.f26595m = "RestrictedEmoji";
        h51Var.f26596n = "👋";
        arrayList.add(h51Var);
        h51 i10 = h51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f12264s);
        arrayList.add(i10);
        arrayList.add(h51.B(null));
        if (w0Var.f12264s) {
            a2 d = b2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                h51 h51Var2 = new h51(17);
                h51Var2.G = d;
                arrayList.add(h51Var2);
            } else {
                h51 c10 = h51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f26599q = true;
                arrayList.add(c10);
            }
            arrayList.add(h51.B(null));
            i2.g.p(R.string.BusinessRecipients, arrayList);
            h51 w10 = h51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(w0Var.v);
            arrayList.add(w10);
            h51 w11 = h51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!w0Var.v);
            arrayList.add(w11);
            arrayList.add(h51.B(null));
            w0Var.d.a(arrayList, v51Var, true);
            i2.g.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            i2.g.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.f12260e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f12265w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f12261f;
            bi.o1 o1Var = new bi.o1(w0Var, 22);
            h51 h51Var3 = new h51(14);
            h51Var3.f26598p = strArr;
            h51Var3.f26607z = i11;
            h51Var3.C = o1Var;
            h51Var3.B = -1L;
            arrayList.add(h51Var3);
            i2.g.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f12258b == null) {
            return;
        }
        boolean W = W();
        this.f12258b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f12258b.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f12258b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f12258b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f12258b;
        if (W) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.f12264s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f12263r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f12265w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((a0Var = this.d) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f12257a.f29171c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("hello");
            boolean z10 = this.f12264s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View x12 = this.f12259c.x1(2);
                int i10 = -this.f12262n;
                this.f12262n = i10;
                AndroidUtilities.shakeViewSpring(x12, i10);
            } else if (z10 && !this.d.k(this.f12259c)) {
            } else {
                this.f12257a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f12264s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f11992a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f12265w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f11992a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f12265w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new v7(this, 13));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        v51 v51Var;
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
        this.f12263r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12264s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f12265w = i10;
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
        d61 d61Var = this.f12259c;
        if (d61Var != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f20992v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12257a = new or(mutate, new sp(j6.w0(null, i10, false)));
        this.f12258b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12257a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
        a0 a0Var = new a0(this, new t0(this, 1));
        this.d = a0Var;
        a0Var.f11989n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f12263r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        d61 d61Var = new d61(this, new ci.u(this, 25), new v0(this, 2), null);
        this.f12259c = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.f12259c;
        d61Var2.Y2.f31135r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.A(this.f12259c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            d61 d61Var = this.f12259c;
            if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                v51Var.N(true);
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
                if (!this.f12264s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f20198a);
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
        this.f12259c.setPadding(0, 0, 0, i13);
        this.f12259c.setClipToPadding(false);
    }
}
