package fi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xx0;
public final class f2 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f10851a;
    public final FrameLayout f10852b;
    public final ImageView f10853c;
    public final eo0 d;
    public final c2 e;
    public final int f10854f;
    public e2 h;
    public boolean f10855n;
    public final ImageView f10856r;
    public boolean f10857s;
    public boolean v;
    public Utilities.Callback2 f10858w;

    public f2(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f10854f = -1;
        this.f10851a = u6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10852b = frameLayout;
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Ie;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        frameLayout.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, N, null, u6Var);
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ag.v0(4));
        addView(frameLayout, gb1.h(-1, 36.0f, 119, 10.0f, 6.0f, 10.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout.addView(frameLayout2, gb1.h(-1, 40.0f, 51, 38.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f10853c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        eo0 eo0Var = new eo0();
        this.d = eo0Var;
        eo0Var.c(0, false, false);
        int i11 = org.telegram.ui.ActionBar.y6.Je;
        eo0Var.a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        imageView.setImageDrawable(eo0Var);
        frameLayout.addView(imageView, gb1.i(36, 36, 51));
        c2 c2Var = new c2(this, context, 0);
        this.e = c2Var;
        c2Var.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.E(c2Var, i11, u6Var);
        org.telegram.ui.ActionBar.f7.V(c2Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        c2Var.setBackgroundDrawable(null);
        c2Var.setPadding(0, 0, 0, 0);
        c2Var.setMaxLines(1);
        c2Var.setLines(1);
        c2Var.setSingleLine(true);
        c2Var.setImeOptions(268435459);
        c2Var.setHint(LocaleController.getString(R.string.Search));
        int i12 = org.telegram.ui.ActionBar.y6.Mh;
        org.telegram.ui.ActionBar.f7.m(c2Var, 30, i12, u6Var);
        org.telegram.ui.ActionBar.f7.m(c2Var, 36, i12, u6Var);
        c2Var.setCursorSize(AndroidUtilities.dp(20.0f));
        c2Var.setCursorWidth(1.5f);
        c2Var.setTranslationY(AndroidUtilities.dp(-2.0f));
        frameLayout2.addView(c2Var, gb1.h(-1, 40.0f, 51, 0.0f, 0.0f, 28.0f, 0.0f));
        c2Var.addTextChangedListener(new bi.u(this, 1));
        ImageView imageView2 = new ImageView(context);
        this.f10856r = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageDrawable(new d2(u6Var));
        int i13 = org.telegram.ui.ActionBar.y6.f23446i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i13, u6Var), 1, AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        imageView2.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView2, g02, null, N2, u6Var);
        imageView2.setAlpha(0.0f);
        imageView2.setScaleX(0.7f);
        imageView2.setScaleY(0.7f);
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final f2 f10503b;

            {
                this.f10503b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10503b.b();
                        return;
                    default:
                        f2 f2Var = this.f10503b;
                        int i14 = f2Var.d.f27916k;
                        if (i14 == 1) {
                            f2Var.b();
                            e2 e2Var = f2Var.h;
                            if (e2Var != null) {
                                e2Var.J1();
                                return;
                            }
                            return;
                        } else if (i14 == 0) {
                            f2Var.e.requestFocus();
                            return;
                        } else {
                            return;
                        }
                }
            }
        });
        frameLayout.addView(imageView2, gb1.i(36, 36, 53));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final f2 f10503b;

            {
                this.f10503b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f10503b.b();
                        return;
                    default:
                        f2 f2Var = this.f10503b;
                        int i14 = f2Var.d.f27916k;
                        if (i14 == 1) {
                            f2Var.b();
                            e2 e2Var = f2Var.h;
                            if (e2Var != null) {
                                e2Var.J1();
                                return;
                            }
                            return;
                        } else if (i14 == 0) {
                            f2Var.e.requestFocus();
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
        c2 c2Var;
        if (this.f10854f == i10 && this.h != null) {
            return;
        }
        e2 e2Var = this.h;
        FrameLayout frameLayout = this.f10852b;
        if (e2Var != null) {
            frameLayout.removeView(e2Var);
        }
        Context context = getContext();
        if (i10 == 1) {
            i11 = 3;
        } else {
            i11 = 0;
        }
        e2 e2Var2 = new e2(this, context, i11, this.f10851a, z10);
        this.h = e2Var2;
        e2Var2.setDontOccupyWidth(AndroidUtilities.dp(16.0f) + ((int) this.e.getPaint().measureText(((Object) c2Var.getHint()) + "")));
        this.h.setOnScrollIntoOccupiedWidth(new Utilities.Callback(this) {
            public final f2 f10546b;

            {
                this.f10546b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        f2 f2Var = this.f10546b;
                        c2 c2Var2 = f2Var.e;
                        c2Var2.animate().cancel();
                        c2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        f2Var.d(false);
                        return;
                    default:
                        xx0 xx0Var = (xx0) obj;
                        f2 f2Var2 = this.f10546b;
                        e2 e2Var3 = f2Var2.h;
                        if (e2Var3 != null) {
                            if (e2Var3.getSelectedCategory() == xx0Var) {
                                f2Var2.h.L1(null);
                                Utilities.Callback2 callback2 = f2Var2.f10858w;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            f2Var2.h.L1(xx0Var);
                            String str = xx0Var.f34842a;
                            int categoryIndex = f2Var2.h.getCategoryIndex();
                            Utilities.Callback2 callback22 = f2Var2.f10858w;
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
        this.h.setOnCategoryClick(new Utilities.Callback(this) {
            public final f2 f10546b;

            {
                this.f10546b = this;
            }

            @Override
            public final void run(Object obj) {
                switch (r2) {
                    case 0:
                        f2 f2Var = this.f10546b;
                        c2 c2Var2 = f2Var.e;
                        c2Var2.animate().cancel();
                        c2Var2.setTranslationX(-Math.max(0, ((Integer) obj).intValue()));
                        f2Var.d(false);
                        return;
                    default:
                        xx0 xx0Var = (xx0) obj;
                        f2 f2Var2 = this.f10546b;
                        e2 e2Var3 = f2Var2.h;
                        if (e2Var3 != null) {
                            if (e2Var3.getSelectedCategory() == xx0Var) {
                                f2Var2.h.L1(null);
                                Utilities.Callback2 callback2 = f2Var2.f10858w;
                                if (callback2 != null) {
                                    callback2.run(null, -1);
                                    return;
                                }
                                return;
                            }
                            f2Var2.h.L1(xx0Var);
                            String str = xx0Var.f34842a;
                            int categoryIndex = f2Var2.h.getCategoryIndex();
                            Utilities.Callback2 callback22 = f2Var2.f10858w;
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
        frameLayout.addView(this.h, Math.max(0, frameLayout.getChildCount() - 1), gb1.h(-1, 36.0f, 51, 36.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void b() {
        this.e.setText("");
        Utilities.Callback2 callback2 = this.f10858w;
        if (callback2 != null) {
            callback2.run(null, -1);
        }
        e2 e2Var = this.h;
        if (e2Var != null) {
            e2Var.L1(null);
        }
    }

    public final void c(boolean z10) {
        this.v = z10;
        if (z10) {
            this.d.b(2);
        } else {
            d(true);
        }
    }

    public final void d(boolean z10) {
        int i10;
        e2 e2Var;
        e2 e2Var2;
        boolean z11 = this.v;
        c2 c2Var = this.e;
        if (z11 && ((c2Var.length() != 0 || ((e2Var2 = this.h) != null && e2Var2.getSelectedCategory() != null)) && !z10)) {
            return;
        }
        if (c2Var.length() <= 0 && ((e2Var = this.h) == null || e2Var.f26995w3 <= 0.5f || ((e2Var == null || !e2Var.f26990r3) && e2Var.getSelectedCategory() == null))) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.d.b(i10);
        this.v = false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        try {
            eo0 eo0Var = this.d;
            org.telegram.ui.ActionBar.u6 u6Var = this.f10851a;
            if (eo0Var != null) {
                eo0Var.a(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, u6Var));
            }
            ImageView imageView = this.f10853c;
            if (imageView != null) {
                imageView.invalidate();
            }
            c2 c2Var = this.e;
            if (c2Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Mh;
                c2Var.setCursorColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
                c2Var.setHandlesColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
            ImageView imageView2 = this.f10856r;
            if (imageView2 != null) {
                imageView2.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
