package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
public final class lwc implements OnFailureListener {
    public final byte a;
    public final c51 b;

    public lwc(c51 c51Var, byte b) {
        this.a = b;
        this.b = c51Var;
    }

    @Override
    public final void onFailure(Exception exc) {
        byte b = this.a;
        c51 c51Var = this.b;
        switch (b) {
            case 0:
                cc4.d("wear-auth: /answer send failed: " + exc.getMessage());
                c51Var.setLoading(false);
                return;
            default:
                cc4.d("wear-auth: /token send failed: " + exc.getMessage());
                c51Var.setLoading(false);
                return;
        }
    }
}
