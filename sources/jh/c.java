package jh;

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
import org.telegram.messenger.b8;
import org.telegram.messenger.i0;
import org.telegram.messenger.kj;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.RadialProgress2;
public final class c extends ih.f {
    public final String f10400b;
    public final Uri f10401c;
    public final String d;
    public final long e;
    public final String f10402f;
    public final Drawable h;
    public final StaticLayout f10403n;

    public c(String str) {
        long j10;
        this.f10400b = str;
        this.f10401c = null;
        File file = new File(str);
        try {
            j10 = file.length();
        } catch (Throwable unused) {
            j10 = 0;
        }
        this.e = j10;
        String name = file.getName();
        this.d = name;
        String[] split = name.split("\\.");
        String str2 = split.length > 1 ? split[split.length - 1] : "?";
        this.f10402f = str2;
        int m12 = i0.m1(name, false);
        if (m12 != 0) {
            this.h = w0.f18945b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(i0.L(13.0f));
            textPaint.setTypeface(i0.o());
            textPaint.setColor(t6.x0(null, t6.pj, false));
            this.f10403n = new StaticLayout(TextUtils.ellipsize(str2, textPaint, i0.L(34.0f), TextUtils.TruncateAt.END), textPaint, i0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f10403n = null;
    }

    public static b d(View view, String str, String str2, TLRPC.Document document, kj kjVar) {
        b bVar = new b();
        bVar.f10390a.setColor(t6.x0(null, t6.G6, false));
        bVar.f10391b.setColor(t6.x0(null, t6.f21312y6, false));
        bVar.d = true;
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        bVar.f10392c = radialProgress2;
        radialProgress2.setCircleRadius(i0.L(21.0f));
        bVar.f10392c.g(t6.We, t6.Xe, t6.f21027id, t6.f21046jd);
        if (kj.J3(document)) {
            if (kj.W2(document)) {
                TLRPC.PhotoSize w9 = b8.w(document.thumbs, i0.L(22.0f), true, null, false);
                bVar.f10392c.j(b8.w(document.thumbs, i0.L(44.0f), true, w9, true), w9, document, kjVar);
            } else {
                String t02 = kj.t0(document, true);
                if (!TextUtils.isEmpty(t02)) {
                    bVar.f10392c.h(t02);
                } else {
                    bVar.f10392c.i(null, null, null);
                }
            }
            bVar.f10392c.setIcon(0, false, false);
        } else {
            bVar.f10392c.setIcon(5, false, false);
        }
        if (str == null) {
            str = "";
        }
        bVar.e = str;
        if (str2 == null) {
            str2 = "";
        }
        bVar.f10393f = str2;
        bVar.f10399m = -1;
        bVar.f10394g = null;
        bVar.h = null;
        bVar.invalidateSelf();
        view.addOnAttachStateChangeListener(new a(bVar));
        return bVar;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        Drawable drawable = this.h;
        if (drawable != null) {
            drawable.setBounds(0, 0, i10, i11);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate((i10 - i0.L(34.0f)) / 2.0f, i0.L(15.0f));
            this.f10403n.draw(canvas);
            canvas.restore();
        }
    }

    public c(Uri uri) {
        this.f10400b = null;
        this.f10401c = uri;
        String A = MediaController.A(uri);
        A = A == null ? "?" : A;
        this.d = A;
        String[] split = A.split("\\.");
        String str = split.length > 1 ? split[split.length - 1] : "?";
        this.f10402f = str;
        this.e = 0L;
        int m12 = i0.m1(A, false);
        if (m12 != 0) {
            this.h = w0.f18945b.getResources().getDrawable(m12);
        } else {
            this.h = null;
        }
        if (!TextUtils.isEmpty(str)) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(i0.L(13.0f));
            textPaint.setTypeface(i0.o());
            textPaint.setColor(t6.x0(null, t6.pj, false));
            this.f10403n = new StaticLayout(TextUtils.ellipsize(str, textPaint, i0.L(34.0f), TextUtils.TruncateAt.END), textPaint, i0.L(34.0f), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            return;
        }
        this.f10403n = null;
    }
}
