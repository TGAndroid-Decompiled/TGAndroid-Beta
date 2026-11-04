package ch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import ei.d4;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.u8;
public final class b extends pa {
    public final TextView f4774c0;
    public final FrameLayout f4775d0;
    public Drawable f4776e0;
    public Drawable f4777f0;
    public TL_stories.Boost f4778g0;
    public final a f4779h0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i3;
        int i10;
        this.f4779h0 = new a(getContext());
        this.f4775d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f4774c0 = textView;
        textView.setTextColor(k6.w0(k6.G6, this.E));
        this.f4774c0.setTypeface(g0.o());
        this.f4774c0.setTextSize(12.0f);
        this.f4774c0.setGravity(17);
        this.f4775d0.addView(this.f4774c0, mf.c(22.0f, -2));
        this.f4775d0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.f4775d0;
        boolean z10 = bd.f21784a0;
        if (z10) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        int i11 = i3 | 48;
        if (z10) {
            i10 = 9;
        } else {
            i10 = 0;
        }
        addView(frameLayout, mf.d(-2, -2.0f, i11, i10, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i3) {
        u8 u8Var = this.F;
        if (i3 == 12) {
            u8Var.i(-31392, -2796986);
        } else if (i3 == 6) {
            u8Var.i(-10703110, -12481584);
        } else {
            u8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f4778g0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.T) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = g0.L(70.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, k6.f28002k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i3;
        this.f4778g0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f4775d0;
        TextView textView = this.f4774c0;
        int i10 = 0;
        k5 k5Var = this.f29824b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i11 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            d4 d4Var = this.f29822a;
            u8 u8Var = this.F;
            if (i12 > 0) {
                k5Var.l(bd.G((int) j10, "BoostingBoostStars", new Object[0]), false);
                u8Var.g(26);
                d4Var.e(null, u8Var);
                k5Var.i(null);
            } else if (boost.unclaimed) {
                k5Var.l(bd.M0(2131753177, null), false);
                u8Var.g(18);
                setAvatarColorByMonths(i11);
                d4Var.e(null, u8Var);
                k5Var.i(null);
            } else if (boost.user_id == -1) {
                k5Var.l(bd.M0(2131753178, null), false);
                u8Var.g(19);
                setAvatarColorByMonths(i11);
                d4Var.e(null, u8Var);
                k5Var.i(null);
            }
            String format = bd.E0().o0().format(new Date(boost.expires * 1000));
            int i13 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            k5 k5Var2 = this.f29826c;
            if (i13 > 0) {
                k5Var2.l(bd.a0(null, null, 2131753244, format), false);
            } else {
                k5Var2.l(bd.a0(null, null, 2131753524, format), false);
            }
            if (boost.gift) {
                if (this.f4777f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231947);
                    this.f4777f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f4777f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(bd.M0(2131753501, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f4776e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231953);
                    this.f4776e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f4776e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(bd.M0(2131753492, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -13397548)));
            }
        }
        int i14 = boost.multiplier;
        if (i14 > 0) {
            String valueOf = String.valueOf(i14);
            a aVar = this.f4779h0;
            aVar.f4773f = valueOf;
            aVar.f4772e = aVar.f4769a.measureText(valueOf);
            aVar.invalidateSelf();
            k5Var.i(aVar);
        } else {
            k5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (bd.f21784a0) {
                i3 = L;
            } else {
                i3 = 0;
            }
            int paddingTop = k5Var.getPaddingTop();
            if (!bd.f21784a0) {
                i10 = L;
            }
            k5Var.setPadding(i3, paddingTop, i10, k5Var.getPaddingBottom());
            return;
        }
        k5Var.setPadding(0, k5Var.getPaddingTop(), 0, k5Var.getPaddingBottom());
    }
}
