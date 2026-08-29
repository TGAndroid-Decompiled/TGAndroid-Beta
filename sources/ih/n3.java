package ih;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import i7.h6;
import jh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final nh.d D;
    public boolean E;
    public final gr0 f9293a;
    public final int f9294b;
    public final org.telegram.ui.ActionBar.c6 f9295c;
    public boolean d;
    public k7 f9296e;
    public final h3 f9297f;
    public lg.k h;
    public boolean f9298n;
    public int f9299r;
    public final FrameLayout f9300s;
    public final LinearLayout v;
    public final TextView f9301w;
    public final TextView f9302x;
    public final FrameLayout f9303y;

    public n3(gr0 gr0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(gr0Var.getContext());
        this.f9299r = AndroidUtilities.displaySize.y;
        Context context = gr0Var.getContext();
        this.f9293a = gr0Var;
        this.f9294b = i10;
        this.f9295c = c6Var;
        h3 h3Var = new h3(context, i10, new bg.t1(this, 10), new f3(this), new f3(this), c6Var, gr0Var);
        this.f9297f = h3Var;
        h3Var.U2.f29939r = false;
        h3Var.setSelectorType(9);
        h3Var.setSelectorDrawableColor(0);
        h3Var.setPadding(AndroidUtilities.dp(9.0f), gr0Var.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h3Var.setClipToPadding(false);
        h3Var.setClipChildren(false);
        addView(h3Var, i7.f6.e(-1, -1, 119));
        h3Var.j(new hh.l(1, this, gr0Var));
        i3 i3Var = new i3(gr0Var);
        i3Var.f6463m = false;
        i3Var.C = false;
        i3Var.o(jr.h);
        i3Var.n(350L);
        h3Var.setItemAnimator(i3Var);
        new f2.e0(new j3(this, gr0Var)).d(h3Var);
        View view = this.f9300s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f9303y;
        if (view2 != null) {
            removeView(view2);
        }
        if (gr0Var.d == this.f9296e) {
            this.f9303y = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.A = null;
            this.f9300s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f9300s.addView(this.v, i7.f6.e(-2, -2, 17));
            t9 t9Var = new t9(getContext());
            t9Var.setImageDrawable(new xi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
            this.v.addView(t9Var, i7.f6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f9301w = textView;
            textView.setTextSize(1, 17.0f);
            this.f9301w.setTypeface(AndroidUtilities.bold());
            this.f9301w.setTextColor(g6.v0(g6.G6, c6Var));
            this.f9301w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f9301w, i7.f6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f9302x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f9302x;
            int i11 = g6.Oh;
            textView3.setTextColor(g6.v0(i11, c6Var));
            this.f9302x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f9302x.setOnClickListener(new View.OnClickListener(this) {
                public final n3 f9081b;

                {
                    this.f9081b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            k7 k7Var = this.f9081b.f9296e;
                            if (k7Var != null) {
                                if (!k7Var.f12381e || k7Var.f12383g != 783) {
                                    k7Var.f12383g = 783;
                                    k7Var.f12381e = true;
                                    k7Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f9081b.f9293a.a();
                            return;
                    }
                }
            });
            this.f9302x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f9302x.setBackground(g6.Y(g6.l1(0.1f, g6.v0(i11, c6Var)), 4, 4));
            h6.a(this.f9302x);
            this.v.addView(this.f9302x, i7.f6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f9300s, i7.f6.e(-1, -1, 119));
            h3Var.setEmptyView(this.f9300s);
            return;
        }
        this.f9300s = null;
        this.f9301w = null;
        this.f9302x = null;
        this.v = null;
        this.f9303y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.A = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f9303y.addView(this.A, i7.f6.e(-2, -2, 17));
        TextView textView4 = new TextView(getContext());
        this.B = textView4;
        textView4.setTextSize(1, 20.0f);
        this.B.setTypeface(AndroidUtilities.bold());
        this.B.setTextColor(g6.v0(g6.G6, c6Var));
        this.B.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
        this.A.addView(this.B, i7.f6.t(-2, -2, 1, 0, 0, 0, 0));
        TextView textView5 = new TextView(getContext());
        this.C = textView5;
        textView5.setTextSize(1, 14.0f);
        this.C.setTextColor(g6.v0(g6.f23433y6, c6Var));
        this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.A.addView(this.C, i7.f6.t(-2, -2, 1, 0, 10, 0, 0));
        nh.d dVar = new nh.d(getContext(), c6Var, true);
        this.D = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.A.addView(this.D, i7.f6.t(200, 44, 1, 0, 19, 0, 12));
        this.D.setOnClickListener(new View.OnClickListener(this) {
            public final n3 f9081b;

            {
                this.f9081b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        k7 k7Var = this.f9081b.f9296e;
                        if (k7Var != null) {
                            if (!k7Var.f12381e || k7Var.f12383g != 783) {
                                k7Var.f12383g = 783;
                                k7Var.f12381e = true;
                                k7Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f9081b.f9293a.a();
                        return;
                }
            }
        });
        addView(this.f9303y, i7.f6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h3Var.setEmptyView(this.f9303y);
        LinearLayout linearLayout3 = this.A;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(gr0Var.f9504e.h() ? 0 : 8);
        }
    }

    public static void d(n3 n3Var, boolean z10) {
        n3Var.setReordering(z10);
    }

    public void setReordering(boolean z10) {
        h3 h3Var;
        if (this.f9298n != z10) {
            this.f9298n = z10;
            gr0 gr0Var = this.f9293a;
            gr0Var.p(gr0Var.g());
            int i10 = 0;
            while (true) {
                h3Var = this.f9297f;
                if (i10 >= h3Var.getChildCount()) {
                    break;
                }
                View childAt = h3Var.getChildAt(i10);
                if (childAt instanceof y1) {
                    ((y1) childAt).d(z10, true);
                }
                i10++;
            }
            k51 k51Var = h3Var.U2;
            if (k51Var != null) {
                k51Var.S();
            }
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new i2(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f9296e) {
            f(true);
            if (this.f9296e != null && isAttachedToWindow()) {
                h3 h3Var = this.f9297f;
                if (h3Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h3Var.getChildCount(); i12++) {
                        if (!(h3Var.getChildAt(i12) instanceof p00)) {
                        }
                    }
                    return;
                }
                this.f9296e.a();
            }
        }
    }

    public final void e() {
        if (!this.f9298n) {
            return;
        }
        k7 k7Var = this.f9296e;
        if (k7Var != null) {
            k7Var.l();
        }
        setReordering(false);
    }

    public final void f(boolean z10) {
        k51 k51Var;
        h3 h3Var = this.f9297f;
        if (h3Var != null && (k51Var = h3Var.U2) != null) {
            boolean canScrollVertically = h3Var.canScrollVertically(-1);
            k51Var.N(z10);
            if (!canScrollVertically) {
                h3Var.u0(0);
            }
        }
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            h3 h3Var = this.f9297f;
            if (i10 >= h3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = h3Var.getChildAt(i10);
            int R = RecyclerView.R(childAt);
            if (childAt instanceof y1) {
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
        NotificationCenter.getInstance(this.f9294b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f9294b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f9299r);
    }

    public void setHasTabs(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        h3 h3Var = this.f9297f;
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        h3Var.U2.N(true);
        if (!canScrollVertically) {
            h3Var.u0(0);
        }
        this.f9293a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f9299r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f9300s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f9299r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.A;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.A.setScaleX(lerp);
            this.A.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f9303y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f9299r)) / 2.0f);
        }
    }
}
