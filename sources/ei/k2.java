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
    public ah.y0 f9296i;
    public ah.y0 f9297j;
    public int f9298k;
    public final org.telegram.ui.Components.f6 f9299l;
    public Timer f9300m;
    public final ci.g9 f9301n;
    public final ArrayList f9302o;
    public final l2 f9303p;

    public k2(l2 l2Var) {
        super(l2Var);
        int i10;
        this.f9303p = l2Var;
        this.f9296i = new ah.y0(l2Var);
        this.f9297j = new ah.y0(l2Var);
        this.f9299l = new org.telegram.ui.Components.f6(l2Var);
        this.f9301n = new ci.g9(l2Var);
        this.f9302o = new ArrayList();
        this.f9187a = 3;
        this.f9188b = AndroidUtilities.dp(44.0f);
        this.f9189c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) l2Var.f9365f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f9302o.add(ah.i1.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f9302o, new a4.d(16));
        if (!this.f9302o.isEmpty()) {
            this.f9296i.e((ah.i1) this.f9302o.get(this.f9298k));
        }
        this.f9299l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f9188b;
        RectF rectF = this.f9190f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f9191g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ci.g9 g9Var = this.f9301n;
        g9Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        g9Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f9299l.d(1.0f, false);
        this.f9297j.c(rect);
        this.f9296i.c(rect);
        if (d == 1.0f) {
            this.f9296i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            ah.y0 y0Var = this.f9297j;
            y0Var.h = f12;
            y0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ah.y0 y0Var2 = this.f9296i;
            y0Var2.h = d;
            y0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f9296i.b(z10);
        this.f9297j.b(z10);
        Timer timer = this.f9300m;
        if (timer != null) {
            timer.cancel();
            this.f9300m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f9300m = timer2;
            timer2.schedule(new e6.r(this, 1), 2000L, 2000L);
        }
    }
}
