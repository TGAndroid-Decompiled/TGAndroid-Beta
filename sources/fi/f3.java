package fi;

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
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.we;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wq;
public abstract class f3 extends FrameLayout implements ls {
    public static final we f11959j0 = new we(-1, null, null);
    public final TextView D;
    public final Drawable E;
    public final w2 F;
    public final org.telegram.ui.ActionBar.r0 G;
    public final ImageView H;
    public final LinearLayout I;
    public final d J;
    public boolean K;
    public final boolean L;
    public final boolean M;
    public int N;
    public final float O;
    public final boolean P;
    public boolean Q;
    public int R;
    public final org.telegram.ui.Components.v5 S;
    public boolean T;
    public boolean U;
    public Runnable V;
    public v10 W;
    public final int f11960a;
    public x10 f11961a0;
    public final org.telegram.ui.ActionBar.h6 f11962b;
    public final ArrayList f11963b0;
    public final Paint f11964c;
    public boolean f11965c0;
    public final bi.q1 d;
    public boolean f11966d0;
    public final ei.h f11967e;
    public we f11968e0;
    public final z2 f11969f;
    public ArrayList f11970f0;
    public ArrayList f11971g0;
    public final FrameLayout h;
    public final ArrayList f11972h0;
    public di.b4 f11973i0;
    public final pj0 f11974n;
    public final x2 f11975r;
    public final bv0 f11976s;
    public final q3 f11977w;
    public boolean f11978x;
    public final org.telegram.ui.ActionBar.l f11979y;

    public f3(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, we weVar, boolean z9, float f10, boolean z10, boolean z11) {
        super(context);
        float f11;
        Paint paint = new Paint(1);
        this.f11964c = paint;
        this.N = -2;
        this.S = new org.telegram.ui.Components.v5(this, 0L, 350L, wq.h);
        this.U = true;
        ArrayList arrayList = new ArrayList();
        this.f11963b0 = arrayList;
        this.f11972h0 = new ArrayList();
        this.O = f10;
        this.f11960a = i7;
        this.f11962b = h6Var;
        this.L = z9;
        this.M = z10;
        this.P = z11;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), 134217728);
        bi.q1 q1Var = new bi.q1(this, context, h6Var, 3);
        this.d = q1Var;
        q1Var.setItemSelectorColorProvider(new di.a1(22));
        z2 z2Var = new z2(this);
        this.f11969f = z2Var;
        q1Var.setAdapter(z2Var);
        ei.h hVar = new ei.h(1, this);
        this.f11967e = hVar;
        q1Var.setLayoutManager(hVar);
        q1Var.setFastScrollEnabled(1);
        q1Var.setFastScrollVisible(true);
        q1Var.getFastScroll().setAlpha(0.0f);
        hVar.O = new ai.l(this, 4);
        q1Var.i(new di.k(2));
        q1Var.setClipToPadding(false);
        addView(q1Var, c8.ha.e(-1, -1, 119));
        q1Var.setOnItemClickListener(new bj0(this) {
            public final f3 f12652b;

            {
                this.f12652b = this;
            }

            @Override
            public final void c(int i10, View view) {
                v10 v10Var;
                switch (r2) {
                    case 0:
                        f3 f3Var = this.f12652b;
                        ArrayList arrayList2 = f3Var.f11963b0;
                        ArrayList arrayList3 = f3Var.f11972h0;
                        if (i10 >= 2 && f3Var.W != null && (view instanceof b3)) {
                            b3 b3Var = (b3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (f3Var.f11965c0) {
                                if (i11 == 0) {
                                    f3Var.e(f3.f11959j0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (f3Var.f11966d0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    e7 e7Var = (e7) arrayList2.get(i11);
                                    v10 v10Var2 = f3Var.W;
                                    if (e7Var.K) {
                                        bitmap = f3.d(b3Var);
                                    }
                                    v10Var2.a(e7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < f3Var.f11970f0.size()) {
                                gf gfVar = (gf) f3Var.f11970f0.get(i11);
                                if (arrayList3.isEmpty() && !f3Var.Q) {
                                    v10 v10Var3 = f3Var.W;
                                    if (gfVar.f26849b && !gfVar.d()) {
                                        bitmap = f3.d(b3Var);
                                    }
                                    v10Var3.a(gfVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(gfVar)) {
                                    arrayList3.remove(gfVar);
                                } else if (arrayList3.size() + 1 > f3Var.R) {
                                    int i12 = -f3Var.N;
                                    f3Var.N = i12;
                                    org.telegram.messenger.g0.G3(i12, b3Var, null);
                                    org.telegram.messenger.p2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(gfVar);
                                }
                                org.telegram.messenger.g0.b4(f3Var.d);
                                f3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f3 f3Var2 = this.f12652b;
                        x2 x2Var = f3Var2.f11975r;
                        org.telegram.ui.ActionBar.r0 r0Var = f3Var2.G;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < x2Var.f11869c.size() && (v10Var = f3Var2.W) != null) {
                            v10Var.a(x2Var.f11869c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        q1Var.setOnItemLongClickListener(new di.r4(this, 11));
        q1Var.setOnScrollListener(new v2(this, 0));
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, h6Var);
        this.f11979y = lVar;
        lVar.setBackgroundColor(-14737633);
        lVar.setTitleColor(-1);
        lVar.setAlpha(0.0f);
        lVar.setVisibility(8);
        lVar.setBackButtonImage(2131231240);
        lVar.E(436207615, false);
        lVar.G(-1, false);
        lVar.G(-1, true);
        addView(lVar, c8.ha.e(-1, -2, 55));
        lVar.setActionBarMenuOnItemClick(new bi.s(this, 2));
        org.telegram.ui.ActionBar.y s5 = lVar.s();
        w2 w2Var = new w2(this, context, s5, h6Var, 0);
        this.F = w2Var;
        w2Var.setSubMenuOpenSide(1);
        if (org.telegram.messenger.g0.Q1()) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        lVar.addView(w2Var, 0, c8.ha.d(-2, -1.0f, 51, f11, 0.0f, 40.0f, 0.0f));
        w2Var.setOnClickListener(new View.OnClickListener(this) {
            public final f3 f12730b;

            {
                this.f12730b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f12730b.F.U(null, null);
                        return;
                    case 1:
                        f3 f3Var = this.f12730b;
                        if (f3Var.I.getAlpha() >= 0.25f) {
                            f3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        f3 f3Var2 = this.f12730b;
                        if (f3Var2.I.getAlpha() >= 0.25f) {
                            f3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f12730b.f(false);
                        return;
                }
            }
        });
        TextView textView = new TextView(context);
        this.D = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        Drawable mutate = context.getResources().getDrawable(2131231253).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
        textView.setPadding(0, org.telegram.messenger.g0.f22561m, org.telegram.messenger.g0.L(10.0f), 0);
        w2Var.addView(textView, c8.ha.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        pj0 pj0Var = new pj0(context, h6Var);
        this.f11974n = pj0Var;
        pj0Var.setLayoutManager(new v4.s(3));
        x2 x2Var = new x2(this);
        this.f11975r = x2Var;
        pj0Var.setAdapter(x2Var);
        pj0Var.setOnScrollListener(new v2(this, 1));
        pj0Var.setClipToPadding(true);
        pj0Var.i(new di.k(1));
        frameLayout.addView(pj0Var, c8.ha.e(-1, -1, 119));
        s2 s2Var = new s2(0, context, h6Var);
        float f12 = 10.0f;
        s2Var.setViewType(2);
        s2Var.setAlpha(0.0f);
        s2Var.setVisibility(8);
        frameLayout.addView(s2Var, c8.ha.e(-1, -1, 119));
        bv0 bv0Var = new bv0(context, s2Var, 11, h6Var);
        this.f11976s = bv0Var;
        xh.l lVar2 = bv0Var.d;
        lVar2.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.U(lVar2, org.telegram.ui.ActionBar.m6.f28282y6, h6Var);
        lVar2.setTypeface(null);
        lVar2.setText(id.M0(2131745760, null));
        this.f11977w = new q3(this, false, new ai.i(this, 20));
        frameLayout.addView(bv0Var, c8.ha.e(-1, -1, 119));
        pj0Var.setEmptyView(bv0Var);
        org.telegram.ui.ActionBar.r0 a10 = s5.a(0, 2131232486);
        a10.N();
        a10.H = new u2(this);
        this.G = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(id.M0(2131745761, null));
        pj0Var.setOnItemClickListener(new bj0(this) {
            public final f3 f12652b;

            {
                this.f12652b = this;
            }

            @Override
            public final void c(int i10, View view) {
                v10 v10Var;
                switch (r2) {
                    case 0:
                        f3 f3Var = this.f12652b;
                        ArrayList arrayList2 = f3Var.f11963b0;
                        ArrayList arrayList3 = f3Var.f11972h0;
                        if (i10 >= 2 && f3Var.W != null && (view instanceof b3)) {
                            b3 b3Var = (b3) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (f3Var.f11965c0) {
                                if (i11 == 0) {
                                    f3Var.e(f3.f11959j0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (f3Var.f11966d0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    e7 e7Var = (e7) arrayList2.get(i11);
                                    v10 v10Var2 = f3Var.W;
                                    if (e7Var.K) {
                                        bitmap = f3.d(b3Var);
                                    }
                                    v10Var2.a(e7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < f3Var.f11970f0.size()) {
                                gf gfVar = (gf) f3Var.f11970f0.get(i11);
                                if (arrayList3.isEmpty() && !f3Var.Q) {
                                    v10 v10Var3 = f3Var.W;
                                    if (gfVar.f26849b && !gfVar.d()) {
                                        bitmap = f3.d(b3Var);
                                    }
                                    v10Var3.a(gfVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(gfVar)) {
                                    arrayList3.remove(gfVar);
                                } else if (arrayList3.size() + 1 > f3Var.R) {
                                    int i12 = -f3Var.N;
                                    f3Var.N = i12;
                                    org.telegram.messenger.g0.G3(i12, b3Var, null);
                                    org.telegram.messenger.p2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(gfVar);
                                }
                                org.telegram.messenger.g0.b4(f3Var.d);
                                f3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        f3 f3Var2 = this.f12652b;
                        x2 x2Var2 = f3Var2.f11975r;
                        org.telegram.ui.ActionBar.r0 r0Var = f3Var2.G;
                        if (r0Var != null) {
                            org.telegram.messenger.g0.v1(r0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < x2Var2.f11869c.size() && (v10Var = f3Var2.W) != null) {
                            v10Var.a(x2Var2.f11869c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z9) {
            ArrayList arrayList2 = qp.s1(i7).P1().f10016w.f13232b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                e7 e7Var = (e7) obj;
                if (!e7Var.f11896g && !e7Var.f11925w) {
                    this.f11963b0.add(e7Var);
                }
            }
        }
        if (z10) {
            this.H = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.I = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, linearLayout, h6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.f22562n > 0 ? 0.0f : f12) + org.telegram.messenger.g0.f22562n);
            addView(linearLayout, c8.ha.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
            this.J = h;
            h.i(id.H(',', "StoriesCreate", 1), false, true);
            if (!z11) {
                linearLayout.addView(h, c8.ha.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                h.setOnClickListener(new View.OnClickListener(this) {
                    public final f3 f12730b;

                    {
                        this.f12730b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f12730b.F.U(null, null);
                                return;
                            case 1:
                                f3 f3Var = this.f12730b;
                                if (f3Var.I.getAlpha() >= 0.25f) {
                                    f3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                f3 f3Var2 = this.f12730b;
                                if (f3Var2.I.getAlpha() >= 0.25f) {
                                    f3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f12730b.f(false);
                                return;
                        }
                    }
                });
            }
            d h7 = org.telegram.messenger.k5.h(24, context, h6Var, z11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            wp wpVar = new wp(2131231941, 0);
            wpVar.f40038r = -org.telegram.messenger.g0.L(1.33f);
            wpVar.f40039s = org.telegram.messenger.g0.L(0.66f);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) id.M0(2131744779, null));
            h7.i(spannableStringBuilder, false, true);
            linearLayout.addView(h7, c8.ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            h7.setOnClickListener(new View.OnClickListener(this) {
                public final f3 f12730b;

                {
                    this.f12730b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f12730b.F.U(null, null);
                            return;
                        case 1:
                            f3 f3Var = this.f12730b;
                            if (f3Var.I.getAlpha() >= 0.25f) {
                                f3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            f3 f3Var2 = this.f12730b;
                            if (f3Var2.I.getAlpha() >= 0.25f) {
                                f3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f12730b.f(false);
                            return;
                    }
                }
            });
        } else {
            this.I = null;
            this.J = null;
            ImageView imageView = new ImageView(context);
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(2131231195);
            int L = org.telegram.messenger.g0.L(56.0f);
            int i11 = org.telegram.ui.ActionBar.m6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.m6.L(L, org.telegram.ui.ActionBar.m6.w0(i11, h6Var));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.t6.j(imageView, L2, M, null, h6Var);
            c8.ka.b(imageView, 0.1f, 1.5f);
            addView(imageView, c8.ha.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final f3 f12730b;

                {
                    this.f12730b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f12730b.F.U(null, null);
                            return;
                        case 1:
                            f3 f3Var = this.f12730b;
                            if (f3Var.I.getAlpha() >= 0.25f) {
                                f3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            f3 f3Var2 = this.f12730b;
                            if (f3Var2.I.getAlpha() >= 0.25f) {
                                f3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f12730b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        we weVar2 = f11959j0;
        if (weVar != null && (weVar != weVar2 || this.f11963b0.size() > 0)) {
            this.f11968e0 = weVar;
        } else {
            ArrayList arrayList3 = this.f11971g0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f11968e0 = (we) this.f11971g0.get(0);
            } else {
                this.f11968e0 = MediaController.Z1;
            }
        }
        this.f11970f0 = b(this.f11968e0);
        i();
        we weVar3 = this.f11968e0;
        if (weVar3 == MediaController.Z1) {
            this.D.setText(id.M0(2131752238, null));
        } else if (weVar3 == weVar2) {
            this.D.setText(id.M0(2131744679, null));
        } else {
            this.D.setText(weVar3.f26303c);
        }
    }

    public static Bitmap d(b3 b3Var) {
        Bitmap bitmap;
        if (b3Var != null && (bitmap = b3Var.f11658a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(we weVar) {
        if (weVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = weVar.f26304e;
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            gf gfVar = (gf) arrayList.get(i7);
            if (!this.L || !gfVar.f26849b) {
                arrayList2.add(gfVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25070r2;
        z2 z2Var = this.f11969f;
        int i12 = 0;
        if (i7 == i11) {
            h();
            if (this.f11968e0 != null) {
                while (true) {
                    if (i12 >= MediaController.f21250b2.size()) {
                        break;
                    }
                    we weVar = (we) MediaController.f21250b2.get(i12);
                    int i13 = weVar.f26301a;
                    we weVar2 = this.f11968e0;
                    if (i13 == weVar2.f26301a && weVar.f26302b == weVar2.f26302b) {
                        this.f11968e0 = weVar;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f11971g0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f11968e0 = (we) this.f11971g0.get(0);
                } else {
                    this.f11968e0 = MediaController.Z1;
                }
            }
            this.f11970f0 = b(this.f11968e0);
            this.f11972h0.clear();
            i();
            if (z2Var != null) {
                z2Var.f();
            }
        } else if (i7 == qs.f25120y5) {
            ArrayList arrayList2 = this.f11963b0;
            arrayList2.clear();
            if (!this.L) {
                ArrayList arrayList3 = qp.s1(this.f11960a).P1().f10016w.f13232b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    e7 e7Var = (e7) obj;
                    if (!e7Var.f11896g && !e7Var.f11925w) {
                        arrayList2.add(e7Var);
                    }
                }
            }
            h();
            i();
            if (z2Var != null) {
                z2Var.f();
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z9;
        float f10;
        float g10 = g();
        int i7 = 0;
        if (g10 <= jg.g.e(32.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m, 0)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float d = this.S.d(z9);
        float T1 = org.telegram.messenger.g0.T1(g10, 0.0f, d);
        if (z9 != this.f11978x) {
            this.f11978x = z9;
            c(z9);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f11978x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.f11979y;
        if (lVar != null) {
            lVar.setAlpha(d);
            if (d <= 0.0f) {
                i7 = 8;
            }
            if (lVar.getVisibility() != i7) {
                lVar.setVisibility(i7);
            }
        }
        di.b4 b4Var = this.f11973i0;
        if (b4Var != null) {
            b4Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f11964c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(we weVar, boolean z9) {
        this.f11968e0 = weVar;
        this.f11970f0 = b(weVar);
        this.f11972h0.clear();
        i();
        we weVar2 = this.f11968e0;
        we weVar3 = MediaController.Z1;
        TextView textView = this.D;
        if (weVar2 == weVar3) {
            textView.setText(id.M0(2131752238, null));
        } else if (weVar2 == f11959j0) {
            textView.setText(id.M0(2131744679, null));
        } else {
            textView.setText(weVar2.f26303c);
        }
        this.f11969f.f();
        ei.h hVar = this.f11967e;
        if (z9) {
            mi.m mVar = new mi.m(getContext(), 2);
            mVar.f57221a = 1;
            mVar.f20116p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
            hVar.w0(mVar);
            return;
        }
        hVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
    }

    public final void f(boolean z9) {
        Bitmap bitmap;
        b3 b3Var;
        if (this.f11961a0 != null) {
            ArrayList arrayList = this.f11972h0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.W.a((gf) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i7 = 0;
                while (true) {
                    bi.q1 q1Var = this.d;
                    if (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        gf gfVar = (gf) obj;
                        if (gfVar.f26849b && !gfVar.d()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < q1Var.getChildCount()) {
                                    View childAt = q1Var.getChildAt(i10);
                                    if (childAt instanceof b3) {
                                        b3Var = (b3) childAt;
                                        if (b3Var.S == gfVar) {
                                            break;
                                        }
                                    }
                                    i10++;
                                } else {
                                    b3Var = null;
                                    break;
                                }
                            }
                            bitmap = d(b3Var);
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(bitmap);
                    } else {
                        this.f11961a0.a(Boolean.valueOf(z9), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        org.telegram.messenger.g0.b4(q1Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        bi.q1 q1Var = this.d;
        if (q1Var != null && q1Var.getChildCount() > 0) {
            int i7 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < q1Var.getChildCount(); i10++) {
                View childAt = q1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i7 = Math.min(i7, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i7, getHeight()));
        } else {
            padding = getPadding();
        }
        if (q1Var == null) {
            return padding;
        }
        return org.telegram.messenger.g0.W1(q1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.f22567q.y * 0.35f);
    }

    public we getSelectedAlbum() {
        return this.f11968e0;
    }

    public String getTitle() {
        int i7;
        if (this.L) {
            i7 = 2131754428;
        } else {
            i7 = 2131752121;
        }
        return id.M0(i7, null);
    }

    public final void h() {
        a aVar;
        w2 w2Var = this.F;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w2Var.f28430b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.f21250b2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f11971g0 = arrayList2;
        Collections.sort(arrayList2, new bi.s5(arrayList, 2));
        ArrayList arrayList3 = this.f11963b0;
        boolean isEmpty = arrayList3.isEmpty();
        we weVar = f11959j0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f11971g0;
            arrayList4.add(!arrayList4.isEmpty(), weVar);
        }
        boolean isEmpty2 = this.f11971g0.isEmpty();
        TextView textView = this.D;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.E, (Drawable) null);
        int size = this.f11971g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            we weVar2 = (we) this.f11971g0.get(i7);
            if (weVar2 == weVar) {
                aVar = new a(getContext(), weVar2.d, id.N0("StoryDraftsAlbum"), arrayList3.size(), this.f11962b);
            } else {
                ArrayList b10 = b(weVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), weVar2.d, weVar2.f26303c, b10.size(), this.f11962b);
                }
            }
            w2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new bi.r(13, this, weVar2));
        }
    }

    public final void i() {
        boolean z9;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f11971g0;
        boolean z10 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f11971g0.get(0) == this.f11968e0 && this.f11963b0.size() > 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f11965c0 = z9;
        if (z9 || (this.f11968e0 != f11959j0 && ((arrayList = this.f11971g0) == null || arrayList.isEmpty() || this.f11971g0.get(0) != this.f11968e0))) {
            z10 = false;
        }
        this.f11966d0 = z10;
    }

    public final void j() {
        float f10;
        float f11;
        int L;
        ArrayList arrayList = this.f11972h0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z9 = !isEmpty;
        float f12 = 0.0f;
        float f13 = 1.0f;
        ImageView imageView = this.H;
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
                L = -org.telegram.messenger.g0.f22562n;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            org.telegram.messenger.camera.q.l(scaleY.translationY(L), wq.h, 320L);
        }
        LinearLayout linearLayout = this.I;
        if (linearLayout != null) {
            d dVar = this.J;
            if (dVar != null) {
                dVar.i(id.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f22562n > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.g0.L(f15) + org.telegram.messenger.g0.f22562n);
            if (this.T != z9) {
                this.T = z9;
                linearLayout.setVisibility(0);
                ViewPropertyAnimator animate2 = linearLayout.animate();
                if (isEmpty) {
                    f13 = 0.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f13);
                if (isEmpty) {
                    f12 = org.telegram.messenger.g0.L(32.0f);
                }
                alpha2.translationY(f12).setInterpolator(wq.h).setDuration(320L).setListener(new ch.y(9, this, z9)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        qs.e().c(this, qs.f25070r2);
        qs.f(this.f11960a).c(this, qs.f25120y5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.e().n(this, qs.f25070r2);
        qs.f(this.f11960a).n(this, qs.f25120y5);
        b3.f11656e0.clear();
        b3.f11657f0.evictAll();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = b3.f11654c0;
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
        bi.q1 q1Var = this.d;
        q1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.I;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.g0.f22562n > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            L = org.telegram.messenger.g0.L(i11 + 114);
        }
        q1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.f22562n);
        ImageView imageView = this.H;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.f22562n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.g0.L(10.0f);
            int L5 = org.telegram.messenger.g0.L(10.0f);
            int L6 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f22562n > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.f22562n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22561m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.f22562n;
        int i12 = org.telegram.messenger.g0.f22561m;
        int L7 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.D;
        textView.setPadding(0, i12, L7, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22567q;
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
        this.R = i7;
    }

    public void setMultipleOnClick(boolean z9) {
        if (this.Q != z9) {
            this.Q = z9;
            org.telegram.messenger.g0.b4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.V = runnable;
    }

    public void setOnSelectListener(v10 v10Var) {
        this.W = v10Var;
    }

    public void setOnSelectMultipleListener(x10 x10Var) {
        this.f11961a0 = x10Var;
    }

    public void c(boolean z9) {
    }

    public void a() {
    }
}
