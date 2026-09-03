package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class q0 {
    public final CharSequence f5017a;
    public final Bundle f5018b;
    public final HashSet f5019c;

    public q0(String str, Bundle bundle, HashSet hashSet) {
        this.f5017a = str;
        this.f5018b = bundle;
        this.f5019c = hashSet;
    }

    public static RemoteInput[] a(q0[] q0VarArr) {
        if (q0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[q0VarArr.length];
        for (int i10 = 0; i10 < q0VarArr.length; i10++) {
            q0 q0Var = q0VarArr[i10];
            q0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(q0Var.f5017a).setChoices(null).setAllowFreeFormInput(true).addExtras(q0Var.f5018b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = q0Var.f5019c.iterator();
                while (it.hasNext()) {
                    k6.a.g(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                com.google.firebase.messaging.p.h(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
