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
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r50;
import org.telegram.ui.wf0;
public final class j8 implements RequestDelegate {
    public final int f9269a;
    public final int f9270b;
    public final Object f9271c;
    public final Object d;
    public final Object f9272e;

    public j8(int i7, wf0 wf0Var, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f9269a = 7;
        this.f9270b = i7;
        this.f9271c = wf0Var;
        this.d = f2Var;
        this.f9272e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9269a;
        int i10 = this.f9270b;
        Object obj = this.f9272e;
        Object obj2 = this.d;
        Object obj3 = this.f9271c;
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
                org.telegram.messenger.g0.h3(new ub(tLObject, (boolean[]) obj3, (c20) obj2, this.f9270b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new bg.l0((r50) obj3, (org.telegram.ui.e4) obj2, tL_error, tLObject, this.f9270b, (org.telegram.ui.a1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new ub((Object) sharedPreferences, (Object) ((TLRPC.TL_help_support) tLObject), (Object) u1Var, this.f9270b, f2Var, 14));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.z1(u1Var, 0));
                    return;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ub((kr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f9270b, (int[]) obj, 16));
                return;
            case 5:
                ys0 ys0Var = (ys0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new pr((org.telegram.ui.ActionBar.u1[]) obj2, 2));
                int i11 = this.f9270b;
                if (tL_error == null) {
                    qp.s1(i11).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new pp0(ys0Var, i11, tL_error, tL_messages_editMessage, 0));
                    return;
                }
            case 6:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.i3(new ub((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f9270b, (org.telegram.ui.ActionBar.u1) obj, 18), 2L);
                return;
            case 7:
                wf0 wf0Var = (wf0) obj3;
                org.telegram.ui.ActionBar.f2 f2Var2 = (org.telegram.ui.ActionBar.f2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    qp.s1(i10).O3((TLRPC.Updates) tLObject, false);
                    org.telegram.messenger.g0.h3(wf0Var);
                    return;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new pp0(i10, tL_error, f2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.messenger.g0.h3(new bg.l0((org.telegram.ui.web.x0) obj3, tLObject, this.f9270b, (org.telegram.ui.web.u0) obj2, (p7) obj, tL_error));
                return;
        }
    }

    public j8(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9269a = i10;
        this.f9271c = obj;
        this.f9270b = i7;
        this.d = obj2;
        this.f9272e = obj3;
    }

    public j8(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f9269a = i10;
        this.f9271c = obj;
        this.d = obj2;
        this.f9270b = i7;
        this.f9272e = obj3;
    }
}
