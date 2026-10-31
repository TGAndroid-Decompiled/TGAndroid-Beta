package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class n0 {
    public final CharSequence f6051a;
    public final Bundle f6052b;
    public final HashSet f6053c;

    public n0(String str, Bundle bundle, HashSet hashSet) {
        this.f6051a = str;
        this.f6052b = bundle;
        this.f6053c = hashSet;
    }

    public static RemoteInput[] a(n0[] n0VarArr) {
        if (n0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[n0VarArr.length];
        for (int i10 = 0; i10 < n0VarArr.length; i10++) {
            n0 n0Var = n0VarArr[i10];
            n0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(n0Var.f6051a).setChoices(null).setAllowFreeFormInput(true).addExtras(n0Var.f6052b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = n0Var.f6053c.iterator();
                while (it.hasNext()) {
                    w6.a.c(addExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                b2.d.m(addExtras);
            }
            remoteInputArr[i10] = addExtras.build();
        }
        return remoteInputArr;
    }
}
