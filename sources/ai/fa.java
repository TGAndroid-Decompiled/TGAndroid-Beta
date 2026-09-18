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
public final class fa implements RequestDelegate {
    public final int f885a = 0;
    public final long f886b;
    public final Object f887c;
    public final Object d;
    public final Object e;
    public final Object f888f;

    public fa(ha haVar, long j3, View view, ca caVar, MessagesController messagesController) {
        this.f887c = haVar;
        this.f886b = j3;
        this.d = view;
        this.e = caVar;
        this.f888f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f885a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ga((ha) this.f887c, tLObject, this.f886b, (View) this.d, (ca) this.e, (MessagesController) this.f888f, 0));
                return;
            case 1:
                ((ConferenceCall) this.f887c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f886b, (AtomicBoolean) this.e, (AtomicInteger) this.f888f, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tL_error, (zn) this.f887c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.e, (TLRPC.FileLocation[]) this.f888f, this.f886b));
                return;
        }
    }

    public fa(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j3, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f887c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f886b = j3;
        this.e = atomicBoolean;
        this.f888f = atomicInteger;
    }

    public fa(zn znVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j3) {
        this.f887c = znVar;
        this.d = fileLocationArr;
        this.e = str;
        this.f888f = fileLocationArr2;
        this.f886b = j3;
    }
}
