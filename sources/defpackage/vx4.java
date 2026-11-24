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
public final class vx4 extends w8c {
    public final TextView c0;
    public final FrameLayout d0;
    public Drawable e0;
    public Drawable f0;
    public TL_stories.Boost g0;
    public final sy2 h0;

    public vx4(Context context) {
        super(context, 0, 0, false);
        int i;
        int i2;
        this.h0 = new sy2(getContext());
        this.d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.c0 = textView;
        textView.setTextColor(cmb.v0(cmb.F6, this.E));
        this.c0.setTypeface(gm.o());
        this.c0.setTextSize(12.0f);
        this.c0.setGravity(17);
        this.d0.addView(this.c0, qoe.c(22.0f, -2));
        this.d0.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
        FrameLayout frameLayout = this.d0;
        boolean z = jb6.a0;
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
        addView(frameLayout, qoe.d(-2, -2.0f, i3, i2, 9.0f, z ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i) {
        pc0 pc0Var = this.F;
        if (i == 12) {
            pc0Var.h(-31392, -2796986);
        } else if (i == 6) {
            pc0Var.h(-10703110, -12481584);
        } else {
            pc0Var.h(-6631068, -11945404);
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
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i;
        this.g0 = boost;
        boolean z = boost.gift;
        FrameLayout frameLayout = this.d0;
        TextView textView = this.c0;
        int i2 = 0;
        lka lkaVar = this.b;
        if (!z && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i3 = ((boost.expires - boost.date) / 30) / 86400;
            long j = boost.stars;
            int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            kc0 kc0Var = this.a;
            pc0 pc0Var = this.F;
            if (i4 > 0) {
                lkaVar.l(jb6.G((int) j, "BoostingBoostStars", new Object[0]), false);
                pc0Var.f(26);
                kc0Var.f(null, pc0Var);
                lkaVar.i(null);
            } else if (boost.unclaimed) {
                lkaVar.l(jb6.M0(2131753142, null), false);
                pc0Var.f(18);
                setAvatarColorByMonths(i3);
                kc0Var.f(null, pc0Var);
                lkaVar.i(null);
            } else if (boost.user_id == -1) {
                lkaVar.l(jb6.M0(2131753143, null), false);
                pc0Var.f(19);
                setAvatarColorByMonths(i3);
                kc0Var.f(null, pc0Var);
                lkaVar.i(null);
            }
            String format = jb6.D0().n0().format(new Date(boost.expires * 1000));
            int i5 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            lka lkaVar2 = this.c;
            if (i5 > 0) {
                lkaVar2.l(jb6.a0(null, null, 2131753209, format), false);
            } else {
                lkaVar2.l(jb6.a0(null, null, 2131753489, format), false);
            }
            if (boost.gift) {
                if (this.f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231952);
                    this.f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(gm.L(4.0f));
                textView.setText(jb6.M0(2131753466, null));
                frameLayout.setBackground(cmb.c0(gm.L(12.0f), gm.L(12.0f), cmb.p1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231958);
                    this.e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(gm.L(4.0f));
                textView.setText(jb6.M0(2131753457, null));
                frameLayout.setBackground(cmb.c0(gm.L(12.0f), gm.L(12.0f), cmb.p1(0.2f, -13397548)));
            }
        }
        int i6 = boost.multiplier;
        if (i6 > 0) {
            String valueOf = String.valueOf(i6);
            sy2 sy2Var = this.h0;
            sy2Var.c = valueOf;
            sy2Var.e = sy2Var.b.measureText(valueOf);
            sy2Var.invalidateSelf();
            lkaVar.i(sy2Var);
        } else {
            lkaVar.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = gm.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (jb6.a0) {
                i = L;
            } else {
                i = 0;
            }
            int paddingTop = lkaVar.getPaddingTop();
            if (!jb6.a0) {
                i2 = L;
            }
            lkaVar.setPadding(i, paddingTop, i2, lkaVar.getPaddingBottom());
            return;
        }
        lkaVar.setPadding(0, lkaVar.getPaddingTop(), 0, lkaVar.getPaddingBottom());
    }
}
