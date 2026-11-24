package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class o58 extends i98 {
    public final u58 a;

    public o58(u58 u58Var) {
        this.a = u58Var;
    }

    @Override
    public final int D(int i, oac oacVar) {
        int a0;
        boolean z;
        u58 u58Var = this.a;
        ArrayList arrayList = u58Var.f;
        ArrayList arrayList2 = u58Var.c;
        xl6 xl6Var = u58Var.K;
        int i2 = -1;
        int i3 = 1;
        if (xl6Var != null) {
            if (i >= 0 && i < xl6Var.e.size()) {
                jm6 jm6Var = (jm6) xl6Var.e.get(i);
                a0 = u58Var.a0(-1, jm6Var);
                if (a0 == -1) {
                    jm6Var.s = oacVar;
                    a0 = arrayList2.indexOf(Integer.valueOf(jm6Var.C));
                    z = true;
                } else {
                    jm6Var.s = null;
                    z = false;
                }
            }
            return -1;
        }
        if (i >= 0 && i < arrayList.size()) {
            nm6 nm6Var = (nm6) arrayList.get(i);
            a0 = u58Var.a0(-1, nm6Var);
            if (a0 == -1) {
                nm6Var.s = oacVar;
                a0 = arrayList2.indexOf(nm6Var.B);
                z = true;
            } else {
                nm6Var.s = null;
                z = false;
            }
        }
        return -1;
        int childCount = u58Var.L.getChildCount();
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            }
            View childAt = u58Var.L.getChildAt(i4);
            if (((Integer) childAt.getTag()).intValue() == i) {
                o48 o48Var = (o48) childAt;
                if (u58Var.e) {
                    i2 = a0;
                }
                o48Var.b(i2, z, false);
            } else {
                i4++;
            }
        }
        if (!z) {
            i3 = 2;
        }
        u58Var.m0(i3);
        u58Var.t0.e();
        return a0;
    }

    @Override
    public final void F() {
        u58 u58Var = this.a;
        int childCount = u58Var.L.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = u58Var.L.getChildAt(i);
            if (childAt instanceof o48) {
                ((o48) childAt).g(true);
            }
        }
    }

    @Override
    public final int G() {
        return this.a.b.size();
    }

    @Override
    public final void L(int i, oac oacVar, boolean z, int i2, int i3, boolean z2) {
        u58 u58Var = this.a;
        ArrayList arrayList = u58Var.f;
        xl6 xl6Var = u58Var.K;
        if (u58Var.b.isEmpty()) {
            if (xl6Var != null) {
                if (i >= 0 && i < xl6Var.e.size()) {
                    jm6 jm6Var = (jm6) xl6Var.e.get(i);
                    jm6Var.s = oacVar;
                    u58Var.a0(-1, jm6Var);
                } else {
                    return;
                }
            } else if (i >= 0 && i < arrayList.size()) {
                nm6 nm6Var = (nm6) arrayList.get(i);
                nm6Var.s = oacVar;
                u58Var.a0(-1, nm6Var);
            } else {
                return;
            }
        }
        u58Var.i0(i2, z);
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        u58 u58Var = this.a;
        o48 c0 = u58Var.c0(i);
        if (c0 != null) {
            be0 imageView = c0.getImageView();
            int[] iArr = new int[2];
            imageView.getLocationInWindow(iArr);
            p98 p98Var = new p98();
            p98Var.b = iArr[0];
            p98Var.c = iArr[1];
            p98Var.d = u58Var.L;
            ImageReceiver imageReceiver = imageView.getImageReceiver();
            p98Var.a = imageReceiver;
            p98Var.e = imageReceiver.p();
            p98Var.k = c0.getScale();
            c0.g(false);
            return p98Var;
        }
        return null;
    }

    @Override
    public final int R(Object obj) {
        Object obj2;
        u58 u58Var = this.a;
        ArrayList arrayList = u58Var.c;
        HashMap hashMap = u58Var.b;
        if (obj instanceof jm6) {
            obj2 = Integer.valueOf(((jm6) obj).C);
        } else if (obj instanceof nm6) {
            obj2 = ((nm6) obj).B;
        } else {
            obj2 = null;
        }
        if (obj2 != null && hashMap.containsKey(obj2)) {
            hashMap.remove(obj2);
            int indexOf = arrayList.indexOf(obj2);
            if (indexOf >= 0) {
                arrayList.remove(indexOf);
            }
            if (u58Var.e) {
                u58Var.l0();
            }
            return indexOf;
        }
        return -1;
    }

    @Override
    public final void X(int i) {
        u58 u58Var = this.a;
        xl6 xl6Var = u58Var.K;
        o48 c0 = u58Var.c0(i);
        if (c0 != null) {
            if (xl6Var != null) {
                be0 imageView = c0.getImageView();
                imageView.q();
                jm6 jm6Var = (jm6) xl6Var.e.get(i);
                String str = jm6Var.c;
                int i2 = jm6Var.C;
                String str2 = jm6Var.I;
                if (str != null) {
                    imageView.o(str, null, bkb.Q4);
                    return;
                } else if (str2 != null) {
                    imageView.r(jm6Var.J, jm6Var.K, true);
                    if (jm6Var.b && !jm6Var.d()) {
                        imageView.o(mue.d("vthumb://", i2, ":", str2), null, bkb.Q4);
                        return;
                    } else {
                        imageView.o(mue.d("thumb://", i2, ":", str2), null, bkb.Q4);
                        return;
                    }
                } else {
                    imageView.setImageDrawable(bkb.Q4);
                    return;
                }
            }
            c0.e((nm6) u58Var.f.get(i));
        }
    }

    @Override
    public final void a0(int i) {
        u58 u58Var = this.a;
        int childCount = u58Var.L.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = u58Var.L.getChildAt(i2);
            if (childAt.getTag() != null) {
                o48 o48Var = (o48) childAt;
                int intValue = ((Integer) childAt.getTag()).intValue();
                xl6 xl6Var = u58Var.K;
                if (xl6Var == null ? !(intValue < 0 || intValue >= u58Var.f.size()) : !(intValue < 0 || intValue >= xl6Var.e.size())) {
                    if (intValue == i) {
                        o48Var.g(true);
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
    public final jl5 k(int i) {
        o48 c0 = this.a.c0(i);
        if (c0 != null) {
            return c0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override
    public final boolean t() {
        u58 u58Var = this.a;
        u58Var.t0.l(0, true, true);
        u58Var.finishFragment();
        return true;
    }

    @Override
    public final HashMap u() {
        return this.a.b;
    }

    @Override
    public final boolean w(int i) {
        u58 u58Var = this.a;
        ArrayList arrayList = u58Var.f;
        HashMap hashMap = u58Var.b;
        xl6 xl6Var = u58Var.K;
        if (xl6Var != null) {
            if (i >= 0 && i < xl6Var.e.size() && hashMap.containsKey(Integer.valueOf(((jm6) xl6Var.e.get(i)).C))) {
                return true;
            }
            return false;
        } else if (i >= 0 && i < arrayList.size() && hashMap.containsKey(((nm6) arrayList.get(i)).B)) {
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
