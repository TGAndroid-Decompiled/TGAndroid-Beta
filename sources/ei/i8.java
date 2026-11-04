package ei;

import android.content.SharedPreferences;
import android.net.Uri;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i50;
import org.telegram.ui.nf0;
public final class i8 implements RequestDelegate {
    public final int f10423a;
    public final int f10424b;
    public final Object f10425c;
    public final Object d;
    public final Object f10426e;

    public i8(int i3, nf0 nf0Var, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f10423a = 7;
        this.f10424b = i3;
        this.f10425c = nf0Var;
        this.d = d2Var;
        this.f10426e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f10423a;
        int i10 = this.f10424b;
        Object obj = this.f10426e;
        Object obj2 = this.d;
        Object obj3 = this.f10425c;
        switch (i3) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                cg.j0 j0Var = (cg.j0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(i10).u(new Object[]{tL_messages_getAttachedStickers, j0Var}, obj3);
                    return;
                } else {
                    j0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                org.telegram.messenger.g0.h3(new ai.p1(tLObject, (boolean[]) obj3, (u10) obj2, this.f10424b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new cg.k0((i50) obj3, (org.telegram.ui.g4) obj2, tL_error, tLObject, this.f10424b, (org.telegram.ui.b1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new ai.p1(sharedPreferences, (TLRPC.TL_help_support) tLObject, s1Var, this.f10424b, d2Var, 16));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1(s1Var, 0));
                    return;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ai.p1((lr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f10424b, (int[]) obj, 18));
                return;
            case 5:
                ws0 ws0Var = (ws0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new qr((org.telegram.ui.ActionBar.s1[]) obj2, 2));
                int i11 = this.f10424b;
                if (tL_error == null) {
                    hp.s1(i11).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new zo0(ws0Var, i11, tL_error, tL_messages_editMessage, 1));
                    return;
                }
            case 6:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.i3(new ai.p1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f10424b, (org.telegram.ui.ActionBar.s1) obj, 20), 2L);
                return;
            case 7:
                nf0 nf0Var = (nf0) obj3;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    hp.s1(i10).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(nf0Var);
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new zo0(i10, tL_error, d2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new cg.k0((org.telegram.ui.web.w0) obj3, tLObject, this.f10424b, (org.telegram.ui.web.t0) obj2, (p7) obj, tL_error));
                return;
        }
    }

    public i8(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f10423a = i10;
        this.f10425c = obj;
        this.f10424b = i3;
        this.d = obj2;
        this.f10426e = obj3;
    }

    public i8(Object obj, Object obj2, int i3, Object obj3, int i10) {
        this.f10423a = i10;
        this.f10425c = obj;
        this.d = obj2;
        this.f10424b = i3;
        this.f10426e = obj3;
    }
}
