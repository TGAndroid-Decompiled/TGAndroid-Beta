package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
public final class el7 {
    public final CharSequence a;
    public final long b;
    public final l38 c;
    public final Bundle d = new Bundle();
    public String e;
    public Uri f;

    public el7(CharSequence charSequence, long j, l38 l38Var) {
        this.a = charSequence;
        this.b = j;
        this.c = l38Var;
    }

    public static Bundle[] a(ArrayList arrayList) {
        Bundle[] bundleArr = new Bundle[arrayList.size()];
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            el7 el7Var = (el7) arrayList.get(i);
            l38 l38Var = el7Var.c;
            Bundle bundle = new Bundle();
            CharSequence charSequence = el7Var.a;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", el7Var.b);
            bundle.putCharSequence("sender", l38Var.a);
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("sender_person", dl7.a(fo.G(l38Var)));
            } else {
                bundle.putBundle("person", l38Var.b());
            }
            String str = el7Var.e;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = el7Var.f;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", el7Var.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    public final Notification.MessagingStyle.Message b() {
        Notification.MessagingStyle.Message a;
        int i = Build.VERSION.SDK_INT;
        long j = this.b;
        l38 l38Var = this.c;
        CharSequence charSequence = this.a;
        if (i >= 28) {
            a = dl7.b(charSequence, j, fo.G(l38Var));
        } else {
            a = cl7.a(charSequence, j, l38Var.a);
        }
        String str = this.e;
        if (str != null) {
            cl7.b(a, str, this.f);
        }
        return a;
    }
}
