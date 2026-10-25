package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class w {
    public final CharSequence f9598a;
    public final long f9599b;
    public final l0 f9600c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f9601f;

    public w(CharSequence charSequence, long j10, l0 l0Var) {
        this.f9598a = charSequence;
        this.f9599b = j10;
        this.f9600c = l0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) arrayList.get(i10);
            l0 l0Var = wVar.f9600c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.f9598a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.f9599b);
            if (l0Var != null) {
                bundle.putCharSequence("sender", l0Var.f9565a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(c5.d.E(l0Var)));
                } else {
                    bundle.putBundle("person", l0Var.c());
                }
            }
            String str = wVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = wVar.f9601f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = wVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a2;
        int i10 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        Person person = null;
        long j10 = this.f9599b;
        CharSequence charSequence2 = this.f9598a;
        l0 l0Var = this.f9600c;
        if (i10 >= 28) {
            if (l0Var != null) {
                person = c5.d.E(l0Var);
            }
            a2 = v.b(charSequence2, j10, person);
        } else {
            if (l0Var != null) {
                charSequence = l0Var.f9565a;
            }
            a2 = u.a(charSequence2, j10, charSequence);
        }
        String str = this.e;
        if (str != null) {
            u.b(a2, str, this.f9601f);
        }
        return a2;
    }
}
