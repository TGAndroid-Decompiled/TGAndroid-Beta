package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.tgnet.tl.TL_stories;
public final class zx4 extends vac {
    public final TextView c0;
    public final FrameLayout d0;
    public Drawable e0;
    public Drawable f0;
    public TL_stories.Boost g0;
    public final cy2 h0;

    public zx4(Context context) {
        super(context, 0, 0, false);
        int i;
        int i2;
        this.h0 = new cy2(getContext());
        this.d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.c0 = textView;
        textView.setTextColor(aob.v0(aob.G6, this.E));
        this.c0.setTypeface(hl.o());
        this.c0.setTextSize(12.0f);
        this.c0.setGravity(17);
        this.d0.addView(this.c0, tre.c(22.0f, -2));
        this.d0.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        FrameLayout frameLayout = this.d0;
        boolean z = ob6.a0;
        if (z) {
            i = 3;
        } else {
            i = 5;
        }
        int i3 = i | 48;
        if (z) {
            i2 = 9;
        } else {
            i2 = 0;
        }
        addView(frameLayout, tre.d(-2, -2.0f, i3, i2, 9.0f, z ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i) {
        rb0 rb0Var = this.F;
        if (i == 12) {
            rb0Var.h(-31392, -2796986);
        } else if (i == 6) {
            rb0Var.h(-10703110, -12481584);
        } else {
            rb0Var.h(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.g0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.T) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i;
        this.g0 = boost;
        boolean z = boost.gift;
        FrameLayout frameLayout = this.d0;
        TextView textView = this.c0;
        int i2 = 0;
        ema emaVar = this.b;
        if (!z && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i3 = ((boost.expires - boost.date) / 30) / 86400;
            long j = boost.stars;
            int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            mb0 mb0Var = this.a;
            rb0 rb0Var = this.F;
            if (i4 > 0) {
                emaVar.l(ob6.G((int) j, "BoostingBoostStars", new Object[0]), false);
                rb0Var.f(26);
                mb0Var.f(null, rb0Var);
                emaVar.i(null);
            } else if (boost.unclaimed) {
                emaVar.l(ob6.M0(2131753170, null), false);
                rb0Var.f(18);
                setAvatarColorByMonths(i3);
                mb0Var.f(null, rb0Var);
                emaVar.i(null);
            } else if (boost.user_id == -1) {
                emaVar.l(ob6.M0(2131753171, null), false);
                rb0Var.f(19);
                setAvatarColorByMonths(i3);
                mb0Var.f(null, rb0Var);
                emaVar.i(null);
            }
            String format = ob6.D0().n0().format(new Date(boost.expires * 1000));
            int i5 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            ema emaVar2 = this.c;
            if (i5 > 0) {
                emaVar2.l(ob6.a0(null, null, 2131753237, format), false);
            } else {
                emaVar2.l(ob6.a0(null, null, 2131753517, format), false);
            }
            if (boost.gift) {
                if (this.f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231951);
                    this.f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(hl.L(4.0f));
                textView.setText(ob6.M0(2131753494, null));
                frameLayout.setBackground(aob.c0(hl.L(12.0f), hl.L(12.0f), aob.p1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231957);
                    this.e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(hl.L(4.0f));
                textView.setText(ob6.M0(2131753485, null));
                frameLayout.setBackground(aob.c0(hl.L(12.0f), hl.L(12.0f), aob.p1(0.2f, -13397548)));
            }
        }
        int i6 = boost.multiplier;
        if (i6 > 0) {
            String valueOf = String.valueOf(i6);
            cy2 cy2Var = this.h0;
            cy2Var.c = valueOf;
            cy2Var.e = cy2Var.b.measureText(valueOf);
            cy2Var.invalidateSelf();
            emaVar.i(cy2Var);
        } else {
            emaVar.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = hl.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (ob6.a0) {
                i = L;
            } else {
                i = 0;
            }
            int paddingTop = emaVar.getPaddingTop();
            if (!ob6.a0) {
                i2 = L;
            }
            emaVar.setPadding(i, paddingTop, i2, emaVar.getPaddingBottom());
            return;
        }
        emaVar.setPadding(0, emaVar.getPaddingTop(), 0, emaVar.getPaddingBottom());
    }
}
