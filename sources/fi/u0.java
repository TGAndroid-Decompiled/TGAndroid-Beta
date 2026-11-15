package fi;

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
import c8.ja;
import di.ic;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.vb;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
public abstract class u0 extends FrameLayout implements is {
    public boolean E;
    public z F;
    public int G;
    public boolean H;
    public long I;
    public final h6.m J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public e1 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final a0 W;
    public final View f12375a;
    public xb f12376a0;
    public final FrameLayout f12377b;
    public rb f12378b0;
    public final di.c1 f12379c;
    public vb f12380c0;
    public final v4.b0 d;
    public qb f12381d0;
    public final bi.x5 f12382e;
    public final a0 f12383e0;
    public final b61 f12384f;
    public ValueAnimator f12385f0;
    public boolean f12386g0;
    public final v4.b0 h;
    public final a0 f12387h0;
    public final p41 f12388n;
    public final ArrayList f12389r;
    public final ArrayList f12390s;
    public final HashMap f12391w;
    public long f12392x;
    public int f12393y;

    public u0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f12389r = new ArrayList();
        this.f12390s = new ArrayList();
        this.f12391w = new HashMap();
        this.G = -1;
        this.H = true;
        this.J = new h6.m(29);
        int i7 = m10.f24940t0;
        this.O = i7;
        this.U = new ArrayList();
        final c2 c2Var = (c2) this;
        this.W = new a0(c2Var, 0);
        this.f12383e0 = new a0(c2Var, 1);
        this.f12386g0 = false;
        this.f12387h0 = new a0(c2Var, 2);
        this.f12375a = view;
        this.f12377b = frameLayout;
        view.setAlpha(0.5f);
        di.c1 c1Var = new di.c1(1, context, c2Var);
        this.f12379c = c1Var;
        c1Var.setWillNotDraw(false);
        v4.b0 b0Var = new v4.b0(1, true);
        this.d = b0Var;
        c1Var.setLayoutManager(b0Var);
        bi.x5 x5Var = new bi.x5(c2Var, c1Var, context, i7, new s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j3;
                int i10 = r2;
                int i11 = 0;
                c2 c2Var2 = c2Var;
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var = (p41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = c2Var2.f12389r;
                        e1 e1Var = c2Var2.Q;
                        if (e1Var == null) {
                            j3 = 0;
                        } else {
                            j3 = e1Var.j();
                        }
                        c2Var2.I = j3;
                        while (i11 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i11);
                            if (s0Var.f12298b || !s0Var.f12300e || s0Var.f12302g >= j3) {
                                int i12 = m0.f12022b;
                                b41 K = b41.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = c2Var2.f12390s;
                        while (i11 < arrayList3.size()) {
                            int i13 = q0.f12220b;
                            b41 K2 = b41.K(q0.class);
                            K2.G = (t0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, new b(), 2);
        this.f12382e = x5Var;
        c1Var.setAdapter(x5Var);
        x5Var.f38199r = false;
        c1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        c1Var.setClipToPadding(false);
        addView(c1Var, ja.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        c1Var.setOnItemClickListener(new f0(c2Var, viewGroup, i9Var, 0));
        g0 g0Var = new g0(c2Var);
        g0Var.f58564m = false;
        g0Var.C = false;
        er erVar = er.h;
        g0Var.o(erVar);
        g0Var.n(280L);
        g0Var.D = 14L;
        c1Var.setItemAnimator(g0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232060);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.d(c2Var, 20));
        b61 b61Var = new b61(1, context, null);
        this.f12384f = b61Var;
        b61Var.setWillNotDraw(false);
        v4.b0 b0Var2 = new v4.b0(0, false);
        this.h = b0Var2;
        b61Var.setLayoutManager(b0Var2);
        p41 p41Var = new p41(b61Var, context, i7, 0, false, new s10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j3;
                int i10 = r2;
                int i11 = 0;
                c2 c2Var2 = c2Var;
                ArrayList arrayList = (ArrayList) obj;
                p41 p41Var2 = (p41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = c2Var2.f12389r;
                        e1 e1Var = c2Var2.Q;
                        if (e1Var == null) {
                            j3 = 0;
                        } else {
                            j3 = e1Var.j();
                        }
                        c2Var2.I = j3;
                        while (i11 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i11);
                            if (s0Var.f12298b || !s0Var.f12300e || s0Var.f12302g >= j3) {
                                int i12 = m0.f12022b;
                                b41 K = b41.K(m0.class);
                                K.G = s0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = c2Var2.f12390s;
                        while (i11 < arrayList3.size()) {
                            int i13 = q0.f12220b;
                            b41 K2 = b41.K(q0.class);
                            K2.G = (t0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, null);
        this.f12388n = p41Var;
        b61Var.setAdapter(p41Var);
        p41Var.f38199r = false;
        b61Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        b61Var.setClipToPadding(false);
        addView(b61Var, ja.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        b61Var.setOnItemClickListener(new di.z6(c2Var, 6));
        v4.k kVar = new v4.k();
        kVar.f58564m = false;
        kVar.C = false;
        kVar.o(erVar);
        kVar.n(350L);
        b61Var.setItemAnimator(kVar);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.f12383e0.run();
        u0Var.S = l10.longValue();
        xb I = new cc(u0Var.f12377b, new b()).I(2131624227, u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.f41643r = false;
        I.k(true);
        long j3 = 0;
        u0Var.S = 0L;
        u0Var.T = true;
        int o4 = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        e1 e1Var = u0Var.Q;
        if (e1Var != null) {
            j3 = e1Var.j();
        }
        if (u0Var.getDefaultPeerId() == u0Var.N && u0Var.f()) {
            z10 = true;
        }
        if (l10.longValue() < j3 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o4);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        e1 e1Var = this.Q;
        if (e1Var != null && e1Var.l()) {
            TLRPC.GroupCall groupCall = this.Q.f11661w;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (z10) {
                return this.N;
            }
        }
        if (defaultSendAs == null) {
            return m10.i(this.O).e();
        }
        return org.telegram.messenger.m5.o(defaultSendAs);
    }

    private int getListViewTop() {
        di.c1 c1Var = this.f12379c;
        int height = c1Var.getHeight();
        for (int i7 = 0; i7 < c1Var.getChildCount(); i7++) {
            height = Math.min(c1Var.getChildAt(i7).getTop(), height);
        }
        return c1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.X2(hd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return hd.M0(2131745025, null);
    }

    private int getTotalMyStars() {
        int i7 = (int) (0 + this.S);
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.U.get(i10)).my) {
                i7 = (int) (i7 + ((TL_phone.groupCallDonor) this.U.get(i10)).stars);
            }
        }
        return i7;
    }

    public final void b() {
        this.S = 0L;
        h(getDefaultPeerId());
        p1 p1Var = ((c2) this).f11589j0.J1;
        o1 o1Var = p1Var.f12159a;
        o1Var.c(p1Var);
        o1Var.b();
        j();
    }

    public final void c(int i7) {
        ArrayList arrayList;
        s0 s0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f12389r;
            if (i10 < arrayList.size()) {
                if (((s0) arrayList.get(i10)).f12297a == i7) {
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
            if (s0Var.f12297a < 0 && s0Var.f12300e) {
                long j3 = s0Var.f12302g;
                if (j3 > 0) {
                    this.R -= j3;
                    j();
                }
            }
            int i11 = 0;
            while (true) {
                arrayList2 = this.f12390s;
                if (i11 >= arrayList2.size()) {
                    break;
                } else if (((t0) arrayList2.get(i11)).f12350f.contains(s0Var)) {
                    ((t0) arrayList2.get(i11)).f12350f.remove(s0Var);
                    if (((t0) arrayList2.get(i11)).f12350f.isEmpty()) {
                        arrayList2.remove(i11);
                        z10 = true;
                    } else {
                        ((t0) arrayList2.get(i11)).c();
                        m();
                    }
                } else {
                    i11++;
                }
            }
            arrayList.remove(i10);
            this.f12382e.O(true);
            if (z10) {
                ConnectionsManager.getInstance(this.O).getCurrentTime();
                Collections.sort(arrayList2, new a3.c(this, 20));
                this.f12388n.O(true);
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
            di.c1 c1Var = this.f12379c;
            if (i10 < c1Var.getChildCount()) {
                View childAt = c1Var.getChildAt(i10);
                if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).L) != null && s0Var.f12297a == i7) {
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
        if (i7 == ns.H2) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.P;
                if (inputGroupCall != null && inputGroupCall.f28068id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i12 = groupCallMessage.date;
                    int i13 = groupCallMessage.f28062id;
                    boolean z10 = groupCallMessage.from_admin;
                    long o4 = org.telegram.messenger.m5.o(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i12, i13, z10, o4, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.P;
                if (inputGroupCall2 != null && inputGroupCall2.f28068id == longValue) {
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
        if (!this.H) {
            return false;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        di.c1 c1Var = this.f12379c;
        if (view == c1Var) {
            if (c1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.L - c1Var.getTop()) + c1Var.getY();
            canvas.saveLayerAlpha(c1Var.getX(), c1Var.getY(), c1Var.getX() + c1Var.getWidth(), c1Var.getY() + c1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((c1Var.getY() + c1Var.getHeight()) - max, getListViewTop()) * (1.0f - c1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
            h6.m mVar = this.J;
            mVar.m(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (c1Var.getY() + c1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), c1Var.getHeight() + c1Var.getBottom());
            mVar.m(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final int e(long j3) {
        return ((Integer) Map.EL.getOrDefault(this.f12391w, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.N) {
            long j3 = this.N;
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i10 = this.O;
            if (i7 >= 0) {
                if (j3 == m10.i(i10).e()) {
                    return true;
                }
                return false;
            }
            e1 e1Var = this.Q;
            if (e1Var != null && (inputGroupCall = this.P) != null && inputGroupCall.f28068id == e1Var.g() && (groupCall = this.Q.f11661w) != null && groupCall.creator) {
                return true;
            }
            return org.telegram.messenger.t3.w(14, np.s1(i10).M0(Long.valueOf(-this.N)));
        }
        return false;
    }

    public final boolean g() {
        return this.f12386g0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        di.c1 c1Var = this.f12379c;
        int height = c1Var.getHeight();
        for (int i7 = 0; i7 < c1Var.getChildCount(); i7++) {
            height = Math.min(c1Var.getChildAt(i7).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f12389r.size();
    }

    public long getStarsCount() {
        return this.R + this.S;
    }

    public int getUnreadMessagesCount() {
        long j3;
        int i7 = 0;
        if (this.G < 0) {
            return 0;
        }
        e1 e1Var = this.Q;
        if (e1Var == null) {
            j3 = 0;
        } else {
            j3 = e1Var.j();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12389r;
            if (i7 < arrayList.size()) {
                s0 s0Var = (s0) arrayList.get(i7);
                int i11 = s0Var.f12297a;
                if (i11 >= 0 && i11 > this.G && (s0Var.f12298b || !s0Var.f12300e || s0Var.f12302g >= j3)) {
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

    public final void k(boolean z10) {
        this.f12383e0.run();
        ArrayList arrayList = new ArrayList();
        if (this.U != null) {
            for (int i7 = 0; i7 < this.U.size(); i7++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i7);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e10 = m10.i(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.m5.o(defaultSendAs);
        }
        i0 i0Var = new i0(0);
        int i10 = this.O;
        ic icVar = new ic(getContext(), i10, this.N, null, null, arrayList, !z10, true, e10, i0Var);
        c2 c2Var = (c2) this;
        icVar.K1 = c2Var;
        icVar.M1 = new di.z6(c2Var, 5);
        icVar.show();
    }

    public final void l(int i7, int i10, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        long j11;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z12;
        t0 t0Var2;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f12389r;
            if (i12 < arrayList.size()) {
                if (((s0) arrayList.get(i12)).f12297a != i10) {
                    i12++;
                } else {
                    return;
                }
            } else {
                int i13 = this.O;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                ?? obj = new Object();
                obj.d = i7;
                obj.f12298b = z10;
                obj.f12299c = j3;
                obj.f12301f = tL_textWithEntities;
                obj.f12302g = j10;
                obj.f12297a = i10;
                obj.f12300e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = t.b(i13, (int) obj.f12302g, 0);
                long j12 = 0;
                int i14 = (obj.f12302g > 0L ? 1 : (obj.f12302g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f12390s;
                boolean z13 = true;
                if (i14 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            j11 = j12;
                            if (((t0) arrayList2.get(i15)).f12347b == j3) {
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
                        obj2.f12350f = arrayList3;
                        obj2.f12346a = i13;
                        obj2.f12347b = j3;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        t0Var2 = obj2;
                    } else {
                        t0Var.f12350f.add(obj);
                        this.f12384f.g1();
                        z12 = false;
                        t0Var2 = t0Var;
                    }
                    t0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.c(this, 20));
                    if (!z11) {
                        this.f12388n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j11 = 0;
                }
                if (!z11 && obj.f12300e) {
                    long j13 = obj.f12302g;
                    if (j13 > j11) {
                        this.R += j13;
                        j();
                    }
                }
                if (obj.f12297a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f12297a < ((s0) arrayList.get(size)).f12297a) {
                            i11 = size + 1;
                            break;
                        }
                    }
                }
                i11 = 0;
                arrayList.add(i11, obj);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.f12382e.O(true);
                }
                if (i11 <= 0 && !z11 && (!this.f12379c.canScrollVertically(1) || obj.f12297a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i16 = obj.f12297a;
                    if (i16 > 0) {
                        this.G = i16;
                    }
                }
                invalidate();
                c2 c2Var = (c2) this;
                a aVar = c2Var.f11589j0.H1;
                if (aVar != null) {
                    aVar.setCount(c2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && obj.f12302g > j11) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.U.size()) {
                            if (org.telegram.messenger.m5.o(((TL_phone.groupCallDonor) this.U.get(i17)).peer_id) == obj.f12299c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i17);
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
                        if (m10.i(i13).e() != obj.f12299c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = np.s1(i13).z1(obj.f12299c);
                        groupcalldonor.stars = j11;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((t0) arrayList2.get(i18)).f12347b == obj.f12299c) {
                                ((t0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i18)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f12302g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f12299c);
                }
                t();
                if (z11) {
                    a0 a0Var = this.f12387h0;
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.i3(a0Var, 100L);
                }
                e1 e1Var = this.Q;
                if (e1Var != null) {
                    e1Var.V = arrayList;
                    e1Var.W = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i7;
        int i10;
        z zVar = this.F;
        if (zVar != null) {
            org.telegram.messenger.g0.r(zVar);
            this.F = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.O).getCurrentTime();
        ArrayList arrayList = this.f12390s;
        int size = arrayList.size();
        int i11 = 0;
        long j3 = Long.MAX_VALUE;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t0 t0Var = (t0) obj;
            ArrayList arrayList2 = t0Var.f12350f;
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
                if (s0Var.f12302g > 0) {
                    i12 = Math.min(i12, s0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, t.b(t0Var.f12346a, (int) s0Var.f12302g, 0) + s0Var.d);
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
        this.F = zVar2;
        org.telegram.messenger.g0.i3(zVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i7;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.O;
        final int j11 = m10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.f22414b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = np.s1(i10).j1(j3);
        ConnectionsManager.getInstance(m10.f24940t0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                u0 u0Var = u0.this;
                int i12 = j11;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = np.z0(updates, TL_update.TL_updateMessageID.class);
                    int size = z02.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = z02.get(i13);
                        i13++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i14 = tL_updateMessageID.f28309id;
                            ArrayList arrayList = u0Var.f12389r;
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    s0 s0Var = (s0) obj2;
                                    if (s0Var.f12297a == i12) {
                                        s0Var.f12297a = i14;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    np.s1(u0Var.O).O3(updates, false);
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new di.f9(u0Var, i12, tL_error, j10, j3, tL_textWithEntities));
                }
            }
        });
        if (this.U != null && i11 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 < this.U.size()) {
                    if (((TL_phone.groupCallDonor) this.U.get(i12)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i12);
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
                groupcalldonor2.peer_id = np.s1(i10).z1(j3);
                groupcalldonor2.stars = j10;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(m10.f24940t0).getCurrentTime();
        if (j3 != this.N && !f()) {
            i7 = j11;
            z10 = false;
        } else {
            i7 = j11;
            z10 = true;
        }
        l(currentTime, i7, z10, j3, tL_textWithEntities, j10, false);
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
        if (this.P != null) {
            a0 a0Var = this.W;
            org.telegram.messenger.g0.r(a0Var);
            org.telegram.messenger.g0.h3(a0Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P != null) {
            org.telegram.messenger.g0.r(this.W);
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
        xb xbVar = this.f12376a0;
        a0 a0Var = this.f12383e0;
        if (xbVar == null || !xbVar.f41637l) {
            b bVar = new b();
            rb rbVar = new rb(getContext(), bVar);
            this.f12378b0 = rbVar;
            rbVar.c(2131624227, new String[0]);
            this.f12378b0.f38939b.setText(getStarsToastTitle());
            vb vbVar = new vb(getContext(), bVar, true, false);
            this.f12380c0 = vbVar;
            vbVar.e(hd.M0(2131745023, null));
            this.f12380c0.f40372b = new z((c2) this, 0);
            qb qbVar = new qb(getContext(), bVar);
            this.f12381d0 = qbVar;
            qbVar.f38604b = 5000L;
            qbVar.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.xj, bVar));
            this.f12380c0.addView(this.f12381d0, ja.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f12380c0.f40374e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.f12378b0.setButton(this.f12380c0);
            xb f10 = xb.f(this.f12377b, this.f12378b0, -1);
            this.f12376a0 = f10;
            f10.f41643r = false;
            f10.k(true);
            this.f12376a0.v = a0Var;
        }
        this.S++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.f12378b0.f38939b.setText(getStarsToastTitle());
        this.f12378b0.f38940c.setText(getStarsToastSubtitle());
        this.f12381d0.f38604b = 5000L;
        org.telegram.messenger.g0.r(a0Var);
        org.telegram.messenger.g0.i3(a0Var, 5000L);
        long j3 = this.S;
        p1 p1Var = ((c2) this).f11589j0.J1;
        o1 o1Var = p1Var.f12159a;
        o1Var.c(p1Var);
        if (o1Var.f12110s) {
            o1Var.f12110s = false;
            o1Var.a(1.0f, null);
        }
        ArrayList arrayList = o1Var.f12106e;
        while (arrayList.size() > 4) {
            ((ch0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = o1Var.f12107f;
        ch0 ch0Var = new ch0(iArr2[Utilities.f22415c.nextInt(iArr2.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        ch0Var.R(o1Var);
        ch0Var.J(true);
        ch0Var.K(0);
        ch0Var.start();
        arrayList.add(ch0Var);
        o1Var.invalidate();
        org.telegram.ui.Components.g6 g6Var = o1Var.f12105c;
        g6Var.a();
        g6Var.t(i5.c.l(j3, ',', new StringBuilder("+")), true, true);
        m1 m1Var = o1Var.d;
        org.telegram.messenger.g0.r(m1Var);
        org.telegram.messenger.g0.i3(m1Var, 1500L);
        p1Var.getLocationInWindow(p1Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - p1Var.E;
        if (j10 < 100) {
            p1Var.F += 0.5f;
        } else {
            p1Var.F = Utilities.i(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * p1Var.F;
            LaunchActivity.b0((p1Var.getWidth() / 2.0f) + iArr[0], (p1Var.getHeight() / 2.0f) + iArr[1], Utilities.i(p1Var.F, 0.9f, 0.3f));
            p1Var.F = 0.0f;
            p1Var.E = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j3, TLRPC.InputGroupCall inputGroupCall) {
        long j10;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.P;
        long j11 = 0;
        if (inputGroupCall2 == null) {
            j10 = 0;
        } else {
            j10 = inputGroupCall2.f28068id;
        }
        if (inputGroupCall != null) {
            j11 = inputGroupCall.f28068id;
        }
        if (j10 != j11) {
            this.f12389r.clear();
            z10 = true;
            this.f12382e.O(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.P;
        int i7 = ns.H2;
        int i10 = this.O;
        if (inputGroupCall3 != null) {
            ns.f(i10).n(this, i7);
        }
        this.N = j3;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            ns.f(i10).c(this, i7);
        }
        if (z10) {
            this.f12383e0.run();
            a0 a0Var = this.W;
            if (inputGroupCall == null) {
                org.telegram.messenger.g0.r(a0Var);
                return z10;
            }
            a0Var.run();
        }
        return z10;
    }

    public final float s() {
        di.c1 c1Var = this.f12379c;
        return Math.max(Math.max(0.0f, this.L - c1Var.getTop()), getListViewContentTop()) + c1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.H = z10;
    }

    public void setLivePlayer(e1 e1Var) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.Q == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = e1Var;
        if (z10 && e1Var != null && (arrayList = e1Var.V) != null && (arrayList2 = e1Var.W) != null && arrayList != (arrayList3 = this.f12389r) && arrayList2 != (arrayList4 = this.f12390s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(e1Var.V);
            arrayList4.addAll(e1Var.W);
            this.f12382e.O(true);
            ConnectionsManager.getInstance(this.O).getCurrentTime();
            Collections.sort(arrayList4, new a3.c(this, 20));
            this.f12388n.O(true);
            u(false);
        }
    }

    public final void t() {
        r0 r0Var;
        t0 t0Var;
        n0 n0Var;
        s0 s0Var;
        HashMap hashMap = this.f12391w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
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
            di.c1 c1Var = this.f12379c;
            if (i14 >= c1Var.getChildCount()) {
                break;
            }
            View childAt = c1Var.getChildAt(i14);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).L) != null) {
                int e10 = e(s0Var.f12299c);
                s0 s0Var2 = n0Var.L;
                if (e10 != s0Var2.h) {
                    s0Var2.h = e10;
                    n0Var.set(s0Var2);
                }
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList3 = this.f12389r;
            if (i15 >= arrayList3.size()) {
                break;
            }
            s0 s0Var3 = (s0) arrayList3.get(i15);
            int e11 = e(s0Var3.f12299c);
            if (e11 != s0Var3.h) {
                s0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            b61 b61Var = this.f12384f;
            if (i16 >= b61Var.getChildCount()) {
                break;
            }
            View childAt2 = b61Var.getChildAt(i16);
            if ((childAt2 instanceof r0) && (t0Var = (r0Var = (r0) childAt2).f12256f) != null) {
                int e12 = e(t0Var.f12347b);
                t0 t0Var2 = r0Var.f12256f;
                if (e12 != t0Var2.f12349e) {
                    t0Var2.f12349e = e12;
                    r0Var.set(t0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.f12390s;
            if (i7 < arrayList4.size()) {
                t0 t0Var3 = (t0) arrayList4.get(i7);
                int e13 = e(t0Var3.f12347b);
                if (e13 != t0Var3.f12349e) {
                    t0Var3.f12349e = e13;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public final void u(boolean z10) {
        float L;
        float L2;
        float L3;
        float L4;
        ArrayList arrayList = this.f12390s;
        if (z10 && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        float f10 = 1.0f;
        di.c1 c1Var = this.f12379c;
        b61 b61Var = this.f12384f;
        if (z10) {
            ViewPropertyAnimator animate = c1Var.animate();
            if (this.K) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            er erVar = er.h;
            translationY.setInterpolator(erVar).setUpdateListener(new ah.h(this, 14)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = b61Var.animate();
            if (this.K) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.K) {
                f10 = 0.0f;
            }
            translationY2.alpha(f10).setInterpolator(erVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(35.0f);
        }
        c1Var.setTranslationY(L);
        if (this.K) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(35.0f);
        }
        b61Var.setTranslationY(L2);
        if (!this.K) {
            f10 = 0.0f;
        }
        b61Var.setAlpha(f10);
        invalidate();
    }
}
