package ib;

import android.util.Log;
import b6.h;
import c5.j;
import c9.e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, e {
    public static final a f7472a = new Object();
    public static final a f7473b = new Object();
    public static final a f7474c = new Object();

    @Override
    public Object f0(j jVar) {
        return new c(jVar.x(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        h hVar = MobileVisionBase.e;
        if (Log.isLoggable(hVar.f1598b, 6)) {
            String str = hVar.f1599c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
