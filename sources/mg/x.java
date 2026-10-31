package mg;

import ag.a3;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qq;
import rh.c6;
import rh.e4;
import rh.e6;
public final class x implements RequestDelegate {
    public final int f13283a;
    public final long f13284b;
    public final Object f13285c;
    public final Object d;

    public x(Object obj, long j10, Object obj2, int i10) {
        this.f13283a = i10;
        this.f13285c = obj;
        this.f13284b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f13283a;
        long j10 = this.f13284b;
        Object obj = this.d;
        Object obj2 = this.f13285c;
        switch (i10) {
            case 0:
                vp vpVar = (vp) obj2;
                r1 r1Var = (r1) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    vpVar.P3(tL_contacts_found.chats, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < tL_contacts_found.chats.size(); i11++) {
                        TLRPC.Chat chat = tL_contacts_found.chats.get(i11);
                        TLRPC.InputPeer k12 = vp.k1(chat);
                        if (chat.f19793id != j10 && w3.R(chat)) {
                            arrayList.add(k12);
                        }
                    }
                    org.telegram.messenger.i0.g3(new k2.u(23, r1Var, arrayList));
                    return;
                }
                return;
            case 1:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f13284b, (Runnable) obj, tLObject, tL_error);
                return;
            case 2:
                final li0 li0Var = (li0) obj2;
                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                int i12 = li0Var.f28121f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList2 = new ArrayList();
                    final ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj3 = arrayList4.get(i13);
                        i13++;
                        if (obj3 instanceof Long) {
                            Long l4 = (Long) obj3;
                            if (j10 != l4.longValue()) {
                                arrayList2.add(l4);
                                arrayList3.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i14 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList2.add(Long.valueOf(j11));
                                arrayList3.add(Integer.valueOf(i14));
                            }
                        }
                    }
                    arrayList2.add(Long.valueOf(j10));
                    arrayList3.add(0);
                    final ArrayList arrayList5 = new ArrayList();
                    final gi0 gi0Var = new gi0(0, li0Var, arrayList5);
                    if (w3.T(chat2)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = vp.r1(i12).f18870p3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = vp.r1(i12).g1(chat2.f19793id);
                        ConnectionsManager.getInstance(i12).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final li0 li0Var2 = li0Var;
                                        final ArrayList arrayList6 = arrayList2;
                                        final ArrayList arrayList7 = arrayList5;
                                        final ArrayList arrayList8 = arrayList3;
                                        final gi0 gi0Var2 = gi0Var;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i15 = 0; i15 < tL_channels_channelParticipants.users.size(); i15++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i15);
                                                                org.telegram.messenger.vp.r1(li0Var2.f28121f).U3(user, false, false);
                                                                int indexOf = arrayList6.indexOf(Long.valueOf(user.f19942id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        gi0Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i16 = 0; i16 < tL_messages_chatFull.users.size(); i16++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i16);
                                                                org.telegram.messenger.vp.r1(li0Var2.f28121f).U3(user2, false, false);
                                                                int indexOf2 = arrayList6.indexOf(Long.valueOf(user2.f19942id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        gi0Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final li0 li0Var3 = li0Var;
                                        final ArrayList arrayList9 = arrayList2;
                                        final ArrayList arrayList10 = arrayList5;
                                        final ArrayList arrayList11 = arrayList3;
                                        final gi0 gi0Var3 = gi0Var;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i15 = 0; i15 < tL_channels_channelParticipants.users.size(); i15++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i15);
                                                                org.telegram.messenger.vp.r1(li0Var3.f28121f).U3(user, false, false);
                                                                int indexOf = arrayList9.indexOf(Long.valueOf(user.f19942id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i16 = 0; i16 < tL_messages_chatFull.users.size(); i16++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i16);
                                                                org.telegram.messenger.vp.r1(li0Var3.f28121f).U3(user2, false, false);
                                                                int indexOf2 = arrayList9.indexOf(Long.valueOf(user2.f19942id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        gi0Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat2.f19793id;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final li0 li0Var2 = li0Var;
                                    final ArrayList arrayList6 = arrayList2;
                                    final ArrayList arrayList7 = arrayList5;
                                    final ArrayList arrayList8 = arrayList3;
                                    final gi0 gi0Var2 = gi0Var;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i15 = 0; i15 < tL_channels_channelParticipants.users.size(); i15++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i15);
                                                            org.telegram.messenger.vp.r1(li0Var2.f28121f).U3(user, false, false);
                                                            int indexOf = arrayList6.indexOf(Long.valueOf(user.f19942id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    gi0Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i16 = 0; i16 < tL_messages_chatFull.users.size(); i16++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i16);
                                                            org.telegram.messenger.vp.r1(li0Var2.f28121f).U3(user2, false, false);
                                                            int indexOf2 = arrayList6.indexOf(Long.valueOf(user2.f19942id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList7.add(new ki0(((Integer) arrayList8.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    gi0Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final li0 li0Var3 = li0Var;
                                    final ArrayList arrayList9 = arrayList2;
                                    final ArrayList arrayList10 = arrayList5;
                                    final ArrayList arrayList11 = arrayList3;
                                    final gi0 gi0Var3 = gi0Var;
                                    org.telegram.messenger.i0.g3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i15 = 0; i15 < tL_channels_channelParticipants.users.size(); i15++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i15);
                                                            org.telegram.messenger.vp.r1(li0Var3.f28121f).U3(user, false, false);
                                                            int indexOf = arrayList9.indexOf(Long.valueOf(user.f19942id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    gi0Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i16 = 0; i16 < tL_messages_chatFull.users.size(); i16++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i16);
                                                            org.telegram.messenger.vp.r1(li0Var3.f28121f).U3(user2, false, false);
                                                            int indexOf2 = arrayList9.indexOf(Long.valueOf(user2.f19942id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList10.add(new ki0(((Integer) arrayList11.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    gi0Var3.run();
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
            case 3:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new a3(tLObject, (vp) obj2, this.f13284b, (qq) obj, 9));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g((e4) obj2, (gf.e) obj, tLObject, this.f13284b, tL_error));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new a3((e6) obj2, tLObject, this.f13284b, (q20) obj, 22));
                return;
            case 6:
                c6 c6Var = (c6) obj;
                c6Var.getClass();
                org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g(c6Var, tLObject, (vp) obj2, tL_error, this.f13284b));
                return;
            default:
                th.s0 s0Var = (th.s0) obj2;
                int[] iArr = (int[]) obj;
                int i15 = s0Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    vp.r1(i15).V3(groupparticipants.users, false);
                    vp.r1(i15).P3(groupparticipants.chats, false);
                    if (s0Var.E != null) {
                        d20.i(i15).e();
                        ArrayList arrayList6 = new ArrayList();
                        for (int i16 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList7 = groupparticipants.participants;
                            int size2 = arrayList7.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 < size2) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList7.get(i17);
                                    i17++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i16) {
                                        arrayList6.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i16));
                                    }
                                }
                            }
                        }
                        s0Var.E.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList6.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public x(us usVar, Object obj, long j10, int i10) {
        this.f13283a = i10;
        this.f13285c = usVar;
        this.d = obj;
        this.f13284b = j10;
    }

    public x(c6 c6Var, vp vpVar, long j10) {
        this.f13283a = 6;
        this.d = c6Var;
        this.f13285c = vpVar;
        this.f13284b = j10;
    }
}
