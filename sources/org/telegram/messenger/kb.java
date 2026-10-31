package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.bi0;
public final class kb extends e2.j0 {
    public final int e;
    public final hc f16561f;

    public kb(hc hcVar, int i10, int i11) {
        super(i10, 3);
        this.e = i11;
        this.f16561f = hcVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                hc hcVar = this.f16561f;
                String str2 = hcVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) hcVar.f15853a.get(str);
                    if (num == null || num.intValue() == 0) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        if (!bitmap.isRecycled()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(bitmap);
                            i0.A2(arrayList);
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
                hc hcVar2 = this.f16561f;
                String str3 = hcVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) hcVar2.f15853a.get(str);
                    if (num2 == null || num2.intValue() == 0) {
                        Bitmap bitmap2 = bitmapDrawable3.getBitmap();
                        if (!bitmap2.isRecycled()) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(bitmap2);
                            i0.A2(arrayList2);
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
                hc hcVar3 = this.f16561f;
                Integer num3 = (Integer) hcVar3.f15853a.get(str);
                boolean z10 = bitmapDrawable5 instanceof org.telegram.ui.Components.s5;
                if (z10) {
                    hcVar3.f15856f.remove((org.telegram.ui.Components.s5) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.s5) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof bi0) {
                        ((bi0) bitmapDrawable5).C(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object l(String str, Object obj) {
        switch (this.e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
                    this.f16561f.f15856f.add((org.telegram.ui.Components.s5) bitmapDrawable);
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
                return hc.d(this.f16561f, (BitmapDrawable) obj);
            case 1:
                return hc.d(this.f16561f, (BitmapDrawable) obj);
            case 2:
                return hc.d(this.f16561f, (BitmapDrawable) obj);
            default:
                return hc.d(this.f16561f, (BitmapDrawable) obj);
        }
    }

    public kb(hc hcVar) {
        super(10485760, 3);
        this.e = 3;
        this.f16561f = hcVar;
    }
}
