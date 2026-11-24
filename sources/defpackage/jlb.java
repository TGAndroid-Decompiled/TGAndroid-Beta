package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class jlb extends TextureView {
    public static Boolean f;
    public hlb a;
    public final no b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public jlb(Context context, Runnable runnable) {
        super(context);
        this.b = new no(this, (byte) 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new tr5(this, (byte) 4));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            gm.c3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        Boolean bool = f;
        if (bool == null) {
            bool = Boolean.valueOf(oc7.d1().getBoolean("nothanos", false));
            f = bool;
        }
        if (bool != null && bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final void a(View view) {
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 >= arrayList.size()) {
                break;
            }
            ilb ilbVar = (ilb) arrayList.get(i2);
            if (ilbVar.a == view) {
                Runnable runnable = ilbVar.d;
                if (runnable != null) {
                    b(runnable);
                    ilbVar.d = null;
                }
                arrayList.remove(i2);
                i2--;
                z = true;
            }
            i2++;
        }
        if (!z) {
            hlb hlbVar = this.a;
            ArrayList arrayList2 = hlbVar.X;
            if (hlbVar.b.get()) {
                Handler handler = hlbVar.getHandler();
                if (handler == null) {
                    while (i < arrayList2.size()) {
                        glb glbVar = (glb) arrayList2.get(i);
                        if (glbVar.a.contains(view)) {
                            Runnable runnable2 = glbVar.f;
                            if (runnable2 != null) {
                                b(runnable2);
                                glbVar.f = null;
                            }
                            arrayList2.remove(i);
                            i--;
                        }
                        i++;
                    }
                    return;
                }
                handler.sendMessage(handler.obtainMessage(5, view));
            }
        }
    }
}
