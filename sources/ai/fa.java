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
import org.telegram.ui.xn;
public final class fa implements RequestDelegate {
    public final int f886a = 0;
    public final long f887b;
    public final Object f888c;
    public final Object d;
    public final Object e;
    public final Object f889f;

    public fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.f888c = haVar;
        this.f887b = j3;
        this.d = view;
        this.e = caVar;
        this.f889f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f886a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.f888c, tLObject, this.f887b, (View) this.d, (ca) this.e, (MessagesController) this.f889f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f888c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f887b, (AtomicBoolean) this.e, (AtomicInteger) this.f889f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (xn) this.f888c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f889f, this.f887b));
                return;
        }
    }

    public fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f888c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f887b = j3;
        this.e = atomicBoolean;
        this.f889f = atomicInteger;
    }

    public fa(xn xnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f888c = xnVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f889f = fileLocationArr2;
        this.f887b = j3;
    }
}
