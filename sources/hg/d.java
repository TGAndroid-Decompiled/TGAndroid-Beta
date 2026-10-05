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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class d extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public sr f11136a;
    public org.telegram.ui.ActionBar.v0 f11137b;
    public e71 f11138c;
    public b0 d;
    public boolean f11139e;
    public boolean f11140f;
    public int h;
    public TL_account.TL_businessAwayMessage f11141n;
    public int f11142r;
    public boolean f11143s;
    public boolean v;
    public boolean f11144w;
    public int f11145x;
    public int f11146y;

    public static void S(d dVar, ArrayList arrayList, w61 w61Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        h61 h61Var = new h61(2);
        h61Var.f27093l = string;
        h61Var.f27096o = string2;
        h61Var.f27094m = "RestrictedEmoji";
        h61Var.f27095n = "💤";
        arrayList.add(h61Var);
        h61 i10 = h61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.L(dVar.f11143s);
        arrayList.add(i10);
        arrayList.add(h61.C(null));
        if (dVar.f11143s) {
            a2 d = b2.f(dVar.currentAccount).d("away");
            if (d != null) {
                h61 h61Var2 = new h61(17);
                h61Var2.G = d;
                arrayList.add(h61Var2);
            } else {
                h61 c10 = h61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f27098q = true;
                arrayList.add(c10);
            }
            arrayList.add(h61.C(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
            h61 x10 = h61.x(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (dVar.f11145x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10.L(z10);
            arrayList.add(x10);
            if (dVar.f11139e) {
                h61 x11 = h61.x(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (dVar.f11145x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x11.L(z11);
                arrayList.add(x11);
            }
            h61 x12 = h61.x(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (dVar.f11145x == 2) {
                z12 = true;
            }
            x12.L(z12);
            arrayList.add(x12);
            if (dVar.f11145x == 2) {
                arrayList.add(h61.C(null));
                com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(h61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.F), 8));
                arrayList.add(h61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.G), 9));
            }
            arrayList.add(h61.C(null));
            h61 i11 = h61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.L(dVar.f11144w);
            arrayList.add(i11);
            c.n(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            h61 x13 = h61.x(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            x13.L(dVar.v);
            arrayList.add(x13);
            h61 x14 = h61.x(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            x14.L(!dVar.v);
            arrayList.add(x14);
            arrayList.add(h61.C(null));
            dVar.d.a(arrayList, w61Var, true);
            arrayList.add(h61.C(null));
        }
    }

    public final void T(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11137b == null) {
            return;
        }
        boolean U = U();
        this.f11137b.setEnabled(U);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11137b.animate();
            if (U) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (U) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (U) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f11137b;
        if (U) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f11137b;
        if (U) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f11137b;
        if (U) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean U() {
        boolean z10;
        b0 b0Var;
        if (this.f11140f) {
            boolean z11 = this.f11143s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11141n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((b0Var = this.d) == null || !b0Var.g())) {
                        int i10 = this.f11142r;
                        int i11 = this.f11145x;
                        if (i10 == i11 && this.f11141n.offline_only == this.f11144w && (i11 != 2 || (this.f11146y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void W() {
        if (this.f11136a.f30935c <= 0.0f) {
            if (!U()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("away");
            boolean z10 = this.f11143s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11138c.z1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
                e71 e71Var = this.f11138c;
                e71Var.y0(e71Var.y1(2));
            } else if (z10 && !this.d.k(this.f11138c)) {
            } else {
                this.f11136a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f11143s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f11144w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f11104a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f11145x;
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
                        tL_businessAwayMessage.offline_only = this.f11144w;
                        tL_businessAwayMessage.shortcut_id = d.f11104a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new n8(this, 10));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void X() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        e71 e71Var;
        w61 w61Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f11140f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f11141n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11139e = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11143s = z11;
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
        this.f11144w = z13;
        b0 b0Var = this.d;
        if (b0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f11141n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f11142r = 2;
                this.f11145x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f11146y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                e71Var = this.f11138c;
                if (e71Var != null && (w61Var = e71Var.f26034f3) != null) {
                    w61Var.N(true);
                }
                T(true);
                this.f11140f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f11141n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f11142r = 0;
            this.f11145x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f11142r = 1;
            this.f11145x = 1;
        } else {
            this.f11142r = 0;
            this.f11145x = 0;
        }
        e71Var = this.f11138c;
        if (e71Var != null) {
            w61Var.N(true);
        }
        T(true);
        this.f11140f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.f21164v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11136a = new sr(mutate, new wp(i6.w0(null, i10, false)));
        this.f11137b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11136a);
        T(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new qc(this, 18));
        this.d = b0Var;
        b0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11141n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        e71 e71Var = new e71(this, new bi.v(this, 21), new a(this, 0), null);
        this.f11138c = e71Var;
        e71Var.r1();
        this.f11138c.setSectionsDrawBackground(true);
        e71 e71Var2 = this.f11138c;
        e71Var2.f26034f3.f32531r = false;
        frameLayout.addView(e71Var2, z5.c(-1.0f, -1));
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w61 w61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            e71 e71Var = this.f11138c;
            if (e71Var != null && (w61Var = e71Var.f26034f3) != null) {
                w61Var.N(true);
            }
            T(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
    }

    @Override
    public final zl0 getListViewForSimpleGlass() {
        return this.f11138c;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (U()) {
            if (z10) {
                if (!this.f11143s) {
                    W();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f20377a);
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
        X();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
    }
}
