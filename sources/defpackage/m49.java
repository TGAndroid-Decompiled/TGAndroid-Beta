package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
public final class m49 implements ds9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public m49(op opVar) {
        opVar.f("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
