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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wp;
import w7.z5;
public final class d extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public sr f11136a;
    public org.telegram.ui.ActionBar.v0 f11137b;
    public c71 f11138c;
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

    public static void S(d dVar, ArrayList arrayList, u61 u61Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        g61 g61Var = new g61(2);
        g61Var.f26674l = string;
        g61Var.f26677o = string2;
        g61Var.f26675m = "RestrictedEmoji";
        g61Var.f26676n = "💤";
        arrayList.add(g61Var);
        g61 i10 = g61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(dVar.f11143s);
        arrayList.add(i10);
        arrayList.add(g61.B(null));
        if (dVar.f11143s) {
            a2 d = b2.f(dVar.currentAccount).d("away");
            if (d != null) {
                g61 g61Var2 = new g61(17);
                g61Var2.G = d;
                arrayList.add(g61Var2);
            } else {
                g61 c10 = g61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f26679q = true;
                arrayList.add(c10);
            }
            arrayList.add(g61.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
            g61 w10 = g61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (dVar.f11145x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (dVar.f11139e) {
                g61 w11 = g61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (dVar.f11145x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            g61 w12 = g61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (dVar.f11145x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (dVar.f11145x == 2) {
                arrayList.add(g61.B(null));
                com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(g61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.F), 8));
                arrayList.add(g61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.G), 9));
            }
            arrayList.add(g61.B(null));
            g61 i11 = g61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(dVar.f11144w);
            arrayList.add(i11);
            c.n(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            g61 w13 = g61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(dVar.v);
            arrayList.add(w13);
            g61 w14 = g61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!dVar.v);
            arrayList.add(w14);
            arrayList.add(g61.B(null));
            dVar.d.a(arrayList, u61Var, true);
            arrayList.add(g61.B(null));
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
        if (this.f11136a.f30870c <= 0.0f) {
            if (!U()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("away");
            boolean z10 = this.f11143s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View A1 = this.f11138c.A1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(A1, i10);
                c71 c71Var = this.f11138c;
                c71Var.y0(c71Var.z1(2));
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
        c71 c71Var;
        u61 u61Var;
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
                c71Var = this.f11138c;
                if (c71Var != null && (u61Var = c71Var.f25250f3) != null) {
                    u61Var.N(true);
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
        c71Var = this.f11138c;
        if (c71Var != null) {
            u61Var.N(true);
        }
        T(true);
        this.f11140f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.f21159v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11136a = new sr(mutate, new wp(i6.w0(null, i10, false)));
        this.f11137b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11136a);
        T(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f20766a7, false));
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
        c71 c71Var = new c71(this, new bi.v(this, 21), new a(this, 0), null);
        this.f11138c = c71Var;
        c71Var.s1();
        c71 c71Var2 = this.f11138c;
        c71Var2.f25250f3.f31313r = false;
        frameLayout.addView(c71Var2, z5.c(-1.0f, -1));
        this.actionBar.z(this.f11138c, true);
        X();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            c71 c71Var = this.f11138c;
            if (c71Var != null && (u61Var = c71Var.f25250f3) != null) {
                u61Var.N(true);
            }
            T(true);
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            X();
        }
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
                alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f20372a);
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

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f11138c.setPadding(0, 0, 0, i13);
        this.f11138c.setClipToPadding(false);
    }
}
