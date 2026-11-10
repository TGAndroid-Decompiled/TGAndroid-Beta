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
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.vu0;
public final class e2 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.h6 f11859a;
    public final FrameLayout f11860b;
    public final ImageView f11861c;
    public final fl0 d;
    public final ah.i f11862e;
    public final int f11863f;
    public d2 h;
    public boolean f11864n;
    public final ImageView f11865r;
    public boolean f11866s;
    public boolean f11867w;
    public v10 f11868x;

    public e2(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f11863f = -1;
        this.f11859a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f11860b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.f28271xf;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.ha.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f11861c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        fl0 fl0Var = new fl0();
        this.d = fl0Var;
        fl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.m6.f28290yf;
        fl0Var.a(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        imageView.setImageDrawable(fl0Var);
        frameLayout.addView(imageView, c8.ha.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.f11862e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.D(iVar, i10, h6Var);
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(id.M0(2131745836, null));
        int i11 = org.telegram.ui.ActionBar.m6.Ai;
        org.telegram.ui.ActionBar.t6.l(iVar, 30, i11, h6Var);
        org.telegram.ui.ActionBar.t6.l(iVar, 36, i11, h6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ha.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 4));
        ImageView imageView2 = new ImageView(context);
        this.f11865r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new c2(h6Var));
        int i12 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final e2 f11595b;

            {
                this.f11595b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11595b.b();
                        return;
                    default:
                        e2 e2Var = this.f11595b;
                        int i13 = e2Var.d.f33574k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            e2Var.f11862e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, c8.ha.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final e2 f11595b;

            {
                this.f11595b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f11595b.b();
                        return;
                    default:
                        e2 e2Var = this.f11595b;
                        int i13 = e2Var.d.f33574k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.h;
                            if (d2Var != null) {
                                d2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            e2Var.f11862e.requestFocus();
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
        if (this.f11863f == i7 && this.h != null) {
            return;
        }
        d2 d2Var = this.h;
        FrameLayout frameLayout = this.f11860b;
        if (d2Var != null) {
            frameLayout.removeView(d2Var);
        }
        Context context = getContext();
        if (i7 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        d2 d2Var2 = new d2(this, context, i10, this.f11859a, z9);
        this.h = d2Var2;
        d2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f11862e.getPaint().measureText(((Object) iVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new c20(this) {
            public final e2 f11653b;

            {
                this.f11653b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        e2 e2Var = this.f11653b;
                        ah.i iVar2 = e2Var.f11862e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        e2Var.d(false);
                        return;
                    default:
                        vu0 vu0Var = (vu0) obj;
                        e2 e2Var2 = this.f11653b;
                        d2 d2Var3 = e2Var2.h;
                        if (d2Var3 != null) {
                            if (d2Var3.getSelectedCategory() == vu0Var) {
                                e2Var2.h.I1(null);
                                v10 v10Var = e2Var2.f11868x;
                                if (v10Var != null) {
                                    v10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            e2Var2.h.I1(vu0Var);
                            String str = vu0Var.f39747a;
                            int categoryIndex = e2Var2.h.getCategoryIndex();
                            v10 v10Var2 = e2Var2.f11868x;
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
            public final e2 f11653b;

            {
                this.f11653b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        e2 e2Var = this.f11653b;
                        ah.i iVar2 = e2Var.f11862e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        e2Var.d(false);
                        return;
                    default:
                        vu0 vu0Var = (vu0) obj;
                        e2 e2Var2 = this.f11653b;
                        d2 d2Var3 = e2Var2.h;
                        if (d2Var3 != null) {
                            if (d2Var3.getSelectedCategory() == vu0Var) {
                                e2Var2.h.I1(null);
                                v10 v10Var = e2Var2.f11868x;
                                if (v10Var != null) {
                                    v10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            e2Var2.h.I1(vu0Var);
                            String str = vu0Var.f39747a;
                            int categoryIndex = e2Var2.h.getCategoryIndex();
                            v10 v10Var2 = e2Var2.f11868x;
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
        this.f11862e.setText("");
        v10 v10Var = this.f11868x;
        if (v10Var != null) {
            v10Var.a(null, -1);
        }
        d2 d2Var = this.h;
        if (d2Var != null) {
            d2Var.I1(null);
        }
    }

    public final void c(boolean z9) {
        this.f11867w = z9;
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
        boolean z10 = this.f11867w;
        ah.i iVar = this.f11862e;
        if (z10 && ((iVar.length() != 0 || ((d2Var2 = this.h) != null && d2Var2.getSelectedCategory() != null)) && !z9)) {
            return;
        }
        if (iVar.length() <= 0 && ((d2Var = this.h) == null || d2Var.f41138v3 <= 0.5f || ((d2Var == null || !d2Var.f41133q3) && d2Var.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.d.b(i7);
        this.f11867w = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            fl0 fl0Var = this.d;
            org.telegram.ui.ActionBar.h6 h6Var = this.f11859a;
            if (fl0Var != null) {
                fl0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28290yf, h6Var));
            }
            ImageView imageView = this.f11861c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.f11862e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Ai;
                iVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            }
            ImageView imageView2 = this.f11865r;
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
