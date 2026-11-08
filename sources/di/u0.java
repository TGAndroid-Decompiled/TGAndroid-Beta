package di;

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
import bi.ce;
import bi.hc;
import bi.ra;
import c8.ha;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e61;
public abstract class u0 extends FrameLayout implements ls {
    public boolean D;
    public z E;
    public int F;
    public boolean G;
    public long H;
    public final h6.m I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public g1 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final a0 V;
    public cc W;
    public final View f9809a;
    public wb f9810a0;
    public final FrameLayout f9811b;
    public ac f9812b0;
    public final bi.q1 f9813c;
    public vb f9814c0;
    public final v4.b0 d;
    public final a0 f9815d0;
    public final hc f9816e;
    public ValueAnimator f9817e0;
    public final e61 f9818f;
    public boolean f9819f0;
    public final a0 f9820g0;
    public final v4.b0 h;
    public final l41 f9821n;
    public final ArrayList f9822r;
    public final ArrayList f9823s;
    public final HashMap f9824w;
    public long f9825x;
    public int f9826y;

    public u0(Context context, p9 p9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f9822r = new ArrayList();
        this.f9823s = new ArrayList();
        this.f9824w = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new h6.m(28);
        int i7 = p10.f24470s0;
        this.N = i7;
        this.T = new ArrayList();
        final g2 g2Var = (g2) this;
        this.V = new a0(g2Var, 0);
        this.f9815d0 = new a0(g2Var, 1);
        this.f9819f0 = false;
        this.f9820g0 = new a0(g2Var, 2);
        this.f9809a = view;
        this.f9811b = frameLayout;
        view.setAlpha(0.5f);
        bi.q1 q1Var = new bi.q1(1, context, g2Var);
        this.f9813c = q1Var;
        q1Var.setWillNotDraw(false);
        v4.b0 b0Var = new v4.b0(1, true);
        this.d = b0Var;
        q1Var.setLayoutManager(b0Var);
        hc hcVar = new hc(g2Var, q1Var, context, i7, new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j3;
                int i10 = r2;
                int i11 = 0;
                g2 g2Var2 = g2Var;
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var = (l41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = g2Var2.f9822r;
                        g1 g1Var = g2Var2.P;
                        if (g1Var == null) {
                            j3 = 0;
                        } else {
                            j3 = g1Var.j();
                        }
                        g2Var2.H = j3;
                        while (i11 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i11);
                            if (s0Var.f9737b || !s0Var.f9739e || s0Var.f9741g >= j3) {
                                int i12 = m0.f9342b;
                                x31 K = x31.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = g2Var2.f9823s;
                        while (i11 < arrayList3.size()) {
                            int i13 = q0.f9621b;
                            x31 K2 = x31.K(q0.class);
                            K2.G = (t0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, new b(), 1);
        this.f9816e = hcVar;
        q1Var.setAdapter(hcVar);
        hcVar.f35528r = false;
        q1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        q1Var.setClipToPadding(false);
        addView(q1Var, ha.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        q1Var.setOnItemClickListener(new f0(g2Var, viewGroup, p9Var, 0));
        g0 g0Var = new g0(g2Var);
        g0Var.f57071m = false;
        g0Var.C = false;
        xq xqVar = xq.h;
        g0Var.o(xqVar);
        g0Var.n(280L);
        g0Var.D = 14L;
        q1Var.setItemAnimator(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232059);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.d(g2Var, 14));
        e61 e61Var = new e61(1, context, null);
        this.f9818f = e61Var;
        e61Var.setWillNotDraw(false);
        v4.b0 b0Var2 = new v4.b0(0, false);
        this.h = b0Var2;
        e61Var.setLayoutManager(b0Var2);
        l41 l41Var = new l41(e61Var, context, i7, 0, false, new v10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j3;
                int i10 = r2;
                int i11 = 0;
                g2 g2Var2 = g2Var;
                ArrayList arrayList = (ArrayList) obj;
                l41 l41Var2 = (l41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = g2Var2.f9822r;
                        g1 g1Var = g2Var2.P;
                        if (g1Var == null) {
                            j3 = 0;
                        } else {
                            j3 = g1Var.j();
                        }
                        g2Var2.H = j3;
                        while (i11 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i11);
                            if (s0Var.f9737b || !s0Var.f9739e || s0Var.f9741g >= j3) {
                                int i12 = m0.f9342b;
                                x31 K = x31.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = g2Var2.f9823s;
                        while (i11 < arrayList3.size()) {
                            int i13 = q0.f9621b;
                            x31 K2 = x31.K(q0.class);
                            K2.G = (t0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, null);
        this.f9821n = l41Var;
        e61Var.setAdapter(l41Var);
        l41Var.f35528r = false;
        e61Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        e61Var.setClipToPadding(false);
        addView(e61Var, ha.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        e61Var.setOnItemClickListener(new a1.c(g2Var, 29));
        v4.k kVar = new v4.k();
        kVar.f57071m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        e61Var.setItemAnimator(kVar);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.f9815d0.run();
        u0Var.R = l10.longValue();
        cc I = new org.telegram.ui.Components.hc(u0Var.f9811b, new b()).I(2131624226, u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle());
        boolean z9 = false;
        I.f32553r = false;
        I.k(true);
        long j3 = 0;
        u0Var.R = 0L;
        u0Var.S = true;
        int o4 = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        g1 g1Var = u0Var.P;
        if (g1Var != null) {
            j3 = g1Var.j();
        }
        if (u0Var.getDefaultPeerId() == u0Var.M && u0Var.f()) {
            z9 = true;
        }
        if (l10.longValue() < j3 && !z9) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o4);
    }

    private long getDefaultPeerId() {
        boolean z9;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        g1 g1Var = this.P;
        if (g1Var != null && g1Var.l()) {
            TLRPC.GroupCall groupCall = this.P.f9030w;
            if (groupCall == null) {
                z9 = false;
            } else {
                z9 = !groupCall.messages_enabled;
            }
            if (z9) {
                return this.M;
            }
        }
        if (defaultSendAs == null) {
            return p10.i(this.N).e();
        }
        return org.telegram.messenger.m5.o(defaultSendAs);
    }

    private int getListViewTop() {
        bi.q1 q1Var = this.f9813c;
        int height = q1Var.getHeight();
        for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
            height = Math.min(q1Var.getChildAt(i7).getTop(), height);
        }
        return q1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.X2(id.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.R)));
    }

    private String getStarsToastTitle() {
        return id.M0(2131745028, null);
    }

    private int getTotalMyStars() {
        int i7 = (int) (0 + this.R);
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.T.get(i10)).my) {
                i7 = (int) (i7 + ((TL_phone.groupCallDonor) this.T.get(i10)).stars);
            }
        }
        return i7;
    }

    public final void b() {
        this.R = 0L;
        h(getDefaultPeerId());
        r1 r1Var = ((g2) this).f9034i0.I1;
        q1 q1Var = r1Var.f9678a;
        q1Var.c(r1Var);
        q1Var.b();
        j();
    }

    public final void c(int i7) {
        ArrayList arrayList;
        s0 s0Var;
        ArrayList arrayList2;
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f9822r;
            if (i10 < arrayList.size()) {
                if (((s0) arrayList.get(i10)).f9736a == i7) {
                    s0Var = (s0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                s0Var = null;
                break;
            }
        }
        if (s0Var != null) {
            if (s0Var.f9736a < 0 && s0Var.f9739e) {
                long j3 = s0Var.f9741g;
                if (j3 > 0) {
                    this.Q -= j3;
                    j();
                }
            }
            int i11 = 0;
            while (true) {
                arrayList2 = this.f9823s;
                if (i11 >= arrayList2.size()) {
                    break;
                } else if (((t0) arrayList2.get(i11)).f9777f.contains(s0Var)) {
                    ((t0) arrayList2.get(i11)).f9777f.remove(s0Var);
                    if (((t0) arrayList2.get(i11)).f9777f.isEmpty()) {
                        arrayList2.remove(i11);
                        z9 = true;
                    } else {
                        ((t0) arrayList2.get(i11)).c();
                        m();
                    }
                } else {
                    i11++;
                }
            }
            arrayList.remove(i10);
            this.f9816e.O(true);
            if (z9) {
                ConnectionsManager.getInstance(this.N).getCurrentTime();
                Collections.sort(arrayList2, new a3.c(this, 20));
                this.f9821n.O(true);
                t();
                u(true);
            }
        }
    }

    public final n0 d(int i7) {
        n0 n0Var;
        s0 s0Var;
        int i10 = 0;
        while (true) {
            bi.q1 q1Var = this.f9813c;
            if (i10 < q1Var.getChildCount()) {
                View childAt = q1Var.getChildAt(i10);
                if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).K) != null && s0Var.f9736a == i7) {
                    return n0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.H2) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.O;
                if (inputGroupCall != null && inputGroupCall.f26973id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i12 = groupCallMessage.date;
                    int i13 = groupCallMessage.f26967id;
                    boolean z9 = groupCallMessage.from_admin;
                    long o4 = org.telegram.messenger.m5.o(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i12, i13, z9, o4, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f26973id == longValue) {
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i11 < size) {
                        Integer num = arrayList.get(i11);
                        i11++;
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
        bi.q1 q1Var = this.f9813c;
        if (view == q1Var) {
            if (q1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.K - q1Var.getTop()) + q1Var.getY();
            canvas.saveLayerAlpha(q1Var.getX(), q1Var.getY(), q1Var.getX() + q1Var.getWidth(), q1Var.getY() + q1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((q1Var.getY() + q1Var.getHeight()) - max, getListViewTop()) * (1.0f - q1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
            h6.m mVar = this.I;
            mVar.m(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (q1Var.getY() + q1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), q1Var.getHeight() + q1Var.getBottom());
            mVar.m(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final int e(long j3) {
        return ((Integer) Map.EL.getOrDefault(this.f9824w, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.M) {
            long j3 = this.M;
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i10 = this.N;
            if (i7 >= 0) {
                if (j3 == p10.i(i10).e()) {
                    return true;
                }
                return false;
            }
            g1 g1Var = this.P;
            if (g1Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f26973id == g1Var.g() && (groupCall = this.P.f9030w) != null && groupCall.creator) {
                return true;
            }
            return org.telegram.messenger.t3.w(14, qp.s1(i10).M0(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f9819f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        bi.q1 q1Var = this.f9813c;
        int height = q1Var.getHeight();
        for (int i7 = 0; i7 < q1Var.getChildCount(); i7++) {
            height = Math.min(q1Var.getChildAt(i7).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f9822r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        long j3;
        int i7 = 0;
        if (this.F < 0) {
            return 0;
        }
        g1 g1Var = this.P;
        if (g1Var == null) {
            j3 = 0;
        } else {
            j3 = g1Var.j();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f9822r;
            if (i7 < arrayList.size()) {
                s0 s0Var = (s0) arrayList.get(i7);
                int i11 = s0Var.f9736a;
                if (i11 >= 0 && i11 > this.F && (s0Var.f9737b || !s0Var.f9739e || s0Var.f9741g >= j3)) {
                    i10++;
                }
                i7++;
            } else {
                return i10;
            }
        }
    }

    public abstract void h(long j3);

    public abstract void i(int i7, int i10, long j3);

    public abstract void j();

    public final void k(boolean z9) {
        this.f9815d0.run();
        ArrayList arrayList = new ArrayList();
        if (this.T != null) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i7);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e10 = p10.i(this.N).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.m5.o(defaultSendAs);
        }
        i0 i0Var = new i0(0);
        int i10 = this.N;
        ce ceVar = new ce(getContext(), i10, this.M, null, null, arrayList, !z9, true, e10, i0Var);
        g2 g2Var = (g2) this;
        ceVar.G1 = g2Var;
        ceVar.I1 = new a1.c(g2Var, 28);
        ceVar.show();
    }

    public final void l(int i7, int i10, boolean z9, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z10) {
        long j11;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z11;
        t0 t0Var2;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f9822r;
            if (i12 < arrayList.size()) {
                if (((s0) arrayList.get(i12)).f9736a != i10) {
                    i12++;
                } else {
                    return;
                }
            } else {
                int i13 = this.N;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                ?? obj = new Object();
                obj.d = i7;
                obj.f9737b = z9;
                obj.f9738c = j3;
                obj.f9740f = tL_textWithEntities;
                obj.f9741g = j10;
                obj.f9736a = i10;
                obj.f9739e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = t.b(i13, (int) obj.f9741g, 0);
                long j12 = 0;
                int i14 = (obj.f9741g > 0L ? 1 : (obj.f9741g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f9823s;
                boolean z12 = true;
                if (i14 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            j11 = j12;
                            if (((t0) arrayList2.get(i15)).f9774b == j3) {
                                t0Var = (t0) arrayList2.get(i15);
                                break;
                            } else {
                                i15++;
                                j12 = j11;
                            }
                        } else {
                            j11 = j12;
                            t0Var = null;
                            break;
                        }
                    }
                    if (t0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f9777f = arrayList3;
                        obj2.f9773a = i13;
                        obj2.f9774b = j3;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z11 = true;
                        t0Var2 = obj2;
                    } else {
                        t0Var.f9777f.add(obj);
                        this.f9818f.g1();
                        z11 = false;
                        t0Var2 = t0Var;
                    }
                    t0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.c(this, 20));
                    if (!z10) {
                        this.f9821n.O(true);
                    }
                    if (z11) {
                        this.h.n0(0);
                    }
                } else {
                    j11 = 0;
                }
                if (!z10 && obj.f9739e) {
                    long j13 = obj.f9741g;
                    if (j13 > j11) {
                        this.Q += j13;
                        j();
                    }
                }
                if (obj.f9736a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f9736a < ((s0) arrayList.get(size)).f9736a) {
                            i11 = size + 1;
                            break;
                        }
                    }
                }
                i11 = 0;
                arrayList.add(i11, obj);
                if (!z10) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.f9816e.O(true);
                }
                if (i11 <= 0 && !z10 && (!this.f9813c.canScrollVertically(1) || obj.f9736a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i16 = obj.f9736a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                g2 g2Var = (g2) this;
                a aVar = g2Var.f9034i0.G1;
                if (aVar != null) {
                    aVar.setCount(g2Var.getUnreadMessagesCount());
                }
                if (!z10 && i10 > 0 && obj.f9741g > j11) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.T.size()) {
                            if (org.telegram.messenger.m5.o(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == obj.f9738c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i17);
                                break;
                            }
                            i17++;
                        } else {
                            groupcalldonor = null;
                            break;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        if (p10.i(i13).e() != obj.f9738c) {
                            z12 = false;
                        }
                        groupcalldonor.my = z12;
                        groupcalldonor.peer_id = qp.s1(i13).z1(obj.f9738c);
                        groupcalldonor.stars = j11;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((t0) arrayList2.get(i18)).f9774b == obj.f9738c) {
                                ((t0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f9741g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f9738c);
                }
                t();
                if (z10) {
                    a0 a0Var = this.f9820g0;
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.i3(a0Var, 100L);
                }
                g1 g1Var = this.P;
                if (g1Var != null) {
                    g1Var.U = arrayList;
                    g1Var.V = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i7;
        int i10;
        z zVar = this.E;
        if (zVar != null) {
            org.telegram.messenger.g0.r(zVar);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.f9823s;
        int size = arrayList.size();
        int i11 = 0;
        long j3 = Long.MAX_VALUE;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t0 t0Var = (t0) obj;
            ArrayList arrayList2 = t0Var.f9777f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                s0 s0Var = (s0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (s0Var.f9741g > 0) {
                    i12 = Math.min(i12, s0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, t.b(t0Var.f9773a, (int) s0Var.f9741g, 0) + s0Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            j3 = Math.min(j3, Math.max(0, i13 - i7) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j3 >= Long.MAX_VALUE) {
            return;
        }
        z zVar2 = new z(this, 1);
        this.E = zVar2;
        org.telegram.messenger.g0.i3(zVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i7;
        boolean z9;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.N;
        final int j11 = p10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.f21334b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = qp.s1(i10).j1(j3);
        ConnectionsManager.getInstance(p10.f24470s0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z10 = tLObject instanceof TLRPC.Updates;
                u0 u0Var = u0.this;
                int i12 = j11;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = qp.z0(updates, TL_update.TL_updateMessageID.class);
                    int size = z02.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = z02.get(i13);
                        i13++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i14 = tL_updateMessageID.f27214id;
                            ArrayList arrayList = u0Var.f9822r;
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    s0 s0Var = (s0) obj2;
                                    if (s0Var.f9736a == i12) {
                                        s0Var.f9736a = i14;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    qp.s1(u0Var.N).O3(updates, false);
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new ra(u0Var, i12, tL_error, j10, j3, tL_textWithEntities));
                }
            }
        });
        if (this.T != null && i11 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 < this.T.size()) {
                    if (((TL_phone.groupCallDonor) this.T.get(i12)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.T.get(i12);
                        break;
                    }
                    i12++;
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
                groupcalldonor2.peer_id = qp.s1(i10).z1(j3);
                groupcalldonor2.stars = j10;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime();
        if (j3 != this.M && !f()) {
            i7 = j11;
            z9 = false;
        } else {
            i7 = j11;
            z9 = true;
        }
        l(currentTime, i7, z9, j3, tL_textWithEntities, j10, false);
        int i13 = i7;
        q(false, true);
        return i13;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j3) {
        return n(getDefaultPeerId(), tL_textWithEntities, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            a0 a0Var = this.V;
            org.telegram.messenger.g0.r(a0Var);
            org.telegram.messenger.g0.h3(a0Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.O != null) {
            org.telegram.messenger.g0.r(this.V);
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
        cc ccVar = this.W;
        a0 a0Var = this.f9815d0;
        if (ccVar == null || !ccVar.f32547l) {
            b bVar = new b();
            wb wbVar = new wb(getContext(), bVar);
            this.f9810a0 = wbVar;
            wbVar.c(2131624226, new String[0]);
            this.f9810a0.f39905b.setText(getStarsToastTitle());
            ac acVar = new ac(getContext(), bVar, true, false);
            this.f9812b0 = acVar;
            acVar.e(id.M0(2131745026, null));
            this.f9812b0.f31765b = new z((g2) this, 0);
            vb vbVar = new vb(getContext(), bVar);
            this.f9814c0 = vbVar;
            vbVar.f38966b = 5000L;
            vbVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, bVar));
            this.f9812b0.addView(this.f9814c0, ha.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f9812b0.f31767e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.f9810a0.setButton(this.f9812b0);
            cc f10 = cc.f(this.f9811b, this.f9810a0, -1);
            this.W = f10;
            f10.f32553r = false;
            f10.k(true);
            this.W.v = a0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f9810a0.f39905b.setText(getStarsToastTitle());
        this.f9810a0.f39906c.setText(getStarsToastSubtitle());
        this.f9814c0.f38966b = 5000L;
        org.telegram.messenger.g0.r(a0Var);
        org.telegram.messenger.g0.i3(a0Var, 5000L);
        long j3 = this.R;
        r1 r1Var = ((g2) this).f9034i0.I1;
        q1 q1Var = r1Var.f9678a;
        q1Var.c(r1Var);
        if (q1Var.f9629s) {
            q1Var.f9629s = false;
            q1Var.a(1.0f, null);
        }
        ArrayList arrayList = q1Var.f9625e;
        while (arrayList.size() > 4) {
            ((zg0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = q1Var.f9626f;
        zg0 zg0Var = new zg0(iArr2[Utilities.f21335c.nextInt(iArr2.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        zg0Var.R(q1Var);
        zg0Var.J(true);
        zg0Var.K(0);
        zg0Var.start();
        arrayList.add(zg0Var);
        q1Var.invalidate();
        org.telegram.ui.Components.i6 i6Var = q1Var.f9624c;
        i6Var.a();
        i6Var.t(jg.g.m(j3, ',', new StringBuilder("+")), true, true);
        o1 o1Var = q1Var.d;
        org.telegram.messenger.g0.r(o1Var);
        org.telegram.messenger.g0.i3(o1Var, 1500L);
        r1Var.getLocationInWindow(r1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - r1Var.D;
        if (j10 < 100) {
            r1Var.E += 0.5f;
        } else {
            r1Var.E = Utilities.i(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * r1Var.E;
            LaunchActivity.b0((r1Var.getWidth() / 2.0f) + iArr[0], (r1Var.getHeight() / 2.0f) + iArr[1], Utilities.i(r1Var.E, 0.9f, 0.3f));
            r1Var.E = 0.0f;
            r1Var.D = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z9, boolean z10);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        long j10;
        boolean z9;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        long j11 = 0;
        if (inputGroupCall2 == null) {
            j10 = 0;
        } else {
            j10 = inputGroupCall2.f26973id;
        }
        if (inputGroupCall != null) {
            j11 = inputGroupCall.f26973id;
        }
        if (j10 != j11) {
            this.f9822r.clear();
            z9 = true;
            this.f9816e.O(true);
        } else {
            z9 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i7 = qs.H2;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            qs.f(i10).n(this, i7);
        }
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            qs.f(i10).c(this, i7);
        }
        if (z9) {
            this.f9815d0.run();
            a0 a0Var = this.V;
            if (inputGroupCall == null) {
                org.telegram.messenger.g0.r(a0Var);
                return z9;
            }
            a0Var.run();
        }
        return z9;
    }

    public final float s() {
        bi.q1 q1Var = this.f9813c;
        return Math.max(Math.max(0.0f, this.K - q1Var.getTop()), getListViewContentTop()) + q1Var.getY();
    }

    public void setAllowTouches(boolean z9) {
        this.G = z9;
    }

    public void setLivePlayer(g1 g1Var) {
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.P == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.P = g1Var;
        if (z9 && g1Var != null && (arrayList = g1Var.U) != null && (arrayList2 = g1Var.V) != null && arrayList != (arrayList3 = this.f9822r) && arrayList2 != (arrayList4 = this.f9823s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(g1Var.U);
            arrayList4.addAll(g1Var.V);
            this.f9816e.O(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new a3.c(this, 20));
            this.f9821n.O(true);
            u(false);
        }
    }

    public final void t() {
        r0 r0Var;
        t0 t0Var;
        n0 n0Var;
        s0 s0Var;
        HashMap hashMap = this.f9824w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a3.c(21));
        int size = arrayList.size();
        int i7 = 0;
        int i10 = Integer.MIN_VALUE;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i13 = (int) groupcalldonor.stars;
            if (i13 != i10) {
                i11++;
                i10 = i13;
            }
            if (i11 > 3) {
                break;
            }
            hashMap.put(Long.valueOf(org.telegram.messenger.m5.o(groupcalldonor.peer_id)), Integer.valueOf(i11));
        }
        int i14 = 0;
        while (true) {
            bi.q1 q1Var = this.f9813c;
            if (i14 >= q1Var.getChildCount()) {
                break;
            }
            View childAt = q1Var.getChildAt(i14);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).K) != null) {
                int e10 = e(s0Var.f9738c);
                s0 s0Var2 = n0Var.K;
                if (e10 != s0Var2.h) {
                    s0Var2.h = e10;
                    n0Var.set(s0Var2);
                }
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList3 = this.f9822r;
            if (i15 >= arrayList3.size()) {
                break;
            }
            s0 s0Var3 = (s0) arrayList3.get(i15);
            int e11 = e(s0Var3.f9738c);
            if (e11 != s0Var3.h) {
                s0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            e61 e61Var = this.f9818f;
            if (i16 >= e61Var.getChildCount()) {
                break;
            }
            View childAt2 = e61Var.getChildAt(i16);
            if ((childAt2 instanceof r0) && (t0Var = (r0Var = (r0) childAt2).f9677f) != null) {
                int e12 = e(t0Var.f9774b);
                t0 t0Var2 = r0Var.f9677f;
                if (e12 != t0Var2.f9776e) {
                    t0Var2.f9776e = e12;
                    r0Var.set(t0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.f9823s;
            if (i7 < arrayList4.size()) {
                t0 t0Var3 = (t0) arrayList4.get(i7);
                int e13 = e(t0Var3.f9774b);
                if (e13 != t0Var3.f9776e) {
                    t0Var3.f9776e = e13;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void u(boolean z9) {
        float L;
        float L2;
        float L3;
        float L4;
        ArrayList arrayList = this.f9823s;
        if (z9 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f10 = 1.0f;
        bi.q1 q1Var = this.f9813c;
        e61 e61Var = this.f9818f;
        if (z9) {
            ViewPropertyAnimator animate = q1Var.animate();
            if (this.J) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            xq xqVar = xq.h;
            translationY.setInterpolator(xqVar).setUpdateListener(new ah.h(this, 13)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = e61Var.animate();
            if (this.J) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.J) {
                f10 = 0.0f;
            }
            translationY2.alpha(f10).setInterpolator(xqVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(35.0f);
        }
        q1Var.setTranslationY(L);
        if (this.J) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(35.0f);
        }
        e61Var.setTranslationY(L2);
        if (!this.J) {
            f10 = 0.0f;
        }
        e61Var.setAlpha(f10);
        invalidate();
    }
}
