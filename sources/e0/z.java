package e0;

import android.app.Notification;
import android.app.Person;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class z {
    public final CharSequence f7839a;
    public final long f7840b;
    public final p0 f7841c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f7842f;

    public z(CharSequence charSequence, long j3, p0 p0Var) {
        this.f7839a = charSequence;
        this.f7840b = j3;
        this.f7841c = p0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            p0 p0Var = zVar.f7841c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.f7839a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.f7840b);
            if (p0Var != null) {
                bundle.putCharSequence("sender", p0Var.f7806a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(b5.d.E(p0Var)));
                } else {
                    bundle.putBundle("person", p0Var.c());
                }
            }
            String str = zVar.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zVar.f7842f;
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
        long j3 = this.f7840b;
        CharSequence charSequence2 = this.f7839a;
        p0 p0Var = this.f7841c;
        if (i10 >= 28) {
            if (p0Var != null) {
                person = b5.d.E(p0Var);
            }
            a2 = y.b(charSequence2, j3, person);
        } else {
            if (p0Var != null) {
                charSequence = p0Var.f7806a;
            }
            a2 = x.a(charSequence2, j3, charSequence);
        }
        String str = this.e;
        if (str != null) {
            x.b(a2, str, this.f7842f);
        }
        return a2;
    }
}
