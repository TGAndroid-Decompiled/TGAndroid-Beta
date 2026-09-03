package nh;

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
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q20;
public abstract class m7 {
    public static q20 f15602b;
    public static q20 f15603c;
    public static q20 d;
    public static Paint e;
    public static RectF f15604f;
    public static Paint f15605g;
    public static Paint h;
    public static k01 f15606i;
    public static int f15607j;
    public static BitmapDrawable f15610m;
    public static final q20[] f15601a = new q20[2];
    public static final Paint[] f15608k = new Paint[2];
    public static final int[] f15609l = new int[2];
    public static final RectF f15611n = new RectF();
    public static final androidx.emoji2.text.n f15612o = new androidx.emoji2.text.n(2);
    public static final RectF f15613p = new RectF();
    public static final Path f15614q = new Path();
    public static final Matrix f15615r = new Matrix();
    public static final PathMeasure f15616s = new PathMeasure();
    public static final Path f15617t = new Path();

    public static void a(org.telegram.ui.ActionBar.k5 k5Var) {
        String string = LocaleController.getString(R.string.UploadingStory);
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            o9 o9Var = new o9();
            valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
            o9Var.f15700a = k5Var;
            o9Var.f15704n = true;
            k5Var.l(valueOf, false);
            return;
        }
        k5Var.l(string, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user != null && storyItem.dialogId == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !v(storyItem)) {
            if (storyItem.views == null) {
                storyItem.views = new TL_stories.TL_storyViews();
            }
            TL_stories.StoryViews storyViews = storyItem.views;
            if (storyViews.views_count == 0) {
                storyViews.views_count = 1;
                storyViews.recent_viewers.add(Long.valueOf(user.f19306id));
            }
        }
    }

    public static void c(org.telegram.ui.ActionBar.f6 f6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var);
        if (f15607j != v02) {
            f15607j = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    e.setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    e.setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            e.setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static void d(org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        int i10;
        Paint[] paintArr = f15608k;
        if (paintArr[z4 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z4 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z4 ? 1 : 0].setStrokeWidth(AndroidUtilities.dpf2(1.3f));
            paintArr[z4 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        if (!z4) {
            i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.M8;
        }
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        int[] iArr = f15609l;
        if (iArr[z4 ? 1 : 0] != v02) {
            iArr[z4 ? 1 : 0] = v02;
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(v02);
            if (computePerceivedBrightness < 0.721f) {
                if (computePerceivedBrightness < 0.25f) {
                    paintArr[z4 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -1));
                    return;
                } else {
                    paintArr[z4 ? 1 : 0].setColor(i0.a.d(0.44f, v02, -1));
                    return;
                }
            }
            paintArr[z4 ? 1 : 0].setColor(i0.a.d(0.2f, v02, -16777216));
        }
    }

    public static SpannableStringBuilder e(int i10, boolean z4, Object... objArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.formatString(i10, objArr));
        lq lqVar = new lq(R.drawable.msg_mini_bomb, 0);
        if (z4) {
            lqVar.setScale(0.8f, 0.8f);
        } else {
            lqVar.setTopOffset(-1);
        }
        spannableStringBuilder.setSpan(lqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) LocaleController.getString(R.string.Story));
        spannableStringBuilder.setSpan(new lq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, float f12, float f13) {
        float f14;
        boolean z4;
        float f15 = f11 - f10;
        if (f10 < f12 && f11 < f12 + f15) {
            f14 = f10;
            canvas.drawArc(rectF, f14, Math.min(f11, f12) - f10, false, paint);
            z4 = true;
        } else {
            f14 = f10;
            z4 = false;
        }
        float max = Math.max(f14, f13);
        float min = Math.min(f11, f12 + 360.0f);
        if (min < max) {
            if (!z4) {
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

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, i7 i7Var) {
        boolean z4;
        boolean I = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().I(j10);
        if (UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId() != j10 && I) {
            z4 = true;
        } else {
            z4 = false;
        }
        i(j10, canvas, imageReceiver, z4, i7Var);
    }

    public static void i(long r30, android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver r33, boolean r34, nh.i7 r35) {
        throw new UnsupportedOperationException("Method not decompiled: nh.m7.i(long, android.graphics.Canvas, org.telegram.messenger.ImageReceiver, boolean, nh.i7):void");
    }

    public static void j(Canvas canvas, i7 i7Var, Paint paint, boolean z4) {
        RectF rectF = f15611n;
        if (z4) {
            RectF rectF2 = f15613p;
            rectF2.set(rectF);
            rectF2.inset(AndroidUtilities.dp(0.5f), AndroidUtilities.dp(0.5f));
            canvas.drawRoundRect(rectF2, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), paint);
            return;
        }
        float f10 = i7Var.f15403f;
        if (f10 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f10 / 2.0f) + 360.0f, 360.0f - f10, false, paint);
        }
    }

    public static void k(Canvas canvas, RectF rectF, float f10, boolean z4, float f11) {
        Canvas canvas2;
        if (f15606i == null) {
            f15606i = new k01(LocaleController.getString(R.string.LiveStoryBadge), 9.66f, AndroidUtilities.bold());
        }
        if (f15605g == null) {
            Paint paint = new Paint(1);
            f15605g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f15604f == null) {
            f15604f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.j6.l1(f10, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false)));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(4.66f), AndroidUtilities.dp(7.0f), f11);
        float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(18.0f), f11);
        float dp = AndroidUtilities.dp(2.0f);
        canvas.save();
        float l10 = ((f15606i.l() + lerp) + lerp) / 2.0f;
        float f12 = 0.8f * lerp2;
        float f13 = lerp2 * 0.2f;
        f15604f.set((rectF.centerX() - l10) - dp, (rectF.bottom - f12) - dp, rectF.centerX() + l10 + dp, rectF.bottom + f13 + dp);
        float lerp3 = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        canvas.scale(lerp3, lerp3, f15604f.centerX(), f15604f.centerY());
        AndroidUtilities.scaleRect(f15604f, f10);
        RectF rectF2 = f15604f;
        canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, f15604f.height() / 2.0f, f15605g);
        if (z4) {
            f15604f.set(rectF.centerX() - l10, rectF.bottom - f12, rectF.centerX() + l10, rectF.bottom + f13);
            RectF rectF3 = f15604f;
            canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f15604f.height() / 2.0f, h);
            k01 k01Var = f15606i;
            RectF rectF4 = f15604f;
            canvas2 = canvas;
            k01Var.c(rectF4.left + lerp, rectF4.centerY(), f10, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f10, float f11, i7 i7Var, boolean z4) {
        if (z4) {
            float height = rectF.height() * 0.32f;
            float f12 = ((((int) f10) / 90) * 90) + 90;
            float f13 = (-199.0f) + f12;
            Path path = f15614q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = f15615r;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = f15616s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = f15617t;
            path2.reset();
            pathMeasure.getSegment(((f10 - f13) / 360.0f) * length, length * ((f11 - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
        } else if (i7Var.f15407k) {
            boolean z10 = i7Var.f15409m;
            if (!z10 && !i7Var.f15408l) {
                if (f10 < 90.0f) {
                    float f14 = i7Var.f15403f;
                    g(canvas, rectF, paint, f10, f11, (-f14) / 2.0f, f14 / 2.0f);
                    return;
                }
                float f15 = i7Var.f15403f;
                g(canvas, rectF, paint, f10, f11, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
            } else if (i7Var.f15408l) {
                float f16 = i7Var.f15403f;
                g(canvas, rectF, paint, f10, f11, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
            } else if (z10) {
                float f17 = i7Var.f15403f;
                g(canvas, rectF, paint, f10, f11, (-f17) / 2.0f, f17 / 2.0f);
            } else {
                canvas.drawArc(rectF, f10, f11 - f10, false, paint);
            }
        } else if (i7Var.f15408l) {
            float f18 = i7Var.f15403f;
            g(canvas, rectF, paint, f10, f11, ((-f18) / 2.0f) + 180.0f, (f18 / 2.0f) + 180.0f);
        } else if (f10 < 90.0f) {
            g(canvas, rectF, paint, f10, f11, i7Var.f15404g, i7Var.h);
        } else {
            g(canvas, rectF, paint, f10, f11, -i7Var.f15405i, i7Var.f15406j);
        }
    }

    public static void m(android.graphics.Canvas r23, nh.t6 r24, org.telegram.messenger.ImageReceiver r25, nh.i7 r26, android.graphics.Paint r27, android.graphics.Paint r28, android.graphics.Paint r29, android.graphics.Paint r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: nh.m7.m(android.graphics.Canvas, nh.t6, org.telegram.messenger.ImageReceiver, nh.i7, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, android.graphics.Paint, boolean):void");
    }

    public static j7 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        int lastIndexOf;
        if (peerStories != null && !peerStories.stories.isEmpty() && DialogObject.getPeerDialogId(peerStories.peer) != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            t6 t6Var = MessagesController.getInstance(UserConfig.selectedAccount).storiesController;
            int i10 = t6Var.f15900f.get(DialogObject.getPeerDialogId(peerStories.peer));
            int i11 = 0;
            while (true) {
                if (i11 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i11).f19394id > i10) {
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
            obj.f15503b = false;
            obj.f15502a = peerDialogId;
            obj.f15504c = t6Var;
            obj.d = new n4(15, obj, runnable);
            n4 n4Var = new n4(16, r0, obj);
            Runnable[] runnableArr = {n4Var};
            AndroidUtilities.runOnUIThread(n4Var, 3000L);
            h7 h7Var = new h7(runnableArr, obj);
            obj.e = h7Var;
            h7Var.setAllowLoadingOnAttachedOnly(true);
            ((h7) obj.e).onAttachedToWindow();
            String s6 = s();
            TLRPC.MessageMedia messageMedia2 = storyItem2.media;
            if (messageMedia2 != null && (document = messageMedia2.document) != null) {
                ((h7) obj.e).setImage(ImageLocation.getForDocument(document), vh.w2.k(s6, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
            } else {
                if (messageMedia2 != null) {
                    photo2 = messageMedia2.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null && (arrayList2 = photo2.sizes) != null) {
                    ((h7) obj.e).setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList2, Integer.MAX_VALUE), photo2), s6, null, null, null, 0L, null, storyItem2, 0);
                } else {
                    ((n4) obj.d).run();
                    return null;
                }
            }
            return obj;
        }
        runnable.run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (f15602b == null) {
            q20 q20Var = new q20();
            f15602b = q20Var;
            q20Var.f28048a = true;
            q20Var.f28049b = true;
            q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.lk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.mk, false), 0, 0);
            f15602b.f28050c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f15602b.f28050c.setStyle(Paint.Style.STROKE);
            f15602b.f28050c.setStrokeCap(Paint.Cap.ROUND);
        }
        f15602b.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f15602b.f28050c;
    }

    public static Drawable p() {
        if (f15610m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, 180, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.a.k(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            f15610m = new BitmapDrawable(createBitmap);
        }
        return f15610m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (f15603c == null) {
            q20 q20Var = new q20();
            f15603c = q20Var;
            q20Var.f28048a = true;
            q20Var.f28049b = true;
            q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.nk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ok, false), 0, 0);
            f15603c.f28050c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            f15603c.f28050c.setStyle(Paint.Style.STROKE);
            f15603c.f28050c.setStrokeCap(Paint.Cap.ROUND);
        }
        f15603c.b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return f15603c.f28050c;
    }

    public static int r(t6 t6Var, long j10) {
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
            int i11 = t6Var.f15900f.get(j10, 0);
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
        int i12 = t6Var.f15900f.get(j10, 0);
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
        return e2.c.h(max, "_", max);
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z4) {
        q20[] q20VarArr = f15601a;
        if (q20VarArr[z4 ? 1 : 0] == null) {
            q20 q20Var = new q20();
            q20VarArr[z4 ? 1 : 0] = q20Var;
            q20Var.f28048a = true;
            q20Var.f28049b = true;
            if (z4) {
                q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.jk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.kk, false), 0, 0);
            } else {
                q20Var.d(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hk, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.ik, false), 0, 0);
            }
            q20VarArr[z4 ? 1 : 0].f28050c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
            q20VarArr[z4 ? 1 : 0].f28050c.setStyle(Paint.Style.STROKE);
            q20VarArr[z4 ? 1 : 0].f28050c.setStrokeCap(Paint.Cap.ROUND);
        }
        q20VarArr[z4 ? 1 : 0].b(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2());
        return q20VarArr[z4 ? 1 : 0].f28050c;
    }

    public static CharSequence u(TextView textView, boolean z4) {
        String string;
        if (z4) {
            string = LocaleController.getString(R.string.StoryEditing);
        } else {
            string = LocaleController.getString(R.string.UploadingStory);
        }
        if (string.indexOf("…") > 0) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
            o9 o9Var = new o9();
            valueOf.setSpan(o9Var, valueOf.length() - 1, valueOf.length(), 0);
            o9Var.f15700a = textView;
            o9Var.f15704n = false;
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
