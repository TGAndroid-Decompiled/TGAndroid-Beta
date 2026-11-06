package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.zg0;
public final class kb extends h2.j0 {
    public final int f23673e;
    public final gc f23674f;

    public kb(gc gcVar, int i7, int i10) {
        super(i7, 2);
        this.f23673e = i10;
        this.f23674f = gcVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.f23673e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                gc gcVar = this.f23674f;
                String str2 = gcVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) gcVar.f22616a.get(str);
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
                gc gcVar2 = this.f23674f;
                String str3 = gcVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) gcVar2.f22616a.get(str);
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
                gc gcVar3 = this.f23674f;
                Integer num3 = (Integer) gcVar3.f22616a.get(str);
                boolean z9 = bitmapDrawable5 instanceof org.telegram.ui.Components.v5;
                if (z9) {
                    gcVar3.f22620f.remove((org.telegram.ui.Components.v5) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z9) {
                        ((org.telegram.ui.Components.v5) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof zg0) {
                        ((zg0) bitmapDrawable5).C(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object l(String str, Object obj) {
        switch (this.f23673e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
                    this.f23674f.f22620f.add((org.telegram.ui.Components.v5) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override
    public final int q(Object obj) {
        switch (this.f23673e) {
            case 0:
                return gc.d(this.f23674f, (BitmapDrawable) obj);
            case 1:
                return gc.d(this.f23674f, (BitmapDrawable) obj);
            case 2:
                return gc.d(this.f23674f, (BitmapDrawable) obj);
            default:
                return gc.d(this.f23674f, (BitmapDrawable) obj);
        }
    }

    public kb(gc gcVar) {
        super(10485760, 2);
        this.f23673e = 3;
        this.f23674f = gcVar;
    }
}
