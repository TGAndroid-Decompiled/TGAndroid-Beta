package gi;

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
import b8.mf;
import b8.pf;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.pe;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zu0;
public abstract class d3 extends FrameLayout implements cs {
    public static final pe f12558k0 = new pe(-1, null, null);
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
    public final int f12559a;
    public n10 f12560a0;
    public final org.telegram.ui.ActionBar.e6 f12561b;
    public p10 f12562b0;
    public final Paint f12563c;
    public final ArrayList f12564c0;
    public final ci.j1 d;
    public boolean f12565d0;
    public final fi.g f12566e;
    public boolean f12567e0;
    public final x2 f12568f;
    public pe f12569f0;
    public ArrayList f12570g0;
    public final FrameLayout h;
    public ArrayList f12571h0;
    public final ArrayList f12572i0;
    public ai.d2 f12573j0;
    public final tj0 f12574n;
    public final v2 f12575r;
    public final zu0 f12576s;
    public final p3 f12577w;
    public boolean f12578x;
    public final org.telegram.ui.ActionBar.k f12579y;

    public d3(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, pe peVar, boolean z10, float f10, boolean z11, boolean z12) {
        super(context);
        float f11;
        Paint paint = new Paint(1);
        this.f12563c = paint;
        this.O = -2;
        this.T = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.f12564c0 = arrayList;
        this.f12572i0 = new ArrayList();
        this.P = f10;
        this.f12559a = i3;
        this.f12561b = e6Var;
        this.M = z10;
        this.N = z11;
        this.Q = z12;
        paint.setColor(-14737633);
        paint.setShadowLayer(org.telegram.messenger.g0.L(2.33f), 0.0f, org.telegram.messenger.g0.L(-0.4f), 134217728);
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 3);
        this.d = j1Var;
        j1Var.setItemSelectorColorProvider(new d2.t1(29));
        x2 x2Var = new x2(this);
        this.f12568f = x2Var;
        j1Var.setAdapter(x2Var);
        fi.g gVar = new fi.g(1, this);
        this.f12566e = gVar;
        j1Var.setLayoutManager(gVar);
        j1Var.setFastScrollEnabled(1);
        j1Var.setFastScrollVisible(true);
        j1Var.getFastScroll().setAlpha(0.0f);
        gVar.O = new ai.g2(this, 7);
        j1Var.i(new ei.l(2));
        j1Var.setClipToPadding(false);
        addView(j1Var, mf.e(-1, -1, 119));
        j1Var.setOnItemClickListener(new fj0(this) {
            public final d3 f13326b;

            {
                this.f13326b = this;
            }

            @Override
            public final void f(int i10, View view) {
                n10 n10Var;
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f13326b;
                        ArrayList arrayList2 = d3Var.f12564c0;
                        ArrayList arrayList3 = d3Var.f12572i0;
                        if (i10 >= 2 && d3Var.f12560a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (d3Var.f12565d0) {
                                if (i11 == 0) {
                                    d3Var.e(d3.f12558k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (d3Var.f12567e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    f7 f7Var = (f7) arrayList2.get(i11);
                                    n10 n10Var2 = d3Var.f12560a0;
                                    if (f7Var.K) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    n10Var2.a(f7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < d3Var.f12570g0.size()) {
                                ye yeVar = (ye) d3Var.f12570g0.get(i11);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    n10 n10Var3 = d3Var.f12560a0;
                                    if (yeVar.f25310b && !yeVar.d()) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    n10Var3.a(yeVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(yeVar)) {
                                    arrayList3.remove(yeVar);
                                } else if (arrayList3.size() + 1 > d3Var.S) {
                                    int i12 = -d3Var.O;
                                    d3Var.O = i12;
                                    org.telegram.messenger.g0.G3(i12, z2Var, null);
                                    org.telegram.messenger.p2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(yeVar);
                                }
                                org.telegram.messenger.g0.b4(d3Var.d);
                                d3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = this.f13326b;
                        v2 v2Var = d3Var2.f12575r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < v2Var.f12479c.size() && (n10Var = d3Var2.f12560a0) != null) {
                            n10Var.a(v2Var.f12479c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        j1Var.setOnItemLongClickListener(new ei.y8(this, 7));
        j1Var.setOnScrollListener(new t2(this, 0));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, e6Var);
        this.f12579y = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(2131231240);
        kVar.C(436207615, false);
        kVar.D(-1, false);
        kVar.D(-1, true);
        addView(kVar, mf.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new ai.g5(this, 3));
        org.telegram.ui.ActionBar.x q10 = kVar.q();
        u2 u2Var = new u2(this, context, q10, e6Var, 0);
        this.G = u2Var;
        u2Var.setSubMenuOpenSide(1);
        if (org.telegram.messenger.g0.Q1()) {
            f11 = 64.0f;
        } else {
            f11 = 56.0f;
        }
        kVar.addView(u2Var, 0, mf.d(-2, -1.0f, 51, f11, 0.0f, 40.0f, 0.0f));
        u2Var.setOnClickListener(new View.OnClickListener(this) {
            public final d3 f13357b;

            {
                this.f13357b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f13357b.G.U(null, null);
                        return;
                    case 1:
                        d3 d3Var = this.f13357b;
                        if (d3Var.J.getAlpha() >= 0.25f) {
                            d3Var.f(false);
                            return;
                        }
                        return;
                    case 2:
                        d3 d3Var2 = this.f13357b;
                        if (d3Var2.J.getAlpha() >= 0.25f) {
                            d3Var2.f(true);
                            return;
                        }
                        return;
                    default:
                        this.f13357b.f(false);
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
        textView.setPadding(0, org.telegram.messenger.g0.f22602m, org.telegram.messenger.g0.L(10.0f), 0);
        u2Var.addView(textView, mf.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, mf.e(-1, -1, 119));
        tj0 tj0Var = new tj0(context, e6Var);
        this.f12574n = tj0Var;
        tj0Var.setLayoutManager(new u4.s(3));
        v2 v2Var = new v2(this);
        this.f12575r = v2Var;
        tj0Var.setAdapter(v2Var);
        tj0Var.setOnScrollListener(new t2(this, 1));
        tj0Var.setClipToPadding(true);
        tj0Var.i(new ei.l(1));
        frameLayout.addView(tj0Var, mf.e(-1, -1, 119));
        q2 q2Var = new q2(0, context, e6Var);
        float f12 = 10.0f;
        q2Var.setViewType(2);
        q2Var.setAlpha(0.0f);
        q2Var.setVisibility(8);
        frameLayout.addView(q2Var, mf.e(-1, -1, 119));
        zu0 zu0Var = new zu0(context, q2Var, 11, e6Var);
        this.f12576s = zu0Var;
        yh.l lVar = zu0Var.d;
        lVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(lVar, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        lVar.setTypeface(null);
        lVar.setText(bd.M0(2131745770, null));
        this.f12577w = new p3(this, false, new ai.v2(this, 23));
        frameLayout.addView(zu0Var, mf.e(-1, -1, 119));
        tj0Var.setEmptyView(zu0Var);
        org.telegram.ui.ActionBar.q0 a10 = q10.a(0, 2131232486);
        a10.N();
        a10.I = new s2(this);
        this.H = a10;
        a10.setVisibility(8);
        a10.setSearchFieldHint(bd.M0(2131745771, null));
        tj0Var.setOnItemClickListener(new fj0(this) {
            public final d3 f13326b;

            {
                this.f13326b = this;
            }

            @Override
            public final void f(int i10, View view) {
                n10 n10Var;
                switch (r2) {
                    case 0:
                        d3 d3Var = this.f13326b;
                        ArrayList arrayList2 = d3Var.f12564c0;
                        ArrayList arrayList3 = d3Var.f12572i0;
                        if (i10 >= 2 && d3Var.f12560a0 != null && (view instanceof z2)) {
                            z2 z2Var = (z2) view;
                            int i11 = i10 - 2;
                            Bitmap bitmap = null;
                            if (d3Var.f12565d0) {
                                if (i11 == 0) {
                                    d3Var.e(d3.f12558k0, true);
                                    return;
                                }
                                i11 = i10 - 3;
                            } else if (d3Var.f12567e0) {
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    f7 f7Var = (f7) arrayList2.get(i11);
                                    n10 n10Var2 = d3Var.f12560a0;
                                    if (f7Var.K) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    n10Var2.a(f7Var, bitmap);
                                    return;
                                }
                                i11 -= arrayList2.size();
                            }
                            if (i11 >= 0 && i11 < d3Var.f12570g0.size()) {
                                ye yeVar = (ye) d3Var.f12570g0.get(i11);
                                if (arrayList3.isEmpty() && !d3Var.R) {
                                    n10 n10Var3 = d3Var.f12560a0;
                                    if (yeVar.f25310b && !yeVar.d()) {
                                        bitmap = d3.d(z2Var);
                                    }
                                    n10Var3.a(yeVar, bitmap);
                                    return;
                                }
                                if (arrayList3.contains(yeVar)) {
                                    arrayList3.remove(yeVar);
                                } else if (arrayList3.size() + 1 > d3Var.S) {
                                    int i12 = -d3Var.O;
                                    d3Var.O = i12;
                                    org.telegram.messenger.g0.G3(i12, z2Var, null);
                                    org.telegram.messenger.p2.APP_ERROR.a();
                                    return;
                                } else {
                                    arrayList3.add(yeVar);
                                }
                                org.telegram.messenger.g0.b4(d3Var.d);
                                d3Var.j();
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        d3 d3Var2 = this.f13326b;
                        v2 v2Var2 = d3Var2.f12575r;
                        org.telegram.ui.ActionBar.q0 q0Var = d3Var2.H;
                        if (q0Var != null) {
                            org.telegram.messenger.g0.v1(q0Var.getSearchContainer());
                        }
                        if (i10 >= 0 && i10 < v2Var2.f12479c.size() && (n10Var = d3Var2.f12560a0) != null) {
                            n10Var.a(v2Var2.f12479c.get(i10), null);
                            return;
                        }
                        return;
                }
            }
        });
        arrayList.clear();
        if (!z10) {
            ArrayList arrayList2 = hp.s1(i3).P1().f11293w.f13997b;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                f7 f7Var = (f7) obj;
                if (!f7Var.f12718g && !f7Var.f12747w) {
                    this.f12564c0.add(f7Var);
                }
            }
        }
        if (z11) {
            this.I = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.J = linearLayout;
            linearLayout.setOrientation(1);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27954h5, linearLayout, e6Var);
            linearLayout.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(org.telegram.messenger.g0.f22603n > 0 ? 0.0f : f12) + org.telegram.messenger.g0.f22603n);
            addView(linearLayout, mf.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(org.telegram.messenger.g0.L(32.0f));
            linearLayout.setVisibility(8);
            d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
            this.K = h;
            h.i(bd.H(',', "StoriesCreate", 1), false, true);
            if (!z12) {
                linearLayout.addView(h, mf.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                h.setOnClickListener(new View.OnClickListener(this) {
                    public final d3 f13357b;

                    {
                        this.f13357b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f13357b.G.U(null, null);
                                return;
                            case 1:
                                d3 d3Var = this.f13357b;
                                if (d3Var.J.getAlpha() >= 0.25f) {
                                    d3Var.f(false);
                                    return;
                                }
                                return;
                            case 2:
                                d3 d3Var2 = this.f13357b;
                                if (d3Var2.J.getAlpha() >= 0.25f) {
                                    d3Var2.f(true);
                                    return;
                                }
                                return;
                            default:
                                this.f13357b.f(false);
                                return;
                        }
                    }
                });
            }
            d h7 = org.telegram.messenger.k5.h(24, context, e6Var, z12);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            wp wpVar = new wp(2131231941, 0);
            wpVar.f40045r = -org.telegram.messenger.g0.L(1.33f);
            wpVar.f40046s = org.telegram.messenger.g0.L(0.66f);
            spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.M0(2131744789, null));
            h7.i(spannableStringBuilder, false, true);
            linearLayout.addView(h7, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            h7.setOnClickListener(new View.OnClickListener(this) {
                public final d3 f13357b;

                {
                    this.f13357b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f13357b.G.U(null, null);
                            return;
                        case 1:
                            d3 d3Var = this.f13357b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            d3 d3Var2 = this.f13357b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f13357b.f(false);
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
            int i11 = org.telegram.ui.ActionBar.k6.Ci;
            ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i11, e6Var));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            imageView.setBackground(L2);
            org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, e6Var);
            pf.b(imageView, 0.1f, 1.5f);
            addView(imageView, mf.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final d3 f13357b;

                {
                    this.f13357b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            this.f13357b.G.U(null, null);
                            return;
                        case 1:
                            d3 d3Var = this.f13357b;
                            if (d3Var.J.getAlpha() >= 0.25f) {
                                d3Var.f(false);
                                return;
                            }
                            return;
                        case 2:
                            d3 d3Var2 = this.f13357b;
                            if (d3Var2.J.getAlpha() >= 0.25f) {
                                d3Var2.f(true);
                                return;
                            }
                            return;
                        default:
                            this.f13357b.f(false);
                            return;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        pe peVar2 = f12558k0;
        if (peVar != null && (peVar != peVar2 || this.f12564c0.size() > 0)) {
            this.f12569f0 = peVar;
        } else {
            ArrayList arrayList3 = this.f12571h0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                this.f12569f0 = (pe) this.f12571h0.get(0);
            } else {
                this.f12569f0 = MediaController.f21294a2;
            }
        }
        this.f12570g0 = b(this.f12569f0);
        i();
        pe peVar3 = this.f12569f0;
        if (peVar3 == MediaController.f21294a2) {
            this.E.setText(bd.M0(2131752238, null));
        } else if (peVar3 == peVar2) {
            this.E.setText(bd.M0(2131744689, null));
        } else {
            this.E.setText(peVar3.f24737c);
        }
    }

    public static Bitmap d(z2 z2Var) {
        Bitmap bitmap;
        if (z2Var != null && (bitmap = z2Var.f14008a) != null && !bitmap.isRecycled()) {
            return Utilities.E(6.0f, bitmap);
        }
        return null;
    }

    public final ArrayList b(pe peVar) {
        if (peVar == null) {
            return new ArrayList();
        }
        ArrayList arrayList = peVar.f24738e;
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ye yeVar = (ye) arrayList.get(i3);
            if (!this.M || !yeVar.f25310b) {
                arrayList2.add(yeVar);
            }
        }
        return arrayList2;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.f23295r2;
        x2 x2Var = this.f12568f;
        int i12 = 0;
        if (i3 == i11) {
            h();
            if (this.f12569f0 != null) {
                while (true) {
                    if (i12 >= MediaController.c2.size()) {
                        break;
                    }
                    pe peVar = (pe) MediaController.c2.get(i12);
                    int i13 = peVar.f24735a;
                    pe peVar2 = this.f12569f0;
                    if (i13 == peVar2.f24735a && peVar.f24736b == peVar2.f24736b) {
                        this.f12569f0 = peVar;
                        break;
                    }
                    i12++;
                }
            } else {
                ArrayList arrayList = this.f12571h0;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.f12569f0 = (pe) this.f12571h0.get(0);
                } else {
                    this.f12569f0 = MediaController.f21294a2;
                }
            }
            this.f12570g0 = b(this.f12569f0);
            this.f12572i0.clear();
            i();
            if (x2Var != null) {
                x2Var.f();
            }
        } else if (i3 == hs.f23345y5) {
            ArrayList arrayList2 = this.f12564c0;
            arrayList2.clear();
            if (!this.M) {
                ArrayList arrayList3 = hp.s1(this.f12559a).P1().f11293w.f13997b;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj = arrayList3.get(i12);
                    i12++;
                    f7 f7Var = (f7) obj;
                    if (!f7Var.f12718g && !f7Var.f12747w) {
                        arrayList2.add(f7Var);
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
        float g7 = g();
        int i3 = 0;
        if (g7 <= k2.p1.d(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m, 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float d = this.T.d(z10);
        float T1 = org.telegram.messenger.g0.T1(g7, 0.0f, d);
        if (z10 != this.f12578x) {
            this.f12578x = z10;
            c(z10);
            ViewPropertyAnimator animate = this.d.getFastScroll().animate();
            if (this.f12578x) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.f12579y;
        if (kVar != null) {
            kVar.setAlpha(d);
            if (d <= 0.0f) {
                i3 = 8;
            }
            if (kVar.getVisibility() != i3) {
                kVar.setVisibility(i3);
            }
        }
        ai.d2 d2Var = this.f12573j0;
        if (d2Var != null) {
            d2Var.setAlpha(1.0f - d);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, T1, getWidth(), org.telegram.messenger.g0.L(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f), this.f12563c);
        canvas.save();
        canvas.clipRect(0.0f, T1, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(pe peVar, boolean z10) {
        this.f12569f0 = peVar;
        this.f12570g0 = b(peVar);
        this.f12572i0.clear();
        i();
        pe peVar2 = this.f12569f0;
        pe peVar3 = MediaController.f21294a2;
        TextView textView = this.E;
        if (peVar2 == peVar3) {
            textView.setText(bd.M0(2131752238, null));
        } else if (peVar2 == f12558k0) {
            textView.setText(bd.M0(2131744689, null));
        } else {
            textView.setText(peVar2.f24737c);
        }
        this.f12568f.f();
        fi.g gVar = this.f12566e;
        if (z10) {
            ni.m mVar = new ni.m(getContext(), 2);
            mVar.f55704a = 1;
            mVar.f20461p = org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
            gVar.w0(mVar);
            return;
        }
        gVar.h1(1, org.telegram.messenger.g0.L(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
    }

    public final void f(boolean z10) {
        Bitmap bitmap;
        z2 z2Var;
        if (this.f12562b0 != null) {
            ArrayList arrayList = this.f12572i0;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 1) {
                    this.f12560a0.a((ye) arrayList.get(0), null);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    ci.j1 j1Var = this.d;
                    if (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        ye yeVar = (ye) obj;
                        if (yeVar.f25310b && !yeVar.d()) {
                            int i10 = 0;
                            while (true) {
                                if (i10 < j1Var.getChildCount()) {
                                    View childAt = j1Var.getChildAt(i10);
                                    if (childAt instanceof z2) {
                                        z2Var = (z2) childAt;
                                        if (z2Var.T == yeVar) {
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
                        this.f12562b0.a(Boolean.valueOf(z10), new ArrayList(arrayList), arrayList2);
                        arrayList.clear();
                        org.telegram.messenger.g0.b4(j1Var);
                        j();
                        return;
                    }
                }
            }
        }
    }

    public final int g() {
        int padding;
        ci.j1 j1Var = this.d;
        if (j1Var != null && j1Var.getChildCount() > 0) {
            int i3 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < j1Var.getChildCount(); i10++) {
                View childAt = j1Var.getChildAt(i10);
                if (RecyclerView.R(childAt) > 0) {
                    i3 = Math.min(i3, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i3, getHeight()));
        } else {
            padding = getPadding();
        }
        if (j1Var == null) {
            return padding;
        }
        return org.telegram.messenger.g0.W1(j1Var.getAlpha(), 0, padding);
    }

    public int getPadding() {
        return (int) (org.telegram.messenger.g0.f22608q.y * 0.35f);
    }

    public pe getSelectedAlbum() {
        return this.f12569f0;
    }

    public String getTitle() {
        int i3;
        if (this.M) {
            i3 = 2131754428;
        } else {
            i3 = 2131752121;
        }
        return bd.M0(i3, null);
    }

    public final void h() {
        a aVar;
        u2 u2Var = this.G;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u2Var.f28440b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList arrayList = MediaController.c2;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f12571h0 = arrayList2;
        Collections.sort(arrayList2, new ci.y4(arrayList, 2));
        ArrayList arrayList3 = this.f12564c0;
        boolean isEmpty = arrayList3.isEmpty();
        pe peVar = f12558k0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.f12571h0;
            arrayList4.add(!arrayList4.isEmpty(), peVar);
        }
        boolean isEmpty2 = this.f12571h0.isEmpty();
        TextView textView = this.E;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.F, (Drawable) null);
        int size = this.f12571h0.size();
        for (int i3 = 0; i3 < size; i3++) {
            pe peVar2 = (pe) this.f12571h0.get(i3);
            if (peVar2 == peVar) {
                aVar = new a(getContext(), peVar2.d, bd.N0("StoryDraftsAlbum"), arrayList3.size(), this.f12561b);
            } else {
                ArrayList b10 = b(peVar2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), peVar2.d, peVar2.f24737c, b10.size(), this.f12561b);
                }
            }
            u2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new ai.d(19, this, peVar2));
        }
    }

    public final void i() {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2 = this.f12571h0;
        boolean z11 = true;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.f12571h0.get(0) == this.f12569f0 && this.f12564c0.size() > 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12565d0 = z10;
        if (z10 || (this.f12569f0 != f12558k0 && ((arrayList = this.f12571h0) == null || arrayList.isEmpty() || this.f12571h0.get(0) != this.f12569f0))) {
            z11 = false;
        }
        this.f12567e0 = z11;
    }

    public final void j() {
        float f10;
        float f11;
        int L;
        ArrayList arrayList = this.f12572i0;
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
                L = -org.telegram.messenger.g0.f22603n;
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            org.telegram.messenger.camera.q.l(scaleY.translationY(L), xq.h, 320L);
        }
        LinearLayout linearLayout = this.J;
        if (linearLayout != null) {
            d dVar = this.K;
            if (dVar != null) {
                dVar.i(bd.H(',', "StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            float f15 = 10.0f;
            int L2 = org.telegram.messenger.g0.L(10.0f);
            int L3 = org.telegram.messenger.g0.L(10.0f);
            int L4 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f22603n > 0) {
                f15 = 0.0f;
            }
            linearLayout.setPadding(L2, L3, L4, org.telegram.messenger.g0.L(f15) + org.telegram.messenger.g0.f22603n);
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
                alpha2.translationY(f12).setInterpolator(xq.h).setDuration(320L).setListener(new dh.x(10, this, z10)).start();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        hs.e().c(this, hs.f23295r2);
        hs.f(this.f12559a).c(this, hs.f23345y5);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.e().n(this, hs.f23295r2);
        hs.f(this.f12559a).n(this, hs.f23345y5);
        z2.f14006f0.clear();
        z2.f14007g0.evictAll();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = z2.f14004d0;
            if (i3 < arrayList.size()) {
                ((org.telegram.messenger.q5) arrayList.get(i3)).cleanupQueue();
                ((org.telegram.messenger.q5) arrayList.get(i3)).recycle();
                i3++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int L;
        float f10;
        float f11;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
        ci.j1 j1Var = this.d;
        j1Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int L2 = org.telegram.messenger.g0.L(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
        int L3 = org.telegram.messenger.g0.L(1.0f);
        LinearLayout linearLayout = this.J;
        if (linearLayout == null) {
            L = 0;
        } else {
            if (org.telegram.messenger.g0.f22603n > 0) {
                i11 = 0;
            } else {
                i11 = 10;
            }
            L = org.telegram.messenger.g0.L(i11 + 114);
        }
        j1Var.setPadding(L2, currentActionBarHeight2, L3, L + org.telegram.messenger.g0.f22603n);
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setTranslationY(-org.telegram.messenger.g0.f22603n);
        }
        if (linearLayout != null) {
            int L4 = org.telegram.messenger.g0.L(10.0f);
            int L5 = org.telegram.messenger.g0.L(10.0f);
            int L6 = org.telegram.messenger.g0.L(10.0f);
            if (org.telegram.messenger.g0.f22603n > 0) {
                f11 = 0.0f;
            } else {
                f11 = 10.0f;
            }
            linearLayout.setPadding(L4, L5, L6, org.telegram.messenger.g0.L(f11) + org.telegram.messenger.g0.f22603n);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = org.telegram.messenger.g0.f22603n;
        int i12 = org.telegram.messenger.g0.f22602m;
        int L7 = org.telegram.messenger.g0.L(10.0f);
        TextView textView = this.E;
        textView.setPadding(0, i12, L7, 0);
        if (!org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22608q;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i3, i10);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i3, i10);
    }

    public void setMaxCount(int i3) {
        this.S = i3;
    }

    public void setMultipleOnClick(boolean z10) {
        if (this.R != z10) {
            this.R = z10;
            org.telegram.messenger.g0.b4(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.W = runnable;
    }

    public void setOnSelectListener(n10 n10Var) {
        this.f12560a0 = n10Var;
    }

    public void setOnSelectMultipleListener(p10 p10Var) {
        this.f12562b0 = p10Var;
    }

    public void c(boolean z10) {
    }

    public void a() {
    }
}
