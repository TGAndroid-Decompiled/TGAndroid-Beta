package bi;

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
import org.telegram.ui.co;
public final class m9 implements RequestDelegate {
    public final int f3351a = 0;
    public final long f3352b;
    public final Object f3353c;
    public final Object d;
    public final Object f3354e;
    public final Object f3355f;

    public m9(o9 o9Var, long j3, View view, j9 j9Var, MessagesController messagesController) {
        this.f3353c = o9Var;
        this.f3352b = j3;
        this.d = view;
        this.f3354e = j9Var;
        this.f3355f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3351a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n9((o9) this.f3353c, tLObject, this.f3352b, (View) this.d, (j9) this.f3354e, (MessagesController) this.f3355f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f3353c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3352b, (AtomicBoolean) this.f3354e, (AtomicInteger) this.f3355f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (co) this.f3353c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3354e, (TLRPC.FileLocation[]) this.f3355f, this.f3352b));
                return;
        }
    }

    public m9(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3353c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3352b = j3;
        this.f3354e = atomicBoolean;
        this.f3355f = atomicInteger;
    }

    public m9(co coVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3353c = coVar;
        this.d = fileLocationArr;
        this.f3354e = str;
        this.f3355f = fileLocationArr2;
        this.f3352b = j3;
    }
}
