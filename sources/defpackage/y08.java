package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class y08 extends FrameLayout implements tjb {
    public da7 E;
    public byte F;
    public final RectF G;
    public final wjb a;
    public final int b;
    public final boolean c;
    public final ImageReceiver d;
    public final pb0 e;
    public final zr1 f;
    public final jia h;
    public boolean n;
    public final tl r;
    public final tl s;
    public final tl w;
    public final v2b x;
    public final lm y;

    public y08(int i, long j, wjb wjbVar, Context context) {
        super(context);
        boolean z;
        CharSequence q;
        long c;
        int i2;
        int i3;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        pb0 pb0Var = new pb0((wjb) null);
        this.e = pb0Var;
        this.w = new tl(gl.L(20.0f), 13, this, false);
        this.x = new v2b(this);
        this.y = new lm(320L, this, s33.h);
        this.G = new RectF();
        this.b = i;
        this.a = wjbVar;
        long j2 = 0;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        zr1 zr1Var = new zr1((byte) 2, context, this);
        this.f = zr1Var;
        this.r = new tl(gl.L(17.0f), zr1Var);
        this.s = new tl(gl.L(24.0f), zr1Var);
        zr1Var.setLeftDrawableOutside(true);
        zr1Var.setRightDrawableOutside(true);
        zr1Var.setTextColor(-1);
        zr1Var.setTextSize(20);
        zr1Var.setTypeface(gl.o());
        zr1Var.setWidthWrapContent(true);
        addView(zr1Var, nme.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        jia jiaVar = new jia(context);
        this.h = jiaVar;
        jiaVar.setTextSize(14);
        jiaVar.setTextColor(-2130706433);
        jiaVar.setGravity(1);
        addView(jiaVar, nme.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.q0(gl.L(96.0f));
        if (z) {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            if (K0 == null) {
                q = "";
            } else {
                q = K0.title;
            }
            pb0Var.p(K0);
            imageReceiver.U(K0, pb0Var, null);
            c = cf3.c(K0);
            if (K0 != null) {
                j2 = cf3.f(K0.emoji_status);
            }
        } else {
            TLRPC.User f = y6c.h(i).f();
            q = l7c.q(f);
            pb0Var.q(f);
            imageReceiver.U(f, pb0Var, null);
            c = cf3.c(f);
            if (f != null) {
                j2 = cf3.f(f.emoji_status);
            }
        }
        try {
            q = vu3.m(q, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f.l(q, false);
        this.r.j(c, false);
        this.f.setLeftDrawable(this.r);
        this.s.j(j2, false);
        this.f.i(this.s);
        if (this.c) {
            long j3 = -j;
            TLRPC.Chat K02 = na7.q1(i).K0(Long.valueOf(j3));
            TLRPC.ChatFull L0 = na7.q1(i).L0(j3);
            if (L0 != null && L0.participants_count > 0) {
                boolean V = hc2.V(K02);
                jia jiaVar2 = this.h;
                int i4 = L0.participants_count;
                if (V) {
                    jiaVar2.l(k96.H(',', "Subscribers", i4), false);
                } else {
                    jiaVar2.l(k96.H(',', "Members", i4), false);
                }
            } else if (K02 != null && K02.participants_count > 0) {
                boolean V2 = hc2.V(K02);
                jia jiaVar3 = this.h;
                int i5 = K02.participants_count;
                if (V2) {
                    jiaVar3.l(k96.H(',', "Subscribers", i5), false);
                } else {
                    jiaVar3.l(k96.H(',', "Members", i5), false);
                }
            } else {
                boolean t0 = hc2.t0(K02);
                boolean V3 = hc2.V(K02);
                jia jiaVar4 = this.h;
                if (V3) {
                    if (t0) {
                        i3 = 2131752306;
                    } else {
                        i3 = 2131752317;
                    }
                    jiaVar4.l(k96.M0(i3, null).toLowerCase(), false);
                } else {
                    if (t0) {
                        i2 = 2131748446;
                    } else {
                        i2 = 2131748449;
                    }
                    jiaVar4.l(k96.M0(i2, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(k96.M0(2131747633, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i) {
        int v0;
        int v02;
        da7 da7Var;
        wjb wjbVar = this.a;
        if (i >= 14) {
            ea7 ea7Var = na7.q1(y6c.t0).E3;
            if (ea7Var != null) {
                da7Var = ea7Var.d(i);
            } else {
                da7Var = null;
            }
            if (da7Var != null) {
                int f = da7Var.f();
                v0 = bkb.v0(bkb.o8[pb0.e(f)], wjbVar);
                v02 = bkb.v0(bkb.p8[pb0.e(f)], wjbVar);
            } else {
                long j = i;
                v0 = bkb.v0(bkb.o8[pb0.d(j)], wjbVar);
                v02 = bkb.v0(bkb.p8[pb0.d(j)], wjbVar);
            }
        } else {
            long j2 = i;
            v0 = bkb.v0(bkb.o8[pb0.d(j2)], wjbVar);
            v02 = bkb.v0(bkb.p8[pb0.d(j2)], wjbVar);
        }
        this.e.h(v0, v02);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.A8));
        hashSet.add(Integer.valueOf(bkb.m6));
        hashSet.add(Integer.valueOf(bkb.pi));
        hashSet.add(Integer.valueOf(bkb.g8));
    }

    public void b(int i, boolean z) {
        da7 d;
        ea7 ea7Var = na7.q1(this.b).F3;
        if (ea7Var == null) {
            d = null;
        } else {
            d = ea7Var.d(i);
        }
        c(d, z);
    }

    public final void c(da7 da7Var, boolean z) {
        boolean o;
        this.E = da7Var;
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        zr1 zr1Var = this.f;
        jia jiaVar = this.h;
        tl tlVar = this.r;
        tl tlVar2 = this.s;
        tl tlVar3 = this.w;
        if (da7Var != null) {
            int i = da7Var.a;
            if (i != 0) {
                tlVar3.k(Integer.valueOf(i));
            } else {
                tlVar3.k(Integer.valueOf(a18.y0(da7Var.c(o))));
            }
            tlVar2.k(Integer.valueOf(bm2.f(0.25f, da7Var.m(bkb.I.o()), -1)));
            tlVar.k(Integer.valueOf(bm2.f(0.25f, da7Var.m(bkb.I.o()), -1)));
            int f = bm2.f(0.5f, da7Var.m(o), da7Var.n(o));
            int i2 = bkb.r8;
            if (!bkb.c1(bkb.v0(i2, wjbVar))) {
                jiaVar.setTextColor(f);
            } else {
                jiaVar.setTextColor(bkb.C(o, bkb.v0(i2, wjbVar), f, bkb.v0(bkb.g8, wjbVar), f));
            }
            zr1Var.setTextColor(-1);
        } else {
            int i3 = bkb.r8;
            if (gl.B(bkb.v0(i3, wjbVar)) > 0.8f) {
                tlVar3.k(Integer.valueOf(bkb.v0(bkb.m6, wjbVar)));
            } else if (gl.B(bkb.v0(i3, wjbVar)) < 0.2f) {
                tlVar3.k(Integer.valueOf(bkb.p1(0.5f, bkb.v0(bkb.z8, wjbVar))));
            } else {
                tlVar3.k(Integer.valueOf(a18.y0(bkb.v0(i3, wjbVar))));
            }
            int i4 = bkb.pi;
            tlVar2.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
            tlVar.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
            jiaVar.setTextColor(bkb.v0(bkb.A8, wjbVar));
            zr1Var.setTextColor(bkb.v0(bkb.z8, wjbVar));
        }
        this.F = (byte) 0;
        this.x.c(da7Var, z);
        invalidate();
    }

    public final void d(long j, boolean z, boolean z2) {
        boolean o;
        int i;
        int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        tl tlVar = this.w;
        if (i2 == 0) {
            tlVar.g(null, z2);
        } else {
            tlVar.j(j, z2);
        }
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        da7 da7Var = this.E;
        if (da7Var != null) {
            int i3 = da7Var.a;
            if (i3 != 0) {
                tlVar.k(Integer.valueOf(i3));
            } else {
                tlVar.k(Integer.valueOf(a18.y0(da7Var.c(o))));
            }
        } else {
            int i4 = bkb.r8;
            if (gl.B(bkb.v0(i4, wjbVar)) > 0.8f) {
                tlVar.k(Integer.valueOf(bkb.v0(bkb.m6, wjbVar)));
            } else if (gl.B(bkb.v0(i4, wjbVar)) < 0.2f) {
                tlVar.k(Integer.valueOf(bkb.p1(0.5f, bkb.w0(null, bkb.z8, false))));
            } else {
                tlVar.k(Integer.valueOf(a18.y0(bkb.w0(null, i4, false))));
            }
        }
        da7 da7Var2 = this.E;
        tl tlVar2 = this.s;
        if (da7Var2 != null) {
            int e = da7Var2.e(1, wjbVar);
            boolean o2 = this.E.o(o);
            da7 da7Var3 = this.E;
            if (o2) {
                i = 4;
            } else {
                i = 2;
            }
            tlVar2.k(Integer.valueOf(bm2.f(0.5f, e, da7Var3.e(i, wjbVar))));
        } else {
            tlVar2.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
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
        rectF.set((getWidth() - gl.L(86.0f)) / 2.0f, getHeight() - gl.L(168.0f), (gl.L(86.0f) + width) / 2.0f, getHeight() - gl.L(82.0f));
        ana.c(canvas, this.w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.n) {
            f = 18.0f;
        } else {
            f = 54.0f;
        }
        int L = gl.L(f);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.q0(L);
        imageReceiver.k0(rectF);
        imageReceiver.h(canvas, null);
        float width2 = (rectF.width() / 2.0f) + gl.L(4.0f);
        if (this.n) {
            f2 = 22.0f;
        } else {
            f2 = 58.0f;
        }
        float L2 = gl.L(f2);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j, boolean z, boolean z2) {
        boolean o;
        int j2;
        int[] iArr;
        tl tlVar = this.s;
        tlVar.j(j, z2);
        tlVar.m(z, z2);
        wjb wjbVar = this.a;
        if (wjbVar != null) {
            o = wjbVar.a();
        } else {
            o = bkb.I.o();
        }
        da7 da7Var = this.E;
        if (da7Var != null) {
            int h = da7Var.h(o);
            boolean o2 = this.E.o(o);
            da7 da7Var2 = this.E;
            if (o2) {
                if (o) {
                    iArr = da7Var2.h;
                } else {
                    iArr = da7Var2.g;
                }
                j2 = iArr[4];
            } else {
                j2 = da7Var2.j(o);
            }
            tlVar.k(Integer.valueOf(bm2.f(0.5f, h, j2)));
        } else {
            tlVar.k(Integer.valueOf(bkb.v0(bkb.pi, wjbVar)));
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
        tl tlVar;
        tl tlVar2;
        zr1 zr1Var;
        jia jiaVar;
        boolean o;
        int j;
        int[] iArr;
        int e;
        tl tlVar3 = this.w;
        if (tlVar3 != null && (tlVar = this.s) != null && (tlVar2 = this.r) != null && (zr1Var = this.f) != null && (jiaVar = this.h) != null) {
            wjb wjbVar = this.a;
            try {
                if (wjbVar != null) {
                    o = wjbVar.a();
                } else {
                    o = bkb.I.o();
                }
                da7 da7Var = this.E;
                if (da7Var != null) {
                    int i = da7Var.a;
                    if (i != 0) {
                        tlVar3.k(Integer.valueOf(i));
                    } else {
                        tlVar3.k(Integer.valueOf(a18.y0(da7Var.c(o))));
                    }
                    tlVar2.k(Integer.valueOf(bm2.f(0.25f, this.E.m(bkb.I.o()), -1)));
                    byte b = this.F;
                    if (b == 1) {
                        int e2 = this.E.e(1, wjbVar);
                        boolean o2 = this.E.o(o);
                        da7 da7Var2 = this.E;
                        if (o2) {
                            e = da7Var2.e(4, wjbVar);
                        } else {
                            e = da7Var2.e(2, wjbVar);
                        }
                        tlVar.k(Integer.valueOf(bm2.f(0.5f, e2, e)));
                    } else {
                        da7 da7Var3 = this.E;
                        if (b == 2) {
                            int h = da7Var3.h(o);
                            boolean o3 = this.E.o(o);
                            da7 da7Var4 = this.E;
                            if (o3) {
                                if (o) {
                                    iArr = da7Var4.h;
                                } else {
                                    iArr = da7Var4.g;
                                }
                                j = iArr[4];
                            } else {
                                j = da7Var4.j(o);
                            }
                            tlVar.k(Integer.valueOf(bm2.f(0.5f, h, j)));
                        } else {
                            tlVar.k(Integer.valueOf(bm2.f(0.25f, da7Var3.m(bkb.I.o()), -1)));
                        }
                    }
                    int f = bm2.f(0.5f, this.E.m(o), this.E.n(o));
                    int i2 = bkb.r8;
                    if (!bkb.c1(bkb.v0(i2, wjbVar))) {
                        jiaVar.setTextColor(f);
                    } else {
                        jiaVar.setTextColor(bkb.C(o, bkb.v0(i2, wjbVar), f, bkb.v0(bkb.g8, wjbVar), f));
                    }
                    zr1Var.setTextColor(-1);
                } else {
                    int i3 = bkb.r8;
                    if (gl.B(bkb.v0(i3, wjbVar)) > 0.8f) {
                        tlVar3.k(Integer.valueOf(bkb.v0(bkb.m6, wjbVar)));
                    } else if (gl.B(bkb.v0(i3, wjbVar)) < 0.2f) {
                        tlVar3.k(Integer.valueOf(bkb.p1(0.5f, bkb.v0(bkb.z8, wjbVar))));
                    } else {
                        tlVar3.k(Integer.valueOf(a18.y0(bkb.v0(i3, wjbVar))));
                    }
                    int i4 = bkb.pi;
                    tlVar.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
                    tlVar2.k(Integer.valueOf(bkb.v0(i4, wjbVar)));
                    jiaVar.setTextColor(bkb.v0(bkb.A8, wjbVar));
                    zr1Var.setTextColor(bkb.v0(bkb.z8, wjbVar));
                }
                invalidate();
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
    }
}
