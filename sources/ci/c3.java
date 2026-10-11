package ci;

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
import org.telegram.ui.Components.is;
public final class c3 extends org.telegram.ui.ActionBar.e5 {
    public AnimatorSet f4832f;
    public final v3 h;

    public c3(v3 v3Var) {
        this.h = v3Var;
    }

    @Override
    public final void m() {
        v3 v3Var = this.h;
        d3 d3Var = v3Var.d;
        j3 j3Var = v3Var.F;
        AnimatorSet animatorSet = this.f4832f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        j3Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, property3, 1.0f));
        EditTextBoldCursor searchField = v3Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        d3Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(d3Var, property3, 1.0f));
        d3Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(v3Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f4832f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f4832f.setInterpolator(is.h);
        this.f4832f.playTogether(arrayList);
        this.f4832f.addListener(new ai.z(2, this, searchField));
        this.f4832f.start();
    }

    @Override
    public final void n() {
        v3 v3Var = this.h;
        d3 d3Var = v3Var.d;
        FrameLayout frameLayout = v3Var.h;
        j3 j3Var = v3Var.F;
        AnimatorSet animatorSet = this.f4832f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, property3, 0.0f));
        EditTextBoldCursor searchField = v3Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(d3Var, property3, 0.0f));
        d3Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        v3Var.f6143s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f4832f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f4832f.setInterpolator(is.h);
        this.f4832f.playTogether(arrayList);
        this.f4832f.addListener(new ai.b(this, 13));
        this.f4832f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        k3 k3Var = this.h.f6142r;
        androidx.fragment.app.a0 a0Var = k3Var.v;
        if (!TextUtils.equals(k3Var.f6057f, obj)) {
            if (k3Var.f6056e != -1) {
                ConnectionsManager.getInstance(k3Var.f6061w.f6127a).cancelRequest(k3Var.f6056e, true);
                k3Var.f6056e = -1;
            }
            k3Var.d = false;
            k3Var.h = null;
        }
        k3Var.f6057f = obj;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (TextUtils.isEmpty(obj)) {
            k3Var.f6055c.clear();
            k3Var.F(false);
            k3Var.l();
            return;
        }
        k3Var.F(true);
        AndroidUtilities.runOnUIThread(a0Var, 1500L);
    }
}
