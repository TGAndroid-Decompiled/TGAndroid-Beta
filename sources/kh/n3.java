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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class n3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout B;
    public final TextView C;
    public final TextView D;
    public final ph.d E;
    public boolean F;
    public final or0 f10719a;
    public final int f10720b;
    public final org.telegram.ui.ActionBar.f6 f10721c;
    public boolean d;
    public l7 e;
    public final h3 f10722f;
    public ng.k h;
    public boolean f10723n;
    public int f10724r;
    public final FrameLayout f10725s;
    public final LinearLayout v;
    public final TextView f10726w;
    public final TextView f10727x;
    public final FrameLayout f10728y;

    public n3(or0 or0Var, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(or0Var.getContext());
        this.f10724r = AndroidUtilities.displaySize.y;
        Context context = or0Var.getContext();
        this.f10719a = or0Var;
        this.f10720b = i10;
        this.f10721c = f6Var;
        h3 h3Var = new h3(context, i10, new dg.r1(this, 10), new f3(this), new f3(this), f6Var, or0Var);
        this.f10722f = h3Var;
        h3Var.V2.f30240r = false;
        h3Var.setSelectorType(9);
        h3Var.setSelectorDrawableColor(0);
        h3Var.setPadding(AndroidUtilities.dp(9.0f), or0Var.H, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        h3Var.setClipToPadding(false);
        h3Var.setClipChildren(false);
        addView(h3Var, k7.b6.e(-1, -1, 119));
        h3Var.j(new jh.l(1, this, or0Var));
        i3 i3Var = new i3(or0Var);
        i3Var.f5818m = false;
        i3Var.C = false;
        i3Var.o(nr.h);
        i3Var.n(350L);
        h3Var.setItemAnimator(i3Var);
        new f2.e0(new j3(this, or0Var)).d(h3Var);
        View view = this.f10725s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f10728y;
        if (view2 != null) {
            removeView(view2);
        }
        if (or0Var.d == this.e) {
            this.f10728y = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.B = null;
            this.f10725s = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.v = linearLayout;
            linearLayout.setOrientation(1);
            this.f10725s.addView(this.v, k7.b6.e(-2, -2, 17));
            p9 p9Var = new p9(getContext());
            p9Var.setImageDrawable(new gj0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
            this.v.addView(p9Var, k7.b6.t(120, 120, 1, 0, 0, 0, 0));
            TextView textView = new TextView(getContext());
            this.f10726w = textView;
            textView.setTextSize(1, 17.0f);
            this.f10726w.setTypeface(AndroidUtilities.bold());
            this.f10726w.setTextColor(j6.v0(j6.G6, f6Var));
            this.f10726w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
            this.v.addView(this.f10726w, k7.b6.t(-2, -2, 1, 0, 12, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.f10727x = textView2;
            textView2.setTextSize(1, 14.0f);
            TextView textView3 = this.f10727x;
            int i11 = j6.Oh;
            textView3.setTextColor(j6.v0(i11, f6Var));
            this.f10727x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
            this.f10727x.setOnClickListener(new View.OnClickListener(this) {
                public final n3 f10515b;

                {
                    this.f10515b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (r2) {
                        case 0:
                            l7 l7Var = this.f10515b.e;
                            if (l7Var != null) {
                                if (!l7Var.e || l7Var.f12768g != 783) {
                                    l7Var.f12768g = 783;
                                    l7Var.e = true;
                                    l7Var.i(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            this.f10515b.f10719a.a();
                            return;
                    }
                }
            });
            this.f10727x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
            this.f10727x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var)), 4, 4));
            k7.d6.a(this.f10727x);
            this.v.addView(this.f10727x, k7.b6.t(-2, -2, 1, 0, 8, 0, 0));
            addView(this.f10725s, k7.b6.e(-1, -1, 119));
            h3Var.setEmptyView(this.f10725s);
            return;
        }
        this.f10725s = null;
        this.f10726w = null;
        this.f10727x = null;
        this.v = null;
        this.f10728y = new FrameLayout(getContext());
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.B = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f10728y.addView(this.B, k7.b6.e(-2, -2, 17));
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
        this.D.setTextColor(j6.v0(j6.f20281y6, f6Var));
        this.D.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
        this.B.addView(this.D, k7.b6.t(-2, -2, 1, 0, 10, 0, 0));
        ph.d dVar = new ph.d(getContext(), f6Var, true);
        this.E = dVar;
        dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
        this.B.addView(this.E, k7.b6.t(200, 44, 1, 0, 19, 0, 12));
        this.E.setOnClickListener(new View.OnClickListener(this) {
            public final n3 f10515b;

            {
                this.f10515b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (r2) {
                    case 0:
                        l7 l7Var = this.f10515b.e;
                        if (l7Var != null) {
                            if (!l7Var.e || l7Var.f12768g != 783) {
                                l7Var.f12768g = 783;
                                l7Var.e = true;
                                l7Var.i(true);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        this.f10515b.f10719a.a();
                        return;
                }
            }
        });
        addView(this.f10728y, k7.b6.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
        h3Var.setEmptyView(this.f10728y);
        LinearLayout linearLayout3 = this.B;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(or0Var.e.h() ? 0 : 8);
        }
    }

    public static void d(n3 n3Var, boolean z4) {
        n3Var.setReordering(z4);
    }

    public void setReordering(boolean z4) {
        h3 h3Var;
        if (this.f10723n != z4) {
            this.f10723n = z4;
            or0 or0Var = this.f10719a;
            or0Var.p(or0Var.g());
            int i10 = 0;
            while (true) {
                h3Var = this.f10722f;
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
                    AndroidUtilities.runOnUIThread(new i2(profileActivity, 1));
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.e) {
            f(true);
            if (this.e != null && isAttachedToWindow()) {
                h3 h3Var = this.f10722f;
                if (h3Var.canScrollVertically(1)) {
                    for (int i12 = 0; i12 < h3Var.getChildCount(); i12++) {
                        if (!(h3Var.getChildAt(i12) instanceof t00)) {
                        }
                    }
                    return;
                }
                this.e.a();
            }
        }
    }

    public final void e() {
        if (!this.f10723n) {
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
        h3 h3Var = this.f10722f;
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
            h3 h3Var = this.f10722f;
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
        NotificationCenter.getInstance(this.f10720b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f10720b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f10724r);
    }

    public void setHasTabs(boolean z4) {
        if (this.F == z4) {
            return;
        }
        this.F = z4;
        h3 h3Var = this.f10722f;
        boolean canScrollVertically = h3Var.canScrollVertically(-1);
        h3Var.V2.N(true);
        if (!canScrollVertically) {
            h3Var.u0(0);
        }
        this.f10719a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f10724r = i10;
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float lerp = AndroidUtilities.lerp(0.6f, 1.0f, clamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(clamp01);
            this.v.setScaleX(lerp);
            this.v.setScaleY(lerp);
        }
        FrameLayout frameLayout = this.f10725s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f10724r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.B;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(clamp01);
            this.B.setScaleX(lerp);
            this.B.setScaleY(lerp);
        }
        FrameLayout frameLayout2 = this.f10728y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f10724r)) / 2.0f);
        }
    }
}
