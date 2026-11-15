package di;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.gj;
import org.telegram.messenger.h00;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.x11;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.jf0;
public final class v7 implements Runnable {
    public final int f9593a = 1;
    public final int f9594b;
    public final long f9595c;
    public final Object d;
    public final Object f9596e;
    public final Object f9597f;
    public final Object h;

    public v7(int i7, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f9594b = i7;
        this.d = context;
        this.f9595c = j3;
        this.f9596e = connectedbotstarref;
        this.f9597f = u2Var;
        this.h = e6Var;
    }

    @Override
    public final void run() {
        Vector vector;
        int i7;
        long j3;
        TLRPC.GroupCall groupCall = null;
        switch (this.f9593a) {
            case 0:
                ((a1.c) this.d).m((ArrayList) this.f9596e, Integer.valueOf(this.f9594b), Long.valueOf(this.f9595c), (ArrayList) this.f9597f, (ArrayList) this.h);
                return;
            case 1:
                int i10 = this.f9594b;
                Context context = (Context) this.d;
                long j10 = this.f9595c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f9596e;
                e0.g(i10).f(context, j10, connectedbotstarref.bot_id, new ki.c3(i10, j10, context, connectedbotstarref, (org.telegram.ui.ActionBar.u2) this.f9597f, (org.telegram.ui.ActionBar.e6) this.h));
                return;
            case 2:
                h00 h00Var = (h00) this.d;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) this.f9596e;
                long j11 = this.f9595c;
                TLRPC.TL_messages_forumTopics tL_messages_forumTopics2 = (TLRPC.TL_messages_forumTopics) this.f9597f;
                a0.h hVar = (a0.h) this.h;
                int i11 = this.f9594b;
                h00Var.getMessagesStorage().m1(tL_messages_forumTopics.users, tL_messages_forumTopics.chats, true, true);
                int i12 = 0;
                h00Var.getMessagesController().Y3(tL_messages_forumTopics.users, false);
                h00Var.getMessagesController().S3(tL_messages_forumTopics.chats, false);
                h00Var.f24010c.put(j11, 0);
                h00Var.u(j11, tL_messages_forumTopics2.topics, hVar, false, i11, tL_messages_forumTopics.count);
                h00Var.y(j11, true);
                h00Var.getMessagesStorage().C1(h00Var.getConnectionsManager().getCurrentTime(), -j11, (List) h00Var.f24008a.f(j11), true);
                h00Var.getMessagesStorage().j1(tL_messages_forumTopics2.messages, false, true, false, 0, false, 0, 0L);
                if (!tL_messages_forumTopics2.topics.isEmpty() && i11 == 1) {
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) i5.c.h(1, tL_messages_forumTopics2.topics);
                    TLRPC.Message message = (TLRPC.Message) hVar.f(tL_forumTopic.top_message);
                    int i13 = tL_forumTopic.top_message;
                    if (message != null) {
                        i12 = message.date;
                    }
                    h00Var.x(j11, tL_forumTopic.f28103id, i13, i12);
                    return;
                } else if (h00Var.l(j11) == null || h00Var.l(j11).size() < tL_messages_forumTopics2.count) {
                    h00Var.h.l(j11);
                    h00Var.o(j11);
                    return;
                } else {
                    return;
                }
            case 3:
                org.telegram.ui.Cells.d6.a((org.telegram.ui.Cells.d6) this.d, (TLObject) this.f9597f, (vr) this.h, this.f9595c, this.f9594b, (ArrayList) this.f9596e);
                return;
            case 4:
                TLObject tLObject = (TLObject) this.d;
                int i14 = this.f9594b;
                hi.d dVar = (hi.d) this.f9596e;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.f9597f;
                long j12 = this.f9595c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(i14).Y3(updates.users, false);
                    np.s1(i14).S3(updates.chats, false);
                    ArrayList y02 = np.y0(updates, TL_update.TL_updateGroupCall.class);
                    int size = y02.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = y02.get(i15);
                        i15++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new org.telegram.tgnet.g(i14, updates, 1));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        u2Var.dismiss();
                        ez.C(i14).r0(cz.a(j12, groupCall.invite_link));
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            if (T instanceof an) {
                                an anVar = (an) T;
                                if (anVar.a() == j12 && anVar.f45204g4 == 0) {
                                    return;
                                }
                            }
                            T.presentFragment(an.ua(j12));
                            return;
                        }
                        return;
                    }
                    dVar.setLoading(false);
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    np.s1(i14).Y3(groupcall.users, false);
                    np.s1(i14).S3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        dVar.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.f28068id = groupCall2.f28061id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    u2Var.dismiss();
                    org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, i14, tL_inputGroupCall, false, groupcall.call, null);
                    ez.C(i14).r0(cz.a(j12, groupcall.call.invite_link));
                    return;
                } else if (tL_error != null) {
                    org.telegram.ui.Cells.y0.q(u2Var.F, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 5:
                gj gjVar = (gj) this.d;
                TLRPC.Message message2 = (TLRPC.Message) this.f9596e;
                String str = (String) this.f9597f;
                int[] iArr = (int[]) this.h;
                int i16 = this.f9594b;
                long j13 = this.f9595c;
                HashMap hashMap = x11.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(x11.p(gjVar)));
                }
                message2.voiceTranscription = str;
                if (iArr.length <= 0) {
                    iArr = null;
                }
                message2.voiceTranscriptionWords = iArr;
                message2.voiceTranscriptionLocal = true;
                message2.voiceTranscriptionFinal = true;
                message2.voiceTranscriptionOpen = true;
                message2.voiceTranscriptionId = 0L;
                x11.o(gjVar);
                vr a02 = vr.a0(i16);
                a02.f27220a.c(new org.telegram.messenger.z1(a02, gjVar.e1(), j13, message2, str, 2));
                ns f10 = ns.f(i16);
                Boolean bool = Boolean.TRUE;
                f10.k(115, gjVar, null, null, bool, bool);
                return;
            default:
                final jf0 jf0Var = (jf0) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f9596e;
                TLObject tLObject2 = (TLObject) this.f9597f;
                long j14 = this.f9595c;
                final int i17 = this.f9594b;
                TLRPC.Chat chat = (TLRPC.Chat) this.h;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector2 = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j15 = j14;
                    final HashMap hashMap2 = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector2.objects.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj2 = vector2.objects.get(i18);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i19 = tL_readParticipantDate.date;
                            vector = vector2;
                            i7 = i18;
                            long j16 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j16);
                            if (j15 != j16) {
                                np.s1(i17).a2(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i19)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            vector = vector2;
                            i7 = i18;
                            if (obj2 instanceof Long) {
                                Long l10 = (Long) obj2;
                                if (j15 != l10.longValue()) {
                                    if (l10.longValue() > 0) {
                                        np.s1(i17).a2(l10);
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList.add(l10);
                                    } else {
                                        j3 = j15;
                                        np.s1(i17).M0(Long.valueOf(-l10.longValue()));
                                        arrayList3.add(new Pair(l10, 0));
                                        arrayList2.add(l10);
                                        i18 = i7 + 1;
                                        vector2 = vector;
                                        j15 = j3;
                                    }
                                }
                            }
                        }
                        j3 = j15;
                        i18 = i7 + 1;
                        vector2 = vector;
                        j15 = j3;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                            Pair pair = (Pair) arrayList3.get(i20);
                            jf0Var.f48320a.add((Long) pair.first);
                            jf0Var.f48321b.add((Integer) pair.second);
                            jf0Var.f48322c.add((TLObject) hashMap2.get(pair.first));
                        }
                        jf0Var.b();
                        return;
                    } else if (org.telegram.messenger.t3.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = np.s1(i17).f25369q3;
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = np.s1(i17).h1(chat.f28051id);
                        ConnectionsManager.getInstance(i17).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final jf0 jf0Var2 = jf0Var;
                                        final int i21 = i17;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        jf0 jf0Var3 = jf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var3.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i22 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap4 = hashMap3;
                                                                if (i23 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i23);
                                                                    org.telegram.messenger.np.s1(i21).X3(user, false, false);
                                                                    hashMap4.put(Long.valueOf(user.f28200id), user);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList5 = arrayList4;
                                                                        if (i22 < arrayList5.size()) {
                                                                            Pair pair2 = (Pair) arrayList5.get(i22);
                                                                            jf0Var3.f48320a.add((Long) pair2.first);
                                                                            jf0Var3.f48321b.add((Integer) pair2.second);
                                                                            jf0Var3.f48322c.add((TLObject) hashMap4.get(pair2.first));
                                                                            i22++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var3.b();
                                                        return;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i25 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i25);
                                                                    org.telegram.messenger.np.s1(i21).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28200id), user2);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i24);
                                                                            jf0Var4.f48320a.add((Long) pair3.first);
                                                                            jf0Var4.f48321b.add((Integer) pair3.second);
                                                                            jf0Var4.f48322c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final jf0 jf0Var3 = jf0Var;
                                        final int i22 = i17;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i222 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i23 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i23);
                                                                    org.telegram.messenger.np.s1(i22).X3(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28200id), user);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i222 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i222);
                                                                            jf0Var32.f48320a.add((Long) pair2.first);
                                                                            jf0Var32.f48321b.add((Integer) pair2.second);
                                                                            jf0Var32.f48322c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i222++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var32.b();
                                                        return;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i25 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i25);
                                                                    org.telegram.messenger.np.s1(i22).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28200id), user2);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i24);
                                                                            jf0Var4.f48320a.add((Long) pair3.first);
                                                                            jf0Var4.f48321b.add((Integer) pair3.second);
                                                                            jf0Var4.f48322c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
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
                        tL_messages_getFullChat.chat_id = chat.f28051id;
                        ConnectionsManager.getInstance(i17).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final jf0 jf0Var2 = jf0Var;
                                        final int i21 = i17;
                                        final HashMap hashMap3 = hashMap2;
                                        final ArrayList arrayList4 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var2;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i222 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap3;
                                                                if (i23 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i23);
                                                                    org.telegram.messenger.np.s1(i21).X3(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28200id), user);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList4;
                                                                        if (i222 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i222);
                                                                            jf0Var32.f48320a.add((Long) pair2.first);
                                                                            jf0Var32.f48321b.add((Integer) pair2.second);
                                                                            jf0Var32.f48322c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i222++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var32.b();
                                                        return;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var2;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap3;
                                                                if (i25 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i25);
                                                                    org.telegram.messenger.np.s1(i21).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28200id), user2);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList4;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i24);
                                                                            jf0Var4.f48320a.add((Long) pair3.first);
                                                                            jf0Var4.f48321b.add((Integer) pair3.second);
                                                                            jf0Var4.f48322c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final jf0 jf0Var3 = jf0Var;
                                        final int i22 = i17;
                                        final HashMap hashMap4 = hashMap2;
                                        final ArrayList arrayList5 = arrayList3;
                                        org.telegram.messenger.g0.h3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r6) {
                                                    case 0:
                                                        jf0 jf0Var32 = jf0Var3;
                                                        TLObject tLObject4 = tLObject3;
                                                        if (tLObject4 != null) {
                                                            jf0Var32.getClass();
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            int i222 = 0;
                                                            int i23 = 0;
                                                            while (true) {
                                                                int size3 = tL_channels_channelParticipants.users.size();
                                                                HashMap hashMap42 = hashMap4;
                                                                if (i23 < size3) {
                                                                    TLRPC.User user = tL_channels_channelParticipants.users.get(i23);
                                                                    org.telegram.messenger.np.s1(i22).X3(user, false, false);
                                                                    hashMap42.put(Long.valueOf(user.f28200id), user);
                                                                    i23++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList52 = arrayList5;
                                                                        if (i222 < arrayList52.size()) {
                                                                            Pair pair2 = (Pair) arrayList52.get(i222);
                                                                            jf0Var32.f48320a.add((Long) pair2.first);
                                                                            jf0Var32.f48321b.add((Integer) pair2.second);
                                                                            jf0Var32.f48322c.add((TLObject) hashMap42.get(pair2.first));
                                                                            i222++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var32.b();
                                                        return;
                                                    default:
                                                        jf0 jf0Var4 = jf0Var3;
                                                        TLObject tLObject5 = tLObject3;
                                                        if (tLObject5 != null) {
                                                            jf0Var4.getClass();
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject5;
                                                            int i24 = 0;
                                                            int i25 = 0;
                                                            while (true) {
                                                                int size4 = tL_messages_chatFull.users.size();
                                                                HashMap hashMap5 = hashMap4;
                                                                if (i25 < size4) {
                                                                    TLRPC.User user2 = tL_messages_chatFull.users.get(i25);
                                                                    org.telegram.messenger.np.s1(i22).X3(user2, false, false);
                                                                    hashMap5.put(Long.valueOf(user2.f28200id), user2);
                                                                    i25++;
                                                                } else {
                                                                    while (true) {
                                                                        ArrayList arrayList6 = arrayList5;
                                                                        if (i24 < arrayList6.size()) {
                                                                            Pair pair3 = (Pair) arrayList6.get(i24);
                                                                            jf0Var4.f48320a.add((Long) pair3.first);
                                                                            jf0Var4.f48321b.add((Integer) pair3.second);
                                                                            jf0Var4.f48322c.add((TLObject) hashMap5.get(pair3.first));
                                                                            i24++;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jf0Var4.b();
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
                jf0Var.b();
                return;
        }
    }

    public v7(a1.c cVar, ArrayList arrayList, int i7, long j3, ArrayList arrayList2, ArrayList arrayList3) {
        this.d = cVar;
        this.f9596e = arrayList;
        this.f9594b = i7;
        this.f9595c = j3;
        this.f9597f = arrayList2;
        this.h = arrayList3;
    }

    public v7(gj gjVar, TLRPC.Message message, String str, int[] iArr, int i7, long j3) {
        this.d = gjVar;
        this.f9596e = message;
        this.f9597f = str;
        this.h = iArr;
        this.f9594b = i7;
        this.f9595c = j3;
    }

    public v7(h00 h00Var, TLRPC.TL_messages_forumTopics tL_messages_forumTopics, long j3, TLRPC.TL_messages_forumTopics tL_messages_forumTopics2, a0.h hVar, int i7) {
        this.d = h00Var;
        this.f9596e = tL_messages_forumTopics;
        this.f9595c = j3;
        this.f9597f = tL_messages_forumTopics2;
        this.h = hVar;
        this.f9594b = i7;
    }

    public v7(TLObject tLObject, int i7, hi.d dVar, org.telegram.ui.ActionBar.u2 u2Var, long j3, TLRPC.TL_error tL_error) {
        this.d = tLObject;
        this.f9594b = i7;
        this.f9596e = dVar;
        this.f9597f = u2Var;
        this.f9595c = j3;
        this.h = tL_error;
    }

    public v7(org.telegram.ui.Cells.d6 d6Var, TLObject tLObject, vr vrVar, long j3, int i7, ArrayList arrayList) {
        this.d = d6Var;
        this.f9597f = tLObject;
        this.h = vrVar;
        this.f9595c = j3;
        this.f9594b = i7;
        this.f9596e = arrayList;
    }

    public v7(jf0 jf0Var, TLRPC.TL_error tL_error, TLObject tLObject, long j3, int i7, TLRPC.Chat chat) {
        this.d = jf0Var;
        this.f9596e = tL_error;
        this.f9597f = tLObject;
        this.f9595c = j3;
        this.f9594b = i7;
        this.h = chat;
    }
}
