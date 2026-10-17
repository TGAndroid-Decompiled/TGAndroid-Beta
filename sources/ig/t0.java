package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ei.bc;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import w7.z5;
public final class t0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public as f13040a;
    public org.telegram.ui.ActionBar.u0 f13041b;
    public a71 f13042c;
    public a0 d;
    public final int[] e;
    public final String[] f13043f;
    public boolean h;
    public int f13044n;
    public TL_account.TL_businessGreetingMessage f13045r;
    public boolean f13046s;
    public boolean v;
    public int f13047w;

    public t0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f13044n = -4;
        this.f13047w = 7;
        this.f13043f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f13043f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(t0 t0Var, ArrayList arrayList, s61 s61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        f61 f61Var = new f61(2);
        f61Var.f26140l = string;
        f61Var.f26143o = string2;
        f61Var.f26141m = "RestrictedEmoji";
        f61Var.f26142n = "👋";
        arrayList.add(f61Var);
        f61 i10 = f61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(t0Var.f13046s);
        arrayList.add(i10);
        arrayList.add(f61.B(null));
        if (t0Var.f13046s) {
            x1 d = y1.f(t0Var.currentAccount).d("hello");
            if (d != null) {
                f61 f61Var2 = new f61(17);
                f61Var2.G = d;
                arrayList.add(f61Var2);
            } else {
                f61 c10 = f61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f26145q = true;
                arrayList.add(c10);
            }
            arrayList.add(f61.B(null));
            i0.a.p(R.string.BusinessRecipients, arrayList);
            f61 w9 = f61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w9.K(t0Var.v);
            arrayList.add(w9);
            f61 w10 = f61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!t0Var.v);
            arrayList.add(w10);
            arrayList.add(f61.B(null));
            t0Var.d.a(arrayList, s61Var, true);
            i0.a.A(R.string.BusinessGreetRecipientsInfo, arrayList);
            i0.a.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = t0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == t0Var.f13047w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = t0Var.f13043f;
            l0 l0Var = new l0(t0Var, 1);
            f61 f61Var3 = new f61(14);
            f61Var3.f26144p = strArr;
            f61Var3.f26153z = i11;
            f61Var3.C = l0Var;
            f61Var3.B = -1L;
            arrayList.add(f61Var3);
            i0.a.A(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f13041b == null) {
            return;
        }
        boolean W = W();
        this.f13041b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f13041b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f13041b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f13041b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f13041b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.f13046s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f13045r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f13047w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((a0Var = this.d) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f13040a.f24703c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            x1 d = y1.f(this.currentAccount).d("hello");
            boolean z10 = this.f13046s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f13042c.z1(2);
                int i10 = -this.f13044n;
                this.f13044n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f13042c)) {
            } else {
                this.f13040a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f13046s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f13080a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f13047w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f13080a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f13047w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.h(this, 19));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        s61 s61Var;
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
        this.f13045r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13046s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f13047w = i10;
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
        a71 a71Var = this.f13042c;
        if (a71Var != null && (s61Var = a71Var.W2) != null) {
            s61Var.N(true);
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
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 14));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f21321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f13040a = new as(mutate, new dq(h6.x0(null, i10, false)));
        this.f13041b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f13040a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20928a7, false));
        a0 a0Var = new a0(this, new bc(this, 21));
        this.d = a0Var;
        a0Var.f12824n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f13045r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        a71 a71Var = new a71(this, new hg.o(this, 6), new s0(this, 2), null);
        this.f13042c = a71Var;
        a71Var.p1();
        a71 a71Var2 = this.f13042c;
        a71Var2.W2.f30200r = false;
        frameLayout.addView(a71Var2, z5.d(-1.0f, -1));
        this.actionBar.A(this.f13042c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            a71 a71Var = this.f13042c;
            if (a71Var != null && (s61Var = a71Var.W2) != null) {
                s61Var.N(true);
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
                if (!this.f13046s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new s0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new s0(this, 1));
                showDialog(alertDialog$Builder.f20601a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        y1.f(this.currentAccount).h();
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
        this.f13042c.setPadding(0, 0, 0, i13);
        this.f13042c.setClipToPadding(false);
    }
}
