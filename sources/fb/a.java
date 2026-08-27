package fb;

import af.h;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;

public final class a implements OnFailureListener, z8.d {

    public static final a f6033a = new a();

    public static final a f6034b = new a();

    public static final a f6035c = new a();

    @Override
    public void onFailure(Exception exc) {
        c9.b bVar = MobileVisionBase.f4662e;
        if (Log.isLoggable(bVar.f2566b, 6)) {
            String str = bVar.f2567c;
            Log.e("MobileVisionBase", str != null ? str.concat("Error preloading model resource") : "Error preloading model resource", exc);
        }
    }

    @Override
    public Object u0(h hVar) {
        return new c(hVar.y(b.class));
    }
}
