package ci;

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
public final class p2 extends m2 {
    public zg.g0 f5283i;
    public zg.g0 f5284j;
    public int f5285k;
    public final org.telegram.ui.Components.e6 f5286l;
    public Timer f5287m;
    public final ai.ob f5288n;
    public final ArrayList f5289o;
    public final q2 f5290p;

    public p2(q2 q2Var) {
        super(q2Var);
        int i10;
        this.f5290p = q2Var;
        this.f5283i = new zg.g0(q2Var);
        this.f5284j = new zg.g0(q2Var);
        this.f5286l = new org.telegram.ui.Components.e6(q2Var);
        this.f5288n = new ai.ob(q2Var);
        this.f5289o = new ArrayList();
        this.f5161a = 3;
        this.f5162b = AndroidUtilities.dp(44.0f);
        this.f5163c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.g3) q2Var.f5329f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5289o.add(zg.p0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5289o, new a4.e(10));
        if (!this.f5289o.isEmpty()) {
            this.f5283i.e((zg.p0) this.f5289o.get(this.f5285k));
        }
        this.f5286l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5162b;
        RectF rectF = this.f5164f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5165g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.ob obVar = this.f5288n;
        obVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        obVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5286l.d(1.0f, false);
        this.f5284j.c(rect);
        this.f5283i.c(rect);
        if (d == 1.0f) {
            this.f5283i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.g0 g0Var = this.f5284j;
            g0Var.h = f12;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.g0 g0Var2 = this.f5283i;
            g0Var2.h = d;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5283i.b(z10);
        this.f5284j.b(z10);
        Timer timer = this.f5287m;
        if (timer != null) {
            timer.cancel();
            this.f5287m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5287m = timer2;
            timer2.schedule(new o2(this, 0), 2000L, 2000L);
        }
    }
}
