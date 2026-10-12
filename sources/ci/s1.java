package ci;

import android.app.Activity;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kz;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
import org.telegram.ui.eu;
import org.telegram.ui.hf;
import org.telegram.ui.ip;
import org.telegram.ui.oe;
public final class s1 implements RequestDelegate {
    public final int f5929a;
    public final boolean f5930b;
    public final Object f5931c;
    public final Object d;
    public final Object f5932e;

    public s1(v1 v1Var, boolean z10, TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults, String str) {
        this.f5929a = 0;
        this.f5931c = v1Var;
        this.f5930b = z10;
        this.d = tL_messages_getInlineBotResults;
        this.f5932e = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5929a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1((v1) this.f5931c, tLObject, this.f5930b, (TLRPC.TL_messages_getInlineBotResults) this.d, (String) this.f5932e, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new i2.c1((oe) this.f5931c, tL_error, (TwoStepVerificationActivity) this.d, (Activity) this.f5932e, this.f5930b, tLObject, 6));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new t1((Object) ((eo) this.f5931c), (Object) ((of.e) this.d), tLObject, (Object) ((hf) this.f5932e), this.f5930b, 14));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new i2.c1((ip) this.f5931c, (TLRPC.TL_channels_toggleUsername) this.d, tLObject, (TLRPC.TL_username) this.f5932e, this.f5930b, tL_error, 9));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new t1((kz) this.f5931c, (String) this.f5932e, this.f5930b, (String) this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new i2.c1((eu) this.f5931c, tLObject, (d) this.d, this.f5930b, (HashSet) this.f5932e, tL_error, 11));
                return;
        }
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, int i10) {
        this.f5929a = i10;
        this.f5931c = obj;
        this.d = obj2;
        this.f5932e = obj3;
        this.f5930b = z10;
    }

    public s1(kz kzVar, String str, boolean z10, String str2) {
        this.f5929a = 4;
        this.f5931c = kzVar;
        this.f5932e = str;
        this.f5930b = z10;
        this.d = str2;
    }

    public s1(eu euVar, d dVar, boolean z10, HashSet hashSet) {
        this.f5929a = 5;
        this.f5931c = euVar;
        this.d = dVar;
        this.f5930b = z10;
        this.f5932e = hashSet;
    }
}
