package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class n62 extends e69 implements vi5 {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final d62 d;
    public final ChatAttachAlertPhotoLayout e;

    public n62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, d62 d62Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = d62Var;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230928).mutate();
    }

    @Override
    public final void a(ucb ucbVar, RectF rectF) {
        h(null, this.d, ucbVar, rectF);
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, ucb ucbVar, RectF rectF) {
        int top;
        m62 m62Var;
        boolean z;
        boolean z2;
        boolean z3;
        m62 m62Var2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.e0 && !chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.H.e && !chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.Q0) {
            u69 K = recyclerView.K(0);
            if (K != null) {
                top = K.a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.N0);
                if (K != null) {
                    top = (K.a.getTop() - gm.L(2.0f)) - chatAttachAlertPhotoLayout.L0;
                } else if (ucbVar != null) {
                    ucbVar.b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.a.getLeft();
            int i = chatAttachAlertPhotoLayout.L0;
            int i2 = left + i;
            int L = gm.L(2.0f) + (i << 1) + top;
            if (ucbVar != null) {
                ucbVar.a(left);
                ucbVar.a(top);
                ucbVar.a(i2);
                ucbVar.a(L);
            }
            if (rectF == null || rectF.intersects(left, top, i2, L)) {
                Drawable drawable = this.c;
                if (ucbVar != null) {
                    if (this.a != null && ((m62Var2 = chatAttachAlertPhotoLayout.Q) == null || !m62Var2.isInited() || chatAttachAlertPhotoLayout.O)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ucbVar.b(z);
                    if (chatAttachAlertPhotoLayout.Q != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ucbVar.b(z2);
                    if (drawable != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ucbVar.b(z3);
                }
                if (canvas != null) {
                    float L2 = gm.L(16.0f);
                    Path path = this.b;
                    path.rewind();
                    float f = left;
                    float f2 = top;
                    path.addRoundRect(f, f2, i2 + L2, L + L2, L2, L2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.a != null && ((m62Var = chatAttachAlertPhotoLayout.Q) == null || !m62Var.isInited() || chatAttachAlertPhotoLayout.O)) {
                        this.a.setBounds(left, top, i2, L);
                        this.a.draw(canvas);
                    }
                    m62 m62Var3 = chatAttachAlertPhotoLayout.Q;
                    if (m62Var3 != null) {
                        m62Var3.b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i2, L);
                        canvas.translate(f, f2);
                        chatAttachAlertPhotoLayout.Q.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.Q.b = false;
                    }
                    if (drawable != null) {
                        int L3 = gm.L(24.0f);
                        int y = kt6.y(7.0f, i2, L3);
                        int L4 = gm.L(7.0f) + top;
                        drawable.setBounds(y, L4, y + L3, L3 + L4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.F.invalidate();
                }
            }
        } else if (ucbVar != null) {
            ucbVar.b = true;
        }
    }

    public final void i() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(a.h(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (bitmap != null) {
            this.a = new BitmapDrawable(chatAttachAlertPhotoLayout.getContext().getResources(), bitmap);
        } else {
            this.a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131231496).mutate();
        }
        d62 d62Var = chatAttachAlertPhotoLayout.F;
        if (d62Var != null) {
            d62Var.invalidate();
        }
    }
}
