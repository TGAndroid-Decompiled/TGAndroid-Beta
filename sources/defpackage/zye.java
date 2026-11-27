package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
public abstract class zye {
    public static ArrayList a(zob zobVar, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new apb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, zobVar, i));
        }
        return arrayList;
    }
}
