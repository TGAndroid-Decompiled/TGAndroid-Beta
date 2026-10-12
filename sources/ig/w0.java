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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import w7.a6;
public final class w0 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public ds f11674a;
    public org.telegram.ui.ActionBar.u0 f11675b;
    public h71 f11676c;
    public a0 d;
    public final int[] e;
    public final String[] f11677f;
    public boolean h;
    public int f11678n;
    public TL_account.TL_businessGreetingMessage f11679r;
    public boolean f11680s;
    public boolean v;
    public int f11681w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f11678n = -4;
        this.f11681w = 7;
        this.f11677f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f11677f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(w0 w0Var, ArrayList arrayList, z61 z61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        l61 l61Var = new l61(2);
        l61Var.f26954l = string;
        l61Var.f26957o = string2;
        l61Var.f26955m = "RestrictedEmoji";
        l61Var.f26956n = "👋";
        arrayList.add(l61Var);
        l61 i10 = l61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f11680s);
        arrayList.add(i10);
        arrayList.add(l61.B(null));
        if (w0Var.f11680s) {
            a2 d = b2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                l61 l61Var2 = new l61(17);
                l61Var2.G = d;
                arrayList.add(l61Var2);
            } else {
                l61 c10 = l61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f26959q = true;
                arrayList.add(c10);
            }
            arrayList.add(l61.B(null));
            i2.d.o(R.string.BusinessRecipients, arrayList);
            l61 w9 = l61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w9.K(w0Var.v);
            arrayList.add(w9);
            l61 w10 = l61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!w0Var.v);
            arrayList.add(w10);
            arrayList.add(l61.B(null));
            w0Var.d.a(arrayList, z61Var, true);
            i2.d.y(R.string.BusinessGreetRecipientsInfo, arrayList);
            i2.d.o(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f11681w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f11677f;
            bi.o1 o1Var = new bi.o1(w0Var, 25);
            l61 l61Var3 = new l61(14);
            l61Var3.f26958p = strArr;
            l61Var3.f26967z = i11;
            l61Var3.C = o1Var;
            l61Var3.B = -1L;
            arrayList.add(l61Var3);
            i2.d.y(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11675b == null) {
            return;
        }
        boolean W = W();
        this.f11675b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11675b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f11675b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f11675b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f11675b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.f11680s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11679r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f11681w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((a0Var = this.d) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f11674a.f24480c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("hello");
            boolean z10 = this.f11680s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11676c.z1(2);
                int i10 = -this.f11678n;
                this.f11678n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f11676c)) {
            } else {
                this.f11674a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f11680s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f11434a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f11681w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f11434a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f11681w;
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
        z61 z61Var;
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
        this.f11679r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11680s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f11681w = i10;
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
        h71 h71Var = this.f11676c;
        if (h71Var != null && (z61Var = h71Var.W2) != null) {
            z61Var.N(true);
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
        int i10 = g6.f20235v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11674a = new ds(mutate, new gq(g6.x0(null, i10, false)));
        this.f11675b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11674a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        a0 a0Var = new a0(this, new t0(this, 1));
        this.d = a0Var;
        a0Var.f11431n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11679r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        h71 h71Var = new h71(this, new ci.u(this, 25), new v0(this, 2), null);
        this.f11676c = h71Var;
        h71Var.p1();
        h71 h71Var2 = this.f11676c;
        h71Var2.W2.f31780r = false;
        frameLayout.addView(h71Var2, a6.d(-1.0f, -1));
        this.actionBar.A(this.f11676c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z61 z61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            h71 h71Var = this.f11676c;
            if (h71Var != null && (z61Var = h71Var.W2) != null) {
                z61Var.N(true);
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
                if (!this.f11680s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f19548a);
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
        this.f11676c.setPadding(0, 0, 0, i13);
        this.f11676c.setClipToPadding(false);
    }
}
