package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
public final class lk5 extends iq {
    public final byte e;
    public final fl5 f;

    public lk5(fl5 fl5Var) {
        super(10485760);
        this.e = (byte) 2;
        this.f = fl5Var;
    }

    @Override
    public final void e(Object obj, Object obj2, String str) {
        byte b = this.e;
        fl5 fl5Var = this.f;
        switch (b) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                String str2 = fl5Var.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) fl5Var.a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            gl.x2(arrayList);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable4 = (BitmapDrawable) obj2;
                String str3 = fl5Var.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) fl5Var.a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable3.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            gl.x2(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                BitmapDrawable bitmapDrawable5 = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable6 = (BitmapDrawable) obj2;
                Integer num3 = (Integer) fl5Var.a.get(str);
                boolean z = bitmapDrawable5 instanceof km;
                if (z) {
                    fl5Var.f.remove((km) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z) {
                        ((km) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof oy8) {
                        ((oy8) bitmapDrawable5).x(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final Object l(String str, Object obj) {
        switch (this.e) {
            case 2:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof km) {
                    this.f.f.add((km) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override
    public final int q(Object obj) {
        switch (this.e) {
            case 0:
                return fl5.Z((BitmapDrawable) obj);
            case 1:
                return fl5.Z((BitmapDrawable) obj);
            default:
                return fl5.Z((BitmapDrawable) obj);
        }
    }

    public lk5(fl5 fl5Var, int i, byte b) {
        super(i);
        this.e = b;
        this.f = fl5Var;
    }
}
