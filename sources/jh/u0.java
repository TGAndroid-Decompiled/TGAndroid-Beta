package jh;

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
import hh.jb;
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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ta1;
import org.telegram.ui.v10;

public abstract class u0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public x A;
    public int B;
    public boolean C;
    public long D;
    public final v10 E;
    public boolean F;
    public float G;
    public float H;
    public long I;
    public final int J;
    public TLRPC.InputGroupCall K;
    public d1 L;
    public long M;
    public long N;
    public boolean O;
    public ArrayList P;
    public boolean Q;
    public final y R;
    public ec S;
    public yb T;
    public cc U;
    public xb V;
    public final y W;

    public final View f14008a;

    public ValueAnimator f14009a0;

    public final FrameLayout f14010b;

    public boolean f14011b0;

    public final hh.f1 f14012c;

    public final y f14013c0;
    public final f2.k0 d;

    public final e0 f14014e;

    public final ta1 f14015f;
    public final f2.k0 h;

    public final b51 f14016n;

    public final ArrayList f14017r;

    public final ArrayList f14018s;
    public final HashMap v;

    public long f14019w;

    public int f14020x;

    public boolean f14021y;

    public u0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f14017r = new ArrayList();
        this.f14018s = new ArrayList();
        this.v = new HashMap();
        this.B = -1;
        this.C = true;
        this.E = new v10();
        int i10 = UserConfig.selectedAccount;
        this.J = i10;
        this.P = new ArrayList();
        final g2 g2Var = (g2) this;
        this.R = new y(g2Var, 0);
        this.W = new y(g2Var, 1);
        this.f14011b0 = false;
        this.f14013c0 = new y(g2Var, 2);
        this.f14008a = view;
        this.f14010b = frameLayout;
        view.setAlpha(0.5f);
        hh.f1 f1Var = new hh.f1(g2Var, context, 1);
        this.f14012c = f1Var;
        f1Var.setWillNotDraw(false);
        f2.k0 k0Var = new f2.k0(1, true);
        this.d = k0Var;
        f1Var.setLayoutManager(k0Var);
        final int i11 = 0;
        e0 e0Var = new e0(g2Var, f1Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                int i12 = i11;
                int i13 = 0;
                g2 g2Var2 = g2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i12) {
                    case 0:
                        ArrayList arrayList2 = g2Var2.f14017r;
                        d1 d1Var = g2Var2.L;
                        long j10 = d1Var == null ? 0L : d1Var.j();
                        g2Var2.D = j10;
                        while (i13 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i13);
                            if (s0Var.f13930b || !s0Var.f13932e || s0Var.f13934g >= j10) {
                                int i14 = m0.f13647a;
                                n41 n41VarJ = n41.J(m0.class);
                                n41VarJ.G = s0Var;
                                arrayList.add(n41VarJ);
                            }
                            i13++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = g2Var2.f14018s;
                        while (i13 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i13);
                            int i15 = q0.f13842a;
                            n41 n41VarJ2 = n41.J(q0.class);
                            n41VarJ2.G = t0Var;
                            arrayList.add(n41VarJ2);
                            i13++;
                        }
                        break;
                }
            }
        }, new b());
        this.f14014e = e0Var;
        f1Var.setAdapter(e0Var);
        e0Var.f26942r = false;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        f1Var.setClipToPadding(false);
        addView(f1Var, h7.z5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        f1Var.setOnItemClickListener(new d0(g2Var, viewGroup, i9Var, 0));
        f0 f0Var = new f0(g2Var);
        f0Var.f5819m = false;
        f0Var.C = false;
        er erVar = er.h;
        f0Var.o(erVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        f1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new ag.w0(g2Var, 21));
        final int i12 = 1;
        ta1 ta1Var = new ta1(context, i12, null);
        this.f14015f = ta1Var;
        ta1Var.setWillNotDraw(false);
        f2.k0 k0Var2 = new f2.k0(0, false);
        this.h = k0Var2;
        ta1Var.setLayoutManager(k0Var2);
        b51 b51Var = new b51(ta1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                int i13 = i12;
                int i14 = 0;
                g2 g2Var2 = g2Var;
                ArrayList arrayList = (ArrayList) obj;
                switch (i13) {
                    case 0:
                        ArrayList arrayList2 = g2Var2.f14017r;
                        d1 d1Var = g2Var2.L;
                        long j10 = d1Var == null ? 0L : d1Var.j();
                        g2Var2.D = j10;
                        while (i14 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i14);
                            if (s0Var.f13930b || !s0Var.f13932e || s0Var.f13934g >= j10) {
                                int i15 = m0.f13647a;
                                n41 n41VarJ = n41.J(m0.class);
                                n41VarJ.G = s0Var;
                                arrayList.add(n41VarJ);
                            }
                            i14++;
                        }
                        break;
                    default:
                        ArrayList arrayList3 = g2Var2.f14018s;
                        while (i14 < arrayList3.size()) {
                            t0 t0Var = (t0) arrayList3.get(i14);
                            int i16 = q0.f13842a;
                            n41 n41VarJ2 = n41.J(q0.class);
                            n41VarJ2.G = t0Var;
                            arrayList.add(n41VarJ2);
                            i14++;
                        }
                        break;
                }
            }
        }, null);
        this.f14016n = b51Var;
        ta1Var.setAdapter(b51Var);
        b51Var.f26942r = false;
        ta1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        ta1Var.setClipToPadding(false);
        addView(ta1Var, h7.z5.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        ta1Var.setOnItemClickListener(new h3.x(g2Var, 21));
        g0 g0Var = new g0();
        g0Var.f5819m = false;
        g0Var.C = false;
        g0Var.o(erVar);
        g0Var.n(350L);
        ta1Var.setItemAnimator(g0Var);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.W.run();
        u0Var.N = l10.longValue();
        ec ecVarM = new mc(u0Var.f14010b, new b()).M(u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        ecVarM.f28028r = false;
        ecVarM.k(true);
        u0Var.N = 0L;
        u0Var.O = true;
        int iO = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        d1 d1Var = u0Var.L;
        long j10 = d1Var != null ? d1Var.j() : 0L;
        if (u0Var.getDefaultPeerId() == u0Var.I && u0Var.f()) {
            z10 = true;
        }
        if (l10.longValue() >= j10 || z10) {
            return Integer.valueOf(iO);
        }
        return Integer.MIN_VALUE;
    }

    private long getDefaultPeerId() {
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        d1 d1Var = this.L;
        if (d1Var != null && d1Var.l()) {
            TLRPC.GroupCall groupCall = this.L.v;
            if (groupCall == null ? false : !groupCall.messages_enabled) {
                return this.I;
            }
        }
        return defaultSendAs == null ? UserConfig.getInstance(this.J).getClientUserId() : DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        hh.f1 f1Var = this.f14012c;
        int height = f1Var.getHeight();
        for (int i10 = 0; i10 < f1Var.getChildCount(); i10++) {
            height = Math.min(f1Var.getChildAt(i10).getTop(), height);
        }
        return f1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.N)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (((long) 0) + this.N);
        for (int i11 = 0; i11 < this.P.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.P.get(i11)).my) {
                i10 = (int) (((long) i10) + ((TL_phone.groupCallDonor) this.P.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.N = 0L;
        h(getDefaultPeerId());
        r1 r1Var = ((g2) this).f13350e0.V1;
        q1 q1Var = r1Var.f13884a;
        q1Var.c(r1Var);
        q1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        s0 s0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f14017r;
            if (i11 >= arrayList.size()) {
                i11 = -1;
                s0Var = null;
                break;
            } else {
                if (((s0) arrayList.get(i11)).f13929a == i10) {
                    s0Var = (s0) arrayList.get(i11);
                    break;
                }
                i11++;
            }
        }
        if (s0Var == null) {
            return;
        }
        if (s0Var.f13929a < 0 && s0Var.f13932e) {
            long j10 = s0Var.f13934g;
            if (j10 > 0) {
                this.M -= j10;
                j();
            }
        }
        int i12 = 0;
        while (true) {
            arrayList2 = this.f14018s;
            if (i12 >= arrayList2.size()) {
                break;
            }
            if (((t0) arrayList2.get(i12)).f13989f.contains(s0Var)) {
                ((t0) arrayList2.get(i12)).f13989f.remove(s0Var);
                if (!((t0) arrayList2.get(i12)).f13989f.isEmpty()) {
                    ((t0) arrayList2.get(i12)).c();
                    m();
                    break;
                } else {
                    arrayList2.remove(i12);
                    z10 = true;
                    break;
                }
            }
            i12++;
        }
        arrayList.remove(i11);
        this.f14014e.N(true);
        if (z10) {
            ConnectionsManager.getInstance(this.J).getCurrentTime();
            Collections.sort(arrayList2, new a5.f(this, 24));
            this.f14016n.N(true);
            t();
            u(true);
        }
    }

    public final n0 d(int i10) {
        n0 n0Var;
        s0 s0Var;
        int i11 = 0;
        while (true) {
            hh.f1 f1Var = this.f14012c;
            if (i11 >= f1Var.getChildCount()) {
                return null;
            }
            View childAt = f1Var.getChildAt(i11);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).G) != null && s0Var.f13929a == i10) {
                return n0Var;
            }
            i11++;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.liveStoryMessageUpdate) {
            int i12 = 0;
            long jLongValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            if (!(tLObject instanceof TL_update.TL_updateGroupCallMessage)) {
                if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                    TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                    TLRPC.InputGroupCall inputGroupCall = this.K;
                    if (inputGroupCall == null || inputGroupCall.f22397id != jLongValue) {
                        return;
                    }
                    ArrayList<Integer> arrayList = tL_updateDeleteGroupCallMessages.messages;
                    int size = arrayList.size();
                    while (i12 < size) {
                        Integer num = arrayList.get(i12);
                        i12++;
                        c(num.intValue());
                    }
                    return;
                }
                return;
            }
            TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
            TLRPC.InputGroupCall inputGroupCall2 = this.K;
            if (inputGroupCall2 != null && inputGroupCall2.f22397id == jLongValue) {
                TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                int i13 = groupCallMessage.date;
                int i14 = groupCallMessage.f22391id;
                boolean z10 = groupCallMessage.from_admin;
                long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, zBooleanValue);
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.C) {
            return false;
        }
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hh.f1 f1Var = this.f14012c;
        if (view != f1Var) {
            return super.drawChild(canvas, view, j10);
        }
        if (f1Var.getAlpha() <= 0.0f) {
            return true;
        }
        float fMax = Math.max(0.0f, this.G - f1Var.getTop()) + f1Var.getY();
        canvas.saveLayerAlpha(f1Var.getX(), f1Var.getY(), f1Var.getX() + f1Var.getWidth(), f1Var.getY() + f1Var.getHeight(), 255, 31);
        canvas.save();
        canvas.translate(0.0f, Math.min((f1Var.getY() + f1Var.getHeight()) - fMax, getListViewTop()) * (1.0f - f1Var.getAlpha()));
        canvas.clipRect(0.0f, fMax, getWidth(), getHeight());
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, fMax, getWidth(), AndroidUtilities.dp(12.0f) + fMax);
        v10 v10Var = this.E;
        v10Var.b(canvas, rectF, 1, 1.0f);
        rectF.set(0.0f, (f1Var.getY() + f1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), f1Var.getHeight() + f1Var.getBottom());
        v10Var.b(canvas, rectF, 3, 1.0f);
        canvas.restore();
        return zDrawChild;
    }

    public final int e(long j10) {
        return ((Integer) Map.EL.getOrDefault(this.v, Long.valueOf(j10), 0)).intValue();
    }

    public final boolean f() {
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCall groupCall;
        if (getDefaultPeerId() < 0 && getDefaultPeerId() != this.I) {
            return false;
        }
        long j10 = this.I;
        int i10 = this.J;
        if (j10 >= 0) {
            return j10 == UserConfig.getInstance(i10).getClientUserId();
        }
        d1 d1Var = this.L;
        if (d1Var == null || (inputGroupCall = this.K) == null || inputGroupCall.f22397id != d1Var.g() || (groupCall = this.L.v) == null || !groupCall.creator) {
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.I)));
        }
        return true;
    }

    public final boolean g() {
        return this.f14011b0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        hh.f1 f1Var = this.f14012c;
        int height = f1Var.getHeight();
        for (int i10 = 0; i10 < f1Var.getChildCount(); i10++) {
            height = Math.min(f1Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f14017r.size();
    }

    public long getStarsCount() {
        return this.M + this.N;
    }

    public int getUnreadMessagesCount() {
        int i10 = 0;
        if (this.B < 0) {
            return 0;
        }
        d1 d1Var = this.L;
        long j10 = d1Var == null ? 0L : d1Var.j();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f14017r;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            s0 s0Var = (s0) arrayList.get(i10);
            int i12 = s0Var.f13929a;
            if (i12 >= 0 && i12 > this.B && (s0Var.f13930b || !s0Var.f13932e || s0Var.f13934g >= j10)) {
                i11++;
            }
            i10++;
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i10, int i11, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.W.run();
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.J).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        h0 h0Var = new h0(0);
        jb jbVar = new jb(getContext(), this.J, this.I, null, null, arrayList, !z10, true, clientUserId, h0Var);
        g2 g2Var = (g2) this;
        jbVar.J = g2Var;
        jbVar.L = new h3.x(g2Var, 20);
        jbVar.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z12;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f14017r;
            if (i13 >= arrayList.size()) {
                int i14 = this.J;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                s0 s0Var = new s0();
                s0Var.d = i10;
                s0Var.f13930b = z10;
                s0Var.f13931c = j10;
                s0Var.f13933f = tL_textWithEntities;
                s0Var.f13934g = j11;
                s0Var.f13929a = i11;
                s0Var.f13932e = TextUtils.isEmpty(tL_textWithEntities.text);
                int iB = s.b(i14, (int) s0Var.f13934g, 0);
                long j12 = s0Var.f13934g;
                ArrayList arrayList2 = this.f14018s;
                if (j12 > 0 && iB > 0 && currentTime - s0Var.d <= iB) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            t0Var = null;
                            break;
                        } else {
                            if (((t0) arrayList2.get(i15)).f13986b == j10) {
                                t0Var = (t0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        }
                    }
                    if (t0Var == null) {
                        t0Var = new t0();
                        ArrayList arrayList3 = new ArrayList();
                        t0Var.f13989f = arrayList3;
                        t0Var.f13985a = i14;
                        t0Var.f13986b = j10;
                        arrayList3.add(s0Var);
                        arrayList2.add(0, t0Var);
                        z12 = true;
                    } else {
                        t0Var.f13989f.add(s0Var);
                        this.f14015f.f1();
                        z12 = false;
                    }
                    t0Var.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a5.f(this, 24));
                    if (!z11) {
                        this.f14016n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && s0Var.f13932e) {
                    long j13 = s0Var.f13934g;
                    if (j13 > 0) {
                        this.M += j13;
                        j();
                    }
                }
                if (s0Var.f13929a < 0) {
                    i12 = 0;
                    break;
                }
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        i12 = 0;
                        break;
                    } else {
                        if (s0Var.f13929a < ((s0) arrayList.get(size)).f13929a) {
                            i12 = size + 1;
                            break;
                        }
                        size--;
                    }
                }
                arrayList.add(i12, s0Var);
                if (!z11) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.f14014e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.f14012c.canScrollVertically(1) || s0Var.f13929a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = s0Var.f13929a;
                    if (i16 > 0) {
                        this.B = i16;
                    }
                }
                invalidate();
                g2 g2Var = (g2) this;
                a aVar = g2Var.f13350e0.T1;
                if (aVar != null) {
                    aVar.setCount(g2Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && s0Var.f13934g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 >= this.P.size()) {
                            groupcalldonor = null;
                            break;
                        } else {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.P.get(i17)).peer_id) == s0Var.f13931c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i17);
                                break;
                            }
                            i17++;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        groupcalldonor.my = UserConfig.getInstance(i14).getClientUserId() == s0Var.f13931c;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(s0Var.f13931c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((t0) arrayList2.get(i18)).f13986b == s0Var.f13931c) {
                                ((t0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i18)).d;
                            }
                        }
                        this.P.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = s0Var.f13934g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, s0Var.f13931c);
                }
                t();
                if (z11) {
                    y yVar = this.f14013c0;
                    AndroidUtilities.cancelRunOnUIThread(yVar);
                    AndroidUtilities.runOnUIThread(yVar, 100L);
                }
                d1 d1Var = this.L;
                if (d1Var != null) {
                    d1Var.Q = arrayList;
                    d1Var.R = arrayList2;
                    return;
                }
                return;
            }
            if (((s0) arrayList.get(i13)).f13929a == i11) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void m() {
        x xVar = this.A;
        if (xVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xVar);
            this.A = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.J).getCurrentTime();
        ArrayList arrayList = this.f14018s;
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t0 t0Var = (t0) obj;
            ArrayList arrayList2 = t0Var.f13989f;
            int size2 = arrayList2.size();
            int iMin = currentTime;
            int iMax = 0;
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                s0 s0Var = (s0) obj2;
                int i12 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (s0Var.f13934g > 0) {
                    iMin = Math.min(iMin, s0Var.d);
                    iMax = Math.max(iMax, s.b(t0Var.f13985a, (int) s0Var.f13934g, 0) + s0Var.d);
                }
                arrayList = arrayList3;
                currentTime = i12;
            }
            int i13 = currentTime;
            jMin = Math.min(jMin, ((long) Math.max(0, iMax - i13)) * 1000);
            arrayList = arrayList;
            currentTime = i13;
        }
        if (jMin >= Long.MAX_VALUE) {
            return;
        }
        x xVar2 = new x(this, 1);
        this.A = xVar2;
        AndroidUtilities.runOnUIThread(xVar2, jMin);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.J;
        final int newMessageId = UserConfig.getInstance(i10).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.K;
        sendgroupcallmessage.message = tL_textWithEntities;
        if (j11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z10 = tLObject instanceof TLRPC.Updates;
                u0 u0Var = this.f14081a;
                int i11 = newMessageId;
                if (!z10) {
                    if (tL_error != null) {
                        AndroidUtilities.runOnUIThread(new hh.v7(u0Var, i11, tL_error, j11, j10, tL_textWithEntities));
                        return;
                    }
                    return;
                }
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                int size = arrayListFindUpdatesAndRemove.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayListFindUpdatesAndRemove.get(i12);
                    i12++;
                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                    if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                        int i13 = tL_updateMessageID.f22635id;
                        ArrayList arrayList = u0Var.f14017r;
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            s0 s0Var = (s0) obj2;
                            if (s0Var.f13929a == i11) {
                                s0Var.f13929a = i13;
                                break;
                            }
                        }
                    }
                }
                MessagesController.getInstance(u0Var.J).processUpdates(updates, false);
            }
        });
        if (this.P != null && j11 > 0) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.P.size()) {
                    groupcalldonor = null;
                    break;
                }
                if (((TL_phone.groupCallDonor) this.P.get(i11)).my) {
                    groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i11);
                    break;
                }
                i11++;
            }
            if (groupcalldonor != null) {
                groupcalldonor.stars += j11;
            } else {
                TL_phone.groupCallDonor groupcalldonor2 = new TL_phone.groupCallDonor();
                groupcalldonor2.my = true;
                groupcalldonor2.anonymous = false;
                groupcalldonor2.peer_id = MessagesController.getInstance(i10).getPeer(j10);
                groupcalldonor2.stars = j11;
                this.P.add(groupcalldonor2);
            }
        }
        l(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime(), r3, j10 == this.I || f(), j10, tL_textWithEntities, j11, false);
        q(false, true);
        return newMessageId;
    }

    public final int o(TLRPC.TL_textWithEntities tL_textWithEntities, long j10) {
        return n(getDefaultPeerId(), tL_textWithEntities, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        setAllowTouches(true);
        super.onAttachedToWindow();
        if (this.K != null) {
            y yVar = this.R;
            AndroidUtilities.cancelRunOnUIThread(yVar);
            AndroidUtilities.runOnUIThread(yVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.K != null) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= s()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p() {
        ec ecVar = this.S;
        y yVar = this.W;
        if (ecVar == null || !ecVar.f28022l) {
            b bVar = new b();
            yb ybVar = new yb(getContext(), bVar);
            this.T = ybVar;
            ybVar.c(R.raw.stars_topup, new String[0]);
            this.T.f34876b.setText(getStarsToastTitle());
            cc ccVar = new cc(getContext(), bVar, true, false);
            this.U = ccVar;
            ccVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.U.f27402a = new x((g2) this, 0);
            xb xbVar = new xb(getContext(), bVar);
            this.V = xbVar;
            xbVar.f34571b = 5000L;
            xbVar.setColor(bVar.N0(org.telegram.ui.ActionBar.g6.Gi));
            this.U.addView(this.V, h7.z5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.U.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.T.setButton(this.U);
            ec ecVarF = ec.f(this.f14010b, this.T, -1);
            this.S = ecVarF;
            ecVarF.f28028r = false;
            ecVarF.k(true);
            this.S.v = yVar;
        }
        this.N++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.N, getDefaultPeerId());
        this.T.f34876b.setText(getStarsToastTitle());
        this.T.f34877c.setText(getStarsToastSubtitle());
        this.V.f34571b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(yVar);
        AndroidUtilities.runOnUIThread(yVar, 5000L);
        long j10 = this.N;
        r1 r1Var = ((g2) this).f13350e0.V1;
        q1 q1Var = r1Var.f13884a;
        q1Var.c(r1Var);
        if (q1Var.f13850s) {
            q1Var.f13850s = false;
            q1Var.a(1.0f, null);
        }
        ArrayList arrayList = q1Var.f13846e;
        while (arrayList.size() > 4) {
            ((oi0) arrayList.remove(0)).A(true);
        }
        int[] iArr = q1Var.f13847f;
        int i10 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
        oi0 oi0Var = new oi0(i10, AndroidUtilities.dp(70.0f), i0.a.k(i10, ""), AndroidUtilities.dp(70.0f));
        oi0Var.f31328r0 = q1Var;
        oi0Var.H(true);
        oi0Var.I(0);
        oi0Var.start();
        arrayList.add(oi0Var);
        q1Var.invalidate();
        org.telegram.ui.Components.i6 i6Var = q1Var.f13845c;
        i6Var.b();
        i6Var.q(i0.a.m(j10, ',', new StringBuilder("+")), true, true);
        o1 o1Var = q1Var.d;
        AndroidUtilities.cancelRunOnUIThread(o1Var);
        AndroidUtilities.runOnUIThread(o1Var, 1500L);
        int[] iArr2 = r1Var.B;
        r1Var.getLocationInWindow(iArr2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - r1Var.f13894y;
        if (j11 < 100) {
            r1Var.A += 0.5f;
        } else {
            r1Var.A = Utilities.clamp(1.0f - ((j11 - 100) / 200.0f), 1.0f, 0.0f) * r1Var.A;
            LaunchActivity.b0((r1Var.getWidth() / 2.0f) + iArr2[0], (r1Var.getHeight() / 2.0f) + iArr2[1], Utilities.clamp(r1Var.A, 0.9f, 0.3f));
            r1Var.A = 0.0f;
            r1Var.f13894y = jCurrentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.K;
        if ((inputGroupCall2 == null ? 0L : inputGroupCall2.f22397id) != (inputGroupCall != null ? inputGroupCall.f22397id : 0L)) {
            this.f14017r.clear();
            z10 = true;
            this.f14014e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.K;
        int i10 = this.J;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.I = j10;
        this.K = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.W.run();
            y yVar = this.R;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(yVar);
                return z10;
            }
            yVar.run();
        }
        return z10;
    }

    public final float s() {
        hh.f1 f1Var = this.f14012c;
        return Math.max(Math.max(0.0f, this.G - f1Var.getTop()), getListViewContentTop()) + f1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.C = z10;
    }

    public void setLivePlayer(d1 d1Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean z10 = this.L == null;
        this.L = d1Var;
        if (!z10 || d1Var == null || (arrayList = d1Var.Q) == null || (arrayList2 = d1Var.R) == null || arrayList == (arrayList3 = this.f14017r) || arrayList2 == (arrayList4 = this.f14018s) || !arrayList3.isEmpty() || !arrayList4.isEmpty()) {
            return;
        }
        arrayList3.addAll(d1Var.Q);
        arrayList4.addAll(d1Var.R);
        this.f14014e.N(true);
        ConnectionsManager.getInstance(this.J).getCurrentTime();
        Collections.sort(arrayList4, new a5.f(this, 24));
        this.f14016n.N(true);
        u(false);
    }

    public final void t() {
        r0 r0Var;
        t0 t0Var;
        n0 n0Var;
        s0 s0Var;
        HashMap map = this.v;
        map.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a5.f(25));
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
            } else {
                map.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i12));
            }
        }
        int i15 = 0;
        while (true) {
            hh.f1 f1Var = this.f14012c;
            if (i15 >= f1Var.getChildCount()) {
                break;
            }
            View childAt = f1Var.getChildAt(i15);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).G) != null) {
                int iE = e(s0Var.f13931c);
                s0 s0Var2 = n0Var.G;
                if (iE != s0Var2.h) {
                    s0Var2.h = iE;
                    n0Var.set(s0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f14017r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            s0 s0Var3 = (s0) arrayList3.get(i16);
            int iE2 = e(s0Var3.f13931c);
            if (iE2 != s0Var3.h) {
                s0Var3.h = iE2;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            ta1 ta1Var = this.f14015f;
            if (i17 >= ta1Var.getChildCount()) {
                break;
            }
            View childAt2 = ta1Var.getChildAt(i17);
            if ((childAt2 instanceof r0) && (t0Var = (r0Var = (r0) childAt2).f13883f) != null) {
                int iE3 = e(t0Var.f13986b);
                t0 t0Var2 = r0Var.f13883f;
                if (iE3 != t0Var2.f13988e) {
                    t0Var2.f13988e = iE3;
                    r0Var.set(t0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f14018s;
            if (i10 >= arrayList4.size()) {
                return;
            }
            t0 t0Var3 = (t0) arrayList4.get(i10);
            int iE4 = e(t0Var3.f13986b);
            if (iE4 != t0Var3.f13988e) {
                t0Var3.f13988e = iE4;
            }
            i10++;
        }
    }

    public final void u(boolean z10) {
        ArrayList arrayList = this.f14018s;
        if (z10 && this.F == (!arrayList.isEmpty())) {
            return;
        }
        boolean zIsEmpty = arrayList.isEmpty();
        this.F = !zIsEmpty;
        hh.f1 f1Var = this.f14012c;
        ta1 ta1Var = this.f14015f;
        if (z10) {
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = f1Var.animate().translationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f));
            er erVar = er.h;
            viewPropertyAnimatorTranslationY.setInterpolator(erVar).setUpdateListener(new ag.u(this, 15)).setDuration(420L).start();
            ta1Var.animate().translationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f)).alpha(this.F ? 1.0f : 0.0f).setInterpolator(erVar).setDuration(420L).start();
            return;
        }
        f1Var.setTranslationY(!zIsEmpty ? 0.0f : AndroidUtilities.dp(35.0f));
        ta1Var.setTranslationY(this.F ? 0.0f : AndroidUtilities.dp(35.0f));
        ta1Var.setAlpha(this.F ? 1.0f : 0.0f);
        invalidate();
    }
}
