package b9;

import a9.m;
import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import java.util.ArrayList;

public final class a implements d9.a {

    public final f f2047a;

    public a(f fVar) {
        this.f2047a = fVar;
    }

    public void a(m mVar) {
        f fVar = this.f2047a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1350c).add(mVar);
            ((ab.a) fVar.f1349b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }

    @Override
    public void s(Bundle bundle) {
        ((xa.a) this.f2047a.f1348a).s(bundle);
    }
}
