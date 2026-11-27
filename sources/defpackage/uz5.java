package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class uz5 implements Runnable {
    public final byte a = 1;
    public final LaunchActivity b;
    public final TLObject c;
    public final int d;
    public final String e;
    public final TLRPC.TL_error f;
    public final tg5 h;

    public uz5(LaunchActivity launchActivity, TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, tg5 tg5Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.e = str;
        this.f = tL_error;
        this.h = tg5Var;
    }

    @Override
    public final void run() {
        d31 b0;
        int i;
        int i2;
        String str;
        byte b = this.a;
        tg5 tg5Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str2 = this.e;
        TLObject tLObject = this.c;
        switch (b) {
            case 0:
                String str3 = LaunchActivity.C1;
                if (tL_error != null) {
                    e S = LaunchActivity.S();
                    if (S != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b0 = d31.b0(S);
                            i = 2131624021;
                            i2 = 2131743535;
                        } else {
                            b0 = d31.b0(S);
                            i = 2131624012;
                            i2 = 2131743536;
                        }
                        bs2.v(null, i2, b0, i, 36);
                    } else {
                        return;
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    uc7.s1(launchActivity.P).j4(tL_payments_uniqueStarGift.users, false);
                    uc7.s1(launchActivity.P).c4(tL_payments_uniqueStarGift.chats, false);
                    e S2 = LaunchActivity.S();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        wua wuaVar = new wua(launchActivity, this.d, 0L, null, null);
                        wuaVar.n2(str2, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (S2 != null) {
                            if (S2.getLastStoryViewer() != null && S2.getLastStoryViewer().K0) {
                                S2.getLastStoryViewer().u(wuaVar);
                            } else {
                                S2.showDialog(wuaVar);
                            }
                        } else {
                            wuaVar.show();
                        }
                    }
                }
                try {
                    tg5Var.run();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                String str4 = LaunchActivity.C1;
                boolean z = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    uc7.s1(this.d).i4(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new zu1(bundle));
                } else {
                    StringBuilder p = ik8.p("cant import contact token. token=", str2, " err=");
                    if (tL_error == null) {
                        str = null;
                    } else {
                        str = tL_error.text;
                    }
                    p.append(str);
                    cc4.d(p.toString());
                    xnb.x(null, 2131747865, d31.b0((e) c00.g(1, launchActivity2.e0)), null);
                }
                try {
                    tg5Var.run();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }

    public uz5(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, tg5 tg5Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.e = str;
        this.h = tg5Var;
    }
}
