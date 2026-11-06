package di;

import android.content.SharedPreferences;
import android.net.Uri;
import bi.ub;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o50;
import org.telegram.ui.tf0;
public final class i8 implements RequestDelegate {
    public final int f9232a;
    public final int f9233b;
    public final Object f9234c;
    public final Object d;
    public final Object f9235e;

    public i8(int i7, tf0 tf0Var, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f9232a = 7;
        this.f9233b = i7;
        this.f9234c = tf0Var;
        this.d = f2Var;
        this.f9235e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9232a;
        int i10 = this.f9233b;
        Object obj = this.f9235e;
        Object obj2 = this.d;
        Object obj3 = this.f9234c;
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
                org.telegram.messenger.g0.h3(new ub(tLObject, (boolean[]) obj3, (c20) obj2, this.f9233b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bg.l0((o50) obj3, (org.telegram.ui.e4) obj2, tL_error, tLObject, this.f9233b, (org.telegram.ui.a1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new ub((Object) sharedPreferences, (Object) ((TLRPC.TL_help_support) tLObject), (Object) u1Var, this.f9233b, f2Var, 14));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.a2(u1Var, 0));
                    return;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ub((lr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f9233b, (int[]) obj, 16));
                return;
            case 5:
                xs0 xs0Var = (xs0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new qr((org.telegram.ui.ActionBar.u1[]) obj2, 2));
                int i11 = this.f9233b;
                if (tL_error == null) {
                    qp.s1(i11).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new pp0(xs0Var, i11, tL_error, tL_messages_editMessage, 0));
                    return;
                }
            case 6:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new ub((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f9233b, (org.telegram.ui.ActionBar.u1) obj, 18), 2L);
                return;
            case 7:
                tf0 tf0Var = (tf0) obj3;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    qp.s1(i10).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(tf0Var);
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new pp0(i10, tL_error, f2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new bg.l0((org.telegram.ui.web.x0) obj3, tLObject, this.f9233b, (org.telegram.ui.web.u0) obj2, (o7) obj, tL_error));
                return;
        }
    }

    public i8(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9232a = i10;
        this.f9234c = obj;
        this.f9233b = i7;
        this.d = obj2;
        this.f9235e = obj3;
    }

    public i8(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f9232a = i10;
        this.f9234c = obj;
        this.d = obj2;
        this.f9233b = i7;
        this.f9235e = obj3;
    }
}
