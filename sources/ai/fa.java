package ai;

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
import org.telegram.ui.xn;
public final class fa implements RequestDelegate {
    public final int f883a = 0;
    public final long f884b;
    public final Object f885c;
    public final Object d;
    public final Object e;
    public final Object f886f;

    public fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.f885c = haVar;
        this.f884b = j3;
        this.d = view;
        this.e = caVar;
        this.f886f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f883a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.f885c, tLObject, this.f884b, (View) this.d, (ca) this.e, (MessagesController) this.f886f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f885c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f884b, (AtomicBoolean) this.e, (AtomicInteger) this.f886f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (xn) this.f885c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f886f, this.f884b));
                return;
        }
    }

    public fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f885c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f884b = j3;
        this.e = atomicBoolean;
        this.f886f = atomicInteger;
    }

    public fa(xn xnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f885c = xnVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f886f = fileLocationArr2;
        this.f884b = j3;
    }
}
