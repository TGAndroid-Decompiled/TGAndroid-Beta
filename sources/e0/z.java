package e0;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

public final class z {

    public final CharSequence f5141a;

    public final long f5142b;

    public final p0 f5143c;
    public final Bundle d = new Bundle();

    public String f5144e;

    public Uri f5145f;

    public z(CharSequence charSequence, long j10, p0 p0Var) {
        this.f5141a = charSequence;
        this.f5142b = j10;
        this.f5143c = p0Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            z zVar = (z) arrayList.get(i10);
            p0 p0Var = zVar.f5143c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = zVar.f5141a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", zVar.f5142b);
            if (p0Var != null) {
                bundle.putCharSequence("sender", p0Var.f5106a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", y.a(d1.f.D(p0Var)));
                } else {
                    bundle.putBundle("person", p0Var.c());
                }
            }
            String str = zVar.f5144e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = zVar.f5145f;
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
        Notification.MessagingStyle.Message messageA;
        int i10 = Build.VERSION.SDK_INT;
        long j10 = this.f5142b;
        CharSequence charSequence = this.f5141a;
        p0 p0Var = this.f5143c;
        if (i10 >= 28) {
            messageA = y.b(charSequence, j10, p0Var != null ? d1.f.D(p0Var) : null);
        } else {
            messageA = x.a(charSequence, j10, p0Var != null ? p0Var.f5106a : null);
        }
        String str = this.f5144e;
        if (str != null) {
            x.b(messageA, str, this.f5145f);
        }
        return messageA;
    }
}
