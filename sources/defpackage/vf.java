package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class vf implements Runnable {
    public final byte a;
    public final int b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public vf(int i, long j, my0 my0Var, ylb ylbVar, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.a = (byte) 1;
        this.b = i;
        this.e = context;
        this.c = j;
        this.f = connectedbotstarref;
        this.d = my0Var;
        this.h = ylbVar;
    }

    @Override
    public final void run() {
        Integer num;
        Integer num2;
        long j;
        int i;
        long j2 = 0;
        TLRPC.GroupCall groupCall = null;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) this.e;
                int i2 = this.b;
                b61 b61Var = (b61) this.f;
                my0 my0Var = (my0) this.d;
                long j3 = this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    oc7.r1(i2).d4(updates.users, false);
                    oc7.r1(i2).X3(updates.chats, false);
                    ArrayList w0 = oc7.w0(updates, TL_update.TL_updateGroupCall.class);
                    int size = w0.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = w0.get(i3);
                        i3++;
                        groupCall = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    Utilities.d.c(new ag(i2, updates, (byte) 0));
                    if (groupCall != null && LaunchActivity.H1 != null) {
                        my0Var.dismiss();
                        a6a.B(i2).q0(y5a.a(j3, groupCall.invite_link));
                        d S = LaunchActivity.S();
                        if (S != null) {
                            if (S instanceof yv1) {
                                yv1 yv1Var = (yv1) S;
                                if (yv1Var.a() == j3 && yv1Var.g4 == 0) {
                                    return;
                                }
                            }
                            S.presentFragment(yv1.ga(j3));
                            return;
                        }
                        return;
                    }
                    b61Var.setLoading(false);
                    return;
                } else if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    oc7.r1(i2).d4(groupcall.users, false);
                    oc7.r1(i2).X3(groupcall.chats, false);
                    if (LaunchActivity.H1 == null) {
                        b61Var.setLoading(false);
                        return;
                    }
                    TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
                    TLRPC.GroupCall groupCall2 = groupcall.call;
                    tL_inputGroupCall.id = groupCall2.id;
                    tL_inputGroupCall.access_hash = groupCall2.access_hash;
                    my0Var.dismiss();
                    sic.g(LaunchActivity.H1, i2, tL_inputGroupCall, false, groupcall.call, null);
                    a6a.B(i2).q0(y5a.a(j3, groupcall.call.invite_link));
                    return;
                } else if (tL_error != null) {
                    wi8.u(my0Var.F, null, tL_error, false);
                    return;
                } else {
                    return;
                }
            case 1:
                int i4 = this.b;
                Context context = (Context) this.e;
                long j4 = this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.f;
                ku0.g(i4).f(context, j4, connectedbotstarref.bot_id, new ah1(i4, j4, (my0) this.d, (ylb) this.h, context, connectedbotstarref));
                return;
            case 2:
                final t57 t57Var = (t57) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.h;
                TLObject tLObject2 = (TLObject) this.e;
                long j5 = this.c;
                final int i5 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Integer num3 = 0;
                if (tL_error2 == null && (tLObject2 instanceof Vector)) {
                    Vector vector = (Vector) tLObject2;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    long j6 = j5;
                    final HashMap hashMap = new HashMap();
                    final ArrayList arrayList3 = new ArrayList();
                    int size2 = vector.objects.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        long j7 = j2;
                        Object obj2 = vector.objects.get(i6);
                        if (obj2 instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj2;
                            int i7 = tL_readParticipantDate.date;
                            num = num3;
                            long j8 = tL_readParticipantDate.user_id;
                            Long valueOf = Long.valueOf(j8);
                            if (j6 != j8) {
                                oc7.r1(i5).W1(valueOf);
                                arrayList3.add(new Pair(valueOf, Integer.valueOf(i7)));
                                arrayList.add(valueOf);
                            }
                        } else {
                            num = num3;
                            if (obj2 instanceof Long) {
                                Long l = (Long) obj2;
                                if (j6 != l.longValue()) {
                                    if (l.longValue() > j7) {
                                        oc7.r1(i5).W1(l);
                                        num2 = num;
                                        arrayList3.add(new Pair(l, num2));
                                        arrayList.add(l);
                                        j = j6;
                                        i6++;
                                        num3 = num2;
                                        j2 = j7;
                                        j6 = j;
                                    } else {
                                        num2 = num;
                                        j = j6;
                                        oc7.r1(i5).L0(Long.valueOf(-l.longValue()));
                                        arrayList3.add(new Pair(l, num2));
                                        arrayList2.add(l);
                                        i6++;
                                        num3 = num2;
                                        j2 = j7;
                                        j6 = j;
                                    }
                                }
                            }
                        }
                        num2 = num;
                        j = j6;
                        i6++;
                        num3 = num2;
                        j2 = j7;
                        j6 = j;
                    }
                    if (arrayList.isEmpty()) {
                        for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                            Pair pair = (Pair) arrayList3.get(i8);
                            t57Var.a.add((Long) pair.first);
                            t57Var.b.add((Integer) pair.second);
                            t57Var.c.add((TLObject) hashMap.get(pair.first));
                        }
                        t57Var.b();
                        return;
                    } else if (sd2.T(chat)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = oc7.r1(i5).l4.N0.f();
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = oc7.r1(i5).g1(chat.id);
                        ConnectionsManager.getInstance(i5).sendRequest(tL_channels_getParticipants, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final t57 t57Var2 = t57Var;
                                        final int i9 = i5;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r6;
                                                int i10 = 0;
                                                ArrayList arrayList5 = arrayList4;
                                                HashMap hashMap3 = hashMap2;
                                                int i11 = i9;
                                                TLObject tLObject4 = tLObject3;
                                                t57 t57Var3 = t57Var2;
                                                switch (b) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i12 = 0; i12 < tL_channels_channelParticipants.users.size(); i12++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i12);
                                                                oc7.r1(i11).c4(user, false, false);
                                                                hashMap3.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i10 < arrayList5.size()) {
                                                                Pair pair2 = (Pair) arrayList5.get(i10);
                                                                t57Var3.a.add((Long) pair2.first);
                                                                t57Var3.b.add((Integer) pair2.second);
                                                                t57Var3.c.add((TLObject) hashMap3.get(pair2.first));
                                                                i10++;
                                                            }
                                                        }
                                                        t57Var3.b();
                                                        return;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i13 = 0; i13 < tL_messages_chatFull.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i13);
                                                                oc7.r1(i11).c4(user2, false, false);
                                                                hashMap3.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i10 < arrayList5.size()) {
                                                                Pair pair3 = (Pair) arrayList5.get(i10);
                                                                t57Var3.a.add((Long) pair3.first);
                                                                t57Var3.b.add((Integer) pair3.second);
                                                                t57Var3.c.add((TLObject) hashMap3.get(pair3.first));
                                                                i10++;
                                                            }
                                                        }
                                                        t57Var3.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final t57 t57Var3 = t57Var;
                                        final int i10 = i5;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r6;
                                                int i102 = 0;
                                                ArrayList arrayList52 = arrayList5;
                                                HashMap hashMap32 = hashMap3;
                                                int i11 = i10;
                                                TLObject tLObject4 = tLObject3;
                                                t57 t57Var32 = t57Var3;
                                                switch (b) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i12 = 0; i12 < tL_channels_channelParticipants.users.size(); i12++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i12);
                                                                oc7.r1(i11).c4(user, false, false);
                                                                hashMap32.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i102 < arrayList52.size()) {
                                                                Pair pair2 = (Pair) arrayList52.get(i102);
                                                                t57Var32.a.add((Long) pair2.first);
                                                                t57Var32.b.add((Integer) pair2.second);
                                                                t57Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                i102++;
                                                            }
                                                        }
                                                        t57Var32.b();
                                                        return;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i13 = 0; i13 < tL_messages_chatFull.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i13);
                                                                oc7.r1(i11).c4(user2, false, false);
                                                                hashMap32.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i102 < arrayList52.size()) {
                                                                Pair pair3 = (Pair) arrayList52.get(i102);
                                                                t57Var32.a.add((Long) pair3.first);
                                                                t57Var32.b.add((Integer) pair3.second);
                                                                t57Var32.c.add((TLObject) hashMap32.get(pair3.first));
                                                                i102++;
                                                            }
                                                        }
                                                        t57Var32.b();
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
                        tL_messages_getFullChat.chat_id = chat.id;
                        ConnectionsManager.getInstance(i5).sendRequest(tL_messages_getFullChat, new RequestDelegate() {
                            @Override
                            public final void run(final TLObject tLObject3, TLRPC.TL_error tL_error3) {
                                switch (r5) {
                                    case 0:
                                        final t57 t57Var2 = t57Var;
                                        final int i9 = i5;
                                        final HashMap hashMap2 = hashMap;
                                        final ArrayList arrayList4 = arrayList3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r6;
                                                int i102 = 0;
                                                ArrayList arrayList52 = arrayList4;
                                                HashMap hashMap32 = hashMap2;
                                                int i11 = i9;
                                                TLObject tLObject4 = tLObject3;
                                                t57 t57Var32 = t57Var2;
                                                switch (b) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i12 = 0; i12 < tL_channels_channelParticipants.users.size(); i12++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i12);
                                                                oc7.r1(i11).c4(user, false, false);
                                                                hashMap32.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i102 < arrayList52.size()) {
                                                                Pair pair2 = (Pair) arrayList52.get(i102);
                                                                t57Var32.a.add((Long) pair2.first);
                                                                t57Var32.b.add((Integer) pair2.second);
                                                                t57Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                i102++;
                                                            }
                                                        }
                                                        t57Var32.b();
                                                        return;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i13 = 0; i13 < tL_messages_chatFull.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i13);
                                                                oc7.r1(i11).c4(user2, false, false);
                                                                hashMap32.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i102 < arrayList52.size()) {
                                                                Pair pair3 = (Pair) arrayList52.get(i102);
                                                                t57Var32.a.add((Long) pair3.first);
                                                                t57Var32.b.add((Integer) pair3.second);
                                                                t57Var32.c.add((TLObject) hashMap32.get(pair3.first));
                                                                i102++;
                                                            }
                                                        }
                                                        t57Var32.b();
                                                        return;
                                                }
                                            }
                                        });
                                        return;
                                    default:
                                        final t57 t57Var3 = t57Var;
                                        final int i10 = i5;
                                        final HashMap hashMap3 = hashMap;
                                        final ArrayList arrayList5 = arrayList3;
                                        gm.c3(new Runnable() {
                                            @Override
                                            public final void run() {
                                                byte b = r6;
                                                int i102 = 0;
                                                ArrayList arrayList52 = arrayList5;
                                                HashMap hashMap32 = hashMap3;
                                                int i11 = i10;
                                                TLObject tLObject4 = tLObject3;
                                                t57 t57Var32 = t57Var3;
                                                switch (b) {
                                                    case 0:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject4;
                                                            for (int i12 = 0; i12 < tL_channels_channelParticipants.users.size(); i12++) {
                                                                TLRPC.User user = tL_channels_channelParticipants.users.get(i12);
                                                                oc7.r1(i11).c4(user, false, false);
                                                                hashMap32.put(Long.valueOf(user.id), user);
                                                            }
                                                            while (i102 < arrayList52.size()) {
                                                                Pair pair2 = (Pair) arrayList52.get(i102);
                                                                t57Var32.a.add((Long) pair2.first);
                                                                t57Var32.b.add((Integer) pair2.second);
                                                                t57Var32.c.add((TLObject) hashMap32.get(pair2.first));
                                                                i102++;
                                                            }
                                                        }
                                                        t57Var32.b();
                                                        return;
                                                    default:
                                                        if (tLObject4 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject4;
                                                            for (int i13 = 0; i13 < tL_messages_chatFull.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_messages_chatFull.users.get(i13);
                                                                oc7.r1(i11).c4(user2, false, false);
                                                                hashMap32.put(Long.valueOf(user2.id), user2);
                                                            }
                                                            while (i102 < arrayList52.size()) {
                                                                Pair pair3 = (Pair) arrayList52.get(i102);
                                                                t57Var32.a.add((Long) pair3.first);
                                                                t57Var32.b.add((Integer) pair3.second);
                                                                t57Var32.c.add((TLObject) hashMap32.get(pair3.first));
                                                                i102++;
                                                            }
                                                        }
                                                        t57Var32.b();
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
                t57Var.b();
                return;
            case 3:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f;
                String str = (String) this.h;
                int i9 = this.b;
                long j9 = this.c;
                ((npa) this.e).run();
                if (((Boolean) this.d).booleanValue()) {
                    i = 2131749467;
                } else {
                    i = 2131749468;
                }
                fs7.s(tL_starGiftUnique, jb6.a0(null, null, i, str));
                String str2 = tL_starGiftUnique.slug;
                if (!TextUtils.isEmpty(str2)) {
                    gm.d3(new tw1(i9, 0, j9, str2, true), fs7.a[0]);
                    return;
                }
                return;
            case 4:
                ((ir8) this.f).c((TLObject) this.e, (cf7) this.d, this.c, this.b, (ArrayList) this.h);
                return;
            case 5:
                ((yf9) this.e).k((ArrayList) this.f, Integer.valueOf(this.b), Long.valueOf(this.c), (ArrayList) this.d, (ArrayList) this.h);
                return;
            default:
                k47 k47Var = (k47) this.e;
                TLRPC.Message message = (TLRPC.Message) this.f;
                String str3 = (String) this.d;
                int[] iArr = (int[]) this.h;
                int i10 = this.b;
                long j10 = this.c;
                HashMap hashMap2 = v0c.P;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(v0c.r(k47Var)));
                }
                message.voiceTranscription = str3;
                if (iArr.length <= 0) {
                    iArr = null;
                }
                message.voiceTranscriptionWords = iArr;
                message.voiceTranscriptionLocal = true;
                message.voiceTranscriptionFinal = true;
                message.voiceTranscriptionOpen = true;
                message.voiceTranscriptionId = 0L;
                v0c.q(k47Var);
                cf7 Y = cf7.Y(i10);
                Y.a.c(new wz(Y, k47Var.e1(), j10, message, str3, (byte) 6));
                nm7 f = nm7.f(i10);
                Boolean bool = Boolean.TRUE;
                f.k(116, k47Var, null, null, bool, bool);
                return;
        }
    }

    public vf(t57 t57Var, TLRPC.TL_error tL_error, TLObject tLObject, long j, int i, TLRPC.Chat chat) {
        this.a = (byte) 2;
        this.f = t57Var;
        this.h = tL_error;
        this.e = tLObject;
        this.c = j;
        this.b = i;
        this.d = chat;
    }

    public vf(ir8 ir8Var, TLObject tLObject, cf7 cf7Var, long j, int i, ArrayList arrayList) {
        this.a = (byte) 4;
        this.f = ir8Var;
        this.e = tLObject;
        this.d = cf7Var;
        this.c = j;
        this.b = i;
        this.h = arrayList;
    }

    public vf(yf9 yf9Var, ArrayList arrayList, int i, long j, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 5;
        this.e = yf9Var;
        this.f = arrayList;
        this.b = i;
        this.c = j;
        this.d = arrayList2;
        this.h = arrayList3;
    }

    public vf(Object obj, TLObject tLObject, Object obj2, Serializable serializable, int i, long j, byte b) {
        this.a = b;
        this.e = obj;
        this.f = tLObject;
        this.d = obj2;
        this.h = serializable;
        this.b = i;
        this.c = j;
    }

    public vf(TLObject tLObject, int i, b61 b61Var, my0 my0Var, long j, TLRPC.TL_error tL_error) {
        this.a = (byte) 0;
        this.e = tLObject;
        this.b = i;
        this.f = b61Var;
        this.d = my0Var;
        this.c = j;
        this.h = tL_error;
    }
}
