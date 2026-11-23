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
import org.telegram.ui.Components.kr;
import org.telegram.ui.an0;
import org.telegram.ui.gf0;
public final class b3 extends org.telegram.ui.ActionBar.m0 {
    public final int f14221a;
    public Object f14222b;
    public final Object f14223c;

    public b3(m3 m3Var) {
        this.f14221a = 0;
        this.f14223c = m3Var;
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
        switch (this.f14221a) {
            case 1:
                ((an0) this.f14223c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i7;
        int i10 = this.f14221a;
        Object obj = this.f14223c;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                di.b1 b1Var = m3Var.d;
                d3 d3Var = m3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f14222b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                d3Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, property3, 1.0f));
                EditTextBoldCursor searchField = m3Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
                }
                b1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, property3, 1.0f));
                b1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(m3Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f14222b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f14222b).setInterpolator(kr.h);
                ((AnimatorSet) this.f14222b).playTogether(arrayList);
                ((AnimatorSet) this.f14222b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.f14222b).start();
                return;
            case 1:
            default:
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.f53472w = null;
                org.telegram.messenger.g0.r((oi.c2) this.f14222b);
                org.telegram.ui.web.i iVar = mVar.f53468f;
                if (iVar != null) {
                    iVar.c();
                    mVar.f53468f = null;
                }
                bi.i6 i6Var = mVar.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    mVar.f34213a.f35322f3.h1(0, 0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                x0Var.f53634r = null;
                x0Var.f53633n = false;
                org.telegram.messenger.g0.r((oi.c2) this.f14222b);
                bi.i6 i6Var2 = x0Var.f34213a;
                if (i6Var2 != null) {
                    i6Var2.f35323g3.O(true);
                    x0Var.f34213a.f35322f3.h1(0, 0);
                }
                xh.l lVar = x0Var.f53638y.d;
                if (TextUtils.isEmpty(x0Var.f53634r)) {
                    i7 = 2131742647;
                } else {
                    i7 = 2131742646;
                }
                lVar.setText(gd.N0(i7, null));
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f14221a) {
            case 0:
                m3 m3Var = (m3) this.f14223c;
                di.b1 b1Var = m3Var.d;
                FrameLayout frameLayout = m3Var.h;
                d3 d3Var = m3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f14222b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, property3, 0.0f));
                EditTextBoldCursor searchField = m3Var.H.getSearchField();
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
                m3Var.f14904s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f14222b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f14222b).setInterpolator(kr.h);
                ((AnimatorSet) this.f14222b).playTogether(arrayList);
                ((AnimatorSet) this.f14222b).addListener(new ai.g0(this, 20));
                ((AnimatorSet) this.f14222b).start();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f14221a) {
            case 1:
                ((an0) this.f14223c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i7;
        int i10;
        int i11 = this.f14221a;
        Object obj = this.f14223c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                e3 e3Var = ((m3) obj).f14903r;
                w wVar = e3Var.f14838w;
                if (!TextUtils.equals(e3Var.f14834f, obj2)) {
                    if (e3Var.f14833e != -1) {
                        ConnectionsManager.getInstance(e3Var.f14839x.f14887a).cancelRequest(e3Var.f14833e, true);
                        e3Var.f14833e = -1;
                    }
                    e3Var.d = false;
                    e3Var.h = null;
                }
                e3Var.f14834f = obj2;
                org.telegram.messenger.g0.r(wVar);
                if (TextUtils.isEmpty(obj2)) {
                    e3Var.f14832c.clear();
                    e3Var.F(false);
                    e3Var.f();
                    return;
                }
                e3Var.F(true);
                org.telegram.messenger.g0.h3(wVar, 1500L);
                return;
            case 1:
                gf0 gf0Var = (gf0) this.f14222b;
                an0 an0Var = (an0) obj;
                if (editText.getText().length() == 0) {
                    an0Var.f45752f.clear();
                    an0Var.h.clear();
                    an0Var.f45772w = null;
                    an0Var.f45767s = true;
                    an0Var.f45765r = false;
                    if (an0Var.f45776y != 0) {
                        ConnectionsManager.getInstance(an0.b0(an0Var)).cancelRequest(an0Var.f45776y, true);
                        an0Var.f45776y = 0;
                    }
                    an0Var.O.d.setText(gd.N0(2131747976, null));
                    an0Var.O.e(false, true);
                    an0Var.o0();
                    return;
                }
                org.telegram.messenger.g0.r(gf0Var);
                org.telegram.messenger.g0.h3(gf0Var, 1200L);
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.f53472w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(mVar.f53472w, obj3)) {
                    mVar.f53472w = obj3;
                    org.telegram.ui.web.i iVar = mVar.f53468f;
                    if (iVar != null) {
                        iVar.c();
                    }
                    i7 = ((org.telegram.ui.ActionBar.g2) mVar).currentAccount;
                    org.telegram.ui.web.i iVar2 = new org.telegram.ui.web.i(obj3, i7, new org.telegram.ui.web.l(mVar, 1));
                    mVar.f53468f = iVar2;
                    iVar2.a();
                    oi.c2 c2Var = (oi.c2) this.f14222b;
                    org.telegram.messenger.g0.r(c2Var);
                    org.telegram.messenger.g0.h3(c2Var, 500L);
                }
                bi.i6 i6Var = mVar.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        mVar.f34213a.f35322f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                boolean z11 = !TextUtils.isEmpty(x0Var.f53634r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(x0Var.f53634r, obj4)) {
                    x0Var.f53634r = obj4;
                    x0Var.f53633n = true;
                    oi.c2 c2Var2 = (oi.c2) this.f14222b;
                    org.telegram.messenger.g0.r(c2Var2);
                    org.telegram.messenger.g0.h3(c2Var2, 500L);
                    xh.l lVar = x0Var.f53638y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i10 = 2131742647;
                    } else {
                        i10 = 2131742646;
                    }
                    lVar.setText(gd.N0(i10, null));
                }
                bi.i6 i6Var2 = x0Var.f34213a;
                if (i6Var2 != null) {
                    i6Var2.f35323g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        x0Var.f34213a.f35322f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public b3(an0 an0Var) {
        this.f14221a = 1;
        this.f14223c = an0Var;
        this.f14222b = new gf0(this, 15);
    }

    public b3(org.telegram.ui.web.m mVar) {
        this.f14221a = 2;
        this.f14223c = mVar;
        this.f14222b = new oi.c2(this, 26);
    }

    public b3(org.telegram.ui.web.x0 x0Var) {
        this.f14221a = 3;
        this.f14223c = x0Var;
        this.f14222b = new oi.c2(this, 29);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
