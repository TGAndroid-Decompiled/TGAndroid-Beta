package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.StickersActivity;
public final class il9 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public il9(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        int i;
        int indexOf;
        int K;
        TLRPC.Message message;
        int i2 = 0;
        r14 = false;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        switch (this.a) {
            case 0:
                TLRPC.Document document = (TLRPC.Document) this.c;
                bc4.G(((kl9) this.b).c).X(document, document, 0, 0);
                return;
            case 1:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                int i5 = ((ll9) this.b).a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    nm7.e().k(297, 4, jb6.a0("TooLongError", null, 2131743727, new Object[0]), jb6.a0("ErrorRingtoneDurationTooLong", null, 2131751041, Integer.valueOf(oc7.r1(i5).l4.S0.f())));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    nm7.e().k(297, 4, jb6.a0("TooLargeError", null, 2131743728, new Object[0]), jb6.a0("ErrorRingtoneSizeTooBig", null, 2131751039, Integer.valueOf(oc7.r1(i5).l4.R0.f() / 1024)));
                    return;
                } else {
                    nm7.e().k(297, 4, jb6.a0("InvalidFormatError", null, 2131748938, new Object[0]), jb6.M0(2131751040, null));
                    return;
                }
            case 2:
                ((bm9) this.b).Y((nn9) this.c);
                return;
            case 3:
                bm9 bm9Var = (bm9) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                bm9Var.f();
                em9 em9Var = bm9Var.w;
                if (em9Var != null) {
                    long p = em9Var.p();
                    km9 km9Var = bm9Var.v;
                    if (km9Var != null && p != Long.MAX_VALUE) {
                        km9Var.q = Math.max(0L, p) * 1000;
                        Handler handler = km9Var.u;
                        if (handler != null) {
                            handler.removeCallbacks(km9Var.y0);
                        }
                    }
                }
                bm9Var.j();
                em9 em9Var2 = bm9Var.w;
                if (em9Var2 != null) {
                    em9Var2.u();
                    bm9Var.w = null;
                }
                if (bm9Var.w0 > 0) {
                    bm9Var.j.b("release waits for camera open results: pending=" + bm9Var.w0);
                    bm9Var.x0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 4:
                km9 km9Var2 = (km9) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                km9Var2.getClass();
                try {
                    try {
                        km9Var2.f();
                        km9Var2.r0 = true;
                    } catch (RuntimeException e) {
                        km9Var2.x0 = e;
                        km9Var2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 5:
                wc1 wc1Var = (wc1) this.b;
                ao9 ao9Var = (ao9) this.c;
                an9 an9Var = wc1Var.a;
                if (ao9Var.getWidth() <= 0) {
                    an9Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new kf9(wc1Var, (byte) 8)).start();
                    return;
                }
                float width = ao9Var.getWidth() / an9Var.getWidth();
                ValueAnimator valueAnimator = wc1Var.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                wc1Var.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                wc1Var.x.addUpdateListener(new zm(wc1Var, an9Var.getScaleX(), width, ((ao9Var.getWidth() / 2.0f) + ao9Var.getX()) - ((an9Var.getWidth() / 2.0f) + an9Var.getX()), ((ao9Var.getHeight() / 2.0f) + ao9Var.getY()) - ((an9Var.getHeight() / 2.0f) + an9Var.getY()), (byte) 4));
                wc1Var.x.addListener(new ic8((Object) wc1Var, (Object) ao9Var, (byte) 12));
                wc1Var.x.setDuration(320L);
                wc1Var.x.setInterpolator(d53.h);
                wc1Var.w = ao9Var;
                wc1Var.x.start();
                return;
            case 6:
                nn9 nn9Var = (nn9) this.c;
                un9 un9Var = (un9) ((et8) this.b).b;
                un9Var.R++;
                un9Var.y = true;
                un9Var.m.b("camera switch started: target=" + nn9Var);
                q qVar = (q) un9Var.d.a;
                FrameLayout frameLayout = qVar.y;
                qVar.v0++;
                ValueAnimator valueAnimator2 = qVar.e0;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllListeners();
                    qVar.e0.cancel();
                    qVar.e0 = null;
                }
                qVar.q0 = true;
                qVar.r0 = false;
                qVar.s0 = false;
                qVar.t0 = false;
                qVar.u0 = SystemClock.elapsedRealtime();
                nt1 nt1Var = qVar.F;
                qVar.t(false);
                Bitmap bitmap = qVar.w0;
                if (bitmap != null) {
                    nt1Var.setImageBitmap(bitmap);
                    qVar.p0 = true;
                    nt1Var.animate().cancel();
                    nt1Var.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i6 = qVar.v0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qVar.e0 = ofFloat;
                ofFloat.setDuration(580L);
                qVar.e0.setInterpolator(d53.h);
                qVar.e0.addUpdateListener(new by0(qVar, i6, (byte) 2));
                qVar.e0.addListener(new co(qVar, i6, (byte) 5));
                qVar.e0.start();
                fc4.b("RoundVideo camera flip started: facing=" + nn9Var + ", minimumDurationMs=580");
                qVar.z();
                un9Var.o();
                return;
            case 7:
                oo9 oo9Var = (oo9) this.b;
                oo9Var.a0 = (String) this.c;
                oo9Var.N();
                return;
            case 8:
                oo9 oo9Var2 = (oo9) this.b;
                NativeInstance nativeInstance = (NativeInstance) this.c;
                if (!oo9Var2.w && oo9Var2.P == nativeInstance) {
                    fc4.b("[LivePlayer] broadcast asks to rejoin");
                    oo9Var2.Z = true;
                    oo9Var2.P.resetGroupInstance(true, false);
                    return;
                }
                return;
            case 9:
                ArrayList arrayList = (ArrayList) this.c;
                oo9 oo9Var3 = ((no9) this.b).a;
                if (!oo9Var3.w) {
                    if (arrayList.isEmpty()) {
                        oo9Var3.C(true);
                        return;
                    } else if (oo9Var3.y == null) {
                        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                        oo9Var3.y = tL_groupCallParticipant;
                        tL_groupCallParticipant.peer = oc7.r1(oo9Var3.e).x1(oo9Var3.b);
                        oo9Var3.y.video = new TLRPC.TL_groupCallParticipantVideo();
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                        tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) obj).channel));
                        }
                        oo9Var3.y.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                        TLRPC.GroupCallParticipant groupCallParticipant = oo9Var3.y;
                        groupCallParticipant.video.endpoint = "unified";
                        groupCallParticipant.videoEndpoint = "unified";
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 10:
                vo9 vo9Var = (vo9) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                if (!vo9Var.w && vo9Var.P) {
                    fc4.b("[LivePlayer] rejoin failed: " + tL_error2.text);
                    vo9Var.K();
                    return;
                }
                return;
            case 11:
                ArrayList arrayList2 = (ArrayList) this.c;
                vo9 vo9Var2 = ((to9) this.b).a;
                if (!vo9Var2.w) {
                    if (arrayList2.isEmpty()) {
                        vo9Var2.C(true);
                        return;
                    }
                    vo9Var2.C(false);
                    if (vo9Var2.y == null) {
                        TLRPC.TL_groupCallParticipant tL_groupCallParticipant2 = new TLRPC.TL_groupCallParticipant();
                        vo9Var2.y = tL_groupCallParticipant2;
                        tL_groupCallParticipant2.peer = oc7.r1(vo9Var2.e).x1(vo9Var2.b);
                        vo9Var2.y.video = new TLRPC.TL_groupCallParticipantVideo();
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                        tL_groupCallParticipantVideoSourceGroup2.semantics = "SIM";
                        int size2 = arrayList2.size();
                        while (i4 < size2) {
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            tL_groupCallParticipantVideoSourceGroup2.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) obj2).channel));
                        }
                        vo9Var2.y.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup2);
                        TLRPC.GroupCallParticipant groupCallParticipant2 = vo9Var2.y;
                        groupCallParticipant2.video.endpoint = "unified";
                        groupCallParticipant2.videoEndpoint = "unified";
                        return;
                    }
                    return;
                }
                return;
            case 12:
                wr9 wr9Var = (wr9) this.b;
                try {
                    SQLitePreparedStatement executeFast = ((cf7) this.c).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast.requery();
                    executeFast.bindLong(1, 0L);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                gm.c3(new ur9(wr9Var, (byte) 2));
                return;
            case 13:
                ut9 ut9Var = (ut9) this.b;
                String str = (String) this.c;
                ut9Var.J = str;
                if (ut9Var.r) {
                    ut9Var.f.g(str, true, false, ut9Var.s, ut9Var.w, ut9Var.y, ut9Var.x, -1, 1);
                }
                int i7 = z8c.t0;
                ArrayList arrayList3 = new ArrayList(bw2.r(i7).f0);
                ut9Var.E = true;
                int i8 = ut9Var.G;
                ut9Var.G = i8 + 1;
                ut9Var.F = i8;
                ut9Var.f();
                Utilities.g.c(new g01(ut9Var, str, i8, arrayList3, i7, (byte) 8));
                return;
            case 14:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i9 = ((bu9) this.b).m;
                try {
                    cf7.Y(i9).b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = cf7.Y(i9).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i3 < arrayList4.size() && i3 != 100) {
                            zt9 zt9Var = (zt9) arrayList4.get(i3);
                            executeFast2.requery();
                            executeFast2.bindString(1, zt9Var.a);
                            executeFast2.bindInteger(2, zt9Var.b);
                            executeFast2.step();
                            i3++;
                        }
                    }
                    executeFast2.dispose();
                    if (arrayList4.size() > 100) {
                        SQLitePreparedStatement executeFast3 = cf7.Y(i9).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i = 100; i < arrayList4.size(); i++) {
                            executeFast3.requery();
                            executeFast3.bindString(1, ((zt9) arrayList4.get(i)).a);
                            executeFast3.step();
                        }
                        executeFast3.dispose();
                    }
                    cf7.Y(i9).b.commitTransaction();
                    return;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 15:
                ov9 ov9Var = (ov9) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = ov9Var.L;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = ov9Var.K()) < ov9Var.b()) {
                    arrayList5.remove(indexOf);
                    ov9Var.s(K + 1 + indexOf);
                    int size3 = ov9Var.k0.e.size();
                    int size4 = arrayList5.size();
                    if (ov9Var.H0) {
                        size3 = Math.min(3, size3);
                    }
                    if (size4 + size3 <= 0) {
                        ov9Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((ov9) this.b).S();
                c41.b0((nk3) this.c).c(jb6.M0(2131754485, null)).j();
                return;
            case 17:
                dw9 dw9Var = (dw9) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                dw9Var.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                dw9Var.getSendMessagesHelper().c0(message2.id);
                dw9Var.getSendMessagesHelper().h0(message2.id, false);
                return;
            case 18:
                ((SecretMediaViewer) this.b).L = false;
                ((qb8) this.c).a.v0(false, true);
                return;
            case 19:
                ((SecretMediaViewer) ((wm4) this.b).c).i((File) this.c);
                return;
            case 20:
                ((bx9) this.b).sendAccessibilityEvent((View) this.c, 4);
                return;
            case 21:
                vz9 vz9Var = (vz9) this.b;
                vz9Var.v(null, false, false);
                ((d) this.c).presentFragment(new StickersActivity(5, vz9Var.M0));
                lz9 lz9Var = vz9Var.V1;
                if (lz9Var != null) {
                    lz9Var.run();
                    return;
                }
                return;
            case 22:
                zz9 zz9Var = (zz9) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList6 = zz9Var.X1;
                zz9Var.p2 = false;
                zz9Var.o2 = false;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    oc7.r1(zz9Var.a).d4(messages_messages.users, false);
                    oc7.r1(zz9Var.a).X3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList7 = messages_messages.messages;
                    int size5 = arrayList7.size();
                    int i10 = 0;
                    while (i10 < size5) {
                        TLRPC.Message message3 = arrayList7.get(i10);
                        i10++;
                        arrayList6.add(new k47(zz9Var.a, message3, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList6.size() < messages_messages.count) {
                        z = true;
                    }
                    zz9Var.n2 = z;
                    zz9Var.m2 = messages_messages.next_rate;
                } else {
                    zz9Var.n2 = false;
                    zz9Var.m2 = 0;
                }
                zz9Var.j2.O(true);
                return;
            case 23:
                zz9 zz9Var2 = (zz9) this.b;
                zz9Var2.E2 = false;
                zz9Var2.W1.addAll((ArrayList) this.c);
                zz9Var2.j2.O(true);
                return;
            case 24:
                u1a u1aVar = (u1a) this.b;
                u1aVar.f = null;
                i2a i2aVar = u1aVar.h;
                i2aVar.R = false;
                i2aVar.P.c = ((String) this.c).toLowerCase();
                i2aVar.e();
                return;
            case 25:
                a6a a6aVar = (a6a) this.b;
                k47 k47Var = (k47) this.c;
                if (k47Var != null && (message = k47Var.k) != null) {
                    message.reqId = 0;
                    if (message.send_state == 3) {
                        message.send_state = 0;
                        a6aVar.getNotificationCenter().k(50, Long.valueOf(k47.B0(k47Var.k)), td4.u(k47Var));
                        return;
                    }
                    return;
                }
                return;
            case 26:
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                ((a6a) this.b).getMessagesController().R3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 27:
                r5a r5aVar = ((p5a) this.b).b;
                HashSet hashSet = r5aVar.c;
                hashSet.remove((String) this.c);
                a6a a6aVar2 = r5aVar.q;
                a6aVar2.getNotificationCenter().k(111, Long.valueOf(r5aVar.j));
                if (hashSet.isEmpty()) {
                    TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
                    tL_messages_startHistoryImport.peer = r5aVar.g;
                    tL_messages_startHistoryImport.import_id = r5aVar.k;
                    a6aVar2.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new q5a(r5aVar, tL_messages_startHistoryImport));
                    return;
                }
                return;
            case 28:
                v5a v5aVar = (v5a) this.b;
                HashMap hashMap = v5aVar.a;
                hashMap.remove((String) this.c);
                v5aVar.o.getNotificationCenter().k(112, v5aVar.e);
                if (hashMap.isEmpty()) {
                    v5aVar.b();
                    return;
                }
                return;
            default:
                l6a l6aVar = (l6a) this.b;
                yv1 yv1Var = (yv1) this.c;
                if (yv1Var != null) {
                    yv1Var.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    l6aVar.dismiss();
                    return;
                }
                return;
        }
    }
}
