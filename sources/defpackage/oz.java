package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Collections;
public final class oz implements Runnable {
    public final byte a;
    public final Object b;

    public oz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        String str;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pz pzVar = (pz) obj;
                if (pzVar.c.a) {
                    pzVar.a.a.v1(3, false);
                    return;
                }
                return;
            case 1:
                ((uz) obj).c();
                return;
            case 2:
                ((h20) obj).n.r1.setVisibility(8);
                return;
            case 3:
                a66 a66Var = (a66) obj;
                a66Var.getClass();
                if (Thread.currentThread() == a66Var.a) {
                    a66Var.e(-1, new wz((byte) 3));
                    return;
                }
                return;
            case 4:
                ((y60) ((spc) obj).d).F();
                return;
            case 5:
                bc0 bc0Var = (bc0) obj;
                if (!bc0Var.x) {
                    bc0Var.x = true;
                    tq9.d(new f(bc0Var, (byte) 13));
                    return;
                }
                return;
            case 6:
                bd0 bd0Var = (bd0) obj;
                bd0Var.b.g3.O(true);
                bd0Var.Y(true);
                return;
            case 7:
                ge0 ge0Var = (ge0) obj;
                new ava(ge0Var.getContext(), ge0Var.b).show();
                return;
            case 8:
                try {
                    ((Bitmap) obj).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 9:
                vk0 vk0Var = (vk0) obj;
                vk0Var.o = true;
                vk0Var.d.invalidate();
                return;
            case 10:
                uk0 uk0Var = (uk0) obj;
                if (!uk0Var.a) {
                    vk0 vk0Var2 = uk0Var.d;
                    Bitmap[] bitmapArr = vk0Var2.g;
                    Canvas[] canvasArr = vk0Var2.h;
                    vk0Var2.g = vk0Var2.f;
                    vk0Var2.h = vk0Var2.i;
                    vk0Var2.f = bitmapArr;
                    vk0Var2.i = canvasArr;
                    vk0Var2.k = false;
                    s71 s71Var = vk0Var2.d;
                    if (s71Var != null) {
                        s71Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                sl0 sl0Var = ((xl0) obj).t;
                if (sl0Var != null) {
                    sl0Var.d();
                    return;
                }
                return;
            case 12:
                sl0 sl0Var2 = (sl0) obj;
                sl0Var2.o = (Bitmap) sl0Var2.n.c;
                sl0Var2.d();
                return;
            case 13:
                cb cbVar = ((dm0) ((cm0) obj).c).f;
                if (cbVar != null) {
                    cbVar.d();
                    return;
                }
                return;
            case 14:
                ((wn0) obj).a(null);
                return;
            case 15:
                ((x15) obj).a(Collections.EMPTY_LIST);
                return;
            case 16:
                ((tn0) obj).a(null);
                return;
            case 17:
                ((ip0) obj).invalidateSelf();
                return;
            case 18:
                ((jp0) obj).invalidateSelf();
                return;
            case 19:
                ((lp0) obj).d();
                return;
            case 20:
                yp0 yp0Var = (yp0) obj;
                gl.r(yp0Var.b0);
                yp0Var.N = false;
                yp0Var.invalidate();
                return;
            case 21:
                ((xp0) obj).invalidateSelf();
                return;
            case 22:
                gr0 gr0Var = (gr0) obj;
                kca kcaVar = gr0Var.a0;
                s1b s1bVar = gr0Var.a;
                if (s1bVar == null) {
                    str = "";
                } else {
                    str = s1bVar.E;
                }
                kcaVar.a(str);
                return;
            case 23:
            case 24:
                ((lr0) obj).c();
                return;
            case 25:
                ((mr0) obj).a();
                return;
            case 26:
                ((nr0) obj).a();
                return;
            case 27:
                rs0 rs0Var = (rs0) obj;
                if (rs0Var.isAttachedToWindow() && !rs0Var.c.canScrollVertically(1)) {
                    rs0Var.a();
                    return;
                }
                return;
            case 28:
                ((gt3) obj).requestFocus();
                return;
            default:
                d01.t(((yu0) obj).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
        }
    }
}
