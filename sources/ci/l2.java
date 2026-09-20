package ci;

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
import org.telegram.ui.Components.kn0;
public final class l2 extends FrameLayout {
    public final org.telegram.ui.ActionBar.f6 f4919a;
    public final FrameLayout f4920b;
    public final kn0 f4921c;
    public final h2 d;
    public final int e;
    public k2 f4922f;
    public boolean h;
    public final ImageView f4923n;
    public boolean f4924r;
    public boolean f4925s;
    public Utilities.Callback2 v;

    public l2(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f4919a = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4920b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ie, f6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ai.k2(2));
        addView(frameLayout, w7.y5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, w7.y5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        kn0 kn0Var = new kn0();
        this.f4921c = kn0Var;
        kn0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.j6.Je;
        kn0Var.a(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        imageView.setImageDrawable(kn0Var);
        frameLayout.addView(imageView, w7.y5.e(36, 36, 51));
        h2 h2Var = new h2(this, context, 0);
        this.d = h2Var;
        h2Var.setTextSize(1, 16.0f);
        h2Var.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        h2Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        h2Var.setBackgroundDrawable(null);
        h2Var.setPadding(0, 0, 0, 0);
        h2Var.setMaxLines(1);
        h2Var.setLines(1);
        h2Var.setSingleLine(true);
        h2Var.setImeOptions(268435459);
        h2Var.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.j6.Mh;
        h2Var.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        h2Var.setHandlesColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        h2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        h2Var.setCursorWidth(1.5f);
        h2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(h2Var, w7.y5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        h2Var.addTextChangedListener(new i2(this, 0));
        ImageView imageView2 = new ImageView(context);
        this.f4923n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new j2(f6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19184i6, f6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f4623b;

            {
                this.f4623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f4623b.b();
                        return;
                    default:
                        l2 l2Var = this.f4623b;
                        int i12 = l2Var.f4921c.f25830k;
                        if (i12 == 1) {
                            l2Var.b();
                            k2 k2Var = l2Var.f4922f;
                            if (k2Var != null) {
                                k2Var.E1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            l2Var.d.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, w7.y5.e(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final l2 f4623b;

            {
                this.f4623b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f4623b.b();
                        return;
                    default:
                        l2 l2Var = this.f4623b;
                        int i12 = l2Var.f4921c.f25830k;
                        if (i12 == 1) {
                            l2Var.b();
                            k2 k2Var = l2Var.f4922f;
                            if (k2Var != null) {
                                k2Var.E1();
                                return;
                            }
                            return;
                        } else if (i12 == 0) {
                            l2Var.d.requestFocus();
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
        if (this.e == i10 && this.f4922f != null) {
            return;
        }
        k2 k2Var = this.f4922f;
        FrameLayout frameLayout = this.f4920b;
        if (k2Var != null) {
            frameLayout.removeView(k2Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        k2 k2Var2 = new k2(this, context, i11, this.f4919a, z10);
        this.f4922f = k2Var2;
        h2 h2Var = this.d;
        TextPaint paint = h2Var.getPaint();
        k2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) paint.measureText(((Object) h2Var.getHint()) + "")));
        this.f4922f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final l2 f4688b;

            {
                this.f4688b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        l2 l2Var = this.f4688b;
                        h2 h2Var2 = l2Var.d;
                        h2Var2.animate().cancel();
                        h2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        l2Var.d(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        l2 l2Var2 = this.f4688b;
                        k2 k2Var3 = l2Var2.f4922f;
                        if (k2Var3 != null) {
                            if (k2Var3.getSelectedCategory() == dx0Var) {
                                l2Var2.f4922f.G1(null);
                                Utilities.Callback2 callback2 = l2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            l2Var2.f4922f.G1(dx0Var);
                            String str = dx0Var.f23660a;
                            int categoryIndex = l2Var2.f4922f.getCategoryIndex();
                            Utilities.Callback2 callback22 = l2Var2.v;
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
        this.f4922f.setOnCategoryClick(new Utilities.Callback(this) {
            public final l2 f4688b;

            {
                this.f4688b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        l2 l2Var = this.f4688b;
                        h2 h2Var2 = l2Var.d;
                        h2Var2.animate().cancel();
                        h2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        l2Var.d(false);
                        return;
                    default:
                        dx0 dx0Var = (dx0) obj;
                        l2 l2Var2 = this.f4688b;
                        k2 k2Var3 = l2Var2.f4922f;
                        if (k2Var3 != null) {
                            if (k2Var3.getSelectedCategory() == dx0Var) {
                                l2Var2.f4922f.G1(null);
                                Utilities.Callback2 callback2 = l2Var2.v;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            l2Var2.f4922f.G1(dx0Var);
                            String str = dx0Var.f23660a;
                            int categoryIndex = l2Var2.f4922f.getCategoryIndex();
                            Utilities.Callback2 callback22 = l2Var2.v;
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
        frameLayout.addView(this.f4922f, Math.max(0, frameLayout.getChildCount() - 1), w7.y5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        k2 k2Var = this.f4922f;
        if (k2Var != null) {
            k2Var.G1(null);
        }
    }

    public final void c(boolean z10) {
        this.f4925s = z10;
        if (z10) {
            this.f4921c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        k2 k2Var;
        k2 k2Var2;
        boolean z11 = this.f4925s;
        h2 h2Var = this.d;
        if (z11 && ((h2Var.length() != 0 || ((k2Var2 = this.f4922f) != null && k2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (h2Var.length() <= 0 && ((k2Var = this.f4922f) == null || k2Var.f24785o3 <= 0.5f || ((k2Var == null || !k2Var.j3) && k2Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f4921c.b(i10);
        this.f4925s = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
