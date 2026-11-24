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
import org.telegram.ui.ActionBar.d;
public final class o3c extends ScrollView {
    public final int[] a;
    public final Rect b;
    public boolean c;
    public final p3c d;

    public o3c(p3c p3cVar, Context context) {
        super(context);
        this.d = p3cVar;
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
        p3c p3cVar = this.d;
        TextView textView = p3cVar.c;
        if (textView != null) {
            int[] iArr = this.a;
            textView.getLocationOnScreen(iArr);
            int measuredHeight = p3cVar.c.getMeasuredHeight() + iArr[1];
            aVar = ((d) p3cVar).actionBar;
            if (measuredHeight < aVar.getBottom()) {
                z = true;
            } else {
                z = false;
            }
            if (p3cVar.c.getTag() == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                TextView textView2 = p3cVar.c;
                if (z) {
                    num = null;
                } else {
                    num = 1;
                }
                textView2.setTag(num);
                AnimatorSet animatorSet = p3cVar.L;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    p3cVar.L = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                p3cVar.L = animatorSet2;
                s71 s71Var = p3cVar.E;
                float f2 = 0.0f;
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float[] fArr = {f};
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s71Var, property, fArr);
                aVar2 = ((d) p3cVar).actionBar;
                jia titleTextView = aVar2.getTitleTextView();
                if (z) {
                    f2 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat, ObjectAnimator.ofFloat(titleTextView, property, f2));
                p3cVar.L.setDuration(150L);
                p3cVar.L.addListener(new iab(this, (byte) 11));
                p3cVar.L.start();
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
        rect.bottom = gl.L(120.0f) + rect.bottom;
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
            computeScrollDeltaToGetChildRectOnScreen -= (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
        }
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }
}
