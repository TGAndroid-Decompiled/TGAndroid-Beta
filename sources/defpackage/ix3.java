package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class ix3 extends FrameLayout implements vlb {
    public final ylb a;
    public final FrameLayout b;
    public final ImageView c;
    public final mu9 d;
    public final l7 e;
    public final int f;
    public hx3 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public jac x;

    public ix3(Context context, ylb ylbVar) {
        super(context);
        this.f = -1;
        this.a = ylbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = gm.L(18.0f);
        int i = cmb.zf;
        Drawable b0 = cmb.b0(L, cmb.v0(i, ylbVar));
        wmb M = anb.M(i);
        frameLayout.setBackground(b0);
        anb.j(frameLayout, b0, M, null, ylbVar);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new xj((byte) 3));
        addView(frameLayout, qoe.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, qoe.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        mu9 mu9Var = new mu9();
        this.d = mu9Var;
        mu9Var.c(0, false, false);
        int i2 = cmb.Af;
        mu9Var.a(cmb.v0(i2, ylbVar));
        imageView.setImageDrawable(mu9Var);
        frameLayout.addView(imageView, qoe.e(36, 36, 51));
        l7 l7Var = new l7((byte) 2, context, this);
        this.e = l7Var;
        l7Var.setTextSize(1, 16.0f);
        anb.D(l7Var, i2, ylbVar);
        anb.X(l7Var, cmb.F6, ylbVar);
        l7Var.setBackgroundDrawable(null);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setMaxLines(1);
        l7Var.setLines(1);
        l7Var.setSingleLine(true);
        l7Var.setImeOptions(268435459);
        l7Var.setHint(jb6.M0(2131745570, null));
        int i3 = cmb.Ci;
        anb.l(l7Var, 30, i3, ylbVar);
        anb.l(l7Var, 36, i3, ylbVar);
        l7Var.setCursorSize(gm.L(20.0f));
        l7Var.setCursorWidth(1.5f);
        l7Var.setTranslationY(gm.L(-2.0f));
        frameLayout2.addView(l7Var, qoe.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        l7Var.addTextChangedListener(new b7(this, (byte) 21));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(ylbVar));
        int i4 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i4, ylbVar), 1, gm.L(15.0f));
        wmb M2 = anb.M(i4);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M2, ylbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final ix3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ix3 ix3Var = this.b;
                switch (b) {
                    case 0:
                        ix3Var.b();
                        return;
                    default:
                        byte b2 = ix3Var.d.k;
                        if (b2 == 1) {
                            ix3Var.b();
                            hx3 hx3Var = ix3Var.h;
                            if (hx3Var != null) {
                                hx3Var.G1();
                                return;
                            }
                            return;
                        } else if (b2 == 0) {
                            ix3Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, qoe.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ix3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                ix3 ix3Var = this.b;
                switch (b) {
                    case 0:
                        ix3Var.b();
                        return;
                    default:
                        byte b2 = ix3Var.d.k;
                        if (b2 == 1) {
                            ix3Var.b();
                            hx3 hx3Var = ix3Var.h;
                            if (hx3Var != null) {
                                hx3Var.G1();
                                return;
                            }
                            return;
                        } else if (b2 == 0) {
                            ix3Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i, boolean z) {
        int i2;
        l7 l7Var;
        if (this.f == i && this.h != null) {
            return;
        }
        hx3 hx3Var = this.h;
        FrameLayout frameLayout = this.b;
        if (hx3Var != null) {
            frameLayout.removeView(hx3Var);
        }
        Context context = getContext();
        if (i == 1) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        hx3 hx3Var2 = new hx3(this, context, i2, this.a, z);
        this.h = hx3Var2;
        hx3Var2.setDontOccupyWidth(gm.L(16.0f) + ((int) this.e.getPaint().measureText(((Object) l7Var.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new qac(this) {
            public final ix3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r2;
                ix3 ix3Var = this.b;
                switch (b) {
                    case 0:
                        l7 l7Var2 = ix3Var.e;
                        l7Var2.animate().cancel();
                        l7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        ix3Var.d(false);
                        return;
                    default:
                        r0b r0bVar = (r0b) obj;
                        hx3 hx3Var3 = ix3Var.h;
                        if (hx3Var3 != null) {
                            r0b selectedCategory = hx3Var3.getSelectedCategory();
                            hx3 hx3Var4 = ix3Var.h;
                            if (selectedCategory == r0bVar) {
                                hx3Var4.I1(null);
                                jac jacVar = ix3Var.x;
                                if (jacVar != null) {
                                    jacVar.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            hx3Var4.I1(r0bVar);
                            String str = r0bVar.a;
                            int categoryIndex = ix3Var.h.getCategoryIndex();
                            jac jacVar2 = ix3Var.x;
                            if (jacVar2 != null) {
                                jacVar2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new qac(this) {
            public final ix3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r2;
                ix3 ix3Var = this.b;
                switch (b) {
                    case 0:
                        l7 l7Var2 = ix3Var.e;
                        l7Var2.animate().cancel();
                        l7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        ix3Var.d(false);
                        return;
                    default:
                        r0b r0bVar = (r0b) obj;
                        hx3 hx3Var3 = ix3Var.h;
                        if (hx3Var3 != null) {
                            r0b selectedCategory = hx3Var3.getSelectedCategory();
                            hx3 hx3Var4 = ix3Var.h;
                            if (selectedCategory == r0bVar) {
                                hx3Var4.I1(null);
                                jac jacVar = ix3Var.x;
                                if (jacVar != null) {
                                    jacVar.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            hx3Var4.I1(r0bVar);
                            String str = r0bVar.a;
                            int categoryIndex = ix3Var.h.getCategoryIndex();
                            jac jacVar2 = ix3Var.x;
                            if (jacVar2 != null) {
                                jacVar2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), qoe.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.e.setText("");
        jac jacVar = this.x;
        if (jacVar != null) {
            jacVar.a(null, -1);
        }
        hx3 hx3Var = this.h;
        if (hx3Var != null) {
            hx3Var.I1(null);
        }
    }

    public final void c(boolean z) {
        this.w = z;
        if (z) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z) {
        int i;
        hx3 hx3Var;
        hx3 hx3Var2;
        boolean z2 = this.w;
        l7 l7Var = this.e;
        if (z2 && ((l7Var.length() != 0 || ((hx3Var2 = this.h) != null && hx3Var2.getSelectedCategory() != null)) && !z)) {
            return;
        }
        if (l7Var.length() <= 0 && ((hx3Var = this.h) == null || hx3Var.w3 <= 0.5f || ((hx3Var == null || !hx3Var.r3) && hx3Var.getSelectedCategory() == null))) {
            i = 0;
        } else {
            i = 1;
        }
        this.d.b(i);
        this.w = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            mu9 mu9Var = this.d;
            ylb ylbVar = this.a;
            if (mu9Var != null) {
                mu9Var.a(cmb.v0(cmb.Af, ylbVar));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            l7 l7Var = this.e;
            if (l7Var != null) {
                int i = cmb.Ci;
                l7Var.setCursorColor(cmb.v0(i, ylbVar));
                l7Var.setHandlesColor(cmb.v0(i, ylbVar));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
