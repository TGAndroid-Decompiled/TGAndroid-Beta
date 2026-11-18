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
import c8.ma;
import di.mc;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f61;
public abstract class t0 extends FrameLayout implements fs {
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
    public c1 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final a0 W;
    public final View f12557a;
    public gc f12558a0;
    public final FrameLayout f12559b;
    public ac f12560b0;
    public final di.b1 f12561c;
    public ec f12562c0;
    public final v4.c0 d;
    public zb f12563d0;
    public final bi.e8 f12564e;
    public final a0 f12565e0;
    public final f61 f12566f;
    public ValueAnimator f12567f0;
    public boolean f12568g0;
    public final v4.c0 h;
    public final a0 f12569h0;
    public final z41 f12570n;
    public final ArrayList f12571r;
    public final ArrayList f12572s;
    public final HashMap f12573w;
    public long f12574x;
    public int f12575y;

    public t0(Context context, f9 f9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f12571r = new ArrayList();
        this.f12572s = new ArrayList();
        this.f12573w = new HashMap();
        this.G = -1;
        this.H = true;
        this.J = new h6.m(29);
        int i7 = j10.f24773t0;
        this.O = i7;
        this.U = new ArrayList();
        final a2 a2Var = (a2) this;
        this.W = new a0(a2Var, 0);
        this.f12565e0 = new a0(a2Var, 1);
        this.f12568g0 = false;
        this.f12569h0 = new a0(a2Var, 2);
        this.f12557a = view;
        this.f12559b = frameLayout;
        view.setAlpha(0.5f);
        di.b1 b1Var = new di.b1(1, context, a2Var);
        this.f12561c = b1Var;
        b1Var.setWillNotDraw(false);
        v4.c0 c0Var = new v4.c0(1, true);
        this.d = c0Var;
        b1Var.setLayoutManager(c0Var);
        bi.e8 e8Var = new bi.e8(a2Var, b1Var, context, i7, new q10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j3;
                int i10 = r2;
                int i11 = 0;
                a2 a2Var2 = a2Var;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = a2Var2.f12571r;
                        c1 c1Var = a2Var2.Q;
                        if (c1Var == null) {
                            j3 = 0;
                        } else {
                            j3 = c1Var.j();
                        }
                        a2Var2.I = j3;
                        while (i11 < arrayList2.size()) {
                            r0 r0Var = (r0) arrayList2.get(i11);
                            if (r0Var.f12487b || !r0Var.f12489e || r0Var.f12491g >= j3) {
                                int i12 = l0.f12205b;
                                l41 K = l41.K(l0.class);
                                K.H = r0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = a2Var2.f12572s;
                        while (i11 < arrayList3.size()) {
                            int i13 = p0.f12369b;
                            l41 K2 = l41.K(p0.class);
                            K2.H = (s0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, new b(), 2);
        this.f12564e = e8Var;
        b1Var.setAdapter(e8Var);
        e8Var.f42809r = false;
        b1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        b1Var.setClipToPadding(false);
        addView(b1Var, ma.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        b1Var.setOnItemClickListener(new bi.p1(a2Var, viewGroup, f9Var, 1));
        f0 f0Var = new f0(a2Var);
        f0Var.f59151m = false;
        f0Var.C = false;
        lr lrVar = lr.h;
        f0Var.o(lrVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        b1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232061);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.d(a2Var, 22));
        f61 f61Var = new f61(1, context, null);
        this.f12566f = f61Var;
        f61Var.setWillNotDraw(false);
        v4.c0 c0Var2 = new v4.c0(0, false);
        this.h = c0Var2;
        f61Var.setLayoutManager(c0Var2);
        z41 z41Var = new z41(f61Var, context, i7, 0, false, new q10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j3;
                int i10 = r2;
                int i11 = 0;
                a2 a2Var2 = a2Var;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = a2Var2.f12571r;
                        c1 c1Var = a2Var2.Q;
                        if (c1Var == null) {
                            j3 = 0;
                        } else {
                            j3 = c1Var.j();
                        }
                        a2Var2.I = j3;
                        while (i11 < arrayList2.size()) {
                            r0 r0Var = (r0) arrayList2.get(i11);
                            if (r0Var.f12487b || !r0Var.f12489e || r0Var.f12491g >= j3) {
                                int i12 = l0.f12205b;
                                l41 K = l41.K(l0.class);
                                K.H = r0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = a2Var2.f12572s;
                        while (i11 < arrayList3.size()) {
                            int i13 = p0.f12369b;
                            l41 K2 = l41.K(p0.class);
                            K2.H = (s0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, null);
        this.f12570n = z41Var;
        f61Var.setAdapter(z41Var);
        z41Var.f42809r = false;
        f61Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        f61Var.setClipToPadding(false);
        addView(f61Var, ma.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        f61Var.setOnItemClickListener(new di.c7(a2Var, 6));
        v4.k kVar = new v4.k();
        kVar.f59151m = false;
        kVar.C = false;
        kVar.o(lrVar);
        kVar.n(350L);
        f61Var.setItemAnimator(kVar);
        u(false);
    }

    public static Integer a(t0 t0Var, Long l10) {
        t0Var.f12565e0.run();
        t0Var.S = l10.longValue();
        gc I = new lc(t0Var.f12559b, new b()).I(2131624227, t0Var.getStarsToastTitle(), t0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.f35469r = false;
        I.k(true);
        long j3 = 0;
        t0Var.S = 0L;
        t0Var.T = true;
        int o4 = t0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        c1 c1Var = t0Var.Q;
        if (c1Var != null) {
            j3 = c1Var.j();
        }
        if (t0Var.getDefaultPeerId() == t0Var.N && t0Var.f()) {
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
        c1 c1Var = this.Q;
        if (c1Var != null && c1Var.l()) {
            TLRPC.GroupCall groupCall = this.Q.f11801w;
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
            return j10.i(this.O).e();
        }
        return org.telegram.messenger.n5.o(defaultSendAs);
    }

    private int getListViewTop() {
        di.b1 b1Var = this.f12561c;
        int height = b1Var.getHeight();
        for (int i7 = 0; i7 < b1Var.getChildCount(); i7++) {
            height = Math.min(b1Var.getChildAt(i7).getTop(), height);
        }
        return b1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.W2(gd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return gd.M0(2131744790, null);
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
        n1 n1Var = ((a2) this).f11720j0.J1;
        m1 m1Var = n1Var.f12288a;
        m1Var.c(n1Var);
        m1Var.b();
        j();
    }

    public final void c(int i7) {
        ArrayList arrayList;
        r0 r0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f12571r;
            if (i10 < arrayList.size()) {
                if (((r0) arrayList.get(i10)).f12486a == i7) {
                    r0Var = (r0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                r0Var = null;
                break;
            }
        }
        if (r0Var != null) {
            if (r0Var.f12486a < 0 && r0Var.f12489e) {
                long j3 = r0Var.f12491g;
                if (j3 > 0) {
                    this.R -= j3;
                    j();
                }
            }
            int i11 = 0;
            while (true) {
                arrayList2 = this.f12572s;
                if (i11 >= arrayList2.size()) {
                    break;
                } else if (((s0) arrayList2.get(i11)).f12518f.contains(r0Var)) {
                    ((s0) arrayList2.get(i11)).f12518f.remove(r0Var);
                    if (((s0) arrayList2.get(i11)).f12518f.isEmpty()) {
                        arrayList2.remove(i11);
                        z10 = true;
                    } else {
                        ((s0) arrayList2.get(i11)).c();
                        m();
                    }
                } else {
                    i11++;
                }
            }
            arrayList.remove(i10);
            this.f12564e.O(true);
            if (z10) {
                ConnectionsManager.getInstance(this.O).getCurrentTime();
                Collections.sort(arrayList2, new a3.c(this, 20));
                this.f12570n.O(true);
                t();
                u(true);
            }
        }
    }

    public final m0 d(int i7) {
        m0 m0Var;
        r0 r0Var;
        int i10 = 0;
        while (true) {
            di.b1 b1Var = this.f12561c;
            if (i10 < b1Var.getChildCount()) {
                View childAt = b1Var.getChildAt(i10);
                if ((childAt instanceof m0) && (r0Var = (m0Var = (m0) childAt).L) != null && r0Var.f12486a == i7) {
                    return m0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.H2) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.P;
                if (inputGroupCall != null && inputGroupCall.f28422id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i12 = groupCallMessage.date;
                    int i13 = groupCallMessage.f28416id;
                    boolean z10 = groupCallMessage.from_admin;
                    long o4 = org.telegram.messenger.n5.o(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i12, i13, z10, o4, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.P;
                if (inputGroupCall2 != null && inputGroupCall2.f28422id == longValue) {
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
        di.b1 b1Var = this.f12561c;
        if (view == b1Var) {
            if (b1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.L - b1Var.getTop()) + b1Var.getY();
            canvas.saveLayerAlpha(b1Var.getX(), b1Var.getY(), b1Var.getX() + b1Var.getWidth(), b1Var.getY() + b1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((b1Var.getY() + b1Var.getHeight()) - max, getListViewTop()) * (1.0f - b1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
            h6.m mVar = this.J;
            mVar.n(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (b1Var.getY() + b1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), b1Var.getHeight() + b1Var.getBottom());
            mVar.n(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final int e(long j3) {
        return ((Integer) Map.EL.getOrDefault(this.f12573w, Long.valueOf(j3), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.N) {
            long j3 = this.N;
            int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i10 = this.O;
            if (i7 >= 0) {
                if (j3 == j10.i(i10).e()) {
                    return true;
                }
                return false;
            }
            c1 c1Var = this.Q;
            if (c1Var != null && (inputGroupCall = this.P) != null && inputGroupCall.f28422id == c1Var.g() && (groupCall = this.Q.f11801w) != null && groupCall.creator) {
                return true;
            }
            return org.telegram.messenger.v3.w(14, mp.u1(i10).O0(Long.valueOf(-this.N)));
        }
        return false;
    }

    public final boolean g() {
        return this.f12568g0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        di.b1 b1Var = this.f12561c;
        int height = b1Var.getHeight();
        for (int i7 = 0; i7 < b1Var.getChildCount(); i7++) {
            height = Math.min(b1Var.getChildAt(i7).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f12571r.size();
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
        c1 c1Var = this.Q;
        if (c1Var == null) {
            j3 = 0;
        } else {
            j3 = c1Var.j();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12571r;
            if (i7 < arrayList.size()) {
                r0 r0Var = (r0) arrayList.get(i7);
                int i11 = r0Var.f12486a;
                if (i11 >= 0 && i11 > this.G && (r0Var.f12487b || !r0Var.f12489e || r0Var.f12491g >= j3)) {
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
        this.f12565e0.run();
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
        long e10 = j10.i(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.n5.o(defaultSendAs);
        }
        h0 h0Var = new h0(0);
        int i10 = this.O;
        mc mcVar = new mc(getContext(), i10, this.N, null, null, arrayList, !z10, true, e10, h0Var);
        a2 a2Var = (a2) this;
        mcVar.K1 = a2Var;
        mcVar.M1 = new di.c7(a2Var, 5);
        mcVar.show();
    }

    public final void l(int i7, int i10, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        long j11;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        s0 s0Var;
        boolean z12;
        s0 s0Var2;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f12571r;
            if (i12 < arrayList.size()) {
                if (((r0) arrayList.get(i12)).f12486a != i10) {
                    i12++;
                } else {
                    return;
                }
            } else {
                int i13 = this.O;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                ?? obj = new Object();
                obj.d = i7;
                obj.f12487b = z10;
                obj.f12488c = j3;
                obj.f12490f = tL_textWithEntities;
                obj.f12491g = j10;
                obj.f12486a = i10;
                obj.f12489e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = t.b(i13, (int) obj.f12491g, 0);
                long j12 = 0;
                int i14 = (obj.f12491g > 0L ? 1 : (obj.f12491g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f12572s;
                boolean z13 = true;
                if (i14 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            j11 = j12;
                            if (((s0) arrayList2.get(i15)).f12515b == j3) {
                                s0Var = (s0) arrayList2.get(i15);
                                break;
                            } else {
                                i15++;
                                j12 = j11;
                            }
                        } else {
                            j11 = j12;
                            s0Var = null;
                            break;
                        }
                    }
                    if (s0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f12518f = arrayList3;
                        obj2.f12514a = i13;
                        obj2.f12515b = j3;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        s0Var2 = obj2;
                    } else {
                        s0Var.f12518f.add(obj);
                        this.f12566f.g1();
                        z12 = false;
                        s0Var2 = s0Var;
                    }
                    s0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.c(this, 20));
                    if (!z11) {
                        this.f12570n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j11 = 0;
                }
                if (!z11 && obj.f12489e) {
                    long j13 = obj.f12491g;
                    if (j13 > j11) {
                        this.R += j13;
                        j();
                    }
                }
                if (obj.f12486a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f12486a < ((r0) arrayList.get(size)).f12486a) {
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
                    this.f12564e.O(true);
                }
                if (i11 <= 0 && !z11 && (!this.f12561c.canScrollVertically(1) || obj.f12486a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i16 = obj.f12486a;
                    if (i16 > 0) {
                        this.G = i16;
                    }
                }
                invalidate();
                a2 a2Var = (a2) this;
                a aVar = a2Var.f11720j0.H1;
                if (aVar != null) {
                    aVar.setCount(a2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && obj.f12491g > j11) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.U.size()) {
                            if (org.telegram.messenger.n5.o(((TL_phone.groupCallDonor) this.U.get(i17)).peer_id) == obj.f12488c) {
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
                        if (j10.i(i13).e() != obj.f12488c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = mp.u1(i13).B1(obj.f12488c);
                        groupcalldonor.stars = j11;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((s0) arrayList2.get(i18)).f12515b == obj.f12488c) {
                                ((s0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((s0) arrayList2.get(i18)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f12491g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f12488c);
                }
                t();
                if (z11) {
                    a0 a0Var = this.f12569h0;
                    org.telegram.messenger.g0.r(a0Var);
                    org.telegram.messenger.g0.h3(a0Var, 100L);
                }
                c1 c1Var = this.Q;
                if (c1Var != null) {
                    c1Var.V = arrayList;
                    c1Var.W = arrayList2;
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
        ArrayList arrayList = this.f12572s;
        int size = arrayList.size();
        int i11 = 0;
        long j3 = Long.MAX_VALUE;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            s0 s0Var = (s0) obj;
            ArrayList arrayList2 = s0Var.f12518f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                r0 r0Var = (r0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (r0Var.f12491g > 0) {
                    i12 = Math.min(i12, r0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, t.b(s0Var.f12514a, (int) r0Var.f12491g, 0) + r0Var.d);
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
        org.telegram.messenger.g0.h3(zVar2, j3);
    }

    public final int n(final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j10) {
        int i7;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.O;
        final int j11 = j10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j10;
        }
        sendgroupcallmessage.random_id = Utilities.f22780b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = mp.u1(i10).l1(j3);
        ConnectionsManager.getInstance(j10.f24773t0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                t0 t0Var = t0.this;
                int i12 = j11;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList B0 = mp.B0(updates, TL_update.TL_updateMessageID.class);
                    int size = B0.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = B0.get(i13);
                        i13++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i14 = tL_updateMessageID.f28663id;
                            ArrayList arrayList = t0Var.f12571r;
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    r0 r0Var = (r0) obj2;
                                    if (r0Var.f12486a == i12) {
                                        r0Var.f12486a = i14;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    mp.u1(t0Var.O).V3(updates, false);
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.g3(new di.i9(t0Var, i12, tL_error, j10, j3, tL_textWithEntities));
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
                groupcalldonor2.peer_id = mp.u1(i10).B1(j3);
                groupcalldonor2.stars = j10;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(j10.f24773t0).getCurrentTime();
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
            org.telegram.messenger.g0.g3(a0Var);
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
        gc gcVar = this.f12558a0;
        a0 a0Var = this.f12565e0;
        if (gcVar == null || !gcVar.f35463l) {
            b bVar = new b();
            ac acVar = new ac(getContext(), bVar);
            this.f12560b0 = acVar;
            acVar.c(2131624227, new String[0]);
            this.f12560b0.f33328b.setText(getStarsToastTitle());
            ec ecVar = new ec(getContext(), bVar, true, false);
            this.f12562c0 = ecVar;
            ecVar.e(gd.M0(2131744788, null));
            this.f12562c0.f34666b = new z((a2) this, 0);
            zb zbVar = new zb(getContext(), bVar);
            this.f12563d0 = zbVar;
            zbVar.f42849b = 5000L;
            zbVar.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.xj, bVar));
            this.f12562c0.addView(this.f12563d0, ma.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f12562c0.f34668e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.f12560b0.setButton(this.f12562c0);
            gc f10 = gc.f(this.f12559b, this.f12560b0, -1);
            this.f12558a0 = f10;
            f10.f35469r = false;
            f10.k(true);
            this.f12558a0.v = a0Var;
        }
        this.S++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.f12560b0.f33328b.setText(getStarsToastTitle());
        this.f12560b0.f33329c.setText(getStarsToastSubtitle());
        this.f12563d0.f42849b = 5000L;
        org.telegram.messenger.g0.r(a0Var);
        org.telegram.messenger.g0.h3(a0Var, 5000L);
        long j3 = this.S;
        n1 n1Var = ((a2) this).f11720j0.J1;
        m1 m1Var = n1Var.f12288a;
        m1Var.c(n1Var);
        if (m1Var.f12262s) {
            m1Var.f12262s = false;
            m1Var.a(1.0f, null);
        }
        ArrayList arrayList = m1Var.f12258e;
        while (arrayList.size() > 4) {
            ((mh0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = m1Var.f12259f;
        mh0 mh0Var = new mh0(iArr2[Utilities.f22781c.nextInt(iArr2.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        mh0Var.R(m1Var);
        mh0Var.J(true);
        mh0Var.K(0);
        mh0Var.start();
        arrayList.add(mh0Var);
        m1Var.invalidate();
        org.telegram.ui.Components.m6 m6Var = m1Var.f12257c;
        m6Var.a();
        m6Var.t(i5.c.l(j3, ',', new StringBuilder("+")), true, true);
        k1 k1Var = m1Var.d;
        org.telegram.messenger.g0.r(k1Var);
        org.telegram.messenger.g0.h3(k1Var, 1500L);
        n1Var.getLocationInWindow(n1Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - n1Var.E;
        if (j10 < 100) {
            n1Var.F += 0.5f;
        } else {
            n1Var.F = Utilities.i(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * n1Var.F;
            LaunchActivity.b0((n1Var.getWidth() / 2.0f) + iArr[0], (n1Var.getHeight() / 2.0f) + iArr[1], Utilities.i(n1Var.F, 0.9f, 0.3f));
            n1Var.F = 0.0f;
            n1Var.E = currentTimeMillis;
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
            j10 = inputGroupCall2.f28422id;
        }
        if (inputGroupCall != null) {
            j11 = inputGroupCall.f28422id;
        }
        if (j10 != j11) {
            this.f12571r.clear();
            z10 = true;
            this.f12564e.O(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.P;
        int i7 = ks.H2;
        int i10 = this.O;
        if (inputGroupCall3 != null) {
            ks.f(i10).n(this, i7);
        }
        this.N = j3;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            ks.f(i10).c(this, i7);
        }
        if (z10) {
            this.f12565e0.run();
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
        di.b1 b1Var = this.f12561c;
        return Math.max(Math.max(0.0f, this.L - b1Var.getTop()), getListViewContentTop()) + b1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.H = z10;
    }

    public void setLivePlayer(c1 c1Var) {
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
        this.Q = c1Var;
        if (z10 && c1Var != null && (arrayList = c1Var.V) != null && (arrayList2 = c1Var.W) != null && arrayList != (arrayList3 = this.f12571r) && arrayList2 != (arrayList4 = this.f12572s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(c1Var.V);
            arrayList4.addAll(c1Var.W);
            this.f12564e.O(true);
            ConnectionsManager.getInstance(this.O).getCurrentTime();
            Collections.sort(arrayList4, new a3.c(this, 20));
            this.f12570n.O(true);
            u(false);
        }
    }

    public final void t() {
        q0 q0Var;
        s0 s0Var;
        m0 m0Var;
        r0 r0Var;
        HashMap hashMap = this.f12573w;
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
            hashMap.put(Long.valueOf(org.telegram.messenger.n5.o(groupcalldonor.peer_id)), Integer.valueOf(i11));
        }
        int i14 = 0;
        while (true) {
            di.b1 b1Var = this.f12561c;
            if (i14 >= b1Var.getChildCount()) {
                break;
            }
            View childAt = b1Var.getChildAt(i14);
            if ((childAt instanceof m0) && (r0Var = (m0Var = (m0) childAt).L) != null) {
                int e10 = e(r0Var.f12488c);
                r0 r0Var2 = m0Var.L;
                if (e10 != r0Var2.h) {
                    r0Var2.h = e10;
                    m0Var.set(r0Var2);
                }
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList3 = this.f12571r;
            if (i15 >= arrayList3.size()) {
                break;
            }
            r0 r0Var3 = (r0) arrayList3.get(i15);
            int e11 = e(r0Var3.f12488c);
            if (e11 != r0Var3.h) {
                r0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            f61 f61Var = this.f12566f;
            if (i16 >= f61Var.getChildCount()) {
                break;
            }
            View childAt2 = f61Var.getChildAt(i16);
            if ((childAt2 instanceof q0) && (s0Var = (q0Var = (q0) childAt2).f12452f) != null) {
                int e12 = e(s0Var.f12515b);
                s0 s0Var2 = q0Var.f12452f;
                if (e12 != s0Var2.f12517e) {
                    s0Var2.f12517e = e12;
                    q0Var.set(s0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.f12572s;
            if (i7 < arrayList4.size()) {
                s0 s0Var3 = (s0) arrayList4.get(i7);
                int e13 = e(s0Var3.f12515b);
                if (e13 != s0Var3.f12517e) {
                    s0Var3.f12517e = e13;
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
        ArrayList arrayList = this.f12572s;
        if (z10 && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        float f10 = 1.0f;
        di.b1 b1Var = this.f12561c;
        f61 f61Var = this.f12566f;
        if (z10) {
            ViewPropertyAnimator animate = b1Var.animate();
            if (this.K) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            lr lrVar = lr.h;
            translationY.setInterpolator(lrVar).setUpdateListener(new ah.g(this, 14)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = f61Var.animate();
            if (this.K) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.K) {
                f10 = 0.0f;
            }
            translationY2.alpha(f10).setInterpolator(lrVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(35.0f);
        }
        b1Var.setTranslationY(L);
        if (this.K) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(35.0f);
        }
        f61Var.setTranslationY(L2);
        if (!this.K) {
            f10 = 0.0f;
        }
        f61Var.setAlpha(f10);
        invalidate();
    }
}
