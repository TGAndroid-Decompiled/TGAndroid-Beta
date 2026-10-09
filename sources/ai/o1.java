package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.j20;
public abstract class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public n0 E;
    public int F;
    public boolean G;
    public long H;
    public final j20 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public d2 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final o0 V;
    public org.telegram.ui.Components.tc W;
    public final View f1505a;
    public org.telegram.ui.Components.nc f1506a0;
    public final FrameLayout f1507b;
    public org.telegram.ui.Components.rc f1508b0;
    public final w0 f1509c;
    public org.telegram.ui.Components.mc f1510c0;
    public final s4.d0 d;
    public final o0 f1511d0;
    public final x0 f1512e;
    public ValueAnimator f1513e0;
    public final fc1 f1514f;
    public boolean f1515f0;
    public final o0 f1516g0;
    public final s4.d0 h;
    public final c71 f1517n;
    public final ArrayList f1518r;
    public final ArrayList f1519s;
    public final HashMap v;
    public long f1520w;
    public int f1521x;
    public boolean f1522y;

    public o1(Context context, kc kcVar, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f1518r = new ArrayList();
        this.f1519s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new j20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final s3 s3Var = (s3) this;
        this.V = new o0(s3Var, 0);
        this.f1511d0 = new o0(s3Var, 1);
        this.f1515f0 = false;
        this.f1516g0 = new o0(s3Var, 2);
        this.f1505a = view;
        this.f1507b = frameLayout;
        view.setAlpha(0.5f);
        w0 w0Var = new w0(s3Var, context, 0);
        this.f1509c = w0Var;
        w0Var.setWillNotDraw(false);
        s4.d0 d0Var = new s4.d0(1, true);
        this.d = d0Var;
        w0Var.setLayoutManager(d0Var);
        x0 x0Var = new x0(s3Var, w0Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j3;
                int i11 = r2;
                int i12 = 0;
                s3 s3Var2 = s3Var;
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var = (c71) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = s3Var2.f1518r;
                        d2 d2Var = s3Var2.P;
                        if (d2Var == null) {
                            j3 = 0;
                        } else {
                            j3 = d2Var.j();
                        }
                        s3Var2.H = j3;
                        while (i12 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i12);
                            if (m1Var.f1381b || !m1Var.f1383e || m1Var.f1385g >= j3) {
                                int i13 = g1.f1046a;
                                p61 J = p61.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = s3Var2.f1519s;
                        while (i12 < arrayList3.size()) {
                            int i14 = k1.f1218a;
                            p61 J2 = p61.J(k1.class);
                            J2.G = (n1) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, new d());
        this.f1512e = x0Var;
        w0Var.setAdapter(x0Var);
        x0Var.f25280r = false;
        w0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.x5.a(-1.0f, 0.0f, 0.0f, 0.0f, 34.0f, -1, 87));
        w0Var.setOnItemClickListener(new u0(s3Var, viewGroup, kcVar, 0));
        y0 y0Var = new y0(s3Var);
        y0Var.f47698m = false;
        y0Var.C = false;
        hs hsVar = hs.h;
        y0Var.o(hsVar);
        y0Var.n(280L);
        y0Var.D = 14L;
        w0Var.setItemAnimator(y0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new v0(s3Var, 0));
        fc1 fc1Var = new fc1(context, 1, null);
        this.f1514f = fc1Var;
        fc1Var.setWillNotDraw(false);
        s4.d0 d0Var2 = new s4.d0(0, false);
        this.h = d0Var2;
        fc1Var.setLayoutManager(d0Var2);
        c71 c71Var = new c71(fc1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j3;
                int i11 = r2;
                int i12 = 0;
                s3 s3Var2 = s3Var;
                ArrayList arrayList = (ArrayList) obj;
                c71 c71Var2 = (c71) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = s3Var2.f1518r;
                        d2 d2Var = s3Var2.P;
                        if (d2Var == null) {
                            j3 = 0;
                        } else {
                            j3 = d2Var.j();
                        }
                        s3Var2.H = j3;
                        while (i12 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i12);
                            if (m1Var.f1381b || !m1Var.f1383e || m1Var.f1385g >= j3) {
                                int i13 = g1.f1046a;
                                p61 J = p61.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = s3Var2.f1519s;
                        while (i12 < arrayList3.size()) {
                            int i14 = k1.f1218a;
                            p61 J2 = p61.J(k1.class);
                            J2.G = (n1) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f1517n = c71Var;
        fc1Var.setAdapter(c71Var);
        c71Var.f25280r = false;
        fc1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        fc1Var.setClipToPadding(false);
        addView(fc1Var, w7.x5.a(26.0f, 0.0f, 0.0f, 0.0f, 9.66f, -1, 87));
        fc1Var.setOnItemClickListener(new a1.c(s3Var, 4));
        s4.j jVar = new s4.j();
        jVar.f47698m = false;
        jVar.C = false;
        jVar.o(hsVar);
        jVar.n(350L);
        fc1Var.setItemAnimator(jVar);
        u(false);
    }

    public static Integer a(o1 o1Var, Long l4) {
        o1Var.f1511d0.run();
        o1Var.R = l4.longValue();
        org.telegram.ui.Components.tc M = new ad(o1Var.f1507b, new d()).M(o1Var.getStarsToastTitle(), o1Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.f31138r = false;
        M.k(true);
        long j3 = 0;
        o1Var.R = 0L;
        o1Var.S = true;
        int o9 = o1Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        d2 d2Var = o1Var.P;
        if (d2Var != null) {
            j3 = d2Var.j();
        }
        if (o1Var.getDefaultPeerId() == o1Var.M && o1Var.f()) {
            z10 = true;
        }
        if (l4.longValue() < j3 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o9);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        d2 d2Var = this.P;
        if (d2Var != null && d2Var.l()) {
            TLRPC.GroupCall groupCall = this.P.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (z10) {
                return this.M;
            }
        }
        if (defaultSendAs == null) {
            return UserConfig.getInstance(this.N).getClientUserId();
        }
        return DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        w0 w0Var = this.f1509c;
        int height = w0Var.getHeight();
        for (int i10 = 0; i10 < w0Var.getChildCount(); i10++) {
            height = Math.min(w0Var.getChildAt(i10).getTop(), height);
        }
        return w0Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.R);
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.T.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.T.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.R = 0L;
        h(getDefaultPeerId());
        y2 y2Var = ((s3) this).f1699i0.Z1;
        x2 x2Var = y2Var.f1934a;
        x2Var.c(y2Var);
        x2Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        m1 m1Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f1518r;
            if (i11 < arrayList.size()) {
                if (((m1) arrayList.get(i11)).f1380a == i10) {
                    m1Var = (m1) arrayList.get(i11);
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                m1Var = null;
                break;
            }
        }
        if (m1Var != null) {
            if (m1Var.f1380a < 0 && m1Var.f1383e) {
                long j3 = m1Var.f1385g;
                if (j3 > 0) {
                    this.Q -= j3;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f1519s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((n1) arrayList2.get(i12)).f1445f.contains(m1Var)) {
                    ((n1) arrayList2.get(i12)).f1445f.remove(m1Var);
                    if (((n1) arrayList2.get(i12)).f1445f.isEmpty()) {
                        arrayList2.remove(i12);
                        z10 = true;
                    } else {
                        ((n1) arrayList2.get(i12)).c();
                        m();
                    }
                } else {
                    i12++;
                }
            }
            arrayList.remove(i11);
            this.f1512e.N(true);
            if (z10) {
                ConnectionsManager.getInstance(this.N).getCurrentTime();
                Collections.sort(arrayList2, new a4.d(this, 2));
                this.f1517n.N(true);
                t();
                u(true);
            }
        }
    }

    public final h1 d(int i10) {
        h1 h1Var;
        m1 m1Var;
        int i11 = 0;
        while (true) {
            w0 w0Var = this.f1509c;
            if (i11 < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i11);
                if ((childAt instanceof h1) && (m1Var = (h1Var = (h1) childAt).K) != null && m1Var.f1380a == i10) {
                    return h1Var;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveStoryMessageUpdate) {
            int i12 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.O;
                if (inputGroupCall != null && inputGroupCall.f20055id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f20049id;
                    boolean z10 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f20055id == longValue) {
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i12 < size) {
                        Integer num = arrayList.get(i12);
                        i12++;
                        c(num.intValue());
                    }
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            return false;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        w0 w0Var = this.f1509c;
        if (view == w0Var) {
            if (w0Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.K - w0Var.getTop()) + w0Var.getY();
            canvas.saveLayerAlpha(w0Var.getX(), w0Var.getY(), w0Var.getX() + w0Var.getWidth(), w0Var.getY() + w0Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((w0Var.getY() + w0Var.getHeight()) - max, getListViewTop()) * (1.0f - w0Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
            j20 j20Var = this.I;
            j20Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (w0Var.getY() + w0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), w0Var.getHeight() + w0Var.getBottom());
            j20Var.b(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final int e(long j3) {
        return ((Integer) Map.EL.getOrDefault(this.v, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.M) {
            long j3 = this.M;
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i11 = this.N;
            if (i10 >= 0) {
                if (j3 == UserConfig.getInstance(i11).getClientUserId()) {
                    return true;
                }
                return false;
            }
            d2 d2Var = this.P;
            if (d2Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f20055id == d2Var.g() && (groupCall = this.P.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i11).getChat(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f1515f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        w0 w0Var = this.f1509c;
        int height = w0Var.getHeight();
        for (int i10 = 0; i10 < w0Var.getChildCount(); i10++) {
            height = Math.min(w0Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f1518r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        long j3;
        int i10 = 0;
        if (this.F < 0) {
            return 0;
        }
        d2 d2Var = this.P;
        if (d2Var == null) {
            j3 = 0;
        } else {
            j3 = d2Var.j();
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f1518r;
            if (i10 < arrayList.size()) {
                m1 m1Var = (m1) arrayList.get(i10);
                int i12 = m1Var.f1380a;
                if (i12 >= 0 && i12 > this.F && (m1Var.f1381b || !m1Var.f1383e || m1Var.f1385g >= j3)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i10, int i11, long j3);

    public abstract void j();

    public final void k(boolean z10) {
        this.f1511d0.run();
        ArrayList arrayList = new ArrayList();
        if (this.T != null) {
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.N).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        a1 a1Var = new a1(0);
        int i11 = this.N;
        yh.h8 h8Var = new yh.h8(getContext(), i11, this.M, null, null, arrayList, !z10, true, clientUserId, a1Var);
        s3 s3Var = (s3) this;
        h8Var.O = s3Var;
        h8Var.Q = new a1.c(s3Var, 3);
        h8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        long j11;
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        n1 n1Var;
        boolean z12;
        n1 n1Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f1518r;
            if (i13 < arrayList.size()) {
                if (((m1) arrayList.get(i13)).f1380a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f1381b = z10;
                obj.f1382c = j3;
                obj.f1384f = tL_textWithEntities;
                obj.f1385g = j10;
                obj.f1380a = i11;
                obj.f1383e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = g0.b(i14, (int) obj.f1385g, 0);
                long j12 = 0;
                int i15 = (obj.f1385g > 0L ? 1 : (obj.f1385g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f1519s;
                boolean z13 = true;
                if (i15 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            j11 = j12;
                            if (((n1) arrayList2.get(i16)).f1442b == j3) {
                                n1Var = (n1) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                                j12 = j11;
                            }
                        } else {
                            j11 = j12;
                            n1Var = null;
                            break;
                        }
                    }
                    if (n1Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f1445f = arrayList3;
                        obj2.f1441a = i14;
                        obj2.f1442b = j3;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        n1Var2 = obj2;
                    } else {
                        n1Var.f1445f.add(obj);
                        this.f1514f.f1();
                        z12 = false;
                        n1Var2 = n1Var;
                    }
                    n1Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.d(this, 2));
                    if (!z11) {
                        this.f1517n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j11 = 0;
                }
                if (!z11 && obj.f1383e) {
                    long j13 = obj.f1385g;
                    if (j13 > j11) {
                        this.Q += j13;
                        j();
                    }
                }
                if (obj.f1380a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f1380a < ((m1) arrayList.get(size)).f1380a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, obj);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.f1512e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.f1509c.canScrollVertically(1) || obj.f1380a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i17 = obj.f1380a;
                    if (i17 > 0) {
                        this.F = i17;
                    }
                }
                invalidate();
                s3 s3Var = (s3) this;
                c cVar = s3Var.f1699i0.X1;
                if (cVar != null) {
                    cVar.setCount(s3Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f1385g > j11) {
                    int i18 = 0;
                    while (true) {
                        if (i18 < this.T.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i18)).peer_id) == obj.f1382c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i18);
                                break;
                            }
                            i18++;
                        } else {
                            groupcalldonor = null;
                            break;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        if (UserConfig.getInstance(i14).getClientUserId() != obj.f1382c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(obj.f1382c);
                        groupcalldonor.stars = j11;
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            if (((n1) arrayList2.get(i19)).f1442b == obj.f1382c) {
                                ((n1) arrayList2.get(i19)).b();
                                groupcalldonor.stars += ((n1) arrayList2.get(i19)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f1385g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f1382c);
                }
                t();
                if (z11) {
                    o0 o0Var = this.f1516g0;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    AndroidUtilities.runOnUIThread(o0Var, 100L);
                }
                d2 d2Var = this.P;
                if (d2Var != null) {
                    d2Var.U = arrayList;
                    d2Var.V = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i10;
        int i11;
        n0 n0Var = this.E;
        if (n0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n0Var);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.f1519s;
        int size = arrayList.size();
        int i12 = 0;
        long j3 = Long.MAX_VALUE;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            n1 n1Var = (n1) obj;
            ArrayList arrayList2 = n1Var.f1445f;
            int size2 = arrayList2.size();
            int i13 = currentTime;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList2.get(i15);
                i15++;
                m1 m1Var = (m1) obj2;
                int i16 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (m1Var.f1385g > 0) {
                    i13 = Math.min(i13, m1Var.d);
                    i11 = i16;
                    i14 = Math.max(i14, g0.b(n1Var.f1441a, (int) m1Var.f1385g, 0) + m1Var.d);
                } else {
                    i11 = i16;
                }
                arrayList = arrayList3;
                currentTime = i11;
            }
            j3 = Math.min(j3, Math.max(0, i14 - i10) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j3 >= Long.MAX_VALUE) {
            return;
        }
        n0 n0Var2 = new n0(this, 1);
        this.E = n0Var2;
        AndroidUtilities.runOnUIThread(n0Var2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i12 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j3);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                o1 o1Var = o1.this;
                int i13 = newMessageId;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                    int size = findUpdatesAndRemove.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = findUpdatesAndRemove.get(i14);
                        i14++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i15 = tL_updateMessageID.f20294id;
                            ArrayList arrayList = o1Var.f1518r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    m1 m1Var = (m1) obj2;
                                    if (m1Var.f1380a == i13) {
                                        m1Var.f1380a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(o1Var.N).lambda$processUpdates$377(updates, false);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new p0(o1Var, i13, tL_error, j10, j3, tL_textWithEntities));
                }
            }
        });
        if (this.T != null && i12 > 0) {
            int i13 = 0;
            while (true) {
                if (i13 < this.T.size()) {
                    if (((TL_phone.groupCallDonor) this.T.get(i13)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    groupcalldonor = null;
                    break;
                }
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j10;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i11).getPeer(j3);
                groupcalldonor2.stars = j10;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j3 != this.M && !f()) {
            i10 = newMessageId;
            z10 = false;
        } else {
            i10 = newMessageId;
            z10 = true;
        }
        l(currentTime, i10, z10, j3, tL_textWithEntities, j10, false);
        int i14 = i10;
        q(false, true);
        return i14;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j3) {
        return n(getDefaultPeerId(), tL_textWithEntities, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            o0 o0Var = this.V;
            AndroidUtilities.cancelRunOnUIThread(o0Var);
            AndroidUtilities.runOnUIThread(o0Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            AndroidUtilities.cancelRunOnUIThread(this.V);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        int[] iArr;
        org.telegram.ui.Components.tc tcVar = this.W;
        o0 o0Var = this.f1511d0;
        if (tcVar == null || !tcVar.f31132l) {
            d dVar = new d();
            org.telegram.ui.Components.nc ncVar = new org.telegram.ui.Components.nc(getContext(), dVar);
            this.f1506a0 = ncVar;
            ncVar.c(R.raw.stars_topup, new String[0]);
            this.f1506a0.f29140b.setText(getStarsToastTitle());
            org.telegram.ui.Components.rc rcVar = new org.telegram.ui.Components.rc(getContext(), dVar, true, false);
            this.f1508b0 = rcVar;
            rcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.f1508b0.f30421a = new n0((s3) this, 0);
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(getContext(), dVar);
            this.f1510c0 = mcVar;
            mcVar.f28806b = 5000L;
            mcVar.setColor(dVar.x0(org.telegram.ui.ActionBar.i6.Gi));
            this.f1508b0.addView(this.f1510c0, w7.x5.a(20.0f, 0.0f, 0.0f, 12.0f, 0.0f, 20, 21));
            this.f1508b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.f1506a0.setButton(this.f1508b0);
            org.telegram.ui.Components.tc f7 = org.telegram.ui.Components.tc.f(this.f1507b, this.f1506a0, -1);
            this.W = f7;
            f7.f31138r = false;
            f7.k(true);
            this.W.v = o0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f1506a0.f29140b.setText(getStarsToastTitle());
        this.f1506a0.f29141c.setText(getStarsToastSubtitle());
        this.f1510c0.f28806b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        AndroidUtilities.runOnUIThread(o0Var, 5000L);
        long j3 = this.R;
        y2 y2Var = ((s3) this).f1699i0.Z1;
        x2 x2Var = y2Var.f1934a;
        x2Var.c(y2Var);
        if (x2Var.f1902s) {
            x2Var.f1902s = false;
            x2Var.a(1.0f, null);
        }
        ArrayList arrayList = x2Var.f1898e;
        while (arrayList.size() > 4) {
            ((ck0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = x2Var.f1899f;
        ck0 ck0Var = new ck0(iArr2[Utilities.fastRandom.nextInt(iArr2.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        ck0Var.R(x2Var);
        ck0Var.J(true);
        ck0Var.K(0);
        ck0Var.start();
        arrayList.add(ck0Var);
        x2Var.invalidate();
        org.telegram.ui.Components.q6 q6Var = x2Var.f1897c;
        q6Var.a();
        q6Var.t(org.telegram.messenger.q.h(j3, ',', new StringBuilder("+")), true, true);
        t2 t2Var = x2Var.d;
        AndroidUtilities.cancelRunOnUIThread(t2Var);
        AndroidUtilities.runOnUIThread(t2Var, 1500L);
        y2Var.getLocationInWindow(y2Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - y2Var.f1944y;
        if (j10 < 100) {
            y2Var.E += 0.5f;
        } else {
            y2Var.E = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * y2Var.E;
            LaunchActivity.b0((y2Var.getWidth() / 2.0f) + iArr[0], (y2Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(y2Var.E, 0.9f, 0.3f));
            y2Var.E = 0.0f;
            y2Var.f1944y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        long j10;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        long j11 = 0;
        if (inputGroupCall2 == null) {
            j10 = 0;
        } else {
            j10 = inputGroupCall2.f20055id;
        }
        if (inputGroupCall != null) {
            j11 = inputGroupCall.f20055id;
        }
        if (j10 != j11) {
            this.f1518r.clear();
            z10 = true;
            this.f1512e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.f1511d0.run();
            o0 o0Var = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(o0Var);
                return z10;
            }
            o0Var.run();
        }
        return z10;
    }

    public final float s() {
        w0 w0Var = this.f1509c;
        return Math.max(Math.max(0.0f, this.K - w0Var.getTop()), getListViewContentTop()) + w0Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(d2 d2Var) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.P == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.P = d2Var;
        if (z10 && d2Var != null && (arrayList = d2Var.U) != null && (arrayList2 = d2Var.V) != null && arrayList != (arrayList3 = this.f1518r) && arrayList2 != (arrayList4 = this.f1519s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(d2Var.U);
            arrayList4.addAll(d2Var.V);
            this.f1512e.N(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new a4.d(this, 2));
            this.f1517n.N(true);
            u(false);
        }
    }

    public final void t() {
        l1 l1Var;
        n1 n1Var;
        h1 h1Var;
        m1 m1Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a4.d(3));
        int size = arrayList.size();
        int i10 = 0;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i14 = (int) groupcalldonor.stars;
            if (i14 != i11) {
                i12++;
                i11 = i14;
            }
            if (i12 > 3) {
                break;
            }
            hashMap.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i12));
        }
        int i15 = 0;
        while (true) {
            w0 w0Var = this.f1509c;
            if (i15 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i15);
            if ((childAt instanceof h1) && (m1Var = (h1Var = (h1) childAt).K) != null) {
                int e7 = e(m1Var.f1382c);
                m1 m1Var2 = h1Var.K;
                if (e7 != m1Var2.h) {
                    m1Var2.h = e7;
                    h1Var.set(m1Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f1518r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            m1 m1Var3 = (m1) arrayList3.get(i16);
            int e10 = e(m1Var3.f1382c);
            if (e10 != m1Var3.h) {
                m1Var3.h = e10;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            fc1 fc1Var = this.f1514f;
            if (i17 >= fc1Var.getChildCount()) {
                break;
            }
            View childAt2 = fc1Var.getChildAt(i17);
            if ((childAt2 instanceof l1) && (n1Var = (l1Var = (l1) childAt2).f1324f) != null) {
                int e11 = e(n1Var.f1442b);
                n1 n1Var2 = l1Var.f1324f;
                if (e11 != n1Var2.f1444e) {
                    n1Var2.f1444e = e11;
                    l1Var.set(n1Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f1519s;
            if (i10 < arrayList4.size()) {
                n1 n1Var3 = (n1) arrayList4.get(i10);
                int e12 = e(n1Var3.f1442b);
                if (e12 != n1Var3.f1444e) {
                    n1Var3.f1444e = e12;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void u(boolean z10) {
        float dp;
        float dp2;
        float dp3;
        float dp4;
        ArrayList arrayList = this.f1519s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f7 = 1.0f;
        w0 w0Var = this.f1509c;
        fc1 fc1Var = this.f1514f;
        if (z10) {
            ViewPropertyAnimator animate = w0Var.animate();
            if (this.J) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            hs hsVar = hs.h;
            translationY.setInterpolator(hsVar).setUpdateListener(new a(this, 2)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = fc1Var.animate();
            if (this.J) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(dp4);
            if (!this.J) {
                f7 = 0.0f;
            }
            translationY2.alpha(f7).setInterpolator(hsVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(35.0f);
        }
        w0Var.setTranslationY(dp);
        if (this.J) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(35.0f);
        }
        fc1Var.setTranslationY(dp2);
        if (!this.J) {
            f7 = 0.0f;
        }
        fc1Var.setAlpha(f7);
        invalidate();
    }
}
