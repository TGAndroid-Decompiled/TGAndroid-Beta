package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class rp6 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public rp6(long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.a = (byte) 1;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = tLObject;
        this.f = tL_error;
        this.h = atomicBoolean;
        this.n = atomicInteger;
    }

    @Override
    public final void run() {
        hq6 hq6Var;
        boolean z;
        Runnable runnable;
        TLRPC.VideoSize x;
        boolean z2;
        final boolean z3;
        int i;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        byte b = this.a;
        long j = this.b;
        int i2 = 0;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                hq6 hq6Var2 = (hq6) obj6;
                qob qobVar = (qob) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                vf6 vf6Var = (vf6) obj2;
                Runnable runnable2 = (Runnable) obj;
                qob.a((pob) obj5);
                pob d = qob.d(qobVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = hq6Var2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    ?? r6 = 0;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j2 = this.b;
                        if (next) {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r6);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r6), r6);
                                runnable = runnable2;
                                TLdeserialize.readAttachPath(byteBufferValue, hq6Var2.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j2;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) vf6Var.f(longValue);
                                vf6Var.l(longValue);
                                if (arrayList3 != null) {
                                    z = false;
                                    k27 k27Var = new k27(hq6Var2.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(k27Var);
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        k27 k27Var2 = (k27) arrayList3.get(i3);
                                        k27Var2.C = k27Var;
                                        k27Var2.m();
                                        k27Var2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = k27Var2.k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = k27Var.L1();
                                    }
                                } else {
                                    z = false;
                                }
                            } else {
                                z = r6;
                                runnable = runnable2;
                            }
                            runnable2 = runnable;
                            r6 = z;
                        } else {
                            int i4 = r6;
                            Runnable runnable3 = runnable2;
                            queryFinalized.dispose();
                            if (vf6Var.m() != 0) {
                                int i5 = i4;
                                while (i5 < vf6Var.m()) {
                                    ArrayList arrayList4 = (ArrayList) vf6Var.n(i5);
                                    int i6 = i4;
                                    while (i6 < arrayList4.size()) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((k27) arrayList4.get(i6)).k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            hq6Var = hq6Var2;
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        } else {
                                            hq6Var = hq6Var2;
                                        }
                                        i6++;
                                        hq6Var2 = hq6Var;
                                    }
                                    i5++;
                                    i4 = 0;
                                }
                            }
                            qob.a(d);
                            gl.d3(new m77(hq6Var2, qob.d(qobVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j2, arrayList2, (byte) 14));
                            if (runnable3 != null) {
                                runnable3.run();
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                ((ConferenceCall) obj6).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj5, this.b, (TLObject) obj4, (TLRPC.TL_error) obj3, (AtomicBoolean) obj2, (AtomicInteger) obj);
                return;
            case 2:
                zq5 zq5Var = (zq5) obj6;
                ((hd) obj5).b(400L);
                zq5.G0((Context) obj4, zq5Var.a, -j, ((TLRPC.TL_chatInviteExported) obj3).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj2, (TLRPC.ChannelParticipant) obj, zq5Var.J0);
                return;
            case 3:
                mu1 mu1Var = (mu1) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) obj3;
                String str = (String) obj2;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj;
                if (((TLRPC.TL_error) obj6) == null) {
                    TLRPC.User V1 = mu1Var.getMessagesController().V1(Long.valueOf(mu1Var.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w = ba4.w(arrayList5, 150, false, null, false);
                    TLRPC.PhotoSize w2 = ba4.w(arrayList5, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        x = null;
                    } else {
                        x = ba4.x(1000, tL_photos_photo.photo.video_sizes);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    V1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w != null) {
                        tL_userProfilePhoto.photo_small = w.location;
                    }
                    if (w2 != null) {
                        tL_userProfilePhoto.photo_big = w2.location;
                    }
                    if (w != null && fileLocationArr[0] != null) {
                        ba4.G(mu1Var.getCurrentAccount());
                        File J = ba4.J(w, null, true, true);
                        ba4.G(mu1Var.getCurrentAccount());
                        ba4.J(fileLocationArr[0], null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocationArr[0].volume_id);
                        sb.append("_");
                        String l = de9.l(sb, fileLocationArr[0].local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        String l2 = de9.l(sb2, w.location.local_id, "@50_50");
                        z2 = true;
                        fl5.z().O(l, l2, gl5.m(mu1Var.getCurrentAccount(), 1, V1));
                    } else {
                        z2 = true;
                    }
                    if (x != null && str != null) {
                        ba4.G(mu1Var.getCurrentAccount());
                        new File(str).renameTo(ba4.J(x, "mp4", z2, z2));
                    } else if (w2 != null && fileLocationArr2[0] != null) {
                        ba4.G(mu1Var.getCurrentAccount());
                        File J2 = ba4.J(w2, null, true, true);
                        ba4.G(mu1Var.getCurrentAccount());
                        ba4.J(fileLocationArr2[0], null, true, true).renameTo(J2);
                    }
                    mu1Var.getMessagesController().S0(V1.id);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(V1);
                    mu1Var.getMessagesStorage().j1(arrayList6, null, false, true);
                    TLRPC.UserFull W1 = mu1Var.getMessagesController().W1(j);
                    W1.profile_photo = tL_photos_photo.photo;
                    mu1Var.getMessagesStorage().g2(W1, false);
                    u21.b0(mu1Var).V(Collections.singletonList(V1), gl.T2(k96.M0(2131754216, null)), gl.O2(k96.M0(2131754217, null), -1, 0, new xn0(j, mu1Var), null), null).j();
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) obj5;
                wjb wjbVar = (wjb) obj4;
                b89 b89Var = new b89(activity, wjbVar, this.b, (byte[]) obj3);
                b89Var.H0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj6);
                b89Var.u1 = new c5a((mu1) obj2, activity, wjbVar, (k27) obj, (byte) 13);
                b89Var.show();
                return;
            case 5:
                pub pubVar = (pub) obj6;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) obj5;
                ArrayList arrayList7 = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj4;
                n30 n30Var = (n30) obj;
                pubVar.getMessagesController().a4(tL_messages_savedDialogs.users, false);
                pubVar.getMessagesController().U3(tL_messages_savedDialogs.chats, false);
                long j3 = this.b;
                pubVar.u(j3, arrayList7, (vf6) obj2, false, 2, -1);
                long j4 = -j3;
                pubVar.getMessagesStorage().z1(pubVar.getConnectionsManager().getCurrentTime(), j4, (List) pubVar.a.f(j3), true);
                pubVar.getMessagesStorage().g1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList7.size();
                while (i2 < size) {
                    Object obj7 = arrayList7.get(i2);
                    i2++;
                    hashSet.remove(Long.valueOf(cf3.n(((TLRPC.TL_forumTopic) obj7).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    ad7 messagesStorage = pubVar.getMessagesStorage();
                    long j5 = j4;
                    j4 = j5;
                    messagesStorage.a.c(new sa7(messagesStorage, j5, longValue2, (byte) 1));
                    pubVar.s(j3, longValue2);
                }
                if (n30Var != null) {
                    n30Var.run();
                    return;
                }
                return;
            default:
                final kxb kxbVar = (kxb) obj6;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj5;
                a8 a8Var = (a8) obj4;
                final cs5 cs5Var = (cs5) obj3;
                final TLRPC.User user = (TLRPC.User) obj2;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                if ((channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a8Var.setVisibility(0);
                if (z3) {
                    i = 2131743673;
                } else {
                    i = 2131753723;
                }
                a8Var.setText(k96.M0(i, null));
                final long j6 = this.b;
                a8Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        kxb kxbVar2 = kxb.this;
                        int i7 = kxbVar2.e;
                        cs5Var.u();
                        boolean z4 = z3;
                        TLRPC.User user2 = user;
                        if (!z4) {
                            na7.q1(i7).c0(j6, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = na7.l1(user2);
                        tL_channels_editBanned.channel = na7.g1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_editBanned, new wx9(kxbVar2, (byte) 15));
                    }
                });
                return;
        }
    }

    public rp6(pub pubVar, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, ArrayList arrayList, vf6 vf6Var, HashSet hashSet, n30 n30Var) {
        this.a = (byte) 5;
        this.c = pubVar;
        this.d = tL_messages_savedDialogs;
        this.b = j;
        this.f = arrayList;
        this.h = vf6Var;
        this.e = hashSet;
        this.n = n30Var;
    }

    public rp6(Object obj, Object obj2, Object obj3, long j, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public rp6(Object obj, Object obj2, Object obj3, Object obj4, long j, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j;
        this.h = obj5;
        this.n = obj6;
    }

    public rp6(TLRPC.TL_error tL_error, mu1 mu1Var, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 3;
        this.c = tL_error;
        this.d = mu1Var;
        this.e = tLObject;
        this.f = fileLocationArr;
        this.h = str;
        this.n = fileLocationArr2;
        this.b = j;
    }
}
