package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
public final class o0 {
    public final CharSequence f8140a;
    public final Bundle f8141b;
    public final HashSet f8142c;

    public o0(String str, Bundle bundle, HashSet hashSet) {
        this.f8140a = str;
        this.f8141b = bundle;
        this.f8142c = hashSet;
    }

    public static RemoteInput[] a(o0[] o0VarArr) {
        if (o0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[o0VarArr.length];
        for (int i10 = 0; i10 < o0VarArr.length; i10++) {
            o0 o0Var = o0VarArr[i10];
            o0Var.getClass();
            RemoteInput.Builder addExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(o0Var.f8140a).setChoices(null).setAllowFreeFormInput(true).addExtras(o0Var.f8141b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = o0Var.f8142c.iterator();
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
