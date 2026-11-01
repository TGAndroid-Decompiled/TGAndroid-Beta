package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m3 implements RequestDelegate {
    public final int f17033a;
    public final u3 f17034b;

    public m3(u3 u3Var, int i10) {
        this.f17033a = i10;
        this.f17034b = u3Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17033a) {
            case 0:
                final u3 u3Var = this.f17034b;
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                u3 u3Var2 = u3Var;
                                u3Var2.N = elapsedRealtime;
                                u3Var2.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    wp.r1(u3Var2.C.f15043a).V3(groupparticipants.users, false);
                                    wp.r1(u3Var2.C.f15043a).P3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = u3Var2.f18361b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (v2.f18578a) {
                                            i0.a.p(u3Var2.f18361b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        at.f(u3Var2.C.f15043a).k(166, Long.valueOf(u3Var2.f18362c), Long.valueOf(u3Var2.f18361b.f19804id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                u3 u3Var3 = u3Var;
                                u3Var3.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    u3Var3.f18361b = groupcall.call;
                                    wp.r1(u3Var3.C.f15043a).V3(groupcall.users, false);
                                    wp.r1(u3Var3.C.f15043a).P3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    u3Var3.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                u3 u3Var2 = this.f17034b;
                u3Var2.getClass();
                if (tLObject != null) {
                    wp.r1(u3Var2.C.f15043a).L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f17034b;
                u3Var3.getClass();
                if (tLObject != null) {
                    wp.r1(u3Var3.C.f15043a).L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                final u3 u3Var4 = this.f17034b;
                u3Var4.getClass();
                i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                u3 u3Var22 = u3Var4;
                                u3Var22.N = elapsedRealtime;
                                u3Var22.O = false;
                                if (tLObject2 != null) {
                                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                                    wp.r1(u3Var22.C.f15043a).V3(groupparticipants.users, false);
                                    wp.r1(u3Var22.C.f15043a).P3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = u3Var22.f18361b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (v2.f18578a) {
                                            i0.a.p(u3Var22.f18361b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        at.f(u3Var22.C.f15043a).k(166, Long.valueOf(u3Var22.f18362c), Long.valueOf(u3Var22.f18361b.f19804id), Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                u3 u3Var32 = u3Var4;
                                u3Var32.getClass();
                                if (tLObject2 instanceof TL_phone.groupCall) {
                                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                    u3Var32.f18361b = groupcall.call;
                                    wp.r1(u3Var32.C.f15043a).V3(groupcall.users, false);
                                    wp.r1(u3Var32.C.f15043a).P3(groupcall.chats, false);
                                    ArrayList<TLRPC.GroupCallParticipant> arrayList = groupcall.participants;
                                    String str = groupcall.participants_next_offset;
                                    TLRPC.GroupCall groupCall2 = groupcall.call;
                                    u3Var32.m(arrayList, true, "", str, groupCall2.version, groupCall2.participants_count);
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
