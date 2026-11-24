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
public final class jbc extends Drawable implements dn, zy, jm7 {
    public final j15 a;
    public final byte b;
    public float c;
    public final boolean d;
    public ImageReceiver e;
    public final HashSet f;
    public final vm h;
    public final ibc n;
    public final ImageReceiver r;
    public final int s;
    public boolean w;
    public final TLRPC.TL_videoSizeStickerMarkup x;

    public jbc(TLRPC.VideoSize videoSize, boolean z, int i) {
        int i2;
        int i3;
        int i4;
        j15 j15Var = new j15();
        this.a = j15Var;
        this.f = new HashSet();
        this.r = new ImageReceiver(null);
        this.s = z8c.t0;
        this.b = i;
        this.d = z;
        int p = on2.p(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i2 = on2.p(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i2 = 0;
        }
        if (videoSize.background_colors.size() > 2) {
            i3 = on2.p(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i3 = 0;
        }
        j15Var.d(p, i2, i3, videoSize.background_colors.size() > 3 ? on2.p(videoSize.background_colors.get(3).intValue(), 255) : 0);
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = (TLRPC.TL_videoSizeEmojiMarkup) videoSize;
            if (i == 1 && z) {
                i4 = 7;
            } else if (i == 2) {
                i4 = 15;
            } else {
                i4 = 8;
            }
            vm vmVar = new vm(i4, z8c.t0, tL_videoSizeEmojiMarkup.emoji_id);
            this.h = vmVar;
            vmVar.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup) {
            this.x = (TLRPC.TL_videoSizeStickerMarkup) videoSize;
            ibc ibcVar = new ibc(this);
            this.n = ibcVar;
            ibcVar.K0 = true;
            if (i == 1) {
                ibcVar.N(2);
            }
            d();
        }
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        HashSet hashSet = this.f;
        hashSet.remove(imageReceiver);
        if (hashSet.isEmpty()) {
            vm vmVar = this.h;
            if (vmVar != null) {
                vmVar.n(this);
            }
            ibc ibcVar = this.n;
            if (ibcVar != null) {
                ibcVar.K();
            }
            ImageReceiver imageReceiver2 = this.r;
            if (imageReceiver2 != null) {
                imageReceiver2.K();
            }
        }
        if (this.x != null) {
            nm7.f(this.s).n(this, nm7.B0);
        }
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        if (imageReceiver != null) {
            this.c = imageReceiver.X0[0];
            HashSet hashSet = this.f;
            if (hashSet.isEmpty()) {
                vm vmVar = this.h;
                if (vmVar != null) {
                    vmVar.a(this);
                }
                ibc ibcVar = this.n;
                if (ibcVar != null) {
                    ibcVar.I();
                }
                ImageReceiver imageReceiver2 = this.r;
                if (imageReceiver2 != null) {
                    imageReceiver2.I();
                }
            }
            hashSet.add(imageReceiver);
            if (this.x != null) {
                nm7.f(this.s).b(this, nm7.B0);
            }
        }
    }

    public final void d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbc.d():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B0 && !this.w) {
            d();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        j15 j15Var = this.a;
        j15Var.b(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
        Paint paint = j15Var.c;
        if (this.e != null) {
            this.c = imageReceiver.X0[0];
        }
        float f = this.c;
        if (f == 0.0f) {
            canvas.drawRect(getBounds(), paint);
        } else {
            canvas.drawRoundRect(j15Var.h, f, f, paint);
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        int width = ((int) (getBounds().width() * 0.7f)) >> 1;
        vm vmVar = this.h;
        if (vmVar != null) {
            mm mmVar = vmVar.k;
            if (mmVar != null) {
                mmVar.q0((int) ((width << 1) * 0.13f));
            }
            vmVar.setBounds(centerX - width, centerY - width, centerX + width, centerY + width);
            vmVar.draw(canvas);
        }
        ibc ibcVar = this.n;
        if (ibcVar != null) {
            float f2 = width << 1;
            ibcVar.q0((int) (0.13f * f2));
            ibcVar.i0(centerX - width, centerY - width, f2, f2);
            ibcVar.h(canvas, null);
        }
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup;
        if (this != obj) {
            if (obj != null && jbc.class == obj.getClass()) {
                jbc jbcVar = (jbc) obj;
                vm vmVar = jbcVar.h;
                if (this.b == jbcVar.b) {
                    j15 j15Var = this.a;
                    int i = j15Var.d;
                    j15 j15Var2 = jbcVar.a;
                    if (i == j15Var2.d && j15Var.e == j15Var2.e && j15Var.f == j15Var2.f && j15Var.g == j15Var2.g) {
                        vm vmVar2 = this.h;
                        if (vmVar2 != null && vmVar != null) {
                            if (vmVar2.h() == vmVar.h()) {
                                return true;
                            }
                            return false;
                        }
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup2 = this.x;
                        if (tL_videoSizeStickerMarkup2 != null && (tL_videoSizeStickerMarkup = jbcVar.x) != null && tL_videoSizeStickerMarkup2.stickerset.id == tL_videoSizeStickerMarkup.stickerset.id && tL_videoSizeStickerMarkup2.sticker_id == tL_videoSizeStickerMarkup.sticker_id) {
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
        vm vmVar = this.h;
        if (vmVar != null) {
            vmVar.setAlpha(i);
        }
    }

    @Override
    public final void a(s09 s09Var) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
