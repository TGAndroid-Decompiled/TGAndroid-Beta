package fi;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;
public final class a4 extends View implements org.telegram.ui.ActionBar.a6 {
    public float D;
    public final org.telegram.ui.Components.w5 E;
    public final org.telegram.ui.Components.w5 F;
    public final org.telegram.ui.ActionBar.f6 f11592a;
    public final ImageReceiver f11593b;
    public final Paint f11594c;
    public final Paint d;
    public final org.telegram.ui.Components.i6 f11595e;
    public boolean f11596f;
    public boolean h;
    public View.OnClickListener f11597n;
    public final ic f11598r;
    public int f11599s;
    public String f11600w;
    public float f11601x;
    public float f11602y;

    public a4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f11593b = imageReceiver;
        Paint paint = new Paint(1);
        this.f11594c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
        this.f11595e = i6Var;
        this.f11598r = new ic(this);
        this.f11599s = -1;
        xq xqVar = xq.h;
        this.E = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.F = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        i6Var.setCallback(this);
        i6Var.u(-1);
        i6Var.f34516b = 17;
        i6Var.w(org.telegram.messenger.g0.L(16.0f));
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.M = org.telegram.messenger.g0.f22537q.x;
        i6Var.n(0.65f, 480L, xqVar);
        i6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f11592a = f6Var;
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var));
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        c8.ka.a(this);
    }

    public final void a(int i7, int i10, final e7 e7Var) {
        String str;
        Uri withAppendedId;
        if (this.f11599s != i7) {
            this.f11600w = null;
            this.f11593b.f();
            this.f11599s = i7;
        }
        this.f11595e.t(Integer.toString(i10 + 1), false, true);
        File file = e7Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f11600w, file.getPath())) {
                this.f11600w = e7Var.O0.getPath();
                Utilities.f21335g.c(new Runnable(this) {
                    public final a4 f13077b;

                    {
                        this.f13077b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                e7 e7Var2 = e7Var;
                                BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                e7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                                final a4 a4Var = this.f13077b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a4Var.f11593b.v0(decodeFile);
                                                return;
                                            default:
                                                a4Var.f11593b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                e7 e7Var3 = e7Var;
                                BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                e7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                                final a4 a4Var2 = this.f13077b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a4Var2.f11593b.v0(decodeFile2);
                                                return;
                                            default:
                                                a4Var2.f11593b.v0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (e7Var.K) {
            Bitmap bitmap = e7Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = e7Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f11600w, e7Var.N)) {
                    String str2 = e7Var.N;
                    this.f11600w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (e7Var.K) {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong);
                            } else {
                                withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong);
                            }
                            bitmap = getContext().getContentResolver().loadThumbnail(withAppendedId, new Size(org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f)), null);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    return;
                }
            }
            this.f11593b.v0(bitmap);
        } else {
            File file2 = e7Var.L;
            if (file2 != null && !TextUtils.equals(this.f11600w, file2.getPath())) {
                this.f11600w = e7Var.L.getPath();
                Utilities.f21335g.c(new Runnable(this) {
                    public final a4 f13077b;

                    {
                        this.f13077b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                e7 e7Var2 = e7Var;
                                BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                e7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                                final a4 a4Var = this.f13077b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a4Var.f11593b.v0(decodeFile);
                                                return;
                                            default:
                                                a4Var.f11593b.v0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                e7 e7Var3 = e7Var;
                                BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                e7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                                final a4 a4Var2 = this.f13077b;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                a4Var2.f11593b.v0(decodeFile2);
                                                return;
                                            default:
                                                a4Var2.f11593b.v0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f11596f == z9) {
            return;
        }
        this.f11596f = z9;
        if (!z10) {
            this.E.a(z9);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f11593b;
        imageReceiver.y0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f11594c;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        float d = this.E.d(this.f11596f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.f11601x = (getWidth() - org.telegram.messenger.g0.L(17.163f)) - org.telegram.messenger.g0.L(3.0f);
        this.f11602y = org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(17.833f);
        this.D = org.telegram.messenger.g0.L(12.833f);
        float d2 = this.F.d(this.h);
        float a10 = this.f11598r.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, this.f11601x, this.f11602y);
        int i7 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.f11601x, this.f11602y, this.D, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f11601x, this.f11602y, this.D - org.telegram.messenger.g0.L(1.0f), paint);
        if (i7 > 0) {
            float f10 = this.f11601x;
            float f11 = this.D;
            float f12 = f10 - f11;
            float f13 = this.f11602y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.i6 i6Var = this.f11595e;
            i6Var.o(f12, f13, f14, f13);
            i6Var.B = (int) (d2 * 255.0f);
            i6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11593b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11593b.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f11601x - org.telegram.messenger.g0.L(14.0f) && motionEvent.getX() <= this.f11601x + org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() >= this.f11602y - org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() <= this.f11602y + org.telegram.messenger.g0.L(14.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        int action = motionEvent.getAction();
        ic icVar = this.f11598r;
        if (action == 0) {
            icVar.c(z9);
        } else if (motionEvent.getAction() == 1) {
            if (icVar.f34592i && z9 && (onClickListener = this.f11597n) != null) {
                onClickListener.onClick(this);
            }
            icVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
        }
        if (icVar.f34592i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f11597n = onClickListener;
    }

    public void setPosition(int i7) {
        String num;
        if (i7 < 0) {
            num = "";
        } else {
            num = Integer.toString(i7 + 1);
        }
        this.f11595e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.f11592a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f11595e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
