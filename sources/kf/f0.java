package kf;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import lh.o2;
import nh.i7;
import nh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.zn;
public final class f0 implements RequestDelegate {
    public final int f10421a = 1;
    public final long f10422b;
    public final Object f10423c;
    public final Object d;
    public final Object e;
    public final Object f10424f;

    public f0(l7 l7Var, long j10, View view, i7 i7Var, MessagesController messagesController) {
        this.f10423c = l7Var;
        this.f10422b = j10;
        this.d = view;
        this.e = i7Var;
        this.f10424f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10421a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (zn) this.f10423c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f10424f, (TLRPC.FileLocation[]) this.e, this.f10422b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o2((l7) this.f10423c, tLObject, this.f10422b, (View) this.d, (i7) this.e, (MessagesController) this.f10424f, 3));
                return;
            default:
                ((ConferenceCall) this.f10423c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f10422b, (AtomicBoolean) this.e, (AtomicInteger) this.f10424f, tLObject, tL_error);
                return;
        }
    }

    public f0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f10423c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f10422b = j10;
        this.e = atomicBoolean;
        this.f10424f = atomicInteger;
    }

    public f0(zn znVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f10423c = znVar;
        this.d = fileLocationArr;
        this.f10424f = str;
        this.e = fileLocationArr2;
        this.f10422b = j10;
    }
}
