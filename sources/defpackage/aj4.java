package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class aj4 implements OnSuccessListener, OnFailureListener {
    public final zj3 a;

    @Override
    public final void onFailure(Exception exc) {
        cc4.g(exc, true);
        this.a.a(Collections.EMPTY_LIST);
    }

    @Override
    public final void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (vdc vdcVar : (List) obj) {
            if (vdcVar.c == 1) {
                arrayList.add(vdcVar);
            }
        }
        this.a.a(arrayList);
    }
}
