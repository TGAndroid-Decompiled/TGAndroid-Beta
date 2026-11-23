package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.ul0;
public final class l2 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f14822a;
    public final FrameLayout f14823b;
    public final ImageView f14824c;
    public final ul0 d;
    public final ah.i f14825e;
    public final int f14826f;
    public k2 h;
    public boolean f14827n;
    public final ImageView f14828r;
    public boolean f14829s;
    public boolean f14830w;
    public p10 f14831x;

    public l2(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f14826f = -1;
        this.f14822a = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14823b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Af;
        Drawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(frameLayout, d02, M, null, i6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q0(3));
        addView(frameLayout, c8.na.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.na.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14824c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ul0 ul0Var = new ul0();
        this.d = ul0Var;
        ul0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.n6.Bf;
        ul0Var.a(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        imageView.setImageDrawable(ul0Var);
        frameLayout.addView(imageView, c8.na.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.f14825e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.u6.D(iVar, i10, i6Var);
        org.telegram.ui.ActionBar.u6.U(iVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(gd.N0(2131745640, null));
        int i11 = org.telegram.ui.ActionBar.n6.Di;
        org.telegram.ui.ActionBar.u6.l(iVar, 30, i11, i6Var);
        org.telegram.ui.ActionBar.u6.l(iVar, 36, i11, i6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.na.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 6));
        ImageView imageView2 = new ImageView(context);
        this.f14828r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new j2(i6Var));
        int i12 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView2, h02, null, M2, i6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f14576b;

            {
                this.f14576b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14576b.b();
                        return;
                    default:
                        l2 l2Var = this.f14576b;
                        int i13 = l2Var.d.f40411k;
                        if (i13 == 1) {
                            l2Var.b();
                            k2 k2Var = l2Var.h;
                            if (k2Var != null) {
                                k2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            l2Var.f14825e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, c8.na.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f14576b;

            {
                this.f14576b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f14576b.b();
                        return;
                    default:
                        l2 l2Var = this.f14576b;
                        int i13 = l2Var.d.f40411k;
                        if (i13 == 1) {
                            l2Var.b();
                            k2 k2Var = l2Var.h;
                            if (k2Var != null) {
                                k2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            l2Var.f14825e.requestFocus();
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
        if (this.f14826f == i7 && this.h != null) {
            return;
        }
        k2 k2Var = this.h;
        FrameLayout frameLayout = this.f14823b;
        if (k2Var != null) {
            frameLayout.removeView(k2Var);
        }
        Context context = getContext();
        if (i7 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        k2 k2Var2 = new k2(this, context, i10, this.f14822a, z10);
        this.h = k2Var2;
        k2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f14825e.getPaint().measureText(((Object) iVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new w10(this) {
            public final l2 f14652b;

            {
                this.f14652b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        l2 l2Var = this.f14652b;
                        ah.i iVar2 = l2Var.f14825e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        l2Var.d(false);
                        return;
                    default:
                        gv0 gv0Var = (gv0) obj;
                        l2 l2Var2 = this.f14652b;
                        k2 k2Var3 = l2Var2.h;
                        if (k2Var3 != null) {
                            if (k2Var3.getSelectedCategory() == gv0Var) {
                                l2Var2.h.I1(null);
                                p10 p10Var = l2Var2.f14831x;
                                if (p10Var != null) {
                                    p10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            l2Var2.h.I1(gv0Var);
                            String str = gv0Var.f35560a;
                            int categoryIndex = l2Var2.h.getCategoryIndex();
                            p10 p10Var2 = l2Var2.f14831x;
                            if (p10Var2 != null) {
                                p10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new w10(this) {
            public final l2 f14652b;

            {
                this.f14652b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        l2 l2Var = this.f14652b;
                        ah.i iVar2 = l2Var.f14825e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        l2Var.d(false);
                        return;
                    default:
                        gv0 gv0Var = (gv0) obj;
                        l2 l2Var2 = this.f14652b;
                        k2 k2Var3 = l2Var2.h;
                        if (k2Var3 != null) {
                            if (k2Var3.getSelectedCategory() == gv0Var) {
                                l2Var2.h.I1(null);
                                p10 p10Var = l2Var2.f14831x;
                                if (p10Var != null) {
                                    p10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            l2Var2.h.I1(gv0Var);
                            String str = gv0Var.f35560a;
                            int categoryIndex = l2Var2.h.getCategoryIndex();
                            p10 p10Var2 = l2Var2.f14831x;
                            if (p10Var2 != null) {
                                p10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.na.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.f14825e.setText("");
        p10 p10Var = this.f14831x;
        if (p10Var != null) {
            p10Var.a(null, -1);
        }
        k2 k2Var = this.h;
        if (k2Var != null) {
            k2Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.f14830w = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i7;
        k2 k2Var;
        k2 k2Var2;
        boolean z11 = this.f14830w;
        ah.i iVar = this.f14825e;
        if (z11 && ((iVar.length() != 0 || ((k2Var2 = this.h) != null && k2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (iVar.length() <= 0 && ((k2Var = this.h) == null || k2Var.f36914w3 <= 0.5f || ((k2Var == null || !k2Var.f36909r3) && k2Var.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.d.b(i7);
        this.f14830w = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            ul0 ul0Var = this.d;
            org.telegram.ui.ActionBar.i6 i6Var = this.f14822a;
            if (ul0Var != null) {
                ul0Var.a(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Bf, i6Var));
            }
            ImageView imageView = this.f14824c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.f14825e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.n6.Di;
                iVar.setCursorColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
            }
            ImageView imageView2 = this.f14828r;
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
