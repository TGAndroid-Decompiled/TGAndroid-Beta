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
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.n20;
public abstract class o1 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public n0 E;
    public int F;
    public boolean G;
    public long H;
    public final n20 I;
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
    public org.telegram.ui.Components.oc W;
    public final View f1326a;
    public org.telegram.ui.Components.ic f1327a0;
    public final FrameLayout f1328b;
    public org.telegram.ui.Components.mc f1329b0;
    public final w0 f1330c;
    public org.telegram.ui.Components.hc f1331c0;
    public final s4.c0 d;
    public final o0 f1332d0;
    public final x0 e;
    public ValueAnimator f1333e0;
    public final fc1 f1334f;
    public boolean f1335f0;
    public final o0 f1336g0;
    public final s4.c0 h;
    public final x51 f1337n;
    public final ArrayList f1338r;
    public final ArrayList f1339s;
    public final HashMap v;
    public long f1340w;
    public int f1341x;
    public boolean f1342y;

    public o1(Context context, jc jcVar, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f1338r = new ArrayList();
        this.f1339s = new ArrayList();
        this.v = new HashMap();
        this.F = -1;
        this.G = true;
        this.I = new n20();
        int i10 = UserConfig.selectedAccount;
        this.N = i10;
        this.T = new ArrayList();
        final r3 r3Var = (r3) this;
        this.V = new o0(r3Var, 0);
        this.f1332d0 = new o0(r3Var, 1);
        this.f1335f0 = false;
        this.f1336g0 = new o0(r3Var, 2);
        this.f1326a = view;
        this.f1328b = frameLayout;
        view.setAlpha(0.5f);
        w0 w0Var = new w0(r3Var, context, 0);
        this.f1330c = w0Var;
        w0Var.setWillNotDraw(false);
        s4.c0 c0Var = new s4.c0(1, true);
        this.d = c0Var;
        w0Var.setLayoutManager(c0Var);
        x0 x0Var = new x0(r3Var, w0Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j3;
                int i11 = r2;
                int i12 = 0;
                r3 r3Var2 = r3Var;
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var = (x51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = r3Var2.f1338r;
                        d2 d2Var = r3Var2.P;
                        if (d2Var == null) {
                            j3 = 0;
                        } else {
                            j3 = d2Var.j();
                        }
                        r3Var2.H = j3;
                        while (i12 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i12);
                            if (m1Var.f1228b || !m1Var.e || m1Var.f1231g >= j3) {
                                int i13 = g1.f891a;
                                j51 J = j51.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = r3Var2.f1339s;
                        while (i12 < arrayList3.size()) {
                            int i14 = k1.f1127a;
                            j51 J2 = j51.J(k1.class);
                            J2.G = (n1) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, new d());
        this.e = x0Var;
        w0Var.setAdapter(x0Var);
        x0Var.f29854r = false;
        w0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        w0Var.setClipToPadding(false);
        addView(w0Var, w7.x5.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        w0Var.setOnItemClickListener(new u0(r3Var, viewGroup, jcVar, 0));
        y0 y0Var = new y0(r3Var);
        y0Var.f42737m = false;
        y0Var.C = false;
        qr qrVar = qr.h;
        y0Var.o(qrVar);
        y0Var.n(280L);
        y0Var.D = 14L;
        w0Var.setItemAnimator(y0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new v0(r3Var, 0));
        fc1 fc1Var = new fc1(context, 1, null);
        this.f1334f = fc1Var;
        fc1Var.setWillNotDraw(false);
        s4.c0 c0Var2 = new s4.c0(0, false);
        this.h = c0Var2;
        fc1Var.setLayoutManager(c0Var2);
        x51 x51Var = new x51(fc1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j3;
                int i11 = r2;
                int i12 = 0;
                r3 r3Var2 = r3Var;
                ArrayList arrayList = (ArrayList) obj;
                x51 x51Var2 = (x51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = r3Var2.f1338r;
                        d2 d2Var = r3Var2.P;
                        if (d2Var == null) {
                            j3 = 0;
                        } else {
                            j3 = d2Var.j();
                        }
                        r3Var2.H = j3;
                        while (i12 < arrayList2.size()) {
                            m1 m1Var = (m1) arrayList2.get(i12);
                            if (m1Var.f1228b || !m1Var.e || m1Var.f1231g >= j3) {
                                int i13 = g1.f891a;
                                j51 J = j51.J(g1.class);
                                J.G = m1Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = r3Var2.f1339s;
                        while (i12 < arrayList3.size()) {
                            int i14 = k1.f1127a;
                            j51 J2 = j51.J(k1.class);
                            J2.G = (n1) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f1337n = x51Var;
        fc1Var.setAdapter(x51Var);
        x51Var.f29854r = false;
        fc1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        fc1Var.setClipToPadding(false);
        addView(fc1Var, w7.x5.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        fc1Var.setOnItemClickListener(new a1.c(r3Var, 4));
        s4.j jVar = new s4.j();
        jVar.f42737m = false;
        jVar.C = false;
        jVar.o(qrVar);
        jVar.n(350L);
        fc1Var.setItemAnimator(jVar);
        u(false);
    }

    public static Integer a(o1 o1Var, Long l4) {
        o1Var.f1332d0.run();
        o1Var.R = l4.longValue();
        org.telegram.ui.Components.oc M = new vc(o1Var.f1328b, new d()).M(o1Var.getStarsToastTitle(), o1Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.f26713r = false;
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
        w0 w0Var = this.f1330c;
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
        x2 x2Var = ((r3) this).f1462i0.Z1;
        w2 w2Var = x2Var.f1686a;
        w2Var.c(x2Var);
        w2Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        m1 m1Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f1338r;
            if (i11 < arrayList.size()) {
                if (((m1) arrayList.get(i11)).f1227a == i10) {
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
            if (m1Var.f1227a < 0 && m1Var.e) {
                long j3 = m1Var.f1231g;
                if (j3 > 0) {
                    this.Q -= j3;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f1339s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((n1) arrayList2.get(i12)).f1282f.contains(m1Var)) {
                    ((n1) arrayList2.get(i12)).f1282f.remove(m1Var);
                    if (((n1) arrayList2.get(i12)).f1282f.isEmpty()) {
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
            this.e.N(true);
            if (z10) {
                ConnectionsManager.getInstance(this.N).getCurrentTime();
                Collections.sort(arrayList2, new a4.e(this, 2));
                this.f1337n.N(true);
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
            w0 w0Var = this.f1330c;
            if (i11 < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i11);
                if ((childAt instanceof h1) && (m1Var = (h1Var = (h1) childAt).K) != null && m1Var.f1227a == i10) {
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
                if (inputGroupCall != null && inputGroupCall.f18138id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f18132id;
                    boolean z10 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.O;
                if (inputGroupCall2 != null && inputGroupCall2.f18138id == longValue) {
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
        w0 w0Var = this.f1330c;
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
            n20 n20Var = this.I;
            n20Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (w0Var.getY() + w0Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), w0Var.getHeight() + w0Var.getBottom());
            n20Var.b(canvas, rectF, 3, 1.0f);
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
            int i10 = this.N;
            if (j3 >= 0) {
                if (j3 == UserConfig.getInstance(i10).getClientUserId()) {
                    return true;
                }
                return false;
            }
            d2 d2Var = this.P;
            if (d2Var != null && (inputGroupCall = this.O) != null && inputGroupCall.f18138id == d2Var.g() && (groupCall = this.P.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.M)));
        }
        return false;
    }

    public final boolean g() {
        return this.f1335f0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        w0 w0Var = this.f1330c;
        int height = w0Var.getHeight();
        for (int i10 = 0; i10 < w0Var.getChildCount(); i10++) {
            height = Math.min(w0Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f1338r.size();
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
            ArrayList arrayList = this.f1338r;
            if (i10 < arrayList.size()) {
                m1 m1Var = (m1) arrayList.get(i10);
                int i12 = m1Var.f1227a;
                if (i12 >= 0 && i12 > this.F && (m1Var.f1228b || !m1Var.e || m1Var.f1231g >= j3)) {
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
        this.f1332d0.run();
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
        yh.q8 q8Var = new yh.q8(getContext(), i11, this.M, null, null, arrayList, !z10, true, clientUserId, a1Var);
        r3 r3Var = (r3) this;
        q8Var.N = r3Var;
        q8Var.P = new a1.c(r3Var, 3);
        q8Var.show();
    }

    public final void l(int i10, int i11, boolean z10, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, boolean z11) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        n1 n1Var;
        boolean z12;
        n1 n1Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f1338r;
            if (i13 < arrayList.size()) {
                if (((m1) arrayList.get(i13)).f1227a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.N;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f1228b = z10;
                obj.f1229c = j3;
                obj.f1230f = tL_textWithEntities;
                obj.f1231g = j10;
                obj.f1227a = i11;
                obj.e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = g0.b(i14, (int) obj.f1231g, 0);
                long j11 = obj.f1231g;
                ArrayList arrayList2 = this.f1339s;
                boolean z13 = true;
                if (j11 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            if (((n1) arrayList2.get(i15)).f1280b == j3) {
                                n1Var = (n1) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        } else {
                            n1Var = null;
                            break;
                        }
                    }
                    if (n1Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f1282f = arrayList3;
                        obj2.f1279a = i14;
                        obj2.f1280b = j3;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        n1Var2 = obj2;
                    } else {
                        n1Var.f1282f.add(obj);
                        this.f1334f.g1();
                        z12 = false;
                        n1Var2 = n1Var;
                    }
                    n1Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a4.e(this, 2));
                    if (!z11) {
                        this.f1337n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && obj.e) {
                    long j12 = obj.f1231g;
                    if (j12 > 0) {
                        this.Q += j12;
                        j();
                    }
                }
                if (obj.f1227a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f1227a < ((m1) arrayList.get(size)).f1227a) {
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
                if (i12 <= 0 && !z11 && (!this.f1330c.canScrollVertically(1) || obj.f1227a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = obj.f1227a;
                    if (i16 > 0) {
                        this.F = i16;
                    }
                }
                invalidate();
                r3 r3Var = (r3) this;
                c cVar = r3Var.f1462i0.X1;
                if (cVar != null) {
                    cVar.setCount(r3Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f1231g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.T.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.T.get(i17)).peer_id) == obj.f1229c) {
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
                        if (UserConfig.getInstance(i14).getClientUserId() != obj.f1229c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(obj.f1229c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((n1) arrayList2.get(i18)).f1280b == obj.f1229c) {
                                ((n1) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((n1) arrayList2.get(i18)).d;
                            }
                        }
                        this.T.add(groupcalldonor);
                    }
                    long j13 = groupcalldonor.stars;
                    long j14 = obj.f1231g;
                    long j15 = j13 + j14;
                    groupcalldonor.stars = j15;
                    i((int) j15, (int) j14, obj.f1229c);
                }
                t();
                if (z11) {
                    o0 o0Var = this.f1336g0;
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
        n0 n0Var = this.E;
        if (n0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n0Var);
            this.E = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.N).getCurrentTime();
        ArrayList arrayList = this.f1339s;
        int size = arrayList.size();
        long j3 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            n1 n1Var = (n1) obj;
            ArrayList arrayList2 = n1Var.f1282f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                m1 m1Var = (m1) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (m1Var.f1231g > 0) {
                    i12 = Math.min(i12, m1Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, g0.b(n1Var.f1279a, (int) m1Var.f1231g, 0) + m1Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            int i16 = currentTime;
            j3 = Math.min(j3, Math.max(0, i13 - i16) * 1000);
            arrayList = arrayList;
            currentTime = i16;
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
                            int i15 = tL_updateMessageID.f18374id;
                            ArrayList arrayList = o1Var.f1338r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    m1 m1Var = (m1) obj2;
                                    if (m1Var.f1227a == i13) {
                                        m1Var.f1227a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(o1Var.N).processUpdates(updates, false);
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
        org.telegram.ui.Components.oc ocVar = this.W;
        o0 o0Var = this.f1332d0;
        if (ocVar == null || !ocVar.f26707l) {
            d dVar = new d();
            org.telegram.ui.Components.ic icVar = new org.telegram.ui.Components.ic(getContext(), dVar);
            this.f1327a0 = icVar;
            icVar.c(R.raw.stars_topup, new String[0]);
            this.f1327a0.f24926b.setText(getStarsToastTitle());
            org.telegram.ui.Components.mc mcVar = new org.telegram.ui.Components.mc(getContext(), dVar, true, false);
            this.f1329b0 = mcVar;
            mcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.f1329b0.f26125a = new n0((r3) this, 0);
            org.telegram.ui.Components.hc hcVar = new org.telegram.ui.Components.hc(getContext(), dVar);
            this.f1331c0 = hcVar;
            hcVar.f24626b = 5000L;
            hcVar.setColor(dVar.G0(org.telegram.ui.ActionBar.j6.Gi));
            this.f1329b0.addView(this.f1331c0, w7.x5.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.f1329b0.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.f1327a0.setButton(this.f1329b0);
            org.telegram.ui.Components.oc f7 = org.telegram.ui.Components.oc.f(this.f1328b, this.f1327a0, -1);
            this.W = f7;
            f7.f26713r = false;
            f7.k(true);
            this.W.v = o0Var;
        }
        this.R++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.R, getDefaultPeerId());
        this.f1327a0.f24926b.setText(getStarsToastTitle());
        this.f1327a0.f24927c.setText(getStarsToastSubtitle());
        this.f1331c0.f24626b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(o0Var);
        AndroidUtilities.runOnUIThread(o0Var, 5000L);
        long j3 = this.R;
        x2 x2Var = ((r3) this).f1462i0.Z1;
        w2 w2Var = x2Var.f1686a;
        w2Var.c(x2Var);
        if (w2Var.f1647s) {
            w2Var.f1647s = false;
            w2Var.a(1.0f, null);
        }
        ArrayList arrayList = w2Var.e;
        while (arrayList.size() > 4) {
            ((yi0) arrayList.remove(0)).C(true);
        }
        int[] iArr2 = w2Var.f1644f;
        yi0 yi0Var = new yi0(iArr2[Utilities.fastRandom.nextInt(iArr2.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        yi0Var.R(w2Var);
        yi0Var.J(true);
        yi0Var.K(0);
        yi0Var.start();
        arrayList.add(yi0Var);
        w2Var.invalidate();
        org.telegram.ui.Components.m6 m6Var = w2Var.f1643c;
        m6Var.b();
        m6Var.q(hg.k0.k(j3, ',', new StringBuilder("+")), true, true);
        s2 s2Var = w2Var.d;
        AndroidUtilities.cancelRunOnUIThread(s2Var);
        AndroidUtilities.runOnUIThread(s2Var, 1500L);
        x2Var.getLocationInWindow(x2Var.F);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - x2Var.f1695y;
        if (j10 < 100) {
            x2Var.E += 0.5f;
        } else {
            x2Var.E = Utilities.clamp(1.0f - (((float) (j10 - 100)) / 200.0f), 1.0f, 0.0f) * x2Var.E;
            LaunchActivity.b0((x2Var.getWidth() / 2.0f) + iArr[0], (x2Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(x2Var.E, 0.9f, 0.3f));
            x2Var.E = 0.0f;
            x2Var.f1695y = currentTimeMillis;
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
            j10 = inputGroupCall2.f18138id;
        }
        if (inputGroupCall != null) {
            j11 = inputGroupCall.f18138id;
        }
        if (j10 != j11) {
            this.f1338r.clear();
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
        this.M = j3;
        this.O = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.f1332d0.run();
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
        w0 w0Var = this.f1330c;
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
        if (z10 && d2Var != null && (arrayList = d2Var.U) != null && (arrayList2 = d2Var.V) != null && arrayList != (arrayList3 = this.f1338r) && arrayList2 != (arrayList4 = this.f1339s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(d2Var.U);
            arrayList4.addAll(d2Var.V);
            this.e.N(true);
            ConnectionsManager.getInstance(this.N).getCurrentTime();
            Collections.sort(arrayList4, new a4.e(this, 2));
            this.f1337n.N(true);
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
        Collections.sort(arrayList, new a4.e(3));
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
            w0 w0Var = this.f1330c;
            if (i15 >= w0Var.getChildCount()) {
                break;
            }
            View childAt = w0Var.getChildAt(i15);
            if ((childAt instanceof h1) && (m1Var = (h1Var = (h1) childAt).K) != null) {
                int e = e(m1Var.f1229c);
                m1 m1Var2 = h1Var.K;
                if (e != m1Var2.h) {
                    m1Var2.h = e;
                    h1Var.set(m1Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f1338r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            m1 m1Var3 = (m1) arrayList3.get(i16);
            int e7 = e(m1Var3.f1229c);
            if (e7 != m1Var3.h) {
                m1Var3.h = e7;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            fc1 fc1Var = this.f1334f;
            if (i17 >= fc1Var.getChildCount()) {
                break;
            }
            View childAt2 = fc1Var.getChildAt(i17);
            if ((childAt2 instanceof l1) && (n1Var = (l1Var = (l1) childAt2).f1174f) != null) {
                int e10 = e(n1Var.f1280b);
                n1 n1Var2 = l1Var.f1174f;
                if (e10 != n1Var2.e) {
                    n1Var2.e = e10;
                    l1Var.set(n1Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f1339s;
            if (i10 < arrayList4.size()) {
                n1 n1Var3 = (n1) arrayList4.get(i10);
                int e11 = e(n1Var3.f1280b);
                if (e11 != n1Var3.e) {
                    n1Var3.e = e11;
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
        ArrayList arrayList = this.f1339s;
        if (z10 && this.J == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.J = !isEmpty;
        float f7 = 1.0f;
        w0 w0Var = this.f1330c;
        fc1 fc1Var = this.f1334f;
        if (z10) {
            ViewPropertyAnimator animate = w0Var.animate();
            if (this.J) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            qr qrVar = qr.h;
            translationY.setInterpolator(qrVar).setUpdateListener(new a(this, 2)).setDuration(420L).start();
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
            translationY2.alpha(f7).setInterpolator(qrVar).setDuration(420L).start();
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
