package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public abstract class i5 {
    public static boolean a;

    public static boolean a(int i, TLRPC.User user) {
        String p;
        if (user != null && (p = lbc.p(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(uc7.s1(i).l4.h3.f);
                if (matcher.find()) {
                    if (p.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i) {
        vnb vnbVar;
        if (!a && yac.t0 == i) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            if (context == null) {
                return;
            }
            e S = LaunchActivity.S();
            if (S != null) {
                vnbVar = S.getResourceProvider();
            } else {
                vnbVar = null;
            }
            c(i, vnbVar, context);
        }
    }

    public static void c(int i, vnb vnbVar, Context context) {
        if (a) {
            return;
        }
        nx0 h = uh9.h(1, vnbVar, context, false);
        bf7 bf7Var = new bf7(i, context, r5, (byte) 1);
        LinearLayout j = uh9.j(context, 1);
        j.setPadding(hl.L(16.0f), hl.L(20.0f), hl.L(16.0f), hl.L(8.0f));
        j.setClipChildren(false);
        j.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(2131624088, hl.L(115.0f), hl.L(115.0f), null);
        imageView.d();
        j.addView((View) imageView, tre.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        ik8.v(textView, 1, 20.0f);
        ik8.x(textView, aob.G6, vnbVar, null, 2131754691);
        textView.setGravity(17);
        j.addView(textView, tre.t(-1, -2, 17, 0, 0, 0, 23));
        k74 k74Var = new k74(1, vnbVar, context);
        k74Var.a(2131232073, ob6.M0(2131754702, null), ob6.M0(2131754703, null));
        j.addView(k74Var, tre.t(-1, -2, 17, 0, 0, 0, 0));
        k74 k74Var2 = new k74(1, vnbVar, context);
        k74Var2.a(2131231864, ob6.M0(2131754700, null), ob6.M0(2131754701, null));
        j.addView(k74Var2, tre.t(-1, -2, 17, 0, 0, 0, 0));
        k74 k74Var3 = new k74(1, vnbVar, context);
        k74Var3.a(2131231807, ob6.M0(2131754698, null), hl.N2(ob6.a0(null, null, 2131754699, ob6.f0(uc7.s1(i).l4.g3.f())), -1, 0, new c1(bf7Var, (byte) 2), null));
        j.addView(k74Var3, tre.t(-1, -2, 17, 0, 0, 0, 0));
        c51 c51Var = new c51(vnbVar, context, true);
        c51Var.i(ob6.M0(2131754693, null), false, true);
        c51Var.setOnClickListener(new k1(bf7Var, (byte) 1));
        j.addView(c51Var, tre.t(-1, 48, 7, 0, 13, 0, 4));
        c51 c51Var2 = new c51(vnbVar, context, false);
        c51Var2.i(ob6.M0(2131754692, null), false, true);
        c51Var2.setOnClickListener(new g5(r5, (byte) 0));
        j.addView(c51Var2, tre.t(-1, 48, 7, 0, 0, 0, 0));
        h.O = j;
        nx0[] nx0VarArr = {h};
        h.T0 = false;
        h.J();
        a = true;
        nx0VarArr[0].show();
        nx0VarArr[0].setOnDismissListener(new h5((byte) 0));
    }
}
