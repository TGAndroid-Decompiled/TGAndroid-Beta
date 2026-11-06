package bg;

import android.view.View;
import bi.m3;
import di.n7;
import di.q7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.qp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.an;
public final class g0 implements RequestDelegate {
    public final int f3282a = 1;
    public final long f3283b;
    public final Object f3284c;
    public final Object d;
    public final Object f3285e;
    public final Object f3286f;

    public g0(q7 q7Var, long j3, View view, n7 n7Var, qp qpVar) {
        this.f3284c = q7Var;
        this.f3283b = j3;
        this.d = view;
        this.f3285e = n7Var;
        this.f3286f = qpVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3282a) {
            case 0:
                org.telegram.messenger.g0.h3(new h0(tL_error, (an) this.f3284c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3286f, (TLRPC.FileLocation[]) this.f3285e, this.f3283b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new m3((q7) this.f3284c, tLObject, this.f3283b, (View) this.d, (n7) this.f3285e, (qp) this.f3286f, 3));
                return;
            default:
                ((ConferenceCall) this.f3284c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3283b, (AtomicBoolean) this.f3285e, (AtomicInteger) this.f3286f, tLObject, tL_error);
                return;
        }
    }

    public g0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3284c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3283b = j3;
        this.f3285e = atomicBoolean;
        this.f3286f = atomicInteger;
    }

    public g0(an anVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3284c = anVar;
        this.d = fileLocationArr;
        this.f3286f = str;
        this.f3285e = fileLocationArr2;
        this.f3283b = j3;
    }
}
