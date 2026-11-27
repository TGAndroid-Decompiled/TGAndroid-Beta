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
public abstract class o96 extends FrameLayout implements fn7 {
    public boolean E;
    public ea5 F;
    public int G;
    public boolean H;
    public long I;
    public final pm3 J;
    public boolean K;
    public float L;
    public float M;
    public long N;
    public final int O;
    public TLRPC.InputGroupCall P;
    public w96 Q;
    public long R;
    public long S;
    public boolean T;
    public ArrayList U;
    public boolean V;
    public final a96 W;
    public final View a;
    public v21 a0;
    public final FrameLayout b;
    public p21 b0;
    public final gu c;
    public t21 c0;
    public final x46 d;
    public o21 d0;
    public final wb e;
    public final a96 e0;
    public final qob f;
    public ValueAnimator f0;
    public boolean g0;
    public final x46 h;
    public final a96 h0;
    public final l9c n;
    public final ArrayList r;
    public final ArrayList s;
    public final HashMap w;
    public long x;
    public int y;

    public o96(Context context, lcb lcbVar, acb acbVar, View view, FrameLayout frameLayout) {
        super(context);
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new HashMap();
        this.G = -1;
        this.H = true;
        this.J = new pm3((byte) 7);
        int i = yac.t0;
        this.O = i;
        this.U = new ArrayList();
        final c58 c58Var = (c58) this;
        this.W = new a96(c58Var, (byte) 1);
        this.e0 = new a96(c58Var, (byte) 2);
        this.g0 = false;
        this.h0 = new a96(c58Var, (byte) 3);
        this.a = view;
        this.b = frameLayout;
        view.setAlpha(0.5f);
        gu guVar = new gu((byte) 24, context, c58Var);
        this.c = guVar;
        guVar.setWillNotDraw(false);
        x46 x46Var = new x46(1, true);
        this.d = x46Var;
        guVar.setLayoutManager(x46Var);
        wb wbVar = new wb(c58Var, guVar, context, i, new icc() {
            @Override
            public final void a(Object obj, Object obj2) {
                long m;
                byte b = r2;
                int i2 = 0;
                c58 c58Var2 = c58Var;
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar = (l9c) obj2;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = c58Var2.r;
                        w96 w96Var = c58Var2.Q;
                        if (w96Var == null) {
                            m = 0;
                        } else {
                            m = w96Var.m();
                        }
                        c58Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            m96 m96Var = (m96) arrayList2.get(i2);
                            if (m96Var.b || !m96Var.e || m96Var.g >= m) {
                                int i3 = g96.b;
                                b8c K = b8c.K(g96.class);
                                K.H = m96Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = c58Var2.s;
                        while (i2 < arrayList3.size()) {
                            int i4 = k96.b;
                            b8c K2 = b8c.K(k96.class);
                            K2.H = (n96) arrayList3.get(i2);
                            arrayList.add(K2);
                            i2++;
                        }
                        return;
                }
            }
        }, new x53(), (byte) 2);
        this.e = wbVar;
        guVar.setAdapter(wbVar);
        wbVar.r = false;
        guVar.setPadding(hl.L(8.0f), hl.L(7.5f), hl.L(8.0f), hl.L(7.5f));
        guVar.setClipToPadding(false);
        addView(guVar, tre.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        guVar.setOnItemClickListener(new jr(c58Var, acbVar, lcbVar, (byte) 2));
        c96 c96Var = new c96(c58Var);
        c96Var.m = false;
        c96Var.C = false;
        k43 k43Var = k43.h;
        c96Var.o(k43Var);
        c96Var.n(280L);
        c96Var.D = (byte) 14;
        guVar.setItemAnimator(c96Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232064);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(aob.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new sa5(c58Var, (byte) 19));
        qob qobVar = new qob(context, null, (byte) 8);
        this.f = qobVar;
        qobVar.setWillNotDraw(false);
        x46 x46Var2 = new x46(0, false);
        this.h = x46Var2;
        qobVar.setLayoutManager(x46Var2);
        l9c l9cVar = new l9c(qobVar, context, i, 0, false, new icc() {
            @Override
            public final void a(Object obj, Object obj2) {
                long m;
                byte b = r2;
                int i2 = 0;
                c58 c58Var2 = c58Var;
                ArrayList arrayList = (ArrayList) obj;
                l9c l9cVar2 = (l9c) obj2;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = c58Var2.r;
                        w96 w96Var = c58Var2.Q;
                        if (w96Var == null) {
                            m = 0;
                        } else {
                            m = w96Var.m();
                        }
                        c58Var2.I = m;
                        while (i2 < arrayList2.size()) {
                            m96 m96Var = (m96) arrayList2.get(i2);
                            if (m96Var.b || !m96Var.e || m96Var.g >= m) {
                                int i3 = g96.b;
                                b8c K = b8c.K(g96.class);
                                K.H = m96Var;
                                arrayList.add(K);
                            }
                            i2++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = c58Var2.s;
                        while (i2 < arrayList3.size()) {
                            int i4 = k96.b;
                            b8c K2 = b8c.K(k96.class);
                            K2.H = (n96) arrayList3.get(i2);
                            arrayList.add(K2);
                            i2++;
                        }
                        return;
                }
            }
        }, null);
        this.n = l9cVar;
        qobVar.setAdapter(l9cVar);
        l9cVar.r = false;
        qobVar.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        qobVar.setClipToPadding(false);
        addView(qobVar, tre.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        qobVar.setOnItemClickListener(new z86(c58Var));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43Var);
        zb3Var.n(350L);
        qobVar.setItemAnimator(zb3Var);
        t(false);
    }

    private long getDefaultPeerId() {
        boolean z;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        w96 w96Var = this.Q;
        if (w96Var != null && w96Var.o()) {
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
            return yac.h(this.O).e();
        }
        return wf3.n(defaultSendAs);
    }

    private int getListViewTop() {
        gu guVar = this.c;
        int height = guVar.getHeight();
        for (int i = 0; i < guVar.getChildCount(); i++) {
            height = Math.min(guVar.getChildAt(i).getTop(), height);
        }
        return guVar.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return hl.S2(ob6.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) this.S)));
    }

    private String getStarsToastTitle() {
        return ob6.M0(2131744682, null);
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
        cv7 cv7Var = ((c58) this).j0.J1;
        bv7 bv7Var = cv7Var.a;
        bv7Var.c(cv7Var);
        bv7Var.b();
        i();
    }

    public final void b(int i) {
        ArrayList arrayList;
        m96 m96Var;
        ArrayList arrayList2;
        boolean z = false;
        int i2 = 0;
        while (true) {
            arrayList = this.r;
            if (i2 < arrayList.size()) {
                if (((m96) arrayList.get(i2)).a == i) {
                    m96Var = (m96) arrayList.get(i2);
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                m96Var = null;
                break;
            }
        }
        if (m96Var != null) {
            if (m96Var.a < 0 && m96Var.e) {
                long j = m96Var.g;
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
                } else if (((n96) arrayList2.get(i3)).f.contains(m96Var)) {
                    ((n96) arrayList2.get(i3)).f.remove(m96Var);
                    if (((n96) arrayList2.get(i3)).f.isEmpty()) {
                        arrayList2.remove(i3);
                        z = true;
                    } else {
                        ((n96) arrayList2.get(i3)).c();
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
                Collections.sort(arrayList2, new f03(this, (byte) 27));
                this.n.O(true);
                s();
                t(true);
            }
        }
    }

    public final h96 c(int i) {
        h96 h96Var;
        m96 m96Var;
        int i2 = 0;
        while (true) {
            gu guVar = this.c;
            if (i2 < guVar.getChildCount()) {
                View childAt = guVar.getChildAt(i2);
                if ((childAt instanceof h96) && (m96Var = (h96Var = (h96) childAt).L) != null && m96Var.a == i) {
                    return h96Var;
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
        if (i == jn7.H2) {
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
                    long n = wf3.n(groupCallMessage.from_id);
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
        gu guVar = this.c;
        if (view == guVar) {
            if (guVar.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.L - guVar.getTop()) + guVar.getY();
            canvas.saveLayerAlpha(guVar.getX(), guVar.getY(), guVar.getX() + guVar.getWidth(), guVar.getY() + guVar.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((guVar.getY() + guVar.getHeight()) - max, getListViewTop()) * (1.0f - guVar.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            RectF rectF = hl.P;
            rectF.set(0.0f, max, getWidth(), hl.L(12.0f) + max);
            pm3 pm3Var = this.J;
            pm3Var.r(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (guVar.getY() + guVar.getHeight()) - hl.L(12.0f), getWidth(), guVar.getHeight() + guVar.getBottom());
            pm3Var.r(canvas, rectF, 3, 1.0f);
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
                if (j == yac.h(i2).e()) {
                    return true;
                }
                return false;
            }
            w96 w96Var = this.Q;
            if (w96Var != null && (inputGroupCall = this.P) != null && inputGroupCall.id == w96Var.j() && (groupCall = this.Q.s) != null && groupCall.creator) {
                return true;
            }
            return xc2.w(14, uc7.s1(i2).M0(Long.valueOf(-this.N)));
        }
        return false;
    }

    public final Integer f(Long l) {
        this.e0.run();
        this.S = l.longValue();
        v21 I = new d31(this.b, new x53()).I(2131624221, getStarsToastTitle(), getStarsToastSubtitle());
        boolean z = false;
        I.s = false;
        I.k(true);
        long j = 0;
        this.S = 0L;
        this.T = true;
        int n = n(new TLRPC.TL_textWithEntities(), l.longValue());
        w96 w96Var = this.Q;
        if (w96Var != null) {
            j = w96Var.m();
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
        gu guVar = this.c;
        int height = guVar.getHeight();
        for (int i = 0; i < guVar.getChildCount(); i++) {
            height = Math.min(guVar.getChildAt(i).getTop(), height);
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
        w96 w96Var = this.Q;
        if (w96Var == null) {
            m = 0;
        } else {
            m = w96Var.m();
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i < arrayList.size()) {
                m96 m96Var = (m96) arrayList.get(i);
                int i3 = m96Var.a;
                if (i3 >= 0 && i3 > this.G && (m96Var.b || !m96Var.e || m96Var.g >= m)) {
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
        long e = yac.h(this.O).e();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            e = wf3.n(defaultSendAs);
        }
        w53 w53Var = new w53((byte) 1);
        int i2 = this.O;
        e0b e0bVar = new e0b(getContext(), i2, this.N, null, null, arrayList, !z, true, e, w53Var);
        c58 c58Var = (c58) this;
        e0bVar.J1 = c58Var;
        e0bVar.L1 = new z86(c58Var);
        e0bVar.show();
    }

    public final void k(int i, int i2, boolean z, long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, boolean z2) {
        long j3;
        int i3;
        TL_phone.groupCallDonor groupcalldonor;
        n96 n96Var;
        boolean z3;
        n96 n96Var2;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.r;
            if (i4 < arrayList.size()) {
                if (((m96) arrayList.get(i4)).a != i2) {
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
                int b = eg5.b(i5, (int) obj.g, 0);
                long j4 = 0;
                int i6 = (obj.g > 0L ? 1 : (obj.g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.s;
                boolean z4 = true;
                if (i6 > 0 && b > 0 && currentTime - obj.d <= b) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < arrayList2.size()) {
                            j3 = j4;
                            if (((n96) arrayList2.get(i7)).b == j) {
                                n96Var = (n96) arrayList2.get(i7);
                                break;
                            } else {
                                i7++;
                                j4 = j3;
                            }
                        } else {
                            j3 = j4;
                            n96Var = null;
                            break;
                        }
                    }
                    if (n96Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f = arrayList3;
                        obj2.a = i5;
                        obj2.b = j;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z3 = true;
                        n96Var2 = obj2;
                    } else {
                        n96Var.f.add(obj);
                        this.f.i1();
                        z3 = false;
                        n96Var2 = n96Var;
                    }
                    n96Var2.c();
                    t(true);
                    l();
                    Collections.sort(arrayList2, new f03(this, (byte) 27));
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
                        if (obj.a < ((m96) arrayList.get(size)).a) {
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
                    this.d.g1(0, hl.L(100.0f));
                    int i8 = obj.a;
                    if (i8 > 0) {
                        this.G = i8;
                    }
                }
                invalidate();
                c58 c58Var = (c58) this;
                dn2 dn2Var = c58Var.j0.H1;
                if (dn2Var != null) {
                    dn2Var.setCount(c58Var.getUnreadMessagesCount());
                }
                if (!z2 && i2 > 0 && obj.g > j3) {
                    int i9 = 0;
                    while (true) {
                        if (i9 < this.U.size()) {
                            if (wf3.n(((TL_phone.groupCallDonor) this.U.get(i9)).peer_id) == obj.c) {
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
                        if (yac.h(i5).e() != obj.c) {
                            z4 = false;
                        }
                        groupcalldonor.my = z4;
                        groupcalldonor.peer_id = uc7.s1(i5).y1(obj.c);
                        groupcalldonor.stars = j3;
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (((n96) arrayList2.get(i10)).b == obj.c) {
                                ((n96) arrayList2.get(i10)).b();
                                groupcalldonor.stars += ((n96) arrayList2.get(i10)).d;
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
                    a96 a96Var = this.h0;
                    hl.r(a96Var);
                    hl.d3(a96Var, 100L);
                }
                w96 w96Var = this.Q;
                if (w96Var != null) {
                    w96Var.L = arrayList;
                    w96Var.M = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void l() {
        int i;
        int i2;
        ea5 ea5Var = this.F;
        if (ea5Var != null) {
            hl.r(ea5Var);
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
            n96 n96Var = (n96) obj;
            ArrayList arrayList2 = n96Var.f;
            int size2 = arrayList2.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                m96 m96Var = (m96) obj2;
                long j2 = m96Var.g;
                if (j2 > 0) {
                    i2 = currentTime;
                    i4 = Math.max(i4, eg5.b(n96Var.a, (int) j2, 0) + m96Var.d);
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
        ea5 ea5Var2 = new ea5(this, (byte) 29);
        this.F = ea5Var2;
        hl.d3(ea5Var2, j);
    }

    public final int m(final long j, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j2) {
        int i;
        boolean z;
        TL_phone.groupCallDonor groupcalldonor;
        int i2 = this.O;
        final int i3 = yac.h(i2).i();
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
        sendgroupcallmessage.send_as = uc7.s1(i2).j1(j);
        ConnectionsManager.getInstance(yac.t0).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z2 = tLObject instanceof TLRPC.Updates;
                o96 o96Var = o96.this;
                int i5 = i3;
                if (z2) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList z0 = uc7.z0(updates, TL_update.TL_updateMessageID.class);
                    int size = z0.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = z0.get(i6);
                        i6++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i7 = tL_updateMessageID.id;
                            ArrayList arrayList = o96Var.r;
                            int size2 = arrayList.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 < size2) {
                                    Object obj2 = arrayList.get(i8);
                                    i8++;
                                    m96 m96Var = (m96) obj2;
                                    if (m96Var.a == i5) {
                                        m96Var.a = i7;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    uc7.s1(o96Var.O).Y3(updates, false);
                } else if (tL_error != null) {
                    hl.c3(new ic2(o96Var, i5, tL_error, j2, j, tL_textWithEntities));
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
                groupcalldonor2.peer_id = uc7.s1(i2).y1(j);
                groupcalldonor2.stars = j2;
                this.U.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
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
        v21 v21Var = this.a0;
        a96 a96Var = this.e0;
        if (v21Var == null || !v21Var.m) {
            x53 x53Var = new x53();
            p21 p21Var = new p21(getContext(), x53Var);
            this.b0 = p21Var;
            p21Var.a.f(2131624221, 32, 32, null);
            this.b0.b.setText(getStarsToastTitle());
            t21 t21Var = new t21(x53Var, getContext(), true, false);
            this.c0 = t21Var;
            t21Var.e(ob6.M0(2131744680, null));
            this.c0.b = new a96((c58) this, (byte) 0);
            o21 o21Var = new o21(getContext(), x53Var);
            this.d0 = o21Var;
            o21Var.b = 5000L;
            o21Var.setColor(aob.v0(aob.xj, x53Var));
            this.c0.addView(this.d0, tre.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.c0.e.setPadding(hl.L(12.0f), hl.L(8.0f), hl.L(30.0f), hl.L(8.0f));
            this.b0.setButton(this.c0);
            v21 f = v21.f(this.b, this.b0, -1);
            this.a0 = f;
            f.s = false;
            f.k(true);
            this.a0.w = a96Var;
        }
        this.S++;
        g(getDefaultPeerId());
        h(getTotalMyStars(), (int) this.S, getDefaultPeerId());
        this.b0.b.setText(getStarsToastTitle());
        this.b0.c.setText(getStarsToastSubtitle());
        this.d0.b = 5000L;
        hl.r(a96Var);
        hl.d3(a96Var, 5000L);
        long j = this.S;
        cv7 cv7Var = ((c58) this).j0.J1;
        bv7 bv7Var = cv7Var.a;
        bv7Var.c(cv7Var);
        if (bv7Var.s) {
            bv7Var.s = false;
            bv7Var.a(1.0f, null);
        }
        ArrayList arrayList = bv7Var.e;
        while (arrayList.size() > 4) {
            ((b29) arrayList.remove(0)).x(true);
        }
        int[] iArr2 = bv7Var.f;
        b29 b29Var = new b29(iArr2[Utilities.c.nextInt(iArr2.length)], hl.L(70.0f), hl.L(70.0f));
        b29Var.M(bv7Var);
        b29Var.E(true);
        b29Var.F(0);
        b29Var.start();
        arrayList.add(b29Var);
        bv7Var.invalidate();
        hn hnVar = bv7Var.c;
        hnVar.a();
        hnVar.t("+".concat(ob6.E(j, ',')), true, true);
        zu7 zu7Var = bv7Var.d;
        hl.r(zu7Var);
        hl.d3(zu7Var, 1500L);
        cv7Var.getLocationInWindow(cv7Var.G);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - cv7Var.E;
        int i = (j2 > 100L ? 1 : (j2 == 100L ? 0 : -1));
        float f2 = cv7Var.F;
        if (i < 0) {
            cv7Var.F = f2 + 0.5f;
        } else {
            cv7Var.F = Utilities.i(1.0f - (((float) (j2 - 100)) / 200.0f), 1.0f, 0.0f) * f2;
            LaunchActivity.a0((cv7Var.getWidth() / 2.0f) + iArr[0], (cv7Var.getHeight() / 2.0f) + iArr[1], Utilities.i(cv7Var.F, 0.9f, 0.3f));
            cv7Var.F = 0.0f;
            cv7Var.E = currentTimeMillis;
        }
        i();
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.P != null) {
            a96 a96Var = this.W;
            hl.r(a96Var);
            hl.c3(a96Var);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.P != null) {
            hl.r(this.W);
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
        int i = jn7.H2;
        int i2 = this.O;
        if (inputGroupCall3 != null) {
            jn7.f(i2).n(this, i);
        }
        this.N = j;
        this.P = inputGroupCall;
        if (inputGroupCall != null) {
            jn7.f(i2).b(this, i);
        }
        if (z) {
            this.e0.run();
            a96 a96Var = this.W;
            if (inputGroupCall == null) {
                hl.r(a96Var);
                return z;
            }
            a96Var.run();
        }
        return z;
    }

    public final float r() {
        gu guVar = this.c;
        return Math.max(Math.max(0.0f, this.L - guVar.getTop()), getListViewContentTop()) + guVar.getY();
    }

    public final void s() {
        l96 l96Var;
        n96 n96Var;
        h96 h96Var;
        m96 m96Var;
        HashMap hashMap = this.w;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.U;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new f03((byte) 26));
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
            hashMap.put(Long.valueOf(wf3.n(groupcalldonor.peer_id)), Integer.valueOf(i3));
        }
        int i6 = 0;
        while (true) {
            gu guVar = this.c;
            if (i6 >= guVar.getChildCount()) {
                break;
            }
            View childAt = guVar.getChildAt(i6);
            if ((childAt instanceof h96) && (m96Var = (h96Var = (h96) childAt).L) != null) {
                int d = d(m96Var.c);
                m96 m96Var2 = h96Var.L;
                if (d != m96Var2.h) {
                    m96Var2.h = d;
                    h96Var.set(m96Var2);
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
            m96 m96Var3 = (m96) arrayList3.get(i7);
            int d2 = d(m96Var3.c);
            if (d2 != m96Var3.h) {
                m96Var3.h = d2;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            qob qobVar = this.f;
            if (i8 >= qobVar.getChildCount()) {
                break;
            }
            View childAt2 = qobVar.getChildAt(i8);
            if ((childAt2 instanceof l96) && (n96Var = (l96Var = (l96) childAt2).f) != null) {
                int d3 = d(n96Var.b);
                n96 n96Var2 = l96Var.f;
                if (d3 != n96Var2.e) {
                    n96Var2.e = d3;
                    l96Var.set(n96Var2);
                }
            }
            i8++;
        }
        while (true) {
            ArrayList arrayList4 = this.s;
            if (i < arrayList4.size()) {
                n96 n96Var3 = (n96) arrayList4.get(i);
                int d4 = d(n96Var3.b);
                if (d4 != n96Var3.e) {
                    n96Var3.e = d4;
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

    public void setLivePlayer(w96 w96Var) {
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
        this.Q = w96Var;
        if (z && w96Var != null && (arrayList = w96Var.L) != null && (arrayList2 = w96Var.M) != null && arrayList != (arrayList3 = this.r) && arrayList2 != (arrayList4 = this.s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(w96Var.L);
            arrayList4.addAll(w96Var.M);
            this.e.O(true);
            ConnectionsManager.getInstance(this.O).getCurrentTime();
            Collections.sort(arrayList4, new f03(this, (byte) 27));
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
        qob qobVar = this.f;
        gu guVar = this.c;
        if (z) {
            ViewPropertyAnimator animate = guVar.animate();
            if (this.K) {
                L3 = 0.0f;
            } else {
                L3 = hl.L(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L3);
            k43 k43Var = k43.h;
            translationY.setInterpolator(k43Var).setUpdateListener(new ch4(this, (byte) 21)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = qobVar.animate();
            if (this.K) {
                L4 = 0.0f;
            } else {
                L4 = hl.L(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(L4);
            if (!this.K) {
                f = 0.0f;
            }
            translationY2.alpha(f).setInterpolator(k43Var).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            L = 0.0f;
        } else {
            L = hl.L(35.0f);
        }
        guVar.setTranslationY(L);
        if (this.K) {
            L2 = 0.0f;
        } else {
            L2 = hl.L(35.0f);
        }
        qobVar.setTranslationY(L2);
        if (!this.K) {
            f = 0.0f;
        }
        qobVar.setAlpha(f);
        invalidate();
    }
}
