package ch;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import di.z2;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.p10;
import org.telegram.messenger.t5;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i5;
public final class f0 {
    public final ImageReceiver f6241a;
    public i5 f6242b;
    public o0 f6244e;
    public View f6245f;
    public boolean f6246g;
    public boolean f6247i;
    public int f6248j;
    public PorterDuffColorFilter f6249k;
    public final Rect f6243c = new Rect();
    public final int d = p10.f24459s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f6245f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f6241a = imageReceiver;
        imageReceiver.f21233z1 = true;
    }

    public final void a(Canvas canvas) {
        i5 i5Var = this.f6242b;
        Rect rect = this.f6243c;
        if (i5Var != null) {
            z2 z2Var = i5Var.f34450k;
            if (z2Var != null) {
                z2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f6242b.setColorFilter(this.f6249k);
            this.f6242b.setBounds(rect);
            this.f6242b.setAlpha((int) (this.h * 255.0f));
            this.f6242b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f6241a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z9) {
        this.f6246g = z9;
        ImageReceiver imageReceiver = this.f6241a;
        if (z9) {
            imageReceiver.P();
            i5 i5Var = this.f6242b;
            if (i5Var != null) {
                i5Var.a(this.f6245f);
                return;
            }
            return;
        }
        imageReceiver.R();
        i5 i5Var2 = this.f6242b;
        if (i5Var2 != null) {
            i5Var2.n(this.f6245f);
        }
    }

    public final void c(Rect rect) {
        this.f6243c.set(rect);
    }

    public final void d(int i7) {
        if (this.f6248j != i7) {
            this.f6248j = i7;
            this.f6249k = new PorterDuffColorFilter(this.f6248j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f6245f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i7;
        if (!Objects.equals(this.f6244e, o0Var)) {
            ImageReceiver imageReceiver = this.f6241a;
            imageReceiver.f();
            i5 i5Var = this.f6242b;
            if (i5Var != null) {
                i5Var.n(this.f6245f);
                this.f6242b = null;
            }
            this.f6244e = o0Var;
            boolean z9 = this.f6247i;
            if (z9) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (o0Var.f6356f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.d).f25825r.get(o0Var.f6356f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(hc.b(tL_availableReaction.select_animation), str, null, null, t5.f(tL_availableReaction.select_animation, k6.f28013m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z9) {
                i7 = 13;
            } else {
                i7 = 1;
            }
            i5 i5Var2 = new i5(i7, p10.f24459s0, o0Var.f6357g);
            this.f6242b = i5Var2;
            if (this.f6246g) {
                i5Var2.a(this.f6245f);
            }
            i5 i5Var3 = this.f6242b;
            this.f6248j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f6249k = porterDuffColorFilter;
            i5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
