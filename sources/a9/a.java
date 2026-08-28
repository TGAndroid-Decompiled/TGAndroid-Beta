package a9;

import android.os.Bundle;
import android.util.Log;
import d7.u;
import java.util.ArrayList;
public final class a implements c9.a {
    public final c f115a;

    public a(c cVar) {
        this.f115a = cVar;
    }

    @Override
    public void V1(Bundle bundle) {
        ((u) this.f115a.f118b).V1(bundle);
    }

    public void a(b bVar) {
        c cVar = this.f115a;
        synchronized (cVar) {
            ((ArrayList) cVar.f117a).add(bVar);
            ((v9.d) cVar.f119c).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
