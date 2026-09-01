package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import b4.e0;
import lf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tp;
public final class e extends eh.h implements Drawable.Callback, xd.b {
    public final String f6659b;
    public final Drawable d;
    public final tp f6662f;
    public eh.g h;
    public TLRPC.WebPage f6663n;
    public final xd.a f6664r;
    public final xd.a f6665s;
    public final e0 f6660c = new e0((char) 0, 19);
    public final Paint f6661e = new Paint(1);

    public e(String str) {
        tp tpVar = new tp(-1);
        this.f6662f = tpVar;
        pr prVar = pr.h;
        this.f6664r = new xd.a(0, this, prVar, 320L, false);
        this.f6665s = new xd.a(0, this, prVar, 320L, false);
        this.f6659b = str;
        this.f5637a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        tpVar.setCallback(this);
        tpVar.b(k6.w0(null, k6.f21858o7, false));
        tpVar.f31427a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        eh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (eh.g) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        float f10 = i10;
        float f11 = i11;
        ImageReceiver imageReceiver = this.f5637a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        tp tpVar = this.f6662f;
        tpVar.setBounds(0, 0, i10, i11);
        int w02 = k6.w0(null, k6.f21605a7, false);
        xd.a aVar = this.f6665s;
        int d = i0.a.d(aVar.f50505e, w02, 1073741824);
        Paint paint = this.f6661e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.f50505e, k6.w0(null, k6.f21858o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e0 e0Var = this.f6660c;
        e0Var.getClass();
        if (((PorterDuffColorFilter) e0Var.f1475c) == null || e0Var.f1474b != d10 || ((PorterDuff.Mode) e0Var.d) != mode) {
            e0Var.f1475c = new PorterDuffColorFilter(d10, mode);
            e0Var.f1474b = d10;
            e0Var.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) e0Var.f1475c);
        r.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        xd.a aVar2 = this.f6664r;
        r.b(canvas, drawable, 1.0f - aVar2.f50505e);
        r.b(canvas, tpVar, aVar2.f50505e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        eh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void z(float f10, int i10) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
