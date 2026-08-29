package c9;

import android.os.Bundle;
import android.util.Log;
import androidx.emoji2.text.f;
import f7.v;
import java.util.ArrayList;
public final class a implements e9.a {
    public final f f3008a;

    public a(f fVar) {
        this.f3008a = fVar;
    }

    @Override
    public void a(Bundle bundle) {
        ((v) this.f3008a.f1343a).a(bundle);
    }

    public void b(eg.c cVar) {
        f fVar = this.f3008a;
        synchronized (fVar) {
            ((ArrayList) fVar.f1345c).add(cVar);
            ((bb.a) fVar.f1344b).getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
            }
        }
    }
}
