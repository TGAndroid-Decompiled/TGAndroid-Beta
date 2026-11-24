package defpackage;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;
public final class sm0 {
    public boolean a;
    public final View b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f;
    public EGLContext g;
    public final Object h;
    public int i;
    public i9b j;
    public Object k;
    public Object l;
    public xm0 m;
    public final ej0 n;
    public Bitmap o;
    public int p;

    public sm0(View view) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new Object();
        this.h = new Object();
        this.n = new ej0(0, new f00(this, (byte) 14));
        this.p = 0;
        this.b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new wd(this, (byte) 3));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f) {
            if (this.g == null) {
                this.g = eGLContext;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        xm0 xm0Var = this.m;
        if (xm0Var == null) {
            return this.o;
        }
        synchronized (xm0Var.n) {
            if (!xm0Var.q) {
                bitmap = null;
            } else {
                bitmap = xm0Var.p;
            }
        }
        if (bitmap == null) {
            return this.o;
        }
        return bitmap;
    }

    public final boolean c() {
        if (this.l != null) {
            return true;
        }
        return false;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((wm0) obj).b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        xm0 xm0Var = this.m;
        if (xm0Var != null) {
            synchronized (xm0Var.n) {
                xm0Var.q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z) {
        int i = this.p;
        this.p = i + 1;
        this.o = this.n.c(bitmap, String.valueOf(i), 0, 0, z);
    }

    public final void g(i9b i9bVar, Object obj) {
        this.j = i9bVar;
        this.k = obj;
        this.i = -14737633;
        if (obj != null && Build.VERSION.SDK_INT >= 31) {
            RenderNode renderNode = (RenderNode) obj;
            RenderNode renderNode2 = new RenderNode("blurRenderNode");
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(gm.L(35.0f), gm.L(35.0f), Shader.TileMode.CLAMP));
            renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
            RecordingCanvas beginRecording = renderNode2.beginRecording();
            beginRecording.drawColor(-14737633);
            beginRecording.drawRenderNode(renderNode);
            renderNode2.endRecording();
            this.l = renderNode2;
            return;
        }
        this.l = null;
    }
}
