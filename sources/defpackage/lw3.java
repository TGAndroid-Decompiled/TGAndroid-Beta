package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class lw3 implements Runnable {
    public final byte a;
    public final Object b;

    public lw3(n64 n64Var, SurfaceTexture surfaceTexture) {
        this.a = (byte) 9;
        this.b = n64Var;
    }

    @Override
    public final void run() {
        boolean z;
        Object obj;
        int min;
        int i;
        int i2;
        TLRPC.TL_messages_reportFeedEvents tL_messages_reportFeedEvents;
        z94 z94Var;
        int i3;
        int i4;
        long j;
        ArrayList arrayList;
        int i5;
        TLRPC.Document document;
        int i6;
        int i7;
        int i8 = 0;
        switch (this.a) {
            case 0:
                nw3 nw3Var = (nw3) this.b;
                ArrayList arrayList2 = nw3Var.w;
                ArrayList arrayList3 = nw3Var.s;
                ow3 ow3Var = nw3Var.O;
                zw3 zw3Var = ow3Var.s;
                int i9 = zw3.C1;
                ls6 d0 = ls6.d0(zw3Var.a);
                String str = nw3Var.I;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList j0 = d0.j0(7, false);
                    nw3Var.y = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    nw3Var.E.clear();
                    nw3Var.n.clear();
                    nw3Var.y++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    arrayList3.addAll(j0);
                    nw3Var.y = j0.size() + nw3Var.y;
                    nw3Var.J = nw3Var.I;
                    nw3Var.f();
                    dw3 dw3Var = ow3Var.b;
                    int i10 = dw3.q3;
                    dw3Var.A1(0, 0);
                    ow3Var.f.c(false);
                    ow3Var.e.n(false);
                    return;
                } else if (ow3Var.a == 1 && pv3.d(nw3Var.I)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = nw3Var.I;
                    tL_messages_getStickers.hash = 0L;
                    ConnectionsManager.getInstance(zw3Var.a).sendRequest(tL_messages_getStickers, new mw3(nw3Var, str, (byte) 0));
                    return;
                } else {
                    String[] F0 = hl.F0();
                    String[] strArr = nw3Var.K;
                    if (strArr == null || !Arrays.equals(F0, strArr)) {
                        ls6.d0(zw3Var.a).O(F0, false);
                    }
                    nw3Var.K = F0;
                    d0.X(F0, nw3Var.I, false, new fu2(nw3Var, str, d0, (byte) 8), false, false, false, true, 50);
                    return;
                }
            case 1:
                sw3 sw3Var = (sw3) ((c7) this.b).b;
                if (!sw3Var.n) {
                    sw3Var.r.setVisibility(8);
                    return;
                }
                return;
            case 2:
                ww3 ww3Var = (ww3) ((vw3) this.b).b;
                ArrayList arrayList4 = ww3Var.o;
                if (!arrayList4.isEmpty()) {
                    ww3Var.l.e(true, 0.0f);
                    int i11 = ww3Var.k + 1;
                    ww3Var.k = i11;
                    if (i11 > arrayList4.size() - 1) {
                        ww3Var.k = 0;
                    }
                    p39 p39Var = ww3Var.j;
                    p39Var.e((w49) arrayList4.get(ww3Var.k));
                    ww3Var.j = ww3Var.i;
                    ww3Var.i = p39Var;
                    ww3Var.p.invalidate();
                    return;
                }
                return;
            case 3:
                ((hy3) this.b).a(true, true);
                return;
            case 4:
                n04 n04Var = (n04) this.b;
                if (n04Var.a0.getEmojiView() != null) {
                    o24 emojiView = n04Var.a0.getEmojiView();
                    if (!emojiView.g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.s;
                            char[] cArr = jx3.a;
                            int i12 = sparseIntArray.get(8);
                            if (i12 > 0) {
                                emojiView.Q.E0();
                                emojiView.U(i12);
                                emojiView.E(i12, hl.L(-9.0f));
                                emojiView.j(0, null);
                                return;
                            }
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                n14 n14Var = (n14) this.b;
                o14 o14Var = n14Var.a;
                if (!o14Var.G.W.G) {
                    ArrayList arrayList5 = new ArrayList();
                    o14Var.G.W.d(true);
                    o14Var.F(new vx3(n14Var, arrayList5, (byte) 4), arrayList5, true);
                    return;
                }
                return;
            case 6:
                g14 g14Var = (g14) this.b;
                g14Var.x.f = true;
                g14Var.a(true);
                return;
            case 7:
                hl.P3(((c24) this.b).h, true, true);
                return;
            case 8:
                s64 s64Var = (s64) this.b;
                lo loVar = s64Var.C;
                Context context = s64Var.e;
                String str2 = gcc.a;
                int generateAudioSessionId = j00.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                loVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((xgb) loVar.c).a.getLooper()) {
                    obj = loVar.e;
                } else {
                    if (myLooper == ((xgb) loVar.b).a.getLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    yve.p(z);
                    obj = loVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    loVar.f = valueOf;
                    zd0 zd0Var = new zd0(loVar, valueOf, (byte) 0);
                    xgb xgbVar = (xgb) loVar.c;
                    if (xgbVar.a.getLooper().getThread().isAlive()) {
                        xgbVar.e(zd0Var);
                    }
                    xgb xgbVar2 = s64Var.l.h;
                    wgb b = xgbVar2.b(40, generateAudioSessionId, 0);
                    Handler handler = xgbVar2.a;
                    Message message = b.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    b.a();
                    return;
                }
                return;
            case 9:
                s64 s64Var2 = ((n64) this.b).a;
                s64Var2.q1(null);
                s64Var2.f1(0, 0);
                return;
            case 10:
                mg8 mg8Var = (mg8) this.b;
                try {
                    synchronized (mg8Var) {
                    }
                    mg8Var.a.d(mg8Var.c, mg8Var.d);
                    mg8Var.a(true);
                    return;
                } catch (e64 e) {
                    efd.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    grb.m(e);
                    return;
                }
            case 11:
                new wqa(((xd5) this.b).getContext()).show();
                return;
            case 12:
                int i13 = 0;
                q84 q84Var = (q84) this.b;
                LongSparseArray longSparseArray = q84Var.c;
                while (longSparseArray.size() > 0) {
                    int i14 = i13;
                    long keyAt = longSparseArray.keyAt(i14);
                    HashMap hashMap = (HashMap) longSparseArray.valueAt(i14);
                    longSparseArray.removeAt(i14);
                    ArrayList arrayList6 = new ArrayList(hashMap.keySet());
                    q84Var.d.addAll(arrayList6);
                    r4c r4cVar = new r4c(q84Var, keyAt, arrayList6, hashMap, (byte) 4);
                    if (arrayList6.isEmpty()) {
                        r4cVar.a(new ArrayList());
                    } else {
                        jf7 Y = jf7.Y(q84Var.a);
                        Y.a.c(new cv2(Y, arrayList6, r4cVar, (byte) 24));
                    }
                    i13 = 0;
                }
                longSparseArray.clear();
                return;
            case 13:
                ((v94) this.b).requestLayout();
                return;
            case 14:
                ((w94) this.b).b();
                return;
            case 15:
                ((da4) this.b).a();
                return;
            case 16:
                String str3 = "feed.likePost";
                ja4 ja4Var = (ja4) this.b;
                HashMap hashMap2 = ja4Var.c;
                ca4 ca4Var = ja4Var.a;
                String str4 = ca4Var.a;
                ArrayList arrayList7 = ja4Var.b;
                ja4Var.h = false;
                ja4Var.g = false;
                if (!ja4Var.f) {
                    ja4Var.b();
                    int i15 = yac.t0;
                    for (int i16 = 0; i16 < 4; i16++) {
                        if (str4.equals(ea4.i(i16))) {
                            i15 = i16;
                        }
                    }
                    int g = ea4.g(i15);
                    int size = arrayList7.size();
                    Iterator it = arrayList7.iterator();
                    while (it.hasNext()) {
                        ha4 ha4Var = (ha4) it.next();
                        int i17 = g - ha4Var.j;
                        Integer num = ha4Var.i;
                        if (num != null) {
                            i5 = num.intValue() / 1000;
                        } else {
                            i5 = 0;
                        }
                        if (i17 - i5 >= 3600) {
                            ha4Var.toString();
                            it.remove();
                            hashMap2.remove(Long.valueOf(ha4Var.c));
                        }
                    }
                    if (arrayList7.size() < size) {
                        ja4Var.c();
                    }
                    if (!arrayList7.isEmpty()) {
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        int size2 = arrayList7.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            Object obj2 = arrayList7.get(i18);
                            i18++;
                            ha4 ha4Var2 = (ha4) obj2;
                            int i19 = size2;
                            if (hashMap2.containsKey(Long.valueOf(ha4Var2.c))) {
                                arrayList = arrayList9;
                            } else {
                                arrayList = arrayList8;
                            }
                            arrayList.add(ha4Var2);
                            size2 = i19;
                        }
                        arrayList7.clear();
                        arrayList7.addAll(arrayList8);
                        arrayList7.addAll(arrayList9);
                        if (arrayList8.isEmpty()) {
                            min = 1;
                        } else {
                            min = Math.min(ja4Var.j, arrayList8.size());
                        }
                        for (int i20 = 0; i20 < min; i20++) {
                            ha4 ha4Var3 = (ha4) arrayList7.get(i20);
                            if (ha4Var3.g.equals("feed.likePost") || ha4Var3.g.equals("feed.dislikePost")) {
                                min = Math.max(1, i20);
                            }
                        }
                        ArrayList arrayList10 = new ArrayList(arrayList7.subList(0, min));
                        ja4Var.f = true;
                        int i21 = ja4Var.k + 1;
                        ja4Var.k = i21;
                        bf bfVar = new bf(ja4Var, i21, arrayList10, (byte) 5);
                        int i22 = -1;
                        for (int i23 = 0; i23 < 4; i23++) {
                            if (str4.equals(ea4.i(i23))) {
                                i22 = i23;
                            }
                        }
                        if (i22 < 0) {
                            ea4.e.postRunnable(new ba4(bfVar, (byte) 0), 0L);
                            i = i21;
                        } else {
                            TLRPC.TL_messages_reportFeedEvents tL_messages_reportFeedEvents2 = new TLRPC.TL_messages_reportFeedEvents();
                            int size3 = arrayList10.size();
                            int i24 = 0;
                            while (i24 < size3) {
                                Object obj3 = arrayList10.get(i24);
                                int i25 = i24 + 1;
                                ha4 ha4Var4 = (ha4) obj3;
                                long j2 = ha4Var4.a;
                                fa4 fa4Var = ha4Var4.f;
                                i2 = i8;
                                int i26 = ha4Var4.d;
                                String str5 = str3;
                                int i27 = size3;
                                i = i21;
                                TLRPC.InputPeer j3 = ea4.j(i22, j2, ha4Var4.b, ha4Var4.k, ha4Var4.l);
                                if (j3 == null) {
                                    ea4.e.postRunnable(new ba4(bfVar, (byte) 1), 0L);
                                } else if (!ha4Var4.g.equals(str5) && !ha4Var4.g.equals("feed.dislikePost")) {
                                    TLRPC.TL_inputFeedEvent tL_inputFeedEvent = new TLRPC.TL_inputFeedEvent();
                                    tL_inputFeedEvent.peer = j3;
                                    tL_inputFeedEvent.msg_id = i26;
                                    tL_inputFeedEvent.action = ha4Var4.g;
                                    tL_inputFeedEvent.surface = ha4Var4.e;
                                    tL_inputFeedEvent.flags = 96;
                                    if (fa4Var != null) {
                                        String str6 = fa4Var.c;
                                        if (str6 != null) {
                                            i3 = 4;
                                        } else {
                                            i3 = i2;
                                        }
                                        Long l = fa4Var.a;
                                        if (l != null) {
                                            i4 = 3;
                                        } else {
                                            i4 = i2;
                                        }
                                        tL_inputFeedEvent.flags = 96 | i3 | i4;
                                        if (l != null) {
                                            j = l.longValue();
                                        } else {
                                            j = 0;
                                        }
                                        tL_inputFeedEvent.recommendation_id = j;
                                        tL_inputFeedEvent.recommendation_rank = fa4Var.b;
                                        tL_inputFeedEvent.recommendation_role = str6;
                                    }
                                    String str7 = ha4Var4.h;
                                    if (str7 != null) {
                                        tL_inputFeedEvent.flags |= 8;
                                        tL_inputFeedEvent.kind = str7;
                                    }
                                    Integer num2 = ha4Var4.i;
                                    if (num2 != null) {
                                        tL_inputFeedEvent.flags |= 16;
                                        tL_inputFeedEvent.duration_ms = num2.intValue();
                                    }
                                    tL_inputFeedEvent.event_time = ha4Var4.j;
                                    tL_inputFeedEvent.random_id = ha4Var4.c;
                                    tL_messages_reportFeedEvents2.events.add(tL_inputFeedEvent);
                                    size3 = i27;
                                    str3 = str5;
                                    i8 = i2;
                                    i24 = i25;
                                    i21 = i;
                                } else {
                                    TL_feed.TL_feed_likePost tL_feed_likePost = new TL_feed.TL_feed_likePost();
                                    TL_feed.TL_feed_dislikePost tL_feed_dislikePost = new TL_feed.TL_feed_dislikePost();
                                    tL_feed_dislikePost.peer = j3;
                                    tL_feed_likePost.peer = j3;
                                    tL_feed_dislikePost.msg_id = i26;
                                    tL_feed_likePost.msg_id = i26;
                                    tL_messages_reportFeedEvents = tL_feed_dislikePost;
                                    if (ha4Var4.g.equals(str5)) {
                                        tL_messages_reportFeedEvents = tL_feed_likePost;
                                    }
                                    int[] iArr = {i2};
                                    int i28 = i22;
                                    hl.c3(new l77(ca4Var, iArr, i28, tL_messages_reportFeedEvents, bfVar, (byte) 14));
                                    z94Var = new z94((byte) 1, i28, iArr);
                                    ea4.e.postRunnable(new gp6(ja4Var, i, z94Var, arrayList10, (byte) 23), 60000L);
                                    return;
                                }
                            }
                            i = i21;
                            i2 = i8;
                            tL_messages_reportFeedEvents = tL_messages_reportFeedEvents2;
                            int[] iArr2 = {i2};
                            int i282 = i22;
                            hl.c3(new l77(ca4Var, iArr2, i282, tL_messages_reportFeedEvents, bfVar, (byte) 14));
                            z94Var = new z94((byte) 1, i282, iArr2);
                            ea4.e.postRunnable(new gp6(ja4Var, i, z94Var, arrayList10, (byte) 23), 60000L);
                            return;
                        }
                        z94Var = null;
                        ea4.e.postRunnable(new gp6(ja4Var, i, z94Var, arrayList10, (byte) 23), 60000L);
                        return;
                    }
                    return;
                }
                return;
            case 17:
                FfmpegAudioWaveformLoader.a((FfmpegAudioWaveformLoader) this.b);
                return;
            case 18:
                ic4 ic4Var = (ic4) this.b;
                ic4Var.c();
                try {
                    ic4Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    ic4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 19:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList11 = aob.F;
                int size4 = arrayList11.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    TLRPC.TL_theme tL_theme2 = ((znb) arrayList11.get(i29)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && (document = tL_theme.document) != null) {
                            document2.file_reference = document.file_reference;
                            aob.w1(true, false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 20:
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) ((rd4) this.b).b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 21:
                ((je4) this.b).i0(true);
                return;
            case 22:
                ((he4) this.b).a.getBackground().setState(new int[0]);
                return;
            case 23:
                fg4 fg4Var = (fg4) ((eg4) this.b).g;
                ArrayList arrayList12 = fg4Var.h;
                if (!yac.h(yac.t0).p()) {
                    for (int i30 = 0; i30 < arrayList12.size(); i30++) {
                        if (((bg4) arrayList12.get(i30)).e && i30 != 0) {
                            t20 t20Var = fg4Var.J;
                            fg4 fg4Var2 = (fg4) t20Var.e;
                            ArrayList arrayList13 = fg4Var2.h;
                            SparseIntArray sparseIntArray2 = fg4Var2.m0;
                            int size5 = arrayList13.size();
                            if (i30 >= 0 && i30 < size5) {
                                ArrayList T0 = uc7.s1(yac.t0).T0();
                                int i31 = sparseIntArray2.get(i30);
                                int i32 = ((bg4) arrayList13.get(i30)).a;
                                for (int i33 = i30 - 1; i33 >= 0; i33--) {
                                    sparseIntArray2.put(i33 + 1, sparseIntArray2.get(i33));
                                }
                                ac7 ac7Var = (ac7) T0.remove(i30);
                                ac7Var.f = 0;
                                T0.add(0, ac7Var);
                                sparseIntArray2.put(0, i31);
                                arrayList13.add(0, (bg4) arrayList13.remove(i30));
                                ((bg4) arrayList13.get(0)).a = i32;
                                for (int i34 = 0; i34 <= i30; i34++) {
                                    ((bg4) arrayList13.get(i34)).a = i34;
                                    ((ac7) T0.get(i34)).f = i34;
                                }
                                for (int i35 = 0; i35 <= i30; i35++) {
                                    if (fg4Var2.L == i35) {
                                        if (i35 == i30) {
                                            i7 = 0;
                                        } else {
                                            i7 = i35 + 1;
                                        }
                                        fg4Var2.M = i7;
                                        fg4Var2.L = i7;
                                    }
                                    if (fg4Var2.s0 == i35) {
                                        if (i35 == i30) {
                                            i6 = 0;
                                        } else {
                                            i6 = i35 + 1;
                                        }
                                        fg4Var2.t0 = i6;
                                        fg4Var2.s0 = i6;
                                    }
                                }
                                t20Var.j(i30, 0);
                                fg4Var2.K.p(((bg4) arrayList13.get(i30)).a, i32);
                                fg4Var2.o();
                                fg4Var2.E = true;
                                fg4Var2.G.setItemAnimator(fg4Var2.u0);
                            }
                            fg4Var.G.x0(0);
                            fg4Var.g();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 24:
                yg4 yg4Var = (yg4) this.b;
                hl.r(yg4Var.o0);
                yg4Var.a.a(false, true);
                return;
            case 25:
                yg4 yg4Var2 = ((mg4) this.b).a;
                yg4Var2.h(yg4Var2.F, yg4Var2.G, yg4Var2.I, yg4Var2.H, yg4Var2.E, yg4Var2.K, yg4Var2.x, false);
                return;
            case 26:
                ((FiltersSetupActivity) ((gu) this.b).g3).getMessagesController().q3();
                return;
            case 27:
                eh4 eh4Var = (eh4) this.b;
                eh4Var.s.a();
                eh4Var.n.invalidate();
                eh4Var.I.f0(true);
                return;
            case 28:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((eg4) this.b).g;
                if (!yac.h(yac.t0).p()) {
                    ArrayList T02 = filtersSetupActivity.getMessagesController().T0();
                    int i36 = 0;
                    while (true) {
                        if (i36 < T02.size()) {
                            if (((ac7) T02.get(i36)).d() && i36 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList14 = filtersSetupActivity2.getMessagesController().G0;
                                if (i36 >= 0 && i36 < arrayList14.size()) {
                                    arrayList14.add(0, (ac7) arrayList14.remove(i36));
                                    for (int i37 = 0; i37 <= i36; i37++) {
                                        ((ac7) arrayList14.get(i37)).f = i37;
                                    }
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.f0(true);
                                }
                                filtersSetupActivity.a.x0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                d31.b0(filtersSetupActivity).J(2131624018, hl.S2(ob6.a0("LimitReachedReorderFolder", null, 2131748698, ob6.M0(2131750772, null))), ob6.M0(2131746762, null), 5000, false, new bh4(filtersSetupActivity, (byte) 2)).j();
                            } else {
                                i36++;
                            }
                        }
                    }
                }
                filtersSetupActivity.e0(null);
                return;
            default:
                ((CancellationSignal) this.b).cancel();
                return;
        }
    }

    public lw3(c74 c74Var, mg8 mg8Var) {
        this.a = (byte) 10;
        this.b = mg8Var;
    }

    public lw3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
