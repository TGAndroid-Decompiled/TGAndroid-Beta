package e9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import f5.u;
import java.util.ArrayList;
public final class a implements g9.a {
    public final f f5001a;

    public a(f fVar) {
        this.f5001a = fVar;
    }

    @Override
    public void A(Bundle bundle) {
        ((db.a) this.f5001a.f824a).A(bundle);
    }

    public void a(u uVar) {
        f fVar = this.f5001a;
        synchronized (fVar) {
            ((ArrayList) fVar.f826c).add(uVar);
            ((h7.u) fVar.f825b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
