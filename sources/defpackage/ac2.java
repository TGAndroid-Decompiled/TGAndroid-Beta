package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class ac2 implements RequestDelegate {
    public final byte a;
    public final fc2 b;

    public ac2(fc2 fc2Var, byte b) {
        this.a = b;
        this.b = fc2Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final fc2 fc2Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                fc2 fc2Var2 = fc2Var;
                                fc2Var2.N = elapsedRealtime;
                                fc2Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    na7.q1(fc2Var2.C.a).a4(groupparticipants.users, false);
                                    na7.q1(fc2Var2.C.a).U3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = fc2Var2.b;
                                    int i = groupCall.participants_count;
                                    int i2 = groupparticipants.count;
                                    if (i != i2) {
                                        groupCall.participants_count = i2;
                                        if (w01.a) {
                                            b00.p(fc2Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        kk7.f(fc2Var2.C.a).k(166, Long.valueOf(fc2Var2.c), Long.valueOf(fc2Var2.b.id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                boolean z = tLObject2 instanceof TL_phone.groupCall;
                                fc2 fc2Var3 = fc2Var;
                                if (z) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    fc2Var3.b = groupcall.call;
                                    na7.q1(fc2Var3.C.a).a4(groupcall.users, false);
                                    na7.q1(fc2Var3.C.a).U3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    fc2Var3.n(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                fc2Var3.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                fc2Var.getClass();
                if (tLObject != null) {
                    na7.q1(fc2Var.C.a).Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                fc2Var.getClass();
                if (tLObject != null) {
                    na7.q1(fc2Var.C.a).Q3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                fc2Var.getClass();
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                fc2 fc2Var2 = fc2Var;
                                fc2Var2.N = elapsedRealtime;
                                fc2Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    na7.q1(fc2Var2.C.a).a4(groupparticipants.users, false);
                                    na7.q1(fc2Var2.C.a).U3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = fc2Var2.b;
                                    int i = groupCall.participants_count;
                                    int i2 = groupparticipants.count;
                                    if (i != i2) {
                                        groupCall.participants_count = i2;
                                        if (w01.a) {
                                            b00.p(fc2Var2.b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        kk7.f(fc2Var2.C.a).k(166, Long.valueOf(fc2Var2.c), Long.valueOf(fc2Var2.b.id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                boolean z = tLObject2 instanceof TL_phone.groupCall;
                                fc2 fc2Var3 = fc2Var;
                                if (z) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    fc2Var3.b = groupcall.call;
                                    na7.q1(fc2Var3.C.a).a4(groupcall.users, false);
                                    na7.q1(fc2Var3.C.a).U3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    fc2Var3.n(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                fc2Var3.getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
