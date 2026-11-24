package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class js2 implements RequestDelegate {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public js2(yv1 yv1Var, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 2;
        this.c = yv1Var;
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
                oc7 oc7Var = (oc7) obj4;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) obj3;
                f92 f92Var = (f92) obj2;
                g92 g92Var = (g92) obj;
                oc7Var.getClass();
                if (tLObject != null) {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    long j = this.b;
                    TLRPC.ChatFull M0 = oc7Var.M0(j);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= 1073741824;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        oc7Var.getMessagesStorage().K1(M0, false);
                    }
                    gm.c3(new hq6(oc7Var, f92Var, j, (byte) 6));
                    return;
                }
                gm.c3(new q87(g92Var, tL_error, (byte) 13));
                return;
            case 2:
                gm.c3(new rr6(tL_error, (yv1) obj4, tLObject, (TLRPC.FileLocation[]) obj3, (String) obj2, (TLRPC.FileLocation[]) obj, this.b));
                return;
            default:
                gm.c3(new om1((x4b) obj4, tLObject, this.b, (View) obj3, (v4b) obj2, (oc7) obj, (byte) 5));
                return;
        }
    }

    public js2(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public js2(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.a = (byte) 0;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }
}
