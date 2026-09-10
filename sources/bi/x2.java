package bi;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.dx0;
import org.telegram.ui.Components.hn0;
public final class x2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f3868a;
    public final FrameLayout f3869b;
    public final hn0 f3870c;
    public final t2 d;
    public final int e;
    public w2 f3871f;
    public boolean h;
    public final ImageView f3872n;
    public boolean f3873r;
    public boolean f3874s;
    public Utilities.Callback2 v;

    public x2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f3868a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f3869b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ie, f6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new g(1));
        addView(frameLayout, w7.a6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.a6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        hn0 hn0Var = new hn0();
        this.f3870c = hn0Var;
        hn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Je;
        hn0Var.a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        imageView.setImageDrawable(hn0Var);
        frameLayout.addView(imageView, w7.a6.e(36, 36, 51));
        t2 t2Var = new t2(this, context, 0);
        this.d = t2Var;
        t2Var.setTextSize(1, 16.0f);
        t2Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        t2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        t2Var.setBackgroundDrawable(null);
        t2Var.setPadding(0, 0, 0, 0);
        t2Var.setMaxLines(1);
        t2Var.setLines(1);
        t2Var.setSingleLine(true);
        t2Var.setImeOptions(268435459);
        t2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        t2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        t2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        t2Var.setCursorWidth(1.5f);
        t2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(t2Var, w7.a6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        t2Var.addTextChangedListener(new u2(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f3872n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new v2(f6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final x2 f3493b;

            {
                this.f3493b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3493b.b();
                        return;
                    default:
                        x2 x2Var = this.f3493b;
                        int i12 = x2Var.f3870c.f23703k;
                        if (i12 == 1) {
                            x2Var.b();
                            w2 w2Var = x2Var.f3871f;
                            if (w2Var != null) {
                                w2Var.C1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            x2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, w7.a6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final x2 f3493b;

            {
                this.f3493b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f3493b.b();
                        return;
                    default:
                        x2 x2Var = this.f3493b;
                        int i12 = x2Var.f3870c.f23703k;
                        if (i12 == 1) {
                            x2Var.b();
                            w2 w2Var = x2Var.f3871f;
                            if (w2Var != null) {
                                w2Var.C1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            x2Var.d.requestFocus();
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
        if (this.e == i10 && this.f3871f != null) {
            return;
        }
        w2 w2Var = this.f3871f;
        FrameLayout frameLayout = this.f3869b;
        if (w2Var != null) {
            frameLayout.removeView(w2Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        w2 w2Var2 = new w2(this, context, i11, this.f3868a, z10);
        this.f3871f = w2Var2;
        t2 t2Var = this.d;
        TextPaint paint = t2Var.getPaint();
        w2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) t2Var.getHint()) + "")));
        this.f3871f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final x2 f3642b;

            {
                this.f3642b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        x2 x2Var = this.f3642b;
                        t2 t2Var2 = x2Var.d;
                        t2Var2.animate().cancel();
                        t2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        x2Var.d(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        x2 x2Var2 = this.f3642b;
                        w2 w2Var3 = x2Var2.f3871f;
                        if (w2Var3 != null) {
                            if (w2Var3.getSelectedCategory() == dx0Var) {
                                x2Var2.f3871f.E1(null);
                                Utilities.Callback2 callback2 = x2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            x2Var2.f3871f.E1(dx0Var);
                            String str = dx0Var.f22495a;
                            int categoryIndex = x2Var2.f3871f.getCategoryIndex();
                            Utilities.Callback2 callback22 = x2Var2.v;
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
        this.f3871f.setOnCategoryClick(new Utilities.Callback(this) {
            public final x2 f3642b;

            {
                this.f3642b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        x2 x2Var = this.f3642b;
                        t2 t2Var2 = x2Var.d;
                        t2Var2.animate().cancel();
                        t2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        x2Var.d(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        x2 x2Var2 = this.f3642b;
                        w2 w2Var3 = x2Var2.f3871f;
                        if (w2Var3 != null) {
                            if (w2Var3.getSelectedCategory() == dx0Var) {
                                x2Var2.f3871f.E1(null);
                                Utilities.Callback2 callback2 = x2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            x2Var2.f3871f.E1(dx0Var);
                            String str = dx0Var.f22495a;
                            int categoryIndex = x2Var2.f3871f.getCategoryIndex();
                            Utilities.Callback2 callback22 = x2Var2.v;
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
        frameLayout.addView(this.f3871f, Math.max(0, frameLayout.getChildCount() - 1), w7.a6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        w2 w2Var = this.f3871f;
        if (w2Var != null) {
            w2Var.E1(null);
        }
    }

    public final void c(boolean z10) {
        this.f3874s = z10;
        if (z10) {
            this.f3870c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        w2 w2Var;
        w2 w2Var2;
        boolean z11 = this.f3874s;
        t2 t2Var = this.d;
        if (z11 && ((t2Var.length() != 0 || ((w2Var2 = this.f3871f) != null && w2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (t2Var.length() <= 0 && ((w2Var = this.f3871f) == null || w2Var.f23790o3 <= 0.5f || ((w2Var == null || !w2Var.j3) && w2Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f3870c.b(i10);
        this.f3874s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
