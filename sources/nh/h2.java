package nh;

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
public final class h2 extends e2 {
    public kg.h0 f17830i;
    public kg.h0 f17831j;
    public int f17832k;
    public final org.telegram.ui.Components.d6 f17833l;
    public Timer f17834m;
    public final lh.o8 f17835n;
    public final ArrayList f17836o;
    public final i2 f17837p;

    public h2(i2 i2Var) {
        super(i2Var);
        int i10;
        this.f17837p = i2Var;
        this.f17830i = new kg.h0(i2Var);
        this.f17831j = new kg.h0(i2Var);
        this.f17833l = new org.telegram.ui.Components.d6(i2Var);
        this.f17835n = new lh.o8(i2Var);
        this.f17836o = new ArrayList();
        this.f17585a = 3;
        this.f17586b = AndroidUtilities.dp(44.0f);
        this.f17587c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.f3) i2Var.f17881f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f17836o.add(kg.q0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f17836o, new lh.e4(2));
        if (!this.f17836o.isEmpty()) {
            this.f17830i.e((kg.q0) this.f17836o.get(this.f17832k));
        }
        this.f17833l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f9, float f10) {
        float dp = f10 - AndroidUtilities.dp(4.0f);
        float f11 = this.f17586b;
        RectF rectF = this.f17589f;
        rectF.set((int) f9, (int) dp, (int) (f9 + f11), (int) (dp + f11));
        float a2 = this.f17590g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        lh.o8 o8Var = this.f17835n;
        o8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        o8Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f17833l.d(1.0f, false);
        this.f17831j.c(rect);
        this.f17830i.c(rect);
        if (d == 1.0f) {
            this.f17830i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - d;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            kg.h0 h0Var = this.f17831j;
            h0Var.h = f12;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            kg.h0 h0Var2 = this.f17830i;
            h0Var2.h = d;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f17830i.b(z10);
        this.f17831j.b(z10);
        Timer timer = this.f17834m;
        if (timer != null) {
            timer.cancel();
            this.f17834m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f17834m = timer2;
            timer2.schedule(new g2(this, 0), 2000L, 2000L);
        }
    }
}
