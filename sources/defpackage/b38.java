package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class b38 extends FrameLayout implements vlb {
    public ec7 E;
    public byte F;
    public final RectF G;
    public final ylb a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final pc0 e;
    public final mt1 f;
    public final lka h;
    public boolean n;
    public final tm r;
    public final tm s;
    public final tm w;
    public final w4b x;
    public final ln y;

    public b38(int i, long j, ylb ylbVar, Context context) {
        super(context);
        boolean z;
        CharSequence r;
        long c;
        int i2;
        int i3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        pc0 pc0Var = new pc0((ylb) null);
        this.e = pc0Var;
        this.w = new tm(gm.L(20.0f), 13, this, false);
        this.x = new w4b(this);
        this.y = new ln(320L, this, d53.h);
        this.G = new RectF();
        this.b = i;
        this.a = ylbVar;
        long j2 = 0;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        mt1 mt1Var = new mt1((byte) 2, context, this);
        this.f = mt1Var;
        this.r = new tm(gm.L(17.0f), mt1Var);
        this.s = new tm(gm.L(24.0f), mt1Var);
        mt1Var.setLeftDrawableOutside(true);
        mt1Var.setRightDrawableOutside(true);
        mt1Var.setTextColor(-1);
        mt1Var.setTextSize(20);
        mt1Var.setTypeface(gm.o());
        mt1Var.setWidthWrapContent(true);
        addView(mt1Var, qoe.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        lka lkaVar = new lka(context);
        this.h = lkaVar;
        lkaVar.setTextSize(14);
        lkaVar.setTextColor(-2130706433);
        lkaVar.setGravity(1);
        addView(lkaVar, qoe.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.q0(gm.L(96.0f));
        if (z) {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            if (L0 == null) {
                r = "";
            } else {
                r = L0.title;
            }
            pc0Var.p(L0);
            imageReceiver.U(L0, pc0Var, null);
            c = pg3.c(L0);
            if (L0 != null) {
                j2 = pg3.f(L0.emoji_status);
            }
        } else {
            TLRPC.User f = z8c.h(i).f();
            r = m9c.r(f);
            pc0Var.q(f);
            imageReceiver.U(f, pc0Var, null);
            c = pg3.c(f);
            if (f != null) {
                j2 = pg3.f(f.emoji_status);
            }
        }
        try {
            r = gw3.m(r, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(r, false);
        this.r.j(c, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j2, false);
        this.f.i(this.s);
        if (this.c) {
            long j3 = -j;
            TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(j3));
            TLRPC.ChatFull M0 = oc7.r1(i).M0(j3);
            if (M0 != null && M0.participants_count > 0) {
                boolean V = sd2.V(L02);
                lka lkaVar2 = this.h;
                int i4 = M0.participants_count;
                if (V) {
                    lkaVar2.l(jb6.H(',', "Subscribers", i4), false);
                } else {
                    lkaVar2.l(jb6.H(',', "Members", i4), false);
                }
            } else if (L02 != null && L02.participants_count > 0) {
                boolean V2 = sd2.V(L02);
                lka lkaVar3 = this.h;
                int i5 = L02.participants_count;
                if (V2) {
                    lkaVar3.l(jb6.H(',', "Subscribers", i5), false);
                } else {
                    lkaVar3.l(jb6.H(',', "Members", i5), false);
                }
            } else {
                boolean t0 = sd2.t0(L02);
                boolean V3 = sd2.V(L02);
                lka lkaVar4 = this.h;
                if (V3) {
                    if (t0) {
                        i3 = 2131752260;
                    } else {
                        i3 = 2131752271;
                    }
                    lkaVar4.l(jb6.M0(i3, null).toLowerCase(), false);
                } else {
                    if (t0) {
                        i2 = 2131748395;
                    } else {
                        i2 = 2131748398;
                    }
                    lkaVar4.l(jb6.M0(i2, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(jb6.M0(2131747559, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i) {
        int v0;
        int v02;
        ec7 ec7Var;
        ylb ylbVar = this.a;
        if (i >= 14) {
            fc7 fc7Var = oc7.r1(z8c.t0).E3;
            if (fc7Var != null) {
                ec7Var = fc7Var.d(i);
            } else {
                ec7Var = null;
            }
            if (ec7Var != null) {
                int f = ec7Var.f();
                v0 = cmb.v0(cmb.o8[pc0.e(f)], ylbVar);
                v02 = cmb.v0(cmb.p8[pc0.e(f)], ylbVar);
            } else {
                long j = i;
                v0 = cmb.v0(cmb.o8[pc0.d(j)], ylbVar);
                v02 = cmb.v0(cmb.p8[pc0.d(j)], ylbVar);
            }
        } else {
            long j2 = i;
            v0 = cmb.v0(cmb.o8[pc0.d(j2)], ylbVar);
            v02 = cmb.v0(cmb.p8[pc0.d(j2)], ylbVar);
        }
        this.e.h(v0, v02);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.A8));
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.pi));
        hashSet.add(Integer.valueOf(cmb.g8));
    }

    public void b(int i, boolean z) {
        ec7 d;
        fc7 fc7Var = oc7.r1(this.b).F3;
        if (fc7Var == null) {
            d = null;
        } else {
            d = fc7Var.d(i);
        }
        c(d, z);
    }

    public final void c(ec7 ec7Var, boolean z) {
        boolean o;
        this.E = ec7Var;
        ylb ylbVar = this.a;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        mt1 mt1Var = this.f;
        lka lkaVar = this.h;
        tm tmVar = this.r;
        tm tmVar2 = this.s;
        tm tmVar3 = this.w;
        if (ec7Var != null) {
            int i = ec7Var.a;
            if (i != 0) {
                tmVar3.k(Integer.valueOf(i));
            } else {
                tmVar3.k(Integer.valueOf(d38.z0(ec7Var.c(o))));
            }
            tmVar2.k(Integer.valueOf(on2.f(0.25f, ec7Var.m(cmb.I.o()), -1)));
            tmVar.k(Integer.valueOf(on2.f(0.25f, ec7Var.m(cmb.I.o()), -1)));
            int f = on2.f(0.5f, ec7Var.m(o), ec7Var.n(o));
            int i2 = cmb.r8;
            if (!cmb.c1(cmb.v0(i2, ylbVar))) {
                lkaVar.setTextColor(f);
            } else {
                lkaVar.setTextColor(cmb.C(o, cmb.v0(i2, ylbVar), f, cmb.v0(cmb.g8, ylbVar), f));
            }
            mt1Var.setTextColor(-1);
        } else {
            int i3 = cmb.r8;
            if (gm.B(cmb.v0(i3, ylbVar)) > 0.8f) {
                tmVar3.k(Integer.valueOf(cmb.v0(cmb.m6, ylbVar)));
            } else if (gm.B(cmb.v0(i3, ylbVar)) < 0.2f) {
                tmVar3.k(Integer.valueOf(cmb.p1(0.5f, cmb.v0(cmb.z8, ylbVar))));
            } else {
                tmVar3.k(Integer.valueOf(d38.z0(cmb.v0(i3, ylbVar))));
            }
            int i4 = cmb.pi;
            tmVar2.k(Integer.valueOf(cmb.v0(i4, ylbVar)));
            tmVar.k(Integer.valueOf(cmb.v0(i4, ylbVar)));
            lkaVar.setTextColor(cmb.v0(cmb.A8, ylbVar));
            mt1Var.setTextColor(cmb.v0(cmb.z8, ylbVar));
        }
        this.F = (byte) 0;
        this.x.c(ec7Var, z);
        invalidate();
    }

    public final void d(long j, boolean z, boolean z2) {
        boolean o;
        int i;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tm tmVar = this.w;
        if (i2 == 0) {
            tmVar.g(null, z2);
        } else {
            tmVar.j(j, z2);
        }
        ylb ylbVar = this.a;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        ec7 ec7Var = this.E;
        if (ec7Var != null) {
            int i3 = ec7Var.a;
            if (i3 != 0) {
                tmVar.k(Integer.valueOf(i3));
            } else {
                tmVar.k(Integer.valueOf(d38.z0(ec7Var.c(o))));
            }
        } else {
            int i4 = cmb.r8;
            if (gm.B(cmb.v0(i4, ylbVar)) > 0.8f) {
                tmVar.k(Integer.valueOf(cmb.v0(cmb.m6, ylbVar)));
            } else if (gm.B(cmb.v0(i4, ylbVar)) < 0.2f) {
                tmVar.k(Integer.valueOf(cmb.p1(0.5f, cmb.w0(null, cmb.z8, false))));
            } else {
                tmVar.k(Integer.valueOf(d38.z0(cmb.w0(null, i4, false))));
            }
        }
        ec7 ec7Var2 = this.E;
        tm tmVar2 = this.s;
        if (ec7Var2 != null) {
            int e = ec7Var2.e(1, ylbVar);
            boolean o2 = this.E.o(o);
            ec7 ec7Var3 = this.E;
            if (o2) {
                i = 4;
            } else {
                i = 2;
            }
            tmVar2.k(Integer.valueOf(on2.f(0.5f, e, ec7Var3.e(i, ylbVar))));
        } else {
            tmVar2.k(Integer.valueOf(cmb.v0(cmb.pi, ylbVar)));
        }
        this.F = (byte) 1;
        if (!z2) {
            this.y.a(z);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        int width = getWidth();
        RectF rectF = this.G;
        rectF.set((getWidth() - gm.L(86.0f)) / 2.0f, getHeight() - gm.L(168.0f), (gm.L(86.0f) + width) / 2.0f, getHeight() - gm.L(82.0f));
        bpa.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.n) {
            f = 18.0f;
        } else {
            f = 54.0f;
        }
        int L = gm.L(f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.q0(L);
        imageReceiver.k0(rectF);
        imageReceiver.h(canvas, null);
        float width2 = (rectF.width() / 2.0f) + gm.L(4.0f);
        if (this.n) {
            f2 = 22.0f;
        } else {
            f2 = 58.0f;
        }
        float L2 = gm.L(f2);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j, boolean z, boolean z2) {
        boolean o;
        int j2;
        int[] iArr;
        tm tmVar = this.s;
        tmVar.j(j, z2);
        tmVar.m(z, z2);
        ylb ylbVar = this.a;
        if (ylbVar != null) {
            o = ylbVar.a();
        } else {
            o = cmb.I.o();
        }
        ec7 ec7Var = this.E;
        if (ec7Var != null) {
            int h = ec7Var.h(o);
            boolean o2 = this.E.o(o);
            ec7 ec7Var2 = this.E;
            if (o2) {
                if (o) {
                    iArr = ec7Var2.h;
                } else {
                    iArr = ec7Var2.g;
                }
                j2 = iArr[4];
            } else {
                j2 = ec7Var2.j(o);
            }
            tmVar.k(Integer.valueOf(on2.f(0.5f, h, j2)));
        } else {
            tmVar.k(Integer.valueOf(cmb.v0(cmb.pi, ylbVar)));
        }
        this.F = (byte) 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w.a();
        this.d.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w.b();
        this.d.K();
    }

    public void setForum(boolean z) {
        if (this.n != z) {
            invalidate();
        }
        this.n = z;
    }

    @Override
    public final void updateColors() {
        tm tmVar;
        tm tmVar2;
        mt1 mt1Var;
        lka lkaVar;
        boolean o;
        int j;
        int[] iArr;
        int e;
        tm tmVar3 = this.w;
        if (tmVar3 != null && (tmVar = this.s) != null && (tmVar2 = this.r) != null && (mt1Var = this.f) != null && (lkaVar = this.h) != null) {
            ylb ylbVar = this.a;
            try {
                if (ylbVar != null) {
                    o = ylbVar.a();
                } else {
                    o = cmb.I.o();
                }
                ec7 ec7Var = this.E;
                if (ec7Var != null) {
                    int i = ec7Var.a;
                    if (i != 0) {
                        tmVar3.k(Integer.valueOf(i));
                    } else {
                        tmVar3.k(Integer.valueOf(d38.z0(ec7Var.c(o))));
                    }
                    tmVar2.k(Integer.valueOf(on2.f(0.25f, this.E.m(cmb.I.o()), -1)));
                    byte b = this.F;
                    if (b == 1) {
                        int e2 = this.E.e(1, ylbVar);
                        boolean o2 = this.E.o(o);
                        ec7 ec7Var2 = this.E;
                        if (o2) {
                            e = ec7Var2.e(4, ylbVar);
                        } else {
                            e = ec7Var2.e(2, ylbVar);
                        }
                        tmVar.k(Integer.valueOf(on2.f(0.5f, e2, e)));
                    } else {
                        ec7 ec7Var3 = this.E;
                        if (b == 2) {
                            int h = ec7Var3.h(o);
                            boolean o3 = this.E.o(o);
                            ec7 ec7Var4 = this.E;
                            if (o3) {
                                if (o) {
                                    iArr = ec7Var4.h;
                                } else {
                                    iArr = ec7Var4.g;
                                }
                                j = iArr[4];
                            } else {
                                j = ec7Var4.j(o);
                            }
                            tmVar.k(Integer.valueOf(on2.f(0.5f, h, j)));
                        } else {
                            tmVar.k(Integer.valueOf(on2.f(0.25f, ec7Var3.m(cmb.I.o()), -1)));
                        }
                    }
                    int f = on2.f(0.5f, this.E.m(o), this.E.n(o));
                    int i2 = cmb.r8;
                    if (!cmb.c1(cmb.v0(i2, ylbVar))) {
                        lkaVar.setTextColor(f);
                    } else {
                        lkaVar.setTextColor(cmb.C(o, cmb.v0(i2, ylbVar), f, cmb.v0(cmb.g8, ylbVar), f));
                    }
                    mt1Var.setTextColor(-1);
                } else {
                    int i3 = cmb.r8;
                    if (gm.B(cmb.v0(i3, ylbVar)) > 0.8f) {
                        tmVar3.k(Integer.valueOf(cmb.v0(cmb.m6, ylbVar)));
                    } else if (gm.B(cmb.v0(i3, ylbVar)) < 0.2f) {
                        tmVar3.k(Integer.valueOf(cmb.p1(0.5f, cmb.v0(cmb.z8, ylbVar))));
                    } else {
                        tmVar3.k(Integer.valueOf(d38.z0(cmb.v0(i3, ylbVar))));
                    }
                    int i4 = cmb.pi;
                    tmVar.k(Integer.valueOf(cmb.v0(i4, ylbVar)));
                    tmVar2.k(Integer.valueOf(cmb.v0(i4, ylbVar)));
                    lkaVar.setTextColor(cmb.v0(cmb.A8, ylbVar));
                    mt1Var.setTextColor(cmb.v0(cmb.z8, ylbVar));
                }
                invalidate();
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
        }
    }
}
