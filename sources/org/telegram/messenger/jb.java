package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.oh0;
public final class jb extends h2.j0 {
    public final int f24816e;
    public final fc f24817f;

    public jb(fc fcVar, int i7, int i10) {
        super(i7, 2);
        this.f24816e = i10;
        this.f24817f = fcVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.f24816e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                fc fcVar = this.f24817f;
                String str2 = fcVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) fcVar.f23849a.get(str);
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
                fc fcVar2 = this.f24817f;
                String str3 = fcVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) fcVar2.f23849a.get(str);
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
                fc fcVar3 = this.f24817f;
                Integer num3 = (Integer) fcVar3.f23849a.get(str);
                boolean z10 = bitmapDrawable5 instanceof org.telegram.ui.Components.c6;
                if (z10) {
                    fcVar3.f23853f.remove((org.telegram.ui.Components.c6) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.c6) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof oh0) {
                        ((oh0) bitmapDrawable5).C(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object l(String str, Object obj) {
        switch (this.f24816e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.c6) {
                    this.f24817f.f23853f.add((org.telegram.ui.Components.c6) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override
    public final int q(Object obj) {
        switch (this.f24816e) {
            case 0:
                return fc.d(this.f24817f, (BitmapDrawable) obj);
            case 1:
                return fc.d(this.f24817f, (BitmapDrawable) obj);
            case 2:
                return fc.d(this.f24817f, (BitmapDrawable) obj);
            default:
                return fc.d(this.f24817f, (BitmapDrawable) obj);
        }
    }

    public jb(fc fcVar) {
        super(10485760, 2);
        this.f24816e = 3;
        this.f24817f = fcVar;
    }
}
