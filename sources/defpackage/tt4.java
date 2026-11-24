package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
public abstract class tt4 extends FrameLayout implements jm7 {
    public static final yn6 k0 = new yn6(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final h62 G;
    public final r7 H;
    public final ImageView I;
    public final LinearLayout J;
    public final b61 K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final ln T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int a;
    public jac a0;
    public final r63 b;
    public lac b0;
    public final Paint c;
    public final ArrayList c0;
    public final fv d;
    public boolean d0;
    public final as0 e;
    public boolean e0;
    public final nt4 f;
    public yn6 f0;
    public ArrayList g0;
    public final FrameLayout h;
    public ArrayList h0;
    public final ArrayList i0;
    public a6 j0;
    public final r59 n;
    public final lt4 r;
    public final a1b s;
    public final mx5 w;
    public boolean x;
    public final a y;

    public tt4(int i, Context context, r63 r63Var, yn6 yn6Var, boolean z, float f, boolean z2, boolean z3) {
        super(context);
        float f2;
        yn6 yn6Var2;
        Paint paint = new Paint(1);
        this.c = paint;
        this.O = -2;
        this.T = new ln(this, 0L, 350L, d53.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        this.i0 = new ArrayList();
        this.P = f;
        this.a = i;
        this.b = r63Var;
        this.M = z;
        this.N = z2;
        this.Q = z3;
        paint.setColor(-14737633);
        paint.setShadowLayer(gm.L(2.33f), 0.0f, gm.L(-0.4f), 134217728);
        fv fvVar = new fv(this, context, r63Var, (byte) 22);
        this.d = fvVar;
        fvVar.setItemSelectorColorProvider(new zo4((byte) 6));
        nt4 nt4Var = new nt4(this);
        this.f = nt4Var;
        fvVar.setAdapter(nt4Var);
        as0 as0Var = new as0(this, (byte) 3);
        this.e = as0Var;
        fvVar.setLayoutManager(as0Var);
        fvVar.setFastScrollEnabled(1);
        fvVar.setFastScrollVisible(true);
        fvVar.getFastScroll().setAlpha(0.0f);
        as0Var.O = new zr1(this, (byte) 6);
        fvVar.i(new as1((byte) 6));
        fvVar.setClipToPadding(false);
        addView(fvVar, qoe.e(-1, -1, 119));
        fvVar.setOnItemClickListener(new f59(this) {
            public final tt4 b;

            {
                this.b = this;
            }

            @Override
            public final void g(int i2, View view) {
                jac jacVar;
                byte b = r2;
                Bitmap bitmap = null;
                tt4 tt4Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = tt4Var.i0;
                        ArrayList arrayList3 = tt4Var.c0;
                        if (i2 >= 2 && tt4Var.a0 != null && (view instanceof pt4)) {
                            pt4 pt4Var = (pt4) view;
                            int i3 = i2 - 2;
                            if (tt4Var.d0) {
                                if (i3 == 0) {
                                    tt4Var.e(tt4.k0, true);
                                    return;
                                }
                                i3 = i2 - 3;
                            } else if (tt4Var.e0) {
                                if (i3 >= 0 && i3 < arrayList3.size()) {
                                    g6b g6bVar = (g6b) arrayList3.get(i3);
                                    jac jacVar2 = tt4Var.a0;
                                    if (g6bVar.K) {
                                        bitmap = tt4.d(pt4Var);
                                    }
                                    jacVar2.a(g6bVar, bitmap);
                                    return;
                                }
                                i3 -= arrayList3.size();
                            }
                            if (i3 >= 0 && i3 < tt4Var.g0.size()) {
                                jo6 jo6Var = (jo6) tt4Var.g0.get(i3);
                                if (arrayList2.isEmpty() && !tt4Var.R) {
                                    jac jacVar3 = tt4Var.a0;
                                    if (jo6Var.b && !jo6Var.d()) {
                                        bitmap = tt4.d(pt4Var);
                                    }
                                    jacVar3.a(jo6Var, bitmap);
                                    return;
                                }
                                if (arrayList2.contains(jo6Var)) {
                                    arrayList2.remove(jo6Var);
                                } else if (arrayList2.size() + 1 > tt4Var.S) {
                                    int i4 = -tt4Var.O;
                                    tt4Var.O = i4;
                                    gm.A3(i4, pt4Var, null);
                                    xx0.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList2.add(jo6Var);
                                }
                                gm.V3(tt4Var.d);
                                tt4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        lt4 lt4Var = tt4Var.r;
                        r7 r7Var = tt4Var.H;
                        if (r7Var != null) {
                            gm.t1(r7Var.getSearchContainer());
                        }
                        if (i2 >= 0 && i2 < lt4Var.c.size() && (jacVar = tt4Var.a0) != null) {
                            jacVar.a(lt4Var.c.get(i2), null);
                            return;
                        }
                        return;
                }
            }
        });
        fvVar.setOnItemLongClickListener(new yu3(this, (byte) 25));
        fvVar.setOnScrollListener(new kt4(this, (byte) 0));
        a aVar = new a(context, r63Var);
        this.y = aVar;
        aVar.setBackgroundColor(-14737633);
        aVar.setTitleColor(-1);
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        aVar.setBackButtonImage(2131231244);
        aVar.G(436207615, false);
        aVar.H(-1, false);
        aVar.H(-1, true);
        addView(aVar, qoe.e(-1, -2, 55));
        aVar.setActionBarMenuOnItemClick(new fh2(this, (byte) 19));
        r6 t = aVar.t();
        h62 h62Var = new h62(this, context, t, r63Var, (byte) 2);
        this.G = h62Var;
        h62Var.setSubMenuOpenSide(1);
        if (gm.O1()) {
            f2 = 64.0f;
        } else {
            f2 = 56.0f;
        }
        aVar.addView(h62Var, 0, qoe.d(-2, -1.0f, 51, f2, 0.0f, 40.0f, 0.0f));
        h62Var.setOnClickListener(new View.OnClickListener(this) {
            public final tt4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                tt4 tt4Var = this.b;
                switch (b) {
                    case 0:
                        tt4Var.G.U(null, null);
                        return;
                    case 1:
                        if (tt4Var.J.getAlpha() >= 0.25f) {
                            tt4Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        if (tt4Var.J.getAlpha() >= 0.25f) {
                            tt4Var.f(true);
                            return;
                        }
                        return;
                    default:
                        tt4Var.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.E = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(gm.o());
        Drawable mutate = context.getResources().getDrawable(2131231257).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(gm.L(4.0f));
        textView.setPadding(0, gm.m, gm.L(10.0f), 0);
        h62Var.addView(textView, qoe.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, qoe.e(-1, -1, 119));
        r59 r59Var = new r59(context, r63Var);
        this.n = r59Var;
        r59Var.setLayoutManager(new q55(3));
        lt4 lt4Var = new lt4(this);
        this.r = lt4Var;
        r59Var.setAdapter(lt4Var);
        r59Var.setOnScrollListener(new kt4(this, (byte) 1));
        r59Var.setClipToPadding(true);
        float f3 = 10.0f;
        r59Var.i(new as1((byte) 5));
        frameLayout.addView(r59Var, qoe.e(-1, -1, 119));
        jm2 jm2Var = new jm2(context, r63Var, (byte) 1);
        jm2Var.setViewType(2);
        jm2Var.setAlpha(0.0f);
        jm2Var.setVisibility(8);
        frameLayout.addView(jm2Var, qoe.e(-1, -1, 119));
        a1b a1bVar = new a1b(context, jm2Var, 11, r63Var);
        this.s = a1bVar;
        xna xnaVar = a1bVar.d;
        xnaVar.setTextSize(1, 16.0f);
        anb.X(xnaVar, cmb.x6, r63Var);
        xnaVar.setTypeface(null);
        xnaVar.setText(jb6.M0(2131745494, null));
        this.w = new mx5(this, false, new sk3(this, (byte) 10));
        frameLayout.addView(a1bVar, qoe.e(-1, -1, 119));
        r59Var.setEmptyView(a1bVar);
        r7 a = t.a(0, 2131232503);
        a.N();
        a.I = new cn0(this);
        this.H = a;
        a.setVisibility(8);
        a.setSearchFieldHint(jb6.M0(2131745495, null));
        r59Var.setOnItemClickListener(new f59(this) {
            public final tt4 b;

            {
                this.b = this;
            }

            @Override
            public final void g(int i2, View view) {
                jac jacVar;
                byte b = r2;
                Bitmap bitmap = null;
                tt4 tt4Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = tt4Var.i0;
                        ArrayList arrayList3 = tt4Var.c0;
                        if (i2 >= 2 && tt4Var.a0 != null && (view instanceof pt4)) {
                            pt4 pt4Var = (pt4) view;
                            int i3 = i2 - 2;
                            if (tt4Var.d0) {
                                if (i3 == 0) {
                                    tt4Var.e(tt4.k0, true);
                                    return;
                                }
                                i3 = i2 - 3;
                            } else if (tt4Var.e0) {
                                if (i3 >= 0 && i3 < arrayList3.size()) {
                                    g6b g6bVar = (g6b) arrayList3.get(i3);
                                    jac jacVar2 = tt4Var.a0;
                                    if (g6bVar.K) {
                                        bitmap = tt4.d(pt4Var);
                                    }
                                    jacVar2.a(g6bVar, bitmap);
                                    return;
                                }
                                i3 -= arrayList3.size();
                            }
                            if (i3 >= 0 && i3 < tt4Var.g0.size()) {
                                jo6 jo6Var = (jo6) tt4Var.g0.get(i3);
                                if (arrayList2.isEmpty() && !tt4Var.R) {
                                    jac jacVar3 = tt4Var.a0;
                                    if (jo6Var.b && !jo6Var.d()) {
                                        bitmap = tt4.d(pt4Var);
                                    }
                                    jacVar3.a(jo6Var, bitmap);
                                    return;
                                }
                                if (arrayList2.contains(jo6Var)) {
                                    arrayList2.remove(jo6Var);
                                } else if (arrayList2.size() + 1 > tt4Var.S) {
                                    int i4 = -tt4Var.O;
                                    tt4Var.O = i4;
                                    gm.A3(i4, pt4Var, null);
                                    xx0.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList2.add(jo6Var);
                                }
                                gm.V3(tt4Var.d);
                                tt4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        lt4 lt4Var2 = tt4Var.r;
                        r7 r7Var = tt4Var.H;
                        if (r7Var != null) {
                            gm.t1(r7Var.getSearchContainer());
                        }
                        if (i2 >= 0 && i2 < lt4Var2.c.size() && (jacVar = tt4Var.a0) != null) {
                            jacVar.a(lt4Var2.c.get(i2), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z) {
            ArrayList arrayList2 = oc7.r1(i).N1().w.b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                g6b g6bVar = (g6b) obj;
                if (!g6bVar.g && !g6bVar.w) {
                    this.c0.add(g6bVar);
                }
            }
        }
        if (z2) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            anb.h(cmb.g5, r63Var, linearLayout);
            linearLayout.setPadding(gm.L(10.0f), gm.L(10.0f), gm.L(10.0f), gm.L(gm.n > 0 ? 0.0f : f3) + gm.n);
            addView(linearLayout, qoe.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(gm.L(32.0f));
            linearLayout.setVisibility(8);
            b61 b61Var = new b61(r63Var, context, true);
            b61Var.setRoundRadius(24);
            this.K = b61Var;
            b61Var.i(jb6.H(',', "StoriesCreate", 1), false, true);
            if (!z3) {
                linearLayout.addView(b61Var, qoe.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                b61Var.setOnClickListener(new View.OnClickListener(this) {
                    public final tt4 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        tt4 tt4Var = this.b;
                        switch (b) {
                            case 0:
                                tt4Var.G.U(null, null);
                                return;
                            case 1:
                                if (tt4Var.J.getAlpha() >= 0.25f) {
                                    tt4Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (tt4Var.J.getAlpha() >= 0.25f) {
                                    tt4Var.f(true);
                                    return;
                                }
                                return;
                            default:
                                tt4Var.f(false);
                                return;
                        }
                    }
                });
            }
            b61 b61Var2 = new b61(r63Var, context, z3);
            b61Var2.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            pn2 pn2Var = new pn2(2131231946, 0);
            pn2Var.r = -gm.L(1.33f);
            pn2Var.s = gm.L(0.66f);
            spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) jb6.M0(2131744468, null));
            b61Var2.i(spannableStringBuilder, false, true);
            linearLayout.addView(b61Var2, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            b61Var2.setOnClickListener(new View.OnClickListener(this) {
                public final tt4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    tt4 tt4Var = this.b;
                    switch (b) {
                        case 0:
                            tt4Var.G.U(null, null);
                            return;
                        case 1:
                            if (tt4Var.J.getAlpha() >= 0.25f) {
                                tt4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            if (tt4Var.J.getAlpha() >= 0.25f) {
                                tt4Var.f(true);
                                return;
                            }
                            return;
                        default:
                            tt4Var.f(false);
                            return;
                    }
                }
            });
        } else {
            this.J = null;
            this.K = null;
            ImageView imageView = new ImageView(context);
            this.I = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231199);
            int L = gm.L(56.0f);
            int i3 = cmb.Ei;
            ShapeDrawable K = cmb.K(L, cmb.v0(i3, r63Var));
            wmb M = anb.M(i3);
            imageView.setBackground(K);
            anb.j(imageView, K, M, null, r63Var);
            rve.b(imageView, 0.1f, 1.5f);
            addView(imageView, qoe.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final tt4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    tt4 tt4Var = this.b;
                    switch (b) {
                        case 0:
                            tt4Var.G.U(null, null);
                            return;
                        case 1:
                            if (tt4Var.J.getAlpha() >= 0.25f) {
                                tt4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            if (tt4Var.J.getAlpha() >= 0.25f) {
                                tt4Var.f(true);
                                return;
                            }
                            return;
                        default:
                            tt4Var.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        yn6 yn6Var3 = k0;
        if (yn6Var != null && (yn6Var != yn6Var3 || this.c0.size() > 0)) {
            this.f0 = yn6Var;
            yn6Var2 = yn6Var;
        } else {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                yn6Var2 = (yn6) this.h0.get(0);
                this.f0 = yn6Var2;
            } else {
                yn6Var2 = MediaController.a2;
                this.f0 = yn6Var2;
            }
        }
        this.g0 = b(yn6Var2);
        i();
        yn6 yn6Var4 = this.f0;
        yn6 yn6Var5 = MediaController.a2;
        TextView textView2 = this.E;
        if (yn6Var4 == yn6Var5) {
            textView2.setText(jb6.M0(2131752175, null));
        } else if (yn6Var4 == yn6Var3) {
            textView2.setText(jb6.M0(2131744365, null));
        } else {
            textView2.setText(yn6Var4.c);
        }
    }

    public static Bitmap d(pt4 pt4Var) {
        Bitmap bitmap;
        if (pt4Var != null && (bitmap = pt4Var.a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(yn6 yn6Var) {
        if (yn6Var == null) {
            return new ArrayList();
        }
        ArrayList arrayList = yn6Var.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            jo6 jo6Var = (jo6) arrayList.get(i);
            if (!this.M || !jo6Var.b) {
                arrayList2.add(jo6Var);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.r2;
        nt4 nt4Var = this.f;
        int i4 = 0;
        if (i == i3) {
            h();
            if (this.f0 != null) {
                while (true) {
                    if (i4 >= MediaController.c2.size()) {
                        break;
                    }
                    yn6 yn6Var = (yn6) MediaController.c2.get(i4);
                    int i5 = yn6Var.a;
                    yn6 yn6Var2 = this.f0;
                    if (i5 == yn6Var2.a && yn6Var.b == yn6Var2.b) {
                        this.f0 = yn6Var;
                        break;
                    }
                    i4++;
                }
            } else {
                ArrayList arrayList = this.h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f0 = (yn6) this.h0.get(0);
                } else {
                    this.f0 = MediaController.a2;
                }
            }
            this.g0 = b(this.f0);
            this.i0.clear();
            i();
            if (nt4Var != null) {
                nt4Var.f();
            }
        } else if (i == nm7.C5) {
            ArrayList arrayList2 = this.c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = oc7.r1(this.a).N1().w.b;
                int size = arrayList3.size();
                while (i4 < size) {
                    Object obj = arrayList3.get(i4);
                    i4++;
                    g6b g6bVar = (g6b) obj;
                    if (!g6bVar.g && !g6bVar.w) {
                        arrayList2.add(g6bVar);
                    }
                }
            }
            h();
            i();
            if (nt4Var != null) {
                nt4Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        float g = g();
        int i = 0;
        if (g <= b10.c(32.0f, a.getCurrentActionBarHeight() + gm.m, 0)) {
            z = true;
        } else {
            z = false;
        }
        float d = this.T.d(z);
        float R1 = gm.R1(g, 0.0f, d);
        if (z != this.x) {
            this.x = z;
            c(z);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.x) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animate.alpha(f).start();
        }
        a aVar = this.y;
        if (aVar != null) {
            aVar.setAlpha(d);
            if (d <= 0.0f) {
                i = 8;
            }
            if (aVar.getVisibility() != i) {
                aVar.setVisibility(i);
            }
        }
        a6 a6Var = this.j0;
        if (a6Var != null) {
            a6Var.setAlpha(1.0f - d);
        }
        RectF rectF = gm.P;
        rectF.set(0.0f, R1, getWidth(), gm.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, gm.L(14.0f), gm.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, R1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(yn6 yn6Var, boolean z) {
        this.f0 = yn6Var;
        this.g0 = b(yn6Var);
        this.i0.clear();
        i();
        yn6 yn6Var2 = this.f0;
        yn6 yn6Var3 = MediaController.a2;
        TextView textView = this.E;
        if (yn6Var2 == yn6Var3) {
            textView.setText(jb6.M0(2131752175, null));
        } else if (yn6Var2 == k0) {
            textView.setText(jb6.M0(2131744365, null));
        } else {
            textView.setText(yn6Var2.c);
        }
        this.f.f();
        as0 as0Var = this.e;
        if (z) {
            w46 w46Var = new w46(getContext(), 2);
            w46Var.a = 1;
            w46Var.p = gm.L(16.0f) + (-a.getCurrentActionBarHeight());
            as0Var.v0(w46Var);
            return;
        }
        as0Var.g1(1, gm.L(16.0f) + (-a.getCurrentActionBarHeight()));
    }

    public final void f(boolean z) {
        Bitmap bitmap;
        pt4 pt4Var;
        if (this.b0 != null) {
            ArrayList arrayList = this.i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.a0.a((jo6) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    fv fvVar = this.d;
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        jo6 jo6Var = (jo6) obj;
                        if (jo6Var.b && !jo6Var.d()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < fvVar.getChildCount()) {
                                    View childAt = fvVar.getChildAt(i2);
                                    if (childAt instanceof pt4) {
                                        pt4Var = (pt4) childAt;
                                        if (pt4Var.T == jo6Var) {
                                            break;
                                        }
                                    }
                                    i2++;
                                } else {
                                    pt4Var = null;
                                    break;
                                }
                            }
                            bitmap = d(pt4Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.b0.a(Boolean.valueOf(z), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        gm.V3(fvVar);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        fv fvVar = this.d;
        if (fvVar != null && fvVar.getChildCount() > 0) {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < fvVar.getChildCount(); i2++) {
                View childAt = fvVar.getChildAt(i2);
                if (RecyclerView.R(childAt) > 0) {
                    i = Math.min(i, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i, getHeight()));
        } else {
            padding = getPadding();
        }
        if (fvVar == null) {
            return padding;
        }
        return gm.U1(fvVar.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (gm.q.y * 0.35f);
    }

    public yn6 getSelectedAlbum() {
        return this.f0;
    }

    public String getTitle() {
        int i;
        if (this.M) {
            i = 2131754425;
        } else {
            i = 2131752058;
        }
        return jb6.M0(i, null);
    }

    public final void h() {
        kd kdVar;
        h62 h62Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h62Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.h0 = arrayList2;
        Collections.sort(arrayList2, new x52(arrayList, (byte) 1));
        ArrayList arrayList3 = this.c0;
        boolean isEmpty = arrayList3.isEmpty();
        yn6 yn6Var = k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.h0;
            arrayList4.add(!arrayList4.isEmpty(), yn6Var);
        }
        boolean isEmpty2 = this.h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            yn6 yn6Var2 = (yn6) this.h0.get(i);
            r63 r63Var = this.b;
            if (yn6Var2 == yn6Var) {
                kdVar = new kd(getContext(), yn6Var2.d, jb6.N0("StoryDraftsAlbum"), arrayList3.size(), r63Var);
            } else {
                ArrayList b = b(yn6Var2);
                if (!b.isEmpty()) {
                    kdVar = new kd(getContext(), yn6Var2.d, yn6Var2.c, b.size(), r63Var);
                }
            }
            h62Var.getPopupLayout().addView(kdVar);
            kdVar.setOnClickListener(new tf3(this, yn6Var2, (byte) 16));
        }
    }

    public final void i() {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2 = this.h0;
        boolean z2 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.h0.get(0) == this.f0 && this.c0.size() > 2) {
            z = true;
        } else {
            z = false;
        }
        this.d0 = z;
        if (z || (this.f0 != k0 && ((arrayList = this.h0) == null || arrayList.isEmpty() || this.h0.get(0) != this.f0))) {
            z2 = false;
        }
        this.e0 = z2;
    }

    public final void j() {
        float f;
        float f2;
        int L;
        ArrayList arrayList = this.i0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z = !isEmpty;
        float f3 = 0.0f;
        float f4 = 1.0f;
        ImageView imageView = this.I;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f);
            float f5 = 0.7f;
            if (!isEmpty) {
                f2 = 1.0f;
            } else {
                f2 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f2);
            if (!isEmpty) {
                f5 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f5);
            if (!isEmpty) {
                L = -gm.n;
            } else {
                L = gm.L(8.0f);
            }
            wi8.t(scaleY.translationY(L), d53.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            b61 b61Var = this.K;
            if (b61Var != null) {
                b61Var.i(jb6.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f6 = 10.0f;
            int L2 = gm.L(10.0f);
            int L3 = gm.L(10.0f);
            int L4 = gm.L(10.0f);
            if (gm.n > 0) {
                f6 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, gm.L(f6) + gm.n);
            if (this.U != z) {
                this.U = z;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f4 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f4);
                if (isEmpty) {
                    f3 = gm.L(32.0f);
                }
                alpha2.translationY(f3).setInterpolator(d53.h).setDuration(320L).setListener(new jf4((byte) 3, this, z)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        nm7.e().b(this, nm7.r2);
        nm7.f(this.a).b(this, nm7.C5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.e().n(this, nm7.r2);
        nm7.f(this.a).n(this, nm7.C5);
        pt4.f0.clear();
        pt4.g0.evictAll();
        int i = 0;
        while (true) {
            ArrayList arrayList = pt4.d0;
            if (i < arrayList.size()) {
                ((np3) arrayList.get(i)).cleanupQueue();
                ((np3) arrayList.get(i)).recycle();
                i++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int L;
        float f;
        float f2;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gm.m;
        fv fvVar = this.d;
        fvVar.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = gm.L(6.0f);
        int currentActionBarHeight2 = a.getCurrentActionBarHeight() + gm.m;
        int L3 = gm.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (gm.n > 0) {
                i3 = 0;
            } else {
                i3 = 10;
            }
            L = gm.L(i3 + 114);
        }
        fvVar.setPadding(L2, currentActionBarHeight2, L3, L + gm.n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-gm.n);
        }
        if (linearLayout != null) {
            int L4 = gm.L(10.0f);
            int L5 = gm.L(10.0f);
            int L6 = gm.L(10.0f);
            if (gm.n > 0) {
                f2 = 0.0f;
            } else {
                f2 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, gm.L(f2) + gm.n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = a.getCurrentActionBarHeight() + gm.m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = gm.n;
        int i4 = gm.m;
        int L7 = gm.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i4, L7, 0);
        if (!gm.O1()) {
            Point point = gm.q;
            if (point.x > point.y) {
                f = 18.0f;
                textView.setTextSize(f);
                super.onMeasure(i, i2);
            }
        }
        f = 20.0f;
        textView.setTextSize(f);
        super.onMeasure(i, i2);
    }

    public void setMaxCount(int i) {
        this.S = i;
    }

    public void setMultipleOnClick(boolean z) {
        if (this.R != z) {
            this.R = z;
            gm.V3(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(jac jacVar) {
        this.a0 = jacVar;
    }

    public void setOnSelectMultipleListener(lac lacVar) {
        this.b0 = lacVar;
    }

    public void a() {
    }

    public void c(boolean z) {
    }
}
