package ei;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class k2 extends i2 {
    public ah.y0 f9297i;
    public ah.y0 f9298j;
    public int f9299k;
    public final org.telegram.ui.Components.f6 f9300l;
    public Timer f9301m;
    public final ci.g9 f9302n;
    public final ArrayList f9303o;
    public final l2 f9304p;

    public k2(l2 l2Var) {
        super(l2Var);
        int i10;
        this.f9304p = l2Var;
        this.f9297i = new ah.y0(l2Var);
        this.f9298j = new ah.y0(l2Var);
        this.f9300l = new org.telegram.ui.Components.f6(l2Var);
        this.f9302n = new ci.g9(l2Var);
        this.f9303o = new ArrayList();
        this.f9188a = 3;
        this.f9189b = AndroidUtilities.dp(44.0f);
        this.f9190c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) l2Var.f9366f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f9303o.add(ah.i1.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f9303o, new a4.d(16));
        if (!this.f9303o.isEmpty()) {
            this.f9297i.e((ah.i1) this.f9303o.get(this.f9299k));
        }
        this.f9300l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f9189b;
        RectF rectF = this.f9191f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f9192g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ci.g9 g9Var = this.f9302n;
        g9Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        g9Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f9300l.d(1.0f, false);
        this.f9298j.c(rect);
        this.f9297i.c(rect);
        if (d == 1.0f) {
            this.f9297i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            ah.y0 y0Var = this.f9298j;
            y0Var.h = f12;
            y0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ah.y0 y0Var2 = this.f9297i;
            y0Var2.h = d;
            y0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f9297i.b(z10);
        this.f9298j.b(z10);
        Timer timer = this.f9301m;
        if (timer != null) {
            timer.cancel();
            this.f9301m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f9301m = timer2;
            timer2.schedule(new e6.r(this, 1), 2000L, 2000L);
        }
    }
}
