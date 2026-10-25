package fi;

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
public final class i2 extends g2 {
    public bh.n0 f10985i;
    public bh.n0 f10986j;
    public int f10987k;
    public final org.telegram.ui.Components.h6 f10988l;
    public Timer f10989m;
    public final di.e9 f10990n;
    public final ArrayList f10991o;
    public final j2 f10992p;

    public i2(j2 j2Var) {
        super(j2Var);
        int i10;
        this.f10992p = j2Var;
        this.f10985i = new bh.n0(j2Var);
        this.f10986j = new bh.n0(j2Var);
        this.f10988l = new org.telegram.ui.Components.h6(j2Var);
        this.f10990n = new di.e9(j2Var);
        this.f10991o = new ArrayList();
        this.f10892a = 3;
        this.f10893b = AndroidUtilities.dp(44.0f);
        this.f10894c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.k3) j2Var.f11044f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f10991o.add(bh.x0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f10991o, new a4.d(16));
        if (!this.f10991o.isEmpty()) {
            this.f10985i.e((bh.x0) this.f10991o.get(this.f10987k));
        }
        this.f10988l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f10893b;
        RectF rectF = this.f10895f;
        rectF.set((int) f7, (int) dp, (int) (f7 + f11), (int) (dp + f11));
        float a2 = this.f10896g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        di.e9 e9Var = this.f10990n;
        e9Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        e9Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f10988l.d(1.0f, false);
        this.f10986j.c(rect);
        this.f10985i.c(rect);
        if (d == 1.0f) {
            this.f10985i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            bh.n0 n0Var = this.f10986j;
            n0Var.h = f12;
            n0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            bh.n0 n0Var2 = this.f10985i;
            n0Var2.h = d;
            n0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f10985i.b(z10);
        this.f10986j.b(z10);
        Timer timer = this.f10989m;
        if (timer != null) {
            timer.cancel();
            this.f10989m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f10989m = timer2;
            timer2.schedule(new f6.r(this, 1), 2000L, 2000L);
        }
    }
}
