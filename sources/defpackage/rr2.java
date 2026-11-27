package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class rr2 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rr2(zu1 zu1Var, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 2;
        this.c = zu1Var;
        this.d = fileLocationArr;
        this.e = str;
        this.f = fileLocationArr2;
        this.b = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((ConferenceCall) obj4).lambda$poll$8((TL_phone.getGroupCallChainBlocks) obj3, this.b, (AtomicBoolean) obj2, (AtomicInteger) obj, tLObject, tL_error);
                return;
            case 1:
                uc7 uc7Var = (uc7) obj4;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) obj3;
                l82 l82Var = (l82) obj2;
                m82 m82Var = (m82) obj;
                uc7Var.getClass();
                if (tLObject != null) {
                    uc7Var.Y3((TLRPC.Updates) tLObject, false);
                    long j = this.b;
                    TLRPC.ChatFull N0 = uc7Var.N0(j);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= 1073741824;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        uc7Var.getMessagesStorage().K1(N0, false);
                    }
                    hl.c3(new cq6(uc7Var, l82Var, j, (byte) 5));
                    return;
                }
                hl.c3(new t87(m82Var, tL_error, (byte) 8));
                return;
            case 2:
                hl.c3(new sp6(tL_error, (zu1) obj4, tLObject, (TLRPC.FileLocation[]) obj3, (String) obj2, (TLRPC.FileLocation[]) obj, this.b));
                return;
            default:
                hl.c3(new nm1((s6b) obj4, tLObject, this.b, (View) obj3, (q6b) obj2, (uc7) obj, (byte) 5));
                return;
        }
    }

    public rr2(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public rr2(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.a = (byte) 0;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }
}
