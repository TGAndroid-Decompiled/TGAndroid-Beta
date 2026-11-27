package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class q85 implements h49 {
    public final Path a = new Path();
    public final Paint b;
    public final j95 c;

    public q85(j95 j95Var) {
        this.c = j95Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void e(View view, w49 w49Var, boolean z, boolean z2) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = w49Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j = w49Var.g;
        if (j != 0) {
            tL_messageEntityCustomEmoji.document_id = j;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        j95 j95Var = this.c;
        j95Var.u1(tL_textWithEntities);
        q75 q75Var = j95Var.A1;
        if (q75Var.m()) {
            q75Var.j();
        } else {
            q75Var.d();
        }
        e53 reactionsWindow = j95Var.D1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.q) {
            j95Var.D1.getReactionsWindow().e();
            j95Var.D1.k();
        }
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
        int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        Paint paint = this.b;
        if (i2 > 0) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawRect(rectF, paint);
        }
        if (Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            j95 j95Var = this.c;
            if (j95Var.G4 != null) {
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
                canvas.translate(-j95Var.D1.getX(), -j95Var.D1.getY());
                float f4 = j95Var.H4;
                canvas.scale(f4, f4);
                canvas.drawRenderNode(j95Var.G4);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final void n() {
    }
}
