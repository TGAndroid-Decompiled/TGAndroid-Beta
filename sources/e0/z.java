package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class z {
    public final CharSequence f5039a;
    public final long f5040b;
    public final o0 f5041c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f5042f;

    public z(CharSequence charSequence, long j10, o0 o0Var) {
        this.f5039a = charSequence;
        this.f5040b = j10;
        this.f5041c = o0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            o0 o0Var = zVar.f5041c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.f5039a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.f5040b);
            if (o0Var != null) {
                bundle.putCharSequence("sender", o0Var.f5006a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.E(o0Var)));
                } else {
                    bundle.putBundle("person", o0Var.c());
                }
            }
            String str = zVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zVar.f5042f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = zVar.d;
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
        long j10 = this.f5040b;
        CharSequence charSequence2 = this.f5039a;
        o0 o0Var = this.f5041c;
        if (i10 >= 28) {
            if (o0Var != null) {
                person = d1.f.E(o0Var);
            }
            a2 = y.b(charSequence2, j10, person);
        } else {
            if (o0Var != null) {
                charSequence = o0Var.f5006a;
            }
            a2 = x.a(charSequence2, j10, charSequence);
        }
        String str = this.e;
        if (str != null) {
            x.b(a2, str, this.f5042f);
        }
        return a2;
    }
}
