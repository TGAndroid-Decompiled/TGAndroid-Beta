package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class z {
    public final CharSequence f5754a;
    public final long f5755b;
    public final p0 f5756c;
    public final Bundle d = new Bundle();
    public String f5757e;
    public Uri f5758f;

    public z(CharSequence charSequence, long j10, p0 p0Var) {
        this.f5754a = charSequence;
        this.f5755b = j10;
        this.f5756c = p0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            p0 p0Var = zVar.f5756c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.f5754a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.f5755b);
            if (p0Var != null) {
                bundle.putCharSequence("sender", p0Var.f5719a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.E(p0Var)));
                } else {
                    bundle.putBundle("person", p0Var.c());
                }
            }
            String str = zVar.f5757e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zVar.f5758f;
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
        long j10 = this.f5755b;
        CharSequence charSequence2 = this.f5754a;
        p0 p0Var = this.f5756c;
        if (i10 >= 28) {
            if (p0Var != null) {
                person = d1.f.E(p0Var);
            }
            a2 = y.b(charSequence2, j10, person);
        } else {
            if (p0Var != null) {
                charSequence = p0Var.f5719a;
            }
            a2 = x.a(charSequence2, j10, charSequence);
        }
        String str = this.f5757e;
        if (str != null) {
            x.b(a2, str, this.f5758f);
        }
        return a2;
    }
}
