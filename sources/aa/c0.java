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
import bi.o3;
import bi.s1;
import ch.p0;
import da.q2;
import di.p8;
import di.r0;
import fi.w2;
import fi.x2;
import fi.z3;
import hi.b2;
import hi.r2;
import hi.x7;
import hi.z1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg.h0;
import oi.c2;
import oi.h4;
import oi.q3;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.f3;
import org.telegram.messenger.f4;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j0;
import org.telegram.messenger.j2;
import org.telegram.messenger.ks;
import org.telegram.messenger.mi;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.ns;
import org.telegram.messenger.po;
import org.telegram.messenger.ri;
import org.telegram.messenger.rs;
import org.telegram.messenger.s2;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t0;
import org.telegram.messenger.t3;
import org.telegram.messenger.tr;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.wy;
import org.telegram.messenger.xs;
import org.telegram.messenger.y2;
import org.telegram.messenger.yy;
import org.telegram.messenger.z4;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.s3;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.bn;
import org.telegram.ui.mm;
import org.telegram.ui.pl;
import org.telegram.ui.q5;
import org.telegram.ui.zm;
public final class c0 implements Runnable {
    public final int f786a;
    public final boolean f787b;
    public final Object f788c;
    public final Object d;
    public final Object f789e;

    public c0(x2 x2Var, View view, p0 p0Var, boolean z10, boolean z11) {
        this.f786a = 2;
        this.f788c = x2Var;
        this.d = view;
        this.f789e = p0Var;
        this.f787b = z10;
    }

    private final void a() {
        boolean z10;
        String[] split;
        String[] strArr = (String[]) this.f788c;
        m6 m6Var = (m6) this.d;
        boolean z11 = this.f787b;
        c2 c2Var = (c2) this.f789e;
        try {
            n6.f29500g0 = n6.km.get(n6.f29505g5, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                n6.f29519h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(n6.f29519h0) + ".wp").getAbsolutePath();
                try {
                    String str = m6Var.f29324c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(m6Var.f29324c).delete();
                    }
                } catch (Exception unused) {
                }
                m6Var.f29324c = absolutePath;
                Uri parse = Uri.parse(n6.f29519h0);
                m6Var.f29327e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i7 = 0; i7 < split.length; i7++) {
                        if ("blur".equals(split[i7])) {
                            m6Var.h = true;
                        } else if ("motion".equals(split[i7])) {
                            m6Var.f29336n = true;
                        }
                    }
                }
                Utilities.z(parse.getQueryParameter("intensity"));
                m6Var.f29341y = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        m6Var.f29337r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && g0.S1(queryParameter2.charAt(6))) {
                            m6Var.f29338s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && g0.S1(queryParameter2.charAt(13))) {
                            m6Var.f29339w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && g0.S1(queryParameter2.charAt(20))) {
                            m6Var.f29340x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        m6Var.f29341y = Utilities.z(queryParameter3).intValue();
                    }
                } catch (Exception unused3) {
                }
            } else {
                try {
                    if (m6Var.f29324c != null) {
                        new File(m6Var.f29324c).delete();
                    }
                } catch (Exception unused4) {
                }
                m6Var.f29324c = null;
                n6.f29519h0 = null;
            }
            if (!z11 && n6.M == null) {
                n6.K = m6Var;
                if (n6.I == n6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    n6.T = 2000;
                    n6.U = SystemClock.elapsedRealtime();
                    g0.h3(new j2(19), 2100L);
                }
            }
            n6.I = m6Var;
            n6.t1(false, false);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (n6.M == null && !n6.Q) {
            mp.u1(m6Var.F).G4(m6Var, m6Var.k(false), z11, false);
        }
        c2Var.run();
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
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
        boolean z11;
        int i11;
        char c11;
        int size;
        boolean z12;
        boolean z13;
        int i12;
        a0.h hVar;
        boolean z14;
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
        fj fjVar;
        int i19;
        int i20;
        i6 i6Var;
        o3 o3Var;
        Boolean bool = null;
        View view = null;
        View view2 = null;
        SQLitePreparedStatement executeFast2 = null;
        int i21 = 2;
        int i22 = 1;
        switch (this.f786a) {
            case 0:
                e0 e0Var = (e0) this.f788c;
                q2 q2Var = (q2) this.d;
                ca.c cVar = (ca.c) this.f789e;
                boolean z15 = this.f787b;
                e0Var.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                e0Var.f800b.e(q2Var, cVar.f5105a, z15);
                return;
            case 1:
                p8 p8Var = (p8) this.f788c;
                TLObject tLObject = (TLObject) this.f789e;
                boolean z16 = this.f787b;
                ArrayList arrayList5 = p8Var.f9513l;
                int i23 = p8Var.f9504a;
                if (((int[]) this.d)[0] == p8Var.f9514m) {
                    p8Var.f9510i = false;
                    p8Var.f9514m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        mp.u1(i23).f4(tL_payments_savedStarGifts.users, false);
                        mp.u1(i23).Z3(tL_payments_savedStarGifts.chats, false);
                        if (z16) {
                            arrayList5.clear();
                        }
                        arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                        p8Var.f9512k = tL_payments_savedStarGifts.next_offset;
                        p8Var.f9515n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        p8Var.h = bool;
                        if (arrayList5.size() <= p8Var.f9515n && p8Var.f9512k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        p8Var.f9511j = z10;
                        c10 = 1;
                    } else {
                        c10 = 1;
                        p8Var.f9511j = true;
                    }
                    ks f10 = ks.f(i23);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(p8Var.f9505b);
                    objArr[c10] = p8Var;
                    f10.k(232, objArr);
                    return;
                }
                return;
            case 2:
                x2 x2Var = (x2) this.f788c;
                p0 p0Var = (p0) this.f789e;
                boolean z17 = this.f787b;
                z3 z3Var = x2Var.f12726a;
                b5.X(z3Var.f12853m2, 1, z3Var.l1, new w2(x2Var, z17, p0Var, (View) this.d));
                return;
            case 3:
                z1 z1Var = (z1) this.f788c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.f789e;
                boolean z18 = this.f787b;
                b2 b2Var = z1Var.f15896s;
                if (z1Var.f15895r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        r2 r2Var = b2Var.f14220r;
                        ArrayList arrayList6 = b2Var.f14219n;
                        int i24 = r2.D1;
                        tr.a0(r2Var.f30223a).v1(str, messages_botresults);
                        z1Var.h = messages_botresults.next_offset;
                        if (z18) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        z1Var.f();
                    }
                    b2Var.d.c(false);
                    z1Var.f15895r = false;
                    return;
                }
                return;
            case 4:
                x7 x7Var = (x7) this.f788c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z19 = this.f787b;
                Runnable runnable = (Runnable) this.f789e;
                x7Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(x7Var.Z0);
                    if (z19) {
                        compressFormat = Bitmap.CompressFormat.WEBP;
                    } else {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    bitmap.compress(compressFormat, 90, fileOutputStream);
                } catch (Exception e10) {
                    a8.g(e10, false);
                    if (z19) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(x7Var.Z0));
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    }
                }
                bitmap.recycle();
                g0.g3(runnable);
                return;
            case 5:
                h0 h0Var = (h0) this.f788c;
                boolean z20 = this.f787b;
                y3 y3Var = (y3) this.d;
                jg.e0 e0Var2 = (jg.e0) this.f789e;
                if (!z20) {
                    h0Var.f17564c = e0Var2;
                    y3Var.setRightText(h0Var.H(e0Var2));
                    y3Var.setRightTextMargin(6);
                    h0Var.J.clear();
                    h0Var.d = true;
                    h0Var.f();
                    h0Var.P();
                    return;
                }
                return;
            case 6:
                boolean z21 = this.f787b;
                l2.g0 g0Var = (l2.g0) this.d;
                m2.i iVar = (m2.i) this.f789e;
                m2.g g10 = m2.g.g((Context) this.f788c);
                if (g10 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z21) {
                    m2.d dVar = g0Var.f19445s;
                    dVar.getClass();
                    dVar.f20582f.a(g10);
                }
                LogSessionId j3 = g10.j();
                synchronized (iVar) {
                    m2.h hVar2 = iVar.f20613b;
                    hVar2.getClass();
                    hVar2.f(j3);
                }
                return;
            case 7:
                g2 g2Var = (g2) this.d;
                boolean z22 = this.f787b;
                q3 q3Var = (q3) this.f789e;
                String trim = ((EditTextBoldCursor) this.f788c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    h4.k(g2Var, z22, new oi.f0(1, q3Var, trim));
                    return;
                }
                return;
            case 8:
                y2 y2Var = (y2) this.f788c;
                Pair pair = (Pair) this.d;
                Object obj = this.f789e;
                boolean z23 = this.f787b;
                HashMap hashMap = y2Var.f28196c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size2 = arrayList.size();
                    int i25 = 0;
                    while (i25 < size2) {
                        Object obj2 = arrayList.get(i25);
                        i25++;
                        ((w10) obj2).a(obj);
                    }
                    if (z23) {
                        arrayList.clear();
                    }
                    if (z23) {
                        y2Var.f28196c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                t3 t3Var = (t3) this.f788c;
                boolean z24 = this.f787b;
                TLObject tLObject3 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.f789e;
                t3Var.f27051u = false;
                if (z24) {
                    t3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    mp.u1(t3Var.C.f23343a).f4(groupparticipants.users, false);
                    mp.u1(t3Var.C.f23343a).Z3(groupparticipants.chats, false);
                    t3Var.m(groupparticipants.participants, z24, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                f4 f4Var = (f4) this.f788c;
                boolean z25 = this.f787b;
                f4Var.f23942b = new ArrayList((List) this.d);
                ((ResultCallback) this.f789e).onComplete(f4Var.e((z25 ? 1 : 0) | 2));
                return;
            case 11:
                i5 i5Var = (i5) this.f788c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z26 = this.f787b;
                String str2 = (String) this.f789e;
                int size3 = arrayList7.size();
                boolean z27 = false;
                int i26 = 0;
                while (i26 < size3) {
                    Object obj3 = arrayList7.get(i26);
                    i26++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) i5Var.f24694g0.get(Long.valueOf(user.f28641id));
                    if (tL_contact != null) {
                        i5Var.f24693f0.remove(tL_contact);
                        i5Var.f24694g0.remove(Long.valueOf(user.f28641id));
                        z27 = true;
                    }
                }
                if (z27) {
                    i5Var.d(false);
                }
                ks notificationCenter = i5Var.getNotificationCenter();
                int i27 = mp.I8;
                notificationCenter.k(2, 1);
                i5Var.getNotificationCenter().k(25, new Object[0]);
                if (z26) {
                    ks.e().k(295, 1, gd.a0("DeletedFromYourContacts", null, 2131751454, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.f788c;
                wo woVar = (wo) this.d;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.f789e;
                boolean z28 = this.f787b;
                String[] strArr = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = woVar.f27840b;
                tL_document.f28498id = woVar.f27839a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = woVar.f27841c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.f23343a).getCurrentDatacenterId();
                w7.G(cVar2.f23343a);
                File J = w7.J(tL_document, null, true, true);
                if (J.exists()) {
                    if (!z28) {
                        g0.g3(new z4(22, mediaController, J));
                        return;
                    }
                    return;
                }
                g0.g3(new z4(23, cVar2, tL_document));
                return;
            case 13:
                MediaController mediaController2 = (MediaController) this.f788c;
                File file = (File) this.d;
                boolean z29 = this.f787b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.f789e;
                String[] strArr2 = MediaController.W1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z30 = s2.f26829a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.f22819m1), true);
                }
                if (exists) {
                    ri.d0(mediaController2.f22813i1).F1(mediaController2.n1, mediaController2.f22823o1, mi.a(mediaController2, file.getAbsolutePath(), z29));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.f22813i1).getCurrentTime();
                tL_document2.size = (int) file.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.l1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                ks.f(mediaController2.f22813i1).k(158, new Object[0]);
                ks.f(mediaController2.f22813i1).k(162, Integer.valueOf(mediaController2.f22811h1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                ri riVar = (ri) this.f788c;
                boolean z31 = this.f787b;
                riVar.getMessagesController().f4((ArrayList) this.d, z31);
                riVar.getMessagesController().Z3((ArrayList) this.f789e, z31);
                return;
            case 15:
                ri riVar2 = (ri) this.f788c;
                boolean z32 = this.f787b;
                ArrayList arrayList8 = (ArrayList) this.d;
                a0.h hVar3 = (a0.h) this.f789e;
                try {
                    riVar2.getMessagesStorage().f27151b.beginTransaction();
                    if (z32) {
                        executeFast = riVar2.getMessagesStorage().f27151b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = riVar2.getMessagesStorage().f27151b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = riVar2.getMessagesStorage().f27151b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i28 = 0;
                    while (i28 < arrayList8.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList8.get(i28);
                        SparseArray sparseArray = (SparseArray) hVar3.f(fj.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.f28513id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList8;
                            i7 = i21;
                        } else {
                            fj.q5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i29 = 0; i29 < arrayList2.size(); i29++) {
                                fj fjVar2 = (fj) arrayList2.get(i29);
                                int i30 = 0;
                                while (i30 < i21) {
                                    if (i30 == 0) {
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
                                        sQLitePreparedStatement2.bindInteger(i21, message.f28513id);
                                        i10 = i21;
                                        sQLitePreparedStatement2.bindInteger(3, fjVar2.e1());
                                        sQLitePreparedStatement3 = executeFast;
                                        arrayList4 = arrayList8;
                                        sQLitePreparedStatement2.bindLong(4, fj.B0(fjVar2.f24073k));
                                        sQLitePreparedStatement2.step();
                                    }
                                    i30++;
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
                        i28++;
                        i21 = i7;
                        arrayList8 = arrayList3;
                        executeFast = sQLitePreparedStatement;
                    }
                    executeFast.dispose();
                    if (executeFast2 != null) {
                        executeFast2.dispose();
                    }
                    riVar2.getMessagesStorage().f27151b.commitTransaction();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 16:
                ri riVar3 = (ri) this.f788c;
                TLObject tLObject4 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f789e;
                boolean z33 = this.f787b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z33) {
                        riVar3.M1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        riVar3.N1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                ri riVar4 = (ri) this.f788c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = (String) this.f789e;
                boolean z34 = this.f787b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    riVar4.v1(str3, z34, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    riVar4.v1(str3, z34, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                mp mpVar = (mp) this.f788c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z35 = this.f787b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.f789e;
                LongSparseIntArray longSparseIntArray = mpVar.H0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    mpVar.f4(contacts_blocked.users, false);
                    mpVar.Z3(contacts_blocked.chats, false);
                    mpVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z35) {
                        longSparseIntArray.clear();
                    }
                    mpVar.I0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    mpVar.J0 = z11;
                    int size4 = contacts_blocked.blocked.size();
                    for (int i31 = 0; i31 < size4; i31++) {
                        longSparseIntArray.put(fj.B1(contacts_blocked.blocked.get(i31).peer_id), 1);
                    }
                    mpVar.G0 = false;
                    mpVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                mp mpVar2 = (mp) this.f788c;
                boolean z36 = this.f787b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList9 = (ArrayList) this.f789e;
                if (z36) {
                    i11 = 0;
                    mpVar2.getNotificationCenter().k(2, 64);
                } else {
                    i11 = 0;
                }
                mpVar2.x5(i11, -updates.chat_id, arrayList9);
                mpVar2.getNotificationCenter().k(3, new Object[i11]);
                return;
            case 20:
                po poVar = (po) this.f788c;
                TLObject tLObject7 = (TLObject) this.f789e;
                boolean z37 = this.f787b;
                int i32 = poVar.f26372a;
                ArrayList arrayList10 = poVar.f26375e;
                if (((int[]) this.d)[0] == poVar.f26376f) {
                    poVar.f26374c = false;
                    poVar.f26376f = -1;
                    if (tLObject7 instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                        mp.u1(i32).Z3(messages_chats.chats, false);
                        if (z37) {
                            arrayList10.clear();
                        }
                        arrayList10.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        poVar.f26377g = size;
                        if (arrayList10.size() >= poVar.f26377g) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        poVar.d = z12;
                        c11 = 1;
                    } else {
                        c11 = 1;
                        poVar.d = true;
                    }
                    ks f11 = ks.f(i32);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(poVar.f26373b);
                    objArr2[c11] = poVar;
                    f11.k(242, objArr2);
                    return;
                }
                return;
            case 21:
                ((tr) this.f788c).n1((List) this.d, (List) this.f789e, this.f787b);
                return;
            case 22:
                xs xsVar = (xs) this.f788c;
                a0.h hVar4 = (a0.h) this.d;
                boolean z38 = this.f787b;
                ArrayList arrayList11 = (ArrayList) this.f789e;
                ArrayList arrayList12 = xsVar.f28082b;
                a0.h hVar5 = xsVar.f28084c;
                a0.h hVar6 = xsVar.f28089f;
                int i33 = xsVar.J;
                xsVar.getAccountInstance().d();
                Integer num6 = 0;
                int i34 = 0;
                while (i34 < hVar4.m()) {
                    long j10 = hVar4.j(i34);
                    SparseArray sparseArray2 = (SparseArray) hVar5.f(j10);
                    if (sparseArray2 == null) {
                        hVar = hVar4;
                        z14 = z38;
                        i12 = i22;
                        num = num6;
                        i13 = i34;
                    } else {
                        ArrayList arrayList13 = (ArrayList) hVar4.f(j10);
                        i12 = i22;
                        int size5 = arrayList13.size();
                        hVar = hVar4;
                        int i35 = 0;
                        while (i35 < size5) {
                            int i36 = i35;
                            int intValue = ((Integer) arrayList13.get(i35)).intValue();
                            boolean z39 = z38;
                            fj fjVar3 = (fj) sparseArray2.get(intValue);
                            ArrayList arrayList14 = arrayList13;
                            if (fjVar3 == null || fjVar3.J || (z39 && !fjVar3.I)) {
                                i14 = size5;
                                num2 = num6;
                                i15 = i34;
                            } else {
                                i14 = size5;
                                long B0 = fj.B0(fjVar3.f24073k);
                                Integer num7 = (Integer) hVar6.f(B0);
                                if (num7 == null) {
                                    num3 = num6;
                                } else {
                                    num3 = num7;
                                }
                                int intValue2 = num3.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    num2 = num6;
                                    xsVar.f28087e.l(B0);
                                    Integer num8 = num3;
                                    i15 = i34;
                                    num4 = num8;
                                    num5 = num2;
                                } else {
                                    num2 = num6;
                                    Integer num9 = num3;
                                    i15 = i34;
                                    num4 = num9;
                                    num5 = valueOf;
                                }
                                if (!num5.equals(num4)) {
                                    Integer num10 = num4;
                                    if (!xsVar.getMessagesController().s2(B0)) {
                                        if (xsVar.getMessagesController().y2(B0)) {
                                            int i37 = xsVar.J;
                                            if (num10.intValue() > 0) {
                                                i16 = i12;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i38 = i37 - i16;
                                            xsVar.J = i38;
                                            if (num5.intValue() > 0) {
                                                i17 = i12;
                                            } else {
                                                i17 = 0;
                                            }
                                            xsVar.J = i38 + i17;
                                        } else {
                                            int intValue3 = xsVar.J - num10.intValue();
                                            xsVar.J = intValue3;
                                            xsVar.J = num5.intValue() + intValue3;
                                        }
                                    }
                                    hVar6.k(num5, B0);
                                }
                                if (num5.intValue() == 0) {
                                    hVar6.l(B0);
                                    xsVar.f28096r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList12.remove(fjVar3);
                                xsVar.f28080a.remove(fjVar3);
                                if (xs.E(fjVar3)) {
                                    xsVar.K--;
                                }
                                arrayList11.add(fjVar3);
                            }
                            i35 = i36 + 1;
                            arrayList13 = arrayList14;
                            z38 = z39;
                            size5 = i14;
                            num6 = num2;
                            i34 = i15;
                        }
                        z14 = z38;
                        num = num6;
                        i13 = i34;
                        if (sparseArray2.size() == 0) {
                            hVar5.l(j10);
                        }
                    }
                    i34 = i13 + 1;
                    hVar4 = hVar;
                    i22 = i12;
                    z38 = z14;
                    num6 = num;
                }
                int i39 = i22;
                if (!arrayList11.isEmpty()) {
                    g0.g3(new ns(xsVar, arrayList11, i39));
                }
                if (i33 != xsVar.J) {
                    if (!xsVar.L) {
                        arrayList12.clear();
                        xsVar.Z(xsVar.L);
                    } else {
                        if (xsVar.M > xsVar.getConnectionsManager().getCurrentTime()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        xsVar.Q(z13);
                    }
                    g0.g3(new rs(xsVar, hVar6.m(), 1));
                }
                xsVar.L = false;
                if (xsVar.S) {
                    xsVar.S(xsVar.z());
                    return;
                }
                return;
            case 23:
                wy wyVar = (wy) this.f788c;
                yy yyVar = (yy) this.f789e;
                boolean z40 = this.f787b;
                wyVar.f27885a = zy.C(((org.telegram.messenger.c) this.d).f23343a).A(yyVar.f28311c, yyVar.f28309a, yyVar.f28329x);
                if (z40 && yyVar.f28324r) {
                    new File(yyVar.f28311c).delete();
                }
                wyVar.f27887c.countDown();
                return;
            case 24:
                ((CameraController) this.f788c).lambda$initCamera$3(this.f787b, (Exception) this.d, (Runnable) this.f789e);
                return;
            case 25:
                a();
                return;
            case 26:
                bn.S0((bn) this.f788c, (String) this.d, (fj) this.f789e, this.f787b);
                return;
            case 27:
                bn bnVar = (bn) this.f788c;
                k6 k6Var = (k6) this.d;
                m6 m6Var = (m6) this.f789e;
                boolean z41 = this.f787b;
                if (k6Var != null) {
                    bnVar.getClass();
                    k6 k10 = m6Var.k(false);
                    int i40 = k6Var.f29224a;
                    UndoView undoView = bnVar.N3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    n6.K1(m6Var, false, i40, view);
                    if (z41) {
                        n6.l0(m6Var, k10, true);
                        return;
                    }
                    return;
                }
                UndoView undoView2 = bnVar.N3;
                if (undoView2 != null) {
                    view2 = undoView2.getUndoButton();
                }
                n6.K1(m6Var, false, -1, view2);
                return;
            case 28:
                mm mmVar = (mm) this.f788c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z42 = this.f787b;
                fj fjVar4 = (fj) this.f789e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                bn bnVar2 = mmVar.f50079a;
                f3.p(null, null, 2131744149, new Object[]{bnVar2.getMessagesController().D1(n5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a n10 = cg.a.n(message2.suggested_post.price);
                if (n10.f5266a == cg.b.f5269b) {
                    i18 = ((j0) bnVar2.getMessagesController().A7.f26235f.f15482b).f24899c;
                } else {
                    i18 = ((j0) bnVar2.getMessagesController().A7.f26230c.f15482b).f24899c;
                }
                if (z42) {
                    fjVar = fjVar4;
                    n10 = cg.a.j((n10.f5267b / 1000) * i18, n10.f5266a);
                } else {
                    fjVar = fjVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z42) {
                        f3.p(null, null, 2131744146, new Object[]{n10.g(), ki.j.J0(i18)}, spannableStringBuilder);
                    } else {
                        f3.p(null, null, 2131744145, new Object[]{n10.g()}, spannableStringBuilder);
                    }
                } else if (z42) {
                    f3.p(null, null, 2131744147, new Object[]{n10.g(), r0.L0(message2.suggested_post.schedule_date), ki.j.J0(i18)}, spannableStringBuilder);
                } else {
                    f3.p(null, null, 2131744144, new Object[]{n10.g(), r0.L0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i19 = ((g2) bnVar2).currentAccount;
                f3.p(null, null, 2131744148, new Object[]{Long.valueOf(mp.u1(i19).A7.f26240i.l0(TimeUnit.HOURS))}, spannableStringBuilder);
                fc[] fcVarArr = new fc[1];
                q5 q5Var = new q5(fcVarArr, 4);
                t1[] t1VarArr = new t1[1];
                String N0 = gd.N0(2131744129, null);
                if (message2.suggested_post.schedule_date == 0) {
                    i20 = 2131748057;
                } else {
                    i20 = 2131744128;
                }
                t1 s02 = b5.s0(bnVar2, N0, spannableStringBuilder, gd.N0(i20, null), false, new s1(mmVar, message2, t1VarArr, fjVar, q5Var, 28));
                t1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z42 && n10.f5266a == cg.b.f5268a) {
                    ab a10 = bb.a(bnVar2.getParentActivity());
                    i6Var = ((g2) bnVar2).resourceProvider;
                    fc G = new kc(a10, i6Var).G(2131624068, 10, gd.N0(2131744143, null));
                    G.f35091j = 60000;
                    G.k(true);
                    fcVarArr[0] = G;
                    return;
                }
                return;
            default:
                zm zmVar = (zm) this.f788c;
                zmVar.s((s3) this.d, (TLRPC.WallPaper) this.f789e, this.f787b);
                zmVar.p(zmVar.h);
                pl plVar = zmVar.G.f46279m1;
                if (plVar != null && (o3Var = plVar.M) != null) {
                    o3Var.invalidate();
                    return;
                }
                return;
        }
    }

    public c0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f786a = i7;
        this.f788c = obj;
        this.d = obj2;
        this.f789e = obj3;
        this.f787b = z10;
    }

    public c0(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f786a = i7;
        this.f788c = obj;
        this.d = obj2;
        this.f787b = z10;
        this.f789e = obj3;
    }

    public c0(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.f786a = i7;
        this.f788c = obj;
        this.f787b = z10;
        this.d = obj2;
        this.f789e = obj3;
    }

    public c0(ri riVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f786a = 17;
        this.f788c = riVar;
        this.d = tLObject;
        this.f789e = str;
        this.f787b = z10;
    }
}
