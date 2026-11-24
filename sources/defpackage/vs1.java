package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
public final class vs1 extends r29 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final ArrayList N;
    public boolean O;
    public boolean P;
    public final ArrayList Q;
    public final mu1 R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public vs1(mu1 mu1Var, Context context) {
        boolean z;
        this.R = mu1Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.s = -5;
        this.w = -5;
        this.x = -5;
        this.y = -5;
        this.E = -5;
        this.F = -5;
        this.G = -5;
        this.H = -5;
        this.I = -5;
        this.J = -5;
        this.N = new ArrayList();
        this.Q = new ArrayList();
        this.h = context;
        TLRPC.User user = mu1Var.f;
        if (user != null && user.bot) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        C(true);
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    public final void F(boolean z) {
        mu1 mu1Var = this.R;
        if (l7c.v(mu1Var.f)) {
            if (z) {
                mu1Var.Uc = true;
            }
            if (this.J >= 0 && !I()) {
                super.r(this.J);
                N();
            }
        }
    }

    public final ArrayList G() {
        if (this.M) {
            return this.N;
        }
        if (this.O) {
            return this.Q;
        }
        return this.R.M6;
    }

    public final void H(k27 k27Var) {
        mu1 mu1Var = this.R;
        int childCount = mu1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = mu1Var.A0.getChildAt(i);
            if (childAt instanceof gb2) {
                gb2 gb2Var = (gb2) childAt;
                if (gb2Var.getMessageObject() == k27Var) {
                    gb2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean I() {
        mu1 mu1Var = this.R;
        if (l7c.w(mu1Var.f) && mu1Var.d() == 0 && !mu1Var.Uc && mu1Var.g4 == 0) {
            return true;
        }
        return false;
    }

    public final void J(boolean z) {
        boolean z2;
        boolean z3;
        mu1 mu1Var = this.R;
        ArrayList arrayList = mu1Var.M6;
        if (w01.a) {
            fa4.b("notify data set changed fragmentOpened=" + mu1Var.g6);
        }
        if (z && mu1Var.g6) {
            b49 itemAnimator = mu1Var.A0.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            mu1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            k27 k27Var = (k27) arrayList.get(size);
            if (k27Var.l0) {
                size--;
            } else {
                TLRPC.Message message = k27Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        boolean[] zArr = mu1Var.U6;
        if ((zArr[0] && (mu1Var.d7 == 0 || zArr[1])) || z2) {
            z3 = ((d) mu1Var).fragmentBeginToShow;
            mu1Var.Q4(z3);
        }
    }

    public final void K(int i, boolean z) {
        boolean z2;
        k27 messageObject;
        String str;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i);
            if (z) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            de9.s(str, sb);
        }
        mu1 mu1Var = this.R;
        z2 = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z2) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        if (z && mu1Var.B0 != null) {
            b49 itemAnimator2 = mu1Var.A0.getItemAnimator();
            lq1 lq1Var2 = mu1Var.B0;
            if (itemAnimator2 == lq1Var2) {
                s49 K = mu1Var.A0.K(i);
                if (K == null) {
                    lq1Var2.getClass();
                } else {
                    lq1Var2.S.add(K);
                    View view = K.a;
                    if ((view instanceof gb2) && (messageObject = ((gb2) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        N();
        try {
            super.r(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void L(int i) {
        int i2;
        mu1 mu1Var = this.R;
        ArrayList arrayList = mu1Var.M6;
        if (mu1Var.C0 != null && !this.M && !this.O) {
            int i3 = 0;
            if (!mu1Var.R4 && mu1Var.b8 != null) {
                int childCount = mu1Var.A0.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = mu1Var.A0.getChildAt(i4);
                    if (childAt instanceof gb2) {
                        k27 messageObject = ((gb2) childAt).getMessageObject();
                        k27 k27Var = mu1Var.b8;
                        if (messageObject == k27Var) {
                            if (arrayList.indexOf(k27Var) >= 0) {
                                i2 = arrayList.indexOf(mu1Var.b8) + this.K;
                                i3 = mu1Var.Y6(childAt);
                            }
                        }
                    }
                    i4++;
                }
            }
            i2 = -1;
            g(i);
            if (i2 != -1) {
                mu1Var.C0.g1(i2, i3);
            }
        }
    }

    public final gb2 M(k27 k27Var, boolean z, boolean z2) {
        ArrayList arrayList;
        mu1 mu1Var = this.R;
        if (z) {
            int childCount = mu1Var.A0.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = mu1Var.A0.getChildAt(i);
                if (childAt instanceof gb2) {
                    gb2 gb2Var = (gb2) childAt;
                    if (gb2Var.getMessageObject() == k27Var && TextUtils.equals(gb2Var.z5, gb2Var.Q5.k.post_author)) {
                        gb2Var.z3(k27Var, gb2Var.getCurrentMessagesGroup(), gb2Var.K2(), gb2Var.L2(), gb2Var.C2(), gb2Var.G2());
                        return gb2Var;
                    }
                }
                i++;
                k27Var = k27Var;
            }
        }
        k27 k27Var2 = k27Var;
        if (this.M) {
            arrayList = this.N;
        } else if (this.O) {
            arrayList = this.Q;
        } else {
            arrayList = mu1Var.M6;
        }
        int indexOf = arrayList.indexOf(k27Var2);
        if (indexOf == -1) {
            return null;
        }
        if (z2) {
            int i2 = mu1.od;
            mu1.od = i2 + 1;
            k27Var2.m1 = i2;
            J(true);
            return null;
        }
        L(this.K + indexOf);
        return null;
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs1.N():void");
    }

    public final void O() {
        int i = this.r;
        int i2 = this.x;
        int i3 = this.E;
        int i4 = this.s;
        int i5 = this.w;
        int i6 = this.F;
        int i7 = this.G;
        int i8 = this.K;
        int i9 = this.L;
        int i10 = this.H;
        int i11 = this.I;
        int i12 = this.J;
        N();
        if (i == this.r && i2 == this.x && i6 == this.F && i7 == this.G && i8 == this.K && i9 == this.L && i4 == this.s && i5 == this.w && i3 == this.E && i10 == this.H && i11 == this.I && i12 == this.J) {
            return;
        }
        J(false);
    }

    @Override
    public final int b() {
        this.y = -5;
        mu1 mu1Var = this.R;
        vf6 vf6Var = mu1Var.v8;
        if (mu1Var.e6.get(mu1Var.s4, 0) != 0) {
            TLRPC.User user = mu1Var.f;
            if (user == null || !user.bot || mu1Var.g4 != 0 || ((vf6Var.m() <= 0 || (((TL_bots.BotInfo) vf6Var.f(mu1Var.f.id)).description == null && ((TL_bots.BotInfo) vf6Var.f(mu1Var.f.id)).description_photo == null && ((TL_bots.BotInfo) vf6Var.f(mu1Var.f.id)).description_document == null)) && !l7c.A(mu1Var.f) && !l7c.v(mu1Var.f))) {
                return 0;
            }
            this.y = 0;
            return 1;
        }
        return this.r;
    }

    @Override
    public final long c(int i) {
        ArrayList arrayList;
        mu1 mu1Var = this.R;
        if (mu1Var.e6.get(mu1Var.s4, 0) == 0 || i != this.y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = mu1Var.M6;
            }
            int i2 = this.K;
            if (i >= i2 && i < this.L) {
                return ((k27) arrayList.get(i - i2)).m1;
            }
            if (i != this.x && i != this.y) {
                if (i == this.F) {
                    return 2L;
                }
                if (i == this.G) {
                    return 3L;
                }
                if (i == this.s) {
                    return 4L;
                }
                if (i == this.E) {
                    return 6L;
                }
                if (i == this.H) {
                    return 7L;
                }
                if (i == this.I) {
                    return 8L;
                }
                if (i == this.J) {
                    return 9L;
                }
                if (i == this.w) {
                    return 10L;
                }
                return 5L;
            }
            return 1L;
        }
        return 1L;
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList;
        mu1 mu1Var = this.R;
        if (mu1Var.e6.get(mu1Var.s4, 0) == 0 || i != this.y) {
            if (i != this.s && i != this.w) {
                int i2 = this.K;
                if (i >= i2 && i < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = mu1Var.M6;
                    }
                    return ((k27) arrayList.get(i - i2)).U;
                } else if (i == this.x) {
                    return 3;
                } else {
                    if (i == this.E) {
                        return 6;
                    }
                    if (i != this.I && i != this.H) {
                        if (i == this.J) {
                            return 8;
                        }
                        return 4;
                    }
                    return 7;
                }
            }
            return 1;
        }
        return 3;
    }

    @Override
    public final void f() {
        J(false);
    }

    @Override
    public final void g(int i) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item changed " + i);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        if (z && !mu1Var.c1) {
            b49 itemAnimator = mu1Var.A0.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        } else {
            mu1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.g(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void i(int i) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item inserted " + i);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        try {
            super.i(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void j(int i, int i2) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item moved" + i + ":" + i2);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void l(int i, int i2) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item range changed " + i + ":" + i2);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void p(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        mu1 mu1Var = this.R;
        ArrayList arrayList = mu1Var.M6;
        if (w01.a) {
            fa4.b("notify item range inserted " + i + ":" + i2);
        }
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        if (i == 1 && i2 > 0 && (i3 = i + i2) >= (i4 = this.K) && i3 < this.L) {
            k27 k27Var = (k27) arrayList.get(i3 - i4);
            k27 k27Var2 = (k27) arrayList.get((i3 - this.K) - 1);
            if ((mu1Var.e != null && k27Var.Z0() == k27Var2.Z0()) || (mu1Var.f != null && k27Var.O3() == k27Var2.O3())) {
                g(i);
            }
        }
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void q(int i, int i2) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item range removed" + i + ":" + i2);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void r(int i) {
        boolean z;
        if (w01.a) {
            fa4.b("notify item removed " + i);
        }
        mu1 mu1Var = this.R;
        z = ((d) mu1Var).fragmentBeginToShow;
        jq1 jq1Var = mu1Var.A0;
        if (!z) {
            jq1Var.setItemAnimator(null);
        } else {
            b49 itemAnimator = jq1Var.getItemAnimator();
            lq1 lq1Var = mu1Var.B0;
            if (itemAnimator != lq1Var) {
                mu1Var.A0.setItemAnimator(lq1Var);
            }
        }
        N();
        try {
            super.r(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void t(defpackage.s49 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs1.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        gb2 gb2Var;
        int i2;
        int i3;
        ss1 ss1Var;
        int i4;
        ke2 ke2Var;
        int i5;
        mu1 mu1Var = this.R;
        if (i == 0) {
            i5 = ((d) mu1Var).currentAccount;
            gb2 gb2Var2 = new gb2(this.h, i5, true, mu1Var.Za, mu1Var.Ba);
            gb2Var2.setResourcesProvider(mu1Var.Ba);
            wt1 wt1Var = mu1Var.Wc;
            if (wt1Var == null) {
                wt1Var = new wt1(mu1Var);
                mu1Var.Wc = wt1Var;
            }
            gb2Var2.setDelegate(wt1Var);
            gb2Var2.jc = mu1Var.tc;
            gb2Var = gb2Var2;
            if (mu1Var.h == null) {
                gb2Var2.setAllowAssistant(true);
                gb2Var = gb2Var2;
            }
        } else {
            Context context = this.h;
            if (i == 1) {
                uk1 uk1Var = new uk1(mu1Var.Ba, context, true);
                uk1Var.setInvalidateColors(true);
                uk1Var.setDelegate(new qs1(this));
                gb2Var = uk1Var;
            } else {
                if (i == 2) {
                    ke2 ke2Var2 = new ke2(context, mu1Var.Ba);
                    ke2Var = ke2Var2;
                    if (!mu1Var.K7()) {
                        zkb.X(ke2Var2.getTextView(), bkb.vf, mu1Var.Ba);
                        zkb.x(ke2Var2.getBackgroundLayout(), ke2Var2.getBackgroundLayout().getBackground(), bkb.wf, mu1Var.Ba, PorterDuff.Mode.MULTIPLY);
                        ke2Var = ke2Var2;
                    }
                } else {
                    if (i == 3) {
                        i4 = ((d) mu1Var).currentAccount;
                        ?? rs1Var = new rs1(this, context, i4, mu1Var.Ba);
                        rs1Var.setDelegate(new rh1(this, (byte) 9));
                        ss1Var = rs1Var;
                    } else if (i == 4) {
                        ke2Var = new ma2(context, mu1Var.Ba);
                    } else if (i == 6) {
                        i3 = ((d) mu1Var).currentAccount;
                        ke2Var = new g7c(i3, mu1Var.Ba, context);
                    } else if (i == 7) {
                        ke2Var = new uk1(mu1Var.Ba, context, false);
                    } else if (i == 8) {
                        i2 = ((d) mu1Var).currentAccount;
                        ss1Var = new ss1(this, context, i2, mu1Var.Ba);
                    } else if (i == 10) {
                        ?? ob2Var = new ob2(context, mu1Var.Ba);
                        wt1 wt1Var2 = mu1Var.Wc;
                        if (wt1Var2 == null) {
                            wt1Var2 = new wt1(mu1Var);
                            mu1Var.Wc = wt1Var2;
                        }
                        ob2Var.setDelegate(wt1Var2);
                        ke2Var = ob2Var;
                    } else {
                        gb2Var = null;
                    }
                    gb2Var = ss1Var;
                }
                gb2Var = ke2Var;
            }
        }
        return ls6.h(gb2Var, gb2Var, -1, -2);
    }

    @Override
    public final void y(defpackage.s49 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs1.y(s49):void");
    }
}
