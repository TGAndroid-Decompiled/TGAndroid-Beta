package gg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.wc;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.zp;
import w7.a6;
public final class c extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public vr f8822a;
    public org.telegram.ui.ActionBar.w0 f8823b;
    public r61 f8824c;
    public e0 d;
    public boolean e;
    public boolean f8825f;
    public int h;
    public TL_account.TL_businessAwayMessage f8826n;
    public int f8827r;
    public boolean f8828s;
    public boolean v;
    public boolean f8829w;
    public int f8830x;
    public int f8831y;

    public static void U(c cVar, ArrayList arrayList, j61 j61Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        v51 v51Var = new v51(2);
        v51Var.f27829l = string;
        v51Var.f27832o = string2;
        v51Var.f27830m = "RestrictedEmoji";
        v51Var.f27831n = "💤";
        arrayList.add(v51Var);
        v51 i10 = v51.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(cVar.f8828s);
        arrayList.add(i10);
        arrayList.add(v51.B(null));
        if (cVar.f8828s) {
            j2 d = k2.f(cVar.currentAccount).d("away");
            if (d != null) {
                v51 v51Var2 = new v51(17);
                v51Var2.G = d;
                arrayList.add(v51Var2);
            } else {
                v51 c10 = v51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f27834q = true;
                arrayList.add(c10);
            }
            arrayList.add(v51.B(null));
            com.google.android.gms.internal.vision.e2.m(R.string.BusinessAwaySchedule, arrayList);
            v51 w10 = v51.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (cVar.f8830x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (cVar.e) {
                v51 w11 = v51.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (cVar.f8830x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            v51 w12 = v51.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (cVar.f8830x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (cVar.f8830x == 2) {
                arrayList.add(v51.B(null));
                com.google.android.gms.internal.vision.e2.m(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(v51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(cVar.F), 8));
                arrayList.add(v51.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(cVar.G), 9));
            }
            arrayList.add(v51.B(null));
            v51 i11 = v51.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(cVar.f8829w);
            arrayList.add(i11);
            com.google.android.gms.internal.vision.e2.w(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.m(R.string.BusinessRecipients, arrayList);
            v51 w13 = v51.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(cVar.v);
            arrayList.add(w13);
            v51 w14 = v51.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!cVar.v);
            arrayList.add(w14);
            arrayList.add(v51.B(null));
            cVar.d.a(arrayList, j61Var, true);
            arrayList.add(v51.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f8823b == null) {
            return;
        }
        boolean W = W();
        this.f8823b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f8823b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f8823b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f8823b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f8823b;
        if (W) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        e0 e0Var;
        if (this.f8825f) {
            boolean z11 = this.f8828s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f8826n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((e0Var = this.d) == null || !e0Var.g())) {
                        int i10 = this.f8827r;
                        int i11 = this.f8830x;
                        if (i10 == i11 && this.f8826n.offline_only == this.f8829w && (i11 != 2 || (this.f8831y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f8822a.f28591c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            j2 d = k2.f(this.currentAccount).d("away");
            boolean z10 = this.f8828s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View x12 = this.f8824c.x1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(x12, i10);
                r61 r61Var = this.f8824c;
                r61Var.x0(r61Var.w1(2));
            } else if (z10 && !this.d.k(this.f8824c)) {
            } else {
                this.f8822a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f8828s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f8829w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f8917a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f8830x;
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
                        tL_businessAwayMessage.offline_only = this.f8829w;
                        tL_businessAwayMessage.shortcut_id = d.f8917a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new bi.c2(this, 7));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r61 r61Var;
        j61 j61Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f8825f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f8826n = tL_businessAwayMessage;
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
        this.f8828s = z11;
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
        this.f8829w = z13;
        e0 e0Var = this.d;
        if (e0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            e0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f8826n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f8827r = 2;
                this.f8830x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f8831y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                r61Var = this.f8824c;
                if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                    j61Var.N(true);
                }
                V(true);
                this.f8825f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f8826n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f8827r = 0;
            this.f8830x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f8827r = 1;
            this.f8830x = 1;
        } else {
            this.f8827r = 0;
            this.f8830x = 0;
        }
        r61Var = this.f8824c;
        if (r61Var != null) {
            j61Var.N(true);
        }
        V(true);
        this.f8825f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f8822a = new vr(mutate, new zp(j6.w0(null, i10, false)));
        this.f8823b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f8822a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        e0 e0Var = new e0(this, new wc(this, 24));
        this.d = e0Var;
        e0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f8826n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        e0Var.j(tL_businessRecipients);
        r61 r61Var = new r61(this, new ai.c0(this, 21), new a(this, 0), null);
        this.f8824c = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.f8824c;
        r61Var2.Y2.f24250r = false;
        frameLayout.addView(r61Var2, a6.c(-1.0f, -1));
        this.actionBar.z(this.f8824c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            r61 r61Var = this.f8824c;
            if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                j61Var.N(true);
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
                if (!this.f8828s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f17528a);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.quickRepliesUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        k2.f(this.currentAccount).h();
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
        this.f8824c.setPadding(0, 0, 0, i13);
        this.f8824c.setClipToPadding(false);
    }
}
