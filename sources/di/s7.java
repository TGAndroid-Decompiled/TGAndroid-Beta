package di;

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
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.wp;
public abstract class s7 {
    public static f10 f9736b;
    public static f10 f9737c;
    public static f10 d;
    public static Paint f9738e;
    public static RectF f9739f;
    public static Paint f9740g;
    public static Paint h;
    public static ny0 f9741i;
    public static int f9742j;
    public static BitmapDrawable f9745m;
    public static final f10[] f9735a = new f10[2];
    public static final Paint[] f9743k = new Paint[2];
    public static final int[] f9744l = new int[2];
    public static final RectF f9746n = new RectF();
    public static final androidx.emoji2.text.n f9747o = new androidx.emoji2.text.n(2);
    public static final RectF f9748p = new RectF();
    public static final Path f9749q = new Path();
    public static final Matrix f9750r = new Matrix();
    public static final PathMeasure f9751s = new PathMeasure();
    public static final Path f9752t = new Path();

    public static void a(org.telegram.ui.ActionBar.l5 l5Var) {
        String M0 = id.M0(2131743800, null);
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            w9 w9Var = new w9();
            valueOf.setSpan(w9Var, valueOf.length() - 1, valueOf.length(), 0);
            w9Var.f9913a = l5Var;
            w9Var.f9918n = true;
            l5Var.l(valueOf, false);
            return;
        }
        l5Var.l(M0, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == p10.i(p10.f24470s0).f24489n && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f27105id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.g6 g6Var) {
        if (f9738e == null) {
            Paint paint = new Paint(1);
            f9738e = paint;
            paint.setStyle(Paint.Style.STROKE);
            f9738e.setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            f9738e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27865d6, g6Var);
        if (f9742j != w02) {
            f9742j = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    f9738e.setColor(i0.a.f(0.2f, w02, -1));
                    return;
                } else {
                    f9738e.setColor(i0.a.f(0.44f, w02, -1));
                    return;
                }
            }
            f9738e.setColor(i0.a.f(0.2f, w02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        int i7;
        Paint[] paintArr = f9743k;
        if (paintArr[z9 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z9 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z9 ? 1 : 0].setStrokeWidth(org.telegram.messenger.g0.N(1.3f));
            paintArr[z9 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z9) {
            i7 = org.telegram.ui.ActionBar.l6.f28145s8;
        } else {
            i7 = org.telegram.ui.ActionBar.l6.M8;
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(i7, g6Var);
        int[] iArr = f9744l;
        if (iArr[z9 ? 1 : 0] != w02) {
            iArr[z9 ? 1 : 0] = w02;
            float B = org.telegram.messenger.g0.B(w02);
            if (B < 0.721f) {
                if (B < 0.25f) {
                    paintArr[z9 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -1));
                    return;
                } else {
                    paintArr[z9 ? 1 : 0].setColor(i0.a.f(0.44f, w02, -1));
                    return;
                }
            }
            paintArr[z9 ? 1 : 0].setColor(i0.a.f(0.2f, w02, -16777216));
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i7, boolean z9) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) id.a0(null, null, i7, objArr));
        wp wpVar = new wp(2131232233, 0);
        if (z9) {
            wpVar.H = 0.8f;
            wpVar.I = 0.8f;
        } else {
            wpVar.f40119n = -1;
        }
        spannableStringBuilder.setSpan(wpVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) id.M0(2131744735, null));
        spannableStringBuilder.setSpan(new wp(2131232248, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z9;
        float f15 = f11 - f10;
        if (f10 < f12 && f11 < f12 + f15) {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z9 = true;
        } else {
            f14 = f10;
            z9 = false;
        }
        float max = Math.max(f14, f13);
        float min = Math.min(f11, f12 + 360.0f);
        if (min < max) {
            if (!z9) {
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

    public static void h(long j3, Canvas canvas, ImageReceiver imageReceiver, o7 o7Var) {
        boolean z9;
        boolean K = qp.s1(p10.f24470s0).P1().K(j3);
        if (p10.i(p10.f24470s0).e() != j3 && K) {
            z9 = true;
        } else {
            z9 = false;
        }
        i(j3, canvas, imageReceiver, z9, o7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, di.o7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: di.s7.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, di.o7):void");
    }

    public static void j(Canvas canvas, o7 o7Var, Paint paint, boolean z9) {
        RectF rectF = f9746n;
        if (z9) {
            RectF rectF2 = f9748p;
            rectF2.set(rectF);
            rectF2.inset(org.telegram.messenger.g0.L(0.5f), org.telegram.messenger.g0.L(0.5f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f), paint);
            return;
        }
        float f10 = o7Var.f9445f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(float f10, float f11, Canvas canvas, RectF rectF, boolean z9) {
        Canvas canvas2;
        if (f9741i == null) {
            f9741i = new ny0(id.M0(2131748825, null), 9.66f, org.telegram.messenger.g0.o());
        }
        if (f9740g == null) {
            Paint paint = new Paint(1);
            f9740g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f9739f == null) {
            f9739f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.l6.r1(f10, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.cl, false)));
        float W1 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(4.66f), org.telegram.messenger.g0.L(7.0f));
        float W12 = org.telegram.messenger.g0.W1(f11, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(18.0f));
        float L = org.telegram.messenger.g0.L(2.0f);
        canvas.save();
        float k10 = ((f9741i.k() + W1) + W1) / 2.0f;
        float f12 = 0.8f * W12;
        float f13 = W12 * 0.2f;
        f9739f.set((rectF.centerX() - k10) - L, (rectF.bottom - f12) - L, rectF.centerX() + k10 + L, rectF.bottom + f13 + L);
        float T1 = org.telegram.messenger.g0.T1(0.7f, 1.0f, f10);
        canvas.scale(T1, T1, f9739f.centerX(), f9739f.centerY());
        RectF rectF2 = f9739f;
        org.telegram.messenger.g0.j3(rectF2, f10, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f9739f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f9739f.height() / 2.0f, f9740g);
        if (z9) {
            f9739f.set(rectF.centerX() - k10, rectF.bottom - f12, rectF.centerX() + k10, rectF.bottom + f13);
            RectF rectF4 = f9739f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f9739f.height() / 2.0f, h);
            ny0 ny0Var = f9741i;
            RectF rectF5 = f9739f;
            canvas2 = canvas;
            ny0Var.c(rectF5.left + W1, rectF5.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, o7 o7Var, boolean z9) {
        if (z9) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = f9749q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f9750r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f9751s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f9752t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (o7Var.f9449k) {
            boolean z10 = o7Var.f9451m;
            if (!z10 && !o7Var.f9450l) {
                if (f10 < 90.0f) {
                    float f14 = o7Var.f9445f;
                    g(canvas, rectF, paint, f10, f11, (-f14) / 2.0f, f14 / 2.0f);
                    return;
                }
                float f15 = o7Var.f9445f;
                g(canvas, rectF, paint, f10, f11, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (o7Var.f9450l) {
                float f16 = o7Var.f9445f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
            } else if (z10) {
                float f17 = o7Var.f9445f;
                g(canvas, rectF, paint, f10, f11, (-f17) / 2.0f, f17 / 2.0f);
            } else {
                canvas.drawArc(rectF, f10, f11 - f10, false, paint);
            }
        } else if (o7Var.f9450l) {
            float f18 = o7Var.f9445f;
            g(canvas, rectF, paint, f10, f11, ((-f18) / 2.0f) + 180.0f, (f18 / 2.0f) + 180.0f);
        } else if (f10 < 90.0f) {
            g(canvas, rectF, paint, f10, f11, o7Var.f9446g, o7Var.h);
        } else {
            g(canvas, rectF, paint, f10, f11, -o7Var.f9447i, o7Var.f9448j);
        }
    }

    public static void m(android.graphics.Canvas r23, di.z6 r24, org.telegram.messenger.ImageReceiver r25, di.o7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: di.s7.m(android.graphics.Canvas, di.z6, org.telegram.messenger.ImageReceiver, di.o7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static p7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && org.telegram.messenger.m5.o(peerStories.peer) != p10.i(p10.f24470s0).f24489n) {
            z6 z6Var = qp.s1(p10.f24470s0).f24795h0;
            int i7 = z6Var.f9996f.get(org.telegram.messenger.m5.o(peerStories.peer));
            int i10 = 0;
            while (true) {
                if (i10 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i10).f27195id > i7) {
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
                org.telegram.messenger.w7.G(p10.f24470s0);
                File J = org.telegram.messenger.w7.J(storyItem2.media.document, "", false, true);
                if (J != null && J.exists()) {
                    runnable.run();
                    return null;
                }
                org.telegram.messenger.w7.G(p10.f24470s0);
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
                    org.telegram.messenger.w7.G(p10.f24470s0);
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
            long o4 = org.telegram.messenger.m5.o(peerStories.peer);
            ?? obj = new Object();
            obj.f9514b = false;
            obj.f9513a = o4;
            obj.f9515c = z6Var;
            obj.d = new z0(20, obj, runnable);
            z0 z0Var = new z0(21, r0, obj);
            Runnable[] runnableArr = {z0Var};
            org.telegram.messenger.g0.i3(z0Var, 3000L);
            n7 n7Var = new n7(runnableArr, obj);
            obj.f9516e = n7Var;
            n7Var.f21236z1 = true;
            n7Var.P();
            String s5 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((n7) obj.f9516e).r0(hc.b(document), rf.b.r(s5, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((n7) obj.f9516e).u0(null, null, hc.i(org.telegram.messenger.w7.w(arrayList2, Integer.MAX_VALUE, false, null, false), photo2), s5, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((z0) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f9736b == null) {
            f10 f10Var = new f10();
            f9736b = f10Var;
            f10Var.f33547a = true;
            f10Var.f33548b = true;
            f10Var.d(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Zk, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.al, false), 0, 0);
            f9736b.f33549c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f9736b.f33549c.setStyle(Paint.Style.STROKE);
            f9736b.f33549c.setStrokeCap(Paint.Cap.ROUND);
        }
        f9736b.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return f9736b.f33549c;
    }

    public static Drawable p() {
        if (f9745m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f9745m = new BitmapDrawable(createBitmap);
        }
        return f9745m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f9737c == null) {
            f10 f10Var = new f10();
            f9737c = f10Var;
            f10Var.f33547a = true;
            f10Var.f33548b = true;
            f10Var.d(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.bl, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.cl, false), 0, 0);
            f9737c.f33549c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f9737c.f33549c.setStyle(Paint.Style.STROKE);
            f9737c.f33549c.setStrokeCap(Paint.Cap.ROUND);
        }
        f9737c.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return f9737c.f33549c;
    }

    public static int r(z6 z6Var, long j3) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i7 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i7 == 0) {
            return 0;
        }
        if (i7 > 0) {
            TLRPC.User a22 = qp.s1(p10.f24470s0).a2(Long.valueOf(j3));
            if (j3 == p10.i(p10.f24470s0).f24489n || a22 == null || (tL_recentStory2 = a22.stories_max_id) == null || tL_recentStory2.max_id <= 0 || a22.stories_unavailable) {
                return 0;
            }
            int i10 = z6Var.f9996f.get(j3, 0);
            TLRPC.TL_recentStory tL_recentStory3 = a22.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i10) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat M0 = qp.s1(p10.f24470s0).M0(Long.valueOf(-j3));
        if (M0 == null || (tL_recentStory = M0.stories_max_id) == null || tL_recentStory.max_id <= 0 || M0.stories_unavailable) {
            return 0;
        }
        int i11 = z6Var.f9996f.get(j3, 0);
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
        int max = (int) (Math.max(org.telegram.messenger.g0.c1().x, org.telegram.messenger.g0.c1().y) / org.telegram.messenger.g0.f22562p);
        return com.google.android.recaptcha.internal.a.j(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z9) {
        f10[] f10VarArr = f9735a;
        if (f10VarArr[z9 ? 1 : 0] == null) {
            f10 f10Var = new f10();
            f10VarArr[z9 ? 1 : 0] = f10Var;
            f10Var.f33547a = true;
            f10Var.f33548b = true;
            if (z9) {
                f10Var.d(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Xk, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Yk, false), 0, 0);
            } else {
                f10Var.d(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Vk, false), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Wk, false), 0, 0);
            }
            f10VarArr[z9 ? 1 : 0].f33549c.setStrokeWidth(org.telegram.messenger.g0.N(2.0f));
            f10VarArr[z9 ? 1 : 0].f33549c.setStyle(Paint.Style.STROKE);
            f10VarArr[z9 ? 1 : 0].f33549c.setStrokeCap(Paint.Cap.ROUND);
        }
        f10VarArr[z9 ? 1 : 0].b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return f10VarArr[z9 ? 1 : 0].f33549c;
    }

    public static CharSequence u(TextView textView, boolean z9) {
        String M0;
        if (z9) {
            M0 = id.M0(2131744672, null);
        } else {
            M0 = id.M0(2131743800, null);
        }
        if (M0.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
            w9 w9Var = new w9();
            valueOf.setSpan(w9Var, valueOf.length() - 1, valueOf.length(), 0);
            w9Var.f9913a = textView;
            w9Var.f9918n = false;
            return valueOf;
        }
        return M0;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime() <= storyItem.expire_date + 86400) {
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
            imageReceiver.r0(hc.c(org.telegram.messenger.w7.w(document.thumbs, Integer.MAX_VALUE, false, null, false), storyItem.media.document), "320_320", null, null, gc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.a(new v9(storyItem));
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
            imageReceiver.a(new v9(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.u0(null, null, hc.i(org.telegram.messenger.w7.w(arrayList, Integer.MAX_VALUE, false, null, false), photo), "320_320", null, null, gc.m(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.a(new v9(storyItem));
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
            imageReceiver.r0(hc.c(org.telegram.messenger.w7.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, gc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.u0(null, null, hc.i(org.telegram.messenger.w7.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, gc.m(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
