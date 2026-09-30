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
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.y51;
import w7.y5;
public final class x0 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public sr f10462a;
    public org.telegram.ui.ActionBar.u0 f10463b;
    public u61 f10464c;
    public c0 d;
    public final int[] e;
    public final String[] f10465f;
    public boolean h;
    public int f10466n;
    public TL_account.TL_businessGreetingMessage f10467r;
    public boolean f10468s;
    public boolean v;
    public int f10469w;

    public x0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f10466n = -4;
        this.f10469w = 7;
        this.f10465f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f10465f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(x0 x0Var, ArrayList arrayList, m61 m61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        y51 y51Var = new y51(2);
        y51Var.f30637l = string;
        y51Var.f30640o = string2;
        y51Var.f30638m = "RestrictedEmoji";
        y51Var.f30639n = "👋";
        arrayList.add(y51Var);
        y51 i10 = y51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(x0Var.f10468s);
        arrayList.add(i10);
        arrayList.add(y51.B(null));
        if (x0Var.f10468s) {
            b2 d = c2.f(x0Var.currentAccount).d("hello");
            if (d != null) {
                y51 y51Var2 = new y51(17);
                y51Var2.G = d;
                arrayList.add(y51Var2);
            } else {
                y51 c10 = y51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f30642q = true;
                arrayList.add(c10);
            }
            arrayList.add(y51.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            y51 w10 = y51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(x0Var.v);
            arrayList.add(w10);
            y51 w11 = y51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!x0Var.v);
            arrayList.add(w11);
            arrayList.add(y51.B(null));
            x0Var.d.a(arrayList, m61Var, true);
            c.n(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = x0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == x0Var.f10469w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = x0Var.f10465f;
            ai.y1 y1Var = new ai.y1(x0Var, 25);
            y51 y51Var3 = new y51(14);
            y51Var3.f30641p = strArr;
            y51Var3.f30650z = i11;
            y51Var3.C = y1Var;
            y51Var3.B = -1L;
            arrayList.add(y51Var3);
            c.n(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10463b == null) {
            return;
        }
        boolean W = W();
        this.f10463b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10463b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f10463b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f10463b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f10463b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        c0 c0Var;
        if (this.h) {
            boolean z11 = this.f10468s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f10467r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f10469w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((c0Var = this.d) != null && c0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f10462a.f28333c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("hello");
            boolean z10 = this.f10468s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View A1 = this.f10464c.A1(2);
                int i10 = -this.f10466n;
                this.f10466n = i10;
                AndroidUtilities.shakeViewSpring(A1, i10);
            } else if (z10 && !this.d.k(this.f10464c)) {
            } else {
                this.f10462a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f10468s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f10219a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f10469w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f10219a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f10469w;
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
        m61 m61Var;
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
        this.f10467r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10468s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f10469w = i10;
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
        u61 u61Var = this.f10464c;
        if (u61Var != null && (m61Var = u61Var.f28778f3) != null) {
            m61Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f19409v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10462a = new sr(mutate, new wp(h6.w0(null, i10, false)));
        this.f10463b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10462a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        c0 c0Var = new c0(this, new rc(this, 22));
        this.d = c0Var;
        c0Var.f10234n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f10467r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        c0Var.j(tL_businessRecipients);
        u61 u61Var = new u61(this, new bi.v(this, 25), new w0(this, 2), null);
        this.f10464c = u61Var;
        u61Var.s1();
        this.f10464c.setSectionsDrawBackground(true);
        u61 u61Var2 = this.f10464c;
        u61Var2.f28778f3.f26223r = false;
        frameLayout.addView(u61Var2, y5.c(-1.0f, -1));
        this.actionBar.z(this.f10464c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        m61 m61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            u61 u61Var = this.f10464c;
            if (u61Var != null && (m61Var = u61Var.f28778f3) != null) {
                m61Var.N(true);
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
                if (!this.f10468s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18678a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18678a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new w0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new w0(this, 1));
                showDialog(alertDialog$Builder.f18678a);
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
        this.f10464c.setPadding(0, 0, 0, i13);
        this.f10464c.setClipToPadding(false);
    }
}
