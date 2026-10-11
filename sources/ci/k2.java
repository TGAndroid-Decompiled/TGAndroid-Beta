package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.vx0;
public final class k2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f5305a;
    public final FrameLayout f5306b;
    public final eo0 f5307c;
    public final g2 d;
    public final int f5308e;
    public j2 f5309f;
    public boolean h;
    public final ImageView f5310n;
    public boolean f5311r;
    public boolean f5312s;
    public Utilities.Callback2 v;

    public k2(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5308e = -1;
        this.f5305a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5306b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ie, d6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ai.l2(2));
        addView(frameLayout, w7.x5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.x5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        eo0 eo0Var = new eo0();
        this.f5307c = eo0Var;
        eo0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.h6.Je;
        eo0Var.a(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        imageView.setImageDrawable(eo0Var);
        frameLayout.addView(imageView, w7.x5.e(36, 36, 51));
        g2 g2Var = new g2(this, context, 0);
        this.d = g2Var;
        g2Var.setTextSize(1, 16.0f);
        g2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        g2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        g2Var.setBackgroundDrawable(null);
        g2Var.setPadding(0, 0, 0, 0);
        g2Var.setMaxLines(1);
        g2Var.setLines(1);
        g2Var.setSingleLine(true);
        g2Var.setImeOptions(268435459);
        g2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.h6.Mh;
        g2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        g2Var.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        g2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        g2Var.setCursorWidth(1.5f);
        g2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(g2Var, w7.x5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        g2Var.addTextChangedListener(new h2(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f5310n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new i2(d6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20913i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f5023b;

            {
                this.f5023b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5023b.b();
                        return;
                    default:
                        k2 k2Var = this.f5023b;
                        int i12 = k2Var.f5307c.f26156k;
                        if (i12 == 1) {
                            k2Var.b();
                            j2 j2Var = k2Var.f5309f;
                            if (j2Var != null) {
                                j2Var.E1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            k2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, w7.x5.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final k2 f5023b;

            {
                this.f5023b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f5023b.b();
                        return;
                    default:
                        k2 k2Var = this.f5023b;
                        int i12 = k2Var.f5307c.f26156k;
                        if (i12 == 1) {
                            k2Var.b();
                            j2 j2Var = k2Var.f5309f;
                            if (j2Var != null) {
                                j2Var.E1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            k2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i10, boolean z10) {
        int i11;
        g2 g2Var;
        if (this.f5308e == i10 && this.f5309f != null) {
            return;
        }
        j2 j2Var = this.f5309f;
        FrameLayout frameLayout = this.f5306b;
        if (j2Var != null) {
            frameLayout.removeView(j2Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        j2 j2Var2 = new j2(this, context, i11, this.f5305a, z10);
        this.f5309f = j2Var2;
        j2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) this.d.getPaint().measureText(((Object) g2Var.getHint()) + "")));
        this.f5309f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final k2 f5063b;

            {
                this.f5063b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        k2 k2Var = this.f5063b;
                        g2 g2Var2 = k2Var.d;
                        g2Var2.animate().cancel();
                        g2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        k2Var.d(false);
                        return;
                    default:
                        vx0 vx0Var = (vx0) obj;
                        k2 k2Var2 = this.f5063b;
                        j2 j2Var3 = k2Var2.f5309f;
                        if (j2Var3 != null) {
                            if (j2Var3.getSelectedCategory() == vx0Var) {
                                k2Var2.f5309f.G1(null);
                                Utilities.Callback2 callback2 = k2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            k2Var2.f5309f.G1(vx0Var);
                            String str = vx0Var.f32565a;
                            int categoryIndex = k2Var2.f5309f.getCategoryIndex();
                            Utilities.Callback2 callback22 = k2Var2.v;
                            if (callback22 != null) {
                                callback22.run(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        this.f5309f.setOnCategoryClick(new Utilities.Callback(this) {
            public final k2 f5063b;

            {
                this.f5063b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        k2 k2Var = this.f5063b;
                        g2 g2Var2 = k2Var.d;
                        g2Var2.animate().cancel();
                        g2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        k2Var.d(false);
                        return;
                    default:
                        vx0 vx0Var = (vx0) obj;
                        k2 k2Var2 = this.f5063b;
                        j2 j2Var3 = k2Var2.f5309f;
                        if (j2Var3 != null) {
                            if (j2Var3.getSelectedCategory() == vx0Var) {
                                k2Var2.f5309f.G1(null);
                                Utilities.Callback2 callback2 = k2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            k2Var2.f5309f.G1(vx0Var);
                            String str = vx0Var.f32565a;
                            int categoryIndex = k2Var2.f5309f.getCategoryIndex();
                            Utilities.Callback2 callback22 = k2Var2.v;
                            if (callback22 != null) {
                                callback22.run(str, Integer.valueOf(categoryIndex));
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.addView(this.f5309f, Math.max(0, frameLayout.getChildCount() - 1), w7.x5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        j2 j2Var = this.f5309f;
        if (j2Var != null) {
            j2Var.G1(null);
        }
    }

    public final void c(boolean z10) {
        this.f5312s = z10;
        if (z10) {
            this.f5307c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        j2 j2Var;
        j2 j2Var2;
        boolean z11 = this.f5312s;
        g2 g2Var = this.d;
        if (z11 && ((g2Var.length() != 0 || ((j2Var2 = this.f5309f) != null && j2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (g2Var.length() <= 0 && ((j2Var = this.f5309f) == null || j2Var.f33741m3 <= 0.5f || ((j2Var == null || !j2Var.f33737h3) && j2Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f5307c.b(i10);
        this.f5312s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
