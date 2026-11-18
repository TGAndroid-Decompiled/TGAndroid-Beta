package di;

import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.dw;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.up;
public final class p2 implements RequestDelegate {
    public final int f9499a;
    public final long f9500b;
    public final Object f9501c;
    public final Object d;

    public p2(Object obj, long j3, Object obj2, int i7) {
        this.f9499a = i7;
        this.f9501c = obj;
        this.f9500b = j3;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9499a;
        long j3 = this.f9500b;
        Object obj = this.d;
        Object obj2 = this.f9501c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.k2((f6) obj2, (vf.b) obj, tLObject, this.f9500b, tL_error, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new i2((x8) obj2, (Object) tLObject, this.f9500b, (Object) ((x10) obj), 6));
                return;
            case 2:
                v8 v8Var = (v8) obj2;
                v8Var.getClass();
                org.telegram.messenger.g0.g3(new bi.k2(v8Var, tLObject, (mp) obj, tL_error, this.f9500b, 6));
                return;
            case 3:
                fi.c1 c1Var = (fi.c1) obj2;
                int[] iArr = (int[]) obj;
                int i10 = c1Var.f11793e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    mp.u1(i10).f4(groupparticipants.users, false);
                    mp.u1(i10).Z3(groupparticipants.chats, false);
                    if (c1Var.F != null) {
                        j10.i(i10).e();
                        ArrayList arrayList = new ArrayList();
                        for (int i11 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList2 = groupparticipants.participants;
                            int size = arrayList2.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 < size) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList2.get(i12);
                                    i12++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i11) {
                                        arrayList.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i11));
                                    }
                                }
                            }
                        }
                        c1Var.F.onMediaDescriptionAvailable(j3, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f9500b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final uh0 uh0Var = (uh0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i13 = uh0Var.f40358f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList3 = new ArrayList();
                    final ArrayList arrayList4 = new ArrayList();
                    ArrayList<T> arrayList5 = ((Vector) tLObject).objects;
                    int size2 = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj3 = arrayList5.get(i14);
                        i14++;
                        if (obj3 instanceof Long) {
                            Long l10 = (Long) obj3;
                            if (j3 != l10.longValue()) {
                                arrayList3.add(l10);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j10 = tL_readParticipantDate.user_id;
                            int i15 = tL_readParticipantDate.date;
                            if (j3 != j10) {
                                arrayList3.add(Long.valueOf(j10));
                                arrayList4.add(Integer.valueOf(i15));
                            }
                        }
                    }
                    arrayList3.add(Long.valueOf(j3));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final dw dwVar = new dw(26, uh0Var, arrayList6);
                    if (org.telegram.messenger.v3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = mp.u1(i13).f25758s3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = mp.u1(i13).j1(chat.f28403id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final uh0 uh0Var2 = uh0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final dw dwVar2 = dwVar;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                                org.telegram.messenger.mp.u1(uh0Var2.f40358f).e4(user, false, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f28552id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new th0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        dwVar2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.mp.u1(uh0Var2.f40358f).e4(user2, false, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f28552id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new th0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        dwVar2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final uh0 uh0Var3 = uh0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final dw dwVar3 = dwVar;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                                org.telegram.messenger.mp.u1(uh0Var3.f40358f).e4(user, false, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f28552id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new th0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        dwVar3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.mp.u1(uh0Var3.f40358f).e4(user2, false, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f28552id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new th0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        dwVar3.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                    tL_messages_getFullChat.chat_id = chat.f28403id;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final uh0 uh0Var2 = uh0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final dw dwVar2 = dwVar;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                            org.telegram.messenger.mp.u1(uh0Var2.f40358f).e4(user, false, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f28552id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new th0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    dwVar2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.mp.u1(uh0Var2.f40358f).e4(user2, false, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f28552id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new th0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    dwVar2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final uh0 uh0Var3 = uh0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final dw dwVar3 = dwVar;
                                    org.telegram.messenger.g0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                            org.telegram.messenger.mp.u1(uh0Var3.f40358f).e4(user, false, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f28552id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new th0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    dwVar3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.mp.u1(uh0Var3.f40358f).e4(user2, false, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f28552id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new th0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    dwVar3.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                            }
                        }
                    });
                    return;
                }
                return;
            case 6:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new i2(tLObject, (mp) obj2, this.f9500b, (up) obj, 20));
                return;
            default:
                mp mpVar = (mp) obj2;
                wg.t0 t0Var = (wg.t0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    mpVar.Z3(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i16 = 0; i16 < tL_contacts_found.chats.size(); i16++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i16);
                        TLRPC.InputPeer n1 = mp.n1(chat2);
                        if (chat2.f28403id != j3 && org.telegram.messenger.v3.R(chat2)) {
                            arrayList7.add(n1);
                        }
                    }
                    org.telegram.messenger.g0.g3(new p4.o0(27, t0Var, arrayList7));
                    return;
                }
                return;
        }
    }

    public p2(Object obj, Object obj2, long j3, int i7) {
        this.f9499a = i7;
        this.f9501c = obj;
        this.d = obj2;
        this.f9500b = j3;
    }
}
