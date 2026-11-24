package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class ln4 extends mz0 {
    public static final int A2 = 0;
    public String S1;
    public int T1;
    public TL_chatlists.chatlist_ChatlistInvite U1;
    public TL_chatlists.TL_chatlists_chatlistUpdates V1;
    public final boolean W1;
    public String X1;
    public ArrayList Y1;
    public boolean Z1;
    public CharSequence a2;
    public ArrayList b2;
    public ArrayList c2;
    public ArrayList d2;
    public ArrayList e2;
    public FrameLayout f2;
    public hn4 g2;
    public View h2;
    public kn4 i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public int n2;
    public int o2;
    public int p2;
    public int q2;
    public int r2;
    public int s2;
    public in4 t2;
    public int u2;
    public boolean v2;
    public qac w2;
    public int x2;
    public long y2;
    public long z2;

    public ln4(d dVar, int i, ArrayList arrayList) {
        super(dVar, false);
        ub7 ub7Var;
        TLRPC.Chat L0;
        this.T1 = -1;
        this.X1 = "";
        this.Y1 = new ArrayList();
        this.a2 = "";
        this.c2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        this.u2 = -1;
        this.x2 = -5;
        this.T1 = i;
        this.W1 = true;
        this.b2 = new ArrayList();
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = dVar.getMessagesController().G0;
        if (arrayList3 != null) {
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                if (((ub7) arrayList3.get(i2)).a == i) {
                    ub7Var = (ub7) arrayList3.get(i2);
                    break;
                }
            }
        }
        ub7Var = null;
        if (ub7Var != null) {
            this.X1 = ub7Var.b;
            this.Y1 = ub7Var.c;
            this.Z1 = ub7Var.n;
            for (int i3 = 0; i3 < this.d2.size(); i3++) {
                TLRPC.Peer x1 = dVar.getMessagesController().x1(((Long) this.d2.get(i3)).longValue());
                if ((x1 instanceof TLRPC.TL_peerChat) || (x1 instanceof TLRPC.TL_peerChannel)) {
                    this.b2.add(x1);
                }
            }
            for (int i4 = 0; i4 < ub7Var.h.size(); i4++) {
                Long l = (Long) ub7Var.h.get(i4);
                long longValue = l.longValue();
                if (!this.d2.contains(l)) {
                    TLRPC.Peer x12 = dVar.getMessagesController().x1(longValue);
                    if (((x12 instanceof TLRPC.TL_peerChat) || (x12 instanceof TLRPC.TL_peerChannel)) && ((L0 = dVar.getMessagesController().L0(Long.valueOf(-longValue))) == null || !sd2.r0(L0))) {
                        this.b2.add(x12);
                    }
                }
            }
        }
        a1();
    }

    public static void b1(d dVar, int i, qac qacVar) {
        ub7 ub7Var;
        ArrayList arrayList = dVar.getMessagesController().G0;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((ub7) arrayList.get(i2)).a == i) {
                    ub7Var = (ub7) arrayList.get(i2);
                    break;
                }
            }
        }
        ub7Var = null;
        wc7 wc7Var = new wc7(i, dVar, qacVar, (byte) 27);
        if (ub7Var != null && ub7Var.e()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dVar.getContext());
            String M0 = jb6.M0(2131750727, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131750725, null);
            alertDialog$Builder.g(jb6.M0(2131752542, null), new a72(qacVar, (byte) 1));
            alertDialog$Builder.j(jb6.M0(2131751535, null), new yu3(wc7Var, (byte) 23));
            dVar.showDialog(heVar);
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, null);
                return;
            }
            return;
        }
        wc7Var.run();
    }

    @Override
    public final q59 G0(r59 r59Var) {
        return new en4(this);
    }

    @Override
    public final CharSequence J0() {
        if (this.W1) {
            return jb6.M0(2131750565, null);
        }
        if (this.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return jb6.M0(2131750568, null);
        }
        ArrayList arrayList = this.b2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return jb6.M0(2131750567, null);
        }
        return jb6.M0(2131750566, null);
    }

    @Override
    public final void P0(ela elaVar) {
        float f;
        r59 r59Var = this.n1;
        r59Var.setOverScrollMode(2);
        int L = gm.L(6.0f);
        int L2 = gm.L(6.0f);
        if (this.g2 != null) {
            f = 68.0f;
        } else {
            f = 0.0f;
        }
        r59Var.setPadding(L, 0, L2, gm.L(f));
        r59Var.setOnItemClickListener(new kg4(this, (byte) 3));
    }

    public final void Y0(boolean z) {
        String str;
        String G = jb6.G(this.d2.size(), "FilterInviteHeaderChats", new Object[0]);
        if (z && this.t2 != null) {
            str = ", " + ((Object) this.t2.b.getText());
        } else {
            str = "";
        }
        gm.g2(G.concat(str));
    }

    public final void Z0(in4 in4Var, boolean z) {
        int i;
        ArrayList arrayList = this.b2;
        ArrayList arrayList2 = this.d2;
        arrayList2.clear();
        arrayList2.addAll(this.c2);
        int i2 = 0;
        if (!z) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long n = pg3.n((TLRPC.Peer) arrayList.get(i3));
                if (!arrayList2.contains(Long.valueOf(n))) {
                    arrayList2.add(Long.valueOf(n));
                }
            }
        }
        c1(true);
        if (z) {
            i = 2131745404;
        } else {
            i = 2131751394;
        }
        in4Var.a(jb6.M0(i, null), new np6(this, in4Var, z, (byte) 22));
        Y0(true);
        while (true) {
            r59 r59Var = this.n1;
            if (i2 < r59Var.getChildCount()) {
                View childAt = r59Var.getChildAt(i2);
                if (childAt instanceof xc5) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((xc5) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void a1() {
        boolean z;
        long j;
        boolean r0;
        ArrayList arrayList = this.e2;
        this.a2 = gm.G2(this.X1, "✱", "*");
        ArrayList arrayList2 = this.b2;
        if (arrayList2 != null) {
            for (int i = 0; i < arrayList2.size(); i++) {
                TLRPC.Peer peer = (TLRPC.Peer) arrayList2.get(i);
                if (peer != null) {
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j = peer.user_id;
                        z = false;
                    } else {
                        boolean z2 = peer instanceof TLRPC.TL_peerChat;
                        d dVar = this.r1;
                        if (z2) {
                            j = -peer.chat_id;
                            r0 = sd2.r0(dVar.getMessagesController().L0(Long.valueOf(-j)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            r0 = sd2.r0(dVar.getMessagesController().L0(Long.valueOf(-j)));
                        } else {
                            z = false;
                            j = 0;
                        }
                        z = !r0;
                    }
                    if (j != 0 && !this.W1) {
                        if (z) {
                            this.c2.add(Long.valueOf(j));
                        }
                        this.d2.add(Long.valueOf(j));
                    }
                }
            }
        }
        this.j2 = 1;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int i2 = this.j2;
            int i3 = i2 + 1;
            this.k2 = i2;
            int i4 = i2 + 2;
            this.j2 = i4;
            this.l2 = i3;
            this.m2 = i4;
            int size = arrayList2.size() + i4;
            this.j2 = size;
            this.n2 = size;
        } else {
            this.k2 = -1;
            this.l2 = -1;
            this.m2 = -1;
            this.n2 = -1;
        }
        int i5 = this.j2;
        this.j2 = i5 + 1;
        this.o2 = i5;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i6 = this.j2;
            int i7 = i6 + 1;
            this.j2 = i7;
            this.p2 = i6;
            this.q2 = i7;
            int size2 = arrayList.size() + i7;
            this.r2 = size2;
            this.j2 = size2 + 1;
            this.s2 = size2;
        } else {
            this.p2 = -1;
            this.q2 = -1;
            this.r2 = -1;
            this.s2 = -1;
        }
        Context context = getContext();
        ?? frameLayout = new FrameLayout(context);
        d53 d53Var = d53.h;
        frameLayout.e = new ln(350L, d53Var);
        float f = 0.0f;
        frameLayout.n = 0.0f;
        frameLayout.w = 1.0f;
        frameLayout.E = 1.0f;
        frameLayout.F = true;
        frameLayout.J = cmb.I.o();
        View view = new View(context);
        frameLayout.f = view;
        int i8 = cmb.Ei;
        view.setBackground(ulb.d(0, ulb.b(cmb.w0(null, i8, false)), 8.0f));
        frameLayout.addView(view, qoe.c(-1.0f, -1));
        ShapeDrawable b0 = cmb.b0(gm.L(8.0f), cmb.w0(null, i8, false));
        frameLayout.h = b0;
        frameLayout.setBackground(b0);
        Paint paint = new Paint(1);
        frameLayout.a = paint;
        int i9 = cmb.Ii;
        paint.setColor(cmb.w0(null, i9, false));
        ho hoVar = new ho(true, true, false);
        frameLayout.b = hoVar;
        hoVar.n(0.3f, 250L, d53Var);
        hoVar.setCallback(frameLayout);
        hoVar.w(gm.L(14.0f));
        hoVar.x(gm.o());
        hoVar.u(cmb.w0(null, i9, false));
        hoVar.t("", true, true);
        hoVar.b = 1;
        ho hoVar2 = new ho(false, false, true);
        frameLayout.c = hoVar2;
        hoVar2.n(0.3f, 250L, d53Var);
        hoVar2.setCallback(frameLayout);
        hoVar2.w(gm.L(12.0f));
        hoVar2.x(gm.o());
        hoVar2.u(cmb.w0(null, i8, false));
        hoVar2.t("", true, true);
        hoVar2.b = 1;
        frameLayout.setWillNotDraw(false);
        this.g2 = frameLayout;
        frameLayout.setOnClickListener(new sf3(this, (byte) 20));
        this.b.addView(this.g2, qoe.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.h2 = view2;
        anb.h(cmb.Z6, null, view2);
        this.b.addView(this.h2, qoe.d(-1, 1.0f / gm.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = gm.L(6.0f);
        int L2 = gm.L(6.0f);
        if (this.g2 != null) {
            f = 68.0f;
        }
        this.n1.setPadding(L, 0, L2, gm.L(f));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f2 = frameLayout2;
        this.b.addView(frameLayout2, qoe.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        K(cmb.w0(null, cmb.g5, false));
        c1(false);
        this.o1.setTitle(J0());
    }

    public final void c1(boolean z) {
        String M0;
        float f;
        int i;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.U1;
        ArrayList arrayList = this.d2;
        int size = arrayList.size();
        hn4 hn4Var = this.g2;
        if (hn4Var != null) {
            if (this.W1) {
                if (size > 0) {
                    i = 2131750601;
                } else {
                    i = 2131750602;
                }
                hn4Var.b(jb6.M0(i, null), z);
            } else {
                ArrayList arrayList2 = this.b2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i2 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.g2.b(jb6.V(null, null, 2131750607, k47.A5(gw3.m(this.X1, this.g2.b.a.getFontMetricsInt(), false, null, 0), this.Y1, this.g2.b.a.getFontMetricsInt(), false)), z);
                        hn4 hn4Var2 = this.g2;
                        if (this.Z1) {
                            i2 = 26;
                        }
                        hn4Var2.b.p = i2;
                    } else {
                        hn4 hn4Var3 = this.g2;
                        if (size > 0) {
                            M0 = jb6.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = jb6.M0(2131750603, null);
                        }
                        hn4Var3.b(M0, z);
                    }
                } else {
                    this.g2.b(jb6.M0(2131747564, null), z);
                }
            }
            hn4 hn4Var4 = this.g2;
            ho hoVar = hn4Var4.c;
            if (z) {
                hoVar.a();
                int i3 = hn4Var4.y;
                if (size != i3 && size > 0 && i3 > 0) {
                    ValueAnimator valueAnimator = hn4Var4.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        hn4Var4.x = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    hn4Var4.x = ofFloat;
                    ofFloat.addUpdateListener(new fn4(hn4Var4, (byte) 1));
                    hn4Var4.x.addListener(new kh2(hn4Var4, (byte) 25));
                    b10.n(2.0f, hn4Var4.x);
                    hn4Var4.x.setDuration(200L);
                    hn4Var4.x.start();
                }
            }
            hn4Var4.y = size;
            if (size != 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            hn4Var4.d = f;
            hoVar.t(String.valueOf(size), z, true);
            hn4Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.g2.setEnabled(!arrayList.isEmpty());
            }
        }
        kn4 kn4Var = this.i2;
        if (kn4Var != null) {
            kn4Var.a();
        }
    }

    public final void d1() {
        int i;
        ArrayList arrayList = this.c2;
        ArrayList arrayList2 = this.b2;
        in4 in4Var = this.t2;
        if (in4Var == null) {
            return;
        }
        boolean z = false;
        if (this.W1) {
            in4Var.b(jb6.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            in4Var.b(jb6.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.d2.size() >= arrayList2.size() - arrayList.size()) {
                z = true;
            }
            in4 in4Var2 = this.t2;
            if (z) {
                i = 2131751394;
            } else {
                i = 2131745404;
            }
            in4Var2.a(jb6.M0(i, null), new y8c((byte) 20, this, z));
            return;
        }
        this.t2.a("", null);
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.u2 >= 0) {
            this.r1.getConnectionsManager().cancelRequest(this.u2, true);
        }
        qac qacVar = this.w2;
        if (qacVar != null) {
            qacVar.a(Boolean.valueOf(this.v2));
            this.w2 = null;
        }
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int w0 = cmb.w0(null, cmb.g5, false);
            if (this.H0 != w0) {
                K(w0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
