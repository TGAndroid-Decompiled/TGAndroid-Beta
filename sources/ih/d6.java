package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d6 implements RequestDelegate {
    public final long f11327a;
    public final d5.d f11328b;
    public final v6 f11329c;

    public d6(v6 v6Var, long j10, d5.d dVar) {
        this.f11329c = v6Var;
        this.f11327a = j10;
        this.f11328b = dVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new gh.e2(this, tLObject, this.f11327a, this.f11328b, 10));
    }
}
