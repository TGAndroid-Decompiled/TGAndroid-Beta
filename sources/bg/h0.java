package bg;

import android.view.View;
import di.a3;
import fi.e7;
import fi.h7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.np;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.bn;
public final class h0 implements RequestDelegate {
    public final int f3259a = 1;
    public final long f3260b;
    public final Object f3261c;
    public final Object d;
    public final Object f3262e;
    public final Object f3263f;

    public h0(h7 h7Var, long j3, View view, e7 e7Var, np npVar) {
        this.f3261c = h7Var;
        this.f3260b = j3;
        this.d = view;
        this.f3262e = e7Var;
        this.f3263f = npVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3259a) {
            case 0:
                org.telegram.messenger.g0.g3(new i0(tL_error, (bn) this.f3261c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3263f, (TLRPC.FileLocation[]) this.f3262e, this.f3260b));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((h7) this.f3261c, tLObject, this.f3260b, (View) this.d, (e7) this.f3262e, (np) this.f3263f, 2));
                return;
            default:
                ((ConferenceCall) this.f3261c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3260b, (AtomicBoolean) this.f3262e, (AtomicInteger) this.f3263f, tLObject, tL_error);
                return;
        }
    }

    public h0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3261c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3260b = j3;
        this.f3262e = atomicBoolean;
        this.f3263f = atomicInteger;
    }

    public h0(bn bnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3261c = bnVar;
        this.d = fileLocationArr;
        this.f3263f = str;
        this.f3262e = fileLocationArr2;
        this.f3260b = j3;
    }
}
