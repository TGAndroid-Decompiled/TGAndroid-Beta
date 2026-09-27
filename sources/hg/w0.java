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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
import w7.y5;
public final class w0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public rr f10447a;
    public org.telegram.ui.ActionBar.w0 f10448b;
    public t61 f10449c;
    public a0 d;
    public final int[] e;
    public final String[] f10450f;
    public boolean h;
    public int f10451n;
    public TL_account.TL_businessGreetingMessage f10452r;
    public boolean f10453s;
    public boolean v;
    public int f10454w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f10451n = -4;
        this.f10454w = 7;
        this.f10450f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f10450f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(w0 w0Var, ArrayList arrayList, l61 l61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        x51 x51Var = new x51(2);
        x51Var.f30302l = string;
        x51Var.f30305o = string2;
        x51Var.f30303m = "RestrictedEmoji";
        x51Var.f30304n = "👋";
        arrayList.add(x51Var);
        x51 i10 = x51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f10453s);
        arrayList.add(i10);
        arrayList.add(x51.B(null));
        if (w0Var.f10453s) {
            a2 d = b2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                x51 x51Var2 = new x51(17);
                x51Var2.G = d;
                arrayList.add(x51Var2);
            } else {
                x51 c10 = x51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f30307q = true;
                arrayList.add(c10);
            }
            arrayList.add(x51.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            x51 w10 = x51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(w0Var.v);
            arrayList.add(w10);
            x51 w11 = x51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!w0Var.v);
            arrayList.add(w11);
            arrayList.add(x51.B(null));
            w0Var.d.a(arrayList, l61Var, true);
            com.google.android.gms.internal.vision.e2.w(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f10454w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f10450f;
            ai.y1 y1Var = new ai.y1(w0Var, 25);
            x51 x51Var3 = new x51(14);
            x51Var3.f30306p = strArr;
            x51Var3.f30315z = i11;
            x51Var3.C = y1Var;
            x51Var3.B = -1L;
            arrayList.add(x51Var3);
            com.google.android.gms.internal.vision.e2.w(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10448b == null) {
            return;
        }
        boolean W = W();
        this.f10448b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10448b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f10448b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f10448b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f10448b;
        if (W) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.f10453s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f10452r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f10454w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((a0Var = this.d) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f10447a.f28081c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("hello");
            boolean z10 = this.f10453s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f10449c.z1(2);
                int i10 = -this.f10451n;
                this.f10451n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f10449c)) {
            } else {
                this.f10447a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f10453s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f10210a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f10454w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f10210a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f10454w;
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
        l61 l61Var;
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
        this.f10452r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f10453s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f10454w = i10;
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
        t61 t61Var = this.f10449c;
        if (t61Var != null && (l61Var = t61Var.Y2) != null) {
            l61Var.N(true);
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
        int i10 = i6.f19392v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10447a = new rr(mutate, new vp(i6.w0(null, i10, false)));
        this.f10448b = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10447a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f19001a7, false));
        a0 a0Var = new a0(this, new qc(this, 22));
        this.d = a0Var;
        a0Var.f10207n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f10452r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        t61 t61Var = new t61(this, new bi.v(this, 25), new v0(this, 2), null);
        this.f10449c = t61Var;
        t61Var.q1();
        t61 t61Var2 = this.f10449c;
        t61Var2.Y2.f25959r = false;
        frameLayout.addView(t61Var2, y5.c(-1.0f, -1));
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            t61 t61Var = this.f10449c;
            if (t61Var != null && (l61Var = t61Var.Y2) != null) {
                l61Var.N(true);
            }
            V(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            Y();
        }
    }

    @Override
    public final yl0 getListViewForSimpleGlass() {
        return this.f10449c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (W()) {
            if (z10) {
                if (!this.f10453s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f18655a);
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
}
