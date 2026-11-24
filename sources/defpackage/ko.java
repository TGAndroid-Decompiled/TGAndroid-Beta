package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
public final class ko {
    public int a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public ko() {
        this.b = new j58();
        this.c = new j58();
        this.d = new j58();
        this.e = new j58();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final void a(long r10, defpackage.xu7 r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ko.a(long, xu7):void");
    }

    public final void b() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((h24) this.d) != null) {
                h24 h24Var = (h24) this.f;
                h24 h24Var2 = h24Var;
                if (h24Var == null) {
                    Object obj = new Object();
                    this.f = obj;
                    h24Var2 = obj;
                }
                h24Var2.c = null;
                h24Var2.b = false;
                h24Var2.d = null;
                h24Var2.a = false;
                WeakHashMap weakHashMap = jdc.a;
                ColorStateList c = bdc.c(view);
                if (c != null) {
                    h24Var2.b = true;
                    h24Var2.c = c;
                }
                PorterDuff.Mode d = bdc.d(view);
                if (d != null) {
                    h24Var2.a = true;
                    h24Var2.d = d;
                }
                if (h24Var2.b || h24Var2.a) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = fp.b;
                    ha9.n(background, h24Var2, drawableState);
                    return;
                }
            }
            h24 h24Var3 = (h24) this.e;
            if (h24Var3 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = fp.b;
                ha9.n(background, h24Var3, drawableState2);
                return;
            }
            h24 h24Var4 = (h24) this.d;
            if (h24Var4 != null) {
                int[] drawableState3 = view.getDrawableState();
                PorterDuff.Mode mode3 = fp.b;
                ha9.n(background, h24Var4, drawableState3);
            }
        }
    }

    public final void c() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f;
        byteBuffer.position(0);
        j58 j58Var = (j58) this.b;
        if (j58Var.f == null) {
            j58Var.a();
        }
        float[] fArr = j58Var.f;
        j58 j58Var2 = (j58) this.c;
        if (j58Var2.f == null) {
            j58Var2.a();
        }
        float[] fArr2 = j58Var2.f;
        j58 j58Var3 = (j58) this.d;
        if (j58Var3.f == null) {
            j58Var3.a();
        }
        float[] fArr3 = j58Var3.f;
        j58 j58Var4 = (j58) this.e;
        if (j58Var4.f == null) {
            j58Var4.a();
        }
        float[] fArr4 = j58Var4.f;
        for (int i = 0; i < 200; i++) {
            byteBuffer.put((byte) (fArr2[i] * 255.0f));
            byteBuffer.put((byte) (fArr3[i] * 255.0f));
            byteBuffer.put((byte) (fArr4[i] * 255.0f));
            byteBuffer.put((byte) (fArr[i] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public final void d(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            f79 f79Var = (f79) priorityQueue.poll();
            String str = g8c.a;
            int i2 = 0;
            while (true) {
                arrayList = f79Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((g79) this.b).s(f79Var.b, (xu7) arrayList.get(i2));
                ((ArrayDeque) this.c).push((xu7) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            f79 f79Var2 = (f79) this.f;
            if (f79Var2 != null && f79Var2.b == f79Var.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(f79Var);
        }
    }

    public final ColorStateList e() {
        h24 h24Var = (h24) this.e;
        if (h24Var != null) {
            return (ColorStateList) h24Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode f() {
        h24 h24Var = (h24) this.e;
        if (h24Var != null) {
            return (PorterDuff.Mode) h24Var.d;
        }
        return null;
    }

    public final void g(AttributeSet attributeSet, int i) {
        ColorStateList i2;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = jy8.z;
        vk9 v = vk9.v(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) v.c;
        View view2 = (View) this.b;
        jdc.j(view2, view2.getContext(), iArr, attributeSet, (TypedArray) v.c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.a = typedArray.getResourceId(0, -1);
                fp fpVar = (fp) this.c;
                Context context2 = view.getContext();
                int i3 = this.a;
                synchronized (fpVar) {
                    i2 = fpVar.a.i(context2, i3);
                }
                if (i2 != null) {
                    k(i2);
                }
            }
            if (typedArray.hasValue(1)) {
                bdc.f(view, v.m(1));
            }
            if (typedArray.hasValue(2)) {
                bdc.g(view, lq3.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            v.y();
        }
    }

    public final void h() {
        this.a = -1;
        k(null);
        b();
    }

    public final void i(int i) {
        ColorStateList colorStateList;
        this.a = i;
        fp fpVar = (fp) this.c;
        if (fpVar != null) {
            Context context = ((View) this.b).getContext();
            synchronized (fpVar) {
                colorStateList = fpVar.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        k(colorStateList);
        b();
    }

    public final void j(Runnable runnable) {
        cdb cdbVar = (cdb) this.b;
        if (!cdbVar.a.getLooper().getThread().isAlive()) {
            return;
        }
        cdbVar.e(runnable);
    }

    public final void k(ColorStateList colorStateList) {
        if (colorStateList != null) {
            h24 h24Var = (h24) this.d;
            h24 h24Var2 = h24Var;
            if (h24Var == null) {
                Object obj = new Object();
                this.d = obj;
                h24Var2 = obj;
            }
            h24Var2.c = colorStateList;
            h24Var2.b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public final void l(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        gre.p(z);
        this.a = i;
        d(i);
    }

    public final void m(ColorStateList colorStateList) {
        h24 h24Var = (h24) this.e;
        h24 h24Var2 = h24Var;
        if (h24Var == null) {
            Object obj = new Object();
            this.e = obj;
            h24Var2 = obj;
        }
        h24Var2.c = colorStateList;
        h24Var2.b = true;
        b();
    }

    public final void n(PorterDuff.Mode mode) {
        h24 h24Var = (h24) this.e;
        h24 h24Var2 = h24Var;
        if (h24Var == null) {
            Object obj = new Object();
            this.e = obj;
            h24Var2 = obj;
        }
        h24Var2.d = mode;
        h24Var2.a = true;
        b();
    }

    public final boolean o() {
        if (((j58) this.b).b() && ((j58) this.c).b() && ((j58) this.d).b() && ((j58) this.e).b()) {
            return true;
        }
        return false;
    }

    public final void p(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            y54 y54Var = ((o54) this.d).b;
            ((Integer) obj2).getClass();
            int intValue = ((Integer) obj).intValue();
            y54Var.y1();
            y54Var.l.h.b(40, intValue, 0).b();
            y54Var.m.e(21, new pf(intValue, (byte) 4));
        }
    }

    public ko(g79 g79Var) {
        this.b = g79Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public ko(Object obj, Looper looper, Looper looper2, adb adbVar, o54 o54Var) {
        this.b = adbVar.a(looper, null);
        this.c = adbVar.a(looper2, null);
        this.e = obj;
        this.f = obj;
        this.d = o54Var;
    }

    public ko(int[] iArr, txb[] txbVarArr, int[] iArr2, int[][][] iArr3, txb txbVar) {
        this.b = iArr;
        this.c = txbVarArr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = txbVar;
        this.a = iArr.length;
    }

    public ko(View view) {
        this.a = -1;
        this.b = view;
        this.c = fp.a();
    }
}
