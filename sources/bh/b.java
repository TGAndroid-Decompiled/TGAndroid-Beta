package bh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ja;
import fi.v3;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.t8;
public final class b extends pa {
    public final TextView f3359c0;
    public final FrameLayout f3360d0;
    public Drawable f3361e0;
    public Drawable f3362f0;
    public TL_stories.Boost f3363g0;
    public final a f3364h0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i7;
        int i10;
        this.f3364h0 = new a(getContext());
        this.f3360d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.f3359c0 = textView;
        textView.setTextColor(j6.w0(j6.G6, this.E));
        this.f3359c0.setTypeface(g0.o());
        this.f3359c0.setTextSize(12.0f);
        this.f3359c0.setGravity(17);
        this.f3360d0.addView(this.f3359c0, ja.c(22.0f, -2));
        this.f3360d0.setPadding(g0.L(8.0f), 0, g0.L(8.0f), 0);
        FrameLayout frameLayout = this.f3360d0;
        boolean z10 = hd.f24104a0;
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
        addView(frameLayout, ja.d(-2, -2.0f, i11, i10, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i7) {
        t8 t8Var = this.F;
        if (i7 == 12) {
            t8Var.i(-31392, -2796986);
        } else if (i7 == 6) {
            t8Var.i(-10703110, -12481584);
        } else {
            t8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f3363g0;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.T) {
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = g0.L(70.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                i7 = g0.L(70.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, j6.f28972k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i7;
        this.f3363g0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.f3360d0;
        TextView textView = this.f3359c0;
        int i10 = 0;
        j5 j5Var = this.f30885b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i11 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            int i12 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            v3 v3Var = this.f30883a;
            t8 t8Var = this.F;
            if (i12 > 0) {
                j5Var.l(hd.G((int) j3, "BoostingBoostStars", new Object[0]), false);
                t8Var.g(26);
                v3Var.f(null, t8Var);
                j5Var.i(null);
            } else if (boost.unclaimed) {
                j5Var.l(hd.M0(2131753177, null), false);
                t8Var.g(18);
                setAvatarColorByMonths(i11);
                v3Var.f(null, t8Var);
                j5Var.i(null);
            } else if (boost.user_id == -1) {
                j5Var.l(hd.M0(2131753178, null), false);
                t8Var.g(19);
                setAvatarColorByMonths(i11);
                v3Var.f(null, t8Var);
                j5Var.i(null);
            }
            String format = hd.E0().o0().format(new Date(boost.expires * 1000));
            int i13 = (boost.stars > 0L ? 1 : (boost.stars == 0L ? 0 : -1));
            j5 j5Var2 = this.f30887c;
            if (i13 > 0) {
                j5Var2.l(hd.a0(null, null, 2131753244, format), false);
            } else {
                j5Var2.l(hd.a0(null, null, 2131753524, format), false);
            }
            if (boost.gift) {
                if (this.f3362f0 == null) {
                    Drawable drawable = getResources().getDrawable(2131231947);
                    this.f3362f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3362f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.M0(2131753501, null));
                frameLayout.setBackground(j6.e0(g0.L(12.0f), g0.L(12.0f), j6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.f3361e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(2131231953);
                    this.f3361e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f3361e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(g0.L(4.0f));
                textView.setText(hd.M0(2131753492, null));
                frameLayout.setBackground(j6.e0(g0.L(12.0f), g0.L(12.0f), j6.r1(0.2f, -13397548)));
            }
        }
        int i14 = boost.multiplier;
        if (i14 > 0) {
            String valueOf = String.valueOf(i14);
            a aVar = this.f3364h0;
            aVar.f3358f = valueOf;
            aVar.f3357e = aVar.f3354a.measureText(valueOf);
            aVar.invalidateSelf();
            j5Var.i(aVar);
        } else {
            j5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int L = g0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (hd.f24104a0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int paddingTop = j5Var.getPaddingTop();
            if (!hd.f24104a0) {
                i10 = L;
            }
            j5Var.setPadding(i7, paddingTop, i10, j5Var.getPaddingBottom());
            return;
        }
        j5Var.setPadding(0, j5Var.getPaddingTop(), 0, j5Var.getPaddingBottom());
    }
}
