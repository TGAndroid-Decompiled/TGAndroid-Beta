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
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final qh.d E;
    public boolean F;
    public final or0 f12862a;
    public final int f12863b;
    public final g6 f12864c;
    public boolean d;
    public l7 f12865e;
    public final h3 f12866f;
    public og.k h;
    public boolean f12867n;
    public int f12868r;
    public final FrameLayout f12869s;
    public final LinearLayout v;
    public final TextView f12870w;
    public final TextView f12871x;
    public final FrameLayout f12872y;

    public n3(or0 or0Var, int i10, g6 g6Var) {
        super(or0Var.getContext());
        this.f12868r = AndroidUtilities.displaySize.y;
        Context context = or0Var.getContext();
        this.f12862a = or0Var;
        this.f12863b = i10;
        this.f12864c = g6Var;
        h3 h3Var = new h3(context, i10, new eg.p1(this, 10), new f3(this), new f3(this), g6Var, or0Var);
        this.f12866f = h3Var;
        h3Var.V2.f32651r = false;
        h3Var.setSelectorType(9);
        h3Var.setSelectorDrawableColor(0);
        h3Var.setPadding(AndroidUtilities.dp(9.0f), or0Var.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h3Var.setClipToPadding(false);
        h3Var.setClipChildren(false);
        addView(h3Var, k7.c6.e(-1, -1, 119));
        h3Var.j(new kh.l(1, this, or0Var));
        i3 i3Var = new i3(or0Var);
        i3Var.f5910m = false;
        i3Var.C = false;
        i3Var.o(pr.h);
        i3Var.n(350L);
        h3Var.setItemAnimator(i3Var);
        new f2.f0(new j3(this, or0Var)).d(h3Var);
        View view = this.f12869s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f12872y;
        if (view2 != null) {
            removeView(view2);
        }
        if (or0Var.d == this.f12865e) {
            this.f12872y = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.B = null;
            this.f12869s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f12869s.addView(this.v, k7.c6.e(-2, -2, 17));
            p9 p9Var = new p9(getContext());
            p9Var.setImageDrawable(new hj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(p9Var, k7.c6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f12870w = textView;
            textView.setTextSize(1, 17.0f);
            this.f12870w.setTypeface(AndroidUtilities.bold());
            this.f12870w.setTextColor(k6.v0(k6.G6, g6Var));
            this.f12870w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f12870w, k7.c6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f12871x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f12871x;
            int i11 = k6.Oh;
            textView3.setTextColor(k6.v0(i11, g6Var));
            this.f12871x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f12871x.setOnClickListener(new View.OnClickListener(this) {
                public final n3 f12616b;

                {
                    this.f12616b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l7 l7Var = this.f12616b.f12865e;
                            if (l7Var != null) {
                                if (!l7Var.f14401e || l7Var.f14403g != 783) {
                                    l7Var.f14403g = 783;
                                    l7Var.f14401e = true;
                                    l7Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f12616b.f12862a.a();
                            return;
                    }
                }
            });
            this.f12871x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f12871x.setBackground(k6.Y(k6.l1(0.1f, k6.v0(i11, g6Var)), 4, 4));
            k7.e6.a(this.f12871x);
            this.v.addView(this.f12871x, k7.c6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f12869s, k7.c6.e(-1, -1, 119));
            h3Var.setEmptyView(this.f12869s);
            return;
        }
        this.f12869s = null;
        this.f12870w = null;
        this.f12871x = null;
        this.v = null;
        this.f12872y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.B = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f12872y.addView(this.B, k7.c6.e(-2, -2, 17));
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
        this.D.setTextColor(k6.v0(k6.f22038y6, g6Var));
        this.D.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.B.addView(this.D, k7.c6.t(-2, -2, 1, 0, 10, 0, 0));
        qh.d dVar = new qh.d(getContext(), g6Var, true);
        this.E = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.B.addView(this.E, k7.c6.t(200, 44, 1, 0, 19, 0, 12));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final n3 f12616b;

            {
                this.f12616b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l7 l7Var = this.f12616b.f12865e;
                        if (l7Var != null) {
                            if (!l7Var.f14401e || l7Var.f14403g != 783) {
                                l7Var.f14403g = 783;
                                l7Var.f14401e = true;
                                l7Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f12616b.f12862a.a();
                        return;
                }
            }
        });
        addView(this.f12872y, k7.c6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h3Var.setEmptyView(this.f12872y);
        LinearLayout linearLayout3 = this.B;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(or0Var.f13103e.h() ? 0 : 8);
        }
    }

    public static void d(n3 n3Var, boolean z4) {
        n3Var.setReordering(z4);
    }

    public void setReordering(boolean z4) {
        h3 h3Var;
        if (this.f12867n != z4) {
            this.f12867n = z4;
            or0 or0Var = this.f12862a;
            or0Var.p(or0Var.g());
            int i10 = 0;
            while (true) {
                h3Var = this.f12866f;
                if (i10 >= h3Var.getChildCount()) {
                    break;
                }
                View childAt = h3Var.getChildAt(i10);
                if (childAt instanceof x1) {
                    ((x1) childAt).d(z4, true);
                }
                i10++;
            }
            w51 w51Var = h3Var.V2;
            if (w51Var != null) {
                w51Var.S();
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f12865e) {
            f(true);
            if (this.f12865e != null && isAttachedToWindow()) {
                h3 h3Var = this.f12866f;
                if (h3Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h3Var.getChildCount(); i12++) {
                        if (!(h3Var.getChildAt(i12) instanceof u00)) {
                        }
                    }
                    return;
                }
                this.f12865e.a();
            }
        }
    }

    public final void e() {
        if (!this.f12867n) {
            return;
        }
        l7 l7Var = this.f12865e;
        if (l7Var != null) {
            l7Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z4) {
        w51 w51Var;
        h3 h3Var = this.f12866f;
        if (h3Var != null && (w51Var = h3Var.V2) != null) {
            boolean canScrollVertically = h3Var.canScrollVertically(-1);
            w51Var.N(z4);
            if (!canScrollVertically) {
                h3Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h3 h3Var = this.f12866f;
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
        NotificationCenter.getInstance(this.f12863b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f12863b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f12868r);
    }

    public void setHasTabs(boolean z4) {
        if (this.F == z4) {
            return;
        }
        this.F = z4;
        h3 h3Var = this.f12866f;
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        h3Var.V2.N(true);
        if (!canScrollVertically) {
            h3Var.u0(0);
        }
        this.f12862a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f12868r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f12869s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f12868r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.B.setScaleX(lerp);
            this.B.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f12872y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f12868r)) / 2.0f);
        }
    }
}
