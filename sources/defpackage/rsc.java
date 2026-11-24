package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;
public final class rsc extends FrameLayout implements vlb {
    public final kc0 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final ssc s;

    public rsc(ssc sscVar, Context context) {
        super(context);
        this.s = sscVar;
        setWillNotDraw(false);
        kc0 kc0Var = new kc0((byte) 11, context, this);
        this.a = kc0Var;
        addView(kc0Var, qoe.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(2131231276);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(cmb.L0(false));
        addView(view, qoe.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232693);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(cmb.w0(null, cmb.h7, false), cmb.w0(null, cmb.j7, false));
        addView(checkBox, qoe.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z;
        int U0;
        long j;
        long j2;
        int U02;
        bf0 bf0Var;
        this.h = obj;
        bf0 bf0Var2 = this.a;
        int i = 0;
        bf0Var2.setVisibility(0);
        this.b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        bf0Var2.setBackgroundDrawable(null);
        bf0Var2.getImageReceiver().p1 = null;
        bf0Var2.getImageReceiver().setAlpha(1.0f);
        bf0Var2.getImageReceiver().P(null);
        bf0Var2.getImageReceiver().W(null);
        if (obj == obj2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w = bc4.w(tL_wallPaper.document.thumbs, gm.L(100.0f), false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(tL_wallPaper.document.thumbs, gm.L(180.0f), false, null, false);
            if (w2 != w) {
                photoSize = w2;
            }
            if (photoSize != null) {
                j2 = photoSize.size;
            } else {
                j2 = tL_wallPaper.document.size;
            }
            if (tL_wallPaper.pattern) {
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                if (wallPaperSettings.third_background_color != 0) {
                    TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                    ah7 ah7Var = new ah7(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true, false);
                    if (tL_wallPaper.settings.intensity < 0 && cmb.I.o()) {
                        bf0Var2.getImageReceiver().W(ah7Var.k);
                    } else {
                        bf0Var2.setBackground(ah7Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            bf0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    U02 = ah7.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    bf0Var2.setBackgroundColor(cmb.Y0(wallPaperSettings.background_color));
                    U02 = gm.U0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    bf0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(gm.U0(U02, false), PorterDuff.Mode.SRC_IN);
                }
                TLRPC.Document document = tL_wallPaper.document;
                long j3 = j2;
                if (photoSize != null) {
                    gn5 c = gn5.c(photoSize, document);
                    gn5 c2 = gn5.c(w, tL_wallPaper.document);
                    bf0Var = bf0Var2;
                    bf0Var.g(1, j3, c, c2, tL_wallPaper, "180_180", null, "jpg");
                } else {
                    gn5 c3 = gn5.c(w, document);
                    bf0Var = bf0Var2;
                    bf0Var.g(1, j3, c3, null, tL_wallPaper, "180_180", null, "jpg");
                }
                bf0Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
                return;
            }
            TLRPC.Document document2 = tL_wallPaper.document;
            if (photoSize != null) {
                bf0Var2.g(1, j2, gn5.c(photoSize, document2), gn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                return;
            }
            bf0Var2.g(1, j2, gn5.b(document2), gn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
        } else if (obj instanceof mtc) {
            mtc mtcVar = (mtc) obj;
            int i2 = mtcVar.d;
            int i3 = mtcVar.c;
            int i4 = mtcVar.b;
            if (mtcVar.g == null && !"d".equals(mtcVar.a)) {
                bf0Var2.setImageBitmap(null);
                if (mtcVar.j) {
                    bf0Var2.setBackground(new ah7(mtcVar.b, mtcVar.c, mtcVar.d, mtcVar.e, true, false));
                    return;
                } else if (i3 != 0) {
                    bf0Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i4 | (-16777216), i3 | (-16777216)}));
                    return;
                } else {
                    bf0Var2.setBackgroundColor(i4 | (-16777216));
                    return;
                }
            }
            if (i2 != 0) {
                ah7 ah7Var2 = new ah7(mtcVar.b, mtcVar.c, mtcVar.d, mtcVar.e, true, false);
                if (mtcVar.h >= 0.0f) {
                    bf0Var2.setBackground(new ah7(mtcVar.b, mtcVar.c, mtcVar.d, mtcVar.e, true, false));
                    if (Build.VERSION.SDK_INT >= 29) {
                        bf0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    bf0Var2.getImageReceiver().W(ah7Var2.k);
                }
                U0 = ah7.g(i4, i3, i2, mtcVar.e);
            } else {
                bf0Var2.setBackground(new ah7(mtcVar.b, mtcVar.c, 0, 0, true, false));
                U0 = gm.U0(i4, false);
            }
            int i5 = U0;
            if ("d".equals(mtcVar.a)) {
                Bitmap bitmap = mtcVar.l;
                if (bitmap == null) {
                    bitmap = neb.d(2131623998, 100, 180, -16777216);
                    mtcVar.l = bitmap;
                }
                bf0Var2.setImageBitmap(bitmap);
                bf0Var2.getImageReceiver().setAlpha(Math.abs(mtcVar.h));
                return;
            }
            TLRPC.PhotoSize w3 = bc4.w(mtcVar.g.document.thumbs, 100, false, null, false);
            if (w3 != null) {
                j = w3.size;
            } else {
                j = mtcVar.g.document.size;
            }
            bf0Var2.g(1, j, gn5.c(w3, mtcVar.g.document), null, mtcVar.g, "180_180", null, "jpg");
            bf0Var2.getImageReceiver().setAlpha(Math.abs(mtcVar.h));
            if (Build.VERSION.SDK_INT >= 29 && i2 != 0) {
                return;
            }
            bf0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(gm.U0(i5, false), PorterDuff.Mode.SRC_IN);
        } else if (obj instanceof ntc) {
            ntc ntcVar = (ntc) obj;
            File file = ntcVar.e;
            if (file != null) {
                bf0Var2.o(file.getAbsolutePath(), "180_180", null);
                return;
            }
            File file2 = ntcVar.d;
            if (file2 != null) {
                bf0Var2.o(file2.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(ntcVar.a)) {
                bf0Var2.setImageDrawable(cmb.X0(true));
            } else {
                bf0Var2.setImageResource(ntcVar.c);
            }
        } else if (obj instanceof no6) {
            no6 no6Var = (no6) obj;
            TLRPC.Photo photo = no6Var.K;
            if (photo != null) {
                TLRPC.PhotoSize w4 = bc4.w(photo.sizes, gm.L(100.0f), false, null, false);
                TLRPC.PhotoSize w5 = bc4.w(no6Var.K.sizes, gm.L(180.0f), false, null, false);
                if (w5 != w4) {
                    photoSize = w5;
                }
                if (photoSize != null) {
                    i = photoSize.size;
                }
                bf0Var2.g(1, i, gn5.i(photoSize, no6Var.K), gn5.i(w4, no6Var.K), no6Var, "180_180", "100_100_b", "jpg");
                return;
            }
            bf0Var2.o(no6Var.D, "180_180", null);
        } else {
            this.e = false;
        }
    }

    @Override
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ssc sscVar = this.s;
        if (!sscVar.b || !this.c.y) {
            kc0 kc0Var = this.a;
            if (kc0Var.getImageReceiver().B() && kc0Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), sscVar.s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.h7, false);
            int w02 = cmb.w0(null, cmb.j7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null && (w0 != this.n || w02 != this.r)) {
                this.n = w0;
                this.r = w02;
                checkBox.c(w0, w02);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
