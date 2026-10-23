package ci;

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
import org.telegram.ui.sn;
public final class a8 implements RequestDelegate {
    public final int f5155a = 0;
    public final long f5156b;
    public final Object f5157c;
    public final Object d;
    public final Object e;
    public final Object f5158f;

    public a8(b8 b8Var, long j10, View view, x7 x7Var, MessagesController messagesController) {
        this.f5157c = b8Var;
        this.f5156b = j10;
        this.d = view;
        this.e = x7Var;
        this.f5158f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5155a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ai.q3((b8) this.f5157c, tLObject, this.f5156b, (View) this.d, (x7) this.e, (MessagesController) this.f5158f, 3));
                return;
            case 1:
                ((ConferenceCall) this.f5157c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f5156b, (AtomicBoolean) this.e, (AtomicInteger) this.f5158f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (sn) this.f5157c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f5158f, this.f5156b));
                return;
        }
    }

    public a8(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f5157c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f5156b = j10;
        this.e = atomicBoolean;
        this.f5158f = atomicInteger;
    }

    public a8(sn snVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f5157c = snVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f5158f = fileLocationArr2;
        this.f5156b = j10;
    }
}
