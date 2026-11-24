package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class o65 implements s09 {
    public final Path a = new Path();
    public final Paint b;
    public final h75 c;

    public o65(h75 h75Var) {
        this.c = h75Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void q(View view, h19 h19Var, boolean z, boolean z2) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = h19Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j = h19Var.g;
        if (j != 0) {
            tL_messageEntityCustomEmoji.document_id = j;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        h75 h75Var = this.c;
        h75Var.t1(tL_textWithEntities);
        o55 o55Var = h75Var.A1;
        if (o55Var.m()) {
            o55Var.j();
        } else {
            o55Var.d();
        }
        m43 reactionsWindow = h75Var.D1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.q) {
            h75Var.D1.getReactionsWindow().e();
            h75Var.D1.k();
        }
    }

    @Override
    public final boolean r() {
        return false;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void x(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        Paint paint = this.b;
        if (i2 > 0) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            h75 h75Var = this.c;
            if (h75Var.G4 != null) {
                canvas.save();
                if (i2 > 0) {
                    Path path = this.a;
                    path.rewind();
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                } else {
                    canvas.clipRect(rectF);
                }
                canvas.translate(-h75Var.D1.getX(), -h75Var.D1.getY());
                float f4 = h75Var.H4;
                canvas.scale(f4, f4);
                canvas.drawRenderNode(h75Var.G4);
                canvas.restore();
            }
        }
    }

    @Override
    public final void A() {
    }
}
