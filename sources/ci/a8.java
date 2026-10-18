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
public final class a8 implements RequestDelegate {
    public final int f5153a = 0;
    public final long f5154b;
    public final Object f5155c;
    public final Object d;
    public final Object e;
    public final Object f5156f;

    public a8(b8 b8Var, long j10, View view, x7 x7Var, MessagesController messagesController) {
        this.f5155c = b8Var;
        this.f5154b = j10;
        this.d = view;
        this.e = x7Var;
        this.f5156f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5153a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.a4((b8) this.f5155c, tLObject, this.f5154b, (View) this.d, (x7) this.e, (MessagesController) this.f5156f, 3));
                return;
            case 1:
                ((ConferenceCall) this.f5155c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f5154b, (AtomicBoolean) this.e, (AtomicInteger) this.f5156f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (sn) this.f5155c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f5156f, this.f5154b));
                return;
        }
    }

    public a8(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f5155c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f5154b = j10;
        this.e = atomicBoolean;
        this.f5156f = atomicInteger;
    }

    public a8(sn snVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f5155c = snVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f5156f = fileLocationArr2;
        this.f5154b = j10;
    }
}
