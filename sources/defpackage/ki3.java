package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
public final class ki3 extends jka {
    public static final DecelerateInterpolator F = new DecelerateInterpolator();
    public boolean A;
    public int B;
    public int C;
    public final jk3 D;
    public final mk3 E;
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
    public hg3 z;

    public ki3(jk3 jk3Var, mk3 mk3Var) {
        this.E = mk3Var;
        this.m = false;
        this.D = jk3Var;
    }

    public final void A() {
        if (!k()) {
            e();
        }
    }

    public final void B(ArrayList arrayList, u69 u69Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            sl3 sl3Var = (sl3) arrayList.get(size);
            if (C(sl3Var, u69Var) && sl3Var.a == null && sl3Var.b == null) {
                arrayList.remove(sl3Var);
            }
        }
    }

    public final boolean C(sl3 sl3Var, u69 u69Var) {
        if (sl3Var.b == u69Var) {
            sl3Var.b = null;
        } else if (sl3Var.a == u69Var) {
            sl3Var.a = null;
        } else {
            return false;
        }
        View view = u69Var.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        d(u69Var);
        return true;
    }

    public final void D() {
        this.B = Integer.MAX_VALUE;
        this.C = Integer.MAX_VALUE;
        this.z = null;
        this.A = false;
    }

    public final void E(u69 u69Var) {
        u69Var.a.animate().setInterpolator(F);
        f(u69Var);
    }

    @Override
    public final void f(u69 u69Var) {
        View view = u69Var.a;
        view.animate().cancel();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((tl3) arrayList.get(size)).a == u69Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(u69Var);
                arrayList.remove(size);
            }
        }
        B(this.r, u69Var);
        if (this.o.remove(u69Var)) {
            if (view instanceof hg3) {
                ((hg3) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            d(u69Var);
        }
        if (this.p.remove(u69Var)) {
            if (view instanceof hg3) {
                ((hg3) view).setClipProgress(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            u(u69Var);
        }
        ArrayList arrayList2 = this.u;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            B(arrayList3, u69Var);
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
                } else if (((tl3) arrayList5.get(size4)).a == u69Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(u69Var);
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
            if (arrayList7.remove(u69Var)) {
                if (view instanceof hg3) {
                    ((hg3) view).setClipProgress(1.0f);
                } else {
                    view.setAlpha(1.0f);
                }
                u(u69Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.x.remove(u69Var);
        this.v.remove(u69Var);
        this.y.remove(u69Var);
        this.w.remove(u69Var);
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
            tl3 tl3Var = (tl3) arrayList.get(size);
            View view = tl3Var.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(tl3Var.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.o;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            u69 u69Var = (u69) arrayList2.get(size2);
            View view2 = u69Var.a;
            view2.setTranslationY(0.0f);
            view2.setTranslationX(0.0f);
            d(u69Var);
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.p;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            u69 u69Var2 = (u69) arrayList3.get(size3);
            View view3 = u69Var2.a;
            if (view3 instanceof hg3) {
                ((hg3) view3).setClipProgress(0.0f);
            } else {
                view3.setAlpha(1.0f);
            }
            u(u69Var2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.r;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            sl3 sl3Var = (sl3) arrayList4.get(size4);
            u69 u69Var3 = sl3Var.a;
            if (u69Var3 != null) {
                C(sl3Var, u69Var3);
            }
            u69 u69Var4 = sl3Var.b;
            if (u69Var4 != null) {
                C(sl3Var, u69Var4);
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
                tl3 tl3Var2 = (tl3) arrayList6.get(size6);
                View view4 = tl3Var2.a.a;
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
                v(tl3Var2.a);
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
                u69 u69Var5 = (u69) arrayList8.get(size8);
                View view5 = u69Var5.a;
                if (view5 instanceof hg3) {
                    ((hg3) view5).setClipProgress(0.0f);
                } else {
                    view5.setAlpha(1.0f);
                }
                u(u69Var5);
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
                sl3 sl3Var2 = (sl3) arrayList10.get(size10);
                u69 u69Var6 = sl3Var2.a;
                if (u69Var6 != null) {
                    C(sl3Var2, u69Var6);
                }
                u69 u69Var7 = sl3Var2.b;
                if (u69Var7 != null) {
                    C(sl3Var2, u69Var7);
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
            u69 u69Var = (u69) obj;
            View view = u69Var.a;
            this.x.add(u69Var);
            if ((view instanceof hg3) && !this.A) {
                hg3 hg3Var = (hg3) view;
                hg3 hg3Var2 = this.z;
                arrayList = arrayList2;
                DecelerateInterpolator decelerateInterpolator = F;
                if (view == hg3Var2) {
                    i = size;
                    if (this.B != Integer.MAX_VALUE) {
                        int measuredHeight = hg3Var2.getMeasuredHeight();
                        int i3 = this.B;
                        this.C = measuredHeight - i3;
                        this.z.setTopClip(i3);
                        this.z.setBottomClip(this.C);
                    } else if (this.C != Integer.MAX_VALUE) {
                        int measuredHeight2 = hg3Var2.getMeasuredHeight() - this.C;
                        this.B = measuredHeight2;
                        this.z.setTopClip(measuredHeight2);
                        this.z.setBottomClip(this.C);
                    }
                    hg3Var.setElevation(-1.0f);
                    hg3Var.setOutlineProvider(null);
                    ObjectAnimator duration = ObjectAnimator.ofFloat(hg3Var, so.h, 1.0f).setDuration(180L);
                    duration.setInterpolator(decelerateInterpolator);
                    duration.addListener(new ql3(this, u69Var, hg3Var, (byte) 0));
                    duration.start();
                    j2 = j;
                } else {
                    i = size;
                    j2 = j;
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(hg3Var, View.ALPHA, 1.0f).setDuration(180L);
                    duration2.setInterpolator(decelerateInterpolator);
                    duration2.addListener(new ql3(this, u69Var, hg3Var, (byte) 1));
                    duration2.start();
                }
            } else {
                arrayList = arrayList2;
                i = size;
                j2 = j;
                ViewPropertyAnimator animate = view.animate();
                animate.setDuration(180L).setStartDelay(0L).alpha(0.0f).setListener(new rl3(this, u69Var, animate, view)).start();
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
                public final ki3 b;

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
                                ki3 ki3Var = this.b;
                                if (i4 < size2) {
                                    Object obj2 = arrayList7.get(i4);
                                    i4++;
                                    tl3 tl3Var = (tl3) obj2;
                                    u69 u69Var2 = tl3Var.a;
                                    int i5 = tl3Var.b;
                                    int i6 = tl3Var.c;
                                    int i7 = tl3Var.d;
                                    int i8 = tl3Var.e;
                                    View view2 = u69Var2.a;
                                    int i9 = i7 - i5;
                                    int i10 = i8 - i6;
                                    if (i9 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i10 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i6 > i8) {
                                        ki3Var.C = i6 - i8;
                                    } else {
                                        ki3Var.B = i10;
                                    }
                                    hg3 hg3Var3 = ki3Var.z;
                                    if (hg3Var3 != null) {
                                        if (ki3Var.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = hg3Var3.getMeasuredHeight();
                                            int i11 = ki3Var.B;
                                            ki3Var.C = measuredHeight3 - i11;
                                            ki3Var.z.setTopClip(i11);
                                            ki3Var.z.setBottomClip(ki3Var.C);
                                        } else if (ki3Var.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = hg3Var3.getMeasuredHeight() - ki3Var.C;
                                            ki3Var.B = measuredHeight4;
                                            ki3Var.z.setTopClip(measuredHeight4);
                                            ki3Var.z.setBottomClip(ki3Var.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    ki3Var.w.add(u69Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new oc3(ki3Var, u69Var2, i9, view2, i10, animate2, (byte) 1)).start();
                                } else {
                                    arrayList7.clear();
                                    ki3Var.t.remove(arrayList7);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList7.size();
                            int i12 = 0;
                            while (true) {
                                ki3 ki3Var2 = this.b;
                                if (i12 < size3) {
                                    Object obj3 = arrayList7.get(i12);
                                    i12++;
                                    sl3 sl3Var = (sl3) obj3;
                                    ArrayList arrayList8 = ki3Var2.y;
                                    u69 u69Var3 = sl3Var.a;
                                    u69 u69Var4 = sl3Var.b;
                                    if (u69Var3 != null && u69Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j4);
                                        View view3 = u69Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(u69Var4.a, property, 1.0f));
                                        arrayList8.add(sl3Var.a);
                                        arrayList8.add(sl3Var.b);
                                        animatorSet.addListener(new rb2(ki3Var2, sl3Var, u69Var3, animatorSet, (byte) 1));
                                        animatorSet.start();
                                    }
                                    j4 = 180;
                                } else {
                                    arrayList7.clear();
                                    ki3Var2.u.remove(arrayList7);
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
                public final ki3 b;

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
                                ki3 ki3Var = this.b;
                                if (i4 < size2) {
                                    Object obj2 = arrayList72.get(i4);
                                    i4++;
                                    tl3 tl3Var = (tl3) obj2;
                                    u69 u69Var2 = tl3Var.a;
                                    int i5 = tl3Var.b;
                                    int i6 = tl3Var.c;
                                    int i7 = tl3Var.d;
                                    int i8 = tl3Var.e;
                                    View view2 = u69Var2.a;
                                    int i9 = i7 - i5;
                                    int i10 = i8 - i6;
                                    if (i9 != 0) {
                                        view2.animate().translationX(0.0f);
                                    }
                                    if (i10 != 0) {
                                        view2.animate().translationY(0.0f);
                                    }
                                    if (i6 > i8) {
                                        ki3Var.C = i6 - i8;
                                    } else {
                                        ki3Var.B = i10;
                                    }
                                    hg3 hg3Var3 = ki3Var.z;
                                    if (hg3Var3 != null) {
                                        if (ki3Var.B != Integer.MAX_VALUE) {
                                            int measuredHeight3 = hg3Var3.getMeasuredHeight();
                                            int i11 = ki3Var.B;
                                            ki3Var.C = measuredHeight3 - i11;
                                            ki3Var.z.setTopClip(i11);
                                            ki3Var.z.setBottomClip(ki3Var.C);
                                        } else if (ki3Var.C != Integer.MAX_VALUE) {
                                            int measuredHeight4 = hg3Var3.getMeasuredHeight() - ki3Var.C;
                                            ki3Var.B = measuredHeight4;
                                            ki3Var.z.setTopClip(measuredHeight4);
                                            ki3Var.z.setBottomClip(ki3Var.C);
                                        }
                                    }
                                    ViewPropertyAnimator animate2 = view2.animate();
                                    ki3Var.w.add(u69Var2);
                                    animate2.setDuration(180L).setStartDelay(0L).setListener(new oc3(ki3Var, u69Var2, i9, view2, i10, animate2, (byte) 1)).start();
                                } else {
                                    arrayList72.clear();
                                    ki3Var.t.remove(arrayList72);
                                    return;
                                }
                            }
                        default:
                            int size3 = arrayList72.size();
                            int i12 = 0;
                            while (true) {
                                ki3 ki3Var2 = this.b;
                                if (i12 < size3) {
                                    Object obj3 = arrayList72.get(i12);
                                    i12++;
                                    sl3 sl3Var = (sl3) obj3;
                                    ArrayList arrayList8 = ki3Var2.y;
                                    u69 u69Var3 = sl3Var.a;
                                    u69 u69Var4 = sl3Var.b;
                                    if (u69Var3 != null && u69Var4 != null) {
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.setDuration(j4);
                                        View view3 = u69Var3.a;
                                        Property property = View.ALPHA;
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, property, 0.0f), ObjectAnimator.ofFloat(u69Var4.a, property, 1.0f));
                                        arrayList8.add(sl3Var.a);
                                        arrayList8.add(sl3Var.b);
                                        animatorSet.addListener(new rb2(ki3Var2, sl3Var, u69Var3, animatorSet, (byte) 1));
                                        animatorSet.start();
                                    }
                                    j4 = 180;
                                } else {
                                    arrayList72.clear();
                                    ki3Var2.u.remove(arrayList72);
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
                        ki3 ki3Var = ki3.this;
                        if (i4 < size2) {
                            Object obj2 = arrayList9.get(i4);
                            i4++;
                            u69 u69Var2 = (u69) obj2;
                            View view2 = u69Var2.a;
                            ki3Var.v.add(u69Var2);
                            ViewPropertyAnimator animate2 = view2.animate();
                            animate2.alpha(1.0f).setDuration(180L).setStartDelay(j4).setListener(new rl3(ki3Var, u69Var2, view2, animate2)).start();
                        } else {
                            arrayList9.clear();
                            ki3Var.s.remove(arrayList9);
                            return;
                        }
                    }
                }
            }.run();
        }
        this.A = false;
    }

    @Override
    public final void p(u69 u69Var) {
        E(u69Var);
        View view = u69Var.a;
        if (!(view instanceof hg3)) {
            view.setAlpha(0.0f);
        }
        ArrayList arrayList = this.p;
        arrayList.add(u69Var);
        if (arrayList.size() > 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                ((u69) arrayList.get(i)).a.setAlpha(0.0f);
                if (((u69) arrayList.get(i)).a instanceof hg3) {
                    ((hg3) ((u69) arrayList.get(i)).a).setMoving(true);
                }
            }
        }
    }

    @Override
    public final boolean q(u69 u69Var, u69 u69Var2, az8 az8Var, int i, int i2, int i3, int i4) {
        View view = u69Var.a;
        if (view instanceof hg3) {
            E(u69Var);
            E(u69Var2);
            View view2 = u69Var2.a;
            view.setAlpha(1.0f);
            view2.setAlpha(0.0f);
            view2.setTranslationX(0.0f);
            ?? obj = new Object();
            obj.a = u69Var;
            obj.b = u69Var2;
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
    public final boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4) {
        View view = u69Var.a;
        int translationX = i + ((int) view.getTranslationX());
        View view2 = u69Var.a;
        int translationY = i2 + ((int) view2.getTranslationY());
        E(u69Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0) {
            if (i6 == 0) {
                v(u69Var);
                return false;
            }
        } else {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        if (view2 instanceof hg3) {
            ((hg3) view2).setMoving(true);
        } else if (view2 instanceof yk3) {
            ((yk3) view2).a = true;
        }
        ?? obj = new Object();
        obj.a = u69Var;
        obj.b = translationX;
        obj.c = translationY;
        obj.d = i3;
        obj.e = i4;
        this.q.add(obj);
        return true;
    }

    @Override
    public final void s(u69 u69Var, az8 az8Var) {
        E(u69Var);
        this.o.add(u69Var);
        if (!this.A) {
            hg3 hg3Var = null;
            int i = 0;
            while (true) {
                jk3 jk3Var = this.D;
                if (i >= jk3Var.getChildCount()) {
                    break;
                }
                View childAt = jk3Var.getChildAt(i);
                if (childAt.getTop() > Integer.MIN_VALUE && (childAt instanceof hg3)) {
                    hg3Var = (hg3) childAt;
                }
                i++;
            }
            if (u69Var.a == hg3Var) {
                this.z = hg3Var;
            }
        }
    }

    @Override
    public final void y() {
        mk3 mk3Var = this.E;
        if (mk3Var.c.K0() == 0) {
            View m = mk3Var.c.m(0);
            if (m != null) {
                m.invalidate();
            }
            if (mk3Var.w == 2) {
                mk3Var.w = (byte) 1;
            }
            pi3 pi3Var = mk3Var.n;
            if (pi3Var != null) {
                pi3Var.b();
            }
        }
    }

    public final void z(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((u69) arrayList.get(size)).a.animate().cancel();
        }
    }
}
