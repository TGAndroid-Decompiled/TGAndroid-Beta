package kh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import lh.l7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final ph.d E;
    public boolean F;
    public final or0 f10817a;
    public final int f10818b;
    public final f6 f10819c;
    public boolean d;
    public l7 e;
    public final g3 f10820f;
    public ng.k h;
    public boolean f10821n;
    public int f10822r;
    public final FrameLayout f10823s;
    public final LinearLayout v;
    public final TextView f10824w;
    public final TextView f10825x;
    public final FrameLayout f10826y;

    public m3(or0 or0Var, int i10, f6 f6Var) {
        super(or0Var.getContext());
        this.f10822r = AndroidUtilities.displaySize.y;
        Context context = or0Var.getContext();
        this.f10817a = or0Var;
        this.f10818b = i10;
        this.f10819c = f6Var;
        g3 g3Var = new g3(context, i10, new dg.r1(this, 10), new e3(this), new e3(this), f6Var, or0Var);
        this.f10820f = g3Var;
        g3Var.V2.f30148r = false;
        g3Var.setSelectorType(9);
        g3Var.setSelectorDrawableColor(0);
        g3Var.setPadding(AndroidUtilities.dp(9.0f), or0Var.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        g3Var.setClipToPadding(false);
        g3Var.setClipChildren(false);
        addView(g3Var, k7.b6.e(-1, -1, 119));
        g3Var.j(new jh.l(1, this, or0Var));
        h3 h3Var = new h3(or0Var);
        h3Var.f5807m = false;
        h3Var.C = false;
        h3Var.o(mr.h);
        h3Var.n(350L);
        g3Var.setItemAnimator(h3Var);
        new f2.e0(new i3(this, or0Var)).d(g3Var);
        View view = this.f10823s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f10826y;
        if (view2 != null) {
            removeView(view2);
        }
        if (or0Var.d == this.e) {
            this.f10826y = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.B = null;
            this.f10823s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f10823s.addView(this.v, k7.b6.e(-2, -2, 17));
            p9 p9Var = new p9(getContext());
            p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f)));
            this.v.addView(p9Var, k7.b6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f10824w = textView;
            textView.setTextSize(1, 17.0f);
            this.f10824w.setTypeface(AndroidUtilities.bold());
            this.f10824w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f10824w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f10824w, k7.b6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f10825x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f10825x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f10825x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f10825x.setOnClickListener(new View.OnClickListener(this) {
                public final m3 f10613b;

                {
                    this.f10613b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l7 l7Var = this.f10613b.e;
                            if (l7Var != null) {
                                if (!l7Var.e || l7Var.f12752g != 783) {
                                    l7Var.f12752g = 783;
                                    l7Var.e = true;
                                    l7Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f10613b.f10817a.a();
                            return;
                    }
                }
            });
            this.f10825x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f10825x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            k7.d6.a(this.f10825x);
            this.v.addView(this.f10825x, k7.b6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f10823s, k7.b6.e(-1, -1, 119));
            g3Var.setEmptyView(this.f10823s);
            return;
        }
        this.f10823s = null;
        this.f10824w = null;
        this.f10825x = null;
        this.v = null;
        this.f10826y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.B = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f10826y.addView(this.B, k7.b6.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.C = textView4;
        textView4.setTextSize(1, 20.0f);
        this.C.setTypeface(AndroidUtilities.bold());
        this.C.setTextColor(j6.v0(j6.G6, f6Var));
        this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.B.addView(this.C, k7.b6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.D = textView5;
        textView5.setTextSize(1, 14.0f);
        this.D.setTextColor(j6.v0(j6.f20256y6, f6Var));
        this.D.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.B.addView(this.D, k7.b6.t(-2, -2, 1, 0, 10, 0, 0));
        ph.d dVar = new ph.d(getContext(), f6Var, true);
        this.E = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.B.addView(this.E, k7.b6.t(200, 44, 1, 0, 19, 0, 12));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final m3 f10613b;

            {
                this.f10613b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l7 l7Var = this.f10613b.e;
                        if (l7Var != null) {
                            if (!l7Var.e || l7Var.f12752g != 783) {
                                l7Var.f12752g = 783;
                                l7Var.e = true;
                                l7Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f10613b.f10817a.a();
                        return;
                }
            }
        });
        addView(this.f10826y, k7.b6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        g3Var.setEmptyView(this.f10826y);
        LinearLayout linearLayout3 = this.B;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(or0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(m3 m3Var, boolean z4) {
        m3Var.setReordering(z4);
    }

    public void setReordering(boolean z4) {
        g3 g3Var;
        if (this.f10821n != z4) {
            this.f10821n = z4;
            or0 or0Var = this.f10817a;
            or0Var.p(or0Var.g());
            int i10 = 0;
            while (true) {
                g3Var = this.f10820f;
                if (i10 >= g3Var.getChildCount()) {
                    break;
                }
                View childAt = g3Var.getChildAt(i10);
                if (childAt instanceof x1) {
                    ((x1) childAt).d(z4, true);
                }
                i10++;
            }
            w51 w51Var = g3Var.V2;
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
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                g3 g3Var = this.f10820f;
                if (g3Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < g3Var.getChildCount(); i12++) {
                        if (!(g3Var.getChildAt(i12) instanceof u00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f10821n) {
            return;
        }
        l7 l7Var = this.e;
        if (l7Var != null) {
            l7Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z4) {
        w51 w51Var;
        g3 g3Var = this.f10820f;
        if (g3Var != null && (w51Var = g3Var.V2) != null) {
            boolean canScrollVertically = g3Var.canScrollVertically(-1);
            w51Var.N(z4);
            if (!canScrollVertically) {
                g3Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            g3 g3Var = this.f10820f;
            if (i10 >= g3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = g3Var.getChildAt(i10);
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
        NotificationCenter.getInstance(this.f10818b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f10818b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f10822r);
    }

    public void setHasTabs(boolean z4) {
        if (this.F == z4) {
            return;
        }
        this.F = z4;
        g3 g3Var = this.f10820f;
        boolean canScrollVertically = g3Var.canScrollVertically(-1);
        g3Var.V2.N(true);
        if (!canScrollVertically) {
            g3Var.u0(0);
        }
        this.f10817a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f10822r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f10823s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f10822r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.B.setScaleX(lerp);
            this.B.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f10826y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f10822r)) / 2.0f);
        }
    }
}
