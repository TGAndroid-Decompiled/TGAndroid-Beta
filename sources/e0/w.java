package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class w {
    public final CharSequence f10271a;
    public final long f10272b;
    public final j0 f10273c;
    public final Bundle d = new Bundle();
    public String f10274e;
    public Uri f10275f;

    public w(CharSequence charSequence, long j3, j0 j0Var) {
        this.f10271a = charSequence;
        this.f10272b = j3;
        this.f10273c = j0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            w wVar = (w) arrayList.get(i7);
            j0 j0Var = wVar.f10273c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.f10271a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.f10272b);
            if (j0Var != null) {
                bundle.putCharSequence("sender", j0Var.f10231a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(d1.f.E(j0Var)));
                } else {
                    bundle.putBundle("person", j0Var.c());
                }
            }
            String str = wVar.f10274e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = wVar.f10275f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = wVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i7] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a10;
        int i7 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        Person person = null;
        long j3 = this.f10272b;
        CharSequence charSequence2 = this.f10271a;
        j0 j0Var = this.f10273c;
        if (i7 >= 28) {
            if (j0Var != null) {
                person = d1.f.E(j0Var);
            }
            a10 = v.b(charSequence2, j3, person);
        } else {
            if (j0Var != null) {
                charSequence = j0Var.f10231a;
            }
            a10 = u.a(charSequence2, j3, charSequence);
        }
        String str = this.f10274e;
        if (str != null) {
            u.b(a10, str, this.f10275f);
        }
        return a10;
    }
}
