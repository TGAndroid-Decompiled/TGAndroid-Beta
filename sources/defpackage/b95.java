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
public final class b95 extends q59 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final g95 N;
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

    public b95(g95 g95Var, LaunchActivity launchActivity) {
        this.N = g95Var;
        this.c = launchActivity;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        g95 g95Var = this.N;
        ArrayList arrayList = g95Var.j2;
        qd2 qd2Var = g95Var.T2;
        if (qd2Var != null && !qd2Var.k() && !g95Var.l2) {
            this.x = -1;
            this.y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z = false;
            this.G = 0;
            if (g95Var.T2.d.h(k47.B1(g95Var.u2)) >= 0) {
                z = true;
            }
            this.M = z;
            if (g95Var.g1()) {
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
            if (!arrayList.isEmpty() && g95Var.G0() && g95Var.T2.b.participants_count > oc7.r1(g95Var.n1.a).l4.M0.f()) {
                int i4 = this.G;
                this.G = i4 + 1;
                this.K = i4;
            }
            int i5 = this.G;
            this.d = i5;
            int size2 = g95Var.T2.g.size() + i5;
            this.G = size2;
            this.e = size2;
            if (g95Var.T2.j.isEmpty()) {
                this.f = -1;
                this.h = -1;
            } else {
                int i6 = this.G;
                this.f = i6;
                int size3 = g95Var.T2.j.size() + i6;
                this.G = size3;
                this.h = size3;
            }
            if (g95Var.T2.m.isEmpty()) {
                this.n = -1;
                this.r = -1;
            } else {
                int i7 = this.G;
                this.n = i7;
                int size4 = g95Var.T2.m.size() + i7;
                this.G = size4;
                this.r = size4;
            }
            if (g95Var.T2.l.isEmpty()) {
                this.s = -1;
                this.w = -1;
            } else {
                int i8 = this.G;
                this.s = i8;
                int size5 = g95Var.T2.l.size() + i8;
                this.G = size5;
                this.w = size5;
            }
            if (g95Var.g1()) {
                int i9 = this.G;
                this.y = i9;
                this.G = i9 + 2;
                this.E = i9 + 1;
            } else if (((!sd2.T(g95Var.S2) || ((chat2 = g95Var.S2) != null && chat2.megagroup)) && sd2.B(g95Var.S2)) || (sd2.T(g95Var.S2) && (chat = g95Var.S2) != null && !chat.megagroup && sd2.t0(chat))) {
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
    public final void t(defpackage.u69 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b95.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        int i2;
        o72 o72Var;
        sb sbVar;
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
                            g95 g95Var = this.N;
                            if (i != 6) {
                                if (i != 7) {
                                    o72Var = new View(launchActivity);
                                } else {
                                    if (g95Var.i2 == null) {
                                        g95Var.i2 = new pd();
                                    }
                                    sbVar = new sb(launchActivity, g95Var.i2);
                                }
                            } else {
                                TextView textView = new TextView(launchActivity);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, gm.L(10.0f));
                                boolean W = sd2.W(g95Var.S2);
                                j5 j5Var = g95Var.n1;
                                if (W) {
                                    textView.setText(jb6.a0(null, null, 2131743133, jb6.G(oc7.r1(j5Var.a).l4.M0.f(), "Participants", new Object[0])));
                                    sbVar = textView;
                                } else {
                                    textView.setText(jb6.a0(null, null, 2131742909, jb6.G(oc7.r1(j5Var.a).l4.M0.f(), "Members", new Object[0])));
                                    sbVar = textView;
                                }
                            }
                        } else {
                            o72Var = new o72(launchActivity, (byte) 9);
                        }
                    } else {
                        sbVar = new a95(this, launchActivity);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(launchActivity);
                    frameLayout.n = cmb.hh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(cmb.w0(null, cmb.Wg, false));
                    frameLayout.e = new pc0((ylb) null);
                    bf0 bf0Var = new bf0(launchActivity);
                    frameLayout.a = bf0Var;
                    bf0Var.setRoundRadius(gm.L(24.0f));
                    boolean z = jb6.a0;
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
                    frameLayout.addView(bf0Var, qoe.d(46, 46.0f, i9, f, 6.0f, f2, 0.0f));
                    lka lkaVar = new lka(launchActivity);
                    frameLayout.b = lkaVar;
                    anb.W(lkaVar, cmb.dh, null);
                    lkaVar.setTypeface(gm.o());
                    lkaVar.setTextSize(16);
                    if (jb6.a0) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    lkaVar.setGravity(i4 | 48);
                    boolean z2 = jb6.a0;
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
                    frameLayout.addView(lkaVar, qoe.d(-1, 20.0f, i10, f3, 10.0f, f4, 0.0f));
                    lka lkaVar2 = new lka(launchActivity);
                    frameLayout.c = lkaVar2;
                    lkaVar2.setTextSize(15);
                    if (jb6.a0) {
                        i6 = 5;
                    } else {
                        i6 = 3;
                    }
                    lkaVar2.setGravity(i6 | 48);
                    lkaVar2.setTextColor(cmb.w0(null, frameLayout.n, false));
                    lkaVar2.l(jb6.M0(2131748862, null), false);
                    boolean z3 = jb6.a0;
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
                    frameLayout.addView(lkaVar2, qoe.d(-1, 20.0f, i11, f5, 32.0f, f6, 0.0f));
                    ImageView imageView = new ImageView(launchActivity);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232198);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, gm.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, frameLayout.n, false), PorterDuff.Mode.MULTIPLY));
                    if (!jb6.a0) {
                        i8 = 5;
                    }
                    frameLayout.addView(imageView, qoe.d(48, -1.0f, i8 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    o72Var = frameLayout;
                }
            } else {
                sbVar = new y85(this, launchActivity);
            }
            o72Var = sbVar;
        } else {
            ?? frameLayout2 = new FrameLayout(launchActivity);
            frameLayout2.h = 67;
            frameLayout2.n = (byte) 18;
            Paint paint2 = new Paint();
            frameLayout2.r = paint2;
            paint2.setColor(cmb.w0(null, cmb.Wg, false));
            frameLayout2.e = (byte) 23;
            lka lkaVar3 = new lka(launchActivity);
            frameLayout2.a = lkaVar3;
            anb.W(lkaVar3, cmb.F6, null);
            lkaVar3.setTextSize(16);
            if (jb6.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            lkaVar3.setGravity(i2);
            lkaVar3.setImportantForAccessibility(2);
            frameLayout2.addView(lkaVar3);
            lka lkaVar4 = new lka(launchActivity);
            frameLayout2.b = lkaVar4;
            anb.W(lkaVar4, cmb.H6, null);
            lkaVar4.setTextSize(16);
            if (!jb6.a0) {
                i8 = 5;
            }
            lkaVar4.setGravity(i8);
            lkaVar4.setImportantForAccessibility(2);
            frameLayout2.addView(lkaVar4);
            ImageView imageView2 = new ImageView(launchActivity);
            frameLayout2.c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            anb.s(imageView2, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(launchActivity);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            o72Var = frameLayout2;
        }
        return kt6.h(o72Var, o72Var, -1, -2);
    }

    @Override
    public final void y(u69 u69Var) {
        int i;
        int i2;
        a85 a85Var = this.N.H1;
        int i3 = u69Var.f;
        View view = u69Var.a;
        boolean z = false;
        if (i3 == 1) {
            wb5 wb5Var = (wb5) view;
            if (a85Var.getTag() != null) {
                i2 = cmb.hh;
            } else {
                i2 = cmb.ch;
            }
            wb5Var.f(i2, cmb.w0(null, i2, false));
            if (u69Var.b() != this.G - 2) {
                z = true;
            }
            wb5Var.setDrawDivider(z);
        } else if (i3 == 2) {
            o95 o95Var = (o95) view;
            if (a85Var.getTag() != null) {
                i = cmb.hh;
            } else {
                i = cmb.ch;
            }
            o95Var.a(i, cmb.w0(null, i, false));
            if (u69Var.b() != this.G - 2) {
                z = true;
            }
            o95Var.setDrawDivider(z);
        }
    }
}
