package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
public final class sh3 extends cma {
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final qj3 D;
    public final tj3 E;
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final ArrayList t = new ArrayList();
    public final ArrayList u = new ArrayList();
    public final ArrayList v = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList y = new ArrayList();
    public of3 z;

    public sh3(qj3 qj3Var, tj3 tj3Var) {
        this.E = tj3Var;
        this.m = false;
        this.D = qj3Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, f89 f89Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zk3 zk3Var = (zk3) arrayList.get(size);
            if (C(zk3Var, f89Var) && zk3Var.a == null && zk3Var.b == null) {
                arrayList.remove(zk3Var);
            }
        }
    }

    public final boolean C(zk3 zk3Var, f89 f89Var) {
        if (zk3Var.b == f89Var) {
            zk3Var.b = null;
        } else if (zk3Var.a == f89Var) {
            zk3Var.a = null;
        } else {
            return false;
        }
        View view = f89Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(f89Var);
        return true;
    }

    public final void D() {
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.z = null;
        this.A = false;
    }

    public final void E(f89 f89Var) {
        f89Var.a.animate().setInterpolator(F);
        f(f89Var);
    }

    @Override
    public final void f(f89 f89Var) {
        View view = f89Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((al3) arrayList.get(size)).a == f89Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(f89Var);
                arrayList.remove(size);
            }
        }
        B(this.r, f89Var);
        if (this.o.remove(f89Var)) {
            if (view instanceof of3) {
                ((of3) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(f89Var);
        }
        if (this.p.remove(f89Var)) {
            if (view instanceof of3) {
                ((of3) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(f89Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, f89Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.t;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((al3) arrayList5.get(size4)).a == f89Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(f89Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.s;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(f89Var)) {
                if (view instanceof of3) {
                    ((of3) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(f89Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(f89Var);
        this.v.remove(f89Var);
        this.y.remove(f89Var);
        this.w.remove(f89Var);
        A();
    }

    @Override
    public final void g() {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            al3 al3Var = (al3) arrayList.get(size);
            View view = al3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(al3Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            f89 f89Var = (f89) arrayList2.get(size2);
            View view2 = f89Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(f89Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            f89 f89Var2 = (f89) arrayList3.get(size3);
            View view3 = f89Var2.a;
            if (view3 instanceof of3) {
                ((of3) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(f89Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            zk3 zk3Var = (zk3) arrayList4.get(size4);
            f89 f89Var3 = zk3Var.a;
            if (f89Var3 != null) {
                C(zk3Var, f89Var3);
            }
            f89 f89Var4 = zk3Var.b;
            if (f89Var4 != null) {
                C(zk3Var, f89Var4);
            }
        }
        arrayList4.clear();
        if (!k()) {
            return;
        }
        ArrayList arrayList5 = this.t;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                al3 al3Var2 = (al3) arrayList6.get(size6);
                View view4 = al3Var2.a.a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(al3Var2.a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.s;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                f89 f89Var5 = (f89) arrayList8.get(size8);
                View view5 = f89Var5.a;
                if (view5 instanceof of3) {
                    ((of3) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(f89Var5);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.u;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                zk3 zk3Var2 = (zk3) arrayList10.get(size10);
                f89 f89Var6 = zk3Var2.a;
                if (f89Var6 != null) {
                    C(zk3Var2, f89Var6);
                }
                f89 f89Var7 = zk3Var2.b;
                if (f89Var7 != null) {
                    C(zk3Var2, f89Var7);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        z(this.x);
        z(this.w);
        z(this.v);
        z(this.y);
        e();
    }

    @Override
    public final boolean k() {
        if (this.p.isEmpty()) {
            ArrayList arrayList = this.r;
            if (arrayList.isEmpty() && this.q.isEmpty() && arrayList.isEmpty() && this.w.isEmpty() && this.x.isEmpty() && this.v.isEmpty() && this.y.isEmpty() && this.t.isEmpty() && this.s.isEmpty() && this.u.isEmpty()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void m() {
        long j;
        ArrayList arrayList;
        int i;
        long j2;
        ArrayList arrayList2 = this.o;
        boolean isEmpty = arrayList2.isEmpty();
        ArrayList arrayList3 = this.q;
        boolean isEmpty2 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.r;
        boolean isEmpty3 = arrayList4.isEmpty();
        ArrayList arrayList5 = this.p;
        boolean isEmpty4 = arrayList5.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        if (this.A && !isEmpty) {
            j = 180;
        } else {
            j = 0;
        }
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            f89 f89Var = (f89) obj;
            View view = f89Var.a;
            this.x.add(f89Var);
            if ((view instanceof of3) && !this.A) {
                of3 of3Var = (of3) view;
                of3 of3Var2 = this.z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = F;
                if (view == of3Var2) {
                    i = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = of3Var2.getMeasuredHeight();
                        int i3 = this.B;
                        this.C = measuredHeight - i3;
                        this.z.setTopClip(i3);
                        this.z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = of3Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.C);
                    }
                    of3Var.setElevation(-1.0f);
                    of3Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(of3Var, sn.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new xk3(this, f89Var, of3Var, (byte) 0));
                    duration.start();
                    j2 = j;
                } else {
                    i = size;
                    j2 = j;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(of3Var, View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new xk3(this, f89Var, of3Var, (byte) 1));
                    duration2.start();
                }
            } else {
                arrayList = arrayList2;
                i = size;
                j2 = j;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new yk3(this, f89Var, animate, view)).start();
            }
            arrayList2 = arrayList;
            size = i;
            j = j2;
        }
        final long j3 = j;
        arrayList2.clear();
        if (!isEmpty2) {
            final ArrayList arrayList6 = new ArrayList(arrayList3);
            this.t.add(arrayList6);
            arrayList3.clear();
            new Runnable(this) {
                public final sh3 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    long j4 = 180;
                    ArrayList arrayList7 = arrayList6;
                    switch (b) {
                        case 0:
                            int size2 = arrayList7.size();
                            int i4 = 0;
                            while (true) {
                                sh3 sh3Var = this.b;
                                if (i4 < size2) {
                                    Object obj2 = arrayList7.get(i4);
                                    i4++;
                                    al3 al3Var = (al3) obj2;
                                    f89 f89Var2 = al3Var.a;
                                    int i5 = al3Var.b;
                                    int i6 = al3Var.c;
                                    int i7 = al3Var.d;
                                    int i8 = al3Var.e;
                                    View view2 = f89Var2.a;
                                    int i9 = i7 - i5;
                                    int i10 = i8 - i6;
                                    if (i9 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i10 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i6 > i8) {
                                        sh3Var.C = i6 - i8;
                                    } else {
                                        sh3Var.B = i10;
                                    }
                                    of3 of3Var3 = sh3Var.z;
                                    if (of3Var3 != null) {
                                        if (sh3Var.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = of3Var3.getMeasuredHeight();
                                            int i11 = sh3Var.B;
                                            sh3Var.C = measuredHeight3 - i11;
                                            sh3Var.z.setTopClip(i11);
                                            sh3Var.z.setBottomClip(sh3Var.C);
                                        } else if (sh3Var.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = of3Var3.getMeasuredHeight() - sh3Var.C;
                                            sh3Var.B = measuredHeight4;
                                            sh3Var.z.setTopClip(measuredHeight4);
                                            sh3Var.z.setBottomClip(sh3Var.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    sh3Var.w.add(f89Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new vb3(sh3Var, f89Var2, i9, view2, i10, animate2, (byte) 1)).start();
                                } else {
                                    arrayList7.clear();
                                    sh3Var.t.remove(arrayList7);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i12 = 0;
                            while (true) {
                                sh3 sh3Var2 = this.b;
                                if (i12 < size3) {
                                    Object obj3 = arrayList7.get(i12);
                                    i12++;
                                    zk3 zk3Var = (zk3) obj3;
                                    ArrayList arrayList8 = sh3Var2.y;
                                    f89 f89Var3 = zk3Var.a;
                                    f89 f89Var4 = zk3Var.b;
                                    if (f89Var3 != null && f89Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j4);
                                        View view3 = f89Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f89Var4.a, property, 1.0f));
                                        arrayList8.add(zk3Var.a);
                                        arrayList8.add(zk3Var.b);
                                        animatorSet.addListener(new wa2(sh3Var2, zk3Var, f89Var3, animatorSet, (byte) 1));
                                        animatorSet.start();
                                    }
                                    j4 = 180;
                                } else {
                                    arrayList7.clear();
                                    sh3Var2.u.remove(arrayList7);
                                    return;
                                }
                            }
                            break;
                    }
                }
            }.run();
        }
        if (!isEmpty3) {
            final ArrayList arrayList7 = new ArrayList(arrayList4);
            this.u.add(arrayList7);
            arrayList4.clear();
            new Runnable(this) {
                public final sh3 b;

                {
                    this.b = this;
                }

                @Override
                public final void run() {
                    byte b = r3;
                    long j4 = 180;
                    ArrayList arrayList72 = arrayList7;
                    switch (b) {
                        case 0:
                            int size2 = arrayList72.size();
                            int i4 = 0;
                            while (true) {
                                sh3 sh3Var = this.b;
                                if (i4 < size2) {
                                    Object obj2 = arrayList72.get(i4);
                                    i4++;
                                    al3 al3Var = (al3) obj2;
                                    f89 f89Var2 = al3Var.a;
                                    int i5 = al3Var.b;
                                    int i6 = al3Var.c;
                                    int i7 = al3Var.d;
                                    int i8 = al3Var.e;
                                    View view2 = f89Var2.a;
                                    int i9 = i7 - i5;
                                    int i10 = i8 - i6;
                                    if (i9 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i10 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i6 > i8) {
                                        sh3Var.C = i6 - i8;
                                    } else {
                                        sh3Var.B = i10;
                                    }
                                    of3 of3Var3 = sh3Var.z;
                                    if (of3Var3 != null) {
                                        if (sh3Var.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = of3Var3.getMeasuredHeight();
                                            int i11 = sh3Var.B;
                                            sh3Var.C = measuredHeight3 - i11;
                                            sh3Var.z.setTopClip(i11);
                                            sh3Var.z.setBottomClip(sh3Var.C);
                                        } else if (sh3Var.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = of3Var3.getMeasuredHeight() - sh3Var.C;
                                            sh3Var.B = measuredHeight4;
                                            sh3Var.z.setTopClip(measuredHeight4);
                                            sh3Var.z.setBottomClip(sh3Var.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    sh3Var.w.add(f89Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new vb3(sh3Var, f89Var2, i9, view2, i10, animate2, (byte) 1)).start();
                                } else {
                                    arrayList72.clear();
                                    sh3Var.t.remove(arrayList72);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i12 = 0;
                            while (true) {
                                sh3 sh3Var2 = this.b;
                                if (i12 < size3) {
                                    Object obj3 = arrayList72.get(i12);
                                    i12++;
                                    zk3 zk3Var = (zk3) obj3;
                                    ArrayList arrayList8 = sh3Var2.y;
                                    f89 f89Var3 = zk3Var.a;
                                    f89 f89Var4 = zk3Var.b;
                                    if (f89Var3 != null && f89Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j4);
                                        View view3 = f89Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(f89Var4.a, property, 1.0f));
                                        arrayList8.add(zk3Var.a);
                                        arrayList8.add(zk3Var.b);
                                        animatorSet.addListener(new wa2(sh3Var2, zk3Var, f89Var3, animatorSet, (byte) 1));
                                        animatorSet.start();
                                    }
                                    j4 = 180;
                                } else {
                                    arrayList72.clear();
                                    sh3Var2.u.remove(arrayList72);
                                    return;
                                }
                            }
                            break;
                    }
                }
            }.run();
        }
        if (!isEmpty4) {
            final ArrayList arrayList8 = new ArrayList(arrayList5);
            this.s.add(arrayList8);
            arrayList5.clear();
            new Runnable(arrayList8, j3) {
                public final ArrayList b;
                public final short c;

                {
                    this.c = (int) j3;
                }

                @Override
                public final void run() {
                    long j4 = this.c;
                    ArrayList arrayList9 = this.b;
                    int size2 = arrayList9.size();
                    int i4 = 0;
                    while (true) {
                        sh3 sh3Var = sh3.this;
                        if (i4 < size2) {
                            Object obj2 = arrayList9.get(i4);
                            i4++;
                            f89 f89Var2 = (f89) obj2;
                            View view2 = f89Var2.a;
                            sh3Var.v.add(f89Var2);
                            ViewPropertyAnimator animate2 = view2.animate();
                            animate2.alpha(1.0f).setDuration(180L).setStartDelay(j4).setListener(new yk3(sh3Var, f89Var2, view2, animate2)).start();
                        } else {
                            arrayList9.clear();
                            sh3Var.s.remove(arrayList9);
                            return;
                        }
                    }
                }
            }.run();
        }
        this.A = false;
    }

    @Override
    public final void p(f89 f89Var) {
        E(f89Var);
        View view = f89Var.a;
        if (!(view instanceof of3)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(f89Var);
        if (arrayList.size() > 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((f89) arrayList.get(i)).a.setAlpha(0.0f);
                if (((f89) arrayList.get(i)).a instanceof of3) {
                    ((of3) ((f89) arrayList.get(i)).a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(f89 f89Var, f89 f89Var2, l09 l09Var, int i, int i2, int i3, int i4) {
        View view = f89Var.a;
        if (view instanceof of3) {
            E(f89Var);
            E(f89Var2);
            View view2 = f89Var2.a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.a = f89Var;
            obj.b = f89Var2;
            obj.c = i;
            obj.d = i2;
            obj.e = i3;
            obj.f = i4;
            this.r.add(obj);
            return true;
        }
        return false;
    }

    @Override
    public final boolean r(f89 f89Var, l09 l09Var, int i, int i2, int i3, int i4) {
        View view = f89Var.a;
        int translationX = i + ((int) view.getTranslationX());
        View view2 = f89Var.a;
        int translationY = i2 + ((int) view2.getTranslationY());
        E(f89Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                v(f89Var);
                return false;
            }
        } else {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        if (view2 instanceof of3) {
            ((of3) view2).setMoving(true);
        } else if (view2 instanceof fk3) {
            ((fk3) view2).a = true;
        }
        ?? obj = new Object();
        obj.a = f89Var;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        this.q.add(obj);
        return true;
    }

    @Override
    public final void s(f89 f89Var, l09 l09Var) {
        E(f89Var);
        this.o.add(f89Var);
        if (!this.A) {
            of3 of3Var = null;
            int i = 0;
            while (true) {
                qj3 qj3Var = this.D;
                if (i >= qj3Var.getChildCount()) {
                    break;
                }
                View childAt = qj3Var.getChildAt(i);
                if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof of3)) {
                    of3Var = (of3) childAt;
                }
                i++;
            }
            if (f89Var.a == of3Var) {
                this.z = of3Var;
            }
        }
    }

    @Override
    public final void y() {
        tj3 tj3Var = this.E;
        if (tj3Var.c.K0() == 0) {
            View m = tj3Var.c.m(0);
            if (m != null) {
                m.invalidate();
            }
            if (tj3Var.w == 2) {
                tj3Var.w = (byte) 1;
            }
            xh3 xh3Var = tj3Var.n;
            if (xh3Var != null) {
                xh3Var.b();
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((f89) arrayList.get(size)).a.animate().cancel();
        }
    }
}
