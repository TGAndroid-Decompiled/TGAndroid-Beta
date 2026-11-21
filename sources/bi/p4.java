package bi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e00;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.j21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.mf0;
public final class p4 implements Runnable {
    public final int f3995a;
    public final int f3996b;
    public final long f3997c;
    public final Object d;
    public final Object f3998e;
    public final Object f3999f;
    public final Object h;

    public p4(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var) {
        this.f3995a = 2;
        this.f3996b = i7;
        this.d = context;
        this.f3997c = j3;
        this.f3998e = connectedbotstarref;
        this.f3999f = w2Var;
        this.h = h6Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        Vector vector;
        TLRPC.GroupCall groupCall = null;
        switch (this.f3995a) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f3998e;
                String str = (String) this.h;
                int i12 = this.f3996b;
                long j3 = this.f3997c;
                ((di.k1) this.d).run();
                if (((Boolean) this.f3999f).booleanValue()) {
                    i7 = 2131749517;
                } else {
                    i7 = 2131749518;
                }
                y4.s(tL_starGiftUnique, gd.a0(null, null, i7, str));
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    org.telegram.messenger.g0.h3(new o4(i12, 0, j3, str2, true), y4.f4286a[0]);
                    return;
                }
                return;
            case 1:
                ((a1.c) this.d).l((ArrayList) this.f3998e, Integer.valueOf(this.f3996b), Long.valueOf(this.f3997c), (ArrayList) this.f3999f, (ArrayList) this.h);
                return;
            case 2:
                int i13 = this.f3996b;
                Context context = (Context) this.d;
                long j10 = this.f3997c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f3998e;
                di.e0.g(i13).f(context, j10, connectedbotstarref.bot_id, new a4(i13, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.w2) this.f3999f, (org.telegram.ui.ActionBar.h6) this.h));
                return;
            case 3:
                e00 e00Var = (e00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.f3998e;
                long j11 = this.f3997c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f3999f;
                a0.h hVar = (a0.h) this.h;
                int i14 = this.f3996b;
                e00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                e00Var.getMessagesController().f4(tL_messages_forumTopics.users, false);
                e00Var.getMessagesController().Z3(tL_messages_forumTopics.chats, false);
                e00Var.f23650c.put(j11, 0);
                ArrayList<Long> arrayList = tL_messages_forumTopics2.top_icons;
                if (arrayList != null) {
                    e00Var.f23652f.k(arrayList, j11);
                    e00Var.h.put(j11, System.currentTimeMillis());
                }
                e00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i14, tL_messages_forumTopics.count);
                e00Var.y(j11, true);
                e00Var.getMessagesStorage().C1(e00Var.getConnectionsManager().getCurrentTime(), -j11, (List) e00Var.f23648a.f(j11), true);
                e00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_forumTopics2.topics.isEmpty() && i14 == 1) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i5.c.h(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    int i15 = tL_forumTopic.top_message;
                    if (message == null) {
                        i10 = 0;
                    } else {
                        i10 = message.date;
                    }
                    e00Var.x(j11, tL_forumTopic.f28483id, i15, i10);
                    return;
                } else if (e00Var.l(j11) == null || e00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                    e00Var.f23655s.l(j11);
                    e00Var.o(j11);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.f6.a((org.telegram.ui.Cells.f6) this.d, (TLObject) this.f3998e, (tr) this.f3999f, this.f3997c, this.f3996b, (ArrayList) this.h);
                return;
            case 5:
                TLObject tLObject = (TLObject) this.d;
                int i16 = this.f3996b;
                hi.e eVar = (hi.e) this.f3998e;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f3999f;
                long j12 = this.f3997c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(i16).f4(updates.users, false);
                    mp.u1(i16).Z3(updates.chats, false);
                    ArrayList A0 = mp.A0(updates, TL_update.TL_updateGroupCall.class);
                    int size = A0.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = A0.get(i17);
                        i17++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i16, updates, 1));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        w2Var.dismiss();
                        zy.C(i16).r0(xy.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof bn) {
                                bn bnVar = (bn) T;
                                if (bnVar.a() == j12 && bnVar.f46032g4 == 0) {
                                    return;
                                }
                            }
                            T.presentFragment(bn.ua(j12));
                            return;
                        }
                        return;
                    }
                    eVar.setLoading(false);
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    mp.u1(i16).f4(groupcall.users, false);
                    mp.u1(i16).Z3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        eVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f28448id = groupCall2.f28441id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    w2Var.dismiss();
                    org.telegram.ui.Components.voip.b2.g(LaunchActivity.H1, i16, tL_inputGroupCall, false, groupcall.call, null);
                    zy.C(i16).r0(xy.a(j12, groupcall.call.invite_link));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.c0.t(w2Var.F, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 6:
                fj fjVar = (fj) this.d;
                TLRPC.Message message2 = (TLRPC.Message) this.f3998e;
                String str3 = (String) this.h;
                int[] iArr = (int[]) this.f3999f;
                int i18 = this.f3996b;
                long j13 = this.f3997c;
                HashMap hashMap = j21.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(j21.q(fjVar)));
                }
                message2.voiceTranscription = str3;
                if (iArr.length <= 0) {
                    iArr = null;
                }
                message2.voiceTranscriptionWords = iArr;
                message2.voiceTranscriptionLocal = true;
                message2.voiceTranscriptionFinal = true;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionId = 0L;
                j21.p(fjVar);
                tr a02 = tr.a0(i18);
                a02.f27080a.c(new org.telegram.messenger.z1(a02, fjVar.e1(), j13, message2, str3, 2));
                ks f10 = ks.f(i18);
                Boolean bool = Boolean.TRUE;
                f10.k(115, fjVar, null, null, bool, bool);
                return;
            default:
                final mf0 mf0Var = (mf0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f3998e;
                TLObject tLObject2 = (TLObject) this.f3999f;
                long j14 = this.f3997c;
                final int i19 = this.f3996b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector2 = (Vector) tLObject2;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    final HashMap hashMap2 = new HashMap();
                    final ArrayList arrayList4 = new ArrayList();
                    int size2 = vector2.objects.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj2 = vector2.objects.get(i20);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i21 = tL_readParticipantDate.date;
                            i11 = i20;
                            long j15 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j15);
                            if (j14 != j15) {
                                mp.u1(i19).c2(valueOf);
                                arrayList4.add(new Pair(valueOf, Integer.valueOf(i21)));
                                arrayList2.add(valueOf);
                            }
                        } else {
                            i11 = i20;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j14 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        mp.u1(i19).c2(l10);
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    } else {
                                        vector = vector2;
                                        mp.u1(i19).O0(Long.valueOf(-l10.longValue()));
                                        arrayList4.add(new Pair(l10, 0));
                                        arrayList3.add(l10);
                                        i20 = i11 + 1;
                                        vector2 = vector;
                                    }
                                }
                            }
                        }
                        vector = vector2;
                        i20 = i11 + 1;
                        vector2 = vector;
                    }
                    if (arrayList2.isEmpty()) {
                        for (int i22 = 0; i22 < arrayList4.size(); i22++) {
                            Pair pair = (Pair) arrayList4.get(i22);
                            mf0Var.f49866a.add((Long) pair.first);
                            mf0Var.f49867b.add((Integer) pair.second);
                            mf0Var.f49868c.add((TLObject) hashMap2.get(pair.first));
                        }
                        mf0Var.b();
                        return;
                    } else if (org.telegram.messenger.v3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = mp.u1(i19).f25786s3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = mp.u1(i19).j1(chat.f28431id);
                        ConnectionsManager.getInstance(i19).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final mf0 mf0Var2 = mf0Var;
                                        final int i23 = i19;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList5 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        mf0 mf0Var3 = mf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user, false, false);
                                                                    hashMap4.put(Long.valueOf(user.f28580id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i24);
                                                                            mf0Var3.f49866a.add((Long) pair2.first);
                                                                            mf0Var3.f49867b.add((Integer) pair2.second);
                                                                            mf0Var3.f49868c.add((TLObject) hashMap4.get(pair2.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var3.b();
                                                        return;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28580id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.f49866a.add((Long) pair3.first);
                                                                            mf0Var4.f49867b.add((Integer) pair3.second);
                                                                            mf0Var4.f49868c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final mf0 mf0Var3 = mf0Var;
                                        final int i24 = i19;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList6 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        mf0 mf0Var32 = mf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28580id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            mf0Var32.f49866a.add((Long) pair2.first);
                                                                            mf0Var32.f49867b.add((Integer) pair2.second);
                                                                            mf0Var32.f49868c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var32.b();
                                                        return;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28580id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.f49866a.add((Long) pair3.first);
                                                                            mf0Var4.f49867b.add((Integer) pair3.second);
                                                                            mf0Var4.f49868c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                }
                            }
                        });
                        return;
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat.f28431id;
                        ConnectionsManager.getInstance(i19).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final mf0 mf0Var2 = mf0Var;
                                        final int i23 = i19;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList5 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        mf0 mf0Var32 = mf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap3;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28580id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList5;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            mf0Var32.f49866a.add((Long) pair2.first);
                                                                            mf0Var32.f49867b.add((Integer) pair2.second);
                                                                            mf0Var32.f49868c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var32.b();
                                                        return;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28580id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.f49866a.add((Long) pair3.first);
                                                                            mf0Var4.f49867b.add((Integer) pair3.second);
                                                                            mf0Var4.f49868c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final mf0 mf0Var3 = mf0Var;
                                        final int i24 = i19;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList6 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        mf0 mf0Var32 = mf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            mf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28580id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            mf0Var32.f49866a.add((Long) pair2.first);
                                                                            mf0Var32.f49867b.add((Integer) pair2.second);
                                                                            mf0Var32.f49868c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var32.b();
                                                        return;
                                                    default:
                                                        mf0 mf0Var4 = mf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            mf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28580id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            mf0Var4.f49866a.add((Long) pair3.first);
                                                                            mf0Var4.f49867b.add((Integer) pair3.second);
                                                                            mf0Var4.f49868c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        mf0Var4.b();
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
                }
                mf0Var.b();
                return;
        }
    }

    public p4(a1.c cVar, ArrayList arrayList, int i7, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.f3995a = 1;
        this.d = cVar;
        this.f3998e = arrayList;
        this.f3996b = i7;
        this.f3997c = j3;
        this.f3999f = arrayList2;
        this.h = arrayList3;
    }

    public p4(di.k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Boolean bool, String str, int i7, long j3) {
        this.f3995a = 0;
        this.d = k1Var;
        this.f3998e = tL_starGiftUnique;
        this.f3999f = bool;
        this.h = str;
        this.f3996b = i7;
        this.f3997c = j3;
    }

    public p4(Object obj, TLObject tLObject, Object obj2, long j3, int i7, Object obj3, int i10) {
        this.f3995a = i10;
        this.d = obj;
        this.f3998e = tLObject;
        this.f3999f = obj2;
        this.f3997c = j3;
        this.f3996b = i7;
        this.h = obj3;
    }

    public p4(fj fjVar, TLRPC.Message message, String str, int[] iArr, int i7, long j3) {
        this.f3995a = 6;
        this.d = fjVar;
        this.f3998e = message;
        this.h = str;
        this.f3999f = iArr;
        this.f3996b = i7;
        this.f3997c = j3;
    }

    public p4(e00 e00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i7) {
        this.f3995a = 3;
        this.d = e00Var;
        this.f3998e = tL_messages_forumTopics;
        this.f3997c = j3;
        this.f3999f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f3996b = i7;
    }

    public p4(TLObject tLObject, int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3, TLRPC.TL_error tL_error) {
        this.f3995a = 5;
        this.d = tLObject;
        this.f3996b = i7;
        this.f3998e = eVar;
        this.f3999f = w2Var;
        this.f3997c = j3;
        this.h = tL_error;
    }
}
