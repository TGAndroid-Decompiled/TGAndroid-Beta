package defpackage;

import android.view.View;
import java.util.ArrayList;
public final class b0c implements pcc {
    public final byte a;

    @Override
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof l0c) {
                    ((l0c) view).a(true);
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                return;
        }
    }
}
