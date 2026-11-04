package ei;

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
import b8.mf;
import ci.tc;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u51;
public abstract class w0 extends FrameLayout implements cs {
    public boolean E;
    public a0 F;
    public int G;
    public boolean H;
    public long I;
    public final k4.j J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public g1 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final c0 W;
    public final View f11146a;
    public ac f11147a0;
    public final FrameLayout f11148b;
    public ub f11149b0;
    public final ci.j1 f11150c;
    public yb f11151c0;
    public final u4.b0 d;
    public tb f11152d0;
    public final ai.f6 f11153e;
    public final c0 f11154e0;
    public final u51 f11155f;
    public ValueAnimator f11156f0;
    public boolean f11157g0;
    public final u4.b0 h;
    public final c0 f11158h0;
    public final f41 f11159n;
    public final ArrayList f11160r;
    public final ArrayList f11161s;
    public final HashMap f11162w;
    public long f11163x;
    public int f11164y;

    public w0(Context context, r9 r9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f11160r = new ArrayList();
        this.f11161s = new ArrayList();
        this.f11162w = new HashMap();
        this.G = -1;
        this.H = true;
        this.J = new k4.j(24);
        int i3 = h10.f22829t0;
        this.O = i3;
        this.U = new ArrayList();
        final k2 k2Var = (k2) this;
        this.W = new c0(k2Var, 0);
        this.f11154e0 = new c0(k2Var, 1);
        this.f11157g0 = false;
        this.f11158h0 = new c0(k2Var, 2);
        this.f11146a = view;
        this.f11148b = frameLayout;
        view.setAlpha(0.5f);
        ci.j1 j1Var = new ci.j1(1, context, k2Var);
        this.f11150c = j1Var;
        j1Var.setWillNotDraw(false);
        u4.b0 b0Var = new u4.b0(1, true);
        this.d = b0Var;
        j1Var.setLayoutManager(b0Var);
        ai.f6 f6Var = new ai.f6(k2Var, j1Var, context, i3, new n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j10;
                int i10 = r2;
                int i11 = 0;
                k2 k2Var2 = k2Var;
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var = (f41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = k2Var2.f11160r;
                        g1 g1Var = k2Var2.Q;
                        if (g1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = g1Var.j();
                        }
                        k2Var2.I = j10;
                        while (i11 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i11);
                            if (u0Var.f11070b || !u0Var.f11072e || u0Var.f11074g >= j10) {
                                int i12 = o0.f10683b;
                                r31 K = r31.K(o0.class);
                                K.G = u0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = k2Var2.f11161s;
                        while (i11 < arrayList3.size()) {
                            int i13 = s0.f10976b;
                            r31 K2 = r31.K(s0.class);
                            K2.G = (v0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, new b(), 2);
        this.f11153e = f6Var;
        j1Var.setAdapter(f6Var);
        f6Var.f33698r = false;
        j1Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(7.5f));
        j1Var.setClipToPadding(false);
        addView(j1Var, mf.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        j1Var.setOnItemClickListener(new h0(k2Var, viewGroup, r9Var, 0));
        i0 i0Var = new i0(k2Var);
        i0Var.f55567m = false;
        i0Var.C = false;
        xq xqVar = xq.h;
        i0Var.o(xqVar);
        i0Var.n(280L);
        i0Var.D = 14L;
        j1Var.setItemAnimator(i0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232059);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(1090519039, 1, -1));
        imageView.setOnClickListener(new ai.b(k2Var, 17));
        u51 u51Var = new u51(1, context, null);
        this.f11155f = u51Var;
        u51Var.setWillNotDraw(false);
        u4.b0 b0Var2 = new u4.b0(0, false);
        this.h = b0Var2;
        u51Var.setLayoutManager(b0Var2);
        f41 f41Var = new f41(u51Var, context, i3, 0, false, new n10() {
            @Override
            public final void a(Object obj, Object obj2) {
                long j10;
                int i10 = r2;
                int i11 = 0;
                k2 k2Var2 = k2Var;
                ArrayList arrayList = (ArrayList) obj;
                f41 f41Var2 = (f41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = k2Var2.f11160r;
                        g1 g1Var = k2Var2.Q;
                        if (g1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = g1Var.j();
                        }
                        k2Var2.I = j10;
                        while (i11 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i11);
                            if (u0Var.f11070b || !u0Var.f11072e || u0Var.f11074g >= j10) {
                                int i12 = o0.f10683b;
                                r31 K = r31.K(o0.class);
                                K.G = u0Var;
                                arrayList.add(K);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = k2Var2.f11161s;
                        while (i11 < arrayList3.size()) {
                            int i13 = s0.f10976b;
                            r31 K2 = r31.K(s0.class);
                            K2.G = (v0) arrayList3.get(i11);
                            arrayList.add(K2);
                            i11++;
                        }
                        return;
                }
            }
        }, null);
        this.f11159n = f41Var;
        u51Var.setAdapter(f41Var);
        f41Var.f33698r = false;
        u51Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        u51Var.setClipToPadding(false);
        addView(u51Var, mf.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        u51Var.setOnItemClickListener(new a1.c(k2Var, 25));
        u4.k kVar = new u4.k();
        kVar.f55567m = false;
        kVar.C = false;
        kVar.o(xqVar);
        kVar.n(350L);
        u51Var.setItemAnimator(kVar);
        u(false);
    }

    public static Integer a(w0 w0Var, Long l10) {
        w0Var.f11154e0.run();
        w0Var.S = l10.longValue();
        ac I = new fc(w0Var.f11148b, new b()).I(2131624226, w0Var.getStarsToastTitle(), w0Var.getStarsToastSubtitle());
        boolean z10 = false;
        I.f31800r = false;
        I.k(true);
        long j10 = 0;
        w0Var.S = 0L;
        w0Var.T = true;
        int o10 = w0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        g1 g1Var = w0Var.Q;
        if (g1Var != null) {
            j10 = g1Var.j();
        }
        if (w0Var.getDefaultPeerId() == w0Var.N && w0Var.f()) {
            z10 = true;
        }
        if (l10.longValue() < j10 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o10);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        g1 g1Var = this.Q;
        if (g1Var != null && g1Var.l()) {
            TLRPC.GroupCall groupCall = this.Q.f10304w;
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
            return h10.i(this.O).e();
        }
        return org.telegram.messenger.m5.o(defaultSendAs);
    }

    private int getListViewTop() {
        ci.j1 j1Var = this.f11150c;
        int height = j1Var.getHeight();
        for (int i3 = 0; i3 < j1Var.getChildCount(); i3++) {
            height = Math.min(j1Var.getChildAt(i3).getTop(), height);
        }
        return j1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return org.telegram.messenger.g0.X2(bd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return bd.M0(2131745035, null);
    }

    private int getTotalMyStars() {
        int i3 = (int) (0 + this.S);
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.U.get(i10)).my) {
                i3 = (int) (i3 + ((TL_phone.groupCallDonor) this.U.get(i10)).stars);
            }
        }
        return i3;
    }

    public final void b() {
        this.S = 0L;
        h(getDefaultPeerId());
        w1 w1Var = ((k2) this).f10563j0.J1;
        v1 v1Var = w1Var.f11165a;
        v1Var.c(w1Var);
        v1Var.b();
        j();
    }

    public final void c(int i3) {
        ArrayList arrayList;
        u0 u0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f11160r;
            if (i10 < arrayList.size()) {
                if (((u0) arrayList.get(i10)).f11069a == i3) {
                    u0Var = (u0) arrayList.get(i10);
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                u0Var = null;
                break;
            }
        }
        if (u0Var != null) {
            if (u0Var.f11069a < 0 && u0Var.f11072e) {
                long j10 = u0Var.f11074g;
                if (j10 > 0) {
                    this.R -= j10;
                    j();
                }
            }
            int i11 = 0;
            while (true) {
                arrayList2 = this.f11161s;
                if (i11 >= arrayList2.size()) {
                    break;
                } else if (((v0) arrayList2.get(i11)).f11109f.contains(u0Var)) {
                    ((v0) arrayList2.get(i11)).f11109f.remove(u0Var);
                    if (((v0) arrayList2.get(i11)).f11109f.isEmpty()) {
                        arrayList2.remove(i11);
                        z10 = true;
                    } else {
                        ((v0) arrayList2.get(i11)).c();
                        m();
                    }
                } else {
                    i11++;
                }
            }
            arrayList.remove(i10);
            this.f11153e.O(true);
            if (z10) {
                ConnectionsManager.getInstance(this.O).getCurrentTime();
                Collections.sort(arrayList2, new a3.u(this, 10));
                this.f11159n.O(true);
                t();
                u(true);
            }
        }
    }

    public final p0 d(int i3) {
        p0 p0Var;
        u0 u0Var;
        int i10 = 0;
        while (true) {
            ci.j1 j1Var = this.f11150c;
            if (i10 < j1Var.getChildCount()) {
                View childAt = j1Var.getChildAt(i10);
                if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).L) != null && u0Var.f11069a == i3) {
                    return p0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.H2) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.P;
                if (inputGroupCall != null && inputGroupCall.f27018id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i12 = groupCallMessage.date;
                    int i13 = groupCallMessage.f27012id;
                    boolean z10 = groupCallMessage.from_admin;
                    long o10 = org.telegram.messenger.m5.o(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i12, i13, z10, o10, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.P;
                if (inputGroupCall2 != null && inputGroupCall2.f27018id == longValue) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ci.j1 j1Var = this.f11150c;
        if (view == j1Var) {
            if (j1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.L - j1Var.getTop()) + j1Var.getY();
            canvas.saveLayerAlpha(j1Var.getX(), j1Var.getY(), j1Var.getX() + j1Var.getWidth(), j1Var.getY() + j1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((j1Var.getY() + j1Var.getHeight()) - max, getListViewTop()) * (1.0f - j1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, max, getWidth(), org.telegram.messenger.g0.L(12.0f) + max);
            k4.j jVar = this.J;
            jVar.w(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (j1Var.getY() + j1Var.getHeight()) - org.telegram.messenger.g0.L(12.0f), getWidth(), j1Var.getHeight() + j1Var.getBottom());
            jVar.w(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final int e(long j10) {
        return ((Integer) Map.EL.getOrDefault(this.f11162w, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.N) {
            long j10 = this.N;
            int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i10 = this.O;
            if (i3 >= 0) {
                if (j10 == h10.i(i10).e()) {
                    return true;
                }
                return false;
            }
            g1 g1Var = this.Q;
            if (g1Var != null && (inputGroupCall = this.P) != null && inputGroupCall.f27018id == g1Var.g() && (groupCall = this.Q.f10304w) != null && groupCall.creator) {
                return true;
            }
            return org.telegram.messenger.t3.w(14, hp.s1(i10).M0(Long.valueOf(-this.N)));
        }
        return false;
    }

    public final boolean g() {
        return this.f11157g0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        ci.j1 j1Var = this.f11150c;
        int height = j1Var.getHeight();
        for (int i3 = 0; i3 < j1Var.getChildCount(); i3++) {
            height = Math.min(j1Var.getChildAt(i3).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f11160r.size();
    }

    public long getStarsCount() {
        return this.R + this.S;
    }

    public int getUnreadMessagesCount() {
        long j10;
        int i3 = 0;
        if (this.G < 0) {
            return 0;
        }
        g1 g1Var = this.Q;
        if (g1Var == null) {
            j10 = 0;
        } else {
            j10 = g1Var.j();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11160r;
            if (i3 < arrayList.size()) {
                u0 u0Var = (u0) arrayList.get(i3);
                int i11 = u0Var.f11069a;
                if (i11 >= 0 && i11 > this.G && (u0Var.f11070b || !u0Var.f11072e || u0Var.f11074g >= j10)) {
                    i10++;
                }
                i3++;
            } else {
                return i10;
            }
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i3, int i10, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.f11154e0.run();
        ArrayList arrayList = new ArrayList();
        if (this.U != null) {
            for (int i3 = 0; i3 < this.U.size(); i3++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i3);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e10 = h10.i(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e10 = org.telegram.messenger.m5.o(defaultSendAs);
        }
        k0 k0Var = new k0(0);
        int i10 = this.O;
        tc tcVar = new tc(getContext(), i10, this.N, null, null, arrayList, !z10, true, e10, k0Var);
        k2 k2Var = (k2) this;
        tcVar.H1 = k2Var;
        tcVar.J1 = new a1.c(k2Var, 24);
        tcVar.show();
    }

    public final void l(int i3, int i10, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        long j12;
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        v0 v0Var;
        boolean z12;
        v0 v0Var2;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f11160r;
            if (i12 < arrayList.size()) {
                if (((u0) arrayList.get(i12)).f11069a != i10) {
                    i12++;
                } else {
                    return;
                }
            } else {
                int i13 = this.O;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                ?? obj = new Object();
                obj.d = i3;
                obj.f11070b = z10;
                obj.f11071c = j10;
                obj.f11073f = tL_textWithEntities;
                obj.f11074g = j11;
                obj.f11069a = i10;
                obj.f11072e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = u.b(i13, (int) obj.f11074g, 0);
                long j13 = 0;
                int i14 = (obj.f11074g > 0L ? 1 : (obj.f11074g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f11161s;
                boolean z13 = true;
                if (i14 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            j12 = j13;
                            if (((v0) arrayList2.get(i15)).f11106b == j10) {
                                v0Var = (v0) arrayList2.get(i15);
                                break;
                            } else {
                                i15++;
                                j13 = j12;
                            }
                        } else {
                            j12 = j13;
                            v0Var = null;
                            break;
                        }
                    }
                    if (v0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f11109f = arrayList3;
                        obj2.f11105a = i13;
                        obj2.f11106b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        v0Var2 = obj2;
                    } else {
                        v0Var.f11109f.add(obj);
                        this.f11155f.g1();
                        z12 = false;
                        v0Var2 = v0Var;
                    }
                    v0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a3.u(this, 10));
                    if (!z11) {
                        this.f11159n.O(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j12 = 0;
                }
                if (!z11 && obj.f11072e) {
                    long j14 = obj.f11074g;
                    if (j14 > j12) {
                        this.R += j14;
                        j();
                    }
                }
                if (obj.f11069a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f11069a < ((u0) arrayList.get(size)).f11069a) {
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
                    this.f11153e.O(true);
                }
                if (i11 <= 0 && !z11 && (!this.f11150c.canScrollVertically(1) || obj.f11069a < 0)) {
                    this.d.h1(0, org.telegram.messenger.g0.L(100.0f));
                    int i16 = obj.f11069a;
                    if (i16 > 0) {
                        this.G = i16;
                    }
                }
                invalidate();
                k2 k2Var = (k2) this;
                a aVar = k2Var.f10563j0.H1;
                if (aVar != null) {
                    aVar.setCount(k2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && obj.f11074g > j12) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.U.size()) {
                            if (org.telegram.messenger.m5.o(((TL_phone.groupCallDonor) this.U.get(i17)).peer_id) == obj.f11071c) {
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
                        if (h10.i(i13).e() != obj.f11071c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = hp.s1(i13).z1(obj.f11071c);
                        groupcalldonor.stars = j12;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((v0) arrayList2.get(i18)).f11106b == obj.f11071c) {
                                ((v0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((v0) arrayList2.get(i18)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = obj.f11074g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, obj.f11071c);
                }
                t();
                if (z11) {
                    c0 c0Var = this.f11158h0;
                    org.telegram.messenger.g0.r(c0Var);
                    org.telegram.messenger.g0.i3(c0Var, 100L);
                }
                g1 g1Var = this.Q;
                if (g1Var != null) {
                    g1Var.V = arrayList;
                    g1Var.W = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i3;
        int i10;
        a0 a0Var = this.F;
        if (a0Var != null) {
            org.telegram.messenger.g0.r(a0Var);
            this.F = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.O).getCurrentTime();
        ArrayList arrayList = this.f11161s;
        int size = arrayList.size();
        int i11 = 0;
        long j10 = Long.MAX_VALUE;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            v0 v0Var = (v0) obj;
            ArrayList arrayList2 = v0Var.f11109f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                u0 u0Var = (u0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (u0Var.f11074g > 0) {
                    i12 = Math.min(i12, u0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, u.b(v0Var.f11105a, (int) u0Var.f11074g, 0) + u0Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            j10 = Math.min(j10, Math.max(0, i13 - i3) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        a0 a0Var2 = new a0(this, 1);
        this.F = a0Var2;
        org.telegram.messenger.g0.i3(a0Var2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i3;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.O;
        final int j12 = h10.i(i10).j();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.f21385b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = hp.s1(i10).j1(j10);
        ConnectionsManager.getInstance(h10.f22829t0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                w0 w0Var = w0.this;
                int i12 = j12;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z02 = hp.z0(updates, TL_update.TL_updateMessageID.class);
                    int size = z02.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = z02.get(i13);
                        i13++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i14 = tL_updateMessageID.f27259id;
                            ArrayList arrayList = w0Var.f11160r;
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    u0 u0Var = (u0) obj2;
                                    if (u0Var.f11069a == i12) {
                                        u0Var.f11069a = i14;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    hp.s1(w0Var.O).O3(updates, false);
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new ci.p9(w0Var, i12, tL_error, j11, j10, tL_textWithEntities));
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
                groupcalldonor.stars += j11;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = hp.s1(i10).z1(j10);
                groupcalldonor2.stars = j11;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime();
        if (j10 != this.N && !f()) {
            i3 = j12;
            z10 = false;
        } else {
            i3 = j12;
            z10 = true;
        }
        l(currentTime, i3, z10, j10, tL_textWithEntities, j11, false);
        int i13 = i3;
        q(false, true);
        return i13;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        return n(getDefaultPeerId(), tL_textWithEntities, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.P != null) {
            c0 c0Var = this.W;
            org.telegram.messenger.g0.r(c0Var);
            org.telegram.messenger.g0.h3(c0Var);
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
        ac acVar = this.f11147a0;
        c0 c0Var = this.f11154e0;
        if (acVar == null || !acVar.f31794l) {
            b bVar = new b();
            ub ubVar = new ub(getContext(), bVar);
            this.f11149b0 = ubVar;
            ubVar.c(2131624226, new String[0]);
            this.f11149b0.f38714b.setText(getStarsToastTitle());
            yb ybVar = new yb(getContext(), bVar, true, false);
            this.f11151c0 = ybVar;
            ybVar.e(bd.M0(2131745033, null));
            this.f11151c0.f40672b = new a0((k2) this, 0);
            tb tbVar = new tb(getContext(), bVar);
            this.f11152d0 = tbVar;
            tbVar.f38376b = 5000L;
            tbVar.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.uj, bVar));
            this.f11151c0.addView(this.f11152d0, mf.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f11151c0.f40674e.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(8.0f));
            this.f11149b0.setButton(this.f11151c0);
            ac f10 = ac.f(this.f11148b, this.f11149b0, -1);
            this.f11147a0 = f10;
            f10.f31800r = false;
            f10.k(true);
            this.f11147a0.v = c0Var;
        }
        this.S++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.f11149b0.f38714b.setText(getStarsToastTitle());
        this.f11149b0.f38715c.setText(getStarsToastSubtitle());
        this.f11152d0.f38376b = 5000L;
        org.telegram.messenger.g0.r(c0Var);
        org.telegram.messenger.g0.i3(c0Var, 5000L);
        long j10 = this.S;
        w1 w1Var = ((k2) this).f10563j0.J1;
        v1 v1Var = w1Var.f11165a;
        v1Var.c(w1Var);
        if (v1Var.f11117s) {
            v1Var.f11117s = false;
            v1Var.a(1.0f, null);
        }
        ArrayList arrayList = v1Var.f11113e;
        while (arrayList.size() > 4) {
            ((ch0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = v1Var.f11114f;
        ch0 ch0Var = new ch0(iArr2[Utilities.f21386c.nextInt(iArr2.length)], org.telegram.messenger.g0.L(70.0f), org.telegram.messenger.g0.L(70.0f));
        ch0Var.R(v1Var);
        ch0Var.J(true);
        ch0Var.K(0);
        ch0Var.start();
        arrayList.add(ch0Var);
        v1Var.invalidate();
        org.telegram.ui.Components.g6 g6Var = v1Var.f11112c;
        g6Var.a();
        g6Var.t(k2.p1.l(j10, ',', new StringBuilder("+")), true, true);
        t1 t1Var = v1Var.d;
        org.telegram.messenger.g0.r(t1Var);
        org.telegram.messenger.g0.i3(t1Var, 1500L);
        w1Var.getLocationInWindow(w1Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - w1Var.E;
        if (j11 < 100) {
            w1Var.F += 0.5f;
        } else {
            w1Var.F = Utilities.i(1.0f - (((float) (j11 - 100)) / 200.0f), 1.0f, 0.0f) * w1Var.F;
            LaunchActivity.b0((w1Var.getWidth() / 2.0f) + iArr[0], (w1Var.getHeight() / 2.0f) + iArr[1], Utilities.i(w1Var.F, 0.9f, 0.3f));
            w1Var.F = 0.0f;
            w1Var.E = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        long j11;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.P;
        long j12 = 0;
        if (inputGroupCall2 == null) {
            j11 = 0;
        } else {
            j11 = inputGroupCall2.f27018id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f27018id;
        }
        if (j11 != j12) {
            this.f11160r.clear();
            z10 = true;
            this.f11153e.O(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.P;
        int i3 = hs.H2;
        int i10 = this.O;
        if (inputGroupCall3 != null) {
            hs.f(i10).n(this, i3);
        }
        this.N = j10;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            hs.f(i10).c(this, i3);
        }
        if (z10) {
            this.f11154e0.run();
            c0 c0Var = this.W;
            if (inputGroupCall == null) {
                org.telegram.messenger.g0.r(c0Var);
                return z10;
            }
            c0Var.run();
        }
        return z10;
    }

    public final float s() {
        ci.j1 j1Var = this.f11150c;
        return Math.max(Math.max(0.0f, this.L - j1Var.getTop()), getListViewContentTop()) + j1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.H = z10;
    }

    public void setLivePlayer(g1 g1Var) {
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
        this.Q = g1Var;
        if (z10 && g1Var != null && (arrayList = g1Var.V) != null && (arrayList2 = g1Var.W) != null && arrayList != (arrayList3 = this.f11160r) && arrayList2 != (arrayList4 = this.f11161s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(g1Var.V);
            arrayList4.addAll(g1Var.W);
            this.f11153e.O(true);
            ConnectionsManager.getInstance(this.O).getCurrentTime();
            Collections.sort(arrayList4, new a3.u(this, 10));
            this.f11159n.O(true);
            u(false);
        }
    }

    public final void t() {
        t0 t0Var;
        v0 v0Var;
        p0 p0Var;
        u0 u0Var;
        HashMap hashMap = this.f11162w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a3.u(11));
        int size = arrayList.size();
        int i3 = 0;
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
            ci.j1 j1Var = this.f11150c;
            if (i14 >= j1Var.getChildCount()) {
                break;
            }
            View childAt = j1Var.getChildAt(i14);
            if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).L) != null) {
                int e10 = e(u0Var.f11071c);
                u0 u0Var2 = p0Var.L;
                if (e10 != u0Var2.h) {
                    u0Var2.h = e10;
                    p0Var.set(u0Var2);
                }
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList3 = this.f11160r;
            if (i15 >= arrayList3.size()) {
                break;
            }
            u0 u0Var3 = (u0) arrayList3.get(i15);
            int e11 = e(u0Var3.f11071c);
            if (e11 != u0Var3.h) {
                u0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            u51 u51Var = this.f11155f;
            if (i16 >= u51Var.getChildCount()) {
                break;
            }
            View childAt2 = u51Var.getChildAt(i16);
            if ((childAt2 instanceof t0) && (v0Var = (t0Var = (t0) childAt2).f11036f) != null) {
                int e12 = e(v0Var.f11106b);
                v0 v0Var2 = t0Var.f11036f;
                if (e12 != v0Var2.f11108e) {
                    v0Var2.f11108e = e12;
                    t0Var.set(v0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.f11161s;
            if (i3 < arrayList4.size()) {
                v0 v0Var3 = (v0) arrayList4.get(i3);
                int e13 = e(v0Var3.f11106b);
                if (e13 != v0Var3.f11108e) {
                    v0Var3.f11108e = e13;
                }
                i3++;
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
        ArrayList arrayList = this.f11161s;
        if (z10 && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        float f10 = 1.0f;
        ci.j1 j1Var = this.f11150c;
        u51 u51Var = this.f11155f;
        if (z10) {
            ViewPropertyAnimator animate = j1Var.animate();
            if (this.K) {
                L3 = 0.0f;
            } else {
                L3 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            xq xqVar = xq.h;
            translationY.setInterpolator(xqVar).setUpdateListener(new bh.f(this, 13)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = u51Var.animate();
            if (this.K) {
                L4 = 0.0f;
            } else {
                L4 = org.telegram.messenger.g0.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.K) {
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
        j1Var.setTranslationY(L);
        if (this.K) {
            L2 = 0.0f;
        } else {
            L2 = org.telegram.messenger.g0.L(35.0f);
        }
        u51Var.setTranslationY(L2);
        if (!this.K) {
            f10 = 0.0f;
        }
        u51Var.setAlpha(f10);
        invalidate();
    }
}
