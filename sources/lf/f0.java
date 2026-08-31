package lf;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import mh.n2;
import oh.i7;
import oh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.xn;
public final class f0 implements RequestDelegate {
    public final int f12421a = 1;
    public final long f12422b;
    public final Object f12423c;
    public final Object d;
    public final Object f12424e;
    public final Object f12425f;

    public f0(l7 l7Var, long j10, View view, i7 i7Var, MessagesController messagesController) {
        this.f12423c = l7Var;
        this.f12422b = j10;
        this.d = view;
        this.f12424e = i7Var;
        this.f12425f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12421a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (xn) this.f12423c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f12425f, (TLRPC.FileLocation[]) this.f12424e, this.f12422b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n2((l7) this.f12423c, tLObject, this.f12422b, (View) this.d, (i7) this.f12424e, (MessagesController) this.f12425f, 3));
                return;
            default:
                ((ConferenceCall) this.f12423c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f12422b, (AtomicBoolean) this.f12424e, (AtomicInteger) this.f12425f, tLObject, tL_error);
                return;
        }
    }

    public f0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f12423c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f12422b = j10;
        this.f12424e = atomicBoolean;
        this.f12425f = atomicInteger;
    }

    public f0(xn xnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f12423c = xnVar;
        this.d = fileLocationArr;
        this.f12425f = str;
        this.f12424e = fileLocationArr2;
        this.f12422b = j10;
    }
}
