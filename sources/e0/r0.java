package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class r0 {
    public final CharSequence f4758a;
    public final Bundle f4759b;
    public final HashSet f4760c;

    public r0(String str, Bundle bundle, HashSet hashSet) {
        this.f4758a = str;
        this.f4759b = bundle;
        this.f4760c = hashSet;
    }

    public static RemoteInput[] a(r0[] r0VarArr) {
        if (r0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[r0VarArr.length];
        for (int i9 = 0; i9 < r0VarArr.length; i9++) {
            r0 r0Var = r0VarArr[i9];
            r0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(r0Var.f4758a).setChoices(null).setAllowFreeFormInput(true).addExtras(r0Var.f4759b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = r0Var.f4760c.iterator();
                while (it.hasNext()) {
                    g6.a.f(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                com.google.firebase.messaging.q.h(addExtras);
            }
            remoteInputArr[i9] = addExtras.build();
        }
        return remoteInputArr;
    }
}
