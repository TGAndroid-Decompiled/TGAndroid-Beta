package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class w {
    public final CharSequence f8163a;
    public final long f8164b;
    public final m0 f8165c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f8166f;

    public w(CharSequence charSequence, long j10, m0 m0Var) {
        this.f8163a = charSequence;
        this.f8164b = j10;
        this.f8165c = m0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = (w) arrayList.get(i10);
            m0 m0Var = wVar.f8165c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = wVar.f8163a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", wVar.f8164b);
            if (m0Var != null) {
                bundle.putCharSequence("sender", m0Var.f8130a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", v.a(b5.d.E(m0Var)));
                } else {
                    bundle.putBundle("person", m0Var.c());
                }
            }
            String str = wVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = wVar.f8166f;
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
        long j10 = this.f8164b;
        CharSequence charSequence2 = this.f8163a;
        m0 m0Var = this.f8165c;
        if (i10 >= 28) {
            if (m0Var != null) {
                person = b5.d.E(m0Var);
            }
            a2 = v.b(charSequence2, j10, person);
        } else {
            if (m0Var != null) {
                charSequence = m0Var.f8130a;
            }
            a2 = u.a(charSequence2, j10, charSequence);
        }
        String str = this.e;
        if (str != null) {
            u.b(a2, str, this.f8166f);
        }
        return a2;
    }
}
