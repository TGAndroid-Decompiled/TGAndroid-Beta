package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class p78 extends jb8 {
    public final w78 a;

    public p78(w78 w78Var) {
        this.a = w78Var;
    }

    @Override
    public final int E(int i, rcc rccVar) {
        int b0;
        boolean z;
        w78 w78Var = this.a;
        ArrayList arrayList = w78Var.f;
        ArrayList arrayList2 = w78Var.c;
        yn6 yn6Var = w78Var.K;
        int i2 = -1;
        int i3 = 1;
        if (yn6Var != null) {
            if (i >= 0 && i < yn6Var.e.size()) {
                jo6 jo6Var = (jo6) yn6Var.e.get(i);
                b0 = w78Var.b0(-1, jo6Var);
                if (b0 == -1) {
                    jo6Var.s = rccVar;
                    b0 = arrayList2.indexOf(Integer.valueOf(jo6Var.C));
                    z = true;
                } else {
                    jo6Var.s = null;
                    z = false;
                }
            }
            return -1;
        }
        if (i >= 0 && i < arrayList.size()) {
            no6 no6Var = (no6) arrayList.get(i);
            b0 = w78Var.b0(-1, no6Var);
            if (b0 == -1) {
                no6Var.s = rccVar;
                b0 = arrayList2.indexOf(no6Var.B);
                z = true;
            } else {
                no6Var.s = null;
                z = false;
            }
        }
        return -1;
        int childCount = w78Var.L.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = w78Var.L.getChildAt(i4);
            if (((Integer) childAt.getTag()).intValue() == i) {
                q68 q68Var = (q68) childAt;
                if (w78Var.e) {
                    i2 = b0;
                }
                q68Var.b(i2, z, false);
            } else {
                i4++;
            }
        }
        if (!z) {
            i3 = 2;
        }
        w78Var.n0(i3);
        w78Var.t0.e();
        return b0;
    }

    @Override
    public final void G() {
        w78 w78Var = this.a;
        int childCount = w78Var.L.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = w78Var.L.getChildAt(i);
            if (childAt instanceof q68) {
                ((q68) childAt).g(true);
            }
        }
    }

    @Override
    public final int H() {
        return this.a.b.size();
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        w78 w78Var = this.a;
        ArrayList arrayList = w78Var.f;
        yn6 yn6Var = w78Var.K;
        if (w78Var.b.isEmpty()) {
            if (yn6Var != null) {
                if (i >= 0 && i < yn6Var.e.size()) {
                    jo6 jo6Var = (jo6) yn6Var.e.get(i);
                    jo6Var.s = rccVar;
                    w78Var.b0(-1, jo6Var);
                } else {
                    return;
                }
            } else if (i >= 0 && i < arrayList.size()) {
                no6 no6Var = (no6) arrayList.get(i);
                no6Var.s = rccVar;
                w78Var.b0(-1, no6Var);
            } else {
                return;
            }
        }
        w78Var.j0(i2, z);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        w78 w78Var = this.a;
        q68 d0 = w78Var.d0(i);
        if (d0 != null) {
            bf0 imageView = d0.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            qb8 qb8Var = new qb8();
            qb8Var.b = iArr[0];
            qb8Var.c = iArr[1];
            qb8Var.d = w78Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            qb8Var.a = imageReceiver;
            qb8Var.e = imageReceiver.p();
            qb8Var.k = d0.getScale();
            d0.g(false);
            return qb8Var;
        }
        return null;
    }

    @Override
    public final int S(Object obj) {
        Object obj2;
        w78 w78Var = this.a;
        ArrayList arrayList = w78Var.c;
        HashMap hashMap = w78Var.b;
        if (obj instanceof jo6) {
            obj2 = Integer.valueOf(((jo6) obj).C);
        } else if (obj instanceof no6) {
            obj2 = ((no6) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 != null && hashMap.containsKey(obj2)) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (w78Var.e) {
                w78Var.m0();
            }
            return indexOf;
        }
        return -1;
    }

    @Override
    public final void Y(int i) {
        w78 w78Var = this.a;
        yn6 yn6Var = w78Var.K;
        q68 d0 = w78Var.d0(i);
        if (d0 != null) {
            if (yn6Var != null) {
                bf0 imageView = d0.getImageView();
                imageView.q();
                jo6 jo6Var = (jo6) yn6Var.e.get(i);
                String str = jo6Var.c;
                int i2 = jo6Var.C;
                String str2 = jo6Var.I;
                if (str != null) {
                    imageView.o(str, null, cmb.Q4);
                    return;
                } else if (str2 != null) {
                    imageView.r(jo6Var.J, jo6Var.K, true);
                    if (jo6Var.b && !jo6Var.d()) {
                        imageView.o(mle.d("vthumb://", i2, ":", str2), null, cmb.Q4);
                        return;
                    } else {
                        imageView.o(mle.d("thumb://", i2, ":", str2), null, cmb.Q4);
                        return;
                    }
                } else {
                    imageView.setImageDrawable(cmb.Q4);
                    return;
                }
            }
            d0.e((no6) w78Var.f.get(i));
        }
    }

    @Override
    public final void b0(int i) {
        w78 w78Var = this.a;
        int childCount = w78Var.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = w78Var.L.getChildAt(i2);
            if (childAt.getTag() != null) {
                q68 q68Var = (q68) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                yn6 yn6Var = w78Var.K;
                if (yn6Var == null ? !(intValue < 0 || intValue >= w78Var.f.size()) : !(intValue < 0 || intValue >= yn6Var.e.size())) {
                    if (intValue == i) {
                        q68Var.g(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final ArrayList d() {
        return this.a.c;
    }

    @Override
    public final jn5 k(int i) {
        q68 d0 = this.a.d0(i);
        if (d0 != null) {
            return d0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean t() {
        w78 w78Var = this.a;
        w78Var.t0.k(0, true, true);
        w78Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap u() {
        return this.a.b;
    }

    @Override
    public final boolean w(int i) {
        w78 w78Var = this.a;
        ArrayList arrayList = w78Var.f;
        HashMap hashMap = w78Var.b;
        yn6 yn6Var = w78Var.K;
        if (yn6Var != null) {
            if (i >= 0 && i < yn6Var.e.size() && hashMap.containsKey(Integer.valueOf(((jo6) yn6Var.e.get(i)).C))) {
                return true;
            }
            return false;
        } else if (i >= 0 && i < arrayList.size() && hashMap.containsKey(((no6) arrayList.get(i)).B)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final boolean y() {
        return this.a.F;
    }
}
