package e0;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;

public final class r0 {

    public final CharSequence f5115a;

    public final Bundle f5116b;

    public final HashSet f5117c;

    public r0(String str, Bundle bundle, HashSet hashSet) {
        this.f5115a = str;
        this.f5116b = bundle;
        this.f5117c = hashSet;
    }

    public static RemoteInput[] a(r0[] r0VarArr) {
        if (r0VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[r0VarArr.length];
        for (int i10 = 0; i10 < r0VarArr.length; i10++) {
            r0 r0Var = r0VarArr[i10];
            r0Var.getClass();
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder("extra_voice_reply").setLabel(r0Var.f5115a).setChoices(null).setAllowFreeFormInput(true).addExtras(r0Var.f5116b);
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator it = r0Var.f5117c.iterator();
                while (it.hasNext()) {
                    h6.a.f(builderAddExtras, (String) it.next());
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                com.google.firebase.messaging.q.h(builderAddExtras);
            }
            remoteInputArr[i10] = builderAddExtras.build();
        }
        return remoteInputArr;
    }
}
