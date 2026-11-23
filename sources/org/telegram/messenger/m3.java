package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m3 implements RequestDelegate {
    public final int f25613a;
    public final t3 f25614b;

    public m3(t3 t3Var, int i7) {
        this.f25613a = i7;
        this.f25614b = t3Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25613a) {
            case 0:
                final t3 t3Var = this.f25614b;
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                t3 t3Var2 = t3Var;
                                t3Var2.N = elapsedRealtime;
                                t3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    mp.u1(t3Var2.C.f23343a).f4(groupparticipants.users, false);
                                    mp.u1(t3Var2.C.f23343a).Z3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = t3Var2.f27034b;
                                    int i10 = groupCall.participants_count;
                                    int i11 = groupparticipants.count;
                                    if (i10 != i11) {
                                        groupCall.participants_count = i11;
                                        if (s2.f26829a) {
                                            i5.c.t(t3Var2.f27034b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        ks.f(t3Var2.C.f23343a).k(166, Long.valueOf(t3Var2.f27035c), Long.valueOf(t3Var2.f27034b.f28502id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                t3 t3Var3 = t3Var;
                                t3Var3.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    t3Var3.f27034b = groupcall.call;
                                    mp.u1(t3Var3.C.f23343a).f4(groupcall.users, false);
                                    mp.u1(t3Var3.C.f23343a).Z3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    t3Var3.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                t3 t3Var2 = this.f25614b;
                t3Var2.getClass();
                if (tLObject != null) {
                    mp.u1(t3Var2.C.f23343a).V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                t3 t3Var3 = this.f25614b;
                t3Var3.getClass();
                if (tLObject != null) {
                    mp.u1(t3Var3.C.f23343a).V3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                final t3 t3Var4 = this.f25614b;
                t3Var4.getClass();
                g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                t3 t3Var22 = t3Var4;
                                t3Var22.N = elapsedRealtime;
                                t3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    mp.u1(t3Var22.C.f23343a).f4(groupparticipants.users, false);
                                    mp.u1(t3Var22.C.f23343a).Z3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = t3Var22.f27034b;
                                    int i10 = groupCall.participants_count;
                                    int i11 = groupparticipants.count;
                                    if (i10 != i11) {
                                        groupCall.participants_count = i11;
                                        if (s2.f26829a) {
                                            i5.c.t(t3Var22.f27034b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        ks.f(t3Var22.C.f23343a).k(166, Long.valueOf(t3Var22.f27035c), Long.valueOf(t3Var22.f27034b.f28502id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                t3 t3Var32 = t3Var4;
                                t3Var32.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    t3Var32.f27034b = groupcall.call;
                                    mp.u1(t3Var32.C.f23343a).f4(groupcall.users, false);
                                    mp.u1(t3Var32.C.f23343a).Z3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    t3Var32.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
