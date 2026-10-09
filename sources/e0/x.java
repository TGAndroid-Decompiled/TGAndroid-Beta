package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class x {
    public final CharSequence f8489a;
    public final long f8490b;
    public final n0 f8491c;
    public final Bundle d = new Bundle();
    public String f8492e;
    public Uri f8493f;

    public x(CharSequence charSequence, long j3, n0 n0Var) {
        this.f8489a = charSequence;
        this.f8490b = j3;
        this.f8491c = n0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            n0 n0Var = xVar.f8491c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = xVar.f8489a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", xVar.f8490b);
            if (n0Var != null) {
                bundle.putCharSequence("sender", n0Var.f8454a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", w.a(b5.d.E(n0Var)));
                } else {
                    bundle.putBundle("person", n0Var.c());
                }
            }
            String str = xVar.f8492e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = xVar.f8493f;
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
        long j3 = this.f8490b;
        CharSequence charSequence2 = this.f8489a;
        n0 n0Var = this.f8491c;
        if (i10 >= 28) {
            if (n0Var != null) {
                person = b5.d.E(n0Var);
            }
            a2 = w.b(charSequence2, j3, person);
        } else {
            if (n0Var != null) {
                charSequence = n0Var.f8454a;
            }
            a2 = v.a(charSequence2, j3, charSequence);
        }
        String str = this.f8492e;
        if (str != null) {
            v.b(a2, str, this.f8493f);
        }
        return a2;
    }
}
