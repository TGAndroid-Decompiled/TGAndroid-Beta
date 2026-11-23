package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import fi.t3;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.a9;
public final class b extends sa {
    public final TextView f3335c0;
    public final FrameLayout f3336d0;
    public Drawable f3337e0;
    public Drawable f3338f0;
    public TL_stories.Boost f3339g0;
    public final a f3340h0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i7;
        int i10;
        this.f3340h0 = new a(getContext());
        this.f3336d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f3335c0 = textView;
        textView.setTextColor(n6.w0(n6.G6, this.E));
        this.f3335c0.setTypeface(g0.o());
        this.f3335c0.setTextSize(12.0f);
        this.f3335c0.setGravity(17);
        this.f3336d0.addView(this.f3335c0, na.c(22.0f, -2));
        this.f3336d0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.f3336d0;
        boolean z10 = gd.f24314a0;
        if (z10) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i11 = i7 | 48;
        if (z10) {
            i10 = 9;
        } else {
            i10 = 0;
        }
        addView(frameLayout, na.d(-2, -2.0f, i11, i10, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        a9 a9Var = this.F;
        if (i7 == 12) {
            a9Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            a9Var.i(-10703110, -12481584);
        } else {
            a9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f3339g0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (gd.f24314a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24314a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, n6.f29574k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i7;
        this.f3339g0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f3336d0;
        TextView textView = this.f3335c0;
        int i10 = 0;
        n5 n5Var = this.f31876b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i11 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            t3 t3Var = this.f31874a;
            a9 a9Var = this.F;
            if (i12 > 0) {
                n5Var.l(gd.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                a9Var.g(26);
                t3Var.f(null, a9Var);
                n5Var.i(null);
            } else if (boost.unclaimed) {
                n5Var.l(gd.N0(2131753174, null), false);
                a9Var.g(18);
                setAvatarColorByMonths(i11);
                t3Var.f(null, a9Var);
                n5Var.i(null);
            } else if (boost.user_id == -1) {
                n5Var.l(gd.N0(2131753175, null), false);
                a9Var.g(19);
                setAvatarColorByMonths(i11);
                t3Var.f(null, a9Var);
                n5Var.i(null);
            }
            String format = gd.E0().o0().format(new Date(boost.expires * 1000));
            int i13 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            n5 n5Var2 = this.f31878c;
            if (i13 > 0) {
                n5Var2.l(gd.a0(null, null, 2131753241, format), false);
            } else {
                n5Var2.l(gd.a0(null, null, 2131753521, format), false);
            }
            if (boost.gift) {
                if (this.f3338f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231951);
                    this.f3338f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3338f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(gd.N0(2131753498, null));
                frameLayout.setBackground(n6.e0(g0.L(12.0f), g0.L(12.0f), n6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f3337e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231957);
                    this.f3337e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3337e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(gd.N0(2131753489, null));
                frameLayout.setBackground(n6.e0(g0.L(12.0f), g0.L(12.0f), n6.r1(0.2f, -13397548)));
            }
        }
        int i14 = boost.multiplier;
        if (i14 > 0) {
            String valueOf = String.valueOf(i14);
            a aVar = this.f3340h0;
            aVar.f3334f = valueOf;
            aVar.f3333e = aVar.f3330a.measureText(valueOf);
            aVar.invalidateSelf();
            n5Var.i(aVar);
        } else {
            n5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (gd.f24314a0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int paddingTop = n5Var.getPaddingTop();
            if (!gd.f24314a0) {
                i10 = L;
            }
            n5Var.setPadding(i7, paddingTop, i10, n5Var.getPaddingBottom());
            return;
        }
        n5Var.setPadding(0, n5Var.getPaddingTop(), 0, n5Var.getPaddingBottom());
    }
}
