package e2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import m.c3;
import m.l1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kc;
import org.telegram.ui.Components.me0;
import org.telegram.ui.ml;
import v7.t6;
public final class c {
    public int f6116a;
    public Object f6117b;
    public Object f6118c;
    public Object d;
    public Object e;
    public Object f6119f;

    public c(View view) {
        this.f6116a = -1;
        this.f6117b = view;
        this.f6118c = m.q.a();
    }

    public void a(long r10, e2.x r12) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.a(long, e2.x):void");
    }

    public void b() {
        View view = (View) this.f6117b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((c3) this.d) != null) {
                if (((c3) this.f6119f) == null) {
                    this.f6119f = new Object();
                }
                c3 c3Var = (c3) this.f6119f;
                c3Var.f12383c = null;
                c3Var.f12382b = false;
                c3Var.d = null;
                c3Var.f12381a = false;
                WeakHashMap weakHashMap = r0.h0.f46123a;
                ColorStateList c10 = r0.z.c(view);
                if (c10 != null) {
                    c3Var.f12382b = true;
                    c3Var.f12383c = c10;
                }
                PorterDuff.Mode d = r0.z.d(view);
                if (d != null) {
                    c3Var.f12381a = true;
                    c3Var.d = d;
                }
                if (c3Var.f12382b || c3Var.f12381a) {
                    m.q.d(background, c3Var, view.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.e;
            if (c3Var2 != null) {
                m.q.d(background, c3Var2, view.getDrawableState());
                return;
            }
            c3 c3Var3 = (c3) this.d;
            if (c3Var3 != null) {
                m.q.d(background, c3Var3, view.getDrawableState());
            }
        }
    }

    public void c() {
        this.f6117b = null;
        if (((ml) this.f6119f) != null) {
            Utilities.e.a((ml) this.f6119f);
        }
        Bitmap bitmap = (Bitmap) this.f6118c;
        if (bitmap != null && !bitmap.isRecycled()) {
            ((Bitmap) this.f6118c).recycle();
        }
        this.f6118c = null;
    }

    public void d() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f6119f;
        byteBuffer.position(0);
        me0 me0Var = (me0) this.f6117b;
        if (me0Var.f28429f == null) {
            me0Var.a();
        }
        float[] fArr = me0Var.f28429f;
        me0 me0Var2 = (me0) this.f6118c;
        if (me0Var2.f28429f == null) {
            me0Var2.a();
        }
        float[] fArr2 = me0Var2.f28429f;
        me0 me0Var3 = (me0) this.d;
        if (me0Var3.f28429f == null) {
            me0Var3.a();
        }
        float[] fArr3 = me0Var3.f28429f;
        me0 me0Var4 = (me0) this.e;
        if (me0Var4.f28429f == null) {
            me0Var4.a();
        }
        float[] fArr4 = me0Var4.f28429f;
        for (int i10 = 0; i10 < 200; i10++) {
            byteBuffer.put((byte) (fArr2[i10] * 255.0f));
            byteBuffer.put((byte) (fArr3[i10] * 255.0f));
            byteBuffer.put((byte) (fArr4[i10] * 255.0f));
            byteBuffer.put((byte) (fArr[i10] * 255.0f));
        }
        byteBuffer.position(0);
    }

    public void e(int i10) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i10) {
            f2.v vVar = (f2.v) priorityQueue.poll();
            String str = l0.f6165a;
            int i11 = 0;
            while (true) {
                arrayList = vVar.f6803a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((f2.w) this.f6117b).a(vVar.f6804b, (x) arrayList.get(i11));
                ((ArrayDeque) this.f6118c).push((x) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            f2.v vVar2 = (f2.v) this.f6119f;
            if (vVar2 != null && vVar2.f6804b == vVar.f6804b) {
                this.f6119f = null;
            }
            ((ArrayDeque) this.d).push(vVar);
        }
    }

    public android.graphics.Bitmap f(android.graphics.Bitmap r9, java.lang.String r10, int r11, int r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: e2.c.f(android.graphics.Bitmap, java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public Bitmap g(kc kcVar) {
        if (kcVar == null) {
            return null;
        }
        return f(kcVar.f16564c, kcVar.f16562a, kcVar.e, 0, false);
    }

    public Bitmap h(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return null;
        }
        return f(imageReceiver.n(), imageReceiver.Q, imageReceiver.U, imageReceiver.V, false);
    }

    public ColorStateList i() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (ColorStateList) c3Var.f12383c;
        }
        return null;
    }

    public PorterDuff.Mode j() {
        c3 c3Var = (c3) this.e;
        if (c3Var != null) {
            return (PorterDuff.Mode) c3Var.d;
        }
        return null;
    }

    public void k(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = (View) this.f6117b;
        Context context = view.getContext();
        int[] iArr = f.a.f6715z;
        li.k G = li.k.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) G.f12101c;
        View view2 = (View) this.f6117b;
        r0.h0.i(view2, view2.getContext(), iArr, attributeSet, (TypedArray) G.f12101c, i10);
        try {
            if (typedArray.hasValue(0)) {
                this.f6116a = typedArray.getResourceId(0, -1);
                m.q qVar = (m.q) this.f6118c;
                Context context2 = view.getContext();
                int i12 = this.f6116a;
                synchronized (qVar) {
                    i11 = qVar.f12524a.i(context2, i12);
                }
                if (i11 != null) {
                    o(i11);
                }
            }
            if (typedArray.hasValue(1)) {
                r0.z.f(view, G.v(1));
            }
            if (typedArray.hasValue(2)) {
                r0.z.g(view, l1.b(typedArray.getInt(2, -1), null));
            }
            G.I();
        } catch (Throwable th2) {
            G.I();
            throw th2;
        }
    }

    public void l() {
        this.f6116a = -1;
        o(null);
        b();
    }

    public void m(int i10) {
        ColorStateList colorStateList;
        this.f6116a = i10;
        m.q qVar = (m.q) this.f6118c;
        if (qVar != null) {
            Context context = ((View) this.f6117b).getContext();
            synchronized (qVar) {
                colorStateList = qVar.f12524a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        o(colorStateList);
        b();
    }

    public void n(Runnable runnable) {
        i0 i0Var = (i0) this.f6117b;
        if (!i0Var.f6151a.getLooper().getThread().isAlive()) {
            return;
        }
        i0Var.d(runnable);
    }

    public void o(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((c3) this.d) == null) {
                this.d = new Object();
            }
            c3 c3Var = (c3) this.d;
            c3Var.f12383c = colorStateList;
            c3Var.f12382b = true;
        } else {
            this.d = null;
        }
        b();
    }

    public void p(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.p(z10);
        this.f6116a = i10;
        e(i10);
    }

    public void q(ColorStateList colorStateList) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.f12383c = colorStateList;
        c3Var.f12382b = true;
        b();
    }

    public void r(PorterDuff.Mode mode) {
        if (((c3) this.e) == null) {
            this.e = new Object();
        }
        c3 c3Var = (c3) this.e;
        c3Var.d = mode;
        c3Var.f12381a = true;
        b();
    }

    public boolean s() {
        if (((me0) this.f6117b).b() && ((me0) this.f6118c).b() && ((me0) this.d).b() && ((me0) this.e).b()) {
            return true;
        }
        return false;
    }

    public void t(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (!obj2.equals(obj)) {
            i2.i0 i0Var = ((i2.x) this.d).f8114b;
            ((Integer) obj2).getClass();
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            i0Var.F1();
            i0Var.t1(1, 10, num);
            i0Var.t1(2, 10, num);
            i0Var.f7916m.e(21, new i2.w(intValue, 1));
        }
    }

    public c(f2.w wVar) {
        this.f6117b = wVar;
        this.f6118c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.f6116a = -1;
    }

    public c() {
        this.f6117b = new me0();
        this.f6118c = new me0();
        this.d = new me0();
        this.e = new me0();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(800);
        this.f6119f = allocateDirect;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
    }

    public c(int i10, Runnable runnable) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f6116a = i10;
        this.e = runnable;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
