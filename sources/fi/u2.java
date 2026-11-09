package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.gf0;
import org.telegram.ui.zm0;
public final class u2 extends org.telegram.ui.ActionBar.n0 {
    public final int f12883a;
    public Object f12884b;
    public final Object f12885c;

    public u2(f3 f3Var) {
        this.f12883a = 0;
        this.f12885c = f3Var;
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !jg.g.A(" ", lowerCase2, lowerCase) && !jg.g.A(".", lowerCase2, lowerCase)) {
                String O3 = org.telegram.messenger.g0.O3(lowerCase);
                String O32 = org.telegram.messenger.g0.O3(lowerCase2);
                if (O3.startsWith(O32) || O3.contains(" ".concat(O32)) || O3.contains(".".concat(O32))) {
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
        switch (this.f12883a) {
            case 1:
                ((zm0) this.f12885c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i7;
        int i10 = this.f12883a;
        Object obj = this.f12885c;
        switch (i10) {
            case 0:
                f3 f3Var = (f3) obj;
                bi.q1 q1Var = f3Var.d;
                w2 w2Var = f3Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.f12884b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                w2Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, property3, 1.0f));
                EditTextBoldCursor searchField = f3Var.G.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
                }
                q1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(q1Var, property3, 1.0f));
                q1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(f3Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new t2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f12884b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f12884b).setInterpolator(xq.h);
                ((AnimatorSet) this.f12884b).playTogether(arrayList);
                ((AnimatorSet) this.f12884b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.f12884b).start();
                return;
            case 1:
            default:
                return;
            case 2:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                lVar.f51208w = null;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.o5) this.f12884b);
                org.telegram.ui.web.h hVar = lVar.f51204f;
                if (hVar != null) {
                    hVar.c();
                    lVar.f51204f = null;
                }
                w3 w3Var = lVar.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                    lVar.f36649a.f37555e3.h1(0, 0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                z0Var.f51395r = null;
                z0Var.f51394n = false;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.o5) this.f12884b);
                w3 w3Var2 = z0Var.f36649a;
                if (w3Var2 != null) {
                    w3Var2.f37556f3.O(true);
                    z0Var.f36649a.f37555e3.h1(0, 0);
                }
                xh.l lVar2 = z0Var.f51399y.d;
                if (TextUtils.isEmpty(z0Var.f51395r)) {
                    i7 = 2131742918;
                } else {
                    i7 = 2131742917;
                }
                lVar2.setText(id.M0(i7, null));
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f12883a) {
            case 0:
                f3 f3Var = (f3) this.f12885c;
                bi.q1 q1Var = f3Var.d;
                FrameLayout frameLayout = f3Var.h;
                w2 w2Var = f3Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.f12884b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, property3, 0.0f));
                EditTextBoldCursor searchField = f3Var.G.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(q1Var, property3, 0.0f));
                q1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                f3Var.f11972s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new t2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f12884b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f12884b).setInterpolator(xq.h);
                ((AnimatorSet) this.f12884b).playTogether(arrayList);
                ((AnimatorSet) this.f12884b).addListener(new bi.t5(this, 18));
                ((AnimatorSet) this.f12884b).start();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f12883a) {
            case 1:
                ((zm0) this.f12885c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i7;
        int i10;
        int i11 = this.f12883a;
        Object obj = this.f12885c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                x2 x2Var = ((f3) obj).f11971r;
                di.f8 f8Var = x2Var.f11871w;
                if (!TextUtils.equals(x2Var.f11867f, obj2)) {
                    if (x2Var.f11866e != -1) {
                        ConnectionsManager.getInstance(x2Var.f11872x.f11956a).cancelRequest(x2Var.f11866e, true);
                        x2Var.f11866e = -1;
                    }
                    x2Var.d = false;
                    x2Var.h = null;
                }
                x2Var.f11867f = obj2;
                org.telegram.messenger.g0.r(f8Var);
                if (TextUtils.isEmpty(obj2)) {
                    x2Var.f11865c.clear();
                    x2Var.F(false);
                    x2Var.f();
                    return;
                }
                x2Var.F(true);
                org.telegram.messenger.g0.i3(f8Var, 1500L);
                return;
            case 1:
                gf0 gf0Var = (gf0) this.f12884b;
                zm0 zm0Var = (zm0) obj;
                if (editText.getText().length() == 0) {
                    zm0Var.f52607f.clear();
                    zm0Var.h.clear();
                    zm0Var.f52627w = null;
                    zm0Var.f52622s = true;
                    zm0Var.f52620r = false;
                    if (zm0Var.f52631y != 0) {
                        ConnectionsManager.getInstance(zm0.b0(zm0Var)).cancelRequest(zm0Var.f52631y, true);
                        zm0Var.f52631y = 0;
                    }
                    zm0Var.N.d.setText(id.M0(2131748169, null));
                    zm0Var.N.e(false, true);
                    zm0Var.o0();
                    return;
                }
                org.telegram.messenger.g0.r(gf0Var);
                org.telegram.messenger.g0.i3(gf0Var, 1200L);
                return;
            case 2:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                boolean z9 = !TextUtils.isEmpty(lVar.f51208w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(lVar.f51208w, obj3)) {
                    lVar.f51208w = obj3;
                    org.telegram.ui.web.h hVar = lVar.f51204f;
                    if (hVar != null) {
                        hVar.c();
                    }
                    i7 = ((org.telegram.ui.ActionBar.f2) lVar).currentAccount;
                    org.telegram.ui.web.h hVar2 = new org.telegram.ui.web.h(obj3, i7, new org.telegram.ui.web.k(lVar, 1));
                    lVar.f51204f = hVar2;
                    hVar2.a();
                    org.telegram.ui.ActionBar.o5 o5Var = (org.telegram.ui.ActionBar.o5) this.f12884b;
                    org.telegram.messenger.g0.r(o5Var);
                    org.telegram.messenger.g0.i3(o5Var, 500L);
                }
                w3 w3Var = lVar.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                    if (z9 != (!TextUtils.isEmpty(obj3))) {
                        lVar.f36649a.f37555e3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                boolean z10 = !TextUtils.isEmpty(z0Var.f51395r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(z0Var.f51395r, obj4)) {
                    z0Var.f51395r = obj4;
                    z0Var.f51394n = true;
                    org.telegram.ui.ActionBar.o5 o5Var2 = (org.telegram.ui.ActionBar.o5) this.f12884b;
                    org.telegram.messenger.g0.r(o5Var2);
                    org.telegram.messenger.g0.i3(o5Var2, 500L);
                    xh.l lVar2 = z0Var.f51399y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i10 = 2131742918;
                    } else {
                        i10 = 2131742917;
                    }
                    lVar2.setText(id.M0(i10, null));
                }
                w3 w3Var2 = z0Var.f36649a;
                if (w3Var2 != null) {
                    w3Var2.f37556f3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj4))) {
                        z0Var.f36649a.f37555e3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public u2(zm0 zm0Var) {
        this.f12883a = 1;
        this.f12885c = zm0Var;
        this.f12884b = new gf0(this, 15);
    }

    public u2(org.telegram.ui.web.l lVar) {
        this.f12883a = 2;
        this.f12885c = lVar;
        this.f12884b = new org.telegram.ui.ActionBar.o5(this, 10);
    }

    public u2(org.telegram.ui.web.z0 z0Var) {
        this.f12883a = 3;
        this.f12885c = z0Var;
        this.f12884b = new org.telegram.ui.ActionBar.o5(this, 13);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
