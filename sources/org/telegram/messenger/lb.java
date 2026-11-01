package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.ci0;
public final class lb extends e2.j0 {
    public final int e;
    public final ic f16926f;

    public lb(ic icVar, int i10, int i11) {
        super(i10, 3);
        this.e = i11;
        this.f16926f = icVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                ic icVar = this.f16926f;
                String str2 = icVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) icVar.f16246a.get(str);
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
                ic icVar2 = this.f16926f;
                String str3 = icVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) icVar2.f16246a.get(str);
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
                ic icVar3 = this.f16926f;
                Integer num3 = (Integer) icVar3.f16246a.get(str);
                boolean z10 = bitmapDrawable5 instanceof org.telegram.ui.Components.s5;
                if (z10) {
                    icVar3.f16249f.remove((org.telegram.ui.Components.s5) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.s5) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof ci0) {
                        ((ci0) bitmapDrawable5).C(false);
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
                    this.f16926f.f16249f.add((org.telegram.ui.Components.s5) bitmapDrawable);
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
                return ic.d(this.f16926f, (BitmapDrawable) obj);
            case 1:
                return ic.d(this.f16926f, (BitmapDrawable) obj);
            case 2:
                return ic.d(this.f16926f, (BitmapDrawable) obj);
            default:
                return ic.d(this.f16926f, (BitmapDrawable) obj);
        }
    }

    public lb(ic icVar) {
        super(10485760, 3);
        this.e = 3;
        this.f16926f = icVar;
    }
}
