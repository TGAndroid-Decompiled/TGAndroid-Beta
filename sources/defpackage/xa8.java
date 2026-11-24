package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.LaunchActivity;
public final class xa8 {
    public final sa8 a;
    public final mb3 b;
    public byte c = 0;
    public byte d = 0;
    public sj4 e;
    public boolean f;
    public boolean g;

    public xa8(mb3 mb3Var, sa8 sa8Var) {
        this.b = mb3Var;
        this.a = sa8Var;
    }

    public final void a(p8c p8cVar) {
        sj4 sj4Var;
        if (this.c == 1 && (sj4Var = this.e) != null) {
            this.e = null;
            this.c = (byte) 0;
            sj4Var.K = true;
            sj4Var.d();
            gl.e3(new vc4(sj4Var, p8cVar, (byte) 11), 100L);
            this.b.d();
        }
    }

    public final void b() {
        boolean z;
        byte b = this.c;
        if (b == 3) {
            return;
        }
        this.c = (byte) 3;
        sj4 sj4Var = this.e;
        mb3 mb3Var = this.b;
        sa8 sa8Var = this.a;
        if (sj4Var != null) {
            this.e = null;
            if (b == 1) {
                z = true;
            } else {
                z = false;
            }
            Objects.requireNonNull(sa8Var);
            w88 w88Var = new w88(sa8Var, (byte) 9);
            if (!sj4Var.K) {
                sj4Var.K = true;
                sj4Var.d();
                yla ylaVar = sj4Var.D;
                if (ylaVar != null) {
                    ylaVar.d();
                    sj4Var.E.d();
                }
                if (z && sj4Var.g) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(s33.f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(sj4Var.h, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(sj4Var.h, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(sj4Var.h, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new u5(sj4Var, w88Var, (byte) 21));
                    animatorSet.start();
                } else {
                    sj4Var.f(w88Var);
                }
            }
            mb3Var.j(this, b);
            return;
        }
        sa8Var.u1();
        mb3Var.j(this, b);
    }

    public final void c() {
        sj4 sj4Var = this.e;
        if (sj4Var != null) {
            sj4Var.k();
        }
        this.b.d();
    }

    public final boolean d() {
        if (this.c != 3) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.e != null) {
            byte b = this.c;
            if (b == 1 || (b == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f() {
        byte b = this.c;
        if (b == 3) {
            return;
        }
        if (b != 0) {
            b();
            return;
        }
        this.c = (byte) 3;
        this.b.j(this, 0);
    }

    public final ya8 g(Activity activity, Bitmap bitmap, boolean z) {
        float f;
        float f2;
        int i;
        int i2;
        byte b;
        if (this.c == 0) {
            mb3 mb3Var = this.b;
            ArrayList arrayList = (ArrayList) mb3Var.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                xa8 xa8Var = (xa8) arrayList.get(size);
                if (xa8Var != this && xa8Var.e()) {
                    xa8Var.b();
                }
            }
            final sj4 sj4Var = new sj4(this, activity);
            this.e = sj4Var;
            RectF rectF = new RectF();
            sa8 sa8Var = sj4Var.b;
            sj4.j(rectF, sa8Var.Q0(), sa8Var.S1());
            sj4Var.z = qj4.b().a.getFloat("scale_factor", 1.0f);
            Point point = gl.q;
            sj4Var.A = (Math.min(point.x, point.y) - (sj4.m() * 2.0f)) / sj4Var.h();
            sj4Var.x = (int) rectF.width();
            sj4Var.y = (int) rectF.height();
            sj4Var.B = rectF.left;
            sj4Var.C = rectF.top - gl.m;
            int Q0 = sa8Var.Q0();
            int S1 = sa8Var.S1();
            if (Q0 > 0 && S1 > 0) {
                f = S1 / Q0;
            } else {
                f = 0.5625f;
            }
            if (f < 1.0f) {
                f2 = 0.6f;
            } else {
                f2 = 0.45f;
            }
            rac racVar = sj4Var.F;
            racVar.q = f2;
            racVar.a();
            yla ylaVar = new yla(sj4Var, sj4.Q);
            zla zlaVar = new zla();
            zlaVar.a(0.75f);
            zlaVar.b(650.0f);
            ylaVar.m = zlaVar;
            ylaVar.a(new xr3() {
                @Override
                public final void a(yla ylaVar2, boolean z2, float f3, float f4) {
                    byte b2 = r2;
                    sj4 sj4Var2 = sj4Var;
                    switch (b2) {
                        case 0:
                            qj4.b().a.edit().putFloat("x", f3).apply();
                            sj4Var2.a.b.d();
                            return;
                        default:
                            qj4.b().a.edit().putFloat("y", f3).apply();
                            sj4Var2.a.b.d();
                            return;
                    }
                }
            });
            sj4Var.D = ylaVar;
            yla ylaVar2 = new yla(sj4Var, sj4.R);
            zla zlaVar2 = new zla();
            zlaVar2.a(0.75f);
            zlaVar2.b(650.0f);
            ylaVar2.m = zlaVar2;
            ylaVar2.a(new xr3() {
                @Override
                public final void a(yla ylaVar22, boolean z2, float f3, float f4) {
                    byte b2 = r2;
                    sj4 sj4Var2 = sj4Var;
                    switch (b2) {
                        case 0:
                            qj4.b().a.edit().putFloat("x", f3).apply();
                            sj4Var2.a.b.d();
                            return;
                        default:
                            qj4.b().a.edit().putFloat("y", f3).apply();
                            sj4Var2.a.b.d();
                            return;
                    }
                }
            });
            sj4Var.E = ylaVar2;
            Activity activity2 = sj4Var.c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new u23(sj4Var, (byte) 1));
            sj4Var.p = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            sj4Var.p.setStylusScaleEnabled(false);
            sj4Var.q = new z24(activity2, new oj4(sj4Var, scaledTouchSlop));
            sj4Var.i = new lj4(sj4Var, activity2, (byte) 1);
            s8 s8Var = new s8((byte) 1, activity2, sj4Var);
            sj4Var.h = s8Var;
            s8Var.addView(sj4Var.i, nme.c(-1.0f, -1));
            lj4 lj4Var = sj4Var.i;
            xi xiVar = zdc.a;
            lj4Var.setOutlineProvider(new xdc(0, gl.L(10.0f)));
            sj4Var.i.setClipToOutline(true);
            zkb.h(bkb.Wg, null, sj4Var.i);
            ImageView imageView = new ImageView(activity2);
            sj4Var.l = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            sj4Var.l.setVisibility(8);
            sj4Var.i.addView(sj4Var.l, nme.c(-1.0f, -1));
            racVar.n = new pj4(sj4Var, (byte) 0);
            sj4Var.m = new lj4(sj4Var, activity2, (byte) 0);
            lj4 lj4Var2 = sj4Var.m;
            Objects.requireNonNull(lj4Var2);
            sj4Var.G = new iv9(new s54(lj4Var2, (byte) 18), true);
            sj4Var.m.setWillNotDraw(false);
            sj4Var.m.setAlpha(0.0f);
            View view = new View(activity2);
            view.setBackgroundColor(1275068416);
            sj4Var.m.addView(view, nme.c(-1.0f, -1));
            int L = gl.L(8.0f);
            ImageView imageView2 = new ImageView(activity2);
            imageView2.setImageResource(2131232552);
            int i3 = bkb.Xg;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            zkb.s(imageView2, i3, null, mode);
            int i4 = bkb.h6;
            ff0 f0 = bkb.f0(bkb.w0(null, i4, false), 1, -1);
            vkb M = zkb.M(i4);
            imageView2.setBackground(f0);
            zkb.j(imageView2, f0, null, M, null);
            imageView2.setPadding(L, L, L, L);
            imageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    byte b2 = r2;
                    sj4 sj4Var2 = sj4Var;
                    switch (b2) {
                        case 0:
                            sj4Var2.a.b();
                            return;
                        case 1:
                            xa8 xa8Var2 = sj4Var2.a;
                            if (xa8Var2.c == 1) {
                                mb3 mb3Var2 = xa8Var2.b;
                                w88 w88Var = new w88(xa8Var2, (byte) 10);
                                if (mb3Var2.b && (launchActivity = (LaunchActivity) mb3Var2.f) != null && !gl.F1(launchActivity)) {
                                    w88Var.run();
                                    return;
                                }
                                ((ArrayList) mb3Var2.d).add(w88Var);
                                if (((LaunchActivity) mb3Var2.f) != null && !mb3Var2.a) {
                                    try {
                                        Intent intent = new Intent(a.b, ((LaunchActivity) mb3Var2.f).getClass());
                                        intent.addFlags(268435456);
                                        a.b.startActivity(intent);
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        default:
                            sa8 sa8Var2 = sj4Var2.b;
                            if (sa8Var2.j()) {
                                sa8Var2.e();
                            } else {
                                if (sj4Var2.H) {
                                    sa8Var2.f(0L);
                                    sj4Var2.H = false;
                                }
                                sa8Var2.k();
                            }
                            sj4Var2.k();
                            sj4Var2.a.b.d();
                            return;
                    }
                }
            });
            sj4Var.m.addView(imageView2, nme.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
            ImageView imageView3 = new ImageView(activity2);
            imageView3.setImageResource(2131232553);
            zkb.s(imageView3, i3, null, mode);
            ff0 f02 = bkb.f0(bkb.w0(null, i4, false), 1, -1);
            vkb M2 = zkb.M(i4);
            imageView3.setBackground(f02);
            zkb.j(imageView3, f02, null, M2, null);
            imageView3.setPadding(L, L, L, L);
            imageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    byte b2 = r2;
                    sj4 sj4Var2 = sj4Var;
                    switch (b2) {
                        case 0:
                            sj4Var2.a.b();
                            return;
                        case 1:
                            xa8 xa8Var2 = sj4Var2.a;
                            if (xa8Var2.c == 1) {
                                mb3 mb3Var2 = xa8Var2.b;
                                w88 w88Var = new w88(xa8Var2, (byte) 10);
                                if (mb3Var2.b && (launchActivity = (LaunchActivity) mb3Var2.f) != null && !gl.F1(launchActivity)) {
                                    w88Var.run();
                                    return;
                                }
                                ((ArrayList) mb3Var2.d).add(w88Var);
                                if (((LaunchActivity) mb3Var2.f) != null && !mb3Var2.a) {
                                    try {
                                        Intent intent = new Intent(a.b, ((LaunchActivity) mb3Var2.f).getClass());
                                        intent.addFlags(268435456);
                                        a.b.startActivity(intent);
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        default:
                            sa8 sa8Var2 = sj4Var2.b;
                            if (sa8Var2.j()) {
                                sa8Var2.e();
                            } else {
                                if (sj4Var2.H) {
                                    sa8Var2.f(0L);
                                    sj4Var2.H = false;
                                }
                                sa8Var2.k();
                            }
                            sj4Var2.k();
                            sj4Var2.a.b.d();
                            return;
                    }
                }
            });
            sj4Var.m.addView(imageView3, nme.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
            ImageView imageView4 = new ImageView(activity2);
            sj4Var.n = imageView4;
            zkb.s(imageView4, i3, null, mode);
            zkb.R(sj4Var.n, bkb.f0(bkb.w0(null, i4, false), 1, -1), null, zkb.M(i4), null);
            sj4Var.n.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity launchActivity;
                    byte b2 = r2;
                    sj4 sj4Var2 = sj4Var;
                    switch (b2) {
                        case 0:
                            sj4Var2.a.b();
                            return;
                        case 1:
                            xa8 xa8Var2 = sj4Var2.a;
                            if (xa8Var2.c == 1) {
                                mb3 mb3Var2 = xa8Var2.b;
                                w88 w88Var = new w88(xa8Var2, (byte) 10);
                                if (mb3Var2.b && (launchActivity = (LaunchActivity) mb3Var2.f) != null && !gl.F1(launchActivity)) {
                                    w88Var.run();
                                    return;
                                }
                                ((ArrayList) mb3Var2.d).add(w88Var);
                                if (((LaunchActivity) mb3Var2.f) != null && !mb3Var2.a) {
                                    try {
                                        Intent intent = new Intent(a.b, ((LaunchActivity) mb3Var2.f).getClass());
                                        intent.addFlags(268435456);
                                        a.b.startActivity(intent);
                                        return;
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        default:
                            sa8 sa8Var2 = sj4Var2.b;
                            if (sa8Var2.j()) {
                                sa8Var2.e();
                            } else {
                                if (sj4Var2.H) {
                                    sa8Var2.f(0L);
                                    sj4Var2.H = false;
                                }
                                sa8Var2.k();
                            }
                            sj4Var2.k();
                            sj4Var2.a.b.d();
                            return;
                    }
                }
            });
            ImageView imageView5 = sj4Var.n;
            if (sa8Var.F2()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView5.setVisibility(i);
            sj4Var.m.addView(sj4Var.n, nme.e(38, 38, 17));
            rj4 rj4Var = new rj4(sj4Var, activity2);
            sj4Var.o = rj4Var;
            if (sa8Var.F2()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            rj4Var.setVisibility(i2);
            sj4Var.m.addView(sj4Var.o, nme.c(-1.0f, -1));
            sj4Var.i.addView(sj4Var.m, nme.c(-1.0f, -1));
            View C0 = sa8Var.C0();
            sj4Var.k = C0;
            if (C0 != null) {
                gl.B2(C0);
                sj4Var.i.addView(sj4Var.k, 0, nme.c(-1.0f, -1));
            } else {
                ya8 ya8Var = new ya8(activity2);
                sj4Var.j = ya8Var;
                sj4Var.i.addView(ya8Var, 0, nme.c(-1.0f, -1));
            }
            if (bitmap != null && sj4Var.j != null) {
                sj4Var.l.setImageBitmap(bitmap);
                sj4Var.l.setVisibility(0);
                sj4Var.j.setFirstFrameCallback(new jj4(sj4Var, (byte) 3));
            }
            sj4Var.a();
            if (z) {
                sj4Var.h.setAlpha(0.0f);
                sj4Var.h.setScaleX(0.1f);
                sj4Var.h.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(s33.f);
                b = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(sj4Var.h, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(sj4Var.h, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(sj4Var.h, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                b = 1;
            }
            sj4Var.k();
            ya8 ya8Var2 = sj4Var.j;
            this.c = b;
            mb3Var.d();
            return ya8Var2;
        }
        fvc.d(this.c, "startFloating in state ");
        return null;
    }
}
