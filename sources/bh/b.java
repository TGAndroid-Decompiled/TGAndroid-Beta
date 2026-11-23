package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import fi.t3;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.b9;
public final class b extends ra {
    public final TextView f3384c0;
    public final FrameLayout f3385d0;
    public Drawable f3386e0;
    public Drawable f3387f0;
    public TL_stories.Boost f3388g0;
    public final a f3389h0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i7;
        int i10;
        this.f3389h0 = new a(getContext());
        this.f3385d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f3384c0 = textView;
        textView.setTextColor(m6.w0(m6.G6, this.E));
        this.f3384c0.setTypeface(g0.o());
        this.f3384c0.setTextSize(12.0f);
        this.f3384c0.setGravity(17);
        this.f3385d0.addView(this.f3384c0, ma.c(22.0f, -2));
        this.f3385d0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.f3385d0;
        boolean z10 = hd.f24444a0;
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
        addView(frameLayout, ma.d(-2, -2.0f, i11, i10, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        b9 b9Var = this.F;
        if (i7 == 12) {
            b9Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            b9Var.i(-10703110, -12481584);
        } else {
            b9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f3388g0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (hd.f24444a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24444a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, m6.f29504k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i7;
        this.f3388g0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f3385d0;
        TextView textView = this.f3384c0;
        int i10 = 0;
        m5 m5Var = this.f31755b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i11 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            t3 t3Var = this.f31753a;
            b9 b9Var = this.F;
            if (i12 > 0) {
                m5Var.l(hd.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                b9Var.g(26);
                t3Var.f(null, b9Var);
                m5Var.i(null);
            } else if (boost.unclaimed) {
                m5Var.l(hd.N0(2131753174, null), false);
                b9Var.g(18);
                setAvatarColorByMonths(i11);
                t3Var.f(null, b9Var);
                m5Var.i(null);
            } else if (boost.user_id == -1) {
                m5Var.l(hd.N0(2131753175, null), false);
                b9Var.g(19);
                setAvatarColorByMonths(i11);
                t3Var.f(null, b9Var);
                m5Var.i(null);
            }
            String format = hd.E0().o0().format(new Date(boost.expires * 1000));
            int i13 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            m5 m5Var2 = this.f31757c;
            if (i13 > 0) {
                m5Var2.l(hd.a0(null, null, 2131753241, format), false);
            } else {
                m5Var2.l(hd.a0(null, null, 2131753521, format), false);
            }
            if (boost.gift) {
                if (this.f3387f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231948);
                    this.f3387f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3387f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.N0(2131753498, null));
                frameLayout.setBackground(m6.e0(g0.L(12.0f), g0.L(12.0f), m6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f3386e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231954);
                    this.f3386e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3386e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.N0(2131753489, null));
                frameLayout.setBackground(m6.e0(g0.L(12.0f), g0.L(12.0f), m6.r1(0.2f, -13397548)));
            }
        }
        int i14 = boost.multiplier;
        if (i14 > 0) {
            String valueOf = String.valueOf(i14);
            a aVar = this.f3389h0;
            aVar.f3383f = valueOf;
            aVar.f3382e = aVar.f3379a.measureText(valueOf);
            aVar.invalidateSelf();
            m5Var.i(aVar);
        } else {
            m5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (hd.f24444a0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int paddingTop = m5Var.getPaddingTop();
            if (!hd.f24444a0) {
                i10 = L;
            }
            m5Var.setPadding(i7, paddingTop, i10, m5Var.getPaddingBottom());
            return;
        }
        m5Var.setPadding(0, m5Var.getPaddingTop(), 0, m5Var.getPaddingBottom());
    }
}
