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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.q;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.StickersActivity;
public final class tj9 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public tj9(Object obj, Object obj2, byte b) {
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
                ((ak9) this.b).Y((nl9) this.c);
                return;
            case 1:
                ak9 ak9Var = (ak9) this.b;
                HandlerThread handlerThread = (HandlerThread) this.c;
                ak9Var.f();
                dk9 dk9Var = ak9Var.w;
                if (dk9Var != null) {
                    long p = dk9Var.p();
                    jk9 jk9Var = ak9Var.v;
                    if (jk9Var != null && p != Long.MAX_VALUE) {
                        jk9Var.q = Math.max(0L, p) * 1000;
                        Handler handler = jk9Var.u;
                        if (handler != null) {
                            handler.removeCallbacks(jk9Var.y0);
                        }
                    }
                }
                ak9Var.j();
                dk9 dk9Var2 = ak9Var.w;
                if (dk9Var2 != null) {
                    dk9Var2.u();
                    ak9Var.w = null;
                }
                if (ak9Var.w0 > 0) {
                    ak9Var.j.b("release waits for camera open results: pending=" + ak9Var.w0);
                    ak9Var.x0 = handlerThread;
                    return;
                }
                handlerThread.quitSafely();
                return;
            case 2:
                jk9 jk9Var2 = (jk9) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                jk9Var2.getClass();
                try {
                    try {
                        jk9Var2.f();
                        jk9Var2.r0 = true;
                    } catch (RuntimeException e) {
                        jk9Var2.x0 = e;
                        jk9Var2.i();
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 3:
                pb1 pb1Var = (pb1) this.b;
                am9 am9Var = (am9) this.c;
                al9 al9Var = pb1Var.a;
                if (am9Var.getWidth() <= 0) {
                    al9Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new zk9(pb1Var, (byte) 0)).start();
                    return;
                }
                float width = am9Var.getWidth() / al9Var.getWidth();
                ValueAnimator valueAnimator = pb1Var.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                pb1Var.x = ValueAnimator.ofFloat(0.0f, 1.0f);
                pb1Var.x.addUpdateListener(new zl(pb1Var, al9Var.getScaleX(), width, ((am9Var.getWidth() / 2.0f) + am9Var.getX()) - ((al9Var.getWidth() / 2.0f) + al9Var.getX()), ((am9Var.getHeight() / 2.0f) + am9Var.getY()) - ((al9Var.getHeight() / 2.0f) + al9Var.getY()), (byte) 4));
                pb1Var.x.addListener(new eh8((Object) pb1Var, (Object) am9Var, (byte) 11));
                pb1Var.x.setDuration(320L);
                pb1Var.x.setInterpolator(s33.h);
                pb1Var.w = am9Var;
                pb1Var.x.start();
                return;
            case 4:
                nl9 nl9Var = (nl9) this.c;
                ul9 ul9Var = (ul9) ((g29) this.b).b;
                ul9Var.R++;
                ul9Var.y = true;
                ul9Var.m.b("camera switch started: target=" + nl9Var);
                q qVar = (q) ul9Var.d.a;
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
                as1 as1Var = qVar.F;
                qVar.t(false);
                Bitmap bitmap = qVar.w0;
                if (bitmap != null) {
                    as1Var.setImageBitmap(bitmap);
                    qVar.p0 = true;
                    as1Var.animate().cancel();
                    as1Var.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i5 = qVar.v0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                qVar.e0 = ofFloat;
                ofFloat.setDuration(580L);
                qVar.e0.setInterpolator(s33.h);
                qVar.e0.addUpdateListener(new tw0(qVar, i5, (byte) 2));
                qVar.e0.addListener(new cn(qVar, i5, (byte) 5));
                qVar.e0.start();
                fa4.b("RoundVideo camera flip started: facing=" + nl9Var + ", minimumDurationMs=580");
                qVar.z();
                ul9Var.o();
                return;
            case 5:
                nm9 nm9Var = (nm9) this.b;
                nm9Var.a0 = (String) this.c;
                nm9Var.N();
                return;
            case 6:
                nm9 nm9Var2 = (nm9) this.b;
                NativeInstance nativeInstance = (NativeInstance) this.c;
                if (!nm9Var2.w && nm9Var2.P == nativeInstance) {
                    fa4.b("[LivePlayer] broadcast asks to rejoin");
                    nm9Var2.Z = true;
                    nm9Var2.P.resetGroupInstance(true, false);
                    return;
                }
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                nm9 nm9Var3 = ((mm9) this.b).a;
                if (!nm9Var3.w) {
                    if (arrayList.isEmpty()) {
                        nm9Var3.C(true);
                        return;
                    } else if (nm9Var3.y == null) {
                        TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                        nm9Var3.y = tL_groupCallParticipant;
                        tL_groupCallParticipant.peer = na7.q1(nm9Var3.e).w1(nm9Var3.b);
                        nm9Var3.y.video = new TLRPC.TL_groupCallParticipantVideo();
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                        tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) obj).channel));
                        }
                        nm9Var3.y.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                        TLRPC.GroupCallParticipant groupCallParticipant = nm9Var3.y;
                        groupCallParticipant.video.endpoint = "unified";
                        groupCallParticipant.videoEndpoint = "unified";
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 8:
                um9 um9Var = (um9) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                if (!um9Var.w && um9Var.P) {
                    fa4.b("[LivePlayer] rejoin failed: " + tL_error.text);
                    um9Var.K();
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) this.c;
                um9 um9Var2 = ((sm9) this.b).a;
                if (!um9Var2.w) {
                    if (arrayList2.isEmpty()) {
                        um9Var2.C(true);
                        return;
                    }
                    um9Var2.C(false);
                    if (um9Var2.y == null) {
                        TLRPC.TL_groupCallParticipant tL_groupCallParticipant2 = new TLRPC.TL_groupCallParticipant();
                        um9Var2.y = tL_groupCallParticipant2;
                        tL_groupCallParticipant2.peer = na7.q1(um9Var2.e).w1(um9Var2.b);
                        um9Var2.y.video = new TLRPC.TL_groupCallParticipantVideo();
                        TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup2 = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                        tL_groupCallParticipantVideoSourceGroup2.semantics = "SIM";
                        int size2 = arrayList2.size();
                        while (i4 < size2) {
                            Object obj2 = arrayList2.get(i4);
                            i4++;
                            tL_groupCallParticipantVideoSourceGroup2.sources.add(Integer.valueOf(((TL_phone.TL_groupCallStreamChannel) obj2).channel));
                        }
                        um9Var2.y.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup2);
                        TLRPC.GroupCallParticipant groupCallParticipant2 = um9Var2.y;
                        groupCallParticipant2.video.endpoint = "unified";
                        groupCallParticipant2.videoEndpoint = "unified";
                        return;
                    }
                    return;
                }
                return;
            case 10:
                vp9 vp9Var = (vp9) this.b;
                try {
                    SQLitePreparedStatement executeFast = ((ad7) this.c).b.executeFast("DELETE FROM saved_dialogs WHERE forumChatId = ?");
                    executeFast.requery();
                    executeFast.bindLong(1, 0L);
                    executeFast.step();
                    executeFast.dispose();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                gl.c3(new tp9(vp9Var, (byte) 2));
                return;
            case 11:
                sr9 sr9Var = (sr9) this.b;
                String str = (String) this.c;
                sr9Var.J = str;
                if (sr9Var.r) {
                    sr9Var.f.g(str, true, false, sr9Var.s, sr9Var.w, sr9Var.y, sr9Var.x, -1, 1);
                }
                int i6 = y6c.t0;
                ArrayList arrayList3 = new ArrayList(qu2.r(i6).f0);
                sr9Var.E = true;
                int i7 = sr9Var.G;
                sr9Var.G = i7 + 1;
                sr9Var.F = i7;
                sr9Var.f();
                Utilities.g.c(new zy0(sr9Var, str, i7, arrayList3, i6, (byte) 8));
                return;
            case 12:
                ArrayList arrayList4 = (ArrayList) this.c;
                int i8 = ((zr9) this.b).m;
                try {
                    ad7.Y(i8).b.beginTransaction();
                    SQLitePreparedStatement executeFast2 = ad7.Y(i8).b.executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i3 < arrayList4.size() && i3 != 100) {
                            xr9 xr9Var = (xr9) arrayList4.get(i3);
                            executeFast2.requery();
                            executeFast2.bindString(1, xr9Var.a);
                            executeFast2.bindInteger(2, xr9Var.b);
                            executeFast2.step();
                            i3++;
                        }
                    }
                    executeFast2.dispose();
                    if (arrayList4.size() > 100) {
                        SQLitePreparedStatement executeFast3 = ad7.Y(i8).b.executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i = 100; i < arrayList4.size(); i++) {
                            executeFast3.requery();
                            executeFast3.bindString(1, ((xr9) arrayList4.get(i)).a);
                            executeFast3.step();
                        }
                        executeFast3.dispose();
                    }
                    ad7.Y(i8).b.commitTransaction();
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 13:
                mt9 mt9Var = (mt9) this.b;
                TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) this.c;
                ArrayList arrayList5 = mt9Var.L;
                if (!arrayList5.isEmpty() && (indexOf = arrayList5.indexOf(tL_sponsoredPeer)) >= 0 && (K = mt9Var.K()) < mt9Var.b()) {
                    arrayList5.remove(indexOf);
                    mt9Var.r(K + 1 + indexOf);
                    int size3 = mt9Var.k0.e.size();
                    int size4 = arrayList5.size();
                    if (mt9Var.H0) {
                        size3 = Math.min(3, size3);
                    }
                    if (size4 + size3 <= 0) {
                        mt9Var.r(K);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ((mt9) this.b).S();
                u21.b0((cj3) this.c).c(k96.M0(2131754485, null)).j();
                return;
            case 15:
                bu9 bu9Var = (bu9) this.b;
                TLRPC.Message message2 = (TLRPC.Message) this.c;
                message2.send_state = 2;
                bu9Var.getNotificationCenter().k(23, Integer.valueOf(message2.id));
                bu9Var.getSendMessagesHelper().c0(message2.id);
                bu9Var.getSendMessagesHelper().h0(message2.id, false);
                return;
            case 16:
                ((SecretMediaViewer) this.b).L = false;
                ((p98) this.c).a.v0(false, true);
                return;
            case 17:
                ((SecretMediaViewer) ((wk4) this.b).c).i((File) this.c);
                return;
            case 18:
                ((yu9) this.b).sendAccessibilityEvent((View) this.c, 4);
                return;
            case 19:
                tx9 tx9Var = (tx9) this.b;
                tx9Var.v(null, false, false);
                ((d) this.c).presentFragment(new StickersActivity(5, tx9Var.M0));
                jx9 jx9Var = tx9Var.V1;
                if (jx9Var != null) {
                    jx9Var.run();
                    return;
                }
                return;
            case 20:
                yx9 yx9Var = (yx9) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList6 = yx9Var.X1;
                yx9Var.p2 = false;
                yx9Var.o2 = false;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    na7.q1(yx9Var.a).b4(messages_messages.users, false);
                    na7.q1(yx9Var.a).V3(messages_messages.chats, false);
                    ArrayList<TLRPC.Message> arrayList7 = messages_messages.messages;
                    int size5 = arrayList7.size();
                    int i9 = 0;
                    while (i9 < size5) {
                        TLRPC.Message message3 = arrayList7.get(i9);
                        i9++;
                        arrayList6.add(new k27(yx9Var.a, message3, false, true));
                    }
                    if ((messages_messages instanceof TLRPC.TL_messages_messagesSlice) && arrayList6.size() < messages_messages.count) {
                        z = true;
                    }
                    yx9Var.n2 = z;
                    yx9Var.m2 = messages_messages.next_rate;
                } else {
                    yx9Var.n2 = false;
                    yx9Var.m2 = 0;
                }
                yx9Var.j2.O(true);
                return;
            case 21:
                yx9 yx9Var2 = (yx9) this.b;
                yx9Var2.E2 = false;
                yx9Var2.W1.addAll((ArrayList) this.c);
                yx9Var2.j2.O(true);
                return;
            case 22:
                sz9 sz9Var = (sz9) this.b;
                sz9Var.f = null;
                g0a g0aVar = sz9Var.h;
                g0aVar.R = false;
                g0aVar.P.c = ((String) this.c).toLowerCase();
                g0aVar.e();
                return;
            case 23:
                z3a z3aVar = (z3a) this.b;
                k27 k27Var = (k27) this.c;
                if (k27Var != null && (message = k27Var.k) != null) {
                    message.reqId = 0;
                    if (message.send_state == 3) {
                        message.send_state = 0;
                        z3aVar.getNotificationCenter().k(49, Long.valueOf(k27.B0(k27Var.k)), tb4.t(k27Var));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) this.c;
                ((z3a) this.b).getMessagesController().P3(tL_updateShortSentMessage.pts, tL_updateShortSentMessage.date, tL_updateShortSentMessage.pts_count);
                return;
            case 25:
                p3a p3aVar = ((n3a) this.b).b;
                HashSet hashSet = p3aVar.c;
                hashSet.remove((String) this.c);
                z3a z3aVar2 = p3aVar.q;
                z3aVar2.getNotificationCenter().k(110, Long.valueOf(p3aVar.j));
                if (hashSet.isEmpty()) {
                    TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport = new TLRPC.TL_messages_startHistoryImport();
                    tL_messages_startHistoryImport.peer = p3aVar.g;
                    tL_messages_startHistoryImport.import_id = p3aVar.k;
                    z3aVar2.getConnectionsManager().sendRequest(tL_messages_startHistoryImport, new o3a(p3aVar, tL_messages_startHistoryImport));
                    return;
                }
                return;
            case 26:
                u3a u3aVar = (u3a) this.b;
                HashMap hashMap = u3aVar.a;
                hashMap.remove((String) this.c);
                u3aVar.o.getNotificationCenter().k(111, u3aVar.e);
                if (hashMap.isEmpty()) {
                    u3aVar.b();
                    return;
                }
                return;
            case 27:
                j4a j4aVar = (j4a) this.b;
                mu1 mu1Var = (mu1) this.c;
                if (mu1Var != null) {
                    mu1Var.presentFragment(new PremiumPreviewFragment(0, "select_sender"));
                    j4aVar.dismiss();
                    return;
                }
                return;
            case 28:
                ((WindowManager) this.c).removeView(((j4a) this.b).B);
                return;
            default:
                gl.g((String) this.c);
                u21.b0((d8a) this.b).k(false).j();
                return;
        }
    }
}
