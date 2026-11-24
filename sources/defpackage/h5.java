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
        if (user != null && (p = l7c.p(user)) != null) {
            try {
                Matcher matcher = Pattern.compile("t\\.me/([a-zA-Z0-9]+)/?").matcher(na7.q1(i).k4.Z2.f);
                if (matcher.find()) {
                    if (p.equalsIgnoreCase(matcher.group(1))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return false;
            }
        }
        return false;
    }

    public static void b(int i) {
        wjb wjbVar;
        if (!a && y6c.t0 == i) {
            Context context = LaunchActivity.H1;
            if (context == null) {
                context = a.b;
            }
            if (context == null) {
                return;
            }
            d S = LaunchActivity.S();
            if (S != null) {
                wjbVar = S.getResourceProvider();
            } else {
                wjbVar = null;
            }
            c(i, wjbVar, context);
        }
    }

    public static void c(int i, wjb wjbVar, Context context) {
        if (a) {
            return;
        }
        fx0 h = de9.h(1, wjbVar, context, false);
        va7 va7Var = new va7(i, context, r5, (byte) 1);
        LinearLayout j = de9.j(context, 1);
        j.setPadding(gl.L(16.0f), gl.L(20.0f), gl.L(16.0f), gl.L(8.0f));
        j.setClipChildren(false);
        j.setClipToPadding(false);
        ?? imageView = new ImageView(context);
        imageView.f(2131624088, gl.L(115.0f), gl.L(115.0f), null);
        imageView.d();
        j.addView((View) imageView, nme.t(115, 115, 17, 0, 0, 0, 9));
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 20.0f);
        ug8.x(textView, bkb.F6, wjbVar, null, 2131754695);
        textView.setGravity(17);
        j.addView(textView, nme.t(-1, -2, 17, 0, 0, 0, 23));
        q64 q64Var = new q64(1, wjbVar, context);
        q64Var.a(2131232073, k96.M0(2131754706, null), k96.M0(2131754707, null));
        j.addView(q64Var, nme.t(-1, -2, 17, 0, 0, 0, 0));
        q64 q64Var2 = new q64(1, wjbVar, context);
        q64Var2.a(2131231864, k96.M0(2131754704, null), k96.M0(2131754705, null));
        j.addView(q64Var2, nme.t(-1, -2, 17, 0, 0, 0, 0));
        q64 q64Var3 = new q64(1, wjbVar, context);
        q64Var3.a(2131231807, k96.M0(2131754702, null), gl.N2(k96.a0(null, null, 2131754703, k96.f0(na7.q1(i).k4.Y2.f())), -1, 0, new b1(va7Var, (byte) 2), null));
        j.addView(q64Var3, nme.t(-1, -2, 17, 0, 0, 0, 0));
        u41 u41Var = new u41(wjbVar, context, true);
        u41Var.i(k96.M0(2131754697, null), false, true);
        u41Var.setOnClickListener(new j1(va7Var, (byte) 1));
        j.addView(u41Var, nme.t(-1, 48, 7, 0, 13, 0, 4));
        u41 u41Var2 = new u41(wjbVar, context, false);
        u41Var2.i(k96.M0(2131754696, null), false, true);
        u41Var2.setOnClickListener(new f5(r5, (byte) 0));
        j.addView(u41Var2, nme.t(-1, 48, 7, 0, 0, 0, 0));
        h.O = j;
        fx0[] fx0VarArr = {h};
        h.T0 = false;
        h.K();
        a = true;
        fx0VarArr[0].show();
        fx0VarArr[0].setOnDismissListener(new g5((byte) 0));
    }
}
