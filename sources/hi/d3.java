package hi;

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
import org.telegram.messenger.ff;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.messenger.t10;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.qj0;
public abstract class d3 extends FrameLayout implements gs {
    public static final ve f14486k0 = new ve(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final u2 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final ImageView I;
    public final LinearLayout J;
    public final e K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final org.telegram.ui.Components.d6 T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int f14487a;
    public r10 f14488a0;
    public final org.telegram.ui.ActionBar.h6 f14489b;
    public t10 f14490b0;
    public final Paint f14491c;
    public final ArrayList f14492c0;
    public final di.b1 d;
    public boolean f14493d0;
    public final gi.g f14494e;
    public boolean f14495e0;
    public final x2 f14496f;
    public ve f14497f0;
    public ArrayList f14498g0;
    public final FrameLayout h;
    public ArrayList f14499h0;
    public final ArrayList f14500i0;
    public bi.t2 f14501j0;
    public final ek0 f14502n;
    public final v2 f14503r;
    public final nv0 f14504s;
    public final o3 f14505w;
    public boolean f14506x;
    public final org.telegram.ui.ActionBar.k f14507y;

    public d3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, ve veVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        float f11;
        Paint paint = new Paint(1);
        this.f14491c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.d6(this, 0L, 350L, nr.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.f14492c0 = arrayList;
        this.f14500i0 = new ArrayList();
        this.P = f10;
        this.f14487a = i7;
        this.f14489b = h6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), 134217728);
        di.b1 b1Var = new di.b1(this, context, h6Var, 3);
        this.d = b1Var;
        b1Var.setItemSelectorColorProvider(new g0.e(28));
        x2 x2Var = new x2(this);
        this.f14496f = x2Var;
        b1Var.setAdapter(x2Var);
        gi.g gVar = new gi.g(1, this);
        this.f14494e = gVar;
        b1Var.setLayoutManager(gVar);
        b1Var.setFastScrollEnabled(1);
        b1Var.setFastScrollVisible(true);
        b1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new bi.w2(this, 7);
        b1Var.i(new fi.k(2));
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.ma.e(-1, -1, 119));
        b1Var.setOnItemClickListener(new qj0(this) {
            public final d3 f15200b;

            {
                this.f15200b = this;
            }

            @Override
            public final void c(int i10, View view) {
                r10 r10Var;
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f15200b;
                        ArrayList arrayList2 = d3Var.f14492c0;
                        ArrayList arrayList3 = d3Var.f14500i0;
                        if (i10 >= 2 && d3Var.f14488a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (d3Var.f14493d0) {
                                if (i11 == 0) {
                                    d3Var.e(d3.f14486k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (d3Var.f14495e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    c7 c7Var = (c7) arrayList2.get(i11);
                                    r10 r10Var2 = d3Var.f14488a0;
                                    if (c7Var.K) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    r10Var2.a(c7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < d3Var.f14498g0.size()) {
                                ff ffVar = (ff) d3Var.f14498g0.get(i11);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    r10 r10Var3 = d3Var.f14488a0;
                                    if (ffVar.f28059b && !ffVar.d()) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    r10Var3.a(ffVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(ffVar)) {
                                    arrayList3.remove(ffVar);
                                } else if (arrayList3.size() + 1 > d3Var.S) {
                                    int i12 = -d3Var.O;
                                    d3Var.O = i12;
                                    org.telegram.messenger.g0.E3(i12, z2Var, null);
                                    org.telegram.messenger.q2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(ffVar);
                                }
                                org.telegram.messenger.g0.Z3(d3Var.d);
                                d3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = this.f15200b;
                        v2 v2Var = d3Var2.f14503r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < v2Var.f14322c.size() && (r10Var = d3Var2.f14488a0) != null) {
                            r10Var.a(v2Var.f14322c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        b1Var.setOnItemLongClickListener(new di.v6(this, 19));
        b1Var.setOnScrollListener(new t2(this, 0));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, h6Var);
        this.f14507y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(2131231240);
        kVar.F(436207615, false);
        kVar.G(-1, false);
        kVar.G(-1, true);
        addView(kVar, c8.ma.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.v1(this, 5));
        org.telegram.ui.ActionBar.y s5 = kVar.s();
        u2 u2Var = new u2(this, context, s5, h6Var, 0);
        this.G = u2Var;
        u2Var.setSubMenuOpenSide(1);
        if (org.telegram.messenger.g0.Q1()) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        kVar.addView(u2Var, 0, c8.ma.d(-2, -1.0f, 51, f11, 0.0f, 40.0f, 0.0f));
        u2Var.setOnClickListener(new View.OnClickListener(this) {
            public final d3 f15251b;

            {
                this.f15251b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15251b.G.V(null, null);
                        return;
                    case 1:
                        d3 d3Var = this.f15251b;
                        if (d3Var.J.getAlpha() >= 0.25f) {
                            d3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        d3 d3Var2 = this.f15251b;
                        if (d3Var2.J.getAlpha() >= 0.25f) {
                            d3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f15251b.f(false);
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
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getResources().getDrawable(2131231253).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.g0.f24040m, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        ek0 ek0Var = new ek0(context, h6Var);
        this.f14502n = ek0Var;
        ek0Var.setLayoutManager(new v4.t(3));
        v2 v2Var = new v2(this);
        this.f14503r = v2Var;
        ek0Var.setAdapter(v2Var);
        ek0Var.setOnScrollListener(new t2(this, 1));
        ek0Var.setClipToPadding(true);
        ek0Var.i(new fi.k(1));
        frameLayout.addView(ek0Var, c8.ma.e(-1, -1, 119));
        q2 q2Var = new q2(0, context, h6Var);
        float f12 = 10.0f;
        q2Var.setViewType(2);
        q2Var.setAlpha(0.0f);
        q2Var.setVisibility(8);
        frameLayout.addView(q2Var, c8.ma.e(-1, -1, 119));
        nv0 nv0Var = new nv0(context, q2Var, 11, h6Var);
        this.f14504s = nv0Var;
        xh.l lVar = nv0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(lVar, org.telegram.ui.ActionBar.m6.f29773y6, h6Var);
        lVar.setTypeface(null);
        lVar.setText(hd.N0(2131745564, null));
        this.f14505w = new o3(this, false, new ai.h0(this, 25));
        frameLayout.addView(nv0Var, c8.ma.e(-1, -1, 119));
        ek0Var.setEmptyView(nv0Var);
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232488);
        a10.O();
        a10.I = new s2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(hd.N0(2131745565, null));
        ek0Var.setOnItemClickListener(new qj0(this) {
            public final d3 f15200b;

            {
                this.f15200b = this;
            }

            @Override
            public final void c(int i10, View view) {
                r10 r10Var;
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f15200b;
                        ArrayList arrayList2 = d3Var.f14492c0;
                        ArrayList arrayList3 = d3Var.f14500i0;
                        if (i10 >= 2 && d3Var.f14488a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (d3Var.f14493d0) {
                                if (i11 == 0) {
                                    d3Var.e(d3.f14486k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (d3Var.f14495e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    c7 c7Var = (c7) arrayList2.get(i11);
                                    r10 r10Var2 = d3Var.f14488a0;
                                    if (c7Var.K) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    r10Var2.a(c7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < d3Var.f14498g0.size()) {
                                ff ffVar = (ff) d3Var.f14498g0.get(i11);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    r10 r10Var3 = d3Var.f14488a0;
                                    if (ffVar.f28059b && !ffVar.d()) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    r10Var3.a(ffVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(ffVar)) {
                                    arrayList3.remove(ffVar);
                                } else if (arrayList3.size() + 1 > d3Var.S) {
                                    int i12 = -d3Var.O;
                                    d3Var.O = i12;
                                    org.telegram.messenger.g0.E3(i12, z2Var, null);
                                    org.telegram.messenger.q2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(ffVar);
                                }
                                org.telegram.messenger.g0.Z3(d3Var.d);
                                d3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = this.f15200b;
                        v2 v2Var2 = d3Var2.f14503r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < v2Var2.f14322c.size() && (r10Var = d3Var2.f14488a0) != null) {
                            r10Var.a(v2Var2.f14322c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = np.u1(i7).R1().f12444w.f14283b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                c7 c7Var = (c7) obj;
                if (!c7Var.f14354g && !c7Var.f14383w) {
                    this.f14492c0.add(c7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29454h5, linearLayout, h6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.f24041n > 0 ? 0.0f : f12) + org.telegram.messenger.g0.f24041n);
            addView(linearLayout, c8.ma.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            e g10 = o10.g(24, context, h6Var, true);
            this.K = g10;
            g10.i(hd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, c8.ma.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final d3 f15251b;

                    {
                        this.f15251b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15251b.G.V(null, null);
                                return;
                            case 1:
                                d3 d3Var = this.f15251b;
                                if (d3Var.J.getAlpha() >= 0.25f) {
                                    d3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                d3 d3Var2 = this.f15251b;
                                if (d3Var2.J.getAlpha() >= 0.25f) {
                                    d3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f15251b.f(false);
                                return;
                        }
                    }
                });
            }
            e g11 = o10.g(24, context, h6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            nq nqVar = new nq(2131231942, 0);
            nqVar.f37950r = -org.telegram.messenger.g0.L(1.33f);
            nqVar.f37951s = org.telegram.messenger.g0.L(0.66f);
            spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.N0(2131744536, null));
            g11.i(spannableStringBuilder, false, true);
            linearLayout.addView(g11, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final d3 f15251b;

                {
                    this.f15251b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f15251b.G.V(null, null);
                            return;
                        case 1:
                            d3 d3Var = this.f15251b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            d3 d3Var2 = this.f15251b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f15251b.f(false);
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
            imageView.setImageResource(2131231195);
            int L = org.telegram.messenger.g0.L(56.0f);
            int i11 = org.telegram.ui.ActionBar.m6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, h6Var);
            c8.ra.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final d3 f15251b;

                {
                    this.f15251b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f15251b.G.V(null, null);
                            return;
                        case 1:
                            d3 d3Var = this.f15251b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            d3 d3Var2 = this.f15251b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f15251b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        ve veVar2 = f14486k0;
        if (veVar != null && (veVar != veVar2 || this.f14492c0.size() > 0)) {
            this.f14497f0 = veVar;
        } else {
            ArrayList arrayList3 = this.f14499h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f14497f0 = (ve) this.f14499h0.get(0);
            } else {
                this.f14497f0 = MediaController.f22717a2;
            }
        }
        this.f14498g0 = b(this.f14497f0);
        i();
        ve veVar3 = this.f14497f0;
        if (veVar3 == MediaController.f22717a2) {
            this.E.setText(hd.N0(2131752226, null));
        } else if (veVar3 == veVar2) {
            this.E.setText(hd.N0(2131744436, null));
        } else {
            this.E.setText(veVar3.f27356c);
        }
    }

    public static Bitmap d(z2 z2Var) {
        Bitmap bitmap;
        if (z2Var != null && (bitmap = z2Var.f15837a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(ve veVar) {
        if (veVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = veVar.f27357e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ff ffVar = (ff) arrayList.get(i7);
            if (!this.M || !ffVar.f28059b) {
                arrayList2.add(ffVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.f25374r2;
        x2 x2Var = this.f14496f;
        int i12 = 0;
        if (i7 == i11) {
            h();
            if (this.f14497f0 != null) {
                while (true) {
                    if (i12 >= MediaController.f22719c2.size()) {
                        break;
                    }
                    ve veVar = (ve) MediaController.f22719c2.get(i12);
                    int i13 = veVar.f27354a;
                    ve veVar2 = this.f14497f0;
                    if (i13 == veVar2.f27354a && veVar.f27355b == veVar2.f27355b) {
                        this.f14497f0 = veVar;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f14499h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f14497f0 = (ve) this.f14499h0.get(0);
                } else {
                    this.f14497f0 = MediaController.f22717a2;
                }
            }
            this.f14498g0 = b(this.f14497f0);
            this.f14500i0.clear();
            i();
            if (x2Var != null) {
                x2Var.f();
            }
        } else if (i7 == ls.B5) {
            ArrayList arrayList2 = this.f14492c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = np.u1(this.f14487a).R1().f12444w.f14283b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    c7 c7Var = (c7) obj;
                    if (!c7Var.f14354g && !c7Var.f14383w) {
                        arrayList2.add(c7Var);
                    }
                }
            }
            h();
            i();
            if (x2Var != null) {
                x2Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float g10 = g();
        int i7 = 0;
        if (g10 <= i5.c.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z10 != this.f14506x) {
            this.f14506x = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f14506x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f14507y;
        if (kVar != null) {
            kVar.setAlpha(d);
            if (d <= 0.0f) {
                i7 = 8;
            }
            if (kVar.getVisibility() != i7) {
                kVar.setVisibility(i7);
            }
        }
        bi.t2 t2Var = this.f14501j0;
        if (t2Var != null) {
            t2Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f14491c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(ve veVar, boolean z10) {
        this.f14497f0 = veVar;
        this.f14498g0 = b(veVar);
        this.f14500i0.clear();
        i();
        ve veVar2 = this.f14497f0;
        ve veVar3 = MediaController.f22717a2;
        TextView textView = this.E;
        if (veVar2 == veVar3) {
            textView.setText(hd.N0(2131752226, null));
        } else if (veVar2 == f14486k0) {
            textView.setText(hd.N0(2131744436, null));
        } else {
            textView.setText(veVar2.f27356c);
        }
        this.f14496f.f();
        gi.g gVar = this.f14494e;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2);
            lVar.f59109a = 1;
            lVar.f55744p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            gVar.w0(lVar);
            return;
        }
        gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        z2 z2Var;
        if (this.f14490b0 != null) {
            ArrayList arrayList = this.f14500i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.f14488a0.a((ff) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    di.b1 b1Var = this.d;
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ff ffVar = (ff) obj;
                        if (ffVar.f28059b && !ffVar.d()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < b1Var.getChildCount()) {
                                    View childAt = b1Var.getChildAt(i10);
                                    if (childAt instanceof z2) {
                                        z2Var = (z2) childAt;
                                        if (z2Var.T == ffVar) {
                                            break;
                                        }
                                    }
                                    i10++;
                                } else {
                                    z2Var = null;
                                    break;
                                }
                            }
                            bitmap = d(z2Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f14490b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        org.telegram.messenger.g0.Z3(b1Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        di.b1 b1Var = this.d;
        if (b1Var != null && b1Var.getChildCount() > 0) {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < b1Var.getChildCount(); i10++) {
                View childAt = b1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i7 = Math.min(i7, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i7, getHeight()));
        } else {
            padding = getPadding();
        }
        if (b1Var == null) {
            return padding;
        }
        return org.telegram.messenger.g0.W1(b1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.f24046q.y * 0.35f);
    }

    public ve getSelectedAlbum() {
        return this.f14497f0;
    }

    public String getTitle() {
        int i7;
        if (this.M) {
            i7 = 2131754425;
        } else {
            i7 = 2131752109;
        }
        return hd.N0(i7, null);
    }

    public final void h() {
        a aVar;
        u2 u2Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.f29902b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.f22719c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f14499h0 = arrayList2;
        Collections.sort(arrayList2, new di.s4(arrayList, 2));
        ArrayList arrayList3 = this.f14492c0;
        boolean isEmpty = arrayList3.isEmpty();
        ve veVar = f14486k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f14499h0;
            arrayList4.add(!arrayList4.isEmpty(), veVar);
        }
        boolean isEmpty2 = this.f14499h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.f14499h0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ve veVar2 = (ve) this.f14499h0.get(i7);
            if (veVar2 == veVar) {
                aVar = new a(getContext(), veVar2.d, hd.O0("StoryDraftsAlbum"), arrayList3.size(), this.f14489b);
            } else {
                ArrayList b10 = b(veVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), veVar2.d, veVar2.f27356c, b10.size(), this.f14489b);
                }
            }
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.y2(21, this, veVar2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f14499h0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f14499h0.get(0) == this.f14497f0 && this.f14492c0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14493d0 = z10;
        if (z10 || (this.f14497f0 != f14486k0 && ((arrayList = this.f14499h0) == null || arrayList.isEmpty() || this.f14499h0.get(0) != this.f14497f0))) {
            z11 = false;
        }
        this.f14495e0 = z11;
    }

    public final void j() {
        float f10;
        float f11;
        int L;
        ArrayList arrayList = this.f14500i0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z10 = !isEmpty;
        float f12 = 0.0f;
        float f13 = 1.0f;
        ImageView imageView = this.I;
        if (imageView != null) {
            ViewPropertyAnimator animate = imageView.animate();
            if (!isEmpty) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            float f14 = 0.7f;
            if (!isEmpty) {
                f11 = 1.0f;
            } else {
                f11 = 0.7f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f11);
            if (!isEmpty) {
                f14 = 1.0f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f14);
            if (!isEmpty) {
                L = -org.telegram.messenger.g0.f24041n;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            o10.o(scaleY.translationY(L), nr.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            e eVar = this.K;
            if (eVar != null) {
                eVar.i(hd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f24041n > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.g0.L(f15) + org.telegram.messenger.g0.f24041n);
            if (this.U != z10) {
                this.U = z10;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f13);
                if (isEmpty) {
                    f12 = org.telegram.messenger.g0.L(32.0f);
                }
                alpha2.translationY(f12).setInterpolator(nr.h).setDuration(320L).setListener(new bi.g7(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        ls.e().c(this, ls.f25374r2);
        ls.f(this.f14487a).c(this, ls.B5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ls.e().n(this, ls.f25374r2);
        ls.f(this.f14487a).n(this, ls.B5);
        z2.f15835f0.clear();
        z2.f15836g0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = z2.f15833d0;
            if (i7 < arrayList.size()) {
                ((org.telegram.messenger.r5) arrayList.get(i7)).cleanupQueue();
                ((org.telegram.messenger.r5) arrayList.get(i7)).recycle();
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int L;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m;
        di.b1 b1Var = this.d;
        b1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.g0.f24041n > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            L = org.telegram.messenger.g0.L(i11 + 114);
        }
        b1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.f24041n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.f24041n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.g0.L(10.0f);
            int L5 = org.telegram.messenger.g0.L(10.0f);
            int L6 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f24041n > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.f24041n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24040m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.f24041n;
        int i12 = org.telegram.messenger.g0.f24040m;
        int L7 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i12, L7, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24046q;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i7, i10);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i7, i10);
    }

    public void setMaxCount(int i7) {
        this.S = i7;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            org.telegram.messenger.g0.Z3(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(r10 r10Var) {
        this.f14488a0 = r10Var;
    }

    public void setOnSelectMultipleListener(t10 t10Var) {
        this.f14490b0 = t10Var;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
