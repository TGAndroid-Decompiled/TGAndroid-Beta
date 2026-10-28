package ag;

import android.view.View;
import bi.m3;
import di.w7;
import di.z7;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.wn;
public final class l0 implements RequestDelegate {
    public final int f1335a = 1;
    public final long f1336b;
    public final Object f1337c;
    public final Object d;
    public final Object e;
    public final Object f1338f;

    public l0(z7 z7Var, long j10, View view, w7 w7Var, MessagesController messagesController) {
        this.f1337c = z7Var;
        this.f1336b = j10;
        this.d = view;
        this.e = w7Var;
        this.f1338f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1335a) {
            case 0:
                AndroidUtilities.runOnUIThread(new m0(tL_error, (wn) this.f1337c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f1338f, (TLRPC.FileLocation[]) this.e, this.f1336b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new m3((z7) this.f1337c, tLObject, this.f1336b, (View) this.d, (w7) this.e, (MessagesController) this.f1338f, 3));
                return;
            default:
                ((ConferenceCall) this.f1337c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f1336b, (AtomicBoolean) this.e, (AtomicInteger) this.f1338f, tLObject, tL_error);
                return;
        }
    }

    public l0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f1337c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f1336b = j10;
        this.e = atomicBoolean;
        this.f1338f = atomicInteger;
    }

    public l0(wn wnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f1337c = wnVar;
        this.d = fileLocationArr;
        this.f1338f = str;
        this.e = fileLocationArr2;
        this.f1336b = j10;
    }
}
