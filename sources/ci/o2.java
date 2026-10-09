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
public final class o2 extends l2 {
    public zg.e0 f5667i;
    public zg.e0 f5668j;
    public int f5669k;
    public final org.telegram.ui.Components.g6 f5670l;
    public Timer f5671m;
    public final ai.pb f5672n;
    public final ArrayList f5673o;
    public final p2 f5674p;

    public o2(p2 p2Var) {
        super(p2Var);
        int i10;
        this.f5674p = p2Var;
        this.f5667i = new zg.e0(p2Var);
        this.f5668j = new zg.e0(p2Var);
        this.f5670l = new org.telegram.ui.Components.g6(p2Var);
        this.f5672n = new ai.pb(p2Var);
        this.f5673o = new ArrayList();
        this.f5379a = 3;
        this.f5380b = AndroidUtilities.dp(44.0f);
        this.f5381c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) p2Var.f5722f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f5673o.add(zg.n0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f5673o, new a4.d(10));
        if (!this.f5673o.isEmpty()) {
            this.f5667i.e((zg.n0) this.f5673o.get(this.f5669k));
        }
        this.f5670l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f5380b;
        RectF rectF = this.f5383f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f5384g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        ai.pb pbVar = this.f5672n;
        pbVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        pbVar.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f5670l.d(1.0f, false);
        this.f5668j.c(rect);
        this.f5667i.c(rect);
        if (d == 1.0f) {
            this.f5667i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            zg.e0 e0Var = this.f5668j;
            e0Var.h = f12;
            e0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            zg.e0 e0Var2 = this.f5667i;
            e0Var2.h = d;
            e0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f5667i.b(z10);
        this.f5668j.b(z10);
        Timer timer = this.f5671m;
        if (timer != null) {
            timer.cancel();
            this.f5671m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f5671m = timer2;
            timer2.schedule(new n2(this, 0), 2000L, 2000L);
        }
    }
}
