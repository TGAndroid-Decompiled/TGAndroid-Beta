package bg;

import android.view.View;
import fi.h7;
import fi.k7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.an;
public final class g0 implements RequestDelegate {
    public final int f3237a = 1;
    public final long f3238b;
    public final Object f3239c;
    public final Object d;
    public final Object f3240e;
    public final Object f3241f;

    public g0(k7 k7Var, long j3, View view, h7 h7Var, np npVar) {
        this.f3239c = k7Var;
        this.f3238b = j3;
        this.d = view;
        this.f3240e = h7Var;
        this.f3241f = npVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3237a) {
            case 0:
                org.telegram.messenger.g0.h3(new h0(tL_error, (an) this.f3239c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3241f, (TLRPC.FileLocation[]) this.f3240e, this.f3238b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.e((k7) this.f3239c, tLObject, this.f3238b, (View) this.d, (h7) this.f3240e, (np) this.f3241f, 4));
                return;
            default:
                ((ConferenceCall) this.f3239c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3238b, (AtomicBoolean) this.f3240e, (AtomicInteger) this.f3241f, tLObject, tL_error);
                return;
        }
    }

    public g0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3239c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3238b = j3;
        this.f3240e = atomicBoolean;
        this.f3241f = atomicInteger;
    }

    public g0(an anVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3239c = anVar;
        this.d = fileLocationArr;
        this.f3241f = str;
        this.f3240e = fileLocationArr2;
        this.f3238b = j3;
    }
}
