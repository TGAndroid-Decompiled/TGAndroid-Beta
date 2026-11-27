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
import org.telegram.ui.ActionBar.e;
public final class qn4 extends ny0 {
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
    public mn4 g2;
    public View h2;
    public pn4 i2;
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
    public nn4 t2;
    public int u2;
    public boolean v2;
    public pcc w2;
    public int x2;
    public long y2;
    public long z2;

    public qn4(e eVar, int i, ArrayList arrayList) {
        super(eVar, false);
        ac7 ac7Var;
        TLRPC.Chat M0;
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
        ArrayList arrayList3 = eVar.getMessagesController().G0;
        if (arrayList3 != null) {
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                if (((ac7) arrayList3.get(i2)).a == i) {
                    ac7Var = (ac7) arrayList3.get(i2);
                    break;
                }
            }
        }
        ac7Var = null;
        if (ac7Var != null) {
            this.X1 = ac7Var.b;
            this.Y1 = ac7Var.c;
            this.Z1 = ac7Var.n;
            for (int i3 = 0; i3 < this.d2.size(); i3++) {
                TLRPC.Peer y1 = eVar.getMessagesController().y1(((Long) this.d2.get(i3)).longValue());
                if ((y1 instanceof TLRPC.TL_peerChat) || (y1 instanceof TLRPC.TL_peerChannel)) {
                    this.b2.add(y1);
                }
            }
            for (int i4 = 0; i4 < ac7Var.h.size(); i4++) {
                Long l = (Long) ac7Var.h.get(i4);
                long longValue = l.longValue();
                if (!this.d2.contains(l)) {
                    TLRPC.Peer y12 = eVar.getMessagesController().y1(longValue);
                    if (((y12 instanceof TLRPC.TL_peerChat) || (y12 instanceof TLRPC.TL_peerChannel)) && ((M0 = eVar.getMessagesController().M0(Long.valueOf(-longValue))) == null || !xc2.r0(M0))) {
                        this.b2.add(y12);
                    }
                }
            }
        }
        b1();
    }

    public static void c1(e eVar, int i, pcc pccVar) {
        ac7 ac7Var;
        ArrayList arrayList = eVar.getMessagesController().G0;
        if (arrayList != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((ac7) arrayList.get(i2)).a == i) {
                    ac7Var = (ac7) arrayList.get(i2);
                    break;
                }
            }
        }
        ac7Var = null;
        ze7 ze7Var = new ze7(i, eVar, pccVar, (byte) 27);
        if (ac7Var != null && ac7Var.e()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eVar.getContext());
            String M0 = ob6.M0(2131750755, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131750753, null);
            alertDialog$Builder.g(ob6.M0(2131752570, null), new f62(pccVar, (byte) 1));
            alertDialog$Builder.j(ob6.M0(2131751563, null), new lu3(ze7Var, (byte) 23));
            eVar.showDialog(idVar);
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, null);
                return;
            }
            return;
        }
        ze7Var.run();
    }

    @Override
    public final c79 H0(d79 d79Var) {
        return new jn4(this);
    }

    @Override
    public final CharSequence K0() {
        if (this.W1) {
            return ob6.M0(2131750593, null);
        }
        if (this.U1 instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
            return ob6.M0(2131750596, null);
        }
        ArrayList arrayList = this.b2;
        if (arrayList != null && !arrayList.isEmpty()) {
            return ob6.M0(2131750595, null);
        }
        return ob6.M0(2131750594, null);
    }

    @Override
    public final void Q0(wma wmaVar) {
        float f;
        d79 d79Var = this.n1;
        d79Var.setOverScrollMode(2);
        int L = hl.L(6.0f);
        int L2 = hl.L(6.0f);
        if (this.g2 != null) {
            f = 68.0f;
        } else {
            f = 0.0f;
        }
        d79Var.setPadding(L, 0, L2, hl.L(f));
        d79Var.setOnItemClickListener(new zg4(this, (byte) 2));
    }

    public final void Z0(boolean z) {
        String str;
        String G = ob6.G(this.d2.size(), "FilterInviteHeaderChats", new Object[0]);
        if (z && this.t2 != null) {
            str = ", " + ((Object) this.t2.b.getText());
        } else {
            str = "";
        }
        hl.g2(G.concat(str));
    }

    public final void a1(nn4 nn4Var, boolean z) {
        int i;
        ArrayList arrayList = this.b2;
        ArrayList arrayList2 = this.d2;
        arrayList2.clear();
        arrayList2.addAll(this.c2);
        int i2 = 0;
        if (!z) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long n = wf3.n((TLRPC.Peer) arrayList.get(i3));
                if (!arrayList2.contains(Long.valueOf(n))) {
                    arrayList2.add(Long.valueOf(n));
                }
            }
        }
        d1(true);
        if (z) {
            i = 2131745398;
        } else {
            i = 2131751422;
        }
        nn4Var.a(ob6.M0(i, null), new ds6(this, nn4Var, z, (byte) 21));
        Z0(true);
        while (true) {
            d79 d79Var = this.n1;
            if (i2 < d79Var.getChildCount()) {
                View childAt = d79Var.getChildAt(i2);
                if (childAt instanceof bd5) {
                    Object tag = childAt.getTag();
                    if (tag instanceof Long) {
                        ((bd5) childAt).c(arrayList2.contains((Long) tag), true);
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b1() {
        boolean z;
        long j;
        boolean r0;
        ArrayList arrayList = this.e2;
        this.a2 = hl.G2(this.X1, "✱", "*");
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
                        e eVar = this.r1;
                        if (z2) {
                            j = -peer.chat_id;
                            r0 = xc2.r0(eVar.getMessagesController().M0(Long.valueOf(-j)));
                        } else if (peer instanceof TLRPC.TL_peerChannel) {
                            j = -peer.channel_id;
                            r0 = xc2.r0(eVar.getMessagesController().M0(Long.valueOf(-j)));
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
        k43 k43Var = k43.h;
        frameLayout.e = new mm(350L, k43Var);
        float f = 0.0f;
        frameLayout.n = 0.0f;
        frameLayout.w = 1.0f;
        frameLayout.E = 1.0f;
        frameLayout.F = true;
        frameLayout.J = aob.I.o();
        View view = new View(context);
        frameLayout.f = view;
        int i8 = aob.Fi;
        view.setBackground(rnb.d(0, rnb.b(aob.w0(null, i8, false)), 8.0f));
        frameLayout.addView(view, tre.c(-1.0f, -1));
        ShapeDrawable b0 = aob.b0(hl.L(8.0f), aob.w0(null, i8, false));
        frameLayout.h = b0;
        frameLayout.setBackground(b0);
        Paint paint = new Paint(1);
        frameLayout.a = paint;
        int i9 = aob.Ji;
        paint.setColor(aob.w0(null, i9, false));
        hn hnVar = new hn(true, true, false);
        frameLayout.b = hnVar;
        hnVar.n(0.3f, 250L, k43Var);
        hnVar.setCallback(frameLayout);
        hnVar.w(hl.L(14.0f));
        hnVar.x(hl.o());
        hnVar.u(aob.w0(null, i9, false));
        hnVar.t("", true, true);
        hnVar.b = 1;
        hn hnVar2 = new hn(false, false, true);
        frameLayout.c = hnVar2;
        hnVar2.n(0.3f, 250L, k43Var);
        hnVar2.setCallback(frameLayout);
        hnVar2.w(hl.L(12.0f));
        hnVar2.x(hl.o());
        hnVar2.u(aob.w0(null, i8, false));
        hnVar2.t("", true, true);
        hnVar2.b = 1;
        frameLayout.setWillNotDraw(false);
        this.g2 = frameLayout;
        frameLayout.setOnClickListener(new mh3(this, (byte) 19));
        this.b.addView(this.g2, tre.d(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f));
        View view2 = new View(getContext());
        this.h2 = view2;
        yob.h(aob.a7, null, view2);
        this.b.addView(this.h2, tre.d(-1, 1.0f / hl.p, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        int L = hl.L(6.0f);
        int L2 = hl.L(6.0f);
        if (this.g2 != null) {
            f = 68.0f;
        }
        this.n1.setPadding(L, 0, L2, hl.L(f));
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        this.f2 = frameLayout2;
        this.b.addView(frameLayout2, tre.d(-1, 100.0f, 87, 6.0f, 0.0f, 6.0f, 68.0f));
        K(aob.w0(null, aob.h5, false));
        d1(false);
        this.o1.setTitle(K0());
    }

    public final void d1(boolean z) {
        String M0;
        float f;
        int i;
        TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = this.U1;
        ArrayList arrayList = this.d2;
        int size = arrayList.size();
        mn4 mn4Var = this.g2;
        if (mn4Var != null) {
            if (this.W1) {
                if (size > 0) {
                    i = 2131750629;
                } else {
                    i = 2131750630;
                }
                mn4Var.b(ob6.M0(i, null), z);
            } else {
                ArrayList arrayList2 = this.b2;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    int i2 = 0;
                    if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                        this.g2.b(ob6.V(null, null, 2131750635, r47.A5(pv3.m(this.X1, this.g2.b.a.getFontMetricsInt(), false, null, 0), this.Y1, this.g2.b.a.getFontMetricsInt(), false)), z);
                        mn4 mn4Var2 = this.g2;
                        if (this.Z1) {
                            i2 = 26;
                        }
                        mn4Var2.b.p = i2;
                    } else {
                        mn4 mn4Var3 = this.g2;
                        if (size > 0) {
                            M0 = ob6.G(size, "FolderLinkButtonJoinPlural", new Object[0]);
                        } else {
                            M0 = ob6.M0(2131750631, null);
                        }
                        mn4Var3.b(M0, z);
                    }
                } else {
                    this.g2.b(ob6.M0(2131747558, null), z);
                }
            }
            mn4 mn4Var4 = this.g2;
            hn hnVar = mn4Var4.c;
            if (z) {
                hnVar.a();
                int i3 = mn4Var4.y;
                if (size != i3 && size > 0 && i3 > 0) {
                    ValueAnimator valueAnimator = mn4Var4.x;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mn4Var4.x = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    mn4Var4.x = ofFloat;
                    ofFloat.addUpdateListener(new kn4(mn4Var4, (byte) 1));
                    mn4Var4.x.addListener(new cn2(mn4Var4, (byte) 22));
                    c00.o(2.0f, mn4Var4.x);
                    mn4Var4.x.setDuration(200L);
                    mn4Var4.x.start();
                }
            }
            mn4Var4.y = size;
            if (size != 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            mn4Var4.d = f;
            hnVar.t(String.valueOf(size), z, true);
            mn4Var4.invalidate();
            if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite) {
                this.g2.setEnabled(!arrayList.isEmpty());
            }
        }
        pn4 pn4Var = this.i2;
        if (pn4Var != null) {
            pn4Var.a();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        if (this.u2 >= 0) {
            this.r1.getConnectionsManager().cancelRequest(this.u2, true);
        }
        pcc pccVar = this.w2;
        if (pccVar != null) {
            pccVar.a(Boolean.valueOf(this.v2));
            this.w2 = null;
        }
    }

    public final void e1() {
        int i;
        ArrayList arrayList = this.c2;
        ArrayList arrayList2 = this.b2;
        nn4 nn4Var = this.t2;
        if (nn4Var == null) {
            return;
        }
        boolean z = false;
        if (this.W1) {
            nn4Var.b(ob6.G(arrayList2.size(), "FolderLinkHeaderChatsQuit", new Object[0]), false);
        } else {
            nn4Var.b(ob6.G(arrayList2.size(), "FolderLinkHeaderChatsJoin", new Object[0]), false);
        }
        if (arrayList2 != null && arrayList2.size() - arrayList.size() > 1) {
            if (this.d2.size() >= arrayList2.size() - arrayList.size()) {
                z = true;
            }
            nn4 nn4Var2 = this.t2;
            if (z) {
                i = 2131751422;
            } else {
                i = 2131745398;
            }
            nn4Var2.a(ob6.M0(i, null), new xac((byte) 20, this, z));
            return;
        }
        this.t2.a("", null);
    }

    @Override
    public final void p0() {
        super.p0();
        try {
            int w0 = aob.w0(null, aob.h5, false);
            if (this.H0 != w0) {
                K(w0);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
