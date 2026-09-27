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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.x51;
import w7.y5;
public final class c extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public rr f10226a;
    public org.telegram.ui.ActionBar.w0 f10227b;
    public t61 f10228c;
    public a0 d;
    public boolean e;
    public boolean f10229f;
    public int h;
    public TL_account.TL_businessAwayMessage f10230n;
    public int f10231r;
    public boolean f10232s;
    public boolean v;
    public boolean f10233w;
    public int f10234x;
    public int f10235y;

    public static void U(c cVar, ArrayList arrayList, l61 l61Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        x51 x51Var = new x51(2);
        x51Var.f30302l = string;
        x51Var.f30305o = string2;
        x51Var.f30303m = "RestrictedEmoji";
        x51Var.f30304n = "💤";
        arrayList.add(x51Var);
        x51 i10 = x51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f10232s);
        arrayList.add(i10);
        arrayList.add(x51.B(null));
        if (cVar.f10232s) {
            a2 d = b2.f(cVar.currentAccount).d("away");
            if (d != null) {
                x51 x51Var2 = new x51(17);
                x51Var2.G = d;
                arrayList.add(x51Var2);
            } else {
                x51 c10 = x51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f30307q = true;
                arrayList.add(c10);
            }
            arrayList.add(x51.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
            x51 w10 = x51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f10234x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (cVar.e) {
                x51 w11 = x51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f10234x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            x51 w12 = x51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f10234x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (cVar.f10234x == 2) {
                arrayList.add(x51.B(null));
                com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(x51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(x51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(x51.B(null));
            x51 i11 = x51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f10233w);
            arrayList.add(i11);
            com.google.android.gms.internal.vision.e2.w(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            x51 w13 = x51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            x51 w14 = x51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(x51.B(null));
            cVar.d.a(arrayList, l61Var, true);
            arrayList.add(x51.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f10227b == null) {
            return;
        }
        boolean W = W();
        this.f10227b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f10227b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f10227b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f10227b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f10227b;
        if (W) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        a0 a0Var;
        if (this.f10229f) {
            boolean z11 = this.f10232s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f10230n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((a0Var = this.d) == null || !a0Var.g())) {
                        int i10 = this.f10231r;
                        int i11 = this.f10234x;
                        if (i10 == i11 && this.f10230n.offline_only == this.f10233w && (i11 != 2 || (this.f10235y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f10226a.f28081c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            a2 d = b2.f(this.currentAccount).d("away");
            boolean z10 = this.f10232s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f10228c.z1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
                t61 t61Var = this.f10228c;
                t61Var.y0(t61Var.y1(2));
            } else if (z10 && !this.d.k(this.f10228c)) {
            } else {
                this.f10226a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f10232s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f10233w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f10210a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f10234x;
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
                        tL_businessAwayMessage.offline_only = this.f10233w;
                        tL_businessAwayMessage.shortcut_id = d.f10210a;
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
        t61 t61Var;
        l61 l61Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f10229f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f10230n = tL_businessAwayMessage;
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
        this.f10232s = z11;
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
        this.f10233w = z13;
        a0 a0Var = this.d;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f10230n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f10231r = 2;
                this.f10234x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f10235y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                t61Var = this.f10228c;
                if (t61Var != null && (l61Var = t61Var.Y2) != null) {
                    l61Var.N(true);
                }
                V(true);
                this.f10229f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f10230n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f10231r = 0;
            this.f10234x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f10231r = 1;
            this.f10234x = 1;
        } else {
            this.f10231r = 0;
            this.f10234x = 0;
        }
        t61Var = this.f10228c;
        if (t61Var != null) {
            l61Var.N(true);
        }
        V(true);
        this.f10229f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.f19392v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f10226a = new rr(mutate, new vp(i6.w0(null, i10, false)));
        this.f10227b = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f10226a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f19001a7, false));
        a0 a0Var = new a0(this, new qc(this, 18));
        this.d = a0Var;
        a0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f10230n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        t61 t61Var = new t61(this, new bi.v(this, 21), new a(this, 0), null);
        this.f10228c = t61Var;
        t61Var.q1();
        t61 t61Var2 = this.f10228c;
        t61Var2.Y2.f25959r = false;
        frameLayout.addView(t61Var2, y5.c(-1.0f, -1));
        this.actionBar.A(this.f10228c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        l61 l61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            t61 t61Var = this.f10228c;
            if (t61Var != null && (l61Var = t61Var.Y2) != null) {
                l61Var.N(true);
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
                if (!this.f10232s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f18655a);
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
        this.f10228c.setPadding(0, 0, 0, i13);
        this.f10228c.setClipToPadding(false);
    }
}
