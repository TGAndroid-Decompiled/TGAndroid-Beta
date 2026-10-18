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
import org.telegram.ui.sn;
public final class b8 implements RequestDelegate {
    public final int f5257a = 0;
    public final long f5258b;
    public final Object f5259c;
    public final Object d;
    public final Object e;
    public final Object f5260f;

    public b8(c8 c8Var, long j10, View view, y7 y7Var, MessagesController messagesController) {
        this.f5259c = c8Var;
        this.f5258b = j10;
        this.d = view;
        this.e = y7Var;
        this.f5260f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5257a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.z3((c8) this.f5259c, tLObject, this.f5258b, (View) this.d, (y7) this.e, (MessagesController) this.f5260f, 3));
                return;
            case 1:
                ((ConferenceCall) this.f5259c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f5258b, (AtomicBoolean) this.e, (AtomicInteger) this.f5260f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (sn) this.f5259c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f5260f, this.f5258b));
                return;
        }
    }

    public b8(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f5259c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f5258b = j10;
        this.e = atomicBoolean;
        this.f5260f = atomicInteger;
    }

    public b8(sn snVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f5259c = snVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f5260f = fileLocationArr2;
        this.f5258b = j10;
    }
}
