package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.lang.ref.WeakReference;
public final class umb {
    public int a;
    public int b = -1;
    public byte c;
    public float d;
    public WeakReference e;
    public ylb f;
    public int g;
    public PorterDuff.Mode h;
    public PorterDuffColorFilter i;
    public WeakReference j;
    public boolean k;
    public byte l;
    public boolean m;
    public xmb n;
    public ymb o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i = this.a;
        int i2 = this.b;
        byte b = this.c;
        float f = this.d;
        ylb ylbVar = this.f;
        if (ylbVar == null) {
            WeakReference weakReference = this.e;
            if (weakReference != null) {
                ylbVar = (ylb) weakReference.get();
            } else {
                ylbVar = null;
            }
        }
        return anb.P(i, i2, b, f, ylbVar);
    }

    public final void c(int i, int i2, int i3, float f, ylb ylbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        if (ylbVar == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = ylbVar.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(ylbVar);
            this.f = null;
            return;
        }
        this.e = null;
        this.f = ylbVar;
    }
}
