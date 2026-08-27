package gh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hh.m7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public final class t3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final LinearLayout A;
    public final TextView B;
    public final TextView C;
    public final lh.d D;
    public boolean E;

    public final wq0 f7533a;

    public final int f7534b;

    public final org.telegram.ui.ActionBar.c6 f7535c;
    public boolean d;

    public m7 f7536e;

    public final n3 f7537f;
    public jg.k h;

    public boolean f7538n;

    public int f7539r;

    public final FrameLayout f7540s;
    public final LinearLayout v;

    public final TextView f7541w;

    public final TextView f7542x;

    public final FrameLayout f7543y;

    public t3(wq0 wq0Var, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(wq0Var.getContext());
        this.f7539r = AndroidUtilities.displaySize.y;
        Context context = wq0Var.getContext();
        this.f7533a = wq0Var;
        this.f7534b = i10;
        this.f7535c = c6Var;
        n3 n3Var = new n3(context, i10, new ch.c(this, 9), new l3(this), new l3(this), c6Var, wq0Var);
        this.f7537f = n3Var;
        n3Var.U2.f26942r = false;
        n3Var.setSelectorType(9);
        n3Var.setSelectorDrawableColor(0);
        n3Var.setPadding(AndroidUtilities.dp(9.0f), wq0Var.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
        n3Var.setClipToPadding(false);
        n3Var.setClipChildren(false);
        addView(n3Var, h7.z5.e(-1, -1, 119));
        n3Var.j(new fh.l(1, this, wq0Var));
        o3 o3Var = new o3(wq0Var);
        o3Var.f5819m = false;
        o3Var.C = false;
        o3Var.o(er.h);
        o3Var.n(350L);
        n3Var.setItemAnimator(o3Var);
        new f2.f0(new p3(this, wq0Var)).d(n3Var);
        View view = this.f7540s;
        if (view != null) {
            removeView(view);
        }
        View view2 = this.f7543y;
        if (view2 != null) {
            removeView(view2);
        }
        if (wq0Var.d != this.f7536e) {
            this.f7540s = null;
            this.f7541w = null;
            this.f7542x = null;
            this.v = null;
            this.f7543y = new FrameLayout(getContext());
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.A = linearLayout;
            linearLayout.setOrientation(1);
            this.f7543y.addView(this.A, h7.z5.e(-2, -2, 17));
            TextView textView = new TextView(getContext());
            this.B = textView;
            textView.setTextSize(1, 20.0f);
            this.B.setTypeface(AndroidUtilities.bold());
            this.B.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
            this.B.setText(LocaleController.getString(R.string.Gift2CollectionEmptyTitle));
            this.A.addView(this.B, h7.z5.t(-2, -2, 1, 0, 0, 0, 0));
            TextView textView2 = new TextView(getContext());
            this.C = textView2;
            textView2.setTextSize(1, 14.0f);
            this.C.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var));
            this.C.setText(LocaleController.getString(R.string.Gift2CollectionEmptyText));
            this.A.addView(this.C, h7.z5.t(-2, -2, 1, 0, 10, 0, 0));
            lh.d dVar = new lh.d(getContext(), c6Var, true);
            this.D = dVar;
            dVar.g(LocaleController.getString(R.string.Gift2CollectionEmptyButton), false, true);
            this.A.addView(this.D, h7.z5.t(200, 44, 1, 0, 19, 0, 12));
            final int i11 = 1;
            this.D.setOnClickListener(new View.OnClickListener(this) {

                public final t3 f7320b;

                {
                    this.f7320b = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i11) {
                        case 0:
                            m7 m7Var = this.f7320b.f7536e;
                            if (m7Var != null) {
                                if (!m7Var.f9747e || m7Var.f9749g != 783) {
                                    m7Var.f9749g = 783;
                                    m7Var.f9747e = true;
                                    m7Var.i(true);
                                }
                            }
                            break;
                        default:
                            this.f7320b.f7533a.a();
                            break;
                    }
                }
            });
            addView(this.f7543y, h7.z5.d(-1, -1.0f, 119, 0.0f, -12.0f, 0.0f, 0.0f));
            n3Var.setEmptyView(this.f7543y);
            LinearLayout linearLayout2 = this.A;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(wq0Var.f7200e.h() ? 0 : 8);
                return;
            }
            return;
        }
        this.f7543y = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.A = null;
        this.f7540s = new FrameLayout(getContext());
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        this.v = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f7540s.addView(this.v, h7.z5.e(-2, -2, 17));
        n9 n9Var = new n9(getContext());
        n9Var.setImageDrawable(new oi0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
        this.v.addView(n9Var, h7.z5.t(120, 120, 1, 0, 0, 0, 0));
        TextView textView3 = new TextView(getContext());
        this.f7541w = textView3;
        textView3.setTextSize(1, 17.0f);
        this.f7541w.setTypeface(AndroidUtilities.bold());
        this.f7541w.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        this.f7541w.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundTitle));
        this.v.addView(this.f7541w, h7.z5.t(-2, -2, 1, 0, 12, 0, 0));
        TextView textView4 = new TextView(getContext());
        this.f7542x = textView4;
        textView4.setTextSize(1, 14.0f);
        TextView textView5 = this.f7542x;
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        textView5.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        this.f7542x.setText(LocaleController.getString(R.string.ProfileGiftsNotFoundButton));
        final int i13 = 0;
        this.f7542x.setOnClickListener(new View.OnClickListener(this) {

            public final t3 f7320b;

            {
                this.f7320b = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (i13) {
                    case 0:
                        m7 m7Var = this.f7320b.f7536e;
                        if (m7Var != null) {
                            if (!m7Var.f9747e || m7Var.f9749g != 783) {
                                m7Var.f9749g = 783;
                                m7Var.f9747e = true;
                                m7Var.i(true);
                            }
                        }
                        break;
                    default:
                        this.f7320b.f7533a.a();
                        break;
                }
            }
        });
        this.f7542x.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
        this.f7542x.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 4, 4));
        h7.b6.a(this.f7542x);
        this.v.addView(this.f7542x, h7.z5.t(-2, -2, 1, 0, 8, 0, 0));
        addView(this.f7540s, h7.z5.e(-1, -1, 119));
        n3Var.setEmptyView(this.f7540s);
    }

    public void setReordering(boolean z10) {
        n3 n3Var;
        if (this.f7538n == z10) {
            return;
        }
        this.f7538n = z10;
        wq0 wq0Var = this.f7533a;
        wq0Var.p(wq0Var.g());
        int i10 = 0;
        while (true) {
            n3Var = this.f7537f;
            if (i10 >= n3Var.getChildCount()) {
                break;
            }
            View childAt = n3Var.getChildAt(i10);
            if (childAt instanceof b2) {
                ((b2) childAt).d(z10, true);
            }
            i10++;
        }
        b51 b51Var = n3Var.U2;
        if (b51Var != null) {
            b51Var.S();
        }
        if (z10) {
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) n2VarU;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new l2(profileActivity, 1));
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f7536e) {
            f(true);
            if (this.f7536e == null || !isAttachedToWindow()) {
                return;
            }
            n3 n3Var = this.f7537f;
            if (n3Var.canScrollVertically(1)) {
                for (int i12 = 0; i12 < n3Var.getChildCount(); i12++) {
                    if (!(n3Var.getChildAt(i12) instanceof h00)) {
                    }
                }
                return;
            }
            this.f7536e.a();
        }
    }

    public final void e() {
        if (this.f7538n) {
            m7 m7Var = this.f7536e;
            if (m7Var != null) {
                m7Var.l();
            }
            setReordering(false);
        }
    }

    public final void f(boolean z10) {
        b51 b51Var;
        n3 n3Var = this.f7537f;
        if (n3Var == null || (b51Var = n3Var.U2) == null) {
            return;
        }
        boolean zCanScrollVertically = n3Var.canScrollVertically(-1);
        b51Var.N(z10);
        if (zCanScrollVertically) {
            return;
        }
        n3Var.u0(0);
    }

    public float getTabsHeight() {
        int i10 = 0;
        while (true) {
            n3 n3Var = this.f7537f;
            if (i10 >= n3Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = n3Var.getChildAt(i10);
            int iR = RecyclerView.R(childAt);
            if (childAt instanceof b2) {
                if (iR == 0) {
                    return Math.max(0.0f, childAt.getY());
                }
            } else if (iR == 0) {
                return Math.max(0.0f, (childAt.getAlpha() * childAt.getHeight()) + childAt.getY());
            }
            i10++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f7534b).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f7534b).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setVisibleHeight(this.f7539r);
    }

    public void setHasTabs(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        n3 n3Var = this.f7537f;
        boolean zCanScrollVertically = n3Var.canScrollVertically(-1);
        n3Var.U2.N(true);
        if (!zCanScrollVertically) {
            n3Var.u0(0);
        }
        this.f7533a.o();
    }

    public void setVisibleHeight(int i10) {
        this.f7539r = i10;
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(i10, AndroidUtilities.dp(150.0f), AndroidUtilities.dp(220.0f)));
        float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, fClamp01);
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setAlpha(fClamp01);
            this.v.setScaleX(fLerp);
            this.v.setScaleY(fLerp);
        }
        FrameLayout frameLayout = this.f7540s;
        if (frameLayout != null) {
            frameLayout.setTranslationY((-(getMeasuredHeight() - this.f7539r)) / 2.0f);
        }
        LinearLayout linearLayout2 = this.A;
        if (linearLayout2 != null) {
            linearLayout2.setAlpha(fClamp01);
            this.A.setScaleX(fLerp);
            this.A.setScaleY(fLerp);
        }
        FrameLayout frameLayout2 = this.f7543y;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-(getMeasuredHeight() - this.f7539r)) / 2.0f);
        }
    }
}
