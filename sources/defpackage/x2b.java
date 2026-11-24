package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public abstract class x2b {
    public static kz4 b;
    public static kz4 c;
    public static kz4 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static tgb i;
    public static int j;
    public static BitmapDrawable m;
    public static final kz4[] a = new kz4[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final sv o = new sv((byte) 10);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(jia jiaVar) {
        String M0 = k96.M0(2131743561, null);
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            q6c q6cVar = new q6c();
            valueOf.setSpan(q6cVar, valueOf.length() - 1, valueOf.length(), 0);
            q6cVar.a = jiaVar;
            q6cVar.n = true;
            jiaVar.l(valueOf, false);
            return;
        }
        jiaVar.l(M0, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == y6c.h(y6c.t0).n && !v(storyItem)) {
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews == null) {
                storyViews = new TL_stories.TL_storyViews();
                storyItem.views = storyViews;
            }
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.id));
            }
        }
    }

    public static void c(wjb wjbVar) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(gl.N(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v0 = bkb.v0(bkb.c6, wjbVar);
        if (j != v0) {
            j = v0;
            float B = gl.B(v0);
            if (B < 0.721f) {
                int i2 = (B > 0.25f ? 1 : (B == 0.25f ? 0 : -1));
                Paint paint2 = e;
                if (i2 < 0) {
                    paint2.setColor(bm2.f(0.2f, v0, -1));
                    return;
                } else {
                    paint2.setColor(bm2.f(0.44f, v0, -1));
                    return;
                }
            }
            e.setColor(bm2.f(0.2f, v0, -16777216));
        }
    }

    public static void d(wjb wjbVar, boolean z) {
        int i2;
        Paint[] paintArr = k;
        if (paintArr[z ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z ? 1 : 0].setStrokeWidth(gl.N(1.3f));
            paintArr[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z) {
            i2 = bkb.r8;
        } else {
            i2 = bkb.L8;
        }
        int v0 = bkb.v0(i2, wjbVar);
        int[] iArr = l;
        if (iArr[z ? 1 : 0] != v0) {
            iArr[z ? 1 : 0] = v0;
            float B = gl.B(v0);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    paintArr[z ? 1 : 0].setColor(bm2.f(0.2f, v0, -1));
                    return;
                } else {
                    paintArr[z ? 1 : 0].setColor(bm2.f(0.44f, v0, -1));
                    return;
                }
            }
            paintArr[z ? 1 : 0].setColor(bm2.f(0.2f, v0, -16777216));
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i2, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) k96.a0(null, null, i2, objArr));
        cm2 cm2Var = new cm2(2131232238, 0);
        if (z) {
            cm2Var.I = 0.8f;
            cm2Var.J = 0.8f;
        } else {
            cm2Var.n = -1;
        }
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) k96.M0(2131744498, null));
        spannableStringBuilder.setSpan(new cm2(2131232253, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f2, float f3, float f4, float f5) {
        float f6;
        boolean z;
        float f7 = f3 - f2;
        if (f2 < f4 && f3 < f4 + f7) {
            f6 = f2;
            canvas.drawArc(rectF, f6, Math.min(f3, f4) - f2, false, paint);
            z = true;
        } else {
            f6 = f2;
            z = false;
        }
        float max = Math.max(f6, f5);
        float min = Math.min(f3, f4 + 360.0f);
        if (min < max) {
            if (!z) {
                if (f6 <= f4 || f3 >= f5) {
                    canvas.drawArc(rectF, f6, f7, false, paint);
                    return;
                }
                return;
            }
            return;
        }
        canvas.drawArc(rectF, max, min - max, false, paint);
    }

    public static void h(long j2, Canvas canvas, ImageReceiver imageReceiver, u2b u2bVar) {
        boolean z;
        boolean J = na7.q1(y6c.t0).M1().J(j2);
        if (y6c.h(y6c.t0).e() != j2 && J) {
            z = true;
        } else {
            z = false;
        }
        i(j2, canvas, imageReceiver, z, u2bVar);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, defpackage.u2b r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2b.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, u2b):void");
    }

    public static void j(Canvas canvas, u2b u2bVar, Paint paint, boolean z) {
        RectF rectF = n;
        if (z) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(gl.L(0.5f), gl.L(0.5f));
            canvas.drawRoundRect(rectF2, gl.L(18.0f), gl.L(18.0f), paint);
            return;
        }
        float f2 = u2bVar.f;
        if (f2 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f2 / 2.0f) + 360.0f, 360.0f - f2, false, paint);
        }
    }

    public static void k(float f2, float f3, Canvas canvas, RectF rectF, boolean z) {
        Canvas canvas2;
        if (i == null) {
            i = new tgb(k96.M0(2131748633, null), 9.66f, gl.o());
        }
        if (g == null) {
            Paint paint = new Paint(1);
            g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f == null) {
            f = new RectF();
        }
        h.setColor(bkb.p1(f2, bkb.w0(null, bkb.el, false)));
        float U1 = gl.U1(f3, gl.L(4.66f), gl.L(7.0f));
        float U12 = gl.U1(f3, gl.L(15.0f), gl.L(18.0f));
        float L = gl.L(2.0f);
        canvas.save();
        float j2 = ((i.j() + U1) + U1) / 2.0f;
        float f4 = 0.8f * U12;
        float f5 = U12 * 0.2f;
        f.set((rectF.centerX() - j2) - L, (rectF.bottom - f4) - L, rectF.centerX() + j2 + L, rectF.bottom + f5 + L);
        float R1 = gl.R1(0.7f, 1.0f, f2);
        canvas.scale(R1, R1, f.centerX(), f.centerY());
        RectF rectF2 = f;
        gl.f3(rectF2, f2, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, g);
        if (z) {
            f.set(rectF.centerX() - j2, rectF.bottom - f4, rectF.centerX() + j2, rectF.bottom + f5);
            RectF rectF4 = f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f.height() / 2.0f, h);
            tgb tgbVar = i;
            RectF rectF5 = f;
            canvas2 = canvas;
            tgbVar.c(rectF5.left + U1, rectF5.centerY(), f2, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f2, float f3, u2b u2bVar, boolean z) {
        if (z) {
            float height = rectF.height() * 0.32f;
            float f4 = ((((int) f2) / 90) * 90) + 90;
            float f5 = (-199.0f) + f4;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f4, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f2 - f5) / 360.0f) * length, length * ((f3 - f5) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (u2bVar.k) {
            boolean z2 = u2bVar.m;
            if (!z2 && !u2bVar.l) {
                int i2 = (f2 > 90.0f ? 1 : (f2 == 90.0f ? 0 : -1));
                float f6 = u2bVar.f;
                if (i2 < 0) {
                    g(canvas, rectF, paint, f2, f3, (-f6) / 2.0f, f6 / 2.0f);
                } else {
                    g(canvas, rectF, paint, f2, f3, ((-f6) / 2.0f) + 180.0f, (f6 / 2.0f) + 180.0f);
                }
            } else if (u2bVar.l) {
                float f7 = u2bVar.f;
                g(canvas, rectF, paint, f2, f3, ((-f7) / 2.0f) + 180.0f, (f7 / 2.0f) + 180.0f);
            } else if (z2) {
                float f8 = u2bVar.f;
                g(canvas, rectF, paint, f2, f3, (-f8) / 2.0f, f8 / 2.0f);
            } else {
                canvas.drawArc(rectF, f2, f3 - f2, false, paint);
            }
        } else if (u2bVar.l) {
            float f9 = u2bVar.f;
            g(canvas, rectF, paint, f2, f3, ((-f9) / 2.0f) + 180.0f, (f9 / 2.0f) + 180.0f);
        } else if (f2 < 90.0f) {
            g(canvas, rectF, paint, f2, f3, u2bVar.g, u2bVar.h);
        } else {
            g(canvas, rectF, paint, f2, f3, -u2bVar.i, u2bVar.j);
        }
    }

    public static void m(android.graphics.Canvas r23, defpackage.g2b r24, org.telegram.messenger.ImageReceiver r25, defpackage.u2b r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2b.m(android.graphics.Canvas, g2b, org.telegram.messenger.ImageReceiver, u2b, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static defpackage.ev0 n(org.telegram.tgnet.tl.TL_stories.PeerStories r18, java.lang.Runnable r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x2b.n(org.telegram.tgnet.tl.TL_stories$PeerStories, java.lang.Runnable):ev0");
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            kz4 kz4Var = new kz4();
            b = kz4Var;
            kz4Var.a = true;
            kz4Var.b = true;
            kz4Var.d(bkb.w0(null, bkb.bl, false), bkb.w0(null, bkb.cl, false), 0, 0);
            b.c.setStrokeWidth(gl.N(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return b.c;
    }

    public static Drawable p() {
        BitmapDrawable bitmapDrawable = m;
        if (bitmapDrawable == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(bm2.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(createBitmap);
            m = bitmapDrawable2;
            return bitmapDrawable2;
        }
        return bitmapDrawable;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            kz4 kz4Var = new kz4();
            c = kz4Var;
            kz4Var.a = true;
            kz4Var.b = true;
            kz4Var.d(bkb.w0(null, bkb.dl, false), bkb.w0(null, bkb.el, false), 0, 0);
            c.c.setStrokeWidth(gl.N(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return c.c;
    }

    public static int r(g2b g2bVar, long j2) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        int i3 = y6c.t0;
        if (i2 > 0) {
            TLRPC.User V1 = na7.q1(i3).V1(Long.valueOf(j2));
            if (j2 == y6c.h(y6c.t0).n || V1 == null || (tL_recentStory2 = V1.stories_max_id) == null || tL_recentStory2.max_id <= 0 || V1.stories_unavailable) {
                return 0;
            }
            int i4 = g2bVar.f.get(j2, 0);
            TLRPC.TL_recentStory tL_recentStory3 = V1.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i4) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat K0 = na7.q1(i3).K0(Long.valueOf(-j2));
        if (K0 == null || (tL_recentStory = K0.stories_max_id) == null || tL_recentStory.max_id <= 0 || K0.stories_unavailable) {
            return 0;
        }
        int i5 = g2bVar.f.get(j2, 0);
        TLRPC.TL_recentStory tL_recentStory4 = K0.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i5) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(gl.b1().x, gl.b1().y) / gl.p);
        return tb4.m(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z) {
        kz4[] kz4VarArr = a;
        if (kz4VarArr[z ? 1 : 0] == null) {
            kz4 kz4Var = new kz4();
            kz4VarArr[z ? 1 : 0] = kz4Var;
            kz4Var.a = true;
            kz4Var.b = true;
            if (z) {
                kz4Var.d(bkb.w0(null, bkb.Zk, false), bkb.w0(null, bkb.al, false), 0, 0);
            } else {
                kz4Var.d(bkb.w0(null, bkb.Xk, false), bkb.w0(null, bkb.Yk, false), 0, 0);
            }
            kz4VarArr[z ? 1 : 0].c.setStrokeWidth(gl.N(2.0f));
            kz4VarArr[z ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            kz4VarArr[z ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        kz4VarArr[z ? 1 : 0].b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return kz4VarArr[z ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z) {
        String M0;
        if (z) {
            M0 = k96.M0(2131744432, null);
        } else {
            M0 = k96.M0(2131743561, null);
        }
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            q6c q6cVar = new q6c();
            valueOf.setSpan(q6cVar, valueOf.length() - 1, valueOf.length(), 0);
            q6cVar.a = textView;
            q6cVar.n = false;
            return valueOf;
        }
        return M0;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(y6c.t0).getCurrentTime() <= storyItem.expire_date + 86400) {
            return false;
        }
        return true;
    }

    public static boolean w(int i2, TL_stories.StoryItem storyItem) {
        if (ConnectionsManager.getInstance(i2).getCurrentTime() > storyItem.expire_date) {
            return true;
        }
        return false;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        TL_stories.StoryItem storyItem2;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                imageReceiver.Z(gl5.c(ba4.w(document.thumbs, Integer.MAX_VALUE, false, null, false), storyItem.media.document), "320_320", null, null, fl5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                imageReceiver.a(new r8b(storyItem));
                return;
            }
            storyItem2 = storyItem;
            photo = messageMedia.photo;
        } else {
            storyItem2 = storyItem;
            photo = null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(bm2.f(0.2f, -16777216, -1));
            imageReceiver.f0(createBitmap);
            imageReceiver.a(new r8b(storyItem2));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            TL_stories.StoryItem storyItem3 = storyItem2;
            imageReceiver.Y(null, null, gl5.i(ba4.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), "320_320", null, null, fl5.i(photo.sizes), 0L, null, storyItem3, 0);
            imageReceiver.a(new r8b(storyItem3));
        } else {
            imageReceiver.f();
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.Z(gl5.c(ba4.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, fl5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.Y(null, null, gl5.i(ba4.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, fl5.i(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
