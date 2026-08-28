package eb;

import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
public final class a implements OnFailureListener, y8.d {
    public static final a f5102a = new Object();
    public static final a f5103b = new Object();
    public static final a f5104c = new Object();

    @Override
    public Object H1(b3.b bVar) {
        return new c(bVar.x(b.class));
    }

    @Override
    public void onFailure(Exception exc) {
        b9.c cVar = MobileVisionBase.f4220e;
        if (Log.isLoggable(cVar.f1662b, 6)) {
            String str = cVar.f1663c;
            String str2 = "Error preloading model resource";
            if (str != null) {
                str2 = str.concat("Error preloading model resource");
            }
            Log.e("MobileVisionBase", str2, exc);
        }
    }
}
