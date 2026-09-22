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
    public final int f882a = 0;
    public final long f883b;
    public final Object f884c;
    public final Object d;
    public final Object e;
    public final Object f885f;

    public fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.f884c = haVar;
        this.f883b = j3;
        this.d = view;
        this.e = caVar;
        this.f885f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f882a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.f884c, tLObject, this.f883b, (View) this.d, (ca) this.e, (MessagesController) this.f885f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f884c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f883b, (AtomicBoolean) this.e, (AtomicInteger) this.f885f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (bo) this.f884c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f885f, this.f883b));
                return;
        }
    }

    public fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f884c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f883b = j3;
        this.e = atomicBoolean;
        this.f885f = atomicInteger;
    }

    public fa(bo boVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f884c = boVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f885f = fileLocationArr2;
        this.f883b = j3;
    }
}
