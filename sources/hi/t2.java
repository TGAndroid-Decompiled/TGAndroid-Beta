package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lr;
import org.telegram.ui.cn0;
import org.telegram.ui.if0;
public final class t2 extends org.telegram.ui.ActionBar.n0 {
    public final int f15404a;
    public Object f15405b;
    public final Object f15406c;

    public t2(e3 e3Var) {
        this.f15404a = 0;
        this.f15406c = e3Var;
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !i5.c.B(" ", lowerCase2, lowerCase) && !i5.c.B(".", lowerCase2, lowerCase)) {
                String M3 = org.telegram.messenger.g0.M3(lowerCase);
                String M32 = org.telegram.messenger.g0.M3(lowerCase2);
                if (M3.startsWith(M32) || M3.contains(" ".concat(M32)) || M3.contains(".".concat(M32))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean b() {
        switch (this.f15404a) {
            case 1:
                ((cn0) this.f15406c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i7;
        int i10 = this.f15404a;
        Object obj = this.f15406c;
        switch (i10) {
            case 0:
                e3 e3Var = (e3) obj;
                di.b1 b1Var = e3Var.d;
                v2 v2Var = e3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f15405b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                v2Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(v2Var, property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(v2Var, property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(v2Var, property3, 1.0f));
                EditTextBoldCursor searchField = e3Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
                }
                b1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, property3, 1.0f));
                b1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(e3Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new s2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f15405b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f15405b).setInterpolator(lr.h);
                ((AnimatorSet) this.f15405b).playTogether(arrayList);
                ((AnimatorSet) this.f15405b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.f15405b).start();
                return;
            case 1:
            default:
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.f53190w = null;
                org.telegram.messenger.g0.r((oi.a2) this.f15405b);
                org.telegram.ui.web.i iVar = mVar.f53186f;
                if (iVar != null) {
                    iVar.c();
                    mVar.f53186f = null;
                }
                bi.c6 c6Var = mVar.f33530a;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                    mVar.f33530a.f34606f3.h1(0, 0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                x0Var.f53351r = null;
                x0Var.f53350n = false;
                org.telegram.messenger.g0.r((oi.a2) this.f15405b);
                bi.c6 c6Var2 = x0Var.f33530a;
                if (c6Var2 != null) {
                    c6Var2.f34607g3.O(true);
                    x0Var.f33530a.f34606f3.h1(0, 0);
                }
                xh.l lVar = x0Var.f53355y.d;
                if (TextUtils.isEmpty(x0Var.f53351r)) {
                    i7 = 2131742660;
                } else {
                    i7 = 2131742659;
                }
                lVar.setText(gd.M0(i7, null));
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f15404a) {
            case 0:
                e3 e3Var = (e3) this.f15406c;
                di.b1 b1Var = e3Var.d;
                FrameLayout frameLayout = e3Var.h;
                v2 v2Var = e3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f15405b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(v2Var, property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(v2Var, property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(v2Var, property3, 0.0f));
                EditTextBoldCursor searchField = e3Var.H.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, property3, 0.0f));
                b1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                e3Var.f14550s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new s2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f15405b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f15405b).setInterpolator(lr.h);
                ((AnimatorSet) this.f15405b).playTogether(arrayList);
                ((AnimatorSet) this.f15405b).addListener(new ai.j0(this, 20));
                ((AnimatorSet) this.f15405b).start();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f15404a) {
            case 1:
                ((cn0) this.f15406c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i7;
        int i10;
        int i11 = this.f15404a;
        Object obj = this.f15406c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                w2 w2Var = ((e3) obj).f14549r;
                k kVar = w2Var.f14375w;
                if (!TextUtils.equals(w2Var.f14371f, obj2)) {
                    if (w2Var.f14370e != -1) {
                        ConnectionsManager.getInstance(w2Var.f14376x.f14533a).cancelRequest(w2Var.f14370e, true);
                        w2Var.f14370e = -1;
                    }
                    w2Var.d = false;
                    w2Var.h = null;
                }
                w2Var.f14371f = obj2;
                org.telegram.messenger.g0.r(kVar);
                if (TextUtils.isEmpty(obj2)) {
                    w2Var.f14369c.clear();
                    w2Var.F(false);
                    w2Var.f();
                    return;
                }
                w2Var.F(true);
                org.telegram.messenger.g0.h3(kVar, 1500L);
                return;
            case 1:
                if0 if0Var = (if0) this.f15405b;
                cn0 cn0Var = (cn0) obj;
                if (editText.getText().length() == 0) {
                    cn0Var.f46546f.clear();
                    cn0Var.h.clear();
                    cn0Var.f46566w = null;
                    cn0Var.f46561s = true;
                    cn0Var.f46559r = false;
                    if (cn0Var.f46570y != 0) {
                        ConnectionsManager.getInstance(cn0.b0(cn0Var)).cancelRequest(cn0Var.f46570y, true);
                        cn0Var.f46570y = 0;
                    }
                    cn0Var.O.d.setText(gd.M0(2131747977, null));
                    cn0Var.O.e(false, true);
                    cn0Var.o0();
                    return;
                }
                org.telegram.messenger.g0.r(if0Var);
                org.telegram.messenger.g0.h3(if0Var, 1200L);
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.f53190w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(mVar.f53190w, obj3)) {
                    mVar.f53190w = obj3;
                    org.telegram.ui.web.i iVar = mVar.f53186f;
                    if (iVar != null) {
                        iVar.c();
                    }
                    i7 = ((org.telegram.ui.ActionBar.h2) mVar).currentAccount;
                    org.telegram.ui.web.i iVar2 = new org.telegram.ui.web.i(obj3, i7, new org.telegram.ui.web.l(mVar, 1));
                    mVar.f53186f = iVar2;
                    iVar2.a();
                    oi.a2 a2Var = (oi.a2) this.f15405b;
                    org.telegram.messenger.g0.r(a2Var);
                    org.telegram.messenger.g0.h3(a2Var, 500L);
                }
                bi.c6 c6Var = mVar.f33530a;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        mVar.f33530a.f34606f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                boolean z11 = !TextUtils.isEmpty(x0Var.f53351r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(x0Var.f53351r, obj4)) {
                    x0Var.f53351r = obj4;
                    x0Var.f53350n = true;
                    oi.a2 a2Var2 = (oi.a2) this.f15405b;
                    org.telegram.messenger.g0.r(a2Var2);
                    org.telegram.messenger.g0.h3(a2Var2, 500L);
                    xh.l lVar = x0Var.f53355y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i10 = 2131742660;
                    } else {
                        i10 = 2131742659;
                    }
                    lVar.setText(gd.M0(i10, null));
                }
                bi.c6 c6Var2 = x0Var.f33530a;
                if (c6Var2 != null) {
                    c6Var2.f34607g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        x0Var.f33530a.f34606f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public t2(cn0 cn0Var) {
        this.f15404a = 1;
        this.f15406c = cn0Var;
        this.f15405b = new if0(this, 15);
    }

    public t2(org.telegram.ui.web.m mVar) {
        this.f15404a = 2;
        this.f15406c = mVar;
        this.f15405b = new oi.a2(this, 26);
    }

    public t2(org.telegram.ui.web.x0 x0Var) {
        this.f15404a = 3;
        this.f15406c = x0Var;
        this.f15405b = new oi.a2(this, 29);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
