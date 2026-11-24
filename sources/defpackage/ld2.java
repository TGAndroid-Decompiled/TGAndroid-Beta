package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ld2 implements RequestDelegate {
    public final byte a;
    public final qd2 b;

    public ld2(qd2 qd2Var, byte b) {
        this.a = b;
        this.b = qd2Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final qd2 qd2Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                qd2 qd2Var2 = qd2Var;
                                qd2Var2.N = elapsedRealtime;
                                qd2Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    oc7.r1(qd2Var2.C.a).d4(groupparticipants.users, false);
                                    oc7.r1(qd2Var2.C.a).X3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = qd2Var2.b;
                                    int i = groupCall.participants_count;
                                    int i2 = groupparticipants.count;
                                    if (i != i2) {
                                        groupCall.participants_count = i2;
                                        if (e21.a) {
                                            b10.p(qd2Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        nm7.f(qd2Var2.C.a).k(167, Long.valueOf(qd2Var2.c), Long.valueOf(qd2Var2.b.id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                boolean z = tLObject2 instanceof TL_phone.groupCall;
                                qd2 qd2Var3 = qd2Var;
                                if (z) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    qd2Var3.b = groupcall.call;
                                    oc7.r1(qd2Var3.C.a).d4(groupcall.users, false);
                                    oc7.r1(qd2Var3.C.a).X3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    qd2Var3.n(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                qd2Var3.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                qd2Var.getClass();
                if (tLObject != null) {
                    oc7.r1(qd2Var.C.a).T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                qd2Var.getClass();
                if (tLObject != null) {
                    oc7.r1(qd2Var.C.a).T3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                qd2Var.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                qd2 qd2Var2 = qd2Var;
                                qd2Var2.N = elapsedRealtime;
                                qd2Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    oc7.r1(qd2Var2.C.a).d4(groupparticipants.users, false);
                                    oc7.r1(qd2Var2.C.a).X3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = qd2Var2.b;
                                    int i = groupCall.participants_count;
                                    int i2 = groupparticipants.count;
                                    if (i != i2) {
                                        groupCall.participants_count = i2;
                                        if (e21.a) {
                                            b10.p(qd2Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        nm7.f(qd2Var2.C.a).k(167, Long.valueOf(qd2Var2.c), Long.valueOf(qd2Var2.b.id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                boolean z = tLObject2 instanceof TL_phone.groupCall;
                                qd2 qd2Var3 = qd2Var;
                                if (z) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    qd2Var3.b = groupcall.call;
                                    oc7.r1(qd2Var3.C.a).d4(groupcall.users, false);
                                    oc7.r1(qd2Var3.C.a).X3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    qd2Var3.n(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                qd2Var3.getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
