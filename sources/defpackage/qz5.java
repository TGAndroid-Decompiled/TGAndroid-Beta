package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class qz5 implements Runnable {
    public final byte a = 1;
    public final LaunchActivity b;
    public final TLObject c;
    public final int d;
    public final String e;
    public final TLRPC.TL_error f;
    public final k16 h;

    public qz5(LaunchActivity launchActivity, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, k16 k16Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.e = str;
        this.f = tL_error;
        this.h = k16Var;
    }

    @Override
    public final void run() {
        c41 b0;
        int i;
        int i2;
        String str;
        byte b = this.a;
        k16 k16Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str2 = this.e;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                String str3 = LaunchActivity.C1;
                if (tL_error != null) {
                    d S = LaunchActivity.S();
                    if (S != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b0 = c41.b0(S);
                            i = 2131624021;
                            i2 = 2131743567;
                        } else {
                            b0 = c41.b0(S);
                            i = 2131624012;
                            i2 = 2131743568;
                        }
                        ts2.u(null, i2, b0, i, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    oc7.r1(launchActivity.P).d4(tL_payments_uniqueStarGift.users, false);
                    oc7.r1(launchActivity.P).X3(tL_payments_uniqueStarGift.chats, false);
                    d S2 = LaunchActivity.S();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        wsa wsaVar = new wsa(launchActivity, this.d, 0L, null, null);
                        wsaVar.m2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (S2 != null) {
                            if (S2.getLastStoryViewer() != null && S2.getLastStoryViewer().K0) {
                                S2.getLastStoryViewer().t(wsaVar);
                            } else {
                                S2.showDialog(wsaVar);
                            }
                        } else {
                            wsaVar.show();
                        }
                    }
                }
                try {
                    k16Var.run();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                String str4 = LaunchActivity.C1;
                boolean z = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    oc7.r1(this.d).c4(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new yv1(bundle));
                } else {
                    StringBuilder p = wi8.p("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    p.append(str);
                    fc4.d(p.toString());
                    mlb.y(null, 2131747868, c41.b0((d) b10.f(1, launchActivity2.e0)), null);
                }
                try {
                    k16Var.run();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }

    public qz5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, k16 k16Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.e = str;
        this.h = k16Var;
    }
}
