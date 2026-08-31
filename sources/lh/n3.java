package lh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import mh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final qh.d E;
    public boolean F;
    public final pr0 f12860a;
    public final int f12861b;
    public final g6 f12862c;
    public boolean d;
    public l7 f12863e;
    public final h3 f12864f;
    public og.k h;
    public boolean f12865n;
    public int f12866r;
    public final FrameLayout f12867s;
    public final LinearLayout v;
    public final TextView f12868w;
    public final TextView f12869x;
    public final FrameLayout f12870y;

    public n3(pr0 pr0Var, int i10, g6 g6Var) {
        super(pr0Var.getContext());
        this.f12866r = AndroidUtilities.displaySize.y;
        Context context = pr0Var.getContext();
        this.f12860a = pr0Var;
        this.f12861b = i10;
        this.f12862c = g6Var;
        h3 h3Var = new h3(context, i10, new eg.p1(this, 10), new f3(this), new f3(this), g6Var, pr0Var);
        this.f12864f = h3Var;
        h3Var.V2.f32957r = false;
        h3Var.setSelectorType(9);
        h3Var.setSelectorDrawableColor(0);
        h3Var.setPadding(AndroidUtilities.dp(9.0f), pr0Var.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h3Var.setClipToPadding(false);
        h3Var.setClipChildren(false);
        addView(h3Var, k7.c6.e(-1, -1, 119));
        h3Var.j(new kh.l(1, this, pr0Var));
        i3 i3Var = new i3(pr0Var);
        i3Var.f5910m = false;
        i3Var.C = false;
        i3Var.o(pr.h);
        i3Var.n(350L);
        h3Var.setItemAnimator(i3Var);
        new f2.f0(new j3(this, pr0Var)).d(h3Var);
        View view = this.f12867s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f12870y;
        if (view2 != null) {
            removeView(view2);
        }
        if (pr0Var.d == this.f12863e) {
            this.f12870y = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.B = null;
            this.f12867s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f12867s.addView(this.v, k7.c6.e(-2, -2, 17));
            p9 p9Var = new p9(getContext());
            p9Var.setImageDrawable(new ij0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
            this.v.addView(p9Var, k7.c6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f12868w = textView;
            textView.setTextSize(1, 17.0f);
            this.f12868w.setTypeface(AndroidUtilities.bold());
            this.f12868w.setTextColor(k6.v0(k6.G6, g6Var));
            this.f12868w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f12868w, k7.c6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f12869x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f12869x;
            int i11 = k6.Oh;
            textView3.setTextColor(k6.v0(i11, g6Var));
            this.f12869x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f12869x.setOnClickListener(new View.OnClickListener(this) {
                public final n3 f12614b;

                {
                    this.f12614b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l7 l7Var = this.f12614b.f12863e;
                            if (l7Var != null) {
                                if (!l7Var.f14399e || l7Var.f14401g != 783) {
                                    l7Var.f14401g = 783;
                                    l7Var.f14399e = true;
                                    l7Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f12614b.f12860a.a();
                            return;
                    }
                }
            });
            this.f12869x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f12869x.setBackground(k6.Y(k6.l1(0.1f, k6.v0(i11, g6Var)), 4, 4));
            k7.e6.a(this.f12869x);
            this.v.addView(this.f12869x, k7.c6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f12867s, k7.c6.e(-1, -1, 119));
            h3Var.setEmptyView(this.f12867s);
            return;
        }
        this.f12867s = null;
        this.f12868w = null;
        this.f12869x = null;
        this.v = null;
        this.f12870y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.B = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f12870y.addView(this.B, k7.c6.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.C = textView4;
        textView4.setTextSize(1, 20.0f);
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextColor(k6.v0(k6.G6, g6Var));
        this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.B.addView(this.C, k7.c6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.D = textView5;
        textView5.setTextSize(1, 14.0f);
        this.D.setTextColor(k6.v0(k6.f22036y6, g6Var));
        this.D.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.B.addView(this.D, k7.c6.t(-2, -2, 1, 0, 10, 0, 0));
        qh.d dVar = new qh.d(getContext(), g6Var, true);
        this.E = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.B.addView(this.E, k7.c6.t(200, 44, 1, 0, 19, 0, 12));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final n3 f12614b;

            {
                this.f12614b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l7 l7Var = this.f12614b.f12863e;
                        if (l7Var != null) {
                            if (!l7Var.f14399e || l7Var.f14401g != 783) {
                                l7Var.f14401g = 783;
                                l7Var.f14399e = true;
                                l7Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f12614b.f12860a.a();
                        return;
                }
            }
        });
        addView(this.f12870y, k7.c6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h3Var.setEmptyView(this.f12870y);
        LinearLayout linearLayout3 = this.B;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(pr0Var.f13101e.h() ? 0 : 8);
        }
    }

    public static void d(n3 n3Var, boolean z4) {
        n3Var.setReordering(z4);
    }

    public void setReordering(boolean z4) {
        h3 h3Var;
        if (this.f12865n != z4) {
            this.f12865n = z4;
            pr0 pr0Var = this.f12860a;
            pr0Var.p(pr0Var.g());
            int i10 = 0;
            while (true) {
                h3Var = this.f12864f;
                if (i10 >= h3Var.getChildCount()) {
                    break;
                }
                View childAt = h3Var.getChildAt(i10);
                if (childAt instanceof x1) {
                    ((x1) childAt).d(z4, true);
                }
                i10++;
            }
            x51 x51Var = h3Var.V2;
            if (x51Var != null) {
                x51Var.S();
            }
            if (z4) {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new h2(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f12863e) {
            f(true);
            if (this.f12863e != null && isAttachedToWindow()) {
                h3 h3Var = this.f12864f;
                if (h3Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h3Var.getChildCount(); i12++) {
                        if (!(h3Var.getChildAt(i12) instanceof u00)) {
                        }
                    }
                    return;
                }
                this.f12863e.a();
            }
        }
    }

    public final void e() {
        if (!this.f12865n) {
            return;
        }
        l7 l7Var = this.f12863e;
        if (l7Var != null) {
            l7Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z4) {
        x51 x51Var;
        h3 h3Var = this.f12864f;
        if (h3Var != null && (x51Var = h3Var.V2) != null) {
            boolean canScrollVertically = h3Var.canScrollVertically(-1);
            x51Var.N(z4);
            if (!canScrollVertically) {
                h3Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h3 h3Var = this.f12864f;
            if (i10 >= h3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = h3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof x1) {
                if (R == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (R == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i10++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f12861b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f12861b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f12866r);
    }

    public void setHasTabs(boolean z4) {
        if (this.F == z4) {
            return;
        }
        this.F = z4;
        h3 h3Var = this.f12864f;
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        h3Var.V2.N(true);
        if (!canScrollVertically) {
            h3Var.u0(0);
        }
        this.f12860a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f12866r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f12867s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f12866r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.B.setScaleX(lerp);
            this.B.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f12870y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f12866r)) / 2.0f);
        }
    }
}
