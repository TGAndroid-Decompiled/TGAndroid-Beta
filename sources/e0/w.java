package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class w {
    public final CharSequence f9301a;
    public final long f9302b;
    public final k0 f9303c;
    public final Bundle d = new Bundle();
    public String f9304e;
    public Uri f9305f;

    public w(CharSequence charSequence, long j10, k0 k0Var) {
        this.f9301a = charSequence;
        this.f9302b = j10;
        this.f9303c = k0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            w wVar = (w) arrayList.get(i3);
            k0 k0Var = wVar.f9303c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.f9301a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.f9302b);
            if (k0Var != null) {
                bundle.putCharSequence("sender", k0Var.f9264a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(d1.f.E(k0Var)));
                } else {
                    bundle.putBundle("person", k0Var.c());
                }
            }
            String str = wVar.f9304e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = wVar.f9305f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = wVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i3] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a10;
        int i3 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        Person person = null;
        long j10 = this.f9302b;
        CharSequence charSequence2 = this.f9301a;
        k0 k0Var = this.f9303c;
        if (i3 >= 28) {
            if (k0Var != null) {
                person = d1.f.E(k0Var);
            }
            a10 = v.b(charSequence2, j10, person);
        } else {
            if (k0Var != null) {
                charSequence = k0Var.f9264a;
            }
            a10 = u.a(charSequence2, j10, charSequence);
        }
        String str = this.f9304e;
        if (str != null) {
            u.b(a10, str, this.f9305f);
        }
        return a10;
    }
}
