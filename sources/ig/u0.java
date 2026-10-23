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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import w7.z5;
public final class u0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public as f13085a;
    public eq f13086b;
    public org.telegram.ui.ActionBar.u0 f13087c;
    public j71 d;
    public a0 e;
    public final int[] f13088f;
    public final String[] h;
    public boolean f13089n;
    public int f13090r;
    public TL_account.TL_businessGreetingMessage f13091s;
    public boolean v;
    public boolean f13092w;
    public int f13093x;

    public u0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.f13088f = iArr;
        this.f13090r = -4;
        this.f13093x = 7;
        this.h = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.f13088f;
            if (i10 < iArr2.length) {
                this.h[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(u0 u0Var, ArrayList arrayList, b71 b71Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        m61 m61Var = new m61(2);
        m61Var.f28559l = string;
        m61Var.f28562o = string2;
        m61Var.f28560m = "RestrictedEmoji";
        m61Var.f28561n = "👋";
        arrayList.add(m61Var);
        m61 i10 = m61.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(u0Var.v);
        arrayList.add(i10);
        arrayList.add(m61.B(null));
        if (u0Var.v) {
            y1 d = z1.f(u0Var.currentAccount).d("hello");
            if (d != null) {
                m61 m61Var2 = new m61(17);
                m61Var2.G = d;
                arrayList.add(m61Var2);
            } else {
                m61 c10 = m61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f28564q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
            i2.o1.q(R.string.BusinessRecipients, arrayList);
            m61 w9 = m61.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w9.K(u0Var.f13092w);
            arrayList.add(w9);
            m61 w10 = m61.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w10.K(!u0Var.f13092w);
            arrayList.add(w10);
            arrayList.add(m61.B(null));
            u0Var.e.a(arrayList, b71Var, true);
            i2.o1.B(R.string.BusinessGreetRecipientsInfo, arrayList);
            i2.o1.q(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = u0Var.f13088f;
                if (i11 < iArr.length) {
                    if (iArr[i11] == u0Var.f13093x) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = u0Var.h;
            k0 k0Var = new k0(u0Var, 1);
            m61 m61Var3 = new m61(14);
            m61Var3.f28563p = strArr;
            m61Var3.f28572z = i11;
            m61Var3.C = k0Var;
            m61Var3.B = -1L;
            arrayList.add(m61Var3);
            i2.o1.B(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f13087c == null) {
            return;
        }
        boolean W = W();
        this.f13087c.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f13087c.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f13087c;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f13087c;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f13087c;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.f13089n) {
            boolean z11 = this.v;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f13091s;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f13093x || tL_businessGreetingMessage.recipients.exclude_selected != this.f13092w || ((a0Var = this.e) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f13085a.f24834c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            y1 d = z1.f(this.currentAccount).d("hello");
            boolean z10 = this.v;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View E1 = this.d.E1(2);
                int i10 = -this.f13090r;
                this.f13090r = i10;
                AndroidUtilities.shakeViewSpring(E1, i10);
            } else if (z10 && !this.e.k(this.d)) {
            } else {
                this.f13085a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.v) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f13129a;
                    tL_inputBusinessGreetingMessage.recipients = this.e.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f13093x;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f13129a;
                        tL_businessGreetingMessage.recipients = this.e.f();
                        userFull.business_greeting_message.no_activity_days = this.f13093x;
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
        b71 b71Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f13089n) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f13091s = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.v = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f13093x = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f13092w = z11;
        a0 a0Var = this.e;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        j71 j71Var = this.d;
        if (j71Var != null && (b71Var = j71Var.Z2) != null) {
            b71Var.N(true);
        }
        V(true);
        this.f13089n = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 14));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21518v8;
        int x02 = k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        this.f13086b = new eq(k6.x0(null, i10, false));
        this.f13085a = new as(mutate, this.f13086b);
        org.telegram.ui.ActionBar.u0 i11 = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f13085a);
        this.f13087c = i11;
        r6.z(i11, mutate, i10, null, mode);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21125a7, frameLayout, null);
        a0 a0Var = new a0(this, new bc(this, 21));
        this.e = a0Var;
        a0Var.f12852n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f13091s;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        j71 j71Var = new j71(this, new hg.o(this, 6), new t0(this, 2), null);
        this.d = j71Var;
        j71Var.t1();
        j71 j71Var2 = this.d;
        j71Var2.Z2.f24972r = false;
        frameLayout.addView(j71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.d, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            j71 j71Var = this.d;
            if (j71Var != null && (b71Var = j71Var.Z2) != null) {
                b71Var.N(true);
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
                if (!this.v) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new t0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new t0(this, 1));
                showDialog(alertDialog$Builder.f20678a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        z1.f(this.currentAccount).h();
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
        this.d.setPadding(0, 0, 0, i13);
        this.d.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            eq eqVar = this.f13086b;
            if (eqVar != null) {
                eqVar.b(k6.x0(null, k6.f21518v8, false));
            }
            org.telegram.ui.ActionBar.u0 u0Var = this.f13087c;
            if (u0Var != null) {
                u0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
