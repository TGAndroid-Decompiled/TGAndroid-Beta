package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.LaunchActivity;
public abstract class k96 extends FrameLayout implements jm7 {
    public boolean E;
    public kg5 F;
    public int G;
    public boolean H;
    public long I;
    public final in3 J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public s96 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final w86 W;
    public final View a;
    public u31 a0;
    public final FrameLayout b;
    public o31 b0;
    public final fv c;
    public s31 c0;
    public final u46 d;
    public n31 d0;
    public final vb e;
    public final w86 e0;
    public final smb f;
    public ValueAnimator f0;
    public boolean g0;
    public final u46 h;
    public final w86 h0;
    public final l7c n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public k96(Context context, oab oabVar, dab dabVar, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        this.H = true;
        this.J = new in3((byte) 7);
        int i = z8c.t0;
        this.O = i;
        this.U = new ArrayList();
        final n38 n38Var = (n38) this;
        this.W = new w86(n38Var, (byte) 1);
        this.e0 = new w86(n38Var, (byte) 2);
        this.g0 = false;
        this.h0 = new w86(n38Var, (byte) 3);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        fv fvVar = new fv((byte) 24, context, n38Var);
        this.c = fvVar;
        fvVar.setWillNotDraw(false);
        u46 u46Var = new u46(1, true);
        this.d = u46Var;
        fvVar.setLayoutManager(u46Var);
        vb vbVar = new vb(n38Var, fvVar, context, i, new jac() {
            @Override
            public final void a(Object obj, Object obj2) {
                long m;
                byte b = r2;
                int i2 = 0;
                n38 n38Var2 = n38Var;
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar = (l7c) obj2;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = n38Var2.r;
                        s96 s96Var = n38Var2.Q;
                        if (s96Var == null) {
                            m = 0;
                        } else {
                            m = s96Var.m();
                        }
                        n38Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            i96 i96Var = (i96) arrayList2.get(i2);
                            if (i96Var.b || !i96Var.e || i96Var.g >= m) {
                                int i3 = c96.b;
                                c6c K = c6c.K(c96.class);
                                K.H = i96Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = n38Var2.s;
                        while (i2 < arrayList3.size()) {
                            int i4 = g96.b;
                            c6c K2 = c6c.K(g96.class);
                            K2.H = (j96) arrayList3.get(i2);
                            arrayList.add(K2);
                            i2++;
                        }
                        return;
                }
            }
        }, new r63(), (byte) 2);
        this.e = vbVar;
        fvVar.setAdapter(vbVar);
        vbVar.r = false;
        fvVar.setPadding(gm.L(8.0f), gm.L(7.5f), gm.L(8.0f), gm.L(7.5f));
        fvVar.setClipToPadding(false);
        addView(fvVar, qoe.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        fvVar.setOnItemClickListener(new is(n38Var, dabVar, oabVar, (byte) 2));
        y86 y86Var = new y86(n38Var);
        y86Var.m = false;
        y86Var.C = false;
        d53 d53Var = d53.h;
        y86Var.o(d53Var);
        y86Var.n(280L);
        y86Var.D = (byte) 14;
        fvVar.setItemAnimator(y86Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232065);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(cmb.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new ca5(n38Var, (byte) 21));
        smb smbVar = new smb(context, null, (byte) 8);
        this.f = smbVar;
        smbVar.setWillNotDraw(false);
        u46 u46Var2 = new u46(0, false);
        this.h = u46Var2;
        smbVar.setLayoutManager(u46Var2);
        l7c l7cVar = new l7c(smbVar, context, i, 0, false, new jac() {
            @Override
            public final void a(Object obj, Object obj2) {
                long m;
                byte b = r2;
                int i2 = 0;
                n38 n38Var2 = n38Var;
                ArrayList arrayList = (ArrayList) obj;
                l7c l7cVar2 = (l7c) obj2;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = n38Var2.r;
                        s96 s96Var = n38Var2.Q;
                        if (s96Var == null) {
                            m = 0;
                        } else {
                            m = s96Var.m();
                        }
                        n38Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            i96 i96Var = (i96) arrayList2.get(i2);
                            if (i96Var.b || !i96Var.e || i96Var.g >= m) {
                                int i3 = c96.b;
                                c6c K = c6c.K(c96.class);
                                K.H = i96Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = n38Var2.s;
                        while (i2 < arrayList3.size()) {
                            int i4 = g96.b;
                            c6c K2 = c6c.K(g96.class);
                            K2.H = (j96) arrayList3.get(i2);
                            arrayList.add(K2);
                            i2++;
                        }
                        return;
                }
            }
        }, null);
        this.n = l7cVar;
        smbVar.setAdapter(l7cVar);
        l7cVar.r = false;
        smbVar.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        smbVar.setClipToPadding(false);
        addView(smbVar, qoe.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        smbVar.setOnItemClickListener(new v86(n38Var));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53Var);
        sc3Var.n(350L);
        smbVar.setItemAnimator(sc3Var);
        t(false);
    }

    private long getDefaultPeerId() {
        boolean z;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        s96 s96Var = this.Q;
        if (s96Var != null && s96Var.o()) {
            TLRPC.GroupCall groupCall = this.Q.s;
            if (groupCall == null) {
                z = false;
            } else {
                z = !groupCall.messages_enabled;
            }
            if (z) {
                return this.N;
            }
        }
        if (defaultSendAs == null) {
            return z8c.h(this.O).e();
        }
        return pg3.n(defaultSendAs);
    }

    private int getListViewTop() {
        fv fvVar = this.c;
        int height = fvVar.getHeight();
        for (int i = 0; i < fvVar.getChildCount(); i++) {
            height = Math.min(fvVar.getChildAt(i).getTop(), height);
        }
        return fvVar.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return gm.S2(jb6.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return jb6.M0(2131744714, null);
    }

    private int getTotalMyStars() {
        int i = (int) this.S;
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            if (((TL_phone.groupCallDonor) this.U.get(i2)).my) {
                i = (int) (i + ((TL_phone.groupCallDonor) this.U.get(i2)).stars);
            }
        }
        return i;
    }

    public final void a() {
        this.S = 0L;
        g(getDefaultPeerId());
        xt7 xt7Var = ((n38) this).j0.P1;
        wt7 wt7Var = xt7Var.a;
        wt7Var.c(xt7Var);
        wt7Var.b();
        i();
    }

    public final void b(int i) {
        ArrayList arrayList;
        i96 i96Var;
        ArrayList arrayList2;
        boolean z = false;
        int i2 = 0;
        while (true) {
            arrayList = this.r;
            if (i2 < arrayList.size()) {
                if (((i96) arrayList.get(i2)).a == i) {
                    i96Var = (i96) arrayList.get(i2);
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                i96Var = null;
                break;
            }
        }
        if (i96Var != null) {
            if (i96Var.a < 0 && i96Var.e) {
                long j = i96Var.g;
                if (j > 0) {
                    this.R -= j;
                    i();
                }
            }
            int i3 = 0;
            while (true) {
                arrayList2 = this.s;
                if (i3 >= arrayList2.size()) {
                    break;
                } else if (((j96) arrayList2.get(i3)).f.contains(i96Var)) {
                    ((j96) arrayList2.get(i3)).f.remove(i96Var);
                    if (((j96) arrayList2.get(i3)).f.isEmpty()) {
                        arrayList2.remove(i3);
                        z = true;
                    } else {
                        ((j96) arrayList2.get(i3)).c();
                        l();
                    }
                } else {
                    i3++;
                }
            }
            arrayList.remove(i2);
            this.e.O(true);
            if (z) {
                ConnectionsManager.getInstance(this.O).getCurrentTime();
                Collections.sort(arrayList2, new x03(this, (byte) 25));
                this.n.O(true);
                s();
                t(true);
            }
        }
    }

    public final d96 c(int i) {
        d96 d96Var;
        i96 i96Var;
        int i2 = 0;
        while (true) {
            fv fvVar = this.c;
            if (i2 < fvVar.getChildCount()) {
                View childAt = fvVar.getChildAt(i2);
                if ((childAt instanceof d96) && (i96Var = (d96Var = (d96) childAt).L) != null && i96Var.a == i) {
                    return d96Var;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final int d(long j) {
        return ((Integer) Map.EL.getOrDefault(this.w, Long.valueOf(j), 0)).intValue();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.H2) {
            int i3 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.P;
                if (inputGroupCall != null && inputGroupCall.id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i4 = groupCallMessage.date;
                    int i5 = groupCallMessage.id;
                    boolean z = groupCallMessage.from_admin;
                    long n = pg3.n(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    k(i4, i5, z, n, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.P;
                if (inputGroupCall2 != null && inputGroupCall2.id == longValue) {
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Integer num = arrayList.get(i3);
                        i3++;
                        b(num.intValue());
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
        if (motionEvent.getAction() == 0 && motionEvent.getY() < r()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        fv fvVar = this.c;
        if (view == fvVar) {
            if (fvVar.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.L - fvVar.getTop()) + fvVar.getY();
            canvas.saveLayerAlpha(fvVar.getX(), fvVar.getY(), fvVar.getX() + fvVar.getWidth(), fvVar.getY() + fvVar.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((fvVar.getY() + fvVar.getHeight()) - max, getListViewTop()) * (1.0f - fvVar.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            RectF rectF = gm.P;
            rectF.set(0.0f, max, getWidth(), gm.L(12.0f) + max);
            in3 in3Var = this.J;
            in3Var.r(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (fvVar.getY() + fvVar.getHeight()) - gm.L(12.0f), getWidth(), fvVar.getHeight() + fvVar.getBottom());
            in3Var.r(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    public final boolean e() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.N) {
            long j = this.N;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            int i2 = this.O;
            if (i >= 0) {
                if (j == z8c.h(i2).e()) {
                    return true;
                }
                return false;
            }
            s96 s96Var = this.Q;
            if (s96Var != null && (inputGroupCall = this.P) != null && inputGroupCall.id == s96Var.j() && (groupCall = this.Q.s) != null && groupCall.creator) {
                return true;
            }
            return sd2.w(14, oc7.r1(i2).L0(Long.valueOf(-this.N)));
        }
        return false;
    }

    public final Integer f(Long l) {
        this.e0.run();
        this.S = l.longValue();
        u31 I = new c41(this.b, new r63()).I(2131624221, getStarsToastTitle(), getStarsToastSubtitle());
        boolean z = false;
        I.s = false;
        I.k(true);
        long j = 0;
        this.S = 0L;
        this.T = true;
        int n = n(new TLRPC.TL_textWithEntities(), l.longValue());
        s96 s96Var = this.Q;
        if (s96Var != null) {
            j = s96Var.m();
        }
        if (getDefaultPeerId() == this.N && e()) {
            z = true;
        }
        if (l.longValue() < j && !z) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(n);
    }

    public abstract void g(long j);

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        fv fvVar = this.c;
        int height = fvVar.getHeight();
        for (int i = 0; i < fvVar.getChildCount(); i++) {
            height = Math.min(fvVar.getChildAt(i).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.r.size();
    }

    public long getStarsCount() {
        return this.R + this.S;
    }

    public int getUnreadMessagesCount() {
        long m;
        int i = 0;
        if (this.G < 0) {
            return 0;
        }
        s96 s96Var = this.Q;
        if (s96Var == null) {
            m = 0;
        } else {
            m = s96Var.m();
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i < arrayList.size()) {
                i96 i96Var = (i96) arrayList.get(i);
                int i3 = i96Var.a;
                if (i3 >= 0 && i3 > this.G && (i96Var.b || !i96Var.e || i96Var.g >= m)) {
                    i2++;
                }
                i++;
            } else {
                return i2;
            }
        }
    }

    public abstract void h(int i, int i2, long j);

    public abstract void i();

    public final void j(boolean z) {
        this.e0.run();
        ArrayList arrayList = new ArrayList();
        if (this.U != null) {
            for (int i = 0; i < this.U.size(); i++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long e = z8c.h(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e = pg3.n(defaultSendAs);
        }
        q63 q63Var = new q63((byte) 1);
        int i2 = this.O;
        eya eyaVar = new eya(getContext(), i2, this.N, null, null, arrayList, !z, true, e, q63Var);
        n38 n38Var = (n38) this;
        eyaVar.J1 = n38Var;
        eyaVar.L1 = new v86(n38Var);
        eyaVar.show();
    }

    public final void k(int i, int i2, boolean z, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z2) {
        long j3;
        int i3;
        TL_phone.groupCallDonor groupcalldonor;
        j96 j96Var;
        boolean z3;
        j96 j96Var2;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i4 < arrayList.size()) {
                if (((i96) arrayList.get(i4)).a != i2) {
                    i4++;
                } else {
                    return;
                }
            } else {
                int i5 = this.O;
                int currentTime = ConnectionsManager.getInstance(i5).getCurrentTime();
                ?? obj = new Object();
                obj.d = i;
                obj.b = z;
                obj.c = j;
                obj.f = tL_textWithEntities;
                obj.g = j2;
                obj.a = i2;
                obj.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b = bg5.b(i5, (int) obj.g, 0);
                long j4 = 0;
                int i6 = (obj.g > 0L ? 1 : (obj.g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.s;
                boolean z4 = true;
                if (i6 > 0 && b > 0 && currentTime - obj.d <= b) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList2.size()) {
                            j3 = j4;
                            if (((j96) arrayList2.get(i7)).b == j) {
                                j96Var = (j96) arrayList2.get(i7);
                                break;
                            } else {
                                i7++;
                                j4 = j3;
                            }
                        } else {
                            j3 = j4;
                            j96Var = null;
                            break;
                        }
                    }
                    if (j96Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f = arrayList3;
                        obj2.a = i5;
                        obj2.b = j;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z3 = true;
                        j96Var2 = obj2;
                    } else {
                        j96Var.f.add(obj);
                        this.f.h1();
                        z3 = false;
                        j96Var2 = j96Var;
                    }
                    j96Var2.c();
                    t(true);
                    l();
                    Collections.sort(arrayList2, new x03(this, (byte) 25));
                    if (!z2) {
                        this.n.O(true);
                    }
                    if (z3) {
                        this.h.m0(0);
                    }
                } else {
                    j3 = 0;
                }
                if (!z2 && obj.e) {
                    long j5 = obj.g;
                    if (j5 > j3) {
                        this.R += j5;
                        i();
                    }
                }
                if (obj.a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.a < ((i96) arrayList.get(size)).a) {
                            i3 = size + 1;
                            break;
                        }
                    }
                }
                i3 = 0;
                arrayList.add(i3, obj);
                if (!z2) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.e.O(true);
                }
                if (i3 <= 0 && !z2 && (!this.c.canScrollVertically(1) || obj.a < 0)) {
                    this.d.g1(0, gm.L(100.0f));
                    int i8 = obj.a;
                    if (i8 > 0) {
                        this.G = i8;
                    }
                }
                invalidate();
                n38 n38Var = (n38) this;
                vn2 vn2Var = n38Var.j0.N1;
                if (vn2Var != null) {
                    vn2Var.setCount(n38Var.getUnreadMessagesCount());
                }
                if (!z2 && i2 > 0 && obj.g > j3) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < this.U.size()) {
                            if (pg3.n(((TL_phone.groupCallDonor) this.U.get(i9)).peer_id) == obj.c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i9);
                                break;
                            }
                            i9++;
                        } else {
                            groupcalldonor = null;
                            break;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        if (z8c.h(i5).e() != obj.c) {
                            z4 = false;
                        }
                        groupcalldonor.my = z4;
                        groupcalldonor.peer_id = oc7.r1(i5).x1(obj.c);
                        groupcalldonor.stars = j3;
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (((j96) arrayList2.get(i10)).b == obj.c) {
                                ((j96) arrayList2.get(i10)).b();
                                groupcalldonor.stars += ((j96) arrayList2.get(i10)).d;
                            }
                        }
                        this.U.add(groupcalldonor);
                    }
                    long j6 = groupcalldonor.stars;
                    long j7 = obj.g;
                    long j8 = j6 + j7;
                    groupcalldonor.stars = j8;
                    h((int) j8, (int) j7, obj.c);
                }
                s();
                if (z2) {
                    w86 w86Var = this.h0;
                    gm.r(w86Var);
                    gm.d3(w86Var, 100L);
                }
                s96 s96Var = this.Q;
                if (s96Var != null) {
                    s96Var.L = arrayList;
                    s96Var.M = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void l() {
        int i;
        int i2;
        kg5 kg5Var = this.F;
        if (kg5Var != null) {
            gm.r(kg5Var);
            this.F = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.O).getCurrentTime();
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i3 = 0;
        long j = Long.MAX_VALUE;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j96 j96Var = (j96) obj;
            ArrayList arrayList2 = j96Var.f;
            int size2 = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                i96 i96Var = (i96) obj2;
                long j2 = i96Var.g;
                if (j2 > 0) {
                    i2 = currentTime;
                    i4 = Math.max(i4, bg5.b(j96Var.a, (int) j2, 0) + i96Var.d);
                } else {
                    i2 = currentTime;
                }
                currentTime = i2;
            }
            j = Math.min(j, Math.max(0, i4 - i) * 1000);
            currentTime = currentTime;
        }
        if (j >= Long.MAX_VALUE) {
            return;
        }
        kg5 kg5Var2 = new kg5(this, (byte) 21);
        this.F = kg5Var2;
        gm.d3(kg5Var2, j);
    }

    public final int m(final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j2) {
        int i;
        boolean z;
        TL_phone.groupCallDonor groupcalldonor;
        int i2 = this.O;
        final int i3 = z8c.h(i2).i();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.P;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i4 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i4 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j2;
        }
        sendgroupcallmessage.random_id = Utilities.b.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = oc7.r1(i2).i1(j);
        ConnectionsManager.getInstance(z8c.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z2 = tLObject instanceof TLRPC.Updates;
                k96 k96Var = k96.this;
                int i5 = i3;
                if (z2) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList x0 = oc7.x0(updates, TL_update.TL_updateMessageID.class);
                    int size = x0.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = x0.get(i6);
                        i6++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i7 = tL_updateMessageID.id;
                            ArrayList arrayList = k96Var.r;
                            int size2 = arrayList.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 < size2) {
                                    Object obj2 = arrayList.get(i8);
                                    i8++;
                                    i96 i96Var = (i96) obj2;
                                    if (i96Var.a == i5) {
                                        i96Var.a = i7;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    oc7.r1(k96Var.O).T3(updates, false);
                } else if (tL_error != null) {
                    gm.c3(new dd2(k96Var, i5, tL_error, j2, j, tL_textWithEntities));
                }
            }
        });
        if (this.U != null && i4 > 0) {
            int i5 = 0;
            while (true) {
                if (i5 < this.U.size()) {
                    if (((TL_phone.groupCallDonor) this.U.get(i5)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.U.get(i5);
                        break;
                    }
                    i5++;
                } else {
                    groupcalldonor = null;
                    break;
                }
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j2;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = oc7.r1(i2).x1(j);
                groupcalldonor2.stars = j2;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
        if (j != this.N && !e()) {
            i = i3;
            z = false;
        } else {
            i = i3;
            z = true;
        }
        k(currentTime, i, z, j, tL_textWithEntities, j2, false);
        int i6 = i;
        p(false, true);
        return i6;
    }

    public final int n(TLRPC.TL_textWithEntities tL_textWithEntities, long j) {
        return m(getDefaultPeerId(), tL_textWithEntities, j);
    }

    public final void o() {
        int[] iArr;
        u31 u31Var = this.a0;
        w86 w86Var = this.e0;
        if (u31Var == null || !u31Var.m) {
            r63 r63Var = new r63();
            o31 o31Var = new o31(getContext(), r63Var);
            this.b0 = o31Var;
            o31Var.a.f(2131624221, 32, 32, null);
            this.b0.b.setText(getStarsToastTitle());
            s31 s31Var = new s31(r63Var, getContext(), true, false);
            this.c0 = s31Var;
            s31Var.e(jb6.M0(2131744712, null));
            this.c0.b = new w86((n38) this, (byte) 0);
            n31 n31Var = new n31(getContext(), r63Var);
            this.d0 = n31Var;
            n31Var.b = 5000L;
            n31Var.setColor(cmb.v0(cmb.wj, r63Var));
            this.c0.addView(this.d0, qoe.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(gm.L(12.0f), gm.L(8.0f), gm.L(30.0f), gm.L(8.0f));
            this.b0.setButton(this.c0);
            u31 f = u31.f(this.b, this.b0, -1);
            this.a0 = f;
            f.s = false;
            f.k(true);
            this.a0.w = w86Var;
        }
        this.S++;
        g(getDefaultPeerId());
        h(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.b0.b.setText(getStarsToastTitle());
        this.b0.c.setText(getStarsToastSubtitle());
        this.d0.b = 5000L;
        gm.r(w86Var);
        gm.d3(w86Var, 5000L);
        long j = this.S;
        xt7 xt7Var = ((n38) this).j0.P1;
        wt7 wt7Var = xt7Var.a;
        wt7Var.c(xt7Var);
        if (wt7Var.s) {
            wt7Var.s = false;
            wt7Var.a(1.0f, null);
        }
        ArrayList arrayList = wt7Var.e;
        while (arrayList.size() > 4) {
            ((p09) arrayList.remove(0)).x(true);
        }
        int[] iArr2 = wt7Var.f;
        p09 p09Var = new p09(iArr2[Utilities.c.nextInt(iArr2.length)], gm.L(70.0f), gm.L(70.0f));
        p09Var.M(wt7Var);
        p09Var.E(true);
        p09Var.F(0);
        p09Var.start();
        arrayList.add(p09Var);
        wt7Var.invalidate();
        ho hoVar = wt7Var.c;
        hoVar.a();
        hoVar.t("+".concat(jb6.E(j, ',')), true, true);
        ut7 ut7Var = wt7Var.d;
        gm.r(ut7Var);
        gm.d3(ut7Var, 1500L);
        xt7Var.getLocationInWindow(xt7Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - xt7Var.E;
        int i = (j2 > 100L ? 1 : (j2 == 100L ? 0 : -1));
        float f2 = xt7Var.F;
        if (i < 0) {
            xt7Var.F = f2 + 0.5f;
        } else {
            xt7Var.F = Utilities.i(1.0f - (((float) (j2 - 100)) / 200.0f), 1.0f, 0.0f) * f2;
            LaunchActivity.a0((xt7Var.getWidth() / 2.0f) + iArr[0], (xt7Var.getHeight() / 2.0f) + iArr[1], Utilities.i(xt7Var.F, 0.9f, 0.3f));
            xt7Var.F = 0.0f;
            xt7Var.E = currentTimeMillis;
        }
        i();
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.P != null) {
            w86 w86Var = this.W;
            gm.r(w86Var);
            gm.c3(w86Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P != null) {
            gm.r(this.W);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < r()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() < r()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public abstract void p(boolean z, boolean z2);

    public final boolean q(long j, TLRPC.InputGroupCall inputGroupCall) {
        long j2;
        boolean z;
        TLRPC.InputGroupCall inputGroupCall2 = this.P;
        long j3 = 0;
        if (inputGroupCall2 == null) {
            j2 = 0;
        } else {
            j2 = inputGroupCall2.id;
        }
        if (inputGroupCall != null) {
            j3 = inputGroupCall.id;
        }
        if (j2 != j3) {
            this.r.clear();
            z = true;
            this.e.O(true);
        } else {
            z = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.P;
        int i = nm7.H2;
        int i2 = this.O;
        if (inputGroupCall3 != null) {
            nm7.f(i2).n(this, i);
        }
        this.N = j;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            nm7.f(i2).b(this, i);
        }
        if (z) {
            this.e0.run();
            w86 w86Var = this.W;
            if (inputGroupCall == null) {
                gm.r(w86Var);
                return z;
            }
            w86Var.run();
        }
        return z;
    }

    public final float r() {
        fv fvVar = this.c;
        return Math.max(Math.max(0.0f, this.L - fvVar.getTop()), getListViewContentTop()) + fvVar.getY();
    }

    public final void s() {
        h96 h96Var;
        j96 j96Var;
        d96 d96Var;
        i96 i96Var;
        HashMap hashMap = this.w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new x03((byte) 26));
        int size = arrayList.size();
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) obj;
            int i5 = (int) groupcalldonor.stars;
            if (i5 != i2) {
                i3++;
                i2 = i5;
            }
            if (i3 > 3) {
                break;
            }
            hashMap.put(Long.valueOf(pg3.n(groupcalldonor.peer_id)), Integer.valueOf(i3));
        }
        int i6 = 0;
        while (true) {
            fv fvVar = this.c;
            if (i6 >= fvVar.getChildCount()) {
                break;
            }
            View childAt = fvVar.getChildAt(i6);
            if ((childAt instanceof d96) && (i96Var = (d96Var = (d96) childAt).L) != null) {
                int d = d(i96Var.c);
                i96 i96Var2 = d96Var.L;
                if (d != i96Var2.h) {
                    i96Var2.h = d;
                    d96Var.set(i96Var2);
                }
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.r;
            if (i7 >= arrayList3.size()) {
                break;
            }
            i96 i96Var3 = (i96) arrayList3.get(i7);
            int d2 = d(i96Var3.c);
            if (d2 != i96Var3.h) {
                i96Var3.h = d2;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            smb smbVar = this.f;
            if (i8 >= smbVar.getChildCount()) {
                break;
            }
            View childAt2 = smbVar.getChildAt(i8);
            if ((childAt2 instanceof h96) && (j96Var = (h96Var = (h96) childAt2).f) != null) {
                int d3 = d(j96Var.b);
                j96 j96Var2 = h96Var.f;
                if (d3 != j96Var2.e) {
                    j96Var2.e = d3;
                    h96Var.set(j96Var2);
                }
            }
            i8++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i < arrayList4.size()) {
                j96 j96Var3 = (j96) arrayList4.get(i);
                int d4 = d(j96Var3.b);
                if (d4 != j96Var3.e) {
                    j96Var3.e = d4;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setAllowTouches(boolean z) {
        this.H = z;
    }

    public void setLivePlayer(s96 s96Var) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.Q == null) {
            z = true;
        } else {
            z = false;
        }
        this.Q = s96Var;
        if (z && s96Var != null && (arrayList = s96Var.L) != null && (arrayList2 = s96Var.M) != null && arrayList != (arrayList3 = this.r) && arrayList2 != (arrayList4 = this.s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(s96Var.L);
            arrayList4.addAll(s96Var.M);
            this.e.O(true);
            ConnectionsManager.getInstance(this.O).getCurrentTime();
            Collections.sort(arrayList4, new x03(this, (byte) 25));
            this.n.O(true);
            t(false);
        }
    }

    public final void t(boolean z) {
        float L;
        float L2;
        float L3;
        float L4;
        ArrayList arrayList = this.s;
        if (z && this.K == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.K = !isEmpty;
        float f = 1.0f;
        smb smbVar = this.f;
        fv fvVar = this.c;
        if (z) {
            ViewPropertyAnimator animate = fvVar.animate();
            if (this.K) {
                L3 = 0.0f;
            } else {
                L3 = gm.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            d53 d53Var = d53.h;
            translationY.setInterpolator(d53Var).setUpdateListener(new fh4(this, (byte) 20)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = smbVar.animate();
            if (this.K) {
                L4 = 0.0f;
            } else {
                L4 = gm.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.K) {
                f = 0.0f;
            }
            translationY2.alpha(f).setInterpolator(d53Var).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            L = 0.0f;
        } else {
            L = gm.L(35.0f);
        }
        fvVar.setTranslationY(L);
        if (this.K) {
            L2 = 0.0f;
        } else {
            L2 = gm.L(35.0f);
        }
        smbVar.setTranslationY(L2);
        if (!this.K) {
            f = 0.0f;
        }
        smbVar.setAlpha(f);
        invalidate();
    }
}
