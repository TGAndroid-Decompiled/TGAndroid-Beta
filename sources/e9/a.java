package e9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import h7.u;
import java.util.ArrayList;
public final class a implements g9.a {
    public final f f5162a;

    public a(f fVar) {
        this.f5162a = fVar;
    }

    @Override
    public void K(Bundle bundle) {
        ((db.a) this.f5162a.f757a).K(bundle);
    }

    public void a(f0.d dVar) {
        f fVar = this.f5162a;
        synchronized (fVar) {
            ((ArrayList) fVar.f759c).add(dVar);
            ((u) fVar.f758b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
