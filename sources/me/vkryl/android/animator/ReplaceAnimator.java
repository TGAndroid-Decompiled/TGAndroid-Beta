package me.vkryl.android.animator;

import android.view.animation.Interpolator;
import com.google.zxing.BinaryBitmap;
import java.util.Collections;
import java.util.Iterator;

public final class ReplaceAnimator implements Iterable {
    public final ListAnimator list;

    public interface Callback {
        void onForceApplyChanges();

        void onItemChanged$1(ReplaceAnimator replaceAnimator);
    }

    public ReplaceAnimator(Callback callback, Interpolator interpolator, long j) {
        this.list = new ListAnimator(new BinaryBitmap(14, this, callback), interpolator, j);
    }

    @Override
    public final Iterator iterator() {
        return this.list.entries.iterator();
    }

    public final void replace(Object obj, boolean z) {
        this.list.reset(obj != null ? Collections.singletonList(obj) : null, z);
    }
}
