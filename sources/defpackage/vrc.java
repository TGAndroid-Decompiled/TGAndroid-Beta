package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
public final class vrc implements OnFailureListener {
    public final byte a;
    public final u41 b;

    public vrc(u41 u41Var, byte b) {
        this.a = b;
        this.b = u41Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        byte b = this.a;
        u41 u41Var = this.b;
        switch (b) {
            case 0:
                fa4.d("wear-auth: /answer send failed: " + exc.getMessage());
                u41Var.setLoading(false);
                return;
            default:
                fa4.d("wear-auth: /token send failed: " + exc.getMessage());
                u41Var.setLoading(false);
                return;
        }
    }
}
