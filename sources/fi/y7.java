package fi;

import android.content.SharedPreferences;
import android.net.Uri;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.yr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p50;
import org.telegram.ui.xf0;
public final class y7 implements RequestDelegate {
    public final int f12789a;
    public final int f12790b;
    public final Object f12791c;
    public final Object d;
    public final Object f12792e;

    public y7(int i7, xf0 xf0Var, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f12789a = 7;
        this.f12790b = i7;
        this.f12791c = xf0Var;
        this.d = h2Var;
        this.f12792e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f12789a;
        int i10 = this.f12790b;
        Object obj = this.f12792e;
        Object obj2 = this.d;
        Object obj3 = this.f12791c;
        switch (i7) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                bg.l0 l0Var = (bg.l0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(i10).u(new Object[]{tL_messages_getAttachedStickers, l0Var}, obj3);
                    return;
                } else {
                    l0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                org.telegram.messenger.g0.g3(new ai.g1(tLObject, (boolean[]) obj3, (x10) obj2, this.f12790b, (TL_account.updateEmojiStatus) obj, 7));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new bg.m0((p50) obj3, (org.telegram.ui.e4) obj2, tL_error, tLObject, this.f12790b, (org.telegram.ui.a1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.g3(new ai.g1(sharedPreferences, (TLRPC.TL_help_support) tLObject, u1Var, this.f12790b, h2Var, 16));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.i2(u1Var, 0));
                    return;
                }
            case 4:
                org.telegram.messenger.g0.g3(new ai.g1((yr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f12790b, (int[]) obj));
                return;
            case 5:
                gt0 gt0Var = (gt0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.g3(new ds((org.telegram.ui.ActionBar.u1[]) obj2, 2));
                int i11 = this.f12790b;
                if (tL_error == null) {
                    mp.u1(i11).V3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new kp0(gt0Var, i11, tL_error, tL_messages_editMessage, 1));
                    return;
                }
            case 6:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new ai.g1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f12790b, (org.telegram.ui.ActionBar.u1) obj, 20), 2L);
                return;
            case 7:
                xf0 xf0Var = (xf0) obj3;
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    mp.u1(i10).V3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.g3(xf0Var);
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new kp0(i10, tL_error, h2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.g3(new bg.m0((org.telegram.ui.web.v0) obj3, tLObject, this.f12790b, (org.telegram.ui.web.s0) obj2, (f7) obj, tL_error));
                return;
        }
    }

    public y7(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f12789a = i10;
        this.f12791c = obj;
        this.f12790b = i7;
        this.d = obj2;
        this.f12792e = obj3;
    }

    public y7(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f12789a = i10;
        this.f12791c = obj;
        this.d = obj2;
        this.f12790b = i7;
        this.f12792e = obj3;
    }
}
