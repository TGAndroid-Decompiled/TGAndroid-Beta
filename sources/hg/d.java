package hg;

import ai.o8;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.q61;
import w7.x5;
public final class d extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public hs f11187a;
    public org.telegram.ui.ActionBar.v0 f11188b;
    public l71 f11189c;
    public b0 d;
    public boolean f11190e;
    public boolean f11191f;
    public int h;
    public TL_account.TL_businessAwayMessage f11192n;
    public int f11193r;
    public boolean f11194s;
    public boolean v;
    public boolean f11195w;
    public int f11196x;
    public int f11197y;

    public static void U(d dVar, ArrayList arrayList, d71 d71Var) {
        boolean z10;
        boolean z11;
        String string = LocaleController.getString(R.string.BusinessAway);
        String string2 = LocaleController.getString(R.string.BusinessAwayInfo);
        q61 q61Var = new q61(2);
        q61Var.f30063l = string;
        q61Var.f30066o = string2;
        q61Var.f30064m = "RestrictedEmoji";
        q61Var.f30065n = "💤";
        arrayList.add(q61Var);
        q61 i10 = q61.i(1, LocaleController.getString(R.string.BusinessAwaySend));
        i10.K(dVar.f11194s);
        arrayList.add(i10);
        arrayList.add(q61.B(null));
        if (dVar.f11194s) {
            b2 d = c2.f(dVar.currentAccount).d("away");
            if (d != null) {
                q61 q61Var2 = new q61(17);
                q61Var2.G = d;
                arrayList.add(q61Var2);
            } else {
                q61 c10 = q61.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessAwayCreate));
                c10.f30068q = true;
                arrayList.add(c10);
            }
            arrayList.add(q61.B(null));
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
            q61 w10 = q61.w(3, LocaleController.getString(R.string.BusinessAwayScheduleAlways));
            boolean z12 = false;
            if (dVar.f11196x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w10.K(z10);
            arrayList.add(w10);
            if (dVar.f11190e) {
                q61 w11 = q61.w(4, LocaleController.getString(R.string.BusinessAwayScheduleOutsideHours));
                if (dVar.f11196x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w11.K(z11);
                arrayList.add(w11);
            }
            q61 w12 = q61.w(5, LocaleController.getString(R.string.BusinessAwayScheduleCustom));
            if (dVar.f11196x == 2) {
                z12 = true;
            }
            w12.K(z12);
            arrayList.add(w12);
            if (dVar.f11196x == 2) {
                arrayList.add(q61.B(null));
                com.google.android.gms.internal.vision.e2.n(R.string.BusinessAwaySchedule, arrayList);
                arrayList.add(q61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomStart), LocaleController.formatShortDateTime(dVar.F), 8));
                arrayList.add(q61.f(LocaleController.getString(R.string.BusinessAwayScheduleCustomEnd), LocaleController.formatShortDateTime(dVar.G), 9));
            }
            arrayList.add(q61.B(null));
            q61 i11 = q61.i(10, LocaleController.getString(R.string.BusinessAwayOnlyOffline));
            i11.K(dVar.f11195w);
            arrayList.add(i11);
            c.n(R.string.BusinessAwayOnlyOfflineInfo, arrayList);
            com.google.android.gms.internal.vision.e2.n(R.string.BusinessRecipients, arrayList);
            q61 w13 = q61.w(6, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w13.K(dVar.v);
            arrayList.add(w13);
            q61 w14 = q61.w(7, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w14.K(!dVar.v);
            arrayList.add(w14);
            arrayList.add(q61.B(null));
            dVar.d.a(arrayList, d71Var, true);
            arrayList.add(q61.B(null));
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f11188b == null) {
            return;
        }
        boolean W = W();
        this.f11188b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f11188b.animate();
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
        org.telegram.ui.ActionBar.v0 v0Var = this.f11188b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f11188b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f11188b;
        if (W) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        b0 b0Var;
        if (this.f11191f) {
            boolean z11 = this.f11194s;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11192n;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.v && ((b0Var = this.d) == null || !b0Var.g())) {
                        int i10 = this.f11193r;
                        int i11 = this.f11196x;
                        if (i10 == i11 && this.f11192n.offline_only == this.f11195w && (i11 != 2 || (this.f11197y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void X() {
        if (this.f11187a.f27135c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            b2 d = c2.f(this.currentAccount).d("away");
            boolean z10 = this.f11194s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View z12 = this.f11189c.z1(2);
                int i10 = -this.h;
                this.h = i10;
                AndroidUtilities.shakeViewSpring(z12, i10);
                l71 l71Var = this.f11189c;
                l71Var.x0(l71Var.y1(2));
            } else if (z10 && !this.d.k(this.f11189c)) {
            } else {
                this.f11187a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f11194s) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f11195w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f11174a;
                    tL_inputBusinessAwayMessage.recipients = this.d.e();
                    int i11 = this.f11196x;
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
                        tL_businessAwayMessage.offline_only = this.f11195w;
                        tL_businessAwayMessage.shortcut_id = d.f11174a;
                        tL_businessAwayMessage.recipients = this.d.f();
                        userFull.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -9;
                    userFull.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new o8(this, 10));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l71 l71Var;
        d71 d71Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f11191f) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = userFull.business_away_message;
        this.f11192n = tL_businessAwayMessage;
        if (userFull.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11190e = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f11194s = z11;
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
        this.f11195w = z13;
        b0 b0Var = this.d;
        if (b0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.f11192n;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f11193r = 2;
                this.f11196x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f11197y = i10;
                this.F = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i11;
                this.G = i11;
                l71Var = this.f11189c;
                if (l71Var != null && (d71Var = l71Var.W2) != null) {
                    d71Var.N(true);
                }
                V(true);
                this.f11191f = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.f11192n;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f11193r = 0;
            this.f11196x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f11193r = 1;
            this.f11196x = 1;
        } else {
            this.f11193r = 0;
            this.f11196x = 0;
        }
        l71Var = this.f11189c;
        if (l71Var != null) {
            d71Var.N(true);
        }
        V(true);
        this.f11191f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessAway));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 9));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = i6.f21134v8;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.x0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f11187a = new hs(mutate, new jq(i6.x0(null, i10, false)));
        this.f11188b = this.actionBar.o().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f11187a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.x0(null, i6.f20745a7, false));
        b0 b0Var = new b0(this, new rc(this, 18));
        this.d = b0Var;
        b0Var.h = this.v;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.f11192n;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        l71 l71Var = new l71(this, new bi.v(this, 21), new a(this, 0), null);
        this.f11189c = l71Var;
        l71Var.p1();
        l71 l71Var2 = this.f11189c;
        l71Var2.W2.f25587r = false;
        frameLayout.addView(l71Var2, x5.d(-1.0f, -1));
        this.actionBar.B(this.f11189c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d71 d71Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            l71 l71Var = this.f11189c;
            if (l71Var != null && (d71Var = l71Var.W2) != null) {
                d71Var.N(true);
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
                if (!this.f11194s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.BusinessAwayUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new a(this, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new a(this, 2));
                showDialog(alertDialog$Builder.f20378a);
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
        this.f11189c.setPadding(0, 0, 0, i13);
        this.f11189c.setClipToPadding(false);
    }
}
