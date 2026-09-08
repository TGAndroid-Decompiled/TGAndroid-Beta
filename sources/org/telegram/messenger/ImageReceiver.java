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
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.xi0;
public class ImageReceiver implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.w5 {
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
            if (this.imageLocation == null && this.thumbLocation == null && this.mediaLocation == null && this.thumb == null) {
                return false;
            }
            return true;
        }

        public boolean isWebfileSet() {
            ImageLocation imageLocation = this.imageLocation;
            if (imageLocation == null || (imageLocation.webFile == null && imageLocation.path == null)) {
                ImageLocation imageLocation2 = this.thumbLocation;
                if (imageLocation2 == null || (imageLocation2.webFile == null && imageLocation2.path == null)) {
                    ImageLocation imageLocation3 = this.mediaLocation;
                    if (imageLocation3 != null) {
                        if (imageLocation3.webFile != null || imageLocation3.path != null) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            }
            return true;
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
        if (!this.manualAlphaAnimator) {
            float f7 = this.currentAlpha;
            if (f7 != 1.0f) {
                if (!z10) {
                    if (backgroundThreadDrawHolder != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j3 = this.lastUpdateAlphaTime;
                        long j10 = currentTimeMillis - j3;
                        if (j3 == 0) {
                            j10 = 16;
                        }
                        if (j10 > 30 && AndroidUtilities.screenRefreshRate > 60.0f) {
                            j10 = 30;
                        }
                        this.currentAlpha = (((float) j10) / this.crossfadeDuration) + this.currentAlpha;
                    } else {
                        this.currentAlpha = (16.0f / this.crossfadeDuration) + f7;
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
    }

    private void drawBitmapDrawable(Canvas canvas, BitmapDrawable bitmapDrawable, BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i10) {
        if (backgroundThreadDrawHolder != null) {
            if (bitmapDrawable instanceof xi0) {
                xi0 xi0Var = (xi0) bitmapDrawable;
                float f7 = backgroundThreadDrawHolder.imageX;
                float f10 = backgroundThreadDrawHolder.imageY;
                float f11 = backgroundThreadDrawHolder.imageW;
                float f12 = backgroundThreadDrawHolder.imageH;
                ColorFilter colorFilter = backgroundThreadDrawHolder.colorFilter;
                int i11 = backgroundThreadDrawHolder.threadIndex;
                Paint[] paintArr = xi0Var.f32592k0;
                RectF[] rectFArr = xi0Var.f32591j0;
                if (rectFArr[i11] == null) {
                    rectFArr[i11] = new RectF();
                    Paint paint = new Paint(1);
                    paintArr[i11] = paint;
                    paint.setFilterBitmap(true);
                }
                paintArr[i11].setAlpha(i10);
                paintArr[i11].setColorFilter(colorFilter);
                rectFArr[i11].set(f7, f10, f7 + f11, f12 + f10);
                xi0Var.o(canvas, null, true, 0L, i11);
                return;
            } else if (bitmapDrawable instanceof org.telegram.ui.Components.d6) {
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) bitmapDrawable;
                float f13 = backgroundThreadDrawHolder.imageX;
                float f14 = backgroundThreadDrawHolder.imageY;
                float f15 = backgroundThreadDrawHolder.imageW;
                float f16 = backgroundThreadDrawHolder.imageH;
                ColorFilter colorFilter2 = backgroundThreadDrawHolder.colorFilter;
                int i12 = backgroundThreadDrawHolder.threadIndex;
                Paint[] paintArr2 = d6Var.f25288q0;
                RectF[] rectFArr2 = d6Var.f25287p0;
                if (rectFArr2[i12] == null) {
                    rectFArr2[i12] = new RectF();
                    Paint paint2 = new Paint();
                    paintArr2[i12] = paint2;
                    paint2.setFilterBitmap(true);
                }
                paintArr2[i12].setAlpha(i10);
                paintArr2[i12].setColorFilter(colorFilter2);
                rectFArr2[i12].set(f13, f14, f15 + f13, f16 + f14);
                d6Var.l(canvas, true, 0L, i12);
                return;
            } else {
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
        }
        bitmapDrawable.setAlpha(i10);
        if (bitmapDrawable instanceof xi0) {
            ((xi0) bitmapDrawable).o(canvas, null, false, this.currentTime, 0);
        } else if (bitmapDrawable instanceof org.telegram.ui.Components.d6) {
            ((org.telegram.ui.Components.d6) bitmapDrawable).l(canvas, false, this.currentTime, 0);
        } else {
            bitmapDrawable.draw(canvas);
        }
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, int i10, BitmapShader bitmapShader, int i11, int i12, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.isPressed == 0) {
            float f7 = this.pressedProgress;
            if (f7 != 0.0f) {
                float f10 = f7 - 0.10666667f;
                this.pressedProgress = f10;
                if (f10 < 0.0f) {
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
        float f11 = this.pressedProgress;
        if (f11 != 0.0f && f11 != 1.0f) {
            drawDrawable(canvas, drawable, i10, bitmapShader, i11, i12, i13, backgroundThreadDrawHolder);
            drawDrawable(canvas, drawable, (int) (i10 * this.pressedProgress), bitmapShader, i11, i12, this.animateFromIsPressed, backgroundThreadDrawHolder);
            return;
        }
        drawDrawable(canvas, drawable, i10, bitmapShader, i11, i12, i13, backgroundThreadDrawHolder);
    }

    public static File getAvatarLocalFile(int i10, TLObject tLObject) {
        String substring;
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
                if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                    if (forUserOrChat.location != null) {
                        key = key + ".jpg";
                    } else {
                        WebFile webFile = forUserOrChat.webFile;
                        if (webFile != null) {
                            String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
                            key = key + "." + ImageLoader.getHttpUrlExtension(forUserOrChat.webFile.url, mimeTypePart);
                        } else if (forUserOrChat.secureDocument != null) {
                            key = key + ".jpg";
                        } else {
                            TLRPC.Document document = forUserOrChat.document;
                            if (document != null) {
                                String documentFileName = FileLoader.getDocumentFileName(document);
                                int lastIndexOf = documentFileName.lastIndexOf(46);
                                String str = "";
                                if (lastIndexOf == -1) {
                                    substring = "";
                                } else {
                                    substring = documentFileName.substring(lastIndexOf);
                                }
                                if (substring.length() <= 1) {
                                    if ("video/mp4".equals(forUserOrChat.document.mime_type)) {
                                        str = ".mp4";
                                    } else if ("video/x-matroska".equals(forUserOrChat.document.mime_type)) {
                                        str = ".mkv";
                                    }
                                } else {
                                    str = substring;
                                }
                                key = key + str;
                            }
                        }
                    }
                }
                key = key + ".jpg";
            }
            File file = new File(FileLoader.getDirectory(4), key);
            if (!file.exists()) {
                return null;
            }
            return file;
        } catch (Exception e7) {
            FileLog.e(e7);
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
        } else if (drawable == this.staticThumbDrawable) {
            this.staticThumbShader = bitmapShader;
        } else if (drawable == this.currentMediaDrawable) {
            this.mediaShader = bitmapShader;
        } else if (drawable == this.currentImageDrawable) {
            this.imageShader = bitmapShader;
            if (this.gradientShader != null && (drawable instanceof BitmapDrawable)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.composeShader = new ComposeShader(this.gradientShader, this.imageShader, PorterDuff.Mode.DST_IN);
                    return;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                int width = bitmapDrawable.getBitmap().getWidth();
                int height = bitmapDrawable.getBitmap().getHeight();
                Bitmap bitmap = this.legacyBitmap;
                if (bitmap == null || bitmap.getWidth() != width || this.legacyBitmap.getHeight() != height) {
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
        }
    }

    private void setStaticDrawable(Drawable drawable) {
        org.telegram.ui.Components.y6 y6Var;
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable != drawable2) {
            if (drawable2 instanceof org.telegram.ui.Components.y6) {
                if (!drawable2.equals(drawable)) {
                    y6Var = (org.telegram.ui.Components.y6) this.staticThumbDrawable;
                } else {
                    return;
                }
            } else {
                y6Var = null;
            }
            this.staticThumbDrawable = drawable;
            if (this.attachedToWindow && (drawable instanceof org.telegram.ui.Components.y6)) {
                ((org.telegram.ui.Components.y6) drawable).c(this);
            }
            if (this.attachedToWindow && y6Var != null) {
                y6Var.b(this);
            }
        }
    }

    private void updateDrawableRadius(Drawable drawable) {
        if (drawable != null) {
            boolean z10 = true;
            int[] roundRadius = getRoundRadius(true);
            if (drawable instanceof dq) {
                dq dqVar = (dq) drawable;
                float f7 = roundRadius[0];
                float f10 = roundRadius[1];
                float f11 = roundRadius[2];
                float f12 = roundRadius[3];
                float[] fArr = dqVar.f25467f;
                float max = Math.max(0.0f, f7);
                fArr[1] = max;
                fArr[0] = max;
                float max2 = Math.max(0.0f, f10);
                fArr[3] = max2;
                fArr[2] = max2;
                float max3 = Math.max(0.0f, f11);
                fArr[5] = max3;
                fArr[4] = max3;
                float max4 = Math.max(0.0f, f12);
                fArr[7] = max4;
                fArr[6] = max4;
                if (f7 <= 0.0f && f10 <= 0.0f && f11 <= 0.0f && f12 <= 0.0f) {
                    z10 = false;
                }
                dqVar.f25466e = z10;
                dqVar.a();
            } else if ((!hasRoundRadius() && this.gradientShader == null) || (!(drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.i9))) {
                setDrawableShader(drawable, null);
            } else if (drawable instanceof org.telegram.ui.Components.i9) {
                ((org.telegram.ui.Components.i9) drawable).f27067r = roundRadius[0];
            } else {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof xi0)) {
                    if (bitmapDrawable instanceof org.telegram.ui.Components.d6) {
                        ((org.telegram.ui.Components.d6) drawable).B(roundRadius);
                    } else if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        setDrawableShader(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    }
                }
            }
        }
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
        if (!(this.currentMediaDrawable instanceof ExtendedBitmapDrawable) && !(this.currentImageDrawable instanceof ExtendedBitmapDrawable) && !(this.currentThumbDrawable instanceof ExtendedBitmapDrawable) && !(this.staticThumbDrawable instanceof ExtendedBitmapDrawable)) {
            return false;
        }
        return true;
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
            if (str4 != null && str4.equals(str)) {
                this.currentThumbKey = (String) objArr[1];
                ImageLocation imageLocation3 = (ImageLocation) objArr[2];
                this.currentThumbLocation = imageLocation3;
                SetImageBackup setImageBackup3 = this.setImageBackup;
                if (setImageBackup3 != null) {
                    setImageBackup3.thumbLocation = imageLocation3;
                }
            }
        } else if (i10 == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.currentLayerNum < num.intValue()) {
                int intValue = num.intValue() | this.currentOpenedLayerFlags;
                this.currentOpenedLayerFlags = intValue;
                if (intValue != 0) {
                    xi0 lottieAnimation = getLottieAnimation();
                    if (lottieAnimation != null && lottieAnimation.x()) {
                        lottieAnimation.stop();
                    }
                    org.telegram.ui.Components.d6 animation = getAnimation();
                    if (animation != null) {
                        animation.stop();
                    }
                }
            }
        } else if (i10 == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.currentLayerNum < num2.intValue() && (i12 = this.currentOpenedLayerFlags) != 0) {
                int i13 = (~num2.intValue()) & i12;
                this.currentOpenedLayerFlags = i13;
                if (i13 == 0) {
                    xi0 lottieAnimation2 = getLottieAnimation();
                    if (lottieAnimation2 != null) {
                        lottieAnimation2.E = this.allowLottieVibration;
                    }
                    if (this.allowStartLottieAnimation && lottieAnimation2 != null && lottieAnimation2.x()) {
                        lottieAnimation2.start();
                    }
                    org.telegram.ui.Components.d6 animation2 = getAnimation();
                    if (this.allowStartAnimation && animation2 != null) {
                        animation2.j();
                        invalidate();
                    }
                }
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

    public org.telegram.ui.Components.q5 getAnimatedEmojiDrawable() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.q5) {
            return (org.telegram.ui.Components.q5) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof org.telegram.ui.Components.q5) {
            return (org.telegram.ui.Components.q5) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.q5) {
            return (org.telegram.ui.Components.q5) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof org.telegram.ui.Components.q5) {
            return (org.telegram.ui.Components.q5) drawable4;
        }
        return null;
    }

    public int getAnimatedOrientation() {
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null) {
            return animation.d[2];
        }
        return 0;
    }

    public org.telegram.ui.Components.d6 getAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.d6) {
            return (org.telegram.ui.Components.d6) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof org.telegram.ui.Components.d6) {
            return (org.telegram.ui.Components.d6) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.d6) {
            return (org.telegram.ui.Components.d6) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof org.telegram.ui.Components.d6) {
            return (org.telegram.ui.Components.d6) drawable4;
        }
        return null;
    }

    public int getAutoRepeat() {
        return this.autoRepeat;
    }

    public Bitmap getBitmap() {
        xi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && lottieAnimation.s()) {
            if (lottieAnimation.R != null) {
                return lottieAnimation.R;
            }
            if (lottieAnimation.S == null) {
                return null;
            }
            return lottieAnimation.S;
        }
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null && animation.s()) {
            return animation.m();
        }
        Drawable drawable = this.currentMediaDrawable;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.d6) && !(drawable instanceof xi0)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.currentImageDrawable;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.d6) && !(drawable instanceof xi0)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof org.telegram.ui.Components.d6) && !(drawable instanceof xi0)) {
            return ((BitmapDrawable) drawable3).getBitmap();
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (!(drawable4 instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable4).getBitmap();
    }

    public int getBitmapHeight() {
        getDrawable();
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null) {
            int i10 = this.imageOrientation;
            if (i10 % 360 != 0 && i10 % 360 != 180) {
                return animation.getIntrinsicWidth();
            }
            return animation.getIntrinsicHeight();
        }
        xi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.f32581c;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            Drawable drawable = this.staticThumbDrawable;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i11 = this.imageOrientation;
        if (i11 % 360 != 0 && i11 % 360 != 180) {
            return bitmap.getWidth();
        }
        return bitmap.getHeight();
    }

    public org.telegram.messenger.ImageReceiver.BitmapHolder getBitmapSafe() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.getBitmapSafe():org.telegram.messenger.ImageReceiver$BitmapHolder");
    }

    public int getBitmapWidth() {
        getDrawable();
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null) {
            int i10 = this.imageOrientation;
            if (i10 % 360 != 0 && i10 % 360 != 180) {
                return animation.getIntrinsicHeight();
            }
            return animation.getIntrinsicWidth();
        }
        xi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.f32579b;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            Drawable drawable = this.staticThumbDrawable;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i11 = this.imageOrientation;
        if (i11 % 360 != 0 && i11 % 360 != 180) {
            return bitmap.getHeight();
        }
        return bitmap.getWidth();
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
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof org.telegram.ui.Components.d6) && !(drawable instanceof xi0)) {
            str = this.currentMediaKey;
        } else {
            Drawable drawable2 = this.currentImageDrawable;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.d6) && !(drawable instanceof xi0)) {
                str2 = this.currentImageKey;
            } else {
                drawable2 = this.currentThumbDrawable;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof org.telegram.ui.Components.d6) && !(drawable instanceof xi0)) {
                    str2 = this.currentThumbKey;
                } else {
                    drawable = this.staticThumbDrawable;
                    if (drawable instanceof BitmapDrawable) {
                        str = null;
                    } else {
                        drawable = null;
                        str = null;
                    }
                }
            }
            Drawable drawable3 = drawable2;
            str = str2;
            drawable = drawable3;
        }
        if (drawable == null) {
            return null;
        }
        return new BitmapHolder(drawable, str, 0);
    }

    public String getExt() {
        return this.currentExt;
    }

    public int getFileLoadingPriority() {
        return this.fileLoadingPriority;
    }

    public float getImageAspectRatio() {
        float width;
        float height;
        if (this.imageOrientation % 180 != 0) {
            width = this.drawRegion.height();
            height = this.drawRegion.width();
        } else {
            width = this.drawRegion.width();
            height = this.drawRegion.height();
        }
        return width / height;
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

    public xi0 getLottieAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof xi0) {
            return (xi0) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof xi0) {
            return (xi0) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof xi0) {
            return (xi0) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof xi0) {
            return (xi0) drawable4;
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
        if (this.isPressed != 0) {
            return true;
        }
        return false;
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
        if (i10 == 3) {
            return this.mediaTag;
        }
        return this.imageTag;
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
        if (bitmap == null) {
            return null;
        }
        return new BitmapHolder(bitmap, str, 0);
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
        if (this.currentImageDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) {
            return false;
        }
        return true;
    }

    public boolean hasImageLoaded() {
        if (this.currentImageDrawable == null && this.currentMediaDrawable == null) {
            return false;
        }
        return true;
    }

    public boolean hasImageSet() {
        if (this.currentImageDrawable == null && this.currentMediaDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentImageKey == null && this.currentMediaKey == null) {
            return false;
        }
        return true;
    }

    public boolean hasMediaSet() {
        if (this.currentMediaDrawable != null) {
            return true;
        }
        return false;
    }

    public boolean hasNotThumb() {
        if (this.currentImageDrawable == null && this.currentMediaDrawable == null && !(this.staticThumbDrawable instanceof q61)) {
            return false;
        }
        return true;
    }

    public boolean hasNotThumbOrOnlyStaticThumb() {
        if (this.currentImageDrawable == null && this.currentMediaDrawable == null) {
            Drawable drawable = this.staticThumbDrawable;
            if (!(drawable instanceof q61)) {
                if (drawable == null || (drawable instanceof org.telegram.ui.Components.i9) || this.currentImageKey != null || this.currentMediaKey != null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean hasStaticThumb() {
        if (this.staticThumbDrawable != null) {
            return true;
        }
        return false;
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
        float f7 = this.imageX;
        float f10 = this.imageY;
        view.invalidate((int) f7, (int) f10, (int) (f7 + this.imageW), (int) (f10 + this.imageH));
    }

    public boolean isAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public boolean isAnimationRunning() {
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null && animation.f25270b0) {
            return true;
        }
        return false;
    }

    public boolean isAspectFit() {
        return this.isAspectFit;
    }

    public boolean isAttachedToWindow() {
        return this.attachedToWindow;
    }

    public boolean isCrossfadingWithOldImage() {
        if (this.crossfadeWithOldImage && this.crossfadeImage != null && !this.crossfadingWithThumb) {
            return true;
        }
        return false;
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

    public boolean isInsideImage(float f7, float f10) {
        float f11 = this.imageX;
        if (f7 >= f11 && f7 <= f11 + this.imageW) {
            float f12 = this.imageY;
            if (f10 >= f12 && f10 <= f12 + this.imageH) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean isLottieRunning() {
        xi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && lottieAnimation.f32593l0) {
            return true;
        }
        return false;
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
        if (drawable instanceof xi0) {
            bitmapDrawable = (BitmapDrawable) drawable;
            str = this.currentMediaKey;
        } else {
            Drawable drawable2 = this.currentImageDrawable;
            if (drawable2 instanceof xi0) {
                bitmapDrawable = (BitmapDrawable) drawable2;
                str = this.currentImageKey;
            } else {
                bitmapDrawable = null;
                str = null;
            }
        }
        if (str != null && bitmapDrawable != null) {
            ImageLoader.getInstance().moveToFront(str);
            if (!ImageLoader.getInstance().isInMemCache(str, true)) {
                ImageLoader.getInstance().getLottieMemCahce().put(str, bitmapDrawable);
            }
        }
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
            xi0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.J.add(this);
                lottieAnimation.E = this.allowLottieVibration;
            }
            if (lottieAnimation != null && this.allowStartLottieAnimation && (!lottieAnimation.x() || this.currentOpenedLayerFlags == 0)) {
                lottieAnimation.start();
            }
            org.telegram.ui.Components.d6 animation = getAnimation();
            if (animation != null) {
                animation.e(this);
            }
            if (animation != null && this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animation.j();
                invalidate();
            }
            org.telegram.ui.Components.q5 animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.b(this);
            }
            if (NotificationCenter.getGlobalInstance().isAnimationInProgress()) {
                didReceivedNotification(NotificationCenter.stopAllHeavyOperations, this.currentAccount, 512);
            }
            Drawable drawable = this.staticThumbDrawable;
            if (drawable instanceof org.telegram.ui.Components.y6) {
                ((org.telegram.ui.Components.y6) drawable).c(this);
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
            Drawable drawable = this.staticThumbDrawable;
            if (drawable instanceof org.telegram.ui.Components.y6) {
                ((org.telegram.ui.Components.y6) drawable).b(this);
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
            org.telegram.ui.Components.q5 animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.p(this);
            }
            org.telegram.ui.Components.d6 animation = getAnimation();
            if (animation != null) {
                animation.v(this);
            }
            xi0 lottieAnimation = getLottieAnimation();
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
        if (drawable instanceof xi0) {
            ((xi0) drawable).D(this);
        }
        if (drawable instanceof org.telegram.ui.Components.d6) {
            ((org.telegram.ui.Components.d6) drawable).v(this);
        }
        if (drawable instanceof org.telegram.ui.Components.q5) {
            ((org.telegram.ui.Components.q5) drawable).p(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof xi0) {
                xi0 xi0Var = (xi0) drawable;
                boolean decrementUseCount = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, true) && decrementUseCount) {
                    xi0Var.A(false);
                }
            } else if (drawable instanceof org.telegram.ui.Components.d6) {
                org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) drawable;
                if (d6Var.f25285n0) {
                    boolean decrementUseCount2 = ImageLoader.getInstance().decrementUseCount(str2);
                    if (!ImageLoader.getInstance().isInMemCache(str2, true)) {
                        if (decrementUseCount2) {
                            d6Var.u();
                        }
                    } else if (decrementUseCount2) {
                        d6Var.stop();
                    }
                } else if (d6Var.f25293t0.isEmpty()) {
                    d6Var.u();
                }
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                boolean decrementUseCount3 = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, false) && decrementUseCount3) {
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

    public void setAlpha(float f7) {
        this.overrideAlpha = f7;
    }

    public void setAspectFit(boolean z10) {
        this.isAspectFit = z10;
    }

    public void setAutoRepeat(int i10) {
        this.autoRepeat = i10;
        xi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.I(i10);
        }
    }

    public void setAutoRepeatCount(int i10) {
        this.autoRepeatCount = i10;
        if (getLottieAnimation() != null) {
            getLottieAnimation().M = i10;
            return;
        }
        this.animatedFileDrawableRepeatMaxCount = i10;
        if (getAnimation() != null) {
            getAnimation().f25301y0 = 0;
        }
    }

    public void setAutoRepeatTimeout(long j3) {
        this.autoRepeatTimeout = j3;
        getLottieAnimation();
    }

    public boolean setBackupImage() {
        SetImageBackup setImageBackup = this.setImageBackup;
        if (setImageBackup != null && setImageBackup.isSet()) {
            SetImageBackup setImageBackup2 = this.setImageBackup;
            this.setImageBackup = null;
            Drawable drawable = setImageBackup2.thumb;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof xi0) && !(bitmapDrawable instanceof org.telegram.ui.Components.d6) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                    setImageBackup2.thumb = null;
                }
            }
            setImage(setImageBackup2.mediaLocation, setImageBackup2.mediaFilter, setImageBackup2.imageLocation, setImageBackup2.imageFilter, setImageBackup2.thumbLocation, setImageBackup2.thumbFilter, setImageBackup2.thumb, setImageBackup2.size, setImageBackup2.ext, setImageBackup2.parentObject, setImageBackup2.cacheType);
            setImageBackup2.clear();
            this.setImageBackup = setImageBackup2;
            xi0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.E = this.allowLottieVibration;
            }
            if (lottieAnimation != null && this.allowStartLottieAnimation) {
                if (!lottieAnimation.x() || this.currentOpenedLayerFlags == 0) {
                    lottieAnimation.start();
                    return true;
                }
                return true;
            }
            return true;
        }
        return false;
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

    public void setCrossfadeByScale(float f7) {
        this.crossfadeByScale = f7;
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

    public void setCurrentAlpha(float f7) {
        this.currentAlpha = f7;
    }

    public void setCurrentTime(long j3) {
        this.currentTime = j3;
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
        if (this.emojiPaused != z10) {
            this.emojiPaused = z10;
            this.allowStartLottieAnimation = !z10;
            xi0 lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                if (z10) {
                    lottieAnimation.stop();
                } else if (!lottieAnimation.f32593l0) {
                    lottieAnimation.start();
                }
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

    public boolean setImageBitmapByKey(android.graphics.drawable.Drawable r8, java.lang.String r9, int r10, boolean r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.setImageBitmapByKey(android.graphics.drawable.Drawable, java.lang.String, int, boolean, int):boolean");
    }

    public void setImageCoords(float f7, float f10, float f11, float f12) {
        this.imageX = f7;
        this.imageY = f10;
        this.imageW = f11;
        this.imageH = f12;
    }

    public void setImageWidth(int i10) {
        this.imageW = i10;
    }

    public void setImageX(float f7) {
        this.imageX = f7;
    }

    public void setImageY(float f7) {
        this.imageY = f7;
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

    public void setMediaStartEndTime(long j3, long j10) {
        this.startTime = j3;
        this.endTime = j10;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof org.telegram.ui.Components.d6) {
            ((org.telegram.ui.Components.d6) drawable).C(j3, j10);
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
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null && this.attachedToWindow) {
            View view2 = this.parentView;
            if (animation.f25290r0 == null) {
                animation.f25290r0 = view2;
            }
        }
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
                this.emptyRoundRadius = r3;
                int[] iArr = {0, 0, 0, 0};
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

    public void setSideClip(float f7) {
        this.sideClip = f7;
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
        if (this.isVisible != z10) {
            this.isVisible = z10;
            if (z11) {
                invalidate();
                Runnable runnable = this.visibleInvalidate;
                if (runnable != null) {
                    runnable.run();
                }
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
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null) {
            animation.stop();
            return;
        }
        xi0 lottieAnimation = getLottieAnimation();
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
        if (drawable2 != null && (bitmapShader = this.staticThumbShader) != null) {
            drawDrawable(null, drawable2, 255, bitmapShader, 0, 0, 0, null);
            return true;
        }
        return false;
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

    public boolean draw(android.graphics.Canvas r32, org.telegram.messenger.ImageReceiver.BackgroundThreadDrawHolder r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.draw(android.graphics.Canvas, org.telegram.messenger.ImageReceiver$BackgroundThreadDrawHolder):boolean");
    }

    public int[] getRoundRadius(boolean z10) {
        return (this.useRoundRadius || !z10) ? this.roundRadius : this.emptyRoundRadius;
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj) {
        setForUserOrChat(tLObject, drawable, obj, false, 0, false);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, long j3, String str2, Object obj, int i10) {
        setImage(imageLocation, str, null, null, drawable, j3, str2, obj, i10);
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
        if (drawable2 instanceof ik0) {
            xc0 xc0Var = (xc0) ((ik0) drawable2);
            DownloadController.getInstance(xc0Var.f32540r.currentAccount).removeLoadingFileObserver(xc0Var);
            xc0Var.f32539n = null;
            xc0Var.f32540r = null;
        }
        if (drawable instanceof org.telegram.ui.Components.q5) {
            org.telegram.ui.Components.q5 q5Var = (org.telegram.ui.Components.q5) drawable;
            if (this.attachedToWindow) {
                q5Var.b(this);
            }
        } else if (drawable instanceof org.telegram.ui.Components.d6) {
            org.telegram.ui.Components.d6 d6Var = (org.telegram.ui.Components.d6) drawable;
            View view = this.parentView;
            if (d6Var.f25290r0 == null) {
                d6Var.f25290r0 = view;
            }
            if (this.attachedToWindow) {
                d6Var.e(this);
            }
            boolean z11 = this.useSharedAnimationQueue || d6Var.f25285n0;
            if (!d6Var.f25285n0) {
                d6Var.f25295v0 = z11;
            }
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                d6Var.j();
            }
            boolean z12 = this.allowDecodeSingleFrame;
            d6Var.f25300y = z12;
            if (z12) {
                d6Var.x(false);
            }
        } else if (drawable instanceof xi0) {
            xi0 xi0Var = (xi0) drawable;
            if (this.attachedToWindow) {
                xi0Var.J.add(this);
            }
            xi0Var.E = this.allowLottieVibration;
            if (this.allowStartLottieAnimation && (!xi0Var.x() || this.currentOpenedLayerFlags == 0)) {
                xi0Var.start();
            }
            xi0Var.H(true);
        }
        this.staticThumbShader = null;
        this.thumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(drawable);
        updateDrawableRadius(drawable);
        this.currentMediaLocation = null;
        this.currentMediaFilter = null;
        Drawable drawable3 = this.currentMediaDrawable;
        if (drawable3 instanceof org.telegram.ui.Components.d6) {
            ((org.telegram.ui.Components.d6) drawable3).v(this);
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
        org.telegram.ui.Components.d6 animation = getAnimation();
        if (animation != null) {
            boolean z11 = this.useSharedAnimationQueue;
            if (!animation.f25285n0) {
                animation.f25295v0 = z11;
            }
            animation.start();
            return;
        }
        xi0 lottieAnimation = getLottieAnimation();
        if (lottieAnimation == null || lottieAnimation.f32593l0) {
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

    public void setForUserOrChat(org.telegram.tgnet.TLObject r18, android.graphics.drawable.Drawable r19, java.lang.Object r20, boolean r21, int r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.setForUserOrChat(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object, boolean, int, boolean):void");
    }

    public void setImage(String str, String str2, Drawable drawable, String str3, long j3) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, j3, str3, null, 1);
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
        private org.telegram.ui.Components.d6 animation;
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
        private xi0 lottieDrawable;
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
                float f7 = this.imageX;
                rectF.left = f7;
                float f10 = this.imageY;
                rectF.top = f10;
                rectF.right = f7 + this.imageW;
                rectF.bottom = f10 + this.imageH;
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
            if (bitmap != null && !bitmap.isRecycled()) {
                return false;
            }
            return true;
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
            boolean decrementUseCount = ImageLoader.getInstance().decrementUseCount(this.key);
            if (!ImageLoader.getInstance().isInMemCache(this.key, false) && decrementUseCount) {
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                } else {
                    Drawable drawable = this.drawable;
                    if (drawable != null) {
                        if (drawable instanceof xi0) {
                            ((xi0) drawable).A(false);
                        } else if (drawable instanceof org.telegram.ui.Components.d6) {
                            ((org.telegram.ui.Components.d6) drawable).u();
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

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j3, String str3, Object obj, int i10) {
        setImage(imageLocation, str, imageLocation2, str2, null, j3, str3, obj, i10);
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

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, long j3, String str3, Object obj, int i10) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, j3, str3, obj, i10);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, Drawable drawable, long j3, String str4, Object obj, int i10) {
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
            setImageBackup2.size = j3;
            setImageBackup2.ext = str4;
            setImageBackup2.cacheType = i10;
            setImageBackup2.parentObject = obj;
        } else if (!this.ignoreImageSet) {
            if (this.crossfadeWithOldImage && (setImageBackup = this.setImageBackup) != null && setImageBackup.isWebfileSet()) {
                setBackupImage();
            }
            SetImageBackup setImageBackup3 = this.setImageBackup;
            if (setImageBackup3 != null) {
                setImageBackup3.clear();
            }
            boolean z10 = true;
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
                    imageReceiverDelegate.didSetImage(this, (drawable2 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, (drawable2 == null && this.currentMediaDrawable == null) ? false : false, false);
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
                if (document != null && document.dc_id != 0 && document.f19902id != 0) {
                    key = "q_" + document.dc_id + "_" + document.f19902id;
                    this.currentKeyQuality = true;
                }
            }
            String str7 = key;
            if (str7 != null && str2 != null) {
                str7 = a4.a.C(str7, "@", str2);
            }
            if (this.uniqKeyPrefix != null) {
                str7 = a4.a.s(new StringBuilder(), this.uniqKeyPrefix, str7);
            }
            String key2 = imageLocation4 != null ? imageLocation4.getKey(obj, null, false) : null;
            if (key2 == null && imageLocation4 != null) {
                imageLocation4 = null;
            }
            if (key2 != null && str != null) {
                key2 = a4.a.C(key2, "@", str);
            }
            if (this.uniqKeyPrefix != null) {
                key2 = a4.a.s(new StringBuilder(), this.uniqKeyPrefix, key2);
            }
            if ((key2 == null && (str6 = this.currentImageKey) != null && str6.equals(str7)) || ((str5 = this.currentMediaKey) != null && str5.equals(key2))) {
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
                key3 = a4.a.C(key3, "@", str3);
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
                    if (drawable4 instanceof org.telegram.ui.Components.d6) {
                        ((org.telegram.ui.Components.d6) drawable4).stop();
                        ((org.telegram.ui.Components.d6) this.currentMediaDrawable).v(this);
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
                    recycleBitmap(str7, 0);
                    recycleBitmap(null, 2);
                    recycleBitmap(key2, 3);
                    this.crossfadeShader = this.thumbShader;
                    this.crossfadeImage = this.currentThumbDrawable;
                    this.crossfadeKey = this.currentThumbKey;
                    this.crossfadingWithThumb = false;
                    this.currentThumbDrawable = null;
                    this.currentThumbKey = null;
                } else if (this.staticThumbDrawable != null) {
                    recycleBitmap(str7, 0);
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
                    recycleBitmap(str7, 0);
                    recycleBitmap(key3, 1);
                    recycleBitmap(null, 2);
                    recycleBitmap(key2, 3);
                    this.crossfadeShader = null;
                }
            } else {
                recycleBitmap(str7, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = null;
            }
            this.currentImageLocation = imageLocation5;
            this.currentImageFilter = str2;
            this.currentImageKey = str7;
            this.currentMediaLocation = imageLocation4;
            this.currentMediaFilter = str;
            this.currentMediaKey = key2;
            this.currentThumbLocation = imageLocation3;
            this.currentThumbFilter = str3;
            this.currentThumbKey = key3;
            this.currentParentObject = obj;
            this.currentExt = str4;
            this.currentSize = j3;
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
    }

    public void setImageCoords(RectF rectF) {
        if (rectF != null) {
            this.imageX = rectF.left;
            this.imageY = rectF.top;
            this.imageW = rectF.width();
            this.imageH = rectF.height();
        }
    }

    public void drawDrawable(android.graphics.Canvas r39, android.graphics.drawable.Drawable r40, int r41, android.graphics.BitmapShader r42, int r43, int r44, int r45, org.telegram.messenger.ImageReceiver.BackgroundThreadDrawHolder r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.drawDrawable(android.graphics.Canvas, android.graphics.drawable.Drawable, int, android.graphics.BitmapShader, int, int, int, org.telegram.messenger.ImageReceiver$BackgroundThreadDrawHolder):void");
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
