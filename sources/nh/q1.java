package nh;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.de;
import org.telegram.ui.tn;
import org.telegram.ui.tt;
import org.telegram.ui.vo;
import org.telegram.ui.zf;
public final class q1 implements RequestDelegate {
    public final int f18391a;
    public final boolean f18392b;
    public final Object f18393c;
    public final Object d;
    public final Object f18394e;

    public q1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f18391a = i10;
        this.f18393c = obj;
        this.d = obj2;
        this.f18394e = obj3;
        this.f18392b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18391a) {
            case 0:
                AndroidUtilities.runOnUIThread(new eg.j((Object) ((r1) this.f18393c), tLObject, this.f18392b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f18394e, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new j3.p1((de) this.f18393c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f18394e, this.f18392b, tLObject, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new eg.j((Object) ((tn) this.f18393c), (Object) ((ye.c) this.d), (Object) tLObject, (Object) ((zf) this.f18394e), this.f18392b, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new j3.p1((vo) this.f18393c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f18394e, this.f18392b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new eg.j((my) this.f18393c, (String) this.f18394e, this.f18392b, (String) this.d, tLObject, 16));
                return;
            default:
                AndroidUtilities.runOnUIThread(new j3.p1((tt) this.f18393c, tLObject, (d) this.d, this.f18392b, (HashSet) this.f18394e, tL_error, 11));
                return;
        }
    }

    public q1(r1 r1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f18391a = 0;
        this.f18393c = r1Var;
        this.f18392b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f18394e = str;
    }

    public q1(my myVar, String str, boolean z10, String str2) {
        this.f18391a = 4;
        this.f18393c = myVar;
        this.f18394e = str;
        this.f18392b = z10;
        this.d = str2;
    }

    public q1(tt ttVar, d dVar, boolean z10, HashSet hashSet) {
        this.f18391a = 5;
        this.f18393c = ttVar;
        this.d = dVar;
        this.f18392b = z10;
        this.f18394e = hashSet;
    }
}
