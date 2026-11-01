package org.telegram.messenger;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.pg0;
import org.telegram.ui.wa1;
public final class o00 implements Runnable {
    public final int f17367a;
    public final long f17368b;
    public final int f17369c;
    public final Object d;
    public final Object e;
    public final Object f17370f;
    public final Object h;

    public o00(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var) {
        this.f17367a = 5;
        this.f17369c = i10;
        this.d = context;
        this.f17368b = j10;
        this.e = connectedbotstarref;
        this.f17370f = z2Var;
        this.h = p6Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f17367a) {
            case 0:
                y00 y00Var = (y00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.e;
                long j11 = this.f17368b;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f17370f;
                a0.h hVar = (a0.h) this.h;
                int i10 = this.f17369c;
                y00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                int i11 = 0;
                y00Var.getMessagesController().V3(tL_messages_forumTopics.users, false);
                y00Var.getMessagesController().P3(tL_messages_forumTopics.chats, false);
                y00Var.f19513c.put(j11, 0);
                y00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i10, tL_messages_forumTopics.count);
                y00Var.y(j11, true);
                y00Var.getMessagesStorage().C1(y00Var.getConnectionsManager().getCurrentTime(), -j11, (List) y00Var.f19511a.f(j11), true);
                y00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_forumTopics2.topics.isEmpty() && i10 == 1) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i0.a.g(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    int i12 = tL_forumTopic.top_message;
                    if (message != null) {
                        i11 = message.date;
                    }
                    y00Var.x(j11, tL_forumTopic.f19846id, i12, i11);
                    return;
                } else if (y00Var.l(j11) == null || y00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                    y00Var.h.l(j11);
                    y00Var.o(j11);
                    return;
                } else {
                    return;
                }
            case 1:
                org.telegram.ui.Cells.i6.a((org.telegram.ui.Cells.i6) this.d, (TLObject) this.e, (is) this.f17370f, this.f17368b, this.f17369c, (ArrayList) this.h);
                return;
            case 2:
                TLObject tLObject = (TLObject) this.d;
                int i13 = this.f17369c;
                vh.d dVar = (vh.d) this.e;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f17370f;
                long j12 = this.f17368b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    wp.r1(i13).V3(updates.users, false);
                    wp.r1(i13).P3(updates.chats, false);
                    ArrayList y02 = wp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = y02.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.h(i13, updates, 1));
                    if (groupCall != null && LaunchActivity.I1 != null) {
                        z2Var.dismiss();
                        rz.C(i13).r0(pz.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof org.telegram.ui.un) {
                                org.telegram.ui.un unVar = (org.telegram.ui.un) T;
                                if (unVar.a() == j12 && unVar.f42059f4 == 0) {
                                    return;
                                }
                            }
                            T.presentFragment(org.telegram.ui.un.ma(j12));
                            return;
                        }
                        return;
                    }
                    dVar.setLoading(false);
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    wp.r1(i13).V3(groupcall.users, false);
                    wp.r1(i13).P3(groupcall.chats, false);
                    if (LaunchActivity.I1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f19811id = groupCall2.f19804id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    z2Var.dismiss();
                    org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, i13, tL_inputGroupCall, false, groupcall.call, null);
                    rz.C(i13).r0(pz.a(j12, groupcall.call.invite_link));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.f1.s(z2Var.E, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 3:
                final pg0 pg0Var = (pg0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.f17370f;
                long j13 = this.f17368b;
                final int i15 = this.f17369c;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j14 = j13;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj2 = vector.objects.get(i16);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i17 = tL_readParticipantDate.date;
                            j10 = j14;
                            long j15 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j15);
                            if (j10 != j15) {
                                wp.r1(i15).Z1(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i17)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j10 = j14;
                            if (obj2 instanceof Long) {
                                Long l4 = (Long) obj2;
                                if (j10 != l4.longValue()) {
                                    if (l4.longValue() > 0) {
                                        wp.r1(i15).Z1(l4);
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList.add(l4);
                                    } else {
                                        wp.r1(i15).L0(Long.valueOf(-l4.longValue()));
                                        arrayList3.add(new Pair(l4, 0));
                                        arrayList2.add(l4);
                                    }
                                }
                            }
                        }
                        i16++;
                        j14 = j10;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                            Pair pair = (Pair) arrayList3.get(i18);
                            pg0Var.f40475a.add((Long) pair.first);
                            pg0Var.f40476b.add((Integer) pair.second);
                            pg0Var.f40477c.add((TLObject) hashMap.get(pair.first));
                        }
                        pg0Var.b();
                        return;
                    } else if (w3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = wp.r1(i15).f19213p3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = wp.r1(i15).g1(chat.f19794id);
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final pg0 pg0Var2 = pg0Var;
                                        final int i19 = i15;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        pg0 pg0Var3 = pg0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user, false, false);
                                                                    hashMap3.put(Long.valueOf(user.f19943id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i20 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i20);
                                                                            pg0Var3.f40475a.add((Long) pair2.first);
                                                                            pg0Var3.f40476b.add((Integer) pair2.second);
                                                                            pg0Var3.f40477c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var3.b();
                                                        return;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19943id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.f40475a.add((Long) pair3.first);
                                                                            pg0Var4.f40476b.add((Integer) pair3.second);
                                                                            pg0Var4.f40477c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final pg0 pg0Var3 = pg0Var;
                                        final int i20 = i15;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        pg0 pg0Var32 = pg0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.wp.r1(i20).U3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.f19943id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            pg0Var32.f40475a.add((Long) pair2.first);
                                                                            pg0Var32.f40476b.add((Integer) pair2.second);
                                                                            pg0Var32.f40477c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var32.b();
                                                        return;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i20).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19943id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.f40475a.add((Long) pair3.first);
                                                                            pg0Var4.f40476b.add((Integer) pair3.second);
                                                                            pg0Var4.f40477c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f19794id;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final pg0 pg0Var2 = pg0Var;
                                        final int i19 = i15;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        pg0 pg0Var32 = pg0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.f19943id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            pg0Var32.f40475a.add((Long) pair2.first);
                                                                            pg0Var32.f40476b.add((Integer) pair2.second);
                                                                            pg0Var32.f40477c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var32.b();
                                                        return;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i19).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19943id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.f40475a.add((Long) pair3.first);
                                                                            pg0Var4.f40476b.add((Integer) pair3.second);
                                                                            pg0Var4.f40477c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final pg0 pg0Var3 = pg0Var;
                                        final int i20 = i15;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.i0.g3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        pg0 pg0Var32 = pg0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            pg0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.wp.r1(i20).U3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.f19943id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            pg0Var32.f40475a.add((Long) pair2.first);
                                                                            pg0Var32.f40476b.add((Integer) pair2.second);
                                                                            pg0Var32.f40477c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var32.b();
                                                        return;
                                                    default:
                                                        pg0 pg0Var4 = pg0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            pg0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.wp.r1(i20).U3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f19943id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            pg0Var4.f40475a.add((Long) pair3.first);
                                                                            pg0Var4.f40476b.add((Integer) pair3.second);
                                                                            pg0Var4.f40477c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        pg0Var4.b();
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
                pg0Var.b();
                return;
            case 4:
                ((rh.d0) this.d).k((ArrayList) this.e, Integer.valueOf(this.f17369c), Long.valueOf(this.f17368b), (ArrayList) this.f17370f, (ArrayList) this.h);
                return;
            default:
                int i19 = this.f17369c;
                Context context = (Context) this.d;
                long j16 = this.f17368b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.e;
                rh.r.g(i19).f(context, j16, connectedbotstarref.bot_id, new wa1(i19, j16, context, connectedbotstarref, (org.telegram.ui.ActionBar.z2) this.f17370f, (org.telegram.ui.ActionBar.p6) this.h));
                return;
        }
    }

    public o00(Object obj, TLObject tLObject, Object obj2, long j10, int i10, Object obj3, int i11) {
        this.f17367a = i11;
        this.d = obj;
        this.e = tLObject;
        this.f17370f = obj2;
        this.f17368b = j10;
        this.f17369c = i10;
        this.h = obj3;
    }

    public o00(y00 y00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i10) {
        this.f17367a = 0;
        this.d = y00Var;
        this.e = tL_messages_forumTopics;
        this.f17368b = j10;
        this.f17370f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f17369c = i10;
    }

    public o00(TLObject tLObject, int i10, vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, long j10, TLRPC.TL_error tL_error) {
        this.f17367a = 2;
        this.d = tLObject;
        this.f17369c = i10;
        this.e = dVar;
        this.f17370f = z2Var;
        this.f17368b = j10;
        this.h = tL_error;
    }

    public o00(rh.d0 d0Var, ArrayList arrayList, int i10, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.f17367a = 4;
        this.d = d0Var;
        this.e = arrayList;
        this.f17369c = i10;
        this.f17368b = j10;
        this.f17370f = arrayList2;
        this.h = arrayList3;
    }
}
