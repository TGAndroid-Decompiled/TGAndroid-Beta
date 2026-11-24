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
public abstract class sr4 extends FrameLayout implements gk7 {
    public static final xl6 k0 = new xl6(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final w42 G;
    public final r7 H;
    public final ImageView I;
    public final LinearLayout J;
    public final u41 K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final lm T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int a;
    public i8c a0;
    public final f53 b;
    public k8c b0;
    public final Paint c;
    public final ArrayList c0;
    public final fu d;
    public boolean d0;
    public final ar0 e;
    public boolean e0;
    public final mr4 f;
    public xl6 f0;
    public ArrayList g0;
    public final FrameLayout h;
    public ArrayList h0;
    public final ArrayList i0;
    public a6 j0;
    public final o39 n;
    public final kr4 r;
    public final zya s;
    public final mv5 w;
    public boolean x;
    public final a y;

    public sr4(int i, Context context, f53 f53Var, xl6 xl6Var, boolean z, float f, boolean z2, boolean z3) {
        super(context);
        float f2;
        xl6 xl6Var2;
        Paint paint = new Paint(1);
        this.c = paint;
        this.O = -2;
        this.T = new lm(this, 0L, 350L, s33.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.c0 = arrayList;
        this.i0 = new ArrayList();
        this.P = f;
        this.a = i;
        this.b = f53Var;
        this.M = z;
        this.N = z2;
        this.Q = z3;
        paint.setColor(-14737633);
        paint.setShadowLayer(gl.L(2.33f), 0.0f, gl.L(-0.4f), 134217728);
        fu fuVar = new fu(this, context, f53Var, (byte) 22);
        this.d = fuVar;
        fuVar.setItemSelectorColorProvider(new wn4((byte) 4));
        mr4 mr4Var = new mr4(this);
        this.f = mr4Var;
        fuVar.setAdapter(mr4Var);
        ar0 ar0Var = new ar0(this, (byte) 3);
        this.e = ar0Var;
        fuVar.setLayoutManager(ar0Var);
        fuVar.setFastScrollEnabled(1);
        fuVar.setFastScrollVisible(true);
        fuVar.getFastScroll().setAlpha(0.0f);
        ar0Var.O = new nq1(this, (byte) 6);
        fuVar.i(new oq1((byte) 6));
        fuVar.setClipToPadding(false);
        addView(fuVar, nme.e(-1, -1, 119));
        fuVar.setOnItemClickListener(new c39(this) {
            public final sr4 b;

            {
                this.b = this;
            }

            @Override
            public final void d(int i2, View view) {
                i8c i8cVar;
                byte b = r2;
                Bitmap bitmap = null;
                sr4 sr4Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = sr4Var.i0;
                        ArrayList arrayList3 = sr4Var.c0;
                        if (i2 >= 2 && sr4Var.a0 != null && (view instanceof or4)) {
                            or4 or4Var = (or4) view;
                            int i3 = i2 - 2;
                            if (sr4Var.d0) {
                                if (i3 == 0) {
                                    sr4Var.e(sr4.k0, true);
                                    return;
                                }
                                i3 = i2 - 3;
                            } else if (sr4Var.e0) {
                                if (i3 >= 0 && i3 < arrayList3.size()) {
                                    f4b f4bVar = (f4b) arrayList3.get(i3);
                                    i8c i8cVar2 = sr4Var.a0;
                                    if (f4bVar.K) {
                                        bitmap = sr4.d(or4Var);
                                    }
                                    i8cVar2.a(f4bVar, bitmap);
                                    return;
                                }
                                i3 -= arrayList3.size();
                            }
                            if (i3 >= 0 && i3 < sr4Var.g0.size()) {
                                jm6 jm6Var = (jm6) sr4Var.g0.get(i3);
                                if (arrayList2.isEmpty() && !sr4Var.R) {
                                    i8c i8cVar3 = sr4Var.a0;
                                    if (jm6Var.b && !jm6Var.d()) {
                                        bitmap = sr4.d(or4Var);
                                    }
                                    i8cVar3.a(jm6Var, bitmap);
                                    return;
                                }
                                if (arrayList2.contains(jm6Var)) {
                                    arrayList2.remove(jm6Var);
                                } else if (arrayList2.size() + 1 > sr4Var.S) {
                                    int i4 = -sr4Var.O;
                                    sr4Var.O = i4;
                                    gl.B3(i4, or4Var, null);
                                    pw0.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList2.add(jm6Var);
                                }
                                gl.W3(sr4Var.d);
                                sr4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        kr4 kr4Var = sr4Var.r;
                        r7 r7Var = sr4Var.H;
                        if (r7Var != null) {
                            gl.t1(r7Var.getSearchContainer());
                        }
                        if (i2 >= 0 && i2 < kr4Var.c.size() && (i8cVar = sr4Var.a0) != null) {
                            i8cVar.a(kr4Var.c.get(i2), null);
                            return;
                        }
                        return;
                }
            }
        });
        fuVar.setOnItemLongClickListener(new kx3(this, (byte) 22));
        fuVar.setOnScrollListener(new jr4(this, (byte) 0));
        a aVar = new a(context, f53Var);
        this.y = aVar;
        aVar.setBackgroundColor(-14737633);
        aVar.setTitleColor(-1);
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        aVar.setBackButtonImage(2131231243);
        aVar.G(436207615, false);
        aVar.H(-1, false);
        aVar.H(-1, true);
        addView(aVar, nme.e(-1, -2, 55));
        aVar.setActionBarMenuOnItemClick(new vm2(this, (byte) 18));
        r6 t = aVar.t();
        w42 w42Var = new w42(this, context, t, f53Var, (byte) 2);
        this.G = w42Var;
        w42Var.setSubMenuOpenSide(1);
        if (gl.O1()) {
            f2 = 64.0f;
        } else {
            f2 = 56.0f;
        }
        aVar.addView(w42Var, 0, nme.d(-2, -1.0f, 51, f2, 0.0f, 40.0f, 0.0f));
        w42Var.setOnClickListener(new View.OnClickListener(this) {
            public final sr4 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                sr4 sr4Var = this.b;
                switch (b) {
                    case 0:
                        sr4Var.G.U(null, null);
                        return;
                    case 1:
                        if (sr4Var.J.getAlpha() >= 0.25f) {
                            sr4Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        if (sr4Var.J.getAlpha() >= 0.25f) {
                            sr4Var.f(true);
                            return;
                        }
                        return;
                    default:
                        sr4Var.f(false);
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
        textView.setTypeface(gl.o());
        Drawable mutate = context.getResources().getDrawable(2131231256).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(gl.L(4.0f));
        textView.setPadding(0, gl.m, gl.L(10.0f), 0);
        w42Var.addView(textView, nme.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, nme.e(-1, -1, 119));
        o39 o39Var = new o39(context, f53Var);
        this.n = o39Var;
        o39Var.setLayoutManager(new r35(3));
        kr4 kr4Var = new kr4(this);
        this.r = kr4Var;
        o39Var.setAdapter(kr4Var);
        o39Var.setOnScrollListener(new jr4(this, (byte) 1));
        o39Var.setClipToPadding(true);
        float f3 = 10.0f;
        o39Var.i(new oq1((byte) 5));
        frameLayout.addView(o39Var, nme.e(-1, -1, 119));
        xk2 xk2Var = new xk2(context, f53Var, (byte) 1);
        xk2Var.setViewType(2);
        xk2Var.setAlpha(0.0f);
        xk2Var.setVisibility(8);
        frameLayout.addView(xk2Var, nme.e(-1, -1, 119));
        zya zyaVar = new zya(context, xk2Var, 11, f53Var);
        this.s = zyaVar;
        wla wlaVar = zyaVar.d;
        wlaVar.setTextSize(1, 16.0f);
        zkb.X(wlaVar, bkb.x6, f53Var);
        wlaVar.setTypeface(null);
        wlaVar.setText(k96.M0(2131745568, null));
        this.w = new mv5(this, false, new hj3(this, (byte) 10));
        frameLayout.addView(zyaVar, nme.e(-1, -1, 119));
        o39Var.setEmptyView(zyaVar);
        r7 a = t.a(0, 2131232491);
        a.N();
        a.I = new cm0(this);
        this.H = a;
        a.setVisibility(8);
        a.setSearchFieldHint(k96.M0(2131745569, null));
        o39Var.setOnItemClickListener(new c39(this) {
            public final sr4 b;

            {
                this.b = this;
            }

            @Override
            public final void d(int i2, View view) {
                i8c i8cVar;
                byte b = r2;
                Bitmap bitmap = null;
                sr4 sr4Var = this.b;
                switch (b) {
                    case 0:
                        ArrayList arrayList2 = sr4Var.i0;
                        ArrayList arrayList3 = sr4Var.c0;
                        if (i2 >= 2 && sr4Var.a0 != null && (view instanceof or4)) {
                            or4 or4Var = (or4) view;
                            int i3 = i2 - 2;
                            if (sr4Var.d0) {
                                if (i3 == 0) {
                                    sr4Var.e(sr4.k0, true);
                                    return;
                                }
                                i3 = i2 - 3;
                            } else if (sr4Var.e0) {
                                if (i3 >= 0 && i3 < arrayList3.size()) {
                                    f4b f4bVar = (f4b) arrayList3.get(i3);
                                    i8c i8cVar2 = sr4Var.a0;
                                    if (f4bVar.K) {
                                        bitmap = sr4.d(or4Var);
                                    }
                                    i8cVar2.a(f4bVar, bitmap);
                                    return;
                                }
                                i3 -= arrayList3.size();
                            }
                            if (i3 >= 0 && i3 < sr4Var.g0.size()) {
                                jm6 jm6Var = (jm6) sr4Var.g0.get(i3);
                                if (arrayList2.isEmpty() && !sr4Var.R) {
                                    i8c i8cVar3 = sr4Var.a0;
                                    if (jm6Var.b && !jm6Var.d()) {
                                        bitmap = sr4.d(or4Var);
                                    }
                                    i8cVar3.a(jm6Var, bitmap);
                                    return;
                                }
                                if (arrayList2.contains(jm6Var)) {
                                    arrayList2.remove(jm6Var);
                                } else if (arrayList2.size() + 1 > sr4Var.S) {
                                    int i4 = -sr4Var.O;
                                    sr4Var.O = i4;
                                    gl.B3(i4, or4Var, null);
                                    pw0.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList2.add(jm6Var);
                                }
                                gl.W3(sr4Var.d);
                                sr4Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        kr4 kr4Var2 = sr4Var.r;
                        r7 r7Var = sr4Var.H;
                        if (r7Var != null) {
                            gl.t1(r7Var.getSearchContainer());
                        }
                        if (i2 >= 0 && i2 < kr4Var2.c.size() && (i8cVar = sr4Var.a0) != null) {
                            i8cVar.a(kr4Var2.c.get(i2), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z) {
            ArrayList arrayList2 = na7.q1(i).M1().w.b;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                f4b f4bVar = (f4b) obj;
                if (!f4bVar.g && !f4bVar.w) {
                    this.c0.add(f4bVar);
                }
            }
        }
        if (z2) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            zkb.h(bkb.g5, f53Var, linearLayout);
            linearLayout.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(gl.n > 0 ? 0.0f : f3) + gl.n);
            addView(linearLayout, nme.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(gl.L(32.0f));
            linearLayout.setVisibility(8);
            u41 u41Var = new u41(f53Var, context, true);
            u41Var.setRoundRadius(24);
            this.K = u41Var;
            u41Var.i(k96.H(',', "StoriesCreate", 1), false, true);
            if (!z3) {
                linearLayout.addView(u41Var, nme.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                u41Var.setOnClickListener(new View.OnClickListener(this) {
                    public final sr4 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        sr4 sr4Var = this.b;
                        switch (b) {
                            case 0:
                                sr4Var.G.U(null, null);
                                return;
                            case 1:
                                if (sr4Var.J.getAlpha() >= 0.25f) {
                                    sr4Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                if (sr4Var.J.getAlpha() >= 0.25f) {
                                    sr4Var.f(true);
                                    return;
                                }
                                return;
                            default:
                                sr4Var.f(false);
                                return;
                        }
                    }
                });
            }
            u41 u41Var2 = new u41(f53Var, context, z3);
            u41Var2.setRoundRadius(24);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            cm2 cm2Var = new cm2(2131231945, 0);
            cm2Var.r = -gl.L(1.33f);
            cm2Var.s = gl.L(0.66f);
            spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) k96.M0(2131744542, null));
            u41Var2.i(spannableStringBuilder, false, true);
            linearLayout.addView(u41Var2, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            u41Var2.setOnClickListener(new View.OnClickListener(this) {
                public final sr4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    sr4 sr4Var = this.b;
                    switch (b) {
                        case 0:
                            sr4Var.G.U(null, null);
                            return;
                        case 1:
                            if (sr4Var.J.getAlpha() >= 0.25f) {
                                sr4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            if (sr4Var.J.getAlpha() >= 0.25f) {
                                sr4Var.f(true);
                                return;
                            }
                            return;
                        default:
                            sr4Var.f(false);
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
            int L = gl.L(56.0f);
            int i3 = bkb.Ei;
            ShapeDrawable K = bkb.K(L, bkb.v0(i3, f53Var));
            vkb M = zkb.M(i3);
            imageView.setBackground(K);
            zkb.j(imageView, K, M, null, f53Var);
            ote.b(imageView, 0.1f, 1.5f);
            addView(imageView, nme.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final sr4 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    sr4 sr4Var = this.b;
                    switch (b) {
                        case 0:
                            sr4Var.G.U(null, null);
                            return;
                        case 1:
                            if (sr4Var.J.getAlpha() >= 0.25f) {
                                sr4Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            if (sr4Var.J.getAlpha() >= 0.25f) {
                                sr4Var.f(true);
                                return;
                            }
                            return;
                        default:
                            sr4Var.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        xl6 xl6Var3 = k0;
        if (xl6Var != null && (xl6Var != xl6Var3 || this.c0.size() > 0)) {
            this.f0 = xl6Var;
            xl6Var2 = xl6Var;
        } else {
            ArrayList arrayList3 = this.h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                xl6Var2 = (xl6) this.h0.get(0);
                this.f0 = xl6Var2;
            } else {
                xl6Var2 = MediaController.a2;
                this.f0 = xl6Var2;
            }
        }
        this.g0 = b(xl6Var2);
        i();
        xl6 xl6Var4 = this.f0;
        xl6 xl6Var5 = MediaController.a2;
        TextView textView2 = this.E;
        if (xl6Var4 == xl6Var5) {
            textView2.setText(k96.M0(2131752226, null));
        } else if (xl6Var4 == xl6Var3) {
            textView2.setText(k96.M0(2131744439, null));
        } else {
            textView2.setText(xl6Var4.c);
        }
    }

    public static Bitmap d(or4 or4Var) {
        Bitmap bitmap;
        if (or4Var != null && (bitmap = or4Var.a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(xl6 xl6Var) {
        if (xl6Var == null) {
            return new ArrayList();
        }
        ArrayList arrayList = xl6Var.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            jm6 jm6Var = (jm6) arrayList.get(i);
            if (!this.M || !jm6Var.b) {
                arrayList2.add(jm6Var);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.q2;
        mr4 mr4Var = this.f;
        int i4 = 0;
        if (i == i3) {
            h();
            if (this.f0 != null) {
                while (true) {
                    if (i4 >= MediaController.c2.size()) {
                        break;
                    }
                    xl6 xl6Var = (xl6) MediaController.c2.get(i4);
                    int i5 = xl6Var.a;
                    xl6 xl6Var2 = this.f0;
                    if (i5 == xl6Var2.a && xl6Var.b == xl6Var2.b) {
                        this.f0 = xl6Var;
                        break;
                    }
                    i4++;
                }
            } else {
                ArrayList arrayList = this.h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f0 = (xl6) this.h0.get(0);
                } else {
                    this.f0 = MediaController.a2;
                }
            }
            this.g0 = b(this.f0);
            this.i0.clear();
            i();
            if (mr4Var != null) {
                mr4Var.f();
            }
        } else if (i == kk7.A5) {
            ArrayList arrayList2 = this.c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = na7.q1(this.a).M1().w.b;
                int size = arrayList3.size();
                while (i4 < size) {
                    Object obj = arrayList3.get(i4);
                    i4++;
                    f4b f4bVar = (f4b) obj;
                    if (!f4bVar.g && !f4bVar.w) {
                        arrayList2.add(f4bVar);
                    }
                }
            }
            h();
            i();
            if (mr4Var != null) {
                mr4Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z;
        float f;
        float g = g();
        int i = 0;
        if (g <= b00.c(32.0f, a.getCurrentActionBarHeight() + gl.m, 0)) {
            z = true;
        } else {
            z = false;
        }
        float d = this.T.d(z);
        float R1 = gl.R1(g, 0.0f, d);
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
        RectF rectF = gl.P;
        rectF.set(0.0f, R1, getWidth(), gl.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, gl.L(14.0f), gl.L(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, R1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(xl6 xl6Var, boolean z) {
        this.f0 = xl6Var;
        this.g0 = b(xl6Var);
        this.i0.clear();
        i();
        xl6 xl6Var2 = this.f0;
        xl6 xl6Var3 = MediaController.a2;
        TextView textView = this.E;
        if (xl6Var2 == xl6Var3) {
            textView.setText(k96.M0(2131752226, null));
        } else if (xl6Var2 == k0) {
            textView.setText(k96.M0(2131744439, null));
        } else {
            textView.setText(xl6Var2.c);
        }
        this.f.f();
        ar0 ar0Var = this.e;
        if (z) {
            v26 v26Var = new v26(getContext(), 2);
            v26Var.a = 1;
            v26Var.p = gl.L(16.0f) + (-a.getCurrentActionBarHeight());
            ar0Var.v0(v26Var);
            return;
        }
        ar0Var.g1(1, gl.L(16.0f) + (-a.getCurrentActionBarHeight()));
    }

    public final void f(boolean z) {
        Bitmap bitmap;
        or4 or4Var;
        if (this.b0 != null) {
            ArrayList arrayList = this.i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.a0.a((jm6) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    fu fuVar = this.d;
                    if (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        jm6 jm6Var = (jm6) obj;
                        if (jm6Var.b && !jm6Var.d()) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < fuVar.getChildCount()) {
                                    View childAt = fuVar.getChildAt(i2);
                                    if (childAt instanceof or4) {
                                        or4Var = (or4) childAt;
                                        if (or4Var.T == jm6Var) {
                                            break;
                                        }
                                    }
                                    i2++;
                                } else {
                                    or4Var = null;
                                    break;
                                }
                            }
                            bitmap = d(or4Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.b0.a(Boolean.valueOf(z), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        gl.W3(fuVar);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        fu fuVar = this.d;
        if (fuVar != null && fuVar.getChildCount() > 0) {
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < fuVar.getChildCount(); i2++) {
                View childAt = fuVar.getChildAt(i2);
                if (RecyclerView.R(childAt) > 0) {
                    i = Math.min(i, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i, getHeight()));
        } else {
            padding = getPadding();
        }
        if (fuVar == null) {
            return padding;
        }
        return gl.U1(fuVar.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (gl.q.y * 0.35f);
    }

    public xl6 getSelectedAlbum() {
        return this.f0;
    }

    public String getTitle() {
        int i;
        if (this.M) {
            i = 2131754425;
        } else {
            i = 2131752109;
        }
        return k96.M0(i, null);
    }

    public final void h() {
        kc kcVar;
        w42 w42Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w42Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.h0 = arrayList2;
        Collections.sort(arrayList2, new m42(arrayList, (byte) 1));
        ArrayList arrayList3 = this.c0;
        boolean isEmpty = arrayList3.isEmpty();
        xl6 xl6Var = k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.h0;
            arrayList4.add(!arrayList4.isEmpty(), xl6Var);
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
            xl6 xl6Var2 = (xl6) this.h0.get(i);
            f53 f53Var = this.b;
            if (xl6Var2 == xl6Var) {
                kcVar = new kc(getContext(), xl6Var2.d, k96.N0("StoryDraftsAlbum"), arrayList3.size(), f53Var);
            } else {
                ArrayList b = b(xl6Var2);
                if (!b.isEmpty()) {
                    kcVar = new kc(getContext(), xl6Var2.d, xl6Var2.c, b.size(), f53Var);
                }
            }
            w42Var.getPopupLayout().addView(kcVar);
            kcVar.setOnClickListener(new xf3(this, xl6Var2, (byte) 15));
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
                L = -gl.n;
            } else {
                L = gl.L(8.0f);
            }
            ug8.t(scaleY.translationY(L), s33.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            u41 u41Var = this.K;
            if (u41Var != null) {
                u41Var.i(k96.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f6 = 10.0f;
            int L2 = gl.L(10.0f);
            int L3 = gl.L(10.0f);
            int L4 = gl.L(10.0f);
            if (gl.n > 0) {
                f6 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, gl.L(f6) + gl.n);
            if (this.U != z) {
                this.U = z;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f4 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f4);
                if (isEmpty) {
                    f3 = gl.L(32.0f);
                }
                alpha2.translationY(f3).setInterpolator(s33.h).setDuration(320L).setListener(new id4((byte) 3, this, z)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        kk7.e().b(this, kk7.q2);
        kk7.f(this.a).b(this, kk7.A5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.e().n(this, kk7.q2);
        kk7.f(this.a).n(this, kk7.A5);
        or4.f0.clear();
        or4.g0.evictAll();
        int i = 0;
        while (true) {
            ArrayList arrayList = or4.d0;
            if (i < arrayList.size()) {
                ((do3) arrayList.get(i)).cleanupQueue();
                ((do3) arrayList.get(i)).recycle();
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
        int currentActionBarHeight = a.getCurrentActionBarHeight() + gl.m;
        fu fuVar = this.d;
        fuVar.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = gl.L(6.0f);
        int currentActionBarHeight2 = a.getCurrentActionBarHeight() + gl.m;
        int L3 = gl.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (gl.n > 0) {
                i3 = 0;
            } else {
                i3 = 10;
            }
            L = gl.L(i3 + 114);
        }
        fuVar.setPadding(L2, currentActionBarHeight2, L3, L + gl.n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-gl.n);
        }
        if (linearLayout != null) {
            int L4 = gl.L(10.0f);
            int L5 = gl.L(10.0f);
            int L6 = gl.L(10.0f);
            if (gl.n > 0) {
                f2 = 0.0f;
            } else {
                f2 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, gl.L(f2) + gl.n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = a.getCurrentActionBarHeight() + gl.m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = gl.n;
        int i4 = gl.m;
        int L7 = gl.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i4, L7, 0);
        if (!gl.O1()) {
            Point point = gl.q;
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
            gl.W3(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(i8c i8cVar) {
        this.a0 = i8cVar;
    }

    public void setOnSelectMultipleListener(k8c k8cVar) {
        this.b0 = k8cVar;
    }

    public void a() {
    }

    public void c(boolean z) {
    }
}
