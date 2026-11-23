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
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.qj0;
public abstract class m3 extends FrameLayout implements fs {
    public static final ue f14886k0 = new ue(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final d3 G;
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
    public final org.telegram.ui.Components.c6 T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int f14887a;
    public p10 f14888a0;
    public final org.telegram.ui.ActionBar.i6 f14889b;
    public r10 f14890b0;
    public final Paint f14891c;
    public final ArrayList f14892c0;
    public final di.b1 d;
    public boolean f14893d0;
    public final gi.g f14894e;
    public boolean f14895e0;
    public final g3 f14896f;
    public ue f14897f0;
    public ArrayList f14898g0;
    public final FrameLayout h;
    public ArrayList f14899h0;
    public final ArrayList f14900i0;
    public bi.v2 f14901j0;
    public final ek0 f14902n;
    public final e3 f14903r;
    public final mv0 f14904s;
    public final x3 f14905w;
    public boolean f14906x;
    public final org.telegram.ui.ActionBar.k f14907y;

    public m3(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, ue ueVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        float f11;
        Paint paint = new Paint(1);
        this.f14891c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.c6(this, 0L, 350L, kr.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.f14892c0 = arrayList;
        this.f14900i0 = new ArrayList();
        this.P = f10;
        this.f14887a = i7;
        this.f14889b = i6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), 134217728);
        di.b1 b1Var = new di.b1(this, context, i6Var, 3);
        this.d = b1Var;
        b1Var.setItemSelectorColorProvider(new g0.f(28));
        g3 g3Var = new g3(this);
        this.f14896f = g3Var;
        b1Var.setAdapter(g3Var);
        gi.g gVar = new gi.g(1, this);
        this.f14894e = gVar;
        b1Var.setLayoutManager(gVar);
        b1Var.setFastScrollEnabled(1);
        b1Var.setFastScrollVisible(true);
        b1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new bi.y2(this, 7);
        b1Var.i(new fi.k(2));
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.na.e(-1, -1, 119));
        b1Var.setOnItemClickListener(new qj0(this) {
            public final m3 f15707b;

            {
                this.f15707b = this;
            }

            @Override
            public final void b(int i10, View view) {
                p10 p10Var;
                switch (r2) {
                    case 0:
                        m3 m3Var = this.f15707b;
                        ArrayList arrayList2 = m3Var.f14892c0;
                        ArrayList arrayList3 = m3Var.f14900i0;
                        if (i10 >= 2 && m3Var.f14888a0 != null && (view instanceof i3)) {
                            i3 i3Var = (i3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (m3Var.f14893d0) {
                                if (i11 == 0) {
                                    m3Var.e(m3.f14886k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (m3Var.f14895e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    x7 x7Var = (x7) arrayList2.get(i11);
                                    p10 p10Var2 = m3Var.f14888a0;
                                    if (x7Var.K) {
                                        bitmap = m3.d(i3Var);
                                    }
                                    p10Var2.a(x7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < m3Var.f14898g0.size()) {
                                ef efVar = (ef) m3Var.f14898g0.get(i11);
                                if (arrayList3.isEmpty() && !m3Var.R) {
                                    p10 p10Var3 = m3Var.f14888a0;
                                    if (efVar.f27963b && !efVar.d()) {
                                        bitmap = m3.d(i3Var);
                                    }
                                    p10Var3.a(efVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(efVar)) {
                                    arrayList3.remove(efVar);
                                } else if (arrayList3.size() + 1 > m3Var.S) {
                                    int i12 = -m3Var.O;
                                    m3Var.O = i12;
                                    org.telegram.messenger.g0.E3(i12, i3Var, null);
                                    org.telegram.messenger.q2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(efVar);
                                }
                                org.telegram.messenger.g0.Z3(m3Var.d);
                                m3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        m3 m3Var2 = this.f15707b;
                        e3 e3Var = m3Var2.f14903r;
                        org.telegram.ui.ActionBar.q0 q0Var = m3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < e3Var.f14832c.size() && (p10Var = m3Var2.f14888a0) != null) {
                            p10Var.a(e3Var.f14832c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        b1Var.setOnItemLongClickListener(new di.v6(this, 21));
        b1Var.setOnScrollListener(new c3(this, 0));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        this.f14907y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(2131231243);
        kVar.E(436207615, false);
        kVar.F(-1, false);
        kVar.F(-1, true);
        addView(kVar, c8.na.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.w1(this, 5));
        org.telegram.ui.ActionBar.y s5 = kVar.s();
        d3 d3Var = new d3(this, context, s5, i6Var, 0);
        this.G = d3Var;
        d3Var.setSubMenuOpenSide(1);
        if (org.telegram.messenger.g0.Q1()) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        kVar.addView(d3Var, 0, c8.na.d(-2, -1.0f, 51, f11, 0.0f, 40.0f, 0.0f));
        d3Var.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f15858b;

            {
                this.f15858b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15858b.G.V(null, null);
                        return;
                    case 1:
                        m3 m3Var = this.f15858b;
                        if (m3Var.J.getAlpha() >= 0.25f) {
                            m3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        m3 m3Var2 = this.f15858b;
                        if (m3Var2.J.getAlpha() >= 0.25f) {
                            m3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f15858b.f(false);
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
        Drawable mutate = context.getResources().getDrawable(2131231256).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.g0.f24220m, org.telegram.messenger.g0.L(10.0f), 0);
        d3Var.addView(textView, c8.na.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.na.e(-1, -1, 119));
        ek0 ek0Var = new ek0(context, i6Var);
        this.f14902n = ek0Var;
        ek0Var.setLayoutManager(new v4.t(3));
        e3 e3Var = new e3(this);
        this.f14903r = e3Var;
        ek0Var.setAdapter(e3Var);
        ek0Var.setOnScrollListener(new c3(this, 1));
        ek0Var.setClipToPadding(true);
        ek0Var.i(new fi.k(1));
        frameLayout.addView(ek0Var, c8.na.e(-1, -1, 119));
        z2 z2Var = new z2(0, context, i6Var);
        float f12 = 10.0f;
        z2Var.setViewType(2);
        z2Var.setAlpha(0.0f);
        z2Var.setVisibility(8);
        frameLayout.addView(z2Var, c8.na.e(-1, -1, 119));
        mv0 mv0Var = new mv0(context, z2Var, 11, i6Var);
        this.f14904s = mv0Var;
        xh.l lVar = mv0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
        lVar.setTypeface(null);
        lVar.setText(gd.N0(2131745564, null));
        this.f14905w = new x3(this, false, new ai.d0(this, 25));
        frameLayout.addView(mv0Var, c8.na.e(-1, -1, 119));
        ek0Var.setEmptyView(mv0Var);
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232491);
        a10.O();
        a10.I = new b3(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(gd.N0(2131745565, null));
        ek0Var.setOnItemClickListener(new qj0(this) {
            public final m3 f15707b;

            {
                this.f15707b = this;
            }

            @Override
            public final void b(int i10, View view) {
                p10 p10Var;
                switch (r2) {
                    case 0:
                        m3 m3Var = this.f15707b;
                        ArrayList arrayList2 = m3Var.f14892c0;
                        ArrayList arrayList3 = m3Var.f14900i0;
                        if (i10 >= 2 && m3Var.f14888a0 != null && (view instanceof i3)) {
                            i3 i3Var = (i3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (m3Var.f14893d0) {
                                if (i11 == 0) {
                                    m3Var.e(m3.f14886k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (m3Var.f14895e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    x7 x7Var = (x7) arrayList2.get(i11);
                                    p10 p10Var2 = m3Var.f14888a0;
                                    if (x7Var.K) {
                                        bitmap = m3.d(i3Var);
                                    }
                                    p10Var2.a(x7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < m3Var.f14898g0.size()) {
                                ef efVar = (ef) m3Var.f14898g0.get(i11);
                                if (arrayList3.isEmpty() && !m3Var.R) {
                                    p10 p10Var3 = m3Var.f14888a0;
                                    if (efVar.f27963b && !efVar.d()) {
                                        bitmap = m3.d(i3Var);
                                    }
                                    p10Var3.a(efVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(efVar)) {
                                    arrayList3.remove(efVar);
                                } else if (arrayList3.size() + 1 > m3Var.S) {
                                    int i12 = -m3Var.O;
                                    m3Var.O = i12;
                                    org.telegram.messenger.g0.E3(i12, i3Var, null);
                                    org.telegram.messenger.q2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(efVar);
                                }
                                org.telegram.messenger.g0.Z3(m3Var.d);
                                m3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        m3 m3Var2 = this.f15707b;
                        e3 e3Var2 = m3Var2.f14903r;
                        org.telegram.ui.ActionBar.q0 q0Var = m3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < e3Var2.f14832c.size() && (p10Var = m3Var2.f14888a0) != null) {
                            p10Var.a(e3Var2.f14832c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = mp.u1(i7).R1().f12406w.f14719b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                x7 x7Var = (x7) obj;
                if (!x7Var.f15749g && !x7Var.f15778w) {
                    this.f14892c0.add(x7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29524h5, linearLayout, i6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.f24221n > 0 ? 0.0f : f12) + org.telegram.messenger.g0.f24221n);
            addView(linearLayout, c8.na.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            e g10 = m10.g(24, context, i6Var, true);
            this.K = g10;
            g10.i(gd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, c8.na.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final m3 f15858b;

                    {
                        this.f15858b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15858b.G.V(null, null);
                                return;
                            case 1:
                                m3 m3Var = this.f15858b;
                                if (m3Var.J.getAlpha() >= 0.25f) {
                                    m3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                m3 m3Var2 = this.f15858b;
                                if (m3Var2.J.getAlpha() >= 0.25f) {
                                    m3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f15858b.f(false);
                                return;
                        }
                    }
                });
            }
            e g11 = m10.g(24, context, i6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            kq kqVar = new kq(2131231945, 0);
            kqVar.f36853r = -org.telegram.messenger.g0.L(1.33f);
            kqVar.f36854s = org.telegram.messenger.g0.L(0.66f);
            spannableStringBuilder.setSpan(kqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.N0(2131744538, null));
            g11.i(spannableStringBuilder, false, true);
            linearLayout.addView(g11, c8.na.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final m3 f15858b;

                {
                    this.f15858b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f15858b.G.V(null, null);
                            return;
                        case 1:
                            m3 m3Var = this.f15858b;
                            if (m3Var.J.getAlpha() >= 0.25f) {
                                m3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            m3 m3Var2 = this.f15858b;
                            if (m3Var2.J.getAlpha() >= 0.25f) {
                                m3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f15858b.f(false);
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
            int L = org.telegram.messenger.g0.L(56.0f);
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, i6Var);
            c8.sa.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.na.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final m3 f15858b;

                {
                    this.f15858b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f15858b.G.V(null, null);
                            return;
                        case 1:
                            m3 m3Var = this.f15858b;
                            if (m3Var.J.getAlpha() >= 0.25f) {
                                m3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            m3 m3Var2 = this.f15858b;
                            if (m3Var2.J.getAlpha() >= 0.25f) {
                                m3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f15858b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        ue ueVar2 = f14886k0;
        if (ueVar != null && (ueVar != ueVar2 || this.f14892c0.size() > 0)) {
            this.f14897f0 = ueVar;
        } else {
            ArrayList arrayList3 = this.f14899h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f14897f0 = (ue) this.f14899h0.get(0);
            } else {
                this.f14897f0 = MediaController.f22784a2;
            }
        }
        this.f14898g0 = b(this.f14897f0);
        i();
        ue ueVar3 = this.f14897f0;
        if (ueVar3 == MediaController.f22784a2) {
            this.E.setText(gd.N0(2131752226, null));
        } else if (ueVar3 == ueVar2) {
            this.E.setText(gd.N0(2131744435, null));
        } else {
            this.E.setText(ueVar3.f27261c);
        }
    }

    public static Bitmap d(i3 i3Var) {
        Bitmap bitmap;
        if (i3Var != null && (bitmap = i3Var.f14657a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(ue ueVar) {
        if (ueVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = ueVar.f27262e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ef efVar = (ef) arrayList.get(i7);
            if (!this.M || !efVar.f27963b) {
                arrayList2.add(efVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.f25279r2;
        g3 g3Var = this.f14896f;
        int i12 = 0;
        if (i7 == i11) {
            h();
            if (this.f14897f0 != null) {
                while (true) {
                    if (i12 >= MediaController.f22786c2.size()) {
                        break;
                    }
                    ue ueVar = (ue) MediaController.f22786c2.get(i12);
                    int i13 = ueVar.f27259a;
                    ue ueVar2 = this.f14897f0;
                    if (i13 == ueVar2.f27259a && ueVar.f27260b == ueVar2.f27260b) {
                        this.f14897f0 = ueVar;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f14899h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f14897f0 = (ue) this.f14899h0.get(0);
                } else {
                    this.f14897f0 = MediaController.f22784a2;
                }
            }
            this.f14898g0 = b(this.f14897f0);
            this.f14900i0.clear();
            i();
            if (g3Var != null) {
                g3Var.f();
            }
        } else if (i7 == ks.B5) {
            ArrayList arrayList2 = this.f14892c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = mp.u1(this.f14887a).R1().f12406w.f14719b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    x7 x7Var = (x7) obj;
                    if (!x7Var.f15749g && !x7Var.f15778w) {
                        arrayList2.add(x7Var);
                    }
                }
            }
            h();
            i();
            if (g3Var != null) {
                g3Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float g10 = g();
        int i7 = 0;
        if (g10 <= i5.c.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z10 != this.f14906x) {
            this.f14906x = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f14906x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f14907y;
        if (kVar != null) {
            kVar.setAlpha(d);
            if (d <= 0.0f) {
                i7 = 8;
            }
            if (kVar.getVisibility() != i7) {
                kVar.setVisibility(i7);
            }
        }
        bi.v2 v2Var = this.f14901j0;
        if (v2Var != null) {
            v2Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f14891c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(ue ueVar, boolean z10) {
        this.f14897f0 = ueVar;
        this.f14898g0 = b(ueVar);
        this.f14900i0.clear();
        i();
        ue ueVar2 = this.f14897f0;
        ue ueVar3 = MediaController.f22784a2;
        TextView textView = this.E;
        if (ueVar2 == ueVar3) {
            textView.setText(gd.N0(2131752226, null));
        } else if (ueVar2 == f14886k0) {
            textView.setText(gd.N0(2131744435, null));
        } else {
            textView.setText(ueVar2.f27261c);
        }
        this.f14896f.f();
        gi.g gVar = this.f14894e;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2);
            lVar.f59190a = 1;
            lVar.f55822p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            gVar.w0(lVar);
            return;
        }
        gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        i3 i3Var;
        if (this.f14890b0 != null) {
            ArrayList arrayList = this.f14900i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.f14888a0.a((ef) arrayList.get(0), null);
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
                        ef efVar = (ef) obj;
                        if (efVar.f27963b && !efVar.d()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < b1Var.getChildCount()) {
                                    View childAt = b1Var.getChildAt(i10);
                                    if (childAt instanceof i3) {
                                        i3Var = (i3) childAt;
                                        if (i3Var.T == efVar) {
                                            break;
                                        }
                                    }
                                    i10++;
                                } else {
                                    i3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(i3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f14890b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
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
        return (int) (org.telegram.messenger.g0.f24226q.y * 0.35f);
    }

    public ue getSelectedAlbum() {
        return this.f14897f0;
    }

    public String getTitle() {
        int i7;
        if (this.M) {
            i7 = 2131754425;
        } else {
            i7 = 2131752109;
        }
        return gd.N0(i7, null);
    }

    public final void h() {
        a aVar;
        d3 d3Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = d3Var.f29959b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.f22786c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f14899h0 = arrayList2;
        Collections.sort(arrayList2, new di.s4(arrayList, 2));
        ArrayList arrayList3 = this.f14892c0;
        boolean isEmpty = arrayList3.isEmpty();
        ue ueVar = f14886k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f14899h0;
            arrayList4.add(!arrayList4.isEmpty(), ueVar);
        }
        boolean isEmpty2 = this.f14899h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.f14899h0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ue ueVar2 = (ue) this.f14899h0.get(i7);
            if (ueVar2 == ueVar) {
                aVar = new a(getContext(), ueVar2.d, gd.O0("StoryDraftsAlbum"), arrayList3.size(), this.f14889b);
            } else {
                ArrayList b10 = b(ueVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), ueVar2.d, ueVar2.f27261c, b10.size(), this.f14889b);
                }
            }
            d3Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.p2(21, this, ueVar2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f14899h0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f14899h0.get(0) == this.f14897f0 && this.f14892c0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14893d0 = z10;
        if (z10 || (this.f14897f0 != f14886k0 && ((arrayList = this.f14899h0) == null || arrayList.isEmpty() || this.f14899h0.get(0) != this.f14897f0))) {
            z11 = false;
        }
        this.f14895e0 = z11;
    }

    public final void j() {
        float f10;
        float f11;
        int L;
        ArrayList arrayList = this.f14900i0;
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
                L = -org.telegram.messenger.g0.f24221n;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            m10.o(scaleY.translationY(L), kr.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            e eVar = this.K;
            if (eVar != null) {
                eVar.i(gd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f24221n > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.g0.L(f15) + org.telegram.messenger.g0.f24221n);
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
                alpha2.translationY(f12).setInterpolator(kr.h).setDuration(320L).setListener(new bi.j7(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        ks.e().c(this, ks.f25279r2);
        ks.f(this.f14887a).c(this, ks.B5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.f25279r2);
        ks.f(this.f14887a).n(this, ks.B5);
        i3.f14655f0.clear();
        i3.f14656g0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = i3.f14653d0;
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
        di.b1 b1Var = this.d;
        b1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.g0.f24221n > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            L = org.telegram.messenger.g0.L(i11 + 114);
        }
        b1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.f24221n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.f24221n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.g0.L(10.0f);
            int L5 = org.telegram.messenger.g0.L(10.0f);
            int L6 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f24221n > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.f24221n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24220m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.f24221n;
        int i12 = org.telegram.messenger.g0.f24220m;
        int L7 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i12, L7, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24226q;
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

    public void setOnSelectListener(p10 p10Var) {
        this.f14888a0 = p10Var;
    }

    public void setOnSelectMultipleListener(r10 r10Var) {
        this.f14890b0 = r10Var;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
