package ci;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.qn;
public final class b8 implements RequestDelegate {
    public final int f5254a = 0;
    public final long f5255b;
    public final Object f5256c;
    public final Object d;
    public final Object e;
    public final Object f5257f;

    public b8(c8 c8Var, long j10, View view, y7 y7Var, MessagesController messagesController) {
        this.f5256c = c8Var;
        this.f5255b = j10;
        this.d = view;
        this.e = y7Var;
        this.f5257f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5254a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.q3((c8) this.f5256c, tLObject, this.f5255b, (View) this.d, (y7) this.e, (MessagesController) this.f5257f, 3));
                return;
            case 1:
                ((ConferenceCall) this.f5256c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f5255b, (AtomicBoolean) this.e, (AtomicInteger) this.f5257f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (qn) this.f5256c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f5257f, this.f5255b));
                return;
        }
    }

    public b8(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f5256c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f5255b = j10;
        this.e = atomicBoolean;
        this.f5257f = atomicInteger;
    }

    public b8(qn qnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f5256c = qnVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f5257f = fileLocationArr2;
        this.f5255b = j10;
    }
}
