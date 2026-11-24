package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
public class cu6 implements h07 {
    public final byte a;
    public int b;
    public boolean c;
    public boolean d;
    public final Object e;
    public final Object f;
    public Object h;
    public Object n;
    public Object r;
    public final Object s;
    public Object w;

    public cu6(ux4 ux4Var, eu6 eu6Var, vt6 vt6Var, int i, eu6 eu6Var2, ArrayList arrayList) {
        this.a = (byte) 0;
        this.w = null;
        this.c = false;
        this.d = false;
        this.s = new WeakReference(ux4Var);
        this.h = eu6Var;
        this.e = vt6Var;
        this.b = i;
        this.f = ux4Var.d;
        this.n = eu6Var2;
        this.r = arrayList != null ? new ArrayList(arrayList) : null;
        ux4Var.a.postDelayed(new bu6(this, (byte) 1), 15000L);
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(zha zhaVar, r7 r7Var) {
        boolean z;
        if (zhaVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.c != z) {
            this.c = z;
            View view = (View) this.r;
            if (z) {
                this.b = view.getVisibility();
                ((View) this.r).setVisibility(4);
            } else if (view.getVisibility() == 4) {
                ((View) this.r).setVisibility(this.b);
            }
        }
    }

    @Override
    public final boolean c(r7 r7Var, RectF rectF) {
        rectF.set(0.0f, 0.0f, ((View) this.r).getWidth(), ((View) this.r).getHeight());
        return true;
    }

    public final void d() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vt6 vt6Var = (vt6) obj;
                if (!this.c && !this.d) {
                    this.d = true;
                    if (vt6Var != null) {
                        vt6Var.h(0);
                        vt6Var.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                ValueAnimator valueAnimator = (ValueAnimator) this.h;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                o39 o39Var = (o39) obj;
                o39Var.setVerticalScrollBarEnabled(true);
                o39Var.W1 = false;
                w39 adapter = o39Var.getAdapter();
                if (adapter instanceof r29) {
                    ((r29) adapter).E();
                }
                this.h = null;
                int childCount = o39Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = o39Var.getChildAt(i);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof ni5) {
                        ((ni5) childAt).b(false, false);
                    }
                }
                return;
        }
    }

    @Override
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean g() {
        int i;
        int[] iArr = (int[]) this.s;
        Rect rect = (Rect) this.w;
        View view = (View) this.r;
        if (view != null && !this.d) {
            view.getLocationOnScreen(iArr);
            ((View) this.r).getWindowVisibleDisplayFrame(rect);
            if (rect.height() > 0) {
                i = rect.centerY();
            } else {
                i = gl.q.y / 2;
            }
            if ((((View) this.r).getHeight() / 2) + iArr[1] > i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        nl0 nl0Var = (nl0) this.n;
        return nl0Var.a(nl0Var.e);
    }

    @Override
    public final al0 getButtonsGlassColorProvider() {
        return (nl0) this.n;
    }

    @Override
    public final int getMenuAnchorTint() {
        return 0;
    }

    @Override
    public final int getMenuDimAlpha() {
        return -1;
    }

    @Override
    public final int getMenuExtraBelow() {
        return 0;
    }

    @Override
    public final al0 getMenuGlassColorProvider() {
        return (nl0) this.n;
    }

    @Override
    public final View getMenuHostView() {
        return (View) this.r;
    }

    @Override
    public final int getMenuMaxHeight() {
        return 0;
    }

    @Override
    public final wjb getMenuResourcesProvider() {
        return (wjb) this.h;
    }

    @Override
    public final int getMenuRise() {
        return 0;
    }

    @Override
    public final View getMenuView() {
        return (View) this.r;
    }

    @Override
    public final zha getOpenMenuOverlay() {
        if (this.c) {
            return (zha) this.e;
        }
        return null;
    }

    @Override
    public final il0 h(zha zhaVar) {
        il0 c = ((dg0) this.f).d.c(zhaVar, null, false);
        c.p((nl0) this.n);
        ug8.r(c, gl.L(21.0f), 6.0f);
        return c;
    }

    public final void i() {
        m91 m91Var;
        eu6 eu6Var = (eu6) this.f;
        int i = this.b;
        WeakReference weakReference = (WeakReference) this.s;
        gu6.b();
        if (!this.c && !this.d) {
            ux4 ux4Var = (ux4) weakReference.get();
            if (ux4Var != null && ux4Var.g == this && ((m91Var = (m91) this.w) == null || !m91Var.isCancelled())) {
                this.c = true;
                ux4Var.g = null;
                ux4 ux4Var2 = (ux4) weakReference.get();
                if (ux4Var2 != null) {
                    HashMap hashMap = ux4Var2.b;
                    if (ux4Var2.d == eu6Var) {
                        Message obtainMessage = ux4Var2.a.obtainMessage(263, eu6Var);
                        obtainMessage.arg1 = i;
                        obtainMessage.sendToTarget();
                        vt6 vt6Var = ux4Var2.e;
                        if (vt6Var != null) {
                            vt6Var.h(i);
                            ux4Var2.e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (vt6 vt6Var2 : hashMap.values()) {
                                vt6Var2.h(i);
                                vt6Var2.d();
                            }
                            hashMap.clear();
                        }
                        ux4Var2.e = null;
                    }
                }
                ux4 ux4Var3 = (ux4) weakReference.get();
                if (ux4Var3 != null) {
                    eu6 eu6Var2 = (eu6) this.h;
                    ux4Var3.d = eu6Var2;
                    ux4Var3.e = (vt6) this.e;
                    eu6 eu6Var3 = (eu6) this.n;
                    rx4 rx4Var = ux4Var3.a;
                    if (eu6Var3 == null) {
                        Message obtainMessage2 = rx4Var.obtainMessage(262, new lu7(eu6Var, eu6Var2));
                        obtainMessage2.arg1 = i;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = rx4Var.obtainMessage(264, new lu7(eu6Var3, eu6Var2));
                        obtainMessage3.arg1 = i;
                        obtainMessage3.sendToTarget();
                    }
                    ux4Var3.b.clear();
                    ux4Var3.g();
                    ux4Var3.l();
                    ArrayList arrayList = (ArrayList) this.r;
                    if (arrayList != null) {
                        ux4Var3.d.n(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            d();
        }
    }

    public final void j(int i, int i2, boolean z) {
        k(i, i2, z, false);
    }

    public final void k(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        r29 r29Var;
        w39 w39Var;
        long j;
        HashMap hashMap = (HashMap) this.w;
        SparseArray sparseArray = (SparseArray) this.s;
        t26 t26Var = (t26) this.f;
        o39 o39Var = (o39) this.e;
        if (!o39Var.W1) {
            if (o39Var.getItemAnimator() != null) {
                if (z2) {
                    b49 itemAnimator = o39Var.getItemAnimator();
                    o29 o29Var = new o29(this, i, i2, z);
                    if (!itemAnimator.k()) {
                        k(i, i2, z, false);
                    } else {
                        itemAnimator.b.add(o29Var);
                        return;
                    }
                } else if (o39Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.b == -1) {
                t26Var.h1(i, i2, z);
                return;
            }
            int childCount = o39Var.getChildCount();
            if (childCount != 0 && o39Var.getVisibility() == 0 && na7.c1().getBoolean("view_animations", true)) {
                if (this.b == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                o39Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                w39 adapter = o39Var.getAdapter();
                hashMap.clear();
                int i3 = 0;
                while (i3 < childCount) {
                    View childAt = o39Var.getChildAt(i3);
                    arrayList.add(childAt);
                    t26Var.getClass();
                    sparseArray.put(d49.G(childAt), childAt);
                    if (adapter != null && (adapter.b || this.c)) {
                        if (this.c) {
                            int b = ((e49) childAt.getLayoutParams()).a.b();
                            if (b < 0) {
                                w39Var = adapter;
                                i3++;
                                adapter = w39Var;
                            } else {
                                w39Var = adapter;
                                j = adapter.c(b);
                            }
                        } else {
                            w39Var = adapter;
                            j = ((e49) childAt.getLayoutParams()).a.e;
                        }
                        hashMap.put(Long.valueOf(j), childAt);
                    } else {
                        w39Var = adapter;
                    }
                    if (childAt instanceof ni5) {
                        ((ni5) childAt).b(true, true);
                    }
                    i3++;
                    adapter = w39Var;
                }
                w39 w39Var2 = adapter;
                o39Var.D0();
                o39Var.q0();
                ha haVar = o39Var.d;
                haVar.l((ArrayList) haVar.d);
                haVar.l((ArrayList) haVar.e);
                haVar.b = 0;
                wg2 wg2Var = o39Var.b;
                w39 w39Var3 = o39Var.x;
                wg2Var.e(w39Var3, w39Var3);
                o39Var.v0.f = true;
                o39Var.e.d0();
                wg2Var.m();
                if (w39Var2 instanceof r29) {
                    r29Var = (r29) w39Var2;
                } else {
                    r29Var = null;
                }
                r29 r29Var2 = r29Var;
                t26Var.h1(i, i2, z);
                if (w39Var2 != null) {
                    w39Var2.f();
                }
                o39Var.D0();
                o39Var.setVerticalScrollBarEnabled(false);
                kse kseVar = (kse) this.r;
                if (kseVar != null) {
                    kseVar.c();
                }
                o39Var.W1 = true;
                if (r29Var2 != null) {
                    r29Var2.c = true;
                    r29Var2.d = false;
                    r29Var2.e.clear();
                    r29Var2.f.clear();
                }
                o39Var.addOnLayoutChangeListener(new q29(this, w39Var2, arrayList, z3, r29Var2));
                return;
            }
            t26Var.h1(i, i2, z);
        }
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        jx4 jx4Var = ((dg0) this.f).e;
        if (jx4Var != null) {
            jx4Var.k(f);
        }
    }

    public cu6(o39 o39Var, t26 t26Var) {
        this.a = (byte) 1;
        this.s = new SparseArray();
        this.w = new HashMap();
        this.e = o39Var;
        this.f = t26Var;
    }

    public cu6(zha zhaVar, dg0 dg0Var, wjb wjbVar) {
        this.a = (byte) 2;
        this.b = 0;
        this.s = new int[2];
        this.w = new Rect();
        this.e = zhaVar;
        this.f = dg0Var;
        this.h = wjbVar;
        this.n = nod.l(wjbVar);
    }
}
