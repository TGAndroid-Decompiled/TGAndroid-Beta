package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import b8.yd;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gi;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.ko;
import org.telegram.messenger.ks;
import org.telegram.messenger.li;
import org.telegram.messenger.os;
import org.telegram.messenger.qr;
import org.telegram.messenger.ro;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.messenger.us;
import org.telegram.messenger.vy;
import org.telegram.messenger.xy;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.hm;
import org.telegram.ui.kl;
import org.telegram.ui.um;
import org.telegram.ui.wm;
public final class u8 implements Runnable {
    public final int f6112a;
    public final boolean f6113b;
    public final Object f6114c;
    public final Object d;
    public final Object f6115e;

    public u8(ei.h3 h3Var, View view, dh.n0 n0Var, boolean z10, boolean z11) {
        this.f6112a = 1;
        this.f6114c = h3Var;
        this.d = view;
        this.f6115e = n0Var;
        this.f6113b = z10;
    }

    private final void a() {
        boolean z10;
        String[] split;
        String[] strArr = (String[]) this.f6114c;
        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.d;
        boolean z11 = this.f6113b;
        lg.n nVar = (lg.n) this.f6115e;
        try {
            org.telegram.ui.ActionBar.k6.f27931g0 = org.telegram.ui.ActionBar.k6.hm.get(org.telegram.ui.ActionBar.k6.f27936g5, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                org.telegram.ui.ActionBar.k6.f27949h0 = strArr[0];
                String absolutePath = new File(org.telegram.messenger.t0.h(), Utilities.a(org.telegram.ui.ActionBar.k6.f27949h0) + ".wp").getAbsolutePath();
                try {
                    String str = j6Var.f27679c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(j6Var.f27679c).delete();
                    }
                } catch (Exception unused) {
                }
                j6Var.f27679c = absolutePath;
                Uri parse = Uri.parse(org.telegram.ui.ActionBar.k6.f27949h0);
                j6Var.f27682e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        if ("blur".equals(split[i3])) {
                            j6Var.h = true;
                        } else if ("motion".equals(split[i3])) {
                            j6Var.f27691n = true;
                        }
                    }
                }
                Utilities.z(parse.getQueryParameter("intensity"));
                j6Var.f27696y = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        j6Var.f27692r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                            j6Var.f27693s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                            j6Var.f27694w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                            j6Var.f27695x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        j6Var.f27696y = Utilities.z(queryParameter3).intValue();
                    }
                } catch (Exception unused3) {
                }
            } else {
                try {
                    if (j6Var.f27679c != null) {
                        new File(j6Var.f27679c).delete();
                    }
                } catch (Exception unused4) {
                }
                j6Var.f27679c = null;
                org.telegram.ui.ActionBar.k6.f27949h0 = null;
            }
            if (!z11 && org.telegram.ui.ActionBar.k6.M == null) {
                org.telegram.ui.ActionBar.k6.K = j6Var;
                if (org.telegram.ui.ActionBar.k6.I == org.telegram.ui.ActionBar.k6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    org.telegram.ui.ActionBar.k6.T = 2000;
                    org.telegram.ui.ActionBar.k6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new org.telegram.messenger.hc(15), 2100L);
                }
            }
            org.telegram.ui.ActionBar.k6.I = j6Var;
            org.telegram.ui.ActionBar.k6.t1(false, false);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (org.telegram.ui.ActionBar.k6.M == null && !org.telegram.ui.ActionBar.k6.Q) {
            hp.s1(j6Var.F).x4(j6Var, j6Var.k(false), z11, false);
        }
        nVar.run();
    }

    @Override
    public final void run() {
        char c2;
        boolean z10;
        Bitmap.CompressFormat compressFormat;
        int i3;
        ArrayList arrayList;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement;
        int i10;
        ArrayList arrayList3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i11;
        SQLitePreparedStatement sQLitePreparedStatement3;
        ArrayList arrayList4;
        boolean z11;
        int i12;
        char c10;
        int size;
        boolean z12;
        boolean z13;
        a0.h hVar;
        boolean z14;
        Integer num;
        int i13;
        int i14;
        ArrayList arrayList5;
        int i15;
        Integer num2;
        Integer num3;
        Integer num4;
        int i16;
        int i17;
        int i18;
        int i19;
        char c11;
        wm wmVar;
        int i20;
        int i21;
        org.telegram.ui.ActionBar.e6 e6Var;
        ai.x2 x2Var;
        Boolean bool = null;
        View view = null;
        View view2 = null;
        SQLitePreparedStatement executeFast2 = null;
        int i22 = 2;
        switch (this.f6112a) {
            case 0:
                v8 v8Var = (v8) this.f6114c;
                TLObject tLObject = (TLObject) this.f6115e;
                boolean z15 = this.f6113b;
                ArrayList arrayList6 = v8Var.f6203l;
                int i23 = v8Var.f6194a;
                if (((int[]) this.d)[0] == v8Var.f6204m) {
                    v8Var.f6200i = false;
                    v8Var.f6204m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        hp.s1(i23).Y3(tL_payments_savedStarGifts.users, false);
                        hp.s1(i23).S3(tL_payments_savedStarGifts.chats, false);
                        if (z15) {
                            arrayList6.clear();
                        }
                        arrayList6.addAll(tL_payments_savedStarGifts.gifts);
                        v8Var.f6202k = tL_payments_savedStarGifts.next_offset;
                        v8Var.f6205n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        v8Var.h = bool;
                        if (arrayList6.size() <= v8Var.f6205n && v8Var.f6202k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        v8Var.f6201j = z10;
                        c2 = 1;
                    } else {
                        c2 = 1;
                        v8Var.f6201j = true;
                    }
                    hs f10 = hs.f(i23);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(v8Var.f6195b);
                    objArr[c2] = v8Var;
                    f10.k(230, objArr);
                    return;
                }
                return;
            case 1:
                ei.h3 h3Var = (ei.h3) this.f6114c;
                dh.n0 n0Var = (dh.n0) this.f6115e;
                boolean z16 = this.f6113b;
                ei.j4 j4Var = h3Var.f10357a;
                org.telegram.ui.Components.t4.Z(j4Var.f10480m2, 1, j4Var.f10477l1, new ei.g3(h3Var, z16, n0Var, (View) this.d));
                return;
            case 2:
                gi.r1 r1Var = (gi.r1) this.f6114c;
                TLObject tLObject2 = (TLObject) this.f6115e;
                String str = (String) this.d;
                boolean z17 = this.f6113b;
                gi.t1 t1Var = r1Var.f13490s;
                if (r1Var.f13489r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        gi.i2 i2Var = t1Var.f13606r;
                        ArrayList arrayList7 = t1Var.f13605n;
                        int i24 = gi.i2.f12950z1;
                        qr.a0(i2Var.f28583a).v1(str, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z17) {
                            arrayList7.clear();
                        }
                        arrayList7.size();
                        arrayList7.addAll(messages_botresults.results);
                        r1Var.f();
                    }
                    t1Var.d.c(false);
                    r1Var.f13489r = false;
                    return;
                }
                return;
            case 3:
                gi.f7 f7Var = (gi.f7) this.f6114c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z18 = this.f6113b;
                Runnable runnable = (Runnable) this.f6115e;
                f7Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(f7Var.Z0);
                    if (z18) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, false);
                    if (z18) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(f7Var.Z0));
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 4:
                boolean z19 = this.f6113b;
                k2.i0 i0Var = (k2.i0) this.d;
                l2.k kVar = (l2.k) this.f6115e;
                l2.i i25 = l2.i.i((Context) this.f6114c);
                if (i25 == null) {
                    g2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z19) {
                    l2.f fVar = i0Var.f16572s;
                    fVar.getClass();
                    fVar.f17698f.a(i25);
                }
                LogSessionId l10 = i25.l();
                synchronized (kVar) {
                    l2.j jVar = kVar.f17729b;
                    jVar.getClass();
                    jVar.f(l10);
                }
                return;
            case 5:
                kg.e0 e0Var = (kg.e0) this.f6114c;
                boolean z20 = this.f6113b;
                org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) this.d;
                kg.b0 b0Var = (kg.b0) this.f6115e;
                if (!z20) {
                    e0Var.f16958c = b0Var;
                    x3Var.setRightText(e0Var.H(b0Var));
                    x3Var.setRightTextMargin(6);
                    e0Var.J.clear();
                    e0Var.d = true;
                    e0Var.f();
                    e0Var.P();
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.d;
                boolean z21 = this.f6113b;
                mi.q3 q3Var = (mi.q3) this.f6115e;
                String trim = ((EditTextBoldCursor) this.f6114c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    mi.i4.k(d2Var, z21, new mi.d4(0, q3Var, trim));
                    return;
                }
                return;
            case 7:
                o4.e0 e0Var2 = (o4.e0) this.f6114c;
                boolean z22 = this.f6113b;
                o4.v vVar = (o4.v) this.d;
                Runnable runnable2 = (Runnable) this.f6115e;
                o4.h1 h1Var = e0Var2.f20624g;
                if (z22) {
                    o4.n1 n1Var = new o4.n1("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                    try {
                        com.google.android.gms.common.api.internal.s s6 = h1Var.f20661b.s(vVar);
                        if (s6 != null) {
                            i3 = s6.b(o4.e0.B).f20757n;
                        } else if (!e0Var2.h(vVar)) {
                            yd.b(new o4.r1(-100));
                        } else {
                            yd.b(new o4.r1(0));
                            i3 = 0;
                        }
                        o4.u uVar = vVar.d;
                        if (uVar != null) {
                            uVar.d(i3, n1Var);
                        }
                    } catch (DeadObjectException unused) {
                        h1Var.f20661b.K(vVar);
                        yd.b(new o4.r1(-100));
                    } catch (RemoteException e12) {
                        g2.a.m("MediaSessionImpl", "Exception in " + vVar, e12);
                        yd.b(new o4.r1(-1));
                    }
                }
                runnable2.run();
                h1Var.f20661b.k(vVar);
                return;
            case 8:
                org.telegram.messenger.x2 x2Var2 = (org.telegram.messenger.x2) this.f6114c;
                Pair pair = (Pair) this.d;
                Object obj = this.f6115e;
                boolean z23 = this.f6113b;
                HashMap hashMap = x2Var2.f26339c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size2 = arrayList.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        Object obj2 = arrayList.get(i26);
                        i26++;
                        ((u10) obj2).a(obj);
                    }
                    if (z23) {
                        arrayList.clear();
                    }
                    if (z23) {
                        x2Var2.f26339c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                org.telegram.messenger.r3 r3Var = (org.telegram.messenger.r3) this.f6114c;
                boolean z24 = this.f6113b;
                TLObject tLObject3 = (TLObject) this.f6115e;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.d;
                r3Var.f25066u = false;
                if (z24) {
                    r3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    hp.s1(r3Var.C.f21919a).Y3(groupparticipants.users, false);
                    hp.s1(r3Var.C.f21919a).S3(groupparticipants.chats, false);
                    r3Var.m(groupparticipants.participants, z24, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                org.telegram.messenger.d4 d4Var = (org.telegram.messenger.d4) this.f6114c;
                boolean z25 = this.f6113b;
                d4Var.f22141b = new ArrayList((List) this.d);
                ((ResultCallback) this.f6115e).onComplete(d4Var.e((z25 ? 1 : 0) | 2));
                return;
            case 11:
                org.telegram.messenger.g5 g5Var = (org.telegram.messenger.g5) this.f6114c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z26 = this.f6113b;
                String str2 = (String) this.f6115e;
                int size3 = arrayList8.size();
                boolean z27 = false;
                int i27 = 0;
                while (i27 < size3) {
                    Object obj3 = arrayList8.get(i27);
                    i27++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) g5Var.f22654g0.get(Long.valueOf(user.f27150id));
                    if (tL_contact != null) {
                        g5Var.f22653f0.remove(tL_contact);
                        g5Var.f22654g0.remove(Long.valueOf(user.f27150id));
                        z27 = true;
                    }
                }
                if (z27) {
                    g5Var.d(false);
                }
                hs notificationCenter = g5Var.getNotificationCenter();
                int i28 = hp.C8;
                notificationCenter.k(2, 1);
                g5Var.getNotificationCenter().k(25, new Object[0]);
                if (z26) {
                    hs.e().k(292, 1, bd.a0("DeletedFromYourContacts", null, 2131751467, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.f6114c;
                ro roVar = (ro) this.d;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f6115e;
                boolean z28 = this.f6113b;
                String[] strArr = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = roVar.f25194b;
                tL_document.f27007id = roVar.f25193a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = roVar.f25195c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar.f21919a).getCurrentDatacenterId();
                org.telegram.messenger.w7.G(cVar.f21919a);
                File K = org.telegram.messenger.w7.K(tL_document, null, true, true);
                if (K.exists()) {
                    if (!z28) {
                        org.telegram.messenger.g0.h3(new org.telegram.messenger.y4(22, mediaController, K));
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.h3(new org.telegram.messenger.y4(23, cVar, tL_document));
                return;
            case 13:
                MediaController mediaController2 = (MediaController) this.f6114c;
                File file = (File) this.d;
                boolean z29 = this.f6113b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.f6115e;
                String[] strArr2 = MediaController.W1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z30 = org.telegram.messenger.r2.f25040a;
                    org.telegram.messenger.a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.f21328l1 + " writedFrames" + mediaController2.m1), true);
                }
                if (exists) {
                    li.b0(mediaController2.f21323i1).B1(mediaController2.f21331n1, mediaController2.f21333o1, gi.a(mediaController2, file.getAbsolutePath(), z29));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.f21323i1).getCurrentTime();
                tL_document2.size = (int) file.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.f21328l1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                hs.f(mediaController2.f21323i1).k(158, new Object[0]);
                hs.f(mediaController2.f21323i1).k(162, Integer.valueOf(mediaController2.f21321h1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                li liVar = (li) this.f6114c;
                boolean z31 = this.f6113b;
                liVar.getMessagesController().Y3((ArrayList) this.d, z31);
                liVar.getMessagesController().S3((ArrayList) this.f6115e, z31);
                return;
            case 15:
                li liVar2 = (li) this.f6114c;
                boolean z32 = this.f6113b;
                ArrayList arrayList9 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.f6115e;
                try {
                    liVar2.getMessagesStorage().f24936b.beginTransaction();
                    if (z32) {
                        executeFast = liVar2.getMessagesStorage().f24936b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = liVar2.getMessagesStorage().f24936b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = liVar2.getMessagesStorage().f24936b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i29 = 0;
                    while (i29 < arrayList9.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList9.get(i29);
                        SparseArray sparseArray = (SparseArray) hVar2.f(zi.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.f27022id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            i10 = i22;
                            arrayList3 = arrayList9;
                        } else {
                            zi.r5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            int i30 = 0;
                            while (i30 < arrayList2.size()) {
                                zi ziVar = (zi) arrayList2.get(i30);
                                int i31 = 0;
                                while (i31 < i22) {
                                    if (i31 == 0) {
                                        sQLitePreparedStatement2 = executeFast;
                                    } else {
                                        sQLitePreparedStatement2 = executeFast2;
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                        sQLitePreparedStatement3 = executeFast;
                                        i11 = i22;
                                        arrayList4 = arrayList9;
                                    } else {
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                        sQLitePreparedStatement2.bindInteger(i22, message.f27022id);
                                        i11 = i22;
                                        sQLitePreparedStatement2.bindInteger(3, ziVar.f1());
                                        sQLitePreparedStatement3 = executeFast;
                                        arrayList4 = arrayList9;
                                        sQLitePreparedStatement2.bindLong(4, zi.B0(ziVar.f26868k));
                                        sQLitePreparedStatement2.step();
                                    }
                                    i31++;
                                    arrayList9 = arrayList4;
                                    i22 = i11;
                                    executeFast = sQLitePreparedStatement3;
                                }
                                i30++;
                                i22 = i22;
                            }
                            sQLitePreparedStatement = executeFast;
                            i10 = i22;
                            arrayList3 = arrayList9;
                            nativeByteBuffer.reuse();
                        }
                        i29++;
                        arrayList9 = arrayList3;
                        i22 = i10;
                        executeFast = sQLitePreparedStatement;
                    }
                    executeFast.dispose();
                    if (executeFast2 != null) {
                        executeFast2.dispose();
                    }
                    liVar2.getMessagesStorage().f24936b.commitTransaction();
                    return;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return;
                }
            case 16:
                li liVar3 = (li) this.f6114c;
                TLObject tLObject4 = (TLObject) this.f6115e;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                boolean z33 = this.f6113b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z33) {
                        liVar3.K1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        liVar3.L1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                li liVar4 = (li) this.f6114c;
                TLObject tLObject5 = (TLObject) this.f6115e;
                String str3 = (String) this.d;
                boolean z34 = this.f6113b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    liVar4.s1(str3, z34, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    liVar4.s1(str3, z34, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                hp hpVar = (hp) this.f6114c;
                TLObject tLObject6 = (TLObject) this.f6115e;
                boolean z35 = this.f6113b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.d;
                LongSparseIntArray longSparseIntArray = hpVar.H0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    hpVar.Y3(contacts_blocked.users, false);
                    hpVar.S3(contacts_blocked.chats, false);
                    hpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z35) {
                        longSparseIntArray.clear();
                    }
                    hpVar.I0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    hpVar.J0 = z11;
                    int size4 = contacts_blocked.blocked.size();
                    for (int i32 = 0; i32 < size4; i32++) {
                        longSparseIntArray.put(zi.C1(contacts_blocked.blocked.get(i32).peer_id), 1);
                    }
                    hpVar.G0 = false;
                    hpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                hp hpVar2 = (hp) this.f6114c;
                boolean z36 = this.f6113b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList10 = (ArrayList) this.f6115e;
                if (z36) {
                    i12 = 0;
                    hpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i12 = 0;
                }
                hpVar2.l5(i12, -updates.chat_id, arrayList10);
                hpVar2.getNotificationCenter().k(3, new Object[i12]);
                return;
            case 20:
                ko koVar = (ko) this.f6114c;
                TLObject tLObject7 = (TLObject) this.f6115e;
                boolean z37 = this.f6113b;
                int i33 = koVar.f23854a;
                ArrayList arrayList11 = koVar.f23857e;
                if (((int[]) this.d)[0] == koVar.f23858f) {
                    koVar.f23856c = false;
                    koVar.f23858f = -1;
                    if (tLObject7 instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                        hp.s1(i33).S3(messages_chats.chats, false);
                        if (z37) {
                            arrayList11.clear();
                        }
                        arrayList11.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        koVar.f23859g = size;
                        if (arrayList11.size() >= koVar.f23859g) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        koVar.d = z12;
                        c10 = 1;
                    } else {
                        c10 = 1;
                        koVar.d = true;
                    }
                    hs f11 = hs.f(i33);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(koVar.f23855b);
                    objArr2[c10] = koVar;
                    f11.k(239, objArr2);
                    return;
                }
                return;
            case 21:
                ((qr) this.f6114c).n1((List) this.d, (List) this.f6115e, this.f6113b);
                return;
            case 22:
                us usVar = (us) this.f6114c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z38 = this.f6113b;
                ArrayList arrayList12 = (ArrayList) this.f6115e;
                ArrayList arrayList13 = usVar.f25757b;
                a0.h hVar4 = usVar.f25759c;
                a0.h hVar5 = usVar.f25764f;
                int i34 = usVar.J;
                usVar.getAccountInstance().c();
                Integer num5 = 0;
                int i35 = 0;
                while (i35 < hVar3.m()) {
                    long j10 = hVar3.j(i35);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j10);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z14 = z38;
                        num = num5;
                        i13 = i35;
                    } else {
                        ArrayList arrayList14 = (ArrayList) hVar3.f(j10);
                        hVar = hVar3;
                        int i36 = 0;
                        for (int size5 = arrayList14.size(); i36 < size5; size5 = i15) {
                            int i37 = i36;
                            int intValue = ((Integer) arrayList14.get(i36)).intValue();
                            boolean z39 = z38;
                            zi ziVar2 = (zi) sparseArray2.get(intValue);
                            Integer num6 = num5;
                            if (ziVar2 == null || ziVar2.J || (z39 && !ziVar2.I)) {
                                i14 = i35;
                                arrayList5 = arrayList14;
                                i15 = size5;
                            } else {
                                i14 = i35;
                                long B0 = zi.B0(ziVar2.f26868k);
                                Integer num7 = (Integer) hVar5.f(B0);
                                if (num7 == null) {
                                    num2 = num6;
                                } else {
                                    num2 = num7;
                                }
                                int intValue2 = num2.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    arrayList5 = arrayList14;
                                    usVar.f25762e.l(B0);
                                    Integer num8 = num2;
                                    i15 = size5;
                                    num3 = num8;
                                    num4 = num6;
                                } else {
                                    arrayList5 = arrayList14;
                                    Integer num9 = num2;
                                    i15 = size5;
                                    num3 = num9;
                                    num4 = valueOf;
                                }
                                if (!num4.equals(num3)) {
                                    Integer num10 = num3;
                                    if (!usVar.getMessagesController().p2(B0)) {
                                        if (usVar.getMessagesController().t2(B0)) {
                                            int i38 = usVar.J;
                                            if (num10.intValue() > 0) {
                                                i16 = 1;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i39 = i38 - i16;
                                            usVar.J = i39;
                                            if (num4.intValue() > 0) {
                                                i17 = 1;
                                            } else {
                                                i17 = 0;
                                            }
                                            usVar.J = i39 + i17;
                                        } else {
                                            int intValue3 = usVar.J - num10.intValue();
                                            usVar.J = intValue3;
                                            usVar.J = num4.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num4, B0);
                                }
                                if (num4.intValue() == 0) {
                                    hVar5.l(B0);
                                    usVar.f25771r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList13.remove(ziVar2);
                                usVar.f25755a.remove(ziVar2);
                                if (us.E(ziVar2)) {
                                    usVar.K--;
                                }
                                arrayList12.add(ziVar2);
                            }
                            i36 = i37 + 1;
                            num5 = num6;
                            z38 = z39;
                            i35 = i14;
                            arrayList14 = arrayList5;
                        }
                        z14 = z38;
                        num = num5;
                        i13 = i35;
                        if (sparseArray2.size() == 0) {
                            hVar4.l(j10);
                        }
                    }
                    i35 = i13 + 1;
                    hVar3 = hVar;
                    num5 = num;
                    z38 = z14;
                }
                if (!arrayList12.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ks(usVar, arrayList12, 1));
                }
                if (i34 != usVar.J) {
                    if (!usVar.L) {
                        arrayList13.clear();
                        usVar.Z(usVar.L);
                    } else {
                        if (usVar.M > usVar.getConnectionsManager().getCurrentTime()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        usVar.Q(z13);
                    }
                    org.telegram.messenger.g0.h3(new os(usVar, hVar5.m(), 1));
                }
                usVar.L = false;
                if (usVar.S) {
                    usVar.S(usVar.z());
                    return;
                }
                return;
            case 23:
                vy vyVar = (vy) this.f6114c;
                xy xyVar = (xy) this.f6115e;
                boolean z40 = this.f6113b;
                vyVar.f26135a = yy.C(((org.telegram.messenger.c) this.d).f21919a).A(xyVar.f26477c, xyVar.f26475a, xyVar.f26495x);
                if (z40 && xyVar.f26490r) {
                    new File(xyVar.f26477c).delete();
                }
                vyVar.f26137c.countDown();
                return;
            case 24:
                ((CameraController) this.f6114c).lambda$initCamera$3(this.f6113b, (Exception) this.d, (Runnable) this.f6115e);
                return;
            case 25:
                a();
                return;
            case 26:
                wm.C1((wm) this.f6114c, (String) this.d, (zi) this.f6115e, this.f6113b);
                return;
            case 27:
                wm wmVar2 = (wm) this.f6114c;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.f6115e;
                boolean z41 = this.f6113b;
                if (g6Var != null) {
                    wmVar2.getClass();
                    org.telegram.ui.ActionBar.g6 k10 = j6Var.k(false);
                    int i40 = g6Var.f27525a;
                    UndoView undoView = wmVar2.N3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    org.telegram.ui.ActionBar.k6.K1(j6Var, false, i40, view);
                    if (z41) {
                        org.telegram.ui.ActionBar.k6.l0(j6Var, k10, true);
                        return;
                    }
                    return;
                }
                UndoView undoView2 = wmVar2.N3;
                if (undoView2 != null) {
                    view2 = undoView2.getUndoButton();
                }
                org.telegram.ui.ActionBar.k6.K1(j6Var, false, -1, view2);
                return;
            case 28:
                hm hmVar = (hm) this.f6114c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z42 = this.f6113b;
                zi ziVar3 = (zi) this.f6115e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                wm wmVar3 = hmVar.f45934a;
                org.telegram.messenger.k5.q(null, null, 2131744404, new Object[]{wmVar3.getMessagesController().B1(org.telegram.messenger.m5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                dg.a m10 = dg.a.m(message2.suggested_post.price);
                if (m10.f8923a == dg.b.f8926b) {
                    i18 = ((org.telegram.messenger.j0) wmVar3.getMessagesController().f23167x7.f24654f.f13798b).f23620c;
                } else {
                    i18 = ((org.telegram.messenger.j0) wmVar3.getMessagesController().f23167x7.f24649c.f13798b).f23620c;
                }
                if (z42) {
                    c11 = 0;
                    wmVar = wmVar3;
                    i19 = 1;
                    m10 = dg.a.i((m10.f8924b / 1000) * i18, m10.f8923a);
                } else {
                    i19 = 1;
                    c11 = 0;
                    wmVar = wmVar3;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z42) {
                        String f12 = m10.f();
                        String J0 = ii.k.J0(i18);
                        Object[] objArr3 = new Object[2];
                        objArr3[c11] = f12;
                        objArr3[i19] = J0;
                        org.telegram.messenger.k5.q(null, null, 2131744401, objArr3, spannableStringBuilder);
                    } else {
                        Object[] objArr4 = new Object[i19];
                        objArr4[c11] = m10.f();
                        org.telegram.messenger.k5.q(null, null, 2131744400, objArr4, spannableStringBuilder);
                    }
                } else if (z42) {
                    String f13 = m10.f();
                    String K0 = x0.K0(message2.suggested_post.schedule_date);
                    String J02 = ii.k.J0(i18);
                    Object[] objArr5 = new Object[3];
                    objArr5[c11] = f13;
                    objArr5[1] = K0;
                    objArr5[2] = J02;
                    org.telegram.messenger.k5.q(null, null, 2131744402, objArr5, spannableStringBuilder);
                } else {
                    String f14 = m10.f();
                    String K02 = x0.K0(message2.suggested_post.schedule_date);
                    Object[] objArr6 = new Object[2];
                    objArr6[c11] = f14;
                    objArr6[1] = K02;
                    org.telegram.messenger.k5.q(null, null, 2131744399, objArr6, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i20 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                Object[] objArr7 = new Object[1];
                objArr7[c11] = Long.valueOf(hp.s1(i20).f23167x7.f24659i.g2(TimeUnit.HOURS));
                org.telegram.messenger.k5.q(null, null, 2131744403, objArr7, spannableStringBuilder);
                org.telegram.ui.Components.ac[] acVarArr = new org.telegram.ui.Components.ac[1];
                org.telegram.ui.s5 s5Var = new org.telegram.ui.s5(acVarArr, 4);
                wm wmVar4 = wmVar;
                org.telegram.ui.ActionBar.s1[] s1VarArr = new org.telegram.ui.ActionBar.s1[1];
                String M0 = bd.M0(2131744384, null);
                if (message2.suggested_post.schedule_date == 0) {
                    i21 = 2131748258;
                } else {
                    i21 = 2131744383;
                }
                org.telegram.ui.ActionBar.s1 u02 = org.telegram.ui.Components.t4.u0(wmVar4, M0, spannableStringBuilder, bd.M0(i21, null), false, new ai.t6(hmVar, message2, s1VarArr, ziVar3, s5Var, 27));
                s1VarArr[c11] = u02;
                u02.setOnDismissListener(s5Var);
                if (z42 && m10.f8923a == dg.b.f8925a) {
                    org.telegram.ui.Components.va a10 = org.telegram.ui.Components.wa.a(wmVar4.getParentActivity());
                    e6Var = ((org.telegram.ui.ActionBar.d2) wmVar4).resourceProvider;
                    org.telegram.ui.Components.ac G = new org.telegram.ui.Components.fc(a10, e6Var).G(2131624067, 10, bd.M0(2131744398, null));
                    G.f31792j = 60000;
                    G.k(true);
                    acVarArr[c11] = G;
                    return;
                }
                return;
            default:
                um umVar = (um) this.f6114c;
                umVar.s((org.telegram.ui.ActionBar.p3) this.d, (TLRPC.WallPaper) this.f6115e, this.f6113b);
                umVar.p(umVar.h);
                kl klVar = umVar.G.m1;
                if (klVar != null && (x2Var = klVar.M) != null) {
                    x2Var.invalidate();
                    return;
                }
                return;
        }
    }

    public u8(Object obj, Object obj2, Object obj3, boolean z10, int i3) {
        this.f6112a = i3;
        this.f6114c = obj;
        this.d = obj2;
        this.f6115e = obj3;
        this.f6113b = z10;
    }

    public u8(Object obj, Object obj2, boolean z10, Object obj3, int i3) {
        this.f6112a = i3;
        this.f6114c = obj;
        this.d = obj2;
        this.f6113b = z10;
        this.f6115e = obj3;
    }

    public u8(Object obj, TLObject tLObject, Object obj2, boolean z10, int i3) {
        this.f6112a = i3;
        this.f6114c = obj;
        this.f6115e = tLObject;
        this.d = obj2;
        this.f6113b = z10;
    }

    public u8(Object obj, boolean z10, Object obj2, Object obj3, int i3) {
        this.f6112a = i3;
        this.f6114c = obj;
        this.f6113b = z10;
        this.d = obj2;
        this.f6115e = obj3;
    }

    public u8(org.telegram.messenger.r3 r3Var, boolean z10, TLObject tLObject, TL_phone.getGroupParticipants getgroupparticipants) {
        this.f6112a = 9;
        this.f6114c = r3Var;
        this.f6113b = z10;
        this.f6115e = tLObject;
        this.d = getgroupparticipants;
    }

    public u8(li liVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f6112a = 17;
        this.f6114c = liVar;
        this.f6115e = tLObject;
        this.d = str;
        this.f6113b = z10;
    }

    public u8(hp hpVar, TLObject tLObject, boolean z10, TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked) {
        this.f6112a = 18;
        this.f6114c = hpVar;
        this.f6115e = tLObject;
        this.f6113b = z10;
        this.d = tL_contacts_getBlocked;
    }
}
