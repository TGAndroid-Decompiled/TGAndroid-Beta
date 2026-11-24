package defpackage;

import org.json.JSONException;
public final class z13 implements Runnable {
    public final byte a;
    public final d23 b;
    public final JSONException c;

    public z13(d23 d23Var, JSONException jSONException, byte b) {
        this.a = b;
        this.b = d23Var;
        this.c = jSONException;
    }

    @Override
    public final void run() {
        z03 z03Var;
        byte b = this.a;
        JSONException jSONException = this.c;
        d23 d23Var = this.b;
        switch (b) {
            case 0:
                o13 o13Var = d23Var.f;
                if (o13Var != null) {
                    o13Var.L(new z03(new h1((byte) 4), jSONException.getMessage()));
                    return;
                } else {
                    rp5.e("callback");
                    throw null;
                }
            default:
                o13 o13Var2 = d23Var.f;
                if (o13Var2 != null) {
                    String message = jSONException.getMessage();
                    if (message != null && message.length() > 0) {
                        z03Var = new z03(new h1((byte) 4), message);
                    } else {
                        z03Var = new z03(new h1((byte) 4), "Unknown error");
                    }
                    o13Var2.L(z03Var);
                    return;
                }
                rp5.e("callback");
                throw null;
        }
    }
}
