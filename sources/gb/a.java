package gb;

import a5.j;
import a9.e;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, e {
    public static final a f7258a = new Object();
    public static final a f7259b = new Object();
    public static final a f7260c = new Object();

    @Override
    public Object I0(j jVar) {
        return new c(jVar.r(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        d9.c cVar = MobileVisionBase.f5229e;
        if (Log.isLoggable(cVar.f5536b, 6)) {
            String str = cVar.f5537c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
