package ih;

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
import gh.jb;
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
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s10;
import org.telegram.ui.va1;
public abstract class w0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public z A;
    public int B;
    public boolean C;
    public long D;
    public final s10 E;
    public boolean F;
    public float G;
    public float H;
    public long I;
    public final int J;
    public TLRPC.InputGroupCall K;
    public f1 L;
    public long M;
    public long N;
    public boolean O;
    public ArrayList P;
    public boolean Q;
    public final a0 R;
    public gc S;
    public ac T;
    public ec U;
    public zb V;
    public final a0 W;
    public final View f12272a;
    public ValueAnimator f12273a0;
    public final FrameLayout f12274b;
    public boolean f12275b0;
    public final gh.f1 f12276c;
    public final a0 f12277c0;
    public final f2.m0 d;
    public final g0 f12278e;
    public final va1 f12279f;
    public final f2.m0 h;
    public final z41 f12280n;
    public final ArrayList f12281r;
    public final ArrayList f12282s;
    public final HashMap v;
    public long f12283w;
    public int f12284x;
    public boolean f12285y;

    public w0(Context context, m9 m9Var, ViewGroup viewGroup, View view, FrameLayout frameLayout) {
        super(context);
        this.f12281r = new ArrayList();
        this.f12282s = new ArrayList();
        this.v = new HashMap();
        this.B = -1;
        this.C = true;
        this.E = new s10();
        int i9 = UserConfig.selectedAccount;
        this.J = i9;
        this.P = new ArrayList();
        final h2 h2Var = (h2) this;
        this.R = new a0(h2Var, 0);
        this.W = new a0(h2Var, 1);
        this.f12275b0 = false;
        this.f12277c0 = new a0(h2Var, 2);
        this.f12272a = view;
        this.f12274b = frameLayout;
        view.setAlpha(0.5f);
        gh.f1 f1Var = new gh.f1(h2Var, context, 1);
        this.f12276c = f1Var;
        f1Var.setWillNotDraw(false);
        f2.m0 m0Var = new f2.m0(1, true);
        this.d = m0Var;
        f1Var.setLayoutManager(m0Var);
        g0 g0Var = new g0(h2Var, f1Var, context, i9, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i10 = r2;
                int i11 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.f12281r;
                        f1 f1Var2 = h2Var2.L;
                        if (f1Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = f1Var2.j();
                        }
                        h2Var2.D = j10;
                        while (i11 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i11);
                            if (u0Var.f12175b || !u0Var.f12177e || u0Var.f12179g >= j10) {
                                int i12 = o0.f11876a;
                                l41 J = l41.J(o0.class);
                                J.G = u0Var;
                                arrayList.add(J);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = h2Var2.f12282s;
                        while (i11 < arrayList3.size()) {
                            int i13 = s0.f12099a;
                            l41 J2 = l41.J(s0.class);
                            J2.G = (v0) arrayList3.get(i11);
                            arrayList.add(J2);
                            i11++;
                        }
                        return;
                }
            }
        }, new b());
        this.f12278e = g0Var;
        f1Var.setAdapter(g0Var);
        g0Var.f35188r = false;
        f1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(7.5f));
        f1Var.setClipToPadding(false);
        addView(f1Var, g7.e6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 34.0f));
        f1Var.setOnItemClickListener(new f0(h2Var, viewGroup, m9Var, 0));
        h0 h0Var = new h0(h2Var);
        h0Var.f5532m = false;
        h0Var.C = false;
        gr grVar = gr.h;
        h0Var.o(grVar);
        h0Var.n(280L);
        h0Var.D = 14L;
        f1Var.setItemAnimator(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_arrowright);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setRotation(90.0f);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new androidx.mediarouter.app.c(h2Var, 19));
        va1 va1Var = new va1(context, 1, null);
        this.f12279f = va1Var;
        va1Var.setWillNotDraw(false);
        f2.m0 m0Var2 = new f2.m0(0, false);
        this.h = m0Var2;
        va1Var.setLayoutManager(m0Var2);
        z41 z41Var = new z41(va1Var, context, i9, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                long j10;
                int i10 = r2;
                int i11 = 0;
                h2 h2Var2 = h2Var;
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var2 = (z41) obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = h2Var2.f12281r;
                        f1 f1Var2 = h2Var2.L;
                        if (f1Var2 == null) {
                            j10 = 0;
                        } else {
                            j10 = f1Var2.j();
                        }
                        h2Var2.D = j10;
                        while (i11 < arrayList2.size()) {
                            u0 u0Var = (u0) arrayList2.get(i11);
                            if (u0Var.f12175b || !u0Var.f12177e || u0Var.f12179g >= j10) {
                                int i12 = o0.f11876a;
                                l41 J = l41.J(o0.class);
                                J.G = u0Var;
                                arrayList.add(J);
                            }
                            i11++;
                        }
                        return;
                    default:
                        ArrayList arrayList3 = h2Var2.f12282s;
                        while (i11 < arrayList3.size()) {
                            int i13 = s0.f12099a;
                            l41 J2 = l41.J(s0.class);
                            J2.G = (v0) arrayList3.get(i11);
                            arrayList.add(J2);
                            i11++;
                        }
                        return;
                }
            }
        }, null);
        this.f12280n = z41Var;
        va1Var.setAdapter(z41Var);
        z41Var.f35188r = false;
        va1Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        va1Var.setClipToPadding(false);
        addView(va1Var, g7.e6.d(-1, 26.0f, 87, 0.0f, 0.0f, 0.0f, 9.66f));
        va1Var.setOnItemClickListener(new gh.i3(h2Var, 20));
        f2.n nVar = new f2.n();
        nVar.f5532m = false;
        nVar.C = false;
        nVar.o(grVar);
        nVar.n(350L);
        va1Var.setItemAnimator(nVar);
        u(false);
    }

    public static Integer a(w0 w0Var, Long l10) {
        w0Var.W.run();
        w0Var.N = l10.longValue();
        gc M = new oc(w0Var.f12274b, new b()).M(w0Var.getStarsToastTitle(), w0Var.getStarsToastSubtitle(), R.raw.stars_topup);
        boolean z10 = false;
        M.f28745r = false;
        M.k(true);
        long j10 = 0;
        w0Var.N = 0L;
        w0Var.O = true;
        int o6 = w0Var.o(new TLRPC.TL_textWithEntities(), l10.longValue());
        f1 f1Var = w0Var.L;
        if (f1Var != null) {
            j10 = f1Var.j();
        }
        if (w0Var.getDefaultPeerId() == w0Var.I && w0Var.f()) {
            z10 = true;
        }
        if (l10.longValue() < j10 && !z10) {
            return Integer.MIN_VALUE;
        }
        return Integer.valueOf(o6);
    }

    private long getDefaultPeerId() {
        boolean z10;
        TLRPC.Peer defaultSendAs = getDefaultSendAs();
        f1 f1Var = this.L;
        if (f1Var != null && f1Var.l()) {
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
        gh.f1 f1Var = this.f12276c;
        int height = f1Var.getHeight();
        for (int i9 = 0; i9 < f1Var.getChildCount(); i9++) {
            height = Math.min(f1Var.getChildAt(i9).getTop(), height);
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
        int i9 = (int) (0 + this.N);
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            if (((TL_phone.groupCallDonor) this.P.get(i10)).my) {
                i9 = (int) (i9 + ((TL_phone.groupCallDonor) this.P.get(i10)).stars);
            }
        }
        return i9;
    }

    public final void b() {
        this.N = 0L;
        h(getDefaultPeerId());
        t1 t1Var = ((h2) this).f11496e0.V1;
        s1 s1Var = t1Var.f12147a;
        s1Var.c(t1Var);
        s1Var.b();
        j();
    }

    public final void c(int i9) {
        ArrayList arrayList;
        u0 u0Var;
        ArrayList arrayList2;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            arrayList = this.f12281r;
            if (i10 < arrayList.size()) {
                if (((u0) arrayList.get(i10)).f12174a == i9) {
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
            if (u0Var.f12174a < 0 && u0Var.f12177e) {
                long j10 = u0Var.f12179g;
                if (j10 > 0) {
                    this.M -= j10;
                    j();
                }
            }
            int i11 = 0;
            while (true) {
                arrayList2 = this.f12282s;
                if (i11 >= arrayList2.size()) {
                    break;
                } else if (((v0) arrayList2.get(i11)).f12224f.contains(u0Var)) {
                    ((v0) arrayList2.get(i11)).f12224f.remove(u0Var);
                    if (((v0) arrayList2.get(i11)).f12224f.isEmpty()) {
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
            this.f12278e.N(true);
            if (z10) {
                ConnectionsManager.getInstance(this.J).getCurrentTime();
                Collections.sort(arrayList2, new a5.e(this, 23));
                this.f12280n.N(true);
                t();
                u(true);
            }
        }
    }

    public final p0 d(int i9) {
        p0 p0Var;
        u0 u0Var;
        int i10 = 0;
        while (true) {
            gh.f1 f1Var = this.f12276c;
            if (i10 < f1Var.getChildCount()) {
                View childAt = f1Var.getChildAt(i10);
                if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).G) != null && u0Var.f12174a == i9) {
                    return p0Var;
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.liveStoryMessageUpdate) {
            int i11 = 0;
            long longValue = ((Long) objArr[0]).longValue();
            TLObject tLObject = (TLObject) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            if (tLObject instanceof TL_update.TL_updateGroupCallMessage) {
                TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) tLObject;
                TLRPC.InputGroupCall inputGroupCall = this.K;
                if (inputGroupCall != null && inputGroupCall.f22397id == longValue) {
                    TLRPC.GroupCallMessage groupCallMessage = tL_updateGroupCallMessage.message;
                    int i12 = groupCallMessage.date;
                    int i13 = groupCallMessage.f22391id;
                    boolean z10 = groupCallMessage.from_admin;
                    long peerDialogId = DialogObject.getPeerDialogId(groupCallMessage.from_id);
                    TLRPC.GroupCallMessage groupCallMessage2 = tL_updateGroupCallMessage.message;
                    l(i12, i13, z10, peerDialogId, groupCallMessage2.message, groupCallMessage2.paid_message_stars, booleanValue);
                }
            } else if (tLObject instanceof TL_update.TL_updateDeleteGroupCallMessages) {
                TL_update.TL_updateDeleteGroupCallMessages tL_updateDeleteGroupCallMessages = (TL_update.TL_updateDeleteGroupCallMessages) tLObject;
                TLRPC.InputGroupCall inputGroupCall2 = this.K;
                if (inputGroupCall2 != null && inputGroupCall2.f22397id == longValue) {
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
        gh.f1 f1Var = this.f12276c;
        if (view == f1Var) {
            if (f1Var.getAlpha() <= 0.0f) {
                return true;
            }
            float max = Math.max(0.0f, this.G - f1Var.getTop()) + f1Var.getY();
            canvas.saveLayerAlpha(f1Var.getX(), f1Var.getY(), f1Var.getX() + f1Var.getWidth(), f1Var.getY() + f1Var.getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, Math.min((f1Var.getY() + f1Var.getHeight()) - max, getListViewTop()) * (1.0f - f1Var.getAlpha()));
            canvas.clipRect(0.0f, max, getWidth(), getHeight());
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, max, getWidth(), AndroidUtilities.dp(12.0f) + max);
            s10 s10Var = this.E;
            s10Var.b(canvas, rectF, 1, 1.0f);
            rectF.set(0.0f, (f1Var.getY() + f1Var.getHeight()) - AndroidUtilities.dp(12.0f), getWidth(), f1Var.getHeight() + f1Var.getBottom());
            s10Var.b(canvas, rectF, 3, 1.0f);
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
            int i9 = this.J;
            if (j10 >= 0) {
                if (j10 == UserConfig.getInstance(i9).getClientUserId()) {
                    return true;
                }
                return false;
            }
            f1 f1Var = this.L;
            if (f1Var != null && (inputGroupCall = this.K) != null && inputGroupCall.f22397id == f1Var.g() && (groupCall = this.L.v) != null && groupCall.creator) {
                return true;
            }
            return ChatObject.canManageCalls(MessagesController.getInstance(i9).getChat(Long.valueOf(-this.I)));
        }
        return false;
    }

    public final boolean g() {
        return this.f12275b0;
    }

    public TLRPC.Peer getDefaultSendAs() {
        return null;
    }

    public int getListViewContentTop() {
        gh.f1 f1Var = this.f12276c;
        int height = f1Var.getHeight();
        for (int i9 = 0; i9 < f1Var.getChildCount(); i9++) {
            height = Math.min(f1Var.getChildAt(i9).getTop(), height);
        }
        return height;
    }

    public int getMessagesCount() {
        return this.f12281r.size();
    }

    public long getStarsCount() {
        return this.M + this.N;
    }

    public int getUnreadMessagesCount() {
        long j10;
        int i9 = 0;
        if (this.B < 0) {
            return 0;
        }
        f1 f1Var = this.L;
        if (f1Var == null) {
            j10 = 0;
        } else {
            j10 = f1Var.j();
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f12281r;
            if (i9 < arrayList.size()) {
                u0 u0Var = (u0) arrayList.get(i9);
                int i11 = u0Var.f12174a;
                if (i11 >= 0 && i11 > this.B && (u0Var.f12175b || !u0Var.f12177e || u0Var.f12179g >= j10)) {
                    i10++;
                }
                i9++;
            } else {
                return i10;
            }
        }
    }

    public abstract void h(long j10);

    public abstract void i(int i9, int i10, long j10);

    public abstract void j();

    public final void k(boolean z10) {
        this.W.run();
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            for (int i9 = 0; i9 < this.P.size(); i9++) {
                TL_phone.groupCallDonor groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i9);
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
        j0 j0Var = new j0(0);
        int i10 = this.J;
        jb jbVar = new jb(getContext(), i10, this.I, null, null, arrayList, !z10, true, clientUserId, j0Var);
        h2 h2Var = (h2) this;
        jbVar.J = h2Var;
        jbVar.L = new gh.i3(h2Var, 19);
        jbVar.show();
    }

    public final void l(int i9, int i10, boolean z10, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, long j11, boolean z11) {
        int i11;
        TL_phone.groupCallDonor groupcalldonor;
        v0 v0Var;
        boolean z12;
        v0 v0Var2;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f12281r;
            if (i12 < arrayList.size()) {
                if (((u0) arrayList.get(i12)).f12174a != i10) {
                    i12++;
                } else {
                    return;
                }
            } else {
                int i13 = this.J;
                int currentTime = ConnectionsManager.getInstance(i13).getCurrentTime();
                ?? obj = new Object();
                obj.d = i9;
                obj.f12175b = z10;
                obj.f12176c = j10;
                obj.f12178f = tL_textWithEntities;
                obj.f12179g = j11;
                obj.f12174a = i10;
                obj.f12177e = TextUtils.isEmpty(tL_textWithEntities.text);
                int b10 = u.b(i13, (int) obj.f12179g, 0);
                long j12 = obj.f12179g;
                ArrayList arrayList2 = this.f12282s;
                boolean z13 = true;
                if (j12 > 0 && b10 > 0 && currentTime - obj.d <= b10) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList2.size()) {
                            if (((v0) arrayList2.get(i14)).f12221b == j10) {
                                v0Var = (v0) arrayList2.get(i14);
                                break;
                            }
                            i14++;
                        } else {
                            v0Var = null;
                            break;
                        }
                    }
                    if (v0Var == null) {
                        ?? obj2 = new Object();
                        ArrayList arrayList3 = new ArrayList();
                        obj2.f12224f = arrayList3;
                        obj2.f12220a = i13;
                        obj2.f12221b = j10;
                        arrayList3.add(obj);
                        arrayList2.add(0, obj2);
                        z12 = true;
                        v0Var2 = obj2;
                    } else {
                        v0Var.f12224f.add(obj);
                        this.f12279f.f1();
                        z12 = false;
                        v0Var2 = v0Var;
                    }
                    v0Var2.c();
                    u(true);
                    m();
                    Collections.sort(arrayList2, new a5.e(this, 23));
                    if (!z11) {
                        this.f12280n.N(true);
                    }
                    if (z12) {
                        this.h.n0(0);
                    }
                }
                if (!z11 && obj.f12177e) {
                    long j13 = obj.f12179g;
                    if (j13 > 0) {
                        this.M += j13;
                        j();
                    }
                }
                if (obj.f12174a >= 0) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (obj.f12174a < ((u0) arrayList.get(size)).f12174a) {
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
                    this.f12278e.N(true);
                }
                if (i11 <= 0 && !z11 && (!this.f12276c.canScrollVertically(1) || obj.f12174a < 0)) {
                    this.d.h1(0, AndroidUtilities.dp(100.0f));
                    int i15 = obj.f12174a;
                    if (i15 > 0) {
                        this.B = i15;
                    }
                }
                invalidate();
                h2 h2Var = (h2) this;
                a aVar = h2Var.f11496e0.T1;
                if (aVar != null) {
                    aVar.setCount(h2Var.getUnreadMessagesCount());
                }
                if (!z11 && i10 > 0 && obj.f12179g > 0) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < this.P.size()) {
                            if (DialogObject.getPeerDialogId(((TL_phone.groupCallDonor) this.P.get(i16)).peer_id) == obj.f12176c) {
                                groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i16);
                                break;
                            }
                            i16++;
                        } else {
                            groupcalldonor = null;
                            break;
                        }
                    }
                    if (groupcalldonor == null) {
                        groupcalldonor = new TL_phone.groupCallDonor();
                        if (UserConfig.getInstance(i13).getClientUserId() != obj.f12176c) {
                            z13 = false;
                        }
                        groupcalldonor.my = z13;
                        groupcalldonor.peer_id = MessagesController.getInstance(i13).getPeer(obj.f12176c);
                        groupcalldonor.stars = 0L;
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            if (((v0) arrayList2.get(i17)).f12221b == obj.f12176c) {
                                ((v0) arrayList2.get(i17)).b();
                                groupcalldonor.stars += ((v0) arrayList2.get(i17)).d;
                            }
                        }
                        this.P.add(groupcalldonor);
                    }
                    long j14 = groupcalldonor.stars;
                    long j15 = obj.f12179g;
                    long j16 = j14 + j15;
                    groupcalldonor.stars = j16;
                    i((int) j16, (int) j15, obj.f12176c);
                }
                t();
                if (z11) {
                    a0 a0Var = this.f12277c0;
                    AndroidUtilities.cancelRunOnUIThread(a0Var);
                    AndroidUtilities.runOnUIThread(a0Var, 100L);
                }
                f1 f1Var = this.L;
                if (f1Var != null) {
                    f1Var.Q = arrayList;
                    f1Var.R = arrayList2;
                    return;
                }
                return;
            }
        }
    }

    public final void m() {
        int i9;
        z zVar = this.A;
        if (zVar != null) {
            AndroidUtilities.cancelRunOnUIThread(zVar);
            this.A = null;
        }
        int currentTime = ConnectionsManager.getInstance(this.J).getCurrentTime();
        ArrayList arrayList = this.f12282s;
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v0 v0Var = (v0) obj;
            ArrayList arrayList2 = v0Var.f12224f;
            int size2 = arrayList2.size();
            int i11 = currentTime;
            int i12 = 0;
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                u0 u0Var = (u0) obj2;
                int i14 = currentTime;
                ArrayList arrayList3 = arrayList;
                if (u0Var.f12179g > 0) {
                    i11 = Math.min(i11, u0Var.d);
                    i9 = i14;
                    i12 = Math.max(i12, u.b(v0Var.f12220a, (int) u0Var.f12179g, 0) + u0Var.d);
                } else {
                    i9 = i14;
                }
                arrayList = arrayList3;
                currentTime = i9;
            }
            int i15 = currentTime;
            j10 = Math.min(j10, Math.max(0, i12 - i15) * 1000);
            arrayList = arrayList;
            currentTime = i15;
        }
        if (j10 >= Long.MAX_VALUE) {
            return;
        }
        z zVar2 = new z(this, 1);
        this.A = zVar2;
        AndroidUtilities.runOnUIThread(zVar2, j10);
    }

    public final int n(final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final long j11) {
        int i9;
        boolean z10;
        TL_phone.groupCallDonor groupcalldonor;
        int i10 = this.J;
        final int newMessageId = UserConfig.getInstance(i10).getNewMessageId();
        final TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
        sendgroupcallmessage.call = this.K;
        sendgroupcallmessage.message = tL_textWithEntities;
        int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i11 > 0) {
            sendgroupcallmessage.flags |= 1;
            sendgroupcallmessage.allow_paid_stars = j11;
        }
        sendgroupcallmessage.random_id = Utilities.random.nextLong();
        sendgroupcallmessage.flags |= 2;
        sendgroupcallmessage.send_as = MessagesController.getInstance(i10).getInputPeer(j10);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(sendgroupcallmessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                boolean z11 = tLObject instanceof TLRPC.Updates;
                w0 w0Var = w0.this;
                int i12 = newMessageId;
                if (z11) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateMessageID.class);
                    int size = findUpdatesAndRemove.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj = findUpdatesAndRemove.get(i13);
                        i13++;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        if (sendgroupcallmessage.random_id == tL_updateMessageID.random_id) {
                            int i14 = tL_updateMessageID.f22635id;
                            ArrayList arrayList = w0Var.f12281r;
                            int size2 = arrayList.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size2) {
                                    Object obj2 = arrayList.get(i15);
                                    i15++;
                                    u0 u0Var = (u0) obj2;
                                    if (u0Var.f12174a == i12) {
                                        u0Var.f12174a = i14;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    MessagesController.getInstance(w0Var.J).processUpdates(updates, false);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new gh.w7(w0Var, i12, tL_error, j11, j10, tL_textWithEntities));
                }
            }
        });
        if (this.P != null && i11 > 0) {
            int i12 = 0;
            while (true) {
                if (i12 < this.P.size()) {
                    if (((TL_phone.groupCallDonor) this.P.get(i12)).my) {
                        groupcalldonor = (TL_phone.groupCallDonor) this.P.get(i12);
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
                groupcalldonor2.peer_id = MessagesController.getInstance(i10).getPeer(j10);
                groupcalldonor2.stars = j11;
                this.P.add(groupcalldonor2);
            }
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (j10 != this.I && !f()) {
            i9 = newMessageId;
            z10 = false;
        } else {
            i9 = newMessageId;
            z10 = true;
        }
        l(currentTime, i9, z10, j10, tL_textWithEntities, j11, false);
        int i13 = i9;
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
        if (this.K != null) {
            a0 a0Var = this.R;
            AndroidUtilities.cancelRunOnUIThread(a0Var);
            AndroidUtilities.runOnUIThread(a0Var);
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
        gc gcVar = this.S;
        a0 a0Var = this.W;
        if (gcVar == null || !gcVar.f28739l) {
            b bVar = new b();
            ac acVar = new ac(getContext(), bVar);
            this.T = acVar;
            acVar.c(R.raw.stars_topup, new String[0]);
            this.T.f26755b.setText(getStarsToastTitle());
            ec ecVar = new ec(getContext(), bVar, true, false);
            this.U = ecVar;
            ecVar.e(LocaleController.getString(R.string.StarsSentUndo));
            this.U.f27999a = new z((h2) this, 0);
            zb zbVar = new zb(getContext(), bVar);
            this.V = zbVar;
            zbVar.f35268b = 5000L;
            zbVar.setColor(bVar.N0(org.telegram.ui.ActionBar.f6.Gi));
            this.U.addView(this.V, g7.e6.d(20, 20.0f, 21, 0.0f, 0.0f, 12.0f, 0.0f));
            this.U.d.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(8.0f));
            this.T.setButton(this.U);
            gc f10 = gc.f(this.f12274b, this.T, -1);
            this.S = f10;
            f10.f28745r = false;
            f10.k(true);
            this.S.v = a0Var;
        }
        this.N++;
        h(getDefaultPeerId());
        i(getTotalMyStars(), (int) this.N, getDefaultPeerId());
        this.T.f26755b.setText(getStarsToastTitle());
        this.T.f26756c.setText(getStarsToastSubtitle());
        this.V.f35268b = 5000L;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        AndroidUtilities.runOnUIThread(a0Var, 5000L);
        long j10 = this.N;
        t1 t1Var = ((h2) this).f11496e0.V1;
        s1 s1Var = t1Var.f12147a;
        s1Var.c(t1Var);
        if (s1Var.f12107s) {
            s1Var.f12107s = false;
            s1Var.a(1.0f, null);
        }
        ArrayList arrayList = s1Var.f12103e;
        while (arrayList.size() > 4) {
            ((mi0) arrayList.remove(0)).A(true);
        }
        int[] iArr2 = s1Var.f12104f;
        int i9 = iArr2[Utilities.fastRandom.nextInt(iArr2.length)];
        mi0 mi0Var = new mi0(i9, AndroidUtilities.dp(70.0f), j3.r0.l(i9, ""), AndroidUtilities.dp(70.0f));
        mi0Var.f30863r0 = s1Var;
        mi0Var.H(true);
        mi0Var.I(0);
        mi0Var.start();
        arrayList.add(mi0Var);
        s1Var.invalidate();
        org.telegram.ui.Components.i6 i6Var = s1Var.f12102c;
        i6Var.b();
        i6Var.q(j3.r0.n(j10, ',', new StringBuilder("+")), true, true);
        q1 q1Var = s1Var.d;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var, 1500L);
        t1Var.getLocationInWindow(t1Var.B);
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - t1Var.f12157y;
        if (j11 < 100) {
            t1Var.A += 0.5f;
        } else {
            t1Var.A = Utilities.clamp(1.0f - (((float) (j11 - 100)) / 200.0f), 1.0f, 0.0f) * t1Var.A;
            LaunchActivity.b0((t1Var.getWidth() / 2.0f) + iArr[0], (t1Var.getHeight() / 2.0f) + iArr[1], Utilities.clamp(t1Var.A, 0.9f, 0.3f));
            t1Var.A = 0.0f;
            t1Var.f12157y = currentTimeMillis;
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
            j11 = inputGroupCall2.f22397id;
        }
        if (inputGroupCall != null) {
            j12 = inputGroupCall.f22397id;
        }
        if (j11 != j12) {
            this.f12281r.clear();
            z10 = true;
            this.f12278e.N(true);
        } else {
            z10 = false;
        }
        TLRPC.InputGroupCall inputGroupCall3 = this.K;
        int i9 = this.J;
        if (inputGroupCall3 != null) {
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        this.I = j10;
        this.K = inputGroupCall;
        if (inputGroupCall != null) {
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.liveStoryMessageUpdate);
        }
        if (z10) {
            this.W.run();
            a0 a0Var = this.R;
            if (inputGroupCall == null) {
                AndroidUtilities.cancelRunOnUIThread(a0Var);
                return z10;
            }
            a0Var.run();
        }
        return z10;
    }

    public final float s() {
        gh.f1 f1Var = this.f12276c;
        return Math.max(Math.max(0.0f, this.G - f1Var.getTop()), getListViewContentTop()) + f1Var.getY();
    }

    public void setAllowTouches(boolean z10) {
        this.C = z10;
    }

    public void setLivePlayer(f1 f1Var) {
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
        this.L = f1Var;
        if (z10 && f1Var != null && (arrayList = f1Var.Q) != null && (arrayList2 = f1Var.R) != null && arrayList != (arrayList3 = this.f12281r) && arrayList2 != (arrayList4 = this.f12282s) && arrayList3.isEmpty() && arrayList4.isEmpty()) {
            arrayList3.addAll(f1Var.Q);
            arrayList4.addAll(f1Var.R);
            this.f12278e.N(true);
            ConnectionsManager.getInstance(this.J).getCurrentTime();
            Collections.sort(arrayList4, new a5.e(this, 23));
            this.f12280n.N(true);
            u(false);
        }
    }

    public final void t() {
        t0 t0Var;
        v0 v0Var;
        p0 p0Var;
        u0 u0Var;
        HashMap hashMap = this.v;
        hashMap.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.P;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        Collections.sort(arrayList, new a5.e(24));
        int size = arrayList.size();
        int i9 = 0;
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
            hashMap.put(Long.valueOf(DialogObject.getPeerDialogId(groupcalldonor.peer_id)), Integer.valueOf(i11));
        }
        int i14 = 0;
        while (true) {
            gh.f1 f1Var = this.f12276c;
            if (i14 >= f1Var.getChildCount()) {
                break;
            }
            View childAt = f1Var.getChildAt(i14);
            if ((childAt instanceof p0) && (u0Var = (p0Var = (p0) childAt).G) != null) {
                int e10 = e(u0Var.f12176c);
                u0 u0Var2 = p0Var.G;
                if (e10 != u0Var2.h) {
                    u0Var2.h = e10;
                    p0Var.set(u0Var2);
                }
            }
            i14++;
        }
        int i15 = 0;
        while (true) {
            ArrayList arrayList3 = this.f12281r;
            if (i15 >= arrayList3.size()) {
                break;
            }
            u0 u0Var3 = (u0) arrayList3.get(i15);
            int e11 = e(u0Var3.f12176c);
            if (e11 != u0Var3.h) {
                u0Var3.h = e11;
            }
            i15++;
        }
        int i16 = 0;
        while (true) {
            va1 va1Var = this.f12279f;
            if (i16 >= va1Var.getChildCount()) {
                break;
            }
            View childAt2 = va1Var.getChildAt(i16);
            if ((childAt2 instanceof t0) && (v0Var = (t0Var = (t0) childAt2).f12146f) != null) {
                int e12 = e(v0Var.f12221b);
                v0 v0Var2 = t0Var.f12146f;
                if (e12 != v0Var2.f12223e) {
                    v0Var2.f12223e = e12;
                    t0Var.set(v0Var2);
                }
            }
            i16++;
        }
        while (true) {
            ArrayList arrayList4 = this.f12282s;
            if (i9 < arrayList4.size()) {
                v0 v0Var3 = (v0) arrayList4.get(i9);
                int e13 = e(v0Var3.f12221b);
                if (e13 != v0Var3.f12223e) {
                    v0Var3.f12223e = e13;
                }
                i9++;
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
        ArrayList arrayList = this.f12282s;
        if (z10 && this.F == (!arrayList.isEmpty())) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.F = !isEmpty;
        float f10 = 1.0f;
        gh.f1 f1Var = this.f12276c;
        va1 va1Var = this.f12279f;
        if (z10) {
            ViewPropertyAnimator animate = f1Var.animate();
            if (this.F) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(dp3);
            gr grVar = gr.h;
            translationY.setInterpolator(grVar).setUpdateListener(new bg.b(this, 12)).setDuration(420L).start();
            ViewPropertyAnimator animate2 = va1Var.animate();
            if (this.F) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(35.0f);
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(dp4);
            if (!this.F) {
                f10 = 0.0f;
            }
            translationY2.alpha(f10).setInterpolator(grVar).setDuration(420L).start();
            return;
        }
        if (!isEmpty) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(35.0f);
        }
        f1Var.setTranslationY(dp);
        if (this.F) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(35.0f);
        }
        va1Var.setTranslationY(dp2);
        if (!this.F) {
            f10 = 0.0f;
        }
        va1Var.setAlpha(f10);
        invalidate();
    }
}
