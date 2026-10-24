package ei;

import ai.ne;
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
import org.telegram.ui.Components.zr;
public final class y2 extends org.telegram.ui.ActionBar.k5 {
    public AnimatorSet f10144r;
    public final q3 f10145s;

    public y2(q3 q3Var) {
        this.f10145s = q3Var;
    }

    @Override
    public final void m() {
        q3 q3Var = this.f10145s;
        z2 z2Var = q3Var.d;
        f3 f3Var = q3Var.F;
        AnimatorSet animatorSet = this.f10144r;
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
        EditTextBoldCursor searchField = q3Var.G.getSearchField();
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
        this.f10144r = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f10144r.setInterpolator(zr.h);
        this.f10144r.playTogether(arrayList);
        this.f10144r.addListener(new ne(3, this, searchField));
        this.f10144r.start();
    }

    @Override
    public final void n() {
        q3 q3Var = this.f10145s;
        z2 z2Var = q3Var.d;
        FrameLayout frameLayout = q3Var.h;
        f3 f3Var = q3Var.F;
        AnimatorSet animatorSet = this.f10144r;
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
        EditTextBoldCursor searchField = q3Var.G.getSearchField();
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
        q3Var.f9652s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x2(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f10144r = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f10144r.setInterpolator(zr.h);
        this.f10144r.playTogether(arrayList);
        this.f10144r.addListener(new ah.b(this, 18));
        this.f10144r.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        g3 g3Var = this.f10145s.f9651r;
        com.google.firebase.messaging.s sVar = g3Var.v;
        if (!TextUtils.equals(g3Var.f9597f, obj)) {
            if (g3Var.e != -1) {
                ConnectionsManager.getInstance(g3Var.f9601w.f9637a).cancelRequest(g3Var.e, true);
                g3Var.e = -1;
            }
            g3Var.d = false;
            g3Var.h = null;
        }
        g3Var.f9597f = obj;
        AndroidUtilities.cancelRunOnUIThread(sVar);
        if (TextUtils.isEmpty(obj)) {
            g3Var.f9596c.clear();
            g3Var.F(false);
            g3Var.l();
            return;
        }
        g3Var.F(true);
        AndroidUtilities.runOnUIThread(sVar, 1500L);
    }
}
