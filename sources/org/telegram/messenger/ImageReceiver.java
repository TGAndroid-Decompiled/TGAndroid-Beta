package org.telegram.messenger;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.zj0;

public class ImageReceiver implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.q5 {
    public static final int DEFAULT_CROSSFADE_DURATION = 150;
    private static final int TYPE_CROSSFDADE = 2;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MEDIA = 3;
    public static final int TYPE_THUMB = 1;
    private static final float[] radii;
    private static PorterDuffColorFilter selectedColorFilter;
    private static PorterDuffColorFilter selectedGroupColorFilter;
    private boolean allowCrossfadeWithImage;
    private boolean allowDecodeSingleFrame;
    private boolean allowDrawWhileCacheGenerating;
    private boolean allowLoadingOnAttachedOnly;
    private boolean allowLottieVibration;
    private boolean allowStartAnimation;
    private boolean allowStartLottieAnimation;
    private int animateFromIsPressed;
    public int animatedFileDrawableRepeatMaxCount;
    private boolean animationReadySent;
    private boolean attachedToWindow;
    private int autoRepeat;
    private int autoRepeatCount;
    private long autoRepeatTimeout;
    private Object blendMode;
    private boolean canceledLoading;
    private boolean centerRotation;
    public boolean clip;
    private ColorFilter colorFilter;
    private ComposeShader composeShader;
    private byte crossfadeAlpha;
    private float crossfadeByScale;
    private int crossfadeDuration;
    private Drawable crossfadeImage;
    private String crossfadeKey;
    private BitmapShader crossfadeShader;
    private boolean crossfadeWithOldImage;
    private boolean crossfadeWithThumb;
    private boolean crossfadingWithThumb;
    private int currentAccount;
    private float currentAlpha;
    private int currentCacheType;
    private String currentExt;
    private int currentGuid;
    private Drawable currentImageDrawable;
    private String currentImageFilter;
    private String currentImageKey;
    private ImageLocation currentImageLocation;
    private boolean currentKeyQuality;
    private int currentLayerNum;
    private Drawable currentMediaDrawable;
    private String currentMediaFilter;
    private String currentMediaKey;
    private ImageLocation currentMediaLocation;
    private int currentOpenedLayerFlags;
    private Object currentParentObject;
    private long currentSize;
    private Drawable currentThumbDrawable;
    private String currentThumbFilter;
    private String currentThumbKey;
    private ImageLocation currentThumbLocation;
    private long currentTime;
    private ArrayList<Decorator> decorators;
    private ImageReceiverDelegate delegate;
    private final RectF drawRegion;
    private boolean emojiPaused;
    private int[] emptyRoundRadius;
    private long endTime;
    private int fileLoadingPriority;
    private boolean forceCrossfade;
    private boolean forceLoding;
    private boolean forceNotMedia;
    private boolean forcePreview;
    private Bitmap gradientBitmap;
    private BitmapShader gradientShader;
    private boolean ignoreImageSet;
    public boolean ignoreNotifications;
    private float imageH;
    protected int imageInvert;
    protected int imageOrientation;
    private BitmapShader imageShader;
    private int imageTag;
    private float imageW;
    private float imageX;
    private float imageY;
    private boolean invalidateAll;
    public final Runnable invalidateRunnable;
    private boolean isAspectFit;
    private int isLastFrame;
    private int isPressed;
    private boolean isRoundRect;
    private boolean isRoundVideo;
    private boolean isVisible;
    private long lastUpdateAlphaTime;
    private Bitmap legacyBitmap;
    private Canvas legacyCanvas;
    private Paint legacyPaint;
    private BitmapShader legacyShader;
    private ArrayList<Runnable> loadingOperations;
    private boolean manualAlphaAnimator;
    private Object mark;
    private BitmapShader mediaShader;
    private int mediaTag;
    private boolean needsQualityThumb;
    private float overrideAlpha;
    private int param;
    private Runnable parentRunnable;
    private View parentView;
    List<ImageReceiver> preloadReceivers;
    private float pressedProgress;
    private float previousAlpha;
    private TLRPC.Document qulityThumbDocument;
    private Paint roundPaint;
    private final Path roundPath;
    private final int[] roundRadius;
    private final RectF roundRect;
    private SetImageBackup setImageBackup;
    private final Matrix shaderMatrix;
    private boolean shouldGenerateQualityThumb;
    private float sideClip;
    private boolean skipUpdateFrame;
    private long startTime;
    private Drawable staticThumbDrawable;
    public BitmapShader staticThumbShader;
    private ImageLocation strippedLocation;
    private int thumbInvert;
    private int thumbOrientation;
    public BitmapShader thumbShader;
    private int thumbTag;
    private String uniqKeyPrefix;
    private boolean useRoundForThumb;
    private boolean useRoundRadius;
    public boolean useSharedAnimationQueue;
    private boolean videoThumbIsSame;
    private Runnable visibleInvalidate;

    public interface ImageReceiverDelegate {
        void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12);

        void didSetImageBitmap(int i10, String str, Drawable drawable);

        void onAnimationReady(ImageReceiver imageReceiver);
    }

    public static class ReactionLastFrame extends BitmapDrawable {
        public static final float LAST_FRAME_SCALE = 1.2f;

        public ReactionLastFrame(Bitmap bitmap) {
            super(bitmap);
        }
    }

    public static class SetImageBackup {
        public int cacheType;
        public String ext;
        public String imageFilter;
        public ImageLocation imageLocation;
        public String mediaFilter;
        public ImageLocation mediaLocation;
        public Object parentObject;
        public long size;
        public Drawable thumb;
        public String thumbFilter;
        public ImageLocation thumbLocation;

        private SetImageBackup() {
        }

        public void clear() {
            this.imageLocation = null;
            this.thumbLocation = null;
            this.mediaLocation = null;
            this.thumb = null;
        }

        public boolean isSet() {
            return (this.imageLocation == null && this.thumbLocation == null && this.mediaLocation == null && this.thumb == null) ? false : true;
        }

        public boolean isWebfileSet() {
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation != null && (imageLocation.webFile != null || imageLocation.path != null)) {
                return true;
            }
            ImageLocation imageLocation2 = this.thumbLocation;
            if (imageLocation2 != null && (imageLocation2.webFile != null || imageLocation2.path != null)) {
                return true;
            }
            ImageLocation imageLocation3 = this.mediaLocation;
            if (imageLocation3 != null) {
                return (imageLocation3.webFile == null && imageLocation3.path == null) ? false : true;
            }
            return false;
        }
    }

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        selectedColorFilter = new PorterDuffColorFilter(-2236963, mode);
        selectedGroupColorFilter = new PorterDuffColorFilter(-4473925, mode);
        radii = new float[8];
    }

    public ImageReceiver() {
        this(null);
    }

    private void checkAlphaAnimation(boolean z10, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.manualAlphaAnimator) {
            return;
        }
        float f10 = this.currentAlpha;
        if (f10 != 1.0f) {
            if (!z10) {
                if (backgroundThreadDrawHolder != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j10 = this.lastUpdateAlphaTime;
                    long j11 = jCurrentTimeMillis - j10;
                    if (j10 == 0) {
                        j11 = 16;
                    }
                    if (j11 > 30 && AndroidUtilities.screenRefreshRate > 60.0f) {
                        j11 = 30;
                    }
                    this.currentAlpha = (j11 / this.crossfadeDuration) + this.currentAlpha;
                } else {
                    this.currentAlpha = (16.0f / this.crossfadeDuration) + f10;
                }
                if (this.currentAlpha > 1.0f) {
                    this.currentAlpha = 1.0f;
                    this.previousAlpha = 1.0f;
                    if (this.crossfadeImage != null) {
                        recycleBitmap(null, 2);
                        this.crossfadeShader = null;
                    }
                }
            }
            if (backgroundThreadDrawHolder != null) {
                AndroidUtilities.runOnUIThread(new d1(this, 23));
            } else {
                invalidate();
            }
        }
    }

    private void drawBitmapDrawable(Canvas canvas, BitmapDrawable bitmapDrawable, BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i10) {
        if (backgroundThreadDrawHolder == null) {
            bitmapDrawable.setAlpha(i10);
            if (bitmapDrawable instanceof oi0) {
                ((oi0) bitmapDrawable).o(canvas, null, false, this.currentTime, 0);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
                ((org.telegram.ui.Components.x5) bitmapDrawable).l(canvas, false, this.currentTime, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof oi0) {
            oi0 oi0Var = (oi0) bitmapDrawable;
            float f10 = backgroundThreadDrawHolder.imageX;
            float f11 = backgroundThreadDrawHolder.imageY;
            float f12 = backgroundThreadDrawHolder.imageW;
            float f13 = backgroundThreadDrawHolder.imageH;
            ColorFilter colorFilter = backgroundThreadDrawHolder.colorFilter;
            int i11 = backgroundThreadDrawHolder.threadIndex;
            Paint[] paintArr = oi0Var.f31316g0;
            RectF[] rectFArr = oi0Var.f31315f0;
            if (rectFArr[i11] == null) {
                rectFArr[i11] = new RectF();
                Paint paint = new Paint(1);
                paintArr[i11] = paint;
                paint.setFilterBitmap(true);
            }
            paintArr[i11].setAlpha(i10);
            paintArr[i11].setColorFilter(colorFilter);
            rectFArr[i11].set(f10, f11, f10 + f12, f13 + f11);
            oi0Var.o(canvas, null, true, 0L, i11);
            return;
        }
        if (!(bitmapDrawable instanceof org.telegram.ui.Components.x5)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                if (backgroundThreadDrawHolder.paint == null) {
                    backgroundThreadDrawHolder.paint = new Paint(1);
                }
                backgroundThreadDrawHolder.paint.setAlpha(i10);
                backgroundThreadDrawHolder.paint.setColorFilter(backgroundThreadDrawHolder.colorFilter);
                canvas.save();
                canvas.translate(backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY);
                canvas.scale(backgroundThreadDrawHolder.imageW / bitmap.getWidth(), backgroundThreadDrawHolder.imageH / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, backgroundThreadDrawHolder.paint);
                canvas.restore();
                return;
            }
            return;
        }
        org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) bitmapDrawable;
        float f14 = backgroundThreadDrawHolder.imageX;
        float f15 = backgroundThreadDrawHolder.imageY;
        float f16 = backgroundThreadDrawHolder.imageW;
        float f17 = backgroundThreadDrawHolder.imageH;
        ColorFilter colorFilter2 = backgroundThreadDrawHolder.colorFilter;
        int i12 = backgroundThreadDrawHolder.threadIndex;
        Paint[] paintArr2 = x5Var.m0;
        RectF[] rectFArr2 = x5Var.f34483l0;
        if (rectFArr2[i12] == null) {
            rectFArr2[i12] = new RectF();
            Paint paint2 = new Paint();
            paintArr2[i12] = paint2;
            paint2.setFilterBitmap(true);
        }
        paintArr2[i12].setAlpha(i10);
        paintArr2[i12].setColorFilter(colorFilter2);
        rectFArr2[i12].set(f14, f15, f16 + f14, f17 + f15);
        x5Var.l(canvas, true, 0L, i12);
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.isPressed == 0) {
            float f10 = this.pressedProgress;
            if (f10 != 0.0f) {
                float f11 = f10 - 0.10666667f;
                this.pressedProgress = f11;
                if (f11 < 0.0f) {
                    this.pressedProgress = 0.0f;
                }
                invalidate();
            }
        }
        int i13 = this.isPressed;
        if (i13 != 0) {
            this.pressedProgress = 1.0f;
            this.animateFromIsPressed = i13;
        }
        float f12 = this.pressedProgress;
        if (f12 == 0.0f || f12 == 1.0f) {
            drawDrawable(canvas, drawable, i10, bitmapShader, i11, i12, i13, backgroundThreadDrawHolder);
        } else {
            drawDrawable(canvas, drawable, i10, bitmapShader, i11, i12, i13, backgroundThreadDrawHolder);
            drawDrawable(canvas, drawable, (int) (i10 * this.pressedProgress), bitmapShader, i11, i12, this.animateFromIsPressed, backgroundThreadDrawHolder);
        }
    }

    public static File getAvatarLocalFile(int i10, TLObject tLObject) {
        try {
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i10, tLObject, 1);
            File localFile = FileLoader.getInstance(i10).getLocalFile(forUserOrChat);
            if (localFile != null) {
                return localFile;
            }
            String key = forUserOrChat.getKey(tLObject, forUserOrChat, true);
            if (forUserOrChat.path != null) {
                key = key + "." + ImageLoader.getHttpUrlExtension(forUserOrChat.path, "jpg");
            } else {
                TLRPC.PhotoSize photoSize = forUserOrChat.photoSize;
                if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                    key = key + ".jpg";
                } else if (forUserOrChat.location != null) {
                    key = key + ".jpg";
                } else {
                    WebFile webFile = forUserOrChat.webFile;
                    if (webFile != null) {
                        key = key + "." + ImageLoader.getHttpUrlExtension(forUserOrChat.webFile.url, FileLoader.getMimeTypePart(webFile.mime_type));
                    } else if (forUserOrChat.secureDocument != null) {
                        key = key + ".jpg";
                    } else {
                        TLRPC.Document document = forUserOrChat.document;
                        if (document != null) {
                            String documentFileName = FileLoader.getDocumentFileName(document);
                            int iLastIndexOf = documentFileName.lastIndexOf(46);
                            String str = "";
                            String strSubstring = iLastIndexOf == -1 ? "" : documentFileName.substring(iLastIndexOf);
                            if (strSubstring.length() > 1) {
                                str = strSubstring;
                            } else if ("video/mp4".equals(forUserOrChat.document.mime_type)) {
                                str = ".mp4";
                            } else if ("video/x-matroska".equals(forUserOrChat.document.mime_type)) {
                                str = ".mkv";
                            }
                            key = key + str;
                        }
                    }
                }
            }
            File file = new File(FileLoader.getDirectory(4), key);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
    }

    private boolean hasRoundRadius() {
        return true;
    }

    private void loadImage() {
        ImageLoader.getInstance().loadImageForImageReceiver(this, this.preloadReceivers);
        invalidate();
    }

    private void onBitmapException(Drawable drawable) {
        if (drawable == this.currentMediaDrawable && this.currentMediaKey != null) {
            ImageLoader.getInstance().removeImage(this.currentMediaKey);
            this.currentMediaKey = null;
        } else if (drawable == this.currentImageDrawable && this.currentImageKey != null) {
            ImageLoader.getInstance().removeImage(this.currentImageKey);
            this.currentImageKey = null;
        } else if (drawable == this.currentThumbDrawable && this.currentThumbKey != null) {
            ImageLoader.getInstance().removeImage(this.currentThumbKey);
            this.currentThumbKey = null;
        }
        setImage(this.currentMediaLocation, this.currentMediaFilter, this.currentImageLocation, this.currentImageFilter, this.currentThumbLocation, this.currentThumbFilter, this.currentThumbDrawable, this.currentSize, this.currentExt, this.currentParentObject, this.currentCacheType);
    }

    private void setDrawableShader(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.currentThumbDrawable) {
            this.thumbShader = bitmapShader;
            return;
        }
        if (drawable == this.staticThumbDrawable) {
            this.staticThumbShader = bitmapShader;
            return;
        }
        if (drawable == this.currentMediaDrawable) {
            this.mediaShader = bitmapShader;
            return;
        }
        if (drawable == this.currentImageDrawable) {
            this.imageShader = bitmapShader;
            if (this.gradientShader == null || !(drawable instanceof BitmapDrawable)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                this.composeShader = new ComposeShader(this.gradientShader, this.imageShader, PorterDuff.Mode.DST_IN);
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            int width = bitmapDrawable.getBitmap().getWidth();
            int height = bitmapDrawable.getBitmap().getHeight();
            Bitmap bitmap = this.legacyBitmap;
            if (bitmap != null && bitmap.getWidth() == width && this.legacyBitmap.getHeight() == height) {
                return;
            }
            Bitmap bitmap2 = this.legacyBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            this.legacyBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            this.legacyCanvas = new Canvas(this.legacyBitmap);
            Bitmap bitmap3 = this.legacyBitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.legacyShader = new BitmapShader(bitmap3, tileMode, tileMode);
            if (this.legacyPaint == null) {
                Paint paint = new Paint();
                this.legacyPaint = paint;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            }
        }
    }

    private void setStaticDrawable(Drawable drawable) {
        org.telegram.ui.Components.r6 r6Var;
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable == drawable2) {
            return;
        }
        if (!(drawable2 instanceof org.telegram.ui.Components.r6)) {
            r6Var = null;
        } else if (drawable2.equals(drawable)) {
            return;
        } else {
            r6Var = (org.telegram.ui.Components.r6) this.staticThumbDrawable;
        }
        this.staticThumbDrawable = drawable;
        if (this.attachedToWindow && (drawable instanceof org.telegram.ui.Components.r6)) {
            ((org.telegram.ui.Components.r6) drawable).c(this);
        }
        if (!this.attachedToWindow || r6Var == null) {
            return;
        }
        r6Var.b(this);
    }

    private void updateDrawableRadius(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        boolean z10 = true;
        int[] roundRadius = getRoundRadius(true);
        if (!(drawable instanceof sp)) {
            if ((!hasRoundRadius() && this.gradientShader == null) || (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.y8))) {
                setDrawableShader(drawable, null);
                return;
            }
            if (drawable instanceof org.telegram.ui.Components.y8) {
                ((org.telegram.ui.Components.y8) drawable).f34860r = roundRadius[0];
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable instanceof oi0) {
                return;
            }
            if (bitmapDrawable instanceof org.telegram.ui.Components.x5) {
                ((org.telegram.ui.Components.x5) drawable).B(roundRadius);
                return;
            } else {
                if (bitmapDrawable.getBitmap() == null || bitmapDrawable.getBitmap().isRecycled()) {
                    return;
                }
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                setDrawableShader(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                return;
            }
        }
        sp spVar = (sp) drawable;
        float f10 = roundRadius[0];
        float f11 = roundRadius[1];
        float f12 = roundRadius[2];
        float f13 = roundRadius[3];
        float[] fArr = spVar.f32518f;
        float fMax = Math.max(0.0f, f10);
        fArr[1] = fMax;
        fArr[0] = fMax;
        float fMax2 = Math.max(0.0f, f11);
        fArr[3] = fMax2;
        fArr[2] = fMax2;
        float fMax3 = Math.max(0.0f, f12);
        fArr[5] = fMax3;
        fArr[4] = fMax3;
        float fMax4 = Math.max(0.0f, f13);
        fArr[7] = fMax4;
        fArr[6] = fMax4;
        if (f10 <= 0.0f && f11 <= 0.0f && f12 <= 0.0f && f13 <= 0.0f) {
            z10 = false;
        }
        spVar.f32517e = z10;
        spVar.a();
    }

    public void addDecorator(Decorator decorator) {
        if (this.decorators == null) {
            this.decorators = new ArrayList<>();
        }
        this.decorators.add(decorator);
        if (this.attachedToWindow) {
            decorator.onAttachedToWindow(this);
        }
    }

    public void addLoadingImageRunnable(Runnable runnable) {
        this.loadingOperations.add(runnable);
    }

    public void bumpPriority() {
        ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
    }

    public boolean canInvertBitmap() {
        return (this.currentMediaDrawable instanceof ExtendedBitmapDrawable) || (this.currentImageDrawable instanceof ExtendedBitmapDrawable) || (this.currentThumbDrawable instanceof ExtendedBitmapDrawable) || (this.staticThumbDrawable instanceof ExtendedBitmapDrawable);
    }

    public void cancelLoadImage() {
        this.forceLoding = false;
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
        this.canceledLoading = true;
    }

    public void clearDecorators() {
        if (this.decorators != null) {
            if (this.attachedToWindow) {
                for (int i10 = 0; i10 < this.decorators.size(); i10++) {
                    this.decorators.get(i10).onDetachedFromWidnow();
                }
            }
            this.decorators.clear();
        }
    }

    public void clearImage() {
        for (int i10 = 0; i10 < 4; i10++) {
            recycleBitmap(null, i10);
        }
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
    }

    @Override
    public void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        if (i10 == NotificationCenter.didReplacedPhotoInMemCache) {
            String str = (String) objArr[0];
            String str2 = this.currentMediaKey;
            if (str2 != null && str2.equals(str)) {
                this.currentMediaKey = (String) objArr[1];
                ImageLocation imageLocation = (ImageLocation) objArr[2];
                this.currentMediaLocation = imageLocation;
                SetImageBackup setImageBackup = this.setImageBackup;
                if (setImageBackup != null) {
                    setImageBackup.mediaLocation = imageLocation;
                }
            }
            String str3 = this.currentImageKey;
            if (str3 != null && str3.equals(str)) {
                this.currentImageKey = (String) objArr[1];
                ImageLocation imageLocation2 = (ImageLocation) objArr[2];
                this.currentImageLocation = imageLocation2;
                SetImageBackup setImageBackup2 = this.setImageBackup;
                if (setImageBackup2 != null) {
                    setImageBackup2.imageLocation = imageLocation2;
                }
            }
            String str4 = this.currentThumbKey;
            if (str4 == null || !str4.equals(str)) {
                return;
            }
            this.currentThumbKey = (String) objArr[1];
            ImageLocation imageLocation3 = (ImageLocation) objArr[2];
            this.currentThumbLocation = imageLocation3;
            SetImageBackup setImageBackup3 = this.setImageBackup;
            if (setImageBackup3 != null) {
                setImageBackup3.thumbLocation = imageLocation3;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.currentLayerNum >= num.intValue()) {
                return;
            }
            int iIntValue = num.intValue() | this.currentOpenedLayerFlags;
            this.currentOpenedLayerFlags = iIntValue;
            if (iIntValue != 0) {
                oi0 lottieAnimation = getLottieAnimation();
                if (lottieAnimation != null && lottieAnimation.x()) {
                    lottieAnimation.stop();
                }
                org.telegram.ui.Components.x5 animation = getAnimation();
                if (animation != null) {
                    animation.stop();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.currentLayerNum >= num2.intValue() || (i12 = this.currentOpenedLayerFlags) == 0) {
                return;
            }
            int i13 = (~num2.intValue()) & i12;
            this.currentOpenedLayerFlags = i13;
            if (i13 == 0) {
                oi0 lottieAnimation2 = getLottieAnimation();
                if (lottieAnimation2 != null) {
                    lottieAnimation2.A = this.allowLottieVibration;
                }
                if (this.allowStartLottieAnimation && lottieAnimation2 != null && lottieAnimation2.x()) {
                    lottieAnimation2.start();
                }
                org.telegram.ui.Components.x5 animation2 = getAnimation();
                if (!this.allowStartAnimation || animation2 == null) {
                    return;
                }
                animation2.j();
                invalidate();
            }
        }
    }

    public boolean draw(Canvas canvas) {
        return draw(canvas, null);
    }

    public boolean getAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public float getAlpha() {
        return this.overrideAlpha;
    }

    public org.telegram.ui.Components.k5 getAnimatedEmojiDrawable() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.k5) {
            return (org.telegram.ui.Components.k5) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof org.telegram.ui.Components.k5) {
            return (org.telegram.ui.Components.k5) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.k5) {
            return (org.telegram.ui.Components.k5) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof org.telegram.ui.Components.k5) {
            return (org.telegram.ui.Components.k5) drawable4;
        }
        return null;
    }

    public int getAnimatedOrientation() {
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation != null) {
            return animation.d[2];
        }
        return 0;
    }

    public org.telegram.ui.Components.x5 getAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.x5) {
            return (org.telegram.ui.Components.x5) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof org.telegram.ui.Components.x5) {
            return (org.telegram.ui.Components.x5) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.x5) {
            return (org.telegram.ui.Components.x5) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof org.telegram.ui.Components.x5) {
            return (org.telegram.ui.Components.x5) drawable4;
        }
        return null;
    }

    public int getAutoRepeat() {
        return this.autoRepeat;
    }

    public Bitmap getBitmap() {
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && lottieAnimation.s()) {
            if (lottieAnimation.N != null) {
                return lottieAnimation.N;
            }
            if (lottieAnimation.O != null) {
                return lottieAnimation.O;
            }
            return null;
        }
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation != null && animation.s()) {
            return animation.m();
        }
        Drawable drawable = this.currentMediaDrawable;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.x5) && !(drawable instanceof oi0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.currentImageDrawable;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.x5) && !(drawable instanceof oi0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.x5) && !(drawable instanceof oi0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable4).getBitmap();
        }
        return null;
    }

    public int getBitmapHeight() {
        getDrawable();
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation != null) {
            int i10 = this.imageOrientation;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? animation.getIntrinsicHeight() : animation.getIntrinsicWidth();
        }
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.f31309c;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int i11 = this.imageOrientation;
            return (i11 % 360 == 0 || i11 % 360 == 180) ? bitmap.getHeight() : bitmap.getWidth();
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return 1;
    }

    public BitmapHolder getBitmapSafe() {
        Bitmap bitmap;
        String str;
        org.telegram.ui.Components.x5 animation = getAnimation();
        oi0 lottieAnimation = getLottieAnimation();
        int i10 = 0;
        if (lottieAnimation == null || !lottieAnimation.s()) {
            if (animation == null || !animation.s()) {
                Drawable drawable = this.currentMediaDrawable;
                if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.x5) || (drawable instanceof oi0)) {
                    Drawable drawable2 = this.currentImageDrawable;
                    if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.x5) || (drawable instanceof oi0)) {
                        Drawable drawable3 = this.currentThumbDrawable;
                        if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof org.telegram.ui.Components.x5) || (drawable instanceof oi0)) {
                            Drawable drawable4 = this.staticThumbDrawable;
                            if (drawable4 instanceof BitmapDrawable) {
                                bitmap = ((BitmapDrawable) drawable4).getBitmap();
                            } else {
                                bitmap = null;
                                str = null;
                            }
                        } else {
                            bitmap = ((BitmapDrawable) drawable3).getBitmap();
                            str = this.currentThumbKey;
                        }
                    } else {
                        bitmap = ((BitmapDrawable) drawable2).getBitmap();
                        str = this.currentImageKey;
                    }
                } else {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    str = this.currentMediaKey;
                }
                if (bitmap != null) {
                    return new BitmapHolder(bitmap, str, i10);
                }
                return null;
            }
            Bitmap bitmapM = animation.m();
            i10 = animation.d[2];
            if (i10 != 0) {
                return new BitmapHolder(Bitmap.createBitmap(bitmapM), (String) null, i10);
            }
            bitmap = bitmapM;
        } else if (lottieAnimation.N != null) {
            bitmap = lottieAnimation.N;
        } else {
            bitmap = lottieAnimation.O != null ? lottieAnimation.O : null;
        }
        str = null;
        if (bitmap != null) {
            return new BitmapHolder(bitmap, str, i10);
        }
        return null;
    }

    public int getBitmapWidth() {
        getDrawable();
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation != null) {
            int i10 = this.imageOrientation;
            return (i10 % 360 == 0 || i10 % 360 == 180) ? animation.getIntrinsicWidth() : animation.getIntrinsicHeight();
        }
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.f31307b;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int i11 = this.imageOrientation;
            return (i11 % 360 == 0 || i11 % 360 == 180) ? bitmap.getWidth() : bitmap.getHeight();
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return 1;
    }

    public int getCacheType() {
        return this.currentCacheType;
    }

    public float getCenterX() {
        return (this.imageW / 2.0f) + this.imageX;
    }

    public float getCenterY() {
        return (this.imageH / 2.0f) + this.imageY;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public float getCurrentAlpha() {
        return this.currentAlpha;
    }

    public RectF getDrawRegion() {
        return this.drawRegion;
    }

    public Drawable getDrawable() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 != null) {
            return drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 != null) {
            return drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 != null) {
            return drawable4;
        }
        return null;
    }

    public BitmapHolder getDrawableSafe() {
        String str;
        String str2;
        Drawable drawable = this.currentMediaDrawable;
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof org.telegram.ui.Components.x5) || (drawable instanceof oi0)) {
            Drawable drawable2 = this.currentImageDrawable;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.x5) || (drawable instanceof oi0)) {
                drawable2 = this.currentThumbDrawable;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof org.telegram.ui.Components.x5) || (drawable instanceof oi0)) {
                    drawable = this.staticThumbDrawable;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        drawable = null;
                        str = null;
                    }
                } else {
                    str2 = this.currentThumbKey;
                }
            } else {
                str2 = this.currentImageKey;
            }
            Drawable drawable3 = drawable2;
            str = str2;
            drawable = drawable3;
        } else {
            str = this.currentMediaKey;
        }
        if (drawable != null) {
            return new BitmapHolder(drawable, str, 0);
        }
        return null;
    }

    public String getExt() {
        return this.currentExt;
    }

    public int getFileLoadingPriority() {
        return this.fileLoadingPriority;
    }

    public float getImageAspectRatio() {
        float fWidth;
        float fHeight;
        if (this.imageOrientation % 180 != 0) {
            fWidth = this.drawRegion.height();
            fHeight = this.drawRegion.width();
        } else {
            fWidth = this.drawRegion.width();
            fHeight = this.drawRegion.height();
        }
        return fWidth / fHeight;
    }

    public Drawable getImageDrawable() {
        return this.currentImageDrawable;
    }

    public String getImageFilter() {
        return this.currentImageFilter;
    }

    public float getImageHeight() {
        return this.imageH;
    }

    public String getImageKey() {
        return this.currentImageKey;
    }

    public ImageLocation getImageLocation() {
        return this.currentImageLocation;
    }

    public float getImageWidth() {
        return this.imageW;
    }

    public float getImageX() {
        return this.imageX;
    }

    public float getImageX2() {
        return this.imageX + this.imageW;
    }

    public float getImageY() {
        return this.imageY;
    }

    public float getImageY2() {
        return this.imageY + this.imageH;
    }

    public int getInvert() {
        return this.imageInvert;
    }

    public ArrayList<Runnable> getLoadingOperations() {
        return this.loadingOperations;
    }

    public oi0 getLottieAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof oi0) {
            return (oi0) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof oi0) {
            return (oi0) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof oi0) {
            return (oi0) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof oi0) {
            return (oi0) drawable4;
        }
        return null;
    }

    public Object getMark() {
        return this.mark;
    }

    public Drawable getMediaDrawable() {
        return this.currentMediaDrawable;
    }

    public String getMediaFilter() {
        return this.currentMediaFilter;
    }

    public String getMediaKey() {
        return this.currentMediaKey;
    }

    public ImageLocation getMediaLocation() {
        return this.currentMediaLocation;
    }

    public int getNewGuid() {
        int i10 = this.currentGuid + 1;
        this.currentGuid = i10;
        return i10;
    }

    public int getOrientation() {
        return this.imageOrientation;
    }

    public int getParam() {
        return this.param;
    }

    public Object getParentObject() {
        return this.currentParentObject;
    }

    public void getParentPosition(int[] iArr) {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        view.getLocationInWindow(iArr);
    }

    public View getParentView() {
        return this.parentView;
    }

    public boolean getPressed() {
        return this.isPressed != 0;
    }

    public TLRPC.Document getQualityThumbDocument() {
        return this.qulityThumbDocument;
    }

    public int[] getRoundRadius() {
        return this.roundRadius;
    }

    public long getSize() {
        return this.currentSize;
    }

    public Drawable getStaticThumb() {
        return this.staticThumbDrawable;
    }

    public ImageLocation getStrippedLocation() {
        return this.strippedLocation;
    }

    public int getTag(int i10) {
        if (i10 == 1) {
            return this.thumbTag;
        }
        return i10 == 3 ? this.mediaTag : this.imageTag;
    }

    public Drawable getThumb() {
        return this.currentThumbDrawable;
    }

    public Bitmap getThumbBitmap() {
        Drawable drawable = this.currentThumbDrawable;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        return null;
    }

    public BitmapHolder getThumbBitmapSafe() {
        Bitmap bitmap;
        String str;
        Drawable drawable = this.currentThumbDrawable;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
            str = this.currentThumbKey;
        } else {
            Drawable drawable2 = this.staticThumbDrawable;
            if (drawable2 instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable2).getBitmap();
                str = null;
            } else {
                bitmap = null;
                str = null;
            }
        }
        if (bitmap != null) {
            return new BitmapHolder(bitmap, str, 0);
        }
        return null;
    }

    public String getThumbFilter() {
        return this.currentThumbFilter;
    }

    public String getThumbKey() {
        return this.currentThumbKey;
    }

    public ImageLocation getThumbLocation() {
        return this.currentThumbLocation;
    }

    public String getUniqKeyPrefix() {
        return this.uniqKeyPrefix;
    }

    public boolean getVisible() {
        return this.isVisible;
    }

    public boolean hasBitmapImage() {
        return (this.currentImageDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasImageLoaded() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasImageSet() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentImageKey == null && this.currentMediaKey == null) ? false : true;
    }

    public boolean hasMediaSet() {
        return this.currentMediaDrawable != null;
    }

    public boolean hasNotThumb() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && !(this.staticThumbDrawable instanceof w51)) ? false : true;
    }

    public boolean hasNotThumbOrOnlyStaticThumb() {
        if (this.currentImageDrawable != null || this.currentMediaDrawable != null) {
            return true;
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable instanceof w51) {
            return true;
        }
        return drawable != null && !(drawable instanceof org.telegram.ui.Components.y8) && this.currentImageKey == null && this.currentMediaKey == null;
    }

    public boolean hasStaticThumb() {
        return this.staticThumbDrawable != null;
    }

    public void invalidate() {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (this.invalidateAll) {
            view.invalidate();
            return;
        }
        float f10 = this.imageX;
        float f11 = this.imageY;
        view.invalidate((int) f10, (int) f11, (int) (f10 + this.imageW), (int) (f11 + this.imageH));
    }

    public boolean isAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public boolean isAnimationRunning() {
        org.telegram.ui.Components.x5 animation = getAnimation();
        return animation != null && animation.X;
    }

    public boolean isAspectFit() {
        return this.isAspectFit;
    }

    public boolean isAttachedToWindow() {
        return this.attachedToWindow;
    }

    public boolean isCrossfadingWithOldImage() {
        return (!this.crossfadeWithOldImage || this.crossfadeImage == null || this.crossfadingWithThumb) ? false : true;
    }

    public boolean isCurrentKeyQuality() {
        return this.currentKeyQuality;
    }

    public boolean isForceLoding() {
        return this.forceLoding;
    }

    public boolean isForcePreview() {
        return this.forcePreview;
    }

    public boolean isInsideImage(float f10, float f11) {
        float f12 = this.imageX;
        if (f10 < f12 || f10 > f12 + this.imageW) {
            return false;
        }
        float f13 = this.imageY;
        return f11 >= f13 && f11 <= f13 + this.imageH;
    }

    public boolean isLottieRunning() {
        oi0 lottieAnimation = getLottieAnimation();
        return lottieAnimation != null && lottieAnimation.f31317h0;
    }

    public boolean isNeedsQualityThumb() {
        return this.needsQualityThumb;
    }

    public boolean isShouldGenerateQualityThumb() {
        return this.shouldGenerateQualityThumb;
    }

    public void moveImageToFront() {
        ImageLoader.getInstance().moveToFront(this.currentImageKey);
        ImageLoader.getInstance().moveToFront(this.currentThumbKey);
    }

    public void moveLottieToFront() {
        BitmapDrawable bitmapDrawable;
        String str;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof oi0) {
            bitmapDrawable = (BitmapDrawable) drawable;
            str = this.currentMediaKey;
        } else {
            Drawable drawable2 = this.currentImageDrawable;
            if (drawable2 instanceof oi0) {
                bitmapDrawable = (BitmapDrawable) drawable2;
                str = this.currentImageKey;
            } else {
                bitmapDrawable = null;
                str = null;
            }
        }
        if (str == null || bitmapDrawable == null) {
            return;
        }
        ImageLoader.getInstance().moveToFront(str);
        if (ImageLoader.getInstance().isInMemCache(str, true)) {
            return;
        }
        ImageLoader.getInstance().getLottieMemCahce().put(str, bitmapDrawable);
    }

    public boolean onAttachedToWindow() {
        if (!this.attachedToWindow) {
            this.attachedToWindow = true;
            this.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
            if (!this.ignoreNotifications) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReplacedPhotoInMemCache);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.stopAllHeavyOperations);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
            }
            if (setBackupImage()) {
                return true;
            }
            oi0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F.add(this);
                lottieAnimation.A = this.allowLottieVibration;
            }
            if (lottieAnimation != null && this.allowStartLottieAnimation && (!lottieAnimation.x() || this.currentOpenedLayerFlags == 0)) {
                lottieAnimation.start();
            }
            org.telegram.ui.Components.x5 animation = getAnimation();
            if (animation != null) {
                animation.e(this);
            }
            if (animation != null && this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animation.j();
                invalidate();
            }
            org.telegram.ui.Components.k5 animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.b(this);
            }
            if (NotificationCenter.getGlobalInstance().isAnimationInProgress()) {
                didReceivedNotification(NotificationCenter.stopAllHeavyOperations, this.currentAccount, 512);
            }
            Object obj = this.staticThumbDrawable;
            if (obj instanceof org.telegram.ui.Components.r6) {
                ((org.telegram.ui.Components.r6) obj).c(this);
            }
            if (this.decorators != null) {
                for (int i10 = 0; i10 < this.decorators.size(); i10++) {
                    this.decorators.get(i10).onAttachedToWindow(this);
                }
            }
        }
        return false;
    }

    public void onDetachedFromWindow() {
        if (this.attachedToWindow) {
            this.attachedToWindow = false;
            if (this.currentImageLocation != null || this.currentMediaLocation != null || this.currentThumbLocation != null || this.staticThumbDrawable != null) {
                if (this.setImageBackup == null) {
                    this.setImageBackup = new SetImageBackup();
                }
                SetImageBackup setImageBackup = this.setImageBackup;
                setImageBackup.mediaLocation = this.currentMediaLocation;
                setImageBackup.mediaFilter = this.currentMediaFilter;
                setImageBackup.imageLocation = this.currentImageLocation;
                setImageBackup.imageFilter = this.currentImageFilter;
                setImageBackup.thumbLocation = this.currentThumbLocation;
                setImageBackup.thumbFilter = this.currentThumbFilter;
                setImageBackup.thumb = this.staticThumbDrawable;
                setImageBackup.size = this.currentSize;
                setImageBackup.ext = this.currentExt;
                setImageBackup.cacheType = this.currentCacheType;
                setImageBackup.parentObject = this.currentParentObject;
            }
            if (!this.ignoreNotifications) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReplacedPhotoInMemCache);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
            }
            Object obj = this.staticThumbDrawable;
            if (obj instanceof org.telegram.ui.Components.r6) {
                ((org.telegram.ui.Components.r6) obj).b(this);
            }
            if (this.staticThumbDrawable != null) {
                setStaticDrawable(null);
                this.staticThumbShader = null;
            }
            clearImage();
            this.roundPaint.setShader(null);
            if (this.isPressed == 0) {
                this.pressedProgress = 0.0f;
            }
            org.telegram.ui.Components.k5 animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.p(this);
            }
            org.telegram.ui.Components.x5 animation = getAnimation();
            if (animation != null) {
                animation.v(this);
            }
            oi0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.D(this);
            }
            if (this.decorators != null) {
                for (int i10 = 0; i10 < this.decorators.size(); i10++) {
                    this.decorators.get(i10).onDetachedFromWidnow();
                }
            }
        }
    }

    public void recycleBitmap(String str, int i10) {
        String str2;
        Drawable drawable;
        String replacedKey;
        if (i10 == 3) {
            str2 = this.currentMediaKey;
            drawable = this.currentMediaDrawable;
        } else if (i10 == 2) {
            str2 = this.crossfadeKey;
            drawable = this.crossfadeImage;
        } else if (i10 == 1) {
            str2 = this.currentThumbKey;
            drawable = this.currentThumbDrawable;
        } else {
            str2 = this.currentImageKey;
            drawable = this.currentImageDrawable;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (replacedKey = ImageLoader.getInstance().getReplacedKey(str2)) != null)) {
            str2 = replacedKey;
        }
        if (drawable instanceof oi0) {
            ((oi0) drawable).D(this);
        }
        if (drawable instanceof org.telegram.ui.Components.x5) {
            ((org.telegram.ui.Components.x5) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.k5) {
            ((org.telegram.ui.Components.k5) drawable).p(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof oi0) {
                oi0 oi0Var = (oi0) drawable;
                boolean zDecrementUseCount = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, true) && zDecrementUseCount) {
                    oi0Var.A(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.x5) {
                org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
                if (x5Var.f34481j0) {
                    boolean zDecrementUseCount2 = ImageLoader.getInstance().decrementUseCount(str2);
                    if (ImageLoader.getInstance().isInMemCache(str2, true)) {
                        if (zDecrementUseCount2) {
                            x5Var.stop();
                        }
                    } else if (zDecrementUseCount2) {
                        x5Var.u();
                    }
                } else if (x5Var.f34487p0.isEmpty()) {
                    x5Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean zDecrementUseCount3 = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, false) && zDecrementUseCount3) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(bitmap);
                    AndroidUtilities.recycleBitmaps(arrayList);
                }
            }
        }
        if (i10 == 3) {
            this.currentMediaKey = null;
            this.currentMediaDrawable = null;
            this.mediaShader = null;
        } else if (i10 == 2) {
            this.crossfadeKey = null;
            this.crossfadeImage = null;
            this.crossfadeShader = null;
        } else if (i10 == 1) {
            this.currentThumbDrawable = null;
            this.currentThumbKey = null;
            this.thumbShader = null;
        } else {
            this.currentImageDrawable = null;
            this.currentImageKey = null;
            this.imageShader = null;
        }
    }

    public void setAllowDecodeSingleFrame(boolean z10) {
        this.allowDecodeSingleFrame = z10;
    }

    public void setAllowDrawWhileCacheGenerating(boolean z10) {
        this.allowDrawWhileCacheGenerating = z10;
    }

    public void setAllowLoadingOnAttachedOnly(boolean z10) {
        this.allowLoadingOnAttachedOnly = z10;
    }

    public void setAllowLottieVibration(boolean z10) {
        this.allowLottieVibration = z10;
    }

    public void setAllowStartAnimation(boolean z10) {
        this.allowStartAnimation = z10;
    }

    public void setAllowStartLottieAnimation(boolean z10) {
        this.allowStartLottieAnimation = z10;
    }

    public void setAlpha(float f10) {
        this.overrideAlpha = f10;
    }

    public void setAspectFit(boolean z10) {
        this.isAspectFit = z10;
    }

    public void setAutoRepeat(int i10) {
        this.autoRepeat = i10;
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.I(i10);
        }
    }

    public void setAutoRepeatCount(int i10) {
        this.autoRepeatCount = i10;
        if (getLottieAnimation() != null) {
            getLottieAnimation().I = i10;
            return;
        }
        this.animatedFileDrawableRepeatMaxCount = i10;
        if (getAnimation() != null) {
            getAnimation().f34494u0 = 0;
        }
    }

    public void setAutoRepeatTimeout(long j10) {
        this.autoRepeatTimeout = j10;
        getLottieAnimation();
    }

    public boolean setBackupImage() {
        SetImageBackup setImageBackup = this.setImageBackup;
        if (setImageBackup == null || !setImageBackup.isSet()) {
            return false;
        }
        SetImageBackup setImageBackup2 = this.setImageBackup;
        this.setImageBackup = null;
        Drawable drawable = setImageBackup2.thumb;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (!(bitmapDrawable instanceof oi0) && !(bitmapDrawable instanceof org.telegram.ui.Components.x5) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                setImageBackup2.thumb = null;
            }
        }
        setImage(setImageBackup2.mediaLocation, setImageBackup2.mediaFilter, setImageBackup2.imageLocation, setImageBackup2.imageFilter, setImageBackup2.thumbLocation, setImageBackup2.thumbFilter, setImageBackup2.thumb, setImageBackup2.size, setImageBackup2.ext, setImageBackup2.parentObject, setImageBackup2.cacheType);
        setImageBackup2.clear();
        this.setImageBackup = setImageBackup2;
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.A = this.allowLottieVibration;
        }
        if (lottieAnimation == null || !this.allowStartLottieAnimation) {
            return true;
        }
        if (lottieAnimation.x() && this.currentOpenedLayerFlags != 0) {
            return true;
        }
        lottieAnimation.start();
        return true;
    }

    public void setBlendMode(Object obj) {
        this.blendMode = obj;
        invalidate();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public void setCrossfadeAlpha(byte b10) {
        this.crossfadeAlpha = b10;
    }

    public void setCrossfadeByScale(float f10) {
        this.crossfadeByScale = f10;
    }

    public void setCrossfadeDuration(int i10) {
        this.crossfadeDuration = i10;
    }

    public void setCrossfadeWithOldImage(boolean z10) {
        this.crossfadeWithOldImage = z10;
    }

    public void setCurrentAccount(int i10) {
        this.currentAccount = i10;
    }

    public void setCurrentAlpha(float f10) {
        this.currentAlpha = f10;
    }

    public void setCurrentTime(long j10) {
        this.currentTime = j10;
    }

    public void setDelegate(ImageReceiverDelegate imageReceiverDelegate) {
        this.delegate = imageReceiverDelegate;
    }

    public BackgroundThreadDrawHolder setDrawInBackgroundThread(BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i10) {
        if (backgroundThreadDrawHolder == null) {
            backgroundThreadDrawHolder = new BackgroundThreadDrawHolder();
        }
        backgroundThreadDrawHolder.threadIndex = i10;
        backgroundThreadDrawHolder.animation = getAnimation();
        backgroundThreadDrawHolder.lottieDrawable = getLottieAnimation();
        boolean z10 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            backgroundThreadDrawHolder.roundRadius[i11] = this.roundRadius[i11];
        }
        backgroundThreadDrawHolder.mediaDrawable = this.currentMediaDrawable;
        backgroundThreadDrawHolder.mediaShader = this.mediaShader;
        backgroundThreadDrawHolder.imageDrawable = this.currentImageDrawable;
        backgroundThreadDrawHolder.imageShader = this.imageShader;
        backgroundThreadDrawHolder.thumbDrawable = this.currentThumbDrawable;
        backgroundThreadDrawHolder.thumbShader = this.thumbShader;
        backgroundThreadDrawHolder.staticThumbShader = this.staticThumbShader;
        backgroundThreadDrawHolder.staticThumbDrawable = this.staticThumbDrawable;
        backgroundThreadDrawHolder.crossfadeImage = this.crossfadeImage;
        backgroundThreadDrawHolder.colorFilter = this.colorFilter;
        backgroundThreadDrawHolder.crossfadingWithThumb = this.crossfadingWithThumb;
        backgroundThreadDrawHolder.crossfadeWithOldImage = this.crossfadeWithOldImage;
        backgroundThreadDrawHolder.currentAlpha = this.currentAlpha;
        backgroundThreadDrawHolder.previousAlpha = this.previousAlpha;
        backgroundThreadDrawHolder.crossfadeShader = this.crossfadeShader;
        if ((backgroundThreadDrawHolder.animation != null && !backgroundThreadDrawHolder.animation.s()) || (backgroundThreadDrawHolder.lottieDrawable != null && !backgroundThreadDrawHolder.lottieDrawable.s())) {
            z10 = true;
        }
        backgroundThreadDrawHolder.animationNotReady = z10;
        backgroundThreadDrawHolder.imageX = this.imageX;
        backgroundThreadDrawHolder.imageY = this.imageY;
        backgroundThreadDrawHolder.imageW = this.imageW;
        backgroundThreadDrawHolder.imageH = this.imageH;
        backgroundThreadDrawHolder.overrideAlpha = this.overrideAlpha;
        return backgroundThreadDrawHolder;
    }

    public void setEmojiPaused(boolean z10) {
        if (this.emojiPaused == z10) {
            return;
        }
        this.emojiPaused = z10;
        this.allowStartLottieAnimation = !z10;
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            if (z10) {
                lottieAnimation.stop();
            } else {
                if (lottieAnimation.f31317h0) {
                    return;
                }
                lottieAnimation.start();
            }
        }
    }

    public void setFileLoadingPriority(int i10) {
        if (this.fileLoadingPriority != i10) {
            this.fileLoadingPriority = i10;
            if (this.attachedToWindow && hasImageSet()) {
                ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
            }
        }
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable) {
        setForUserOrChat(tLObject, drawable, null);
    }

    public void setForceCrossfade(boolean z10) {
        this.forceCrossfade = z10;
    }

    public void setForceLoading(boolean z10) {
        this.forceLoding = z10;
    }

    public void setForceNotMedia(boolean z10) {
        this.forceNotMedia = z10;
    }

    public void setForcePreview(boolean z10) {
        this.forcePreview = z10;
    }

    public void setGradientBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            if (this.gradientShader == null || this.gradientBitmap != bitmap) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.gradientShader = new BitmapShader(bitmap, tileMode, tileMode);
                updateDrawableRadius(this.currentImageDrawable);
            }
            this.isRoundRect = true;
        } else {
            this.gradientShader = null;
            this.composeShader = null;
            this.legacyShader = null;
            this.legacyCanvas = null;
            Bitmap bitmap2 = this.legacyBitmap;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.legacyBitmap = null;
            }
        }
        this.gradientBitmap = bitmap;
    }

    public void setIgnoreImageSet(boolean z10) {
        this.ignoreImageSet = z10;
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, String str2, Object obj, int i10) {
        setImage(imageLocation, str, null, null, drawable, 0L, str2, obj, i10);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
    }

    public boolean setImageBitmapByKey(Drawable drawable, String str, int i10, boolean z10, int i11) {
        org.telegram.ui.Components.x5 animation;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z11;
        ImageReceiverDelegate imageReceiverDelegate;
        oi0 oi0Var;
        org.telegram.ui.Components.x5 x5Var;
        boolean z12;
        boolean z13;
        View view;
        org.telegram.ui.Components.k5 k5Var;
        Drawable drawable5;
        boolean z14;
        boolean z15;
        boolean z16;
        Drawable drawable6;
        boolean z17;
        if (drawable != null && str != null && this.currentGuid == i11) {
            if (i10 == 0) {
                if (str.equals(this.currentImageKey)) {
                    ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
                    if (imageReceiverDelegate2 != null) {
                        imageReceiverDelegate2.didSetImageBitmap(i10, str, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.x5) {
                        org.telegram.ui.Components.x5 x5Var2 = (org.telegram.ui.Components.x5) drawable;
                        x5Var2.C(this.startTime, this.endTime);
                        if (x5Var2.f34481j0) {
                            ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                        }
                        if (this.videoThumbIsSame) {
                            z16 = !x5Var2.s();
                        } else {
                            z16 = true;
                        }
                    } else {
                        ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                        if (!this.videoThumbIsSame || (drawable != this.currentImageDrawable && this.currentAlpha >= 1.0f)) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                    }
                    this.currentImageDrawable = drawable;
                    if (drawable instanceof ExtendedBitmapDrawable) {
                        ExtendedBitmapDrawable extendedBitmapDrawable = (ExtendedBitmapDrawable) drawable;
                        this.imageOrientation = extendedBitmapDrawable.getOrientation();
                        this.imageInvert = extendedBitmapDrawable.getInvert();
                    }
                    updateDrawableRadius(drawable);
                    if (z16 && this.isVisible && (((!z10 && !this.forcePreview) || this.forceCrossfade) && this.crossfadeDuration != 0)) {
                        Drawable drawable7 = this.currentMediaDrawable;
                        if (!(drawable7 instanceof oi0) || !((oi0) drawable7).s()) {
                            Drawable drawable8 = this.currentMediaDrawable;
                            if (!(drawable8 instanceof org.telegram.ui.Components.x5) || !((org.telegram.ui.Components.x5) drawable8).s()) {
                                if (this.currentImageDrawable instanceof oi0) {
                                    Drawable drawable9 = this.staticThumbDrawable;
                                    if ((drawable9 instanceof v80) || (drawable9 instanceof SvgHelper.SvgDrawable) || (drawable9 instanceof Emoji.EmojiDrawable)) {
                                        drawable6 = this.currentThumbDrawable;
                                        if (drawable6 == null || this.staticThumbDrawable != null || this.forceCrossfade) {
                                            if (drawable6 != null || this.staticThumbDrawable == null) {
                                                this.previousAlpha = 1.0f;
                                            } else {
                                                this.previousAlpha = this.currentAlpha;
                                            }
                                            this.currentAlpha = 0.0f;
                                            this.lastUpdateAlphaTime = System.currentTimeMillis();
                                            if (this.crossfadeImage != null && this.currentThumbDrawable == null && this.staticThumbDrawable == null) {
                                                z17 = false;
                                            } else {
                                                z17 = true;
                                            }
                                            this.crossfadeWithThumb = z17;
                                        }
                                    }
                                } else {
                                    drawable6 = this.currentThumbDrawable;
                                    if (drawable6 == null) {
                                        if (drawable6 != null) {
                                            this.previousAlpha = 1.0f;
                                        } else {
                                            this.previousAlpha = 1.0f;
                                        }
                                        this.currentAlpha = 0.0f;
                                        this.lastUpdateAlphaTime = System.currentTimeMillis();
                                        if (this.crossfadeImage != null) {
                                            z17 = true;
                                        } else {
                                            z17 = true;
                                        }
                                        this.crossfadeWithThumb = z17;
                                    } else {
                                        if (drawable6 != null) {
                                            this.previousAlpha = 1.0f;
                                        } else {
                                            this.previousAlpha = 1.0f;
                                        }
                                        this.currentAlpha = 0.0f;
                                        this.lastUpdateAlphaTime = System.currentTimeMillis();
                                        if (this.crossfadeImage != null) {
                                            z17 = true;
                                        } else {
                                            z17 = true;
                                        }
                                        this.crossfadeWithThumb = z17;
                                    }
                                }
                            }
                        }
                    } else {
                        this.currentAlpha = 1.0f;
                        this.previousAlpha = 1.0f;
                    }
                    imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                        drawable5 = this.currentImageDrawable;
                        if (drawable5 != null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (drawable5 == null || this.currentMediaDrawable != null) {
                            z15 = false;
                        } else {
                            z15 = true;
                        }
                        imageReceiverDelegate.didSetImage(this, z14, z15, z10);
                    }
                    if (drawable instanceof org.telegram.ui.Components.k5) {
                        k5Var = (org.telegram.ui.Components.k5) drawable;
                        if (this.attachedToWindow) {
                            k5Var.b(this);
                        }
                    } else if (drawable instanceof org.telegram.ui.Components.x5) {
                        x5Var = (org.telegram.ui.Components.x5) drawable;
                        z12 = this.useSharedAnimationQueue;
                        if (!x5Var.f34481j0) {
                            x5Var.f34490r0 = z12;
                        }
                        if (this.attachedToWindow) {
                            x5Var.e(this);
                        }
                        if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                            x5Var.j();
                        }
                        z13 = this.allowDecodeSingleFrame;
                        x5Var.f34500y = z13;
                        if (z13) {
                            x5Var.x(false);
                        }
                        this.animationReadySent = false;
                        view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    } else if (drawable instanceof oi0) {
                        oi0Var = (oi0) drawable;
                        if (this.attachedToWindow) {
                            oi0Var.F.add(this);
                        }
                        if (this.allowStartLottieAnimation && (!oi0Var.x() || this.currentOpenedLayerFlags == 0)) {
                            oi0Var.start();
                        }
                        oi0Var.H(true);
                        oi0Var.I(this.autoRepeat);
                        oi0Var.I = this.autoRepeatCount;
                        oi0Var.C0 = this.allowDrawWhileCacheGenerating;
                        this.animationReadySent = false;
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i10 != 3) {
                    if (i10 == 1) {
                        if (this.currentThumbDrawable == null && ((this.forcePreview || (((animation = getAnimation()) == null || !animation.s()) && (((drawable2 = this.currentImageDrawable) == null || (drawable2 instanceof org.telegram.ui.Components.x5)) && ((drawable3 = this.currentMediaDrawable) == null || (drawable3 instanceof org.telegram.ui.Components.x5))))) && str.equals(this.currentThumbKey))) {
                            ImageReceiverDelegate imageReceiverDelegate3 = this.delegate;
                            if (imageReceiverDelegate3 != null) {
                                imageReceiverDelegate3.didSetImageBitmap(i10, str, drawable);
                            }
                            ImageLoader.getInstance().incrementUseCount(this.currentThumbKey);
                            this.currentThumbDrawable = drawable;
                            if (drawable instanceof ExtendedBitmapDrawable) {
                                ExtendedBitmapDrawable extendedBitmapDrawable2 = (ExtendedBitmapDrawable) drawable;
                                this.thumbOrientation = extendedBitmapDrawable2.getOrientation();
                                this.thumbInvert = extendedBitmapDrawable2.getInvert();
                            }
                            updateDrawableRadius(drawable);
                            if (z10 || this.crossfadeAlpha == 2) {
                                this.currentAlpha = 1.0f;
                                this.previousAlpha = 1.0f;
                            } else {
                                Object obj = this.currentParentObject;
                                if ((obj instanceof MessageObject) && ((MessageObject) obj).isRoundVideo() && ((MessageObject) this.currentParentObject).isSending()) {
                                    this.currentAlpha = 1.0f;
                                    this.previousAlpha = 1.0f;
                                } else {
                                    this.currentAlpha = 0.0f;
                                    this.previousAlpha = 1.0f;
                                    this.lastUpdateAlphaTime = System.currentTimeMillis();
                                    this.crossfadeWithThumb = this.staticThumbDrawable != null;
                                }
                            }
                        }
                    }
                    imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                        drawable5 = this.currentImageDrawable;
                        if (drawable5 != null) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (drawable5 == null) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        imageReceiverDelegate.didSetImage(this, z14, z15, z10);
                    }
                    if (drawable instanceof org.telegram.ui.Components.k5) {
                        k5Var = (org.telegram.ui.Components.k5) drawable;
                        if (this.attachedToWindow) {
                            k5Var.b(this);
                        }
                    } else if (drawable instanceof org.telegram.ui.Components.x5) {
                        x5Var = (org.telegram.ui.Components.x5) drawable;
                        z12 = this.useSharedAnimationQueue;
                        if (!x5Var.f34481j0) {
                            x5Var.f34490r0 = z12;
                        }
                        if (this.attachedToWindow) {
                            x5Var.e(this);
                        }
                        if (this.allowStartAnimation) {
                            x5Var.j();
                        }
                        z13 = this.allowDecodeSingleFrame;
                        x5Var.f34500y = z13;
                        if (z13) {
                            x5Var.x(false);
                        }
                        this.animationReadySent = false;
                        view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    } else if (drawable instanceof oi0) {
                        oi0Var = (oi0) drawable;
                        if (this.attachedToWindow) {
                            oi0Var.F.add(this);
                        }
                        if (this.allowStartLottieAnimation) {
                            oi0Var.start();
                        }
                        oi0Var.H(true);
                        oi0Var.I(this.autoRepeat);
                        oi0Var.I = this.autoRepeatCount;
                        oi0Var.C0 = this.allowDrawWhileCacheGenerating;
                        this.animationReadySent = false;
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.currentMediaKey)) {
                    ImageReceiverDelegate imageReceiverDelegate4 = this.delegate;
                    if (imageReceiverDelegate4 != null) {
                        imageReceiverDelegate4.didSetImageBitmap(i10, str, drawable);
                    }
                    if (drawable instanceof org.telegram.ui.Components.x5) {
                        org.telegram.ui.Components.x5 x5Var3 = (org.telegram.ui.Components.x5) drawable;
                        x5Var3.C(this.startTime, this.endTime);
                        if (x5Var3.f34481j0) {
                            ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                        }
                        if (this.videoThumbIsSame && (((z11 = (drawable4 = this.currentThumbDrawable) instanceof org.telegram.ui.Components.x5)) || (this.currentImageDrawable instanceof org.telegram.ui.Components.x5))) {
                            x5Var3.y(z11 ? ((org.telegram.ui.Components.x5) drawable4).f34471c : 0L, true, true);
                        }
                    } else {
                        ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                    }
                    this.currentMediaDrawable = drawable;
                    updateDrawableRadius(drawable);
                    if (this.currentImageDrawable == null) {
                        if ((z10 || this.forcePreview) && !this.forceCrossfade) {
                            this.currentAlpha = 1.0f;
                            this.previousAlpha = 1.0f;
                        } else {
                            Drawable drawable10 = this.currentThumbDrawable;
                            if ((drawable10 == null && this.staticThumbDrawable == null) || this.currentAlpha == 1.0f || this.forceCrossfade) {
                                if (drawable10 == null || this.staticThumbDrawable == null) {
                                    this.previousAlpha = 1.0f;
                                } else {
                                    this.previousAlpha = this.currentAlpha;
                                }
                                this.currentAlpha = 0.0f;
                                this.lastUpdateAlphaTime = System.currentTimeMillis();
                                this.crossfadeWithThumb = (this.crossfadeImage == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null) ? false : true;
                            }
                        }
                    }
                    imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                        drawable5 = this.currentImageDrawable;
                        if (drawable5 != null) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (drawable5 == null) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        imageReceiverDelegate.didSetImage(this, z14, z15, z10);
                    }
                    if (drawable instanceof org.telegram.ui.Components.k5) {
                        k5Var = (org.telegram.ui.Components.k5) drawable;
                        if (this.attachedToWindow) {
                            k5Var.b(this);
                        }
                    } else if (drawable instanceof org.telegram.ui.Components.x5) {
                        x5Var = (org.telegram.ui.Components.x5) drawable;
                        z12 = this.useSharedAnimationQueue;
                        if (!x5Var.f34481j0) {
                            x5Var.f34490r0 = z12;
                        }
                        if (this.attachedToWindow) {
                            x5Var.e(this);
                        }
                        if (this.allowStartAnimation) {
                            x5Var.j();
                        }
                        z13 = this.allowDecodeSingleFrame;
                        x5Var.f34500y = z13;
                        if (z13) {
                            x5Var.x(false);
                        }
                        this.animationReadySent = false;
                        view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    } else if (drawable instanceof oi0) {
                        oi0Var = (oi0) drawable;
                        if (this.attachedToWindow) {
                            oi0Var.F.add(this);
                        }
                        if (this.allowStartLottieAnimation) {
                            oi0Var.start();
                        }
                        oi0Var.H(true);
                        oi0Var.I(this.autoRepeat);
                        oi0Var.I = this.autoRepeatCount;
                        oi0Var.C0 = this.allowDrawWhileCacheGenerating;
                        this.animationReadySent = false;
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setImageCoords(float f10, float f11, float f12, float f13) {
        this.imageX = f10;
        this.imageY = f11;
        this.imageW = f12;
        this.imageH = f13;
    }

    public void setImageWidth(int i10) {
        this.imageW = i10;
    }

    public void setImageX(float f10) {
        this.imageX = f10;
    }

    public void setImageY(float f10) {
        this.imageY = f10;
    }

    public void setInvalidateAll(boolean z10) {
        this.invalidateAll = z10;
    }

    public void setLayerNum(int i10) {
        this.currentLayerNum = i10;
        if (this.attachedToWindow) {
            this.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
        }
    }

    public void setManualAlphaAnimator(boolean z10) {
        this.manualAlphaAnimator = z10;
    }

    public void setMark(Object obj) {
        this.mark = obj;
    }

    public void setMediaStartEndTime(long j10, long j11) {
        this.startTime = j10;
        this.endTime = j11;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.x5) {
            ((org.telegram.ui.Components.x5) drawable).C(j10, j11);
        }
    }

    public void setNeedsQualityThumb(boolean z10) {
        this.needsQualityThumb = z10;
    }

    public void setOrientation(int i10, boolean z10) {
        setOrientation(i10, 0, z10);
    }

    public void setParam(int i10) {
        this.param = i10;
    }

    public void setParentView(View view) {
        this.parentView = view;
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation == null || !this.attachedToWindow) {
            return;
        }
        View view2 = this.parentView;
        if (animation.f34485n0 != null) {
            return;
        }
        animation.f34485n0 = view2;
    }

    public void setPreloadingReceivers(List<ImageReceiver> list) {
        this.preloadReceivers = list;
    }

    public void setPressed(int i10) {
        this.isPressed = i10;
    }

    public void setQualityThumbDocument(TLRPC.Document document) {
        this.qulityThumbDocument = document;
    }

    public void setRoundRadius(int i10) {
        setRoundRadius(new int[]{i10, i10, i10, i10});
    }

    public void setRoundRadiusEnabled(boolean z10) {
        if (this.useRoundRadius != z10) {
            this.useRoundRadius = z10;
            if (!z10 && this.emptyRoundRadius == null) {
                this.emptyRoundRadius = new int[]{0, 0, 0, 0};
            }
            Drawable drawable = this.currentImageDrawable;
            if (drawable != null && this.imageShader == null) {
                updateDrawableRadius(drawable);
            }
            Drawable drawable2 = this.currentMediaDrawable;
            if (drawable2 != null && this.mediaShader == null) {
                updateDrawableRadius(drawable2);
            }
            Drawable drawable3 = this.currentThumbDrawable;
            if (drawable3 != null) {
                updateDrawableRadius(drawable3);
            }
            Drawable drawable4 = this.staticThumbDrawable;
            if (drawable4 != null) {
                updateDrawableRadius(drawable4);
            }
        }
    }

    public void setShouldGenerateQualityThumb(boolean z10) {
        this.shouldGenerateQualityThumb = z10;
    }

    public void setSideClip(float f10) {
        this.sideClip = f10;
    }

    public void setSkipUpdateFrame(boolean z10) {
        this.skipUpdateFrame = z10;
    }

    public void setStrippedLocation(ImageLocation imageLocation) {
        this.strippedLocation = imageLocation;
    }

    public void setTag(int i10, int i11) {
        if (i11 == 1) {
            this.thumbTag = i10;
        } else if (i11 == 3) {
            this.mediaTag = i10;
        } else {
            this.imageTag = i10;
        }
    }

    public void setUniqKeyPrefix(String str) {
        this.uniqKeyPrefix = str;
    }

    public void setUseRoundForThumbDrawable(boolean z10) {
        this.useRoundForThumb = z10;
    }

    public void setUseSharedAnimationQueue(boolean z10) {
        this.useSharedAnimationQueue = z10;
    }

    public void setVideoThumbIsSame(boolean z10) {
        this.videoThumbIsSame = z10;
    }

    public void setVisible(boolean z10, boolean z11) {
        if (this.isVisible == z10) {
            return;
        }
        this.isVisible = z10;
        if (z11) {
            invalidate();
            Runnable runnable = this.visibleInvalidate;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void setVisibleInvalidate(Runnable runnable) {
        this.visibleInvalidate = runnable;
    }

    public void startAnimation() {
        startAnimation(false);
    }

    public void startCrossfadeFromStaticThumb(Bitmap bitmap) {
        startCrossfadeFromStaticThumb(new BitmapDrawable((Resources) null, bitmap));
    }

    public void stopAnimation() {
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation != null) {
            animation.stop();
            return;
        }
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.stop();
        }
    }

    public void updateStaticDrawableThump(Bitmap bitmap) {
        this.staticThumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(new BitmapDrawable(bitmap));
    }

    public boolean updateThumbShaderMatrix() {
        BitmapShader bitmapShader;
        BitmapShader bitmapShader2;
        Drawable drawable = this.currentThumbDrawable;
        if (drawable != null && (bitmapShader2 = this.thumbShader) != null) {
            drawDrawable(null, drawable, 255, bitmapShader2, 0, 0, 0, null);
            return true;
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 == null || (bitmapShader = this.staticThumbShader) == null) {
            return false;
        }
        drawDrawable(null, drawable2, 255, bitmapShader, 0, 0, 0, null);
        return true;
    }

    public ImageReceiver(View view) {
        this.allowCrossfadeWithImage = true;
        this.fileLoadingPriority = 1;
        this.useRoundForThumb = true;
        this.allowLottieVibration = true;
        this.allowStartAnimation = true;
        this.allowStartLottieAnimation = true;
        this.autoRepeat = 1;
        this.autoRepeatCount = -1;
        this.drawRegion = new RectF();
        this.isVisible = true;
        this.useRoundRadius = true;
        this.roundRadius = new int[4];
        this.isRoundRect = true;
        this.roundRect = new RectF();
        this.shaderMatrix = new Matrix();
        this.roundPath = new Path();
        this.overrideAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        this.crossfadeAlpha = (byte) 1;
        this.crossfadeByScale = 0.05f;
        this.crossfadeDuration = 150;
        this.loadingOperations = new ArrayList<>();
        this.allowLoadingOnAttachedOnly = false;
        this.clip = true;
        this.invalidateRunnable = new d1(this, 23);
        this.parentView = view;
        this.roundPaint = new Paint(3);
        this.currentAccount = UserConfig.selectedAccount;
    }

    public boolean draw(Canvas canvas, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        boolean z10;
        int i10;
        org.telegram.ui.Components.x5 animation;
        oi0 lottieAnimation;
        int[] iArr;
        BitmapShader bitmapShader;
        Drawable drawable;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        BitmapShader bitmapShader4;
        Drawable drawable2;
        float f10;
        boolean z11;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        boolean z12;
        float f11;
        float f12;
        BitmapShader bitmapShader5;
        Drawable drawable6;
        int i11;
        int i12;
        BitmapShader bitmapShader6;
        Drawable drawable7;
        boolean z13;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder2;
        BitmapShader bitmapShader7;
        Drawable drawable8;
        int i13;
        Canvas canvas2;
        Drawable drawable9;
        int[] iArr2;
        boolean z14;
        ImageReceiver imageReceiver = this;
        Canvas canvas3 = canvas;
        if (imageReceiver.gradientBitmap != null && imageReceiver.currentImageKey != null) {
            canvas3.save();
            float f13 = imageReceiver.imageX;
            float f14 = imageReceiver.imageY;
            canvas3.clipRect(f13, f14, imageReceiver.imageW + f13, imageReceiver.imageH + f14);
            canvas3.drawColor(-16777216);
        }
        boolean z15 = backgroundThreadDrawHolder != null;
        try {
            if (z15) {
                animation = backgroundThreadDrawHolder.animation;
                lottieAnimation = backgroundThreadDrawHolder.lottieDrawable;
                iArr = backgroundThreadDrawHolder.roundRadius;
                Drawable drawable10 = backgroundThreadDrawHolder.mediaDrawable;
                bitmapShader = backgroundThreadDrawHolder.mediaShader;
                drawable = backgroundThreadDrawHolder.imageDrawable;
                bitmapShader2 = backgroundThreadDrawHolder.imageShader;
                bitmapShader3 = backgroundThreadDrawHolder.thumbShader;
                bitmapShader4 = backgroundThreadDrawHolder.staticThumbShader;
                drawable2 = backgroundThreadDrawHolder.crossfadeImage;
                boolean unused = backgroundThreadDrawHolder.crossfadeWithOldImage;
                z12 = backgroundThreadDrawHolder.crossfadingWithThumb;
                drawable5 = backgroundThreadDrawHolder.thumbDrawable;
                Drawable drawable11 = backgroundThreadDrawHolder.staticThumbDrawable;
                float f15 = backgroundThreadDrawHolder.currentAlpha;
                f12 = backgroundThreadDrawHolder.previousAlpha;
                BitmapShader bitmapShader8 = backgroundThreadDrawHolder.crossfadeShader;
                boolean z16 = backgroundThreadDrawHolder.animationNotReady;
                f10 = backgroundThreadDrawHolder.overrideAlpha;
                drawable3 = drawable10;
                drawable4 = drawable11;
                f11 = f15;
                bitmapShader5 = bitmapShader8;
                z11 = z16;
            } else {
                animation = imageReceiver.getAnimation();
                lottieAnimation = imageReceiver.getLottieAnimation();
                iArr = imageReceiver.roundRadius;
                Drawable drawable12 = imageReceiver.currentMediaDrawable;
                bitmapShader = imageReceiver.mediaShader;
                drawable = imageReceiver.currentImageDrawable;
                bitmapShader2 = imageReceiver.imageShader;
                Drawable drawable13 = imageReceiver.currentThumbDrawable;
                bitmapShader3 = imageReceiver.thumbShader;
                bitmapShader4 = imageReceiver.staticThumbShader;
                boolean z17 = imageReceiver.crossfadingWithThumb;
                drawable2 = imageReceiver.crossfadeImage;
                Drawable drawable14 = imageReceiver.staticThumbDrawable;
                float f16 = imageReceiver.currentAlpha;
                float f17 = imageReceiver.previousAlpha;
                BitmapShader bitmapShader9 = imageReceiver.crossfadeShader;
                f10 = imageReceiver.overrideAlpha;
                z11 = ((animation == null || animation.s()) && (lottieAnimation == null || lottieAnimation.s())) ? false : true;
                drawable3 = drawable12;
                drawable4 = drawable14;
                drawable5 = drawable13;
                z12 = z17;
                f11 = f16;
                f12 = f17;
                bitmapShader5 = bitmapShader9;
            }
            try {
                if (!imageReceiver.useRoundRadius) {
                    iArr = imageReceiver.emptyRoundRadius;
                }
                int[] iArr3 = iArr;
                if (animation != null) {
                    animation.B(iArr3);
                }
                if (animation != null || lottieAnimation != null) {
                    if (!z11 && !imageReceiver.animationReadySent && z15 == 0) {
                        imageReceiver.animationReadySent = true;
                        ImageReceiverDelegate imageReceiverDelegate = imageReceiver.delegate;
                        if (imageReceiverDelegate != null) {
                            imageReceiverDelegate.onAnimationReady(imageReceiver);
                        }
                    }
                }
                boolean z18 = imageReceiver.forcePreview;
                if (!z18 && !imageReceiver.forceNotMedia && drawable3 != null && !z11) {
                    i11 = imageReceiver.imageOrientation;
                    bitmapShader2 = bitmapShader;
                    i12 = imageReceiver.imageInvert;
                    drawable6 = drawable3;
                } else if (!z18 && drawable != null && (!z11 || drawable3 != null)) {
                    i11 = imageReceiver.imageOrientation;
                    i12 = imageReceiver.imageInvert;
                    drawable6 = drawable;
                    z11 = false;
                } else if (drawable2 != null && !z12) {
                    i11 = imageReceiver.imageOrientation;
                    i12 = imageReceiver.imageInvert;
                    drawable6 = drawable2;
                    bitmapShader2 = bitmapShader5;
                } else if (drawable5 != null) {
                    i11 = imageReceiver.thumbOrientation;
                    i12 = imageReceiver.thumbInvert;
                    bitmapShader2 = bitmapShader3;
                    drawable6 = drawable5;
                } else if (drawable4 instanceof BitmapDrawable) {
                    if (imageReceiver.useRoundForThumb && bitmapShader4 == null) {
                        imageReceiver.updateDrawableRadius(drawable4);
                        bitmapShader6 = imageReceiver.staticThumbShader;
                    } else {
                        bitmapShader6 = bitmapShader4;
                    }
                    i11 = imageReceiver.thumbOrientation;
                    bitmapShader2 = bitmapShader6;
                    bitmapShader4 = bitmapShader2;
                    i12 = imageReceiver.thumbInvert;
                    drawable6 = drawable4;
                } else {
                    drawable6 = null;
                    bitmapShader2 = null;
                    i11 = 0;
                    i12 = 0;
                }
                float f18 = imageReceiver.crossfadeByScale;
                BitmapShader bitmapShader10 = bitmapShader2;
                float fMin = f18 > 0.0f ? Math.min((f18 * f11) + f11, 1.0f) : f11;
                if (drawable6 != null) {
                    if (imageReceiver.crossfadeAlpha != 0) {
                        if (f12 == 1.0f || !(drawable6 == drawable || drawable6 == drawable3)) {
                            z13 = z11;
                            bitmapShader7 = bitmapShader4;
                            z10 = true;
                            drawable8 = drawable4;
                            i13 = i11;
                        } else if (drawable4 != null) {
                            if (imageReceiver.useRoundForThumb && bitmapShader4 == null) {
                                imageReceiver.updateDrawableRadius(drawable4);
                                bitmapShader4 = imageReceiver.staticThumbShader;
                            }
                            BitmapShader bitmapShader11 = bitmapShader4;
                            drawable8 = drawable4;
                            i13 = i11;
                            z13 = z11;
                            z10 = true;
                            imageReceiver.drawDrawable(canvas, drawable8, (int) (f10 * 255.0f), bitmapShader11, i13, i12, backgroundThreadDrawHolder);
                            bitmapShader7 = bitmapShader11;
                        } else {
                            z13 = z11;
                            bitmapShader7 = bitmapShader4;
                            z10 = true;
                            drawable8 = drawable4;
                            i13 = i11;
                        }
                        try {
                            boolean z19 = imageReceiver.crossfadeWithThumb;
                            if (z19 && z13) {
                                Drawable drawable15 = drawable6;
                                imageReceiver.drawDrawable(canvas, drawable15, (int) (f10 * 255.0f), bitmapShader10, i13, i12, backgroundThreadDrawHolder);
                                backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                drawable7 = drawable15;
                            } else {
                                int i14 = i12;
                                Drawable drawable16 = drawable6;
                                int i15 = i13;
                                if (!z19 || fMin == 1.0f) {
                                    canvas2 = canvas;
                                    drawable9 = drawable16;
                                    iArr2 = iArr3;
                                } else {
                                    if (drawable16 != drawable && drawable16 != drawable3) {
                                        if (drawable16 == drawable5 || drawable16 == drawable2) {
                                            if (drawable8 != null) {
                                                if (imageReceiver.useRoundForThumb && bitmapShader7 == null) {
                                                    imageReceiver.updateDrawableRadius(drawable8);
                                                    bitmapShader7 = imageReceiver.staticThumbShader;
                                                }
                                            }
                                        } else if (drawable16 == drawable8 && drawable2 != null) {
                                            drawable8 = drawable2;
                                            bitmapShader7 = bitmapShader5;
                                        }
                                        bitmapShader7 = null;
                                        drawable8 = null;
                                    } else if (drawable2 != null) {
                                        drawable8 = drawable2;
                                        bitmapShader7 = bitmapShader5;
                                    } else if (drawable5 != 0) {
                                        drawable8 = drawable5;
                                        bitmapShader7 = bitmapShader3;
                                    } else if (drawable8 == null) {
                                        bitmapShader7 = null;
                                        drawable8 = null;
                                    } else if (imageReceiver.useRoundForThumb && bitmapShader7 == null) {
                                        imageReceiver.updateDrawableRadius(drawable8);
                                        bitmapShader7 = imageReceiver.staticThumbShader;
                                    }
                                    if (drawable8 != null) {
                                        int iZ = ((drawable8 instanceof SvgHelper.SvgDrawable) || (drawable8 instanceof Emoji.EmojiDrawable)) ? (int) y1.z(1.0f, fMin, f10, 255.0f) : (int) (f12 * f10 * 255.0f);
                                        drawable9 = drawable16;
                                        iArr2 = iArr3;
                                        BitmapShader bitmapShader12 = bitmapShader7;
                                        canvas2 = canvas;
                                        imageReceiver.drawDrawable(canvas2, drawable8, iZ, bitmapShader12, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                                        if (iZ != 255 && (drawable8 instanceof Emoji.EmojiDrawable)) {
                                            drawable8.setAlpha(255);
                                        }
                                    } else {
                                        canvas2 = canvas;
                                        drawable9 = drawable16;
                                        iArr2 = iArr3;
                                    }
                                }
                                if (imageReceiver.crossfadeByScale <= 0.0f || fMin >= 1.0f || !z12) {
                                    z14 = false;
                                } else {
                                    canvas2.save();
                                    imageReceiver.roundPath.rewind();
                                    RectF rectF = AndroidUtilities.rectTmp;
                                    float f19 = imageReceiver.imageX;
                                    float f20 = imageReceiver.imageY;
                                    rectF.set(f19, f20, imageReceiver.imageW + f19, imageReceiver.imageH + f20);
                                    for (int i16 = 0; i16 < iArr2.length; i16++) {
                                        float[] fArr = radii;
                                        int i17 = i16 * 2;
                                        int i18 = iArr2[i16];
                                        fArr[i17] = i18;
                                        fArr[i17 + 1] = i18;
                                    }
                                    imageReceiver.roundPath.addRoundRect(AndroidUtilities.rectTmp, radii, Path.Direction.CW);
                                    canvas2.clipPath(imageReceiver.roundPath);
                                    float fZ = com.google.android.recaptcha.internal.a.z(1.0f, er.f28124i.getInterpolation(f11), imageReceiver.crossfadeByScale, 1.0f);
                                    canvas2.scale(fZ, fZ, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                    z14 = true;
                                }
                                int i19 = (int) (f10 * fMin * 255.0f);
                                Drawable drawable17 = drawable9;
                                imageReceiver.drawDrawable(canvas2, drawable17, i19, bitmapShader10, i15, i14, backgroundThreadDrawHolder);
                                if (z14) {
                                    canvas.restore();
                                }
                                imageReceiver = this;
                                backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                drawable7 = drawable17;
                            }
                        } catch (Exception e9) {
                            e = e9;
                            imageReceiver = this;
                            canvas3 = canvas;
                            z10 = false;
                            FileLog.e(e);
                            if (imageReceiver.gradientBitmap != null) {
                                canvas3.restore();
                            }
                            if (z10) {
                                for (i10 = 0; i10 < imageReceiver.decorators.size(); i10++) {
                                    imageReceiver.decorators.get(i10).onDraw(canvas3, imageReceiver);
                                }
                            }
                            return z10;
                        }
                    } else {
                        Drawable drawable18 = drawable6;
                        z13 = z11;
                        z10 = true;
                        imageReceiver = this;
                        backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                        imageReceiver.drawDrawable(canvas, drawable18, (int) (f10 * 255.0f), bitmapShader10, i11, i12, backgroundThreadDrawHolder2);
                        drawable7 = drawable18;
                    }
                    imageReceiver.checkAlphaAnimation(z13 && imageReceiver.crossfadeWithThumb, backgroundThreadDrawHolder2);
                    canvas3 = canvas;
                } else {
                    drawable7 = drawable6;
                    Drawable drawable19 = drawable4;
                    z13 = z11;
                    z10 = true;
                    if (drawable19 != null) {
                        if (drawable19 instanceof w51) {
                            ((w51) drawable19).f34118e = imageReceiver;
                        }
                        canvas3 = canvas;
                        imageReceiver.drawDrawable(canvas3, drawable19, (int) (f10 * 255.0f), null, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                        imageReceiver.checkAlphaAnimation(z13, backgroundThreadDrawHolder);
                    } else {
                        canvas3 = canvas;
                        imageReceiver.checkAlphaAnimation(z13, backgroundThreadDrawHolder);
                        z10 = false;
                    }
                }
                if (drawable7 == null && z13 && !z15) {
                    try {
                        imageReceiver.invalidate();
                    } catch (Exception e10) {
                        e = e10;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
        }
        if (imageReceiver.gradientBitmap != null && imageReceiver.currentImageKey != null) {
            canvas3.restore();
        }
        if (z10 && imageReceiver.isVisible && imageReceiver.decorators != null) {
            while (i10 < imageReceiver.decorators.size()) {
                imageReceiver.decorators.get(i10).onDraw(canvas3, imageReceiver);
            }
        }
        return z10;
    }

    public int[] getRoundRadius(boolean z10) {
        return (this.useRoundRadius || !z10) ? this.roundRadius : this.emptyRoundRadius;
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj) {
        setForUserOrChat(tLObject, drawable, obj, false, 0, false);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, long j10, String str2, Object obj, int i10) {
        setImage(imageLocation, str, null, null, drawable, j10, str2, obj, i10);
    }

    public void setImageBitmap(Drawable drawable) {
        boolean z10 = true;
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
        if (!this.crossfadeWithOldImage) {
            for (int i10 = 0; i10 < 4; i10++) {
                recycleBitmap(null, i10);
            }
        } else if (this.currentImageDrawable != null) {
            recycleBitmap(null, 1);
            recycleBitmap(null, 2);
            recycleBitmap(null, 3);
            this.crossfadeShader = this.imageShader;
            this.crossfadeImage = this.currentImageDrawable;
            this.crossfadeKey = this.currentImageKey;
            this.crossfadingWithThumb = true;
        } else if (this.currentThumbDrawable != null) {
            recycleBitmap(null, 0);
            recycleBitmap(null, 2);
            recycleBitmap(null, 3);
            this.crossfadeShader = this.thumbShader;
            this.crossfadeImage = this.currentThumbDrawable;
            this.crossfadeKey = this.currentThumbKey;
            this.crossfadingWithThumb = true;
        } else if (this.staticThumbDrawable != null) {
            recycleBitmap(null, 0);
            recycleBitmap(null, 1);
            recycleBitmap(null, 2);
            recycleBitmap(null, 3);
            this.crossfadeShader = this.staticThumbShader;
            this.crossfadeImage = this.staticThumbDrawable;
            this.crossfadingWithThumb = true;
            this.crossfadeKey = null;
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                recycleBitmap(null, i11);
            }
            this.crossfadeShader = null;
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 instanceof zj0) {
            hc0 hc0Var = (hc0) ((zj0) drawable2);
            DownloadController.getInstance(hc0Var.f28975r.currentAccount).removeLoadingFileObserver(hc0Var);
            hc0Var.f28974n = null;
            hc0Var.f28975r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.k5) {
            org.telegram.ui.Components.k5 k5Var = (org.telegram.ui.Components.k5) drawable;
            if (this.attachedToWindow) {
                k5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.x5) {
            org.telegram.ui.Components.x5 x5Var = (org.telegram.ui.Components.x5) drawable;
            View view = this.parentView;
            if (x5Var.f34485n0 == null) {
                x5Var.f34485n0 = view;
            }
            if (this.attachedToWindow) {
                x5Var.e(this);
            }
            boolean z11 = this.useSharedAnimationQueue || x5Var.f34481j0;
            if (!x5Var.f34481j0) {
                x5Var.f34490r0 = z11;
            }
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                x5Var.j();
            }
            boolean z12 = this.allowDecodeSingleFrame;
            x5Var.f34500y = z12;
            if (z12) {
                x5Var.x(false);
            }
        } else if (drawable instanceof oi0) {
            oi0 oi0Var = (oi0) drawable;
            if (this.attachedToWindow) {
                oi0Var.F.add(this);
            }
            oi0Var.A = this.allowLottieVibration;
            if (this.allowStartLottieAnimation && (!oi0Var.x() || this.currentOpenedLayerFlags == 0)) {
                oi0Var.start();
            }
            oi0Var.H(true);
        }
        this.staticThumbShader = null;
        this.thumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(drawable);
        updateDrawableRadius(drawable);
        this.currentMediaLocation = null;
        this.currentMediaFilter = null;
        Drawable drawable3 = this.currentMediaDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.x5) {
            ((org.telegram.ui.Components.x5) drawable3).v(this);
        }
        this.currentMediaDrawable = null;
        this.currentMediaKey = null;
        this.mediaShader = null;
        this.currentImageLocation = null;
        this.currentImageFilter = null;
        this.currentImageDrawable = null;
        this.currentImageKey = null;
        this.imageShader = null;
        this.composeShader = null;
        this.legacyShader = null;
        this.legacyCanvas = null;
        Bitmap bitmap = this.legacyBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.legacyBitmap = null;
        }
        this.currentThumbLocation = null;
        this.currentThumbFilter = null;
        this.currentThumbKey = null;
        this.currentKeyQuality = false;
        this.currentExt = null;
        this.currentSize = 0L;
        this.currentCacheType = 0;
        this.currentAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        SetImageBackup setImageBackup = this.setImageBackup;
        if (setImageBackup != null) {
            setImageBackup.clear();
        }
        ImageReceiverDelegate imageReceiverDelegate = this.delegate;
        if (imageReceiverDelegate != null) {
            imageReceiverDelegate.didSetImage(this, (this.currentThumbDrawable == null && this.staticThumbDrawable == null) ? false : true, true, false);
        }
        invalidate();
        if (this.forceCrossfade && this.crossfadeWithOldImage && this.crossfadeImage != null) {
            this.currentAlpha = 0.0f;
            this.lastUpdateAlphaTime = System.currentTimeMillis();
            if (this.currentThumbDrawable == null && this.staticThumbDrawable == null) {
                z10 = false;
            }
            this.crossfadeWithThumb = z10;
        }
    }

    public void setOrientation(int i10, int i11, boolean z10) {
        while (i10 < 0) {
            i10 += 360;
        }
        while (i10 > 360) {
            i10 -= 360;
        }
        this.thumbOrientation = i10;
        this.imageOrientation = i10;
        this.thumbInvert = i11;
        this.imageInvert = i11;
        this.centerRotation = z10;
    }

    public void setRoundRadius(int i10, int i11, int i12, int i13) {
        setRoundRadius(new int[]{i10, i11, i12, i13});
    }

    public void startAnimation(boolean z10) {
        org.telegram.ui.Components.x5 animation = getAnimation();
        if (animation != null) {
            boolean z11 = this.useSharedAnimationQueue;
            if (!animation.f34481j0) {
                animation.f34490r0 = z11;
            }
            animation.start();
            return;
        }
        oi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation == null || lottieAnimation.f31317h0) {
            return;
        }
        lottieAnimation.F(z10);
    }

    public void startCrossfadeFromStaticThumb(Drawable drawable) {
        this.currentThumbKey = null;
        this.currentThumbDrawable = null;
        this.thumbShader = null;
        this.staticThumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(drawable);
        this.crossfadeWithThumb = true;
        this.currentAlpha = 0.0f;
        updateDrawableRadius(this.staticThumbDrawable);
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj, boolean z10, int i10, boolean z11) {
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        boolean z12;
        boolean z13;
        TLRPC.ChatPhoto chatPhoto;
        ImageLocation forUserOrChat;
        String str;
        BitmapDrawable bitmapDrawable2;
        TLRPC.VideoSize vectorMarkupVideoSize;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull userFull;
        Object obj2 = obj == null ? tLObject : obj;
        setUseRoundForThumbDrawable(true);
        TLRPC.VideoSize videoSize = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        forPhoto = null;
        ImageLocation forPhoto = null;
        videoSize = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z12 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z13 = userProfilePhoto.stripped_thumb != null;
                if (i10 != 3 || (userFull = MessagesController.getInstance(this.currentAccount).getUserFull(user.f22527id)) == null) {
                    vectorMarkupVideoSize = null;
                } else {
                    TLRPC.Photo photo = user.photo.personal ? userFull.personal_photo : userFull.profile_photo;
                    if (photo != null) {
                        vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo);
                    } else {
                        vectorMarkupVideoSize = null;
                    }
                }
                if (vectorMarkupVideoSize == null && z10 && MessagesController.getInstance(this.currentAccount).isPremiumUser(user) && user.photo.has_video && LiteMode.isEnabled(1024)) {
                    TLRPC.UserFull userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(user.f22527id);
                    if (userFull2 == null) {
                        MessagesController.getInstance(this.currentAccount).loadFullUser(user, this.currentGuid, false);
                    } else {
                        TLRPC.Photo photo2 = user.photo.personal ? userFull2.personal_photo : userFull2.profile_photo;
                        if (photo2 != null && (vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
                            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(arrayList, 100);
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TLRPC.VideoSize videoSize2 = arrayList.get(i11);
                                if ("p".equals(videoSize2.type)) {
                                    closestVideoSizeWithSize = videoSize2;
                                }
                                if ((videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                                    vectorMarkupVideoSize = videoSize2;
                                }
                            }
                            forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2);
                        }
                    }
                }
            } else {
                bitmapDrawable2 = null;
                vectorMarkupVideoSize = null;
                z13 = false;
            }
            imageLocation = forPhoto;
            bitmapDrawable = bitmapDrawable2;
            videoSize = vectorMarkupVideoSize;
        } else if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
            imageLocation = null;
            bitmapDrawable = null;
            z12 = false;
            z13 = false;
        } else {
            bitmapDrawable = chatPhoto.strippedBitmap;
            z13 = chatPhoto.stripped_thumb != null;
            imageLocation = null;
            z12 = false;
        }
        if (videoSize != null && i10 != 0) {
            setImageBitmap(new w51(videoSize, z12, i10));
            return;
        }
        if (!z11) {
            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 1);
            str = "50_50";
        } else {
            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 0);
            str = "100_100";
        }
        String str2 = str;
        ImageLocation imageLocation2 = forUserOrChat;
        if (imageLocation != null) {
            setImage(imageLocation, "avatar", imageLocation2, str2, null, null, bitmapDrawable, 0L, null, obj2, 0);
            this.animatedFileDrawableRepeatMaxCount = 3;
            return;
        }
        Object obj3 = obj2;
        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
        if (bitmapDrawable3 != null) {
            setImage(imageLocation2, str2, bitmapDrawable3, null, obj3, 0);
        } else if (z13) {
            setImage(imageLocation2, str2, ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 2), "50_50_b", drawable, obj3, 0);
        } else {
            setImage(imageLocation2, str2, drawable, null, obj3, 0);
        }
    }

    public void setImage(String str, String str2, Drawable drawable, String str3, long j10) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, j10, str3, null, 1);
    }

    public void setRoundRadius(int[] iArr) {
        int i10 = iArr[0];
        this.isRoundRect = true;
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            int[] iArr2 = this.roundRadius;
            if (i11 >= iArr2.length) {
                break;
            }
            int i12 = iArr2[i11];
            int i13 = iArr[i11];
            if (i12 != i13) {
                z10 = true;
            }
            if (i10 != i13) {
                this.isRoundRect = false;
            }
            iArr2[i11] = i13;
            i11++;
        }
        if (z10) {
            Drawable drawable = this.currentImageDrawable;
            if (drawable != null && this.imageShader == null) {
                updateDrawableRadius(drawable);
            }
            Drawable drawable2 = this.currentMediaDrawable;
            if (drawable2 != null && this.mediaShader == null) {
                updateDrawableRadius(drawable2);
            }
            Drawable drawable3 = this.currentThumbDrawable;
            if (drawable3 != null) {
                updateDrawableRadius(drawable3);
            }
            Drawable drawable4 = this.staticThumbDrawable;
            if (drawable4 != null) {
                updateDrawableRadius(drawable4);
            }
        }
    }

    public static class BackgroundThreadDrawHolder {
        private org.telegram.ui.Components.x5 animation;
        public boolean animationNotReady;
        public ColorFilter colorFilter;
        private Drawable crossfadeImage;
        private BitmapShader crossfadeShader;
        private boolean crossfadeWithOldImage;
        private boolean crossfadingWithThumb;
        private float currentAlpha;
        private Drawable imageDrawable;
        public float imageH;
        private BitmapShader imageShader;
        public float imageW;
        public float imageX;
        public float imageY;
        private oi0 lottieDrawable;
        private Drawable mediaDrawable;
        private BitmapShader mediaShader;
        public float overrideAlpha;
        Paint paint;
        private float previousAlpha;
        private Path roundPath;
        private Drawable staticThumbDrawable;
        public BitmapShader staticThumbShader;
        public int threadIndex;
        private Drawable thumbDrawable;
        private BitmapShader thumbShader;
        public long time;
        private int[] roundRadius = new int[4];
        public RectF drawRegion = new RectF();

        public void getBounds(RectF rectF) {
            if (rectF != null) {
                float f10 = this.imageX;
                rectF.left = f10;
                float f11 = this.imageY;
                rectF.top = f11;
                rectF.right = f10 + this.imageW;
                rectF.bottom = f11 + this.imageH;
            }
        }

        public void release() {
            this.animation = null;
            this.lottieDrawable = null;
            for (int i10 = 0; i10 < 4; i10++) {
                int[] iArr = this.roundRadius;
                iArr[i10] = iArr[i10];
            }
            this.mediaDrawable = null;
            this.mediaShader = null;
            this.imageDrawable = null;
            this.imageShader = null;
            this.thumbDrawable = null;
            this.thumbShader = null;
            this.staticThumbShader = null;
            this.staticThumbDrawable = null;
            this.crossfadeImage = null;
            this.colorFilter = null;
        }

        public void setBounds(Rect rect) {
            if (rect != null) {
                this.imageX = rect.left;
                this.imageY = rect.top;
                this.imageW = rect.width();
                this.imageH = rect.height();
            }
        }

        public void getBounds(Rect rect) {
            if (rect != null) {
                int i10 = (int) this.imageX;
                rect.left = i10;
                int i11 = (int) this.imageY;
                rect.top = i11;
                rect.right = (int) (i10 + this.imageW);
                rect.bottom = (int) (i11 + this.imageH);
            }
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, String str3, Object obj, int i10) {
        setImage(imageLocation, str, imageLocation2, str2, null, 0L, str3, obj, i10);
    }

    public static class BitmapHolder {
        public Bitmap bitmap;
        public Drawable drawable;
        private String key;
        public int orientation;
        private boolean recycleOnRelease;

        public BitmapHolder(Bitmap bitmap, String str, int i10) {
            this.bitmap = bitmap;
            this.key = str;
            this.orientation = i10;
            if (str != null) {
                ImageLoader.getInstance().incrementUseCount(this.key);
            }
        }

        public int getHeight() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                return bitmap.getHeight();
            }
            return 0;
        }

        public String getKey() {
            return this.key;
        }

        public int getWidth() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            return 0;
        }

        public boolean isRecycled() {
            Bitmap bitmap = this.bitmap;
            return bitmap == null || bitmap.isRecycled();
        }

        public void release() {
            Bitmap bitmap;
            if (this.key == null) {
                if (this.recycleOnRelease && (bitmap = this.bitmap) != null) {
                    bitmap.recycle();
                }
                this.bitmap = null;
                this.drawable = null;
                return;
            }
            boolean zDecrementUseCount = ImageLoader.getInstance().decrementUseCount(this.key);
            if (!ImageLoader.getInstance().isInMemCache(this.key, false) && zDecrementUseCount) {
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                } else {
                    Drawable drawable = this.drawable;
                    if (drawable != null) {
                        if (drawable instanceof oi0) {
                            ((oi0) drawable).A(false);
                        } else if (drawable instanceof org.telegram.ui.Components.x5) {
                            ((org.telegram.ui.Components.x5) drawable).u();
                        } else if (drawable instanceof BitmapDrawable) {
                            ((BitmapDrawable) drawable).getBitmap().recycle();
                        }
                    }
                }
            }
            this.key = null;
            this.bitmap = null;
            this.drawable = null;
        }

        public BitmapHolder(Drawable drawable, String str, int i10) {
            this.drawable = drawable;
            this.key = str;
            this.orientation = i10;
            if (str != null) {
                ImageLoader.getInstance().incrementUseCount(this.key);
            }
        }

        public BitmapHolder(Bitmap bitmap) {
            this.bitmap = bitmap;
            this.recycleOnRelease = true;
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j10, String str3, Object obj, int i10) {
        setImage(imageLocation, str, imageLocation2, str2, null, j10, str3, obj, i10);
    }

    public void setImageCoords(Rect rect) {
        if (rect != null) {
            this.imageX = rect.left;
            this.imageY = rect.top;
            this.imageW = rect.width();
            this.imageH = rect.height();
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj, int i10) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, 0L, null, obj, i10);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, long j10, String str3, Object obj, int i10) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, j10, str3, obj, i10);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, Drawable drawable, long j10, String str4, Object obj, int i10) {
        String str5;
        String str6;
        SetImageBackup setImageBackup;
        ImageLocation imageLocation4 = imageLocation;
        ImageLocation imageLocation5 = imageLocation2;
        if (this.allowLoadingOnAttachedOnly && !this.attachedToWindow) {
            if (this.setImageBackup == null) {
                this.setImageBackup = new SetImageBackup();
            }
            SetImageBackup setImageBackup2 = this.setImageBackup;
            setImageBackup2.mediaLocation = imageLocation4;
            setImageBackup2.mediaFilter = str;
            setImageBackup2.imageLocation = imageLocation5;
            setImageBackup2.imageFilter = str2;
            setImageBackup2.thumbLocation = imageLocation3;
            setImageBackup2.thumbFilter = str3;
            setImageBackup2.thumb = drawable;
            setImageBackup2.size = j10;
            setImageBackup2.ext = str4;
            setImageBackup2.cacheType = i10;
            setImageBackup2.parentObject = obj;
            return;
        }
        if (this.ignoreImageSet) {
            return;
        }
        if (this.crossfadeWithOldImage && (setImageBackup = this.setImageBackup) != null && setImageBackup.isWebfileSet()) {
            setBackupImage();
        }
        SetImageBackup setImageBackup3 = this.setImageBackup;
        if (setImageBackup3 != null) {
            setImageBackup3.clear();
        }
        if (imageLocation5 == null && imageLocation3 == null && imageLocation4 == null) {
            for (int i11 = 0; i11 < 4; i11++) {
                recycleBitmap(null, i11);
            }
            this.currentImageLocation = null;
            this.currentImageFilter = null;
            this.currentImageKey = null;
            this.currentMediaLocation = null;
            this.currentMediaFilter = null;
            this.currentMediaKey = null;
            this.currentThumbLocation = null;
            this.currentThumbFilter = null;
            this.currentThumbKey = null;
            this.currentMediaDrawable = null;
            this.mediaShader = null;
            this.currentImageDrawable = null;
            this.imageShader = null;
            this.composeShader = null;
            this.thumbShader = null;
            this.crossfadeShader = null;
            this.legacyShader = null;
            this.legacyCanvas = null;
            Bitmap bitmap = this.legacyBitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.legacyBitmap = null;
            }
            this.currentExt = str4;
            this.currentParentObject = null;
            this.currentCacheType = 0;
            this.roundPaint.setShader(null);
            setStaticDrawable(drawable);
            this.currentAlpha = 1.0f;
            this.previousAlpha = 1.0f;
            this.currentSize = 0L;
            updateDrawableRadius(this.staticThumbDrawable);
            ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
            invalidate();
            ImageReceiverDelegate imageReceiverDelegate = this.delegate;
            if (imageReceiverDelegate != null) {
                Drawable drawable2 = this.currentImageDrawable;
                imageReceiverDelegate.didSetImage(this, (drawable2 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable2 == null && this.currentMediaDrawable == null, false);
                return;
            }
            return;
        }
        String key = imageLocation5 != null ? imageLocation5.getKey(obj, null, false) : null;
        if (key == null && imageLocation5 != null) {
            imageLocation5 = null;
        }
        this.animatedFileDrawableRepeatMaxCount = Math.max(this.autoRepeatCount, 0);
        this.currentKeyQuality = false;
        if (key == null && this.needsQualityThumb && ((obj instanceof MessageObject) || this.qulityThumbDocument != null)) {
            TLRPC.Document document = this.qulityThumbDocument;
            if (document == null) {
                document = ((MessageObject) obj).getDocument();
            }
            if (document != null && document.dc_id != 0 && document.f22386id != 0) {
                key = "q_" + document.dc_id + "_" + document.f22386id;
                this.currentKeyQuality = true;
            }
        }
        String strP = key;
        if (strP != null && str2 != null) {
            strP = a9.p.w(strP, "@", str2);
        }
        if (this.uniqKeyPrefix != null) {
            strP = a9.p.p(new StringBuilder(), this.uniqKeyPrefix, strP);
        }
        String key2 = imageLocation4 != null ? imageLocation4.getKey(obj, null, false) : null;
        if (key2 == null && imageLocation4 != null) {
            imageLocation4 = null;
        }
        if (key2 != null && str != null) {
            key2 = a9.p.w(key2, "@", str);
        }
        if (this.uniqKeyPrefix != null) {
            key2 = a9.p.p(new StringBuilder(), this.uniqKeyPrefix, key2);
        }
        if ((key2 == null && (str6 = this.currentImageKey) != null && str6.equals(strP)) || ((str5 = this.currentMediaKey) != null && str5.equals(key2))) {
            ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
            if (imageReceiverDelegate2 != null) {
                Drawable drawable3 = this.currentImageDrawable;
                imageReceiverDelegate2.didSetImage(this, (drawable3 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable3 == null && this.currentMediaDrawable == null, false);
            }
            if (!this.canceledLoading) {
                return;
            }
        }
        ImageLocation imageLocation6 = this.strippedLocation;
        if (imageLocation6 == null) {
            imageLocation6 = imageLocation4 != null ? imageLocation4 : imageLocation5;
        }
        if (imageLocation6 == null) {
            imageLocation6 = imageLocation3;
        }
        String key3 = imageLocation3 != null ? imageLocation3.getKey(obj, imageLocation6, false) : null;
        if (key3 != null && str3 != null) {
            key3 = a9.p.w(key3, "@", str3);
        }
        if (this.crossfadeWithOldImage) {
            Object obj2 = this.currentParentObject;
            if (obj2 instanceof MessageObject) {
                MessageObject messageObject = (MessageObject) obj2;
                if (messageObject.lastGeoWebFileSet != null && (MessageObject.getMedia(messageObject) instanceof TLRPC.TL_messageMediaGeoLive)) {
                    MessageObject messageObject2 = (MessageObject) this.currentParentObject;
                    messageObject2.lastGeoWebFileLoaded = messageObject2.lastGeoWebFileSet;
                }
            }
            Drawable drawable4 = this.currentMediaDrawable;
            if (drawable4 != null) {
                if (drawable4 instanceof org.telegram.ui.Components.x5) {
                    ((org.telegram.ui.Components.x5) drawable4).stop();
                    ((org.telegram.ui.Components.x5) this.currentMediaDrawable).v(this);
                }
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 0);
                this.crossfadeImage = this.currentMediaDrawable;
                this.crossfadeShader = this.mediaShader;
                this.crossfadeKey = this.currentImageKey;
                this.crossfadingWithThumb = false;
                this.currentMediaDrawable = null;
                this.currentMediaKey = null;
            } else if (this.currentImageDrawable != null) {
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.imageShader;
                this.crossfadeImage = this.currentImageDrawable;
                this.crossfadeKey = this.currentImageKey;
                this.crossfadingWithThumb = false;
                this.currentImageDrawable = null;
                this.currentImageKey = null;
            } else if (this.currentThumbDrawable != null) {
                recycleBitmap(strP, 0);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.thumbShader;
                this.crossfadeImage = this.currentThumbDrawable;
                this.crossfadeKey = this.currentThumbKey;
                this.crossfadingWithThumb = false;
                this.currentThumbDrawable = null;
                this.currentThumbKey = null;
            } else if (this.staticThumbDrawable != null) {
                recycleBitmap(strP, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.staticThumbShader;
                this.crossfadeImage = this.staticThumbDrawable;
                this.crossfadingWithThumb = false;
                this.crossfadeKey = null;
                this.currentThumbDrawable = null;
                this.currentThumbKey = null;
            } else {
                recycleBitmap(strP, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = null;
            }
        } else {
            recycleBitmap(strP, 0);
            recycleBitmap(key3, 1);
            recycleBitmap(null, 2);
            recycleBitmap(key2, 3);
            this.crossfadeShader = null;
        }
        this.currentImageLocation = imageLocation5;
        this.currentImageFilter = str2;
        this.currentImageKey = strP;
        this.currentMediaLocation = imageLocation4;
        this.currentMediaFilter = str;
        this.currentMediaKey = key2;
        this.currentThumbLocation = imageLocation3;
        this.currentThumbFilter = str3;
        this.currentThumbKey = key3;
        this.currentParentObject = obj;
        this.currentExt = str4;
        this.currentSize = j10;
        this.currentCacheType = i10;
        setStaticDrawable(drawable);
        this.imageShader = null;
        this.composeShader = null;
        this.thumbShader = null;
        this.staticThumbShader = null;
        this.mediaShader = null;
        this.legacyShader = null;
        this.legacyCanvas = null;
        this.roundPaint.setShader(null);
        Bitmap bitmap2 = this.legacyBitmap;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.legacyBitmap = null;
        }
        this.currentAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        updateDrawableRadius(this.staticThumbDrawable);
        ImageReceiverDelegate imageReceiverDelegate3 = this.delegate;
        if (imageReceiverDelegate3 != null) {
            Drawable drawable5 = this.currentImageDrawable;
            imageReceiverDelegate3.didSetImage(this, (drawable5 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable5 == null && this.currentMediaDrawable == null, false);
        }
        loadImage();
        this.isRoundVideo = (obj instanceof MessageObject) && ((MessageObject) obj).isRoundVideo();
    }

    public void setImageCoords(RectF rectF) {
        if (rectF != null) {
            this.imageX = rectF.left;
            this.imageY = rectF.top;
            this.imageW = rectF.width();
            this.imageH = rectF.height();
        }
    }

    public void drawDrawable(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, int i13, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        ColorFilter colorFilter;
        int[] iArr;
        SvgHelper.SvgDrawable svgDrawable;
        SvgHelper.SvgDrawable svgDrawable2;
        boolean z10;
        Paint paint;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z11;
        float f14;
        float f15;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder2;
        float f16;
        float f17;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder3;
        Path path;
        BitmapDrawable bitmapDrawable;
        float f18;
        if (backgroundThreadDrawHolder != null) {
            f10 = backgroundThreadDrawHolder.imageX;
            f11 = backgroundThreadDrawHolder.imageY;
            f12 = backgroundThreadDrawHolder.imageH;
            f13 = backgroundThreadDrawHolder.imageW;
            rectF = backgroundThreadDrawHolder.drawRegion;
            colorFilter = backgroundThreadDrawHolder.colorFilter;
            iArr = backgroundThreadDrawHolder.roundRadius;
        } else {
            f10 = this.imageX;
            f11 = this.imageY;
            f12 = this.imageH;
            f13 = this.imageW;
            rectF = this.drawRegion;
            colorFilter = this.colorFilter;
            iArr = this.roundRadius;
        }
        int[] iArr2 = !this.useRoundRadius ? this.emptyRoundRadius : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
            int[] iArr3 = iArr2;
            boolean z12 = drawable instanceof oi0;
            if (z12) {
                z10 = z12;
                ((oi0) drawable).f31305a = this.skipUpdateFrame;
            } else {
                z10 = z12;
                if (drawable instanceof org.telegram.ui.Components.x5) {
                    ((org.telegram.ui.Components.x5) drawable).f34467a = this.skipUpdateFrame;
                }
            }
            if (bitmapShader != null) {
                paint = this.roundPaint;
            } else {
                paint = bitmapDrawable2.getPaint();
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 29) {
                Object obj = this.blendMode;
                if (obj != null && this.gradientShader == null) {
                    paint.setBlendMode(b.b(obj));
                } else {
                    paint.setBlendMode(null);
                }
            }
            boolean z13 = (paint == null || paint.getColorFilter() == null) ? false : true;
            if (z13 && i13 == 0) {
                if (bitmapShader != null) {
                    this.roundPaint.setColorFilter(null);
                } else if (this.staticThumbDrawable != drawable) {
                    bitmapDrawable2.setColorFilter(null);
                }
            } else if (!z13 && i13 != 0) {
                if (i13 == 1) {
                    if (bitmapShader != null) {
                        this.roundPaint.setColorFilter(selectedColorFilter);
                    } else {
                        bitmapDrawable2.setColorFilter(selectedColorFilter);
                    }
                } else if (bitmapShader != null) {
                    this.roundPaint.setColorFilter(selectedGroupColorFilter);
                } else {
                    bitmapDrawable2.setColorFilter(selectedGroupColorFilter);
                }
            }
            if (colorFilter != null && this.gradientShader == null) {
                if (bitmapShader != null) {
                    this.roundPaint.setColorFilter(colorFilter);
                } else {
                    bitmapDrawable2.setColorFilter(colorFilter);
                }
            }
            boolean z14 = bitmapDrawable2 instanceof org.telegram.ui.Components.x5;
            if (!z14 && !(bitmapDrawable2 instanceof oi0)) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                if (bitmap != null && bitmap.isRecycled()) {
                    return;
                }
                int i15 = i11 % 360;
                if (i15 != 90 && i15 != 270) {
                    intrinsicHeight = bitmap.getWidth();
                    intrinsicWidth = bitmap.getHeight();
                } else {
                    intrinsicHeight = bitmap.getHeight();
                    intrinsicWidth = bitmap.getWidth();
                }
                z11 = bitmapDrawable2 instanceof ReactionLastFrame;
            } else {
                int i16 = i11 % 360;
                if (i16 != 90 && i16 != 270) {
                    intrinsicHeight = bitmapDrawable2.getIntrinsicWidth();
                    intrinsicWidth = bitmapDrawable2.getIntrinsicHeight();
                } else {
                    intrinsicHeight = bitmapDrawable2.getIntrinsicHeight();
                    intrinsicWidth = bitmapDrawable2.getIntrinsicWidth();
                }
                z11 = false;
            }
            float f19 = this.sideClip;
            float f20 = f13 - (f19 * 2.0f);
            float f21 = f12 - (f19 * 2.0f);
            boolean z15 = z11;
            float f22 = f13 == 0.0f ? 1.0f : intrinsicHeight / f20;
            float f23 = f12 == 0.0f ? 1.0f : intrinsicWidth / f21;
            if (z15) {
                f22 /= 1.2f;
                f23 /= 1.2f;
            }
            float f24 = f23;
            float f25 = f22;
            if (bitmapShader != null && backgroundThreadDrawHolder == null) {
                if (this.isAspectFit) {
                    float fMax = Math.max(f25, f24);
                    float f26 = (int) (intrinsicHeight / fMax);
                    float f27 = (int) (intrinsicWidth / fMax);
                    rectF.set(com.google.android.recaptcha.internal.a.A(f13, f26, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f12, f27, 2.0f, f11), i0.a.c(f13, f26, 2.0f, f10), i0.a.c(f12, f27, 2.0f, f11));
                    if (this.isVisible) {
                        this.shaderMatrix.reset();
                        this.shaderMatrix.setTranslate((int) rectF.left, (int) rectF.top);
                        if (i12 != 0) {
                            this.shaderMatrix.preScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        }
                        if (i11 == 90) {
                            this.shaderMatrix.preRotate(90.0f);
                            this.shaderMatrix.preTranslate(0.0f, -rectF.width());
                        } else if (i11 == 180) {
                            this.shaderMatrix.preRotate(180.0f);
                            this.shaderMatrix.preTranslate(-rectF.width(), -rectF.height());
                        } else if (i11 == 270) {
                            this.shaderMatrix.preRotate(270.0f);
                            this.shaderMatrix.preTranslate(-rectF.height(), 0.0f);
                        }
                        float f28 = 1.0f / fMax;
                        this.shaderMatrix.preScale(f28, f28);
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        this.roundPaint.setShader(bitmapShader);
                        this.roundPaint.setAlpha(i10);
                        this.roundRect.set(rectF);
                        if (!this.isRoundRect || !this.useRoundRadius) {
                            for (int i17 = 0; i17 < iArr3.length; i17++) {
                                float[] fArr = radii;
                                int i18 = i17 * 2;
                                int i19 = iArr3[i17];
                                fArr[i18] = i19;
                                fArr[i18 + 1] = i19;
                            }
                            this.roundPath.reset();
                            this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                            this.roundPath.close();
                            if (canvas != null) {
                                canvas.drawPath(this.roundPath, this.roundPaint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i20 = iArr3[0];
                                if (i20 == 0) {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                } else {
                                    canvas.drawRoundRect(this.roundRect, i20, i20, this.roundPaint);
                                }
                            } catch (Exception e9) {
                                onBitmapException(bitmapDrawable2);
                                FileLog.e(e9);
                            }
                        }
                    }
                } else {
                    float f29 = f13;
                    float f30 = f12;
                    if (this.legacyCanvas != null) {
                        bitmapDrawable = bitmapDrawable2;
                        this.roundRect.set(0.0f, 0.0f, this.legacyBitmap.getWidth(), this.legacyBitmap.getHeight());
                        this.legacyCanvas.drawBitmap(this.gradientBitmap, (Rect) null, this.roundRect, (Paint) null);
                        this.legacyCanvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, this.roundRect, this.legacyPaint);
                    } else {
                        bitmapDrawable = bitmapDrawable2;
                    }
                    if (bitmapShader == this.imageShader && this.gradientShader != null) {
                        ComposeShader composeShader = this.composeShader;
                        if (composeShader != null) {
                            this.roundPaint.setShader(composeShader);
                        } else {
                            this.roundPaint.setShader(this.legacyShader);
                        }
                    } else {
                        this.roundPaint.setShader(bitmapShader);
                    }
                    float fMin = 1.0f / Math.min(f25, f24);
                    RectF rectF2 = this.roundRect;
                    float f31 = this.sideClip;
                    rectF2.set(f10 + f31, f11 + f31, (f10 + f29) - f31, (f11 + f30) - f31);
                    if (Math.abs(f25 - f24) > 5.0E-4f) {
                        float f32 = intrinsicHeight / f24;
                        if (f32 > f20) {
                            float f33 = (int) f32;
                            rectF.set(y1.a(f33, f20, 2.0f, f10), f11, i0.a.c(f33, f20, 2.0f, f10), f11 + f21);
                            f18 = f21;
                        } else {
                            float f34 = (int) (intrinsicWidth / f25);
                            f18 = f21;
                            rectF.set(f10, y1.a(f34, f18, 2.0f, f11), f10 + f20, i0.a.c(f34, f18, 2.0f, f11));
                        }
                    } else {
                        f18 = f21;
                        rectF.set(f10, f11, f10 + f20, f11 + f18);
                    }
                    if (this.isVisible) {
                        this.shaderMatrix.reset();
                        if (z15) {
                            this.shaderMatrix.setTranslate((rectF.left + this.sideClip) - (((rectF.width() * 1.2f) - rectF.width()) / 2.0f), (rectF.top + this.sideClip) - (((rectF.height() * 1.2f) - rectF.height()) / 2.0f));
                        } else {
                            Matrix matrix = this.shaderMatrix;
                            float f35 = rectF.left;
                            float f36 = this.sideClip;
                            matrix.setTranslate(f35 + f36, rectF.top + f36);
                        }
                        if (i12 != 0) {
                            this.shaderMatrix.preScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                        }
                        if (i11 == 90) {
                            this.shaderMatrix.preRotate(90.0f);
                            this.shaderMatrix.preTranslate(0.0f, -rectF.width());
                        } else if (i11 == 180) {
                            this.shaderMatrix.preRotate(180.0f);
                            this.shaderMatrix.preTranslate(-rectF.width(), -rectF.height());
                        } else if (i11 == 270) {
                            this.shaderMatrix.preRotate(270.0f);
                            this.shaderMatrix.preTranslate(-rectF.height(), 0.0f);
                        }
                        this.shaderMatrix.preScale(fMin, fMin);
                        if (this.isRoundVideo) {
                            float f37 = ((AndroidUtilities.roundMessageInset * 2) + f20) / f20;
                            this.shaderMatrix.postScale(f37, f37, rectF.centerX(), rectF.centerY());
                        }
                        BitmapShader bitmapShader2 = this.legacyShader;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(this.shaderMatrix);
                        }
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        if (this.composeShader != null) {
                            int width = this.gradientBitmap.getWidth();
                            int height = this.gradientBitmap.getHeight();
                            float f38 = f13 == 0.0f ? 1.0f : width / f20;
                            float f39 = f12 == 0.0f ? 1.0f : height / f18;
                            if (Math.abs(f38 - f39) > 5.0E-4f) {
                                float f40 = width / f39;
                                if (f40 > f20) {
                                    width = (int) f40;
                                    float f41 = width;
                                    rectF.set(y1.a(f41, f20, 2.0f, f10), f11, i0.a.c(f41, f20, 2.0f, f10), f11 + f18);
                                } else {
                                    height = (int) (height / f38);
                                    float f42 = height;
                                    rectF.set(f10, y1.a(f42, f18, 2.0f, f11), f10 + f20, i0.a.c(f42, f18, 2.0f, f11));
                                }
                            } else {
                                rectF.set(f10, f11, f10 + f20, f11 + f18);
                            }
                            float fMin2 = 1.0f / Math.min(f13 == 0.0f ? 1.0f : width / f20, f12 == 0.0f ? 1.0f : height / f18);
                            this.shaderMatrix.reset();
                            Matrix matrix2 = this.shaderMatrix;
                            float f43 = rectF.left;
                            float f44 = this.sideClip;
                            matrix2.setTranslate(f43 + f44, rectF.top + f44);
                            this.shaderMatrix.preScale(fMin2, fMin2);
                            this.gradientShader.setLocalMatrix(this.shaderMatrix);
                        }
                        this.roundPaint.setAlpha(i10);
                        if (!this.isRoundRect || !this.useRoundRadius) {
                            for (int i21 = 0; i21 < iArr3.length; i21++) {
                                float[] fArr2 = radii;
                                int i22 = i21 * 2;
                                int i23 = iArr3[i21];
                                fArr2[i22] = i23;
                                fArr2[i22 + 1] = i23;
                            }
                            this.roundPath.reset();
                            this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                            this.roundPath.close();
                            if (canvas != null) {
                                canvas.drawPath(this.roundPath, this.roundPaint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i24 = iArr3[0];
                                if (i24 != 0) {
                                    canvas.drawRoundRect(this.roundRect, i24, i24, this.roundPaint);
                                } else if (z15) {
                                    RectF rectF3 = AndroidUtilities.rectTmp;
                                    rectF3.set(this.roundRect);
                                    rectF3.inset((-((rectF.width() * 1.2f) - rectF.width())) / 2.0f, (-((rectF.height() * 1.2f) - rectF.height())) / 2.0f);
                                    canvas.drawRect(rectF3, this.roundPaint);
                                } else {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                }
                            } catch (Exception e10) {
                                if (backgroundThreadDrawHolder == null) {
                                    onBitmapException(bitmapDrawable);
                                }
                                FileLog.e(e10);
                            }
                        }
                    }
                }
            } else {
                float f45 = f13;
                float f46 = f12;
                if (this.isAspectFit) {
                    float fMax2 = Math.max(f25, f24);
                    canvas.save();
                    int i25 = (int) (intrinsicHeight / fMax2);
                    int i26 = (int) (intrinsicWidth / fMax2);
                    if (backgroundThreadDrawHolder == null) {
                        float f47 = i25;
                        f17 = f45;
                        float f48 = i26;
                        f16 = f46;
                        rectF.set(com.google.android.recaptcha.internal.a.A(f17, f47, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f16, f48, 2.0f, f11), i0.a.c(f17, f47, 2.0f, f10), i0.a.c(f16, f48, 2.0f, f11));
                        bitmapDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        if (z14) {
                            ((org.telegram.ui.Components.x5) bitmapDrawable2).z(rectF.left, rectF.top, rectF.width(), rectF.height());
                        }
                    } else {
                        f16 = f46;
                        f17 = f45;
                    }
                    if (backgroundThreadDrawHolder == null || iArr3 == null || iArr3[0] <= 0) {
                        backgroundThreadDrawHolder3 = backgroundThreadDrawHolder;
                    } else {
                        canvas.save();
                        if (backgroundThreadDrawHolder.roundPath == null) {
                            backgroundThreadDrawHolder3 = backgroundThreadDrawHolder;
                            path = backgroundThreadDrawHolder3.roundPath = new Path();
                        } else {
                            backgroundThreadDrawHolder3 = backgroundThreadDrawHolder;
                            path = backgroundThreadDrawHolder3.roundPath;
                        }
                        path.rewind();
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(f10, f11, f17 + f10, f16 + f11);
                        path.addRoundRect(rectF4, iArr3[0], iArr3[2], Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                    if (this.isVisible) {
                        try {
                            bitmapDrawable2.setAlpha(i10);
                            drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder3, i10);
                        } catch (Exception e11) {
                            if (backgroundThreadDrawHolder3 == null) {
                                onBitmapException(bitmapDrawable2);
                            }
                            FileLog.e(e11);
                        }
                    }
                    canvas.restore();
                    if (backgroundThreadDrawHolder3 != null && iArr3 != null && iArr3[0] > 0) {
                        canvas.restore();
                    }
                } else if (canvas != null) {
                    if (Math.abs(f25 - f24) > 1.0E-5f) {
                        canvas.save();
                        if (this.clip) {
                            canvas.clipRect(f10, f11, f10 + f45, f11 + f46);
                        }
                        if (i12 == 1) {
                            f15 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f45 / 2.0f, f46 / 2.0f);
                        } else {
                            f15 = 2.0f;
                            if (i12 == 2) {
                                canvas.scale(1.0f, -1.0f, f45 / 2.0f, f46 / 2.0f);
                            }
                        }
                        int i27 = i11 % 360;
                        if (i27 != 0) {
                            if (this.centerRotation) {
                                canvas.rotate(i11, f45 / f15, f46 / f15);
                            } else {
                                canvas.rotate(i11, 0.0f, 0.0f);
                            }
                        }
                        float f49 = intrinsicHeight / f24;
                        if (f49 > f45) {
                            float f50 = (int) f49;
                            rectF.set(y1.a(f50, f45, 2.0f, f10), f11, i0.a.c(f50, f45, 2.0f, f10), f11 + f46);
                        } else {
                            float f51 = (int) (intrinsicWidth / f25);
                            rectF.set(f10, y1.a(f51, f46, 2.0f, f11), f10 + f45, i0.a.c(f51, f46, 2.0f, f11));
                        }
                        if (z14) {
                            ((org.telegram.ui.Components.x5) bitmapDrawable2).z(f10, f11, f45, f46);
                        }
                        if (backgroundThreadDrawHolder == null) {
                            if (i27 != 90 && i27 != 270) {
                                bitmapDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            } else {
                                float fWidth = rectF.width() / 2.0f;
                                float fHeight = rectF.height() / 2.0f;
                                float fCenterX = rectF.centerX();
                                float fCenterY = rectF.centerY();
                                bitmapDrawable2.setBounds((int) (fCenterX - fHeight), (int) (fCenterY - fWidth), (int) (fCenterX + fHeight), (int) (fCenterY + fWidth));
                            }
                        }
                        if (this.isVisible) {
                            if (i14 >= 29) {
                                try {
                                    if (this.blendMode != null) {
                                        bitmapDrawable2.getPaint().setBlendMode(b.b(this.blendMode));
                                    } else {
                                        bitmapDrawable2.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    if (backgroundThreadDrawHolder2 == null) {
                                        onBitmapException(bitmapDrawable2);
                                    }
                                    FileLog.e(e);
                                    canvas.restore();
                                    if (z10) {
                                        ((oi0) drawable).f31305a = false;
                                        return;
                                    } else {
                                        if (drawable instanceof org.telegram.ui.Components.x5) {
                                            ((org.telegram.ui.Components.x5) drawable).f34467a = false;
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                            try {
                                drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder2, i10);
                            } catch (Exception e13) {
                                e = e13;
                                if (backgroundThreadDrawHolder2 == null) {
                                    onBitmapException(bitmapDrawable2);
                                }
                                FileLog.e(e);
                            }
                        }
                        canvas.restore();
                    } else {
                        canvas.save();
                        if (i12 == 1) {
                            f14 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f45 / 2.0f, f46 / 2.0f);
                        } else {
                            f14 = 2.0f;
                            if (i12 == 2) {
                                canvas.scale(1.0f, -1.0f, f45 / 2.0f, f46 / 2.0f);
                            }
                        }
                        int i28 = i11 % 360;
                        if (i28 != 0) {
                            if (this.centerRotation) {
                                canvas.rotate(i11, f45 / f14, f46 / f14);
                            } else {
                                canvas.rotate(i11, 0.0f, 0.0f);
                            }
                        }
                        rectF.set(f10, f11, f10 + f45, f11 + f46);
                        if (this.isRoundVideo) {
                            int i29 = AndroidUtilities.roundMessageInset;
                            rectF.inset(-i29, -i29);
                        }
                        if (z14) {
                            ((org.telegram.ui.Components.x5) bitmapDrawable2).z(f10, f11, f45, f46);
                        }
                        if (backgroundThreadDrawHolder == null) {
                            if (i28 != 90 && i28 != 270) {
                                bitmapDrawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                            } else {
                                float fWidth2 = rectF.width() / 2.0f;
                                float fHeight2 = rectF.height() / 2.0f;
                                float fCenterX2 = rectF.centerX();
                                float fCenterY2 = rectF.centerY();
                                bitmapDrawable2.setBounds((int) (fCenterX2 - fHeight2), (int) (fCenterY2 - fWidth2), (int) (fCenterX2 + fHeight2), (int) (fCenterY2 + fWidth2));
                            }
                        }
                        if (this.isVisible) {
                            if (i14 >= 29) {
                                try {
                                    if (this.blendMode != null) {
                                        bitmapDrawable2.getPaint().setBlendMode(b.b(this.blendMode));
                                    } else {
                                        bitmapDrawable2.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e14) {
                                    onBitmapException(bitmapDrawable2);
                                    FileLog.e(e14);
                                }
                            }
                            drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder, i10);
                        }
                        canvas.restore();
                    }
                }
            }
            if (z10) {
                ((oi0) drawable).f31305a = false;
                return;
            } else {
                if (drawable instanceof org.telegram.ui.Components.x5) {
                    ((org.telegram.ui.Components.x5) drawable).f34467a = false;
                    return;
                }
                return;
            }
        }
        if (backgroundThreadDrawHolder == null) {
            if (this.isAspectFit) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                float f52 = this.sideClip;
                float fMax3 = Math.max(f13 != 0.0f ? intrinsicWidth2 / (f13 - (f52 * 2.0f)) : 1.0f, f12 == 0.0f ? 1.0f : intrinsicHeight2 / (f12 - (f52 * 2.0f)));
                float f53 = (int) (intrinsicWidth2 / fMax3);
                float f54 = (int) (intrinsicHeight2 / fMax3);
                rectF.set(com.google.android.recaptcha.internal.a.A(f13, f53, 2.0f, f10), com.google.android.recaptcha.internal.a.A(f12, f54, 2.0f, f11), i0.a.c(f13, f53, 2.0f, f10), i0.a.c(f12, f54, 2.0f, f11));
            } else {
                rectF.set(f10, f11, f13 + f10, f12 + f11);
            }
            drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        if (!this.isVisible || canvas == null) {
            return;
        }
        try {
            if (drawable instanceof SvgHelper.SvgDrawable) {
                svgDrawable2 = (SvgHelper.SvgDrawable) drawable;
                svgDrawable2.setParent(this);
            } else {
                if (drawable instanceof sp) {
                    Drawable drawable2 = ((sp) drawable).f32514a;
                    if (drawable2 instanceof SvgHelper.SvgDrawable) {
                        svgDrawable2 = (SvgHelper.SvgDrawable) drawable2;
                        svgDrawable2.setParent(this);
                    }
                    if (colorFilter != null && drawable != null) {
                        drawable.setColorFilter(colorFilter);
                    }
                    drawable.setAlpha(i10);
                    if (backgroundThreadDrawHolder == null && svgDrawable != null) {
                        long jCurrentTimeMillis = backgroundThreadDrawHolder.time;
                        if (jCurrentTimeMillis == 0) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        ((SvgHelper.SvgDrawable) drawable).drawInternal(canvas, true, backgroundThreadDrawHolder.threadIndex, jCurrentTimeMillis, backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY, backgroundThreadDrawHolder.imageW, backgroundThreadDrawHolder.imageH);
                    } else {
                        drawable.draw(canvas);
                    }
                    if (svgDrawable != null) {
                        svgDrawable.setParent(null);
                    }
                }
                svgDrawable = null;
                if (colorFilter != null) {
                    drawable.setColorFilter(colorFilter);
                }
                drawable.setAlpha(i10);
                if (backgroundThreadDrawHolder == null) {
                    drawable.draw(canvas);
                } else {
                    drawable.draw(canvas);
                }
                if (svgDrawable != null) {
                    svgDrawable.setParent(null);
                }
            }
            drawable.setAlpha(i10);
            if (backgroundThreadDrawHolder == null) {
                drawable.draw(canvas);
            } else {
                drawable.draw(canvas);
            }
        } catch (Exception e15) {
            FileLog.e(e15);
        }
        svgDrawable = svgDrawable2;
        if (colorFilter != null) {
            drawable.setColorFilter(colorFilter);
        }
        if (svgDrawable != null) {
            svgDrawable.setParent(null);
        }
    }

    public static abstract class Decorator {
        public abstract void onDraw(Canvas canvas, ImageReceiver imageReceiver);

        public void onDetachedFromWidnow() {
        }

        public void onAttachedToWindow(ImageReceiver imageReceiver) {
        }
    }

    public void skipDraw() {
    }
}
