package eh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import b4.e0;
import kf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qp;
public final class e extends dh.h implements Drawable.Callback, xd.b {
    public final String f5595b;
    public final Drawable d;
    public final qp f5597f;
    public dh.g h;
    public TLRPC.WebPage f5598n;
    public final xd.a f5599r;
    public final xd.a f5600s;
    public final e0 f5596c = new e0((char) 0, 19);
    public final Paint e = new Paint(1);

    public e(String str) {
        qp qpVar = new qp(-1);
        this.f5597f = qpVar;
        mr mrVar = mr.h;
        this.f5599r = new xd.a(0, this, mrVar, 320L, false);
        this.f5600s = new xd.a(0, this, mrVar, 320L, false);
        this.f5595b = str;
        this.f4910a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        qpVar.setCallback(this);
        qpVar.b(j6.w0(null, j6.f20079o7, false));
        qpVar.f28225a = AndroidUtilities.dp(15.0f);
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
        ImageReceiver imageReceiver = this.f4910a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        qp qpVar = this.f5597f;
        qpVar.setBounds(0, 0, i10, i11);
        int w02 = j6.w0(null, j6.f19827a7, false);
        xd.a aVar = this.f5600s;
        int d = i0.a.d(aVar.e, w02, 1073741824);
        Paint paint = this.e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.e, j6.w0(null, j6.f20079o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        e0 e0Var = this.f5596c;
        e0Var.getClass();
        if (((PorterDuffColorFilter) e0Var.f1379c) == null || e0Var.f1378b != d10 || ((PorterDuff.Mode) e0Var.d) != mode) {
            e0Var.f1379c = new PorterDuffColorFilter(d10, mode);
            e0Var.f1378b = d10;
            e0Var.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) e0Var.f1379c);
        r.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        xd.a aVar2 = this.f5599r;
        r.b(canvas, drawable, 1.0f - aVar2.e);
        r.b(canvas, qpVar, aVar2.e);
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
