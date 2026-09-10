package bi;

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
import org.telegram.ui.Components.wr;
public final class v3 extends org.telegram.ui.ActionBar.i5 {
    public AnimatorSet f3783f;
    public final p4 h;

    public v3(p4 p4Var) {
        this.h = p4Var;
    }

    @Override
    public final void m() {
        p4 p4Var = this.h;
        w3 w3Var = p4Var.d;
        c4 c4Var = p4Var.F;
        AnimatorSet animatorSet = this.f3783f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        c4Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, property3, 1.0f));
        EditTextBoldCursor searchField = p4Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        w3Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(w3Var, property3, 1.0f));
        w3Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(p4Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t3(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f3783f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f3783f.setInterpolator(wr.h);
        this.f3783f.playTogether(arrayList);
        this.f3783f.addListener(new u3(0, this, searchField));
        this.f3783f.start();
    }

    @Override
    public final void n() {
        p4 p4Var = this.h;
        w3 w3Var = p4Var.d;
        FrameLayout frameLayout = p4Var.h;
        c4 c4Var = p4Var.F;
        AnimatorSet animatorSet = this.f3783f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, property3, 0.0f));
        EditTextBoldCursor searchField = p4Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(w3Var, property3, 0.0f));
        w3Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        p4Var.f3383s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t3(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f3783f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f3783f.setInterpolator(wr.h);
        this.f3783f.playTogether(arrayList);
        this.f3783f.addListener(new h(this, 2));
        this.f3783f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        d4 d4Var = this.h.f3382r;
        a3.d dVar = d4Var.v;
        if (!TextUtils.equals(d4Var.f3305f, obj)) {
            if (d4Var.e != -1) {
                ConnectionsManager.getInstance(d4Var.f3309w.f3368a).cancelRequest(d4Var.e, true);
                d4Var.e = -1;
            }
            d4Var.d = false;
            d4Var.h = null;
        }
        d4Var.f3305f = obj;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        if (TextUtils.isEmpty(obj)) {
            d4Var.f3304c.clear();
            d4Var.F(false);
            d4Var.l();
            return;
        }
        d4Var.F(true);
        AndroidUtilities.runOnUIThread(dVar, 1500L);
    }
}
