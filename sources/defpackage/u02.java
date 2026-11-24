package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class u02 extends n39 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final x02 L;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public final ArrayList h = new ArrayList();
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public u02(x02 x02Var, Context context) {
        this.L = x02Var;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final int b() {
        int i = this.K;
        x02 x02Var = this.L;
        if (x02Var.E3 == null && (x02Var.Z1 instanceof mu1) && !x02Var.B1) {
            return hq6.d0(x02Var.G3).k1.size() + i;
        }
        return i;
    }

    @Override
    public final int d(int i) {
        if (i >= this.K) {
            return 1;
        }
        if (i >= this.e && i < this.f) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        TLRPC.Chat chat;
        int i = 0;
        this.K = 0;
        this.d = -1;
        this.n = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.e = -1;
        this.f = -1;
        this.r = -1;
        x02 x02Var = this.L;
        boolean z = true;
        if (x02Var.B1) {
            this.K = 1;
            this.d = 0;
            int i2 = x02Var.C1;
            if (i2 == 0 || fod.a(i2, 16)) {
                int i3 = this.K;
                this.K = i3 + 1;
                this.n = i3;
            }
            int i4 = this.L.C1;
            if (i4 == 0 || fod.a(i4, 8192)) {
                int i5 = this.K;
                this.K = i5 + 1;
                this.G = i5;
            }
            int i6 = this.L.C1;
            if (i6 == 0 || fod.a(i6, 16384)) {
                int i7 = this.K;
                this.K = i7 + 1;
                this.H = i7;
            }
            int i8 = this.L.C1;
            if (i8 == 0 || fod.a(i8, 8)) {
                int i9 = this.K;
                this.K = i9 + 1;
                this.s = i9;
            }
            int i10 = this.L.C1;
            if (i10 == 0 || fod.a(i10, 64)) {
                int i11 = this.K;
                this.K = i11 + 1;
                this.F = i11;
            }
            int i12 = this.L.C1;
            if (i12 == 0 || fod.a(i12, 32768)) {
                int i13 = this.K;
                this.K = i13 + 1;
                this.I = i13;
            }
        } else {
            d dVar = x02Var.Z1;
            if (!(dVar instanceof mu1)) {
                this.d = 0;
                this.K = 2;
                this.n = 1;
                if (x02Var.Q1) {
                    this.K = 3;
                    this.s = 2;
                }
            } else if (x02Var.E3 != null) {
                int i14 = x02Var.D3;
                if (i14 == -1) {
                    this.d = 0;
                    this.n = 1;
                    this.K = 3;
                    this.s = 2;
                } else {
                    if (i14 == 0) {
                        this.K = 1;
                        this.d = 0;
                        i = 1;
                    }
                    if (i14 == 1) {
                        int i15 = i + 1;
                        this.K = i15;
                        this.n = i;
                        i = i15;
                    }
                    if (i14 == 2) {
                        this.K = i + 1;
                        this.s = i;
                    }
                }
            } else {
                TLRPC.User h = ((mu1) dVar).h();
                d dVar2 = this.L.Z1;
                if (dVar2 instanceof mu1) {
                    chat = ((mu1) dVar2).e;
                } else {
                    chat = null;
                }
                if (h == null || ((mu1) dVar2).getMessagesController().K1(h.id) <= 0) {
                    z = false;
                }
                int i16 = this.K;
                this.d = i16;
                this.K = i16 + 2;
                this.n = i16 + 1;
                if (na7.q1(this.L.G3).k4.n0.f && ((mu1) this.L.Z1).g4 == 0 && x02.b1(h)) {
                    int i17 = this.K;
                    this.K = i17 + 1;
                    this.r = i17;
                }
                x02 x02Var2 = this.L;
                if (x02Var2.N3) {
                    int i18 = this.K;
                    this.K = i18 + 1;
                    this.F = i18;
                    na7.q1(x02Var2.G3);
                    boolean z2 = w01.a;
                    int i19 = this.K;
                    this.K = i19 + 1;
                    this.J = i19;
                }
                x02 x02Var3 = this.L;
                if (x02Var3.L3) {
                    int i20 = this.K;
                    this.K = i20 + 1;
                    this.w = i20;
                }
                if (x02Var3.N3) {
                    int i21 = this.K;
                    this.K = i21 + 1;
                    this.y = i21;
                }
                int i22 = this.K;
                int i23 = i22 + 1;
                this.K = i23;
                this.s = i22;
                if (x02Var3.M3) {
                    this.K = i22 + 2;
                    this.x = i23;
                }
                d dVar3 = x02Var3.Z1;
                if ((dVar3 instanceof mu1) && ((mu1) dVar3).g4 == 0 && h != null && !z && !h.bot && !ox8.f(x02Var3.G3).b.isEmpty()) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.E = i24;
                }
                x02 x02Var4 = this.L;
                if ((x02Var4.I3 || x02Var4.J3) && !z && (chat == null || !hc2.p0(chat))) {
                    d dVar4 = this.L.Z1;
                    if ((dVar4 instanceof mu1) && !((mu1) dVar4).N7() && !((mu1) this.L.Z1).y()) {
                        mu1 mu1Var = (mu1) this.L.Z1;
                        if (mu1Var.g4 != 5) {
                            this.e = this.K;
                            this.h.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.L.G3).b.bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject tLObject = mu1Var.e;
                                    if (tLObject == null) {
                                        tLObject = mu1Var.h();
                                    }
                                    if (hq6.v(tL_attachMenuBot2, tLObject)) {
                                        this.h.add(tL_attachMenuBot2);
                                    }
                                }
                            }
                            int size2 = this.h.size() + this.K;
                            this.K = size2;
                            this.f = size2;
                        }
                    }
                }
            }
        }
        super.f();
    }

    @Override
    public final void t(defpackage.s49 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u02.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View r02Var;
        Context context = this.c;
        x02 x02Var = this.L;
        if (i != 0) {
            r02Var = new q02(x02Var, context);
        } else {
            r02Var = new r02(x02Var, context);
        }
        r02Var.setImportantForAccessibility(1);
        r02Var.setFocusable(true);
        r02Var.setLayoutParams(new e49(-2, -1));
        return new s49(r02Var);
    }

    @Override
    public final void y(s49 s49Var) {
    }
}
