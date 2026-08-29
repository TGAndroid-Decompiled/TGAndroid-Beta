package g2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class a implements d {
    public final LinkedHashSet f6977a = new LinkedHashSet();

    public a(e eVar) {
        eVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f6977a));
        return bundle;
    }
}
