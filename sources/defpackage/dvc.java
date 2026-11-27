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
public final class dvc extends FrameLayout implements snb {
    public final mb0 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final evc s;

    public dvc(evc evcVar, Context context) {
        super(context);
        this.s = evcVar;
        setWillNotDraw(false);
        mb0 mb0Var = new mb0((byte) 11, context, this);
        this.a = mb0Var;
        addView(mb0Var, tre.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(2131231275);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(aob.L0(false));
        addView(view, tre.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, 2131232692);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(aob.w0(null, aob.i7, false), aob.w0(null, aob.k7, false));
        addView(checkBox, tre.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        boolean z;
        int U0;
        long j;
        long j2;
        int U02;
        de0 de0Var;
        this.h = obj;
        de0 de0Var2 = this.a;
        int i = 0;
        de0Var2.setVisibility(0);
        this.b.setVisibility(4);
        TLRPC.PhotoSize photoSize = null;
        de0Var2.setBackgroundDrawable(null);
        de0Var2.getImageReceiver().p1 = null;
        de0Var2.getImageReceiver().setAlpha(1.0f);
        de0Var2.getImageReceiver().P(null);
        de0Var2.getImageReceiver().W(null);
        if (obj == obj2) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w = xb4.w(tL_wallPaper.document.thumbs, hl.L(100.0f), false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(tL_wallPaper.document.thumbs, hl.L(180.0f), false, null, false);
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
                    hh7 hh7Var = new hh7(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true, false);
                    if (tL_wallPaper.settings.intensity < 0 && aob.I.o()) {
                        de0Var2.getImageReceiver().W(hh7Var.k);
                    } else {
                        de0Var2.setBackground(hh7Var);
                        if (Build.VERSION.SDK_INT >= 29) {
                            de0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                        }
                    }
                    TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                    U02 = hh7.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
                } else {
                    de0Var2.setBackgroundColor(aob.Y0(wallPaperSettings.background_color));
                    U02 = hl.U0(tL_wallPaper.settings.background_color, false);
                }
                if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                    de0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(hl.U0(U02, false), PorterDuff.Mode.SRC_IN);
                }
                TLRPC.Document document = tL_wallPaper.document;
                long j3 = j2;
                if (photoSize != null) {
                    jn5 c = jn5.c(photoSize, document);
                    jn5 c2 = jn5.c(w, tL_wallPaper.document);
                    de0Var = de0Var2;
                    de0Var.g(1, j3, c, c2, tL_wallPaper, "180_180", null, "jpg");
                } else {
                    jn5 c3 = jn5.c(w, document);
                    de0Var = de0Var2;
                    de0Var.g(1, j3, c3, null, tL_wallPaper, "180_180", null, "jpg");
                }
                de0Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
                return;
            }
            TLRPC.Document document2 = tL_wallPaper.document;
            if (photoSize != null) {
                de0Var2.g(1, j2, jn5.c(photoSize, document2), jn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                return;
            }
            de0Var2.g(1, j2, jn5.b(document2), jn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
        } else if (obj instanceof yvc) {
            yvc yvcVar = (yvc) obj;
            int i2 = yvcVar.d;
            int i3 = yvcVar.c;
            int i4 = yvcVar.b;
            if (yvcVar.g == null && !"d".equals(yvcVar.a)) {
                de0Var2.setImageBitmap(null);
                if (yvcVar.j) {
                    de0Var2.setBackground(new hh7(yvcVar.b, yvcVar.c, yvcVar.d, yvcVar.e, true, false));
                    return;
                } else if (i3 != 0) {
                    de0Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i4 | (-16777216), i3 | (-16777216)}));
                    return;
                } else {
                    de0Var2.setBackgroundColor(i4 | (-16777216));
                    return;
                }
            }
            if (i2 != 0) {
                hh7 hh7Var2 = new hh7(yvcVar.b, yvcVar.c, yvcVar.d, yvcVar.e, true, false);
                if (yvcVar.h >= 0.0f) {
                    de0Var2.setBackground(new hh7(yvcVar.b, yvcVar.c, yvcVar.d, yvcVar.e, true, false));
                    if (Build.VERSION.SDK_INT >= 29) {
                        de0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    de0Var2.getImageReceiver().W(hh7Var2.k);
                }
                U0 = hh7.g(i4, i3, i2, yvcVar.e);
            } else {
                de0Var2.setBackground(new hh7(yvcVar.b, yvcVar.c, 0, 0, true, false));
                U0 = hl.U0(i4, false);
            }
            int i5 = U0;
            if ("d".equals(yvcVar.a)) {
                Bitmap bitmap = yvcVar.l;
                if (bitmap == null) {
                    bitmap = hgb.d(2131623998, 100, 180, -16777216);
                    yvcVar.l = bitmap;
                }
                de0Var2.setImageBitmap(bitmap);
                de0Var2.getImageReceiver().setAlpha(Math.abs(yvcVar.h));
                return;
            }
            TLRPC.PhotoSize w3 = xb4.w(yvcVar.g.document.thumbs, 100, false, null, false);
            if (w3 != null) {
                j = w3.size;
            } else {
                j = yvcVar.g.document.size;
            }
            de0Var2.g(1, j, jn5.c(w3, yvcVar.g.document), null, yvcVar.g, "180_180", null, "jpg");
            de0Var2.getImageReceiver().setAlpha(Math.abs(yvcVar.h));
            if (Build.VERSION.SDK_INT >= 29 && i2 != 0) {
                return;
            }
            de0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(hl.U0(i5, false), PorterDuff.Mode.SRC_IN);
        } else if (obj instanceof zvc) {
            zvc zvcVar = (zvc) obj;
            File file = zvcVar.e;
            if (file != null) {
                de0Var2.o(file.getAbsolutePath(), "180_180", null);
                return;
            }
            File file2 = zvcVar.d;
            if (file2 != null) {
                de0Var2.o(file2.getAbsolutePath(), "180_180", null);
            } else if ("t".equals(zvcVar.a)) {
                de0Var2.setImageDrawable(aob.X0(true));
            } else {
                de0Var2.setImageResource(zvcVar.c);
            }
        } else if (obj instanceof ro6) {
            ro6 ro6Var = (ro6) obj;
            TLRPC.Photo photo = ro6Var.K;
            if (photo != null) {
                TLRPC.PhotoSize w4 = xb4.w(photo.sizes, hl.L(100.0f), false, null, false);
                TLRPC.PhotoSize w5 = xb4.w(ro6Var.K.sizes, hl.L(180.0f), false, null, false);
                if (w5 != w4) {
                    photoSize = w5;
                }
                if (photoSize != null) {
                    i = photoSize.size;
                }
                de0Var2.g(1, i, jn5.i(photoSize, ro6Var.K), jn5.i(w4, ro6Var.K), ro6Var, "180_180", "100_100_b", "jpg");
                return;
            }
            de0Var2.o(ro6Var.D, "180_180", null);
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
        evc evcVar = this.s;
        if (!evcVar.b || !this.c.y) {
            mb0 mb0Var = this.a;
            if (mb0Var.getImageReceiver().B() && mb0Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), evcVar.s);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.i7, false);
            int w02 = aob.w0(null, aob.k7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null && (w0 != this.n || w02 != this.r)) {
                this.n = w0;
                this.r = w02;
                checkBox.c(w0, w02);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
