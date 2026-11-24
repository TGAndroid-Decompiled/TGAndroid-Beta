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
public final class c75 extends n39 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final h75 N;
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

    public c75(h75 h75Var, LaunchActivity launchActivity) {
        this.N = h75Var;
        this.c = launchActivity;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        h75 h75Var = this.N;
        ArrayList arrayList = h75Var.j2;
        fc2 fc2Var = h75Var.T2;
        if (fc2Var != null && !fc2Var.k() && !h75Var.l2) {
            this.x = -1;
            this.y = -1;
            this.E = -1;
            this.J = -1;
            this.K = -1;
            this.L = -1;
            boolean z = false;
            this.G = 0;
            if (h75Var.T2.d.h(k27.B1(h75Var.u2)) >= 0) {
                z = true;
            }
            this.M = z;
            if (h75Var.g1()) {
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
            if (!arrayList.isEmpty() && h75Var.G0() && h75Var.T2.b.participants_count > na7.q1(h75Var.n1.a).k4.M0.f()) {
                int i4 = this.G;
                this.G = i4 + 1;
                this.K = i4;
            }
            int i5 = this.G;
            this.d = i5;
            int size2 = h75Var.T2.g.size() + i5;
            this.G = size2;
            this.e = size2;
            if (h75Var.T2.j.isEmpty()) {
                this.f = -1;
                this.h = -1;
            } else {
                int i6 = this.G;
                this.f = i6;
                int size3 = h75Var.T2.j.size() + i6;
                this.G = size3;
                this.h = size3;
            }
            if (h75Var.T2.m.isEmpty()) {
                this.n = -1;
                this.r = -1;
            } else {
                int i7 = this.G;
                this.n = i7;
                int size4 = h75Var.T2.m.size() + i7;
                this.G = size4;
                this.r = size4;
            }
            if (h75Var.T2.l.isEmpty()) {
                this.s = -1;
                this.w = -1;
            } else {
                int i8 = this.G;
                this.s = i8;
                int size5 = h75Var.T2.l.size() + i8;
                this.G = size5;
                this.w = size5;
            }
            if (h75Var.g1()) {
                int i9 = this.G;
                this.y = i9;
                this.G = i9 + 2;
                this.E = i9 + 1;
            } else if (((!hc2.T(h75Var.S2) || ((chat2 = h75Var.S2) != null && chat2.megagroup)) && hc2.B(h75Var.S2)) || (hc2.T(h75Var.S2) && (chat = h75Var.S2) != null && !chat.megagroup && hc2.t0(chat))) {
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
    public final void t(defpackage.s49 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c75.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        int i2;
        d62 d62Var;
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
                            h75 h75Var = this.N;
                            if (i != 6) {
                                if (i != 7) {
                                    d62Var = new View(launchActivity);
                                } else {
                                    if (h75Var.i2 == null) {
                                        h75Var.i2 = new pc();
                                    }
                                    sbVar = new sb(launchActivity, h75Var.i2);
                                }
                            } else {
                                TextView textView = new TextView(launchActivity);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, gl.L(10.0f));
                                boolean W = hc2.W(h75Var.S2);
                                j5 j5Var = h75Var.n1;
                                if (W) {
                                    textView.setText(k96.a0(null, null, 2131743207, k96.G(na7.q1(j5Var.a).k4.M0.f(), "Participants", new Object[0])));
                                    sbVar = textView;
                                } else {
                                    textView.setText(k96.a0(null, null, 2131742983, k96.G(na7.q1(j5Var.a).k4.M0.f(), "Members", new Object[0])));
                                    sbVar = textView;
                                }
                            }
                        } else {
                            d62Var = new d62(launchActivity, (byte) 9);
                        }
                    } else {
                        sbVar = new b75(this, launchActivity);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(launchActivity);
                    frameLayout.n = bkb.hh;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(bkb.w0(null, bkb.Wg, false));
                    frameLayout.e = new pb0((wjb) null);
                    be0 be0Var = new be0(launchActivity);
                    frameLayout.a = be0Var;
                    be0Var.setRoundRadius(gl.L(24.0f));
                    boolean z = k96.a0;
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
                    frameLayout.addView(be0Var, nme.d(46, 46.0f, i9, f, 6.0f, f2, 0.0f));
                    jia jiaVar = new jia(launchActivity);
                    frameLayout.b = jiaVar;
                    zkb.W(jiaVar, bkb.dh, null);
                    jiaVar.setTypeface(gl.o());
                    jiaVar.setTextSize(16);
                    if (k96.a0) {
                        i4 = 5;
                    } else {
                        i4 = 3;
                    }
                    jiaVar.setGravity(i4 | 48);
                    boolean z2 = k96.a0;
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
                    frameLayout.addView(jiaVar, nme.d(-1, 20.0f, i10, f3, 10.0f, f4, 0.0f));
                    jia jiaVar2 = new jia(launchActivity);
                    frameLayout.c = jiaVar2;
                    jiaVar2.setTextSize(15);
                    if (k96.a0) {
                        i6 = 5;
                    } else {
                        i6 = 3;
                    }
                    jiaVar2.setGravity(i6 | 48);
                    jiaVar2.setTextColor(bkb.w0(null, frameLayout.n, false));
                    jiaVar2.l(k96.M0(2131748913, null), false);
                    boolean z3 = k96.a0;
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
                    frameLayout.addView(jiaVar2, nme.d(-1, 20.0f, i11, f5, 32.0f, f6, 0.0f));
                    ImageView imageView = new ImageView(launchActivity);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(2131232197);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, gl.L(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, frameLayout.n, false), PorterDuff.Mode.MULTIPLY));
                    if (!k96.a0) {
                        i8 = 5;
                    }
                    frameLayout.addView(imageView, nme.d(48, -1.0f, i8 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    d62Var = frameLayout;
                }
            } else {
                sbVar = new z65(this, launchActivity);
            }
            d62Var = sbVar;
        } else {
            ?? frameLayout2 = new FrameLayout(launchActivity);
            frameLayout2.h = 67;
            frameLayout2.n = (byte) 18;
            Paint paint2 = new Paint();
            frameLayout2.r = paint2;
            paint2.setColor(bkb.w0(null, bkb.Wg, false));
            frameLayout2.e = (byte) 23;
            jia jiaVar3 = new jia(launchActivity);
            frameLayout2.a = jiaVar3;
            zkb.W(jiaVar3, bkb.F6, null);
            jiaVar3.setTextSize(16);
            if (k96.a0) {
                i2 = 5;
            } else {
                i2 = 3;
            }
            jiaVar3.setGravity(i2);
            jiaVar3.setImportantForAccessibility(2);
            frameLayout2.addView(jiaVar3);
            jia jiaVar4 = new jia(launchActivity);
            frameLayout2.b = jiaVar4;
            zkb.W(jiaVar4, bkb.H6, null);
            jiaVar4.setTextSize(16);
            if (!k96.a0) {
                i8 = 5;
            }
            jiaVar4.setGravity(i8);
            jiaVar4.setImportantForAccessibility(2);
            frameLayout2.addView(jiaVar4);
            ImageView imageView2 = new ImageView(launchActivity);
            frameLayout2.c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            zkb.s(imageView2, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(launchActivity);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            d62Var = frameLayout2;
        }
        return ls6.h(d62Var, d62Var, -1, -2);
    }

    @Override
    public final void y(s49 s49Var) {
        int i;
        int i2;
        c65 c65Var = this.N.H1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        boolean z = false;
        if (i3 == 1) {
            y95 y95Var = (y95) view;
            if (c65Var.getTag() != null) {
                i2 = bkb.hh;
            } else {
                i2 = bkb.ch;
            }
            y95Var.f(i2, bkb.w0(null, i2, false));
            if (s49Var.b() != this.G - 2) {
                z = true;
            }
            y95Var.setDrawDivider(z);
        } else if (i3 == 2) {
            p75 p75Var = (p75) view;
            if (c65Var.getTag() != null) {
                i = bkb.hh;
            } else {
                i = bkb.ch;
            }
            p75Var.a(i, bkb.w0(null, i, false));
            if (s49Var.b() != this.G - 2) {
                z = true;
            }
            p75Var.setDrawDivider(z);
        }
    }
}
