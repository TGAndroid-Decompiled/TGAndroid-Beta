package bi;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.text.TextUtils;
import org.telegram.messenger.az;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.ys;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.bn;
import org.telegram.ui.vf;
public final class t4 implements Runnable {
    public final int f4119a = 1;
    public final int f4120b;
    public final int f4121c;
    public final boolean d;
    public final Object f4122e;
    public final Object f4123f;

    public t4(az azVar, TLRPC.Message message, int i7, int i10, boolean z10) {
        this.f4122e = azVar;
        this.f4123f = message;
        this.f4120b = i7;
        this.f4121c = i10;
        this.d = z10;
    }

    @Override
    public final void run() {
        TLRPC.Document e10;
        int i7;
        int i10 = this.f4119a;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        jg.q qVar = null;
        tL_starGiftUnique = null;
        int i11 = this.f4121c;
        Object obj = this.f4123f;
        boolean z10 = this.d;
        int i12 = this.f4120b;
        Object obj2 = this.f4122e;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    np.u1(i12).f4(tL_payments_uniqueStarGift.users, false);
                    np.u1(i12).Z3(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                if (tL_starGiftUnique != null && (!z10 ? TextUtils.isEmpty(tL_starGiftUnique.owner_address) : org.telegram.ui.Wallet.u0.c(tL_starGiftUnique.owner_address, org.telegram.ui.Wallet.u0.D(i12).y()))) {
                    if (z10) {
                        org.telegram.ui.Wallet.u0.D(i12).B().i(tL_starGiftUnique);
                    }
                    di.y8.y(i12, false).a0(tL_starGiftUnique);
                    di.y8.y(i12, false).O(k10.i(i12).e());
                    return;
                }
                int i13 = i11 + 1;
                if (i13 < 8) {
                    org.telegram.messenger.g0.h3(new r4(i12, i13, str, z10), x4.f4248b[i13]);
                    return;
                }
                return;
            case 1:
                az azVar = (az) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                azVar.getMediaDataController().y0(message.dialog_id);
                azVar.getNotificationCenter().k(21, Integer.valueOf(i12), Integer.valueOf(message.f28455id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                azVar.getNotificationCenter().k(22, Integer.valueOf(i12), Integer.valueOf(message.f28455id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i11), Boolean.valueOf(z10));
                azVar.d0(i12);
                azVar.i0(i12, z10);
                return;
            case 2:
                bn bnVar = (bn) obj2;
                xi0 xi0Var = (xi0) obj;
                org.telegram.ui.ActionBar.g1 g1Var = bnVar.f46041g9;
                if (g1Var != null && bnVar.fragmentView != null && !g1Var.isShowing()) {
                    Activity parentActivity = bnVar.getParentActivity();
                    Typeface typeface = org.telegram.messenger.g0.f24018a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        bnVar.f46041g9.showAtLocation(bnVar.A0, 51, i12, i11);
                        bnVar.ia(bnVar.f46041g9);
                        if (z10 && xi0Var != null) {
                            xi0Var.r(true);
                        }
                        org.telegram.messenger.g0.h3(new vf(bnVar, 1), 420L);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                qb qbVar = (qb) obj2;
                ch.p0 p0Var = (ch.p0) obj;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                long j3 = p0Var.f5508g;
                if (j3 == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) si.d0(k10.f24968t0).f26847r.get(p0Var.f5507f);
                    if (tL_availableReaction != null) {
                        e10 = tL_availableReaction.activate_animation;
                    } else {
                        return;
                    }
                } else {
                    e10 = org.telegram.ui.Components.p5.e(k10.f24968t0, j3);
                }
                if (e10 != null && Q != null) {
                    lc b02 = lc.b0(Q);
                    int i14 = qbVar.f38867a.h;
                    if (z10) {
                        qVar = new jg.q(i12, i11, Q, 10);
                    }
                    b02.y(i14, e10, qVar).k(true);
                    return;
                }
                return;
            default:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj2;
                org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) obj;
                if (i12 == 3) {
                    SharedPreferences.Editor edit = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit.remove("EnableAllStories");
                    } else {
                        edit.putBoolean("EnableAllStories", true);
                    }
                    edit.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                } else if (i12 != 4 && i12 != 5) {
                    ys notificationsController = notificationsSettingsActivity.getNotificationsController();
                    if (!z10) {
                        i7 = 0;
                    } else {
                        i7 = Integer.MAX_VALUE;
                    }
                    notificationsController.U(i12, i7);
                } else {
                    SharedPreferences.Editor edit2 = notificationsSettingsActivity.getNotificationsSettings().edit();
                    if (z10) {
                        edit2.putBoolean("EnableReactionsMessages", false);
                        edit2.putBoolean("EnableReactionsStories", false);
                    } else {
                        edit2.putBoolean("EnableReactionsMessages", true);
                        edit2.putBoolean("EnableReactionsStories", true);
                    }
                    edit2.apply();
                    notificationsSettingsActivity.getNotificationsController().b0(i12);
                    notificationsSettingsActivity.getNotificationsController().m(i12);
                }
                j5Var.f30911e.b(0, !z10, true);
                notificationsSettingsActivity.f43174c.g(i11);
                return;
        }
    }

    public t4(TLObject tLObject, int i7, boolean z10, int i10, String str) {
        this.f4122e = tLObject;
        this.f4120b = i7;
        this.d = z10;
        this.f4121c = i10;
        this.f4123f = str;
    }

    public t4(bn bnVar, int i7, int i10, boolean z10, xi0 xi0Var) {
        this.f4122e = bnVar;
        this.f4120b = i7;
        this.f4121c = i10;
        this.d = z10;
        this.f4123f = xi0Var;
    }

    public t4(qb qbVar, ch.p0 p0Var, boolean z10, int i7, int i10) {
        this.f4122e = qbVar;
        this.f4123f = p0Var;
        this.d = z10;
        this.f4120b = i7;
        this.f4121c = i10;
    }

    public t4(NotificationsSettingsActivity notificationsSettingsActivity, int i7, boolean z10, org.telegram.ui.Cells.j5 j5Var, int i10) {
        this.f4122e = notificationsSettingsActivity;
        this.f4120b = i7;
        this.d = z10;
        this.f4123f = j5Var;
        this.f4121c = i10;
    }
}
