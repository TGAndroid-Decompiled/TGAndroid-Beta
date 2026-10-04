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
    public zg.f0 f5689i;
    public zg.f0 f5690j;
    public int f5691k;
    public final org.telegram.ui.Components.e6 f5692l;
    public Timer f5693m;
    public final ai.ob f5694n;
    public final ArrayList f5695o;
    public final q2 f5696p;

    public p2(q2 q2Var) {
        super(q2Var);
        int i10;
        this.f5696p = q2Var;
        this.f5689i = new zg.f0(q2Var);
        this.f5690j = new zg.f0(q2Var);
        this.f5692l = new org.telegram.ui.Components.e6(q2Var);
        this.f5694n = new ai.ob(q2Var);
        this.f5695o = new ArrayList();
        this.f5557a = 3;
        this.f5558b = AndroidUtilities.dp(44.0f);
        this.f5559c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) q2Var.f5739f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5695o.add(zg.o0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5695o, new a4.e(10));
        if (!this.f5695o.isEmpty()) {
            this.f5689i.e((zg.o0) this.f5695o.get(this.f5691k));
        }
        this.f5692l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5558b;
        RectF rectF = this.f5561f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5562g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.ob obVar = this.f5694n;
        obVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        obVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5692l.d(1.0f, false);
        this.f5690j.c(rect);
        this.f5689i.c(rect);
        if (d == 1.0f) {
            this.f5689i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.f0 f0Var = this.f5690j;
            f0Var.h = f12;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.f0 f0Var2 = this.f5689i;
            f0Var2.h = d;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5689i.b(z10);
        this.f5690j.b(z10);
        Timer timer = this.f5693m;
        if (timer != null) {
            timer.cancel();
            this.f5693m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5693m = timer2;
            timer2.schedule(new o2(this, 0), 2000L, 2000L);
        }
    }
}
