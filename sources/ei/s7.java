package ei;

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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zb;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
public abstract class s7 {
    public static b10 f11012b;
    public static b10 f11013c;
    public static b10 d;
    public static Paint f11014e;
    public static RectF f11015f;
    public static Paint f11016g;
    public static Paint h;
    public static ly0 f11017i;
    public static int f11018j;
    public static BitmapDrawable f11021m;
    public static final b10[] f11011a = new b10[2];
    public static final Paint[] f11019k = new Paint[2];
    public static final int[] f11020l = new int[2];
    public static final RectF f11022n = new RectF();
    public static final androidx.emoji2.text.o f11023o = new androidx.emoji2.text.o(2);
    public static final RectF f11024p = new RectF();
    public static final Path f11025q = new Path();
    public static final Matrix f11026r = new Matrix();
    public static final PathMeasure f11027s = new PathMeasure();
    public static final Path f11028t = new Path();

    public static void a(org.telegram.ui.ActionBar.k5 k5Var) {
        String M0 = bd.M0(2131743810, null);
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            x9 x9Var = new x9();
            valueOf.setSpan(x9Var, valueOf.length() - 1, valueOf.length(), 0);
            x9Var.f11215a = k5Var;
            x9Var.f11220n = true;
            k5Var.l(valueOf, false);
            return;
        }
        k5Var.l(M0, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == h10.i(h10.f22829t0).f22848n && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f27150id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.e6 e6Var) {
        if (f11014e == null) {
            Paint paint = new Paint(1);
            f11014e = paint;
            paint.setStyle(Paint.Style.STROKE);
            f11014e.setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            f11014e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var);
        if (f11018j != w02) {
            f11018j = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    f11014e.setColor(i0.a.f(0.2f, w02, -1));
                    return;
                } else {
                    f11014e.setColor(i0.a.f(0.44f, w02, -1));
                    return;
                }
            }
            f11014e.setColor(i0.a.f(0.2f, w02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        int i3;
        Paint[] paintArr = f11019k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i3 = org.telegram.ui.ActionBar.k6.f28160s8;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.M8;
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        int[] iArr = f11020l;
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

    public static SpannableStringBuilder e(Object[] objArr, int i3, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) bd.a0(null, null, i3, objArr));
        wp wpVar = new wp(2131232233, 0);
        if (z10) {
            wpVar.I = 0.8f;
            wpVar.J = 0.8f;
        } else {
            wpVar.f40044n = -1;
        }
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) bd.M0(2131744745, null));
        spannableStringBuilder.setSpan(new wp(2131232248, 0), 0, 1, 0);
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

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, o7 o7Var) {
        boolean z10;
        boolean K = hp.s1(h10.f22829t0).P1().K(j10);
        if (h10.i(h10.f22829t0).e() != j10 && K) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j10, canvas, imageReceiver, z10, o7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, ei.o7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: ei.s7.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, ei.o7):void");
    }

    public static void j(Canvas canvas, o7 o7Var, Paint paint, boolean z10) {
        RectF rectF = f11022n;
        if (z10) {
            RectF rectF2 = f11024p;
            rectF2.set(rectF);
            rectF2.inset(org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
            return;
        }
        float f10 = o7Var.f10700f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(float f10, float f11, Canvas canvas, RectF rectF, boolean z10) {
        Canvas canvas2;
        if (f11017i == null) {
            f11017i = new ly0(bd.M0(2131748833, null), 9.66f, org.telegram.messenger.g0.o());
        }
        if (f11016g == null) {
            Paint paint = new Paint(1);
            f11016g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f11015f == null) {
            f11015f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.k6.r1(f10, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.cl, false)));
        float W1 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(7.0f));
        float W12 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(18.0f));
        float L = org.telegram.messenger.g0.L(2.0f);
        canvas.save();
        float k10 = ((f11017i.k() + W1) + W1) / 2.0f;
        float f12 = 0.8f * W12;
        float f13 = W12 * 0.2f;
        f11015f.set((rectF.centerX() - k10) - L, (rectF.bottom - f12) - L, rectF.centerX() + k10 + L, rectF.bottom + f13 + L);
        float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f10);
        canvas.scale(T1, T1, f11015f.centerX(), f11015f.centerY());
        RectF rectF2 = f11015f;
        org.telegram.messenger.g0.j3(rectF2, f10, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f11015f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f11015f.height() / 2.0f, f11016g);
        if (z10) {
            f11015f.set(rectF.centerX() - k10, rectF.bottom - f12, rectF.centerX() + k10, rectF.bottom + f13);
            RectF rectF4 = f11015f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f11015f.height() / 2.0f, h);
            ly0 ly0Var = f11017i;
            RectF rectF5 = f11015f;
            canvas2 = canvas;
            ly0Var.c(rectF5.left + W1, rectF5.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, o7 o7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = f11025q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f11026r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f11027s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f11028t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (o7Var.f10704k) {
            boolean z11 = o7Var.f10706m;
            if (!z11 && !o7Var.f10705l) {
                if (f10 < 90.0f) {
                    float f14 = o7Var.f10700f;
                    g(canvas, rectF, paint, f10, f11, (-f14) / 2.0f, f14 / 2.0f);
                    return;
                }
                float f15 = o7Var.f10700f;
                g(canvas, rectF, paint, f10, f11, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (o7Var.f10705l) {
                float f16 = o7Var.f10700f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
            } else if (z11) {
                float f17 = o7Var.f10700f;
                g(canvas, rectF, paint, f10, f11, (-f17) / 2.0f, f17 / 2.0f);
            } else {
                canvas.drawArc(rectF, f10, f11 - f10, false, paint);
            }
        } else if (o7Var.f10705l) {
            float f18 = o7Var.f10700f;
            g(canvas, rectF, paint, f10, f11, ((-f18) / 2.0f) + 180.0f, (f18 / 2.0f) + 180.0f);
        } else if (f10 < 90.0f) {
            g(canvas, rectF, paint, f10, f11, o7Var.f10701g, o7Var.h);
        } else {
            g(canvas, rectF, paint, f10, f11, -o7Var.f10702i, o7Var.f10703j);
        }
    }

    public static void m(android.graphics.Canvas r23, ei.z6 r24, org.telegram.messenger.ImageReceiver r25, ei.o7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: ei.s7.m(android.graphics.Canvas, ei.z6, org.telegram.messenger.ImageReceiver, ei.o7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static p7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && org.telegram.messenger.m5.o(peerStories.peer) != h10.i(h10.f22829t0).f22848n) {
            z6 z6Var = hp.s1(h10.f22829t0).f23027i0;
            int i3 = z6Var.f11278f.get(org.telegram.messenger.m5.o(peerStories.peer));
            int i10 = 0;
            while (true) {
                if (i10 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i10).f27240id > i3) {
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
                org.telegram.messenger.w7.G(h10.f22829t0);
                File K = org.telegram.messenger.w7.K(storyItem2.media.document, "", false, true);
                if (K != null && K.exists()) {
                    runnable.run();
                    return null;
                }
                org.telegram.messenger.w7.G(h10.f22829t0);
                File K2 = org.telegram.messenger.w7.K(storyItem2.media.document, "", true, true);
                if (K2 != null) {
                    try {
                        if (K2.getName().lastIndexOf(".") > 0) {
                            File file = new File(K2.getParentFile(), K2.getName().substring(0, lastIndexOf) + ".temp");
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
                    org.telegram.messenger.w7.G(h10.f22829t0);
                    File K3 = org.telegram.messenger.w7.K(w10, "", false, true);
                    if (K3 != null && K3.exists()) {
                        runnable.run();
                        return null;
                    }
                } else {
                    runnable.run();
                    return null;
                }
            }
            long o10 = org.telegram.messenger.m5.o(peerStories.peer);
            ?? obj = new Object();
            obj.f10775b = false;
            obj.f10774a = o10;
            obj.f10776c = z6Var;
            obj.d = new b0(23, obj, runnable);
            b0 b0Var = new b0(24, r0, obj);
            Runnable[] runnableArr = {b0Var};
            org.telegram.messenger.g0.i3(b0Var, 3000L);
            n7 n7Var = new n7(runnableArr, obj);
            obj.f10777e = n7Var;
            n7Var.A1 = true;
            n7Var.P();
            String s6 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((n7) obj.f10777e).r0(ac.b(document), t4.c.q(s6, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((n7) obj.f10777e).u0(null, null, ac.i(org.telegram.messenger.w7.w(arrayList2, Integer.MAX_VALUE, false, null, false), photo2), s6, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((b0) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f11012b == null) {
            b10 b10Var = new b10();
            f11012b = b10Var;
            b10Var.f32036a = true;
            b10Var.f32037b = true;
            b10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.al, false), 0, 0);
            f11012b.f32038c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f11012b.f32038c.setStyle(Paint.Style.STROKE);
            f11012b.f32038c.setStrokeCap(Paint.Cap.ROUND);
        }
        f11012b.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        return f11012b.f32038c;
    }

    public static Drawable p() {
        if (f11021m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f11021m = new BitmapDrawable(createBitmap);
        }
        return f11021m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f11013c == null) {
            b10 b10Var = new b10();
            f11013c = b10Var;
            b10Var.f32036a = true;
            b10Var.f32037b = true;
            b10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bl, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.cl, false), 0, 0);
            f11013c.f32038c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f11013c.f32038c.setStyle(Paint.Style.STROKE);
            f11013c.f32038c.setStrokeCap(Paint.Cap.ROUND);
        }
        f11013c.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        return f11013c.f32038c;
    }

    public static int r(z6 z6Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 == 0) {
            return 0;
        }
        if (i3 > 0) {
            TLRPC.User a22 = hp.s1(h10.f22829t0).a2(Long.valueOf(j10));
            if (j10 == h10.i(h10.f22829t0).f22848n || a22 == null || (tL_recentStory2 = a22.stories_max_id) == null || tL_recentStory2.max_id <= 0 || a22.stories_unavailable) {
                return 0;
            }
            int i10 = z6Var.f11278f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = a22.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i10) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat M0 = hp.s1(h10.f22829t0).M0(Long.valueOf(-j10));
        if (M0 == null || (tL_recentStory = M0.stories_max_id) == null || tL_recentStory.max_id <= 0 || M0.stories_unavailable) {
            return 0;
        }
        int i11 = z6Var.f11278f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = M0.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i11) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(org.telegram.messenger.g0.c1().x, org.telegram.messenger.g0.c1().y) / org.telegram.messenger.g0.f22607p);
        return com.google.android.recaptcha.internal.a.i(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        b10[] b10VarArr = f11011a;
        if (b10VarArr[z10 ? 1 : 0] == null) {
            b10 b10Var = new b10();
            b10VarArr[z10 ? 1 : 0] = b10Var;
            b10Var.f32036a = true;
            b10Var.f32037b = true;
            if (z10) {
                b10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Xk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Yk, false), 0, 0);
            } else {
                b10Var.d(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Wk, false), 0, 0);
            }
            b10VarArr[z10 ? 1 : 0].f32038c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            b10VarArr[z10 ? 1 : 0].f32038c.setStyle(Paint.Style.STROKE);
            b10VarArr[z10 ? 1 : 0].f32038c.setStrokeCap(Paint.Cap.ROUND);
        }
        b10VarArr[z10 ? 1 : 0].b(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A());
        return b10VarArr[z10 ? 1 : 0].f32038c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String M0;
        if (z10) {
            M0 = bd.M0(2131744682, null);
        } else {
            M0 = bd.M0(2131743810, null);
        }
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            x9 x9Var = new x9();
            valueOf.setSpan(x9Var, valueOf.length() - 1, valueOf.length(), 0);
            x9Var.f11215a = textView;
            x9Var.f11220n = false;
            return valueOf;
        }
        return M0;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime() <= storyItem.expire_date + 86400) {
            return false;
        }
        return true;
    }

    public static boolean w(int i3, TL_stories.StoryItem storyItem) {
        if (ConnectionsManager.getInstance(i3).getCurrentTime() > storyItem.expire_date) {
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
            imageReceiver.r0(ac.c(org.telegram.messenger.w7.w(document.thumbs, Integer.MAX_VALUE, false, null, false), storyItem.media.document), "320_320", null, null, zb.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.a(new w9(storyItem));
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
            imageReceiver.v0(createBitmap);
            imageReceiver.a(new w9(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.u0(null, null, ac.i(org.telegram.messenger.w7.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), "320_320", null, null, zb.m(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.a(new w9(storyItem));
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
            imageReceiver.r0(ac.c(org.telegram.messenger.w7.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, zb.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.u0(null, null, ac.i(org.telegram.messenger.w7.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, zb.m(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
