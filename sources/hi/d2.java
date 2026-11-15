package hi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.wu0;
public final class d2 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f14088a;
    public final FrameLayout f14089b;
    public final ImageView f14090c;
    public final kl0 d;
    public final ah.i f14091e;
    public final int f14092f;
    public c2 h;
    public boolean f14093n;
    public final ImageView f14094r;
    public boolean f14095s;
    public boolean f14096w;
    public s10 f14097x;

    public d2(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f14092f = -1;
        this.f14088a = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14089b = frameLayout;
        int L = org.telegram.messenger.g0.L(18.0f);
        int i7 = org.telegram.ui.ActionBar.j6.Af;
        Drawable d02 = org.telegram.ui.ActionBar.j6.d0(L, org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        frameLayout.setBackground(d02);
        org.telegram.ui.ActionBar.q6.j(frameLayout, d02, M, null, e6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.p0(3));
        addView(frameLayout, c8.ja.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f14090c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        kl0 kl0Var = new kl0();
        this.d = kl0Var;
        kl0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Bf;
        kl0Var.a(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        imageView.setImageDrawable(kl0Var);
        frameLayout.addView(imageView, c8.ja.e(36, 36, 51));
        ah.i iVar = new ah.i(1, context, this);
        this.f14091e = iVar;
        iVar.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.q6.D(iVar, i10, e6Var);
        org.telegram.ui.ActionBar.q6.U(iVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        iVar.setBackgroundDrawable(null);
        iVar.setPadding(0, 0, 0, 0);
        iVar.setMaxLines(1);
        iVar.setLines(1);
        iVar.setSingleLine(true);
        iVar.setImeOptions(268435459);
        iVar.setHint(hd.M0(2131745836, null));
        int i11 = org.telegram.ui.ActionBar.j6.Di;
        org.telegram.ui.ActionBar.q6.l(iVar, 30, i11, e6Var);
        org.telegram.ui.ActionBar.q6.l(iVar, 36, i11, e6Var);
        iVar.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        iVar.setCursorWidth(1.5f);
        iVar.setTranslationY(org.telegram.messenger.g0.L(-2.0f));
        frameLayout2.addView(iVar, c8.ja.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        iVar.addTextChangedListener(new ah.j(this, 5));
        ImageView imageView2 = new ImageView(context);
        this.f14094r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(e6Var));
        int i12 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var), 1, org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i12);
        imageView2.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView2, h02, null, M2, e6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f15478b;

            {
                this.f15478b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15478b.b();
                        return;
                    default:
                        d2 d2Var = this.f15478b;
                        int i13 = d2Var.d.f36555k;
                        if (i13 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            d2Var.f14091e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, c8.ja.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f15478b;

            {
                this.f15478b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15478b.b();
                        return;
                    default:
                        d2 d2Var = this.f15478b;
                        int i13 = d2Var.d.f36555k;
                        if (i13 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.h;
                            if (c2Var != null) {
                                c2Var.G1();
                                return;
                            }
                            return;
                        } else if (i13 == 0) {
                            d2Var.f14091e.requestFocus();
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
        if (this.f14092f == i7 && this.h != null) {
            return;
        }
        c2 c2Var = this.h;
        FrameLayout frameLayout = this.f14089b;
        if (c2Var != null) {
            frameLayout.removeView(c2Var);
        }
        Context context = getContext();
        if (i7 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        c2 c2Var2 = new c2(this, context, i10, this.f14088a, z10);
        this.h = c2Var2;
        c2Var2.setDontOccupyWidth(org.telegram.messenger.g0.L(16.0f) + ((int) this.f14091e.getPaint().measureText(((Object) iVar.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new z10(this) {
            public final d2 f13868b;

            {
                this.f13868b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f13868b;
                        ah.i iVar2 = d2Var.f14091e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        d2 d2Var2 = this.f13868b;
                        c2 c2Var3 = d2Var2.h;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == wu0Var) {
                                d2Var2.h.I1(null);
                                s10 s10Var = d2Var2.f14097x;
                                if (s10Var != null) {
                                    s10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.h.I1(wu0Var);
                            String str = wu0Var.f41459a;
                            int categoryIndex = d2Var2.h.getCategoryIndex();
                            s10 s10Var2 = d2Var2.f14097x;
                            if (s10Var2 != null) {
                                s10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.h.setOnCategoryClick(new z10(this) {
            public final d2 f13868b;

            {
                this.f13868b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f13868b;
                        ah.i iVar2 = d2Var.f14091e;
                        iVar2.animate().cancel();
                        iVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        wu0 wu0Var = (wu0) obj;
                        d2 d2Var2 = this.f13868b;
                        c2 c2Var3 = d2Var2.h;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == wu0Var) {
                                d2Var2.h.I1(null);
                                s10 s10Var = d2Var2.f14097x;
                                if (s10Var != null) {
                                    s10Var.a(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.h.I1(wu0Var);
                            String str = wu0Var.f41459a;
                            int categoryIndex = d2Var2.h.getCategoryIndex();
                            s10 s10Var2 = d2Var2.f14097x;
                            if (s10Var2 != null) {
                                s10Var2.a(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), c8.ja.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.f14091e.setText("");
        s10 s10Var = this.f14097x;
        if (s10Var != null) {
            s10Var.a(null, -1);
        }
        c2 c2Var = this.h;
        if (c2Var != null) {
            c2Var.I1(null);
        }
    }

    public final void c(boolean z10) {
        this.f14096w = z10;
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
        boolean z11 = this.f14096w;
        ah.i iVar = this.f14091e;
        if (z11 && ((iVar.length() != 0 || ((c2Var2 = this.h) != null && c2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (iVar.length() <= 0 && ((c2Var = this.h) == null || c2Var.f33088w3 <= 0.5f || ((c2Var == null || !c2Var.f33083r3) && c2Var.getSelectedCategory() == null))) {
            i7 = 0;
        } else {
            i7 = 1;
        }
        this.d.b(i7);
        this.f14096w = false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            kl0 kl0Var = this.d;
            org.telegram.ui.ActionBar.e6 e6Var = this.f14088a;
            if (kl0Var != null) {
                kl0Var.a(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Bf, e6Var));
            }
            ImageView imageView = this.f14090c;
            if (imageView != null) {
                imageView.invalidate();
            }
            ah.i iVar = this.f14091e;
            if (iVar != null) {
                int i7 = org.telegram.ui.ActionBar.j6.Di;
                iVar.setCursorColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
                iVar.setHandlesColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
            }
            ImageView imageView2 = this.f14094r;
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
