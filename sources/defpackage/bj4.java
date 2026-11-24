package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class bj4 implements OnSuccessListener, OnFailureListener {
    public final sk3 a;

    public bj4(sk3 sk3Var) {
        this.a = sk3Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        fc4.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override
    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (wbc wbcVar : (List) obj) {
            if (wbcVar.c == 1) {
                arrayList.add(wbcVar);
            }
        }
        this.a.a(arrayList);
    }
}
