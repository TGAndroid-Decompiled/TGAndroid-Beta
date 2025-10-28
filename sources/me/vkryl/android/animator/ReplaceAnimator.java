package me.vkryl.android.animator;

import android.view.animation.Interpolator;
import java.util.Collections;
import java.util.Iterator;
import me.vkryl.android.animator.ListAnimator;

public class ReplaceAnimator implements Iterable {
    private final ListAnimator list;

    public interface Callback {

        public abstract class CC {
            public static boolean $default$hasChanges(Callback callback, ReplaceAnimator replaceAnimator) {
                return false;
            }

            public static boolean $default$onApplyMetadataAnimation(Callback callback, ReplaceAnimator replaceAnimator, float f) {
                return false;
            }

            public static void $default$onFinishMetadataAnimation(Callback callback, ReplaceAnimator replaceAnimator, boolean z) {
            }

            public static void $default$onForceApplyChanges(Callback callback, ReplaceAnimator replaceAnimator) {
            }

            public static void $default$onPrepareMetadataAnimation(Callback callback, ReplaceAnimator replaceAnimator) {
            }
        }

        boolean hasChanges(ReplaceAnimator replaceAnimator);

        boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f);

        void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z);

        void onForceApplyChanges(ReplaceAnimator replaceAnimator);

        void onItemChanged(ReplaceAnimator replaceAnimator);

        void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator);
    }

    public ReplaceAnimator(final Callback callback, Interpolator interpolator, long j) {
        this.list = new ListAnimator(new ListAnimator.Callback() {
            @Override
            public void onItemsChanged(ListAnimator listAnimator) {
                callback.onItemChanged(ReplaceAnimator.this);
            }

            @Override
            public boolean hasChanges(ListAnimator listAnimator) {
                return callback.hasChanges(ReplaceAnimator.this);
            }

            @Override
            public void onForceApplyChanges(ListAnimator listAnimator) {
                callback.onForceApplyChanges(ReplaceAnimator.this);
            }

            @Override
            public void onPrepareMetadataAnimation(ListAnimator listAnimator) {
                callback.onPrepareMetadataAnimation(ReplaceAnimator.this);
            }

            @Override
            public boolean onApplyMetadataAnimation(ListAnimator listAnimator, float f) {
                return callback.onApplyMetadataAnimation(ReplaceAnimator.this, f);
            }

            @Override
            public void onFinishMetadataAnimation(ListAnimator listAnimator, boolean z) {
                callback.onFinishMetadataAnimation(ReplaceAnimator.this, z);
            }
        }, interpolator, j);
    }

    public void replace(Object obj, boolean z) {
        this.list.reset(obj != null ? Collections.singletonList(obj) : null, z);
    }

    public ListAnimator.Metadata getMetadata() {
        return this.list.getMetadata();
    }

    public void clear(boolean z) {
        this.list.clear(z);
    }

    @Override
    public Iterator iterator() {
        return this.list.iterator();
    }
}
