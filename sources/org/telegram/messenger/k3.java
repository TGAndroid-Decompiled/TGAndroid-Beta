package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k3 implements RequestDelegate {
    public final int f23793a;
    public final r3 f23794b;

    public k3(r3 r3Var, int i3) {
        this.f23793a = i3;
        this.f23794b = r3Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f23793a) {
            case 0:
                final r3 r3Var = this.f23794b;
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                r3 r3Var2 = r3Var;
                                r3Var2.N = elapsedRealtime;
                                r3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    hp.s1(r3Var2.C.f21919a).Y3(groupparticipants.users, false);
                                    hp.s1(r3Var2.C.f21919a).S3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = r3Var2.f25049b;
                                    int i10 = groupCall.participants_count;
                                    int i11 = groupparticipants.count;
                                    if (i10 != i11) {
                                        groupCall.participants_count = i11;
                                        if (r2.f25040a) {
                                            k2.p1.q(r3Var2.f25049b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        hs.f(r3Var2.C.f21919a).k(166, Long.valueOf(r3Var2.f25050c), Long.valueOf(r3Var2.f25049b.f27011id), Boolean.FALSE);
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
                                    r3Var3.f25049b = groupcall.call;
                                    hp.s1(r3Var3.C.f21919a).Y3(groupcall.users, false);
                                    hp.s1(r3Var3.C.f21919a).S3(groupcall.chats, false);
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
                r3 r3Var2 = this.f23794b;
                r3Var2.getClass();
                if (tLObject != null) {
                    hp.s1(r3Var2.C.f21919a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                r3 r3Var3 = this.f23794b;
                r3Var3.getClass();
                if (tLObject != null) {
                    hp.s1(r3Var3.C.f21919a).O3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                final r3 r3Var4 = this.f23794b;
                r3Var4.getClass();
                g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i3) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                r3 r3Var22 = r3Var4;
                                r3Var22.N = elapsedRealtime;
                                r3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    hp.s1(r3Var22.C.f21919a).Y3(groupparticipants.users, false);
                                    hp.s1(r3Var22.C.f21919a).S3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = r3Var22.f25049b;
                                    int i10 = groupCall.participants_count;
                                    int i11 = groupparticipants.count;
                                    if (i10 != i11) {
                                        groupCall.participants_count = i11;
                                        if (r2.f25040a) {
                                            k2.p1.q(r3Var22.f25049b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        hs.f(r3Var22.C.f21919a).k(166, Long.valueOf(r3Var22.f25050c), Long.valueOf(r3Var22.f25049b.f27011id), Boolean.FALSE);
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
                                    r3Var32.f25049b = groupcall.call;
                                    hp.s1(r3Var32.C.f21919a).Y3(groupcall.users, false);
                                    hp.s1(r3Var32.C.f21919a).S3(groupcall.chats, false);
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
