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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import w7.a6;
public final class c extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public ds f11451a;
    public org.telegram.ui.ActionBar.u0 f11452b;
    public h71 f11453c;
    public a0 d;
    public boolean e;
    public boolean f11454f;
    public int h;
    public TL_account.TL_businessAwayMessage f11455n;
    public int f11456r;
    public boolean f11457s;
    public boolean v;
    public boolean f11458w;
    public int f11459x;
    public int f11460y;

    public static void U(c cVar, ArrayList arrayList, z61 z61Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        l61 l61Var = new l61(2);
        l61Var.f26954l = string;
        l61Var.f26957o = string2;
        l61Var.f26955m = "RestrictedEmoji";
        l61Var.f26956n = "💤";
        arrayList.add(l61Var);
        l61 i10 = l61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f11457s);
        arrayList.add(i10);
        arrayList.add(l61.B(null));
        if (cVar.f11457s) {
            a2 d = b2.f(cVar.currentAccount).d("away");
            if (d != null) {
                l61 l61Var2 = new l61(17);
                l61Var2.G = d;
                arrayList.add(l61Var2);
            } else {
                l61 c10 = l61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f26959q = true;
                arrayList.add(c10);
            }
            arrayList.add(l61.B(null));
            i2.d.o(R.string.BusinessAwaySchedule, arrayList);
            l61 w9 = l61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f11459x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w9.K(z10);
            arrayList.add(w9);
            if (cVar.e) {
                l61 w10 = l61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f11459x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w10.K(z11);
                arrayList.add(w10);
            }
            l61 w11 = l61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f11459x == 2) {
                z12 = true;
            }
            w11.K(z12);
            arrayList.add(w11);
            if (cVar.f11459x == 2) {
                arrayList.add(l61.B(null));
                i2.d.o(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(l61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(l61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(l61.B(null));
            l61 i11 = l61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f11458w);
            arrayList.add(i11);
            i2.d.y(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.d.o(R.string.BusinessRecipients, arrayList);
            l61 w12 = l61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(cVar.v);
            arrayList.add(w12);
            l61 w13 = l61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!cVar.v);
            arrayList.add(w13);
            arrayList.add(l61.B(null));
            cVar.d.a(arrayList, z61Var, true);
            arrayList.add(l61.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11452b == null) {
            return;
        }
        boolean W = W();
        this.f11452b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11452b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f11452b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f11452b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f11452b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.f11454f) {
            boolean z11 = this.f11457s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11455n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((a0Var = this.d) == null || !a0Var.g())) {
                        int i10 = this.f11456r;
                        int i11 = this.f11459x;
                        if (i10 == i11 && this.f11455n.offline_only == this.f11458w && (i11 != 2 || (this.f11460y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f11451a.f24480c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("away");
            boolean z10 = this.f11457s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11453c.z1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
                h71 h71Var = this.f11453c;
                h71Var.x0(h71Var.y1(2));
            } else if (z10 && !this.d.k(this.f11453c)) {
            } else {
                this.f11451a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f11457s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f11458w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f11434a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f11459x;
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
                        tL_businessAwayMessage.offline_only = this.f11458w;
                        tL_businessAwayMessage.shortcut_id = d.f11434a;
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
        h71 h71Var;
        z61 z61Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f11454f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f11455n = tL_businessAwayMessage;
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
        this.f11457s = z11;
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
        this.f11458w = z13;
        a0 a0Var = this.d;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f11455n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f11456r = 2;
                this.f11459x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f11460y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                h71Var = this.f11453c;
                if (h71Var != null && (z61Var = h71Var.W2) != null) {
                    z61Var.N(true);
                }
                V(true);
                this.f11454f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f11455n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f11456r = 0;
            this.f11459x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f11456r = 1;
            this.f11459x = 1;
        } else {
            this.f11456r = 0;
            this.f11459x = 0;
        }
        h71Var = this.f11453c;
        if (h71Var != null) {
            z61Var.N(true);
        }
        V(true);
        this.f11454f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = g6.f20235v8;
        mutate.setColorFilter(new PorterDuffColorFilter(g6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11451a = new ds(mutate, new gq(g6.x0(null, i10, false)));
        this.f11452b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11451a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        a0 a0Var = new a0(this, new x8(this, 27));
        this.d = a0Var;
        a0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11455n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        h71 h71Var = new h71(this, new ci.u(this, 21), new a(this, 0), null);
        this.f11453c = h71Var;
        h71Var.p1();
        h71 h71Var2 = this.f11453c;
        h71Var2.W2.f31780r = false;
        frameLayout.addView(h71Var2, a6.d(-1.0f, -1));
        this.actionBar.A(this.f11453c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        z61 z61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            h71 h71Var = this.f11453c;
            if (h71Var != null && (z61Var = h71Var.W2) != null) {
                z61Var.N(true);
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
                if (!this.f11457s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f19548a);
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
        this.f11453c.setPadding(0, 0, 0, i13);
        this.f11453c.setClipToPadding(false);
    }
}
