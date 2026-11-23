package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.ArrayList;
import org.telegram.ui.Components.nh0;
public final class ib extends h2.j0 {
    public final int f24779e;
    public final ec f24780f;

    public ib(ec ecVar, int i7, int i10) {
        super(i7, 2);
        this.f24779e = i10;
        this.f24780f = ecVar;
    }

    @Override
    public void e(String str, Object obj, Object obj2) {
        switch (this.f24779e) {
            case 0:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                ec ecVar = this.f24780f;
                String str2 = ecVar.F;
                if (str2 == null || !str2.equals(str)) {
                    Integer num = (Integer) ecVar.f23781a.get(str);
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
                ec ecVar2 = this.f24780f;
                String str3 = ecVar2.F;
                if (str3 == null || !str3.equals(str)) {
                    Integer num2 = (Integer) ecVar2.f23781a.get(str);
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
                ec ecVar3 = this.f24780f;
                Integer num3 = (Integer) ecVar3.f23781a.get(str);
                boolean z10 = bitmapDrawable5 instanceof org.telegram.ui.Components.b6;
                if (z10) {
                    ecVar3.f23785f.remove((org.telegram.ui.Components.b6) bitmapDrawable5);
                }
                if (num3 == null || num3.intValue() == 0) {
                    if (z10) {
                        ((org.telegram.ui.Components.b6) bitmapDrawable5).u();
                    }
                    if (bitmapDrawable5 instanceof nh0) {
                        ((nh0) bitmapDrawable5).C(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public Object l(String str, Object obj) {
        switch (this.f24779e) {
            case 3:
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable instanceof org.telegram.ui.Components.b6) {
                    this.f24780f.f23785f.add((org.telegram.ui.Components.b6) bitmapDrawable);
                }
                return (BitmapDrawable) super.l(str, bitmapDrawable);
            default:
                return super.l(str, obj);
        }
    }

    @Override
    public final int q(Object obj) {
        switch (this.f24779e) {
            case 0:
                return ec.d(this.f24780f, (BitmapDrawable) obj);
            case 1:
                return ec.d(this.f24780f, (BitmapDrawable) obj);
            case 2:
                return ec.d(this.f24780f, (BitmapDrawable) obj);
            default:
                return ec.d(this.f24780f, (BitmapDrawable) obj);
        }
    }

    public ib(ec ecVar) {
        super(10485760, 2);
        this.f24779e = 3;
        this.f24780f = ecVar;
    }
}
