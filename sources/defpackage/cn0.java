package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cn0 extends n7 {
    public final byte a;
    public Object b;
    public final Object c;

    public cn0(dn0 dn0Var) {
        this.a = (byte) 0;
        this.c = dn0Var;
        this.b = new f00(this, (byte) 15);
    }

    public static boolean n(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !hg9.s(" ", lowerCase2, lowerCase) && !hg9.s(".", lowerCase2, lowerCase)) {
                String I3 = gm.I3(lowerCase);
                String I32 = gm.I3(lowerCase2);
                if (I3.startsWith(I32) || I3.contains(" ".concat(I32)) || I3.contains(".".concat(I32))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        switch (this.a) {
            case 3:
                ((w78) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override
    public final void h() {
        int i;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                dn0 dn0Var = (dn0) obj;
                dn0Var.w = null;
                gm.r((f00) this.b);
                cb cbVar = dn0Var.f;
                if (cbVar != null) {
                    cbVar.c();
                    dn0Var.f = null;
                }
                va vaVar = dn0Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    dn0Var.a.f3.g1(0, 0);
                    return;
                }
                return;
            case 1:
                tt4 tt4Var = (tt4) obj;
                fv fvVar = tt4Var.d;
                h62 h62Var = tt4Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                h62Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(h62Var, property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(h62Var, property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(h62Var, property3, 1.0f));
                EditTextBoldCursor searchField = tt4Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 0.0f));
                }
                fvVar.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(fvVar, property3, 1.0f));
                fvVar.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(tt4Var.h, property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jt4(this, (byte) 1));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(d53.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new u5(this, searchField, (byte) 24));
                ((AnimatorSet) this.b).start();
                return;
            case 2:
                lg5 lg5Var = (lg5) obj;
                lg5Var.r = null;
                lg5Var.n = false;
                gm.r((kg5) this.b);
                va vaVar2 = lg5Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    lg5Var.a.f3.g1(0, 0);
                }
                xna xnaVar = lg5Var.y.d;
                if (TextUtils.isEmpty(lg5Var.r)) {
                    i = 2131742581;
                } else {
                    i = 2131742580;
                }
                xnaVar.setText(jb6.M0(i, null));
                return;
            default:
                return;
        }
    }

    @Override
    public final void i() {
        switch (this.a) {
            case 0:
                return;
            case 1:
                tt4 tt4Var = (tt4) this.c;
                fv fvVar = tt4Var.d;
                FrameLayout frameLayout = tt4Var.h;
                h62 h62Var = tt4Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(h62Var, property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(h62Var, property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(h62Var, property3, 0.0f));
                EditTextBoldCursor searchField = tt4Var.H.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(fvVar, property3, 0.0f));
                fvVar.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, property3, 1.0f));
                tt4Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new jt4(this, (byte) 0));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(d53.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new kh2(this, (byte) 27));
                ((AnimatorSet) this.b).start();
                return;
            case 2:
            default:
                return;
        }
    }

    @Override
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 3:
                ((w78) this.c).g0(editTextBoldCursor);
                return;
            default:
                return;
        }
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                dn0 dn0Var = (dn0) obj;
                boolean z = !TextUtils.isEmpty(dn0Var.w);
                String obj2 = editTextBoldCursor.getText().toString();
                if (!TextUtils.equals(dn0Var.w, obj2)) {
                    dn0Var.w = obj2;
                    cb cbVar = dn0Var.f;
                    if (cbVar != null) {
                        cbVar.c();
                    }
                    cb cbVar2 = new cb(obj2, dn0.f0(dn0Var), new zm0(dn0Var, (byte) 1));
                    dn0Var.f = cbVar2;
                    cbVar2.a();
                    f00 f00Var = (f00) this.b;
                    gm.r(f00Var);
                    gm.d3(f00Var, 500L);
                }
                va vaVar = dn0Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    if (z != (!TextUtils.isEmpty(obj2))) {
                        dn0Var.a.f3.g1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                String obj3 = editTextBoldCursor.getText().toString();
                lt4 lt4Var = ((tt4) obj).r;
                qn4 qn4Var = lt4Var.w;
                if (!TextUtils.equals(lt4Var.f, obj3)) {
                    if (lt4Var.e != -1) {
                        ConnectionsManager.getInstance(lt4Var.x.a).cancelRequest(lt4Var.e, true);
                        lt4Var.e = -1;
                    }
                    lt4Var.d = false;
                    lt4Var.h = null;
                }
                lt4Var.f = obj3;
                gm.r(qn4Var);
                if (TextUtils.isEmpty(obj3)) {
                    lt4Var.c.clear();
                    lt4Var.F(false);
                    lt4Var.f();
                    return;
                }
                lt4Var.F(true);
                gm.d3(qn4Var, 1500L);
                return;
            case 2:
                lg5 lg5Var = (lg5) obj;
                boolean z2 = !TextUtils.isEmpty(lg5Var.r);
                String obj4 = editTextBoldCursor.getText().toString();
                if (!TextUtils.equals(lg5Var.r, obj4)) {
                    lg5Var.r = obj4;
                    lg5Var.n = true;
                    kg5 kg5Var = (kg5) this.b;
                    gm.r(kg5Var);
                    gm.d3(kg5Var, 500L);
                    xna xnaVar = lg5Var.y.d;
                    if (TextUtils.isEmpty(obj4)) {
                        i = 2131742581;
                    } else {
                        i = 2131742580;
                    }
                    xnaVar.setText(jb6.M0(i, null));
                }
                va vaVar2 = lg5Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    if (z2 != (!TextUtils.isEmpty(obj4))) {
                        lg5Var.a.f3.g1(0, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                kl7 kl7Var = (kl7) this.b;
                w78 w78Var = (w78) obj;
                if (editTextBoldCursor.getText().length() == 0) {
                    w78Var.f.clear();
                    w78Var.h.clear();
                    w78Var.w = null;
                    w78Var.s = true;
                    w78Var.r = false;
                    if (w78Var.y != 0) {
                        i2 = ((d) w78Var).currentAccount;
                        ConnectionsManager.getInstance(i2).cancelRequest(w78Var.y, true);
                        w78Var.y = 0;
                    }
                    w78Var.O.d.setText(jb6.M0(2131747903, null));
                    w78Var.O.e(false, true);
                    w78Var.o0();
                    return;
                }
                gm.r(kl7Var);
                gm.d3(kl7Var, 1200L);
                return;
        }
    }

    public cn0(tt4 tt4Var) {
        this.a = (byte) 1;
        this.c = tt4Var;
    }

    public cn0(lg5 lg5Var) {
        this.a = (byte) 2;
        this.c = lg5Var;
        this.b = new kg5(this, (byte) 0);
    }

    public cn0(w78 w78Var) {
        this.a = (byte) 3;
        this.c = w78Var;
        this.b = new kl7(this, (byte) 29);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
