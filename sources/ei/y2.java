package ei;

import ai.me;
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
import org.telegram.ui.Components.bs;
public final class y2 extends org.telegram.ui.ActionBar.g5 {
    public AnimatorSet f10127r;
    public final q3 f10128s;

    public y2(q3 q3Var) {
        this.f10128s = q3Var;
    }

    @Override
    public final void m() {
        q3 q3Var = this.f10128s;
        z2 z2Var = q3Var.d;
        f3 f3Var = q3Var.F;
        AnimatorSet animatorSet = this.f10127r;
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
        this.f10127r = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f10127r.setInterpolator(bs.h);
        this.f10127r.playTogether(arrayList);
        this.f10127r.addListener(new me(3, this, searchField));
        this.f10127r.start();
    }

    @Override
    public final void n() {
        q3 q3Var = this.f10128s;
        z2 z2Var = q3Var.d;
        FrameLayout frameLayout = q3Var.h;
        f3 f3Var = q3Var.F;
        AnimatorSet animatorSet = this.f10127r;
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
        q3Var.f9636s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x2(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f10127r = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f10127r.setInterpolator(bs.h);
        this.f10127r.playTogether(arrayList);
        this.f10127r.addListener(new ah.b(this, 18));
        this.f10127r.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        g3 g3Var = this.f10128s.f9635r;
        com.google.firebase.messaging.s sVar = g3Var.v;
        if (!TextUtils.equals(g3Var.f9583f, obj)) {
            if (g3Var.e != -1) {
                ConnectionsManager.getInstance(g3Var.f9587w.f9621a).cancelRequest(g3Var.e, true);
                g3Var.e = -1;
            }
            g3Var.d = false;
            g3Var.h = null;
        }
        g3Var.f9583f = obj;
        AndroidUtilities.cancelRunOnUIThread(sVar);
        if (TextUtils.isEmpty(obj)) {
            g3Var.f9582c.clear();
            g3Var.F(false);
            g3Var.l();
            return;
        }
        g3Var.F(true);
        AndroidUtilities.runOnUIThread(sVar, 1500L);
    }
}
