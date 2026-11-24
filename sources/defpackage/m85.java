package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class m85 implements u29 {
    public final Path a = new Path();
    public final Paint b;
    public final g95 c;

    public m85(g95 g95Var) {
        this.c = g95Var;
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(-14603467);
    }

    @Override
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        String str = k39Var.f;
        if (str == null) {
            str = "👍";
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        long j = k39Var.g;
        if (j != 0) {
            tL_messageEntityCustomEmoji.document_id = j;
            tL_messageEntityCustomEmoji.offset = 0;
            tL_messageEntityCustomEmoji.length = str.length();
            tL_textWithEntities.entities.add(tL_messageEntityCustomEmoji);
        }
        g95 g95Var = this.c;
        g95Var.t1(tL_textWithEntities);
        m75 m75Var = g95Var.A1;
        if (m75Var.m()) {
            m75Var.j();
        } else {
            m75Var.d();
        }
        x53 reactionsWindow = g95Var.D1.getReactionsWindow();
        if (reactionsWindow != null && !reactionsWindow.q) {
            g95Var.D1.getReactionsWindow().e();
            g95Var.D1.k();
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final boolean l() {
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
            g95 g95Var = this.c;
            if (g95Var.G4 != null) {
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
                canvas.translate(-g95Var.D1.getX(), -g95Var.D1.getY());
                float f4 = g95Var.H4;
                canvas.scale(f4, f4);
                canvas.drawRenderNode(g95Var.G4);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final void o() {
    }
}
