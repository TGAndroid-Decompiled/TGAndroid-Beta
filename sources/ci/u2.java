package ci;

import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.kh0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pp;
public final class u2 implements RequestDelegate {
    public final int f6080a;
    public final long f6081b;
    public final Object f6082c;
    public final Object d;

    public u2(Object obj, long j10, Object obj2, int i3) {
        this.f6080a = i3;
        this.f6082c = obj;
        this.f6081b = j10;
        this.d = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f6080a;
        long j10 = this.f6081b;
        Object obj = this.d;
        Object obj2 = this.f6082c;
        switch (i3) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.z1((l6) obj2, (sf.b) obj, tLObject, this.f6081b, tL_error, 2));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new l2((e9) obj2, (Object) tLObject, this.f6081b, (Object) ((u10) obj), 7));
                return;
            case 2:
                c9 c9Var = (c9) obj2;
                c9Var.getClass();
                org.telegram.messenger.g0.h3(new ai.z1(c9Var, tLObject, (hp) obj, tL_error, this.f6081b, 7));
                return;
            case 3:
                ei.g1 g1Var = (ei.g1) obj2;
                int[] iArr = (int[]) obj;
                int i10 = g1Var.f10299e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    hp.s1(i10).Y3(groupparticipants.users, false);
                    hp.s1(i10).S3(groupparticipants.chats, false);
                    if (g1Var.F != null) {
                        h10.i(i10).e();
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
                        g1Var.F.onMediaDescriptionAvailable(j10, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((ConferenceCall) obj2).lambda$requestLastBlock$3(this.f6081b, (Runnable) obj, tLObject, tL_error);
                return;
            case 5:
                final kh0 kh0Var = (kh0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                int i13 = kh0Var.f35413f;
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
                            if (j10 != l10.longValue()) {
                                arrayList3.add(l10);
                                arrayList4.add(0);
                            }
                        } else if (obj3 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj3;
                            long j11 = tL_readParticipantDate.user_id;
                            int i15 = tL_readParticipantDate.date;
                            if (j10 != j11) {
                                arrayList3.add(Long.valueOf(j11));
                                arrayList4.add(Integer.valueOf(i15));
                            }
                        }
                    }
                    arrayList3.add(Long.valueOf(j10));
                    arrayList4.add(0);
                    final ArrayList arrayList6 = new ArrayList();
                    final j50 j50Var = new j50(11, kh0Var, arrayList6);
                    if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = hp.s1(i13).f23098q3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = hp.s1(i13).h1(chat.f27001id);
                        ConnectionsManager.getInstance(i13).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (r6) {
                                    case 0:
                                        final kh0 kh0Var2 = kh0Var;
                                        final ArrayList arrayList7 = arrayList3;
                                        final ArrayList arrayList8 = arrayList6;
                                        final ArrayList arrayList9 = arrayList4;
                                        final j50 j50Var2 = j50Var;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                                org.telegram.messenger.hp.s1(kh0Var2.f35413f).X3(user, false, false);
                                                                int indexOf = arrayList7.indexOf(Long.valueOf(user.f27150id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList8.add(new jh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        j50Var2.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.hp.s1(kh0Var2.f35413f).X3(user2, false, false);
                                                                int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f27150id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList8.add(new jh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        j50Var2.run();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final kh0 kh0Var3 = kh0Var;
                                        final ArrayList arrayList10 = arrayList3;
                                        final ArrayList arrayList11 = arrayList6;
                                        final ArrayList arrayList12 = arrayList4;
                                        final j50 j50Var3 = j50Var;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r7) {
                                                    case 0:
                                                        TLObject tLObject3 = tLObject2;
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                                org.telegram.messenger.hp.s1(kh0Var3.f35413f).X3(user, false, false);
                                                                int indexOf = arrayList10.indexOf(Long.valueOf(user.f27150id));
                                                                if (!user.self && indexOf >= 0) {
                                                                    arrayList11.add(new jh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                                }
                                                            }
                                                        }
                                                        j50Var3.run();
                                                        return;
                                                    default:
                                                        TLObject tLObject4 = tLObject2;
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                                org.telegram.messenger.hp.s1(kh0Var3.f35413f).X3(user2, false, false);
                                                                int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f27150id));
                                                                if (!user2.self && indexOf2 >= 0) {
                                                                    arrayList11.add(new jh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        j50Var3.run();
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
                    tL_messages_getFullChat.chat_id = chat.f27001id;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                        @Override
                        public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            switch (r6) {
                                case 0:
                                    final kh0 kh0Var2 = kh0Var;
                                    final ArrayList arrayList7 = arrayList3;
                                    final ArrayList arrayList8 = arrayList6;
                                    final ArrayList arrayList9 = arrayList4;
                                    final j50 j50Var2 = j50Var;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                            org.telegram.messenger.hp.s1(kh0Var2.f35413f).X3(user, false, false);
                                                            int indexOf = arrayList7.indexOf(Long.valueOf(user.f27150id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList8.add(new jh0(((Integer) arrayList9.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    j50Var2.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.hp.s1(kh0Var2.f35413f).X3(user2, false, false);
                                                            int indexOf2 = arrayList7.indexOf(Long.valueOf(user2.f27150id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList8.add(new jh0(((Integer) arrayList9.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    j50Var2.run();
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                default:
                                    final kh0 kh0Var3 = kh0Var;
                                    final ArrayList arrayList10 = arrayList3;
                                    final ArrayList arrayList11 = arrayList6;
                                    final ArrayList arrayList12 = arrayList4;
                                    final j50 j50Var3 = j50Var;
                                    org.telegram.messenger.g0.h3(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r7) {
                                                case 0:
                                                    TLObject tLObject3 = tLObject2;
                                                    if (tLObject3 != null) {
                                                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                        for (int i16 = 0; i16 < tL_channels_channelParticipants.users.size(); i16++) {
                                                            TLRPC.User user = tL_channels_channelParticipants.users.get(i16);
                                                            org.telegram.messenger.hp.s1(kh0Var3.f35413f).X3(user, false, false);
                                                            int indexOf = arrayList10.indexOf(Long.valueOf(user.f27150id));
                                                            if (!user.self && indexOf >= 0) {
                                                                arrayList11.add(new jh0(((Integer) arrayList12.get(indexOf)).intValue(), user));
                                                            }
                                                        }
                                                    }
                                                    j50Var3.run();
                                                    return;
                                                default:
                                                    TLObject tLObject4 = tLObject2;
                                                    if (tLObject4 != null) {
                                                        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                        for (int i17 = 0; i17 < tL_messages_chatFull.users.size(); i17++) {
                                                            TLRPC.User user2 = tL_messages_chatFull.users.get(i17);
                                                            org.telegram.messenger.hp.s1(kh0Var3.f35413f).X3(user2, false, false);
                                                            int indexOf2 = arrayList10.indexOf(Long.valueOf(user2.f27150id));
                                                            if (!user2.self && indexOf2 >= 0) {
                                                                arrayList11.add(new jh0(((Integer) arrayList12.get(indexOf2)).intValue(), user2));
                                                            }
                                                        }
                                                    }
                                                    j50Var3.run();
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
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.h3(new l2(tLObject, (hp) obj2, this.f6081b, (pp) obj, 21));
                return;
            default:
                hp hpVar = (hp) obj2;
                xg.t0 t0Var = (xg.t0) obj;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    hpVar.S3(tL_contacts_found.chats, false);
                    ArrayList arrayList7 = new ArrayList();
                    for (int i16 = 0; i16 < tL_contacts_found.chats.size(); i16++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i16);
                        TLRPC.InputPeer l12 = hp.l1(chat2);
                        if (chat2.f27001id != j10 && org.telegram.messenger.t3.R(chat2)) {
                            arrayList7.add(l12);
                        }
                    }
                    org.telegram.messenger.g0.h3(new u9.a(23, t0Var, arrayList7));
                    return;
                }
                return;
        }
    }

    public u2(Object obj, Object obj2, long j10, int i3) {
        this.f6080a = i3;
        this.f6082c = obj;
        this.d = obj2;
        this.f6081b = j10;
    }
}
