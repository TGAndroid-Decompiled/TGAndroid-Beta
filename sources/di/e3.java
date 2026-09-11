package di;

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
import org.telegram.ui.Components.pr;
public final class e3 extends org.telegram.ui.ActionBar.g5 {
    public AnimatorSet f7161f;
    public final x3 h;

    public e3(x3 x3Var) {
        this.h = x3Var;
    }

    @Override
    public final void m() {
        x3 x3Var = this.h;
        f3 f3Var = x3Var.d;
        l3 l3Var = x3Var.F;
        AnimatorSet animatorSet = this.f7161f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        l3Var.setVisibility(0);
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(l3Var, property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(l3Var, property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(l3Var, property3, 1.0f));
        EditTextBoldCursor searchField = x3Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
        }
        f3Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property3, 1.0f));
        f3Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(x3Var.h, property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3(this, 1));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7161f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f7161f.setInterpolator(pr.h);
        this.f7161f.playTogether(arrayList);
        this.f7161f.addListener(new bi.t(2, this, searchField));
        this.f7161f.start();
    }

    @Override
    public final void n() {
        x3 x3Var = this.h;
        f3 f3Var = x3Var.d;
        FrameLayout frameLayout = x3Var.h;
        l3 l3Var = x3Var.F;
        AnimatorSet animatorSet = this.f7161f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        arrayList.add(ObjectAnimator.ofFloat(l3Var, property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(l3Var, property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(l3Var, property3, 0.0f));
        EditTextBoldCursor searchField = x3Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(f3Var, property3, 0.0f));
        f3Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
        x3Var.f8378s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new d3(this, 0));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f7161f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f7161f.setInterpolator(pr.h);
        this.f7161f.playTogether(arrayList);
        this.f7161f.addListener(new ah.b(this, 16));
        this.f7161f.start();
    }

    @Override
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        m3 m3Var = this.h.f8377r;
        bi.oa oaVar = m3Var.v;
        if (!TextUtils.equals(m3Var.f8321f, obj)) {
            if (m3Var.f8320e != -1) {
                ConnectionsManager.getInstance(m3Var.f8325w.f8362a).cancelRequest(m3Var.f8320e, true);
                m3Var.f8320e = -1;
            }
            m3Var.d = false;
            m3Var.h = null;
        }
        m3Var.f8321f = obj;
        AndroidUtilities.cancelRunOnUIThread(oaVar);
        if (TextUtils.isEmpty(obj)) {
            m3Var.f8319c.clear();
            m3Var.F(false);
            m3Var.l();
            return;
        }
        m3Var.F(true);
        AndroidUtilities.runOnUIThread(oaVar, 1500L);
    }
}
