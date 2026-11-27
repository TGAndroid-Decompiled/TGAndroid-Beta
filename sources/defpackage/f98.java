package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class f98 extends yc8 {
    public final l98 a;

    public f98(l98 l98Var) {
        this.a = l98Var;
    }

    @Override
    public final int D(int i, oec oecVar) {
        int a0;
        boolean z;
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.f;
        ArrayList arrayList2 = l98Var.c;
        do6 do6Var = l98Var.K;
        int i2 = -1;
        int i3 = 1;
        if (do6Var != null) {
            if (i >= 0 && i < do6Var.e.size()) {
                no6 no6Var = (no6) do6Var.e.get(i);
                a0 = l98Var.a0(-1, no6Var);
                if (a0 == -1) {
                    no6Var.s = oecVar;
                    a0 = arrayList2.indexOf(Integer.valueOf(no6Var.C));
                    z = true;
                } else {
                    no6Var.s = null;
                    z = false;
                }
            }
            return -1;
        }
        if (i >= 0 && i < arrayList.size()) {
            ro6 ro6Var = (ro6) arrayList.get(i);
            a0 = l98Var.a0(-1, ro6Var);
            if (a0 == -1) {
                ro6Var.s = oecVar;
                a0 = arrayList2.indexOf(ro6Var.B);
                z = true;
            } else {
                ro6Var.s = null;
                z = false;
            }
        }
        return -1;
        int childCount = l98Var.L.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = l98Var.L.getChildAt(i4);
            if (((Integer) childAt.getTag()).intValue() == i) {
                d88 d88Var = (d88) childAt;
                if (l98Var.e) {
                    i2 = a0;
                }
                d88Var.b(i2, z, false);
            } else {
                i4++;
            }
        }
        if (!z) {
            i3 = 2;
        }
        l98Var.m0(i3);
        l98Var.t0.h();
        return a0;
    }

    @Override
    public final void F() {
        l98 l98Var = this.a;
        int childCount = l98Var.L.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = l98Var.L.getChildAt(i);
            if (childAt instanceof d88) {
                ((d88) childAt).g(true);
            }
        }
    }

    @Override
    public final int G() {
        return this.a.b.size();
    }

    @Override
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.f;
        do6 do6Var = l98Var.K;
        if (l98Var.b.isEmpty()) {
            if (do6Var != null) {
                if (i >= 0 && i < do6Var.e.size()) {
                    no6 no6Var = (no6) do6Var.e.get(i);
                    no6Var.s = oecVar;
                    l98Var.a0(-1, no6Var);
                } else {
                    return;
                }
            } else if (i >= 0 && i < arrayList.size()) {
                ro6 ro6Var = (ro6) arrayList.get(i);
                ro6Var.s = oecVar;
                l98Var.a0(-1, ro6Var);
            } else {
                return;
            }
        }
        l98Var.i0(i2, z);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        l98 l98Var = this.a;
        d88 c0 = l98Var.c0(i);
        if (c0 != null) {
            de0 imageView = c0.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            fd8 fd8Var = new fd8();
            fd8Var.b = iArr[0];
            fd8Var.c = iArr[1];
            fd8Var.d = l98Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            fd8Var.a = imageReceiver;
            fd8Var.e = imageReceiver.p();
            fd8Var.k = c0.getScale();
            c0.g(false);
            return fd8Var;
        }
        return null;
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.c;
        HashMap hashMap = l98Var.b;
        if (obj instanceof no6) {
            obj2 = Integer.valueOf(((no6) obj).C);
        } else if (obj instanceof ro6) {
            obj2 = ((ro6) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 != null && hashMap.containsKey(obj2)) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (l98Var.e) {
                l98Var.l0();
            }
            return indexOf;
        }
        return -1;
    }

    @Override
    public final void X(int i) {
        l98 l98Var = this.a;
        do6 do6Var = l98Var.K;
        d88 c0 = l98Var.c0(i);
        if (c0 != null) {
            if (do6Var != null) {
                de0 imageView = c0.getImageView();
                imageView.q();
                no6 no6Var = (no6) do6Var.e.get(i);
                String str = no6Var.c;
                int i2 = no6Var.C;
                String str2 = no6Var.I;
                if (str != null) {
                    imageView.o(str, null, aob.R4);
                    return;
                } else if (str2 != null) {
                    imageView.r(no6Var.J, no6Var.K, true);
                    if (no6Var.b && !no6Var.d()) {
                        imageView.o(dze.d("vthumb://", i2, ":", str2), null, aob.R4);
                        return;
                    } else {
                        imageView.o(dze.d("thumb://", i2, ":", str2), null, aob.R4);
                        return;
                    }
                } else {
                    imageView.setImageDrawable(aob.R4);
                    return;
                }
            }
            c0.e((ro6) l98Var.f.get(i));
        }
    }

    @Override
    public final void b0(int i) {
        l98 l98Var = this.a;
        int childCount = l98Var.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = l98Var.L.getChildAt(i2);
            if (childAt.getTag() != null) {
                d88 d88Var = (d88) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                do6 do6Var = l98Var.K;
                if (do6Var == null ? !(intValue < 0 || intValue >= l98Var.f.size()) : !(intValue < 0 || intValue >= do6Var.e.size())) {
                    if (intValue == i) {
                        d88Var.g(true);
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
    public final mn5 k(int i) {
        d88 c0 = this.a.c0(i);
        if (c0 != null) {
            return c0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean t() {
        l98 l98Var = this.a;
        l98Var.t0.C(0, true, true);
        l98Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap u() {
        return this.a.b;
    }

    @Override
    public final boolean w(int i) {
        l98 l98Var = this.a;
        ArrayList arrayList = l98Var.f;
        HashMap hashMap = l98Var.b;
        do6 do6Var = l98Var.K;
        if (do6Var != null) {
            if (i >= 0 && i < do6Var.e.size() && hashMap.containsKey(Integer.valueOf(((no6) do6Var.e.get(i)).C))) {
                return true;
            }
            return false;
        } else if (i >= 0 && i < arrayList.size() && hashMap.containsKey(((ro6) arrayList.get(i)).B)) {
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
