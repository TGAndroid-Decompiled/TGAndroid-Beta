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
public final class ch8 extends zg8 {
    public final String b;
    public final Uri c;
    public final String d;
    public final long e;
    public final String f;
    public final Drawable h;
    public final StaticLayout n;

    public ch8(String str) {
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
        int l1 = hl.l1(name, false);
        if (l1 != 0) {
            this.h = a.b.getResources().getDrawable(l1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            uh9.p(textPaint, hl.L(13.0f));
            textPaint.setColor(aob.w0(null, aob.sj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, hl.L(34.0f), TextUtils.TruncateAt.END), textPaint, hl.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }

    public static bh8 d(View view, String str, String str2, TLRPC.Document document, r47 r47Var) {
        bh8 bh8Var = new bh8();
        bh8Var.a.setColor(aob.w0(null, aob.G6, false));
        bh8Var.b.setColor(aob.w0(null, aob.y6, false));
        bh8Var.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bh8Var.c = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(21.0f));
        bh8Var.c.g(aob.Ze, aob.af, aob.ld, aob.md);
        if (r47.J3(document)) {
            if (r47.W2(document)) {
                TLRPC.PhotoSize w = xb4.w(document.thumbs, hl.L(22.0f), true, null, false);
                bh8Var.c.j(xb4.w(document.thumbs, hl.L(44.0f), true, w, true), w, document, r47Var);
            } else {
                String t0 = r47.t0(document, true);
                boolean isEmpty = TextUtils.isEmpty(t0);
                RadialProgress2 radialProgress22 = bh8Var.c;
                if (!isEmpty) {
                    radialProgress22.h(t0);
                } else {
                    radialProgress22.i(null, null, null);
                }
            }
            bh8Var.c.setIcon(0, false, false);
        } else {
            bh8Var.c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bh8Var.e = str;
        bh8Var.f = str2;
        bh8Var.m = -1;
        bh8Var.g = null;
        bh8Var.h = null;
        bh8Var.invalidateSelf();
        view.addOnAttachStateChangeListener(new ah8(bh8Var));
        return bh8Var;
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i - hl.L(34.0f)) / 2.0f, hl.L(15.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public ch8(Uri uri) {
        this.b = null;
        this.c = uri;
        String y = MediaController.y(uri);
        this.d = y;
        String[] split = y.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f = str;
        this.e = 0L;
        int l1 = hl.l1(y, false);
        if (l1 != 0) {
            this.h = a.b.getResources().getDrawable(l1);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            uh9.p(textPaint, hl.L(13.0f));
            textPaint.setColor(aob.w0(null, aob.sj, false));
            this.n = new StaticLayout(TextUtils.ellipsize(str, textPaint, hl.L(34.0f), TextUtils.TruncateAt.END), textPaint, hl.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.n = null;
    }
}
