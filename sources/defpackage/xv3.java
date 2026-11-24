package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class xv3 extends FrameLayout implements tjb {
    public final wjb a;
    public final FrameLayout b;
    public final ImageView c;
    public final ks9 d;
    public final l7 e;
    public final int f;
    public wv3 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public i8c x;

    public xv3(Context context, wjb wjbVar) {
        super(context);
        this.f = -1;
        this.a = wjbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = gl.L(18.0f);
        int i = bkb.zf;
        Drawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        frameLayout.setBackground(b0);
        zkb.j(frameLayout, b0, M, null, wjbVar);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new xi((byte) 3));
        addView(frameLayout, nme.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, nme.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ks9 ks9Var = new ks9();
        this.d = ks9Var;
        ks9Var.c(0, false, false);
        int i2 = bkb.Af;
        ks9Var.a(bkb.v0(i2, wjbVar));
        imageView.setImageDrawable(ks9Var);
        frameLayout.addView(imageView, nme.e(36, 36, 51));
        l7 l7Var = new l7((byte) 2, context, this);
        this.e = l7Var;
        l7Var.setTextSize(1, 16.0f);
        zkb.D(l7Var, i2, wjbVar);
        zkb.X(l7Var, bkb.F6, wjbVar);
        l7Var.setBackgroundDrawable(null);
        l7Var.setPadding(0, 0, 0, 0);
        l7Var.setMaxLines(1);
        l7Var.setLines(1);
        l7Var.setSingleLine(true);
        l7Var.setImeOptions(268435459);
        l7Var.setHint(k96.M0(2131745644, null));
        int i3 = bkb.Ci;
        zkb.l(l7Var, 30, i3, wjbVar);
        zkb.l(l7Var, 36, i3, wjbVar);
        l7Var.setCursorSize(gl.L(20.0f));
        l7Var.setCursorWidth(1.5f);
        l7Var.setTranslationY(gl.L(-2.0f));
        frameLayout2.addView(l7Var, nme.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        l7Var.addTextChangedListener(new b7(this, (byte) 20));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d7(wjbVar));
        int i4 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 1, gl.L(15.0f));
        vkb M2 = zkb.M(i4);
        imageView2.setBackground(f0);
        zkb.j(imageView2, f0, null, M2, wjbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final xv3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                xv3 xv3Var = this.b;
                switch (b) {
                    case 0:
                        xv3Var.b();
                        return;
                    default:
                        byte b2 = xv3Var.d.k;
                        if (b2 == 1) {
                            xv3Var.b();
                            wv3 wv3Var = xv3Var.h;
                            if (wv3Var != null) {
                                wv3Var.G1();
                                return;
                            }
                            return;
                        } else if (b2 == 0) {
                            xv3Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, nme.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final xv3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                xv3 xv3Var = this.b;
                switch (b) {
                    case 0:
                        xv3Var.b();
                        return;
                    default:
                        byte b2 = xv3Var.d.k;
                        if (b2 == 1) {
                            xv3Var.b();
                            wv3 wv3Var = xv3Var.h;
                            if (wv3Var != null) {
                                wv3Var.G1();
                                return;
                            }
                            return;
                        } else if (b2 == 0) {
                            xv3Var.e.requestFocus();
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
        wv3 wv3Var = this.h;
        FrameLayout frameLayout = this.b;
        if (wv3Var != null) {
            frameLayout.removeView(wv3Var);
        }
        Context context = getContext();
        if (i == 1) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        wv3 wv3Var2 = new wv3(this, context, i2, this.a, z);
        this.h = wv3Var2;
        wv3Var2.setDontOccupyWidth(gl.L(16.0f) + ((int) this.e.getPaint().measureText(((Object) l7Var.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new p8c(this) {
            public final xv3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r2;
                xv3 xv3Var = this.b;
                switch (b) {
                    case 0:
                        l7 l7Var2 = xv3Var.e;
                        l7Var2.animate().cancel();
                        l7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        xv3Var.d(false);
                        return;
                    default:
                        qya qyaVar = (qya) obj;
                        wv3 wv3Var3 = xv3Var.h;
                        if (wv3Var3 != null) {
                            qya selectedCategory = wv3Var3.getSelectedCategory();
                            wv3 wv3Var4 = xv3Var.h;
                            if (selectedCategory == qyaVar) {
                                wv3Var4.I1(null);
                                i8c i8cVar = xv3Var.x;
                                if (i8cVar != null) {
                                    i8cVar.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            wv3Var4.I1(qyaVar);
                            String str = qyaVar.a;
                            int categoryIndex = xv3Var.h.getCategoryIndex();
                            i8c i8cVar2 = xv3Var.x;
                            if (i8cVar2 != null) {
                                i8cVar2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new p8c(this) {
            public final xv3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r2;
                xv3 xv3Var = this.b;
                switch (b) {
                    case 0:
                        l7 l7Var2 = xv3Var.e;
                        l7Var2.animate().cancel();
                        l7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        xv3Var.d(false);
                        return;
                    default:
                        qya qyaVar = (qya) obj;
                        wv3 wv3Var3 = xv3Var.h;
                        if (wv3Var3 != null) {
                            qya selectedCategory = wv3Var3.getSelectedCategory();
                            wv3 wv3Var4 = xv3Var.h;
                            if (selectedCategory == qyaVar) {
                                wv3Var4.I1(null);
                                i8c i8cVar = xv3Var.x;
                                if (i8cVar != null) {
                                    i8cVar.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            wv3Var4.I1(qyaVar);
                            String str = qyaVar.a;
                            int categoryIndex = xv3Var.h.getCategoryIndex();
                            i8c i8cVar2 = xv3Var.x;
                            if (i8cVar2 != null) {
                                i8cVar2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), nme.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.e.setText("");
        i8c i8cVar = this.x;
        if (i8cVar != null) {
            i8cVar.a(null, -1);
        }
        wv3 wv3Var = this.h;
        if (wv3Var != null) {
            wv3Var.I1(null);
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
        wv3 wv3Var;
        wv3 wv3Var2;
        boolean z2 = this.w;
        l7 l7Var = this.e;
        if (z2 && ((l7Var.length() != 0 || ((wv3Var2 = this.h) != null && wv3Var2.getSelectedCategory() != null)) && !z)) {
            return;
        }
        if (l7Var.length() <= 0 && ((wv3Var = this.h) == null || wv3Var.w3 <= 0.5f || ((wv3Var == null || !wv3Var.r3) && wv3Var.getSelectedCategory() == null))) {
            i = 0;
        } else {
            i = 1;
        }
        this.d.b(i);
        this.w = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ks9 ks9Var = this.d;
            wjb wjbVar = this.a;
            if (ks9Var != null) {
                ks9Var.a(bkb.v0(bkb.Af, wjbVar));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            l7 l7Var = this.e;
            if (l7Var != null) {
                int i = bkb.Ci;
                l7Var.setCursorColor(bkb.v0(i, wjbVar));
                l7Var.setHandlesColor(bkb.v0(i, wjbVar));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
