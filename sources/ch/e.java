package ch;

import ag.j2;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.np;
public final class e extends bh.h implements Drawable.Callback, vd.b {
    public final String f3491b;
    public final Drawable d;
    public final np f3494f;
    public bh.g h;
    public TLRPC.WebPage f3495n;
    public final vd.a f3496r;
    public final vd.a f3497s;
    public final j2 f3492c = new j2((char) 0, 17);
    public final Paint f3493e = new Paint(1);

    public e(String str) {
        np npVar = new np(-1);
        this.f3494f = npVar;
        jr jrVar = jr.h;
        this.f3496r = new vd.a(0, this, jrVar, 320L, false);
        this.f3497s = new vd.a(0, this, jrVar, 320L, false);
        this.f3491b = str;
        this.f2668a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        npVar.setCallback(this);
        npVar.b(g6.w0(null, g6.f23261o7, false));
        npVar.f31104a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        bh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (bh.g) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        float f9 = i10;
        float f10 = i11;
        ImageReceiver imageReceiver = this.f2668a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f9, f10);
        imageReceiver.draw(canvas);
        np npVar = this.f3494f;
        npVar.setBounds(0, 0, i10, i11);
        int w02 = g6.w0(null, g6.f23009a7, false);
        vd.a aVar = this.f3497s;
        int d = i0.a.d(aVar.f49505e, w02, 1073741824);
        Paint paint = this.f3493e;
        paint.setColor(d);
        canvas.drawRoundRect(0.0f, 0.0f, f9, f10, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int d10 = i0.a.d(aVar.f49505e, g6.w0(null, g6.f23261o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        j2 j2Var = this.f3492c;
        j2Var.getClass();
        if (((PorterDuffColorFilter) j2Var.f559c) == null || j2Var.f558b != d10 || ((PorterDuff.Mode) j2Var.d) != mode) {
            j2Var.f559c = new PorterDuffColorFilter(d10, mode);
            j2Var.f558b = d10;
            j2Var.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter((PorterDuffColorFilter) j2Var.f559c);
        r.e(this.d, f9 / 2.0f, f10 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        vd.a aVar2 = this.f3496r;
        r.b(canvas, drawable, 1.0f - aVar2.f49505e);
        r.b(canvas, npVar, aVar2.f49505e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        bh.g gVar = this.h;
        if (gVar != null) {
            gVar.invalidate();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void z(float f9, int i10) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
