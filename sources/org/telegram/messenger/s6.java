package org.telegram.messenger;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class s6 implements RequestDelegate {
    public final int f17874a;
    public final boolean f17875b;
    public final Object f17876c;
    public final Object d;
    public final Object e;

    public s6(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f17874a = i10;
        this.f17876c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17875b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17874a) {
            case 0:
                i0.g3(new rn((a7) this.f17876c, tLObject, (TLRPC.TL_textWithEntities) this.d, this.f17875b, (org.telegram.ui.ActionBar.x1) this.e, 2));
                return;
            case 1:
                i0.g3(new i2.h1((org.telegram.ui.le) this.f17876c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.e, this.f17875b, tLObject, 2));
                return;
            case 2:
                i0.g3(new ag.n0((org.telegram.ui.un) this.f17876c, (gf.e) this.d, tLObject, (org.telegram.ui.af) this.e, this.f17875b, 6));
                return;
            case 3:
                i0.g3(new i2.h1((org.telegram.ui.zo) this.f17876c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.e, this.f17875b, tL_error, 5));
                return;
            case 4:
                i0.g3(new ag.n0((org.telegram.ui.Components.dy) this.f17876c, (String) this.d, this.f17875b, (String) this.e, tLObject, 9));
                return;
            case 5:
                i0.g3(new i2.h1((org.telegram.ui.ut) this.f17876c, tLObject, (vh.d) this.d, this.f17875b, (HashSet) this.e, tL_error, 7));
                return;
            case 6:
                i0.g3(new i2.h1((rh.e4) this.f17876c, tL_error, (q20) this.d, (TwoStepVerificationActivity) this.e, this.f17875b, tLObject, 9));
                return;
            default:
                i0.g3(new ag.n0((vh.e1) this.f17876c, tLObject, this.f17875b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.e, 15));
                return;
        }
    }

    public s6(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f17874a = i10;
        this.f17876c = obj;
        this.d = obj2;
        this.f17875b = z10;
        this.e = obj3;
    }

    public s6(vh.e1 e1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f17874a = 7;
        this.f17876c = e1Var;
        this.f17875b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.e = str;
    }
}
