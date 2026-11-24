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
public class cw6 implements h27 {
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

    public cw6(wz4 wz4Var, ew6 ew6Var, vv6 vv6Var, int i, ew6 ew6Var2, ArrayList arrayList) {
        this.a = (byte) 0;
        this.w = null;
        this.c = false;
        this.d = false;
        this.s = new WeakReference(wz4Var);
        this.h = ew6Var;
        this.e = vv6Var;
        this.b = i;
        this.f = wz4Var.d;
        this.n = ew6Var2;
        this.r = arrayList != null ? new ArrayList(arrayList) : null;
        wz4Var.a.postDelayed(new bw6(this, (byte) 1), 15000L);
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(bka bkaVar, r7 r7Var) {
        boolean z;
        if (bkaVar != null) {
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

    @Override
    public final boolean d() {
        return false;
    }

    public final void e() {
        byte b = this.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vv6 vv6Var = (vv6) obj;
                if (!this.c && !this.d) {
                    this.d = true;
                    if (vv6Var != null) {
                        vv6Var.h(0);
                        vv6Var.d();
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
                r59 r59Var = (r59) obj;
                r59Var.setVerticalScrollBarEnabled(true);
                r59Var.W1 = false;
                y59 adapter = r59Var.getAdapter();
                if (adapter instanceof u49) {
                    ((u49) adapter).E();
                }
                this.h = null;
                int childCount = r59Var.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = r59Var.getChildAt(i);
                    childAt.setTranslationY(0.0f);
                    if (childAt instanceof mk5) {
                        ((mk5) childAt).b(false, false);
                    }
                }
                return;
        }
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final int getButtonsGlassBackgroundColor() {
        nm0 nm0Var = (nm0) this.n;
        return nm0Var.a(nm0Var.e);
    }

    @Override
    public final am0 getButtonsGlassColorProvider() {
        return (nm0) this.n;
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
    public final am0 getMenuGlassColorProvider() {
        return (nm0) this.n;
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
    public final ylb getMenuResourcesProvider() {
        return (ylb) this.h;
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
    public final bka getOpenMenuOverlay() {
        if (this.c) {
            return (bka) this.e;
        }
        return null;
    }

    @Override
    public final boolean h() {
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
                i = gm.q.y / 2;
            }
            if ((((View) this.r).getHeight() / 2) + iArr[1] > i) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final im0 i(bka bkaVar) {
        im0 c = ((eh0) this.f).d.c(bkaVar, null, false);
        c.p((nm0) this.n);
        wi8.r(c, gm.L(21.0f), 6.0f);
        return c;
    }

    public final void j() {
        va1 va1Var;
        ew6 ew6Var = (ew6) this.f;
        int i = this.b;
        WeakReference weakReference = (WeakReference) this.s;
        gw6.b();
        if (!this.c && !this.d) {
            wz4 wz4Var = (wz4) weakReference.get();
            if (wz4Var != null && wz4Var.g == this && ((va1Var = (va1) this.w) == null || !va1Var.isCancelled())) {
                this.c = true;
                wz4Var.g = null;
                wz4 wz4Var2 = (wz4) weakReference.get();
                if (wz4Var2 != null) {
                    HashMap hashMap = wz4Var2.b;
                    if (wz4Var2.d == ew6Var) {
                        Message obtainMessage = wz4Var2.a.obtainMessage(263, ew6Var);
                        obtainMessage.arg1 = i;
                        obtainMessage.sendToTarget();
                        vv6 vv6Var = wz4Var2.e;
                        if (vv6Var != null) {
                            vv6Var.h(i);
                            wz4Var2.e.d();
                        }
                        if (!hashMap.isEmpty()) {
                            for (vv6 vv6Var2 : hashMap.values()) {
                                vv6Var2.h(i);
                                vv6Var2.d();
                            }
                            hashMap.clear();
                        }
                        wz4Var2.e = null;
                    }
                }
                wz4 wz4Var3 = (wz4) weakReference.get();
                if (wz4Var3 != null) {
                    ew6 ew6Var2 = (ew6) this.h;
                    wz4Var3.d = ew6Var2;
                    wz4Var3.e = (vv6) this.e;
                    ew6 ew6Var3 = (ew6) this.n;
                    tz4 tz4Var = wz4Var3.a;
                    if (ew6Var3 == null) {
                        Message obtainMessage2 = tz4Var.obtainMessage(262, new mw7(ew6Var, ew6Var2));
                        obtainMessage2.arg1 = i;
                        obtainMessage2.sendToTarget();
                    } else {
                        Message obtainMessage3 = tz4Var.obtainMessage(264, new mw7(ew6Var3, ew6Var2));
                        obtainMessage3.arg1 = i;
                        obtainMessage3.sendToTarget();
                    }
                    wz4Var3.b.clear();
                    wz4Var3.g();
                    wz4Var3.l();
                    ArrayList arrayList = (ArrayList) this.r;
                    if (arrayList != null) {
                        wz4Var3.d.n(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
            e();
        }
    }

    public final void k(int i, int i2, boolean z) {
        l(i, i2, z, false);
    }

    public final void l(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        u49 u49Var;
        y59 y59Var;
        long j;
        HashMap hashMap = (HashMap) this.w;
        SparseArray sparseArray = (SparseArray) this.s;
        u46 u46Var = (u46) this.f;
        r59 r59Var = (r59) this.e;
        if (!r59Var.W1) {
            if (r59Var.getItemAnimator() != null) {
                if (z2) {
                    d69 itemAnimator = r59Var.getItemAnimator();
                    r49 r49Var = new r49(this, i, i2, z);
                    if (!itemAnimator.k()) {
                        l(i, i2, z, false);
                    } else {
                        itemAnimator.b.add(r49Var);
                        return;
                    }
                } else if (r59Var.getItemAnimator().k()) {
                    return;
                }
            }
            if (this.b == -1) {
                u46Var.h1(i, i2, z);
                return;
            }
            int childCount = r59Var.getChildCount();
            if (childCount != 0 && r59Var.getVisibility() == 0 && oc7.d1().getBoolean("view_animations", true)) {
                if (this.b == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r59Var.setScrollEnabled(false);
                ArrayList arrayList = new ArrayList();
                sparseArray.clear();
                y59 adapter = r59Var.getAdapter();
                hashMap.clear();
                int i3 = 0;
                while (i3 < childCount) {
                    View childAt = r59Var.getChildAt(i3);
                    arrayList.add(childAt);
                    u46Var.getClass();
                    sparseArray.put(f69.G(childAt), childAt);
                    if (adapter != null && (adapter.b || this.c)) {
                        if (this.c) {
                            int b = ((g69) childAt.getLayoutParams()).a.b();
                            if (b < 0) {
                                y59Var = adapter;
                                i3++;
                                adapter = y59Var;
                            } else {
                                y59Var = adapter;
                                j = adapter.c(b);
                            }
                        } else {
                            y59Var = adapter;
                            j = ((g69) childAt.getLayoutParams()).a.e;
                        }
                        hashMap.put(Long.valueOf(j), childAt);
                    } else {
                        y59Var = adapter;
                    }
                    if (childAt instanceof mk5) {
                        ((mk5) childAt).b(true, true);
                    }
                    i3++;
                    adapter = y59Var;
                }
                y59 y59Var2 = adapter;
                r59Var.D0();
                r59Var.q0();
                ha haVar = r59Var.d;
                haVar.l((ArrayList) haVar.d);
                haVar.l((ArrayList) haVar.e);
                haVar.b = 0;
                ki2 ki2Var = r59Var.b;
                y59 y59Var3 = r59Var.x;
                ki2Var.e(y59Var3, y59Var3);
                r59Var.v0.f = true;
                r59Var.e.h0();
                ki2Var.m();
                if (y59Var2 instanceof u49) {
                    u49Var = (u49) y59Var2;
                } else {
                    u49Var = null;
                }
                u49 u49Var2 = u49Var;
                u46Var.h1(i, i2, z);
                if (y59Var2 != null) {
                    y59Var2.f();
                }
                r59Var.D0();
                r59Var.setVerticalScrollBarEnabled(false);
                nue nueVar = (nue) this.r;
                if (nueVar != null) {
                    nueVar.c();
                }
                r59Var.W1 = true;
                if (u49Var2 != null) {
                    u49Var2.c = true;
                    u49Var2.d = false;
                    u49Var2.e.clear();
                    u49Var2.f.clear();
                }
                r59Var.addOnLayoutChangeListener(new t49(this, y59Var2, arrayList, z3, u49Var2));
                return;
            }
            u46Var.h1(i, i2, z);
        }
    }

    @Override
    public final void setMenuGlassFrostedProgress(float f) {
        lz4 lz4Var = ((eh0) this.f).e;
        if (lz4Var != null) {
            lz4Var.k(f);
        }
    }

    public cw6(r59 r59Var, u46 u46Var) {
        this.a = (byte) 1;
        this.s = new SparseArray();
        this.w = new HashMap();
        this.e = r59Var;
        this.f = u46Var;
    }

    public cw6(bka bkaVar, eh0 eh0Var, ylb ylbVar) {
        this.a = (byte) 2;
        this.b = 0;
        this.s = new int[2];
        this.w = new Rect();
        this.e = bkaVar;
        this.f = eh0Var;
        this.h = ylbVar;
        this.n = qqd.l(ylbVar);
    }
}
