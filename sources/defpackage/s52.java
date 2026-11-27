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
public final class s52 extends p79 implements yi5 {
    public Drawable a;
    public final Path b = new Path();
    public final Drawable c;
    public final i52 d;
    public final ChatAttachAlertPhotoLayout e;

    public s52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, i52 i52Var) {
        this.e = chatAttachAlertPhotoLayout;
        this.d = i52Var;
        this.c = chatAttachAlertPhotoLayout.getContext().getResources().getDrawable(2131230927).mutate();
    }

    @Override
    public final void a(qeb qebVar, RectF rectF) {
        h(null, this.d, qebVar, rectF);
    }

    @Override
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        h(canvas, recyclerView, null, null);
    }

    @Override
    public final void g(Canvas canvas, RectF rectF) {
        h(canvas, this.d, null, rectF);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView, qeb qebVar, RectF rectF) {
        int top;
        r52 r52Var;
        boolean z;
        boolean z2;
        boolean z3;
        r52 r52Var2;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.e;
        if (!chatAttachAlertPhotoLayout.e0 && !chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.H.e && !chatAttachAlertPhotoLayout.P0 && !chatAttachAlertPhotoLayout.Q0) {
            f89 L = recyclerView.L(0);
            if (L != null) {
                top = L.a.getTop();
            } else {
                L = recyclerView.L(chatAttachAlertPhotoLayout.N0);
                if (L != null) {
                    top = (L.a.getTop() - hl.L(2.0f)) - chatAttachAlertPhotoLayout.L0;
                } else if (qebVar != null) {
                    qebVar.b = true;
                    return;
                } else {
                    return;
                }
            }
            int left = L.a.getLeft();
            int i = chatAttachAlertPhotoLayout.L0;
            int i2 = left + i;
            int L2 = hl.L(2.0f) + (i << 1) + top;
            if (qebVar != null) {
                qebVar.a(left);
                qebVar.a(top);
                qebVar.a(i2);
                qebVar.a(L2);
            }
            if (rectF == null || rectF.intersects(left, top, i2, L2)) {
                Drawable drawable = this.c;
                if (qebVar != null) {
                    if (this.a != null && ((r52Var2 = chatAttachAlertPhotoLayout.Q) == null || !r52Var2.isInited() || chatAttachAlertPhotoLayout.O)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    qebVar.b(z);
                    if (chatAttachAlertPhotoLayout.Q != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    qebVar.b(z2);
                    if (drawable != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    qebVar.b(z3);
                }
                if (canvas != null) {
                    float L3 = hl.L(16.0f);
                    Path path = this.b;
                    path.rewind();
                    float f = left;
                    float f2 = top;
                    path.addRoundRect(f, f2, i2 + L3, L2 + L3, L3, L3, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    if (this.a != null && ((r52Var = chatAttachAlertPhotoLayout.Q) == null || !r52Var.isInited() || chatAttachAlertPhotoLayout.O)) {
                        this.a.setBounds(left, top, i2, L2);
                        this.a.draw(canvas);
                    }
                    r52 r52Var3 = chatAttachAlertPhotoLayout.Q;
                    if (r52Var3 != null) {
                        r52Var3.b = true;
                        canvas.save();
                        canvas.clipRect(left, top, i2, L2);
                        canvas.translate(f, f2);
                        chatAttachAlertPhotoLayout.Q.draw(canvas);
                        canvas.restore();
                        chatAttachAlertPhotoLayout.Q.b = false;
                    }
                    if (drawable != null) {
                        int L4 = hl.L(24.0f);
                        int x = qu6.x(7.0f, i2, L4);
                        int L5 = hl.L(7.0f) + top;
                        drawable.setBounds(x, L5, x + L4, L4 + L5);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                    chatAttachAlertPhotoLayout.F.invalidate();
                }
            }
        } else if (qebVar != null) {
            qebVar.b = true;
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
        i52 i52Var = chatAttachAlertPhotoLayout.F;
        if (i52Var != null) {
            i52Var.invalidate();
        }
    }
}
