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
import bi.o2;
import ch.p0;
import da.q2;
import di.m8;
import di.s0;
import fi.b4;
import fi.y2;
import fi.z2;
import hi.d7;
import hi.i2;
import hi.r1;
import hi.t1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jg.h0;
import kg.j1;
import oi.e4;
import oi.n3;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.at;
import org.telegram.messenger.bz;
import org.telegram.messenger.c6;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.d4;
import org.telegram.messenger.dz;
import org.telegram.messenger.ez;
import org.telegram.messenger.g0;
import org.telegram.messenger.g5;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.ni;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.qo;
import org.telegram.messenger.qs;
import org.telegram.messenger.r2;
import org.telegram.messenger.r3;
import org.telegram.messenger.si;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t0;
import org.telegram.messenger.us;
import org.telegram.messenger.vr;
import org.telegram.messenger.w7;
import org.telegram.messenger.x2;
import org.telegram.messenger.x4;
import org.telegram.messenger.xo;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.ta;
import org.telegram.ui.Components.xb;
import org.telegram.ui.an;
import org.telegram.ui.lm;
import org.telegram.ui.ol;
import org.telegram.ui.q5;
import org.telegram.ui.ym;
public final class c0 implements Runnable {
    public final int f787a;
    public final boolean f788b;
    public final Object f789c;
    public final Object d;
    public final Object f790e;

    public c0(z2 z2Var, View view, p0 p0Var, boolean z10, boolean z11) {
        this.f787a = 2;
        this.f789c = z2Var;
        this.d = view;
        this.f790e = p0Var;
        this.f788b = z10;
    }

    private final void a() {
        boolean z10;
        String[] split;
        String[] strArr = (String[]) this.f789c;
        i6 i6Var = (i6) this.d;
        boolean z11 = this.f788b;
        j1 j1Var = (j1) this.f790e;
        try {
            j6.f28898g0 = j6.km.get(j6.f28903g5, -1);
            if (!TextUtils.isEmpty(strArr[0])) {
                j6.f28917h0 = strArr[0];
                String absolutePath = new File(t0.h(), Utilities.a(j6.f28917h0) + ".wp").getAbsolutePath();
                try {
                    String str = i6Var.f28702c;
                    if (str != null && !str.equals(absolutePath)) {
                        new File(i6Var.f28702c).delete();
                    }
                } catch (Exception unused) {
                }
                i6Var.f28702c = absolutePath;
                Uri parse = Uri.parse(j6.f28917h0);
                i6Var.f28705e = parse.getQueryParameter("slug");
                String queryParameter = parse.getQueryParameter("mode");
                if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                    for (int i7 = 0; i7 < split.length; i7++) {
                        if ("blur".equals(split[i7])) {
                            i6Var.h = true;
                        } else if ("motion".equals(split[i7])) {
                            i6Var.f28714n = true;
                        }
                    }
                }
                Utilities.z(parse.getQueryParameter("intensity"));
                i6Var.f28719y = 45;
                try {
                    String queryParameter2 = parse.getQueryParameter("bg_color");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        i6Var.f28715r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                        if (queryParameter2.length() >= 13 && g0.S1(queryParameter2.charAt(6))) {
                            i6Var.f28716s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                        }
                        if (queryParameter2.length() >= 20 && g0.S1(queryParameter2.charAt(13))) {
                            i6Var.f28717w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                        }
                        if (queryParameter2.length() == 27 && g0.S1(queryParameter2.charAt(20))) {
                            i6Var.f28718x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                        }
                    }
                } catch (Exception unused2) {
                }
                try {
                    String queryParameter3 = parse.getQueryParameter("rotation");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        i6Var.f28719y = Utilities.z(queryParameter3).intValue();
                    }
                } catch (Exception unused3) {
                }
            } else {
                try {
                    if (i6Var.f28702c != null) {
                        new File(i6Var.f28702c).delete();
                    }
                } catch (Exception unused4) {
                }
                i6Var.f28702c = null;
                j6.f28917h0 = null;
            }
            if (!z11 && j6.M == null) {
                j6.K = i6Var;
                if (j6.I == j6.J) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    j6.T = 2000;
                    j6.U = SystemClock.elapsedRealtime();
                    g0.i3(new c6(17), 2100L);
                }
            }
            j6.I = i6Var;
            j6.t1(false, false);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (j6.M == null && !j6.Q) {
            np.s1(i6Var.F).x4(i6Var, i6Var.k(false), z11, false);
        }
        j1Var.run();
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
        gj gjVar;
        int i19;
        int i20;
        e6 e6Var;
        o2 o2Var;
        Boolean bool = null;
        View view = null;
        View view2 = null;
        SQLitePreparedStatement executeFast2 = null;
        int i21 = 2;
        int i22 = 1;
        switch (this.f787a) {
            case 0:
                e0 e0Var = (e0) this.f789c;
                q2 q2Var = (q2) this.d;
                ca.c cVar = (ca.c) this.f790e;
                boolean z15 = this.f788b;
                e0Var.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                e0Var.f801b.e(q2Var, cVar.f4828a, z15);
                return;
            case 1:
                m8 m8Var = (m8) this.f789c;
                TLObject tLObject = (TLObject) this.f790e;
                boolean z16 = this.f788b;
                ArrayList arrayList5 = m8Var.f9051l;
                int i23 = m8Var.f9042a;
                if (((int[]) this.d)[0] == m8Var.f9052m) {
                    m8Var.f9048i = false;
                    m8Var.f9052m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        np.s1(i23).Y3(tL_payments_savedStarGifts.users, false);
                        np.s1(i23).S3(tL_payments_savedStarGifts.chats, false);
                        if (z16) {
                            arrayList5.clear();
                        }
                        arrayList5.addAll(tL_payments_savedStarGifts.gifts);
                        m8Var.f9050k = tL_payments_savedStarGifts.next_offset;
                        m8Var.f9053n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        }
                        m8Var.h = bool;
                        if (arrayList5.size() <= m8Var.f9053n && m8Var.f9050k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        m8Var.f9049j = z10;
                        c10 = 1;
                    } else {
                        c10 = 1;
                        m8Var.f9049j = true;
                    }
                    ns f10 = ns.f(i23);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(m8Var.f9043b);
                    objArr[c10] = m8Var;
                    f10.k(230, objArr);
                    return;
                }
                return;
            case 2:
                z2 z2Var = (z2) this.f789c;
                p0 p0Var = (p0) this.f790e;
                boolean z17 = this.f788b;
                b4 b4Var = z2Var.f12578a;
                t4.X(b4Var.f11497m2, 1, b4Var.l1, new y2(z2Var, z17, p0Var, (View) this.d));
                return;
            case 3:
                r1 r1Var = (r1) this.f789c;
                TLObject tLObject2 = (TLObject) this.d;
                String str = (String) this.f790e;
                boolean z18 = this.f788b;
                t1 t1Var = r1Var.f14969s;
                if (r1Var.f14968r) {
                    if (tLObject2 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        i2 i2Var = t1Var.f15141r;
                        ArrayList arrayList6 = t1Var.f15140n;
                        int i24 = i2.C1;
                        vr.a0(i2Var.f29679a).v1(str, messages_botresults);
                        r1Var.h = messages_botresults.next_offset;
                        if (z18) {
                            arrayList6.clear();
                        }
                        arrayList6.size();
                        arrayList6.addAll(messages_botresults.results);
                        r1Var.f();
                    }
                    t1Var.d.c(false);
                    r1Var.f14968r = false;
                    return;
                }
                return;
            case 4:
                d7 d7Var = (d7) this.f789c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z19 = this.f788b;
                Runnable runnable = (Runnable) this.f790e;
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
                g0.h3(runnable);
                return;
            case 5:
                h0 h0Var = (h0) this.f789c;
                boolean z20 = this.f788b;
                x3 x3Var = (x3) this.d;
                jg.e0 e0Var2 = (jg.e0) this.f790e;
                if (!z20) {
                    h0Var.f17085c = e0Var2;
                    x3Var.setRightText(h0Var.H(e0Var2));
                    x3Var.setRightTextMargin(6);
                    h0Var.J.clear();
                    h0Var.d = true;
                    h0Var.f();
                    h0Var.P();
                    return;
                }
                return;
            case 6:
                boolean z21 = this.f788b;
                l2.f0 f0Var = (l2.f0) this.d;
                m2.j jVar = (m2.j) this.f790e;
                m2.h g10 = m2.h.g((Context) this.f789c);
                if (g10 == null) {
                    h2.a.l("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z21) {
                    m2.e eVar = f0Var.f18980s;
                    eVar.getClass();
                    eVar.f20128f.a(g10);
                }
                LogSessionId i25 = g10.i();
                synchronized (jVar) {
                    m2.i iVar = jVar.f20159b;
                    iVar.getClass();
                    iVar.f(i25);
                }
                return;
            case 7:
                e2 e2Var = (e2) this.d;
                boolean z22 = this.f788b;
                n3 n3Var = (n3) this.f790e;
                String trim = ((EditTextBoldCursor) this.f789c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    e4.k(e2Var, z22, new m2.d(3, n3Var, trim));
                    return;
                }
                return;
            case 8:
                x2 x2Var = (x2) this.f789c;
                Pair pair = (Pair) this.d;
                Object obj = this.f790e;
                boolean z23 = this.f788b;
                HashMap hashMap = x2Var.f27457c;
                if (hashMap != null && (arrayList = (ArrayList) hashMap.get(pair)) != null) {
                    int size2 = arrayList.size();
                    int i26 = 0;
                    while (i26 < size2) {
                        Object obj2 = arrayList.get(i26);
                        i26++;
                        ((z10) obj2).a(obj);
                    }
                    if (z23) {
                        arrayList.clear();
                    }
                    if (z23) {
                        x2Var.f27457c.remove(pair);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                r3 r3Var = (r3) this.f789c;
                boolean z24 = this.f788b;
                TLObject tLObject3 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.f790e;
                r3Var.f26225u = false;
                if (z24) {
                    r3Var.v = false;
                }
                if (tLObject3 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject3;
                    np.s1(r3Var.C.f22778a).Y3(groupparticipants.users, false);
                    np.s1(r3Var.C.f22778a).S3(groupparticipants.chats, false);
                    r3Var.m(groupparticipants.participants, z24, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 10:
                d4 d4Var = (d4) this.f789c;
                boolean z25 = this.f788b;
                d4Var.f23025b = new ArrayList((List) this.d);
                ((ResultCallback) this.f790e).onComplete(d4Var.e((z25 ? 1 : 0) | 2));
                return;
            case 11:
                g5 g5Var = (g5) this.f789c;
                ArrayList arrayList7 = (ArrayList) this.d;
                boolean z26 = this.f788b;
                String str2 = (String) this.f790e;
                int size3 = arrayList7.size();
                boolean z27 = false;
                int i27 = 0;
                while (i27 < size3) {
                    Object obj3 = arrayList7.get(i27);
                    i27++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) g5Var.f23680g0.get(Long.valueOf(user.f28200id));
                    if (tL_contact != null) {
                        g5Var.f23679f0.remove(tL_contact);
                        g5Var.f23680g0.remove(Long.valueOf(user.f28200id));
                        z27 = true;
                    }
                }
                if (z27) {
                    g5Var.d(false);
                }
                ns notificationCenter = g5Var.getNotificationCenter();
                int i28 = np.D8;
                notificationCenter.k(2, 1);
                g5Var.getNotificationCenter().k(25, new Object[0]);
                if (z26) {
                    ns.e().k(292, 1, hd.a0("DeletedFromYourContacts", null, 2131751466, str2));
                    return;
                }
                return;
            case 12:
                MediaController mediaController = (MediaController) this.f789c;
                xo xoVar = (xo) this.d;
                org.telegram.messenger.c cVar2 = (org.telegram.messenger.c) this.f790e;
                boolean z28 = this.f788b;
                String[] strArr = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = xoVar.f27560b;
                tL_document.f28057id = xoVar.f27559a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = xoVar.f27561c;
                tL_document.dc_id = ConnectionsManager.getInstance(cVar2.f22778a).getCurrentDatacenterId();
                w7.G(cVar2.f22778a);
                File J = w7.J(tL_document, null, true, true);
                if (J.exists()) {
                    if (!z28) {
                        g0.h3(new x4(22, mediaController, J));
                        return;
                    }
                    return;
                }
                g0.h3(new x4(23, cVar2, tL_document));
                return;
            case 13:
                MediaController mediaController2 = (MediaController) this.f789c;
                File file = (File) this.d;
                boolean z29 = this.f788b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.f790e;
                String[] strArr2 = MediaController.W1;
                boolean exists = file.exists();
                if (!exists) {
                    boolean z30 = r2.f26198a;
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.f22358m1), true);
                }
                if (exists) {
                    si.b0(mediaController2.f22352i1).B1(mediaController2.n1, mediaController2.f22362o1, ni.a(mediaController2, file.getAbsolutePath(), z29));
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.f22352i1).getCurrentTime();
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
                ns.f(mediaController2.f22352i1).k(158, new Object[0]);
                ns.f(mediaController2.f22352i1).k(162, Integer.valueOf(mediaController2.f22350h1), tL_document2, file.getAbsolutePath());
                mediaController2.Y(false);
                return;
            case 14:
                si siVar = (si) this.f789c;
                boolean z31 = this.f788b;
                siVar.getMessagesController().Y3((ArrayList) this.d, z31);
                siVar.getMessagesController().S3((ArrayList) this.f790e, z31);
                return;
            case 15:
                si siVar2 = (si) this.f789c;
                boolean z32 = this.f788b;
                ArrayList arrayList8 = (ArrayList) this.d;
                a0.h hVar2 = (a0.h) this.f790e;
                try {
                    siVar2.getMessagesStorage().f27222b.beginTransaction();
                    if (z32) {
                        executeFast = siVar2.getMessagesStorage().f27222b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    } else {
                        executeFast = siVar2.getMessagesStorage().f27222b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        executeFast2 = siVar2.getMessagesStorage().f27222b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i29 = 0;
                    while (i29 < arrayList8.size()) {
                        TLRPC.Message message = (TLRPC.Message) arrayList8.get(i29);
                        SparseArray sparseArray = (SparseArray) hVar2.f(gj.B0(message));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message.f28072id)) == null) {
                            sQLitePreparedStatement = executeFast;
                            arrayList3 = arrayList8;
                            i7 = i21;
                        } else {
                            gj.q5(message);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                            message.serializeToStream(nativeByteBuffer);
                            for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                                gj gjVar2 = (gj) arrayList2.get(i30);
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
                                        sQLitePreparedStatement2.bindInteger(i21, message.f28072id);
                                        i10 = i21;
                                        sQLitePreparedStatement2.bindInteger(3, gjVar2.e1());
                                        sQLitePreparedStatement3 = executeFast;
                                        arrayList4 = arrayList8;
                                        sQLitePreparedStatement2.bindLong(4, gj.B0(gjVar2.f23817k));
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
                    siVar2.getMessagesStorage().f27222b.commitTransaction();
                    return;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return;
                }
            case 16:
                si siVar3 = (si) this.f789c;
                TLObject tLObject4 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f790e;
                boolean z33 = this.f788b;
                if (tLObject4 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject4.getObjectSize());
                    tLObject4.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z33) {
                        siVar3.K1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        siVar3.L1 = (TLRPC.TL_emojiList) tLObject4;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 17:
                si siVar4 = (si) this.f789c;
                TLObject tLObject5 = (TLObject) this.d;
                String str3 = (String) this.f790e;
                boolean z34 = this.f788b;
                if (tLObject5 instanceof TLRPC.TL_messages_stickerSet) {
                    siVar4.s1(str3, z34, (TLRPC.TL_messages_stickerSet) tLObject5, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    siVar4.s1(str3, z34, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            case 18:
                np npVar = (np) this.f789c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z35 = this.f788b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.f790e;
                LongSparseIntArray longSparseIntArray = npVar.H0;
                if (tLObject6 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject6;
                    npVar.Y3(contacts_blocked.users, false);
                    npVar.S3(contacts_blocked.chats, false);
                    npVar.getMessagesStorage().m1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z35) {
                        longSparseIntArray.clear();
                    }
                    npVar.I0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    if (contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    npVar.J0 = z11;
                    int size4 = contacts_blocked.blocked.size();
                    for (int i32 = 0; i32 < size4; i32++) {
                        longSparseIntArray.put(gj.B1(contacts_blocked.blocked.get(i32).peer_id), 1);
                    }
                    npVar.G0 = false;
                    npVar.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
            case 19:
                np npVar2 = (np) this.f789c;
                boolean z36 = this.f788b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList9 = (ArrayList) this.f790e;
                if (z36) {
                    i11 = 0;
                    npVar2.getNotificationCenter().k(2, 64);
                } else {
                    i11 = 0;
                }
                npVar2.m5(i11, -updates.chat_id, arrayList9);
                npVar2.getNotificationCenter().k(3, new Object[i11]);
                return;
            case 20:
                qo qoVar = (qo) this.f789c;
                TLObject tLObject7 = (TLObject) this.f790e;
                boolean z37 = this.f788b;
                int i33 = qoVar.f26114a;
                ArrayList arrayList10 = qoVar.f26117e;
                if (((int[]) this.d)[0] == qoVar.f26118f) {
                    qoVar.f26116c = false;
                    qoVar.f26118f = -1;
                    if (tLObject7 instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject7;
                        np.s1(i33).S3(messages_chats.chats, false);
                        if (z37) {
                            arrayList10.clear();
                        }
                        arrayList10.addAll(messages_chats.chats);
                        if (messages_chats instanceof TLRPC.TL_messages_chatsSlice) {
                            size = messages_chats.count;
                        } else {
                            size = messages_chats.chats.size();
                        }
                        qoVar.f26119g = size;
                        if (arrayList10.size() >= qoVar.f26119g) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        qoVar.d = z12;
                        c11 = 1;
                    } else {
                        c11 = 1;
                        qoVar.d = true;
                    }
                    ns f11 = ns.f(i33);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = Long.valueOf(qoVar.f26115b);
                    objArr2[c11] = qoVar;
                    f11.k(239, objArr2);
                    return;
                }
                return;
            case 21:
                ((vr) this.f789c).n1((List) this.d, (List) this.f790e, this.f788b);
                return;
            case 22:
                at atVar = (at) this.f789c;
                a0.h hVar3 = (a0.h) this.d;
                boolean z38 = this.f788b;
                ArrayList arrayList11 = (ArrayList) this.f790e;
                ArrayList arrayList12 = atVar.f22567b;
                a0.h hVar4 = atVar.f22569c;
                a0.h hVar5 = atVar.f22574f;
                int i34 = atVar.J;
                atVar.getAccountInstance().d();
                Integer num6 = 0;
                int i35 = 0;
                while (i35 < hVar3.m()) {
                    long j3 = hVar3.j(i35);
                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j3);
                    if (sparseArray2 == null) {
                        hVar = hVar3;
                        z14 = z38;
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
                            boolean z39 = z38;
                            gj gjVar3 = (gj) sparseArray2.get(intValue);
                            ArrayList arrayList14 = arrayList13;
                            if (gjVar3 == null || gjVar3.J || (z39 && !gjVar3.I)) {
                                i14 = size5;
                                num2 = num6;
                                i15 = i35;
                            } else {
                                i14 = size5;
                                long B0 = gj.B0(gjVar3.f23817k);
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
                                    atVar.f22572e.l(B0);
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
                                    if (!atVar.getMessagesController().p2(B0)) {
                                        if (atVar.getMessagesController().t2(B0)) {
                                            int i38 = atVar.J;
                                            if (num10.intValue() > 0) {
                                                i16 = i12;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i39 = i38 - i16;
                                            atVar.J = i39;
                                            if (num5.intValue() > 0) {
                                                i17 = i12;
                                            } else {
                                                i17 = 0;
                                            }
                                            atVar.J = i39 + i17;
                                        } else {
                                            int intValue3 = atVar.J - num10.intValue();
                                            atVar.J = intValue3;
                                            atVar.J = num5.intValue() + intValue3;
                                        }
                                    }
                                    hVar5.k(num5, B0);
                                }
                                if (num5.intValue() == 0) {
                                    hVar5.l(B0);
                                    atVar.f22581r.l(B0);
                                }
                                sparseArray2.remove(intValue);
                                arrayList12.remove(gjVar3);
                                atVar.f22565a.remove(gjVar3);
                                if (at.E(gjVar3)) {
                                    atVar.K--;
                                }
                                arrayList11.add(gjVar3);
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
                            hVar4.l(j3);
                        }
                    }
                    i35 = i13 + 1;
                    hVar3 = hVar;
                    i22 = i12;
                    z38 = z14;
                    num6 = num;
                }
                int i40 = i22;
                if (!arrayList11.isEmpty()) {
                    g0.h3(new qs(atVar, arrayList11, i40));
                }
                if (i34 != atVar.J) {
                    if (!atVar.L) {
                        arrayList12.clear();
                        atVar.Z(atVar.L);
                    } else {
                        if (atVar.M > atVar.getConnectionsManager().getCurrentTime()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        atVar.Q(z13);
                    }
                    g0.h3(new us(atVar, hVar5.m(), 1));
                }
                atVar.L = false;
                if (atVar.S) {
                    atVar.S(atVar.z());
                    return;
                }
                return;
            case 23:
                bz bzVar = (bz) this.f789c;
                dz dzVar = (dz) this.f790e;
                boolean z40 = this.f788b;
                bzVar.f22774a = ez.C(((org.telegram.messenger.c) this.d).f22778a).A(dzVar.f23189c, dzVar.f23187a, dzVar.f23207x);
                if (z40 && dzVar.f23202r) {
                    new File(dzVar.f23189c).delete();
                }
                bzVar.f22776c.countDown();
                return;
            case 24:
                ((CameraController) this.f789c).lambda$initCamera$3(this.f788b, (Exception) this.d, (Runnable) this.f790e);
                return;
            case 25:
                a();
                return;
            case 26:
                an.S0((an) this.f789c, (String) this.d, (gj) this.f790e, this.f788b);
                return;
            case 27:
                an anVar = (an) this.f789c;
                g6 g6Var = (g6) this.d;
                i6 i6Var = (i6) this.f790e;
                boolean z41 = this.f788b;
                if (g6Var != null) {
                    anVar.getClass();
                    g6 k10 = i6Var.k(false);
                    int i41 = g6Var.f28602a;
                    UndoView undoView = anVar.N3;
                    if (undoView != null) {
                        view = undoView.getUndoButton();
                    }
                    j6.K1(i6Var, false, i41, view);
                    if (z41) {
                        j6.l0(i6Var, k10, true);
                        return;
                    }
                    return;
                }
                UndoView undoView2 = anVar.N3;
                if (undoView2 != null) {
                    view2 = undoView2.getUndoButton();
                }
                j6.K1(i6Var, false, -1, view2);
                return;
            case 28:
                lm lmVar = (lm) this.f789c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                boolean z42 = this.f788b;
                gj gjVar4 = (gj) this.f790e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                an anVar2 = lmVar.f49005a;
                k5.p(null, null, 2131744394, new Object[]{anVar2.getMessagesController().B1(m5.o(message2.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                cg.a m10 = cg.a.m(message2.suggested_post.price);
                if (m10.f4985a == cg.b.f4988b) {
                    i18 = ((j0) anVar2.getMessagesController().f25448y7.f25844f.f15881b).f24493c;
                } else {
                    i18 = ((j0) anVar2.getMessagesController().f25448y7.f25839c.f15881b).f24493c;
                }
                if (z42) {
                    gjVar = gjVar4;
                    m10 = cg.a.i((m10.f4986b / 1000) * i18, m10.f4985a);
                } else {
                    gjVar = gjVar4;
                }
                if (message2.suggested_post.schedule_date == 0) {
                    if (z42) {
                        k5.p(null, null, 2131744391, new Object[]{m10.f(), ki.k.J0(i18)}, spannableStringBuilder);
                    } else {
                        k5.p(null, null, 2131744390, new Object[]{m10.f()}, spannableStringBuilder);
                    }
                } else if (z42) {
                    k5.p(null, null, 2131744392, new Object[]{m10.f(), s0.K0(message2.suggested_post.schedule_date), ki.k.J0(i18)}, spannableStringBuilder);
                } else {
                    k5.p(null, null, 2131744389, new Object[]{m10.f(), s0.K0(message2.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i19 = ((e2) anVar2).currentAccount;
                k5.p(null, null, 2131744393, new Object[]{Long.valueOf(np.s1(i19).f25448y7.f25849i.z0(TimeUnit.HOURS))}, spannableStringBuilder);
                xb[] xbVarArr = new xb[1];
                q5 q5Var = new q5(xbVarArr, 4);
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                String M0 = hd.M0(2131744374, null);
                if (message2.suggested_post.schedule_date == 0) {
                    i20 = 2131748250;
                } else {
                    i20 = 2131744373;
                }
                org.telegram.ui.ActionBar.t1 s02 = t4.s0(anVar2, M0, spannableStringBuilder, hd.M0(i20, null), false, new ai.b(lmVar, message2, t1VarArr, gjVar, q5Var, 28));
                t1VarArr[0] = s02;
                s02.setOnDismissListener(q5Var);
                if (z42 && m10.f4985a == cg.b.f4987a) {
                    sa a10 = ta.a(anVar2.getParentActivity());
                    e6Var = ((e2) anVar2).resourceProvider;
                    xb G = new cc(a10, e6Var).G(2131624068, 10, hd.M0(2131744388, null));
                    G.f41643j = 60000;
                    G.k(true);
                    xbVarArr[0] = G;
                    return;
                }
                return;
            default:
                ym ymVar = (ym) this.f789c;
                ymVar.s((p3) this.d, (TLRPC.WallPaper) this.f790e, this.f788b);
                ymVar.p(ymVar.h);
                ol olVar = ymVar.G.f45278m1;
                if (olVar != null && (o2Var = olVar.M) != null) {
                    o2Var.invalidate();
                    return;
                }
                return;
        }
    }

    public c0(Object obj, Object obj2, Object obj3, boolean z10, int i7) {
        this.f787a = i7;
        this.f789c = obj;
        this.d = obj2;
        this.f790e = obj3;
        this.f788b = z10;
    }

    public c0(Object obj, Object obj2, boolean z10, Object obj3, int i7) {
        this.f787a = i7;
        this.f789c = obj;
        this.d = obj2;
        this.f788b = z10;
        this.f790e = obj3;
    }

    public c0(Object obj, boolean z10, Object obj2, Object obj3, int i7) {
        this.f787a = i7;
        this.f789c = obj;
        this.f788b = z10;
        this.d = obj2;
        this.f790e = obj3;
    }

    public c0(si siVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f787a = 17;
        this.f789c = siVar;
        this.d = tLObject;
        this.f790e = str;
        this.f788b = z10;
    }
}
