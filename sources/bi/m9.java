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
    public final int f3324a = 0;
    public final long f3325b;
    public final Object f3326c;
    public final Object d;
    public final Object f3327e;
    public final Object f3328f;

    public m9(o9 o9Var, long j3, View view, j9 j9Var, MessagesController messagesController) {
        this.f3326c = o9Var;
        this.f3325b = j3;
        this.d = view;
        this.f3327e = j9Var;
        this.f3328f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3324a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n9((o9) this.f3326c, tLObject, this.f3325b, (View) this.d, (j9) this.f3327e, (MessagesController) this.f3328f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f3326c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3325b, (AtomicBoolean) this.f3327e, (AtomicInteger) this.f3328f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (co) this.f3326c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f3327e, (TLRPC.FileLocation[]) this.f3328f, this.f3325b));
                return;
        }
    }

    public m9(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3326c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3325b = j3;
        this.f3327e = atomicBoolean;
        this.f3328f = atomicInteger;
    }

    public m9(co coVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f3326c = coVar;
        this.d = fileLocationArr;
        this.f3327e = str;
        this.f3328f = fileLocationArr2;
        this.f3325b = j3;
    }
}
