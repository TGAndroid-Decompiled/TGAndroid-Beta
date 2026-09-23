package hg;

import ai.n8;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.v51;
import w7.x5;
public final class d extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public qr f10228a;
    public org.telegram.ui.ActionBar.v0 f10229b;
    public d61 f10230c;
    public c0 d;
    public boolean e;
    public boolean f10231f;
    public int h;
    public TL_account.TL_businessAwayMessage f10232n;
    public int f10233r;
    public boolean f10234s;
    public boolean v;
    public boolean f10235w;
    public int f10236x;
    public int f10237y;

    public static void U(d dVar, ArrayList arrayList, v51 v51Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        h51 h51Var = new h51(2);
        h51Var.f24507l = string;
        h51Var.f24510o = string2;
        h51Var.f24508m = "RestrictedEmoji";
        h51Var.f24509n = "💤";
        arrayList.add(h51Var);
        h51 i10 = h51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(dVar.f10234s);
        arrayList.add(i10);
        arrayList.add(h51.B(null));
        if (dVar.f10234s) {
            b2 d = c2.f(dVar.currentAccount).d("away");
            if (d != null) {
                h51 h51Var2 = new h51(17);
                h51Var2.G = d;
                arrayList.add(h51Var2);
            } else {
                h51 c10 = h51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f24512q = true;
                arrayList.add(c10);
            }
            arrayList.add(h51.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
            h51 w10 = h51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (dVar.f10236x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (dVar.e) {
                h51 w11 = h51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (dVar.f10236x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            h51 w12 = h51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (dVar.f10236x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (dVar.f10236x == 2) {
                arrayList.add(h51.B(null));
                com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.F), 8));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.G), 9));
            }
            arrayList.add(h51.B(null));
            h51 i11 = h51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(dVar.f10235w);
            arrayList.add(i11);
            c.p(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            h51 w13 = h51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(dVar.v);
            arrayList.add(w13);
            h51 w14 = h51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!dVar.v);
            arrayList.add(w14);
            arrayList.add(h51.B(null));
            dVar.d.a(arrayList, v51Var, true);
            arrayList.add(h51.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10229b == null) {
            return;
        }
        boolean W = W();
        this.f10229b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10229b.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f10229b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f10229b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f10229b;
        if (W) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        c0 c0Var;
        if (this.f10231f) {
            boolean z11 = this.f10234s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f10232n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((c0Var = this.d) == null || !c0Var.g())) {
                        int i10 = this.f10233r;
                        int i11 = this.f10236x;
                        if (i10 == i11 && this.f10232n.offline_only == this.f10235w && (i11 != 2 || (this.f10237y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f10228a.f27437c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("away");
            boolean z10 = this.f10234s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View y12 = this.f10230c.y1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(y12, i10);
                d61 d61Var = this.f10230c;
                d61Var.x0(d61Var.x1(2));
            } else if (z10 && !this.d.k(this.f10230c)) {
            } else {
                this.f10228a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f10234s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f10235w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f10205a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f10236x;
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
                        tL_businessAwayMessage.offline_only = this.f10235w;
                        tL_businessAwayMessage.shortcut_id = d.f10205a;
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

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        d61 d61Var;
        v51 v51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f10231f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f10232n = tL_businessAwayMessage;
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
        this.f10234s = z11;
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
        this.f10235w = z13;
        c0 c0Var = this.d;
        if (c0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            c0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f10232n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f10233r = 2;
                this.f10236x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f10237y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                d61Var = this.f10230c;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                }
                V(true);
                this.f10231f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f10232n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f10233r = 0;
            this.f10236x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f10233r = 1;
            this.f10236x = 1;
        } else {
            this.f10233r = 0;
            this.f10236x = 0;
        }
        d61Var = this.f10230c;
        if (d61Var != null) {
            v51Var.N(true);
        }
        V(true);
        this.f10231f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f19120v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10228a = new qr(mutate, new up(h6.w0(null, i10, false)));
        this.f10229b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10228a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f18733a7, false));
        c0 c0Var = new c0(this, new rc(this, 18));
        this.d = c0Var;
        c0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f10232n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        c0Var.j(tL_businessRecipients);
        d61 d61Var = new d61(this, new bi.v(this, 21), new a(this, 0), null);
        this.f10230c = d61Var;
        d61Var.p1();
        d61 d61Var2 = this.f10230c;
        d61Var2.Y2.f28662r = false;
        frameLayout.addView(d61Var2, x5.c(-1.0f, -1));
        this.actionBar.z(this.f10230c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        v51 v51Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            d61 d61Var = this.f10230c;
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
                if (!this.f10234s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18409a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18409a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f18409a);
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
        this.f10230c.setPadding(0, 0, 0, i13);
        this.f10230c.setClipToPadding(false);
    }
}
