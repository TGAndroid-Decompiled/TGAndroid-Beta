package hg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import java.util.Date;
import jh.z3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.y8;

public final class b extends sa {
    public final TextView T;
    public final FrameLayout U;
    public Drawable V;
    public Drawable W;

    public TL_stories.Boost f8929a0;

    public final a f8930b0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.f8930b0 = new a(getContext());
        this.U = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.T = textView;
        textView.setTextColor(g6.v0(g6.G6, this.f25653y));
        this.T.setTypeface(AndroidUtilities.bold());
        this.T.setTextSize(12.0f);
        this.T.setGravity(17);
        this.U.addView(this.T, z5.c(22.0f, -2));
        this.U.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.U;
        boolean z10 = LocaleController.isRTL;
        addView(frameLayout, z5.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        y8 y8Var = this.A;
        if (i10 == 12) {
            y8Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            y8Var.i(-10703110, -12481584);
        } else {
            y8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f8929a0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.O) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, g6.f23175k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.f8929a0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.U;
        TextView textView = this.T;
        h5 h5Var = this.f25644b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i10 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            z3 z3Var = this.f25643a;
            y8 y8Var = this.A;
            if (j10 > 0) {
                h5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                y8Var.g(26);
                z3Var.e(null, y8Var);
                h5Var.i(null);
            } else if (boost.unclaimed) {
                h5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                y8Var.g(18);
                setAvatarColorByMonths(i10);
                z3Var.e(null, y8Var);
                h5Var.i(null);
            } else if (boost.user_id == -1) {
                h5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                y8Var.g(19);
                setAvatarColorByMonths(i10);
                z3Var.e(null, y8Var);
                h5Var.i(null);
            }
            String str = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(((long) boost.expires) * 1000));
            long j11 = boost.stars;
            h5 h5Var2 = this.f25645c;
            if (j11 > 0) {
                h5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, str), false);
            } else {
                h5Var2.l(LocaleController.formatString(R.string.BoostingExpires, str), false);
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
        } else {
            frameLayout.setVisibility(8);
        }
        int i11 = boost.multiplier;
        if (i11 > 0) {
            String strValueOf = String.valueOf(i11);
            a aVar = this.f8930b0;
            aVar.f8928f = strValueOf;
            aVar.f8927e = aVar.f8924a.measureText(strValueOf);
            aVar.invalidateSelf();
            h5Var.i(aVar);
        } else {
            h5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            h5Var.setPadding(0, h5Var.getPaddingTop(), 0, h5Var.getPaddingBottom());
        } else {
            int iDp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            h5Var.setPadding(LocaleController.isRTL ? iDp : 0, h5Var.getPaddingTop(), LocaleController.isRTL ? 0 : iDp, h5Var.getPaddingBottom());
        }
    }
}
