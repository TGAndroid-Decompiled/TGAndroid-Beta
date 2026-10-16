package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.z7;
import di.x8;
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
public final class c extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public ds f11455a;
    public org.telegram.ui.ActionBar.u0 f11456b;
    public i71 f11457c;
    public a0 d;
    public boolean e;
    public boolean f11458f;
    public int h;
    public TL_account.TL_businessAwayMessage f11459n;
    public int f11460r;
    public boolean f11461s;
    public boolean v;
    public boolean f11462w;
    public int f11463x;
    public int f11464y;

    public static void U(c cVar, ArrayList arrayList, a71 a71Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        m61 m61Var = new m61(2);
        m61Var.f26946l = string;
        m61Var.f26949o = string2;
        m61Var.f26947m = "RestrictedEmoji";
        m61Var.f26948n = "💤";
        arrayList.add(m61Var);
        m61 i10 = m61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f11461s);
        arrayList.add(i10);
        arrayList.add(m61.B(null));
        if (cVar.f11461s) {
            a2 d = b2.f(cVar.currentAccount).d("away");
            if (d != null) {
                m61 m61Var2 = new m61(17);
                m61Var2.G = d;
                arrayList.add(m61Var2);
            } else {
                m61 c10 = m61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f26951q = true;
                arrayList.add(c10);
            }
            arrayList.add(m61.B(null));
            i2.d.p(R.string.BusinessAwaySchedule, arrayList);
            m61 w9 = m61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f11463x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w9.K(z10);
            arrayList.add(w9);
            if (cVar.e) {
                m61 w10 = m61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f11463x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w10.K(z11);
                arrayList.add(w10);
            }
            m61 w11 = m61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f11463x == 2) {
                z12 = true;
            }
            w11.K(z12);
            arrayList.add(w11);
            if (cVar.f11463x == 2) {
                arrayList.add(m61.B(null));
                i2.d.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(m61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(m61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(m61.B(null));
            m61 i11 = m61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f11462w);
            arrayList.add(i11);
            i2.d.B(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.d.p(R.string.BusinessRecipients, arrayList);
            m61 w12 = m61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(cVar.v);
            arrayList.add(w12);
            m61 w13 = m61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!cVar.v);
            arrayList.add(w13);
            arrayList.add(m61.B(null));
            cVar.d.a(arrayList, a71Var, true);
            arrayList.add(m61.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11456b == null) {
            return;
        }
        boolean W = W();
        this.f11456b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11456b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f11456b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f11456b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f11456b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.f11458f) {
            boolean z11 = this.f11461s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11459n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((a0Var = this.d) == null || !a0Var.g())) {
                        int i10 = this.f11460r;
                        int i11 = this.f11463x;
                        if (i10 == i11 && this.f11459n.offline_only == this.f11462w && (i11 != 2 || (this.f11464y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f11455a.f24174c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("away");
            boolean z10 = this.f11461s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11457c.z1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
                i71 i71Var = this.f11457c;
                i71Var.x0(i71Var.y1(2));
            } else if (z10 && !this.d.k(this.f11457c)) {
            } else {
                this.f11455a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f11461s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f11462w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f11438a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f11463x;
                    if (i11 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i11 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i11 == 2) {
                        TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                        tL_businessAwayMessageScheduleCustom.start_date = this.F;
                        tL_businessAwayMessageScheduleCustom.end_date = this.G;
                        updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                    }
                    updatebusinessawaymessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        userFull.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f11462w;
                        tL_businessAwayMessage.shortcut_id = d.f11438a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new z7(this, 10));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        i71 i71Var;
        a71 a71Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f11458f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f11459n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.e = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11461s = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.v = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f11462w = z13;
        a0 a0Var = this.d;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f11459n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f11460r = 2;
                this.f11463x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f11464y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                i71Var = this.f11457c;
                if (i71Var != null && (a71Var = i71Var.W2) != null) {
                    a71Var.N(true);
                }
                V(true);
                this.f11458f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f11459n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f11460r = 0;
            this.f11463x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f11460r = 1;
            this.f11463x = 1;
        } else {
            this.f11460r = 0;
            this.f11463x = 0;
        }
        i71Var = this.f11457c;
        if (i71Var != null) {
            a71Var.N(true);
        }
        V(true);
        this.f11458f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f19935v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11455a = new ds(mutate, new gq(g6.x0(null, i10, false)));
        this.f11456b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11455a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19543a7, false));
        a0 a0Var = new a0(this, new x8(this, 27));
        this.d = a0Var;
        a0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11459n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        i71 i71Var = new i71(this, new ci.u(this, 21), new a(this, 0), null);
        this.f11457c = i71Var;
        i71Var.p1();
        i71 i71Var2 = this.f11457c;
        i71Var2.W2.f23145r = false;
        frameLayout.addView(i71Var2, z5.d(-1.0f, -1));
        this.actionBar.B(this.f11457c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            i71 i71Var = this.f11457c;
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
                if (!this.f11461s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19248a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
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
        this.f11457c.setPadding(0, 0, 0, i13);
        this.f11457c.setClipToPadding(false);
    }
}
