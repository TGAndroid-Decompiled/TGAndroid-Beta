package nh;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.vm0;
public final class d2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.c6 f17520a;
    public final FrameLayout f17521b;
    public final vm0 f17522c;
    public final ig.f d;
    public final int f17523e;
    public c2 f17524f;
    public boolean h;
    public final ImageView f17525n;
    public boolean f17526r;
    public boolean f17527s;
    public Utilities.Callback2 v;

    public d2(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f17523e = -1;
        this.f17520a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17521b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ie, c6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new eg.k1(6));
        addView(frameLayout, i7.f6.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        vm0 vm0Var = new vm0();
        this.f17522c = vm0Var;
        vm0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.g6.Je;
        vm0Var.a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        imageView.setImageDrawable(vm0Var);
        frameLayout.addView(imageView, i7.f6.e(36, 36, 51));
        ig.f fVar = new ig.f(this, context, 1);
        this.d = fVar;
        fVar.setTextSize(1, 16.0f);
        fVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        fVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        fVar.setBackgroundDrawable(null);
        fVar.setPadding(0, 0, 0, 0);
        fVar.setMaxLines(1);
        fVar.setLines(1);
        fVar.setSingleLine(true);
        fVar.setImeOptions(268435459);
        fVar.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.g6.Mh;
        fVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        fVar.setCursorSize(AndroidUtilities.dp(20.0f));
        fVar.setCursorWidth(1.5f);
        fVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(fVar, i7.f6.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        fVar.addTextChangedListener(new bh.c(this, 5));
        ImageView imageView2 = new ImageView(context);
        this.f17525n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new b2(c6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f18954b;

            {
                this.f18954b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18954b.b();
                        return;
                    default:
                        d2 d2Var = this.f18954b;
                        int i12 = d2Var.f17522c.f33585k;
                        if (i12 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.f17524f;
                            if (c2Var != null) {
                                c2Var.D1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            d2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, i7.f6.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final d2 f18954b;

            {
                this.f18954b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f18954b.b();
                        return;
                    default:
                        d2 d2Var = this.f18954b;
                        int i12 = d2Var.f17522c.f33585k;
                        if (i12 == 1) {
                            d2Var.b();
                            c2 c2Var = d2Var.f17524f;
                            if (c2Var != null) {
                                c2Var.D1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            d2Var.d.requestFocus();
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
        if (this.f17523e == i10 && this.f17524f != null) {
            return;
        }
        c2 c2Var = this.f17524f;
        FrameLayout frameLayout = this.f17521b;
        if (c2Var != null) {
            frameLayout.removeView(c2Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        c2 c2Var2 = new c2(this, context, i11, this.f17520a, z10);
        this.f17524f = c2Var2;
        ig.f fVar = this.d;
        TextPaint paint = fVar.getPaint();
        c2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) fVar.getHint()) + "")));
        this.f17524f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final d2 f17379b;

            {
                this.f17379b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f17379b;
                        ig.f fVar2 = d2Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        kw0 kw0Var = (kw0) obj;
                        d2 d2Var2 = this.f17379b;
                        c2 c2Var3 = d2Var2.f17524f;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == kw0Var) {
                                d2Var2.f17524f.F1(null);
                                Utilities.Callback2 callback2 = d2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.f17524f.F1(kw0Var);
                            String str = kw0Var.f30158a;
                            int categoryIndex = d2Var2.f17524f.getCategoryIndex();
                            Utilities.Callback2 callback22 = d2Var2.v;
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
        this.f17524f.setOnCategoryClick(new Utilities.Callback(this) {
            public final d2 f17379b;

            {
                this.f17379b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        d2 d2Var = this.f17379b;
                        ig.f fVar2 = d2Var.d;
                        fVar2.animate().cancel();
                        fVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        d2Var.d(false);
                        return;
                    default:
                        kw0 kw0Var = (kw0) obj;
                        d2 d2Var2 = this.f17379b;
                        c2 c2Var3 = d2Var2.f17524f;
                        if (c2Var3 != null) {
                            if (c2Var3.getSelectedCategory() == kw0Var) {
                                d2Var2.f17524f.F1(null);
                                Utilities.Callback2 callback2 = d2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            d2Var2.f17524f.F1(kw0Var);
                            String str = kw0Var.f30158a;
                            int categoryIndex = d2Var2.f17524f.getCategoryIndex();
                            Utilities.Callback2 callback22 = d2Var2.v;
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
        frameLayout.addView(this.f17524f, Math.max(0, frameLayout.getChildCount() - 1), i7.f6.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        c2 c2Var = this.f17524f;
        if (c2Var != null) {
            c2Var.F1(null);
        }
    }

    public final void c(boolean z10) {
        this.f17527s = z10;
        if (z10) {
            this.f17522c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        c2 c2Var;
        c2 c2Var2;
        boolean z11 = this.f17527s;
        ig.f fVar = this.d;
        if (z11 && ((fVar.length() != 0 || ((c2Var2 = this.f17524f) != null && c2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (fVar.length() <= 0 && ((c2Var = this.f17524f) == null || c2Var.f31499k3 <= 0.5f || ((c2Var == null || !c2Var.f31494f3) && c2Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f17522c.b(i10);
        this.f17527s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
