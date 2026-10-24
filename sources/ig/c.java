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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.yr;
import w7.z5;
public final class c extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public yr f12864a;
    public cq f12865b;
    public org.telegram.ui.ActionBar.u0 f12866c;
    public i71 d;
    public a0 e;
    public boolean f12867f;
    public boolean h;
    public int f12868n;
    public TL_account.TL_businessAwayMessage f12869r;
    public int f12870s;
    public boolean v;
    public boolean f12871w;
    public boolean f12872x;
    public int f12873y;

    public static void U(c cVar, ArrayList arrayList, a71 a71Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        l61 l61Var = new l61(2);
        l61Var.f28227l = string;
        l61Var.f28230o = string2;
        l61Var.f28228m = "RestrictedEmoji";
        l61Var.f28229n = "💤";
        arrayList.add(l61Var);
        l61 i10 = l61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.v);
        arrayList.add(i10);
        arrayList.add(l61.B(null));
        if (cVar.v) {
            y1 d = z1.f(cVar.currentAccount).d("away");
            if (d != null) {
                l61 l61Var2 = new l61(17);
                l61Var2.G = d;
                arrayList.add(l61Var2);
            } else {
                l61 c10 = l61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f28232q = true;
                arrayList.add(c10);
            }
            arrayList.add(l61.B(null));
            i2.o1.q(R.string.BusinessAwaySchedule, arrayList);
            l61 w9 = l61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f12873y == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w9.K(z10);
            arrayList.add(w9);
            if (cVar.f12867f) {
                l61 w10 = l61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f12873y == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w10.K(z11);
                arrayList.add(w10);
            }
            l61 w11 = l61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f12873y == 2) {
                z12 = true;
            }
            w11.K(z12);
            arrayList.add(w11);
            if (cVar.f12873y == 2) {
                arrayList.add(l61.B(null));
                i2.o1.q(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(l61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.G), 8));
                arrayList.add(l61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.H), 9));
            }
            arrayList.add(l61.B(null));
            l61 i11 = l61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f12872x);
            arrayList.add(i11);
            i2.o1.B(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.o1.q(R.string.BusinessRecipients, arrayList);
            l61 w12 = l61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(cVar.f12871w);
            arrayList.add(w12);
            l61 w13 = l61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!cVar.f12871w);
            arrayList.add(w13);
            arrayList.add(l61.B(null));
            cVar.e.a(arrayList, a71Var, true);
            arrayList.add(l61.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f12866c == null) {
            return;
        }
        boolean W = W();
        this.f12866c.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f12866c.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f12866c;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f12866c;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f12866c;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.h) {
            boolean z11 = this.v;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f12869r;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f12871w && ((a0Var = this.e) == null || !a0Var.g())) {
                        int i10 = this.f12870s;
                        int i11 = this.f12873y;
                        if (i10 == i11 && this.f12869r.offline_only == this.f12872x && (i11 != 2 || (this.E == this.G && this.F == this.H))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f12864a.f33027c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            y1 d = z1.f(this.currentAccount).d("away");
            boolean z10 = this.v;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View E1 = this.d.E1(2);
                int i10 = -this.f12868n;
                this.f12868n = i10;
                AndroidUtilities.shakeViewSpring(E1, i10);
                i71 i71Var = this.d;
                i71Var.x0(i71Var.D1(2));
            } else if (z10 && !this.e.k(this.d)) {
            } else {
                this.f12864a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.v) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f12872x;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f13129a;
                    tL_inputBusinessAwayMessage.recipients = this.e.e();
                    int i11 = this.f12873y;
                    if (i11 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i11 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i11 == 2) {
                        TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                        tL_businessAwayMessageScheduleCustom.start_date = this.G;
                        tL_businessAwayMessageScheduleCustom.end_date = this.H;
                        updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                    }
                    updatebusinessawaymessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        userFull.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f12872x;
                        tL_businessAwayMessage.shortcut_id = d.f13129a;
                        tL_businessAwayMessage.recipients = this.e.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.h(this, 16));
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
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f12869r = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12867f = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.v = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.f12871w = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f12872x = z13;
        a0 a0Var = this.e;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f12869r;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f12870s = 2;
                this.f12873y = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.E = i10;
                this.G = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.F = i11;
                this.H = i11;
                i71Var = this.d;
                if (i71Var != null && (a71Var = i71Var.Z2) != null) {
                    a71Var.N(true);
                }
                V(true);
                this.h = true;
            }
        }
        this.G = getConnectionsManager().getCurrentTime();
        this.H = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f12869r;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f12870s = 0;
            this.f12873y = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f12870s = 1;
            this.f12873y = 1;
        } else {
            this.f12870s = 0;
            this.f12873y = 0;
        }
        i71Var = this.d;
        if (i71Var != null) {
            a71Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.f21519v8;
        int x02 = k6.x0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        cq cqVar = new cq(k6.x0(null, i10, false));
        this.f12865b = cqVar;
        this.f12864a = new yr(mutate, cqVar);
        org.telegram.ui.ActionBar.u0 i11 = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12864a);
        this.f12866c = i11;
        r6.z(i11, mutate, i10, null, mode);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, null);
        a0 a0Var = new a0(this, new bc(this, 17));
        this.e = a0Var;
        a0Var.h = this.f12871w;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f12869r;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        i71 i71Var = new i71(this, new hg.o(this, 2), new a(this, 0), null);
        this.d = i71Var;
        i71Var.t1();
        i71 i71Var2 = this.d;
        i71Var2.Z2.f24646r = false;
        frameLayout.addView(i71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.d, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            i71 i71Var = this.d;
            if (i71Var != null && (a71Var = i71Var.Z2) != null) {
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
                if (!this.v) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f20679a);
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
            cq cqVar = this.f12865b;
            if (cqVar != null) {
                cqVar.b(k6.x0(null, k6.f21519v8, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
