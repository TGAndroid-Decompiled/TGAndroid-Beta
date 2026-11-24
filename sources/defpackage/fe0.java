package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fe0 implements Runnable {
    public final byte a;
    public final wjb b;
    public final Context c;

    public fe0(vj3 vj3Var, wjb wjbVar, Context context) {
        this.a = (byte) 1;
        this.b = wjbVar;
        this.c = context;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wjb wjbVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                new ava(context, wjbVar).show();
                return;
            case 1:
                hd[] hdVarArr = new hd[1];
                SpannableStringBuilder R2 = gl.R2(gl.I2(k96.M0(2131754172, null), wjbVar, new wh0(hdVarArr, (byte) 8)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(R2);
                while (matcher.find()) {
                    R2.setSpan(new tk(hdVarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
                String M0 = k96.M0(2131754171, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = R2;
                alertDialog$Builder.j(k96.M0(2131754173, null), null);
                hdVarArr[0] = alertDialog$Builder.o();
                return;
            default:
                hmc.K0(context, wjbVar);
                return;
        }
    }

    public fe0(Context context, wjb wjbVar, byte b) {
        this.a = b;
        this.c = context;
        this.b = wjbVar;
    }
}
