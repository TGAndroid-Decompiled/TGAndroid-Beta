package bg;

import android.view.View;
import di.a3;
import fi.e7;
import fi.h7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.bn;
public final class h0 implements RequestDelegate {
    public final int f3239a = 1;
    public final long f3240b;
    public final Object f3241c;
    public final Object d;
    public final Object f3242e;
    public final Object f3243f;

    public h0(h7 h7Var, long j3, View view, e7 e7Var, mp mpVar) {
        this.f3241c = h7Var;
        this.f3240b = j3;
        this.d = view;
        this.f3242e = e7Var;
        this.f3243f = mpVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3239a) {
            case 0:
                org.telegram.messenger.g0.g3(new i0(tL_error, (bn) this.f3241c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3243f, (TLRPC.FileLocation[]) this.f3242e, this.f3240b));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new a3((h7) this.f3241c, tLObject, this.f3240b, (View) this.d, (e7) this.f3242e, (mp) this.f3243f, 2));
                return;
            default:
                ((ConferenceCall) this.f3241c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3240b, (AtomicBoolean) this.f3242e, (AtomicInteger) this.f3243f, tLObject, tL_error);
                return;
        }
    }

    public h0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3241c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3240b = j3;
        this.f3242e = atomicBoolean;
        this.f3243f = atomicInteger;
    }

    public h0(bn bnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3241c = bnVar;
        this.d = fileLocationArr;
        this.f3243f = str;
        this.f3242e = fileLocationArr2;
        this.f3240b = j3;
    }
}
