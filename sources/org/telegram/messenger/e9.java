package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class e9 implements OnSuccessListener, OnFailureListener {
    public final org.telegram.ui.r3 f22168a;

    @Override
    public void onFailure(Exception exc) {
        a8.g(exc, true);
        this.f22168a.a(Collections.EMPTY_LIST);
    }

    @Override
    public void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (db.c cVar : (List) obj) {
            if (cVar.f8576c == 1) {
                arrayList.add(cVar);
            }
        }
        this.f22168a.a(arrayList);
    }
}
