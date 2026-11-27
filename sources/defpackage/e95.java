package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class e95 extends c79 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final j95 N;
    public final LaunchActivity c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public e95(j95 j95Var, LaunchActivity launchActivity) {
        this.N = j95Var;
        this.c = launchActivity;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        j95 j95Var = this.N;
        ArrayList arrayList = j95Var.j2;
        vc2 vc2Var = j95Var.T2;
        if (vc2Var != null && !vc2Var.k() && !j95Var.l2) {
            this.x = -1;
            this.y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z = false;
            this.G = 0;
            if (j95Var.T2.d.h(r47.B1(j95Var.u2)) >= 0) {
                z = true;
            }
            this.M = z;
            if (j95Var.h1()) {
                int i = this.G;
                this.G = i + 1;
                this.L = i;
            }
            int i2 = this.G;
            this.H = i2;
            int size = arrayList.size() + i2;
            this.G = size;
            this.I = size;
            if (arrayList.size() > 0) {
                int i3 = this.G;
                this.G = i3 + 1;
                this.J = i3;
            }
            if (!arrayList.isEmpty() && j95Var.H0() && j95Var.T2.b.participants_count > uc7.s1(j95Var.n1.a).k4.U0.f()) {
                int i4 = this.G;
                this.G = i4 + 1;
                this.K = i4;
            }
            int i5 = this.G;
            this.d = i5;
            int size2 = j95Var.T2.g.size() + i5;
            this.G = size2;
            this.e = size2;
            if (j95Var.T2.j.isEmpty()) {
                this.f = -1;
                this.h = -1;
            } else {
                int i6 = this.G;
                this.f = i6;
                int size3 = j95Var.T2.j.size() + i6;
                this.G = size3;
                this.h = size3;
            }
            if (j95Var.T2.m.isEmpty()) {
                this.n = -1;
                this.r = -1;
            } else {
                int i7 = this.G;
                this.n = i7;
                int size4 = j95Var.T2.m.size() + i7;
                this.G = size4;
                this.r = size4;
            }
            if (j95Var.T2.l.isEmpty()) {
                this.s = -1;
                this.w = -1;
            } else {
                int i8 = this.G;
                this.s = i8;
                int size5 = j95Var.T2.l.size() + i8;
                this.G = size5;
                this.w = size5;
            }
            if (j95Var.h1()) {
                int i9 = this.G;
                this.y = i9;
                this.G = i9 + 2;
                this.E = i9 + 1;
            } else if (((!xc2.T(j95Var.S2) || ((chat2 = j95Var.S2) != null && chat2.megagroup)) && xc2.B(j95Var.S2)) || (xc2.T(j95Var.S2) && (chat = j95Var.S2) != null && !chat.megagroup && xc2.t0(chat))) {
                int i10 = this.G;
                this.G = i10 + 1;
                this.x = i10;
            }
            int i11 = this.G;
            this.G = i11 + 1;
            this.F = i11;
        }
    }

    @Override
    public final int b() {
        return this.G;
    }

    @Override
    public final int d(int i) {
        if (i == this.F) {
            return 3;
        }
        if (i != this.x && i != this.y && i != this.E) {
            if (i == this.J) {
                return 5;
            }
            if (i >= this.d && i < this.e) {
                return 1;
            }
            if (i >= this.H && i < this.I) {
                return 4;
            }
            if (i == this.K) {
                return 6;
            }
            if (i == this.L) {
                return 7;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        E();
        super.f();
    }

    @Override
    public final void g(int i) {
        E();
        super.g(i);
    }

    @Override
    public final void j(int i, int i2) {
        E();
        super.j(i, i2);
    }

    @Override
    public final void l(int i, int i2) {
        E();
        super.l(i, i2);
    }

    @Override
    public final void n(int i, int i2, Object obj) {
        E();
        super.n(i, i2, obj);
    }

    @Override
    public final void p(int i, int i2) {
        E();
        super.p(i, i2);
    }

    @Override
    public final void q(int i, int i2) {
        E();
        super.q(i, i2);
    }

    @Override
    public final void t(defpackage.f89 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e95.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        int i2;
        t62 t62Var;
        tb tbVar;
        int i3;
        float f;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        int i6;
        int i7;
        float f5;
        float f6;
        int i8 = 3;
        LaunchActivity launchActivity = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            j95 j95Var = this.N;
                            if (i != 6) {
                                if (i != 7) {
                                    t62Var = new View(launchActivity);
                                } else {
                                    if (j95Var.i2 == null) {
                                        j95Var.i2 = new qc();
                                    }
                                    tbVar = new tb(launchActivity, j95Var.i2);
                                }
                            } else {
                                TextView textView = new TextView(launchActivity);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, hl.L(10.0f));
                                boolean W = xc2.W(j95Var.S2);
                                k5 k5Var = j95Var.n1;
                                if (W) {
                                    textView.setText(ob6.a0(null, null, 2131743101, ob6.G(uc7.s1(k5Var.a).k4.U0.f(), "Participants", new Object[0])));
                                    tbVar = textView;
                                } else {
                                    textView.setText(ob6.a0(null, null, 2131742877, ob6.G(uc7.s1(k5Var.a).k4.U0.f(), "Members", new Object[0])));
                                    tbVar = textView;
                                }
                            }
                        } else {
                            t62Var = new t62(launchActivity, (byte) 9);
                        }
                    } else {
                        tbVar = new d95(this, launchActivity);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(launchActivity);
                    frameLayout.n = aob.ih;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(aob.w0(null, aob.Xg, false));
                    frameLayout.e = new rb0((vnb) null);
                    de0 de0Var = new de0(launchActivity);
                    frameLayout.a = de0Var;
                    de0Var.setRoundRadius(hl.L(24.0f));
                    boolean z = ob6.a0;
                    if (z) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    int i9 = i3 | 48;
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 11.0f;
                    }
                    if (z) {
                        f2 = 11.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    frameLayout.addView(de0Var, tre.d(46, 46.0f, i9, f, 6.0f, f2, 0.0f));
                    ema emaVar = new ema(launchActivity);
                    frameLayout.b = emaVar;
                    yob.W(emaVar, aob.eh, null);
                    emaVar.setTypeface(hl.o());
                    emaVar.setTextSize(16);
                    if (ob6.a0) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    emaVar.setGravity(i4 | 48);
                    boolean z2 = ob6.a0;
                    if (z2) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    int i10 = i5 | 48;
                    if (z2) {
                        f3 = 54.0f;
                    } else {
                        f3 = 67.0f;
                    }
                    if (z2) {
                        f4 = 67.0f;
                    } else {
                        f4 = 54.0f;
                    }
                    frameLayout.addView(emaVar, tre.d(-1, 20.0f, i10, f3, 10.0f, f4, 0.0f));
                    ema emaVar2 = new ema(launchActivity);
                    frameLayout.c = emaVar2;
                    emaVar2.setTextSize(15);
                    if (ob6.a0) {
                        i6 = 5;
                    } else {
                        i6 = 3;
                    }
                    emaVar2.setGravity(i6 | 48);
                    emaVar2.setTextColor(aob.w0(null, frameLayout.n, false));
                    emaVar2.l(ob6.M0(2131748859, null), false);
                    boolean z3 = ob6.a0;
                    if (z3) {
                        i7 = 5;
                    } else {
                        i7 = 3;
                    }
                    int i11 = i7 | 48;
                    if (z3) {
                        f5 = 54.0f;
                    } else {
                        f5 = 67.0f;
                    }
                    if (z3) {
                        f6 = 67.0f;
                    } else {
                        f6 = 54.0f;
                    }
                    frameLayout.addView(emaVar2, tre.d(-1, 20.0f, i11, f5, 32.0f, f6, 0.0f));
                    ImageView imageView = new ImageView(launchActivity);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232197);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, hl.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(aob.w0(null, frameLayout.n, false), PorterDuff.Mode.MULTIPLY));
                    if (!ob6.a0) {
                        i8 = 5;
                    }
                    frameLayout.addView(imageView, tre.d(48, -1.0f, i8 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    t62Var = frameLayout;
                }
            } else {
                tbVar = new b95(this, launchActivity);
            }
            t62Var = tbVar;
        } else {
            ?? frameLayout2 = new FrameLayout(launchActivity);
            frameLayout2.h = 67;
            frameLayout2.n = (byte) 18;
            Paint paint2 = new Paint();
            frameLayout2.r = paint2;
            paint2.setColor(aob.w0(null, aob.Xg, false));
            frameLayout2.e = (byte) 23;
            ema emaVar3 = new ema(launchActivity);
            frameLayout2.a = emaVar3;
            yob.W(emaVar3, aob.G6, null);
            emaVar3.setTextSize(16);
            if (ob6.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            emaVar3.setGravity(i2);
            emaVar3.setImportantForAccessibility(2);
            frameLayout2.addView(emaVar3);
            ema emaVar4 = new ema(launchActivity);
            frameLayout2.b = emaVar4;
            yob.W(emaVar4, aob.I6, null);
            emaVar4.setTextSize(16);
            if (!ob6.a0) {
                i8 = 5;
            }
            emaVar4.setGravity(i8);
            emaVar4.setImportantForAccessibility(2);
            frameLayout2.addView(emaVar4);
            ImageView imageView2 = new ImageView(launchActivity);
            frameLayout2.c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            yob.s(imageView2, aob.m6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(launchActivity);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            t62Var = frameLayout2;
        }
        return qu6.h(t62Var, t62Var, -1, -2);
    }

    @Override
    public final void y(f89 f89Var) {
        int i;
        int i2;
        e85 e85Var = this.N.H1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        boolean z = false;
        if (i3 == 1) {
            zb5 zb5Var = (zb5) view;
            if (e85Var.getTag() != null) {
                i2 = aob.ih;
            } else {
                i2 = aob.dh;
            }
            zb5Var.f(i2, aob.w0(null, i2, false));
            if (f89Var.b() != this.G - 2) {
                z = true;
            }
            zb5Var.setDrawDivider(z);
        } else if (i3 == 2) {
            r95 r95Var = (r95) view;
            if (e85Var.getTag() != null) {
                i = aob.ih;
            } else {
                i = aob.dh;
            }
            r95Var.a(i, aob.w0(null, i, false));
            if (f89Var.b() != this.G - 2) {
                z = true;
            }
            r95Var.setDrawDivider(z);
        }
    }
}
