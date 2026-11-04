package gi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.sg0;
import org.telegram.ui.sm0;
public final class s2 extends org.telegram.ui.ActionBar.m0 {
    public final int f13551a;
    public Object f13552b;
    public final Object f13553c;

    public s2(d3 d3Var) {
        this.f13551a = 0;
        this.f13553c = d3Var;
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !k2.p1.z(" ", lowerCase2, lowerCase) && !k2.p1.z(".", lowerCase2, lowerCase)) {
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
        switch (this.f13551a) {
            case 1:
                ((sm0) this.f13553c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i3;
        int i10 = this.f13551a;
        Object obj = this.f13553c;
        switch (i10) {
            case 0:
                d3 d3Var = (d3) obj;
                ci.j1 j1Var = d3Var.d;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f13552b;
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
                j1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(j1Var, property3, 1.0f));
                j1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(d3Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f13552b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f13552b).setInterpolator(xq.h);
                ((AnimatorSet) this.f13552b).playTogether(arrayList);
                ((AnimatorSet) this.f13552b).addListener(new bh.j(4, this, searchField));
                ((AnimatorSet) this.f13552b).start();
                return;
            case 1:
            default:
                return;
            case 2:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                nVar.f50960w = null;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.d4) this.f13552b);
                org.telegram.ui.web.j jVar = nVar.f50956f;
                if (jVar != null) {
                    jVar.c();
                    nVar.f50956f = null;
                }
                ai.h4 h4Var = nVar.f34298a;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                    nVar.f34298a.f35593f3.h1(0, 0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                y0Var.f51114r = null;
                y0Var.f51113n = false;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.d4) this.f13552b);
                ai.h4 h4Var2 = y0Var.f34298a;
                if (h4Var2 != null) {
                    h4Var2.f35594g3.O(true);
                    y0Var.f34298a.f35593f3.h1(0, 0);
                }
                yh.l lVar = y0Var.f51118y.d;
                if (TextUtils.isEmpty(y0Var.f51114r)) {
                    i3 = 2131742928;
                } else {
                    i3 = 2131742927;
                }
                lVar.setText(bd.M0(i3, null));
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f13551a) {
            case 0:
                d3 d3Var = (d3) this.f13553c;
                ci.j1 j1Var = d3Var.d;
                FrameLayout frameLayout = d3Var.h;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f13552b;
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
                arrayList.add(ObjectAnimator.ofFloat(j1Var, property3, 0.0f));
                j1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                d3Var.f12576s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f13552b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f13552b).setInterpolator(xq.h);
                ((AnimatorSet) this.f13552b).playTogether(arrayList);
                ((AnimatorSet) this.f13552b).addListener(new ai.e1(this, 20));
                ((AnimatorSet) this.f13552b).start();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f13551a) {
            case 1:
                ((sm0) this.f13553c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i3;
        int i10 = this.f13551a;
        Object obj = this.f13553c;
        switch (i10) {
            case 0:
                String obj2 = editText.getText().toString();
                v2 v2Var = ((d3) obj).f12575r;
                ei.z5 z5Var = v2Var.f12485w;
                if (!TextUtils.equals(v2Var.f12481f, obj2)) {
                    if (v2Var.f12480e != -1) {
                        ConnectionsManager.getInstance(v2Var.f12486x.f12559a).cancelRequest(v2Var.f12480e, true);
                        v2Var.f12480e = -1;
                    }
                    v2Var.d = false;
                    v2Var.h = null;
                }
                v2Var.f12481f = obj2;
                org.telegram.messenger.g0.r(z5Var);
                if (TextUtils.isEmpty(obj2)) {
                    v2Var.f12479c.clear();
                    v2Var.F(false);
                    v2Var.f();
                    return;
                }
                v2Var.F(true);
                org.telegram.messenger.g0.i3(z5Var, 1500L);
                return;
            case 1:
                sg0 sg0Var = (sg0) this.f13552b;
                sm0 sm0Var = (sm0) obj;
                if (editText.getText().length() == 0) {
                    sm0Var.f49547f.clear();
                    sm0Var.h.clear();
                    sm0Var.f49567w = null;
                    sm0Var.f49562s = true;
                    sm0Var.f49560r = false;
                    if (sm0Var.f49571y != 0) {
                        ConnectionsManager.getInstance(sm0.b0(sm0Var)).cancelRequest(sm0Var.f49571y, true);
                        sm0Var.f49571y = 0;
                    }
                    sm0Var.O.d.setText(bd.M0(2131748177, null));
                    sm0Var.O.e(false, true);
                    sm0Var.o0();
                    return;
                }
                org.telegram.messenger.g0.r(sg0Var);
                org.telegram.messenger.g0.i3(sg0Var, 1200L);
                return;
            case 2:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                boolean z10 = !TextUtils.isEmpty(nVar.f50960w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(nVar.f50960w, obj3)) {
                    nVar.f50960w = obj3;
                    org.telegram.ui.web.j jVar = nVar.f50956f;
                    if (jVar != null) {
                        jVar.c();
                    }
                    org.telegram.ui.web.j jVar2 = new org.telegram.ui.web.j(obj3, org.telegram.ui.web.n.g0(nVar), new org.telegram.ui.web.m(nVar, 1));
                    nVar.f50956f = jVar2;
                    jVar2.a();
                    org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.f13552b;
                    org.telegram.messenger.g0.r(d4Var);
                    org.telegram.messenger.g0.i3(d4Var, 500L);
                }
                ai.h4 h4Var = nVar.f34298a;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        nVar.f34298a.f35593f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                boolean z11 = !TextUtils.isEmpty(y0Var.f51114r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(y0Var.f51114r, obj4)) {
                    y0Var.f51114r = obj4;
                    y0Var.f51113n = true;
                    org.telegram.ui.ActionBar.d4 d4Var2 = (org.telegram.ui.ActionBar.d4) this.f13552b;
                    org.telegram.messenger.g0.r(d4Var2);
                    org.telegram.messenger.g0.i3(d4Var2, 500L);
                    yh.l lVar = y0Var.f51118y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i3 = 2131742928;
                    } else {
                        i3 = 2131742927;
                    }
                    lVar.setText(bd.M0(i3, null));
                }
                ai.h4 h4Var2 = y0Var.f34298a;
                if (h4Var2 != null) {
                    h4Var2.f35594g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        y0Var.f34298a.f35593f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public s2(sm0 sm0Var) {
        this.f13551a = 1;
        this.f13553c = sm0Var;
        this.f13552b = new sg0(this, 14);
    }

    public s2(org.telegram.ui.web.n nVar) {
        this.f13551a = 2;
        this.f13553c = nVar;
        this.f13552b = new org.telegram.ui.ActionBar.d4(this, 17);
    }

    public s2(org.telegram.ui.web.y0 y0Var) {
        this.f13551a = 3;
        this.f13553c = y0Var;
        this.f13552b = new org.telegram.ui.ActionBar.d4(this, 20);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
