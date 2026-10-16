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
import org.telegram.ui.fo;
public final class p9 implements RequestDelegate {
    public final int f3480a = 0;
    public final long f3481b;
    public final Object f3482c;
    public final Object d;
    public final Object e;
    public final Object f3483f;

    public p9(r9 r9Var, long j10, View view, m9 m9Var, MessagesController messagesController) {
        this.f3482c = r9Var;
        this.f3481b = j10;
        this.d = view;
        this.e = m9Var;
        this.f3483f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f3480a) {
            case 0:
                AndroidUtilities.runOnUIThread(new q9((r9) this.f3482c, tLObject, this.f3481b, (View) this.d, (m9) this.e, (MessagesController) this.f3483f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f3482c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f3481b, (AtomicBoolean) this.e, (AtomicInteger) this.f3483f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (fo) this.f3482c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f3483f, this.f3481b));
                return;
        }
    }

    public p9(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f3482c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f3481b = j10;
        this.e = atomicBoolean;
        this.f3483f = atomicInteger;
    }

    public p9(fo foVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f3482c = foVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f3483f = fileLocationArr2;
        this.f3481b = j10;
    }
}
