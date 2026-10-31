package org.telegram.messenger.voip;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.q00;
import org.telegram.messenger.vp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.un;
import th.t5;
import th.v5;
public final class c implements RequestDelegate {
    public final int f18622a = 0;
    public final long f18623b;
    public final Object f18624c;
    public final Object d;
    public final Object e;
    public final Object f18625f;

    public c(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f18624c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f18623b = j10;
        this.e = atomicBoolean;
        this.f18625f = atomicInteger;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18622a) {
            case 0:
                ((ConferenceCall) this.f18624c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f18623b, (AtomicBoolean) this.e, (AtomicInteger) this.f18625f, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.i0.g3(new f(tL_error, (un) this.f18624c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f18625f, this.f18623b));
                return;
            default:
                org.telegram.messenger.i0.g3(new q00((v5) this.f18624c, tLObject, this.f18623b, (View) this.d, (t5) this.e, (vp) this.f18625f, 7));
                return;
        }
    }

    public c(un unVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f18624c = unVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f18625f = fileLocationArr2;
        this.f18623b = j10;
    }

    public c(v5 v5Var, long j10, View view, t5 t5Var, vp vpVar) {
        this.f18624c = v5Var;
        this.f18623b = j10;
        this.d = view;
        this.e = t5Var;
        this.f18625f = vpVar;
    }
}
