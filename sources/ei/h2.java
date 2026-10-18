package ei;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.vn0;
public final class h2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.d6 f9147a;
    public final FrameLayout f9148b;
    public final vn0 f9149c;
    public final e2 d;
    public final int e;
    public g2 f9150f;
    public boolean h;
    public final ImageView f9151n;
    public boolean f9152r;
    public boolean f9153s;
    public Utilities.Callback2 v;

    public h2(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = -1;
        this.f9147a = d6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9148b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ie, d6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ci.o1(2));
        addView(frameLayout, w7.z5.a(36.0f, 10.0f, 6.0f, 10.0f, 8.0f, -1, 119));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.z5.a(40.0f, 38.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        vn0 vn0Var = new vn0();
        this.f9149c = vn0Var;
        vn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.h6.Je;
        vn0Var.a(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        imageView.setImageDrawable(vn0Var);
        frameLayout.addView(imageView, w7.z5.e(36, 36, 51));
        e2 e2Var = new e2(this, context, 0);
        this.d = e2Var;
        e2Var.setTextSize(1, 16.0f);
        e2Var.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        e2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        e2Var.setBackgroundDrawable(null);
        e2Var.setPadding(0, 0, 0, 0);
        e2Var.setMaxLines(1);
        e2Var.setLines(1);
        e2Var.setSingleLine(true);
        e2Var.setImeOptions(268435459);
        e2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.h6.Mh;
        e2Var.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e2Var.setHandlesColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        e2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        e2Var.setCursorWidth(1.5f);
        e2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(e2Var, w7.z5.a(40.0f, 0.0f, 0.0f, 28.0f, 0.0f, -1, 51));
        e2Var.addTextChangedListener(new ai.u(this, 1));
        ImageView imageView2 = new ImageView(context);
        this.f9151n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new f2(d6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21082i6, d6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final h2 f8821b;

            {
                this.f8821b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f8821b.b();
                        return;
                    default:
                        h2 h2Var = this.f8821b;
                        int i12 = h2Var.f9149c.f31335k;
                        if (i12 == 1) {
                            h2Var.b();
                            g2 g2Var = h2Var.f9150f;
                            if (g2Var != null) {
                                g2Var.E1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            h2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, w7.z5.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final h2 f8821b;

            {
                this.f8821b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f8821b.b();
                        return;
                    default:
                        h2 h2Var = this.f8821b;
                        int i12 = h2Var.f9149c.f31335k;
                        if (i12 == 1) {
                            h2Var.b();
                            g2 g2Var = h2Var.f9150f;
                            if (g2Var != null) {
                                g2Var.E1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            h2Var.d.requestFocus();
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
        e2 e2Var;
        if (this.e == i10 && this.f9150f != null) {
            return;
        }
        g2 g2Var = this.f9150f;
        FrameLayout frameLayout = this.f9148b;
        if (g2Var != null) {
            frameLayout.removeView(g2Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        g2 g2Var2 = new g2(this, context, i11, this.f9147a, z10);
        this.f9150f = g2Var2;
        g2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) this.d.getPaint().measureText(((Object) e2Var.getHint()) + "")));
        this.f9150f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final h2 f8884b;

            {
                this.f8884b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        h2 h2Var = this.f8884b;
                        e2 e2Var2 = h2Var.d;
                        e2Var2.animate().cancel();
                        e2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        h2Var.d(false);
                        return;
                    default:
                        lx0 lx0Var = (lx0) obj;
                        h2 h2Var2 = this.f8884b;
                        g2 g2Var3 = h2Var2.f9150f;
                        if (g2Var3 != null) {
                            if (g2Var3.getSelectedCategory() == lx0Var) {
                                h2Var2.f9150f.G1(null);
                                Utilities.Callback2 callback2 = h2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            h2Var2.f9150f.G1(lx0Var);
                            String str = lx0Var.f28347a;
                            int categoryIndex = h2Var2.f9150f.getCategoryIndex();
                            Utilities.Callback2 callback22 = h2Var2.v;
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
        this.f9150f.setOnCategoryClick(new Utilities.Callback(this) {
            public final h2 f8884b;

            {
                this.f8884b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        h2 h2Var = this.f8884b;
                        e2 e2Var2 = h2Var.d;
                        e2Var2.animate().cancel();
                        e2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        h2Var.d(false);
                        return;
                    default:
                        lx0 lx0Var = (lx0) obj;
                        h2 h2Var2 = this.f8884b;
                        g2 g2Var3 = h2Var2.f9150f;
                        if (g2Var3 != null) {
                            if (g2Var3.getSelectedCategory() == lx0Var) {
                                h2Var2.f9150f.G1(null);
                                Utilities.Callback2 callback2 = h2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            h2Var2.f9150f.G1(lx0Var);
                            String str = lx0Var.f28347a;
                            int categoryIndex = h2Var2.f9150f.getCategoryIndex();
                            Utilities.Callback2 callback22 = h2Var2.v;
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
        frameLayout.addView(this.f9150f, Math.max(0, frameLayout.getChildCount() - 1), w7.z5.a(36.0f, 36.0f, 0.0f, 0.0f, 0.0f, -1, 51));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        g2 g2Var = this.f9150f;
        if (g2Var != null) {
            g2Var.G1(null);
        }
    }

    public final void c(boolean z10) {
        this.f9153s = z10;
        if (z10) {
            this.f9149c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        g2 g2Var;
        g2 g2Var2;
        boolean z11 = this.f9153s;
        e2 e2Var = this.d;
        if (z11 && ((e2Var.length() != 0 || ((g2Var2 = this.f9150f) != null && g2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (e2Var.length() <= 0 && ((g2Var = this.f9150f) == null || g2Var.f29464m3 <= 0.5f || ((g2Var == null || !g2Var.f29459h3) && g2Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f9149c.b(i10);
        this.f9153s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
