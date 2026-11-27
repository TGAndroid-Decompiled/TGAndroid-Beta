package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.lang.ref.WeakReference;
public final class sob {
    public int a;
    public int b = -1;
    public byte c;
    public float d;
    public WeakReference e;
    public vnb f;
    public int g;
    public PorterDuff.Mode h;
    public PorterDuffColorFilter i;
    public WeakReference j;
    public boolean k;
    public byte l;
    public boolean m;
    public vob n;
    public wob o;

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
        vnb vnbVar = this.f;
        if (vnbVar == null) {
            WeakReference weakReference = this.e;
            if (weakReference != null) {
                vnbVar = (vnb) weakReference.get();
            } else {
                vnbVar = null;
            }
        }
        return yob.P(i, i2, b, f, vnbVar);
    }

    public final void c(int i, int i2, int i3, float f, vnb vnbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
        if (vnbVar == null) {
            this.e = null;
            this.f = null;
            return;
        }
        Class<?> cls = vnbVar.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(vnbVar);
            this.f = null;
            return;
        }
        this.e = null;
        this.f = vnbVar;
    }
}
