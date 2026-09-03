package oh;

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
import mh.eb;
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
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h20;
import org.telegram.ui.qb1;
public abstract class v0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public x B;
    public int C;
    public boolean D;
    public long E;
    public final h20 F;
    public boolean G;
    public float H;
    public float I;
    public long J;
    public final int K;
    public TLRPC.InputGroupCall L;
    public e1 M;
    public long N;
    public long O;
    public boolean P;
    public ArrayList Q;
    public boolean R;
    public final y S;
    public ic T;
    public cc U;
    public gc V;
    public bc W;
    public final View f17829a;
    public final y f17830a0;
    public final FrameLayout f17831b;
    public ValueAnimator f17832b0;
    public final mh.d1 f17833c;
    public boolean f17834c0;
    public final f2.j0 d;
    public final y f17835d0;
    public final e0 f17836e;
    public final qb1 f17837f;
    public final f2.j0 h;
    public final w51 f17838n;
    public final ArrayList f17839r;
    public final ArrayList f17840s;
    public final HashMap v;
    public long f17841w;
    public int f17842x;
    public boolean f17843y;

    public v0(Context context, i9 i9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f17839r = new ArrayList();
        this.f17840s = new ArrayList();
        this.v = new HashMap();
        this.C = -1;
        this.D = true;
        this.F = new h20();
        int i10 = UserConfig.selectedAccount;
        this.K = i10;
        this.Q = new ArrayList();
        final h2 h2Var = (h2) this;
        this.S = new y(h2Var, 0);
        this.f17830a0 = new y(h2Var, 1);
        this.f17834c0 = false;
        this.f17835d0 = new y(h2Var, 2);
        this.f17829a = view;
        this.f17831b = frameLayout;
        view.setAlpha(0.5f);
        mh.d1 d1Var = new mh.d1(h2Var, context, 1);
        this.f17833c = d1Var;
        d1Var.setWillNotDraw(false);
        f2.j0 j0Var = new f2.j0(1, true);
        this.d = j0Var;
        d1Var.setLayoutManager(j0Var);
        e0 e0Var = new e0(h2Var, d1Var, context, i10, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var = (w51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.f17839r;
                        e1 e1Var = h2Var2.M;
                        if (e1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = e1Var.j();
                        }
                        h2Var2.E = j10;
                        while (i12 < arrayList2.size()) {
                            t0 t0Var = (t0) arrayList2.get(i12);
                            if (t0Var.f17758b || !t0Var.f17760e || t0Var.f17762g >= j10) {
                                int i13 = n0.f17478a;
                                h51 J = h51.J(n0.class);
                                J.G = t0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = h2Var2.f17840s;
                        while (i12 < arrayList3.size()) {
                            int i14 = r0.f17676a;
                            h51 J2 = h51.J(r0.class);
                            J2.G = (u0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, new b());
        this.f17836e = e0Var;
        d1Var.setAdapter(e0Var);
        e0Var.f32651r = false;
        d1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        d1Var.setClipToPadding(false);
        addView(d1Var, k7.c6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        d1Var.setOnItemClickListener(new d0(h2Var, viewGroup, i9Var, 0));
        f0 f0Var = new f0(h2Var);
        f0Var.f5910m = false;
        f0Var.C = false;
        pr prVar = pr.h;
        f0Var.o(prVar);
        f0Var.n(280L);
        f0Var.D = 14L;
        d1Var.setItemAnimator(f0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(h2Var, 25));
        qb1 qb1Var = new qb1(context, 1, null);
        this.f17837f = qb1Var;
        qb1Var.setWillNotDraw(false);
        f2.j0 j0Var2 = new f2.j0(0, false);
        this.h = j0Var2;
        qb1Var.setLayoutManager(j0Var2);
        w51 w51Var = new w51(qb1Var, context, i10, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i11 = r2;
                int i12 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                w51 w51Var2 = (w51) obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.f17839r;
                        e1 e1Var = h2Var2.M;
                        if (e1Var == null) {
                            j10 = 0;
                        } else {
                            j10 = e1Var.j();
                        }
                        h2Var2.E = j10;
                        while (i12 < arrayList2.size()) {
                            t0 t0Var = (t0) arrayList2.get(i12);
                            if (t0Var.f17758b || !t0Var.f17760e || t0Var.f17762g >= j10) {
                                int i13 = n0.f17478a;
                                h51 J = h51.J(n0.class);
                                J.G = t0Var;
                                arrayList.add(J);
                            }
                            i12++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = h2Var2.f17840s;
                        while (i12 < arrayList3.size()) {
                            int i14 = r0.f17676a;
                            h51 J2 = h51.J(r0.class);
                            J2.G = (u0) arrayList3.get(i12);
                            arrayList.add(J2);
                            i12++;
                        }
                        return;
                }
            }
        }, null);
        this.f17838n = w51Var;
        qb1Var.setAdapter(w51Var);
        w51Var.f32651r = false;
        qb1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        qb1Var.setClipToPadding(false);
        addView(qb1Var, k7.c6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        qb1Var.setOnItemClickListener(new mh.m5(h2Var, 8));
        f2.l lVar = new f2.l();
        lVar.f5910m = false;
        lVar.C = false;
        lVar.o(prVar);
        lVar.n(350L);
        qb1Var.setItemAnimator(lVar);
        u(false);
    }

    public static Integer a(v0 v0Var, Long l10) {
        v0Var.f17830a0.run();
        v0Var.O = l10.longValue();
        ic M = new qc(v0Var.f17831b, new b()).M(v0Var.getStarsToastTitle(), v0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z4 = false;
        M.f27786r = false;
        M.k(true);
        long j10 = 0;
        v0Var.O = 0L;
        v0Var.P = true;
        int o10 = v0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        e1 e1Var = v0Var.M;
        if (e1Var != null) {
            j10 = e1Var.j();
        }
        if (v0Var.getDefaultPeerId() == v0Var.J && v0Var.f()) {
            z4 = true;
        }
        if (l10.longValue() < j10 && !z4) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o10);
    }

    private long getDefaultPeerId() {
        boolean z4;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        e1 e1Var = this.M;
        if (e1Var != null && e1Var.l()) {
            TLRPC.GroupCall groupCall = this.M.v;
            if (groupCall == null) {
                z4 = false;
            } else {
                z4 = !groupCall.messages_enabled;
            }
            if (z4) {
                return this.J;
            }
        }
        if (defaultSendAs == null) {
            return UserConfig.getInstance(this.K).getClientUserId();
        }
        return DialogObject.getPeerDialogId(defaultSendAs);
    }

    private int getListViewTop() {
        mh.d1 d1Var = this.f17833c;
        int height = d1Var.getHeight();
        for (int i10 = 0; i10 < d1Var.getChildCount(); i10++) {
            height = Math.min(d1Var.getChildAt(i10).getTop(), height);
        }
        return d1Var.getHeight() - height;
    }

    private CharSequence getStarsToastSubtitle() {
        return AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) this.O)));
    }

    private String getStarsToastTitle() {
        return LocaleController.getString(R.string.StarsSentTitle);
    }

    private int getTotalMyStars() {
        int i10 = (int) (0 + this.O);
        for (int i11 = 0; i11 < this.Q.size(); i11++) {
            if (((TL_phone.groupCallDonor) this.Q.get(i11)).my) {
                i10 = (int) (i10 + ((TL_phone.groupCallDonor) this.Q.get(i11)).stars);
            }
        }
        return i10;
    }

    public final void b() {
        this.O = 0L;
        h(getDefaultPeerId());
        s1 s1Var = ((h2) this).f17177f0.W1;
        r1 r1Var = s1Var.f17715a;
        r1Var.c(s1Var);
        r1Var.b();
        j();
    }

    public final void c(int i10) {
        ArrayList arrayList;
        t0 t0Var;
        ArrayList arrayList2;
        boolean z4 = false;
        int i11 = 0;
        while (true) {
            arrayList = this.f17839r;
            if (i11 < arrayList.size()) {
                if (((t0) arrayList.get(i11)).f17757a == i10) {
                    t0Var = (t0) arrayList.get(i11);
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                t0Var = null;
                break;
            }
        }
        if (t0Var != null) {
            if (t0Var.f17757a < 0 && t0Var.f17760e) {
                long j10 = t0Var.f17762g;
                if (j10 > 0) {
                    this.N -= j10;
                    j();
                }
            }
            int i12 = 0;
            while (true) {
                arrayList2 = this.f17840s;
                if (i12 >= arrayList2.size()) {
                    break;
                } else if (((u0) arrayList2.get(i12)).f17804f.contains(t0Var)) {
                    ((u0) arrayList2.get(i12)).f17804f.remove(t0Var);
                    if (((u0) arrayList2.get(i12)).f17804f.isEmpty()) {
                        arrayList2.remove(i12);
                        z4 = true;
                    } else {
                        ((u0) arrayList2.get(i12)).c();
                        m();
                    }
                } else {
                    i12++;
                }
            }
            arrayList.remove(i11);
            this.f17836e.N(true);
            if (z4) {
                ConnectionsManager.getInstance(this.K).getCurrentTime();
                Collections.sort(arrayList2, new e5.f(this, 27));
                this.f17838n.N(true);
                t();
                u(true);
            }
        }
    }

    public final o0 d(int i10) {
        o0 o0Var;
        t0 t0Var;
        int i11 = 0;
        while (true) {
            mh.d1 d1Var = this.f17833c;
            if (i11 < d1Var.getChildCount()) {
                View childAt = d1Var.getChildAt(i11);
                if ((childAt instanceof o0) && (t0Var = (o0Var = (o0) childAt).H) != null && t0Var.f17757a == i10) {
                    return o0Var;
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
                TLRPC.InputGroupCall inputGroupCall = this.L;
                if (inputGroupCall != null && inputGroupCall.f20862id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i13 = groupCallMessage.date;
                    int i14 = groupCallMessage.f20856id;
                    boolean z4 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i13, i14, z4, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.L;
                if (inputGroupCall2 != null && inputGroupCall2.f20862id == longValue) {
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
        if (!this.D) {
            return false;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getY() < s()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mh.d1 d1Var = this.f17833c;
        if (view == d1Var) {
            if (d1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.H - d1Var.getTop()) + d1Var.getY();
            canvas.saveLayerAlpha(d1Var.getX(), d1Var.getY(), d1Var.getX() + d1Var.getWidth(), d1Var.getY() + d1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((d1Var.getY() + d1Var.getHeight()) - max, getListViewTop()) * (1.0f - d1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
            h20 h20Var = this.F;
            h20Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (d1Var.getY() + d1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), d1Var.getHeight() + d1Var.getBottom());
            h20Var.b(canvas, rectF, 3, 1.0f);
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
        if (getDefaultPeerId() >= 0 || getDefaultPeerId() == this.J) {
            long j10 = this.J;
            int i10 = this.K;
            if (j10 >= 0) {
                if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
                    return true;
                }
                return false;
            }
            e1 e1Var = this.M;
            if (e1Var != null && (inputGroupCall = this.L) != null && inputGroupCall.f20862id == e1Var.g() && (groupCall = this.M.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i10).getChat(Long.valueOf(-this.J)));
        }
        return false;
    }

    public final boolean g() {
        return this.f17834c0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        mh.d1 d1Var = this.f17833c;
        int height = d1Var.getHeight();
        for (int i10 = 0; i10 < d1Var.getChildCount(); i10++) {
            height = Math.min(d1Var.getChildAt(i10).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f17839r.size();
    }

    public long getStarsCount() {
        return this.N + this.O;
    }

    public int getUnreadMessagesCount() {
        long j10;
        int i10 = 0;
        if (this.C < 0) {
            return 0;
        }
        e1 e1Var = this.M;
        if (e1Var == null) {
            j10 = 0;
        } else {
            j10 = e1Var.j();
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f17839r;
            if (i10 < arrayList.size()) {
                t0 t0Var = (t0) arrayList.get(i10);
                int i12 = t0Var.f17757a;
                if (i12 >= 0 && i12 > this.C && (t0Var.f17758b || !t0Var.f17760e || t0Var.f17762g >= j10)) {
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

    public final void k(boolean z4) {
        this.f17830a0.run();
        ArrayList arrayList = new ArrayList();
        if (this.Q != null) {
            for (int i10 = 0; i10 < this.Q.size(); i10++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.Q.get(i10);
                TLRPC.TL_messageReactor tL_messageReactor = new TLRPC.TL_messageReactor();
                tL_messageReactor.anonymous = groupcalldonor.anonymous;
                tL_messageReactor.my = groupcalldonor.my;
                tL_messageReactor.count = (int) groupcalldonor.stars;
                tL_messageReactor.peer_id = groupcalldonor.peer_id;
                arrayList.add(tL_messageReactor);
            }
        }
        long clientUserId = UserConfig.getInstance(this.K).getClientUserId();
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        if (defaultSendAs != null) {
            clientUserId = DialogObject.getPeerDialogId(defaultSendAs);
        }
        h0 h0Var = new h0(0);
        int i11 = this.K;
        eb ebVar = new eb(getContext(), i11, this.J, null, null, arrayList, !z4, true, clientUserId, h0Var);
        h2 h2Var = (h2) this;
        ebVar.K = h2Var;
        ebVar.M = new mh.m5(h2Var, 7);
        ebVar.show();
    }

    public final void l(int i10, int i11, boolean z4, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z10) {
        int i12;
        TL_phone.groupCallDonor groupcalldonor;
        u0 u0Var;
        boolean z11;
        u0 u0Var2;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f17839r;
            if (i13 < arrayList.size()) {
                if (((t0) arrayList.get(i13)).f17757a != i11) {
                    i13++;
                } else {
                    return;
                }
            } else {
                int i14 = this.K;
                int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                ?? obj = new Object();
                obj.d = i10;
                obj.f17758b = z4;
                obj.f17759c = j10;
                obj.f17761f = tL_textWithEntities;
                obj.f17762g = j11;
                obj.f17757a = i11;
                obj.f17760e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = s.b(i14, (int) obj.f17762g, 0);
                long j12 = obj.f17762g;
                ArrayList arrayList2 = this.f17840s;
                boolean z12 = true;
                if (j12 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i15 = 0;
                    while (true) {
                        if (i15 < arrayList2.size()) {
                            if (((u0) arrayList2.get(i15)).f17801b == j10) {
                                u0Var = (u0) arrayList2.get(i15);
                                break;
                            }
                            i15++;
                        } else {
                            u0Var = null;
                            break;
                        }
                    }
                    if (u0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f17804f = arrayList3;
                        obj2.f17800a = i14;
                        obj2.f17801b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z11 = true;
                        u0Var2 = obj2;
                    } else {
                        u0Var.f17804f.add(obj);
                        this.f17837f.e1();
                        z11 = false;
                        u0Var2 = u0Var;
                    }
                    u0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new e5.f(this, 27));
                    if (!z10) {
                        this.f17838n.N(true);
                    }
                    if (z11) {
                        this.h.n0(0);
                    }
                }
                if (!z10 && obj.f17760e) {
                    long j13 = obj.f17762g;
                    if (j13 > 0) {
                        this.N += j13;
                        j();
                    }
                }
                if (obj.f17757a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f17757a < ((t0) arrayList.get(size)).f17757a) {
                            i12 = size + 1;
                            break;
                        }
                    }
                }
                i12 = 0;
                arrayList.add(i12, obj);
                if (!z10) {
                    if (arrayList.size() > 2000) {
                        arrayList.subList(2000, arrayList.size()).clear();
                    }
                    this.f17836e.N(true);
                }
                if (i12 <= 0 && !z10 && (!this.f17833c.canScrollVertically(1) || obj.f17757a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i16 = obj.f17757a;
                    if (i16 > 0) {
                        this.C = i16;
                    }
                }
                invalidate();
                h2 h2Var = (h2) this;
                a aVar = h2Var.f17177f0.U1;
                if (aVar != null) {
                    aVar.setCount(h2Var.getUnreadMessagesCount());
                }
                if (!z10 && i11 > 0 && obj.f17762g > 0) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < this.Q.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.Q.get(i17)).peer_id) == obj.f17759c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.Q.get(i17);
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
                        if (UserConfig.getInstance(i14).getClientUserId() != obj.f17759c) {
                            z12 = false;
                        }
                        groupcalldonor.my = z12;
                        groupcalldonor.peer_id = MessagesController.getInstance(i14).getPeer(obj.f17759c);
                        groupcalldonor.stars = 0L;
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            if (((u0) arrayList2.get(i18)).f17801b == obj.f17759c) {
                                ((u0) arrayList2.get(i18)).b();
                                groupcalldonor.stars += ((u0) arrayList2.get(i18)).d;
                            }
                        }
                        this.Q.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f17762g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f17759c);
                }
                t();
                if (z10) {
                    y yVar = this.f17835d0;
                    AndroidUtilities.cancelRunOnUIThread(yVar);
                    AndroidUtilities.runOnUIThread(yVar, 100L);
                }
                e1 e1Var = this.M;
                if (e1Var != null) {
                    e1Var.R = arrayList;
                    e1Var.S = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i10;
        x xVar = this.B;
        if (xVar != null) {
            AndroidUtilities.cancelRunOnUIThread(xVar);
            this.B = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.K).getCurrentTime();
        ArrayList arrayList = this.f17840s;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            u0 u0Var = (u0) obj;
            ArrayList arrayList2 = u0Var.f17804f;
            int size2 = arrayList2.size();
            int i12 = currentTime;
            int i13 = 0;
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList2.get(i14);
                i14++;
                t0 t0Var = (t0) obj2;
                int i15 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (t0Var.f17762g > 0) {
                    i12 = Math.min(i12, t0Var.d);
                    i10 = i15;
                    i13 = Math.max(i13, s.b(u0Var.f17800a, (int) t0Var.f17762g, 0) + t0Var.d);
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
        this.B = xVar2;
        AndroidUtilities.runOnUIThread(xVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i10;
        boolean z4;
        TL_phone.groupCallDonor groupcalldonor;
        int i11 = this.K;
        final int newMessageId = UserConfig.getInstance(i11).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.L;
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
                boolean z10 = tLObject instanceof TLRPC.Updates;
                v0 v0Var = v0.this;
                int i13 = newMessageId;
                if (z10) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                    int size = findUpdatesAndRemove.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = findUpdatesAndRemove.get(i14);
                        i14++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i15 = tL_updateMessageID.f21100id;
                            ArrayList arrayList = v0Var.f17839r;
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 < size2) {
                                    Object obj2 = arrayList.get(i16);
                                    i16++;
                                    t0 t0Var = (t0) obj2;
                                    if (t0Var.f17757a == i13) {
                                        t0Var.f17757a = i15;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(v0Var.K).processUpdates(updates, false);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new mh.u7(v0Var, i13, tL_error, j11, j10, tL_textWithEntities));
                }
            }
        });
        if (this.Q != null && i12 > 0) {
            int i13 = 0;
            while (true) {
                if (i13 < this.Q.size()) {
                    if (((TL_phone.groupCallDonor) this.Q.get(i13)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.Q.get(i13);
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
                this.Q.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 != this.J && !f()) {
            i10 = newMessageId;
            z4 = false;
        } else {
            i10 = newMessageId;
            z4 = true;
        }
        l(currentTime, i10, z4, j10, tL_textWithEntities, j11, false);
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
        if (this.L != null) {
            y yVar = this.S;
            AndroidUtilities.cancelRunOnUIThread(yVar);
            AndroidUtilities.runOnUIThread(yVar);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.L != null) {
            AndroidUtilities.cancelRunOnUIThread(this.S);
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
        ic icVar = this.T;
        y yVar = this.f17830a0;
        if (icVar == null || !icVar.f27780l) {
            b bVar = new b();
            cc ccVar = new cc(getContext(), bVar);
            this.U = ccVar;
            ccVar.c(R.raw.stars_topup, new String[0]);
            this.U.f25887b.setText(getStarsToastTitle());
            gc gcVar = new gc(getContext(), bVar, true, false);
            this.V = gcVar;
            gcVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.V.f27139a = new x((h2) this, 0);
            bc bcVar = new bc(getContext(), bVar);
            this.W = bcVar;
            bcVar.f25570b = 5000L;
            bcVar.setColor(bVar.B0(org.telegram.ui.ActionBar.k6.Gi));
            this.V.addView(this.W, k7.c6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.V.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.U.setButton(this.V);
            ic f10 = ic.f(this.f17831b, this.U, -1);
            this.T = f10;
            f10.f27786r = false;
            f10.k(true);
            this.T.v = yVar;
        }
        this.O++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.O, getDefaultPeerId());
        this.U.f25887b.setText(getStarsToastTitle());
        this.U.f25888c.setText(getStarsToastSubtitle());
        this.W.f25570b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(yVar);
        AndroidUtilities.runOnUIThread(yVar, 5000L);
        long j10 = this.O;
        s1 s1Var = ((h2) this).f17177f0.W1;
        r1 r1Var = s1Var.f17715a;
        r1Var.c(s1Var);
        if (r1Var.f17684s) {
            r1Var.f17684s = false;
            r1Var.a(1.0f, null);
        }
        ArrayList arrayList = r1Var.f17680e;
        while (arrayList.size() > 4) {
            ((hj0) arrayList.remove(0)).A(true);
        }
        int[] iArr2 = r1Var.f17681f;
        hj0 hj0Var = new hj0(iArr2[Utilities.fastRandom.nextInt(iArr2.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        hj0Var.f27542s0 = r1Var;
        hj0Var.H(true);
        hj0Var.I(0);
        hj0Var.start();
        arrayList.add(hj0Var);
        r1Var.invalidate();
        org.telegram.ui.Components.j6 j6Var = r1Var.f17679c;
        j6Var.b();
        j6Var.q(l.d.l(j10, ',', new StringBuilder("+")), true, true);
        p1 p1Var = r1Var.d;
        AndroidUtilities.cancelRunOnUIThread(p1Var);
        AndroidUtilities.runOnUIThread(p1Var, 1500L);
        s1Var.getLocationInWindow(s1Var.C);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - s1Var.f17725y;
        if (j11 < 100) {
            s1Var.B += 0.5f;
        } else {
            s1Var.B = Utilities.clamp(1.0f - (((float) (j11 - 100)) / 200.0f), 1.0f, 0.0f) * s1Var.B;
            LaunchActivity.b0((s1Var.getWidth() / 2.0f) + iArr[0], (s1Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(s1Var.B, 0.9f, 0.3f));
            s1Var.B = 0.0f;
            s1Var.f17725y = currentTimeMillis;
        }
        j();
    }

    public abstract void q(boolean z4, boolean z10);

    public final boolean r(long j10, TLRPC.InputGroupCall inputGroupCall) {
        long j11;
        boolean z4;
        TLRPC.InputGroupCall inputGroupCall2 = this.L;
        long j12 = 0;
        if (inputGroupCall2 == null) {
            j11 = 0;
        } else {
            j11 = inputGroupCall2.f20862id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f20862id;
        }
        if (j11 != j12) {
            this.f17839r.clear();
            z4 = true;
            this.f17836e.N(true);
        } else {
            z4 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.L;
        int i10 = this.K;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.J = j10;
        this.L = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z4) {
            this.f17830a0.run();
            y yVar = this.S;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(yVar);
                return z4;
            }
            yVar.run();
        }
        return z4;
    }

    public final float s() {
        mh.d1 d1Var = this.f17833c;
        return Math.max(Math.max(0.0f, this.H - d1Var.getTop()), getListViewContentTop()) + d1Var.getY();
    }

    public void setAllowTouches(boolean z4) {
        this.D = z4;
    }

    public void setLivePlayer(e1 e1Var) {
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        if (this.M == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.M = e1Var;
        if (z4 && e1Var != null && (arrayList = e1Var.R) != null && (arrayList2 = e1Var.S) != null && arrayList != (arrayList3 = this.f17839r) && arrayList2 != (arrayList4 = this.f17840s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(e1Var.R);
            arrayList4.addAll(e1Var.S);
            this.f17836e.N(true);
            ConnectionsManager.getInstance(this.K).getCurrentTime();
            Collections.sort(arrayList4, new e5.f(this, 27));
            this.f17838n.N(true);
            u(false);
        }
    }

    public final void t() {
        s0 s0Var;
        u0 u0Var;
        o0 o0Var;
        t0 t0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.Q;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new e5.f(28));
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
            mh.d1 d1Var = this.f17833c;
            if (i15 >= d1Var.getChildCount()) {
                break;
            }
            View childAt = d1Var.getChildAt(i15);
            if ((childAt instanceof o0) && (t0Var = (o0Var = (o0) childAt).H) != null) {
                int e6 = e(t0Var.f17759c);
                t0 t0Var2 = o0Var.H;
                if (e6 != t0Var2.h) {
                    t0Var2.h = e6;
                    o0Var.set(t0Var2);
                }
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            ArrayList arrayList3 = this.f17839r;
            if (i16 >= arrayList3.size()) {
                break;
            }
            t0 t0Var3 = (t0) arrayList3.get(i16);
            int e10 = e(t0Var3.f17759c);
            if (e10 != t0Var3.h) {
                t0Var3.h = e10;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            qb1 qb1Var = this.f17837f;
            if (i17 >= qb1Var.getChildCount()) {
                break;
            }
            View childAt2 = qb1Var.getChildAt(i17);
            if ((childAt2 instanceof s0) && (u0Var = (s0Var = (s0) childAt2).f17714f) != null) {
                int e11 = e(u0Var.f17801b);
                u0 u0Var2 = s0Var.f17714f;
                if (e11 != u0Var2.f17803e) {
                    u0Var2.f17803e = e11;
                    s0Var.set(u0Var2);
                }
            }
            i17++;
        }
        while (true) {
            ArrayList arrayList4 = this.f17840s;
            if (i10 < arrayList4.size()) {
                u0 u0Var3 = (u0) arrayList4.get(i10);
                int e12 = e(u0Var3.f17801b);
                if (e12 != u0Var3.f17803e) {
                    u0Var3.f17803e = e12;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void u(boolean z4) {
        float dp;
        float dp2;
        float dp3;
        float dp4;
        ArrayList arrayList = this.f17840s;
        if (z4 && this.G == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.G = !isEmpty;
        float f10 = 1.0f;
        mh.d1 d1Var = this.f17833c;
        qb1 qb1Var = this.f17837f;
        if (z4) {
            ViewPropertyAnimator animate = d1Var.animate();
            if (this.G) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            pr prVar = pr.h;
            translationY.setInterpolator(prVar).setUpdateListener(new eg.m1(this, 21)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = qb1Var.animate();
            if (this.G) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(dp4);
            if (!this.G) {
                f10 = 0.0f;
            }
            translationY2.alpha(f10).setInterpolator(prVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(35.0f);
        }
        d1Var.setTranslationY(dp);
        if (this.G) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(35.0f);
        }
        qb1Var.setTranslationY(dp2);
        if (!this.G) {
            f10 = 0.0f;
        }
        qb1Var.setAlpha(f10);
        invalidate();
    }
}
