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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import w7.z5;
public final class v0 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public as f13055a;
    public org.telegram.ui.ActionBar.u0 f13056b;
    public b71 f13057c;
    public a0 d;
    public final int[] e;
    public final String[] f13058f;
    public boolean h;
    public int f13059n;
    public TL_account.TL_businessGreetingMessage f13060r;
    public boolean f13061s;
    public boolean v;
    public int f13062w;

    public v0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f13059n = -4;
        this.f13062w = 7;
        this.f13058f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f13058f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(v0 v0Var, ArrayList arrayList, t61 t61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        g61 g61Var = new g61(2);
        g61Var.f26497l = string;
        g61Var.f26500o = string2;
        g61Var.f26498m = "RestrictedEmoji";
        g61Var.f26499n = "👋";
        arrayList.add(g61Var);
        g61 i10 = g61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(v0Var.f13061s);
        arrayList.add(i10);
        arrayList.add(g61.B(null));
        if (v0Var.f13061s) {
            z1 d = a2.f(v0Var.currentAccount).d("hello");
            if (d != null) {
                g61 g61Var2 = new g61(17);
                g61Var2.G = d;
                arrayList.add(g61Var2);
            } else {
                g61 c10 = g61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f26502q = true;
                arrayList.add(c10);
            }
            arrayList.add(g61.B(null));
            i2.e.p(R.string.BusinessRecipients, arrayList);
            g61 w9 = g61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w9.K(v0Var.v);
            arrayList.add(w9);
            g61 w10 = g61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!v0Var.v);
            arrayList.add(w10);
            arrayList.add(g61.B(null));
            v0Var.d.a(arrayList, t61Var, true);
            i2.e.B(R.string.BusinessGreetRecipientsInfo, arrayList);
            i2.e.p(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = v0Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == v0Var.f13062w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = v0Var.f13058f;
            l0 l0Var = new l0(v0Var, 1);
            g61 g61Var3 = new g61(14);
            g61Var3.f26501p = strArr;
            g61Var3.f26510z = i11;
            g61Var3.C = l0Var;
            g61Var3.B = -1L;
            arrayList.add(g61Var3);
            i2.e.B(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f13056b == null) {
            return;
        }
        boolean W = W();
        this.f13056b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f13056b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f13056b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f13056b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f13056b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.f13061s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f13060r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f13062w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((a0Var = this.d) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f13055a.f24689c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            z1 d = a2.f(this.currentAccount).d("hello");
            boolean z10 = this.f13061s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f13057c.z1(2);
                int i10 = -this.f13059n;
                this.f13059n = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
            } else if (z10 && !this.d.k(this.f13057c)) {
            } else {
                this.f13055a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f13061s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f13098a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f13062w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f13098a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f13062w;
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
        t61 t61Var;
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
        this.f13060r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13061s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f13062w = i10;
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
        b71 b71Var = this.f13057c;
        if (b71Var != null && (t61Var = b71Var.W2) != null) {
            t61Var.N(true);
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
        int i10 = h6.f21322v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f13055a = new as(mutate, new dq(h6.x0(null, i10, false)));
        this.f13056b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f13055a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20929a7, false));
        a0 a0Var = new a0(this, new bc(this, 21));
        this.d = a0Var;
        a0Var.f12820n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f13060r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        b71 b71Var = new b71(this, new hg.o(this, 6), new u0(this, 2), null);
        this.f13057c = b71Var;
        b71Var.p1();
        b71 b71Var2 = this.f13057c;
        b71Var2.W2.f30436r = false;
        frameLayout.addView(b71Var2, z5.c(-1.0f, -1));
        this.actionBar.A(this.f13057c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t61 t61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            b71 b71Var = this.f13057c;
            if (b71Var != null && (t61Var = b71Var.W2) != null) {
                t61Var.N(true);
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
                if (!this.f13061s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20602a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new u0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new u0(this, 1));
                showDialog(alertDialog$Builder.f20602a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        a2.f(this.currentAccount).h();
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
        this.f13057c.setPadding(0, 0, 0, i13);
        this.f13057c.setClipToPadding(false);
    }
}
