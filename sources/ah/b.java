package ah;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ff.s;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import td.g;
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 A;
    public MessageObject B;
    public final a6.a C;
    public String D;
    public final int E;
    public boolean F;
    public int G;
    public int H;
    public final i6 f247a;
    public final e9 f248b;
    public final ImageReceiver f249c;
    public final t1 d;
    public final int f250e;
    public boolean f251f;
    public boolean h;
    public boolean f252n;
    public boolean f253r;
    public Drawable f254s;
    public boolean v;
    public final Paint f255w;
    public final Paint f256x;
    public final td.a f257y;

    public b(int i9, t1 t1Var) {
        Paint paint = new Paint(1);
        this.f255w = paint;
        this.f256x = new Paint(1);
        this.C = new a6.a((char) 0, 19);
        this.f250e = i9;
        this.d = t1Var;
        this.f257y = new td.a(t1Var, gr.h, 380L);
        i6 i6Var = new i6(false, false, false, false);
        this.f247a = i6Var;
        i6Var.f29333b = 21;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.setCallback(t1Var);
        this.f248b = new e9(i9, t1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(t1Var);
        this.f249c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(t1Var, null);
        this.A = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.E = DownloadController.getInstance(i9).generateObserverTag();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        long j10;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
        ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize2, photo);
        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize, photo);
        if (closestPhotoSizeWithSize2 != null) {
            j10 = closestPhotoSizeWithSize2.size;
        } else {
            j10 = 0;
        }
        this.f249c.setImage(forObject, "36_36", forObject2, "36_36_b", null, j10, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i9;
        if (!this.B.isSending() && !this.B.isEditing()) {
            if (!TextUtils.isEmpty(this.D) && FileLoader.getInstance(this.f250e).isLoadingFile(this.D)) {
                g(3, z10);
                return;
            }
            if (this.v) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            g(i9, z10);
        }
    }

    public final void c(Canvas canvas) {
        float f10;
        int i9;
        int i10;
        int w02;
        Rect bounds = getBounds();
        if (this.f251f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (this.f257y.f47775e > 0.0f) {
            g gVar = this.f248b.f27981c.d;
            float f11 = gVar.f47790c.f47800a;
            int i11 = (int) gVar.f47792f.f47800a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i11, f11);
            if (f11 > 0.0f) {
                e9 e9Var = this.f248b;
                e9Var.f27985i = (int) (this.f257y.f47775e * 255.0f);
                e9Var.setBounds((bounds.right - dp) - i11, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.f248b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            i6 i6Var = this.f247a;
            i6Var.f29351w = (int) (this.f257y.f47775e * 255.0f);
            i6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.f247a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(l0.B(9.0f, bounds.right, dp3), l0.B(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.A;
            radialProgress2.f26468a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f249c.setImageCoords(rect);
            if (!this.f252n || this.f253r) {
                this.f249c.draw(canvas);
            }
            if (this.v || this.f252n) {
                if (this.f252n && !this.f253r) {
                    Paint paint = this.f256x;
                    if (this.B.isOutOwner()) {
                        i9 = f6.fc;
                    } else {
                        i9 = f6.ec;
                    }
                    paint.setColor(i0.a.k(f6.w0(null, i9, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f256x);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f255w);
                }
            }
            if (this.f252n) {
                if (this.f254s == null) {
                    this.f254s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f254s;
                a6.a aVar = this.C;
                if (this.f253r) {
                    w02 = -1;
                } else {
                    if (this.B.isOutOwner()) {
                        i10 = f6.f23272sb;
                    } else {
                        i10 = f6.nd;
                    }
                    w02 = f6.w0(null, i10, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.f101b) == null || aVar.f102c != w02 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.f101b = new PorterDuffColorFilter(w02, mode);
                    aVar.f102c = w02;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.f101b);
                s.e(this.f254s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f254s.draw(canvas);
            }
            b(true);
            if (this.F) {
                this.A.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        e9 e9Var = this.f248b;
        float d = this.f247a.d() + e9Var.f27981c.d.f47792f.f47800a;
        float dp = e9Var.f27981c.d.f47790c.f47800a * AndroidUtilities.dp(4.0f);
        float f11 = this.f257y.f47775e;
        return (f10 * f11) + (dp * f11) + d;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i9;
        float f10 = this.f247a.d;
        int i10 = this.G;
        if (i10 > 0) {
            i9 = AndroidUtilities.dp((i10 * 9.34f) + 8.66f);
        } else {
            i9 = 0;
        }
        return f10 + i9;
    }

    public final void f(boolean z10) {
        this.f251f = z10;
    }

    public final void g(int i9, boolean z10) {
        if (this.H != i9) {
            this.H = i9;
            this.A.setIcon(i9, true, z10);
        }
    }

    @Override
    public final int getObserverTag() {
        return this.E;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.MessageMedia r18, org.telegram.messenger.MessageObject r19, java.lang.String r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: ah.b.h(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, java.lang.String, boolean):void");
    }

    public final void i(ArrayList arrayList, boolean z10) {
        int i9;
        if (arrayList != null) {
            i9 = arrayList.size();
        } else {
            i9 = 0;
        }
        this.G = i9;
        this.f248b.d(arrayList, z10);
    }

    public final void j(int i9, boolean z10) {
        String str = null;
        if (i9 > 0) {
            str = LocaleController.formatShortNumber(i9, null);
        }
        this.f247a.q(str, z10, true);
    }

    public final void k(int i9) {
        this.f247a.r(i9);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        int i9;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.A.o(min, true);
        if (min < 1.0f) {
            i9 = 3;
        } else if (this.v) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        g(i9, true);
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int i9;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.A.o(min, true);
        if (min < 1.0f) {
            i9 = 3;
        } else if (this.v) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        g(i9, true);
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void setAlpha(int i9) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }
}
