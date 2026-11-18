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
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.ue;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.oj0;
public abstract class e3 extends FrameLayout implements fs {
    public static final ue f14532k0 = new ue(-1, null, null);
    public final TextView E;
    public final Drawable F;
    public final v2 G;
    public final org.telegram.ui.ActionBar.r0 H;
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
    public final org.telegram.ui.Components.c6 T;
    public boolean U;
    public boolean V;
    public Runnable W;
    public final int f14533a;
    public q10 f14534a0;
    public final org.telegram.ui.ActionBar.i6 f14535b;
    public s10 f14536b0;
    public final Paint f14537c;
    public final ArrayList f14538c0;
    public final di.b1 d;
    public boolean f14539d0;
    public final gi.g f14540e;
    public boolean f14541e0;
    public final y2 f14542f;
    public ue f14543f0;
    public ArrayList f14544g0;
    public final FrameLayout h;
    public ArrayList f14545h0;
    public final ArrayList f14546i0;
    public bi.p2 f14547j0;
    public final ck0 f14548n;
    public final w2 f14549r;
    public final kv0 f14550s;
    public final p3 f14551w;
    public boolean f14552x;
    public final org.telegram.ui.ActionBar.k f14553y;

    public e3(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var, ue ueVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        float f11;
        Paint paint = new Paint(1);
        this.f14537c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.c6(this, 0L, 350L, lr.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.f14538c0 = arrayList;
        this.f14546i0 = new ArrayList();
        this.P = f10;
        this.f14533a = i7;
        this.f14535b = i6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), 134217728);
        di.b1 b1Var = new di.b1(this, context, i6Var, 3);
        this.d = b1Var;
        b1Var.setItemSelectorColorProvider(new g0.e(28));
        y2 y2Var = new y2(this);
        this.f14542f = y2Var;
        b1Var.setAdapter(y2Var);
        gi.g gVar = new gi.g(1, this);
        this.f14540e = gVar;
        b1Var.setLayoutManager(gVar);
        b1Var.setFastScrollEnabled(1);
        b1Var.setFastScrollVisible(true);
        b1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new bi.s2(this, 7);
        b1Var.i(new fi.k(2));
        b1Var.setClipToPadding(false);
        addView(b1Var, c8.ma.e(-1, -1, 119));
        b1Var.setOnItemClickListener(new oj0(this) {
            public final e3 f15214b;

            {
                this.f15214b = this;
            }

            @Override
            public final void c(int i10, View view) {
                q10 q10Var;
                switch (r2) {
                    case 0:
                        e3 e3Var = this.f15214b;
                        ArrayList arrayList2 = e3Var.f14538c0;
                        ArrayList arrayList3 = e3Var.f14546i0;
                        if (i10 >= 2 && e3Var.f14534a0 != null && (view instanceof a3)) {
                            a3 a3Var = (a3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (e3Var.f14539d0) {
                                if (i11 == 0) {
                                    e3Var.e(e3.f14532k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (e3Var.f14541e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    d7 d7Var = (d7) arrayList2.get(i11);
                                    q10 q10Var2 = e3Var.f14534a0;
                                    if (d7Var.K) {
                                        bitmap = e3.d(a3Var);
                                    }
                                    q10Var2.a(d7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < e3Var.f14544g0.size()) {
                                ef efVar = (ef) e3Var.f14544g0.get(i11);
                                if (arrayList3.isEmpty() && !e3Var.R) {
                                    q10 q10Var3 = e3Var.f14534a0;
                                    if (efVar.f27847b && !efVar.d()) {
                                        bitmap = e3.d(a3Var);
                                    }
                                    q10Var3.a(efVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(efVar)) {
                                    arrayList3.remove(efVar);
                                } else if (arrayList3.size() + 1 > e3Var.S) {
                                    int i12 = -e3Var.O;
                                    e3Var.O = i12;
                                    org.telegram.messenger.g0.E3(i12, a3Var, null);
                                    org.telegram.messenger.q2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(efVar);
                                }
                                org.telegram.messenger.g0.Z3(e3Var.d);
                                e3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e3 e3Var2 = this.f15214b;
                        w2 w2Var = e3Var2.f14549r;
                        org.telegram.ui.ActionBar.r0 r0Var = e3Var2.H;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < w2Var.f14369c.size() && (q10Var = e3Var2.f14534a0) != null) {
                            q10Var.a(w2Var.f14369c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        b1Var.setOnItemLongClickListener(new di.c7(this, 18));
        b1Var.setOnScrollListener(new u2(this, 0));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, i6Var);
        this.f14553y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(2131231240);
        kVar.G(436207615, false);
        kVar.I(-1, false);
        kVar.I(-1, true);
        addView(kVar, c8.ma.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new bi.r1(this, 5));
        org.telegram.ui.ActionBar.z t6 = kVar.t();
        v2 v2Var = new v2(this, context, t6, i6Var, 0);
        this.G = v2Var;
        v2Var.setSubMenuOpenSide(1);
        if (org.telegram.messenger.g0.Q1()) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        kVar.addView(v2Var, 0, c8.ma.d(-2, -1.0f, 51, f11, 0.0f, 40.0f, 0.0f));
        v2Var.setOnClickListener(new View.OnClickListener(this) {
            public final e3 f15262b;

            {
                this.f15262b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15262b.G.V(null, null);
                        return;
                    case 1:
                        e3 e3Var = this.f15262b;
                        if (e3Var.J.getAlpha() >= 0.25f) {
                            e3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        e3 e3Var2 = this.f15262b;
                        if (e3Var2.J.getAlpha() >= 0.25f) {
                            e3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f15262b.f(false);
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
        textView.setPadding(0, org.telegram.messenger.g0.f24112m, org.telegram.messenger.g0.L(10.0f), 0);
        v2Var.addView(textView, c8.ma.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        ck0 ck0Var = new ck0(context, i6Var);
        this.f14548n = ck0Var;
        ck0Var.setLayoutManager(new v4.t(3));
        w2 w2Var = new w2(this);
        this.f14549r = w2Var;
        ck0Var.setAdapter(w2Var);
        ck0Var.setOnScrollListener(new u2(this, 1));
        ck0Var.setClipToPadding(true);
        ck0Var.i(new fi.k(1));
        frameLayout.addView(ck0Var, c8.ma.e(-1, -1, 119));
        r2 r2Var = new r2(0, context, i6Var);
        float f12 = 10.0f;
        r2Var.setViewType(2);
        r2Var.setAlpha(0.0f);
        r2Var.setVisibility(8);
        frameLayout.addView(r2Var, c8.ma.e(-1, -1, 119));
        kv0 kv0Var = new kv0(context, r2Var, 11, i6Var);
        this.f14550s = kv0Var;
        xh.l lVar = kv0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.U(lVar, org.telegram.ui.ActionBar.n6.f29786y6, i6Var);
        lVar.setTypeface(null);
        lVar.setText(gd.M0(2131745565, null));
        this.f14551w = new p3(this, false, new ai.g0(this, 25));
        frameLayout.addView(kv0Var, c8.ma.e(-1, -1, 119));
        ck0Var.setEmptyView(kv0Var);
        org.telegram.ui.ActionBar.r0 a10 = t6.a(0, 2131232488);
        a10.O();
        a10.I = new t2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(gd.M0(2131745566, null));
        ck0Var.setOnItemClickListener(new oj0(this) {
            public final e3 f15214b;

            {
                this.f15214b = this;
            }

            @Override
            public final void c(int i10, View view) {
                q10 q10Var;
                switch (r2) {
                    case 0:
                        e3 e3Var = this.f15214b;
                        ArrayList arrayList2 = e3Var.f14538c0;
                        ArrayList arrayList3 = e3Var.f14546i0;
                        if (i10 >= 2 && e3Var.f14534a0 != null && (view instanceof a3)) {
                            a3 a3Var = (a3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (e3Var.f14539d0) {
                                if (i11 == 0) {
                                    e3Var.e(e3.f14532k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (e3Var.f14541e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    d7 d7Var = (d7) arrayList2.get(i11);
                                    q10 q10Var2 = e3Var.f14534a0;
                                    if (d7Var.K) {
                                        bitmap = e3.d(a3Var);
                                    }
                                    q10Var2.a(d7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < e3Var.f14544g0.size()) {
                                ef efVar = (ef) e3Var.f14544g0.get(i11);
                                if (arrayList3.isEmpty() && !e3Var.R) {
                                    q10 q10Var3 = e3Var.f14534a0;
                                    if (efVar.f27847b && !efVar.d()) {
                                        bitmap = e3.d(a3Var);
                                    }
                                    q10Var3.a(efVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(efVar)) {
                                    arrayList3.remove(efVar);
                                } else if (arrayList3.size() + 1 > e3Var.S) {
                                    int i12 = -e3Var.O;
                                    e3Var.O = i12;
                                    org.telegram.messenger.g0.E3(i12, a3Var, null);
                                    org.telegram.messenger.q2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(efVar);
                                }
                                org.telegram.messenger.g0.Z3(e3Var.d);
                                e3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        e3 e3Var2 = this.f15214b;
                        w2 w2Var2 = e3Var2.f14549r;
                        org.telegram.ui.ActionBar.r0 r0Var = e3Var2.H;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < w2Var2.f14369c.size() && (q10Var = e3Var2.f14534a0) != null) {
                            q10Var.a(w2Var2.f14369c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = mp.u1(i7).R1().f12401w.f14255b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                d7 d7Var = (d7) obj;
                if (!d7Var.f14401g && !d7Var.f14430w) {
                    this.f14538c0.add(d7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29467h5, linearLayout, i6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.f24113n > 0 ? 0.0f : f12) + org.telegram.messenger.g0.f24113n);
            addView(linearLayout, c8.ma.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            d g10 = n10.g(24, context, i6Var, true);
            this.K = g10;
            g10.i(gd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(g10, c8.ma.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                g10.setOnClickListener(new View.OnClickListener(this) {
                    public final e3 f15262b;

                    {
                        this.f15262b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f15262b.G.V(null, null);
                                return;
                            case 1:
                                e3 e3Var = this.f15262b;
                                if (e3Var.J.getAlpha() >= 0.25f) {
                                    e3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                e3 e3Var2 = this.f15262b;
                                if (e3Var2.J.getAlpha() >= 0.25f) {
                                    e3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f15262b.f(false);
                                return;
                        }
                    }
                });
            }
            d g11 = n10.g(24, context, i6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            lq lqVar = new lq(2131231942, 0);
            lqVar.f37198r = -org.telegram.messenger.g0.L(1.33f);
            lqVar.f37199s = org.telegram.messenger.g0.L(0.66f);
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) gd.M0(2131744544, null));
            g11.i(spannableStringBuilder, false, true);
            linearLayout.addView(g11, c8.ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            g11.setOnClickListener(new View.OnClickListener(this) {
                public final e3 f15262b;

                {
                    this.f15262b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f15262b.G.V(null, null);
                            return;
                        case 1:
                            e3 e3Var = this.f15262b;
                            if (e3Var.J.getAlpha() >= 0.25f) {
                                e3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            e3 e3Var2 = this.f15262b;
                            if (e3Var2.J.getAlpha() >= 0.25f) {
                                e3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f15262b.f(false);
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
            int i11 = org.telegram.ui.ActionBar.n6.Fi;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.n6.L(L, org.telegram.ui.ActionBar.n6.w0(i11, i6Var));
            org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.u6.j(imageView, L2, M, null, i6Var);
            c8.ra.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ma.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final e3 f15262b;

                {
                    this.f15262b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f15262b.G.V(null, null);
                            return;
                        case 1:
                            e3 e3Var = this.f15262b;
                            if (e3Var.J.getAlpha() >= 0.25f) {
                                e3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            e3 e3Var2 = this.f15262b;
                            if (e3Var2.J.getAlpha() >= 0.25f) {
                                e3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f15262b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        ue ueVar2 = f14532k0;
        if (ueVar != null && (ueVar != ueVar2 || this.f14538c0.size() > 0)) {
            this.f14543f0 = ueVar;
        } else {
            ArrayList arrayList3 = this.f14545h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f14543f0 = (ue) this.f14545h0.get(0);
            } else {
                this.f14543f0 = MediaController.f22686a2;
            }
        }
        this.f14544g0 = b(this.f14543f0);
        i();
        ue ueVar3 = this.f14543f0;
        if (ueVar3 == MediaController.f22686a2) {
            this.E.setText(gd.M0(2131752227, null));
        } else if (ueVar3 == ueVar2) {
            this.E.setText(gd.M0(2131744444, null));
        } else {
            this.E.setText(ueVar3.f27157c);
        }
    }

    public static Bitmap d(a3 a3Var) {
        Bitmap bitmap;
        if (a3Var != null && (bitmap = a3Var.f14213a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(ue ueVar) {
        if (ueVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = ueVar.f27158e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ef efVar = (ef) arrayList.get(i7);
            if (!this.M || !efVar.f27847b) {
                arrayList2.add(efVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.f25180r2;
        y2 y2Var = this.f14542f;
        int i12 = 0;
        if (i7 == i11) {
            h();
            if (this.f14543f0 != null) {
                while (true) {
                    if (i12 >= MediaController.f22688c2.size()) {
                        break;
                    }
                    ue ueVar = (ue) MediaController.f22688c2.get(i12);
                    int i13 = ueVar.f27155a;
                    ue ueVar2 = this.f14543f0;
                    if (i13 == ueVar2.f27155a && ueVar.f27156b == ueVar2.f27156b) {
                        this.f14543f0 = ueVar;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f14545h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f14543f0 = (ue) this.f14545h0.get(0);
                } else {
                    this.f14543f0 = MediaController.f22686a2;
                }
            }
            this.f14544g0 = b(this.f14543f0);
            this.f14546i0.clear();
            i();
            if (y2Var != null) {
                y2Var.f();
            }
        } else if (i7 == ks.B5) {
            ArrayList arrayList2 = this.f14538c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = mp.u1(this.f14533a).R1().f12401w.f14255b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    d7 d7Var = (d7) obj;
                    if (!d7Var.f14401g && !d7Var.f14430w) {
                        arrayList2.add(d7Var);
                    }
                }
            }
            h();
            i();
            if (y2Var != null) {
                y2Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float g10 = g();
        int i7 = 0;
        if (g10 <= i5.c.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z10 != this.f14552x) {
            this.f14552x = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f14552x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f14553y;
        if (kVar != null) {
            kVar.setAlpha(d);
            if (d <= 0.0f) {
                i7 = 8;
            }
            if (kVar.getVisibility() != i7) {
                kVar.setVisibility(i7);
            }
        }
        bi.p2 p2Var = this.f14547j0;
        if (p2Var != null) {
            p2Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f14537c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(ue ueVar, boolean z10) {
        this.f14543f0 = ueVar;
        this.f14544g0 = b(ueVar);
        this.f14546i0.clear();
        i();
        ue ueVar2 = this.f14543f0;
        ue ueVar3 = MediaController.f22686a2;
        TextView textView = this.E;
        if (ueVar2 == ueVar3) {
            textView.setText(gd.M0(2131752227, null));
        } else if (ueVar2 == f14532k0) {
            textView.setText(gd.M0(2131744444, null));
        } else {
            textView.setText(ueVar2.f27157c);
        }
        this.f14542f.f();
        gi.g gVar = this.f14540e;
        if (z10) {
            pi.l lVar = new pi.l(getContext(), 2);
            lVar.f59067a = 1;
            lVar.f55699p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            gVar.w0(lVar);
            return;
        }
        gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        a3 a3Var;
        if (this.f14536b0 != null) {
            ArrayList arrayList = this.f14546i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.f14534a0.a((ef) arrayList.get(0), null);
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
                        if (efVar.f27847b && !efVar.d()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < b1Var.getChildCount()) {
                                    View childAt = b1Var.getChildAt(i10);
                                    if (childAt instanceof a3) {
                                        a3Var = (a3) childAt;
                                        if (a3Var.T == efVar) {
                                            break;
                                        }
                                    }
                                    i10++;
                                } else {
                                    a3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(a3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f14536b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
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
        return (int) (org.telegram.messenger.g0.f24118q.y * 0.35f);
    }

    public ue getSelectedAlbum() {
        return this.f14543f0;
    }

    public String getTitle() {
        int i7;
        if (this.M) {
            i7 = 2131754426;
        } else {
            i7 = 2131752110;
        }
        return gd.M0(i7, null);
    }

    public final void h() {
        a aVar;
        v2 v2Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = v2Var.f29916b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.f22688c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f14545h0 = arrayList2;
        Collections.sort(arrayList2, new di.s4(arrayList, 2));
        ArrayList arrayList3 = this.f14538c0;
        boolean isEmpty = arrayList3.isEmpty();
        ue ueVar = f14532k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f14545h0;
            arrayList4.add(!arrayList4.isEmpty(), ueVar);
        }
        boolean isEmpty2 = this.f14545h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.f14545h0.size();
        for (int i7 = 0; i7 < size; i7++) {
            ue ueVar2 = (ue) this.f14545h0.get(i7);
            if (ueVar2 == ueVar) {
                aVar = new a(getContext(), ueVar2.d, gd.N0("StoryDraftsAlbum"), arrayList3.size(), this.f14535b);
            } else {
                ArrayList b10 = b(ueVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), ueVar2.d, ueVar2.f27157c, b10.size(), this.f14535b);
                }
            }
            v2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.v2(22, this, ueVar2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f14545h0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f14545h0.get(0) == this.f14543f0 && this.f14538c0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14539d0 = z10;
        if (z10 || (this.f14543f0 != f14532k0 && ((arrayList = this.f14545h0) == null || arrayList.isEmpty() || this.f14545h0.get(0) != this.f14543f0))) {
            z11 = false;
        }
        this.f14541e0 = z11;
    }

    public final void j() {
        float f10;
        float f11;
        int L;
        ArrayList arrayList = this.f14546i0;
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
                L = -org.telegram.messenger.g0.f24113n;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            n10.o(scaleY.translationY(L), lr.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            d dVar = this.K;
            if (dVar != null) {
                dVar.i(gd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f24113n > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.g0.L(f15) + org.telegram.messenger.g0.f24113n);
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
                alpha2.translationY(f12).setInterpolator(lr.h).setDuration(320L).setListener(new bi.d7(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        ks.e().c(this, ks.f25180r2);
        ks.f(this.f14533a).c(this, ks.B5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.e().n(this, ks.f25180r2);
        ks.f(this.f14533a).n(this, ks.B5);
        a3.f14211f0.clear();
        a3.f14212g0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = a3.f14209d0;
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m;
        di.b1 b1Var = this.d;
        b1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.g0.f24113n > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            L = org.telegram.messenger.g0.L(i11 + 114);
        }
        b1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.f24113n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.f24113n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.g0.L(10.0f);
            int L5 = org.telegram.messenger.g0.L(10.0f);
            int L6 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f24113n > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.f24113n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24112m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.f24113n;
        int i12 = org.telegram.messenger.g0.f24112m;
        int L7 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i12, L7, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f24118q;
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

    public void setOnSelectListener(q10 q10Var) {
        this.f14534a0 = q10Var;
    }

    public void setOnSelectMultipleListener(s10 s10Var) {
        this.f14536b0 = s10Var;
    }

    public void a() {
    }

    public void c(boolean z10) {
    }
}
