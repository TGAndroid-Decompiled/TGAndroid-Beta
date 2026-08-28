package ih;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.z10;
public abstract class p7 {
    public static z10 f11960b;
    public static z10 f11961c;
    public static z10 d;
    public static Paint f11962e;
    public static RectF f11963f;
    public static Paint f11964g;
    public static Paint h;
    public static nz0 f11965i;
    public static int f11966j;
    public static BitmapDrawable f11969m;
    public static final z10[] f11959a = new z10[2];
    public static final Paint[] f11967k = new Paint[2];
    public static final int[] f11968l = new int[2];
    public static final RectF f11970n = new RectF();
    public static final androidx.emoji2.text.m f11971o = new androidx.emoji2.text.m(1);
    public static final RectF f11972p = new RectF();
    public static final Path f11973q = new Path();
    public static final Matrix f11974r = new Matrix();
    public static final PathMeasure f11975s = new PathMeasure();
    public static final Path f11976t = new Path();

    public static void a(org.telegram.ui.ActionBar.h5 h5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            s9 s9Var = new s9();
            valueOf.setSpan(s9Var, valueOf.length() - 1, valueOf.length(), 0);
            s9Var.f12134a = h5Var;
            s9Var.f12139n = true;
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
                storyViews.recent_viewers.add(Long.valueOf(user.f22527id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.b6 b6Var) {
        if (f11962e == null) {
            Paint paint = new Paint(1);
            f11962e = paint;
            paint.setStyle(Paint.Style.STROKE);
            f11962e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            f11962e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var);
        if (f11966j != v02) {
            f11966j = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    f11962e.setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    f11962e.setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            f11962e.setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        int i9;
        Paint[] paintArr = f11967k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z10) {
            i9 = org.telegram.ui.ActionBar.f6.f23269s8;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.M8;
        }
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        int[] iArr = f11968l;
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

    public static SpannableStringBuilder e(int i9, boolean z10, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i9, objArr));
        eq eqVar = new eq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            eqVar.setScale(0.8f, 0.8f);
        } else {
            eqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(eqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new eq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
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

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, l7 l7Var) {
        boolean z10;
        boolean I = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10);
        if (UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && I) {
            z10 = true;
        } else {
            z10 = false;
        }
        i(j10, canvas, imageReceiver, z10, l7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, ih.l7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: ih.p7.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, ih.l7):void");
    }

    public static void j(Canvas canvas, l7 l7Var, Paint paint, boolean z10) {
        RectF rectF = f11970n;
        if (z10) {
            RectF rectF2 = f11972p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f10 = l7Var.f11720f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f10, boolean z10, float f11) {
        Canvas canvas2;
        if (f11965i == null) {
            f11965i = new nz0(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (f11964g == null) {
            Paint paint = new Paint(1);
            f11964g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f11963f == null) {
            f11963f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.f6.l1(f10, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f11);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f11);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float l10 = ((f11965i.l() + lerp) + lerp) / 2.0f;
        float f12 = 0.8f * lerp2;
        float f13 = lerp2 * 0.2f;
        f11963f.set((rectF.centerX() - l10) - dp, (rectF.bottom - f12) - dp, rectF.centerX() + l10 + dp, rectF.bottom + f13 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        canvas.scale(lerp3, lerp3, f11963f.centerX(), f11963f.centerY());
        AndroidUtilities.scaleRect(f11963f, f10);
        RectF rectF2 = f11963f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f11963f.height() / 2.0f, f11964g);
        if (z10) {
            f11963f.set(rectF.centerX() - l10, rectF.bottom - f12, rectF.centerX() + l10, rectF.bottom + f13);
            RectF rectF3 = f11963f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f11963f.height() / 2.0f, h);
            nz0 nz0Var = f11965i;
            RectF rectF4 = f11963f;
            canvas2 = canvas;
            nz0Var.c(rectF4.left + lerp, rectF4.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, l7 l7Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = f11973q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f11974r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f11975s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f11976t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (l7Var.f11724k) {
            boolean z11 = l7Var.f11726m;
            if (!z11 && !l7Var.f11725l) {
                if (f10 < 90.0f) {
                    float f14 = l7Var.f11720f;
                    g(canvas, rectF, paint, f10, f11, (-f14) / 2.0f, f14 / 2.0f);
                    return;
                }
                float f15 = l7Var.f11720f;
                g(canvas, rectF, paint, f10, f11, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (l7Var.f11725l) {
                float f16 = l7Var.f11720f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
            } else if (z11) {
                float f17 = l7Var.f11720f;
                g(canvas, rectF, paint, f10, f11, (-f17) / 2.0f, f17 / 2.0f);
            } else {
                canvas.drawArc(rectF, f10, f11 - f10, false, paint);
            }
        } else if (l7Var.f11725l) {
            float f18 = l7Var.f11720f;
            g(canvas, rectF, paint, f10, f11, ((-f18) / 2.0f) + 180.0f, (f18 / 2.0f) + 180.0f);
        } else if (f10 < 90.0f) {
            g(canvas, rectF, paint, f10, f11, l7Var.f11721g, l7Var.h);
        } else {
            g(canvas, rectF, paint, f10, f11, -l7Var.f11722i, l7Var.f11723j);
        }
    }

    public static void m(android.graphics.Canvas r23, ih.v6 r24, org.telegram.messenger.ImageReceiver r25, ih.l7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: ih.p7.m(android.graphics.Canvas, ih.v6, org.telegram.messenger.ImageReceiver, ih.l7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static m7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && DialogObject.getPeerDialogId(peerStories.peer) != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            v6 v6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
            int i9 = v6Var.f12240f.get(DialogObject.getPeerDialogId(peerStories.peer));
            int i10 = 0;
            while (true) {
                if (i10 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i10).f22617id > i9) {
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
            obj.f11772a = peerDialogId;
            obj.f11773b = v6Var;
            obj.f11774c = new j7(0, obj, runnable);
            j7 j7Var = new j7(r0, obj);
            Runnable[] runnableArr = {j7Var};
            AndroidUtilities.runOnUIThread(j7Var, 3000L);
            k7 k7Var = new k7(runnableArr, obj);
            obj.f11775e = k7Var;
            k7Var.setAllowLoadingOnAttachedOnly(true);
            obj.f11775e.onAttachedToWindow();
            String s10 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                obj.f11775e.setImage(ImageLocation.getForDocument(document), ta.b.j(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    obj.f11775e.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    obj.f11774c.run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f11960b == null) {
            z10 z10Var = new z10();
            f11960b = z10Var;
            z10Var.f35153a = true;
            z10Var.f35154b = true;
            z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.lk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.mk, false), 0, 0);
            f11960b.f35155c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f11960b.f35155c.setStyle(Paint.Style.STROKE);
            f11960b.f35155c.setStrokeCap(Paint.Cap.ROUND);
        }
        f11960b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f11960b.f35155c;
    }

    public static Drawable p() {
        if (f11969m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f11969m = new BitmapDrawable(createBitmap);
        }
        return f11969m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f11961c == null) {
            z10 z10Var = new z10();
            f11961c = z10Var;
            z10Var.f35153a = true;
            z10Var.f35154b = true;
            z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.nk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ok, false), 0, 0);
            f11961c.f35155c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f11961c.f35155c.setStyle(Paint.Style.STROKE);
            f11961c.f35155c.setStrokeCap(Paint.Cap.ROUND);
        }
        f11961c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f11961c.f35155c;
    }

    public static int r(v6 v6Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i9 == 0) {
            return 0;
        }
        if (i9 > 0) {
            TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || user == null || (tL_recentStory2 = user.stories_max_id) == null || tL_recentStory2.max_id <= 0 || user.stories_unavailable) {
                return 0;
            }
            int i10 = v6Var.f12240f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = user.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            if (tL_recentStory3.max_id <= i10) {
                return 2;
            }
            return 1;
        }
        TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
        if (chat == null || (tL_recentStory = chat.stories_max_id) == null || tL_recentStory.max_id <= 0 || chat.stories_unavailable) {
            return 0;
        }
        int i11 = v6Var.f12240f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = chat.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        if (tL_recentStory4.max_id <= i11) {
            return 2;
        }
        return 1;
    }

    public static String s() {
        int max = (int) (Math.max(AndroidUtilities.getRealScreenSize().x, AndroidUtilities.getRealScreenSize().y) / AndroidUtilities.density);
        return e2.c.l(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        z10[] z10VarArr = f11959a;
        if (z10VarArr[z10 ? 1 : 0] == null) {
            z10 z10Var = new z10();
            z10VarArr[z10 ? 1 : 0] = z10Var;
            z10Var.f35153a = true;
            z10Var.f35154b = true;
            if (z10) {
                z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.jk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.kk, false), 0, 0);
            } else {
                z10Var.d(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hk, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.ik, false), 0, 0);
            }
            z10VarArr[z10 ? 1 : 0].f35155c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            z10VarArr[z10 ? 1 : 0].f35155c.setStyle(Paint.Style.STROKE);
            z10VarArr[z10 ? 1 : 0].f35155c.setStrokeCap(Paint.Cap.ROUND);
        }
        z10VarArr[z10 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return z10VarArr[z10 ? 1 : 0].f35155c;
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
            s9 s9Var = new s9();
            valueOf.setSpan(s9Var, valueOf.length() - 1, valueOf.length(), 0);
            s9Var.f12134a = textView;
            s9Var.f12139n = false;
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

    public static boolean w(int i9, TL_stories.StoryItem storyItem) {
        if (ConnectionsManager.getInstance(i9).getCurrentTime() > storyItem.expire_date) {
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
            imageReceiver.addDecorator(new r9(storyItem));
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
            imageReceiver.addDecorator(new r9(storyItem));
        } else if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, Integer.MAX_VALUE), photo), "320_320", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.addDecorator(new r9(storyItem));
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
