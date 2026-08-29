package lh;

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
import jh.db;
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
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u10;
import org.telegram.ui.wa1;
public abstract class u0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public x A;
    public int B;
    public boolean C;
    public long D;
    public final u10 E;
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
    public mc S;
    public gc T;
    public kc U;
    public fc V;
    public final y W;
    public final View f16275a;
    public ValueAnimator f16276a0;
    public final FrameLayout f16277b;
    public boolean f16278b0;
    public final jh.e1 f16279c;
    public final y f16280c0;
    public final f2.j0 d;
    public final e0 f16281e;
    public final wa1 f16282f;
    public final f2.j0 h;
    public final k51 f16283n;
    public final ArrayList f16284r;
    public final ArrayList f16285s;
    public final HashMap v;
    public long f16286w;
    public int f16287x;
    public boolean f16288y;

    public u0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f16284r = new ArrayList();
        this.f16285s = new ArrayList();
        this.v = new HashMap();
        this.B = -1;
        this.C = true;
        this.E = new u10();
        int i10 = UserConfig.selectedAccount;
        this.J = i10;
        this.P = new ArrayList();
        final f2 f2Var = (f2) this;
        this.R = new y(f2Var, 0);
        this.W = new y(f2Var, 1);
        this.f16278b0 = false;
        this.f16280c0 = new y(f2Var, 2);
        this.f16275a = view;
        this.f16277b = frameLayout;
        view.setAlpha(0.5f);
        jh.e1 e1Var = new jh.e1(f2Var, context, 1);
        this.f16279c = e1Var;
        e1Var.setWillNotDraw(false);
        f2.j0 j0Var = new f2.j0(1, true);
        this.d = j0Var;
        e1Var.setLayoutManager(j0Var);
        e0 e0Var = new e0(f2Var, e1Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                f2 f2Var2 = f2Var;
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = f2Var2.f16284r;
                        d1 d1Var = f2Var2.L;
                        if (d1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = d1Var.j();
                        }
                        f2Var2.D = j10;
                        while (i12 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i12);
                            if (s0Var.f16195b || !s0Var.f16197e || s0Var.f16199g >= j10) {
                                int i13 = m0.f15917a;
                                w41 J = w41.J(m0.class);
                                J.G = s0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = f2Var2.f16285s;
                        while (i12 < arrayList3.size()) {
                            int i14 = q0.f16108a;
                            w41 J2 = w41.J(q0.class);
                            J2.G = (t0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, new b());
        this.f16281e = e0Var;
        e1Var.setAdapter(e0Var);
        e0Var.f29939r = false;
        e1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        e1Var.setClipToPadding(false);
        addView(e1Var, i7.f6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        e1Var.setOnItemClickListener(new d0(f2Var, viewGroup, i9Var, 0));
        f0 f0Var = new f0(f2Var);
        f0Var.f6463m = false;
        f0Var.C = false;
        jr jrVar = jr.h;
        f0Var.o(jrVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        e1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new ag.o(f2Var, 25));
        wa1 wa1Var = new wa1(context, 1, null);
        this.f16282f = wa1Var;
        wa1Var.setWillNotDraw(false);
        f2.j0 j0Var2 = new f2.j0(0, false);
        this.h = j0Var2;
        wa1Var.setLayoutManager(j0Var2);
        k51 k51Var = new k51(wa1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                f2 f2Var2 = f2Var;
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var2 = (k51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = f2Var2.f16284r;
                        d1 d1Var = f2Var2.L;
                        if (d1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = d1Var.j();
                        }
                        f2Var2.D = j10;
                        while (i12 < arrayList2.size()) {
                            s0 s0Var = (s0) arrayList2.get(i12);
                            if (s0Var.f16195b || !s0Var.f16197e || s0Var.f16199g >= j10) {
                                int i13 = m0.f15917a;
                                w41 J = w41.J(m0.class);
                                J.G = s0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = f2Var2.f16285s;
                        while (i12 < arrayList3.size()) {
                            int i14 = q0.f16108a;
                            w41 J2 = w41.J(q0.class);
                            J2.G = (t0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f16283n = k51Var;
        wa1Var.setAdapter(k51Var);
        k51Var.f29939r = false;
        wa1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        wa1Var.setClipToPadding(false);
        addView(wa1Var, i7.f6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        wa1Var.setOnItemClickListener(new l4.s0(f2Var, 3));
        f2.l lVar = new f2.l();
        lVar.f6463m = false;
        lVar.C = false;
        lVar.o(jrVar);
        lVar.n(350L);
        wa1Var.setItemAnimator(lVar);
        u(false);
    }

    public static Integer a(u0 u0Var, Long l10) {
        u0Var.W.run();
        u0Var.N = l10.longValue();
        mc M = new tc(u0Var.f16277b, new b()).M(u0Var.getStarsToastTitle(), u0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.f30660r = false;
        M.k(true);
        long j10 = 0;
        u0Var.N = 0L;
        u0Var.O = true;
        int o10 = u0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        d1 d1Var = u0Var.L;
        if (d1Var != null) {
            j10 = d1Var.j();
        }
        if (u0Var.getDefaultPeerId() == u0Var.I && u0Var.f()) {
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
        d1 d1Var = this.L;
        if (d1Var != null && d1Var.l()) {
            TLRPC.GroupCall groupCall = this.L.v;
            if (groupCall == null) {
                z10 = false;
            } else {
                z10 = !groupCall.messages_enabled;
            }
            if (z10) {
                return this.I;
            }
        }
        if (defaultSendAs == null) {
            return UserConfig.getInstance(this.J).getClientUserId();
        }
        return DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        jh.e1 e1Var = this.f16279c;
        int height = e1Var.getHeight();
        for (int i10 = 0; i10 < e1Var.getChildCount(); i10++) {
            height = Math.min(e1Var.getChildAt(i10).getTop(), height);
        }
        return e1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.N)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.N);
        for (int i11 = 0; i11 < this.P.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.P.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.P.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.N = 0L;
        h(getDefaultPeerId());
        r1 r1Var = ((f2) this).f15589e0.V1;
        q1 q1Var = r1Var.f16149a;
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
            arrayList = this.f16284r;
            if (i11 < arrayList.size()) {
                if (((s0) arrayList.get(i11)).f16194a == i10) {
                    s0Var = (s0) arrayList.get(i11);
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                s0Var = null;
                break;
            }
        }
        if (s0Var != null) {
            if (s0Var.f16194a < 0 && s0Var.f16197e) {
                long j10 = s0Var.f16199g;
                if (j10 > 0) {
                    this.M -= j10;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f16285s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((t0) arrayList2.get(i12)).f16254f.contains(s0Var)) {
                    ((t0) arrayList2.get(i12)).f16254f.remove(s0Var);
                    if (((t0) arrayList2.get(i12)).f16254f.isEmpty()) {
                        arrayList2.remove(i12);
                        z10 = true;
                    } else {
                        ((t0) arrayList2.get(i12)).c();
                        m();
                    }
                } else {
                    i12++;
                }
            }
            arrayList.remove(i11);
            this.f16281e.N(true);
            if (z10) {
                ConnectionsManager.getInstance(this.J).getCurrentTime();
                Collections.sort(arrayList2, new c5.e(this, 26));
                this.f16283n.N(true);
                t();
                u(true);
            }
        }
    }

    public final n0 d(int i10) {
        n0 n0Var;
        s0 s0Var;
        int i11 = 0;
        while (true) {
            jh.e1 e1Var = this.f16279c;
            if (i11 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i11);
                if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).G) != null && s0Var.f16194a == i10) {
                    return n0Var;
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
                TLRPC.InputGroupCall inputGroupCall = this.K;
                if (inputGroupCall != null && inputGroupCall.f22409id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f22403id;
                    boolean z10 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.K;
                if (inputGroupCall2 != null && inputGroupCall2.f22409id == longValue) {
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
        if (!this.C) {
            return false;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        jh.e1 e1Var = this.f16279c;
        if (view == e1Var) {
            if (e1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.G - e1Var.getTop()) + e1Var.getY();
            canvas.saveLayerAlpha(e1Var.getX(), e1Var.getY(), e1Var.getX() + e1Var.getWidth(), e1Var.getY() + e1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((e1Var.getY() + e1Var.getHeight()) - max, getListViewTop()) * (1.0f - e1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
            u10 u10Var = this.E;
            u10Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (e1Var.getY() + e1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), e1Var.getHeight() + e1Var.getBottom());
            u10Var.b(canvas, rectF, 3, 1.0f);
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
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.I) {
            long j10 = this.I;
            int i10 = this.J;
            if (j10 >= 0) {
                if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
                    return true;
                }
                return false;
            }
            d1 d1Var = this.L;
            if (d1Var != null && (inputGroupCall = this.K) != null && inputGroupCall.f22409id == d1Var.g() && (groupCall = this.L.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.I)));
        }
        return false;
    }

    public final boolean g() {
        return this.f16278b0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        jh.e1 e1Var = this.f16279c;
        int height = e1Var.getHeight();
        for (int i10 = 0; i10 < e1Var.getChildCount(); i10++) {
            height = Math.min(e1Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f16284r.size();
    }

    public long getStarsCount() {
        return this.M + this.N;
    }

    public int getUnreadMessagesCount() {
        long j10;
        int i10 = 0;
        if (this.B < 0) {
            return 0;
        }
        d1 d1Var = this.L;
        if (d1Var == null) {
            j10 = 0;
        } else {
            j10 = d1Var.j();
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f16284r;
            if (i10 < arrayList.size()) {
                s0 s0Var = (s0) arrayList.get(i10);
                int i12 = s0Var.f16194a;
                if (i12 >= 0 && i12 > this.B && (s0Var.f16195b || !s0Var.f16197e || s0Var.f16199g >= j10)) {
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
        int i11 = this.J;
        db dbVar = new db(getContext(), i11, this.I, null, null, arrayList, !z10, true, clientUserId, h0Var);
        f2 f2Var = (f2) this;
        dbVar.J = f2Var;
        dbVar.L = new l4.s0(f2Var, 2);
        dbVar.show();
    }

    public final void l(int i10, int i11, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        t0 t0Var;
        boolean z12;
        t0 t0Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f16284r;
            if (i13 < arrayList.size()) {
                if (((s0) arrayList.get(i13)).f16194a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.J;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f16195b = z10;
                obj.f16196c = j10;
                obj.f16198f = tL_textWithEntities;
                obj.f16199g = j11;
                obj.f16194a = i11;
                obj.f16197e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = s.b(i14, (int) obj.f16199g, 0);
                long j12 = obj.f16199g;
                ArrayList arrayList2 = this.f16285s;
                boolean z13 = true;
                if (j12 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            if (((t0) arrayList2.get(i15)).f16251b == j10) {
                                t0Var = (t0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        } else {
                            t0Var = null;
                            break;
                        }
                    }
                    if (t0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f16254f = arrayList3;
                        obj2.f16250a = i14;
                        obj2.f16251b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        t0Var2 = obj2;
                    } else {
                        t0Var.f16254f.add(obj);
                        this.f16282f.f1();
                        z12 = false;
                        t0Var2 = t0Var;
                    }
                    t0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new c5.e(this, 26));
                    if (!z11) {
                        this.f16283n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && obj.f16197e) {
                    long j13 = obj.f16199g;
                    if (j13 > 0) {
                        this.M += j13;
                        j();
                    }
                }
                if (obj.f16194a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f16194a < ((s0) arrayList.get(size)).f16194a) {
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
                    this.f16281e.N(true);
                }
                if (i12 <= 0 && !z11 && (!this.f16279c.canScrollVertically(1) || obj.f16194a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = obj.f16194a;
                    if (i16 > 0) {
                        this.B = i16;
                    }
                }
                invalidate();
                f2 f2Var = (f2) this;
                a aVar = f2Var.f15589e0.T1;
                if (aVar != null) {
                    aVar.setCount(f2Var.getUnreadMessagesCount());
                }
                if (!z11 && i11 > 0 && obj.f16199g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.P.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.P.get(i17)).peer_id) == obj.f16196c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i17);
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
                        if (UserConfig.getInstance(i14).getClientUserId() != obj.f16196c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(obj.f16196c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((t0) arrayList2.get(i18)).f16251b == obj.f16196c) {
                                ((t0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((t0) arrayList2.get(i18)).d;
                            }
                        }
                        this.P.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f16199g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f16196c);
                }
                t();
                if (z11) {
                    y yVar = this.f16280c0;
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
        }
    }

    public final void m() {
        int i10;
        x xVar = this.A;
        if (xVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xVar);
            this.A = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.J).getCurrentTime();
        ArrayList arrayList = this.f16285s;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t0 t0Var = (t0) obj;
            ArrayList arrayList2 = t0Var.f16254f;
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
                if (s0Var.f16199g > 0) {
                    i12 = Math.min(i12, s0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, s.b(t0Var.f16250a, (int) s0Var.f16199g, 0) + s0Var.d);
                } else {
                    i10 = i15;
                }
                arrayList = arrayList3;
                currentTime = i10;
            }
            int i16 = currentTime;
            j10 = Math.min(j10, Math.max(0, i13 - i16) * 1000);
            arrayList = arrayList;
            currentTime = i16;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        x xVar2 = new x(this, 1);
        this.A = xVar2;
        AndroidUtilities.runOnUIThread(xVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.J;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.K;
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
                u0 u0Var = u0.this;
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
                            int i15 = tL_updateMessageID.f22647id;
                            ArrayList arrayList = u0Var.f16284r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    s0 s0Var = (s0) obj2;
                                    if (s0Var.f16194a == i13) {
                                        s0Var.f16194a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(u0Var.J).processUpdates(updates, false);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new jh.t7(u0Var, i13, tL_error, j11, j10, tL_textWithEntities));
                }
            }
        });
        if (this.P != null && i12 > 0) {
            int i13 = 0;
            while (true) {
                if (i13 < this.P.size()) {
                    if (((TL_phone.groupCallDonor) this.P.get(i13)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i13);
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
                this.P.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 != this.I && !f()) {
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
        mc mcVar = this.S;
        y yVar = this.W;
        if (mcVar == null || !mcVar.f30654l) {
            b bVar = new b();
            gc gcVar = new gc(getContext(), bVar);
            this.T = gcVar;
            gcVar.c(R.raw.stars_topup, new String[0]);
            this.T.f28865b.setText(getStarsToastTitle());
            kc kcVar = new kc(getContext(), bVar, true, false);
            this.U = kcVar;
            kcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.U.f30007a = new x((f2) this, 0);
            fc fcVar = new fc(getContext(), bVar);
            this.V = fcVar;
            fcVar.f28371b = 5000L;
            fcVar.setColor(bVar.C0(org.telegram.ui.ActionBar.g6.Gi));
            this.U.addView(this.V, i7.f6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.U.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.T.setButton(this.U);
            mc f9 = mc.f(this.f16277b, this.T, -1);
            this.S = f9;
            f9.f30660r = false;
            f9.k(true);
            this.S.v = yVar;
        }
        this.N++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.N, getDefaultPeerId());
        this.T.f28865b.setText(getStarsToastTitle());
        this.T.f28866c.setText(getStarsToastSubtitle());
        this.V.f28371b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(yVar);
        AndroidUtilities.runOnUIThread(yVar, 5000L);
        long j10 = this.N;
        r1 r1Var = ((f2) this).f15589e0.V1;
        q1 q1Var = r1Var.f16149a;
        q1Var.c(r1Var);
        if (q1Var.f16116s) {
            q1Var.f16116s = false;
            q1Var.a(1.0f, null);
        }
        ArrayList arrayList = q1Var.f16112e;
        while (arrayList.size() > 4) {
            ((xi0) arrayList.remove(0)).A(true);
        }
        int[] iArr2 = q1Var.f16113f;
        int i10 = iArr2[Utilities.fastRandom.nextInt(iArr2.length)];
        xi0 xi0Var = new xi0(i10, AndroidUtilities.dp(70.0f), j7.l1.k(i10, ""), AndroidUtilities.dp(70.0f));
        xi0Var.f34753r0 = q1Var;
        xi0Var.H(true);
        xi0Var.I(0);
        xi0Var.start();
        arrayList.add(xi0Var);
        q1Var.invalidate();
        org.telegram.ui.Components.n6 n6Var = q1Var.f16111c;
        n6Var.b();
        n6Var.q(j7.l1.m(j10, ',', new StringBuilder("+")), true, true);
        o1 o1Var = q1Var.d;
        AndroidUtilities.cancelRunOnUIThread(o1Var);
        AndroidUtilities.runOnUIThread(o1Var, 1500L);
        r1Var.getLocationInWindow(r1Var.B);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - r1Var.f16159y;
        if (j11 < 100) {
            r1Var.A += 0.5f;
        } else {
            r1Var.A = Utilities.clamp(1.0f - (((float) (j11 - 100)) / 200.0f), 1.0f, 0.0f) * r1Var.A;
            LaunchActivity.b0((r1Var.getWidth() / 2.0f) + iArr[0], (r1Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(r1Var.A, 0.9f, 0.3f));
            r1Var.A = 0.0f;
            r1Var.f16159y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z10, boolean z11);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        long j11;
        boolean z10;
        TLRPC.InputGroupCall inputGroupCall2 = this.K;
        long j12 = 0;
        if (inputGroupCall2 == null) {
            j11 = 0;
        } else {
            j11 = inputGroupCall2.f22409id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f22409id;
        }
        if (j11 != j12) {
            this.f16284r.clear();
            z10 = true;
            this.f16281e.N(true);
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
        jh.e1 e1Var = this.f16279c;
        return Math.max(Math.max(0.0f, this.G - e1Var.getTop()), getListViewContentTop()) + e1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.C = z10;
    }

    public void setLivePlayer(d1 d1Var) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.L == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L = d1Var;
        if (z10 && d1Var != null && (arrayList = d1Var.Q) != null && (arrayList2 = d1Var.R) != null && arrayList != (arrayList3 = this.f16284r) && arrayList2 != (arrayList4 = this.f16285s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(d1Var.Q);
            arrayList4.addAll(d1Var.R);
            this.f16281e.N(true);
            ConnectionsManager.getInstance(this.J).getCurrentTime();
            Collections.sort(arrayList4, new c5.e(this, 26));
            this.f16283n.N(true);
            u(false);
        }
    }

    public final void t() {
        r0 r0Var;
        t0 t0Var;
        n0 n0Var;
        s0 s0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new c5.e(27));
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
            jh.e1 e1Var = this.f16279c;
            if (i15 >= e1Var.getChildCount()) {
                break;
            }
            View childAt = e1Var.getChildAt(i15);
            if ((childAt instanceof n0) && (s0Var = (n0Var = (n0) childAt).G) != null) {
                int e10 = e(s0Var.f16196c);
                s0 s0Var2 = n0Var.G;
                if (e10 != s0Var2.h) {
                    s0Var2.h = e10;
                    n0Var.set(s0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f16284r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            s0 s0Var3 = (s0) arrayList3.get(i16);
            int e11 = e(s0Var3.f16196c);
            if (e11 != s0Var3.h) {
                s0Var3.h = e11;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            wa1 wa1Var = this.f16282f;
            if (i17 >= wa1Var.getChildCount()) {
                break;
            }
            View childAt2 = wa1Var.getChildAt(i17);
            if ((childAt2 instanceof r0) && (t0Var = (r0Var = (r0) childAt2).f16148f) != null) {
                int e12 = e(t0Var.f16251b);
                t0 t0Var2 = r0Var.f16148f;
                if (e12 != t0Var2.f16253e) {
                    t0Var2.f16253e = e12;
                    r0Var.set(t0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f16285s;
            if (i10 < arrayList4.size()) {
                t0 t0Var3 = (t0) arrayList4.get(i10);
                int e13 = e(t0Var3.f16251b);
                if (e13 != t0Var3.f16253e) {
                    t0Var3.f16253e = e13;
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
        ArrayList arrayList = this.f16285s;
        if (z10 && this.F == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.F = !isEmpty;
        float f9 = 1.0f;
        jh.e1 e1Var = this.f16279c;
        wa1 wa1Var = this.f16282f;
        if (z10) {
            ViewPropertyAnimator animate = e1Var.animate();
            if (this.F) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            jr jrVar = jr.h;
            translationY.setInterpolator(jrVar).setUpdateListener(new bg.q1(this, 21)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = wa1Var.animate();
            if (this.F) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(dp4);
            if (!this.F) {
                f9 = 0.0f;
            }
            translationY2.alpha(f9).setInterpolator(jrVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(35.0f);
        }
        e1Var.setTranslationY(dp);
        if (this.F) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(35.0f);
        }
        wa1Var.setTranslationY(dp2);
        if (!this.F) {
            f9 = 0.0f;
        }
        wa1Var.setAlpha(f9);
        invalidate();
    }
}
