package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class p0 {
    public final CharSequence f8460a;
    public final Bundle f8461b;
    public final HashSet f8462c;

    public p0(String str, Bundle bundle, HashSet hashSet) {
        this.f8460a = str;
        this.f8461b = bundle;
        this.f8462c = hashSet;
    }

    public static RemoteInput[] a(p0[] p0VarArr) {
        if (p0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[p0VarArr.length];
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            p0 p0Var = p0VarArr[i10];
            p0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(p0Var.f8460a).setChoices(null).setAllowFreeFormInput(true).addExtras(p0Var.f8461b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = p0Var.f8462c.iterator();
                while (it.hasNext()) {
                    w6.a.c(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                b2.c.m(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
