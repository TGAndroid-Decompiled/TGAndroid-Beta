package ff;

import android.view.View;
import gh.p2;
import ih.l7;
import ih.o7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.qn;
public final class g0 implements RequestDelegate {
    public final int f6171a = 1;
    public final long f6172b;
    public final Object f6173c;
    public final Object d;
    public final Object f6174e;
    public final Object f6175f;

    public g0(o7 o7Var, long j10, View view, l7 l7Var, MessagesController messagesController) {
        this.f6173c = o7Var;
        this.f6172b = j10;
        this.d = view;
        this.f6174e = l7Var;
        this.f6175f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6171a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0(tL_error, (qn) this.f6173c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f6175f, (TLRPC.FileLocation[]) this.f6174e, this.f6172b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2((o7) this.f6173c, tLObject, this.f6172b, (View) this.d, (l7) this.f6174e, (MessagesController) this.f6175f, 3));
                return;
            default:
                ((ConferenceCall) this.f6173c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f6172b, (AtomicBoolean) this.f6174e, (AtomicInteger) this.f6175f, tLObject, tL_error);
                return;
        }
    }

    public g0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f6173c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f6172b = j10;
        this.f6174e = atomicBoolean;
        this.f6175f = atomicInteger;
    }

    public g0(qn qnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f6173c = qnVar;
        this.d = fileLocationArr;
        this.f6175f = str;
        this.f6174e = fileLocationArr2;
        this.f6172b = j10;
    }
}
