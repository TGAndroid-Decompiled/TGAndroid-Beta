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
import org.telegram.ui.bo;
public final class fa implements RequestDelegate {
    public final int f880a = 0;
    public final long f881b;
    public final Object f882c;
    public final Object d;
    public final Object e;
    public final Object f883f;

    public fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.f882c = haVar;
        this.f881b = j3;
        this.d = view;
        this.e = caVar;
        this.f883f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f880a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.f882c, tLObject, this.f881b, (View) this.d, (ca) this.e, (MessagesController) this.f883f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f882c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f881b, (AtomicBoolean) this.e, (AtomicInteger) this.f883f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (bo) this.f882c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f883f, this.f881b));
                return;
        }
    }

    public fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f882c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f881b = j3;
        this.e = atomicBoolean;
        this.f883f = atomicInteger;
    }

    public fa(bo boVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f882c = boVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f883f = fileLocationArr2;
        this.f881b = j3;
    }
}
