package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import java.util.ArrayList;
public final class hnb extends TextureView {
    public static Boolean f;
    public fnb a;
    public final nn b;
    public final ArrayList c;
    public Runnable d;
    public boolean e;

    public hnb(Context context, Runnable runnable) {
        super(context);
        this.b = new nn(this, (byte) 1);
        this.c = new ArrayList();
        this.d = runnable;
        setOpaque(false);
        setSurfaceTextureListener(new wr5(this, (byte) 5));
    }

    public static void b(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            hl.c3(runnable);
        } else {
            runnable.run();
        }
    }

    public static boolean c() {
        Boolean bool = f;
        if (bool == null) {
            bool = Boolean.valueOf(uc7.e1().getBoolean("nothanos", false));
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
            gnb gnbVar = (gnb) arrayList.get(i2);
            if (gnbVar.a == view) {
                Runnable runnable = gnbVar.d;
                if (runnable != null) {
                    b(runnable);
                    gnbVar.d = null;
                }
                arrayList.remove(i2);
                i2--;
                z = true;
            }
            i2++;
        }
        if (!z) {
            fnb fnbVar = this.a;
            ArrayList arrayList2 = fnbVar.X;
            if (fnbVar.b.get()) {
                Handler handler = fnbVar.getHandler();
                if (handler == null) {
                    while (i < arrayList2.size()) {
                        enb enbVar = (enb) arrayList2.get(i);
                        if (enbVar.a.contains(view)) {
                            Runnable runnable2 = enbVar.f;
                            if (runnable2 != null) {
                                b(runnable2);
                                enbVar.f = null;
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
