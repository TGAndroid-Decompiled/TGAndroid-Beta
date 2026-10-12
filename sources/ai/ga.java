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
import org.telegram.ui.eo;
public final class ga implements RequestDelegate {
    public final int f1060a = 0;
    public final long f1061b;
    public final Object f1062c;
    public final Object d;
    public final Object f1063e;
    public final Object f1064f;

    public ga(ia iaVar, long j3, View view, da daVar, MessagesController messagesController) {
        this.f1062c = iaVar;
        this.f1061b = j3;
        this.d = view;
        this.f1063e = daVar;
        this.f1064f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1060a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ha((ia) this.f1062c, tLObject, this.f1061b, (View) this.d, (da) this.f1063e, (MessagesController) this.f1064f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f1062c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f1061b, (AtomicBoolean) this.f1063e, (AtomicInteger) this.f1064f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (eo) this.f1062c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f1063e, (TLRPC.FileLocation[]) this.f1064f, this.f1061b));
                return;
        }
    }

    public ga(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f1062c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f1061b = j3;
        this.f1063e = atomicBoolean;
        this.f1064f = atomicInteger;
    }

    public ga(eo eoVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f1062c = eoVar;
        this.d = fileLocationArr;
        this.f1063e = str;
        this.f1064f = fileLocationArr2;
        this.f1061b = j3;
    }
}
