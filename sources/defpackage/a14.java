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
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
public final class a14 implements Runnable {
    public final byte a;
    public final Object b;

    public a14(c74 c74Var, SurfaceTexture surfaceTexture) {
        this.a = (byte) 5;
        this.b = c74Var;
    }

    @Override
    public final void run() {
        boolean z;
        Object obj;
        int min;
        int i;
        da4 da4Var;
        int i2;
        String str;
        int i3;
        int i4;
        long j;
        ArrayList arrayList;
        int i5;
        TLRPC.Document document;
        int i6;
        int i7;
        switch (this.a) {
            case 0:
                d14 d14Var = (d14) this.b;
                if (d14Var.a0.getEmojiView() != null) {
                    e34 emojiView = d14Var.a0.getEmojiView();
                    if (!emojiView.g0) {
                        try {
                            SparseIntArray sparseIntArray = emojiView.S.s;
                            char[] cArr = zx3.a;
                            int i8 = sparseIntArray.get(8);
                            if (i8 > 0) {
                                emojiView.Q.D0();
                                emojiView.U(i8);
                                emojiView.E(i8, gm.L(-9.0f));
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
            case 1:
                d24 d24Var = (d24) this.b;
                e24 e24Var = d24Var.a;
                if (!e24Var.G.W.G) {
                    ArrayList arrayList2 = new ArrayList();
                    e24Var.G.W.d(true);
                    e24Var.F(new pv3(d24Var, arrayList2, (byte) 9), arrayList2, true);
                    return;
                }
                return;
            case 2:
                w14 w14Var = (w14) this.b;
                w14Var.x.f = true;
                w14Var.a(true);
                return;
            case 3:
                gm.P3(((s24) this.b).h, true, true);
                return;
            case 4:
                h74 h74Var = (h74) this.b;
                kp kpVar = h74Var.C;
                Context context = h74Var.e;
                String str2 = hac.a;
                int generateAudioSessionId = i10.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                kpVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((dfb) kpVar.c).a.getLooper()) {
                    obj = kpVar.e;
                } else {
                    if (myLooper == ((dfb) kpVar.b).a.getLooper()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jte.p(z);
                    obj = kpVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    kpVar.f = valueOf;
                    xe0 xe0Var = new xe0(kpVar, valueOf, (byte) 0);
                    dfb dfbVar = (dfb) kpVar.c;
                    if (dfbVar.a.getLooper().getThread().isAlive()) {
                        dfbVar.e(xe0Var);
                    }
                    dfb dfbVar2 = h74Var.l.h;
                    cfb b = dfbVar2.b(40, generateAudioSessionId, 0);
                    Handler handler = dfbVar2.a;
                    Message message = b.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    b.a();
                    return;
                }
                return;
            case 5:
                h74 h74Var2 = ((c74) this.b).a;
                h74Var2.q1(null);
                h74Var2.f1(0, 0);
                return;
            case 6:
                af8 af8Var = (af8) this.b;
                try {
                    synchronized (af8Var) {
                    }
                    af8Var.a.d(af8Var.c, af8Var.d);
                    af8Var.a(true);
                    return;
                } catch (u64 e) {
                    ncd.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    rjb.m(e);
                    return;
                }
            case 7:
                new apa(((ud5) this.b).getContext()).show();
                return;
            case 8:
                e94 e94Var = (e94) this.b;
                LongSparseArray longSparseArray = e94Var.c;
                while (longSparseArray.size() > 0) {
                    long keyAt = longSparseArray.keyAt(0);
                    HashMap hashMap = (HashMap) longSparseArray.valueAt(0);
                    longSparseArray.removeAt(0);
                    ArrayList arrayList3 = new ArrayList(hashMap.keySet());
                    e94Var.d.addAll(arrayList3);
                    s2c s2cVar = new s2c(e94Var, keyAt, arrayList3, hashMap, (byte) 4);
                    if (arrayList3.isEmpty()) {
                        s2cVar.a(new ArrayList());
                    } else {
                        cf7 Y = cf7.Y(e94Var.a);
                        Y.a.c(new pz2(Y, arrayList3, s2cVar, (byte) 22));
                    }
                }
                longSparseArray.clear();
                return;
            case 9:
                ((ha4) this.b).a();
                return;
            case 10:
                String str3 = "feed.dislikePost";
                na4 na4Var = (na4) this.b;
                HashMap hashMap2 = na4Var.c;
                ga4 ga4Var = na4Var.a;
                String str4 = ga4Var.a;
                ArrayList arrayList4 = na4Var.b;
                na4Var.h = false;
                na4Var.g = false;
                if (!na4Var.f) {
                    na4Var.b();
                    int i9 = z8c.t0;
                    for (int i10 = 0; i10 < 4; i10++) {
                        if (str4.equals(ia4.f(i10))) {
                            i9 = i10;
                        }
                    }
                    int d = ia4.d(i9);
                    int size = arrayList4.size();
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        la4 la4Var = (la4) it.next();
                        int i11 = d - la4Var.j;
                        Integer num = la4Var.i;
                        if (num != null) {
                            i5 = num.intValue() / 1000;
                        } else {
                            i5 = 0;
                        }
                        if (i11 - i5 >= 3600) {
                            la4Var.toString();
                            it.remove();
                            hashMap2.remove(Long.valueOf(la4Var.c));
                        }
                    }
                    if (arrayList4.size() < size) {
                        na4Var.c();
                    }
                    if (!arrayList4.isEmpty()) {
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        int size2 = arrayList4.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj2 = arrayList4.get(i12);
                            i12++;
                            la4 la4Var2 = (la4) obj2;
                            if (hashMap2.containsKey(Long.valueOf(la4Var2.c))) {
                                arrayList = arrayList6;
                            } else {
                                arrayList = arrayList5;
                            }
                            arrayList.add(la4Var2);
                        }
                        arrayList4.clear();
                        arrayList4.addAll(arrayList5);
                        arrayList4.addAll(arrayList6);
                        if (arrayList5.isEmpty()) {
                            min = 1;
                        } else {
                            min = Math.min(na4Var.j, arrayList5.size());
                        }
                        for (int i13 = 0; i13 < min; i13++) {
                            la4 la4Var3 = (la4) arrayList4.get(i13);
                            if (la4Var3.g.equals("feed.likePost") || la4Var3.g.equals("feed.dislikePost")) {
                                min = Math.max(1, i13);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(arrayList4.subList(0, min));
                        na4Var.f = true;
                        int i14 = na4Var.k + 1;
                        na4Var.k = i14;
                        yg ygVar = new yg(na4Var, i14, arrayList7, (byte) 5);
                        int i15 = -1;
                        for (int i16 = 0; i16 < 4; i16++) {
                            if (str4.equals(ia4.f(i16))) {
                                i15 = i16;
                            }
                        }
                        if (i15 < 0) {
                            ia4.d.postRunnable(new fa4(ygVar, (byte) 0), 0L);
                        } else {
                            TLRPC.TL_messages_reportFeedEvents tL_messages_reportFeedEvents = new TLRPC.TL_messages_reportFeedEvents();
                            int size3 = arrayList7.size();
                            int i17 = 0;
                            while (i17 < size3) {
                                Object obj3 = arrayList7.get(i17);
                                i17++;
                                la4 la4Var4 = (la4) obj3;
                                long j2 = la4Var4.a;
                                ja4 ja4Var = la4Var4.f;
                                int i18 = la4Var4.d;
                                TLRPC.InputPeer g = ia4.g(i15, j2, la4Var4.b, la4Var4.k, la4Var4.l);
                                if (g == null) {
                                    ia4.d.postRunnable(new fa4(ygVar, (byte) 1), 0L);
                                } else if (!la4Var4.g.equals("feed.likePost") && !la4Var4.g.equals(str3)) {
                                    TLRPC.TL_inputFeedEvent tL_inputFeedEvent = new TLRPC.TL_inputFeedEvent();
                                    tL_inputFeedEvent.peer = g;
                                    tL_inputFeedEvent.msg_id = i18;
                                    tL_inputFeedEvent.action = la4Var4.g;
                                    tL_inputFeedEvent.surface = la4Var4.e;
                                    tL_inputFeedEvent.flags = 96;
                                    if (ja4Var != null) {
                                        String str5 = ja4Var.c;
                                        if (str5 != null) {
                                            i3 = 4;
                                        } else {
                                            i3 = 0;
                                        }
                                        Long l = ja4Var.a;
                                        if (l != null) {
                                            i4 = 3;
                                        } else {
                                            i4 = 0;
                                        }
                                        tL_inputFeedEvent.flags = 96 | i3 | i4;
                                        if (l != null) {
                                            i2 = i14;
                                            str = str3;
                                            j = l.longValue();
                                        } else {
                                            i2 = i14;
                                            str = str3;
                                            j = 0;
                                        }
                                        tL_inputFeedEvent.recommendation_id = j;
                                        tL_inputFeedEvent.recommendation_rank = ja4Var.b;
                                        tL_inputFeedEvent.recommendation_role = str5;
                                    } else {
                                        i2 = i14;
                                        str = str3;
                                    }
                                    String str6 = la4Var4.h;
                                    if (str6 != null) {
                                        tL_inputFeedEvent.flags |= 8;
                                        tL_inputFeedEvent.kind = str6;
                                    }
                                    Integer num2 = la4Var4.i;
                                    if (num2 != null) {
                                        tL_inputFeedEvent.flags |= 16;
                                        tL_inputFeedEvent.duration_ms = num2.intValue();
                                    }
                                    tL_inputFeedEvent.event_time = la4Var4.j;
                                    tL_inputFeedEvent.random_id = la4Var4.c;
                                    tL_messages_reportFeedEvents.events.add(tL_inputFeedEvent);
                                    i14 = i2;
                                    str3 = str;
                                } else {
                                    i = i14;
                                    TL_feed.TL_feed_likePost tL_feed_likePost = new TL_feed.TL_feed_likePost();
                                    TL_feed.TL_feed_dislikePost tL_feed_dislikePost = new TL_feed.TL_feed_dislikePost();
                                    tL_feed_dislikePost.peer = g;
                                    tL_feed_likePost.peer = g;
                                    tL_feed_dislikePost.msg_id = i18;
                                    tL_feed_likePost.msg_id = i18;
                                    if (la4Var4.g.equals("feed.likePost")) {
                                        tL_messages_reportFeedEvents = tL_feed_likePost;
                                    } else {
                                        tL_messages_reportFeedEvents = tL_feed_dislikePost;
                                    }
                                    int[] iArr = {0};
                                    int i19 = i15;
                                    gm.c3(new i77(ga4Var, iArr, i19, tL_messages_reportFeedEvents, ygVar, (byte) 14));
                                    da4Var = new da4((byte) 1, i19, iArr);
                                    ia4.d.postRunnable(new up6(na4Var, i, da4Var, arrayList7, (byte) 23), 60000L);
                                    return;
                                }
                            }
                            i = i14;
                            int[] iArr2 = {0};
                            int i192 = i15;
                            gm.c3(new i77(ga4Var, iArr2, i192, tL_messages_reportFeedEvents, ygVar, (byte) 14));
                            da4Var = new da4((byte) 1, i192, iArr2);
                            ia4.d.postRunnable(new up6(na4Var, i, da4Var, arrayList7, (byte) 23), 60000L);
                            return;
                        }
                        i = i14;
                        da4Var = null;
                        ia4.d.postRunnable(new up6(na4Var, i, da4Var, arrayList7, (byte) 23), 60000L);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                FfmpegAudioWaveformLoader.b((FfmpegAudioWaveformLoader) this.b);
                return;
            case 12:
                lc4 lc4Var = (lc4) this.b;
                lc4Var.c();
                try {
                    lc4Var.c.executeFast("DELETE FROM paths WHERE 1").stepThis().dispose();
                    lc4Var.c.executeFast("DELETE FROM paths_by_dialog_id WHERE 1").stepThis().dispose();
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 13:
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.b;
                ArrayList arrayList8 = cmb.F;
                int size4 = arrayList8.size();
                for (int i20 = 0; i20 < size4; i20++) {
                    TLRPC.TL_theme tL_theme2 = ((bmb) arrayList8.get(i20)).G;
                    if (tL_theme2 != null && tL_theme2.id == tL_theme.id) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && (document = tL_theme.document) != null) {
                            document2.file_reference = document.file_reference;
                            cmb.w1(true, false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 14:
                FilesMigrationService.d = false;
                FilesMigrationService filesMigrationService = (FilesMigrationService) ((ud4) this.b).b;
                filesMigrationService.stopForeground(true);
                filesMigrationService.stopSelf();
                return;
            case 15:
                ((me4) this.b).j0(true);
                return;
            case 16:
                ((ke4) this.b).a.getBackground().setState(new int[0]);
                return;
            case 17:
                ig4 ig4Var = (ig4) ((hg4) this.b).g;
                ArrayList arrayList9 = ig4Var.h;
                if (!z8c.h(z8c.t0).p()) {
                    for (int i21 = 0; i21 < arrayList9.size(); i21++) {
                        if (((eg4) arrayList9.get(i21)).e && i21 != 0) {
                            s30 s30Var = ig4Var.J;
                            ig4 ig4Var2 = (ig4) s30Var.e;
                            ArrayList arrayList10 = ig4Var2.h;
                            SparseIntArray sparseIntArray2 = ig4Var2.l0;
                            int size5 = arrayList10.size();
                            if (i21 >= 0 && i21 < size5) {
                                ArrayList S0 = oc7.r1(z8c.t0).S0();
                                int i22 = sparseIntArray2.get(i21);
                                int i23 = ((eg4) arrayList10.get(i21)).a;
                                for (int i24 = i21 - 1; i24 >= 0; i24--) {
                                    sparseIntArray2.put(i24 + 1, sparseIntArray2.get(i24));
                                }
                                ub7 ub7Var = (ub7) S0.remove(i21);
                                ub7Var.f = 0;
                                S0.add(0, ub7Var);
                                sparseIntArray2.put(0, i22);
                                arrayList10.add(0, (eg4) arrayList10.remove(i21));
                                ((eg4) arrayList10.get(0)).a = i23;
                                for (int i25 = 0; i25 <= i21; i25++) {
                                    ((eg4) arrayList10.get(i25)).a = i25;
                                    ((ub7) S0.get(i25)).f = i25;
                                }
                                for (int i26 = 0; i26 <= i21; i26++) {
                                    if (ig4Var2.L == i26) {
                                        if (i26 == i21) {
                                            i7 = 0;
                                        } else {
                                            i7 = i26 + 1;
                                        }
                                        ig4Var2.M = i7;
                                        ig4Var2.L = i7;
                                    }
                                    if (ig4Var2.r0 == i26) {
                                        if (i26 == i21) {
                                            i6 = 0;
                                        } else {
                                            i6 = i26 + 1;
                                        }
                                        ig4Var2.s0 = i6;
                                        ig4Var2.r0 = i6;
                                    }
                                }
                                s30Var.j(i21, 0);
                                dg4 dg4Var = ig4Var2.K;
                                int i27 = ((eg4) arrayList10.get(i21)).a;
                                dk3 dk3Var = (dk3) dg4Var;
                                int i28 = 0;
                                while (true) {
                                    mk3[] mk3VarArr = dk3Var.b.f0;
                                    if (i28 < mk3VarArr.length) {
                                        mk3 mk3Var = mk3VarArr[i28];
                                        int i29 = mk3Var.h;
                                        if (i29 == i27) {
                                            mk3Var.h = i23;
                                        } else if (i29 == i23) {
                                            mk3Var.h = i27;
                                        }
                                        i28++;
                                    } else {
                                        ig4Var2.m();
                                        ig4Var2.E = true;
                                        ig4Var2.G.setItemAnimator(ig4Var2.t0);
                                    }
                                }
                            }
                            ig4Var.G.w0(0);
                            ak3 ak3Var = (ak3) ig4Var;
                            nk3 nk3Var = ak3Var.H0;
                            if (!nk3Var.getMessagesController().H3()) {
                                try {
                                    ak3Var.performHapticFeedback(3, 1);
                                } catch (Exception unused2) {
                                }
                                u31 J = c41.b0(nk3Var).J(2131624018, gm.S2(jb6.a0(null, null, 2131748701, jb6.M0(2131750744, null))), jb6.M0(2131746768, null), 5000, false, new bi3(ak3Var, (byte) 6));
                                J.k(true);
                                nk3Var.q3 = J;
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                ch4 ch4Var = (ch4) this.b;
                gm.r(ch4Var.o0);
                ch4Var.a.a(false, true);
                return;
            case 19:
                ch4 ch4Var2 = ((qg4) this.b).a;
                ch4Var2.h(ch4Var2.F, ch4Var2.G, ch4Var2.I, ch4Var2.H, ch4Var2.E, ch4Var2.K, ch4Var2.x, false);
                return;
            case 20:
                ((FiltersSetupActivity) ((fv) this.b).g3).getMessagesController().m3();
                return;
            case 21:
                hh4 hh4Var = (hh4) this.b;
                hh4Var.s.a();
                hh4Var.n.invalidate();
                hh4Var.I.g0(true);
                return;
            case 22:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((hg4) this.b).g;
                if (!z8c.h(z8c.t0).p()) {
                    ArrayList S02 = filtersSetupActivity.getMessagesController().S0();
                    int i30 = 0;
                    while (true) {
                        if (i30 < S02.size()) {
                            if (((ub7) S02.get(i30)).d() && i30 != 0) {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList11 = filtersSetupActivity2.getMessagesController().G0;
                                if (i30 >= 0 && i30 < arrayList11.size()) {
                                    arrayList11.add(0, (ub7) arrayList11.remove(i30));
                                    for (int i31 = 0; i31 <= i30; i31++) {
                                        ((ub7) arrayList11.get(i31)).f = i31;
                                    }
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.a.w0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, 1);
                                } catch (Exception unused3) {
                                }
                                c41.b0(filtersSetupActivity).J(2131624018, gm.S2(jb6.a0("LimitReachedReorderFolder", null, 2131748701, jb6.M0(2131750744, null))), jb6.M0(2131746768, null), 5000, false, new eh4(filtersSetupActivity, (byte) 2)).j();
                            } else {
                                i30++;
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                return;
            case 23:
                ((CancellationSignal) this.b).cancel();
                return;
            case 24:
                uj4 uj4Var = (uj4) this.b;
                if (!uj4Var.c) {
                    uj4Var.setLayerType(0, null);
                    return;
                }
                return;
            case 25:
                ((pl4) this.b).invalidate();
                return;
            case 26:
                tl4 tl4Var = (tl4) ((f43) this.b).b;
                tl4Var.h.invalidate();
                tl4Var.i.requestLayout();
                return;
            case 27:
                fm4 fm4Var = (fm4) ((le) this.b).b;
                fm4Var.k();
                fm4Var.j();
                return;
            case 28:
                fm4 fm4Var2 = ((bm4) this.b).b;
                fm4Var2.c.dismiss();
                fm4Var2.f.removeAllViews();
                return;
            default:
                ((bm4) this.b).b.c.dismiss();
                return;
        }
    }

    public a14(r74 r74Var, af8 af8Var) {
        this.a = (byte) 6;
        this.b = af8Var;
    }

    public a14(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
