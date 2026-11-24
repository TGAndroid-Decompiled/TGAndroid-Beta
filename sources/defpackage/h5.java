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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class h5 {
    public static boolean a;

    public static boolean a(int i, TLRPC.User user) {
        String p;
        if (user != null && (p = m9c.p(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(oc7.r1(i).l4.Z2.f);
                if (matcher.find()) {
                    if (p.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i) {
        ylb ylbVar;
        if (!a && z8c.t0 == i) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            if (context == null) {
                return;
            }
            d S = LaunchActivity.S();
            if (S != null) {
                ylbVar = S.getResourceProvider();
            } else {
                ylbVar = null;
            }
            c(i, ylbVar, context);
        }
    }

    public static void c(int i, ylb ylbVar, Context context) {
        if (a) {
            return;
        }
        my0 h = hg9.h(1, ylbVar, context, false);
        wc7 wc7Var = new wc7(i, context, r5, (byte) 1);
        LinearLayout i2 = hg9.i(context, 1);
        i2.setPadding(gm.L(16.0f), gm.L(20.0f), gm.L(16.0f), gm.L(8.0f));
        i2.setClipChildren(false);
        i2.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(2131624088, gm.L(115.0f), gm.L(115.0f), null);
        imageView.d();
        i2.addView((View) imageView, qoe.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 20.0f);
        wi8.x(textView, cmb.F6, ylbVar, null, 2131754695);
        textView.setGravity(17);
        i2.addView(textView, qoe.t(-1, -2, 17, 0, 0, 0, 23));
        z74 z74Var = new z74(1, ylbVar, context);
        z74Var.a(2131232074, jb6.M0(2131754706, null), jb6.M0(2131754707, null));
        i2.addView(z74Var, qoe.t(-1, -2, 17, 0, 0, 0, 0));
        z74 z74Var2 = new z74(1, ylbVar, context);
        z74Var2.a(2131231865, jb6.M0(2131754704, null), jb6.M0(2131754705, null));
        i2.addView(z74Var2, qoe.t(-1, -2, 17, 0, 0, 0, 0));
        z74 z74Var3 = new z74(1, ylbVar, context);
        z74Var3.a(2131231808, jb6.M0(2131754702, null), gm.N2(jb6.a0(null, null, 2131754703, jb6.f0(oc7.r1(i).l4.Y2.f())), -1, 0, new b1(wc7Var, (byte) 2), null));
        i2.addView(z74Var3, qoe.t(-1, -2, 17, 0, 0, 0, 0));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.i(jb6.M0(2131754697, null), false, true);
        b61Var.setOnClickListener(new j1(wc7Var, (byte) 1));
        i2.addView(b61Var, qoe.t(-1, 48, 7, 0, 13, 0, 4));
        b61 b61Var2 = new b61(ylbVar, context, false);
        b61Var2.i(jb6.M0(2131754696, null), false, true);
        b61Var2.setOnClickListener(new f5(r5, (byte) 0));
        i2.addView(b61Var2, qoe.t(-1, 48, 7, 0, 0, 0, 0));
        h.O = i2;
        my0[] my0VarArr = {h};
        h.T0 = false;
        h.J();
        a = true;
        my0VarArr[0].show();
        my0VarArr[0].setOnDismissListener(new g5((byte) 0));
    }
}
