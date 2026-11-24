package defpackage;

import java.lang.ref.WeakReference;
public final class n3d extends y0f {
    public final WeakReference a;

    public n3d(o3d o3dVar) {
        this.a = new WeakReference(o3dVar);
    }

    @Override
    public final void a() {
        o3d o3dVar = (o3d) this.a.get();
        if (o3dVar == null) {
            return;
        }
        o3dVar.g();
    }
}
