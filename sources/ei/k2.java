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
    public ah.y0 f9305i;
    public ah.y0 f9306j;
    public int f9307k;
    public final org.telegram.ui.Components.f6 f9308l;
    public Timer f9309m;
    public final ci.f9 f9310n;
    public final ArrayList f9311o;
    public final l2 f9312p;

    public k2(l2 l2Var) {
        super(l2Var);
        int i10;
        this.f9312p = l2Var;
        this.f9305i = new ah.y0(l2Var);
        this.f9306j = new ah.y0(l2Var);
        this.f9308l = new org.telegram.ui.Components.f6(l2Var);
        this.f9310n = new ci.f9(l2Var);
        this.f9311o = new ArrayList();
        this.f9196a = 3;
        this.f9197b = AndroidUtilities.dp(44.0f);
        this.f9198c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) l2Var.f9374f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f9311o.add(ah.i1.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f9311o, new a4.d(16));
        if (!this.f9311o.isEmpty()) {
            this.f9305i.e((ah.i1) this.f9311o.get(this.f9307k));
        }
        this.f9308l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f9197b;
        RectF rectF = this.f9199f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f9200g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ci.f9 f9Var = this.f9310n;
        f9Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        f9Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f9308l.d(1.0f, false);
        this.f9306j.c(rect);
        this.f9305i.c(rect);
        if (d == 1.0f) {
            this.f9305i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            ah.y0 y0Var = this.f9306j;
            y0Var.h = f12;
            y0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ah.y0 y0Var2 = this.f9305i;
            y0Var2.h = d;
            y0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f9305i.b(z10);
        this.f9306j.b(z10);
        Timer timer = this.f9309m;
        if (timer != null) {
            timer.cancel();
            this.f9309m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f9309m = timer2;
            timer2.schedule(new e6.r(this, 1), 2000L, 2000L);
        }
    }
}
