package fh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import b4.e0;
import java.util.ArrayList;
import kf.r;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mr;
import xd.g;
public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 B;
    public MessageObject C;
    public final e0 D;
    public String E;
    public final int F;
    public boolean G;
    public int H;
    public int I;
    public final j6 f6195a;
    public final f9 f6196b;
    public final ImageReceiver f6197c;
    public final s1 d;
    public final int e;
    public boolean f6198f;
    public boolean h;
    public boolean f6199n;
    public boolean f6200r;
    public Drawable f6201s;
    public boolean v;
    public final Paint f6202w;
    public final Paint f6203x;
    public final xd.a f6204y;

    public b(int i10, s1 s1Var) {
        Paint paint = new Paint(1);
        this.f6202w = paint;
        this.f6203x = new Paint(1);
        this.D = new e0((char) 0, 19);
        this.e = i10;
        this.d = s1Var;
        this.f6204y = new xd.a(s1Var, mr.h, 380L);
        j6 j6Var = new j6(false, false, false, false);
        this.f6195a = j6Var;
        j6Var.f25847b = 21;
        j6Var.t(AndroidUtilities.dp(11.0f));
        j6Var.setCallback(s1Var);
        this.f6196b = new f9(i10, s1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f6197c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, null);
        this.B = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.F = DownloadController.getInstance(i10).generateObserverTag();
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
        this.f6197c.setImage(forObject, "36_36", forObject2, "36_36_b", null, j10, null, obj, 1);
    }

    public final void b(boolean z4) {
        int i10;
        if (!this.C.isSending() && !this.C.isEditing()) {
            if (!TextUtils.isEmpty(this.E) && FileLoader.getInstance(this.e).isLoadingFile(this.E)) {
                g(3, z4);
                return;
            }
            if (this.v) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            g(i10, z4);
        }
    }

    public final void c(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        int w02;
        Rect bounds = getBounds();
        if (this.f6198f) {
            f10 = 56.33f;
        } else {
            f10 = 19.0f;
        }
        int dp = AndroidUtilities.dp(f10);
        if (this.f6204y.e > 0.0f) {
            g gVar = this.f6196b.f24823c.d;
            float f11 = gVar.f46973c.f46981a;
            int i12 = (int) gVar.f46974f.f46981a;
            int lerp = (bounds.right - dp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i12, f11);
            if (f11 > 0.0f) {
                f9 f9Var = this.f6196b;
                f9Var.f24826i = (int) (this.f6204y.e * 255.0f);
                f9Var.setBounds((bounds.right - dp) - i12, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - dp, bounds.bottom);
                this.f6196b.c(canvas);
            }
            int dp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            j6 j6Var = this.f6195a;
            j6Var.f25864w = (int) (this.f6204y.e * 255.0f);
            j6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + dp2, lerp, dp2 - AndroidUtilities.dp(15.0f));
            this.f6195a.draw(canvas);
        }
        if (this.h) {
            int dp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(y3.B(9.0f, bounds.right, dp3), y3.B(4.0f, bounds.bottom, dp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            RadialProgress2 radialProgress2 = this.B;
            radialProgress2.f23085a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f6197c.setImageCoords(rect);
            if (!this.f6199n || this.f6200r) {
                this.f6197c.draw(canvas);
            }
            if (this.v || this.f6199n) {
                if (this.f6199n && !this.f6200r) {
                    Paint paint = this.f6203x;
                    if (this.C.isOutOwner()) {
                        i10 = org.telegram.ui.ActionBar.j6.f19922fc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.j6.f19904ec;
                    }
                    paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.w0(null, i10, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f6203x);
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f6202w);
                }
            }
            if (this.f6199n) {
                if (this.f6201s == null) {
                    this.f6201s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f6201s;
                e0 e0Var = this.D;
                if (this.f6200r) {
                    w02 = -1;
                } else {
                    if (this.C.isOutOwner()) {
                        i11 = org.telegram.ui.ActionBar.j6.sb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.j6.f20066nd;
                    }
                    w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                e0Var.getClass();
                if (((PorterDuffColorFilter) e0Var.f1379c) == null || e0Var.f1378b != w02 || ((PorterDuff.Mode) e0Var.d) != mode) {
                    e0Var.f1379c = new PorterDuffColorFilter(w02, mode);
                    e0Var.f1378b = w02;
                    e0Var.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) e0Var.f1379c);
                r.e(this.f6201s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f6201s.draw(canvas);
            }
            b(true);
            if (this.G) {
                this.B.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        f9 f9Var = this.f6196b;
        float d = this.f6195a.d() + f9Var.f24823c.d.f46974f.f46981a;
        float dp = f9Var.f24823c.d.f46973c.f46981a * AndroidUtilities.dp(4.0f);
        float f11 = this.f6204y.e;
        return (f10 * f11) + (dp * f11) + d;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        int i10;
        float f10 = this.f6195a.d;
        int i11 = this.H;
        if (i11 > 0) {
            i10 = AndroidUtilities.dp((i11 * 9.34f) + 8.66f);
        } else {
            i10 = 0;
        }
        return f10 + i10;
    }

    public final void f(boolean z4) {
        this.f6198f = z4;
    }

    public final void g(int i10, boolean z4) {
        if (this.I != i10) {
            this.I = i10;
            this.B.setIcon(i10, true, z4);
        }
    }

    @Override
    public final int getObserverTag() {
        return this.F;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    public final void h(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.MessageMedia r18, org.telegram.messenger.MessageObject r19, java.lang.String r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: fh.b.h(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$MessageMedia, org.telegram.messenger.MessageObject, java.lang.String, boolean):void");
    }

    public final void i(ArrayList arrayList, boolean z4) {
        int i10;
        if (arrayList != null) {
            i10 = arrayList.size();
        } else {
            i10 = 0;
        }
        this.H = i10;
        this.f6196b.d(arrayList, z4);
    }

    public final void j(int i10, boolean z4) {
        String str = null;
        if (i10 > 0) {
            str = LocaleController.formatShortNumber(i10, null);
        }
        this.f6195a.q(str, z4, true);
    }

    public final void k(int i10) {
        this.f6195a.r(i10);
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
        this.B.o(min, true);
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
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
        float min;
        int i10;
        if (j11 == 0) {
            min = 0.0f;
        } else {
            min = Math.min(1.0f, ((float) j10) / ((float) j11));
        }
        this.B.o(min, true);
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
    public final void onFailedDownload(String str, boolean z4) {
    }
}
