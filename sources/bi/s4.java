package bi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.d00;
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
import org.telegram.ui.Components.i21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.lf0;
public final class s4 implements Runnable {
    public final int f4049a;
    public final int f4050b;
    public final long f4051c;
    public final Object d;
    public final Object f4052e;
    public final Object f4053f;
    public final Object h;

    public s4(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f4049a = 2;
        this.f4050b = i7;
        this.d = context;
        this.f4051c = j3;
        this.f4052e = connectedbotstarref;
        this.f4053f = w2Var;
        this.h = i6Var;
    }

    @Override
    public final void run() {
        int i7;
        int i10;
        int i11;
        Vector vector;
        TLRPC.GroupCall groupCall = null;
        switch (this.f4049a) {
            case 0:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f4052e;
                String str = (String) this.h;
                int i12 = this.f4050b;
                long j3 = this.f4051c;
                ((di.k1) this.d).run();
                if (((Boolean) this.f4053f).booleanValue()) {
                    i7 = 2131749517;
                } else {
                    i7 = 2131749518;
                }
                a5.s(tL_starGiftUnique, gd.a0(null, null, i7, str));
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    org.telegram.messenger.g0.h3(new r4(i12, 0, j3, str2, true), a5.f3354a[0]);
                    return;
                }
                return;
            case 1:
                ((a1.c) this.d).k((ArrayList) this.f4052e, Integer.valueOf(this.f4050b), Long.valueOf(this.f4051c), (ArrayList) this.f4053f, (ArrayList) this.h);
                return;
            case 2:
                int i13 = this.f4050b;
                Context context = (Context) this.d;
                long j10 = this.f4051c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f4052e;
                di.e0.g(i13).f(context, j10, connectedbotstarref.bot_id, new c4(i13, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.w2) this.f4053f, (org.telegram.ui.ActionBar.i6) this.h));
                return;
            case 3:
                d00 d00Var = (d00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.f4052e;
                long j11 = this.f4051c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f4053f;
                a0.h hVar = (a0.h) this.h;
                int i14 = this.f4050b;
                d00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                d00Var.getMessagesController().f4(tL_messages_forumTopics.users, false);
                d00Var.getMessagesController().Z3(tL_messages_forumTopics.chats, false);
                d00Var.f23572c.put(j11, 0);
                ArrayList<Long> arrayList = tL_messages_forumTopics2.top_icons;
                if (arrayList != null) {
                    d00Var.f23574f.k(arrayList, j11);
                    d00Var.h.put(j11, System.currentTimeMillis());
                }
                d00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i14, tL_messages_forumTopics.count);
                d00Var.y(j11, true);
                d00Var.getMessagesStorage().C1(d00Var.getConnectionsManager().getCurrentTime(), -j11, (List) d00Var.f23570a.f(j11), true);
                d00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_forumTopics2.topics.isEmpty() && i14 == 1) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i5.c.h(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    int i15 = tL_forumTopic.top_message;
                    if (message == null) {
                        i10 = 0;
                    } else {
                        i10 = message.date;
                    }
                    d00Var.x(j11, tL_forumTopic.f28544id, i15, i10);
                    return;
                } else if (d00Var.l(j11) == null || d00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                    d00Var.f23577s.l(j11);
                    d00Var.o(j11);
                    return;
                } else {
                    return;
                }
            case 4:
                org.telegram.ui.Cells.e6.a((org.telegram.ui.Cells.e6) this.d, (TLObject) this.f4052e, (tr) this.f4053f, this.f4051c, this.f4050b, (ArrayList) this.h);
                return;
            case 5:
                TLObject tLObject = (TLObject) this.d;
                int i16 = this.f4050b;
                hi.e eVar = (hi.e) this.f4052e;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.f4053f;
                long j12 = this.f4051c;
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
                    Utilities.d.c(new org.telegram.tgnet.h(i16, updates, 1));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        w2Var.dismiss();
                        zy.C(i16).r0(xy.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof bn) {
                                bn bnVar = (bn) T;
                                if (bnVar.a() == j12 && bnVar.f46204g4 == 0) {
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
                    tL_inputGroupCall.f28509id = groupCall2.f28502id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    w2Var.dismiss();
                    org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i16, tL_inputGroupCall, false, groupcall.call, null);
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
                TLRPC.Message message2 = (TLRPC.Message) this.f4052e;
                String str3 = (String) this.h;
                int[] iArr = (int[]) this.f4053f;
                int i18 = this.f4050b;
                long j13 = this.f4051c;
                HashMap hashMap = i21.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(i21.r(fjVar)));
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
                i21.q(fjVar);
                tr a02 = tr.a0(i18);
                a02.f27149a.c(new org.telegram.messenger.z1(a02, fjVar.e1(), j13, message2, str3, 2));
                ks f10 = ks.f(i18);
                Boolean bool = Boolean.TRUE;
                f10.k(115, fjVar, null, null, bool, bool);
                return;
            default:
                final lf0 lf0Var = (lf0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f4052e;
                TLObject tLObject2 = (TLObject) this.f4053f;
                long j14 = this.f4051c;
                final int i19 = this.f4050b;
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
                            lf0Var.f49744a.add((Long) pair.first);
                            lf0Var.f49745b.add((Integer) pair.second);
                            lf0Var.f49746c.add((TLObject) hashMap2.get(pair.first));
                        }
                        lf0Var.b();
                        return;
                    } else if (org.telegram.messenger.v3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = mp.u1(i19).f25853s3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = mp.u1(i19).j1(chat.f28492id);
                        ConnectionsManager.getInstance(i19).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final lf0 lf0Var2 = lf0Var;
                                        final int i23 = i19;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList5 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        lf0 lf0Var3 = lf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            lf0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user, false, false);
                                                                    hashMap4.put(Long.valueOf(user.f28641id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair2 = (Pair) arrayList6.get(i24);
                                                                            lf0Var3.f49744a.add((Long) pair2.first);
                                                                            lf0Var3.f49745b.add((Integer) pair2.second);
                                                                            lf0Var3.f49746c.add((TLObject) hashMap4.get(pair2.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var3.b();
                                                        return;
                                                    default:
                                                        lf0 lf0Var4 = lf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            lf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28641id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            lf0Var4.f49744a.add((Long) pair3.first);
                                                                            lf0Var4.f49745b.add((Integer) pair3.second);
                                                                            lf0Var4.f49746c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final lf0 lf0Var3 = lf0Var;
                                        final int i24 = i19;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList6 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        lf0 lf0Var32 = lf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            lf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28641id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            lf0Var32.f49744a.add((Long) pair2.first);
                                                                            lf0Var32.f49745b.add((Integer) pair2.second);
                                                                            lf0Var32.f49746c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var32.b();
                                                        return;
                                                    default:
                                                        lf0 lf0Var4 = lf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            lf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28641id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            lf0Var4.f49744a.add((Long) pair3.first);
                                                                            lf0Var4.f49745b.add((Integer) pair3.second);
                                                                            lf0Var4.f49746c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f28492id;
                        ConnectionsManager.getInstance(i19).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final lf0 lf0Var2 = lf0Var;
                                        final int i23 = i19;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList5 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        lf0 lf0Var32 = lf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            lf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap3;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28641id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList5;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            lf0Var32.f49744a.add((Long) pair2.first);
                                                                            lf0Var32.f49745b.add((Integer) pair2.second);
                                                                            lf0Var32.f49746c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var32.b();
                                                        return;
                                                    default:
                                                        lf0 lf0Var4 = lf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            lf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i23).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28641id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList5;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            lf0Var4.f49744a.add((Long) pair3.first);
                                                                            lf0Var4.f49745b.add((Integer) pair3.second);
                                                                            lf0Var4.f49746c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final lf0 lf0Var3 = lf0Var;
                                        final int i24 = i19;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList6 = arrayList4;
                                        org.telegram.messenger.g0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        lf0 lf0Var32 = lf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            lf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i242 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i25 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i25);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28641id), user);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList62 = arrayList6;
                                                                        if (i242 < arrayList62.size()) {
                                                                            Pair pair2 = (Pair) arrayList62.get(i242);
                                                                            lf0Var32.f49744a.add((Long) pair2.first);
                                                                            lf0Var32.f49745b.add((Integer) pair2.second);
                                                                            lf0Var32.f49746c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i242++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var32.b();
                                                        return;
                                                    default:
                                                        lf0 lf0Var4 = lf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            lf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i26 = 0;
                                                            int i27 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i27 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i27);
                                                                    org.telegram.messenger.mp.u1(i24).e4(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28641id), user2);
                                                                    i27++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList7 = arrayList6;
                                                                        if (i26 < arrayList7.size()) {
                                                                            Pair pair3 = (Pair) arrayList7.get(i26);
                                                                            lf0Var4.f49744a.add((Long) pair3.first);
                                                                            lf0Var4.f49745b.add((Integer) pair3.second);
                                                                            lf0Var4.f49746c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i26++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        lf0Var4.b();
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
                lf0Var.b();
                return;
        }
    }

    public s4(a1.c cVar, ArrayList arrayList, int i7, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.f4049a = 1;
        this.d = cVar;
        this.f4052e = arrayList;
        this.f4050b = i7;
        this.f4051c = j3;
        this.f4053f = arrayList2;
        this.h = arrayList3;
    }

    public s4(di.k1 k1Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Boolean bool, String str, int i7, long j3) {
        this.f4049a = 0;
        this.d = k1Var;
        this.f4052e = tL_starGiftUnique;
        this.f4053f = bool;
        this.h = str;
        this.f4050b = i7;
        this.f4051c = j3;
    }

    public s4(Object obj, TLObject tLObject, Object obj2, long j3, int i7, Object obj3, int i10) {
        this.f4049a = i10;
        this.d = obj;
        this.f4052e = tLObject;
        this.f4053f = obj2;
        this.f4051c = j3;
        this.f4050b = i7;
        this.h = obj3;
    }

    public s4(fj fjVar, TLRPC.Message message, String str, int[] iArr, int i7, long j3) {
        this.f4049a = 6;
        this.d = fjVar;
        this.f4052e = message;
        this.h = str;
        this.f4053f = iArr;
        this.f4050b = i7;
        this.f4051c = j3;
    }

    public s4(d00 d00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i7) {
        this.f4049a = 3;
        this.d = d00Var;
        this.f4052e = tL_messages_forumTopics;
        this.f4051c = j3;
        this.f4053f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f4050b = i7;
    }

    public s4(TLObject tLObject, int i7, hi.e eVar, org.telegram.ui.ActionBar.w2 w2Var, long j3, TLRPC.TL_error tL_error) {
        this.f4049a = 5;
        this.d = tLObject;
        this.f4050b = i7;
        this.f4052e = eVar;
        this.f4053f = w2Var;
        this.f4051c = j3;
        this.h = tL_error;
    }
}
