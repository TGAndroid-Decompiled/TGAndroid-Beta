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
import org.telegram.messenger.hd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.ef0;
import org.telegram.ui.ym0;
public final class s2 extends org.telegram.ui.ActionBar.m0 {
    public final int f15016a;
    public Object f15017b;
    public final Object f15018c;

    public s2(d3 d3Var) {
        this.f15016a = 0;
        this.f15018c = d3Var;
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !i5.c.A(" ", lowerCase2, lowerCase) && !i5.c.A(".", lowerCase2, lowerCase)) {
                String N3 = org.telegram.messenger.g0.N3(lowerCase);
                String N32 = org.telegram.messenger.g0.N3(lowerCase2);
                if (N3.startsWith(N32) || N3.contains(" ".concat(N32)) || N3.contains(".".concat(N32))) {
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
        switch (this.f15016a) {
            case 1:
                ((ym0) this.f15018c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i7;
        int i10 = this.f15016a;
        Object obj = this.f15018c;
        switch (i10) {
            case 0:
                d3 d3Var = (d3) obj;
                di.c1 c1Var = d3Var.d;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f15017b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                u2Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property3, 1.0f));
                EditTextBoldCursor searchField = d3Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
                }
                c1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(c1Var, property3, 1.0f));
                c1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(d3Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f15017b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f15017b).setInterpolator(er.h);
                ((AnimatorSet) this.f15017b).playTogether(arrayList);
                ((AnimatorSet) this.f15017b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.f15017b).start();
                return;
            case 1:
            default:
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.f52707w = null;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.r0) this.f15017b);
                org.telegram.ui.web.i iVar = mVar.f52703f;
                if (iVar != null) {
                    iVar.c();
                    mVar.f52703f = null;
                }
                bi.v3 v3Var = mVar.f38882a;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                    mVar.f38882a.f39894f3.h1(0, 0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                x0Var.f52868r = null;
                x0Var.f52867n = false;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.r0) this.f15017b);
                bi.v3 v3Var2 = x0Var.f38882a;
                if (v3Var2 != null) {
                    v3Var2.f39895g3.O(true);
                    x0Var.f38882a.f39894f3.h1(0, 0);
                }
                xh.l lVar = x0Var.f52872y.d;
                if (TextUtils.isEmpty(x0Var.f52868r)) {
                    i7 = 2131742918;
                } else {
                    i7 = 2131742917;
                }
                lVar.setText(hd.M0(i7, null));
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f15016a) {
            case 0:
                d3 d3Var = (d3) this.f15018c;
                di.c1 c1Var = d3Var.d;
                FrameLayout frameLayout = d3Var.h;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f15017b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, property3, 0.0f));
                EditTextBoldCursor searchField = d3Var.H.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(c1Var, property3, 0.0f));
                c1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                d3Var.f14116s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f15017b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f15017b).setInterpolator(er.h);
                ((AnimatorSet) this.f15017b).playTogether(arrayList);
                ((AnimatorSet) this.f15017b).addListener(new ai.i0(this, 20));
                ((AnimatorSet) this.f15017b).start();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f15016a) {
            case 1:
                ((ym0) this.f15018c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i7;
        int i10 = this.f15016a;
        Object obj = this.f15018c;
        switch (i10) {
            case 0:
                String obj2 = editText.getText().toString();
                v2 v2Var = ((d3) obj).f14115r;
                e1 e1Var = v2Var.f13976w;
                if (!TextUtils.equals(v2Var.f13972f, obj2)) {
                    if (v2Var.f13971e != -1) {
                        ConnectionsManager.getInstance(v2Var.f13977x.f14099a).cancelRequest(v2Var.f13971e, true);
                        v2Var.f13971e = -1;
                    }
                    v2Var.d = false;
                    v2Var.h = null;
                }
                v2Var.f13972f = obj2;
                org.telegram.messenger.g0.r(e1Var);
                if (TextUtils.isEmpty(obj2)) {
                    v2Var.f13970c.clear();
                    v2Var.F(false);
                    v2Var.f();
                    return;
                }
                v2Var.F(true);
                org.telegram.messenger.g0.i3(e1Var, 1500L);
                return;
            case 1:
                ef0 ef0Var = (ef0) this.f15017b;
                ym0 ym0Var = (ym0) obj;
                if (editText.getText().length() == 0) {
                    ym0Var.f53573f.clear();
                    ym0Var.h.clear();
                    ym0Var.f53593w = null;
                    ym0Var.f53588s = true;
                    ym0Var.f53586r = false;
                    if (ym0Var.f53597y != 0) {
                        ConnectionsManager.getInstance(ym0.b0(ym0Var)).cancelRequest(ym0Var.f53597y, true);
                        ym0Var.f53597y = 0;
                    }
                    ym0Var.O.d.setText(hd.M0(2131748169, null));
                    ym0Var.O.e(false, true);
                    ym0Var.o0();
                    return;
                }
                org.telegram.messenger.g0.r(ef0Var);
                org.telegram.messenger.g0.i3(ef0Var, 1200L);
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.f52707w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(mVar.f52707w, obj3)) {
                    mVar.f52707w = obj3;
                    org.telegram.ui.web.i iVar = mVar.f52703f;
                    if (iVar != null) {
                        iVar.c();
                    }
                    org.telegram.ui.web.i iVar2 = new org.telegram.ui.web.i(obj3, org.telegram.ui.web.m.g0(mVar), new org.telegram.ui.web.l(mVar, 1));
                    mVar.f52703f = iVar2;
                    iVar2.a();
                    org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.f15017b;
                    org.telegram.messenger.g0.r(r0Var);
                    org.telegram.messenger.g0.i3(r0Var, 500L);
                }
                bi.v3 v3Var = mVar.f38882a;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        mVar.f38882a.f39894f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                boolean z11 = !TextUtils.isEmpty(x0Var.f52868r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(x0Var.f52868r, obj4)) {
                    x0Var.f52868r = obj4;
                    x0Var.f52867n = true;
                    org.telegram.ui.ActionBar.r0 r0Var2 = (org.telegram.ui.ActionBar.r0) this.f15017b;
                    org.telegram.messenger.g0.r(r0Var2);
                    org.telegram.messenger.g0.i3(r0Var2, 500L);
                    xh.l lVar = x0Var.f52872y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i7 = 2131742918;
                    } else {
                        i7 = 2131742917;
                    }
                    lVar.setText(hd.M0(i7, null));
                }
                bi.v3 v3Var2 = x0Var.f38882a;
                if (v3Var2 != null) {
                    v3Var2.f39895g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        x0Var.f38882a.f39894f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public s2(ym0 ym0Var) {
        this.f15016a = 1;
        this.f15018c = ym0Var;
        this.f15017b = new ef0(this, 15);
    }

    public s2(org.telegram.ui.web.m mVar) {
        this.f15016a = 2;
        this.f15018c = mVar;
        this.f15017b = new org.telegram.ui.ActionBar.r0(this, 23);
    }

    public s2(org.telegram.ui.web.x0 x0Var) {
        this.f15016a = 3;
        this.f15018c = x0Var;
        this.f15017b = new org.telegram.ui.ActionBar.r0(this, 26);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
