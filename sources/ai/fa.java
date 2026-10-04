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
import org.telegram.ui.yn;
public final class fa implements RequestDelegate {
    public final int f954a = 0;
    public final long f955b;
    public final Object f956c;
    public final Object d;
    public final Object f957e;
    public final Object f958f;

    public fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.f956c = haVar;
        this.f955b = j3;
        this.d = view;
        this.f957e = caVar;
        this.f958f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f954a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.f956c, tLObject, this.f955b, (View) this.d, (ca) this.f957e, (MessagesController) this.f958f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f956c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f955b, (AtomicBoolean) this.f957e, (AtomicInteger) this.f958f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (yn) this.f956c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f957e, (TLRPC.FileLocation[]) this.f958f, this.f955b));
                return;
        }
    }

    public fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f956c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f955b = j3;
        this.f957e = atomicBoolean;
        this.f958f = atomicInteger;
    }

    public fa(yn ynVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f956c = ynVar;
        this.d = fileLocationArr;
        this.f957e = str;
        this.f958f = fileLocationArr2;
        this.f955b = j3;
    }
}
