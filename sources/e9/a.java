package e9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;
public final class a implements g9.a {
    public final f f5168a;

    public a(f fVar) {
        this.f5168a = fVar;
    }

    public void a(f0.d dVar) {
        f fVar = this.f5168a;
        synchronized (fVar) {
            ((ArrayList) fVar.f771c).add(dVar);
            ((db.a) fVar.f770b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void q2(Bundle bundle) {
        ((cb.b) this.f5168a.f769a).q2(bundle);
    }
}
