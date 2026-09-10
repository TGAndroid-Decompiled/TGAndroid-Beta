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
public final class a1 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public vr f8802a;
    public org.telegram.ui.ActionBar.w0 f8803b;
    public r61 f8804c;
    public e0 d;
    public final int[] e;
    public final String[] f8805f;
    public boolean h;
    public int f8806n;
    public TL_account.TL_businessGreetingMessage f8807r;
    public boolean f8808s;
    public boolean v;
    public int f8809w;

    public a1() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.e = iArr;
        this.f8806n = -4;
        this.f8809w = 7;
        this.f8805f = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.e;
            if (i10 < iArr2.length) {
                this.f8805f[i10] = LocaleController.formatPluralString("DaysSchedule", iArr2[i10], new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void U(a1 a1Var, ArrayList arrayList, j61 j61Var) {
        String string = LocaleController.getString(R.string.BusinessGreet);
        String string2 = LocaleController.getString(R.string.BusinessGreetInfo);
        v51 v51Var = new v51(2);
        v51Var.f27829l = string;
        v51Var.f27832o = string2;
        v51Var.f27830m = "RestrictedEmoji";
        v51Var.f27831n = "👋";
        arrayList.add(v51Var);
        v51 i10 = v51.i(1, LocaleController.getString(R.string.BusinessGreetSend));
        i10.K(a1Var.f8808s);
        arrayList.add(i10);
        arrayList.add(v51.B(null));
        if (a1Var.f8808s) {
            j2 d = k2.f(a1Var.currentAccount).d("hello");
            if (d != null) {
                v51 v51Var2 = new v51(17);
                v51Var2.G = d;
                arrayList.add(v51Var2);
            } else {
                v51 c10 = v51.c(2, R.drawable.msg2_chats_add, LocaleController.getString(R.string.BusinessGreetCreate));
                c10.f27834q = true;
                arrayList.add(c10);
            }
            arrayList.add(v51.B(null));
            com.google.android.gms.internal.vision.e2.m(R.string.BusinessRecipients, arrayList);
            v51 w10 = v51.w(3, LocaleController.getString(R.string.BusinessChatsAllPrivateExcept2));
            w10.K(a1Var.v);
            arrayList.add(w10);
            v51 w11 = v51.w(4, LocaleController.getString(R.string.BusinessChatsOnlySelected2));
            w11.K(!a1Var.v);
            arrayList.add(w11);
            arrayList.add(v51.B(null));
            a1Var.d.a(arrayList, j61Var, true);
            com.google.android.gms.internal.vision.e2.w(R.string.BusinessGreetRecipientsInfo, arrayList);
            com.google.android.gms.internal.vision.e2.m(R.string.BusinessGreetPeriod, arrayList);
            int i11 = 0;
            while (true) {
                int[] iArr = a1Var.e;
                if (i11 < iArr.length) {
                    if (iArr[i11] == a1Var.f8809w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = a1Var.f8805f;
            ai.b bVar = new ai.b(a1Var, 18);
            v51 v51Var3 = new v51(14);
            v51Var3.f27833p = strArr;
            v51Var3.f27842z = i11;
            v51Var3.C = bVar;
            v51Var3.B = -1L;
            arrayList.add(v51Var3);
            com.google.android.gms.internal.vision.e2.w(R.string.BusinessGreetPeriodInfo, arrayList);
        }
    }

    public final void V(boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f8803b == null) {
            return;
        }
        boolean W = W();
        this.f8803b.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f8803b.animate();
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
        org.telegram.ui.ActionBar.w0 w0Var = this.f8803b;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        w0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f8803b;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f8803b;
        if (W) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final boolean W() {
        boolean z10;
        e0 e0Var;
        if (this.h) {
            boolean z11 = this.f8808s;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f8807r;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f8809w || tL_businessGreetingMessage.recipients.exclude_selected != this.v || ((e0Var = this.d) != null && e0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void X() {
        if (this.f8802a.f28591c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            j2 d = k2.f(this.currentAccount).d("hello");
            boolean z10 = this.f8808s;
            if (z10 && d == null) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                View x12 = this.f8804c.x1(2);
                int i10 = -this.f8806n;
                this.f8806n = i10;
                AndroidUtilities.shakeViewSpring(x12, i10);
            } else if (z10 && !this.d.k(this.f8804c)) {
            } else {
                this.f8802a.a(1.0f);
                TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f8808s) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f8917a;
                    tL_inputBusinessGreetingMessage.recipients = this.d.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f8809w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (userFull != null) {
                        userFull.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        userFull.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f8917a;
                        tL_businessGreetingMessage.recipients = this.d.f();
                        userFull.business_greeting_message.no_activity_days = this.f8809w;
                    }
                } else if (userFull != null) {
                    userFull.flags2 &= -5;
                    userFull.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bi.c2(this, 10));
                getMessagesStorage().updateUserInfo(userFull, false);
            }
        }
    }

    public final void Y() {
        boolean z10;
        int i10;
        boolean z11;
        j61 j61Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.h) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = userFull.business_greeting_message;
        this.f8807r = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f8808s = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f8809w = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.v = z11;
        e0 e0Var = this.d;
        if (e0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            e0Var.j(tL_businessRecipients);
        }
        r61 r61Var = this.f8804c;
        if (r61Var != null && (j61Var = r61Var.Y2) != null) {
            j61Var.N(true);
        }
        V(true);
        this.h = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessGreet));
        this.actionBar.setActionBarMenuOnItemClick(new di.w(this, 12));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = j6.f18256v8;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f8802a = new vr(mutate, new zp(j6.w0(null, i10, false)));
        this.f8803b = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f8802a);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f17872a7, false));
        e0 e0Var = new e0(this, new wc(this, 28));
        this.d = e0Var;
        e0Var.f8869n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f8807r;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        e0Var.j(tL_businessRecipients);
        r61 r61Var = new r61(this, new ai.c0(this, 25), new z0(this, 2), null);
        this.f8804c = r61Var;
        r61Var.o1();
        r61 r61Var2 = this.f8804c;
        r61Var2.Y2.f24250r = false;
        frameLayout.addView(r61Var2, a6.c(-1.0f, -1));
        this.actionBar.z(this.f8804c, true);
        Y();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j61 j61Var;
        if (i10 == NotificationCenter.quickRepliesUpdated) {
            r61 r61Var = this.f8804c;
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
                if (!this.f8808s) {
                    X();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.BusinessGreetUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new z0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new z0(this, 1));
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
        this.f8804c.setPadding(0, 0, 0, i13);
        this.f8804c.setClipToPadding(false);
    }
}
