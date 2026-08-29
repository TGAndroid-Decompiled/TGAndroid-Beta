package jf;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jh.n2;
import lh.h7;
import lh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.tn;
public final class f0 implements RequestDelegate {
    public final int f11585a = 1;
    public final long f11586b;
    public final Object f11587c;
    public final Object d;
    public final Object f11588e;
    public final Object f11589f;

    public f0(k7 k7Var, long j10, View view, h7 h7Var, MessagesController messagesController) {
        this.f11587c = k7Var;
        this.f11586b = j10;
        this.d = view;
        this.f11588e = h7Var;
        this.f11589f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11585a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (tn) this.f11587c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f11589f, (TLRPC.FileLocation[]) this.f11588e, this.f11586b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n2((k7) this.f11587c, tLObject, this.f11586b, (View) this.d, (h7) this.f11588e, (MessagesController) this.f11589f, 3));
                return;
            default:
                ((ConferenceCall) this.f11587c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f11586b, (AtomicBoolean) this.f11588e, (AtomicInteger) this.f11589f, tLObject, tL_error);
                return;
        }
    }

    public f0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f11587c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f11586b = j10;
        this.f11588e = atomicBoolean;
        this.f11589f = atomicInteger;
    }

    public f0(tn tnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f11587c = tnVar;
        this.d = fileLocationArr;
        this.f11589f = str;
        this.f11588e = fileLocationArr2;
        this.f11586b = j10;
    }
}
