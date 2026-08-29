package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class r0 {
    public final CharSequence f5728a;
    public final Bundle f5729b;
    public final HashSet f5730c;

    public r0(String str, Bundle bundle, HashSet hashSet) {
        this.f5728a = str;
        this.f5729b = bundle;
        this.f5730c = hashSet;
    }

    public static RemoteInput[] a(r0[] r0VarArr) {
        if (r0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[r0VarArr.length];
        for (int i10 = 0; i10 < r0VarArr.length; i10++) {
            r0 r0Var = r0VarArr[i10];
            r0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(r0Var.f5728a).setChoices(null).setAllowFreeFormInput(true).addExtras(r0Var.f5729b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = r0Var.f5730c.iterator();
                while (it.hasNext()) {
                    i6.a.g(addExtras, (String) it.next());
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
