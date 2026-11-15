package fi;

import android.content.SharedPreferences;
import android.net.Uri;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n50;
import org.telegram.ui.tf0;
public final class b8 implements RequestDelegate {
    public final int f11576a;
    public final int f11577b;
    public final Object f11578c;
    public final Object d;
    public final Object f11579e;

    public b8(int i7, tf0 tf0Var, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f11576a = 7;
        this.f11577b = i7;
        this.f11578c = tf0Var;
        this.d = e2Var;
        this.f11579e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f11576a;
        int i10 = this.f11577b;
        Object obj = this.f11579e;
        Object obj2 = this.d;
        Object obj3 = this.f11578c;
        switch (i7) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                bg.k0 k0Var = (bg.k0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(i10).u(new Object[]{tL_messages_getAttachedStickers, k0Var}, obj3);
                    return;
                } else {
                    k0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                org.telegram.messenger.g0.h3(new ai.f1(tLObject, (boolean[]) obj3, (z10) obj2, this.f11577b, (TL_account.updateEmojiStatus) obj, 7));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bg.l0((n50) obj3, (org.telegram.ui.e4) obj2, tL_error, tLObject, this.f11577b, (org.telegram.ui.a1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new ai.f1(sharedPreferences, (TLRPC.TL_help_support) tLObject, t1Var, this.f11577b, e2Var, 16));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.y1(t1Var, 0));
                    return;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ai.f1((rr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f11577b, (int[]) obj));
                return;
            case 5:
                ys0 ys0Var = (ys0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new wr((org.telegram.ui.ActionBar.t1[]) obj2, 2));
                int i11 = this.f11577b;
                if (tL_error == null) {
                    np.s1(i11).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new sp0(ys0Var, i11, tL_error, tL_messages_editMessage, 0));
                    return;
                }
            case 6:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.i3(new ai.f1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f11577b, (org.telegram.ui.ActionBar.t1) obj, 20), 2L);
                return;
            case 7:
                tf0 tf0Var = (tf0) obj3;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    np.s1(i10).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(tf0Var);
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new sp0(i10, tL_error, e2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new bg.l0((org.telegram.ui.web.v0) obj3, tLObject, this.f11577b, (org.telegram.ui.web.s0) obj2, (i7) obj, tL_error));
                return;
        }
    }

    public b8(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f11576a = i10;
        this.f11578c = obj;
        this.f11577b = i7;
        this.d = obj2;
        this.f11579e = obj3;
    }

    public b8(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f11576a = i10;
        this.f11578c = obj;
        this.d = obj2;
        this.f11577b = i7;
        this.f11579e = obj3;
    }
}
