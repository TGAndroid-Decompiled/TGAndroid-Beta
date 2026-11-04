package gi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tu0;
public final class d2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f12548a;
    public final FrameLayout f12549b;
    public final ImageView f12550c;
    public final jl0 d;
    public final bh.g f12551e;
    public final int f12552f;
    public c2 h;
    public boolean f12553n;
    public final ImageView f12554r;
    public boolean f12555s;
    public boolean f12556w;
    public n10 f12557x;

    public d2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f12552f = -1;
        this.f12548a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12549b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i3 = org.telegram.ui.ActionBar.k6.f28262xf;
        Drawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(frameLayout, d02, N, null, e6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new cg.p0(4));
        addView(frameLayout, mf.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, mf.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f12550c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        jl0 jl0Var = new jl0();
        this.d = jl0Var;
        jl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.k6.f28280yf;
        jl0Var.a(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
        imageView.setImageDrawable(jl0Var);
        frameLayout.addView(imageView, mf.e(36, 36, 51));
        bh.g gVar = new bh.g(1, context, this);
        this.f12551e = gVar;
        gVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.E(gVar, i10, e6Var);
        org.telegram.ui.ActionBar.r6.V(gVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setImeOptions(268435459);
        gVar.setHint(bd.M0(2131745846, null));
        int i11 = org.telegram.ui.ActionBar.k6.Ai;
        org.telegram.ui.ActionBar.r6.m(gVar, 30, i11, e6Var);
        org.telegram.ui.ActionBar.r6.m(gVar, 36, i11, e6Var);
        gVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        gVar.setCursorWidth(1.5f);
        gVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(gVar, mf.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gVar.addTextChangedListener(new bh.h(this, 4));
        ImageView imageView2 = new ImageView(context);
        this.f12554r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(e6Var));
        int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView2, h02, null, N2, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f14003b;

            {
                this.f14003b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14003b.b();
                        return;
                    default:
                        d2 d2Var = this.f14003b;
                        int i13 = d2Var.d.f35109k;
                        if (i13 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            d2Var.f12551e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, mf.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f14003b;

            {
                this.f14003b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14003b.b();
                        return;
                    default:
                        d2 d2Var = this.f14003b;
                        int i13 = d2Var.d.f35109k;
                        if (i13 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            d2Var.f12551e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i3, boolean z10) {
        int i10;
        bh.g gVar;
        if (this.f12552f == i3 && this.h != null) {
            return;
        }
        c2 c2Var = this.h;
        FrameLayout frameLayout = this.f12549b;
        if (c2Var != null) {
            frameLayout.removeView(c2Var);
        }
        Context context = getContext();
        if (i3 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        c2 c2Var2 = new c2(this, context, i10, this.f12548a, z10);
        this.h = c2Var2;
        c2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f12551e.getPaint().measureText(((Object) gVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new u10(this) {
            public final d2 f12385b;

            {
                this.f12385b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f12385b;
                        bh.g gVar2 = d2Var.f12551e;
                        gVar2.animate().cancel();
                        gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        tu0 tu0Var = (tu0) obj;
                        d2 d2Var2 = this.f12385b;
                        c2 c2Var3 = d2Var2.h;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == tu0Var) {
                                d2Var2.h.I1(null);
                                n10 n10Var = d2Var2.f12557x;
                                if (n10Var != null) {
                                    n10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.h.I1(tu0Var);
                            String str = tu0Var.f38555a;
                            int categoryIndex = d2Var2.h.getCategoryIndex();
                            n10 n10Var2 = d2Var2.f12557x;
                            if (n10Var2 != null) {
                                n10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new u10(this) {
            public final d2 f12385b;

            {
                this.f12385b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f12385b;
                        bh.g gVar2 = d2Var.f12551e;
                        gVar2.animate().cancel();
                        gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        tu0 tu0Var = (tu0) obj;
                        d2 d2Var2 = this.f12385b;
                        c2 c2Var3 = d2Var2.h;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == tu0Var) {
                                d2Var2.h.I1(null);
                                n10 n10Var = d2Var2.f12557x;
                                if (n10Var != null) {
                                    n10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.h.I1(tu0Var);
                            String str = tu0Var.f38555a;
                            int categoryIndex = d2Var2.h.getCategoryIndex();
                            n10 n10Var2 = d2Var2.f12557x;
                            if (n10Var2 != null) {
                                n10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), mf.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.f12551e.setText("");
        n10 n10Var = this.f12557x;
        if (n10Var != null) {
            n10Var.a(null, -1);
        }
        c2 c2Var = this.h;
        if (c2Var != null) {
            c2Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.f12556w = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i3;
        c2 c2Var;
        c2 c2Var2;
        boolean z11 = this.f12556w;
        bh.g gVar = this.f12551e;
        if (z11 && ((gVar.length() != 0 || ((c2Var2 = this.h) != null && c2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (gVar.length() <= 0 && ((c2Var = this.h) == null || c2Var.f40499w3 <= 0.5f || ((c2Var == null || !c2Var.f40494r3) && c2Var.getSelectedCategory() == null))) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.d.b(i3);
        this.f12556w = false;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            jl0 jl0Var = this.d;
            org.telegram.ui.ActionBar.e6 e6Var = this.f12548a;
            if (jl0Var != null) {
                jl0Var.a(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28280yf, e6Var));
            }
            ImageView imageView = this.f12550c;
            if (imageView != null) {
                imageView.invalidate();
            }
            bh.g gVar = this.f12551e;
            if (gVar != null) {
                int i3 = org.telegram.ui.ActionBar.k6.Ai;
                gVar.setCursorColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
                gVar.setHandlesColor(org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
            }
            ImageView imageView2 = this.f12554r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
