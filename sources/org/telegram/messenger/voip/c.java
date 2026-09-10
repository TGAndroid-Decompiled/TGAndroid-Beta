package org.telegram.messenger.voip;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.eo;
import zh.x5;
import zh.z5;
public final class c implements RequestDelegate {
    public final int f16697a = 0;
    public final long f16698b;
    public final Object f16699c;
    public final Object d;
    public final Object e;
    public final Object f16700f;

    public c(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f16699c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f16698b = j3;
        this.e = atomicBoolean;
        this.f16700f = atomicInteger;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16697a) {
            case 0:
                ((ConferenceCall) this.f16699c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f16698b, (AtomicBoolean) this.e, (AtomicInteger) this.f16700f, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new f(tL_error, (eo) this.f16699c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f16700f, this.f16698b));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.c((z5) this.f16699c, tLObject, this.f16698b, (View) this.d, (x5) this.e, (MessagesController) this.f16700f));
                return;
        }
    }

    public c(eo eoVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f16699c = eoVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f16700f = fileLocationArr2;
        this.f16698b = j3;
    }

    public c(z5 z5Var, long j3, View view, x5 x5Var, MessagesController messagesController) {
        this.f16699c = z5Var;
        this.f16698b = j3;
        this.d = view;
        this.e = x5Var;
        this.f16700f = messagesController;
    }
}
