package o6;

import java.util.ArrayList;

public final class c {

    public final ArrayList f19355a;

    public c(int i10) {
        switch (i10) {
            case 1:
                this.f19355a = new ArrayList();
                break;
            default:
                this.f19355a = new ArrayList();
                new ArrayList();
                new ArrayList();
                break;
        }
    }

    public void a(StringBuilder sb2) {
        sb2.append(((Boolean) com.google.android.recaptcha.internal.a.k(1, this.f19355a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public void b(StringBuilder sb2) {
        while (!this.f19355a.isEmpty()) {
            a(sb2);
        }
    }
}
