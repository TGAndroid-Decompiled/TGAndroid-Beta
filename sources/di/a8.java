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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.q11;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Components.zq;
public abstract class a8 {
    public static z20 f8379b;
    public static z20 f8380c;
    public static z20 d;
    public static Paint e;
    public static RectF f8381f;
    public static Paint f8382g;
    public static Paint h;
    public static q11 f8383i;
    public static int f8384j;
    public static BitmapDrawable f8387m;
    public static final z20[] f8378a = new z20[2];
    public static final Paint[] f8385k = new Paint[2];
    public static final int[] f8386l = new int[2];
    public static final RectF f8388n = new RectF();
    public static final androidx.emoji2.text.n f8389o = new androidx.emoji2.text.n(1);
    public static final RectF f8390p = new RectF();
    public static final Path f8391q = new Path();
    public static final Matrix f8392r = new Matrix();
    public static final PathMeasure f8393s = new PathMeasure();
    public static final Path f8394t = new Path();

    public static void a(org.telegram.ui.ActionBar.b6 b6Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            ea eaVar = new ea();
            valueOf.setSpan(eaVar, valueOf.length() - 1, valueOf.length(), 0);
            eaVar.f8536a = b6Var;
            eaVar.f8540n = true;
            b6Var.l(valueOf, false);
            return;
        }
        b6Var.l(string, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f22176id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.u6 u6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23356d6, u6Var);
        if (f8384j != w02) {
            f8384j = w02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(w02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    e.setColor(i0.a.f(0.2f, w02, -1));
                    return;
                } else {
                    e.setColor(i0.a.f(0.44f, w02, -1));
                    return;
                }
            }
            e.setColor(i0.a.f(0.2f, w02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        int i10;
        Paint[] paintArr = f8385k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i10 = org.telegram.ui.ActionBar.y6.f23636s8;
        } else {
            i10 = org.telegram.ui.ActionBar.y6.M8;
        }
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        int[] iArr = f8386l;
        if (iArr[z10 ? 1 : 0] != w02) {
            iArr[z10 ? 1 : 0] = w02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(w02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
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

    public static SpannableStringBuilder e(int i10, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        zq zqVar = new zq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            zqVar.setScale(0.8f, 0.8f);
        } else {
            zqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(zqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new zq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f7;
        if (f7 < f11 && f10 < f11 + f14) {
            f13 = f7;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f7, false, paint);
            z10 = true;
        } else {
            f13 = f7;
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

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, w7 w7Var) {
        boolean z10;
        boolean I = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10);
        if (UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && I) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j10, canvas, imageReceiver, z10, w7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, di.w7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: di.a8.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, di.w7):void");
    }

    public static void j(Canvas canvas, w7 w7Var, Paint paint, boolean z10) {
        RectF rectF = f8388n;
        if (z10) {
            RectF rectF2 = f8390p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f7 = w7Var.f9315f;
        if (f7 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f7 / 2.0f) + 360.0f, 360.0f - f7, false, paint);
        }
    }

    public static void k(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        Canvas canvas2;
        if (f8383i == null) {
            f8383i = new q11(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (f8382g == null) {
            Paint paint = new Paint(1);
            f8382g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f8381f == null) {
            f8381f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.y6.o1(f7, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f10);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f10);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float l4 = ((f8383i.l() + lerp) + lerp) / 2.0f;
        float f11 = 0.8f * lerp2;
        float f12 = lerp2 * 0.2f;
        f8381f.set((rectF.centerX() - l4) - dp, (rectF.bottom - f11) - dp, rectF.centerX() + l4 + dp, rectF.bottom + f12 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f7);
        canvas.scale(lerp3, lerp3, f8381f.centerX(), f8381f.centerY());
        AndroidUtilities.scaleRect(f8381f, f7);
        RectF rectF2 = f8381f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f8381f.height() / 2.0f, f8382g);
        if (z10) {
            f8381f.set(rectF.centerX() - l4, rectF.bottom - f11, rectF.centerX() + l4, rectF.bottom + f12);
            RectF rectF3 = f8381f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f8381f.height() / 2.0f, h);
            q11 q11Var = f8383i;
            RectF rectF4 = f8381f;
            canvas2 = canvas;
            q11Var.c(rectF4.left + lerp, rectF4.centerY(), f7, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, w7 w7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = f8391q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f8392r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f8393s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f8394t;
            path2.reset();
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (w7Var.f9319k) {
            boolean z11 = w7Var.f9321m;
            if (!z11 && !w7Var.f9320l) {
                if (f7 < 90.0f) {
                    float f13 = w7Var.f9315f;
                    g(canvas, rectF, paint, f7, f10, (-f13) / 2.0f, f13 / 2.0f);
                    return;
                }
                float f14 = w7Var.f9315f;
                g(canvas, rectF, paint, f7, f10, ((-f14) / 2.0f) + 180.0f, (f14 / 2.0f) + 180.0f);
            } else if (w7Var.f9320l) {
                float f15 = w7Var.f9315f;
                g(canvas, rectF, paint, f7, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (z11) {
                float f16 = w7Var.f9315f;
                g(canvas, rectF, paint, f7, f10, (-f16) / 2.0f, f16 / 2.0f);
            } else {
                canvas.drawArc(rectF, f7, f10 - f7, false, paint);
            }
        } else if (w7Var.f9320l) {
            float f17 = w7Var.f9315f;
            g(canvas, rectF, paint, f7, f10, ((-f17) / 2.0f) + 180.0f, (f17 / 2.0f) + 180.0f);
        } else if (f7 < 90.0f) {
            g(canvas, rectF, paint, f7, f10, w7Var.f9316g, w7Var.h);
        } else {
            g(canvas, rectF, paint, f7, f10, -w7Var.f9317i, w7Var.f9318j);
        }
    }

    public static void m(android.graphics.Canvas r23, di.h7 r24, org.telegram.messenger.ImageReceiver r25, di.w7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: di.a8.m(android.graphics.Canvas, di.h7, org.telegram.messenger.ImageReceiver, di.w7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static x7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && DialogObject.getPeerDialogId(peerStories.peer) != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            h7 h7Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
            int i10 = h7Var.f8633f.get(DialogObject.getPeerDialogId(peerStories.peer));
            int i11 = 0;
            while (true) {
                if (i11 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i11).f22266id > i10) {
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
            obj.f9381b = false;
            obj.f9380a = peerDialogId;
            obj.f9382c = h7Var;
            obj.d = new b4(16, obj, runnable);
            b4 b4Var = new b4(17, r0, obj);
            Runnable[] runnableArr = {b4Var};
            AndroidUtilities.runOnUIThread(b4Var, 3000L);
            v7 v7Var = new v7(runnableArr, obj);
            obj.e = v7Var;
            v7Var.setAllowLoadingOnAttachedOnly(true);
            ((v7) obj.e).onAttachedToWindow();
            String s10 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((v7) obj.e).setImage(ImageLocation.getForDocument(document), b10.u(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((v7) obj.e).setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((b4) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f8379b == null) {
            z20 z20Var = new z20();
            f8379b = z20Var;
            z20Var.f35185a = true;
            z20Var.f35186b = true;
            z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.lk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.mk, false), 0, 0);
            f8379b.f35187c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f8379b.f35187c.setStyle(Paint.Style.STROKE);
            f8379b.f35187c.setStrokeCap(Paint.Cap.ROUND);
        }
        f8379b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f8379b.f35187c;
    }

    public static Drawable p() {
        if (f8387m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f8387m = new BitmapDrawable(createBitmap);
        }
        return f8387m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f8380c == null) {
            z20 z20Var = new z20();
            f8380c = z20Var;
            z20Var.f35185a = true;
            z20Var.f35186b = true;
            z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.nk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ok, false), 0, 0);
            f8380c.f35187c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f8380c.f35187c.setStyle(Paint.Style.STROKE);
            f8380c.f35187c.setStrokeCap(Paint.Cap.ROUND);
        }
        f8380c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f8380c.f35187c;
    }

    public static int r(h7 h7Var, long j10) {
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
            int i11 = h7Var.f8633f.get(j10, 0);
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
        int i12 = h7Var.f8633f.get(j10, 0);
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
        return a1.g.k(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        z20[] z20VarArr = f8378a;
        if (z20VarArr[z10 ? 1 : 0] == null) {
            z20 z20Var = new z20();
            z20VarArr[z10 ? 1 : 0] = z20Var;
            z20Var.f35185a = true;
            z20Var.f35186b = true;
            if (z10) {
                z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.jk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.kk, false), 0, 0);
            } else {
                z20Var.d(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hk, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ik, false), 0, 0);
            }
            z20VarArr[z10 ? 1 : 0].f35187c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            z20VarArr[z10 ? 1 : 0].f35187c.setStyle(Paint.Style.STROKE);
            z20VarArr[z10 ? 1 : 0].f35187c.setStrokeCap(Paint.Cap.ROUND);
        }
        z20VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return z20VarArr[z10 ? 1 : 0].f35187c;
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
            ea eaVar = new ea();
            valueOf.setSpan(eaVar, valueOf.length() - 1, valueOf.length(), 0);
            eaVar.f8536a = textView;
            eaVar.f8540n = false;
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
            imageReceiver.addDecorator(new da(storyItem));
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
            imageReceiver.setImageBitmap(createBitmap);
            imageReceiver.addDecorator(new da(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new da(storyItem));
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
