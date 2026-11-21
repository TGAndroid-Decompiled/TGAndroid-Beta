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
import org.telegram.ui.Components.ou;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.up;
public final class q2 implements RequestDelegate {
    public final int f9591a;
    public final long f9592b;
    public final Object f9593c;
    public final Object d;

    public q2(Object obj, long j3, Object obj2, int i7) {
        this.f9591a = i7;
        this.f9593c = obj;
        this.f9592b = j3;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f9591a;
        long j3 = this.f9592b;
        Object obj = this.d;
        Object obj2 = this.f9593c;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.o2((f6) obj2, (vf.b) obj, tLObject, this.f9592b, tL_error, 2));
                return;
            case 1:
                org.telegram.messenger.g0.g3(new j2((y8) obj2, (Object) tLObject, this.f9592b, (Object) ((x10) obj), 6));
                return;
            case 2:
                w8 w8Var = (w8) obj2;
                w8Var.getClass();
                org.telegram.messenger.g0.g3(new bi.o2(w8Var, tLObject, (mp) obj, tL_error, this.f9592b, 6));
                return;
            case 3:
                fi.c1 c1Var = (fi.c1) obj2;
                int[] iArr = (int[]) obj;
                int i10 = c1Var.f11836e;
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
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f9592b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final wh0 wh0Var = (wh0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i13 = wh0Var.f41831f;
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
                    final ou ouVar = new ou(28, wh0Var, arrayList6);
                    if (org.telegram.messenger.v3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = mp.u1(i13).f25786s3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = mp.u1(i13).j1(chat.f28431id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final wh0 wh0Var2 = wh0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final ou ouVar2 = ouVar;
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
                                                                org.telegram.messenger.mp.u1(wh0Var2.f41831f).e4(user, false, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f28580id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new vh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        ouVar2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.mp.u1(wh0Var2.f41831f).e4(user2, false, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f28580id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new vh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ouVar2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final wh0 wh0Var3 = wh0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final ou ouVar3 = ouVar;
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
                                                                org.telegram.messenger.mp.u1(wh0Var3.f41831f).e4(user, false, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f28580id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new vh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        ouVar3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.mp.u1(wh0Var3.f41831f).e4(user2, false, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f28580id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new vh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        ouVar3.run();
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
                    tL_messages_getFullChat.chat_id = chat.f28431id;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final wh0 wh0Var2 = wh0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final ou ouVar2 = ouVar;
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
                                                            org.telegram.messenger.mp.u1(wh0Var2.f41831f).e4(user, false, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f28580id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new vh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    ouVar2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.mp.u1(wh0Var2.f41831f).e4(user2, false, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f28580id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new vh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    ouVar2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final wh0 wh0Var3 = wh0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final ou ouVar3 = ouVar;
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
                                                            org.telegram.messenger.mp.u1(wh0Var3.f41831f).e4(user, false, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f28580id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new vh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    ouVar3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.mp.u1(wh0Var3.f41831f).e4(user2, false, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f28580id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new vh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    ouVar3.run();
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
                org.telegram.messenger.g0.g3(new j2(tLObject, (mp) obj2, this.f9592b, (up) obj, 20));
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
                        if (chat2.f28431id != j3 && org.telegram.messenger.v3.R(chat2)) {
                            arrayList7.add(n1);
                        }
                    }
                    org.telegram.messenger.g0.g3(new p4.z(29, t0Var, arrayList7));
                    return;
                }
                return;
        }
    }

    public q2(Object obj, Object obj2, long j3, int i7) {
        this.f9591a = i7;
        this.f9593c = obj;
        this.d = obj2;
        this.f9592b = j3;
    }
}
