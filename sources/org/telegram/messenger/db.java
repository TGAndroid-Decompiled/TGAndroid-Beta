package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class db extends g2.k0 {
    public final int f22174e;
    public final zb f22175f;

    public db(zb zbVar, int i3, int i10) {
        super(i3, 3);
        this.f22174e = i10;
        this.f22175f = zbVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.f22174e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                zb zbVar = this.f22175f;
                String str2 = zbVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) zbVar.f26757a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            g0.A2(arrayList);
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
                zb zbVar2 = this.f22175f;
                String str3 = zbVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) zbVar2.f26757a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable3.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            g0.A2(arrayList2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
            default:
                return;
            case 3:
                BitmapDrawable bitmapDrawable5 = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable6 = (BitmapDrawable) obj2;
                zb zbVar3 = this.f22175f;
                Integer num3 = (Integer) zbVar3.f26757a.get(str);
                boolean z10 = bitmapDrawable5 instanceof org.telegram.ui.Components.t5;
                if (z10) {
                    zbVar3.f26761f.remove((org.telegram.ui.Components.t5) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.t5) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof ch0) {
                        ((ch0) bitmapDrawable5).C(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object l(String str, Object obj) {
        switch (this.f22174e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                    this.f22175f.f26761f.add((org.telegram.ui.Components.t5) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override
    public final int q(Object obj) {
        switch (this.f22174e) {
            case 0:
                return zb.d(this.f22175f, (BitmapDrawable) obj);
            case 1:
                return zb.d(this.f22175f, (BitmapDrawable) obj);
            case 2:
                return zb.d(this.f22175f, (BitmapDrawable) obj);
            default:
                return zb.d(this.f22175f, (BitmapDrawable) obj);
        }
    }

    public db(zb zbVar) {
        super(10485760, 3);
        this.f22174e = 3;
        this.f22175f = zbVar;
    }
}
