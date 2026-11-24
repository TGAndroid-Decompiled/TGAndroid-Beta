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
public final class hu1 extends u49 {
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
    public final yv1 R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public hu1(yv1 yv1Var, Context context) {
        boolean z;
        this.R = yv1Var;
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
        TLRPC.User user = yv1Var.f;
        if (user != null && user.bot) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        C(true);
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    public final void F(boolean z) {
        yv1 yv1Var = this.R;
        if (m9c.w(yv1Var.f)) {
            if (z) {
                yv1Var.fd = true;
            }
            if (this.J >= 0 && !I()) {
                super.s(this.J);
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

    public final void H(k47 k47Var) {
        yv1 yv1Var = this.R;
        int childCount = yv1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = yv1Var.A0.getChildAt(i);
            if (childAt instanceof rc2) {
                rc2 rc2Var = (rc2) childAt;
                if (rc2Var.getMessageObject() == k47Var) {
                    rc2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean I() {
        yv1 yv1Var = this.R;
        if (m9c.x(yv1Var.f) && yv1Var.d() == 0 && !yv1Var.fd && yv1Var.g4 == 0) {
            return true;
        }
        return false;
    }

    public final void J(boolean z) {
        boolean z2;
        boolean z3;
        yv1 yv1Var = this.R;
        ArrayList arrayList = yv1Var.M6;
        if (e21.a) {
            fc4.b("notify data set changed fragmentOpened=" + yv1Var.g6);
        }
        if (z && yv1Var.g6) {
            d69 itemAnimator = yv1Var.A0.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            yv1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.f();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            k47 k47Var = (k47) arrayList.get(size);
            if (k47Var.l0) {
                size--;
            } else {
                TLRPC.Message message = k47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        boolean[] zArr = yv1Var.U6;
        if ((zArr[0] && (yv1Var.d7 == 0 || zArr[1])) || z2) {
            z3 = ((d) yv1Var).fragmentBeginToShow;
            yv1Var.Y4(z3);
        }
    }

    public final void K(int i, boolean z) {
        boolean z2;
        k47 messageObject;
        String str;
        if (e21.a) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i);
            if (z) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            hg9.r(str, sb);
        }
        yv1 yv1Var = this.R;
        z2 = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z2) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        if (z && yv1Var.B0 != null) {
            d69 itemAnimator2 = yv1Var.A0.getItemAnimator();
            xr1 xr1Var2 = yv1Var.B0;
            if (itemAnimator2 == xr1Var2) {
                u69 K = yv1Var.A0.K(i);
                if (K == null) {
                    xr1Var2.getClass();
                } else {
                    xr1Var2.S.add(K);
                    View view = K.a;
                    if ((view instanceof rc2) && (messageObject = ((rc2) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void L(int i) {
        int i2;
        yv1 yv1Var = this.R;
        ArrayList arrayList = yv1Var.M6;
        if (yv1Var.C0 != null && !this.M && !this.O) {
            int i3 = 0;
            if (!yv1Var.R4 && yv1Var.b8 != null) {
                int childCount = yv1Var.A0.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = yv1Var.A0.getChildAt(i4);
                    if (childAt instanceof rc2) {
                        k47 messageObject = ((rc2) childAt).getMessageObject();
                        k47 k47Var = yv1Var.b8;
                        if (messageObject == k47Var) {
                            if (arrayList.indexOf(k47Var) >= 0) {
                                i2 = arrayList.indexOf(yv1Var.b8) + this.K;
                                i3 = yv1Var.i7(childAt);
                            }
                        }
                    }
                    i4++;
                }
            }
            i2 = -1;
            g(i);
            if (i2 != -1) {
                yv1Var.C0.g1(i2, i3);
            }
        }
    }

    public final rc2 M(k47 k47Var, boolean z, boolean z2) {
        ArrayList arrayList;
        yv1 yv1Var = this.R;
        if (z) {
            int childCount = yv1Var.A0.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = yv1Var.A0.getChildAt(i);
                if (childAt instanceof rc2) {
                    rc2 rc2Var = (rc2) childAt;
                    if (rc2Var.getMessageObject() == k47Var && TextUtils.equals(rc2Var.z5, rc2Var.Q5.k.post_author)) {
                        rc2Var.z3(k47Var, rc2Var.getCurrentMessagesGroup(), rc2Var.K2(), rc2Var.L2(), rc2Var.C2(), rc2Var.G2());
                        return rc2Var;
                    }
                }
                i++;
                k47Var = k47Var;
            }
        }
        k47 k47Var2 = k47Var;
        if (this.M) {
            arrayList = this.N;
        } else if (this.O) {
            arrayList = this.Q;
        } else {
            arrayList = yv1Var.M6;
        }
        int indexOf = arrayList.indexOf(k47Var2);
        if (indexOf == -1) {
            return null;
        }
        if (z2) {
            int i2 = yv1.zd;
            yv1.zd = i2 + 1;
            k47Var2.m1 = i2;
            J(true);
            return null;
        }
        L(this.K + indexOf);
        return null;
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu1.N():void");
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
        yv1 yv1Var = this.R;
        vh6 vh6Var = yv1Var.v8;
        if (yv1Var.e6.get(yv1Var.s4, 0) != 0) {
            TLRPC.User user = yv1Var.f;
            if (user == null || !user.bot || yv1Var.g4 != 0 || ((vh6Var.m() <= 0 || (((TL_bots.BotInfo) vh6Var.f(yv1Var.f.id)).description == null && ((TL_bots.BotInfo) vh6Var.f(yv1Var.f.id)).description_photo == null && ((TL_bots.BotInfo) vh6Var.f(yv1Var.f.id)).description_document == null)) && !m9c.B(yv1Var.f) && !m9c.w(yv1Var.f))) {
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
        yv1 yv1Var = this.R;
        if (yv1Var.e6.get(yv1Var.s4, 0) == 0 || i != this.y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = yv1Var.M6;
            }
            int i2 = this.K;
            if (i >= i2 && i < this.L) {
                return ((k47) arrayList.get(i - i2)).m1;
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
        yv1 yv1Var = this.R;
        if (yv1Var.e6.get(yv1Var.s4, 0) == 0 || i != this.y) {
            if (i != this.s && i != this.w) {
                int i2 = this.K;
                if (i >= i2 && i < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = yv1Var.M6;
                    }
                    return ((k47) arrayList.get(i - i2)).U;
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
        if (e21.a) {
            fc4.b("notify item changed " + i);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        if (z && !yv1Var.c1) {
            d69 itemAnimator = yv1Var.A0.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        } else {
            yv1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.g(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void i(int i) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item inserted " + i);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        try {
            super.i(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void j(int i, int i2) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item moved" + i + ":" + i2);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void l(int i, int i2) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item range changed " + i + ":" + i2);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void p(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        yv1 yv1Var = this.R;
        ArrayList arrayList = yv1Var.M6;
        if (e21.a) {
            fc4.b("notify item range inserted " + i + ":" + i2);
        }
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        if (i == 1 && i2 > 0 && (i3 = i + i2) >= (i4 = this.K) && i3 < this.L) {
            k47 k47Var = (k47) arrayList.get(i3 - i4);
            k47 k47Var2 = (k47) arrayList.get((i3 - this.K) - 1);
            if ((yv1Var.e != null && k47Var.Z0() == k47Var2.Z0()) || (yv1Var.f != null && k47Var.O3() == k47Var2.O3())) {
                g(i);
            }
        }
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void q(int i, int i2) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item range removed" + i + ":" + i2);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void s(int i) {
        boolean z;
        if (e21.a) {
            fc4.b("notify item removed " + i);
        }
        yv1 yv1Var = this.R;
        z = ((d) yv1Var).fragmentBeginToShow;
        vr1 vr1Var = yv1Var.A0;
        if (!z) {
            vr1Var.setItemAnimator(null);
        } else {
            d69 itemAnimator = vr1Var.getItemAnimator();
            xr1 xr1Var = yv1Var.B0;
            if (itemAnimator != xr1Var) {
                yv1Var.A0.setItemAnimator(xr1Var);
            }
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void t(defpackage.u69 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu1.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        rc2 rc2Var;
        int i2;
        int i3;
        eu1 eu1Var;
        int i4;
        vf2 vf2Var;
        int i5;
        yv1 yv1Var = this.R;
        if (i == 0) {
            i5 = ((d) yv1Var).currentAccount;
            rc2 rc2Var2 = new rc2(this.h, i5, true, yv1Var.Za, yv1Var.Ba);
            rc2Var2.setResourcesProvider(yv1Var.Ba);
            iv1 iv1Var = yv1Var.hd;
            if (iv1Var == null) {
                iv1Var = new iv1(yv1Var);
                yv1Var.hd = iv1Var;
            }
            rc2Var2.setDelegate(iv1Var);
            rc2Var2.jc = yv1Var.Dc;
            rc2Var = rc2Var2;
            if (yv1Var.h == null) {
                rc2Var2.setAllowAssistant(true);
                rc2Var = rc2Var2;
            }
        } else {
            Context context = this.h;
            if (i == 1) {
                cm1 cm1Var = new cm1(yv1Var.Ba, context, true);
                cm1Var.setInvalidateColors(true);
                cm1Var.setDelegate(new cu1(this));
                rc2Var = cm1Var;
            } else {
                if (i == 2) {
                    vf2 vf2Var2 = new vf2(context, yv1Var.Ba);
                    vf2Var = vf2Var2;
                    if (!yv1Var.U7()) {
                        anb.X(vf2Var2.getTextView(), cmb.vf, yv1Var.Ba);
                        anb.x(vf2Var2.getBackgroundLayout(), vf2Var2.getBackgroundLayout().getBackground(), cmb.wf, yv1Var.Ba, PorterDuff.Mode.MULTIPLY);
                        vf2Var = vf2Var2;
                    }
                } else {
                    if (i == 3) {
                        i4 = ((d) yv1Var).currentAccount;
                        ?? du1Var = new du1(this, context, i4, yv1Var.Ba);
                        du1Var.setDelegate(new cd1(this, (byte) 12));
                        eu1Var = du1Var;
                    } else if (i == 4) {
                        vf2Var = new xb2(context, yv1Var.Ba);
                    } else if (i == 6) {
                        i3 = ((d) yv1Var).currentAccount;
                        vf2Var = new h9c(i3, yv1Var.Ba, context);
                    } else if (i == 7) {
                        vf2Var = new cm1(yv1Var.Ba, context, false);
                    } else if (i == 8) {
                        i2 = ((d) yv1Var).currentAccount;
                        eu1Var = new eu1(this, context, i2, yv1Var.Ba);
                    } else if (i == 10) {
                        ?? zc2Var = new zc2(context, yv1Var.Ba);
                        iv1 iv1Var2 = yv1Var.hd;
                        if (iv1Var2 == null) {
                            iv1Var2 = new iv1(yv1Var);
                            yv1Var.hd = iv1Var2;
                        }
                        zc2Var.setDelegate(iv1Var2);
                        vf2Var = zc2Var;
                    } else {
                        rc2Var = null;
                    }
                    rc2Var = eu1Var;
                }
                rc2Var = vf2Var;
            }
        }
        return kt6.h(rc2Var, rc2Var, -1, -2);
    }

    @Override
    public final void y(defpackage.u69 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu1.y(u69):void");
    }
}
