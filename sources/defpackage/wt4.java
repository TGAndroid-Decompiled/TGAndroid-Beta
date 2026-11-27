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
public abstract class wt4 extends FrameLayout implements fn7 {
    public static final do6 k0 = new do6(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final m52 G;
    public final s7 H;
    public final ImageView I;
    public final LinearLayout J;
    public final c51 K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final mm T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int a;
    public icc a0;
    public final x53 b;
    public kcc b0;
    public final Paint c;
    public final ArrayList c0;
    public final gu d;
    public boolean d0;
    public final ar0 e;
    public boolean e0;
    public final qt4 f;
    public do6 f0;
    public ArrayList g0;
    public final FrameLayout h;
    public ArrayList h0;
    public final ArrayList i0;
    public b6 j0;
    public final d79 n;
    public final ot4 r;
    public final z2b s;
    public final rx5 w;
    public boolean x;
    public final a y;

    public wt4(int i, Context context, x53 x53Var, do6 do6Var, boolean z, float f, boolean z2, boolean z3) {
        super(context);
        float f2;
        do6 do6Var2;
        Paint paint = new Paint(1);
        this.c = paint;
        this.O = -2;
        this.T = new mm(this, 0L, 350L, k43.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        this.i0 = new ArrayList();
        this.P = f;
        this.a = i;
        this.b = x53Var;
        this.M = z;
        this.N = z2;
        this.Q = z3;
        paint.setColor(-14737633);
        paint.setShadowLayer(hl.L(2.33f), 0.0f, hl.L(-0.4f), 134217728);
        gu guVar = new gu(this, context, x53Var, (byte) 22);
        this.d = guVar;
        guVar.setItemSelectorColorProvider(new xi4((byte) 16));
        qt4 qt4Var = new qt4(this);
        this.f = qt4Var;
        guVar.setAdapter(qt4Var);
        ar0 ar0Var = new ar0(this, (byte) 3);
        this.e = ar0Var;
        guVar.setLayoutManager(ar0Var);
        guVar.setFastScrollEnabled(1);
        guVar.setFastScrollVisible(true);
        guVar.getFastScroll().setAlpha(0.0f);
        ar0Var.O = new ar1(this, (byte) 6);
        guVar.i(new br1((byte) 6));
        guVar.setClipToPadding(false);
        addView(guVar, tre.e(-1, -1, 119));
        guVar.setOnItemClickListener(new r69(this) {
            public final wt4 b;

            {
                this.b = this;
            }

            @Override
            public final void e(int i2, View view) {
                icc iccVar;
                byte b = r2;
                Bitmap bitmap = null;
                wt4 wt4Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = wt4Var.i0;
                        ArrayList arrayList3 = wt4Var.c0;
                        if (i2 >= 2 && wt4Var.a0 != null && (view instanceof st4)) {
                            st4 st4Var = (st4) view;
                            int i3 = i2 - 2;
                            if (wt4Var.d0) {
                                if (i3 == 0) {
                                    wt4Var.e(wt4.k0, true);
                                    return;
                                }
                                i3 = i2 - 3;
                            } else if (wt4Var.e0) {
                                if (i3 >= 0 && i3 < arrayList3.size()) {
                                    c8b c8bVar = (c8b) arrayList3.get(i3);
                                    icc iccVar2 = wt4Var.a0;
                                    if (c8bVar.K) {
                                        bitmap = wt4.d(st4Var);
                                    }
                                    iccVar2.a(c8bVar, bitmap);
                                    return;
                                }
                                i3 -= arrayList3.size();
                            }
                            if (i3 >= 0 && i3 < wt4Var.g0.size()) {
                                no6 no6Var = (no6) wt4Var.g0.get(i3);
                                if (arrayList2.isEmpty() && !wt4Var.R) {
                                    icc iccVar3 = wt4Var.a0;
                                    if (no6Var.b && !no6Var.d()) {
                                        bitmap = wt4.d(st4Var);
                                    }
                                    iccVar3.a(no6Var, bitmap);
                                    return;
                                }
                                if (arrayList2.contains(no6Var)) {
                                    arrayList2.remove(no6Var);
                                } else if (arrayList2.size() + 1 > wt4Var.S) {
                                    int i4 = -wt4Var.O;
                                    wt4Var.O = i4;
                                    hl.A3(i4, st4Var, null);
                                    yw0.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList2.add(no6Var);
                                }
                                hl.V3(wt4Var.d);
                                wt4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        ot4 ot4Var = wt4Var.r;
                        s7 s7Var = wt4Var.H;
                        if (s7Var != null) {
                            hl.t1(s7Var.getSearchContainer());
                        }
                        if (i2 >= 0 && i2 < ot4Var.c.size() && (iccVar = wt4Var.a0) != null) {
                            iccVar.a(ot4Var.c.get(i2), null);
                            return;
                        }
                        return;
                }
            }
        });
        guVar.setOnItemLongClickListener(new lu3(this, (byte) 25));
        guVar.setOnScrollListener(new nt4(this, (byte) 0));
        a aVar = new a(context, x53Var);
        this.y = aVar;
        aVar.setBackgroundColor(-14737633);
        aVar.setTitleColor(-1);
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        aVar.setBackButtonImage(2131231243);
        aVar.G(436207615, false);
        aVar.H(-1, false);
        aVar.H(-1, true);
        addView(aVar, tre.e(-1, -2, 55));
        aVar.setActionBarMenuOnItemClick(new kg2(this, (byte) 19));
        s6 u = aVar.u();
        m52 m52Var = new m52(this, context, u, x53Var, (byte) 2);
        this.G = m52Var;
        m52Var.setSubMenuOpenSide(1);
        if (hl.O1()) {
            f2 = 64.0f;
        } else {
            f2 = 56.0f;
        }
        aVar.addView(m52Var, 0, tre.d(-2, -1.0f, 51, f2, 0.0f, 40.0f, 0.0f));
        m52Var.setOnClickListener(new View.OnClickListener(this) {
            public final wt4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                wt4 wt4Var = this.b;
                switch (b) {
                    case 0:
                        wt4Var.G.U(null, null);
                        return;
                    case 1:
                        if (wt4Var.J.getAlpha() >= 0.25f) {
                            wt4Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        if (wt4Var.J.getAlpha() >= 0.25f) {
                            wt4Var.f(true);
                            return;
                        }
                        return;
                    default:
                        wt4Var.f(false);
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
        textView.setTypeface(hl.o());
        Drawable mutate = context.getResources().getDrawable(2131231256).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(hl.L(4.0f));
        textView.setPadding(0, hl.m, hl.L(10.0f), 0);
        m52Var.addView(textView, tre.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, tre.e(-1, -1, 119));
        d79 d79Var = new d79(context, x53Var);
        this.n = d79Var;
        d79Var.setLayoutManager(new u55(3));
        ot4 ot4Var = new ot4(this);
        this.r = ot4Var;
        d79Var.setAdapter(ot4Var);
        d79Var.setOnScrollListener(new nt4(this, (byte) 1));
        d79Var.setClipToPadding(true);
        float f3 = 10.0f;
        d79Var.i(new br1((byte) 5));
        frameLayout.addView(d79Var, tre.e(-1, -1, 119));
        rl2 rl2Var = new rl2(context, x53Var, (byte) 1);
        rl2Var.setViewType(2);
        rl2Var.setAlpha(0.0f);
        rl2Var.setVisibility(8);
        frameLayout.addView(rl2Var, tre.e(-1, -1, 119));
        z2b z2bVar = new z2b(context, rl2Var, 11, x53Var);
        this.s = z2bVar;
        tpa tpaVar = z2bVar.d;
        tpaVar.setTextSize(1, 16.0f);
        yob.X(tpaVar, aob.y6, x53Var);
        tpaVar.setTypeface(null);
        tpaVar.setText(ob6.M0(2131745488, null));
        this.w = new rx5(this, false, new zj3(this, (byte) 10));
        frameLayout.addView(z2bVar, tre.e(-1, -1, 119));
        d79Var.setEmptyView(z2bVar);
        s7 a = u.a(0, 2131232502);
        a.N();
        a.I = new cm0(this);
        this.H = a;
        a.setVisibility(8);
        a.setSearchFieldHint(ob6.M0(2131745489, null));
        d79Var.setOnItemClickListener(new r69(this) {
            public final wt4 b;

            {
                this.b = this;
            }

            @Override
            public final void e(int i2, View view) {
                icc iccVar;
                byte b = r2;
                Bitmap bitmap = null;
                wt4 wt4Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = wt4Var.i0;
                        ArrayList arrayList3 = wt4Var.c0;
                        if (i2 >= 2 && wt4Var.a0 != null && (view instanceof st4)) {
                            st4 st4Var = (st4) view;
                            int i3 = i2 - 2;
                            if (wt4Var.d0) {
                                if (i3 == 0) {
                                    wt4Var.e(wt4.k0, true);
                                    return;
                                }
                                i3 = i2 - 3;
                            } else if (wt4Var.e0) {
                                if (i3 >= 0 && i3 < arrayList3.size()) {
                                    c8b c8bVar = (c8b) arrayList3.get(i3);
                                    icc iccVar2 = wt4Var.a0;
                                    if (c8bVar.K) {
                                        bitmap = wt4.d(st4Var);
                                    }
                                    iccVar2.a(c8bVar, bitmap);
                                    return;
                                }
                                i3 -= arrayList3.size();
                            }
                            if (i3 >= 0 && i3 < wt4Var.g0.size()) {
                                no6 no6Var = (no6) wt4Var.g0.get(i3);
                                if (arrayList2.isEmpty() && !wt4Var.R) {
                                    icc iccVar3 = wt4Var.a0;
                                    if (no6Var.b && !no6Var.d()) {
                                        bitmap = wt4.d(st4Var);
                                    }
                                    iccVar3.a(no6Var, bitmap);
                                    return;
                                }
                                if (arrayList2.contains(no6Var)) {
                                    arrayList2.remove(no6Var);
                                } else if (arrayList2.size() + 1 > wt4Var.S) {
                                    int i4 = -wt4Var.O;
                                    wt4Var.O = i4;
                                    hl.A3(i4, st4Var, null);
                                    yw0.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList2.add(no6Var);
                                }
                                hl.V3(wt4Var.d);
                                wt4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        ot4 ot4Var2 = wt4Var.r;
                        s7 s7Var = wt4Var.H;
                        if (s7Var != null) {
                            hl.t1(s7Var.getSearchContainer());
                        }
                        if (i2 >= 0 && i2 < ot4Var2.c.size() && (iccVar = wt4Var.a0) != null) {
                            iccVar.a(ot4Var2.c.get(i2), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z) {
            ArrayList arrayList2 = uc7.s1(i).O1().w.b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                c8b c8bVar = (c8b) obj;
                if (!c8bVar.g && !c8bVar.w) {
                    this.c0.add(c8bVar);
                }
            }
        }
        if (z2) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            yob.h(aob.h5, x53Var, linearLayout);
            linearLayout.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(hl.n > 0 ? 0.0f : f3) + hl.n);
            addView(linearLayout, tre.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(hl.L(32.0f));
            linearLayout.setVisibility(8);
            c51 c51Var = new c51(x53Var, context, true);
            c51Var.setRoundRadius(24);
            this.K = c51Var;
            c51Var.i(ob6.H(',', "StoriesCreate", 1), false, true);
            if (!z3) {
                linearLayout.addView(c51Var, tre.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                c51Var.setOnClickListener(new View.OnClickListener(this) {
                    public final wt4 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        wt4 wt4Var = this.b;
                        switch (b) {
                            case 0:
                                wt4Var.G.U(null, null);
                                return;
                            case 1:
                                if (wt4Var.J.getAlpha() >= 0.25f) {
                                    wt4Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (wt4Var.J.getAlpha() >= 0.25f) {
                                    wt4Var.f(true);
                                    return;
                                }
                                return;
                            default:
                                wt4Var.f(false);
                                return;
                        }
                    }
                });
            }
            c51 c51Var2 = new c51(x53Var, context, z3);
            c51Var2.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            wm2 wm2Var = new wm2(2131231945, 0);
            wm2Var.r = -hl.L(1.33f);
            wm2Var.s = hl.L(0.66f);
            spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) ob6.M0(2131744436, null));
            c51Var2.i(spannableStringBuilder, false, true);
            linearLayout.addView(c51Var2, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            c51Var2.setOnClickListener(new View.OnClickListener(this) {
                public final wt4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wt4 wt4Var = this.b;
                    switch (b) {
                        case 0:
                            wt4Var.G.U(null, null);
                            return;
                        case 1:
                            if (wt4Var.J.getAlpha() >= 0.25f) {
                                wt4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            if (wt4Var.J.getAlpha() >= 0.25f) {
                                wt4Var.f(true);
                                return;
                            }
                            return;
                        default:
                            wt4Var.f(false);
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
            imageView.setImageResource(2131231198);
            int L = hl.L(56.0f);
            int i3 = aob.Fi;
            ShapeDrawable K = aob.K(L, aob.v0(i3, x53Var));
            uob M = yob.M(i3);
            imageView.setBackground(K);
            yob.j(imageView, K, M, null, x53Var);
            iye.b(imageView, 0.1f, 1.5f);
            addView(imageView, tre.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final wt4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    wt4 wt4Var = this.b;
                    switch (b) {
                        case 0:
                            wt4Var.G.U(null, null);
                            return;
                        case 1:
                            if (wt4Var.J.getAlpha() >= 0.25f) {
                                wt4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            if (wt4Var.J.getAlpha() >= 0.25f) {
                                wt4Var.f(true);
                                return;
                            }
                            return;
                        default:
                            wt4Var.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        do6 do6Var3 = k0;
        if (do6Var != null && (do6Var != do6Var3 || this.c0.size() > 0)) {
            this.f0 = do6Var;
            do6Var2 = do6Var;
        } else {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                do6Var2 = (do6) this.h0.get(0);
                this.f0 = do6Var2;
            } else {
                do6Var2 = MediaController.a2;
                this.f0 = do6Var2;
            }
        }
        this.g0 = b(do6Var2);
        i();
        do6 do6Var4 = this.f0;
        do6 do6Var5 = MediaController.a2;
        TextView textView2 = this.E;
        if (do6Var4 == do6Var5) {
            textView2.setText(ob6.M0(2131752203, null));
        } else if (do6Var4 == do6Var3) {
            textView2.setText(ob6.M0(2131744333, null));
        } else {
            textView2.setText(do6Var4.c);
        }
    }

    public static Bitmap d(st4 st4Var) {
        Bitmap bitmap;
        if (st4Var != null && (bitmap = st4Var.a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(do6 do6Var) {
        if (do6Var == null) {
            return new ArrayList();
        }
        ArrayList arrayList = do6Var.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            no6 no6Var = (no6) arrayList.get(i);
            if (!this.M || !no6Var.b) {
                arrayList2.add(no6Var);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.r2;
        qt4 qt4Var = this.f;
        int i4 = 0;
        if (i == i3) {
            h();
            if (this.f0 != null) {
                while (true) {
                    if (i4 >= MediaController.c2.size()) {
                        break;
                    }
                    do6 do6Var = (do6) MediaController.c2.get(i4);
                    int i5 = do6Var.a;
                    do6 do6Var2 = this.f0;
                    if (i5 == do6Var2.a && do6Var.b == do6Var2.b) {
                        this.f0 = do6Var;
                        break;
                    }
                    i4++;
                }
            } else {
                ArrayList arrayList = this.h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f0 = (do6) this.h0.get(0);
                } else {
                    this.f0 = MediaController.a2;
                }
            }
            this.g0 = b(this.f0);
            this.i0.clear();
            i();
            if (qt4Var != null) {
                qt4Var.f();
            }
        } else if (i == jn7.B5) {
            ArrayList arrayList2 = this.c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = uc7.s1(this.a).O1().w.b;
                int size = arrayList3.size();
                while (i4 < size) {
                    Object obj = arrayList3.get(i4);
                    i4++;
                    c8b c8bVar = (c8b) obj;
                    if (!c8bVar.g && !c8bVar.w) {
                        arrayList2.add(c8bVar);
                    }
                }
            }
            h();
            i();
            if (qt4Var != null) {
                qt4Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        float g = g();
        int i = 0;
        if (g <= c00.d(32.0f, a.getCurrentActionBarHeight() + hl.m, 0)) {
            z = true;
        } else {
            z = false;
        }
        float d = this.T.d(z);
        float R1 = hl.R1(g, 0.0f, d);
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
        b6 b6Var = this.j0;
        if (b6Var != null) {
            b6Var.setAlpha(1.0f - d);
        }
        RectF rectF = hl.P;
        rectF.set(0.0f, R1, getWidth(), hl.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, hl.L(14.0f), hl.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, R1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(do6 do6Var, boolean z) {
        this.f0 = do6Var;
        this.g0 = b(do6Var);
        this.i0.clear();
        i();
        do6 do6Var2 = this.f0;
        do6 do6Var3 = MediaController.a2;
        TextView textView = this.E;
        if (do6Var2 == do6Var3) {
            textView.setText(ob6.M0(2131752203, null));
        } else if (do6Var2 == k0) {
            textView.setText(ob6.M0(2131744333, null));
        } else {
            textView.setText(do6Var2.c);
        }
        this.f.f();
        ar0 ar0Var = this.e;
        if (z) {
            z46 z46Var = new z46(getContext(), 2);
            z46Var.a = 1;
            z46Var.p = hl.L(16.0f) + (-a.getCurrentActionBarHeight());
            ar0Var.v0(z46Var);
            return;
        }
        ar0Var.g1(1, hl.L(16.0f) + (-a.getCurrentActionBarHeight()));
    }

    public final void f(boolean z) {
        Bitmap bitmap;
        st4 st4Var;
        if (this.b0 != null) {
            ArrayList arrayList = this.i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.a0.a((no6) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    gu guVar = this.d;
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        no6 no6Var = (no6) obj;
                        if (no6Var.b && !no6Var.d()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < guVar.getChildCount()) {
                                    View childAt = guVar.getChildAt(i2);
                                    if (childAt instanceof st4) {
                                        st4Var = (st4) childAt;
                                        if (st4Var.T == no6Var) {
                                            break;
                                        }
                                    }
                                    i2++;
                                } else {
                                    st4Var = null;
                                    break;
                                }
                            }
                            bitmap = d(st4Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.b0.a(Boolean.valueOf(z), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        hl.V3(guVar);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        gu guVar = this.d;
        if (guVar != null && guVar.getChildCount() > 0) {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < guVar.getChildCount(); i2++) {
                View childAt = guVar.getChildAt(i2);
                if (RecyclerView.S(childAt) > 0) {
                    i = Math.min(i, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i, getHeight()));
        } else {
            padding = getPadding();
        }
        if (guVar == null) {
            return padding;
        }
        return hl.U1(guVar.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (hl.q.y * 0.35f);
    }

    public do6 getSelectedAlbum() {
        return this.f0;
    }

    public String getTitle() {
        int i;
        if (this.M) {
            i = 2131754421;
        } else {
            i = 2131752086;
        }
        return ob6.M0(i, null);
    }

    public final void h() {
        lc lcVar;
        m52 m52Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m52Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.h0 = arrayList2;
        Collections.sort(arrayList2, new c52(arrayList, (byte) 1));
        ArrayList arrayList3 = this.c0;
        boolean isEmpty = arrayList3.isEmpty();
        do6 do6Var = k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.h0;
            arrayList4.add(!arrayList4.isEmpty(), do6Var);
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
            do6 do6Var2 = (do6) this.h0.get(i);
            x53 x53Var = this.b;
            if (do6Var2 == do6Var) {
                lcVar = new lc(getContext(), do6Var2.d, ob6.N0("StoryDraftsAlbum"), arrayList3.size(), x53Var);
            } else {
                ArrayList b = b(do6Var2);
                if (!b.isEmpty()) {
                    lcVar = new lc(getContext(), do6Var2.d, do6Var2.c, b.size(), x53Var);
                }
            }
            m52Var.getPopupLayout().addView(lcVar);
            lcVar.setOnClickListener(new je3(this, do6Var2, (byte) 18));
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
                L = -hl.n;
            } else {
                L = hl.L(8.0f);
            }
            ik8.t(scaleY.translationY(L), k43.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            c51 c51Var = this.K;
            if (c51Var != null) {
                c51Var.i(ob6.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f6 = 10.0f;
            int L2 = hl.L(10.0f);
            int L3 = hl.L(10.0f);
            int L4 = hl.L(10.0f);
            if (hl.n > 0) {
                f6 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, hl.L(f6) + hl.n);
            if (this.U != z) {
                this.U = z;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f4 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f4);
                if (isEmpty) {
                    f3 = hl.L(32.0f);
                }
                alpha2.translationY(f3).setInterpolator(k43.h).setDuration(320L).setListener(new gf4((byte) 3, this, z)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        jn7.e().b(this, jn7.r2);
        jn7.f(this.a).b(this, jn7.B5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.e().n(this, jn7.r2);
        jn7.f(this.a).n(this, jn7.B5);
        st4.f0.clear();
        st4.g0.evictAll();
        int i = 0;
        while (true) {
            ArrayList arrayList = st4.d0;
            if (i < arrayList.size()) {
                ((uo3) arrayList.get(i)).cleanupQueue();
                ((uo3) arrayList.get(i)).recycle();
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
        int currentActionBarHeight = a.getCurrentActionBarHeight() + hl.m;
        gu guVar = this.d;
        guVar.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = hl.L(6.0f);
        int currentActionBarHeight2 = a.getCurrentActionBarHeight() + hl.m;
        int L3 = hl.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (hl.n > 0) {
                i3 = 0;
            } else {
                i3 = 10;
            }
            L = hl.L(i3 + 114);
        }
        guVar.setPadding(L2, currentActionBarHeight2, L3, L + hl.n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-hl.n);
        }
        if (linearLayout != null) {
            int L4 = hl.L(10.0f);
            int L5 = hl.L(10.0f);
            int L6 = hl.L(10.0f);
            if (hl.n > 0) {
                f2 = 0.0f;
            } else {
                f2 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, hl.L(f2) + hl.n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = a.getCurrentActionBarHeight() + hl.m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = hl.n;
        int i4 = hl.m;
        int L7 = hl.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i4, L7, 0);
        if (!hl.O1()) {
            Point point = hl.q;
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
            hl.V3(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(icc iccVar) {
        this.a0 = iccVar;
    }

    public void setOnSelectMultipleListener(kcc kccVar) {
        this.b0 = kccVar;
    }

    public void a() {
    }

    public void c(boolean z) {
    }
}
