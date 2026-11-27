package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e;
public final class it1 extends g69 {
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
    public final zu1 R;
    public final Context h;
    public final boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public it1(zu1 zu1Var, Context context) {
        boolean z;
        this.R = zu1Var;
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
        TLRPC.User user = zu1Var.f;
        if (user != null && user.bot) {
            z = true;
        } else {
            z = false;
        }
        this.n = z;
        C(true);
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    public final void F(boolean z) {
        zu1 zu1Var = this.R;
        if (lbc.w(zu1Var.f)) {
            if (z) {
                zu1Var.id = true;
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

    public final void H(r47 r47Var) {
        zu1 zu1Var = this.R;
        int childCount = zu1Var.A0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = zu1Var.A0.getChildAt(i);
            if (childAt instanceof wb2) {
                wb2 wb2Var = (wb2) childAt;
                if (wb2Var.getMessageObject() == r47Var) {
                    wb2Var.invalidate();
                    return;
                }
            }
        }
    }

    public final boolean I() {
        zu1 zu1Var = this.R;
        if (lbc.x(zu1Var.f) && zu1Var.c() == 0 && !zu1Var.id && zu1Var.g4 == 0) {
            return true;
        }
        return false;
    }

    public final void J(boolean z) {
        boolean z2;
        boolean z3;
        zu1 zu1Var = this.R;
        ArrayList arrayList = zu1Var.M6;
        if (f11.a) {
            cc4.b("notify data set changed fragmentOpened=" + zu1Var.g6);
        }
        if (z && zu1Var.g6) {
            o79 itemAnimator = zu1Var.A0.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            zu1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            r47 r47Var = (r47) arrayList.get(size);
            if (r47Var.l0) {
                size--;
            } else {
                TLRPC.Message message = r47Var.k;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionChannelCreate)) {
                        z2 = true;
                    }
                }
            }
        }
        z2 = false;
        boolean[] zArr = zu1Var.U6;
        if ((zArr[0] && (zu1Var.d7 == 0 || zArr[1])) || z2) {
            z3 = ((e) zu1Var).fragmentBeginToShow;
            zu1Var.X4(z3);
        }
    }

    public final void K(int i, boolean z) {
        boolean z2;
        r47 messageObject;
        String str;
        if (f11.a) {
            StringBuilder sb = new StringBuilder("notify item removed ");
            sb.append(i);
            if (z) {
                str = " with thanos effect";
            } else {
                str = "";
            }
            uh9.s(str, sb);
        }
        zu1 zu1Var = this.R;
        z2 = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z2) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        if (z && zu1Var.B0 != null) {
            o79 itemAnimator2 = zu1Var.A0.getItemAnimator();
            yq1 yq1Var2 = zu1Var.B0;
            if (itemAnimator2 == yq1Var2) {
                f89 L = zu1Var.A0.L(i);
                if (L == null) {
                    yq1Var2.getClass();
                } else {
                    yq1Var2.S.add(L);
                    View view = L.a;
                    if ((view instanceof wb2) && (messageObject = ((wb2) view).getMessageObject()) != null) {
                        messageObject.a0 = true;
                    }
                }
            }
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void L(int i) {
        int i2;
        zu1 zu1Var = this.R;
        ArrayList arrayList = zu1Var.M6;
        if (zu1Var.C0 != null && !this.M && !this.O) {
            int i3 = 0;
            if (!zu1Var.R4 && zu1Var.b8 != null) {
                int childCount = zu1Var.A0.getChildCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= childCount) {
                        break;
                    }
                    View childAt = zu1Var.A0.getChildAt(i4);
                    if (childAt instanceof wb2) {
                        r47 messageObject = ((wb2) childAt).getMessageObject();
                        r47 r47Var = zu1Var.b8;
                        if (messageObject == r47Var) {
                            if (arrayList.indexOf(r47Var) >= 0) {
                                i2 = arrayList.indexOf(zu1Var.b8) + this.K;
                                i3 = zu1Var.i7(childAt);
                            }
                        }
                    }
                    i4++;
                }
            }
            i2 = -1;
            g(i);
            if (i2 != -1) {
                zu1Var.C0.g1(i2, i3);
            }
        }
    }

    public final wb2 M(r47 r47Var, boolean z, boolean z2) {
        ArrayList arrayList;
        zu1 zu1Var = this.R;
        if (z) {
            int childCount = zu1Var.A0.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = zu1Var.A0.getChildAt(i);
                if (childAt instanceof wb2) {
                    wb2 wb2Var = (wb2) childAt;
                    if (wb2Var.getMessageObject() == r47Var && TextUtils.equals(wb2Var.z5, wb2Var.Q5.k.post_author)) {
                        wb2Var.z3(r47Var, wb2Var.getCurrentMessagesGroup(), wb2Var.K2(), wb2Var.L2(), wb2Var.C2(), wb2Var.G2());
                        return wb2Var;
                    }
                }
                i++;
                r47Var = r47Var;
            }
        }
        r47 r47Var2 = r47Var;
        if (this.M) {
            arrayList = this.N;
        } else if (this.O) {
            arrayList = this.Q;
        } else {
            arrayList = zu1Var.M6;
        }
        int indexOf = arrayList.indexOf(r47Var2);
        if (indexOf == -1) {
            return null;
        }
        if (z2) {
            int i2 = zu1.Cd;
            zu1.Cd = i2 + 1;
            r47Var2.m1 = i2;
            J(true);
            return null;
        }
        L(this.K + indexOf);
        return null;
    }

    public final void N() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it1.N():void");
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
        zu1 zu1Var = this.R;
        zh6 zh6Var = zu1Var.v8;
        if (zu1Var.e6.get(zu1Var.s4, 0) != 0) {
            TLRPC.User user = zu1Var.f;
            if (user == null || !user.bot || zu1Var.g4 != 0 || ((zh6Var.m() <= 0 || (((TL_bots.BotInfo) zh6Var.f(zu1Var.f.id)).description == null && ((TL_bots.BotInfo) zh6Var.f(zu1Var.f.id)).description_photo == null && ((TL_bots.BotInfo) zh6Var.f(zu1Var.f.id)).description_document == null)) && !lbc.B(zu1Var.f) && !lbc.w(zu1Var.f))) {
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
        zu1 zu1Var = this.R;
        if (zu1Var.e6.get(zu1Var.s4, 0) == 0 || i != this.y) {
            if (this.M) {
                arrayList = this.N;
            } else if (this.O) {
                arrayList = this.Q;
            } else {
                arrayList = zu1Var.M6;
            }
            int i2 = this.K;
            if (i >= i2 && i < this.L) {
                return ((r47) arrayList.get(i - i2)).m1;
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
        zu1 zu1Var = this.R;
        if (zu1Var.e6.get(zu1Var.s4, 0) == 0 || i != this.y) {
            if (i != this.s && i != this.w) {
                int i2 = this.K;
                if (i >= i2 && i < this.L) {
                    if (this.M) {
                        arrayList = this.N;
                    } else if (this.O) {
                        arrayList = this.Q;
                    } else {
                        arrayList = zu1Var.M6;
                    }
                    return ((r47) arrayList.get(i - i2)).U;
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
        if (f11.a) {
            cc4.b("notify item changed " + i);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        if (z && !zu1Var.c1) {
            o79 itemAnimator = zu1Var.A0.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        } else {
            zu1Var.A0.setItemAnimator(null);
        }
        N();
        try {
            super.g(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void i(int i) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item inserted " + i);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        try {
            super.i(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void j(int i, int i2) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item moved" + i + ":" + i2);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        try {
            super.j(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void l(int i, int i2) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item range changed " + i + ":" + i2);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        try {
            super.l(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void p(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        zu1 zu1Var = this.R;
        ArrayList arrayList = zu1Var.M6;
        if (f11.a) {
            cc4.b("notify item range inserted " + i + ":" + i2);
        }
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        if (i == 1 && i2 > 0 && (i3 = i + i2) >= (i4 = this.K) && i3 < this.L) {
            r47 r47Var = (r47) arrayList.get(i3 - i4);
            r47 r47Var2 = (r47) arrayList.get((i3 - this.K) - 1);
            if ((zu1Var.e != null && r47Var.Z0() == r47Var2.Z0()) || (zu1Var.f != null && r47Var.O3() == r47Var2.O3())) {
                g(i);
            }
        }
        try {
            super.p(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void q(int i, int i2) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item range removed" + i + ":" + i2);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        try {
            super.q(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void s(int i) {
        boolean z;
        if (f11.a) {
            cc4.b("notify item removed " + i);
        }
        zu1 zu1Var = this.R;
        z = ((e) zu1Var).fragmentBeginToShow;
        wq1 wq1Var = zu1Var.A0;
        if (!z) {
            wq1Var.setItemAnimator(null);
        } else {
            o79 itemAnimator = wq1Var.getItemAnimator();
            yq1 yq1Var = zu1Var.B0;
            if (itemAnimator != yq1Var) {
                zu1Var.A0.setItemAnimator(yq1Var);
            }
        }
        N();
        try {
            super.s(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void t(defpackage.f89 r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it1.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        wb2 wb2Var;
        int i2;
        int i3;
        ft1 ft1Var;
        int i4;
        bf2 bf2Var;
        int i5;
        zu1 zu1Var = this.R;
        if (i == 0) {
            i5 = ((e) zu1Var).currentAccount;
            wb2 wb2Var2 = new wb2(this.h, i5, true, zu1Var.Za, zu1Var.Ba);
            wb2Var2.setResourcesProvider(zu1Var.Ba);
            ju1 ju1Var = zu1Var.kd;
            if (ju1Var == null) {
                ju1Var = new ju1(zu1Var);
                zu1Var.kd = ju1Var;
            }
            wb2Var2.setDelegate(ju1Var);
            wb2Var2.jc = zu1Var.Ec;
            wb2Var = wb2Var2;
            if (zu1Var.h == null) {
                wb2Var2.setAllowAssistant(true);
                wb2Var = wb2Var2;
            }
        } else {
            Context context = this.h;
            if (i == 1) {
                dl1 dl1Var = new dl1(zu1Var.Ba, context, true);
                dl1Var.setInvalidateColors(true);
                dl1Var.setDelegate(new dt1(this));
                wb2Var = dl1Var;
            } else {
                if (i == 2) {
                    bf2 bf2Var2 = new bf2(context, zu1Var.Ba);
                    bf2Var = bf2Var2;
                    if (!zu1Var.U7()) {
                        yob.X(bf2Var2.getTextView(), aob.wf, zu1Var.Ba);
                        yob.x(bf2Var2.getBackgroundLayout(), bf2Var2.getBackgroundLayout().getBackground(), aob.xf, zu1Var.Ba, PorterDuff.Mode.MULTIPLY);
                        bf2Var = bf2Var2;
                    }
                } else {
                    if (i == 3) {
                        i4 = ((e) zu1Var).currentAccount;
                        ?? et1Var = new et1(this, context, i4, zu1Var.Ba);
                        et1Var.setDelegate(new rd1(this, (byte) 11));
                        ft1Var = et1Var;
                    } else if (i == 4) {
                        bf2Var = new cb2(context, zu1Var.Ba);
                    } else if (i == 6) {
                        i3 = ((e) zu1Var).currentAccount;
                        bf2Var = new gbc(i3, zu1Var.Ba, context);
                    } else if (i == 7) {
                        bf2Var = new dl1(zu1Var.Ba, context, false);
                    } else if (i == 8) {
                        i2 = ((e) zu1Var).currentAccount;
                        ft1Var = new ft1(this, context, i2, zu1Var.Ba);
                    } else if (i == 10) {
                        ?? ec2Var = new ec2(context, zu1Var.Ba);
                        ju1 ju1Var2 = zu1Var.kd;
                        if (ju1Var2 == null) {
                            ju1Var2 = new ju1(zu1Var);
                            zu1Var.kd = ju1Var2;
                        }
                        ec2Var.setDelegate(ju1Var2);
                        bf2Var = ec2Var;
                    } else {
                        wb2Var = null;
                    }
                    wb2Var = ft1Var;
                }
                wb2Var = bf2Var;
            }
        }
        return qu6.h(wb2Var, wb2Var, -1, -2);
    }

    @Override
    public final void y(defpackage.f89 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it1.y(f89):void");
    }
}
