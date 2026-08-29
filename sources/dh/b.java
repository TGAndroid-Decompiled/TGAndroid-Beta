package dh;

import ag.j2;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.ArrayList;
import jf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import vd.h;
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 A;
    public MessageObject B;
    public final j2 C;
    public String D;
    public final int E;
    public boolean F;
    public int G;
    public int H;
    public final n6 f5632a;
    public final j9 f5633b;
    public final ImageReceiver f5634c;
    public final s1 d;
    public final int f5635e;
    public boolean f5636f;
    public boolean h;
    public boolean f5637n;
    public boolean f5638r;
    public Drawable f5639s;
    public boolean v;
    public final Paint f5640w;
    public final Paint f5641x;
    public final vd.a f5642y;

    public b(int i10, s1 s1Var) {
        Paint paint = new Paint(1);
        this.f5640w = paint;
        this.f5641x = new Paint(1);
        this.C = new j2((char) 0, 17);
        this.f5635e = i10;
        this.d = s1Var;
        this.f5642y = new vd.a(s1Var, jr.h, 380L);
        n6 n6Var = new n6(false, false, false, false);
        this.f5632a = n6Var;
        n6Var.f30862b = 21;
        n6Var.t(AndroidUtilities.dp(11.0f));
        n6Var.setCallback(s1Var);
        this.f5633b = new j9(i10, s1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f5634c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, null);
        this.A = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.E = DownloadController.getInstance(i10).generateObserverTag();
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
        this.f5634c.setImage(forObject, "36_36", forObject2, "36_36_b", null, j10, null, obj, 1);
    }

    public final void b(boolean z10) {
        int i10;
        if (!this.B.isSending() && !this.B.isEditing()) {
            if (!TextUtils.isEmpty(this.D) && FileLoader.getInstance(this.f5635e).isLoadingFile(this.D)) {
                g(3, z10);
                return;
            }
            if (this.v) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            g(i10, z10);
        }
    }

    public final void c(Canvas canvas) {
        float f9;
        int i10;
        int i11;
        int w02;
        Rect bounds = getBounds();
        if (this.f5636f) {
            f9 = 56.33f;
        } else {
            f9 = 19.0f;
        }
        int dp = AndroidUtilities.dp(f9);
        if (this.f5642y.f49505e > 0.0f) {
            h hVar = this.f5633b.f29621c.d;
            float f10 = hVar.f49521c.f49531a;
            int i12 = (int) hVar.f49523f.f49531a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i12, f10);
            if (f10 > 0.0f) {
                j9 j9Var = this.f5633b;
                j9Var.f29625i = (int) (this.f5642y.f49505e * 255.0f);
                j9Var.setBounds((bounds.right - dp) - i12, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.f5633b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            n6 n6Var = this.f5632a;
            n6Var.f30880w = (int) (this.f5642y.f49505e * 255.0f);
            n6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.f5632a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(x3.B(9.0f, bounds.right, dp3), x3.B(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.A;
            radialProgress2.f26479a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f5634c.setImageCoords(rect);
            if (!this.f5637n || this.f5638r) {
                this.f5634c.draw(canvas);
            }
            if (this.v || this.f5637n) {
                if (this.f5637n && !this.f5638r) {
                    Paint paint = this.f5641x;
                    if (this.B.isOutOwner()) {
                        i10 = g6.f23104fc;
                    } else {
                        i10 = g6.f23086ec;
                    }
                    paint.setColor(i0.a.k(g6.w0(null, i10, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f5641x);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f5640w);
                }
            }
            if (this.f5637n) {
                if (this.f5639s == null) {
                    this.f5639s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f5639s;
                j2 j2Var = this.C;
                if (this.f5638r) {
                    w02 = -1;
                } else {
                    if (this.B.isOutOwner()) {
                        i11 = g6.f23332sb;
                    } else {
                        i11 = g6.f23248nd;
                    }
                    w02 = g6.w0(null, i11, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                j2Var.getClass();
                if (((PorterDuffColorFilter) j2Var.f559c) == null || j2Var.f558b != w02 || ((PorterDuff.Mode) j2Var.d) != mode) {
                    j2Var.f559c = new PorterDuffColorFilter(w02, mode);
                    j2Var.f558b = w02;
                    j2Var.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) j2Var.f559c);
                r.e(this.f5639s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f5639s.draw(canvas);
            }
            b(true);
            if (this.F) {
                this.A.draw(canvas);
            }
        }
    }

    public final float d(float f9) {
        j9 j9Var = this.f5633b;
        float d = this.f5632a.d() + j9Var.f29621c.d.f49523f.f49531a;
        float dp = j9Var.f29621c.d.f49521c.f49531a * AndroidUtilities.dp(4.0f);
        float f10 = this.f5642y.f49505e;
        return (f9 * f10) + (dp * f10) + d;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i10;
        float f9 = this.f5632a.d;
        int i11 = this.G;
        if (i11 > 0) {
            i10 = AndroidUtilities.dp((i11 * 9.34f) + 8.66f);
        } else {
            i10 = 0;
        }
        return f9 + i10;
    }

    public final void f(boolean z10) {
        this.f5636f = z10;
    }

    public final void g(int i10, boolean z10) {
        if (this.H != i10) {
            this.H = i10;
            this.A.setIcon(i10, true, z10);
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
        throw new UnsupportedOperationException("Method not decompiled: dh.b.h(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, java.lang.String, boolean):void");
    }

    public final void i(ArrayList arrayList, boolean z10) {
        int i10;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.G = i10;
        this.f5633b.d(arrayList, z10);
    }

    public final void j(int i10, boolean z10) {
        String str = null;
        if (i10 > 0) {
            str = LocaleController.formatShortNumber(i10, null);
        }
        this.f5632a.q(str, z10, true);
    }

    public final void k(int i10) {
        this.f5632a.r(i10);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.A.o(min, true);
        if (min < 1.0f) {
            i10 = 3;
        } else if (this.v) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.A.o(min, true);
        if (min < 1.0f) {
            i10 = 3;
        } else if (this.v) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    @Override
    public final void onSuccessDownload(String str) {
    }

    @Override
    public final void setAlpha(int i10) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
    }
}
