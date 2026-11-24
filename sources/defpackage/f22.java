package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class f22 extends q59 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final i22 L;
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

    public f22(i22 i22Var, Context context) {
        this.L = i22Var;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override
    public final int b() {
        int i = this.K;
        i22 i22Var = this.L;
        if (i22Var.E3 == null && (i22Var.Z1 instanceof yv1) && !i22Var.B1) {
            return hs6.d0(i22Var.G3).k1.size() + i;
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
        i22 i22Var = this.L;
        boolean z = true;
        if (i22Var.B1) {
            this.K = 1;
            this.d = 0;
            int i2 = i22Var.C1;
            if (i2 == 0 || iqd.a(i2, 16)) {
                int i3 = this.K;
                this.K = i3 + 1;
                this.n = i3;
            }
            int i4 = this.L.C1;
            if (i4 == 0 || iqd.a(i4, 8192)) {
                int i5 = this.K;
                this.K = i5 + 1;
                this.G = i5;
            }
            int i6 = this.L.C1;
            if (i6 == 0 || iqd.a(i6, 16384)) {
                int i7 = this.K;
                this.K = i7 + 1;
                this.H = i7;
            }
            int i8 = this.L.C1;
            if (i8 == 0 || iqd.a(i8, 8)) {
                int i9 = this.K;
                this.K = i9 + 1;
                this.s = i9;
            }
            int i10 = this.L.C1;
            if (i10 == 0 || iqd.a(i10, 64)) {
                int i11 = this.K;
                this.K = i11 + 1;
                this.F = i11;
            }
            int i12 = this.L.C1;
            if (i12 == 0 || iqd.a(i12, 32768)) {
                int i13 = this.K;
                this.K = i13 + 1;
                this.I = i13;
            }
        } else {
            d dVar = i22Var.Z1;
            if (!(dVar instanceof yv1)) {
                this.d = 0;
                this.K = 2;
                this.n = 1;
                if (i22Var.Q1) {
                    this.K = 3;
                    this.s = 2;
                }
            } else if (i22Var.E3 != null) {
                int i14 = i22Var.D3;
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
                TLRPC.User h = ((yv1) dVar).h();
                d dVar2 = this.L.Z1;
                if (dVar2 instanceof yv1) {
                    chat = ((yv1) dVar2).e;
                } else {
                    chat = null;
                }
                if (h == null || ((yv1) dVar2).getMessagesController().L1(h.id) <= 0) {
                    z = false;
                }
                int i16 = this.K;
                this.d = i16;
                this.K = i16 + 2;
                this.n = i16 + 1;
                if (oc7.r1(this.L.G3).l4.n0.f && ((yv1) this.L.Z1).g4 == 0 && i22.b1(h)) {
                    int i17 = this.K;
                    this.K = i17 + 1;
                    this.r = i17;
                }
                i22 i22Var2 = this.L;
                if (i22Var2.N3) {
                    int i18 = this.K;
                    this.K = i18 + 1;
                    this.F = i18;
                    oc7.r1(i22Var2.G3);
                    boolean z2 = e21.a;
                    int i19 = this.K;
                    this.K = i19 + 1;
                    this.J = i19;
                }
                i22 i22Var3 = this.L;
                if (i22Var3.L3) {
                    int i20 = this.K;
                    this.K = i20 + 1;
                    this.w = i20;
                }
                if (i22Var3.N3) {
                    int i21 = this.K;
                    this.K = i21 + 1;
                    this.y = i21;
                }
                int i22 = this.K;
                int i23 = i22 + 1;
                this.K = i23;
                this.s = i22;
                if (i22Var3.M3) {
                    this.K = i22 + 2;
                    this.x = i23;
                }
                d dVar3 = i22Var3.Z1;
                if ((dVar3 instanceof yv1) && ((yv1) dVar3).g4 == 0 && h != null && !z && !h.bot && !pz8.f(i22Var3.G3).b.isEmpty()) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.E = i24;
                }
                i22 i22Var4 = this.L;
                if ((i22Var4.I3 || i22Var4.J3) && !z && (chat == null || !sd2.p0(chat))) {
                    d dVar4 = this.L.Z1;
                    if ((dVar4 instanceof yv1) && !((yv1) dVar4).X7() && !((yv1) this.L.Z1).x()) {
                        yv1 yv1Var = (yv1) this.L.Z1;
                        if (yv1Var.g4 != 5) {
                            this.e = this.K;
                            this.h.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hs6.d0(this.L.G3).b.bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject tLObject = yv1Var.e;
                                    if (tLObject == null) {
                                        tLObject = yv1Var.h();
                                    }
                                    if (hs6.v(tL_attachMenuBot2, tLObject)) {
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
    public final void t(defpackage.u69 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f22.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View c22Var;
        Context context = this.c;
        i22 i22Var = this.L;
        if (i != 0) {
            c22Var = new b22(i22Var, context);
        } else {
            c22Var = new c22(i22Var, context);
        }
        c22Var.setImportantForAccessibility(1);
        c22Var.setFocusable(true);
        c22Var.setLayoutParams(new g69(-2, -1));
        return new u69(c22Var);
    }

    @Override
    public final void y(u69 u69Var) {
    }
}
