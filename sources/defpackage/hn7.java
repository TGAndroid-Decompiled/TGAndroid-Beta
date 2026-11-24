package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class hn7 {
    public final CharSequence a;
    public final long b;
    public final n58 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public hn7(CharSequence charSequence, long j, n58 n58Var) {
        this.a = charSequence;
        this.b = j;
        this.c = n58Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hn7 hn7Var = (hn7) arrayList.get(i);
            n58 n58Var = hn7Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = hn7Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", hn7Var.b);
            bundle.putCharSequence("sender", n58Var.a);
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("sender_person", gn7.a(fp.G(n58Var)));
            } else {
                bundle.putBundle("person", n58Var.b());
            }
            String str = hn7Var.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = hn7Var.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", hn7Var.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        n58 n58Var = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            a = gn7.b(charSequence, j, fp.G(n58Var));
        } else {
            a = fn7.a(charSequence, j, n58Var.a);
        }
        String str = this.e;
        if (str != null) {
            fn7.b(a, str, this.f);
        }
        return a;
    }
}
