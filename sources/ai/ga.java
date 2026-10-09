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
import org.telegram.ui.zn;
public final class ga implements RequestDelegate {
    public final int f1062a = 0;
    public final long f1063b;
    public final Object f1064c;
    public final Object d;
    public final Object f1065e;
    public final Object f1066f;

    public ga(ia iaVar, long j3, View view, da daVar, MessagesController messagesController) {
        this.f1064c = iaVar;
        this.f1063b = j3;
        this.d = view;
        this.f1065e = daVar;
        this.f1066f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1062a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ha((ia) this.f1064c, tLObject, this.f1063b, (View) this.d, (da) this.f1065e, (MessagesController) this.f1066f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f1064c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f1063b, (AtomicBoolean) this.f1065e, (AtomicInteger) this.f1066f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (zn) this.f1064c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f1065e, (TLRPC.FileLocation[]) this.f1066f, this.f1063b));
                return;
        }
    }

    public ga(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f1064c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f1063b = j3;
        this.f1065e = atomicBoolean;
        this.f1066f = atomicInteger;
    }

    public ga(zn znVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f1064c = znVar;
        this.d = fileLocationArr;
        this.f1065e = str;
        this.f1066f = fileLocationArr2;
        this.f1063b = j3;
    }
}
