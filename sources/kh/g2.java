package kh;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.im0;
public final class g2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 f15256a;
    public final FrameLayout f15257b;
    public final im0 f15258c;
    public final fg.g d;
    public final int f15259e;
    public f2 f15260f;
    public boolean h;
    public final ImageView f15261n;
    public boolean f15262r;
    public boolean f15263s;
    public Utilities.Callback2 v;

    public g2(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f15259e = -1;
        this.f15256a = b6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15257b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ie, b6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new bg.q1(6));
        addView(frameLayout, g7.e6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        im0 im0Var = new im0();
        this.f15258c = im0Var;
        im0Var.c(0, false, false);
        int i9 = org.telegram.ui.ActionBar.f6.Je;
        im0Var.a(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        imageView.setImageDrawable(im0Var);
        frameLayout.addView(imageView, g7.e6.e(36, 36, 51));
        fg.g gVar = new fg.g(this, context, 1);
        this.d = gVar;
        gVar.setTextSize(1, 16.0f);
        gVar.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.Search));
        int i10 = org.telegram.ui.ActionBar.f6.Mh;
        gVar.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setHandlesColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        gVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar.setCursorWidth(1.5f);
        gVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(gVar, g7.e6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gVar.addTextChangedListener(new bh.f(this, 3));
        ImageView imageView2 = new ImageView(context);
        this.f15261n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new e2(b6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final g2 f15031b;

            {
                this.f15031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15031b.b();
                        return;
                    default:
                        g2 g2Var = this.f15031b;
                        int i11 = g2Var.f15258c.f29472k;
                        if (i11 == 1) {
                            g2Var.b();
                            f2 f2Var = g2Var.f15260f;
                            if (f2Var != null) {
                                f2Var.D1();
                                return;
                            }
                            return;
                        } else if (i11 == 0) {
                            g2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, g7.e6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final g2 f15031b;

            {
                this.f15031b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f15031b.b();
                        return;
                    default:
                        g2 g2Var = this.f15031b;
                        int i11 = g2Var.f15258c.f29472k;
                        if (i11 == 1) {
                            g2Var.b();
                            f2 f2Var = g2Var.f15260f;
                            if (f2Var != null) {
                                f2Var.D1();
                                return;
                            }
                            return;
                        } else if (i11 == 0) {
                            g2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
    }

    public final void a(int i9, boolean z10) {
        int i10;
        if (this.f15259e == i9 && this.f15260f != null) {
            return;
        }
        f2 f2Var = this.f15260f;
        FrameLayout frameLayout = this.f15257b;
        if (f2Var != null) {
            frameLayout.removeView(f2Var);
        }
        Context context = getContext();
        if (i9 == 1) {
            i10 = 3;
        } else {
            i10 = 0;
        }
        f2 f2Var2 = new f2(this, context, i10, this.f15256a, z10);
        this.f15260f = f2Var2;
        fg.g gVar = this.d;
        TextPaint paint = gVar.getPaint();
        f2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) gVar.getHint()) + "")));
        this.f15260f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final g2 f15091b;

            {
                this.f15091b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        g2 g2Var = this.f15091b;
                        fg.g gVar2 = g2Var.d;
                        gVar2.animate().cancel();
                        gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        g2Var.d(false);
                        return;
                    default:
                        aw0 aw0Var = (aw0) obj;
                        g2 g2Var2 = this.f15091b;
                        f2 f2Var3 = g2Var2.f15260f;
                        if (f2Var3 != null) {
                            if (f2Var3.getSelectedCategory() == aw0Var) {
                                g2Var2.f15260f.F1(null);
                                Utilities.Callback2 callback2 = g2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            g2Var2.f15260f.F1(aw0Var);
                            String str = aw0Var.f26914a;
                            int categoryIndex = g2Var2.f15260f.getCategoryIndex();
                            Utilities.Callback2 callback22 = g2Var2.v;
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
        this.f15260f.setOnCategoryClick(new Utilities.Callback(this) {
            public final g2 f15091b;

            {
                this.f15091b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        g2 g2Var = this.f15091b;
                        fg.g gVar2 = g2Var.d;
                        gVar2.animate().cancel();
                        gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        g2Var.d(false);
                        return;
                    default:
                        aw0 aw0Var = (aw0) obj;
                        g2 g2Var2 = this.f15091b;
                        f2 f2Var3 = g2Var2.f15260f;
                        if (f2Var3 != null) {
                            if (f2Var3.getSelectedCategory() == aw0Var) {
                                g2Var2.f15260f.F1(null);
                                Utilities.Callback2 callback2 = g2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            g2Var2.f15260f.F1(aw0Var);
                            String str = aw0Var.f26914a;
                            int categoryIndex = g2Var2.f15260f.getCategoryIndex();
                            Utilities.Callback2 callback22 = g2Var2.v;
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
        frameLayout.addView(this.f15260f, Math.max(0, frameLayout.getChildCount() - 1), g7.e6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        f2 f2Var = this.f15260f;
        if (f2Var != null) {
            f2Var.F1(null);
        }
    }

    public final void c(boolean z10) {
        this.f15263s = z10;
        if (z10) {
            this.f15258c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i9;
        f2 f2Var;
        f2 f2Var2;
        boolean z11 = this.f15263s;
        fg.g gVar = this.d;
        if (z11 && ((gVar.length() != 0 || ((f2Var2 = this.f15260f) != null && f2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (gVar.length() <= 0 && ((f2Var = this.f15260f) == null || f2Var.f28202k3 <= 0.5f || ((f2Var == null || !f2Var.f28197f3) && f2Var.getSelectedCategory() == null))) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        this.f15258c.b(i9);
        this.f15263s = false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
