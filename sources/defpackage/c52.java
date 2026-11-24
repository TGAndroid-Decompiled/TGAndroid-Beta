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
public final class c52 extends c49 implements wg5 {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final s42 d;
    public final ChatAttachAlertPhotoLayout e;

    public c52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, s42 s42Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = s42Var;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230927).mutate();
    }

    @Override
    public final void a(tab tabVar, RectF rectF) {
        h(null, this.d, tabVar, rectF);
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    @Override
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, tab tabVar, RectF rectF) {
        int top;
        b52 b52Var;
        boolean z;
        boolean z2;
        boolean z3;
        b52 b52Var2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.e0 && !chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.H.e && !chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.Q0) {
            s49 K = recyclerView.K(0);
            if (K != null) {
                top = K.a.getTop();
            } else {
                K = recyclerView.K(chatAttachAlertPhotoLayout.N0);
                if (K != null) {
                    top = (K.a.getTop() - gl.L(2.0f)) - chatAttachAlertPhotoLayout.L0;
                } else if (tabVar != null) {
                    tabVar.b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = K.a.getLeft();
            int i = chatAttachAlertPhotoLayout.L0;
            int i2 = left + i;
            int L = gl.L(2.0f) + (i << 1) + top;
            if (tabVar != null) {
                tabVar.a(left);
                tabVar.a(top);
                tabVar.a(i2);
                tabVar.a(L);
            }
            if (rectF == null || rectF.intersects(left, top, i2, L)) {
                Drawable drawable = this.c;
                if (tabVar != null) {
                    if (this.a != null && ((b52Var2 = chatAttachAlertPhotoLayout.Q) == null || !b52Var2.isInited() || chatAttachAlertPhotoLayout.O)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    tabVar.b(z);
                    if (chatAttachAlertPhotoLayout.Q != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    tabVar.b(z2);
                    if (drawable != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    tabVar.b(z3);
                }
                if (canvas != null) {
                    float L2 = gl.L(16.0f);
                    Path path = this.b;
                    path.rewind();
                    float f = left;
                    float f2 = top;
                    path.addRoundRect(f, f2, i2 + L2, L + L2, L2, L2, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.a != null && ((b52Var = chatAttachAlertPhotoLayout.Q) == null || !b52Var.isInited() || chatAttachAlertPhotoLayout.O)) {
                        this.a.setBounds(left, top, i2, L);
                        this.a.draw(canvas);
                    }
                    b52 b52Var3 = chatAttachAlertPhotoLayout.Q;
                    if (b52Var3 != null) {
                        b52Var3.b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i2, L);
                        canvas.translate(f, f2);
                        chatAttachAlertPhotoLayout.Q.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.Q.b = false;
                    }
                    if (drawable != null) {
                        int L3 = gl.L(24.0f);
                        int x = ls6.x(7.0f, i2, L3);
                        int L4 = gl.L(7.0f) + top;
                        drawable.setBounds(x, L4, x + L3, L3 + L4);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.F.invalidate();
                }
            }
        } else if (tabVar != null) {
            tabVar.b = true;
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
            this.a = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131231495).mutate();
        }
        s42 s42Var = chatAttachAlertPhotoLayout.F;
        if (s42Var != null) {
            s42Var.invalidate();
        }
    }
}
