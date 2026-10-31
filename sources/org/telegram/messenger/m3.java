package org.telegram.messenger;

import android.os.SystemClock;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class m3 implements RequestDelegate {
    public final int f16863a;
    public final u3 f16864b;

    public m3(u3 u3Var, int i10) {
        this.f16863a = i10;
        this.f16864b = u3Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16863a) {
            case 0:
                final u3 u3Var = this.f16864b;
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
                                    vp.r1(u3Var2.C.f14863a).V3(groupparticipants.users, false);
                                    vp.r1(u3Var2.C.f14863a).P3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = u3Var2.f18228b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (v2.f18448a) {
                                            i0.a.p(u3Var2.f18228b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        zs.f(u3Var2.C.f14863a).k(166, Long.valueOf(u3Var2.f18229c), Long.valueOf(u3Var2.f18228b.f19803id), Boolean.FALSE);
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
                                    u3Var3.f18228b = groupcall.call;
                                    vp.r1(u3Var3.C.f14863a).V3(groupcall.users, false);
                                    vp.r1(u3Var3.C.f14863a).P3(groupcall.chats, false);
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
                u3 u3Var2 = this.f16864b;
                u3Var2.getClass();
                if (tLObject != null) {
                    vp.r1(u3Var2.C.f14863a).L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 2:
                u3 u3Var3 = this.f16864b;
                u3Var3.getClass();
                if (tLObject != null) {
                    vp.r1(u3Var3.C.f14863a).L3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            default:
                final u3 u3Var4 = this.f16864b;
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
                                    vp.r1(u3Var22.C.f14863a).V3(groupparticipants.users, false);
                                    vp.r1(u3Var22.C.f14863a).P3(groupparticipants.chats, false);
                                    TLRPC.GroupCall groupCall = u3Var22.f18228b;
                                    int i11 = groupCall.participants_count;
                                    int i12 = groupparticipants.count;
                                    if (i11 != i12) {
                                        groupCall.participants_count = i12;
                                        if (v2.f18448a) {
                                            i0.a.p(u3Var22.f18228b.participants_count, new StringBuilder("new participants reload count "));
                                        }
                                        zs.f(u3Var22.C.f14863a).k(166, Long.valueOf(u3Var22.f18229c), Long.valueOf(u3Var22.f18228b.f19803id), Boolean.FALSE);
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
                                    u3Var32.f18228b = groupcall.call;
                                    vp.r1(u3Var32.C.f14863a).V3(groupcall.users, false);
                                    vp.r1(u3Var32.C.f14863a).P3(groupcall.chats, false);
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
