package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class k12 extends c79 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final n12 L;
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

    public k12(n12 n12Var, Context context) {
        this.L = n12Var;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final int b() {
        int i = this.K;
        n12 n12Var = this.L;
        if (n12Var.E3 == null && (n12Var.Z1 instanceof zu1) && !n12Var.B1) {
            return ls6.d0(n12Var.G3).k1.size() + i;
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
        n12 n12Var = this.L;
        boolean z = true;
        if (n12Var.B1) {
            this.K = 1;
            this.d = 0;
            int i2 = n12Var.C1;
            if (i2 == 0 || vsd.a(i2, 16)) {
                int i3 = this.K;
                this.K = i3 + 1;
                this.n = i3;
            }
            int i4 = this.L.C1;
            if (i4 == 0 || vsd.a(i4, 8192)) {
                int i5 = this.K;
                this.K = i5 + 1;
                this.G = i5;
            }
            int i6 = this.L.C1;
            if (i6 == 0 || vsd.a(i6, 16384)) {
                int i7 = this.K;
                this.K = i7 + 1;
                this.H = i7;
            }
            int i8 = this.L.C1;
            if (i8 == 0 || vsd.a(i8, 8)) {
                int i9 = this.K;
                this.K = i9 + 1;
                this.s = i9;
            }
            int i10 = this.L.C1;
            if (i10 == 0 || vsd.a(i10, 64)) {
                int i11 = this.K;
                this.K = i11 + 1;
                this.F = i11;
            }
            int i12 = this.L.C1;
            if (i12 == 0 || vsd.a(i12, 32768)) {
                int i13 = this.K;
                this.K = i13 + 1;
                this.I = i13;
            }
        } else {
            e eVar = n12Var.Z1;
            if (!(eVar instanceof zu1)) {
                this.d = 0;
                this.K = 2;
                this.n = 1;
                if (n12Var.Q1) {
                    this.K = 3;
                    this.s = 2;
                }
            } else if (n12Var.E3 != null) {
                int i14 = n12Var.D3;
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
                TLRPC.User h = ((zu1) eVar).h();
                e eVar2 = this.L.Z1;
                if (eVar2 instanceof zu1) {
                    chat = ((zu1) eVar2).e;
                } else {
                    chat = null;
                }
                if (h == null || ((zu1) eVar2).getMessagesController().M1(h.id) <= 0) {
                    z = false;
                }
                int i16 = this.K;
                this.d = i16;
                this.K = i16 + 2;
                this.n = i16 + 1;
                if (uc7.s1(this.L.G3).l4.v0.f && ((zu1) this.L.Z1).g4 == 0 && n12.c1(h)) {
                    int i17 = this.K;
                    this.K = i17 + 1;
                    this.r = i17;
                }
                n12 n12Var2 = this.L;
                if (n12Var2.N3) {
                    int i18 = this.K;
                    this.K = i18 + 1;
                    this.F = i18;
                    uc7.s1(n12Var2.G3);
                    boolean z2 = f11.a;
                    int i19 = this.K;
                    this.K = i19 + 1;
                    this.J = i19;
                }
                n12 n12Var3 = this.L;
                if (n12Var3.L3) {
                    int i20 = this.K;
                    this.K = i20 + 1;
                    this.w = i20;
                }
                if (n12Var3.N3) {
                    int i21 = this.K;
                    this.K = i21 + 1;
                    this.y = i21;
                }
                int i22 = this.K;
                int i23 = i22 + 1;
                this.K = i23;
                this.s = i22;
                if (n12Var3.M3) {
                    this.K = i22 + 2;
                    this.x = i23;
                }
                e eVar3 = n12Var3.Z1;
                if ((eVar3 instanceof zu1) && ((zu1) eVar3).g4 == 0 && h != null && !z && !h.bot && !b19.f(n12Var3.G3).b.isEmpty()) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.E = i24;
                }
                n12 n12Var4 = this.L;
                if ((n12Var4.I3 || n12Var4.J3) && !z && (chat == null || !xc2.p0(chat))) {
                    e eVar4 = this.L.Z1;
                    if ((eVar4 instanceof zu1) && !((zu1) eVar4).X7() && !((zu1) this.L.Z1).y()) {
                        zu1 zu1Var = (zu1) this.L.Z1;
                        if (zu1Var.g4 != 5) {
                            this.e = this.K;
                            this.h.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = ls6.d0(this.L.G3).b.bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject tLObject = zu1Var.e;
                                    if (tLObject == null) {
                                        tLObject = zu1Var.h();
                                    }
                                    if (ls6.v(tL_attachMenuBot2, tLObject)) {
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
    public final void t(defpackage.f89 r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k12.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View h12Var;
        Context context = this.c;
        n12 n12Var = this.L;
        if (i != 0) {
            h12Var = new g12(n12Var, context);
        } else {
            h12Var = new h12(n12Var, context);
        }
        h12Var.setImportantForAccessibility(1);
        h12Var.setFocusable(true);
        h12Var.setLayoutParams(new r79(-2, -1));
        return new f89(h12Var);
    }

    @Override
    public final void y(f89 f89Var) {
    }
}
