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
public abstract class t6b {
    public static o15 b;
    public static o15 c;
    public static o15 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static pkb i;
    public static int j;
    public static BitmapDrawable m;
    public static final o15[] a = new o15[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final tv o = new tv((byte) 10);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(ema emaVar) {
        String M0 = ob6.M0(2131743455, null);
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            qac qacVar = new qac();
            valueOf.setSpan(qacVar, valueOf.length() - 1, valueOf.length(), 0);
            qacVar.a = emaVar;
            qacVar.n = true;
            emaVar.l(valueOf, false);
            return;
        }
        emaVar.l(M0, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == yac.h(yac.t0).n && !v(storyItem)) {
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

    public static void c(vnb vnbVar) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(hl.N(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v0 = aob.v0(aob.d6, vnbVar);
        if (j != v0) {
            j = v0;
            float B = hl.B(v0);
            if (B < 0.721f) {
                int i2 = (B > 0.25f ? 1 : (B == 0.25f ? 0 : -1));
                Paint paint2 = e;
                if (i2 < 0) {
                    paint2.setColor(vm2.f(0.2f, v0, -1));
                    return;
                } else {
                    paint2.setColor(vm2.f(0.44f, v0, -1));
                    return;
                }
            }
            e.setColor(vm2.f(0.2f, v0, -16777216));
        }
    }

    public static void d(vnb vnbVar, boolean z) {
        int i2;
        Paint[] paintArr = k;
        if (paintArr[z ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z ? 1 : 0].setStrokeWidth(hl.N(1.3f));
            paintArr[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z) {
            i2 = aob.s8;
        } else {
            i2 = aob.M8;
        }
        int v0 = aob.v0(i2, vnbVar);
        int[] iArr = l;
        if (iArr[z ? 1 : 0] != v0) {
            iArr[z ? 1 : 0] = v0;
            float B = hl.B(v0);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    paintArr[z ? 1 : 0].setColor(vm2.f(0.2f, v0, -1));
                    return;
                } else {
                    paintArr[z ? 1 : 0].setColor(vm2.f(0.44f, v0, -1));
                    return;
                }
            }
            paintArr[z ? 1 : 0].setColor(vm2.f(0.2f, v0, -16777216));
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i2, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) ob6.a0(null, null, i2, objArr));
        wm2 wm2Var = new wm2(2131232238, 0);
        if (z) {
            wm2Var.I = 0.8f;
            wm2Var.J = 0.8f;
        } else {
            wm2Var.n = -1;
        }
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) ob6.M0(2131744392, null));
        spannableStringBuilder.setSpan(new wm2(2131232253, 0), 0, 1, 0);
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

    public static void h(long j2, Canvas canvas, ImageReceiver imageReceiver, q6b q6bVar) {
        boolean z;
        boolean J = uc7.s1(yac.t0).O1().J(j2);
        if (yac.h(yac.t0).e() != j2 && J) {
            z = true;
        } else {
            z = false;
        }
        i(j2, canvas, imageReceiver, z, q6bVar);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, defpackage.q6b r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6b.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, q6b):void");
    }

    public static void j(Canvas canvas, q6b q6bVar, Paint paint, boolean z) {
        RectF rectF = n;
        if (z) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(hl.L(0.5f), hl.L(0.5f));
            canvas.drawRoundRect(rectF2, hl.L(18.0f), hl.L(18.0f), paint);
            return;
        }
        float f2 = q6bVar.f;
        if (f2 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f2 / 2.0f) + 360.0f, 360.0f - f2, false, paint);
        }
    }

    public static void k(float f2, float f3, Canvas canvas, RectF rectF, boolean z) {
        Canvas canvas2;
        if (i == null) {
            i = new pkb(ob6.M0(2131748579, null), 9.66f, hl.o());
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
        h.setColor(aob.p1(f2, aob.w0(null, aob.fl, false)));
        float U1 = hl.U1(f3, hl.L(4.66f), hl.L(7.0f));
        float U12 = hl.U1(f3, hl.L(15.0f), hl.L(18.0f));
        float L = hl.L(2.0f);
        canvas.save();
        float j2 = ((i.j() + U1) + U1) / 2.0f;
        float f4 = 0.8f * U12;
        float f5 = U12 * 0.2f;
        f.set((rectF.centerX() - j2) - L, (rectF.bottom - f4) - L, rectF.centerX() + j2 + L, rectF.bottom + f5 + L);
        float R1 = hl.R1(0.7f, 1.0f, f2);
        canvas.scale(R1, R1, f.centerX(), f.centerY());
        RectF rectF2 = f;
        hl.e3(rectF2, f2, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, g);
        if (z) {
            f.set(rectF.centerX() - j2, rectF.bottom - f4, rectF.centerX() + j2, rectF.bottom + f5);
            RectF rectF4 = f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f.height() / 2.0f, h);
            pkb pkbVar = i;
            RectF rectF5 = f;
            canvas2 = canvas;
            pkbVar.c(rectF5.left + U1, rectF5.centerY(), f2, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f2, float f3, q6b q6bVar, boolean z) {
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
        } else if (q6bVar.k) {
            boolean z2 = q6bVar.m;
            if (!z2 && !q6bVar.l) {
                int i2 = (f2 > 90.0f ? 1 : (f2 == 90.0f ? 0 : -1));
                float f6 = q6bVar.f;
                if (i2 < 0) {
                    g(canvas, rectF, paint, f2, f3, (-f6) / 2.0f, f6 / 2.0f);
                } else {
                    g(canvas, rectF, paint, f2, f3, ((-f6) / 2.0f) + 180.0f, (f6 / 2.0f) + 180.0f);
                }
            } else if (q6bVar.l) {
                float f7 = q6bVar.f;
                g(canvas, rectF, paint, f2, f3, ((-f7) / 2.0f) + 180.0f, (f7 / 2.0f) + 180.0f);
            } else if (z2) {
                float f8 = q6bVar.f;
                g(canvas, rectF, paint, f2, f3, (-f8) / 2.0f, f8 / 2.0f);
            } else {
                canvas.drawArc(rectF, f2, f3 - f2, false, paint);
            }
        } else if (q6bVar.l) {
            float f9 = q6bVar.f;
            g(canvas, rectF, paint, f2, f3, ((-f9) / 2.0f) + 180.0f, (f9 / 2.0f) + 180.0f);
        } else if (f2 < 90.0f) {
            g(canvas, rectF, paint, f2, f3, q6bVar.g, q6bVar.h);
        } else {
            g(canvas, rectF, paint, f2, f3, -q6bVar.i, q6bVar.j);
        }
    }

    public static void m(android.graphics.Canvas r23, defpackage.c6b r24, org.telegram.messenger.ImageReceiver r25, defpackage.q6b r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6b.m(android.graphics.Canvas, c6b, org.telegram.messenger.ImageReceiver, q6b, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static defpackage.pv0 n(org.telegram.tgnet.tl.TL_stories.PeerStories r18, java.lang.Runnable r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t6b.n(org.telegram.tgnet.tl.TL_stories$PeerStories, java.lang.Runnable):pv0");
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            o15 o15Var = new o15();
            b = o15Var;
            o15Var.a = true;
            o15Var.b = true;
            o15Var.d(aob.w0(null, aob.cl, false), aob.w0(null, aob.dl, false), 0, 0);
            b.c.setStrokeWidth(hl.N(2.0f));
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
            textPaint.setColor(vm2.o(-16777216, 100));
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
            o15 o15Var = new o15();
            c = o15Var;
            o15Var.a = true;
            o15Var.b = true;
            o15Var.d(aob.w0(null, aob.el, false), aob.w0(null, aob.fl, false), 0, 0);
            c.c.setStrokeWidth(hl.N(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return c.c;
    }

    public static int r(c6b c6bVar, long j2) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return 0;
        }
        int i3 = yac.t0;
        if (i2 > 0) {
            TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j2));
            if (j2 == yac.h(yac.t0).n || X1 == null || (tL_recentStory2 = X1.stories_max_id) == null || tL_recentStory2.max_id <= 0 || X1.stories_unavailable) {
                return 0;
            }
            int i4 = c6bVar.f.get(j2, 0);
            TLRPC.TL_recentStory tL_recentStory3 = X1.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i4) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j2));
        if (M0 == null || (tL_recentStory = M0.stories_max_id) == null || tL_recentStory.max_id <= 0 || M0.stories_unavailable) {
            return 0;
        }
        int i5 = c6bVar.f.get(j2, 0);
        TLRPC.TL_recentStory tL_recentStory4 = M0.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i5) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(hl.b1().x, hl.b1().y) / hl.p);
        return qd4.m(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z) {
        o15[] o15VarArr = a;
        if (o15VarArr[z ? 1 : 0] == null) {
            o15 o15Var = new o15();
            o15VarArr[z ? 1 : 0] = o15Var;
            o15Var.a = true;
            o15Var.b = true;
            if (z) {
                o15Var.d(aob.w0(null, aob.al, false), aob.w0(null, aob.bl, false), 0, 0);
            } else {
                o15Var.d(aob.w0(null, aob.Yk, false), aob.w0(null, aob.Zk, false), 0, 0);
            }
            o15VarArr[z ? 1 : 0].c.setStrokeWidth(hl.N(2.0f));
            o15VarArr[z ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            o15VarArr[z ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        o15VarArr[z ? 1 : 0].b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return o15VarArr[z ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z) {
        String M0;
        if (z) {
            M0 = ob6.M0(2131744326, null);
        } else {
            M0 = ob6.M0(2131743455, null);
        }
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            qac qacVar = new qac();
            valueOf.setSpan(qacVar, valueOf.length() - 1, valueOf.length(), 0);
            qacVar.a = textView;
            qacVar.n = false;
            return valueOf;
        }
        return M0;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(yac.t0).getCurrentTime() <= storyItem.expire_date + 86400) {
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
                imageReceiver.Z(jn5.c(xb4.w(document.thumbs, Integer.MAX_VALUE, false, null, false), storyItem.media.document), "320_320", null, null, in5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                imageReceiver.a(new qcb(storyItem));
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
            createBitmap.eraseColor(vm2.f(0.2f, -16777216, -1));
            imageReceiver.f0(createBitmap);
            imageReceiver.a(new qcb(storyItem2));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            TL_stories.StoryItem storyItem3 = storyItem2;
            imageReceiver.Y(null, null, jn5.i(xb4.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), "320_320", null, null, in5.i(photo.sizes), 0L, null, storyItem3, 0);
            imageReceiver.a(new qcb(storyItem3));
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
            imageReceiver.Z(jn5.c(xb4.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, in5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.Y(null, null, jn5.i(xb4.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, in5.i(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
