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
    public final int f3240a = 1;
    public final long f3241b;
    public final Object f3242c;
    public final Object d;
    public final Object f3243e;
    public final Object f3244f;

    public g0(k7 k7Var, long j3, View view, h7 h7Var, np npVar) {
        this.f3242c = k7Var;
        this.f3241b = j3;
        this.d = view;
        this.f3243e = h7Var;
        this.f3244f = npVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3240a) {
            case 0:
                org.telegram.messenger.g0.h3(new h0(tL_error, (an) this.f3242c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3244f, (TLRPC.FileLocation[]) this.f3243e, this.f3241b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ai.e((k7) this.f3242c, tLObject, this.f3241b, (View) this.d, (h7) this.f3243e, (np) this.f3244f, 4));
                return;
            default:
                ((ConferenceCall) this.f3242c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3241b, (AtomicBoolean) this.f3243e, (AtomicInteger) this.f3244f, tLObject, tL_error);
                return;
        }
    }

    public g0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3242c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3241b = j3;
        this.f3243e = atomicBoolean;
        this.f3244f = atomicInteger;
    }

    public g0(an anVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3242c = anVar;
        this.d = fileLocationArr;
        this.f3244f = str;
        this.f3243e = fileLocationArr2;
        this.f3241b = j3;
    }
}
