package ci;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c00;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.df0;
import org.telegram.ui.wm;
public final class d8 implements Runnable {
    public final int f4981a = 1;
    public final int f4982b;
    public final long f4983c;
    public final Object d;
    public final Object f4984e;
    public final Object f4985f;
    public final Object h;

    public d8(int i3, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f4982b = i3;
        this.d = context;
        this.f4983c = j10;
        this.f4984e = connectedbotstarref;
        this.f4985f = t2Var;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f4981a) {
            case 0:
                ((a1.c) this.d).j((ArrayList) this.f4984e, Integer.valueOf(this.f4982b), Long.valueOf(this.f4983c), (ArrayList) this.f4985f, (ArrayList) this.h);
                return;
            case 1:
                int i3 = this.f4982b;
                Context context = (Context) this.d;
                long j11 = this.f4983c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f4984e;
                i0.g(i3).f(context, j11, connectedbotstarref.bot_id, new ii.f3(i3, j11, context, connectedbotstarref, (org.telegram.ui.ActionBar.t2) this.f4985f, (org.telegram.ui.ActionBar.e6) this.h));
                return;
            case 2:
                c00 c00Var = (c00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.f4984e;
                long j12 = this.f4983c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f4985f;
                a0.h hVar = (a0.h) this.h;
                int i10 = this.f4982b;
                c00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                int i11 = 0;
                c00Var.getMessagesController().Y3(tL_messages_forumTopics.users, false);
                c00Var.getMessagesController().S3(tL_messages_forumTopics.chats, false);
                c00Var.f21924c.put(j12, 0);
                c00Var.u(j12, tL_messages_forumTopics2.topics, hVar, false, i10, tL_messages_forumTopics.count);
                c00Var.y(j12, true);
                c00Var.getMessagesStorage().C1(c00Var.getConnectionsManager().getCurrentTime(), -j12, (List) c00Var.f21922a.f(j12), true);
                c00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_forumTopics2.topics.isEmpty() && i10 == 1) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) k2.p1.h(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    int i12 = tL_forumTopic.top_message;
                    if (message != null) {
                        i11 = message.date;
                    }
                    c00Var.x(j12, tL_forumTopic.f27053id, i12, i11);
                    return;
                } else if (c00Var.l(j12) == null || c00Var.l(j12).size() < tL_messages_forumTopics2.count) {
                    c00Var.h.l(j12);
                    c00Var.o(j12);
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.d6.a((org.telegram.ui.Cells.d6) this.d, (TLObject) this.f4985f, (qr) this.h, this.f4983c, this.f4982b, (ArrayList) this.f4984e);
                return;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i13 = this.f4982b;
                gi.d dVar = (gi.d) this.f4984e;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) this.f4985f;
                long j13 = this.f4983c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                TLRPC.GroupCall groupCall = null;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    hp.s1(i13).Y3(updates.users, false);
                    hp.s1(i13).S3(updates.chats, false);
                    ArrayList y02 = hp.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = y02.get(i14);
                        i14++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i13, updates, 1));
                    if (groupCall != null && LaunchActivity.K1 != null) {
                        t2Var.dismiss();
                        yy.C(i13).r0(wy.a(j13, groupCall.invite_link));
                        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof wm) {
                                wm wmVar = (wm) T;
                                if (wmVar.a() == j13 && wmVar.f51325g4 == 0) {
                                    return;
                                }
                            }
                            T.presentFragment(wm.ra(j13));
                            return;
                        }
                        return;
                    }
                    dVar.setLoading(false);
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    hp.s1(i13).Y3(groupcall.users, false);
                    hp.s1(i13).S3(groupcall.chats, false);
                    if (LaunchActivity.K1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f27018id = groupCall2.f27011id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    t2Var.dismiss();
                    org.telegram.ui.Components.voip.n1.g(LaunchActivity.K1, i13, tL_inputGroupCall, false, groupcall.call, null);
                    yy.C(i13).r0(wy.a(j13, groupcall.call.invite_link));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.f1.v(t2Var.F, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            default:
                final df0 df0Var = (df0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f4984e;
                TLObject tLObject2 = (TLObject) this.f4985f;
                long j14 = this.f4983c;
                final int i15 = this.f4982b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j15 = j14;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        Object obj2 = vector.objects.get(i16);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i17 = tL_readParticipantDate.date;
                            j10 = j15;
                            long j16 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j16);
                            if (j10 != j16) {
                                hp.s1(i15).a2(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i17)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            j10 = j15;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j10 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        hp.s1(i15).a2(l10);
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList.add(l10);
                                    } else {
                                        hp.s1(i15).M0(Long.valueOf(-l10.longValue()));
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                    }
                                }
                            }
                        }
                        i16++;
                        j15 = j10;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                            Pair pair = (Pair) arrayList3.get(i18);
                            df0Var.f44675a.add((Long) pair.first);
                            df0Var.f44676b.add((Integer) pair.second);
                            df0Var.f44677c.add((TLObject) hashMap.get(pair.first));
                        }
                        df0Var.b();
                        return;
                    } else if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = hp.s1(i15).f23098q3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = hp.s1(i15).h1(chat.f27001id);
                        ConnectionsManager.getInstance(i15).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final int i19 = i15;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        df0 df0Var3 = df0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            df0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i20 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap3 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.hp.s1(i19).X3(user, false, false);
                                                                    hashMap3.put(Long.valueOf(user.f27150id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i20 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i20);
                                                                            df0Var3.f44675a.add((Long) pair2.first);
                                                                            df0Var3.f44676b.add((Integer) pair2.second);
                                                                            df0Var3.f44677c.add((TLObject) hashMap3.get(pair2.first));
                                                                            i20++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var3.b();
                                                        return;
                                                    default:
                                                        df0 df0Var4 = df0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            df0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.hp.s1(i19).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f27150id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            df0Var4.f44675a.add((Long) pair3.first);
                                                                            df0Var4.f44676b.add((Integer) pair3.second);
                                                                            df0Var4.f44677c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final df0 df0Var3 = df0Var;
                                        final int i20 = i15;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        df0 df0Var32 = df0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            df0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.hp.s1(i20).X3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.f27150id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            df0Var32.f44675a.add((Long) pair2.first);
                                                                            df0Var32.f44676b.add((Integer) pair2.second);
                                                                            df0Var32.f44677c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var32.b();
                                                        return;
                                                    default:
                                                        df0 df0Var4 = df0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            df0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.hp.s1(i20).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f27150id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            df0Var4.f44675a.add((Long) pair3.first);
                                                                            df0Var4.f44676b.add((Integer) pair3.second);
                                                                            df0Var4.f44677c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f27001id;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final int i19 = i15;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        df0 df0Var32 = df0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            df0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap2;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.hp.s1(i19).X3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.f27150id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            df0Var32.f44675a.add((Long) pair2.first);
                                                                            df0Var32.f44676b.add((Integer) pair2.second);
                                                                            df0Var32.f44677c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var32.b();
                                                        return;
                                                    default:
                                                        df0 df0Var4 = df0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            df0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap2;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.hp.s1(i19).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f27150id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            df0Var4.f44675a.add((Long) pair3.first);
                                                                            df0Var4.f44676b.add((Integer) pair3.second);
                                                                            df0Var4.f44677c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final df0 df0Var3 = df0Var;
                                        final int i20 = i15;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        df0 df0Var32 = df0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            df0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i202 = 0;
                                                            int i21 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap32 = hashMap3;
                                                                if (i21 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i21);
                                                                    org.telegram.messenger.hp.s1(i20).X3(user, false, false);
                                                                    hashMap32.put(Long.valueOf(user.f27150id), user);
                                                                    i21++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i202 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i202);
                                                                            df0Var32.f44675a.add((Long) pair2.first);
                                                                            df0Var32.f44676b.add((Integer) pair2.second);
                                                                            df0Var32.f44677c.add((TLObject) hashMap32.get(pair2.first));
                                                                            i202++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var32.b();
                                                        return;
                                                    default:
                                                        df0 df0Var4 = df0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            df0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i23);
                                                                    org.telegram.messenger.hp.s1(i20).X3(user2, false, false);
                                                                    hashMap4.put(Long.valueOf(user2.f27150id), user2);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i22 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i22);
                                                                            df0Var4.f44675a.add((Long) pair3.first);
                                                                            df0Var4.f44676b.add((Integer) pair3.second);
                                                                            df0Var4.f44677c.add((TLObject) hashMap4.get(pair3.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        df0Var4.b();
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
                df0Var.b();
                return;
        }
    }

    public d8(a1.c cVar, ArrayList arrayList, int i3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = cVar;
        this.f4984e = arrayList;
        this.f4982b = i3;
        this.f4983c = j10;
        this.f4985f = arrayList2;
        this.h = arrayList3;
    }

    public d8(c00 c00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j10, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i3) {
        this.d = c00Var;
        this.f4984e = tL_messages_forumTopics;
        this.f4983c = j10;
        this.f4985f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f4982b = i3;
    }

    public d8(TLObject tLObject, int i3, gi.d dVar, org.telegram.ui.ActionBar.t2 t2Var, long j10, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.f4982b = i3;
        this.f4984e = dVar;
        this.f4985f = t2Var;
        this.f4983c = j10;
        this.h = tL_error;
    }

    public d8(org.telegram.ui.Cells.d6 d6Var, TLObject tLObject, qr qrVar, long j10, int i3, ArrayList arrayList) {
        this.d = d6Var;
        this.f4985f = tLObject;
        this.h = qrVar;
        this.f4983c = j10;
        this.f4982b = i3;
        this.f4984e = arrayList;
    }

    public d8(df0 df0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j10, int i3, TLRPC.Chat chat) {
        this.d = df0Var;
        this.f4984e = tL_error;
        this.f4985f = tLObject;
        this.f4983c = j10;
        this.f4982b = i3;
        this.h = chat;
    }
}
