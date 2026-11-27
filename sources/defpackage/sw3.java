package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
public final class sw3 extends FrameLayout implements snb {
    public final vnb a;
    public final FrameLayout b;
    public final ImageView c;
    public final dw9 d;
    public final m7 e;
    public final int f;
    public rw3 h;
    public boolean n;
    public final ImageView r;
    public boolean s;
    public boolean w;
    public icc x;

    public sw3(Context context, vnb vnbVar) {
        super(context);
        this.f = -1;
        this.a = vnbVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        int L = hl.L(18.0f);
        int i = aob.Af;
        Drawable b0 = aob.b0(L, aob.v0(i, vnbVar));
        uob M = yob.M(i);
        frameLayout.setBackground(b0);
        yob.j(frameLayout, b0, M, null, vnbVar);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new yi((byte) 3));
        addView(frameLayout, tre.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, tre.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        dw9 dw9Var = new dw9();
        this.d = dw9Var;
        dw9Var.c(0, false, false);
        int i2 = aob.Bf;
        dw9Var.a(aob.v0(i2, vnbVar));
        imageView.setImageDrawable(dw9Var);
        frameLayout.addView(imageView, tre.e(36, 36, 51));
        m7 m7Var = new m7((byte) 2, context, this);
        this.e = m7Var;
        m7Var.setTextSize(1, 16.0f);
        yob.D(m7Var, i2, vnbVar);
        yob.X(m7Var, aob.G6, vnbVar);
        m7Var.setBackgroundDrawable(null);
        m7Var.setPadding(0, 0, 0, 0);
        m7Var.setMaxLines(1);
        m7Var.setLines(1);
        m7Var.setSingleLine(true);
        m7Var.setImeOptions(268435459);
        m7Var.setHint(ob6.M0(2131745564, null));
        int i3 = aob.Di;
        yob.l(m7Var, 30, i3, vnbVar);
        yob.l(m7Var, 36, i3, vnbVar);
        m7Var.setCursorSize(hl.L(20.0f));
        m7Var.setCursorWidth(1.5f);
        m7Var.setTranslationY(hl.L(-2.0f));
        frameLayout2.addView(m7Var, tre.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        m7Var.addTextChangedListener(new c7(this, (byte) 20));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e7(vnbVar));
        int i4 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i4, vnbVar), 1, hl.L(15.0f));
        uob M2 = yob.M(i4);
        imageView2.setBackground(f0);
        yob.j(imageView2, f0, null, M2, vnbVar);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final sw3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                sw3 sw3Var = this.b;
                switch (b) {
                    case 0:
                        sw3Var.b();
                        return;
                    default:
                        byte b2 = sw3Var.d.k;
                        if (b2 == 1) {
                            sw3Var.b();
                            rw3 rw3Var = sw3Var.h;
                            if (rw3Var != null) {
                                rw3Var.H1();
                                return;
                            }
                            return;
                        } else if (b2 == 0) {
                            sw3Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, tre.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final sw3 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                sw3 sw3Var = this.b;
                switch (b) {
                    case 0:
                        sw3Var.b();
                        return;
                    default:
                        byte b2 = sw3Var.d.k;
                        if (b2 == 1) {
                            sw3Var.b();
                            rw3 rw3Var = sw3Var.h;
                            if (rw3Var != null) {
                                rw3Var.H1();
                                return;
                            }
                            return;
                        } else if (b2 == 0) {
                            sw3Var.e.requestFocus();
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
        m7 m7Var;
        if (this.f == i && this.h != null) {
            return;
        }
        rw3 rw3Var = this.h;
        FrameLayout frameLayout = this.b;
        if (rw3Var != null) {
            frameLayout.removeView(rw3Var);
        }
        Context context = getContext();
        if (i == 1) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        rw3 rw3Var2 = new rw3(this, context, i2, this.a, z);
        this.h = rw3Var2;
        rw3Var2.setDontOccupyWidth(hl.L(16.0f) + ((int) this.e.getPaint().measureText(((Object) m7Var.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new pcc(this) {
            public final sw3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r2;
                sw3 sw3Var = this.b;
                switch (b) {
                    case 0:
                        m7 m7Var2 = sw3Var.e;
                        m7Var2.animate().cancel();
                        m7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        sw3Var.d(false);
                        return;
                    default:
                        q2b q2bVar = (q2b) obj;
                        rw3 rw3Var3 = sw3Var.h;
                        if (rw3Var3 != null) {
                            q2b selectedCategory = rw3Var3.getSelectedCategory();
                            rw3 rw3Var4 = sw3Var.h;
                            if (selectedCategory == q2bVar) {
                                rw3Var4.J1(null);
                                icc iccVar = sw3Var.x;
                                if (iccVar != null) {
                                    iccVar.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            rw3Var4.J1(q2bVar);
                            String str = q2bVar.a;
                            int categoryIndex = sw3Var.h.getCategoryIndex();
                            icc iccVar2 = sw3Var.x;
                            if (iccVar2 != null) {
                                iccVar2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new pcc(this) {
            public final sw3 b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj) {
                byte b = r2;
                sw3 sw3Var = this.b;
                switch (b) {
                    case 0:
                        m7 m7Var2 = sw3Var.e;
                        m7Var2.animate().cancel();
                        m7Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        sw3Var.d(false);
                        return;
                    default:
                        q2b q2bVar = (q2b) obj;
                        rw3 rw3Var3 = sw3Var.h;
                        if (rw3Var3 != null) {
                            q2b selectedCategory = rw3Var3.getSelectedCategory();
                            rw3 rw3Var4 = sw3Var.h;
                            if (selectedCategory == q2bVar) {
                                rw3Var4.J1(null);
                                icc iccVar = sw3Var.x;
                                if (iccVar != null) {
                                    iccVar.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            rw3Var4.J1(q2bVar);
                            String str = q2bVar.a;
                            int categoryIndex = sw3Var.h.getCategoryIndex();
                            icc iccVar2 = sw3Var.x;
                            if (iccVar2 != null) {
                                iccVar2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), tre.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.e.setText("");
        icc iccVar = this.x;
        if (iccVar != null) {
            iccVar.a(null, -1);
        }
        rw3 rw3Var = this.h;
        if (rw3Var != null) {
            rw3Var.J1(null);
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
        rw3 rw3Var;
        rw3 rw3Var2;
        boolean z2 = this.w;
        m7 m7Var = this.e;
        if (z2 && ((m7Var.length() != 0 || ((rw3Var2 = this.h) != null && rw3Var2.getSelectedCategory() != null)) && !z)) {
            return;
        }
        if (m7Var.length() <= 0 && ((rw3Var = this.h) == null || rw3Var.w3 <= 0.5f || ((rw3Var == null || !rw3Var.r3) && rw3Var.getSelectedCategory() == null))) {
            i = 0;
        } else {
            i = 1;
        }
        this.d.b(i);
        this.w = false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            dw9 dw9Var = this.d;
            vnb vnbVar = this.a;
            if (dw9Var != null) {
                dw9Var.a(aob.v0(aob.Bf, vnbVar));
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.invalidate();
            }
            m7 m7Var = this.e;
            if (m7Var != null) {
                int i = aob.Di;
                m7Var.setCursorColor(aob.v0(i, vnbVar));
                m7Var.setHandlesColor(aob.v0(i, vnbVar));
            }
            ImageView imageView2 = this.r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
