package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ha;
import di.c4;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.w8;
public final class b extends pa {
    public final TextView f3404b0;
    public final FrameLayout f3405c0;
    public Drawable f3406d0;
    public Drawable f3407e0;
    public TL_stories.Boost f3408f0;
    public final a f3409g0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i7;
        int i10;
        this.f3409g0 = new a(getContext());
        this.f3405c0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f3404b0 = textView;
        textView.setTextColor(k6.w0(k6.G6, this.D));
        this.f3404b0.setTypeface(g0.o());
        this.f3404b0.setTextSize(12.0f);
        this.f3404b0.setGravity(17);
        this.f3405c0.addView(this.f3404b0, ha.c(22.0f, -2));
        this.f3405c0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.f3405c0;
        boolean z9 = hd.f22878a0;
        if (z9) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        int i11 = i7 | 48;
        if (z9) {
            i10 = 9;
        } else {
            i10 = 0;
        }
        addView(frameLayout, ha.d(-2, -2.0f, i11, i10, 9.0f, z9 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        w8 w8Var = this.E;
        if (i7 == 12) {
            w8Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            w8Var.i(-10703110, -12481584);
        } else {
            w8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f3408f0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.S) {
            if (hd.f22878a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f22878a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, k6.f27972k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i7;
        this.f3408f0 = boost;
        boolean z9 = boost.gift;
        FrameLayout frameLayout = this.f3405c0;
        TextView textView = this.f3404b0;
        int i10 = 0;
        k5 k5Var = this.f29750b;
        if (!z9 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i11 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            c4 c4Var = this.f29748a;
            w8 w8Var = this.E;
            if (i12 > 0) {
                k5Var.l(hd.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                w8Var.g(26);
                c4Var.e(null, w8Var);
                k5Var.i(null);
            } else if (boost.unclaimed) {
                k5Var.l(hd.M0(2131753177, null), false);
                w8Var.g(18);
                setAvatarColorByMonths(i11);
                c4Var.e(null, w8Var);
                k5Var.i(null);
            } else if (boost.user_id == -1) {
                k5Var.l(hd.M0(2131753178, null), false);
                w8Var.g(19);
                setAvatarColorByMonths(i11);
                c4Var.e(null, w8Var);
                k5Var.i(null);
            }
            String format = hd.E0().o0().format(new Date(boost.expires * 1000));
            int i13 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            k5 k5Var2 = this.f29751c;
            if (i13 > 0) {
                k5Var2.l(hd.a0(null, null, 2131753244, format), false);
            } else {
                k5Var2.l(hd.a0(null, null, 2131753524, format), false);
            }
            if (boost.gift) {
                if (this.f3407e0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231947);
                    this.f3407e0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3407e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.M0(2131753501, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f3406d0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231953);
                    this.f3406d0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3406d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.M0(2131753492, null));
                frameLayout.setBackground(k6.e0(g0.L(12.0f), g0.L(12.0f), k6.r1(0.2f, -13397548)));
            }
        }
        int i14 = boost.multiplier;
        if (i14 > 0) {
            String valueOf = String.valueOf(i14);
            a aVar = this.f3409g0;
            aVar.f3403f = valueOf;
            aVar.f3402e = aVar.f3399a.measureText(valueOf);
            aVar.invalidateSelf();
            k5Var.i(aVar);
        } else {
            k5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (hd.f22878a0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int paddingTop = k5Var.getPaddingTop();
            if (!hd.f22878a0) {
                i10 = L;
            }
            k5Var.setPadding(i7, paddingTop, i10, k5Var.getPaddingBottom());
            return;
        }
        k5Var.setPadding(0, k5Var.getPaddingTop(), 0, k5Var.getPaddingBottom());
    }
}
