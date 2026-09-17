package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class r0 {
    public final CharSequence f8676a;
    public final Bundle f8677b;
    public final HashSet f8678c;

    public r0(String str, Bundle bundle, HashSet hashSet) {
        this.f8676a = str;
        this.f8677b = bundle;
        this.f8678c = hashSet;
    }

    public static RemoteInput[] a(r0[] r0VarArr) {
        if (r0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[r0VarArr.length];
        for (int i10 = 0; i10 < r0VarArr.length; i10++) {
            r0 r0Var = r0VarArr[i10];
            r0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(r0Var.f8676a).setChoices(null).setAllowFreeFormInput(true).addExtras(r0Var.f8677b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = r0Var.f8678c.iterator();
                while (it.hasNext()) {
                    w6.a.c(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                b2.c.n(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
