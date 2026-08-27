package bh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import gf.s;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import ud.g;

public final class b extends Drawable implements DownloadController.FileDownloadProgressListener {
    public final RadialProgress2 A;
    public MessageObject B;
    public final b6.a C;
    public String D;
    public final int E;
    public boolean F;
    public int G;
    public int H;

    public final i6 f2171a;

    public final d9 f2172b;

    public final ImageReceiver f2173c;
    public final s1 d;

    public final int f2174e;

    public boolean f2175f;
    public boolean h;

    public boolean f2176n;

    public boolean f2177r;

    public Drawable f2178s;
    public boolean v;

    public final Paint f2179w;

    public final Paint f2180x;

    public final ud.a f2181y;

    public b(int i10, s1 s1Var) {
        Paint paint = new Paint(1);
        this.f2179w = paint;
        this.f2180x = new Paint(1);
        this.C = new b6.a((char) 0, 18);
        this.f2174e = i10;
        this.d = s1Var;
        this.f2181y = new ud.a(s1Var, er.h, 380L);
        i6 i6Var = new i6(false, false, false, false);
        this.f2171a = i6Var;
        i6Var.f29239b = 21;
        i6Var.t(AndroidUtilities.dp(11.0f));
        i6Var.setCallback(s1Var);
        this.f2172b = new d9(i10, s1Var, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(8.33f), AndroidUtilities.dpf2(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(s1Var);
        this.f2173c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(5.0f));
        paint.setColor(1073741824);
        RadialProgress2 radialProgress2 = new RadialProgress2(s1Var, null);
        this.A = radialProgress2;
        radialProgress2.setCircleRadius(AndroidUtilities.dp(18.0f));
        radialProgress2.d = -1;
        this.E = DownloadController.getInstance(i10).generateObserverTag();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
        this.f2173c.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, photo), "36_36", ImageLocation.getForObject(closestPhotoSizeWithSize, photo), "36_36_b", null, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, obj, 1);
    }

    public final void b(boolean z10) {
        if (this.B.isSending() || this.B.isEditing()) {
            return;
        }
        if (TextUtils.isEmpty(this.D) || !FileLoader.getInstance(this.f2174e).isLoadingFile(this.D)) {
            g(this.v ? 0 : 4, z10);
        } else {
            g(3, z10);
        }
    }

    public final void c(Canvas canvas) {
        int iW0;
        Rect bounds = getBounds();
        int iDp = AndroidUtilities.dp(this.f2175f ? 56.33f : 19.0f);
        if (this.f2181y.f48497e > 0.0f) {
            g gVar = this.f2172b.f27675c.d;
            float f10 = gVar.f48512c.f48522a;
            int i10 = (int) gVar.f48514f.f48522a;
            int iLerp = (bounds.right - iDp) - AndroidUtilities.lerp(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + i10, f10);
            if (f10 > 0.0f) {
                d9 d9Var = this.f2172b;
                d9Var.f27679i = (int) (this.f2181y.f48497e * 255.0f);
                d9Var.setBounds((bounds.right - iDp) - i10, bounds.bottom - AndroidUtilities.dp(31.33f), bounds.right - iDp, bounds.bottom);
                this.f2172b.c(canvas);
            }
            int iDp2 = bounds.bottom - AndroidUtilities.dp(21.33f);
            i6 i6Var = this.f2171a;
            i6Var.f29257w = (int) (this.f2181y.f48497e * 255.0f);
            i6Var.setBounds(bounds.left, AndroidUtilities.dp(15.0f) + iDp2, iLerp, iDp2 - AndroidUtilities.dp(15.0f));
            this.f2171a.draw(canvas);
        }
        if (this.h) {
            int iDp3 = AndroidUtilities.dp(36.0f);
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(y1.B(9.0f, bounds.right, iDp3), y1.B(4.0f, bounds.bottom, iDp3), bounds.right - AndroidUtilities.dp(9.0f), bounds.bottom - AndroidUtilities.dp(4.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            this.A.f26464a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.f2173c.setImageCoords(rect);
            if (!this.f2176n || this.f2177r) {
                this.f2173c.draw(canvas);
            }
            if (this.v || this.f2176n) {
                if (!this.f2176n || this.f2177r) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f2179w);
                } else {
                    this.f2180x.setColor(i0.b.k(g6.w0(null, this.B.isOutOwner() ? g6.fc : g6.f23077ec, false), 16));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f2180x);
                }
            }
            if (this.f2176n) {
                if (this.f2178s == null) {
                    this.f2178s = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.media_link_24).mutate();
                }
                Drawable drawable = this.f2178s;
                b6.a aVar = this.C;
                if (this.f2177r) {
                    iW0 = -1;
                } else {
                    iW0 = g6.w0(null, this.B.isOutOwner() ? g6.f23325sb : g6.f23240nd, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                aVar.getClass();
                if (((PorterDuffColorFilter) aVar.f2033b) == null || aVar.f2034c != iW0 || ((PorterDuff.Mode) aVar.d) != mode) {
                    aVar.f2033b = new PorterDuffColorFilter(iW0, mode);
                    aVar.f2034c = iW0;
                    aVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) aVar.f2033b);
                s.e(this.f2178s, rectF.centerX(), rectF.centerY(), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), 17);
                this.f2178s.draw(canvas);
            }
            b(true);
            if (this.F) {
                this.A.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        d9 d9Var = this.f2172b;
        float fD = this.f2171a.d() + d9Var.f27675c.d.f48514f.f48522a;
        float fDp = d9Var.f27675c.d.f48512c.f48522a * AndroidUtilities.dp(4.0f);
        float f11 = this.f2181y.f48497e;
        return (f10 * f11) + (fDp * f11) + fD;
    }

    @Override
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        float f10 = this.f2171a.d;
        int i10 = this.G;
        return f10 + (i10 > 0 ? AndroidUtilities.dp((i10 * 9.34f) + 8.66f) : 0);
    }

    public final void f(boolean z10) {
        this.f2175f = z10;
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

    public final void h(MessageObject messageObject, TLRPC.MessageMedia messageMedia, MessageObject messageObject2, String str, boolean z10) {
        ImageReceiver imageReceiver;
        boolean z11;
        TLRPC.GeoPoint geoPoint;
        this.B = messageObject;
        String str2 = this.D;
        this.F = false;
        this.D = null;
        ImageReceiver imageReceiver2 = this.f2173c;
        if (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            imageReceiver = imageReceiver2;
            z11 = false;
        } else {
            this.f2177r = false;
            this.f2176n = false;
            this.v = false;
            z11 = true;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.WebPage webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                this.f2176n = true;
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    this.f2177r = true;
                    a(photo, messageObject2);
                } else {
                    imageReceiver2.clearImage();
                }
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.F = true;
                this.D = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                a(tL_messageMediaPhoto.photo, messageObject2);
            } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                TLRPC.Document document = tL_messageMediaDocument.document;
                if (document == null) {
                    imageReceiver = imageReceiver2;
                } else {
                    this.D = !TextUtils.isEmpty(str) ? str : MessageObject.getFileName(messageMedia);
                    if (MessageObject.isVideoDocument(tL_messageMediaDocument.document)) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true);
                        this.v = true;
                        this.F = true;
                        ImageLocation forObject = ImageLocation.getForObject(closestPhotoSizeWithSize2, document);
                        ImageLocation forObject2 = ImageLocation.getForObject(closestPhotoSizeWithSize, document);
                        imageReceiver = imageReceiver2;
                        imageReceiver.setImage(forObject, "36_36", forObject2, "36_36_b", null, closestPhotoSizeWithSize2 != null ? closestPhotoSizeWithSize2.size : 0L, null, messageObject2, 1);
                    } else {
                        imageReceiver = imageReceiver2;
                        boolean z12 = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
                        boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(document, true);
                        if (z12 || zIsAnimatedStickerDocument) {
                            imageReceiver.setImage(ImageLocation.getForDocument(document), "36_36", DocumentObject.getSvgThumb(document, g6.f23203lc, 1.0f), document.size, z12 ? "webp" : null, messageObject2, 1);
                        }
                    }
                }
                z11 = false;
            } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                ImageLocation forWebFile = ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 36, 36, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density))));
                imageReceiver = imageReceiver2;
                imageReceiver.setImage(forWebFile, (String) null, (ImageLocation) null, (String) null, (Drawable) null, messageObject2, 0);
            } else {
                imageReceiver = imageReceiver2;
                z11 = false;
            }
            imageReceiver = imageReceiver2;
        }
        this.h = z11;
        if (!z11) {
            imageReceiver.clearImage();
        }
        this.A.setColors(this.v ? 0 : g6.w0(null, g6.f23205le, false), this.v ? 0 : g6.w0(null, g6.f23223me, false), g6.w0(null, g6.f23241ne, false), g6.w0(null, g6.f23258oe, false));
        if (!TextUtils.equals(str2, this.D)) {
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            int i10 = this.f2174e;
            if (!zIsEmpty) {
                DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            }
            if (!TextUtils.isEmpty(this.D)) {
                DownloadController.getInstance(i10).addLoadingFileObserver(this.D, this);
            }
        }
        b(z10);
    }

    public final void i(ArrayList arrayList, boolean z10) {
        this.G = arrayList != null ? arrayList.size() : 0;
        this.f2172b.d(arrayList, z10);
    }

    public final void j(int i10, boolean z10) {
        this.f2171a.q(i10 > 0 ? LocaleController.formatShortNumber(i10, null) : null, z10, true);
    }

    public final void k(int i10) {
        this.f2171a.r(i10);
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        int i10;
        float fMin = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.o(fMin, true);
        if (fMin < 1.0f) {
            i10 = 3;
        } else {
            i10 = this.v ? 0 : 4;
        }
        g(i10, true);
        this.d.invalidate();
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
        int i10;
        float fMin = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.A.o(fMin, true);
        if (fMin < 1.0f) {
            i10 = 3;
        } else {
            i10 = this.v ? 0 : 4;
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
