package ci;

import ai.ja;
import ai.me;
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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w10;
import org.telegram.ui.wa1;
public abstract class x0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public a0 E;
    public int F;
    public boolean G;
    public long H;
    public final w10 I;
    public boolean J;
    public float K;
    public float L;
    public long M;
    public final int N;
    public TLRPC.InputGroupCall O;
    public h1 P;
    public long Q;
    public long R;
    public boolean S;
    public ArrayList T;
    public boolean U;
    public final b0 V;
    public oc W;
    public final View f6079a;
    public ic f6080a0;
    public final FrameLayout f6081b;
    public mc f6082b0;
    public final ai.u1 f6083c;
    public hc f6084c0;
    public final s4.b0 d;
    public final b0 f6085d0;
    public final h0 e;
    public ValueAnimator f6086e0;
    public final wa1 f6087f;
    public boolean f6088f0;
    public final b0 f6089g0;
    public final s4.b0 h;
    public final a71 f6090n;
    public final ArrayList f6091r;
    public final ArrayList f6092s;
    public final HashMap v;
    public long f6093w;
    public int f6094x;
    public boolean f6095y;

    public x0(Context context, z9 z9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f6091r = new ArrayList();
        this.f6092s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new w10();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final m2 m2Var = (m2) this;
        this.V = new b0(m2Var, 0);
        this.f6085d0 = new b0(m2Var, 1);
        this.f6088f0 = false;
        this.f6089g0 = new b0(m2Var, 2);
        this.f6079a = view;
        this.f6081b = frameLayout;
        view.setAlpha(0.5f);
        ai.u1 u1Var = new ai.u1(m2Var, context, 1);
        this.f6083c = u1Var;
        u1Var.setWillNotDraw(false);
        s4.b0 b0Var = new s4.b0(1, true);
        this.d = b0Var;
        u1Var.setLayoutManager(b0Var);
        h0 h0Var = new h0(m2Var, u1Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                m2 m2Var2 = m2Var;
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = m2Var2.f6091r;
                        h1 h1Var = m2Var2.P;
                        if (h1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = h1Var.j();
                        }
                        m2Var2.H = j10;
                        while (i12 < arrayList2.size()) {
                            v0 v0Var = (v0) arrayList2.get(i12);
                            if (v0Var.f6002b || !v0Var.e || v0Var.f6005g >= j10) {
                                int i13 = p0.f5644a;
                                l61 J = l61.J(p0.class);
                                J.G = v0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = m2Var2.f6092s;
                        while (i12 < arrayList3.size()) {
                            int i14 = t0.f5939a;
                            l61 J2 = l61.J(t0.class);
                            J2.G = (w0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, new b());
        this.e = h0Var;
        u1Var.setAdapter(h0Var);
        h0Var.f24646r = false;
        u1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        u1Var.setClipToPadding(false);
        addView(u1Var, w7.z5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        u1Var.setOnItemClickListener(new g0(m2Var, viewGroup, z9Var, 0));
        i0 i0Var = new i0(m2Var);
        i0Var.f46376m = false;
        i0Var.C = false;
        zr zrVar = zr.h;
        i0Var.o(zrVar);
        i0Var.n(280L);
        i0Var.D = 14L;
        u1Var.setItemAnimator(i0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(1090519039, 1, -1));
        imageView.setOnClickListener(new ah.g0(m2Var, 12));
        wa1 wa1Var = new wa1(context, 1, null);
        this.f6087f = wa1Var;
        wa1Var.setWillNotDraw(false);
        s4.b0 b0Var2 = new s4.b0(0, false);
        this.h = b0Var2;
        wa1Var.setLayoutManager(b0Var2);
        a71 a71Var = new a71(wa1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                m2 m2Var2 = m2Var;
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var2 = (a71) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = m2Var2.f6091r;
                        h1 h1Var = m2Var2.P;
                        if (h1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = h1Var.j();
                        }
                        m2Var2.H = j10;
                        while (i12 < arrayList2.size()) {
                            v0 v0Var = (v0) arrayList2.get(i12);
                            if (v0Var.f6002b || !v0Var.e || v0Var.f6005g >= j10) {
                                int i13 = p0.f5644a;
                                l61 J = l61.J(p0.class);
                                J.G = v0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = m2Var2.f6092s;
                        while (i12 < arrayList3.size()) {
                            int i14 = t0.f5939a;
                            l61 J2 = l61.J(t0.class);
                            J2.G = (w0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f6090n = a71Var;
        wa1Var.setAdapter(a71Var);
        a71Var.f24646r = false;
        wa1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        wa1Var.setClipToPadding(false);
        addView(wa1Var, w7.z5.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        wa1Var.setOnItemClickListener(new a1.c(m2Var, 15));
        s4.k kVar = new s4.k();
        kVar.f46376m = false;
        kVar.C = false;
        kVar.o(zrVar);
        kVar.n(350L);
        wa1Var.setItemAnimator(kVar);
        u(false);
    }

    public static Integer a(x0 x0Var, Long l4) {
        x0Var.f6085d0.run();
        x0Var.R = l4.longValue();
        oc M = new vc(x0Var.f6081b, new b()).M(x0Var.getStarsToastTitle(), x0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.f29211r = false;
        M.k(true);
        long j10 = 0;
        x0Var.R = 0L;
        x0Var.S = true;
        int o10 = x0Var.o(new TLRPC.TL_textWithEntities(), l4.longValue());
        h1 h1Var = x0Var.P;
        if (h1Var != null) {
            j10 = h1Var.j();
        }
        if (x0Var.getDefaultPeerId() == x0Var.M && x0Var.f()) {
            z10 = true;
        }
        if (l4.longValue() < j10 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o10);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        h1 h1Var = this.P;
        if (h1Var != null && h1Var.l()) {
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
        ai.u1 u1Var = this.f6083c;
        int height = u1Var.getHeight();
        for (int i10 = 0; i10 < u1Var.getChildCount(); i10++) {
            height = Math.min(u1Var.getChildAt(i10).getTop(), height);
        }
        return u1Var.getHeight() - height;
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
        x1 x1Var = ((m2) this).f5535i0.Z1;
        w1 w1Var = x1Var.f6096a;
        w1Var.c(x1Var);
        w1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        v0 v0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f6091r;
            if (i11 < arrayList.size()) {
                if (((v0) arrayList.get(i11)).f6001a == i10) {
                    v0Var = (v0) arrayList.get(i11);
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                v0Var = null;
                break;
            }
        }
        if (v0Var != null) {
            if (v0Var.f6001a < 0 && v0Var.e) {
                long j10 = v0Var.f6005g;
                if (j10 > 0) {
                    this.Q -= j10;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f6092s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((w0) arrayList2.get(i12)).f6040f.contains(v0Var)) {
                    ((w0) arrayList2.get(i12)).f6040f.remove(v0Var);
                    if (((w0) arrayList2.get(i12)).f6040f.isEmpty()) {
                        arrayList2.remove(i12);
                        z10 = true;
                    } else {
                        ((w0) arrayList2.get(i12)).c();
                        m();
                    }
                } else {
                    i12++;
                }
            }
            arrayList.remove(i11);
            this.e.N(true);
            if (z10) {
                ConnectionsManager.getInstance(this.N).getCurrentTime();
                Collections.sort(arrayList2, new a4.d(this, 10));
                this.f6090n.N(true);
                t();
                u(true);
            }
        }
    }

    public final q0 d(int i10) {
        q0 q0Var;
        v0 v0Var;
        int i11 = 0;
        while (true) {
            ai.u1 u1Var = this.f6083c;
            if (i11 < u1Var.getChildCount()) {
                View childAt = u1Var.getChildAt(i11);
                if ((childAt instanceof q0) && (v0Var = (q0Var = (q0) childAt).K) != null && v0Var.f6001a == i10) {
                    return q0Var;
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
                if (inputGroupCall != null && inputGroupCall.f20361id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f20355id;
                    boolean z10 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f20361id == longValue) {
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ai.u1 u1Var = this.f6083c;
        if (view == u1Var) {
            if (u1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.K - u1Var.getTop()) + u1Var.getY();
            canvas.saveLayerAlpha(u1Var.getX(), u1Var.getY(), u1Var.getX() + u1Var.getWidth(), u1Var.getY() + u1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((u1Var.getY() + u1Var.getHeight()) - max, getListViewTop()) * (1.0f - u1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
            w10 w10Var = this.I;
            w10Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (u1Var.getY() + u1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), u1Var.getHeight() + u1Var.getBottom());
            w10Var.b(canvas, rectF, 3, 1.0f);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final int e(long j10) {
        return ((Integer) Map.EL.getOrDefault(this.v, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.M) {
            long j10 = this.M;
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i11 = this.N;
            if (i10 >= 0) {
                if (j10 == UserConfig.getInstance(i11).getClientUserId()) {
                    return true;
                }
                return false;
            }
            h1 h1Var = this.P;
            if (h1Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f20361id == h1Var.g() && (groupCall = this.P.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i11).getChat(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f6088f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        ai.u1 u1Var = this.f6083c;
        int height = u1Var.getHeight();
        for (int i10 = 0; i10 < u1Var.getChildCount(); i10++) {
            height = Math.min(u1Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f6091r.size();
    }

    public long getStarsCount() {
        return this.Q + this.R;
    }

    public int getUnreadMessagesCount() {
        long j10;
        int i10 = 0;
        if (this.F < 0) {
            return 0;
        }
        h1 h1Var = this.P;
        if (h1Var == null) {
            j10 = 0;
        } else {
            j10 = h1Var.j();
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f6091r;
            if (i10 < arrayList.size()) {
                v0 v0Var = (v0) arrayList.get(i10);
                int i12 = v0Var.f6001a;
                if (i12 >= 0 && i12 > this.F && (v0Var.f6002b || !v0Var.e || v0Var.f6005g >= j10)) {
                    i11++;
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i10, int i11, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.f6085d0.run();
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
        k0 k0Var = new k0(0);
        int i11 = this.N;
        me meVar = new me(getContext(), i11, this.M, null, null, arrayList, !z10, true, clientUserId, k0Var);
        m2 m2Var = (m2) this;
        meVar.P = m2Var;
        meVar.R = new a1.c(m2Var, 14);
        meVar.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        long j12;
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        w0 w0Var;
        boolean z12;
        w0 w0Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f6091r;
            if (i13 < arrayList.size()) {
                if (((v0) arrayList.get(i13)).f6001a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f6002b = z10;
                obj.f6003c = j10;
                obj.f6004f = tL_textWithEntities;
                obj.f6005g = j11;
                obj.f6001a = i11;
                obj.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = u.b(i14, (int) obj.f6005g, 0);
                long j13 = 0;
                int i15 = (obj.f6005g > 0L ? 1 : (obj.f6005g == 0L ? 0 : -1));
                ArrayList arrayList2 = this.f6092s;
                boolean z13 = true;
                if (i15 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList2.size()) {
                            j12 = j13;
                            if (((w0) arrayList2.get(i16)).f6038b == j10) {
                                w0Var = (w0) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                                j13 = j12;
                            }
                        } else {
                            j12 = j13;
                            w0Var = null;
                            break;
                        }
                    }
                    if (w0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f6040f = arrayList3;
                        obj2.f6037a = i14;
                        obj2.f6038b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        w0Var2 = obj2;
                    } else {
                        w0Var.f6040f.add(obj);
                        this.f6087f.g1();
                        z12 = false;
                        w0Var2 = w0Var;
                    }
                    w0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.d(this, 10));
                    if (!z11) {
                        this.f6090n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                } else {
                    j12 = 0;
                }
                if (!z11 && obj.e) {
                    long j14 = obj.f6005g;
                    if (j14 > j12) {
                        this.Q += j14;
                        j();
                    }
                }
                if (obj.f6001a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f6001a < ((v0) arrayList.get(size)).f6001a) {
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
                    this.e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.f6083c.canScrollVertically(1) || obj.f6001a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i17 = obj.f6001a;
                    if (i17 > 0) {
                        this.F = i17;
                    }
                }
                invalidate();
                m2 m2Var = (m2) this;
                a aVar = m2Var.f5535i0.X1;
                if (aVar != null) {
                    aVar.setCount(m2Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f6005g > j12) {
                    int i18 = 0;
                    while (true) {
                        if (i18 < this.T.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i18)).peer_id) == obj.f6003c) {
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
                        if (UserConfig.getInstance(i14).getClientUserId() != obj.f6003c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(obj.f6003c);
                        groupcalldonor.stars = j12;
                        for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                            if (((w0) arrayList2.get(i19)).f6038b == obj.f6003c) {
                                ((w0) arrayList2.get(i19)).b();
                                groupcalldonor.stars += ((w0) arrayList2.get(i19)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j15 = groupcalldonor.stars;
                    long j16 = obj.f6005g;
                    long j17 = j15 + j16;
                    groupcalldonor.stars = j17;
                    i((int) j17, (int) j16, obj.f6003c);
                }
                t();
                if (z11) {
                    b0 b0Var = this.f6089g0;
                    AndroidUtilities.cancelRunOnUIThread(b0Var);
                    AndroidUtilities.runOnUIThread(b0Var, 100L);
                }
                h1 h1Var = this.P;
                if (h1Var != null) {
                    h1Var.U = arrayList;
                    h1Var.V = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i10;
        int i11;
        a0 a0Var = this.E;
        if (a0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.f6092s;
        int size = arrayList.size();
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            w0 w0Var = (w0) obj;
            ArrayList arrayList2 = w0Var.f6040f;
            int size2 = arrayList2.size();
            int i13 = currentTime;
            int i14 = 0;
            int i15 = 0;
            while (i15 < size2) {
                Object obj2 = arrayList2.get(i15);
                i15++;
                v0 v0Var = (v0) obj2;
                int i16 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (v0Var.f6005g > 0) {
                    i13 = Math.min(i13, v0Var.d);
                    i11 = i16;
                    i14 = Math.max(i14, u.b(w0Var.f6037a, (int) v0Var.f6005g, 0) + v0Var.d);
                } else {
                    i11 = i16;
                }
                arrayList = arrayList3;
                currentTime = i11;
            }
            j10 = Math.min(j10, Math.max(0, i14 - i10) * 1000);
            arrayList = arrayList;
            currentTime = currentTime;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        a0 a0Var2 = new a0(this, 1);
        this.E = a0Var2;
        AndroidUtilities.runOnUIThread(a0Var2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.N;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.O;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i12 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i11).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                x0 x0Var = x0.this;
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
                            int i15 = tL_updateMessageID.f20597id;
                            ArrayList arrayList = x0Var.f6091r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    v0 v0Var = (v0) obj2;
                                    if (v0Var.f6001a == i13) {
                                        v0Var.f6001a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(x0Var.N).lambda$processUpdates$377(updates, false);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ja(x0Var, i13, tL_error, j11, j10, tL_textWithEntities));
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
                groupcalldonor.stars += j11;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i11).getPeer(j10);
                groupcalldonor2.stars = j11;
                this.T.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 != this.M && !f()) {
            i10 = newMessageId;
            z10 = false;
        } else {
            i10 = newMessageId;
            z10 = true;
        }
        l(currentTime, i10, z10, j10, tL_textWithEntities, j11, false);
        int i14 = i10;
        q(false, true);
        return i14;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        return n(getDefaultPeerId(), tL_textWithEntities, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.O != null) {
            b0 b0Var = this.V;
            AndroidUtilities.cancelRunOnUIThread(b0Var);
            AndroidUtilities.runOnUIThread(b0Var);
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
        oc ocVar = this.W;
        b0 b0Var = this.f6085d0;
        if (ocVar == null || !ocVar.f29205l) {
            b bVar = new b();
            ic icVar = new ic(getContext(), bVar);
            this.f6080a0 = icVar;
            icVar.c(R.raw.stars_topup, new String[0]);
            this.f6080a0.f27395b.setText(getStarsToastTitle());
            mc mcVar = new mc(getContext(), bVar, true, false);
            this.f6082b0 = mcVar;
            mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.f6082b0.f28574b = new a0((m2) this, 0);
            hc hcVar = new hc(getContext(), bVar);
            this.f6084c0 = hcVar;
            hcVar.f27003b = 5000L;
            hcVar.setColor(bVar.g(org.telegram.ui.ActionBar.k6.Gi));
            this.f6082b0.addView(this.f6084c0, w7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f6082b0.e.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.f6080a0.setButton(this.f6082b0);
            oc f7 = oc.f(this.f6081b, this.f6080a0, -1);
            this.W = f7;
            f7.f29211r = false;
            f7.k(true);
            this.W.v = b0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f6080a0.f27395b.setText(getStarsToastTitle());
        this.f6080a0.f27396c.setText(getStarsToastSubtitle());
        this.f6084c0.f27003b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(b0Var);
        AndroidUtilities.runOnUIThread(b0Var, 5000L);
        long j10 = this.R;
        x1 x1Var = ((m2) this).f5535i0.Z1;
        w1 w1Var = x1Var.f6096a;
        w1Var.c(x1Var);
        if (w1Var.f6047s) {
            w1Var.f6047s = false;
            w1Var.a(1.0f, null);
        }
        ArrayList arrayList = w1Var.e;
        while (arrayList.size() > 4) {
            ((xj0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = w1Var.f6044f;
        xj0 xj0Var = new xj0(iArr2[Utilities.fastRandom.nextInt(iArr2.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        xj0Var.R(w1Var);
        xj0Var.J(true);
        xj0Var.K(0);
        xj0Var.start();
        arrayList.add(xj0Var);
        w1Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = w1Var.f6043c;
        n6Var.a();
        n6Var.t(i2.o1.m(j10, ',', new StringBuilder("+")), true, true);
        u1 u1Var = w1Var.d;
        AndroidUtilities.cancelRunOnUIThread(u1Var);
        AndroidUtilities.runOnUIThread(u1Var, 1500L);
        x1Var.getLocationInWindow(x1Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - x1Var.f6105y;
        if (j11 < 100) {
            x1Var.E += 0.5f;
        } else {
            x1Var.E = Utilities.clamp(1.0f - (((float) (j11 - 100)) / 200.0f), 1.0f, 0.0f) * x1Var.E;
            LaunchActivity.c0((x1Var.getWidth() / 2.0f) + iArr[0], (x1Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(x1Var.E, 0.9f, 0.3f));
            x1Var.E = 0.0f;
            x1Var.f6105y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        long j11;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.O;
        long j12 = 0;
        if (inputGroupCall2 == null) {
            j11 = 0;
        } else {
            j11 = inputGroupCall2.f20361id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f20361id;
        }
        if (j11 != j12) {
            this.f6091r.clear();
            z10 = true;
            this.e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.O;
        int i10 = this.N;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.M = j10;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.f6085d0.run();
            b0 b0Var = this.V;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(b0Var);
                return z10;
            }
            b0Var.run();
        }
        return z10;
    }

    public final float s() {
        ai.u1 u1Var = this.f6083c;
        return Math.max(Math.max(0.0f, this.K - u1Var.getTop()), getListViewContentTop()) + u1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.G = z10;
    }

    public void setLivePlayer(h1 h1Var) {
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
        this.P = h1Var;
        if (z10 && h1Var != null && (arrayList = h1Var.U) != null && (arrayList2 = h1Var.V) != null && arrayList != (arrayList3 = this.f6091r) && arrayList2 != (arrayList4 = this.f6092s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(h1Var.U);
            arrayList4.addAll(h1Var.V);
            this.e.N(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new a4.d(this, 10));
            this.f6090n.N(true);
            u(false);
        }
    }

    public final void t() {
        u0 u0Var;
        w0 w0Var;
        q0 q0Var;
        v0 v0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.T;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a4.d(11));
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
            ai.u1 u1Var = this.f6083c;
            if (i15 >= u1Var.getChildCount()) {
                break;
            }
            View childAt = u1Var.getChildAt(i15);
            if ((childAt instanceof q0) && (v0Var = (q0Var = (q0) childAt).K) != null) {
                int e = e(v0Var.f6003c);
                v0 v0Var2 = q0Var.K;
                if (e != v0Var2.h) {
                    v0Var2.h = e;
                    q0Var.set(v0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f6091r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            v0 v0Var3 = (v0) arrayList3.get(i16);
            int e7 = e(v0Var3.f6003c);
            if (e7 != v0Var3.h) {
                v0Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            wa1 wa1Var = this.f6087f;
            if (i17 >= wa1Var.getChildCount()) {
                break;
            }
            View childAt2 = wa1Var.getChildAt(i17);
            if ((childAt2 instanceof u0) && (w0Var = (u0Var = (u0) childAt2).f5974f) != null) {
                int e10 = e(w0Var.f6038b);
                w0 w0Var2 = u0Var.f5974f;
                if (e10 != w0Var2.e) {
                    w0Var2.e = e10;
                    u0Var.set(w0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f6092s;
            if (i10 < arrayList4.size()) {
                w0 w0Var3 = (w0) arrayList4.get(i10);
                int e11 = e(w0Var3.f6038b);
                if (e11 != w0Var3.e) {
                    w0Var3.e = e11;
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
        ArrayList arrayList = this.f6092s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f7 = 1.0f;
        ai.u1 u1Var = this.f6083c;
        wa1 wa1Var = this.f6087f;
        if (z10) {
            ViewPropertyAnimator animate = u1Var.animate();
            if (this.J) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            zr zrVar = zr.h;
            translationY.setInterpolator(zrVar).setUpdateListener(new ah.c0(this, 10)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = wa1Var.animate();
            if (this.J) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(dp4);
            if (!this.J) {
                f7 = 0.0f;
            }
            translationY2.alpha(f7).setInterpolator(zrVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(35.0f);
        }
        u1Var.setTranslationY(dp);
        if (this.J) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(35.0f);
        }
        wa1Var.setTranslationY(dp2);
        if (!this.J) {
            f7 = 0.0f;
        }
        wa1Var.setAlpha(f7);
        invalidate();
    }
}
