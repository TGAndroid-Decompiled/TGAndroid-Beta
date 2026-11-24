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
public final class rr6 implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;

    public rr6(long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
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
        hs6 hs6Var;
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
                hs6 hs6Var2 = (hs6) obj6;
                rqb rqbVar = (rqb) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                vh6 vh6Var = (vh6) obj2;
                Runnable runnable2 = (Runnable) obj;
                rqb.a((qqb) obj5);
                qqb d = rqb.d(rqbVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = hs6Var2.getMessagesStorage().b;
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
                                TLdeserialize.readAttachPath(byteBufferValue, hs6Var2.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j2;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList3 = (ArrayList) vh6Var.f(longValue);
                                vh6Var.l(longValue);
                                if (arrayList3 != null) {
                                    z = false;
                                    k47 k47Var = new k47(hs6Var2.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(k47Var);
                                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                        k47 k47Var2 = (k47) arrayList3.get(i3);
                                        k47Var2.C = k47Var;
                                        k47Var2.m();
                                        k47Var2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader = k47Var2.k.reply_to;
                                        messageReplyHeader.flags |= 16;
                                        messageReplyHeader.reply_to_msg_id = k47Var.L1();
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
                            if (vh6Var.m() != 0) {
                                int i5 = i4;
                                while (i5 < vh6Var.m()) {
                                    ArrayList arrayList4 = (ArrayList) vh6Var.n(i5);
                                    int i6 = i4;
                                    while (i6 < arrayList4.size()) {
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = ((k47) arrayList4.get(i6)).k.reply_to;
                                        if (messageReplyHeader2 != null) {
                                            hs6Var = hs6Var2;
                                            messageReplyHeader2.reply_to_random_id = 0L;
                                        } else {
                                            hs6Var = hs6Var2;
                                        }
                                        i6++;
                                        hs6Var2 = hs6Var;
                                    }
                                    i5++;
                                    i4 = 0;
                                }
                            }
                            rqb.a(d);
                            gm.c3(new p97(hs6Var2, rqb.d(rqbVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j2, arrayList2, (byte) 14));
                            if (runnable3 != null) {
                                runnable3.run();
                                return;
                            }
                            return;
                        }
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                ((ConferenceCall) obj6).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj5, this.b, (TLObject) obj4, (TLRPC.TL_error) obj3, (AtomicBoolean) obj2, (AtomicInteger) obj);
                return;
            case 2:
                xs5 xs5Var = (xs5) obj6;
                ((he) obj5).b(400L);
                xs5.G0((Context) obj4, xs5Var.a, -j, ((TLRPC.TL_chatInviteExported) obj3).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj2, (TLRPC.ChannelParticipant) obj, xs5Var.J0);
                return;
            case 3:
                yv1 yv1Var = (yv1) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) obj3;
                String str = (String) obj2;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj;
                if (((TLRPC.TL_error) obj6) == null) {
                    TLRPC.User W1 = yv1Var.getMessagesController().W1(Long.valueOf(yv1Var.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w = bc4.w(arrayList5, 150, false, null, false);
                    TLRPC.PhotoSize w2 = bc4.w(arrayList5, 800, false, null, false);
                    if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                        x = null;
                    } else {
                        x = bc4.x(1000, tL_photos_photo.photo.video_sizes);
                    }
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    W1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w != null) {
                        tL_userProfilePhoto.photo_small = w.location;
                    }
                    if (w2 != null) {
                        tL_userProfilePhoto.photo_big = w2.location;
                    }
                    if (w != null && fileLocationArr[0] != null) {
                        bc4.G(yv1Var.getCurrentAccount());
                        File J = bc4.J(w, null, true, true);
                        bc4.G(yv1Var.getCurrentAccount());
                        bc4.J(fileLocationArr[0], null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocationArr[0].volume_id);
                        sb.append("_");
                        String k = hg9.k(sb, fileLocationArr[0].local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        String k2 = hg9.k(sb2, w.location.local_id, "@50_50");
                        z2 = true;
                        fn5.z().O(k, k2, gn5.m(yv1Var.getCurrentAccount(), 1, W1));
                    } else {
                        z2 = true;
                    }
                    if (x != null && str != null) {
                        bc4.G(yv1Var.getCurrentAccount());
                        new File(str).renameTo(bc4.J(x, "mp4", z2, z2));
                    } else if (w2 != null && fileLocationArr2[0] != null) {
                        bc4.G(yv1Var.getCurrentAccount());
                        File J2 = bc4.J(w2, null, true, true);
                        bc4.G(yv1Var.getCurrentAccount());
                        bc4.J(fileLocationArr2[0], null, true, true).renameTo(J2);
                    }
                    yv1Var.getMessagesController().T0(W1.id);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(W1);
                    yv1Var.getMessagesStorage().j1(arrayList6, null, false, true);
                    TLRPC.UserFull X1 = yv1Var.getMessagesController().X1(j);
                    X1.profile_photo = tL_photos_photo.photo;
                    yv1Var.getMessagesStorage().g2(X1, false);
                    c41.b0(yv1Var).V(Collections.singletonList(W1), gm.S2(jb6.M0(2131754184, null)), gm.N2(jb6.M0(2131754185, null), -1, 0, new xo0(j, yv1Var), null), null).j();
                    return;
                }
                return;
            case 4:
                Activity activity = (Activity) obj5;
                ylb ylbVar = (ylb) obj4;
                da9 da9Var = new da9(activity, ylbVar, this.b, (byte[]) obj3);
                da9Var.I0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj6);
                da9Var.u1 = new xvc((yv1) obj2, activity, ylbVar, (k47) obj, (byte) 13);
                da9Var.show();
                return;
            case 5:
                qwb qwbVar = (qwb) obj6;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) obj5;
                ArrayList arrayList7 = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj4;
                n40 n40Var = (n40) obj;
                qwbVar.getMessagesController().d4(tL_messages_savedDialogs.users, false);
                qwbVar.getMessagesController().X3(tL_messages_savedDialogs.chats, false);
                long j3 = this.b;
                qwbVar.u(j3, arrayList7, (vh6) obj2, false, 2, -1);
                long j4 = -j3;
                qwbVar.getMessagesStorage().z1(qwbVar.getConnectionsManager().getCurrentTime(), j4, (List) qwbVar.a.f(j3), true);
                qwbVar.getMessagesStorage().g1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList7.size();
                while (i2 < size) {
                    Object obj7 = arrayList7.get(i2);
                    i2++;
                    hashSet.remove(Long.valueOf(pg3.n(((TLRPC.TL_forumTopic) obj7).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    cf7 messagesStorage = qwbVar.getMessagesStorage();
                    long j5 = j4;
                    j4 = j5;
                    messagesStorage.a.c(new tc7(messagesStorage, j5, longValue2, (byte) 1));
                    qwbVar.s(j3, longValue2);
                }
                if (n40Var != null) {
                    n40Var.run();
                    return;
                }
                return;
            default:
                final mzb mzbVar = (mzb) obj6;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj5;
                a8 a8Var = (a8) obj4;
                final bu5 bu5Var = (bu5) obj3;
                final TLRPC.User user = (TLRPC.User) obj2;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                if ((channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                a8Var.setVisibility(0);
                if (z3) {
                    i = 2131743599;
                } else {
                    i = 2131753691;
                }
                a8Var.setText(jb6.M0(i, null));
                final long j6 = this.b;
                a8Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        mzb mzbVar2 = mzb.this;
                        int i7 = mzbVar2.e;
                        bu5Var.u();
                        boolean z4 = z3;
                        TLRPC.User user2 = user;
                        if (!z4) {
                            oc7.r1(i7).c0(j6, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = oc7.m1(user2);
                        tL_channels_editBanned.channel = oc7.h1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i7).sendRequest(tL_channels_editBanned, new go9(mzbVar2, (byte) 16));
                    }
                });
                return;
        }
    }

    public rr6(qwb qwbVar, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, ArrayList arrayList, vh6 vh6Var, HashSet hashSet, n40 n40Var) {
        this.a = (byte) 5;
        this.c = qwbVar;
        this.d = tL_messages_savedDialogs;
        this.b = j;
        this.f = arrayList;
        this.h = vh6Var;
        this.e = hashSet;
        this.n = n40Var;
    }

    public rr6(Object obj, Object obj2, Object obj3, long j, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public rr6(Object obj, Object obj2, Object obj3, Object obj4, long j, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j;
        this.h = obj5;
        this.n = obj6;
    }

    public rr6(TLRPC.TL_error tL_error, yv1 yv1Var, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 3;
        this.c = tL_error;
        this.d = yv1Var;
        this.e = tLObject;
        this.f = fileLocationArr;
        this.h = str;
        this.n = fileLocationArr2;
        this.b = j;
    }
}
