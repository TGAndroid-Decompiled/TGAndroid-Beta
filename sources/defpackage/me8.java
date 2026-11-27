package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;
public final class me8 {
    public final je8 a;
    public final fc3 b;
    public byte c = 0;
    public byte d = 0;
    public xl4 e;
    public boolean f;
    public boolean g;
    public boolean h;

    public me8(fc3 fc3Var, je8 je8Var) {
        this.b = fc3Var;
        this.a = je8Var;
    }

    public final void a(pcc pccVar) {
        xl4 xl4Var;
        if (this.c == 1 && (xl4Var = this.e) != null) {
            this.e = null;
            this.c = (byte) 0;
            xl4Var.N = true;
            xl4Var.d();
            hl.d3(new se4(xl4Var, pccVar, (byte) 8), 100L);
            this.b.d();
        }
    }

    public final void b() {
        c(true, false);
    }

    public final void c(boolean z, boolean z2) {
        boolean z3;
        byte b = this.c;
        if (b == 3) {
            return;
        }
        this.c = (byte) 3;
        this.f = z2;
        xl4 xl4Var = this.e;
        fc3 fc3Var = this.b;
        je8 je8Var = this.a;
        if (xl4Var != null) {
            this.e = null;
            if (z && b == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            Objects.requireNonNull(je8Var);
            x38 x38Var = new x38(je8Var, (byte) 24);
            if (!xl4Var.N) {
                xl4Var.N = true;
                xl4Var.d();
                vpa vpaVar = xl4Var.G;
                if (vpaVar != null) {
                    vpaVar.d();
                    xl4Var.H.d();
                }
                if (z3 && xl4Var.h) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(250L);
                    animatorSet.setInterpolator(k43.f);
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xl4Var.j, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(xl4Var.j, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(xl4Var.j, View.SCALE_Y, 0.1f));
                    animatorSet.addListener(new v5(xl4Var, x38Var, (byte) 21));
                    animatorSet.start();
                } else {
                    xl4Var.f(x38Var);
                }
            }
            fc3Var.j(this, b);
            return;
        }
        je8Var.g0();
        fc3Var.j(this, b);
    }

    public final Bitmap d() {
        Bitmap bitmap;
        Bitmap.Config config;
        xl4 xl4Var = this.e;
        if (xl4Var != null) {
            try {
                ImageView imageView = xl4Var.n;
                if (imageView != null && imageView.getVisibility() == 0 && (xl4Var.n.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) xl4Var.n.getDrawable()).getBitmap()) != null && !bitmap.isRecycled()) {
                    if (bitmap.getConfig() != null) {
                        config = bitmap.getConfig();
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    return bitmap.copy(config, false);
                }
                ne8 ne8Var = xl4Var.l;
                if (ne8Var != null && ne8Var.isAvailable()) {
                    return xl4Var.l.getBitmap();
                }
                return null;
            } catch (Throwable th) {
                cc4.g(th, true);
                return null;
            }
        }
        return null;
    }

    public final void e() {
        xl4 xl4Var = this.e;
        if (xl4Var != null) {
            xl4Var.l();
        }
        this.b.d();
    }

    public final boolean f() {
        if (this.c != 3) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (this.e != null) {
            byte b = this.c;
            if (b == 1 || (b == 2 && this.d == 1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h() {
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

    public final ne8 i(Activity activity, Bitmap bitmap, boolean z) {
        float f;
        float f2;
        fc3 fc3Var;
        int i;
        int i2;
        float f3;
        int i3;
        byte b;
        float n;
        float e;
        if (this.c == 0) {
            fc3 fc3Var2 = this.b;
            ArrayList arrayList = (ArrayList) fc3Var2.c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                me8 me8Var = (me8) arrayList.get(size);
                if (me8Var != this && me8Var.g() && me8Var.a.S() == this.a.S()) {
                    me8Var.b();
                }
            }
            final xl4 xl4Var = new xl4(this, activity);
            this.e = xl4Var;
            RectF rectF = new RectF();
            je8 je8Var = xl4Var.b;
            boolean z2 = xl4Var.d;
            if (z2) {
                float L = hl.L(126.0f);
                SharedPreferences sharedPreferences = (SharedPreferences) kj4.Q(true).b;
                float f4 = sharedPreferences.getFloat("x", -1.0f);
                float f5 = sharedPreferences.getFloat("y", -1.0f);
                if (f4 != -1.0f) {
                    n = xl4.p(f4, L);
                } else {
                    n = (hl.q.x - L) - xl4.n();
                }
                if (f5 != -1.0f) {
                    e = xl4.e(f5, L);
                } else {
                    e = xl4.e(xl4.n() + a.getCurrentActionBarHeight(), L);
                }
                float f6 = e + hl.m;
                rectF.set(n, f6, n + L, L + f6);
                xl4Var.D = 1.0f;
                xl4Var.C = 1.0f;
            } else {
                xl4.k(rectF, je8Var.U(), je8Var.q0());
                xl4Var.C = ((SharedPreferences) kj4.Q(z2).b).getFloat("scale_factor", 1.0f);
                Point point = hl.q;
                xl4Var.D = (Math.min(point.x, point.y) - (xl4.n() * 2.0f)) / xl4Var.i();
            }
            xl4Var.A = (int) rectF.width();
            xl4Var.B = (int) rectF.height();
            xl4Var.E = rectF.left;
            xl4Var.F = rectF.top - hl.m;
            int U = je8Var.U();
            int q0 = je8Var.q0();
            if (U > 0 && q0 > 0) {
                f = q0 / U;
            } else {
                f = 0.5625f;
            }
            if (f < 1.0f) {
                f2 = 0.6f;
            } else {
                f2 = 0.45f;
            }
            rec recVar = xl4Var.I;
            recVar.q = f2;
            recVar.a();
            vpa vpaVar = new vpa(xl4Var, xl4.W);
            wpa wpaVar = new wpa();
            wpaVar.a(0.75f);
            wpaVar.b(650.0f);
            vpaVar.m = wpaVar;
            vpaVar.a(new ps3() {
                @Override
                public final void a(vpa vpaVar2, boolean z3, float f7, float f8) {
                    byte b2 = r2;
                    xl4 xl4Var2 = xl4Var;
                    switch (b2) {
                        case 0:
                            ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("x", f7).apply();
                            xl4Var2.a.b.d();
                            return;
                        default:
                            ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("y", f7).apply();
                            xl4Var2.a.b.d();
                            return;
                    }
                }
            });
            xl4Var.G = vpaVar;
            vpa vpaVar2 = new vpa(xl4Var, xl4.X);
            wpa wpaVar2 = new wpa();
            wpaVar2.a(0.75f);
            wpaVar2.b(650.0f);
            vpaVar2.m = wpaVar2;
            vpaVar2.a(new ps3() {
                @Override
                public final void a(vpa vpaVar22, boolean z3, float f7, float f8) {
                    byte b2 = r2;
                    xl4 xl4Var2 = xl4Var;
                    switch (b2) {
                        case 0:
                            ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("x", f7).apply();
                            xl4Var2.a.b.d();
                            return;
                        default:
                            ((SharedPreferences) kj4.Q(xl4Var2.d).b).edit().putFloat("y", f7).apply();
                            xl4Var2.a.b.d();
                            return;
                    }
                }
            });
            xl4Var.H = vpaVar2;
            Activity activity2 = xl4Var.c;
            int scaledTouchSlop = ViewConfiguration.get(activity2).getScaledTouchSlop();
            ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activity2, new m33(xl4Var, (byte) 1));
            xl4Var.s = scaleGestureDetector;
            scaleGestureDetector.setQuickScaleEnabled(false);
            xl4Var.s.setStylusScaleEnabled(false);
            xl4Var.t = new xh4(activity2, new tl4(xl4Var, scaledTouchSlop));
            xl4Var.k = new pl4(xl4Var, activity2, (byte) 1);
            wl4 wl4Var = new wl4(xl4Var, activity2);
            xl4Var.j = wl4Var;
            wl4Var.addView(xl4Var.k, tre.c(-1.0f, -1));
            pl4 pl4Var = xl4Var.k;
            if (z2) {
                pl4Var.setOutlineProvider(yhc.a);
            } else {
                yi yiVar = yhc.a;
                pl4Var.setOutlineProvider(new whc(0, hl.L(10.0f)));
                yob.h(aob.Xg, null, xl4Var.k);
            }
            xl4Var.k.setClipToOutline(true);
            ImageView imageView = new ImageView(activity2);
            xl4Var.n = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            xl4Var.n.setVisibility(8);
            xl4Var.k.addView(xl4Var.n, tre.c(-1.0f, -1));
            if (z2) {
                ul4 ul4Var = new ul4(xl4Var, activity2);
                xl4Var.r = ul4Var;
                xl4Var.k.addView(ul4Var, tre.c(-1.0f, -1));
                fc3Var = fc3Var2;
                f3 = -1.0f;
                i3 = -1;
            } else {
                recVar.n = new v34(xl4Var, (byte) 2);
                xl4Var.o = new pl4(xl4Var, activity2, (byte) 0);
                pl4 pl4Var2 = xl4Var.o;
                Objects.requireNonNull(pl4Var2);
                xl4Var.J = new cz9(new rj4(pl4Var2, (byte) 1), true);
                xl4Var.o.setWillNotDraw(false);
                xl4Var.o.setAlpha(0.0f);
                View view = new View(activity2);
                view.setBackgroundColor(1275068416);
                xl4Var.o.addView(view, tre.c(-1.0f, -1));
                int L2 = hl.L(8.0f);
                ImageView imageView2 = new ImageView(activity2);
                imageView2.setImageResource(2131232563);
                int i4 = aob.Yg;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                yob.s(imageView2, i4, null, mode);
                int i5 = aob.i6;
                fc3Var = fc3Var2;
                hf0 f0 = aob.f0(aob.w0(null, i5, false), 1, -1);
                uob M = yob.M(i5);
                imageView2.setBackground(f0);
                yob.j(imageView2, f0, null, M, null);
                imageView2.setPadding(L2, L2, L2, L2);
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        LaunchActivity launchActivity;
                        byte b2 = r2;
                        xl4 xl4Var2 = xl4Var;
                        switch (b2) {
                            case 0:
                                xl4Var2.a.c(true, true);
                                return;
                            case 1:
                                me8 me8Var2 = xl4Var2.a;
                                if (me8Var2.c == 1) {
                                    fc3 fc3Var3 = me8Var2.b;
                                    x38 x38Var = new x38(me8Var2, (byte) 25);
                                    if (fc3Var3.b && (launchActivity = (LaunchActivity) fc3Var3.f) != null && !hl.F1(launchActivity)) {
                                        x38Var.run();
                                        return;
                                    }
                                    ((ArrayList) fc3Var3.d).add(x38Var);
                                    if (((LaunchActivity) fc3Var3.f) != null && !fc3Var3.a) {
                                        try {
                                            Intent intent = new Intent(org.telegram.messenger.a.b, ((LaunchActivity) fc3Var3.f).getClass());
                                            intent.addFlags(268435456);
                                            org.telegram.messenger.a.b.startActivity(intent);
                                            return;
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                xl4Var2.r();
                                return;
                        }
                    }
                });
                xl4Var.o.addView(imageView2, tre.d(38, 38.0f, 5, 0.0f, 4.0f, 4.0f, 0.0f));
                ImageView imageView3 = new ImageView(activity2);
                imageView3.setImageResource(2131232564);
                yob.s(imageView3, i4, null, mode);
                hf0 f02 = aob.f0(aob.w0(null, i5, false), 1, -1);
                uob M2 = yob.M(i5);
                imageView3.setBackground(f02);
                yob.j(imageView3, f02, null, M2, null);
                imageView3.setPadding(L2, L2, L2, L2);
                imageView3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        LaunchActivity launchActivity;
                        byte b2 = r2;
                        xl4 xl4Var2 = xl4Var;
                        switch (b2) {
                            case 0:
                                xl4Var2.a.c(true, true);
                                return;
                            case 1:
                                me8 me8Var2 = xl4Var2.a;
                                if (me8Var2.c == 1) {
                                    fc3 fc3Var3 = me8Var2.b;
                                    x38 x38Var = new x38(me8Var2, (byte) 25);
                                    if (fc3Var3.b && (launchActivity = (LaunchActivity) fc3Var3.f) != null && !hl.F1(launchActivity)) {
                                        x38Var.run();
                                        return;
                                    }
                                    ((ArrayList) fc3Var3.d).add(x38Var);
                                    if (((LaunchActivity) fc3Var3.f) != null && !fc3Var3.a) {
                                        try {
                                            Intent intent = new Intent(org.telegram.messenger.a.b, ((LaunchActivity) fc3Var3.f).getClass());
                                            intent.addFlags(268435456);
                                            org.telegram.messenger.a.b.startActivity(intent);
                                            return;
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                xl4Var2.r();
                                return;
                        }
                    }
                });
                xl4Var.o.addView(imageView3, tre.d(38, 38.0f, 5, 0.0f, 4.0f, 48.0f, 0.0f));
                ImageView imageView4 = new ImageView(activity2);
                xl4Var.p = imageView4;
                yob.s(imageView4, i4, null, mode);
                yob.R(xl4Var.p, aob.f0(aob.w0(null, i5, false), 1, -1), null, yob.M(i5), null);
                xl4Var.p.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        LaunchActivity launchActivity;
                        byte b2 = r2;
                        xl4 xl4Var2 = xl4Var;
                        switch (b2) {
                            case 0:
                                xl4Var2.a.c(true, true);
                                return;
                            case 1:
                                me8 me8Var2 = xl4Var2.a;
                                if (me8Var2.c == 1) {
                                    fc3 fc3Var3 = me8Var2.b;
                                    x38 x38Var = new x38(me8Var2, (byte) 25);
                                    if (fc3Var3.b && (launchActivity = (LaunchActivity) fc3Var3.f) != null && !hl.F1(launchActivity)) {
                                        x38Var.run();
                                        return;
                                    }
                                    ((ArrayList) fc3Var3.d).add(x38Var);
                                    if (((LaunchActivity) fc3Var3.f) != null && !fc3Var3.a) {
                                        try {
                                            Intent intent = new Intent(org.telegram.messenger.a.b, ((LaunchActivity) fc3Var3.f).getClass());
                                            intent.addFlags(268435456);
                                            org.telegram.messenger.a.b.startActivity(intent);
                                            return;
                                        } catch (Exception e2) {
                                            cc4.g(e2, true);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            default:
                                xl4Var2.r();
                                return;
                        }
                    }
                });
                ImageView imageView5 = xl4Var.p;
                if (je8Var.E0()) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView5.setVisibility(i);
                xl4Var.o.addView(xl4Var.p, tre.e(38, 38, 17));
                vl4 vl4Var = new vl4(xl4Var, activity2);
                xl4Var.q = vl4Var;
                if (je8Var.E0()) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                vl4Var.setVisibility(i2);
                f3 = -1.0f;
                i3 = -1;
                xl4Var.o.addView(xl4Var.q, tre.c(-1.0f, -1));
                xl4Var.k.addView(xl4Var.o, tre.c(-1.0f, -1));
            }
            View P = je8Var.P();
            xl4Var.m = P;
            if (P != null) {
                hl.B2(P);
                xl4Var.k.addView(xl4Var.m, 0, tre.c(f3, i3));
            } else {
                ne8 ne8Var = new ne8(activity2);
                xl4Var.l = ne8Var;
                if (z2) {
                    ne8Var.setScaleX(1.0166667f);
                    xl4Var.l.setScaleY(1.0166667f);
                }
                xl4Var.k.addView(xl4Var.l, 0, tre.c(-1.0f, -1));
            }
            if (bitmap != null && xl4Var.l != null) {
                xl4Var.n.setImageBitmap(bitmap);
                xl4Var.n.setVisibility(0);
                xl4Var.l.setFirstFrameCallback(new nl4(xl4Var, (byte) 3));
            }
            xl4Var.a();
            if (z) {
                xl4Var.j.setAlpha(0.0f);
                xl4Var.j.setScaleX(0.1f);
                xl4Var.j.setScaleY(0.1f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(250L);
                animatorSet.setInterpolator(k43.f);
                b = 1;
                animatorSet.playTogether(ObjectAnimator.ofFloat(xl4Var.j, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(xl4Var.j, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(xl4Var.j, View.SCALE_Y, 1.0f));
                animatorSet.start();
            } else {
                b = 1;
            }
            xl4Var.l();
            ne8 ne8Var2 = xl4Var.l;
            this.c = b;
            fc3Var.d();
            return ne8Var2;
        }
        p3d.e(this.c, "startFloating in state ");
        return null;
    }
}
