package fi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.wu0;
public final class e2 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f11855a;
    public final FrameLayout f11856b;
    public final ImageView f11857c;
    public final gl0 d;
    public final ah.i f11858e;
    public final int f11859f;
    public d2 h;
    public boolean f11860n;
    public final ImageView f11861r;
    public boolean f11862s;
    public boolean f11863w;
    public v10 f11864x;

    public e2(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f11859f = -1;
        this.f11855a = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11856b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.l6.f28246xf;
        Drawable d02 = org.telegram.ui.ActionBar.l6.d0(L, org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.s6.j(frameLayout, d02, M, null, g6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.ha.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f11857c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        gl0 gl0Var = new gl0();
        this.d = gl0Var;
        gl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.l6.f28265yf;
        gl0Var.a(org.telegram.ui.ActionBar.l6.w0(i10, g6Var));
        imageView.setImageDrawable(gl0Var);
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.f11858e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.s6.D(iVar, i10, g6Var);
        org.telegram.ui.ActionBar.s6.U(iVar, org.telegram.ui.ActionBar.l6.G6, g6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(id.M0(2131745836, null));
        int i11 = org.telegram.ui.ActionBar.l6.Ai;
        org.telegram.ui.ActionBar.s6.l(iVar, 30, i11, g6Var);
        org.telegram.ui.ActionBar.s6.l(iVar, 36, i11, g6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 4));
        ImageView imageView2 = new ImageView(context);
        this.f11861r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new c2(g6Var));
        int i12 = org.telegram.ui.ActionBar.l6.f27957i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.o6 M2 = org.telegram.ui.ActionBar.s6.M(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView2, h02, null, M2, g6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e2 f11590b;

            {
                this.f11590b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11590b.b();
                        return;
                    default:
                        e2 e2Var = this.f11590b;
                        int i13 = e2Var.d.f33979k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            e2Var.f11858e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e2 f11590b;

            {
                this.f11590b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11590b.b();
                        return;
                    default:
                        e2 e2Var = this.f11590b;
                        int i13 = e2Var.d.f33979k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            e2Var.f11858e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i7, boolean z9) {
        int i10;
        ah.i iVar;
        if (this.f11859f == i7 && this.h != null) {
            return;
        }
        d2 d2Var = this.h;
        FrameLayout frameLayout = this.f11856b;
        if (d2Var != null) {
            frameLayout.removeView(d2Var);
        }
        Context context = getContext();
        if (i7 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        d2 d2Var2 = new d2(this, context, i10, this.f11855a, z9);
        this.h = d2Var2;
        d2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f11858e.getPaint().measureText(((Object) iVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new c20(this) {
            public final e2 f11648b;

            {
                this.f11648b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        e2 e2Var = this.f11648b;
                        ah.i iVar2 = e2Var.f11858e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        e2Var.d(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        e2 e2Var2 = this.f11648b;
                        d2 d2Var3 = e2Var2.h;
                        if (d2Var3 != null) {
                            if (d2Var3.getSelectedCategory() == wu0Var) {
                                e2Var2.h.I1(null);
                                v10 v10Var = e2Var2.f11864x;
                                if (v10Var != null) {
                                    v10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            e2Var2.h.I1(wu0Var);
                            String str = wu0Var.f40165a;
                            int categoryIndex = e2Var2.h.getCategoryIndex();
                            v10 v10Var2 = e2Var2.f11864x;
                            if (v10Var2 != null) {
                                v10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new c20(this) {
            public final e2 f11648b;

            {
                this.f11648b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        e2 e2Var = this.f11648b;
                        ah.i iVar2 = e2Var.f11858e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        e2Var.d(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        e2 e2Var2 = this.f11648b;
                        d2 d2Var3 = e2Var2.h;
                        if (d2Var3 != null) {
                            if (d2Var3.getSelectedCategory() == wu0Var) {
                                e2Var2.h.I1(null);
                                v10 v10Var = e2Var2.f11864x;
                                if (v10Var != null) {
                                    v10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            e2Var2.h.I1(wu0Var);
                            String str = wu0Var.f40165a;
                            int categoryIndex = e2Var2.h.getCategoryIndex();
                            v10 v10Var2 = e2Var2.f11864x;
                            if (v10Var2 != null) {
                                v10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.ha.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.f11858e.setText("");
        v10 v10Var = this.f11864x;
        if (v10Var != null) {
            v10Var.a(null, -1);
        }
        d2 d2Var = this.h;
        if (d2Var != null) {
            d2Var.I1(null);
        }
    }

    public final void c(boolean z9) {
        this.f11863w = z9;
        if (z9) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z9) {
        int i7;
        d2 d2Var;
        d2 d2Var2;
        boolean z10 = this.f11863w;
        ah.i iVar = this.f11858e;
        if (z10 && ((iVar.length() != 0 || ((d2Var2 = this.h) != null && d2Var2.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (iVar.length() <= 0 && ((d2Var = this.h) == null || d2Var.f32001v3 <= 0.5f || ((d2Var == null || !d2Var.f31996q3) && d2Var.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.d.b(i7);
        this.f11863w = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            gl0 gl0Var = this.d;
            org.telegram.ui.ActionBar.g6 g6Var = this.f11855a;
            if (gl0Var != null) {
                gl0Var.a(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28265yf, g6Var));
            }
            ImageView imageView = this.f11857c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.f11858e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.l6.Ai;
                iVar.setCursorColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.l6.w0(i7, g6Var));
            }
            ImageView imageView2 = this.f11861r;
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
