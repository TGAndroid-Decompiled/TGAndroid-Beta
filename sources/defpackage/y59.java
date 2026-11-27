package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class y59 implements ut9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public y59(po poVar) {
        poVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
