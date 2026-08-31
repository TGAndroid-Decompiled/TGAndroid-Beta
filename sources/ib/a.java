package ib;

import android.util.Log;
import b6.h;
import c5.j;
import c9.e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, e {
    public static final a f8044a = new Object();
    public static final a f8045b = new Object();
    public static final a f8046c = new Object();

    @Override
    public Object e0(j jVar) {
        return new c(jVar.w(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        h hVar = MobileVisionBase.f4125e;
        if (Log.isLoggable(hVar.f1728b, 6)) {
            String str = hVar.f1729c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
