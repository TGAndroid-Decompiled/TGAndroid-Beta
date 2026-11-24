package defpackage;

import android.graphics.Bitmap;
public final class ar4 implements bs4 {
    public final byte a;
    public final Object b;

    public ar4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                er4 er4Var = (er4) obj2;
                qzb qzbVar = (qzb) obj;
                if (qzbVar == null) {
                    return null;
                }
                if ((er4Var.b & 2048) != 0 && jl2.e(qzbVar.g)) {
                    return null;
                }
                return qzbVar;
            case 1:
                sh7 sh7Var = (sh7) obj2;
                qzb qzbVar2 = (qzb) obj;
                if (qzbVar2 == null) {
                    return null;
                }
                if ((sh7Var.b & 1024) != 0 && jl2.e(qzbVar2.g)) {
                    return null;
                }
                return qzbVar2;
            case 2:
                Bitmap bitmap = (Bitmap) obj;
                int height = bitmap.getHeight();
                int width = bitmap.getWidth();
                io5 io5Var = (io5) ((mj4) obj2).c;
                if (io5Var.a(Math.max(height, width))) {
                    if (io5Var.a(height)) {
                        height--;
                    }
                    if (io5Var.a(width)) {
                        width--;
                    }
                    return y00.p(Bitmap.createScaledBitmap(bitmap, width, height, true));
                }
                return bitmap;
            default:
                Bitmap bitmap2 = (Bitmap) obj;
                int width2 = bitmap2.getWidth();
                int i = ((de) obj2).b;
                if (width2 > i || bitmap2.getHeight() > i) {
                    float f = i;
                    float width3 = bitmap2.getWidth();
                    float height2 = bitmap2.getHeight();
                    float min = Math.min(f / width3, f / height2);
                    bitmap2 = Bitmap.createScaledBitmap(bitmap2, (int) (width3 * min), (int) (height2 * min), true);
                }
                return y00.p(bitmap2);
        }
    }
}
