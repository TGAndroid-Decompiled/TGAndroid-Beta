package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class qf8 extends nf8 {
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;
    public final String f;
    public final Drawable h;
    public final StaticLayout n;

    public qf8(String str) {
        long j;
        String str2;
        this.b = str;
        this.c = null;
        File file = new File(str);
        try {
            j = file.length();
        } catch (Throwable unused) {
            j = 0;
        }
        this.e = j;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        if (split.length > 1) {
            str2 = split[split.length - 1];
        } else {
            str2 = "?";
        }
        this.f = str2;
        int l1 = gm.l1(name, false);
        if (l1 != 0) {
            this.h = a.b.getResources().getDrawable(l1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            hg9.o(textPaint, gm.L(13.0f));
            textPaint.setColor(cmb.w0(null, cmb.rj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, gm.L(34.0f), TextUtils.TruncateAt.END), textPaint, gm.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }

    public static pf8 d(View view, String str, String str2, TLRPC.Document document, k47 k47Var) {
        pf8 pf8Var = new pf8();
        pf8Var.a.setColor(cmb.w0(null, cmb.F6, false));
        pf8Var.b.setColor(cmb.w0(null, cmb.x6, false));
        pf8Var.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        pf8Var.c = radialProgress2;
        radialProgress2.setCircleRadius(gm.L(21.0f));
        pf8Var.c.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
        if (k47.J3(document)) {
            if (k47.W2(document)) {
                TLRPC.PhotoSize w = bc4.w(document.thumbs, gm.L(22.0f), true, null, false);
                pf8Var.c.j(bc4.w(document.thumbs, gm.L(44.0f), true, w, true), w, document, k47Var);
            } else {
                String t0 = k47.t0(document, true);
                boolean isEmpty = TextUtils.isEmpty(t0);
                RadialProgress2 radialProgress22 = pf8Var.c;
                if (!isEmpty) {
                    radialProgress22.h(t0);
                } else {
                    radialProgress22.i(null, null, null);
                }
            }
            pf8Var.c.setIcon(0, false, false);
        } else {
            pf8Var.c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        pf8Var.e = str;
        pf8Var.f = str2;
        pf8Var.m = -1;
        pf8Var.g = null;
        pf8Var.h = null;
        pf8Var.invalidateSelf();
        view.addOnAttachStateChangeListener(new of8(pf8Var));
        return pf8Var;
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i - gm.L(34.0f)) / 2.0f, gm.L(15.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public qf8(Uri uri) {
        this.b = null;
        this.c = uri;
        String v = MediaController.v(uri);
        this.d = v;
        String[] split = v.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str;
        this.e = 0L;
        int l1 = gm.l1(v, false);
        if (l1 != 0) {
            this.h = a.b.getResources().getDrawable(l1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            hg9.o(textPaint, gm.L(13.0f));
            textPaint.setColor(cmb.w0(null, cmb.rj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str, textPaint, gm.L(34.0f), TextUtils.TruncateAt.END), textPaint, gm.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }
}
