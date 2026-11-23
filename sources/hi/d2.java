package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.ul0;
public final class d2 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f14476a;
    public final FrameLayout f14477b;
    public final ImageView f14478c;
    public final ul0 d;
    public final ah.i f14479e;
    public final int f14480f;
    public c2 h;
    public boolean f14481n;
    public final ImageView f14482r;
    public boolean f14483s;
    public boolean f14484w;
    public r10 f14485x;

    public d2(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f14480f = -1;
        this.f14476a = h6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14477b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Af;
        Drawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(frameLayout, d02, M, null, h6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.ma.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14478c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ul0 ul0Var = new ul0();
        this.d = ul0Var;
        ul0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.m6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        imageView.setImageDrawable(ul0Var);
        frameLayout.addView(imageView, c8.ma.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.f14479e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.t6.D(iVar, i10, h6Var);
        org.telegram.ui.ActionBar.t6.U(iVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(hd.N0(2131745640, null));
        int i11 = org.telegram.ui.ActionBar.m6.Di;
        org.telegram.ui.ActionBar.t6.l(iVar, 30, i11, h6Var);
        org.telegram.ui.ActionBar.t6.l(iVar, 36, i11, h6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ma.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 6));
        ImageView imageView2 = new ImageView(context);
        this.f14482r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(h6Var));
        int i12 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.p6 M2 = org.telegram.ui.ActionBar.t6.M(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView2, h02, null, M2, h6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f15832b;

            {
                this.f15832b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15832b.b();
                        return;
                    default:
                        d2 d2Var = this.f15832b;
                        int i13 = d2Var.d.f40486k;
                        if (i13 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            d2Var.f14479e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, c8.ma.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f15832b;

            {
                this.f15832b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15832b.b();
                        return;
                    default:
                        d2 d2Var = this.f15832b;
                        int i13 = d2Var.d.f40486k;
                        if (i13 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            d2Var.f14479e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i7, boolean z10) {
        int i10;
        ah.i iVar;
        if (this.f14480f == i7 && this.h != null) {
            return;
        }
        c2 c2Var = this.h;
        FrameLayout frameLayout = this.f14477b;
        if (c2Var != null) {
            frameLayout.removeView(c2Var);
        }
        Context context = getContext();
        if (i7 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        c2 c2Var2 = new c2(this, context, i10, this.f14476a, z10);
        this.h = c2Var2;
        c2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f14479e.getPaint().measureText(((Object) iVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new y10(this) {
            public final d2 f14245b;

            {
                this.f14245b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f14245b;
                        ah.i iVar2 = d2Var.f14479e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        hv0 hv0Var = (hv0) obj;
                        d2 d2Var2 = this.f14245b;
                        c2 c2Var3 = d2Var2.h;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == hv0Var) {
                                d2Var2.h.I1(null);
                                r10 r10Var = d2Var2.f14485x;
                                if (r10Var != null) {
                                    r10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.h.I1(hv0Var);
                            String str = hv0Var.f35978a;
                            int categoryIndex = d2Var2.h.getCategoryIndex();
                            r10 r10Var2 = d2Var2.f14485x;
                            if (r10Var2 != null) {
                                r10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new y10(this) {
            public final d2 f14245b;

            {
                this.f14245b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f14245b;
                        ah.i iVar2 = d2Var.f14479e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        hv0 hv0Var = (hv0) obj;
                        d2 d2Var2 = this.f14245b;
                        c2 c2Var3 = d2Var2.h;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == hv0Var) {
                                d2Var2.h.I1(null);
                                r10 r10Var = d2Var2.f14485x;
                                if (r10Var != null) {
                                    r10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.h.I1(hv0Var);
                            String str = hv0Var.f35978a;
                            int categoryIndex = d2Var2.h.getCategoryIndex();
                            r10 r10Var2 = d2Var2.f14485x;
                            if (r10Var2 != null) {
                                r10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.ma.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.f14479e.setText("");
        r10 r10Var = this.f14485x;
        if (r10Var != null) {
            r10Var.a(null, -1);
        }
        c2 c2Var = this.h;
        if (c2Var != null) {
            c2Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.f14484w = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i7;
        c2 c2Var;
        c2 c2Var2;
        boolean z11 = this.f14484w;
        ah.i iVar = this.f14479e;
        if (z11 && ((iVar.length() != 0 || ((c2Var2 = this.h) != null && c2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (iVar.length() <= 0 && ((c2Var = this.h) == null || c2Var.f37308w3 <= 0.5f || ((c2Var == null || !c2Var.f37303r3) && c2Var.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.d.b(i7);
        this.f14484w = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ul0 ul0Var = this.d;
            org.telegram.ui.ActionBar.h6 h6Var = this.f14476a;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Bf, h6Var));
            }
            ImageView imageView = this.f14478c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.f14479e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.m6.Di;
                iVar.setCursorColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
            }
            ImageView imageView2 = this.f14482r;
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
