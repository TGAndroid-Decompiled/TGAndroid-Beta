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
public final class c extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public as f12836a;
    public org.telegram.ui.ActionBar.u0 f12837b;
    public b71 f12838c;
    public a0 d;
    public boolean e;
    public boolean f12839f;
    public int h;
    public TL_account.TL_businessAwayMessage f12840n;
    public int f12841r;
    public boolean f12842s;
    public boolean v;
    public boolean f12843w;
    public int f12844x;
    public int f12845y;

    public static void U(c cVar, ArrayList arrayList, t61 t61Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        g61 g61Var = new g61(2);
        g61Var.f26499l = string;
        g61Var.f26502o = string2;
        g61Var.f26500m = "RestrictedEmoji";
        g61Var.f26501n = "💤";
        arrayList.add(g61Var);
        g61 i10 = g61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f12842s);
        arrayList.add(i10);
        arrayList.add(g61.B(null));
        if (cVar.f12842s) {
            z1 d = a2.f(cVar.currentAccount).d("away");
            if (d != null) {
                g61 g61Var2 = new g61(17);
                g61Var2.G = d;
                arrayList.add(g61Var2);
            } else {
                g61 c10 = g61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f26504q = true;
                arrayList.add(c10);
            }
            arrayList.add(g61.B(null));
            i2.e.p(R.string.BusinessAwaySchedule, arrayList);
            g61 w9 = g61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f12844x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w9.K(z10);
            arrayList.add(w9);
            if (cVar.e) {
                g61 w10 = g61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f12844x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w10.K(z11);
                arrayList.add(w10);
            }
            g61 w11 = g61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f12844x == 2) {
                z12 = true;
            }
            w11.K(z12);
            arrayList.add(w11);
            if (cVar.f12844x == 2) {
                arrayList.add(g61.B(null));
                i2.e.p(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(g61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(g61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(g61.B(null));
            g61 i11 = g61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f12843w);
            arrayList.add(i11);
            i2.e.B(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            i2.e.p(R.string.BusinessRecipients, arrayList);
            g61 w12 = g61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w12.K(cVar.v);
            arrayList.add(w12);
            g61 w13 = g61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w13.K(!cVar.v);
            arrayList.add(w13);
            arrayList.add(g61.B(null));
            cVar.d.a(arrayList, t61Var, true);
            arrayList.add(g61.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f12837b == null) {
            return;
        }
        boolean W = W();
        this.f12837b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f12837b.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f12837b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f12837b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f12837b;
        if (W) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.f12839f) {
            boolean z11 = this.f12842s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f12840n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((a0Var = this.d) == null || !a0Var.g())) {
                        int i10 = this.f12841r;
                        int i11 = this.f12844x;
                        if (i10 == i11 && this.f12840n.offline_only == this.f12843w && (i11 != 2 || (this.f12845y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f12836a.f24691c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            z1 d = a2.f(this.currentAccount).d("away");
            boolean z10 = this.f12842s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f12838c.z1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
                b71 b71Var = this.f12838c;
                b71Var.x0(b71Var.y1(2));
            } else if (z10 && !this.d.k(this.f12838c)) {
            } else {
                this.f12836a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f12842s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f12843w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f13100a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f12844x;
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
                        tL_businessAwayMessage.offline_only = this.f12843w;
                        tL_businessAwayMessage.shortcut_id = d.f13100a;
                        tL_businessAwayMessage.recipients = this.d.f();
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
        b71 b71Var;
        t61 t61Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f12839f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f12840n = tL_businessAwayMessage;
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
        this.f12842s = z11;
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
        this.f12843w = z13;
        a0 a0Var = this.d;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f12840n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f12841r = 2;
                this.f12844x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f12845y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                b71Var = this.f12838c;
                if (b71Var != null && (t61Var = b71Var.W2) != null) {
                    t61Var.N(true);
                }
                V(true);
                this.f12839f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f12840n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f12841r = 0;
            this.f12844x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f12841r = 1;
            this.f12844x = 1;
        } else {
            this.f12841r = 0;
            this.f12844x = 0;
        }
        b71Var = this.f12838c;
        if (b71Var != null) {
            t61Var.N(true);
        }
        V(true);
        this.f12839f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = h6.f21324v8;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f12836a = new as(mutate, new dq(h6.x0(null, i10, false)));
        this.f12837b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f12836a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20931a7, false));
        a0 a0Var = new a0(this, new bc(this, 17));
        this.d = a0Var;
        a0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f12840n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        b71 b71Var = new b71(this, new hg.o(this, 2), new a(this, 0), null);
        this.f12838c = b71Var;
        b71Var.p1();
        b71 b71Var2 = this.f12838c;
        b71Var2.W2.f30438r = false;
        frameLayout.addView(b71Var2, z5.c(-1.0f, -1));
        this.actionBar.A(this.f12838c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t61 t61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            b71 b71Var = this.f12838c;
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
                if (!this.f12842s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f20604a);
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
        this.f12838c.setPadding(0, 0, 0, i13);
        this.f12838c.setClipToPadding(false);
    }
}
