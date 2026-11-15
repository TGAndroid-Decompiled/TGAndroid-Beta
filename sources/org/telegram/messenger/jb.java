package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.ch0;
public final class jb extends h2.j0 {
    public final int f24547e;
    public final fc f24548f;

    public jb(fc fcVar, int i7, int i10) {
        super(i7, 2);
        this.f24547e = i10;
        this.f24548f = fcVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.f24547e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                fc fcVar = this.f24548f;
                String str2 = fcVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) fcVar.f23463a.get(str);
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
                fc fcVar2 = this.f24548f;
                String str3 = fcVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) fcVar2.f23463a.get(str);
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
                fc fcVar3 = this.f24548f;
                Integer num3 = (Integer) fcVar3.f23463a.get(str);
                boolean z10 = bitmapDrawable5 instanceof org.telegram.ui.Components.t5;
                if (z10) {
                    fcVar3.f23467f.remove((org.telegram.ui.Components.t5) bitmapDrawable5);
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
        switch (this.f24547e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
                    this.f24548f.f23467f.add((org.telegram.ui.Components.t5) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override
    public final int q(Object obj) {
        switch (this.f24547e) {
            case 0:
                return fc.d(this.f24548f, (BitmapDrawable) obj);
            case 1:
                return fc.d(this.f24548f, (BitmapDrawable) obj);
            case 2:
                return fc.d(this.f24548f, (BitmapDrawable) obj);
            default:
                return fc.d(this.f24548f, (BitmapDrawable) obj);
        }
    }

    public jb(fc fcVar) {
        super(10485760, 2);
        this.f24547e = 3;
        this.f24548f = fcVar;
    }
}
