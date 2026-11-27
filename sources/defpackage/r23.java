package defpackage;

import org.json.JSONException;
public final class r23 implements Runnable {
    public final byte a;
    public final v23 b;
    public final JSONException c;

    public r23(v23 v23Var, JSONException jSONException, byte b) {
        this.a = b;
        this.b = v23Var;
        this.c = jSONException;
    }

    @Override
    public final void run() {
        s13 s13Var;
        byte b = this.a;
        JSONException jSONException = this.c;
        v23 v23Var = this.b;
        switch (b) {
            case 0:
                h23 h23Var = v23Var.f;
                if (h23Var != null) {
                    h23Var.B(new s13(new i1((byte) 4), jSONException.getMessage()));
                    return;
                } else {
                    ur5.e("callback");
                    throw null;
                }
            default:
                h23 h23Var2 = v23Var.f;
                if (h23Var2 != null) {
                    String message = jSONException.getMessage();
                    if (message != null && message.length() > 0) {
                        s13Var = new s13(new i1((byte) 4), message);
                    } else {
                        s13Var = new s13(new i1((byte) 4), "Unknown error");
                    }
                    h23Var2.B(s13Var);
                    return;
                }
                ur5.e("callback");
                throw null;
        }
    }
}
