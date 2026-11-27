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
public final class idc extends Drawable implements em, zx, fn7 {
    public final o15 a;
    public final byte b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final wl h;
    public final hdc n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public idc(TLRPC.VideoSize videoSize, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        o15 o15Var = new o15();
        this.a = o15Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = yac.t0;
        this.b = i;
        this.d = z;
        int o = vm2.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i2 = vm2.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i2 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i3 = vm2.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i3 = 0;
        }
        o15Var.d(o, i2, i3, videoSize.background_colors.size() > 3 ? vm2.o(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i == 1 && z) {
                i4 = 7;
            } else if (i == 2) {
                i4 = 15;
            } else {
                i4 = 8;
            }
            wl wlVar = new wl(i4, yac.t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = wlVar;
            wlVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            hdc hdcVar = new hdc(this);
            this.n = hdcVar;
            hdcVar.K0 = true;
            if (i == 1) {
                hdcVar.N(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            wl wlVar = this.h;
            if (wlVar != null) {
                wlVar.n(this);
            }
            hdc hdcVar = this.n;
            if (hdcVar != null) {
                hdcVar.K();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.K();
            }
        }
        if (this.x != null) {
            jn7.f(this.s).n(this, jn7.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.c = imageReceiver.X0[0];
            HashSet hashSet = this.f;
            if (hashSet.isEmpty()) {
                wl wlVar = this.h;
                if (wlVar != null) {
                    wlVar.a(this);
                }
                hdc hdcVar = this.n;
                if (hdcVar != null) {
                    hdcVar.I();
                }
                ImageReceiver imageReceiver2 = this.r;
                if (imageReceiver2 != null) {
                    imageReceiver2.I();
                }
            }
            hashSet.add(imageReceiver);
            if (this.x != null) {
                jn7.f(this.s).b(this, jn7.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idc.d():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.B0 && !this.w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        o15 o15Var = this.a;
        o15Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = o15Var.c;
        if (this.e != null) {
            this.c = imageReceiver.X0[0];
        }
        float f = this.c;
        if (f == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(o15Var.h, f, f, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        wl wlVar = this.h;
        if (wlVar != null) {
            nl nlVar = wlVar.k;
            if (nlVar != null) {
                nlVar.q0((int) ((width << 1) * 0.13f));
            }
            wlVar.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            wlVar.draw(canvas);
        }
        hdc hdcVar = this.n;
        if (hdcVar != null) {
            float f2 = width << 1;
            hdcVar.q0((int) (0.13f * f2));
            hdcVar.i0(centerX - width, centerY - width, f2, f2);
            hdcVar.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && idc.class == obj.getClass()) {
                idc idcVar = (idc) obj;
                wl wlVar = idcVar.h;
                if (this.b == idcVar.b) {
                    o15 o15Var = this.a;
                    int i = o15Var.d;
                    o15 o15Var2 = idcVar.a;
                    if (i == o15Var2.d && o15Var.e == o15Var2.e && o15Var.f == o15Var2.f && o15Var.g == o15Var2.g) {
                        wl wlVar2 = this.h;
                        if (wlVar2 != null && wlVar != null) {
                            if (wlVar2.h() == wlVar.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = idcVar.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        wl wlVar = this.h;
        if (wlVar != null) {
            wlVar.setAlpha(i);
        }
    }

    @Override
    public final void a(e29 e29Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
