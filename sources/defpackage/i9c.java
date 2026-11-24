package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i9c extends Drawable implements dm, yx, gk7 {
    public final kz4 a;
    public final byte b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final vl h;
    public final h9c n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public i9c(TLRPC.VideoSize videoSize, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        kz4 kz4Var = new kz4();
        this.a = kz4Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = y6c.t0;
        this.b = i;
        this.d = z;
        int o = bm2.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i2 = bm2.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i2 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i3 = bm2.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i3 = 0;
        }
        kz4Var.d(o, i2, i3, videoSize.background_colors.size() > 3 ? bm2.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i == 1 && z) {
                i4 = 7;
            } else if (i == 2) {
                i4 = 15;
            } else {
                i4 = 8;
            }
            vl vlVar = new vl(i4, y6c.t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = vlVar;
            vlVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            h9c h9cVar = new h9c(this);
            this.n = h9cVar;
            h9cVar.K0 = true;
            if (i == 1) {
                h9cVar.N(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            vl vlVar = this.h;
            if (vlVar != null) {
                vlVar.n(this);
            }
            h9c h9cVar = this.n;
            if (h9cVar != null) {
                h9cVar.K();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.K();
            }
        }
        if (this.x != null) {
            kk7.f(this.s).n(this, kk7.A0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.c = imageReceiver.X0[0];
            HashSet hashSet = this.f;
            if (hashSet.isEmpty()) {
                vl vlVar = this.h;
                if (vlVar != null) {
                    vlVar.a(this);
                }
                h9c h9cVar = this.n;
                if (h9cVar != null) {
                    h9cVar.I();
                }
                ImageReceiver imageReceiver2 = this.r;
                if (imageReceiver2 != null) {
                    imageReceiver2.I();
                }
            }
            hashSet.add(imageReceiver);
            if (this.x != null) {
                kk7.f(this.s).b(this, kk7.A0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9c.d():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.A0 && !this.w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        kz4 kz4Var = this.a;
        kz4Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = kz4Var.c;
        if (this.e != null) {
            this.c = imageReceiver.X0[0];
        }
        float f = this.c;
        if (f == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(kz4Var.h, f, f, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        vl vlVar = this.h;
        if (vlVar != null) {
            ml mlVar = vlVar.k;
            if (mlVar != null) {
                mlVar.q0((int) ((width << 1) * 0.13f));
            }
            vlVar.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            vlVar.draw(canvas);
        }
        h9c h9cVar = this.n;
        if (h9cVar != null) {
            float f2 = width << 1;
            h9cVar.q0((int) (0.13f * f2));
            h9cVar.i0(centerX - width, centerY - width, f2, f2);
            h9cVar.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && i9c.class == obj.getClass()) {
                i9c i9cVar = (i9c) obj;
                vl vlVar = i9cVar.h;
                if (this.b == i9cVar.b) {
                    kz4 kz4Var = this.a;
                    int i = kz4Var.d;
                    kz4 kz4Var2 = i9cVar.a;
                    if (i == kz4Var2.d && kz4Var.e == kz4Var2.e && kz4Var.f == kz4Var2.f && kz4Var.g == kz4Var2.g) {
                        vl vlVar2 = this.h;
                        if (vlVar2 != null && vlVar != null) {
                            if (vlVar2.h() == vlVar.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = i9cVar.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidate() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
    }

    @Override
    public final void setAlpha(int i) {
        this.a.c.setAlpha(i);
        vl vlVar = this.h;
        if (vlVar != null) {
            vlVar.setAlpha(i);
        }
    }

    @Override
    public final void a(ry8 ry8Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
