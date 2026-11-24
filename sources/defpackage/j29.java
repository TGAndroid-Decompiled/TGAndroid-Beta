package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class j29 implements cq9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public j29(oo ooVar) {
        ooVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
