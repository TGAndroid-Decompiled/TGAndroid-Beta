package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class x {
    public final CharSequence f6079a;
    public final long f6080b;
    public final l0 f6081c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f6082f;

    public x(CharSequence charSequence, long j10, l0 l0Var) {
        this.f6079a = charSequence;
        this.f6080b = j10;
        this.f6081c = l0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            l0 l0Var = xVar.f6081c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = xVar.f6079a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", xVar.f6080b);
            if (l0Var != null) {
                bundle.putCharSequence("sender", l0Var.f6045a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", w.a(b5.d.E(l0Var)));
                } else {
                    bundle.putBundle("person", l0Var.c());
                }
            }
            String str = xVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = xVar.f6082f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = xVar.d;
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
        long j10 = this.f6080b;
        CharSequence charSequence2 = this.f6079a;
        l0 l0Var = this.f6081c;
        if (i10 >= 28) {
            if (l0Var != null) {
                person = b5.d.E(l0Var);
            }
            a2 = w.b(charSequence2, j10, person);
        } else {
            if (l0Var != null) {
                charSequence = l0Var.f6045a;
            }
            a2 = v.a(charSequence2, j10, charSequence);
        }
        String str = this.e;
        if (str != null) {
            v.b(a2, str, this.f6082f);
        }
        return a2;
    }
}
