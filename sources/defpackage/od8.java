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
public final class od8 extends ld8 {
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;
    public final String f;
    public final Drawable h;
    public final StaticLayout n;

    public od8(String str) {
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
        int l1 = gl.l1(name, false);
        if (l1 != 0) {
            this.h = a.b.getResources().getDrawable(l1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            de9.p(textPaint, gl.L(13.0f));
            textPaint.setColor(bkb.w0(null, bkb.rj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, gl.L(34.0f), TextUtils.TruncateAt.END), textPaint, gl.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }

    public static nd8 d(View view, String str, String str2, TLRPC.Document document, k27 k27Var) {
        nd8 nd8Var = new nd8();
        nd8Var.a.setColor(bkb.w0(null, bkb.F6, false));
        nd8Var.b.setColor(bkb.w0(null, bkb.x6, false));
        nd8Var.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        nd8Var.c = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(21.0f));
        nd8Var.c.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        if (k27.J3(document)) {
            if (k27.W2(document)) {
                TLRPC.PhotoSize w = ba4.w(document.thumbs, gl.L(22.0f), true, null, false);
                nd8Var.c.j(ba4.w(document.thumbs, gl.L(44.0f), true, w, true), w, document, k27Var);
            } else {
                String t0 = k27.t0(document, true);
                boolean isEmpty = TextUtils.isEmpty(t0);
                RadialProgress2 radialProgress22 = nd8Var.c;
                if (!isEmpty) {
                    radialProgress22.h(t0);
                } else {
                    radialProgress22.i(null, null, null);
                }
            }
            nd8Var.c.setIcon(0, false, false);
        } else {
            nd8Var.c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        nd8Var.e = str;
        nd8Var.f = str2;
        nd8Var.m = -1;
        nd8Var.g = null;
        nd8Var.h = null;
        nd8Var.invalidateSelf();
        view.addOnAttachStateChangeListener(new md8(nd8Var));
        return nd8Var;
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i - gl.L(34.0f)) / 2.0f, gl.L(15.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public od8(Uri uri) {
        this.b = null;
        this.c = uri;
        String v = MediaController.v(uri);
        this.d = v;
        String[] split = v.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str;
        this.e = 0L;
        int l1 = gl.l1(v, false);
        if (l1 != 0) {
            this.h = a.b.getResources().getDrawable(l1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            de9.p(textPaint, gl.L(13.0f));
            textPaint.setColor(bkb.w0(null, bkb.rj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str, textPaint, gl.L(34.0f), TextUtils.TruncateAt.END), textPaint, gl.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }
}
