package defpackage;

import android.graphics.Bitmap;
public final class dr4 implements es4 {
    public final byte a;
    public final Object b;

    public dr4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hr4 hr4Var = (hr4) obj2;
                p1c p1cVar = (p1c) obj;
                if (p1cVar == null) {
                    return null;
                }
                if ((hr4Var.b & 2048) != 0 && rk2.e(p1cVar.g)) {
                    return null;
                }
                return p1cVar;
            case 1:
                zh7 zh7Var = (zh7) obj2;
                p1c p1cVar2 = (p1c) obj;
                if (p1cVar2 == null) {
                    return null;
                }
                if ((zh7Var.b & 1024) != 0 && rk2.e(p1cVar2.g)) {
                    return null;
                }
                return p1cVar2;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                lo5 lo5Var = (lo5) ((ym4) obj2).c;
                if (lo5Var.a(Math.max(height, width))) {
                    if (lo5Var.a(height)) {
                        height--;
                    }
                    if (lo5Var.a(width)) {
                        width--;
                    }
                    return zz.p(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i = ((ed) obj2).b;
                if (width2 > i || bitmap2.getHeight() > i) {
                    float f = i;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f / width3, f / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return zz.p(bitmap2);
        }
    }
}
