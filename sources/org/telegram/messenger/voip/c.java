package org.telegram.messenger.voip;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.r00;
import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.un;
import th.t5;
import th.v5;
public final class c implements RequestDelegate {
    public final int f18782a = 0;
    public final long f18783b;
    public final Object f18784c;
    public final Object d;
    public final Object e;
    public final Object f18785f;

    public c(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f18784c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f18783b = j10;
        this.e = atomicBoolean;
        this.f18785f = atomicInteger;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18782a) {
            case 0:
                ((ConferenceCall) this.f18784c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f18783b, (AtomicBoolean) this.e, (AtomicInteger) this.f18785f, tLObject, tL_error);
                return;
            case 1:
                org.telegram.messenger.i0.g3(new f(tL_error, (un) this.f18784c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f18785f, this.f18783b));
                return;
            default:
                org.telegram.messenger.i0.g3(new r00((v5) this.f18784c, tLObject, this.f18783b, (View) this.d, (t5) this.e, (wp) this.f18785f, 7));
                return;
        }
    }

    public c(un unVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f18784c = unVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f18785f = fileLocationArr2;
        this.f18783b = j10;
    }

    public c(v5 v5Var, long j10, View view, t5 t5Var, wp wpVar) {
        this.f18784c = v5Var;
        this.f18783b = j10;
        this.d = view;
        this.e = t5Var;
        this.f18785f = wpVar;
    }
}
