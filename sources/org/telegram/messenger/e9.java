package org.telegram.messenger;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class e9 implements OnSuccessListener, OnFailureListener {
    public final org.telegram.ui.r3 f23690a;

    @Override
    public void onFailure(Exception exc) {
        a8.g(exc, true);
        this.f23690a.a(Collections.EMPTY_LIST);
    }

    @Override
    public void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (db.c cVar : (List) obj) {
            if (cVar.f8277c == 1) {
                arrayList.add(cVar);
            }
        }
        this.f23690a.a(arrayList);
    }
}
