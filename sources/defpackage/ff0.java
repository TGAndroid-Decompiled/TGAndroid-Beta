package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ff0 implements Runnable {
    public final byte a;
    public final ylb b;
    public final Context c;

    public ff0(gl3 gl3Var, ylb ylbVar, Context context) {
        this.a = (byte) 1;
        this.b = ylbVar;
        this.c = context;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ylb ylbVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                new exa(context, ylbVar).show();
                return;
            case 1:
                he[] heVarArr = new he[1];
                SpannableStringBuilder Q2 = gm.Q2(gm.H2(jb6.M0(2131754140, null), ylbVar, new wi0(heVarArr, (byte) 8)));
                Matcher matcher = Pattern.compile("@([a-zA-Z0-9_-]+)").matcher(Q2);
                while (matcher.find()) {
                    Q2.setSpan(new tl(heVarArr, context, matcher.group(1)), matcher.start(), matcher.end(), 33);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
                String M0 = jb6.M0(2131754139, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = Q2;
                alertDialog$Builder.j(jb6.M0(2131754141, null), null);
                heVarArr[0] = alertDialog$Builder.o();
                return;
            default:
                goc.L0(context, ylbVar);
                return;
        }
    }

    public ff0(Context context, ylb ylbVar, byte b) {
        this.a = b;
        this.c = context;
        this.b = ylbVar;
    }
}
