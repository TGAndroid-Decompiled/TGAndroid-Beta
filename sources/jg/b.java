package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import java.util.Date;
import lh.y3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.e9;
public final class b extends sa {
    public final TextView T;
    public final FrameLayout U;
    public Drawable V;
    public Drawable W;
    public TL_stories.Boost f11697a0;
    public final a f11698b0;

    public b(Context context) {
        super(context, 0, 0, false);
        int i10;
        int i11;
        this.f11698b0 = new a(getContext());
        this.U = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.T = textView;
        textView.setTextColor(g6.v0(g6.G6, this.f25684y));
        this.T.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(12.0f);
        this.T.setGravity(17);
        this.U.addView(this.T, f6.c(22.0f, -2));
        this.U.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.U;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        int i12 = i10 | 48;
        if (z10) {
            i11 = 9;
        } else {
            i11 = 0;
        }
        addView(frameLayout, f6.d(-2, -2.0f, i12, i11, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        e9 e9Var = this.A;
        if (i10 == 12) {
            e9Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            e9Var.i(-10703110, -12481584);
        } else {
            e9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f11697a0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.O) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(70.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(70.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, g6.f23183k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        int i10;
        this.f11697a0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.U;
        TextView textView = this.T;
        int i11 = 0;
        h5 h5Var = this.f25675b;
        if (!z10 && !boost.giveaway) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
            int i12 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            y3 y3Var = this.f25674a;
            e9 e9Var = this.A;
            if (j10 > 0) {
                h5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                e9Var.g(26);
                y3Var.e(null, e9Var);
                h5Var.i(null);
            } else if (boost.unclaimed) {
                h5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                e9Var.g(18);
                setAvatarColorByMonths(i12);
                y3Var.e(null, e9Var);
                h5Var.i(null);
            } else if (boost.user_id == -1) {
                h5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                e9Var.g(19);
                setAvatarColorByMonths(i12);
                y3Var.e(null, e9Var);
                h5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j11 = boost.stars;
            h5 h5Var2 = this.f25676c;
            if (j11 > 0) {
                h5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                h5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.W == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.W = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.W, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(g6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), g6.l1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.V == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.V = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.V, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(g6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), g6.l1(0.2f, -13397548)));
            }
        }
        int i13 = boost.multiplier;
        if (i13 > 0) {
            String valueOf = String.valueOf(i13);
            a aVar = this.f11698b0;
            aVar.f11696f = valueOf;
            aVar.f11695e = aVar.f11692a.measureText(valueOf);
            aVar.invalidateSelf();
            h5Var.i(aVar);
        } else {
            h5Var.i(null);
        }
        if (frameLayout.getVisibility() == 0) {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            if (LocaleController.isRTL) {
                i10 = dp;
            } else {
                i10 = 0;
            }
            int paddingTop = h5Var.getPaddingTop();
            if (!LocaleController.isRTL) {
                i11 = dp;
            }
            h5Var.setPadding(i10, paddingTop, i11, h5Var.getPaddingBottom());
            return;
        }
        h5Var.setPadding(0, h5Var.getPaddingTop(), 0, h5Var.getPaddingBottom());
    }
}
