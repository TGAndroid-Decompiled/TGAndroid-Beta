package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class z {
    public final CharSequence f4784a;
    public final long f4785b;
    public final p0 f4786c;
    public final Bundle d = new Bundle();
    public String f4787e;
    public Uri f4788f;

    public z(CharSequence charSequence, long j10, p0 p0Var) {
        this.f4784a = charSequence;
        this.f4785b = j10;
        this.f4786c = p0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            z zVar = (z) arrayList.get(i9);
            p0 p0Var = zVar.f4786c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.f4784a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.f4785b);
            if (p0Var != null) {
                bundle.putCharSequence("sender", p0Var.f4749a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.D(p0Var)));
                } else {
                    bundle.putBundle("person", p0Var.c());
                }
            }
            String str = zVar.f4787e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zVar.f4788f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            Bundle bundle2 = zVar.d;
            if (bundle2 != null) {
                bundle.putBundle("extras", bundle2);
            }
            bundleArr[i9] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a2;
        int i9 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        Person person = null;
        long j10 = this.f4785b;
        CharSequence charSequence2 = this.f4784a;
        p0 p0Var = this.f4786c;
        if (i9 >= 28) {
            if (p0Var != null) {
                person = d1.f.D(p0Var);
            }
            a2 = y.b(charSequence2, j10, person);
        } else {
            if (p0Var != null) {
                charSequence = p0Var.f4749a;
            }
            a2 = x.a(charSequence2, j10, charSequence);
        }
        String str = this.f4787e;
        if (str != null) {
            x.b(a2, str, this.f4788f);
        }
        return a2;
    }
}
