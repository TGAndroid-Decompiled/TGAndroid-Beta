package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Collections;
public final class f00 implements Runnable {
    public final byte a;
    public final Object b;

    public f00(Object obj, byte b) {
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
                ((m00) obj).onBackPressed();
                return;
            case 1:
                yh4 yh4Var = (yh4) obj;
                ((Context) yh4Var.b).unregisterReceiver((p00) yh4Var.c);
                return;
            case 2:
                p00 p00Var = (p00) obj;
                if (p00Var.c.a) {
                    p00Var.a.a.v1(3, false);
                    return;
                }
                return;
            case 3:
                ((u00) obj).l();
                return;
            case 4:
                ((h30) obj).n.r1.setVisibility(8);
                return;
            case 5:
                a86 a86Var = (a86) obj;
                a86Var.getClass();
                if (Thread.currentThread() == a86Var.a) {
                    a86Var.e(-1, new w00((byte) 3));
                    return;
                }
                return;
            case 6:
                ((y70) ((trc) obj).d).n();
                return;
            case 7:
                bd0 bd0Var = (bd0) obj;
                if (!bd0Var.x) {
                    bd0Var.x = true;
                    vs9.d(new f(bd0Var, (byte) 13));
                    return;
                }
                return;
            case 8:
                be0 be0Var = (be0) obj;
                be0Var.b.g3.O(true);
                be0Var.Z(true);
                return;
            case 9:
                gf0 gf0Var = (gf0) obj;
                new exa(gf0Var.getContext(), gf0Var.b).show();
                return;
            case 10:
                try {
                    ((Bitmap) obj).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 11:
                vl0 vl0Var = (vl0) obj;
                vl0Var.o = true;
                vl0Var.d.invalidate();
                return;
            case 12:
                ul0 ul0Var = (ul0) obj;
                if (!ul0Var.a) {
                    vl0 vl0Var2 = ul0Var.d;
                    Bitmap[] bitmapArr = vl0Var2.g;
                    Canvas[] canvasArr = vl0Var2.h;
                    vl0Var2.g = vl0Var2.f;
                    vl0Var2.h = vl0Var2.i;
                    vl0Var2.f = bitmapArr;
                    vl0Var2.i = canvasArr;
                    vl0Var2.k = false;
                    a91 a91Var = vl0Var2.d;
                    if (a91Var != null) {
                        a91Var.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                sm0 sm0Var = ((xm0) obj).t;
                if (sm0Var != null) {
                    sm0Var.d();
                    return;
                }
                return;
            case 14:
                sm0 sm0Var2 = (sm0) obj;
                sm0Var2.o = (Bitmap) sm0Var2.n.c;
                sm0Var2.d();
                return;
            case 15:
                cb cbVar = ((dn0) ((cn0) obj).c).f;
                if (cbVar != null) {
                    cbVar.d();
                    return;
                }
                return;
            case 16:
                ((wo0) obj).a(null);
                return;
            case 17:
                ((u35) obj).a(Collections.EMPTY_LIST);
                return;
            case 18:
                ((to0) obj).a(null);
                return;
            case 19:
                ((iq0) obj).invalidateSelf();
                return;
            case 20:
                ((jq0) obj).invalidateSelf();
                return;
            case 21:
                ((lq0) obj).d();
                return;
            case 22:
                yq0 yq0Var = (yq0) obj;
                gm.r(yq0Var.b0);
                yq0Var.N = false;
                yq0Var.invalidate();
                return;
            case 23:
                ((xq0) obj).invalidateSelf();
                return;
            case 24:
                gs0 gs0Var = (gs0) obj;
                kea keaVar = gs0Var.a0;
                t3b t3bVar = gs0Var.a;
                if (t3bVar == null) {
                    str = "";
                } else {
                    str = t3bVar.E;
                }
                keaVar.a(str);
                return;
            case 25:
                ((ss0) obj).e();
                return;
            case 26:
            case 27:
                ((ts0) obj).c();
                return;
            case 28:
                ((us0) obj).a();
                return;
            default:
                ((vs0) obj).a();
                return;
        }
    }
}
