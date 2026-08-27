package lh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;

public final class x2 extends org.telegram.ui.ActionBar.e5 {

    public AnimatorSet f17031f;
    public final p3 h;

    public x2(p3 p3Var) {
        this.h = p3Var;
    }

    @Override
    public final void m() {
        p3 p3Var = this.h;
        y2 y2Var = p3Var.d;
        e3 e3Var = p3Var.B;
        AnimatorSet animatorSet = this.f17031f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        e3Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = p3Var.C.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        y2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(y2Var, (Property<y2, Float>) property3, 1.0f));
        y2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(p3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new w2(this, i10));
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f17031f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f17031f.setInterpolator(er.h);
        this.f17031f.playTogether(arrayList);
        this.f17031f.addListener(new ag.x1(6, this, searchField));
        this.f17031f.start();
    }

    @Override
    public final void n() {
        p3 p3Var = this.h;
        y2 y2Var = p3Var.d;
        FrameLayout frameLayout = p3Var.h;
        e3 e3Var = p3Var.B;
        AnimatorSet animatorSet = this.f17031f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = p3Var.C.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(y2Var, (Property<y2, Float>) property3, 0.0f));
        y2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        p3Var.f16519s.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new w2(this, i10));
        arrayList.add(valueAnimatorOfFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f17031f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f17031f.setInterpolator(er.h);
        this.f17031f.playTogether(arrayList);
        this.f17031f.addListener(new ag.r1(this, 24));
        this.f17031f.start();
    }

    @Override
    public final void q(EditText editText) {
        String string = editText.getText().toString();
        f3 f3Var = this.h.f16518r;
        kh.c cVar = f3Var.v;
        if (!TextUtils.equals(f3Var.f16472f, string)) {
            if (f3Var.f16471e != -1) {
                ConnectionsManager.getInstance(f3Var.f16476w.f16507a).cancelRequest(f3Var.f16471e, true);
                f3Var.f16471e = -1;
            }
            f3Var.d = false;
            f3Var.h = null;
        }
        f3Var.f16472f = string;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        if (!TextUtils.isEmpty(string)) {
            f3Var.F(true);
            AndroidUtilities.runOnUIThread(cVar, 1500L);
        } else {
            f3Var.f16470c.clear();
            f3Var.F(false);
            f3Var.l();
        }
    }
}
