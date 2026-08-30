package lf;

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
import org.telegram.ui.xn;
public final class f0 implements RequestDelegate {
    public final int f11979a = 1;
    public final long f11980b;
    public final Object f11981c;
    public final Object d;
    public final Object e;
    public final Object f11982f;

    public f0(l7 l7Var, long j10, View view, i7 i7Var, MessagesController messagesController) {
        this.f11981c = l7Var;
        this.f11980b = j10;
        this.d = view;
        this.e = i7Var;
        this.f11982f = messagesController;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11979a) {
            case 0:
                AndroidUtilities.runOnUIThread(new g0(tL_error, (xn) this.f11981c, tLObject, (TLRPC.FileLocation[]) this.d, (String) this.f11982f, (TLRPC.FileLocation[]) this.e, this.f11980b));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o2((l7) this.f11981c, tLObject, this.f11980b, (View) this.d, (i7) this.e, (MessagesController) this.f11982f, 3));
                return;
            default:
                ((ConferenceCall) this.f11981c).lambda$poll$8((TL_phone.getGroupCallChainBlocks) this.d, this.f11980b, (AtomicBoolean) this.e, (AtomicInteger) this.f11982f, tLObject, tL_error);
                return;
        }
    }

    public f0(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.f11981c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.f11980b = j10;
        this.e = atomicBoolean;
        this.f11982f = atomicInteger;
    }

    public f0(xn xnVar, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j10) {
        this.f11981c = xnVar;
        this.d = fileLocationArr;
        this.f11982f = str;
        this.e = fileLocationArr2;
        this.f11980b = j10;
    }
}
