package me.vkryl.android.animator;

import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.BetterRatingView;

public final class BoolAnimator$$ExternalSyntheticLambda1 implements FactorAnimator.Target, BetterRatingView.OnRatingChangeListener {
    public final View f$0;

    public BoolAnimator$$ExternalSyntheticLambda1(View view) {
        this.f$0 = view;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        this.f$0.invalidate();
    }

    @Override
    public void onRatingChanged(int i) {
        boolean z = i > 0;
        View view = this.f$0;
        view.setEnabled(z);
        ((TextView) view).setText(LocaleController.getString(i < 4 ? R.string.Next : R.string.Send).toUpperCase());
    }
}
