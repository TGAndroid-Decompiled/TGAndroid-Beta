package lh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.zz0;
public abstract class l7 {
    public static k20 f15897b;
    public static k20 f15898c;
    public static k20 d;
    public static Paint f15899e;
    public static RectF f15900f;
    public static Paint f15901g;
    public static Paint h;
    public static zz0 f15902i;
    public static int f15903j;
    public static BitmapDrawable f15906m;
    public static final k20[] f15896a = new k20[2];
    public static final Paint[] f15904k = new Paint[2];
    public static final int[] f15905l = new int[2];
    public static final RectF f15907n = new RectF();
    public static final ab.n f15908o = new ab.n(2);
    public static final RectF f15909p = new RectF();
    public static final Path f15910q = new Path();
    public static final Matrix f15911r = new Matrix();
    public static final PathMeasure f15912s = new PathMeasure();
    public static final Path f15913t = new Path();

    public static void a(org.telegram.ui.ActionBar.h5 h5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            o9 o9Var = new o9();
            valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
            o9Var.f16035a = h5Var;
            o9Var.f16040n = true;
            h5Var.l(valueOf, false);
            return;
        }
        h5Var.l(string, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f22539id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.c6 c6Var) {
        if (f15899e == null) {
            Paint paint = new Paint(1);
            f15899e = paint;
            paint.setStyle(Paint.Style.STROKE);
            f15899e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            f15899e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
        if (f15903j != v02) {
            f15903j = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    f15899e.setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    f15899e.setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            f15899e.setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        int i10;
        Paint[] paintArr = f15904k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.g6.f23329s8;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.M8;
        }
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        int[] iArr = f15905l;
        if (iArr[z10 ? 1 : 0] != v02) {
            iArr[z10 ? 1 : 0] = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            paintArr[z10 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        iq iqVar = new iq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            iqVar.setScale(0.8f, 0.8f);
        } else {
            iqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(iqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new iq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f9, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f9;
        if (f9 < f11 && f10 < f11 + f14) {
            f13 = f9;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f9, false, paint);
            z10 = true;
        } else {
            f13 = f9;
            z10 = false;
        }
        float max = Math.max(f13, f12);
        float min = Math.min(f10, f11 + 360.0f);
        if (min < max) {
            if (!z10) {
                if (f13 <= f11 || f10 >= f12) {
                    canvas.drawArc(rectF, f13, f14, false, paint);
                    return;
                }
                return;
            }
            return;
        }
        canvas.drawArc(rectF, max, min - max, false, paint);
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, h7 h7Var) {
        boolean z10;
        boolean I = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10);
        if (UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && I) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j10, canvas, imageReceiver, z10, h7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, lh.h7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: lh.l7.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, lh.h7):void");
    }

    public static void j(Canvas canvas, h7 h7Var, Paint paint, boolean z10) {
        RectF rectF = f15907n;
        if (z10) {
            RectF rectF2 = f15909p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f9 = h7Var.f15669f;
        if (f9 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f9 / 2.0f) + 360.0f, 360.0f - f9, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f9, boolean z10, float f10) {
        Canvas canvas2;
        if (f15902i == null) {
            f15902i = new zz0(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (f15901g == null) {
            Paint paint = new Paint(1);
            f15901g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f15900f == null) {
            f15900f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.g6.l1(f9, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f10);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f10);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float l10 = ((f15902i.l() + lerp) + lerp) / 2.0f;
        float f11 = 0.8f * lerp2;
        float f12 = lerp2 * 0.2f;
        f15900f.set((rectF.centerX() - l10) - dp, (rectF.bottom - f11) - dp, rectF.centerX() + l10 + dp, rectF.bottom + f12 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f9);
        canvas.scale(lerp3, lerp3, f15900f.centerX(), f15900f.centerY());
        AndroidUtilities.scaleRect(f15900f, f9);
        RectF rectF2 = f15900f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f15900f.height() / 2.0f, f15901g);
        if (z10) {
            f15900f.set(rectF.centerX() - l10, rectF.bottom - f11, rectF.centerX() + l10, rectF.bottom + f12);
            RectF rectF3 = f15900f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f15900f.height() / 2.0f, h);
            zz0 zz0Var = f15902i;
            RectF rectF4 = f15900f;
            canvas2 = canvas;
            zz0Var.c(rectF4.left + lerp, rectF4.centerY(), f9, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f9, float f10, h7 h7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f9) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = f15910q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f15911r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f15912s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f15913t;
            path2.reset();
            pathMeasure.getSegment(((f9 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (h7Var.f15673k) {
            boolean z11 = h7Var.f15675m;
            if (!z11 && !h7Var.f15674l) {
                if (f9 < 90.0f) {
                    float f13 = h7Var.f15669f;
                    g(canvas, rectF, paint, f9, f10, (-f13) / 2.0f, f13 / 2.0f);
                    return;
                }
                float f14 = h7Var.f15669f;
                g(canvas, rectF, paint, f9, f10, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
            } else if (h7Var.f15674l) {
                float f15 = h7Var.f15669f;
                g(canvas, rectF, paint, f9, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (z11) {
                float f16 = h7Var.f15669f;
                g(canvas, rectF, paint, f9, f10, (-f16) / 2.0f, f16 / 2.0f);
            } else {
                canvas.drawArc(rectF, f9, f10 - f9, false, paint);
            }
        } else if (h7Var.f15674l) {
            float f17 = h7Var.f15669f;
            g(canvas, rectF, paint, f9, f10, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (f9 < 90.0f) {
            g(canvas, rectF, paint, f9, f10, h7Var.f15670g, h7Var.h);
        } else {
            g(canvas, rectF, paint, f9, f10, -h7Var.f15671i, h7Var.f15672j);
        }
    }

    public static void m(android.graphics.Canvas r23, lh.s6 r24, org.telegram.messenger.ImageReceiver r25, lh.h7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: lh.l7.m(android.graphics.Canvas, lh.s6, org.telegram.messenger.ImageReceiver, lh.h7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static i7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && DialogObject.getPeerDialogId(peerStories.peer) != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            s6 s6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
            int i10 = s6Var.f16222f.get(DialogObject.getPeerDialogId(peerStories.peer));
            int i11 = 0;
            while (true) {
                if (i11 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i11).f22629id > i10) {
                        storyItem = peerStories.stories.get(i11);
                        break;
                    }
                    i11++;
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
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", false);
                if (pathToAttach != null && pathToAttach.exists()) {
                    runnable.run();
                    return null;
                }
                File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(storyItem2.media.document, "", true);
                if (pathToAttach2 != null) {
                    try {
                        if (pathToAttach2.getName().lastIndexOf(".") > 0) {
                            File file = new File(pathToAttach2.getParentFile(), pathToAttach2.getName().substring(0, lastIndexOf) + ".temp");
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
                    File pathToAttach3 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), "", false);
                    if (pathToAttach3 != null && pathToAttach3.exists()) {
                        runnable.run();
                        return null;
                    }
                } else {
                    runnable.run();
                    return null;
                }
            }
            long peerDialogId = DialogObject.getPeerDialogId(peerStories.peer);
            ?? obj = new Object();
            obj.d = false;
            obj.f15731a = peerDialogId;
            obj.f15732b = s6Var;
            obj.f15733c = new r3(16, obj, runnable);
            r3 r3Var = new r3(17, r0, obj);
            Runnable[] runnableArr = {r3Var};
            AndroidUtilities.runOnUIThread(r3Var, 3000L);
            g7 g7Var = new g7(runnableArr, obj);
            obj.f15734e = g7Var;
            g7Var.setAllowLoadingOnAttachedOnly(true);
            obj.f15734e.onAttachedToWindow();
            String s10 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                obj.f15734e.setImage(ImageLocation.getForDocument(document), u3.c.k(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    obj.f15734e.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    obj.f15733c.run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f15897b == null) {
            k20 k20Var = new k20();
            f15897b = k20Var;
            k20Var.f29891a = true;
            k20Var.f29892b = true;
            k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.lk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.mk, false), 0, 0);
            f15897b.f29893c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f15897b.f29893c.setStyle(Paint.Style.STROKE);
            f15897b.f29893c.setStrokeCap(Paint.Cap.ROUND);
        }
        f15897b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f15897b.f29893c;
    }

    public static Drawable p() {
        if (f15906m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f15906m = new BitmapDrawable(createBitmap);
        }
        return f15906m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f15898c == null) {
            k20 k20Var = new k20();
            f15898c = k20Var;
            k20Var.f29891a = true;
            k20Var.f29892b = true;
            k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ok, false), 0, 0);
            f15898c.f29893c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f15898c.f29893c.setStyle(Paint.Style.STROKE);
            f15898c.f29893c.setStrokeCap(Paint.Cap.ROUND);
        }
        f15898c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f15898c.f29893c;
    }

    public static int r(s6 s6Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
                return 0;
            }
            int i11 = s6Var.f16222f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = user.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i11) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
        if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
            return 0;
        }
        int i12 = s6Var.f16222f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = chat.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i12) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.k(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        k20[] k20VarArr = f15896a;
        if (k20VarArr[z10 ? 1 : 0] == null) {
            k20 k20Var = new k20();
            k20VarArr[z10 ? 1 : 0] = k20Var;
            k20Var.f29891a = true;
            k20Var.f29892b = true;
            if (z10) {
                k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.jk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.kk, false), 0, 0);
            } else {
                k20Var.d(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hk, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ik, false), 0, 0);
            }
            k20VarArr[z10 ? 1 : 0].f29893c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            k20VarArr[z10 ? 1 : 0].f29893c.setStyle(Paint.Style.STROKE);
            k20VarArr[z10 ? 1 : 0].f29893c.setStrokeCap(Paint.Cap.ROUND);
        }
        k20VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return k20VarArr[z10 ? 1 : 0].f29893c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String string;
        if (z10) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            o9 o9Var = new o9();
            valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
            o9Var.f16035a = textView;
            o9Var.f16040n = false;
            return valueOf;
        }
        return string;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        if (storyItem == null || ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() <= storyItem.expire_date + 86400) {
            return false;
        }
        return true;
    }

    public static boolean w(int i10, TL_stories.StoryItem storyItem) {
        if (ConnectionsManager.getInstance(i10).getCurrentTime() > storyItem.expire_date) {
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
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, Integer.MAX_VALUE), storyItem.media.document), "320_320", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new n9(storyItem));
            return;
        }
        if (messageMedia != null) {
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.a.d(0.2f, -16777216, -1));
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new n9(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new n9(storyItem));
        } else {
            imageReceiver.clearImage();
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
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1000), storyItem.media.document), "100_100", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000), photo), "100_100", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.clearImage();
        }
    }
}
