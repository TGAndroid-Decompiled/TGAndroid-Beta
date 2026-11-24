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
public final class uv4 extends v6c {
    public final TextView c0;
    public final FrameLayout d0;
    public Drawable e0;
    public Drawable f0;
    public TL_stories.Boost g0;
    public final ix2 h0;

    public uv4(Context context) {
        super(context, 0, 0, false);
        int i;
        int i2;
        this.h0 = new ix2(getContext());
        this.d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.c0 = textView;
        textView.setTextColor(bkb.v0(bkb.F6, this.E));
        this.c0.setTypeface(gl.o());
        this.c0.setTextSize(12.0f);
        this.c0.setGravity(17);
        this.d0.addView(this.c0, nme.c(22.0f, -2));
        this.d0.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        FrameLayout frameLayout = this.d0;
        boolean z = k96.a0;
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
        addView(frameLayout, nme.d(-2, -2.0f, i3, i2, 9.0f, z ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i) {
        pb0 pb0Var = this.F;
        if (i == 12) {
            pb0Var.h(-31392, -2796986);
        } else if (i == 6) {
            pb0Var.h(-10703110, -12481584);
        } else {
            pb0Var.h(-6631068, -11945404);
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
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(70.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(70.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i;
        this.g0 = boost;
        boolean z = boost.gift;
        FrameLayout frameLayout = this.d0;
        TextView textView = this.c0;
        int i2 = 0;
        jia jiaVar = this.b;
        if (!z && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i3 = ((boost.expires - boost.date) / 30) / 86400;
            long j = boost.stars;
            int i4 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            kb0 kb0Var = this.a;
            pb0 pb0Var = this.F;
            if (i4 > 0) {
                jiaVar.l(k96.G((int) j, "BoostingBoostStars", new Object[0]), false);
                pb0Var.f(26);
                kb0Var.f(null, pb0Var);
                jiaVar.i(null);
            } else if (boost.unclaimed) {
                jiaVar.l(k96.M0(2131753174, null), false);
                pb0Var.f(18);
                setAvatarColorByMonths(i3);
                kb0Var.f(null, pb0Var);
                jiaVar.i(null);
            } else if (boost.user_id == -1) {
                jiaVar.l(k96.M0(2131753175, null), false);
                pb0Var.f(19);
                setAvatarColorByMonths(i3);
                kb0Var.f(null, pb0Var);
                jiaVar.i(null);
            }
            String format = k96.D0().n0().format(new Date(boost.expires * 1000));
            int i5 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            jia jiaVar2 = this.c;
            if (i5 > 0) {
                jiaVar2.l(k96.a0(null, null, 2131753241, format), false);
            } else {
                jiaVar2.l(k96.a0(null, null, 2131753521, format), false);
            }
            if (boost.gift) {
                if (this.f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231951);
                    this.f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(gl.L(4.0f));
                textView.setText(k96.M0(2131753498, null));
                frameLayout.setBackground(bkb.c0(gl.L(12.0f), gl.L(12.0f), bkb.p1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231957);
                    this.e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(gl.L(4.0f));
                textView.setText(k96.M0(2131753489, null));
                frameLayout.setBackground(bkb.c0(gl.L(12.0f), gl.L(12.0f), bkb.p1(0.2f, -13397548)));
            }
        }
        int i6 = boost.multiplier;
        if (i6 > 0) {
            String valueOf = String.valueOf(i6);
            ix2 ix2Var = this.h0;
            ix2Var.c = valueOf;
            ix2Var.e = ix2Var.b.measureText(valueOf);
            ix2Var.invalidateSelf();
            jiaVar.i(ix2Var);
        } else {
            jiaVar.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = gl.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (k96.a0) {
                i = L;
            } else {
                i = 0;
            }
            int paddingTop = jiaVar.getPaddingTop();
            if (!k96.a0) {
                i2 = L;
            }
            jiaVar.setPadding(i, paddingTop, i2, jiaVar.getPaddingBottom());
            return;
        }
        jiaVar.setPadding(0, jiaVar.getPaddingTop(), 0, jiaVar.getPaddingBottom());
    }
}
