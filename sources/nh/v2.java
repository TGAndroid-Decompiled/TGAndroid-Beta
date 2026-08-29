package nh;

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
import org.telegram.ui.Components.jr;
public final class v2 extends org.telegram.ui.ActionBar.e5 {
    public AnimatorSet f18742f;
    public final n3 h;

    public v2(n3 n3Var) {
        this.h = n3Var;
    }

    @Override
    public final void m() {
        n3 n3Var = this.h;
        w2 w2Var = n3Var.d;
        c3 c3Var = n3Var.B;
        AnimatorSet animatorSet = this.f18742f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        c3Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(c3Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(c3Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(c3Var, property3, 1.0f));
        EditTextBoldCursor searchField = n3Var.C.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        w2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(w2Var, property3, 1.0f));
        w2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(n3Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new u2(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f18742f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f18742f.setInterpolator(jr.h);
        this.f18742f.playTogether(arrayList);
        this.f18742f.addListener(new bg.c3(7, this, searchField));
        this.f18742f.start();
    }

    @Override
    public final void n() {
        n3 n3Var = this.h;
        w2 w2Var = n3Var.d;
        FrameLayout frameLayout = n3Var.h;
        c3 c3Var = n3Var.B;
        AnimatorSet animatorSet = this.f18742f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(c3Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(c3Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(c3Var, property3, 0.0f));
        EditTextBoldCursor searchField = n3Var.C.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(w2Var, property3, 0.0f));
        w2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        n3Var.f18179s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new u2(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f18742f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f18742f.setInterpolator(jr.h);
        this.f18742f.playTogether(arrayList);
        this.f18742f.addListener(new ag.m0(this, 28));
        this.f18742f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        d3 d3Var = this.h.f18178r;
        lh.m5 m5Var = d3Var.v;
        if (!TextUtils.equals(d3Var.f18126f, obj)) {
            if (d3Var.f18125e != -1) {
                ConnectionsManager.getInstance(d3Var.f18130w.f18167a).cancelRequest(d3Var.f18125e, true);
                d3Var.f18125e = -1;
            }
            d3Var.d = false;
            d3Var.h = null;
        }
        d3Var.f18126f = obj;
        AndroidUtilities.cancelRunOnUIThread(m5Var);
        if (TextUtils.isEmpty(obj)) {
            d3Var.f18124c.clear();
            d3Var.F(false);
            d3Var.l();
            return;
        }
        d3Var.F(true);
        AndroidUtilities.runOnUIThread(m5Var, 1500L);
    }
}
