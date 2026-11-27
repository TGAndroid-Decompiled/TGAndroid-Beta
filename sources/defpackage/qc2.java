package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class qc2 implements RequestDelegate {
    public final byte a;
    public final vc2 b;

    public qc2(vc2 vc2Var, byte b) {
        this.a = b;
        this.b = vc2Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final vc2 vc2Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                vc2 vc2Var2 = vc2Var;
                                vc2Var2.N = elapsedRealtime;
                                vc2Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    uc7.s1(vc2Var2.C.a).j4(groupparticipants.users, false);
                                    uc7.s1(vc2Var2.C.a).c4(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = vc2Var2.b;
                                    int i = groupCall.participants_count;
                                    int i2 = groupparticipants.count;
                                    if (i != i2) {
                                        groupCall.participants_count = i2;
                                        if (f11.a) {
                                            c00.q(vc2Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        jn7.f(vc2Var2.C.a).k(167, Long.valueOf(vc2Var2.c), Long.valueOf(vc2Var2.b.id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                boolean z = tLObject2 instanceof TL_phone.groupCall;
                                vc2 vc2Var3 = vc2Var;
                                if (z) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    vc2Var3.b = groupcall.call;
                                    uc7.s1(vc2Var3.C.a).j4(groupcall.users, false);
                                    uc7.s1(vc2Var3.C.a).c4(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    vc2Var3.n(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                vc2Var3.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                vc2Var.getClass();
                if (tLObject != null) {
                    uc7.s1(vc2Var.C.a).Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                vc2Var.getClass();
                if (tLObject != null) {
                    uc7.s1(vc2Var.C.a).Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                vc2Var.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                vc2 vc2Var2 = vc2Var;
                                vc2Var2.N = elapsedRealtime;
                                vc2Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    uc7.s1(vc2Var2.C.a).j4(groupparticipants.users, false);
                                    uc7.s1(vc2Var2.C.a).c4(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = vc2Var2.b;
                                    int i = groupCall.participants_count;
                                    int i2 = groupparticipants.count;
                                    if (i != i2) {
                                        groupCall.participants_count = i2;
                                        if (f11.a) {
                                            c00.q(vc2Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        jn7.f(vc2Var2.C.a).k(167, Long.valueOf(vc2Var2.c), Long.valueOf(vc2Var2.b.id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                boolean z = tLObject2 instanceof TL_phone.groupCall;
                                vc2 vc2Var3 = vc2Var;
                                if (z) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    vc2Var3.b = groupcall.call;
                                    uc7.s1(vc2Var3.C.a).j4(groupcall.users, false);
                                    uc7.s1(vc2Var3.C.a).c4(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    vc2Var3.n(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                vc2Var3.getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
