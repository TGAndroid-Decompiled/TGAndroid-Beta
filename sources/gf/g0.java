package gf;

import android.view.View;
import hh.p2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jh.h7;
import jh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.rn;

public final class g0 implements RequestDelegate {

    public final int f6971a = 1;

    public final long f6972b;

    public final Object f6973c;
    public final Object d;

    public final Object f6974e;

    public final Object f6975f;

    public g0(k7 k7Var, long j10, View view, h7 h7Var, MessagesController messagesController) {
        this.f6973c = k7Var;
        this.f6972b = j10;
        this.d = view;
        this.f6974e = h7Var;
        this.f6975f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6971a) {
            case 0:
                AndroidUtilities.runOnUIThread(new h0(tL_error, (rn) this.f6973c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f6975f, (TLRPC.FileLocation[]) this.f6974e, this.f6972b));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new p2((k7) this.f6973c, tLObject, this.f6972b, (View) this.d, (h7) this.f6974e, (MessagesController) this.f6975f, 3));
                break;
            default:
                ((ConferenceCall) this.f6973c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f6972b, (AtomicBoolean) this.f6974e, (AtomicInteger) this.f6975f, tLObject, tL_error);
                break;
        }
    }

    public g0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f6973c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f6972b = j10;
        this.f6974e = atomicBoolean;
        this.f6975f = atomicInteger;
    }

    public g0(rn rnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f6973c = rnVar;
        this.d = fileLocationArr;
        this.f6975f = str;
        this.f6974e = fileLocationArr2;
        this.f6972b = j10;
    }
}
