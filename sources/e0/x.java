package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class x {
    public final CharSequence f8288a;
    public final long f8289b;
    public final n0 f8290c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f8291f;

    public x(CharSequence charSequence, long j10, n0 n0Var) {
        this.f8288a = charSequence;
        this.f8289b = j10;
        this.f8290c = n0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x xVar = (x) arrayList.get(i10);
            n0 n0Var = xVar.f8290c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = xVar.f8288a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", xVar.f8289b);
            if (n0Var != null) {
                bundle.putCharSequence("sender", n0Var.f8255a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", w.a(b5.d.E(n0Var)));
                } else {
                    bundle.putBundle("person", n0Var.c());
                }
            }
            String str = xVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = xVar.f8291f;
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
        long j10 = this.f8289b;
        CharSequence charSequence2 = this.f8288a;
        n0 n0Var = this.f8290c;
        if (i10 >= 28) {
            if (n0Var != null) {
                person = b5.d.E(n0Var);
            }
            a2 = w.b(charSequence2, j10, person);
        } else {
            if (n0Var != null) {
                charSequence = n0Var.f8255a;
            }
            a2 = v.a(charSequence2, j10, charSequence);
        }
        String str = this.e;
        if (str != null) {
            v.b(a2, str, this.f8291f);
        }
        return a2;
    }
}
