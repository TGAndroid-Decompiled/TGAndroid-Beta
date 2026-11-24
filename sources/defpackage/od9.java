package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_iv;
public final class od9 implements Runnable {
    public final byte a;
    public final wi9 b;

    public od9(wi9 wi9Var, byte b) {
        this.a = b;
        this.b = wi9Var;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.w();
                return;
            default:
                wi9 wi9Var = this.b;
                wi9Var.H = null;
                lk0 lk0Var = wi9Var.y;
                if (lk0Var != null) {
                    TL_iv.PageBlock pageBlock = lk0Var.b;
                    if ((pageBlock instanceof TL_iv.pageBlockPreformatted) && !TextUtils.isEmpty(((TL_iv.pageBlockPreformatted) pageBlock).language)) {
                        String obj = wi9Var.f.getText().toString();
                        if (!obj.equals(wi9Var.I)) {
                            lk0 lk0Var2 = wi9Var.y;
                            String str = ((TL_iv.pageBlockPreformatted) lk0Var2.b).language;
                            int i = wi9Var.J + 1;
                            wi9Var.J = i;
                            go2 go2Var = new go2(wi9Var, i, lk0Var2, obj, (byte) 5);
                            jj8 jj8Var = qj2.a;
                            SpannableString spannableString = new SpannableString(obj);
                            String b = jj8.b(str);
                            if (!b.isEmpty() && spannableString.length() != 0) {
                                qj2.a.d(spannableString.toString(), b, new v82(spannableString, go2Var, (byte) 6));
                                return;
                            } else {
                                gl.d3(new n92(go2Var, spannableString, (byte) 21));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
