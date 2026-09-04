package ig;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.v7;
import di.nb;
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
public final class c extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public or f12011a;
    public org.telegram.ui.ActionBar.v0 f12012b;
    public d61 f12013c;
    public a0 d;
    public boolean f12014e;
    public boolean f12015f;
    public int h;
    public TL_account.TL_businessAwayMessage f12016n;
    public int f12017r;
    public boolean f12018s;
    public boolean v;
    public boolean f12019w;
    public int f12020x;
    public int f12021y;

    public static void U(c cVar, ArrayList arrayList, v51 v51Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        h51 h51Var = new h51(2);
        h51Var.f26594l = string;
        h51Var.f26597o = string2;
        h51Var.f26595m = "RestrictedEmoji";
        h51Var.f26596n = "💤";
        arrayList.add(h51Var);
        h51 i10 = h51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f12018s);
        arrayList.add(i10);
        arrayList.add(h51.B(null));
        if (cVar.f12018s) {
            a2 d = b2.f(cVar.currentAccount).d("away");
            if (d != null) {
                h51 h51Var2 = new h51(17);
                h51Var2.G = d;
                arrayList.add(h51Var2);
            } else {
                h51 c10 = h51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f26599q = true;
                arrayList.add(c10);
            }
            arrayList.add(h51.B(null));
            i2.g.p(R.string.BusinessAwaySchedule, arrayList);
            h51 w10 = h51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f12020x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (cVar.f12014e) {
                h51 w11 = h51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f12020x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            h51 w12 = h51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f12020x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (cVar.f12020x == 2) {
                arrayList.add(h51.B(null));
                i2.g.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(h51.B(null));
            h51 i11 = h51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f12019w);
            arrayList.add(i11);
            i2.g.A(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.g.p(R.string.BusinessRecipients, arrayList);
            h51 w13 = h51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            h51 w14 = h51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(h51.B(null));
            cVar.d.a(arrayList, v51Var, true);
            arrayList.add(h51.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f12012b == null) {
            return;
        }
        boolean W = W();
        this.f12012b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f12012b.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f12012b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f12012b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f12012b;
        if (W) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.f12015f) {
            boolean z11 = this.f12018s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f12016n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((a0Var = this.d) == null || !a0Var.g())) {
                        int i10 = this.f12017r;
                        int i11 = this.f12020x;
                        if (i10 == i11 && this.f12016n.offline_only == this.f12019w && (i11 != 2 || (this.f12021y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f12011a.f29171c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("away");
            boolean z10 = this.f12018s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View x12 = this.f12013c.x1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(x12, i10);
                d61 d61Var = this.f12013c;
                d61Var.x0(d61Var.w1(2));
            } else if (z10 && !this.d.k(this.f12013c)) {
            } else {
                this.f12011a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f12018s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f12019w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f11992a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f12020x;
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
                        tL_businessAwayMessage.offline_only = this.f12019w;
                        tL_businessAwayMessage.shortcut_id = d.f11992a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new v7(this, 10));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        d61 d61Var;
        v51 v51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f12015f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f12016n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12014e = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f12018s = z11;
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
        this.f12019w = z13;
        a0 a0Var = this.d;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f12016n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f12017r = 2;
                this.f12020x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f12021y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                d61Var = this.f12013c;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                }
                V(true);
                this.f12015f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f12016n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f12017r = 0;
            this.f12020x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f12017r = 1;
            this.f12020x = 1;
        } else {
            this.f12017r = 0;
            this.f12020x = 0;
        }
        d61Var = this.f12013c;
        if (d61Var != null) {
            v51Var.N(true);
        }
        V(true);
        this.f12015f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f20992v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12011a = new or(mutate, new sp(j6.w0(null, i10, false)));
        this.f12012b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12011a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
        a0 a0Var = new a0(this, new nb(this, 27));
        this.d = a0Var;
        a0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f12016n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        d61 d61Var = new d61(this, new ci.u(this, 21), new a(this, 0), null);
        this.f12013c = d61Var;
        d61Var.o1();
        d61 d61Var2 = this.f12013c;
        d61Var2.Y2.f31135r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.A(this.f12013c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            d61 d61Var = this.f12013c;
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
                if (!this.f12018s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
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
        this.f12013c.setPadding(0, 0, 0, i13);
        this.f12013c.setClipToPadding(false);
    }
}
