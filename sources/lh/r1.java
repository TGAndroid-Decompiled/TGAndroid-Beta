package lh;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fe;
import org.telegram.ui.uo;
import org.telegram.ui.vt;

public final class r1 implements RequestDelegate {

    public final int f16622a;

    public final boolean f16623b;

    public final Object f16624c;
    public final Object d;

    public final Object f16625e;

    public r1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f16622a = i10;
        this.f16624c = obj;
        this.d = obj2;
        this.f16625e = obj3;
        this.f16623b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16622a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.j(this.f16624c, tLObject, this.f16623b, (TLObject) this.d, (String) this.f16625e, 1));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new h3.p1((fe) this.f16624c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f16625e, this.f16623b, tLObject, 7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.j(this.f16624c, this.d, (Object) tLObject, this.f16625e, this.f16623b, 13));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new h3.p1((uo) this.f16624c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f16625e, this.f16623b, tL_error, 9));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new cg.j((fy) this.f16624c, (String) this.f16625e, this.f16623b, (String) this.d, tLObject, 16));
                break;
            default:
                AndroidUtilities.runOnUIThread(new h3.p1((vt) this.f16624c, tLObject, (d) this.d, this.f16623b, (HashSet) this.f16625e, tL_error, 11));
                break;
        }
    }

    public r1(s1 s1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f16622a = 0;
        this.f16624c = s1Var;
        this.f16623b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f16625e = str;
    }

    public r1(fy fyVar, String str, boolean z10, String str2) {
        this.f16622a = 4;
        this.f16624c = fyVar;
        this.f16625e = str;
        this.f16623b = z10;
        this.d = str2;
    }

    public r1(vt vtVar, d dVar, boolean z10, HashSet hashSet) {
        this.f16622a = 5;
        this.f16624c = vtVar;
        this.d = dVar;
        this.f16623b = z10;
        this.f16625e = hashSet;
    }
}
