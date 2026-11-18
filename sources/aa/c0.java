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
import bi.i3;
import ch.p0;
import da.q2;
import di.o8;
import di.r0;
import fi.w2;
import fi.x2;
import fi.z3;
import hi.d7;
import hi.s1;
import hi.u1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg.h0;
import oi.a2;
import oi.g4;
import oi.p3;
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
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.wy;
import org.telegram.messenger.x10;
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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
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
        a2 a2Var = (a2) this.f789e;
        try {
            n6.f29443g0 = n6.km.get(n6.f29448g5, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                n6.f29462h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(n6.f29462h0) + ".wp").getAbsolutePath();
                try {
                    String str = m6Var.f29251c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(m6Var.f29251c).delete();
                    }
                } catch (Exception unused) {
                }
                m6Var.f29251c = absolutePath;
                Uri parse = Uri.parse(n6.f29462h0);
                m6Var.f29254e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i7 = 0; i7 < split.length; i7++) {
                        if ("blur".equals(split[i7])) {
                            m6Var.h = true;
                        } else if ("motion".equals(split[i7])) {
                            m6Var.f29263n = true;
                        }
                    }
                }
                Utilities.z(parse.getQueryParameter("intensity"));
                m6Var.f29268y = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        m6Var.f29264r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && g0.S1(queryParameter2.charAt(6))) {
                            m6Var.f29265s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && g0.S1(queryParameter2.charAt(13))) {
                            m6Var.f29266w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && g0.S1(queryParameter2.charAt(20))) {
                            m6Var.f29267x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        m6Var.f29268y = Utilities.z(queryParameter3).intValue();
                    }
                } catch (Exception unused3) {
                }
            } else {
                try {
                    if (m6Var.f29251c != null) {
                        new File(m6Var.f29251c).delete();
                    }
                } catch (Exception unused4) {
                }
                m6Var.f29251c = null;
                n6.f29462h0 = null;
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
        a2Var.run();
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
        i3 i3Var;
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
                e0Var.f800b.e(q2Var, cVar.f5110a, z15);
                return;
            case 1:
                o8 o8Var = (o8) this.f788c;
                TLObject tLObject = (TLObject) this.f789e;
                boolean z16 = this.f787b;
                ArrayList arrayList5 = o8Var.f9467l;
                int i23 = o8Var.f9458a;
                if (((int[]) this.d)[0] == o8Var.f9468m) {
                    o8Var.f9464i = false;
                    o8Var.f9468m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        mp.u1(i23).f4(tL_payments_savedStarGifts.users, false);
                        mp.u1(i23).Z3(tL_payments_savedStarGifts.chats, false);
                        if (z16) {
                            arrayList5.clear();
                        }
                        arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                        o8Var.f9466k = tL_payments_savedStarGifts.next_offset;
                        o8Var.f9469n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        o8Var.h = bool;
                        if (arrayList5.size() <= o8Var.f9469n && o8Var.f9466k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        o8Var.f9465j = z10;
                        c10 = 1;
                    } else {
                        c10 = 1;
                        o8Var.f9465j = true;
                    }
                    ks f10 = ks.f(i23);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(o8Var.f9459b);
                    objArr[c10] = o8Var;
                    f10.k(232, objArr);
                    return;
                }
                return;
            case 2:
                x2 x2Var = (x2) this.f788c;
                p0 p0Var = (p0) this.f789e;
                boolean z17 = this.f787b;
                z3 z3Var = x2Var.f12719a;
                b5.X(z3Var.f12847m2, 1, z3Var.l1, new w2(x2Var, z17, p0Var, (View) this.d));
                return;
            case 3:
                s1 s1Var = (s1) this.f788c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.f789e;
                boolean z18 = this.f787b;
                u1 u1Var = s1Var.f15371s;
                if (s1Var.f15370r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        hi.j2 j2Var = u1Var.f15526r;
                        ArrayList arrayList6 = u1Var.f15525n;
                        int i24 = hi.j2.C1;
                        tr.a0(j2Var.f30187a).v1(str, messages_botresults);
                        s1Var.h = messages_botresults.next_offset;
                        if (z18) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        s1Var.f();
                    }
                    u1Var.d.c(false);
                    s1Var.f15370r = false;
                    return;
                }
                return;
            case 4:
                d7 d7Var = (d7) this.f788c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z19 = this.f787b;
                Runnable runnable = (Runnable) this.f789e;
                d7Var.getClass();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(d7Var.Z0);
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
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(d7Var.Z0));
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
                    h0Var.f17468c = e0Var2;
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
                l2.f0 f0Var = (l2.f0) this.d;
                m2.i iVar = (m2.i) this.f789e;
                m2.g i25 = m2.g.i((Context) this.f788c);
                if (i25 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z21) {
                    m2.d dVar = f0Var.f19344s;
                    dVar.getClass();
                    dVar.f20489f.a(i25);
                }
                LogSessionId k10 = i25.k();
                synchronized (iVar) {
                    m2.h hVar2 = iVar.f20520b;
                    hVar2.getClass();
                    hVar2.f(k10);
                }
                return;
            case 7:
                h2 h2Var = (h2) this.d;
                boolean z22 = this.f787b;
                p3 p3Var = (p3) this.f789e;
                String trim = ((EditTextBoldCursor) this.f788c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    g4.k(h2Var, z22, new oi.e0(1, p3Var, trim));
                    return;
                }
                return;
            case 8:
                y2 y2Var = (y2) this.f788c;
                Pair pair = (Pair) this.d;
                Object obj = this.f789e;
                boolean z23 = this.f787b;
                HashMap hashMap = y2Var.f28073c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size2 = arrayList.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        Object obj2 = arrayList.get(i26);
                        i26++;
                        ((x10) obj2).a(obj);
                    }
                    if (z23) {
                        arrayList.clear();
                    }
                    if (z23) {
                        y2Var.f28073c.remove(pair);
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
                t3Var.f26952u = false;
                if (z24) {
                    t3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    mp.u1(t3Var.C.f23218a).f4(groupparticipants.users, false);
                    mp.u1(t3Var.C.f23218a).Z3(groupparticipants.chats, false);
                    t3Var.m(groupparticipants.participants, z24, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                f4 f4Var = (f4) this.f788c;
                boolean z25 = this.f787b;
                f4Var.f23831b = new ArrayList((List) this.d);
                ((ResultCallback) this.f789e).onComplete(f4Var.e((z25 ? 1 : 0) | 2));
                return;
            case 11:
                i5 i5Var = (i5) this.f788c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z26 = this.f787b;
                String str2 = (String) this.f789e;
                int size3 = arrayList7.size();
                boolean z27 = false;
                int i27 = 0;
                while (i27 < size3) {
                    Object obj3 = arrayList7.get(i27);
                    i27++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) i5Var.f24568g0.get(Long.valueOf(user.f28552id));
                    if (tL_contact != null) {
                        i5Var.f24567f0.remove(tL_contact);
                        i5Var.f24568g0.remove(Long.valueOf(user.f28552id));
                        z27 = true;
                    }
                }
                if (z27) {
                    i5Var.d(false);
                }
                ks notificationCenter = i5Var.getNotificationCenter();
                int i28 = mp.I8;
                notificationCenter.k(2, 1);
                i5Var.getNotificationCenter().k(25, new Object[0]);
                if (z26) {
                    ks.e().k(295, 1, gd.a0("DeletedFromYourContacts", null, 2131751455, str2));
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
                tL_document.access_hash = woVar.f27746b;
                tL_document.f28409id = woVar.f27745a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = woVar.f27747c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.f23218a).getCurrentDatacenterId();
                w7.G(cVar2.f23218a);
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
                    boolean z30 = s2.f26721a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.f22721m1), true);
                }
                if (exists) {
                    ri.d0(mediaController2.f22715i1).F1(mediaController2.n1, mediaController2.f22725o1, mi.a(mediaController2, file.getAbsolutePath(), z29));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.f22715i1).getCurrentTime();
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
                ks.f(mediaController2.f22715i1).k(158, new Object[0]);
                ks.f(mediaController2.f22715i1).k(162, Integer.valueOf(mediaController2.f22713h1), tL_document2, file.getAbsolutePath());
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
                    riVar2.getMessagesStorage().f27054b.beginTransaction();
                    if (z32) {
                        executeFast = riVar2.getMessagesStorage().f27054b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = riVar2.getMessagesStorage().f27054b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = riVar2.getMessagesStorage().f27054b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i29 = 0;
                    while (i29 < arrayList8.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList8.get(i29);
                        SparseArray sparseArray = (SparseArray) hVar3.f(fj.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.f28424id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList8;
                            i7 = i21;
                        } else {
                            fj.q5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                                fj fjVar2 = (fj) arrayList2.get(i30);
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
                                        sQLitePreparedStatement2.bindInteger(i21, message.f28424id);
                                        i10 = i21;
                                        sQLitePreparedStatement2.bindInteger(3, fjVar2.e1());
                                        sQLitePreparedStatement3 = executeFast;
                                        arrayList4 = arrayList8;
                                        sQLitePreparedStatement2.bindLong(4, fj.B0(fjVar2.f23965k));
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
                    riVar2.getMessagesStorage().f27054b.commitTransaction();
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
                    for (int i32 = 0; i32 < size4; i32++) {
                        longSparseIntArray.put(fj.B1(contacts_blocked.blocked.get(i32).peer_id), 1);
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
                int i33 = poVar.f26278a;
                ArrayList arrayList10 = poVar.f26281e;
                if (((int[]) this.d)[0] == poVar.f26282f) {
                    poVar.f26280c = false;
                    poVar.f26282f = -1;
                    if (tLObject7 instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                        mp.u1(i33).Z3(messages_chats.chats, false);
                        if (z37) {
                            arrayList10.clear();
                        }
                        arrayList10.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        poVar.f26283g = size;
                        if (arrayList10.size() >= poVar.f26283g) {
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
                    ks f11 = ks.f(i33);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(poVar.f26279b);
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
                ArrayList arrayList12 = xsVar.f27966b;
                a0.h hVar5 = xsVar.f27968c;
                a0.h hVar6 = xsVar.f27973f;
                int i34 = xsVar.J;
                xsVar.getAccountInstance().d();
                Integer num6 = 0;
                int i35 = 0;
                while (i35 < hVar4.m()) {
                    long j3 = hVar4.j(i35);
                    SparseArray sparseArray2 = (SparseArray) hVar5.f(j3);
                    if (sparseArray2 == null) {
                        hVar = hVar4;
                        z14 = z38;
                        i12 = i22;
                        num = num6;
                        i13 = i35;
                    } else {
                        ArrayList arrayList13 = (ArrayList) hVar4.f(j3);
                        i12 = i22;
                        int size5 = arrayList13.size();
                        hVar = hVar4;
                        int i36 = 0;
                        while (i36 < size5) {
                            int i37 = i36;
                            int intValue = ((Integer) arrayList13.get(i36)).intValue();
                            boolean z39 = z38;
                            fj fjVar3 = (fj) sparseArray2.get(intValue);
                            ArrayList arrayList14 = arrayList13;
                            if (fjVar3 == null || fjVar3.J || (z39 && !fjVar3.I)) {
                                i14 = size5;
                                num2 = num6;
                                i15 = i35;
                            } else {
                                i14 = size5;
                                long B0 = fj.B0(fjVar3.f23965k);
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
                                    xsVar.f27971e.l(B0);
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
                                    if (!xsVar.getMessagesController().s2(B0)) {
                                        if (xsVar.getMessagesController().y2(B0)) {
                                            int i38 = xsVar.J;
                                            if (num10.intValue() > 0) {
                                                i16 = i12;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i39 = i38 - i16;
                                            xsVar.J = i39;
                                            if (num5.intValue() > 0) {
                                                i17 = i12;
                                            } else {
                                                i17 = 0;
                                            }
                                            xsVar.J = i39 + i17;
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
                                    xsVar.f27980r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList12.remove(fjVar3);
                                xsVar.f27964a.remove(fjVar3);
                                if (xs.E(fjVar3)) {
                                    xsVar.K--;
                                }
                                arrayList11.add(fjVar3);
                            }
                            i36 = i37 + 1;
                            arrayList13 = arrayList14;
                            z38 = z39;
                            size5 = i14;
                            num6 = num2;
                            i35 = i15;
                        }
                        z14 = z38;
                        num = num6;
                        i13 = i35;
                        if (sparseArray2.size() == 0) {
                            hVar5.l(j3);
                        }
                    }
                    i35 = i13 + 1;
                    hVar4 = hVar;
                    i22 = i12;
                    z38 = z14;
                    num6 = num;
                }
                int i40 = i22;
                if (!arrayList11.isEmpty()) {
                    g0.g3(new ns(xsVar, arrayList11, i40));
                }
                if (i34 != xsVar.J) {
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
                wyVar.f27791a = zy.C(((org.telegram.messenger.c) this.d).f23218a).A(yyVar.f28211c, yyVar.f28209a, yyVar.f28229x);
                if (z40 && yyVar.f28224r) {
                    new File(yyVar.f28211c).delete();
                }
                wyVar.f27793c.countDown();
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
                    k6 k11 = m6Var.k(false);
                    int i41 = k6Var.f29168a;
                    UndoView undoView = bnVar.N3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    n6.K1(m6Var, false, i41, view);
                    if (z41) {
                        n6.l0(m6Var, k11, true);
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
                bn bnVar2 = mmVar.f49896a;
                f3.p(null, null, 2131744159, new Object[]{bnVar2.getMessagesController().D1(n5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a n10 = cg.a.n(message2.suggested_post.price);
                if (n10.f5271a == cg.b.f5274b) {
                    i18 = ((j0) bnVar2.getMessagesController().A7.f26140f.f15536b).f24764c;
                } else {
                    i18 = ((j0) bnVar2.getMessagesController().A7.f26135c.f15536b).f24764c;
                }
                if (z42) {
                    fjVar = fjVar4;
                    n10 = cg.a.j((n10.f5272b / 1000) * i18, n10.f5271a);
                } else {
                    fjVar = fjVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z42) {
                        f3.p(null, null, 2131744156, new Object[]{n10.g(), ki.k.J0(i18)}, spannableStringBuilder);
                    } else {
                        f3.p(null, null, 2131744155, new Object[]{n10.g()}, spannableStringBuilder);
                    }
                } else if (z42) {
                    f3.p(null, null, 2131744157, new Object[]{n10.g(), r0.L0(message2.suggested_post.schedule_date), ki.k.J0(i18)}, spannableStringBuilder);
                } else {
                    f3.p(null, null, 2131744154, new Object[]{n10.g(), r0.L0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i19 = ((h2) bnVar2).currentAccount;
                f3.p(null, null, 2131744158, new Object[]{Long.valueOf(mp.u1(i19).A7.f26145i.n2(TimeUnit.HOURS))}, spannableStringBuilder);
                gc[] gcVarArr = new gc[1];
                q5 q5Var = new q5(gcVarArr, 4);
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                String M0 = gd.M0(2131744139, null);
                if (message2.suggested_post.schedule_date == 0) {
                    i20 = 2131748058;
                } else {
                    i20 = 2131744138;
                }
                org.telegram.ui.ActionBar.u1 s02 = b5.s0(bnVar2, M0, spannableStringBuilder, gd.M0(i20, null), false, new ai.b(mmVar, message2, u1VarArr, fjVar, q5Var, 29));
                u1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z42 && n10.f5271a == cg.b.f5273a) {
                    bb a10 = cb.a(bnVar2.getParentActivity());
                    i6Var = ((h2) bnVar2).resourceProvider;
                    gc G = new lc(a10, i6Var).G(2131624068, 10, gd.M0(2131744153, null));
                    G.f35461j = 60000;
                    G.k(true);
                    gcVarArr[0] = G;
                    return;
                }
                return;
            default:
                zm zmVar = (zm) this.f788c;
                zmVar.s((org.telegram.ui.ActionBar.t3) this.d, (TLRPC.WallPaper) this.f789e, this.f787b);
                zmVar.p(zmVar.h);
                pl plVar = zmVar.G.f46084m1;
                if (plVar != null && (i3Var = plVar.M) != null) {
                    i3Var.invalidate();
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
