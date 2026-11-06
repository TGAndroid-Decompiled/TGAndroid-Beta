package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k3 implements RequestDelegate {
    public final int f23648a;
    public final r3 f23649b;

    public k3(r3 r3Var, int i7) {
        this.f23648a = i7;
        this.f23649b = r3Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23648a) {
            case 0:
                final r3 r3Var = this.f23649b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                r3 r3Var2 = r3Var;
                                r3Var2.N = elapsedRealtime;
                                r3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    qp.s1(r3Var2.C.f21723a).Y3(groupparticipants.users, false);
                                    qp.s1(r3Var2.C.f21723a).S3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = r3Var2.f25201b;
                                    int i10 = groupCall.participants_count;
                                    int i11 = groupparticipants.count;
                                    if (i10 != i11) {
                                        groupCall.participants_count = i11;
                                        if (r2.f25191a) {
                                            jg.g.s(r3Var2.f25201b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        qs.f(r3Var2.C.f21723a).k(166, Long.valueOf(r3Var2.f25202c), Long.valueOf(r3Var2.f25201b.f26962id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                r3 r3Var3 = r3Var;
                                r3Var3.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    r3Var3.f25201b = groupcall.call;
                                    qp.s1(r3Var3.C.f21723a).Y3(groupcall.users, false);
                                    qp.s1(r3Var3.C.f21723a).S3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    r3Var3.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                r3 r3Var2 = this.f23649b;
                r3Var2.getClass();
                if (tLObject != null) {
                    qp.s1(r3Var2.C.f21723a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                r3 r3Var3 = this.f23649b;
                r3Var3.getClass();
                if (tLObject != null) {
                    qp.s1(r3Var3.C.f21723a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                final r3 r3Var4 = this.f23649b;
                r3Var4.getClass();
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i7) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                r3 r3Var22 = r3Var4;
                                r3Var22.N = elapsedRealtime;
                                r3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    qp.s1(r3Var22.C.f21723a).Y3(groupparticipants.users, false);
                                    qp.s1(r3Var22.C.f21723a).S3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = r3Var22.f25201b;
                                    int i10 = groupCall.participants_count;
                                    int i11 = groupparticipants.count;
                                    if (i10 != i11) {
                                        groupCall.participants_count = i11;
                                        if (r2.f25191a) {
                                            jg.g.s(r3Var22.f25201b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        qs.f(r3Var22.C.f21723a).k(166, Long.valueOf(r3Var22.f25202c), Long.valueOf(r3Var22.f25201b.f26962id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                r3 r3Var32 = r3Var4;
                                r3Var32.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    r3Var32.f25201b = groupcall.call;
                                    qp.s1(r3Var32.C.f21723a).Y3(groupcall.users, false);
                                    qp.s1(r3Var32.C.f21723a).S3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    r3Var32.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
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
