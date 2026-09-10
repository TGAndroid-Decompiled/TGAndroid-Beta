package bi;

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
public final class c3 extends z2 {
    public yg.g0 f2401i;
    public yg.g0 f2402j;
    public int f2403k;
    public final org.telegram.ui.Components.d6 f2404l;
    public Timer f2405m;
    public final zh.a7 f2406n;
    public final ArrayList f2407o;
    public final d3 f2408p;

    public c3(d3 d3Var) {
        super(d3Var);
        int i10;
        this.f2408p = d3Var;
        this.f2401i = new yg.g0(d3Var);
        this.f2402j = new yg.g0(d3Var);
        this.f2404l = new org.telegram.ui.Components.d6(d3Var);
        this.f2406n = new zh.a7(d3Var);
        this.f2407o = new ArrayList();
        this.f3997a = 3;
        this.f3998b = AndroidUtilities.dp(44.0f);
        this.f3999c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) d3Var.f2544f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f2407o.add(yg.p0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f2407o, new a4.e(3));
        if (!this.f2407o.isEmpty()) {
            this.f2401i.e((yg.p0) this.f2407o.get(this.f2403k));
        }
        this.f2404l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f3998b;
        RectF rectF = this.f4000f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f4001g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        zh.a7 a7Var = this.f2406n;
        a7Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        a7Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f2404l.d(1.0f, false);
        this.f2402j.c(rect);
        this.f2401i.c(rect);
        if (d == 1.0f) {
            this.f2401i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            yg.g0 g0Var = this.f2402j;
            g0Var.h = f12;
            g0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            yg.g0 g0Var2 = this.f2401i;
            g0Var2.h = d;
            g0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f2401i.b(z10);
        this.f2402j.b(z10);
        Timer timer = this.f2405m;
        if (timer != null) {
            timer.cancel();
            this.f2405m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f2405m = timer2;
            timer2.schedule(new b3(this, 0), 2000L, 2000L);
        }
    }
}
