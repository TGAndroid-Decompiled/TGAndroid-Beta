package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;
public final class vq9 implements wq9 {
    public final ScrollFeedbackProvider a;

    public vq9(NestedScrollView nestedScrollView) {
        this.a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    @Override
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }
}
