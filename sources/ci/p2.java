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
    public zg.f0 f5284i;
    public zg.f0 f5285j;
    public int f5286k;
    public final org.telegram.ui.Components.e6 f5287l;
    public Timer f5288m;
    public final ai.ob f5289n;
    public final ArrayList f5290o;
    public final q2 f5291p;

    public p2(q2 q2Var) {
        super(q2Var);
        int i10;
        this.f5291p = q2Var;
        this.f5284i = new zg.f0(q2Var);
        this.f5285j = new zg.f0(q2Var);
        this.f5287l = new org.telegram.ui.Components.e6(q2Var);
        this.f5289n = new ai.ob(q2Var);
        this.f5290o = new ArrayList();
        this.f5160a = 3;
        this.f5161b = AndroidUtilities.dp(44.0f);
        this.f5162c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.e3) q2Var.f5325f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5290o.add(zg.o0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5290o, new a4.e(10));
        if (!this.f5290o.isEmpty()) {
            this.f5284i.e((zg.o0) this.f5290o.get(this.f5286k));
        }
        this.f5287l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5161b;
        RectF rectF = this.f5163f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5164g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.ob obVar = this.f5289n;
        obVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        obVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5287l.d(1.0f, false);
        this.f5285j.c(rect);
        this.f5284i.c(rect);
        if (d == 1.0f) {
            this.f5284i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.f0 f0Var = this.f5285j;
            f0Var.h = f12;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.f0 f0Var2 = this.f5284i;
            f0Var2.h = d;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5284i.b(z10);
        this.f5285j.b(z10);
        Timer timer = this.f5288m;
        if (timer != null) {
            timer.cancel();
            this.f5288m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5288m = timer2;
            timer2.schedule(new o2(this, 0), 2000L, 2000L);
        }
    }
}
