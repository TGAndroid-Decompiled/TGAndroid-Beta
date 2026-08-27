package ah;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import gf.s;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hp;

public final class e extends zg.e implements Drawable.Callback, ud.b {

    public final String f758b;
    public final Drawable d;

    public final hp f761f;
    public zg.d h;

    public TLRPC.WebPage f762n;

    public final ud.a f763r;

    public final ud.a f764s;

    public final b6.a f759c = new b6.a((char) 0, 18);

    public final Paint f760e = new Paint(1);

    public e(String str) {
        hp hpVar = new hp(-1);
        this.f761f = hpVar;
        er erVar = er.h;
        this.f763r = new ud.a(0, this, erVar, 320L, false);
        this.f764s = new ud.a(0, this, erVar, 320L, false);
        this.f758b = str;
        this.f50818a.setRoundRadius(AndroidUtilities.dp(7.0f));
        this.d = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
        hpVar.setCallback(this);
        hpVar.b(g6.w0(null, g6.f23252o7, false));
        hpVar.f29070a = AndroidUtilities.dp(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (zg.d) view;
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
        ImageReceiver imageReceiver = this.f50818a;
        imageReceiver.setImageCoords(0.0f, 0.0f, f10, f11);
        imageReceiver.draw(canvas);
        hp hpVar = this.f761f;
        hpVar.setBounds(0, 0, i10, i11);
        int iW0 = g6.w0(null, g6.f22999a7, false);
        ud.a aVar = this.f764s;
        int iD = i0.b.d(aVar.f48497e, iW0, 1073741824);
        Paint paint = this.f760e;
        paint.setColor(iD);
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), paint);
        int iD2 = i0.b.d(aVar.f48497e, g6.w0(null, g6.f23252o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        b6.a aVar2 = this.f759c;
        aVar2.getClass();
        if (((PorterDuffColorFilter) aVar2.f2033b) == null || aVar2.f2034c != iD2 || ((PorterDuff.Mode) aVar2.d) != mode) {
            aVar2.f2033b = new PorterDuffColorFilter(iD2, mode);
            aVar2.f2034c = iD2;
            aVar2.d = mode;
        }
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) aVar2.f2033b;
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        s.e(this.d, f10 / 2.0f, f11 / 2.0f, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
        ud.a aVar3 = this.f763r;
        s.b(canvas, drawable, 1.0f - aVar3.f48497e);
        s.b(canvas, hpVar, aVar3.f48497e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        zg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        zg.d dVar = this.h;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
    }
}
