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
import org.telegram.ui.Components.nr;
import org.telegram.ui.cn0;
import org.telegram.ui.hf0;
public final class s2 extends org.telegram.ui.ActionBar.m0 {
    public final int f15321a;
    public Object f15322b;
    public final Object f15323c;

    public s2(d3 d3Var) {
        this.f15321a = 0;
        this.f15323c = d3Var;
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
        switch (this.f15321a) {
            case 1:
                ((cn0) this.f15323c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public void h() {
        int i7;
        int i10 = this.f15321a;
        Object obj = this.f15323c;
        switch (i10) {
            case 0:
                d3 d3Var = (d3) obj;
                di.b1 b1Var = d3Var.d;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f15322b;
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
                b1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, property3, 1.0f));
                b1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(d3Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f15322b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f15322b).setInterpolator(nr.h);
                ((AnimatorSet) this.f15322b).playTogether(arrayList);
                ((AnimatorSet) this.f15322b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.f15322b).start();
                return;
            case 1:
            default:
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.f53201w = null;
                org.telegram.messenger.g0.r((org.telegram.tgnet.m) this.f15322b);
                org.telegram.ui.web.i iVar = mVar.f53197f;
                if (iVar != null) {
                    iVar.c();
                    mVar.f53197f = null;
                }
                bi.i6 i6Var = mVar.f34671a;
                if (i6Var != null) {
                    i6Var.f35742g3.O(true);
                    mVar.f34671a.f35741f3.h1(0, 0);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                x0Var.f53362r = null;
                x0Var.f53361n = false;
                org.telegram.messenger.g0.r((org.telegram.tgnet.m) this.f15322b);
                bi.i6 i6Var2 = x0Var.f34671a;
                if (i6Var2 != null) {
                    i6Var2.f35742g3.O(true);
                    x0Var.f34671a.f35741f3.h1(0, 0);
                }
                xh.l lVar = x0Var.f53366y.d;
                if (TextUtils.isEmpty(x0Var.f53362r)) {
                    i7 = 2131742654;
                } else {
                    i7 = 2131742653;
                }
                lVar.setText(hd.N0(i7, null));
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.f15321a) {
            case 0:
                d3 d3Var = (d3) this.f15323c;
                di.b1 b1Var = d3Var.d;
                FrameLayout frameLayout = d3Var.h;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.f15322b;
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
                arrayList.add(ObjectAnimator.ofFloat(b1Var, property3, 0.0f));
                b1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                d3Var.f14350s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f15322b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.f15322b).setInterpolator(nr.h);
                ((AnimatorSet) this.f15322b).playTogether(arrayList);
                ((AnimatorSet) this.f15322b).addListener(new ai.f0(this, 20));
                ((AnimatorSet) this.f15322b).start();
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.f15321a) {
            case 1:
                ((cn0) this.f15323c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditText editText) {
        int i7;
        int i10;
        int i11 = this.f15321a;
        Object obj = this.f15323c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                v2 v2Var = ((d3) obj).f14349r;
                b0 b0Var = v2Var.f14270w;
                if (!TextUtils.equals(v2Var.f14266f, obj2)) {
                    if (v2Var.f14265e != -1) {
                        ConnectionsManager.getInstance(v2Var.f14271x.f14333a).cancelRequest(v2Var.f14265e, true);
                        v2Var.f14265e = -1;
                    }
                    v2Var.d = false;
                    v2Var.h = null;
                }
                v2Var.f14266f = obj2;
                org.telegram.messenger.g0.r(b0Var);
                if (TextUtils.isEmpty(obj2)) {
                    v2Var.f14264c.clear();
                    v2Var.F(false);
                    v2Var.f();
                    return;
                }
                v2Var.F(true);
                org.telegram.messenger.g0.h3(b0Var, 1500L);
                return;
            case 1:
                hf0 hf0Var = (hf0) this.f15322b;
                cn0 cn0Var = (cn0) obj;
                if (editText.getText().length() == 0) {
                    cn0Var.f46588f.clear();
                    cn0Var.h.clear();
                    cn0Var.f46608w = null;
                    cn0Var.f46603s = true;
                    cn0Var.f46601r = false;
                    if (cn0Var.f46612y != 0) {
                        ConnectionsManager.getInstance(cn0.b0(cn0Var)).cancelRequest(cn0Var.f46612y, true);
                        cn0Var.f46612y = 0;
                    }
                    cn0Var.O.d.setText(hd.N0(2131747976, null));
                    cn0Var.O.e(false, true);
                    cn0Var.o0();
                    return;
                }
                org.telegram.messenger.g0.r(hf0Var);
                org.telegram.messenger.g0.h3(hf0Var, 1200L);
                return;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.f53201w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(mVar.f53201w, obj3)) {
                    mVar.f53201w = obj3;
                    org.telegram.ui.web.i iVar = mVar.f53197f;
                    if (iVar != null) {
                        iVar.c();
                    }
                    i7 = ((org.telegram.ui.ActionBar.g2) mVar).currentAccount;
                    org.telegram.ui.web.i iVar2 = new org.telegram.ui.web.i(obj3, i7, new org.telegram.ui.web.l(mVar, 1));
                    mVar.f53197f = iVar2;
                    iVar2.a();
                    org.telegram.tgnet.m mVar2 = (org.telegram.tgnet.m) this.f15322b;
                    org.telegram.messenger.g0.r(mVar2);
                    org.telegram.messenger.g0.h3(mVar2, 500L);
                }
                bi.i6 i6Var = mVar.f34671a;
                if (i6Var != null) {
                    i6Var.f35742g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        mVar.f34671a.f35741f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                boolean z11 = !TextUtils.isEmpty(x0Var.f53362r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(x0Var.f53362r, obj4)) {
                    x0Var.f53362r = obj4;
                    x0Var.f53361n = true;
                    org.telegram.tgnet.m mVar3 = (org.telegram.tgnet.m) this.f15322b;
                    org.telegram.messenger.g0.r(mVar3);
                    org.telegram.messenger.g0.h3(mVar3, 500L);
                    xh.l lVar = x0Var.f53366y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i10 = 2131742654;
                    } else {
                        i10 = 2131742653;
                    }
                    lVar.setText(hd.N0(i10, null));
                }
                bi.i6 i6Var2 = x0Var.f34671a;
                if (i6Var2 != null) {
                    i6Var2.f35742g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        x0Var.f34671a.f35741f3.h1(0, 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public s2(cn0 cn0Var) {
        this.f15321a = 1;
        this.f15323c = cn0Var;
        this.f15322b = new hf0(this, 15);
    }

    public s2(org.telegram.ui.web.m mVar) {
        this.f15321a = 2;
        this.f15323c = mVar;
        this.f15322b = new org.telegram.tgnet.m(this, 25);
    }

    public s2(org.telegram.ui.web.x0 x0Var) {
        this.f15321a = 3;
        this.f15323c = x0Var;
        this.f15322b = new org.telegram.tgnet.m(this, 28);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
