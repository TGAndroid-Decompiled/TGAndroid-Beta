package me.vkryl.android.animator;

import android.view.animation.Interpolator;
import com.stripe.android.Stripe;
import java.util.Collections;
import java.util.Iterator;

public final class ReplaceAnimator implements Iterable {
    public final ListAnimator list;

    public interface Callback {
        boolean hasChanges(ReplaceAnimator replaceAnimator);

        boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f);

        void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z);

        void onForceApplyChanges(ReplaceAnimator replaceAnimator);

        void onItemChanged(ReplaceAnimator replaceAnimator);

        void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator);
    }

    public ReplaceAnimator(Callback callback, Interpolator interpolator, long j) {
        this.list = new ListAnimator(new Stripe(this, callback, false, 9), interpolator, j);
    }

    @Override
    public final Iterator iterator() {
        return this.list.entries.iterator();
    }

    public final void replace(Object obj, boolean z) {
        this.list.reset(obj != null ? Collections.singletonList(obj) : null, z);
    }
}
