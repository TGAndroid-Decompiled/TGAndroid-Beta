package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.lm0;

public final class e2 extends FrameLayout {

    public final org.telegram.ui.ActionBar.c6 f15919a;

    public final FrameLayout f15920b;

    public final lm0 f15921c;
    public final gg.g d;

    public final int f15922e;

    public d2 f15923f;
    public boolean h;

    public final ImageView f15924n;

    public boolean f15925r;

    public boolean f15926s;
    public Utilities.Callback2 v;

    public e2(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f15922e = -1;
        this.f15919a = c6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f15920b = frameLayout;
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(18.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ie, c6Var)));
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new cg.l1(6));
        addView(frameLayout, h7.z5.d(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, h7.z5.d(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        lm0 lm0Var = new lm0();
        this.f15921c = lm0Var;
        lm0Var.c(0, false, false);
        int i10 = org.telegram.ui.ActionBar.g6.Je;
        lm0Var.a(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        imageView.setImageDrawable(lm0Var);
        frameLayout.addView(imageView, h7.z5.e(36, 36, 51));
        gg.g gVar = new gg.g(this, context, 1);
        this.d = gVar;
        gVar.setTextSize(1, 16.0f);
        gVar.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        gVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        gVar.setBackgroundDrawable(null);
        gVar.setPadding(0, 0, 0, 0);
        gVar.setMaxLines(1);
        gVar.setLines(1);
        gVar.setSingleLine(true);
        gVar.setImeOptions(268435459);
        gVar.setHint(LocaleController.getString(R.string.Search));
        int i11 = org.telegram.ui.ActionBar.g6.Mh;
        gVar.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        gVar.setHandlesColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        gVar.setCursorSize(AndroidUtilities.dp(20.0f));
        gVar.setCursorWidth(1.5f);
        gVar.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(gVar, h7.z5.d(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        gVar.addTextChangedListener(new ch.e(this, 3));
        ImageView imageView2 = new ImageView(context);
        this.f15924n = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new c2(c6Var));
        imageView2.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 1, AndroidUtilities.dp(15.0f)));
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        final int i12 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) {

            public final e2 f15631b;

            {
                this.f15631b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.f15631b.b();
                        break;
                    default:
                        e2 e2Var = this.f15631b;
                        int i13 = e2Var.f15921c.f30421k;
                        if (i13 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.f15923f;
                            if (d2Var != null) {
                                d2Var.D1();
                            }
                        } else if (i13 == 0) {
                            e2Var.d.requestFocus();
                        }
                        break;
                }
            }
        });
        frameLayout.addView(imageView2, h7.z5.e(36, 36, 53));
        final int i13 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final e2 f15631b;

            {
                this.f15631b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f15631b.b();
                        break;
                    default:
                        e2 e2Var = this.f15631b;
                        int i14 = e2Var.f15921c.f30421k;
                        if (i14 == 1) {
                            e2Var.b();
                            d2 d2Var = e2Var.f15923f;
                            if (d2Var != null) {
                                d2Var.D1();
                            }
                        } else if (i14 == 0) {
                            e2Var.d.requestFocus();
                        }
                        break;
                }
            }
        });
    }

    public final void a(int i10, boolean z10) {
        if (this.f15922e != i10 || this.f15923f == null) {
            d2 d2Var = this.f15923f;
            FrameLayout frameLayout = this.f15920b;
            if (d2Var != null) {
                frameLayout.removeView(d2Var);
            }
            d2 d2Var2 = new d2(this, getContext(), i10 == 1 ? 3 : 0, this.f15919a, z10);
            this.f15923f = d2Var2;
            gg.g gVar = this.d;
            d2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) gVar.getPaint().measureText(((Object) gVar.getHint()) + "")));
            final int i11 = 0;
            this.f15923f.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {

                public final e2 f15676b;

                {
                    this.f15676b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            e2 e2Var = this.f15676b;
                            gg.g gVar2 = e2Var.d;
                            gVar2.animate().cancel();
                            gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            e2Var.d(false);
                            break;
                        default:
                            cw0 cw0Var = (cw0) obj;
                            e2 e2Var2 = this.f15676b;
                            d2 d2Var3 = e2Var2.f15923f;
                            if (d2Var3 != null) {
                                if (d2Var3.getSelectedCategory() != cw0Var) {
                                    e2Var2.f15923f.F1(cw0Var);
                                    String str = cw0Var.f27559a;
                                    int categoryIndex = e2Var2.f15923f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = e2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                    }
                                } else {
                                    e2Var2.f15923f.F1(null);
                                    Utilities.Callback2 callback3 = e2Var2.v;
                                    if (callback3 != null) {
                                        callback3.run(null, -1);
                                    }
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            final int i12 = 1;
            this.f15923f.setOnCategoryClick(new Utilities.Callback(this) {

                public final e2 f15676b;

                {
                    this.f15676b = this;
                }

                @Override
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            e2 e2Var = this.f15676b;
                            gg.g gVar2 = e2Var.d;
                            gVar2.animate().cancel();
                            gVar2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                            e2Var.d(false);
                            break;
                        default:
                            cw0 cw0Var = (cw0) obj;
                            e2 e2Var2 = this.f15676b;
                            d2 d2Var3 = e2Var2.f15923f;
                            if (d2Var3 != null) {
                                if (d2Var3.getSelectedCategory() != cw0Var) {
                                    e2Var2.f15923f.F1(cw0Var);
                                    String str = cw0Var.f27559a;
                                    int categoryIndex = e2Var2.f15923f.getCategoryIndex();
                                    Utilities.Callback2 callback2 = e2Var2.v;
                                    if (callback2 != null) {
                                        callback2.run(str, Integer.valueOf(categoryIndex));
                                    }
                                } else {
                                    e2Var2.f15923f.F1(null);
                                    Utilities.Callback2 callback3 = e2Var2.v;
                                    if (callback3 != null) {
                                        callback3.run(null, -1);
                                    }
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            frameLayout.addView(this.f15923f, Math.max(0, frameLayout.getChildCount() - 1), h7.z5.d(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
        }
    }

    public final void b() {
        this.d.setText("");
        Utilities.Callback2 callback2 = this.v;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        d2 d2Var = this.f15923f;
        if (d2Var != null) {
            d2Var.F1(null);
        }
    }

    public final void c(boolean z10) {
        this.f15926s = z10;
        if (z10) {
            this.f15921c.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        d2 d2Var;
        d2 d2Var2;
        boolean z11 = this.f15926s;
        gg.g gVar = this.d;
        if (!z11 || ((gVar.length() == 0 && ((d2Var2 = this.f15923f) == null || d2Var2.getSelectedCategory() == null)) || z10)) {
            this.f15921c.b((gVar.length() > 0 || ((d2Var = this.f15923f) != null && d2Var.f28846k3 > 0.5f && ((d2Var != null && d2Var.f28841f3) || d2Var.getSelectedCategory() != null))) ? 1 : 0);
            this.f15926s = false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }
}
