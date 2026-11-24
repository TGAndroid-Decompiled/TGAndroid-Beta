package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
public final class ytc implements OnFailureListener {
    public final byte a;
    public final b61 b;

    public ytc(b61 b61Var, byte b) {
        this.a = b;
        this.b = b61Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        byte b = this.a;
        b61 b61Var = this.b;
        switch (b) {
            case 0:
                fc4.d("wear-auth: /answer send failed: " + exc.getMessage());
                b61Var.setLoading(false);
                return;
            default:
                fc4.d("wear-auth: /token send failed: " + exc.getMessage());
                b61Var.setLoading(false);
                return;
        }
    }
}
