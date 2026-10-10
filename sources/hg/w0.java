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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import w7.x5;
public final class w0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public hs f11421a;
    public org.telegram.ui.ActionBar.v0 f11422b;
    public l71 f11423c;
    public b0 d;
    public final int[] f11424e;
    public final String[] f11425f;
    public boolean h;
    public int f11426n;
    public TL_account.TL_businessGreetingMessage f11427r;
    public boolean f11428s;
    public boolean v;
    public int f11429w;

    public w0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f11424e = iArr;
        this.f11426n = -4;
        this.f11429w = 7;
        this.f11425f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f11424e;
            if (i10 < iArr2.length) {
                this.f11425f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(w0 w0Var, ArrayList arrayList, d71 d71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        q61 q61Var = new q61(2);
        q61Var.f30063l = string;
        q61Var.f30066o = string2;
        q61Var.f30064m = "RestrictedEmoji";
        q61Var.f30065n = "👋";
        arrayList.add(q61Var);
        q61 i10 = q61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(w0Var.f11428s);
        arrayList.add(i10);
        arrayList.add(q61.B(null));
        if (w0Var.f11428s) {
            b2 d = c2.f(w0Var.currentAccount).d("hello");
            if (d != null) {
                q61 q61Var2 = new q61(17);
                q61Var2.G = d;
                arrayList.add(q61Var2);
            } else {
                q61 c10 = q61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f30068q = true;
                arrayList.add(c10);
            }
            arrayList.add(q61.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            q61 w10 = q61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(w0Var.v);
            arrayList.add(w10);
            q61 w11 = q61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!w0Var.v);
            arrayList.add(w11);
            arrayList.add(q61.B(null));
            w0Var.d.a(arrayList, d71Var, true);
            c.n(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = w0Var.f11424e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == w0Var.f11429w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = w0Var.f11425f;
            ai.y1 y1Var = new ai.y1(w0Var, 25);
            q61 q61Var3 = new q61(14);
            q61Var3.f30067p = strArr;
            q61Var3.f30076z = i11;
            q61Var3.C = y1Var;
            q61Var3.B = -1L;
            arrayList.add(q61Var3);
            c.n(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11422b == null) {
            return;
        }
        boolean W = W();
        this.f11422b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11422b.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f11422b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f11422b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f11422b;
        if (W) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        b0 b0Var;
        if (this.h) {
            boolean z11 = this.f11428s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11427r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f11429w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((b0Var = this.d) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f11421a.f27135c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("hello");
            boolean z10 = this.f11428s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11423c.z1(2);
                int i10 = -this.f11426n;
                this.f11426n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f11423c)) {
            } else {
                this.f11421a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f11428s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f11174a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f11429w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f11174a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f11429w;
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
        d71 d71Var;
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
        this.f11427r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11428s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f11429w = i10;
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
        l71 l71Var = this.f11423c;
        if (l71Var != null && (d71Var = l71Var.W2) != null) {
            d71Var.N(true);
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
        int i10 = i6.f21134v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11421a = new hs(mutate, new jq(i6.x0(null, i10, false)));
        this.f11422b = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11421a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.x0(null, i6.f20745a7, false));
        b0 b0Var = new b0(this, new rc(this, 22));
        this.d = b0Var;
        b0Var.f11169n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f11427r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        l71 l71Var = new l71(this, new bi.v(this, 25), new v0(this, 2), null);
        this.f11423c = l71Var;
        l71Var.p1();
        l71 l71Var2 = this.f11423c;
        l71Var2.W2.f25587r = false;
        frameLayout.addView(l71Var2, x5.d(-1.0f, -1));
        this.actionBar.B(this.f11423c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d71 d71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            l71 l71Var = this.f11423c;
            if (l71Var != null && (d71Var = l71Var.W2) != null) {
                d71Var.N(true);
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
                if (!this.f11428s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new v0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new v0(this, 1));
                showDialog(alertDialog$Builder.f20378a);
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
        this.f11423c.setPadding(0, 0, 0, i13);
        this.f11423c.setClipToPadding(false);
    }
}
