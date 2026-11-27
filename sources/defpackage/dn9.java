package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.View;
import android.view.WindowManager;
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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.q;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.StickersActivity;
public final class dn9 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public dn9(Object obj, Object obj2, byte b) {
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
        r13 = false;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        switch (this.a) {
            case 0:
                ((on9) this.b).Y((cp9) this.c);
                return;
            case 1:
                on9 on9Var = (on9) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                on9Var.f();
                rn9 rn9Var = on9Var.w;
                if (rn9Var != null) {
                    long p = rn9Var.p();
                    xn9 xn9Var = on9Var.v;
                    if (xn9Var != null && p != Long.MAX_VALUE) {
                        xn9Var.q = Math.max(0L, p) * 1000;
                        Handler handler = xn9Var.u;
                        if (handler != null) {
                            handler.removeCallbacks(xn9Var.y0);
                        }
                    }
                }
                on9Var.j();
                rn9 rn9Var2 = on9Var.w;
                if (rn9Var2 != null) {
                    rn9Var2.u();
                    on9Var.w = null;
                }
                if (on9Var.w0 > 0) {
                    on9Var.j.b("release waits for camera open results: pending=" + on9Var.w0);
                    on9Var.x0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 2:
                xn9 xn9Var2 = (xn9) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                xn9Var2.getClass();
                try {
                    try {
                        xn9Var2.f();
                        xn9Var2.r0 = true;
                    } catch (RuntimeException e) {
                        xn9Var2.x0 = e;
                        xn9Var2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 3:
                xb1 xb1Var = (xb1) this.b;
                pp9 pp9Var = (pp9) this.c;
                oo9 oo9Var = xb1Var.a;
                if (pp9Var.getWidth() <= 0) {
                    oo9Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new v59(xb1Var, (byte) 16)).start();
                    return;
                }
                float width = pp9Var.getWidth() / oo9Var.getWidth();
                ValueAnimator valueAnimator = xb1Var.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                xb1Var.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                xb1Var.x.addUpdateListener(new am(xb1Var, oo9Var.getScaleX(), width, ((pp9Var.getWidth() / 2.0f) + pp9Var.getX()) - ((oo9Var.getWidth() / 2.0f) + oo9Var.getX()), ((pp9Var.getHeight() / 2.0f) + pp9Var.getY()) - ((oo9Var.getHeight() / 2.0f) + oo9Var.getY()), (byte) 4));
                xb1Var.x.addListener(new wd8((Object) xb1Var, (Object) pp9Var, (byte) 12));
                xb1Var.x.setDuration(320L);
                xb1Var.x.setInterpolator(k43.h);
                xb1Var.w = pp9Var;
                xb1Var.x.start();
                return;
            case 4:
                cp9 cp9Var = (cp9) this.c;
                jp9 jp9Var = (jp9) ((pq8) this.b).b;
                jp9Var.R++;
                jp9Var.y = true;
                jp9Var.m.b("camera switch started: target=" + cp9Var);
                q qVar = (q) jp9Var.d.b;
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
                os1 os1Var = qVar.F;
                qVar.t(false);
                Bitmap bitmap = qVar.w0;
                if (bitmap != null) {
                    os1Var.setImageBitmap(bitmap);
                    qVar.p0 = true;
                    os1Var.animate().cancel();
                    os1Var.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i5 = qVar.v0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qVar.e0 = ofFloat;
                ofFloat.setDuration(580L);
                qVar.e0.setInterpolator(k43.h);
                qVar.e0.addUpdateListener(new dx0(qVar, i5, (byte) 2));
                qVar.e0.addListener(new dn(qVar, i5, (byte) 5));
                qVar.e0.start();
                cc4.b("RoundVideo camera flip started: facing=" + cp9Var + ", minimumDurationMs=580");
                qVar.z();
                jp9Var.o();
                return;
            case 5:
                dq9 dq9Var = (dq9) this.b;
                NativeInstance nativeInstance = (NativeInstance) this.c;
                if (!dq9Var.w && dq9Var.P == nativeInstance) {
                    cc4.b("[LivePlayer] broadcast asks to rejoin");
                    dq9Var.Z = true;
                    dq9Var.P.resetGroupInstance(true, false);
                    return;
                }
                return;
            case 6:
                dq9 dq9Var2 = (dq9) this.b;
                dq9Var2.a0 = (String) this.c;
                dq9Var2.N();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                dq9 dq9Var3 = ((cq9) this.b).a;
                if (!dq9Var3.w) {
                    if (arrayList.isEmpty()) {
                        dq9Var3.C(true);
                        return;
                    } else if (dq9Var3.y == null) {
                        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                        dq9Var3.y = tL_groupCallParticipant;
                        tL_groupCallParticipant.peer = uc7.s1(dq9Var3.e).y1(dq9Var3.b);
                        dq9Var3.y.video = new TLRPC.TL_groupCallParticipantVideo();
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                        tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) obj).channel));
                        }
                        dq9Var3.y.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                        TLRPC.GroupCallParticipant groupCallParticipant = dq9Var3.y;
                        groupCallParticipant.video.endpoint = "unified";
                        groupCallParticipant.videoEndpoint = "unified";
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                kq9 kq9Var = (kq9) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!kq9Var.w && kq9Var.P) {
                    cc4.b("[LivePlayer] rejoin failed: " + tL_error.text);
                    kq9Var.K();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) this.c;
                kq9 kq9Var2 = ((iq9) this.b).a;
                if (!kq9Var2.w) {
                    if (arrayList2.isEmpty()) {
                        kq9Var2.C(true);
                        return;
                    }
                    kq9Var2.C(false);
                    if (kq9Var2.y == null) {
                        TLRPC.TL_groupCallParticipant tL_groupCallParticipant2 = new TLRPC.TL_groupCallParticipant();
                        kq9Var2.y = tL_groupCallParticipant2;
                        tL_groupCallParticipant2.peer = uc7.s1(kq9Var2.e).y1(kq9Var2.b);
                        kq9Var2.y.video = new TLRPC.TL_groupCallParticipantVideo();
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                        tL_groupCallParticipantVideoSourceGroup2.semantics = "SIM";
                        int size2 = arrayList2.size();
                        while (i4 < size2) {
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            tL_groupCallParticipantVideoSourceGroup2.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) obj2).channel));
                        }
                        kq9Var2.y.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup2);
                        TLRPC.GroupCallParticipant groupCallParticipant2 = kq9Var2.y;
                        groupCallParticipant2.video.endpoint = "unified";
                        groupCallParticipant2.videoEndpoint = "unified";
                        return;
                    }
                    return;
                }
                return;
            case 10:
                nt9 nt9Var = (nt9) this.b;
                try {
                    SQLitePreparedStatement executeFast = ((kf7) this.c).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast.requery();
                    executeFast.bindLong(1, 0L);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                hl.c3(new lt9(nt9Var, (byte) 0));
                return;
            case 11:
                lv9 lv9Var = (lv9) this.b;
                String str = (String) this.c;
                lv9Var.J = str;
                if (lv9Var.r) {
                    lv9Var.f.g(str, true, false, lv9Var.s, lv9Var.w, lv9Var.y, lv9Var.x, -1, 1);
                }
                int i6 = yac.t0;
                ArrayList arrayList3 = new ArrayList(lv2.r(i6).f0);
                lv9Var.E = true;
                int i7 = lv9Var.G;
                lv9Var.G = i7 + 1;
                lv9Var.F = i7;
                lv9Var.f();
                Utilities.g.c(new hz0(lv9Var, str, i7, arrayList3, i6, (byte) 8));
                return;
            case 12:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i8 = ((sv9) this.b).m;
                try {
                    kf7.a0(i8).b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = kf7.a0(i8).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i3 < arrayList4.size() && i3 != 100) {
                            qv9 qv9Var = (qv9) arrayList4.get(i3);
                            executeFast2.requery();
                            executeFast2.bindString(1, qv9Var.a);
                            executeFast2.bindInteger(2, qv9Var.b);
                            executeFast2.step();
                            i3++;
                        }
                    }
                    executeFast2.dispose();
                    if (arrayList4.size() > 100) {
                        SQLitePreparedStatement executeFast3 = kf7.a0(i8).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i = 100; i < arrayList4.size(); i++) {
                            executeFast3.requery();
                            executeFast3.bindString(1, ((qv9) arrayList4.get(i)).a);
                            executeFast3.step();
                        }
                        executeFast3.dispose();
                    }
                    kf7.a0(i8).b.commitTransaction();
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 13:
                gx9 gx9Var = (gx9) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = gx9Var.L;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = gx9Var.K()) < gx9Var.b()) {
                    arrayList5.remove(indexOf);
                    gx9Var.s(K + 1 + indexOf);
                    int size3 = gx9Var.k0.e.size();
                    int size4 = arrayList5.size();
                    if (gx9Var.H0) {
                        size3 = Math.min(3, size3);
                    }
                    if (size4 + size3 <= 0) {
                        gx9Var.s(K);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((gx9) this.b).S();
                d31.b0((uj3) this.c).c(ob6.M0(2131754481, null)).j();
                return;
            case 15:
                wx9 wx9Var = (wx9) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                wx9Var.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                wx9Var.getSendMessagesHelper().c0(message2.id);
                wx9Var.getSendMessagesHelper().h0(message2.id, false);
                return;
            case 16:
                ((SecretMediaViewer) this.b).L = false;
                ((fd8) this.c).a.v0(false, true);
                return;
            case 17:
                ((SecretMediaViewer) ((um4) this.b).c).i((File) this.c);
                return;
            case 18:
                ((sy9) this.b).sendAccessibilityEvent((View) this.c, 4);
                return;
            case 19:
                n1a n1aVar = (n1a) this.b;
                n1aVar.v(null, false, false);
                ((e) this.c).presentFragment(new StickersActivity(5, n1aVar.M0));
                c1a c1aVar = n1aVar.V1;
                if (c1aVar != null) {
                    c1aVar.run();
                    return;
                }
                return;
            case 20:
                r1a r1aVar = (r1a) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList6 = r1aVar.X1;
                r1aVar.p2 = false;
                r1aVar.o2 = false;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    uc7.s1(r1aVar.a).j4(messages_messages.users, false);
                    uc7.s1(r1aVar.a).c4(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList7 = messages_messages.messages;
                    int size5 = arrayList7.size();
                    int i9 = 0;
                    while (i9 < size5) {
                        TLRPC.Message message3 = arrayList7.get(i9);
                        i9++;
                        arrayList6.add(new r47(r1aVar.a, message3, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList6.size() < messages_messages.count) {
                        z = true;
                    }
                    r1aVar.n2 = z;
                    r1aVar.m2 = messages_messages.next_rate;
                } else {
                    r1aVar.n2 = false;
                    r1aVar.m2 = 0;
                }
                r1aVar.j2.O(true);
                return;
            case 21:
                r1a r1aVar2 = (r1a) this.b;
                r1aVar2.E2 = false;
                r1aVar2.W1.addAll((ArrayList) this.c);
                r1aVar2.j2.O(true);
                return;
            case 22:
                m3a m3aVar = (m3a) this.b;
                m3aVar.f = null;
                z3a z3aVar = m3aVar.h;
                z3aVar.R = false;
                z3aVar.P.c = ((String) this.c).toLowerCase();
                z3aVar.e();
                return;
            case 23:
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                ((r7a) this.b).getMessagesController().W3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 24:
                r7a r7aVar = (r7a) this.b;
                r47 r47Var = (r47) this.c;
                if (r47Var != null && (message = r47Var.k) != null) {
                    message.reqId = 0;
                    if (message.send_state == 3) {
                        message.send_state = 0;
                        r7aVar.getNotificationCenter().k(50, Long.valueOf(r47.B0(r47Var.k)), qd4.t(r47Var));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                i7a i7aVar = ((g7a) this.b).b;
                HashSet hashSet = i7aVar.c;
                hashSet.remove((String) this.c);
                r7a r7aVar2 = i7aVar.q;
                r7aVar2.getNotificationCenter().k(111, Long.valueOf(i7aVar.j));
                if (hashSet.isEmpty()) {
                    TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
                    tL_messages_startHistoryImport.peer = i7aVar.g;
                    tL_messages_startHistoryImport.import_id = i7aVar.k;
                    r7aVar2.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new h7a(i7aVar, tL_messages_startHistoryImport));
                    return;
                }
                return;
            case 26:
                m7a m7aVar = (m7a) this.b;
                HashMap hashMap = m7aVar.a;
                hashMap.remove((String) this.c);
                m7aVar.o.getNotificationCenter().k(112, m7aVar.e);
                if (hashMap.isEmpty()) {
                    m7aVar.b();
                    return;
                }
                return;
            case 27:
                b8a b8aVar = (b8a) this.b;
                zu1 zu1Var = (zu1) this.c;
                if (zu1Var != null) {
                    zu1Var.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    b8aVar.dismiss();
                    return;
                }
                return;
            case 28:
                ((WindowManager) this.c).removeView(((b8a) this.b).B);
                return;
            default:
                hl.g((String) this.c);
                d31.b0((uba) this.b).k(false).j();
                return;
        }
    }
}
