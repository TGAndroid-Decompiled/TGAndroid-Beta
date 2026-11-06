package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import bi.e1;
import bi.ec;
import bi.u0;
import bi.v9;
import ch.o0;
import da.q2;
import di.d3;
import di.e3;
import di.i4;
import fi.e7;
import fi.k2;
import fi.r1;
import fi.t1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg.h0;
import l2.i0;
import li.h4;
import li.q3;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.ap;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.d4;
import org.telegram.messenger.dt;
import org.telegram.messenger.dz;
import org.telegram.messenger.fz;
import org.telegram.messenger.g5;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.j0;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.pd;
import org.telegram.messenger.pi;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.r3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t0;
import org.telegram.messenger.to;
import org.telegram.messenger.ts;
import org.telegram.messenger.ui;
import org.telegram.messenger.w7;
import org.telegram.messenger.x2;
import org.telegram.messenger.xs;
import org.telegram.messenger.y4;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.an;
import org.telegram.ui.lm;
import org.telegram.ui.ol;
import org.telegram.ui.q5;
import org.telegram.ui.ym;
public final class d0 implements Runnable {
    public final int f791a;
    public final boolean f792b;
    public final Object f793c;
    public final Object d;
    public final Object f794e;

    public d0(e3 e3Var, View view, o0 o0Var, boolean z9, boolean z10) {
        this.f791a = 2;
        this.f793c = e3Var;
        this.d = view;
        this.f794e = o0Var;
        this.f792b = z9;
    }

    private final void a() {
        boolean z9;
        String[] split;
        String[] strArr = (String[]) this.f793c;
        j6 j6Var = (j6) this.d;
        boolean z10 = this.f792b;
        l2.w wVar = (l2.w) this.f794e;
        try {
            k6.f27897g0 = k6.hm.get(k6.f27902g5, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                k6.f27916h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(k6.f27916h0) + ".wp").getAbsolutePath();
                try {
                    String str = j6Var.f27629c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(j6Var.f27629c).delete();
                    }
                } catch (Exception unused) {
                }
                j6Var.f27629c = absolutePath;
                Uri parse = Uri.parse(k6.f27916h0);
                j6Var.f27632e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i7 = 0; i7 < split.length; i7++) {
                        if ("blur".equals(split[i7])) {
                            j6Var.h = true;
                        } else if ("motion".equals(split[i7])) {
                            j6Var.f27640n = true;
                        }
                    }
                }
                Utilities.z(parse.getQueryParameter("intensity"));
                j6Var.f27645y = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        j6Var.f27641r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && org.telegram.messenger.g0.S1(queryParameter2.charAt(6))) {
                            j6Var.f27642s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && org.telegram.messenger.g0.S1(queryParameter2.charAt(13))) {
                            j6Var.f27643w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && org.telegram.messenger.g0.S1(queryParameter2.charAt(20))) {
                            j6Var.f27644x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        j6Var.f27645y = Utilities.z(queryParameter3).intValue();
                    }
                } catch (Exception unused3) {
                }
            } else {
                try {
                    if (j6Var.f27629c != null) {
                        new File(j6Var.f27629c).delete();
                    }
                } catch (Exception unused4) {
                }
                j6Var.f27629c = null;
                k6.f27916h0 = null;
            }
            if (!z10 && k6.M == null) {
                k6.K = j6Var;
                if (k6.I == k6.J) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    k6.T = 2000;
                    k6.U = SystemClock.elapsedRealtime();
                    org.telegram.messenger.g0.i3(new pd(11), 2100L);
                }
            }
            k6.I = j6Var;
            k6.t1(false, false);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (k6.M == null && !k6.Q) {
            qp.s1(j6Var.E).x4(j6Var, j6Var.k(false), z10, false);
        }
        wVar.run();
    }

    @Override
    public final void run() {
        char c10;
        boolean z9;
        Bitmap.CompressFormat compressFormat;
        ArrayList arrayList;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList3;
        int i7;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i10;
        SQLitePreparedStatement sQLitePreparedStatement3;
        ArrayList arrayList4;
        boolean z10;
        int i11;
        char c11;
        int size;
        boolean z11;
        boolean z12;
        int i12;
        a0.h hVar;
        boolean z13;
        Integer num;
        int i13;
        int i14;
        Integer num2;
        int i15;
        Integer num3;
        Integer num4;
        Integer num5;
        int i16;
        int i17;
        int i18;
        ij ijVar;
        int i19;
        int i20;
        f6 f6Var;
        ec ecVar;
        Boolean bool = null;
        View view = null;
        View view2 = null;
        SQLitePreparedStatement executeFast2 = null;
        int i21 = 2;
        int i22 = 1;
        switch (this.f791a) {
            case 0:
                f0 f0Var = (f0) this.f793c;
                q2 q2Var = (q2) this.d;
                ca.c cVar = (ca.c) this.f794e;
                boolean z14 = this.f792b;
                f0Var.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                f0Var.f805b.e(q2Var, cVar.f6003a, z14);
                return;
            case 1:
                v9 v9Var = (v9) this.f793c;
                TLObject tLObject = (TLObject) this.f794e;
                boolean z15 = this.f792b;
                ArrayList arrayList5 = v9Var.f4915l;
                int i23 = v9Var.f4906a;
                if (((int[]) this.d)[0] == v9Var.f4916m) {
                    v9Var.f4912i = false;
                    v9Var.f4916m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        qp.s1(i23).Y3(tL_payments_savedStarGifts.users, false);
                        qp.s1(i23).S3(tL_payments_savedStarGifts.chats, false);
                        if (z15) {
                            arrayList5.clear();
                        }
                        arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                        v9Var.f4914k = tL_payments_savedStarGifts.next_offset;
                        v9Var.f4917n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        v9Var.h = bool;
                        if (arrayList5.size() <= v9Var.f4917n && v9Var.f4914k != null) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        v9Var.f4913j = z9;
                        c10 = 1;
                    } else {
                        c10 = 1;
                        v9Var.f4913j = true;
                    }
                    qs f10 = qs.f(i23);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(v9Var.f4907b);
                    objArr[c10] = v9Var;
                    f10.k(230, objArr);
                    return;
                }
                return;
            case 2:
                e3 e3Var = (e3) this.f793c;
                o0 o0Var = (o0) this.f794e;
                boolean z16 = this.f792b;
                i4 i4Var = e3Var.f8958a;
                v4.X(i4Var.f9168l2, 1, i4Var.f9164k1, new d3(e3Var, z16, o0Var, (View) this.d));
                return;
            case 3:
                r1 r1Var = (r1) this.f793c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.f794e;
                boolean z17 = this.f792b;
                t1 t1Var = r1Var.f12723s;
                if (r1Var.f12722r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        k2 k2Var = t1Var.f12845r;
                        ArrayList arrayList6 = t1Var.f12844n;
                        int i24 = k2.f12251y1;
                        yr.a0(k2Var.f28612a).v1(str, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z17) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        r1Var.f();
                    }
                    t1Var.d.c(false);
                    r1Var.f12722r = false;
                    return;
                }
                return;
            case 4:
                e7 e7Var = (e7) this.f793c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z18 = this.f792b;
                Runnable runnable = (Runnable) this.f794e;
                e7Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(e7Var.Z0);
                    if (z18) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e10) {
                    a8.g(e10, false);
                    if (z18) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(e7Var.Z0));
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                org.telegram.messenger.g0.h3(runnable);
                return;
            case 5:
                h0 h0Var = (h0) this.f793c;
                boolean z19 = this.f792b;
                x3 x3Var = (x3) this.d;
                jg.e0 e0Var = (jg.e0) this.f794e;
                if (!z19) {
                    h0Var.f16736c = e0Var;
                    x3Var.setRightText(h0Var.H(e0Var));
                    x3Var.setRightTextMargin(6);
                    h0Var.I.clear();
                    h0Var.d = true;
                    h0Var.f();
                    h0Var.P();
                    return;
                }
                return;
            case 6:
                boolean z20 = this.f792b;
                i0 i0Var = (i0) this.d;
                m2.j jVar = (m2.j) this.f794e;
                m2.h i25 = m2.h.i((Context) this.f793c);
                if (i25 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z20) {
                    m2.e eVar = i0Var.f17881s;
                    eVar.getClass();
                    eVar.f19529f.a(i25);
                }
                LogSessionId k10 = i25.k();
                synchronized (jVar) {
                    m2.i iVar = jVar.f19560b;
                    iVar.getClass();
                    iVar.f(k10);
                }
                return;
            case 7:
                f2 f2Var = (f2) this.d;
                boolean z21 = this.f792b;
                q3 q3Var = (q3) this.f794e;
                String trim = ((EditTextBoldCursor) this.f793c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    h4.k(f2Var, z21, new ab.g(24, q3Var, trim));
                    return;
                }
                return;
            case 8:
                x2 x2Var = (x2) this.f793c;
                Pair pair = (Pair) this.d;
                Object obj = this.f794e;
                boolean z22 = this.f792b;
                HashMap hashMap = x2Var.f26420c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size2 = arrayList.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        Object obj2 = arrayList.get(i26);
                        i26++;
                        ((c20) obj2).a(obj);
                    }
                    if (z22) {
                        arrayList.clear();
                    }
                    if (z22) {
                        x2Var.f26420c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                r3 r3Var = (r3) this.f793c;
                boolean z23 = this.f792b;
                TLObject tLObject3 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.f794e;
                r3Var.f25218u = false;
                if (z23) {
                    r3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    qp.s1(r3Var.C.f21723a).Y3(groupparticipants.users, false);
                    qp.s1(r3Var.C.f21723a).S3(groupparticipants.chats, false);
                    r3Var.m(groupparticipants.participants, z23, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                d4 d4Var = (d4) this.f793c;
                boolean z24 = this.f792b;
                d4Var.f21950b = new ArrayList((List) this.d);
                ((ResultCallback) this.f794e).onComplete(d4Var.e((z24 ? 1 : 0) | 2));
                return;
            case 11:
                g5 g5Var = (g5) this.f793c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z25 = this.f792b;
                String str2 = (String) this.f794e;
                int size3 = arrayList7.size();
                boolean z26 = false;
                int i27 = 0;
                while (i27 < size3) {
                    Object obj3 = arrayList7.get(i27);
                    i27++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) g5Var.f22584f0.get(Long.valueOf(user.f27101id));
                    if (tL_contact != null) {
                        g5Var.f22582e0.remove(tL_contact);
                        g5Var.f22584f0.remove(Long.valueOf(user.f27101id));
                        z26 = true;
                    }
                }
                if (z26) {
                    g5Var.d(false);
                }
                qs notificationCenter = g5Var.getNotificationCenter();
                int i28 = qp.C8;
                notificationCenter.k(2, 1);
                g5Var.getNotificationCenter().k(25, new Object[0]);
                if (z25) {
                    qs.e().k(292, 1, hd.a0("DeletedFromYourContacts", null, 2131751467, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.f793c;
                ap apVar = (ap) this.d;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.f794e;
                boolean z27 = this.f792b;
                String[] strArr = MediaController.V1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = apVar.f21485b;
                tL_document.f26958id = apVar.f21484a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = apVar.f21486c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.f21723a).getCurrentDatacenterId();
                w7.G(cVar2.f21723a);
                File K = w7.K(tL_document, null, true, true);
                if (K.exists()) {
                    if (!z27) {
                        org.telegram.messenger.g0.h3(new y4(22, mediaController, K));
                        return;
                    }
                    return;
                }
                org.telegram.messenger.g0.h3(new y4(23, cVar2, tL_document));
                return;
            case 13:
                MediaController mediaController2 = (MediaController) this.f793c;
                File file = (File) this.d;
                boolean z28 = this.f792b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.f794e;
                String[] strArr2 = MediaController.V1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z29 = r2.f25191a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.f21273k1 + " writedFrames" + mediaController2.l1), true);
                }
                if (exists) {
                    ui.b0(mediaController2.f21267h1).B1(mediaController2.f21275m1, mediaController2.n1, pi.a(mediaController2, file.getAbsolutePath(), z28));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.f21267h1).getCurrentTime();
                tL_document2.size = (int) file.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.f21273k1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                qs.f(mediaController2.f21267h1).k(158, new Object[0]);
                qs.f(mediaController2.f21267h1).k(162, Integer.valueOf(mediaController2.f21265g1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                ui uiVar = (ui) this.f793c;
                boolean z30 = this.f792b;
                uiVar.getMessagesController().Y3((ArrayList) this.d, z30);
                uiVar.getMessagesController().S3((ArrayList) this.f794e, z30);
                return;
            case 15:
                ui uiVar2 = (ui) this.f793c;
                boolean z31 = this.f792b;
                ArrayList arrayList8 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.f794e;
                try {
                    uiVar2.getMessagesStorage().f26690b.beginTransaction();
                    if (z31) {
                        executeFast = uiVar2.getMessagesStorage().f26690b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = uiVar2.getMessagesStorage().f26690b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = uiVar2.getMessagesStorage().f26690b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i29 = 0;
                    while (i29 < arrayList8.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList8.get(i29);
                        SparseArray sparseArray = (SparseArray) hVar2.f(ij.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.f26973id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList8;
                            i7 = i21;
                        } else {
                            ij.r5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                                ij ijVar2 = (ij) arrayList2.get(i30);
                                int i31 = 0;
                                while (i31 < i21) {
                                    if (i31 == 0) {
                                        sQLitePreparedStatement2 = executeFast;
                                    } else {
                                        sQLitePreparedStatement2 = executeFast2;
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                        sQLitePreparedStatement3 = executeFast;
                                        arrayList4 = arrayList8;
                                        i10 = i21;
                                    } else {
                                        sQLitePreparedStatement2.requery();
                                        sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer);
                                        sQLitePreparedStatement2.bindInteger(i21, message.f26973id);
                                        i10 = i21;
                                        sQLitePreparedStatement2.bindInteger(3, ijVar2.f1());
                                        sQLitePreparedStatement3 = executeFast;
                                        arrayList4 = arrayList8;
                                        sQLitePreparedStatement2.bindLong(4, ij.B0(ijVar2.f23237k));
                                        sQLitePreparedStatement2.step();
                                    }
                                    i31++;
                                    i21 = i10;
                                    arrayList8 = arrayList4;
                                    executeFast = sQLitePreparedStatement3;
                                }
                            }
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList8;
                            i7 = i21;
                            nativeByteBuffer.reuse();
                        }
                        i29++;
                        i21 = i7;
                        arrayList8 = arrayList3;
                        executeFast = sQLitePreparedStatement;
                    }
                    executeFast.dispose();
                    if (executeFast2 != null) {
                        executeFast2.dispose();
                    }
                    uiVar2.getMessagesStorage().f26690b.commitTransaction();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 16:
                ui uiVar3 = (ui) this.f793c;
                TLObject tLObject4 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f794e;
                boolean z32 = this.f792b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z32) {
                        uiVar3.J1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        uiVar3.K1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                ui uiVar4 = (ui) this.f793c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = (String) this.f794e;
                boolean z33 = this.f792b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    uiVar4.s1(str3, z33, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    uiVar4.s1(str3, z33, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                qp qpVar = (qp) this.f793c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z34 = this.f792b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.f794e;
                LongSparseIntArray longSparseIntArray = qpVar.G0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    qpVar.Y3(contacts_blocked.users, false);
                    qpVar.S3(contacts_blocked.chats, false);
                    qpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z34) {
                        longSparseIntArray.clear();
                    }
                    qpVar.H0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qpVar.I0 = z10;
                    int size4 = contacts_blocked.blocked.size();
                    for (int i32 = 0; i32 < size4; i32++) {
                        longSparseIntArray.put(ij.C1(contacts_blocked.blocked.get(i32).peer_id), 1);
                    }
                    qpVar.F0 = false;
                    qpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                qp qpVar2 = (qp) this.f793c;
                boolean z35 = this.f792b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList9 = (ArrayList) this.f794e;
                if (z35) {
                    i11 = 0;
                    qpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i11 = 0;
                }
                qpVar2.l5(i11, -updates.chat_id, arrayList9);
                qpVar2.getNotificationCenter().k(3, new Object[i11]);
                return;
            case 20:
                to toVar = (to) this.f793c;
                TLObject tLObject7 = (TLObject) this.f794e;
                boolean z36 = this.f792b;
                int i33 = toVar.f25637a;
                ArrayList arrayList10 = toVar.f25640e;
                if (((int[]) this.d)[0] == toVar.f25641f) {
                    toVar.f25639c = false;
                    toVar.f25641f = -1;
                    if (tLObject7 instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                        qp.s1(i33).S3(messages_chats.chats, false);
                        if (z36) {
                            arrayList10.clear();
                        }
                        arrayList10.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        toVar.f25642g = size;
                        if (arrayList10.size() >= toVar.f25642g) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        toVar.d = z11;
                        c11 = 1;
                    } else {
                        c11 = 1;
                        toVar.d = true;
                    }
                    qs f11 = qs.f(i33);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(toVar.f25638b);
                    objArr2[c11] = toVar;
                    f11.k(239, objArr2);
                    return;
                }
                return;
            case 21:
                ((yr) this.f793c).n1((List) this.d, (List) this.f794e, this.f792b);
                return;
            case 22:
                dt dtVar = (dt) this.f793c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z37 = this.f792b;
                ArrayList arrayList11 = (ArrayList) this.f794e;
                ArrayList arrayList12 = dtVar.f22060b;
                a0.h hVar4 = dtVar.f22062c;
                a0.h hVar5 = dtVar.f22067f;
                int i34 = dtVar.I;
                dtVar.getAccountInstance().c();
                Integer num6 = 0;
                int i35 = 0;
                while (i35 < hVar3.m()) {
                    long j3 = hVar3.j(i35);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j3);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z13 = z37;
                        i12 = i22;
                        num = num6;
                        i13 = i35;
                    } else {
                        ArrayList arrayList13 = (ArrayList) hVar3.f(j3);
                        i12 = i22;
                        int size5 = arrayList13.size();
                        hVar = hVar3;
                        int i36 = 0;
                        while (i36 < size5) {
                            int i37 = i36;
                            int intValue = ((Integer) arrayList13.get(i36)).intValue();
                            boolean z38 = z37;
                            ij ijVar3 = (ij) sparseArray2.get(intValue);
                            ArrayList arrayList14 = arrayList13;
                            if (ijVar3 == null || ijVar3.J || (z38 && !ijVar3.I)) {
                                i14 = size5;
                                num2 = num6;
                                i15 = i35;
                            } else {
                                i14 = size5;
                                long B0 = ij.B0(ijVar3.f23237k);
                                Integer num7 = (Integer) hVar5.f(B0);
                                if (num7 == null) {
                                    num3 = num6;
                                } else {
                                    num3 = num7;
                                }
                                int intValue2 = num3.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    num2 = num6;
                                    dtVar.f22065e.l(B0);
                                    Integer num8 = num3;
                                    i15 = i35;
                                    num4 = num8;
                                    num5 = num2;
                                } else {
                                    num2 = num6;
                                    Integer num9 = num3;
                                    i15 = i35;
                                    num4 = num9;
                                    num5 = valueOf;
                                }
                                if (!num5.equals(num4)) {
                                    Integer num10 = num4;
                                    if (!dtVar.getMessagesController().p2(B0)) {
                                        if (dtVar.getMessagesController().t2(B0)) {
                                            int i38 = dtVar.I;
                                            if (num10.intValue() > 0) {
                                                i16 = i12;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i39 = i38 - i16;
                                            dtVar.I = i39;
                                            if (num5.intValue() > 0) {
                                                i17 = i12;
                                            } else {
                                                i17 = 0;
                                            }
                                            dtVar.I = i39 + i17;
                                        } else {
                                            int intValue3 = dtVar.I - num10.intValue();
                                            dtVar.I = intValue3;
                                            dtVar.I = num5.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num5, B0);
                                }
                                if (num5.intValue() == 0) {
                                    hVar5.l(B0);
                                    dtVar.f22073r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList12.remove(ijVar3);
                                dtVar.f22058a.remove(ijVar3);
                                if (dt.E(ijVar3)) {
                                    dtVar.J--;
                                }
                                arrayList11.add(ijVar3);
                            }
                            i36 = i37 + 1;
                            arrayList13 = arrayList14;
                            z37 = z38;
                            size5 = i14;
                            num6 = num2;
                            i35 = i15;
                        }
                        z13 = z37;
                        num = num6;
                        i13 = i35;
                        if (sparseArray2.size() == 0) {
                            hVar4.l(j3);
                        }
                    }
                    i35 = i13 + 1;
                    hVar3 = hVar;
                    i22 = i12;
                    z37 = z13;
                    num6 = num;
                }
                int i40 = i22;
                if (!arrayList11.isEmpty()) {
                    org.telegram.messenger.g0.h3(new ts(dtVar, arrayList11, i40));
                }
                if (i34 != dtVar.I) {
                    if (!dtVar.K) {
                        arrayList12.clear();
                        dtVar.Z(dtVar.K);
                    } else {
                        if (dtVar.L > dtVar.getConnectionsManager().getCurrentTime()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        dtVar.Q(z12);
                    }
                    org.telegram.messenger.g0.h3(new xs(dtVar, hVar5.m(), 1));
                }
                dtVar.K = false;
                if (dtVar.R) {
                    dtVar.S(dtVar.z());
                    return;
                }
                return;
            case 23:
                dz dzVar = (dz) this.f793c;
                fz fzVar = (fz) this.f794e;
                boolean z39 = this.f792b;
                dzVar.f22120a = gz.C(((org.telegram.messenger.c) this.d).f21723a).A(fzVar.f22486c, fzVar.f22484a, fzVar.f22504x);
                if (z39 && fzVar.f22499r) {
                    new File(fzVar.f22486c).delete();
                }
                dzVar.f22122c.countDown();
                return;
            case 24:
                ((CameraController) this.f793c).lambda$initCamera$3(this.f792b, (Exception) this.d, (Runnable) this.f794e);
                return;
            case 25:
                a();
                return;
            case 26:
                an.C1((an) this.f793c, (String) this.d, (ij) this.f794e, this.f792b);
                return;
            case 27:
                an anVar = (an) this.f793c;
                h6 h6Var = (h6) this.d;
                j6 j6Var = (j6) this.f794e;
                boolean z40 = this.f792b;
                if (h6Var != null) {
                    anVar.getClass();
                    h6 k11 = j6Var.k(false);
                    int i41 = h6Var.f27515a;
                    UndoView undoView = anVar.M3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    k6.K1(j6Var, false, i41, view);
                    if (z40) {
                        k6.l0(j6Var, k11, true);
                        return;
                    }
                    return;
                }
                UndoView undoView2 = anVar.M3;
                if (undoView2 != null) {
                    view2 = undoView2.getUndoButton();
                }
                k6.K1(j6Var, false, -1, view2);
                return;
            case 28:
                lm lmVar = (lm) this.f793c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z41 = this.f792b;
                ij ijVar4 = (ij) this.f794e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                an anVar2 = lmVar.f47561a;
                k5.q(null, null, 2131744395, new Object[]{anVar2.getMessagesController().B1(m5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a m10 = cg.a.m(message2.suggested_post.price);
                if (m10.f6160a == cg.b.f6163b) {
                    i18 = ((j0) anVar2.getMessagesController().f24927x7.f24427f.f13555b).f23432c;
                } else {
                    i18 = ((j0) anVar2.getMessagesController().f24927x7.f24422c.f13555b).f23432c;
                }
                if (z41) {
                    ijVar = ijVar4;
                    m10 = cg.a.i((m10.f6161b / 1000) * i18, m10.f6160a);
                } else {
                    ijVar = ijVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z41) {
                        k5.q(null, null, 2131744392, new Object[]{m10.f(), hi.j.J0(i18)}, spannableStringBuilder);
                    } else {
                        k5.q(null, null, 2131744391, new Object[]{m10.f()}, spannableStringBuilder);
                    }
                } else if (z41) {
                    k5.q(null, null, 2131744393, new Object[]{m10.f(), e1.K0(message2.suggested_post.schedule_date), hi.j.J0(i18)}, spannableStringBuilder);
                } else {
                    k5.q(null, null, 2131744390, new Object[]{m10.f(), e1.K0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i19 = ((f2) anVar2).currentAccount;
                k5.q(null, null, 2131744394, new Object[]{Long.valueOf(qp.s1(i19).f24927x7.f24432i.M1(TimeUnit.HOURS))}, spannableStringBuilder);
                cc[] ccVarArr = new cc[1];
                q5 q5Var = new q5(ccVarArr, 4);
                u1[] u1VarArr = new u1[1];
                String M0 = hd.M0(2131744375, null);
                if (message2.suggested_post.schedule_date == 0) {
                    i20 = 2131748249;
                } else {
                    i20 = 2131744374;
                }
                u1 s02 = v4.s0(anVar2, M0, spannableStringBuilder, hd.M0(i20, null), false, new u0(lmVar, message2, u1VarArr, ijVar, q5Var, 25));
                u1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z41 && m10.f6160a == cg.b.f6162a) {
                    wa a10 = xa.a(anVar2.getParentActivity());
                    f6Var = ((f2) anVar2).resourceProvider;
                    cc G = new hc(a10, f6Var).G(2131624067, 10, hd.M0(2131744389, null));
                    G.f32527j = 60000;
                    G.k(true);
                    ccVarArr[0] = G;
                    return;
                }
                return;
            default:
                ym ymVar = (ym) this.f793c;
                ymVar.s((org.telegram.ui.ActionBar.r3) this.d, (TLRPC.WallPaper) this.f794e, this.f792b);
                ymVar.p(ymVar.h);
                ol olVar = ymVar.G.l1;
                if (olVar != null && (ecVar = olVar.L) != null) {
                    ecVar.invalidate();
                    return;
                }
                return;
        }
    }

    public d0(Object obj, Object obj2, Object obj3, boolean z9, int i7) {
        this.f791a = i7;
        this.f793c = obj;
        this.d = obj2;
        this.f794e = obj3;
        this.f792b = z9;
    }

    public d0(Object obj, Object obj2, boolean z9, Object obj3, int i7) {
        this.f791a = i7;
        this.f793c = obj;
        this.d = obj2;
        this.f792b = z9;
        this.f794e = obj3;
    }

    public d0(Object obj, boolean z9, Object obj2, Object obj3, int i7) {
        this.f791a = i7;
        this.f793c = obj;
        this.f792b = z9;
        this.d = obj2;
        this.f794e = obj3;
    }

    public d0(ui uiVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z9) {
        this.f791a = 17;
        this.f793c = uiVar;
        this.d = tLObject;
        this.f794e = str;
        this.f792b = z9;
    }
}
