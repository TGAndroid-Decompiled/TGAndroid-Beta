package kh;

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
import org.telegram.ui.Components.gr;
public final class y2 extends org.telegram.ui.ActionBar.e5 {
    public AnimatorSet f16394f;
    public final q3 h;

    public y2(q3 q3Var) {
        this.h = q3Var;
    }

    @Override
    public final void m() {
        q3 q3Var = this.h;
        z2 z2Var = q3Var.d;
        f3 f3Var = q3Var.B;
        AnimatorSet animatorSet = this.f16394f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        f3Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property3, 1.0f));
        EditTextBoldCursor searchField = q3Var.C.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        z2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(z2Var, property3, 1.0f));
        z2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(q3Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x2(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f16394f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f16394f.setInterpolator(gr.h);
        this.f16394f.playTogether(arrayList);
        this.f16394f.addListener(new fg.j(4, this, searchField));
        this.f16394f.start();
    }

    @Override
    public final void n() {
        q3 q3Var = this.h;
        z2 z2Var = q3Var.d;
        FrameLayout frameLayout = q3Var.h;
        f3 f3Var = q3Var.B;
        AnimatorSet animatorSet = this.f16394f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property3, 0.0f));
        EditTextBoldCursor searchField = q3Var.C.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(z2Var, property3, 0.0f));
        z2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        q3Var.f15870s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x2(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f16394f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f16394f.setInterpolator(gr.h);
        this.f16394f.playTogether(arrayList);
        this.f16394f.addListener(new ag.e(this, 22));
        this.f16394f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        g3 g3Var = this.h.f15869r;
        f1 f1Var = g3Var.v;
        if (!TextUtils.equals(g3Var.f15828f, obj)) {
            if (g3Var.f15827e != -1) {
                ConnectionsManager.getInstance(g3Var.f15832w.f15858a).cancelRequest(g3Var.f15827e, true);
                g3Var.f15827e = -1;
            }
            g3Var.d = false;
            g3Var.h = null;
        }
        g3Var.f15828f = obj;
        AndroidUtilities.cancelRunOnUIThread(f1Var);
        if (TextUtils.isEmpty(obj)) {
            g3Var.f15826c.clear();
            g3Var.F(false);
            g3Var.l();
            return;
        }
        g3Var.F(true);
        AndroidUtilities.runOnUIThread(f1Var, 1500L);
    }
}
