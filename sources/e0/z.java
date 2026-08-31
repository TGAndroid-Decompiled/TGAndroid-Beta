package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class z {
    public final CharSequence f4870a;
    public final long f4871b;
    public final o0 f4872c;
    public final Bundle d = new Bundle();
    public String f4873e;
    public Uri f4874f;

    public z(CharSequence charSequence, long j10, o0 o0Var) {
        this.f4870a = charSequence;
        this.f4871b = j10;
        this.f4872c = o0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            o0 o0Var = zVar.f4872c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.f4870a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.f4871b);
            if (o0Var != null) {
                bundle.putCharSequence("sender", o0Var.f4835a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.E(o0Var)));
                } else {
                    bundle.putBundle("person", o0Var.c());
                }
            }
            String str = zVar.f4873e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zVar.f4874f;
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
        long j10 = this.f4871b;
        CharSequence charSequence2 = this.f4870a;
        o0 o0Var = this.f4872c;
        if (i10 >= 28) {
            if (o0Var != null) {
                person = d1.f.E(o0Var);
            }
            a2 = y.b(charSequence2, j10, person);
        } else {
            if (o0Var != null) {
                charSequence = o0Var.f4835a;
            }
            a2 = x.a(charSequence2, j10, charSequence);
        }
        String str = this.f4873e;
        if (str != null) {
            x.b(a2, str, this.f4874f);
        }
        return a2;
    }
}
