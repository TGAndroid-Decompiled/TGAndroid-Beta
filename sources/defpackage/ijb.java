package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class ijb extends TextureView {
    public static Boolean f;
    public gjb a;
    public final mn b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public ijb(Context context, Runnable runnable) {
        super(context);
        this.b = new mn(this, (byte) 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new up5(this, (byte) 5));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            gl.d3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        Boolean bool = f;
        if (bool == null) {
            bool = Boolean.valueOf(na7.c1().getBoolean("nothanos", false));
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
            hjb hjbVar = (hjb) arrayList.get(i2);
            if (hjbVar.a == view) {
                Runnable runnable = hjbVar.d;
                if (runnable != null) {
                    b(runnable);
                    hjbVar.d = null;
                }
                arrayList.remove(i2);
                i2--;
                z = true;
            }
            i2++;
        }
        if (!z) {
            gjb gjbVar = this.a;
            ArrayList arrayList2 = gjbVar.X;
            if (gjbVar.b.get()) {
                Handler handler = gjbVar.getHandler();
                if (handler == null) {
                    while (i < arrayList2.size()) {
                        fjb fjbVar = (fjb) arrayList2.get(i);
                        if (fjbVar.a.contains(view)) {
                            Runnable runnable2 = fjbVar.f;
                            if (runnable2 != null) {
                                b(runnable2);
                                fjbVar.f = null;
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
