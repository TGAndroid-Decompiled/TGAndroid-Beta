package ib;

import android.util.Log;
import b6.h;
import c5.j;
import c9.f;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, f {
    public static final a f7454a = new Object();
    public static final a f7455b = new Object();
    public static final a f7456c = new Object();

    @Override
    public Object d0(j jVar) {
        return new c(jVar.x(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        h hVar = MobileVisionBase.e;
        if (Log.isLoggable(hVar.f1609b, 6)) {
            String str = hVar.f1610c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
