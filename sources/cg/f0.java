package cg;

import android.view.View;
import ci.z2;
import ei.o7;
import ei.r7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.hp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.wm;
public final class f0 implements RequestDelegate {
    public final int f4647a = 1;
    public final long f4648b;
    public final Object f4649c;
    public final Object d;
    public final Object f4650e;
    public final Object f4651f;

    public f0(r7 r7Var, long j10, View view, o7 o7Var, hp hpVar) {
        this.f4649c = r7Var;
        this.f4648b = j10;
        this.d = view;
        this.f4650e = o7Var;
        this.f4651f = hpVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4647a) {
            case 0:
                org.telegram.messenger.g0.h3(new g0(tL_error, (wm) this.f4649c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f4651f, (TLRPC.FileLocation[]) this.f4650e, this.f4648b));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new z2((r7) this.f4649c, tLObject, this.f4648b, (View) this.d, (o7) this.f4650e, (hp) this.f4651f, 3));
                return;
            default:
                ((ConferenceCall) this.f4649c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f4648b, (AtomicBoolean) this.f4650e, (AtomicInteger) this.f4651f, tLObject, tL_error);
                return;
        }
    }

    public f0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f4649c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f4648b = j10;
        this.f4650e = atomicBoolean;
        this.f4651f = atomicInteger;
    }

    public f0(wm wmVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f4649c = wmVar;
        this.d = fileLocationArr;
        this.f4651f = str;
        this.f4650e = fileLocationArr2;
        this.f4648b = j10;
    }
}
