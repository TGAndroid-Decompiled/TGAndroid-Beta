package defpackage;

import org.json.JSONException;
public final class k33 implements Runnable {
    public final byte a;
    public final o33 b;
    public final JSONException c;

    public k33(o33 o33Var, JSONException jSONException, byte b) {
        this.a = b;
        this.b = o33Var;
        this.c = jSONException;
    }

    @Override
    public final void run() {
        l23 l23Var;
        byte b = this.a;
        JSONException jSONException = this.c;
        o33 o33Var = this.b;
        switch (b) {
            case 0:
                a33 a33Var = o33Var.f;
                if (a33Var != null) {
                    a33Var.A(new l23(new h1((byte) 4), jSONException.getMessage()));
                    return;
                } else {
                    rr5.e("callback");
                    throw null;
                }
            default:
                a33 a33Var2 = o33Var.f;
                if (a33Var2 != null) {
                    String message = jSONException.getMessage();
                    if (message != null && message.length() > 0) {
                        l23Var = new l23(new h1((byte) 4), message);
                    } else {
                        l23Var = new l23(new h1((byte) 4), "Unknown error");
                    }
                    a33Var2.A(l23Var);
                    return;
                }
                rr5.e("callback");
                throw null;
        }
    }
}
