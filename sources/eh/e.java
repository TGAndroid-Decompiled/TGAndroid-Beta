package eh;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rp;
public final class e extends dh.h implements Drawable.Callback, xd.b {
    public final String f5606b;
    public final Drawable d;
    public final rp f5608f;
    public dh.g h;
    public TLRPC.WebPage f5609n;
    public final xd.a f5610r;
    public final xd.a f5611s;
    public final e0 f5607c = new e0((char) 0, 18);
    public final Paint e = new Paint(1);

    public e(String str) {
        rp rpVar = new rp(-1);
        this.f5608f = rpVar;
        nr nrVar = nr.h;
        this.f5610r = new xd.a(0, this, nrVar, 320L, false);
        this.f5611s = new xd.a(0, this, nrVar, 320L, false);
        this.f5606b = str;
        this.f4904a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        rpVar.setCallback(this);
        rpVar.b(j6.w0(null, j6.f20104o7, false));
        rpVar.f28506a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        dh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (dh.g) view;
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
        ImageReceiver imageReceiver = this.f4904a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        rp rpVar = this.f5608f;
        rpVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.f19852a7, false);
        xd.a aVar = this.f5611s;
        int d = i0.a.d(aVar.e, w02, 1073741824);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.e, j6.w0(null, j6.f20104o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e0 e0Var = this.f5607c;
        e0Var.getClass();
        if (((PorterDuffColorFilter) e0Var.f1368c) == null || e0Var.f1367b != d10 || ((PorterDuff.Mode) e0Var.d) != mode) {
            e0Var.f1368c = new PorterDuffColorFilter(d10, mode);
            e0Var.f1367b = d10;
            e0Var.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) e0Var.f1368c);
        r.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        xd.a aVar2 = this.f5610r;
        r.b(canvas, drawable, 1.0f - aVar2.e);
        r.b(canvas, rpVar, aVar2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        dh.g gVar = this.h;
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
