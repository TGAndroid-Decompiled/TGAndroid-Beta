package hi;

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
import org.telegram.ui.Components.kr;
public final class f4 extends View implements org.telegram.ui.ActionBar.c6 {
    public float E;
    public final org.telegram.ui.Components.c6 F;
    public final org.telegram.ui.Components.c6 G;
    public final org.telegram.ui.ActionBar.i6 f14432a;
    public final ImageReceiver f14433b;
    public final Paint f14434c;
    public final Paint d;
    public final org.telegram.ui.Components.m6 f14435e;
    public boolean f14436f;
    public boolean h;
    public View.OnClickListener f14437n;
    public final org.telegram.ui.Components.lc f14438r;
    public int f14439s;
    public String f14440w;
    public float f14441x;
    public float f14442y;

    public f4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f14433b = imageReceiver;
        Paint paint = new Paint(1);
        this.f14434c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false);
        this.f14435e = m6Var;
        this.f14438r = new org.telegram.ui.Components.lc(this);
        this.f14439s = -1;
        kr krVar = kr.h;
        this.F = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        m6Var.setCallback(this);
        m6Var.u(-1);
        m6Var.f37394b = 17;
        m6Var.w(org.telegram.messenger.g0.L(16.0f));
        m6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var.N = org.telegram.messenger.g0.f24226q.x;
        m6Var.n(0.65f, 480L, krVar);
        m6Var.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.f14432a = i6Var;
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        imageReceiver.K0(org.telegram.messenger.g0.L(6.0f));
        c8.sa.a(this);
    }

    public final void a(int i7, int i10, final x7 x7Var) {
        String str;
        Uri withAppendedId;
        if (this.f14439s != i7) {
            this.f14440w = null;
            this.f14433b.f();
            this.f14439s = i7;
        }
        this.f14435e.t(Integer.toString(i10 + 1), false, true);
        File file = x7Var.O0;
        if (file != null) {
            if (!TextUtils.equals(this.f14440w, file.getPath())) {
                this.f14440w = x7Var.O0.getPath();
                Utilities.f22879g.c(new Runnable(this) {
                    public final f4 f14266b;

                    {
                        this.f14266b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                x7 x7Var2 = x7Var;
                                BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                x7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                                final f4 f4Var = this.f14266b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var.f14433b.w0(decodeFile);
                                                return;
                                            default:
                                                f4Var.f14433b.w0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                x7 x7Var3 = x7Var;
                                BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                x7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                                final f4 f4Var2 = this.f14266b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var2.f14433b.w0(decodeFile2);
                                                return;
                                            default:
                                                f4Var2.f14433b.w0(decodeFile2);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        } else if (x7Var.K) {
            Bitmap bitmap = x7Var.M0;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap == null && (str = x7Var.N) != null && str.startsWith("vthumb://")) {
                if (!TextUtils.equals(this.f14440w, x7Var.N)) {
                    String str2 = x7Var.N;
                    this.f14440w = str2;
                    long parseLong = Long.parseLong(str2.substring(9));
                    if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                        try {
                            if (x7Var.K) {
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
            this.f14433b.w0(bitmap);
        } else {
            File file2 = x7Var.L;
            if (file2 != null && !TextUtils.equals(this.f14440w, file2.getPath())) {
                this.f14440w = x7Var.L.getPath();
                Utilities.f22879g.c(new Runnable(this) {
                    public final f4 f14266b;

                    {
                        this.f14266b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                x7 x7Var2 = x7Var;
                                BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                                int L = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                x7.C(options, L);
                                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options.inDither = true;
                                options.inJustDecodeBounds = false;
                                final Bitmap decodeFile = BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                                final f4 f4Var = this.f14266b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var.f14433b.w0(decodeFile);
                                                return;
                                            default:
                                                f4Var.f14433b.w0(decodeFile);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inJustDecodeBounds = true;
                                x7 x7Var3 = x7Var;
                                BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                                int L2 = org.telegram.messenger.g0.L(94.0f);
                                org.telegram.messenger.g0.L(112.0f);
                                x7.C(options2, L2);
                                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                options2.inDither = true;
                                options2.inJustDecodeBounds = false;
                                final Bitmap decodeFile2 = BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                                final f4 f4Var2 = this.f14266b;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                f4Var2.f14433b.w0(decodeFile2);
                                                return;
                                            default:
                                                f4Var2.f14433b.w0(decodeFile2);
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

    public final void b(boolean z10, boolean z11) {
        if (this.f14436f == z10) {
            return;
        }
        this.f14436f = z10;
        if (!z11) {
            this.F.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageReceiver imageReceiver = this.f14433b;
        imageReceiver.z0(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f));
        imageReceiver.h(canvas, null);
        Paint paint = this.f14434c;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        float d = this.F.d(this.f14436f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.f14441x = (getWidth() - org.telegram.messenger.g0.L(17.163f)) - org.telegram.messenger.g0.L(3.0f);
        this.f14442y = org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(17.833f);
        this.E = org.telegram.messenger.g0.L(12.833f);
        float d2 = this.G.d(this.h);
        float a10 = this.f14438r.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, this.f14441x, this.f14442y);
        int i7 = (d2 > 0.0f ? 1 : (d2 == 0.0f ? 0 : -1));
        if (i7 > 0) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.f14441x, this.f14442y, this.E, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.f14441x, this.f14442y, this.E - org.telegram.messenger.g0.L(1.0f), paint);
        if (i7 > 0) {
            float f10 = this.f14441x;
            float f11 = this.E;
            float f12 = f10 - f11;
            float f13 = this.f14442y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.m6 m6Var = this.f14435e;
            m6Var.o(f12, f13, f14, f13);
            m6Var.C = (int) (d2 * 255.0f);
            m6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f14433b.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14433b.S();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View.OnClickListener onClickListener;
        if (motionEvent.getX() >= this.f14441x - org.telegram.messenger.g0.L(14.0f) && motionEvent.getX() <= this.f14441x + org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() >= this.f14442y - org.telegram.messenger.g0.L(14.0f) && motionEvent.getY() <= this.f14442y + org.telegram.messenger.g0.L(14.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Components.lc lcVar = this.f14438r;
        if (action == 0) {
            lcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (lcVar.f37109i && z10 && (onClickListener = this.f14437n) != null) {
                onClickListener.onClick(this);
            }
            lcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            lcVar.c(false);
        }
        if (lcVar.f37109i || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.f14437n = onClickListener;
    }

    public void setPosition(int i7) {
        String num;
        if (i7 < 0) {
            num = "";
        } else {
            num = Integer.toString(i7 + 1);
        }
        this.f14435e.t(num, true, true);
    }

    @Override
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.f14432a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f14435e && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
