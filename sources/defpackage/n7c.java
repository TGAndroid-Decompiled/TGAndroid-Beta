package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class n7c extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final o7c d;

    public n7c(o7c o7cVar, Context context) {
        super(context);
        this.d = o7cVar;
        this.a = new int[2];
        this.b = new Rect();
        this.c = true;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        a aVar;
        boolean z;
        boolean z2;
        Integer num;
        float f;
        a aVar2;
        super.onScrollChanged(i, i2, i3, i4);
        o7c o7cVar = this.d;
        TextView textView = o7cVar.c;
        if (textView != null) {
            int[] iArr = this.a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = o7cVar.c.getMeasuredHeight() + iArr[1];
            aVar = ((e) o7cVar).actionBar;
            if (measuredHeight < aVar.getBottom()) {
                z = true;
            } else {
                z = false;
            }
            if (o7cVar.c.getTag() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                TextView textView2 = o7cVar.c;
                if (z) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = o7cVar.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    o7cVar.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                o7cVar.L = animatorSet2;
                a81 a81Var = o7cVar.E;
                float f2 = 0.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float[] fArr = {f};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a81Var, property, fArr);
                aVar2 = ((e) o7cVar).actionBar;
                ema titleTextView = aVar2.getTitleTextView();
                if (z) {
                    f2 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f2));
                o7cVar.L.setDuration(150L);
                o7cVar.L.addListener(new omb(this, (byte) 10));
                o7cVar.L.start();
            }
        }
    }

    @Override
    public final void requestChildFocus(View view, View view2) {
        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.c) {
            scrollToDescendant(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override
    public final void requestLayout() {
        this.c = true;
        super.requestLayout();
    }

    @Override
    public final void scrollToDescendant(View view) {
        Rect rect = this.b;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        rect.bottom = hl.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
