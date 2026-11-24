package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class zg4 implements OnSuccessListener, OnFailureListener {
    public final hj3 a;

    public zg4(hj3 hj3Var) {
        this.a = hj3Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        fa4.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override
    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (v9c v9cVar : (List) obj) {
            if (v9cVar.c == 1) {
                arrayList.add(v9cVar);
            }
        }
        this.a.a(arrayList);
    }
}
