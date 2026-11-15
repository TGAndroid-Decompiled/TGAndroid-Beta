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
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.is;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.messenger.u10;
import org.telegram.messenger.ve;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.uj0;
public abstract class d3 extends FrameLayout implements is {
    public static final ve f14098k0 = new ve(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final u2 G;
    public final org.telegram.ui.ActionBar.q0 H;
    public final ImageView I;
    public final LinearLayout J;
    public final d K;
    public boolean L;
    public final boolean M;
    public final boolean N;
    public int O;
    public final float P;
    public final boolean Q;
    public boolean R;
    public int S;
    public final org.telegram.ui.Components.u5 T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int f14099a;
    public s10 f14100a0;
    public final org.telegram.ui.ActionBar.e6 f14101b;
    public u10 f14102b0;
    public final Paint f14103c;
    public final ArrayList f14104c0;
    public final di.c1 d;
    public boolean f14105d0;
    public final gi.g f14106e;
    public boolean f14107e0;
    public final x2 f14108f;
    public ve f14109f0;
    public ArrayList f14110g0;
    public final FrameLayout h;
    public ArrayList f14111h0;
    public final ArrayList f14112i0;
    public bi.v1 f14113j0;
    public final uj0 f14114n;
    public final v2 f14115r;
    public final cv0 f14116s;
    public final p3 f14117w;
    public boolean f14118x;
    public final org.telegram.ui.ActionBar.k f14119y;

    public d3(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, ve veVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        float f11;
        Paint paint = new Paint(1);
        this.f14103c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.u5(this, 0L, 350L, er.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.f14104c0 = arrayList;
        this.f14112i0 = new ArrayList();
        this.P = f10;
        this.f14099a = i7;
        this.f14101b = e6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), 134217728);
        di.c1 c1Var = new di.c1(this, context, e6Var, 3);
        this.d = c1Var;
        c1Var.setItemSelectorColorProvider(new g0.e(27));
        x2 x2Var = new x2(this);
        this.f14108f = x2Var;
        c1Var.setAdapter(x2Var);
        gi.g gVar = new gi.g(1, this);
        this.f14106e = gVar;
        c1Var.setLayoutManager(gVar);
        c1Var.setFastScrollEnabled(1);
        c1Var.setFastScrollVisible(true);
        c1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new bi.y1(this, 7);
        c1Var.i(new fi.k(2));
        c1Var.setClipToPadding(false);
        addView(c1Var, c8.ja.e(-1, -1, 119));
        c1Var.setOnItemClickListener(new gj0(this) {
            public final d3 f14803b;

            {
                this.f14803b = this;
            }

            @Override
            public final void b(int i10, View view) {
                s10 s10Var;
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f14803b;
                        ArrayList arrayList2 = d3Var.f14104c0;
                        ArrayList arrayList3 = d3Var.f14112i0;
                        if (i10 >= 2 && d3Var.f14100a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (d3Var.f14105d0) {
                                if (i11 == 0) {
                                    d3Var.e(d3.f14098k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (d3Var.f14107e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    d7 d7Var = (d7) arrayList2.get(i11);
                                    s10 s10Var2 = d3Var.f14100a0;
                                    if (d7Var.K) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    s10Var2.a(d7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < d3Var.f14110g0.size()) {
                                ff ffVar = (ff) d3Var.f14110g0.get(i11);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    s10 s10Var3 = d3Var.f14100a0;
                                    if (ffVar.f27710b && !ffVar.d()) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    s10Var3.a(ffVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(ffVar)) {
                                    arrayList3.remove(ffVar);
                                } else if (arrayList3.size() + 1 > d3Var.S) {
                                    int i12 = -d3Var.O;
                                    d3Var.O = i12;
                                    org.telegram.messenger.g0.F3(i12, z2Var, null);
                                    org.telegram.messenger.p2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(ffVar);
                                }
                                org.telegram.messenger.g0.a4(d3Var.d);
                                d3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = this.f14803b;
                        v2 v2Var = d3Var2.f14115r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < v2Var.f13970c.size() && (s10Var = d3Var2.f14100a0) != null) {
                            s10Var.a(v2Var.f13970c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        c1Var.setOnItemLongClickListener(new di.z6(this, 18));
        c1Var.setOnScrollListener(new t2(this, 0));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        this.f14119y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(2131231240);
        kVar.F(436207615, false);
        kVar.H(-1, false);
        kVar.H(-1, true);
        addView(kVar, c8.ja.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.x4(this, 3));
        org.telegram.ui.ActionBar.y s5 = kVar.s();
        u2 u2Var = new u2(this, context, s5, e6Var, 0);
        this.G = u2Var;
        u2Var.setSubMenuOpenSide(1);
        if (org.telegram.messenger.g0.Q1()) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        kVar.addView(u2Var, 0, c8.ja.d(-2, -1.0f, 51, f11, 0.0f, 40.0f, 0.0f));
        u2Var.setOnClickListener(new View.OnClickListener(this) {
            public final d3 f14841b;

            {
                this.f14841b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14841b.G.V(null, null);
                        return;
                    case 1:
                        d3 d3Var = this.f14841b;
                        if (d3Var.J.getAlpha() >= 0.25f) {
                            d3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        d3 d3Var2 = this.f14841b;
                        if (d3Var2.J.getAlpha() >= 0.25f) {
                            d3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f14841b.f(false);
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
        textView.setPadding(0, org.telegram.messenger.g0.f23605m, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, c8.ja.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        uj0 uj0Var = new uj0(context, e6Var);
        this.f14114n = uj0Var;
        uj0Var.setLayoutManager(new v4.s(3));
        v2 v2Var = new v2(this);
        this.f14115r = v2Var;
        uj0Var.setAdapter(v2Var);
        uj0Var.setOnScrollListener(new t2(this, 1));
        uj0Var.setClipToPadding(true);
        uj0Var.i(new fi.k(1));
        frameLayout.addView(uj0Var, c8.ja.e(-1, -1, 119));
        q2 q2Var = new q2(0, context, e6Var);
        float f12 = 10.0f;
        q2Var.setViewType(2);
        q2Var.setAlpha(0.0f);
        q2Var.setVisibility(8);
        frameLayout.addView(q2Var, c8.ja.e(-1, -1, 119));
        cv0 cv0Var = new cv0(context, q2Var, 11, e6Var);
        this.f14116s = cv0Var;
        xh.l lVar = cv0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.U(lVar, org.telegram.ui.ActionBar.j6.f29241y6, e6Var);
        lVar.setTypeface(null);
        lVar.setText(hd.M0(2131745760, null));
        this.f14117w = new p3(this, false, new ai.g0(this, 24));
        frameLayout.addView(cv0Var, c8.ja.e(-1, -1, 119));
        uj0Var.setEmptyView(cv0Var);
        org.telegram.ui.ActionBar.q0 a10 = s5.a(0, 2131232487);
        a10.O();
        a10.I = new s2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(hd.M0(2131745761, null));
        uj0Var.setOnItemClickListener(new gj0(this) {
            public final d3 f14803b;

            {
                this.f14803b = this;
            }

            @Override
            public final void b(int i10, View view) {
                s10 s10Var;
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f14803b;
                        ArrayList arrayList2 = d3Var.f14104c0;
                        ArrayList arrayList3 = d3Var.f14112i0;
                        if (i10 >= 2 && d3Var.f14100a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (d3Var.f14105d0) {
                                if (i11 == 0) {
                                    d3Var.e(d3.f14098k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (d3Var.f14107e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    d7 d7Var = (d7) arrayList2.get(i11);
                                    s10 s10Var2 = d3Var.f14100a0;
                                    if (d7Var.K) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    s10Var2.a(d7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < d3Var.f14110g0.size()) {
                                ff ffVar = (ff) d3Var.f14110g0.get(i11);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    s10 s10Var3 = d3Var.f14100a0;
                                    if (ffVar.f27710b && !ffVar.d()) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    s10Var3.a(ffVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(ffVar)) {
                                    arrayList3.remove(ffVar);
                                } else if (arrayList3.size() + 1 > d3Var.S) {
                                    int i12 = -d3Var.O;
                                    d3Var.O = i12;
                                    org.telegram.messenger.g0.F3(i12, z2Var, null);
                                    org.telegram.messenger.p2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(ffVar);
                                }
                                org.telegram.messenger.g0.a4(d3Var.d);
                                d3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = this.f14803b;
                        v2 v2Var2 = d3Var2.f14115r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < v2Var2.f13970c.size() && (s10Var = d3Var2.f14100a0) != null) {
                            s10Var.a(v2Var2.f13970c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = np.s1(i7).P1().f12338w.f13862b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                d7 d7Var = (d7) obj;
                if (!d7Var.f14139g && !d7Var.f14168w) {
                    this.f14104c0.add(d7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28922h5, linearLayout, e6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.f23606n > 0 ? 0.0f : f12) + org.telegram.messenger.g0.f23606n);
            addView(linearLayout, c8.ja.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            d g10 = i20.g(24, context, e6Var, true);
            this.K = g10;
            g10.i(hd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, c8.ja.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final d3 f14841b;

                    {
                        this.f14841b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f14841b.G.V(null, null);
                                return;
                            case 1:
                                d3 d3Var = this.f14841b;
                                if (d3Var.J.getAlpha() >= 0.25f) {
                                    d3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                d3 d3Var2 = this.f14841b;
                                if (d3Var2.J.getAlpha() >= 0.25f) {
                                    d3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f14841b.f(false);
                                return;
                        }
                    }
                });
            }
            d g11 = i20.g(24, context, e6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            eq eqVar = new eq(2131231941, 0);
            eqVar.f34414r = -org.telegram.messenger.g0.L(1.33f);
            eqVar.f34415s = org.telegram.messenger.g0.L(0.66f);
            spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) hd.M0(2131744779, null));
            g11.i(spannableStringBuilder, false, true);
            linearLayout.addView(g11, c8.ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final d3 f14841b;

                {
                    this.f14841b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f14841b.G.V(null, null);
                            return;
                        case 1:
                            d3 d3Var = this.f14841b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            d3 d3Var2 = this.f14841b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f14841b.f(false);
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
            int i11 = org.telegram.ui.ActionBar.j6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.q6.j(imageView, L2, M, null, e6Var);
            c8.na.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ja.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final d3 f14841b;

                {
                    this.f14841b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f14841b.G.V(null, null);
                            return;
                        case 1:
                            d3 d3Var = this.f14841b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            d3 d3Var2 = this.f14841b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f14841b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        ve veVar2 = f14098k0;
        if (veVar != null && (veVar != veVar2 || this.f14104c0.size() > 0)) {
            this.f14109f0 = veVar;
        } else {
            ArrayList arrayList3 = this.f14111h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f14109f0 = (ve) this.f14111h0.get(0);
            } else {
                this.f14109f0 = MediaController.f22323a2;
            }
        }
        this.f14110g0 = b(this.f14109f0);
        i();
        ve veVar3 = this.f14109f0;
        if (veVar3 == MediaController.f22323a2) {
            this.E.setText(hd.M0(2131752238, null));
        } else if (veVar3 == veVar2) {
            this.E.setText(hd.M0(2131744679, null));
        } else {
            this.E.setText(veVar3.f26971c);
        }
    }

    public static Bitmap d(z2 z2Var) {
        Bitmap bitmap;
        if (z2Var != null && (bitmap = z2Var.f15483a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(ve veVar) {
        if (veVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = veVar.f26972e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ff ffVar = (ff) arrayList.get(i7);
            if (!this.M || !ffVar.f27710b) {
                arrayList2.add(ffVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.f25563r2;
        x2 x2Var = this.f14108f;
        int i12 = 0;
        if (i7 == i11) {
            h();
            if (this.f14109f0 != null) {
                while (true) {
                    if (i12 >= MediaController.f22325c2.size()) {
                        break;
                    }
                    ve veVar = (ve) MediaController.f22325c2.get(i12);
                    int i13 = veVar.f26969a;
                    ve veVar2 = this.f14109f0;
                    if (i13 == veVar2.f26969a && veVar.f26970b == veVar2.f26970b) {
                        this.f14109f0 = veVar;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f14111h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f14109f0 = (ve) this.f14111h0.get(0);
                } else {
                    this.f14109f0 = MediaController.f22323a2;
                }
            }
            this.f14110g0 = b(this.f14109f0);
            this.f14112i0.clear();
            i();
            if (x2Var != null) {
                x2Var.f();
            }
        } else if (i7 == ns.f25613y5) {
            ArrayList arrayList2 = this.f14104c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = np.s1(this.f14099a).P1().f12338w.f13862b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    d7 d7Var = (d7) obj;
                    if (!d7Var.f14139g && !d7Var.f14168w) {
                        arrayList2.add(d7Var);
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
        if (g10 <= i5.c.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z10 != this.f14118x) {
            this.f14118x = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f14118x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f14119y;
        if (kVar != null) {
            kVar.setAlpha(d);
            if (d <= 0.0f) {
                i7 = 8;
            }
            if (kVar.getVisibility() != i7) {
                kVar.setVisibility(i7);
            }
        }
        bi.v1 v1Var = this.f14113j0;
        if (v1Var != null) {
            v1Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f14103c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(ve veVar, boolean z10) {
        this.f14109f0 = veVar;
        this.f14110g0 = b(veVar);
        this.f14112i0.clear();
        i();
        ve veVar2 = this.f14109f0;
        ve veVar3 = MediaController.f22323a2;
        TextView textView = this.E;
        if (veVar2 == veVar3) {
            textView.setText(hd.M0(2131752238, null));
        } else if (veVar2 == f14098k0) {
            textView.setText(hd.M0(2131744679, null));
        } else {
            textView.setText(veVar2.f26971c);
        }
        this.f14108f.f();
        gi.g gVar = this.f14106e;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2);
            lVar.f58480a = 1;
            lVar.f55123p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            gVar.w0(lVar);
            return;
        }
        gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        z2 z2Var;
        if (this.f14102b0 != null) {
            ArrayList arrayList = this.f14112i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.f14100a0.a((ff) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    di.c1 c1Var = this.d;
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ff ffVar = (ff) obj;
                        if (ffVar.f27710b && !ffVar.d()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < c1Var.getChildCount()) {
                                    View childAt = c1Var.getChildAt(i10);
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
                        this.f14102b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        org.telegram.messenger.g0.a4(c1Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        di.c1 c1Var = this.d;
        if (c1Var != null && c1Var.getChildCount() > 0) {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < c1Var.getChildCount(); i10++) {
                View childAt = c1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i7 = Math.min(i7, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i7, getHeight()));
        } else {
            padding = getPadding();
        }
        if (c1Var == null) {
            return padding;
        }
        return org.telegram.messenger.g0.W1(c1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.f23611q.y * 0.35f);
    }

    public ve getSelectedAlbum() {
        return this.f14109f0;
    }

    public String getTitle() {
        int i7;
        if (this.M) {
            i7 = 2131754428;
        } else {
            i7 = 2131752121;
        }
        return hd.M0(i7, null);
    }

    public final void h() {
        a aVar;
        u2 u2Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.f29497b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.f22325c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f14111h0 = arrayList2;
        Collections.sort(arrayList2, new di.p4(arrayList, 2));
        ArrayList arrayList3 = this.f14104c0;
        boolean isEmpty = arrayList3.isEmpty();
        ve veVar = f14098k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f14111h0;
            arrayList4.add(!arrayList4.isEmpty(), veVar);
        }
        boolean isEmpty2 = this.f14111h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.f14111h0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ve veVar2 = (ve) this.f14111h0.get(i7);
            if (veVar2 == veVar) {
                aVar = new a(getContext(), veVar2.d, hd.N0("StoryDraftsAlbum"), arrayList3.size(), this.f14101b);
            } else {
                ArrayList b10 = b(veVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), veVar2.d, veVar2.f26971c, b10.size(), this.f14101b);
                }
            }
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.v2(20, this, veVar2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f14111h0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f14111h0.get(0) == this.f14109f0 && this.f14104c0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14105d0 = z10;
        if (z10 || (this.f14109f0 != f14098k0 && ((arrayList = this.f14111h0) == null || arrayList.isEmpty() || this.f14111h0.get(0) != this.f14109f0))) {
            z11 = false;
        }
        this.f14107e0 = z11;
    }

    public final void j() {
        float f10;
        float f11;
        int L;
        ArrayList arrayList = this.f14112i0;
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
                L = -org.telegram.messenger.g0.f23606n;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            i20.n(scaleY.translationY(L), er.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            d dVar = this.K;
            if (dVar != null) {
                dVar.i(hd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f23606n > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.g0.L(f15) + org.telegram.messenger.g0.f23606n);
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
                alpha2.translationY(f12).setInterpolator(er.h).setDuration(320L).setListener(new bi.v4(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        ns.e().c(this, ns.f25563r2);
        ns.f(this.f14099a).c(this, ns.f25613y5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.e().n(this, ns.f25563r2);
        ns.f(this.f14099a).n(this, ns.f25613y5);
        z2.f15481f0.clear();
        z2.f15482g0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = z2.f15479d0;
            if (i7 < arrayList.size()) {
                ((org.telegram.messenger.q5) arrayList.get(i7)).cleanupQueue();
                ((org.telegram.messenger.q5) arrayList.get(i7)).recycle();
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
        di.c1 c1Var = this.d;
        c1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.g0.f23606n > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            L = org.telegram.messenger.g0.L(i11 + 114);
        }
        c1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.f23606n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.f23606n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.g0.L(10.0f);
            int L5 = org.telegram.messenger.g0.L(10.0f);
            int L6 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f23606n > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.f23606n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.f23606n;
        int i12 = org.telegram.messenger.g0.f23605m;
        int L7 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i12, L7, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f23611q;
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
            org.telegram.messenger.g0.a4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(s10 s10Var) {
        this.f14100a0 = s10Var;
    }

    public void setOnSelectMultipleListener(u10 u10Var) {
        this.f14102b0 = u10Var;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
