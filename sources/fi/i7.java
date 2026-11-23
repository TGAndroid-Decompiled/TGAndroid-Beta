package fi;

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
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.wy0;
public abstract class i7 {
    public static q10 f12110b;
    public static q10 f12111c;
    public static q10 d;
    public static Paint f12112e;
    public static RectF f12113f;
    public static Paint f12114g;
    public static Paint h;
    public static wy0 f12115i;
    public static int f12116j;
    public static BitmapDrawable f12119m;
    public static final q10[] f12109a = new q10[2];
    public static final Paint[] f12117k = new Paint[2];
    public static final int[] f12118l = new int[2];
    public static final RectF f12120n = new RectF();
    public static final androidx.emoji2.text.o f12121o = new androidx.emoji2.text.o(2);
    public static final RectF f12122p = new RectF();
    public static final Path f12123q = new Path();
    public static final Matrix f12124r = new Matrix();
    public static final PathMeasure f12125s = new PathMeasure();
    public static final Path f12126t = new Path();

    public static void a(org.telegram.ui.ActionBar.n5 n5Var) {
        String N0 = gd.N0(2131743553, null);
        if (N0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(N0);
            l9 l9Var = new l9();
            valueOf.setSpan(l9Var, valueOf.length() - 1, valueOf.length(), 0);
            l9Var.f12241a = n5Var;
            l9Var.f12246n = true;
            n5Var.l(valueOf, false);
            return;
        }
        n5Var.l(N0, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == i10.i(i10.f24637t0).f24656n && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f28641id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.i6 i6Var) {
        if (f12112e == null) {
            Paint paint = new Paint(1);
            f12112e = paint;
            paint.setStyle(Paint.Style.STROKE);
            f12112e.setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            f12112e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var);
        if (f12116j != w02) {
            f12116j = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    f12112e.setColor(i0.a.f(0.2f, w02, -1));
                    return;
                } else {
                    f12112e.setColor(i0.a.f(0.44f, w02, -1));
                    return;
                }
            }
            f12112e.setColor(i0.a.f(0.2f, w02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        int i7;
        Paint[] paintArr = f12117k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i7 = org.telegram.ui.ActionBar.n6.f29731s8;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.M8;
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        int[] iArr = f12118l;
        if (iArr[z10 ? 1 : 0] != w02) {
            iArr[z10 ? 1 : 0] = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    paintArr[z10 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -1));
                    return;
                } else {
                    paintArr[z10 ? 1 : 0].setColor(i0.a.f(0.44f, w02, -1));
                    return;
                }
            }
            paintArr[z10 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -16777216));
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i7, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) gd.a0(null, null, i7, objArr));
        kq kqVar = new kq(2131232238, 0);
        if (z10) {
            kqVar.I = 0.8f;
            kqVar.J = 0.8f;
        } else {
            kqVar.f36852n = -1;
        }
        spannableStringBuilder.setSpan(kqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) gd.N0(2131744494, null));
        spannableStringBuilder.setSpan(new kq(2131232253, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z10;
        float f15 = f11 - f10;
        if (f10 < f12 && f11 < f12 + f15) {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z10 = true;
        } else {
            f14 = f10;
            z10 = false;
        }
        float max = Math.max(f14, f13);
        float min = Math.min(f11, f12 + 360.0f);
        if (min < max) {
            if (!z10) {
                if (f14 <= f12 || f11 >= f13) {
                    canvas.drawArc(rectF, f14, f15, false, paint);
                    return;
                }
                return;
            }
            return;
        }
        canvas.drawArc(rectF, max, min - max, false, paint);
    }

    public static void h(long j3, Canvas canvas, ImageReceiver imageReceiver, e7 e7Var) {
        boolean z10;
        boolean K = mp.u1(i10.f24637t0).R1().K(j3);
        if (i10.i(i10.f24637t0).e() != j3 && K) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j3, canvas, imageReceiver, z10, e7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, fi.e7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i7.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, fi.e7):void");
    }

    public static void j(Canvas canvas, e7 e7Var, Paint paint, boolean z10) {
        RectF rectF = f12120n;
        if (z10) {
            RectF rectF2 = f12122p;
            rectF2.set(rectF);
            rectF2.inset(org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
            return;
        }
        float f10 = e7Var.f11900f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(float f10, float f11, Canvas canvas, RectF rectF, boolean z10) {
        Canvas canvas2;
        if (f12115i == null) {
            f12115i = new wy0(gd.N0(2131748632, null), 9.66f, org.telegram.messenger.g0.o());
        }
        if (f12114g == null) {
            Paint paint = new Paint(1);
            f12114g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f12113f == null) {
            f12113f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.n6.r1(f10, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.fl, false)));
        float W1 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(7.0f));
        float W12 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(18.0f));
        float L = org.telegram.messenger.g0.L(2.0f);
        canvas.save();
        float k10 = ((f12115i.k() + W1) + W1) / 2.0f;
        float f12 = 0.8f * W12;
        float f13 = W12 * 0.2f;
        f12113f.set((rectF.centerX() - k10) - L, (rectF.bottom - f12) - L, rectF.centerX() + k10 + L, rectF.bottom + f13 + L);
        float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f10);
        canvas.scale(T1, T1, f12113f.centerX(), f12113f.centerY());
        RectF rectF2 = f12113f;
        org.telegram.messenger.g0.i3(rectF2, f10, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f12113f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f12113f.height() / 2.0f, f12114g);
        if (z10) {
            f12113f.set(rectF.centerX() - k10, rectF.bottom - f12, rectF.centerX() + k10, rectF.bottom + f13);
            RectF rectF4 = f12113f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f12113f.height() / 2.0f, h);
            wy0 wy0Var = f12115i;
            RectF rectF5 = f12113f;
            canvas2 = canvas;
            wy0Var.c(rectF5.left + W1, rectF5.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, e7 e7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = f12123q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f12124r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f12125s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f12126t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (e7Var.f11904k) {
            boolean z11 = e7Var.f11906m;
            if (!z11 && !e7Var.f11905l) {
                if (f10 < 90.0f) {
                    float f14 = e7Var.f11900f;
                    g(canvas, rectF, paint, f10, f11, (-f14) / 2.0f, f14 / 2.0f);
                    return;
                }
                float f15 = e7Var.f11900f;
                g(canvas, rectF, paint, f10, f11, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (e7Var.f11905l) {
                float f16 = e7Var.f11900f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
            } else if (z11) {
                float f17 = e7Var.f11900f;
                g(canvas, rectF, paint, f10, f11, (-f17) / 2.0f, f17 / 2.0f);
            } else {
                canvas.drawArc(rectF, f10, f11 - f10, false, paint);
            }
        } else if (e7Var.f11905l) {
            float f18 = e7Var.f11900f;
            g(canvas, rectF, paint, f10, f11, ((-f18) / 2.0f) + 180.0f, (f18 / 2.0f) + 180.0f);
        } else if (f10 < 90.0f) {
            g(canvas, rectF, paint, f10, f11, e7Var.f11901g, e7Var.h);
        } else {
            g(canvas, rectF, paint, f10, f11, -e7Var.f11902i, e7Var.f11903j);
        }
    }

    public static void m(android.graphics.Canvas r23, fi.p6 r24, org.telegram.messenger.ImageReceiver r25, fi.e7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: fi.i7.m(android.graphics.Canvas, fi.p6, org.telegram.messenger.ImageReceiver, fi.e7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static f7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && org.telegram.messenger.n5.o(peerStories.peer) != i10.i(i10.f24637t0).f24656n) {
            p6 p6Var = mp.u1(i10.f24637t0).f25763i0;
            int i7 = p6Var.f12391f.get(org.telegram.messenger.n5.o(peerStories.peer));
            int i10 = 0;
            while (true) {
                if (i10 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i10).f28731id > i7) {
                        storyItem = peerStories.stories.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    storyItem = null;
                    break;
                }
            }
            if (storyItem == null) {
                storyItem = peerStories.stories.get(0);
            }
            TL_stories.StoryItem storyItem2 = storyItem;
            TLRPC.MessageMedia messageMedia = storyItem2.media;
            if (messageMedia != null && messageMedia.document != null) {
                org.telegram.messenger.w7.G(i10.f24637t0);
                File J = org.telegram.messenger.w7.J(storyItem2.media.document, "", false, true);
                if (J != null && J.exists()) {
                    runnable.run();
                    return null;
                }
                org.telegram.messenger.w7.G(i10.f24637t0);
                File J2 = org.telegram.messenger.w7.J(storyItem2.media.document, "", true, true);
                if (J2 != null) {
                    try {
                        if (J2.getName().lastIndexOf(".") > 0) {
                            File file = new File(J2.getParentFile(), J2.getName().substring(0, lastIndexOf) + ".temp");
                            if (file.exists() && file.length() > 0) {
                                runnable.run();
                                return null;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } else {
                if (messageMedia != null) {
                    photo = messageMedia.photo;
                } else {
                    photo = null;
                }
                if (photo != null && (arrayList = photo.sizes) != null) {
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList, Integer.MAX_VALUE, false, null, false);
                    org.telegram.messenger.w7.G(i10.f24637t0);
                    File J3 = org.telegram.messenger.w7.J(w10, "", false, true);
                    if (J3 != null && J3.exists()) {
                        runnable.run();
                        return null;
                    }
                } else {
                    runnable.run();
                    return null;
                }
            }
            long o4 = org.telegram.messenger.n5.o(peerStories.peer);
            ?? obj = new Object();
            obj.f11952b = false;
            obj.f11951a = o4;
            obj.f11953c = p6Var;
            obj.d = new l4(15, obj, runnable);
            l4 l4Var = new l4(16, r0, obj);
            Runnable[] runnableArr = {l4Var};
            org.telegram.messenger.g0.h3(l4Var, 3000L);
            d7 d7Var = new d7(runnableArr, obj);
            obj.f11954e = d7Var;
            d7Var.A1 = true;
            d7Var.Q();
            String s5 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((d7) obj.f11954e).s0(fc.b(document), p5.c.v(s5, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((d7) obj.f11954e).v0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList2, Integer.MAX_VALUE, false, null, false), photo2), s5, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((l4) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f12110b == null) {
            q10 q10Var = new q10();
            f12110b = q10Var;
            q10Var.f38659a = true;
            q10Var.f38660b = true;
            q10Var.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.cl, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.dl, false), 0, 0);
            f12110b.f38661c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f12110b.f38661c.setStyle(Paint.Style.STROKE);
            f12110b.f38661c.setStrokeCap(Paint.Cap.ROUND);
        }
        f12110b.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B());
        return f12110b.f38661c;
    }

    public static Drawable p() {
        if (f12119m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f12119m = new BitmapDrawable(createBitmap);
        }
        return f12119m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f12111c == null) {
            q10 q10Var = new q10();
            f12111c = q10Var;
            q10Var.f38659a = true;
            q10Var.f38660b = true;
            q10Var.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.el, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.fl, false), 0, 0);
            f12111c.f38661c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f12111c.f38661c.setStyle(Paint.Style.STROKE);
            f12111c.f38661c.setStrokeCap(Paint.Cap.ROUND);
        }
        f12111c.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B());
        return f12111c.f38661c;
    }

    public static int r(p6 p6Var, long j3) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0) {
            return 0;
        }
        if (i7 > 0) {
            TLRPC.User c22 = mp.u1(i10.f24637t0).c2(Long.valueOf(j3));
            if (j3 == i10.i(i10.f24637t0).f24656n || c22 == null || (tL_recentStory2 = c22.stories_max_id) == null || tL_recentStory2.max_id <= 0 || c22.stories_unavailable) {
                return 0;
            }
            int i10 = p6Var.f12391f.get(j3, 0);
            TLRPC.TL_recentStory tL_recentStory3 = c22.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i10) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat O0 = mp.u1(i10.f24637t0).O0(Long.valueOf(-j3));
        if (O0 == null || (tL_recentStory = O0.stories_max_id) == null || tL_recentStory.max_id <= 0 || O0.stories_unavailable) {
            return 0;
        }
        int i11 = p6Var.f12391f.get(j3, 0);
        TLRPC.TL_recentStory tL_recentStory4 = O0.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i11) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(org.telegram.messenger.g0.c1().x, org.telegram.messenger.g0.c1().y) / org.telegram.messenger.g0.f24225p);
        return com.google.android.gms.internal.vision.e2.j(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        q10[] q10VarArr = f12109a;
        if (q10VarArr[z10 ? 1 : 0] == null) {
            q10 q10Var = new q10();
            q10VarArr[z10 ? 1 : 0] = q10Var;
            q10Var.f38659a = true;
            q10Var.f38660b = true;
            if (z10) {
                q10Var.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.al, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.bl, false), 0, 0);
            } else {
                q10Var.d(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yk, false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zk, false), 0, 0);
            }
            q10VarArr[z10 ? 1 : 0].f38661c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            q10VarArr[z10 ? 1 : 0].f38661c.setStyle(Paint.Style.STROKE);
            q10VarArr[z10 ? 1 : 0].f38661c.setStrokeCap(Paint.Cap.ROUND);
        }
        q10VarArr[z10 ? 1 : 0].b(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), imageReceiver.B());
        return q10VarArr[z10 ? 1 : 0].f38661c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String N0;
        if (z10) {
            N0 = gd.N0(2131744428, null);
        } else {
            N0 = gd.N0(2131743553, null);
        }
        if (N0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(N0);
            l9 l9Var = new l9();
            valueOf.setSpan(l9Var, valueOf.length() - 1, valueOf.length(), 0);
            l9Var.f12241a = textView;
            l9Var.f12246n = false;
            return valueOf;
        }
        return N0;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(i10.f24637t0).getCurrentTime() <= storyItem.expire_date + 86400) {
            return false;
        }
        return true;
    }

    public static boolean w(int i7, TL_stories.StoryItem storyItem) {
        if (ConnectionsManager.getInstance(i7).getCurrentTime() > storyItem.expire_date) {
            return true;
        }
        return false;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.s0(fc.c(org.telegram.messenger.w7.w(document.thumbs, Integer.MAX_VALUE, false, null, false), storyItem.media.document), "320_320", null, null, ec.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.a(new k9(storyItem));
            return;
        }
        if (messageMedia != null) {
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.f(0.2f, -16777216, -1));
            imageReceiver.w0(createBitmap);
            imageReceiver.a(new k9(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.v0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), "320_320", null, null, ec.m(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.a(new k9(storyItem));
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
            imageReceiver.s0(fc.c(org.telegram.messenger.w7.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, ec.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.v0(null, null, fc.i(org.telegram.messenger.w7.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, ec.m(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
