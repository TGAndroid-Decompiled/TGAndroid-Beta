package kh;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ey;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bg;
import org.telegram.ui.fe;
import org.telegram.ui.qn;
import org.telegram.ui.so;
import org.telegram.ui.st;
public final class t1 implements RequestDelegate {
    public final int f16078a;
    public final boolean f16079b;
    public final Object f16080c;
    public final Object d;
    public final Object f16081e;

    public t1(Object obj, Object obj2, Object obj3, boolean z10, int i9) {
        this.f16078a = i9;
        this.f16080c = obj;
        this.d = obj2;
        this.f16081e = obj3;
        this.f16079b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16078a) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.m((Object) ((u1) this.f16080c), tLObject, this.f16079b, (TLObject) ((TLRPC.TL_messages_getInlineBotResults) this.d), (String) this.f16081e, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new h3.p1((fe) this.f16080c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f16081e, this.f16079b, tLObject, 7));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new bg.m((Object) ((qn) this.f16080c), (Object) ((ve.d) this.d), (Object) tLObject, (Object) ((bg) this.f16081e), this.f16079b, 13));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new h3.p1((so) this.f16080c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f16081e, this.f16079b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new bg.m((ey) this.f16080c, (String) this.f16081e, this.f16079b, (String) this.d, tLObject, 16));
                return;
            default:
                AndroidUtilities.runOnUIThread(new h3.p1((st) this.f16080c, tLObject, (d) this.d, this.f16079b, (HashSet) this.f16081e, tL_error, 11));
                return;
        }
    }

    public t1(u1 u1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f16078a = 0;
        this.f16080c = u1Var;
        this.f16079b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f16081e = str;
    }

    public t1(ey eyVar, String str, boolean z10, String str2) {
        this.f16078a = 4;
        this.f16080c = eyVar;
        this.f16081e = str;
        this.f16079b = z10;
        this.d = str2;
    }

    public t1(st stVar, d dVar, boolean z10, HashSet hashSet) {
        this.f16078a = 5;
        this.f16080c = stVar;
        this.d = dVar;
        this.f16079b = z10;
        this.f16081e = hashSet;
    }
}
