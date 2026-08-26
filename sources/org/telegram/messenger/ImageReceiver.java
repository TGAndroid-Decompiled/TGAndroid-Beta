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
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzit;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticApiModelOutline3;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AttachableDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LoadingStickerDrawable;
import org.telegram.ui.Components.OtherDocumentPlaceholderDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclableDrawable;
import org.telegram.ui.Components.VectorAvatarThumbDrawable;

public class ImageReceiver implements NotificationCenter.NotificationCenterDelegate, AnimatedEmojiSpan.InvalidateHolder {
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

    public static abstract class Decorator {
        public void onAttachedToWindow(ImageReceiver imageReceiver) {
        }

        public void onDetachedFromWidnow() {
        }

        public abstract void onDraw(Canvas canvas, ImageReceiver imageReceiver);
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

    private void checkAlphaAnimation(boolean z, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.manualAlphaAnimator) {
            return;
        }
        float f = this.currentAlpha;
        if (f != 1.0f) {
            if (!z) {
                if (backgroundThreadDrawHolder != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.lastUpdateAlphaTime;
                    long j2 = jCurrentTimeMillis - j;
                    if (j == 0) {
                        j2 = 16;
                    }
                    if (j2 > 30 && AndroidUtilities.screenRefreshRate > 60.0f) {
                        j2 = 30;
                    }
                    this.currentAlpha = (j2 / this.crossfadeDuration) + this.currentAlpha;
                } else {
                    this.currentAlpha = (16.0f / this.crossfadeDuration) + f;
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
                AndroidUtilities.runOnUIThread(new ANRDetector$$ExternalSyntheticLambda0(this, 23));
            } else {
                invalidate();
            }
        }
    }

    private void drawBitmapDrawable(Canvas canvas, BitmapDrawable bitmapDrawable, BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i) {
        if (backgroundThreadDrawHolder == null) {
            bitmapDrawable.setAlpha(i);
            if (bitmapDrawable instanceof RLottieDrawable) {
                ((RLottieDrawable) bitmapDrawable).drawInternal(canvas, null, false, this.currentTime, 0);
                return;
            } else if (bitmapDrawable instanceof AnimatedFileDrawable) {
                ((AnimatedFileDrawable) bitmapDrawable).drawInternal(canvas, false, this.currentTime, 0);
                return;
            } else {
                bitmapDrawable.draw(canvas);
                return;
            }
        }
        if (bitmapDrawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) bitmapDrawable;
            float f = backgroundThreadDrawHolder.imageX;
            float f2 = backgroundThreadDrawHolder.imageY;
            float f3 = backgroundThreadDrawHolder.imageW;
            float f4 = backgroundThreadDrawHolder.imageH;
            ColorFilter colorFilter = backgroundThreadDrawHolder.colorFilter;
            int i2 = backgroundThreadDrawHolder.threadIndex;
            RectF[] rectFArr = rLottieDrawable.dstRectBackground;
            RectF rectF = rectFArr[i2];
            Paint[] paintArr = rLottieDrawable.backgroundPaint;
            if (rectF == null) {
                rectFArr[i2] = new RectF();
                paintArr[i2] = new Paint(1);
                paintArr[i2].setFilterBitmap(true);
            }
            paintArr[i2].setAlpha(i);
            paintArr[i2].setColorFilter(colorFilter);
            rLottieDrawable.dstRectBackground[i2].set(f, f2, f + f3, f4 + f2);
            rLottieDrawable.drawInternal(canvas, null, true, 0L, i2);
            return;
        }
        if (!(bitmapDrawable instanceof AnimatedFileDrawable)) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (bitmap != null) {
                if (backgroundThreadDrawHolder.paint == null) {
                    backgroundThreadDrawHolder.paint = new Paint(1);
                }
                backgroundThreadDrawHolder.paint.setAlpha(i);
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
        AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) bitmapDrawable;
        float f5 = backgroundThreadDrawHolder.imageX;
        float f6 = backgroundThreadDrawHolder.imageY;
        float f7 = backgroundThreadDrawHolder.imageW;
        float f8 = backgroundThreadDrawHolder.imageH;
        ColorFilter colorFilter2 = backgroundThreadDrawHolder.colorFilter;
        int i3 = backgroundThreadDrawHolder.threadIndex;
        RectF[] rectFArr2 = animatedFileDrawable.dstRectBackground;
        RectF rectF2 = rectFArr2[i3];
        Paint[] paintArr2 = animatedFileDrawable.backgroundPaint;
        if (rectF2 == null) {
            rectFArr2[i3] = new RectF();
            paintArr2[i3] = new Paint();
            paintArr2[i3].setFilterBitmap(true);
        }
        paintArr2[i3].setAlpha(i);
        paintArr2[i3].setColorFilter(colorFilter2);
        animatedFileDrawable.dstRectBackground[i3].set(f5, f6, f7 + f5, f8 + f6);
        animatedFileDrawable.drawInternal(canvas, true, 0L, i3);
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        if (this.isPressed == 0) {
            float f = this.pressedProgress;
            if (f != 0.0f) {
                float f2 = f - 0.10666667f;
                this.pressedProgress = f2;
                if (f2 < 0.0f) {
                    this.pressedProgress = 0.0f;
                }
                invalidate();
            }
        }
        int i4 = this.isPressed;
        if (i4 != 0) {
            this.pressedProgress = 1.0f;
            this.animateFromIsPressed = i4;
        }
        float f3 = this.pressedProgress;
        if (f3 == 0.0f || f3 == 1.0f) {
            drawDrawable(canvas, drawable, i, bitmapShader, i2, i3, i4, backgroundThreadDrawHolder);
        } else {
            drawDrawable(canvas, drawable, i, bitmapShader, i2, i3, i4, backgroundThreadDrawHolder);
            drawDrawable(canvas, drawable, (int) (i * this.pressedProgress), bitmapShader, i2, i3, this.animateFromIsPressed, backgroundThreadDrawHolder);
        }
    }

    public static File getAvatarLocalFile(int i, TLObject tLObject) {
        try {
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i, tLObject, 1);
            File localFile = FileLoader.getInstance(i).getLocalFile(forUserOrChat);
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
                            if (strSubstring.length() <= 1) {
                                if ("video/mp4".equals(forUserOrChat.document.mime_type)) {
                                    str = ".mp4";
                                } else if ("video/x-matroska".equals(forUserOrChat.document.mime_type)) {
                                    str = ".mkv";
                                }
                                strSubstring = str;
                            }
                            key = key + strSubstring;
                        }
                    }
                }
            }
            File file = new File(FileLoader.getDirectory(4), key);
            if (file.exists()) {
                return file;
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
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
        AttachableDrawable attachableDrawable;
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable == drawable2) {
            return;
        }
        if (!(drawable2 instanceof AttachableDrawable)) {
            attachableDrawable = null;
        } else if (drawable2.equals(drawable)) {
            return;
        } else {
            attachableDrawable = (AttachableDrawable) this.staticThumbDrawable;
        }
        this.staticThumbDrawable = drawable;
        if (this.attachedToWindow && (drawable instanceof AttachableDrawable)) {
            ((AttachableDrawable) drawable).onAttachedToWindow(this);
        }
        if (!this.attachedToWindow || attachableDrawable == null) {
            return;
        }
        attachableDrawable.onDetachedFromWindow(this);
    }

    private void updateDrawableRadius(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        boolean z = true;
        int[] roundRadius = getRoundRadius(true);
        if (!(drawable instanceof ClipRoundedDrawable)) {
            if ((!hasRoundRadius() && this.gradientShader == null) || (!(drawable instanceof BitmapDrawable) && !(drawable instanceof AvatarDrawable))) {
                setDrawableShader(drawable, null);
                return;
            }
            if (drawable instanceof AvatarDrawable) {
                ((AvatarDrawable) drawable).roundRadius = roundRadius[0];
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable instanceof RLottieDrawable) {
                return;
            }
            if (bitmapDrawable instanceof AnimatedFileDrawable) {
                ((AnimatedFileDrawable) drawable).setRoundRadius(roundRadius);
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
        ClipRoundedDrawable clipRoundedDrawable = (ClipRoundedDrawable) drawable;
        float f = roundRadius[0];
        float f2 = roundRadius[1];
        float f3 = roundRadius[2];
        float f4 = roundRadius[3];
        float fMax = Math.max(0.0f, f);
        float[] fArr = clipRoundedDrawable.radii;
        fArr[1] = fMax;
        fArr[0] = fMax;
        float fMax2 = Math.max(0.0f, f2);
        fArr[3] = fMax2;
        fArr[2] = fMax2;
        float fMax3 = Math.max(0.0f, f3);
        fArr[5] = fMax3;
        fArr[4] = fMax3;
        float fMax4 = Math.max(0.0f, f4);
        fArr[7] = fMax4;
        fArr[6] = fMax4;
        if (f <= 0.0f && f2 <= 0.0f && f3 <= 0.0f && f4 <= 0.0f) {
            z = false;
        }
        clipRoundedDrawable.hasRadius = z;
        clipRoundedDrawable.updatePath();
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
                for (int i = 0; i < this.decorators.size(); i++) {
                    this.decorators.get(i).onDetachedFromWidnow();
                }
            }
            this.decorators.clear();
        }
    }

    public void clearImage() {
        for (int i = 0; i < 4; i++) {
            recycleBitmap(null, i);
        }
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == NotificationCenter.didReplacedPhotoInMemCache) {
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
        if (i == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.currentLayerNum >= num.intValue()) {
                return;
            }
            int iIntValue = num.intValue() | this.currentOpenedLayerFlags;
            this.currentOpenedLayerFlags = iIntValue;
            if (iIntValue != 0) {
                RLottieDrawable lottieAnimation = getLottieAnimation();
                if (lottieAnimation != null && lottieAnimation.isHeavyDrawable()) {
                    lottieAnimation.isRunning = false;
                    lottieAnimation.checkChoreographer$1();
                }
                AnimatedFileDrawable animation = getAnimation();
                if (animation != null) {
                    animation.isRunning = false;
                    animation.checkChoreographer();
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.currentLayerNum >= num2.intValue() || (i3 = this.currentOpenedLayerFlags) == 0) {
                return;
            }
            int i4 = (~num2.intValue()) & i3;
            this.currentOpenedLayerFlags = i4;
            if (i4 == 0) {
                RLottieDrawable lottieAnimation2 = getLottieAnimation();
                if (lottieAnimation2 != null) {
                    lottieAnimation2.allowVibration = this.allowLottieVibration;
                }
                if (this.allowStartLottieAnimation && lottieAnimation2 != null && lottieAnimation2.isHeavyDrawable()) {
                    lottieAnimation2.start();
                }
                AnimatedFileDrawable animation2 = getAnimation();
                if (!this.allowStartAnimation || animation2 == null) {
                    return;
                }
                animation2.checkRepeat();
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

    public AnimatedEmojiDrawable getAnimatedEmojiDrawable() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof AnimatedEmojiDrawable) {
            return (AnimatedEmojiDrawable) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof AnimatedEmojiDrawable) {
            return (AnimatedEmojiDrawable) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof AnimatedEmojiDrawable) {
            return (AnimatedEmojiDrawable) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof AnimatedEmojiDrawable) {
            return (AnimatedEmojiDrawable) drawable4;
        }
        return null;
    }

    public int getAnimatedOrientation() {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            return animation.metaData[2];
        }
        return 0;
    }

    public AnimatedFileDrawable getAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof AnimatedFileDrawable) {
            return (AnimatedFileDrawable) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof AnimatedFileDrawable) {
            return (AnimatedFileDrawable) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof AnimatedFileDrawable) {
            return (AnimatedFileDrawable) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof AnimatedFileDrawable) {
            return (AnimatedFileDrawable) drawable4;
        }
        return null;
    }

    public int getAutoRepeat() {
        return this.autoRepeat;
    }

    public Bitmap getBitmap() {
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && lottieAnimation.hasBitmap()) {
            if (lottieAnimation.renderingBitmap != null) {
                return lottieAnimation.renderingBitmap;
            }
            if (lottieAnimation.nextRenderingBitmap != null) {
                return lottieAnimation.nextRenderingBitmap;
            }
            return null;
        }
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null && animation.hasBitmap()) {
            return animation.getAnimatedBitmap();
        }
        Drawable drawable = this.currentMediaDrawable;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.currentImageDrawable;
        if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
            return ((BitmapDrawable) drawable2).getBitmap();
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
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
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            int i = this.imageOrientation % 360;
            return (i == 0 || i == 180) ? animation.getIntrinsicHeight() : animation.getIntrinsicWidth();
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.height;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int i2 = this.imageOrientation % 360;
            return (i2 == 0 || i2 == 180) ? bitmap.getHeight() : bitmap.getWidth();
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
        AnimatedFileDrawable animation = getAnimation();
        RLottieDrawable lottieAnimation = getLottieAnimation();
        int i = 0;
        if (lottieAnimation == null || !lottieAnimation.hasBitmap()) {
            if (animation == null || !animation.hasBitmap()) {
                Drawable drawable = this.currentMediaDrawable;
                if (!(drawable instanceof BitmapDrawable) || (drawable instanceof AnimatedFileDrawable) || (drawable instanceof RLottieDrawable)) {
                    Drawable drawable2 = this.currentImageDrawable;
                    if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof AnimatedFileDrawable) || (drawable instanceof RLottieDrawable)) {
                        Drawable drawable3 = this.currentThumbDrawable;
                        if (!(drawable3 instanceof BitmapDrawable) || (drawable3 instanceof AnimatedFileDrawable) || (drawable instanceof RLottieDrawable)) {
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
            } else {
                Bitmap animatedBitmap = animation.getAnimatedBitmap();
                i = animation.metaData[2];
                if (i != 0) {
                    return new BitmapHolder(Bitmap.createBitmap(animatedBitmap), (String) null, i);
                }
                bitmap = animatedBitmap;
            }
            str = null;
        } else {
            if (lottieAnimation.renderingBitmap != null) {
                bitmap = lottieAnimation.renderingBitmap;
            } else if (lottieAnimation.nextRenderingBitmap != null) {
                bitmap = lottieAnimation.nextRenderingBitmap;
            } else {
                bitmap = null;
                str = null;
            }
            str = null;
        }
        if (bitmap != null) {
            return new BitmapHolder(bitmap, str, i);
        }
        return null;
    }

    public int getBitmapWidth() {
        getDrawable();
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            int i = this.imageOrientation % 360;
            return (i == 0 || i == 180) ? animation.getIntrinsicWidth() : animation.getIntrinsicHeight();
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.width;
        }
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            int i2 = this.imageOrientation % 360;
            return (i2 == 0 || i2 == 180) ? bitmap.getWidth() : bitmap.getHeight();
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
        if (!(drawable instanceof BitmapDrawable) || (drawable instanceof AnimatedFileDrawable) || (drawable instanceof RLottieDrawable)) {
            Drawable drawable2 = this.currentImageDrawable;
            if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof AnimatedFileDrawable) || (drawable instanceof RLottieDrawable)) {
                drawable2 = this.currentThumbDrawable;
                if (!(drawable2 instanceof BitmapDrawable) || (drawable2 instanceof AnimatedFileDrawable) || (drawable instanceof RLottieDrawable)) {
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

    public RLottieDrawable getLottieAnimation() {
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof RLottieDrawable) {
            return (RLottieDrawable) drawable;
        }
        Drawable drawable2 = this.currentImageDrawable;
        if (drawable2 instanceof RLottieDrawable) {
            return (RLottieDrawable) drawable2;
        }
        Drawable drawable3 = this.currentThumbDrawable;
        if (drawable3 instanceof RLottieDrawable) {
            return (RLottieDrawable) drawable3;
        }
        Drawable drawable4 = this.staticThumbDrawable;
        if (drawable4 instanceof RLottieDrawable) {
            return (RLottieDrawable) drawable4;
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
        int i = this.currentGuid + 1;
        this.currentGuid = i;
        return i;
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

    public int getTag(int i) {
        if (i == 1) {
            return this.thumbTag;
        }
        return i == 3 ? this.mediaTag : this.imageTag;
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
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && !(this.staticThumbDrawable instanceof VectorAvatarThumbDrawable)) ? false : true;
    }

    public boolean hasNotThumbOrOnlyStaticThumb() {
        if (this.currentImageDrawable != null || this.currentMediaDrawable != null) {
            return true;
        }
        Drawable drawable = this.staticThumbDrawable;
        if (drawable instanceof VectorAvatarThumbDrawable) {
            return true;
        }
        return drawable != null && !(drawable instanceof AvatarDrawable) && this.currentImageKey == null && this.currentMediaKey == null;
    }

    public boolean hasStaticThumb() {
        return this.staticThumbDrawable != null;
    }

    @Override
    public void invalidate() {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        if (this.invalidateAll) {
            view.invalidate();
            return;
        }
        float f = this.imageX;
        float f2 = this.imageY;
        view.invalidate((int) f, (int) f2, (int) (f + this.imageW), (int) (f2 + this.imageH));
    }

    public boolean isAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public boolean isAnimationRunning() {
        AnimatedFileDrawable animation = getAnimation();
        return animation != null && animation.isRunning;
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

    public boolean isInsideImage(float f, float f2) {
        float f3 = this.imageX;
        if (f < f3 || f > f3 + this.imageW) {
            return false;
        }
        float f4 = this.imageY;
        return f2 >= f4 && f2 <= f4 + this.imageH;
    }

    public boolean isLottieRunning() {
        RLottieDrawable lottieAnimation = getLottieAnimation();
        return lottieAnimation != null && lottieAnimation.isRunning;
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
        if (drawable instanceof RLottieDrawable) {
            bitmapDrawable = (BitmapDrawable) drawable;
            str = this.currentMediaKey;
        } else {
            Drawable drawable2 = this.currentImageDrawable;
            if (drawable2 instanceof RLottieDrawable) {
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
            RLottieDrawable lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.parentViews.add(this);
                lottieAnimation.allowVibration = this.allowLottieVibration;
            }
            if (lottieAnimation != null && this.allowStartLottieAnimation && (!lottieAnimation.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
                lottieAnimation.start();
            }
            AnimatedFileDrawable animation = getAnimation();
            if (animation != null) {
                animation.addParent(this);
            }
            if (animation != null && this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animation.checkRepeat();
                invalidate();
            }
            AnimatedEmojiDrawable animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
            if (NotificationCenter.getGlobalInstance().isAnimationInProgress()) {
                didReceivedNotification(NotificationCenter.stopAllHeavyOperations, this.currentAccount, 512);
            }
            Object obj = this.staticThumbDrawable;
            if (obj instanceof AttachableDrawable) {
                ((AttachableDrawable) obj).onAttachedToWindow(this);
            }
            if (this.decorators != null) {
                for (int i = 0; i < this.decorators.size(); i++) {
                    this.decorators.get(i).onAttachedToWindow(this);
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
            if (obj instanceof AttachableDrawable) {
                ((AttachableDrawable) obj).onDetachedFromWindow(this);
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
            AnimatedEmojiDrawable animatedEmojiDrawable = getAnimatedEmojiDrawable();
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
            AnimatedFileDrawable animation = getAnimation();
            if (animation != null) {
                ArrayList arrayList = animation.parents;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    animation.repeatCount = 0;
                }
                animation.checkCacheCancel();
            }
            RLottieDrawable lottieAnimation = getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.removeParentView(this);
            }
            if (this.decorators != null) {
                for (int i = 0; i < this.decorators.size(); i++) {
                    this.decorators.get(i).onDetachedFromWidnow();
                }
            }
        }
    }

    public void recycleBitmap(String str, int i) {
        String str2;
        Drawable drawable;
        String replacedKey;
        if (i == 3) {
            str2 = this.currentMediaKey;
            drawable = this.currentMediaDrawable;
        } else if (i == 2) {
            str2 = this.crossfadeKey;
            drawable = this.crossfadeImage;
        } else if (i == 1) {
            str2 = this.currentThumbKey;
            drawable = this.currentThumbDrawable;
        } else {
            str2 = this.currentImageKey;
            drawable = this.currentImageDrawable;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (replacedKey = ImageLoader.getInstance().getReplacedKey(str2)) != null)) {
            str2 = replacedKey;
        }
        if (drawable instanceof RLottieDrawable) {
            ((RLottieDrawable) drawable).removeParentView(this);
        }
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            animatedFileDrawable.parents.remove(this);
            if (animatedFileDrawable.parents.isEmpty()) {
                animatedFileDrawable.repeatCount = 0;
            }
            animatedFileDrawable.checkCacheCancel();
        }
        if (drawable instanceof AnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable) drawable).removeView(this);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && drawable != null)) {
            if (drawable instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                boolean zDecrementUseCount = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, true) && zDecrementUseCount) {
                    rLottieDrawable.recycle(false);
                }
            } else if (drawable instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable2 = (AnimatedFileDrawable) drawable;
                if (animatedFileDrawable2.isWebmSticker) {
                    boolean zDecrementUseCount2 = ImageLoader.getInstance().decrementUseCount(str2);
                    if (ImageLoader.getInstance().isInMemCache(str2, true)) {
                        if (zDecrementUseCount2) {
                            animatedFileDrawable2.isRunning = false;
                            animatedFileDrawable2.checkChoreographer();
                        }
                    } else if (zDecrementUseCount2) {
                        animatedFileDrawable2.recycle();
                    }
                } else if (animatedFileDrawable2.parents.isEmpty()) {
                    animatedFileDrawable2.recycle();
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
        if (i == 3) {
            this.currentMediaKey = null;
            this.currentMediaDrawable = null;
            this.mediaShader = null;
        } else if (i == 2) {
            this.crossfadeKey = null;
            this.crossfadeImage = null;
            this.crossfadeShader = null;
        } else if (i == 1) {
            this.currentThumbDrawable = null;
            this.currentThumbKey = null;
            this.thumbShader = null;
        } else {
            this.currentImageDrawable = null;
            this.currentImageKey = null;
            this.imageShader = null;
        }
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.allowDecodeSingleFrame = z;
    }

    public void setAllowDrawWhileCacheGenerating(boolean z) {
        this.allowDrawWhileCacheGenerating = z;
    }

    public void setAllowLoadingOnAttachedOnly(boolean z) {
        this.allowLoadingOnAttachedOnly = z;
    }

    public void setAllowLottieVibration(boolean z) {
        this.allowLottieVibration = z;
    }

    public void setAllowStartAnimation(boolean z) {
        this.allowStartAnimation = z;
    }

    public void setAllowStartLottieAnimation(boolean z) {
        this.allowStartLottieAnimation = z;
    }

    public void setAlpha(float f) {
        this.overrideAlpha = f;
    }

    public void setAspectFit(boolean z) {
        this.isAspectFit = z;
    }

    public void setAutoRepeat(int i) {
        this.autoRepeat = i;
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.setAutoRepeat(i);
        }
    }

    public void setAutoRepeatCount(int i) {
        this.autoRepeatCount = i;
        if (getLottieAnimation() != null) {
            getLottieAnimation().autoRepeatCount = i;
            return;
        }
        this.animatedFileDrawableRepeatMaxCount = i;
        if (getAnimation() != null) {
            getAnimation().repeatCount = 0;
        }
    }

    public void setAutoRepeatTimeout(long j) {
        this.autoRepeatTimeout = j;
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
            if (!(bitmapDrawable instanceof RLottieDrawable) && !(bitmapDrawable instanceof AnimatedFileDrawable) && bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap().isRecycled()) {
                setImageBackup2.thumb = null;
            }
        }
        setImage(setImageBackup2.mediaLocation, setImageBackup2.mediaFilter, setImageBackup2.imageLocation, setImageBackup2.imageFilter, setImageBackup2.thumbLocation, setImageBackup2.thumbFilter, setImageBackup2.thumb, setImageBackup2.size, setImageBackup2.ext, setImageBackup2.parentObject, setImageBackup2.cacheType);
        setImageBackup2.clear();
        this.setImageBackup = setImageBackup2;
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.allowVibration = this.allowLottieVibration;
        }
        if (lottieAnimation == null || !this.allowStartLottieAnimation) {
            return true;
        }
        if (lottieAnimation.isHeavyDrawable() && this.currentOpenedLayerFlags != 0) {
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

    public void setCrossfadeAlpha(byte b) {
        this.crossfadeAlpha = b;
    }

    public void setCrossfadeByScale(float f) {
        this.crossfadeByScale = f;
    }

    public void setCrossfadeDuration(int i) {
        this.crossfadeDuration = i;
    }

    public void setCrossfadeWithOldImage(boolean z) {
        this.crossfadeWithOldImage = z;
    }

    public void setCurrentAccount(int i) {
        this.currentAccount = i;
    }

    public void setCurrentAlpha(float f) {
        this.currentAlpha = f;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public void setDelegate(ImageReceiverDelegate imageReceiverDelegate) {
        this.delegate = imageReceiverDelegate;
    }

    public BackgroundThreadDrawHolder setDrawInBackgroundThread(BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i) {
        if (backgroundThreadDrawHolder == null) {
            backgroundThreadDrawHolder = new BackgroundThreadDrawHolder();
        }
        backgroundThreadDrawHolder.threadIndex = i;
        backgroundThreadDrawHolder.animation = getAnimation();
        backgroundThreadDrawHolder.lottieDrawable = getLottieAnimation();
        boolean z = false;
        for (int i2 = 0; i2 < 4; i2++) {
            backgroundThreadDrawHolder.roundRadius[i2] = this.roundRadius[i2];
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
        if ((backgroundThreadDrawHolder.animation != null && !backgroundThreadDrawHolder.animation.hasBitmap()) || (backgroundThreadDrawHolder.lottieDrawable != null && !backgroundThreadDrawHolder.lottieDrawable.hasBitmap())) {
            z = true;
        }
        backgroundThreadDrawHolder.animationNotReady = z;
        backgroundThreadDrawHolder.imageX = this.imageX;
        backgroundThreadDrawHolder.imageY = this.imageY;
        backgroundThreadDrawHolder.imageW = this.imageW;
        backgroundThreadDrawHolder.imageH = this.imageH;
        backgroundThreadDrawHolder.overrideAlpha = this.overrideAlpha;
        return backgroundThreadDrawHolder;
    }

    public void setEmojiPaused(boolean z) {
        if (this.emojiPaused == z) {
            return;
        }
        this.emojiPaused = z;
        this.allowStartLottieAnimation = !z;
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            if (z) {
                lottieAnimation.isRunning = false;
                lottieAnimation.checkChoreographer$1();
            } else {
                if (lottieAnimation.isRunning) {
                    return;
                }
                lottieAnimation.start();
            }
        }
    }

    public void setFileLoadingPriority(int i) {
        if (this.fileLoadingPriority != i) {
            this.fileLoadingPriority = i;
            if (this.attachedToWindow && hasImageSet()) {
                ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
            }
        }
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable) {
        setForUserOrChat(tLObject, drawable, null);
    }

    public void setForceCrossfade(boolean z) {
        this.forceCrossfade = z;
    }

    public void setForceLoading(boolean z) {
        this.forceLoding = z;
    }

    public void setForceNotMedia(boolean z) {
        this.forceNotMedia = z;
    }

    public void setForcePreview(boolean z) {
        this.forcePreview = z;
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

    public void setIgnoreImageSet(boolean z) {
        this.ignoreImageSet = z;
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, String str2, Object obj, int i) {
        setImage(imageLocation, str, null, null, drawable, 0L, str2, obj, i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
    }

    public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
        AnimatedFileDrawable animation;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        boolean z2;
        ImageReceiverDelegate imageReceiverDelegate;
        RLottieDrawable rLottieDrawable;
        AnimatedFileDrawable animatedFileDrawable;
        boolean z3;
        boolean z4;
        View view;
        AnimatedEmojiDrawable animatedEmojiDrawable;
        Drawable drawable5;
        boolean z5;
        boolean z6;
        boolean z7;
        Drawable drawable6;
        boolean z8;
        if (drawable != null && str != null && this.currentGuid == i2) {
            if (i == 0) {
                if (str.equals(this.currentImageKey)) {
                    ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
                    if (imageReceiverDelegate2 != null) {
                        imageReceiverDelegate2.didSetImageBitmap(i, str, drawable);
                    }
                    if (drawable instanceof AnimatedFileDrawable) {
                        AnimatedFileDrawable animatedFileDrawable2 = (AnimatedFileDrawable) drawable;
                        animatedFileDrawable2.setStartEndTime(this.startTime, this.endTime);
                        if (animatedFileDrawable2.isWebmSticker) {
                            ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                        }
                        if (this.videoThumbIsSame) {
                            z7 = !animatedFileDrawable2.hasBitmap();
                        } else {
                            z7 = true;
                        }
                    } else {
                        ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                        if (!this.videoThumbIsSame || (drawable != this.currentImageDrawable && this.currentAlpha >= 1.0f)) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    this.currentImageDrawable = drawable;
                    if (drawable instanceof ExtendedBitmapDrawable) {
                        ExtendedBitmapDrawable extendedBitmapDrawable = (ExtendedBitmapDrawable) drawable;
                        this.imageOrientation = extendedBitmapDrawable.getOrientation();
                        this.imageInvert = extendedBitmapDrawable.getInvert();
                    }
                    updateDrawableRadius(drawable);
                    if (z7 && this.isVisible && (((!z && !this.forcePreview) || this.forceCrossfade) && this.crossfadeDuration != 0)) {
                        Drawable drawable7 = this.currentMediaDrawable;
                        if (!(drawable7 instanceof RLottieDrawable) || !((RLottieDrawable) drawable7).hasBitmap()) {
                            Drawable drawable8 = this.currentMediaDrawable;
                            if (!(drawable8 instanceof AnimatedFileDrawable) || !((AnimatedFileDrawable) drawable8).hasBitmap()) {
                                if (this.currentImageDrawable instanceof RLottieDrawable) {
                                    Drawable drawable9 = this.staticThumbDrawable;
                                    if ((drawable9 instanceof LoadingStickerDrawable) || (drawable9 instanceof SvgHelper.SvgDrawable) || (drawable9 instanceof Emoji.EmojiDrawable)) {
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
                                                z8 = false;
                                            } else {
                                                z8 = true;
                                            }
                                            this.crossfadeWithThumb = z8;
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
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        this.crossfadeWithThumb = z8;
                                    } else {
                                        if (drawable6 != null) {
                                            this.previousAlpha = 1.0f;
                                        } else {
                                            this.previousAlpha = 1.0f;
                                        }
                                        this.currentAlpha = 0.0f;
                                        this.lastUpdateAlphaTime = System.currentTimeMillis();
                                        if (this.crossfadeImage != null) {
                                            z8 = true;
                                        } else {
                                            z8 = true;
                                        }
                                        this.crossfadeWithThumb = z8;
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
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (drawable5 == null || this.currentMediaDrawable != null) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        imageReceiverDelegate.didSetImage(this, z5, z6, z);
                    }
                    if (drawable instanceof AnimatedEmojiDrawable) {
                        animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
                        if (this.attachedToWindow) {
                            animatedEmojiDrawable.addView(this);
                        }
                    } else if (drawable instanceof AnimatedFileDrawable) {
                        animatedFileDrawable = (AnimatedFileDrawable) drawable;
                        z3 = this.useSharedAnimationQueue;
                        if (!animatedFileDrawable.isWebmSticker) {
                            animatedFileDrawable.useSharedQueue = z3;
                        }
                        if (this.attachedToWindow) {
                            animatedFileDrawable.addParent(this);
                        }
                        if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                            animatedFileDrawable.checkRepeat();
                        }
                        z4 = this.allowDecodeSingleFrame;
                        animatedFileDrawable.decodeSingleFrame = z4;
                        if (z4) {
                            animatedFileDrawable.scheduleNextGetFrame(false);
                        }
                        this.animationReadySent = false;
                        view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    } else if (drawable instanceof RLottieDrawable) {
                        rLottieDrawable = (RLottieDrawable) drawable;
                        if (this.attachedToWindow) {
                            rLottieDrawable.parentViews.add(this);
                        }
                        if (this.allowStartLottieAnimation && (!rLottieDrawable.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
                            rLottieDrawable.start();
                        }
                        rLottieDrawable.decodeSingleFrame = true;
                        rLottieDrawable.scheduleNextGetFrame();
                        rLottieDrawable.setAutoRepeat(this.autoRepeat);
                        rLottieDrawable.autoRepeatCount = this.autoRepeatCount;
                        rLottieDrawable.allowDrawFramesWhileCacheGenerating = this.allowDrawWhileCacheGenerating;
                        this.animationReadySent = false;
                    }
                    invalidate();
                    return true;
                }
            } else {
                if (i != 3) {
                    if (i == 1) {
                        if (this.currentThumbDrawable == null && ((this.forcePreview || (((animation = getAnimation()) == null || !animation.hasBitmap()) && (((drawable2 = this.currentImageDrawable) == null || (drawable2 instanceof AnimatedFileDrawable)) && ((drawable3 = this.currentMediaDrawable) == null || (drawable3 instanceof AnimatedFileDrawable))))) && str.equals(this.currentThumbKey))) {
                            ImageReceiverDelegate imageReceiverDelegate3 = this.delegate;
                            if (imageReceiverDelegate3 != null) {
                                imageReceiverDelegate3.didSetImageBitmap(i, str, drawable);
                            }
                            ImageLoader.getInstance().incrementUseCount(this.currentThumbKey);
                            this.currentThumbDrawable = drawable;
                            if (drawable instanceof ExtendedBitmapDrawable) {
                                ExtendedBitmapDrawable extendedBitmapDrawable2 = (ExtendedBitmapDrawable) drawable;
                                this.thumbOrientation = extendedBitmapDrawable2.getOrientation();
                                this.thumbInvert = extendedBitmapDrawable2.getInvert();
                            }
                            updateDrawableRadius(drawable);
                            if (z || this.crossfadeAlpha == 2) {
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
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (drawable5 == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        imageReceiverDelegate.didSetImage(this, z5, z6, z);
                    }
                    if (drawable instanceof AnimatedEmojiDrawable) {
                        animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
                        if (this.attachedToWindow) {
                            animatedEmojiDrawable.addView(this);
                        }
                    } else if (drawable instanceof AnimatedFileDrawable) {
                        animatedFileDrawable = (AnimatedFileDrawable) drawable;
                        z3 = this.useSharedAnimationQueue;
                        if (!animatedFileDrawable.isWebmSticker) {
                            animatedFileDrawable.useSharedQueue = z3;
                        }
                        if (this.attachedToWindow) {
                            animatedFileDrawable.addParent(this);
                        }
                        if (this.allowStartAnimation) {
                            animatedFileDrawable.checkRepeat();
                        }
                        z4 = this.allowDecodeSingleFrame;
                        animatedFileDrawable.decodeSingleFrame = z4;
                        if (z4) {
                            animatedFileDrawable.scheduleNextGetFrame(false);
                        }
                        this.animationReadySent = false;
                        view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    } else if (drawable instanceof RLottieDrawable) {
                        rLottieDrawable = (RLottieDrawable) drawable;
                        if (this.attachedToWindow) {
                            rLottieDrawable.parentViews.add(this);
                        }
                        if (this.allowStartLottieAnimation) {
                            rLottieDrawable.start();
                        }
                        rLottieDrawable.decodeSingleFrame = true;
                        rLottieDrawable.scheduleNextGetFrame();
                        rLottieDrawable.setAutoRepeat(this.autoRepeat);
                        rLottieDrawable.autoRepeatCount = this.autoRepeatCount;
                        rLottieDrawable.allowDrawFramesWhileCacheGenerating = this.allowDrawWhileCacheGenerating;
                        this.animationReadySent = false;
                    }
                    invalidate();
                    return true;
                }
                if (str.equals(this.currentMediaKey)) {
                    ImageReceiverDelegate imageReceiverDelegate4 = this.delegate;
                    if (imageReceiverDelegate4 != null) {
                        imageReceiverDelegate4.didSetImageBitmap(i, str, drawable);
                    }
                    if (drawable instanceof AnimatedFileDrawable) {
                        AnimatedFileDrawable animatedFileDrawable3 = (AnimatedFileDrawable) drawable;
                        animatedFileDrawable3.setStartEndTime(this.startTime, this.endTime);
                        if (animatedFileDrawable3.isWebmSticker) {
                            ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                        }
                        if (this.videoThumbIsSame && (((z2 = (drawable4 = this.currentThumbDrawable) instanceof AnimatedFileDrawable)) || (this.currentImageDrawable instanceof AnimatedFileDrawable))) {
                            animatedFileDrawable3.seekTo(z2 ? ((AnimatedFileDrawable) drawable4).lastTimeStamp : 0L, true, true);
                        }
                    } else {
                        ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                    }
                    this.currentMediaDrawable = drawable;
                    updateDrawableRadius(drawable);
                    if (this.currentImageDrawable == null) {
                        if ((z || this.forcePreview) && !this.forceCrossfade) {
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
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (drawable5 == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        imageReceiverDelegate.didSetImage(this, z5, z6, z);
                    }
                    if (drawable instanceof AnimatedEmojiDrawable) {
                        animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
                        if (this.attachedToWindow) {
                            animatedEmojiDrawable.addView(this);
                        }
                    } else if (drawable instanceof AnimatedFileDrawable) {
                        animatedFileDrawable = (AnimatedFileDrawable) drawable;
                        z3 = this.useSharedAnimationQueue;
                        if (!animatedFileDrawable.isWebmSticker) {
                            animatedFileDrawable.useSharedQueue = z3;
                        }
                        if (this.attachedToWindow) {
                            animatedFileDrawable.addParent(this);
                        }
                        if (this.allowStartAnimation) {
                            animatedFileDrawable.checkRepeat();
                        }
                        z4 = this.allowDecodeSingleFrame;
                        animatedFileDrawable.decodeSingleFrame = z4;
                        if (z4) {
                            animatedFileDrawable.scheduleNextGetFrame(false);
                        }
                        this.animationReadySent = false;
                        view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    } else if (drawable instanceof RLottieDrawable) {
                        rLottieDrawable = (RLottieDrawable) drawable;
                        if (this.attachedToWindow) {
                            rLottieDrawable.parentViews.add(this);
                        }
                        if (this.allowStartLottieAnimation) {
                            rLottieDrawable.start();
                        }
                        rLottieDrawable.decodeSingleFrame = true;
                        rLottieDrawable.scheduleNextGetFrame();
                        rLottieDrawable.setAutoRepeat(this.autoRepeat);
                        rLottieDrawable.autoRepeatCount = this.autoRepeatCount;
                        rLottieDrawable.allowDrawFramesWhileCacheGenerating = this.allowDrawWhileCacheGenerating;
                        this.animationReadySent = false;
                    }
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    public void setImageCoords(float f, float f2, float f3, float f4) {
        this.imageX = f;
        this.imageY = f2;
        this.imageW = f3;
        this.imageH = f4;
    }

    public void setImageWidth(int i) {
        this.imageW = i;
    }

    public void setImageX(float f) {
        this.imageX = f;
    }

    public void setImageY(float f) {
        this.imageY = f;
    }

    public void setInvalidateAll(boolean z) {
        this.invalidateAll = z;
    }

    public void setLayerNum(int i) {
        this.currentLayerNum = i;
        if (this.attachedToWindow) {
            this.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
        }
    }

    public void setManualAlphaAnimator(boolean z) {
        this.manualAlphaAnimator = z;
    }

    public void setMark(Object obj) {
        this.mark = obj;
    }

    public void setMediaStartEndTime(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof AnimatedFileDrawable) {
            ((AnimatedFileDrawable) drawable).setStartEndTime(j, j2);
        }
    }

    public void setNeedsQualityThumb(boolean z) {
        this.needsQualityThumb = z;
    }

    public void setOrientation(int i, boolean z) {
        setOrientation(i, 0, z);
    }

    public void setParam(int i) {
        this.param = i;
    }

    public void setParentView(View view) {
        this.parentView = view;
        AnimatedFileDrawable animation = getAnimation();
        if (animation == null || !this.attachedToWindow) {
            return;
        }
        View view2 = this.parentView;
        if (animation.parentView != null) {
            return;
        }
        animation.parentView = view2;
    }

    public void setPreloadingReceivers(List<ImageReceiver> list) {
        this.preloadReceivers = list;
    }

    public void setPressed(int i) {
        this.isPressed = i;
    }

    public void setQualityThumbDocument(TLRPC.Document document) {
        this.qulityThumbDocument = document;
    }

    public void setRoundRadius(int i) {
        setRoundRadius(new int[]{i, i, i, i});
    }

    public void setRoundRadiusEnabled(boolean z) {
        if (this.useRoundRadius != z) {
            this.useRoundRadius = z;
            if (!z && this.emptyRoundRadius == null) {
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

    public void setShouldGenerateQualityThumb(boolean z) {
        this.shouldGenerateQualityThumb = z;
    }

    public void setSideClip(float f) {
        this.sideClip = f;
    }

    public void setSkipUpdateFrame(boolean z) {
        this.skipUpdateFrame = z;
    }

    public void setStrippedLocation(ImageLocation imageLocation) {
        this.strippedLocation = imageLocation;
    }

    public void setTag(int i, int i2) {
        if (i2 == 1) {
            this.thumbTag = i;
        } else if (i2 == 3) {
            this.mediaTag = i;
        } else {
            this.imageTag = i;
        }
    }

    public void setUniqKeyPrefix(String str) {
        this.uniqKeyPrefix = str;
    }

    public void setUseRoundForThumbDrawable(boolean z) {
        this.useRoundForThumb = z;
    }

    public void setUseSharedAnimationQueue(boolean z) {
        this.useSharedAnimationQueue = z;
    }

    public void setVideoThumbIsSame(boolean z) {
        this.videoThumbIsSame = z;
    }

    public void setVisible(boolean z, boolean z2) {
        if (this.isVisible == z) {
            return;
        }
        this.isVisible = z;
        if (z2) {
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

    public void skipDraw() {
    }

    public void startAnimation() {
        startAnimation(false);
    }

    public void startCrossfadeFromStaticThumb(Bitmap bitmap) {
        startCrossfadeFromStaticThumb(new BitmapDrawable((Resources) null, bitmap));
    }

    public void stopAnimation() {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.isRunning = false;
            animation.checkChoreographer();
            return;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.isRunning = false;
            lottieAnimation.checkChoreographer$1();
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
        this.invalidateRunnable = new ANRDetector$$ExternalSyntheticLambda0(this, 23);
        this.parentView = view;
        this.roundPaint = new Paint(3);
        this.currentAccount = UserConfig.selectedAccount;
    }

    public boolean draw(Canvas canvas, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        boolean z;
        int i;
        AnimatedFileDrawable animation;
        int[] iArr;
        BitmapShader bitmapShader;
        Drawable drawable;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        Drawable drawable2;
        float f;
        BitmapShader bitmapShader4;
        float f2;
        Drawable drawable3;
        BitmapShader bitmapShader5;
        Drawable drawable4;
        float f3;
        RLottieDrawable rLottieDrawable;
        boolean z2;
        Drawable drawable5;
        boolean z3;
        Drawable drawable6;
        int i2;
        int i3;
        BitmapShader bitmapShader6;
        int i4;
        float f4;
        float fMin;
        Drawable drawable7;
        Drawable drawable8;
        boolean z4;
        boolean z5;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder2;
        boolean z6;
        Drawable drawable9;
        BitmapShader bitmapShader7;
        boolean z7;
        Drawable drawable10;
        Canvas canvas2;
        Drawable drawable11;
        boolean z8;
        BitmapShader bitmapShader8;
        BitmapShader bitmapShader9;
        ImageReceiver imageReceiver = this;
        Canvas canvas3 = canvas;
        if (imageReceiver.gradientBitmap != null && imageReceiver.currentImageKey != null) {
            canvas3.save();
            float f5 = imageReceiver.imageX;
            float f6 = imageReceiver.imageY;
            canvas3.clipRect(f5, f6, imageReceiver.imageW + f5, imageReceiver.imageH + f6);
            canvas3.drawColor(-16777216);
        }
        boolean z9 = backgroundThreadDrawHolder != null;
        try {
            if (z9) {
                animation = backgroundThreadDrawHolder.animation;
                RLottieDrawable rLottieDrawable2 = backgroundThreadDrawHolder.lottieDrawable;
                iArr = backgroundThreadDrawHolder.roundRadius;
                Drawable drawable12 = backgroundThreadDrawHolder.mediaDrawable;
                bitmapShader = backgroundThreadDrawHolder.mediaShader;
                drawable = backgroundThreadDrawHolder.imageDrawable;
                BitmapShader bitmapShader10 = backgroundThreadDrawHolder.imageShader;
                bitmapShader2 = backgroundThreadDrawHolder.thumbShader;
                bitmapShader3 = backgroundThreadDrawHolder.staticThumbShader;
                drawable2 = backgroundThreadDrawHolder.crossfadeImage;
                boolean unused = backgroundThreadDrawHolder.crossfadeWithOldImage;
                z2 = backgroundThreadDrawHolder.crossfadingWithThumb;
                Drawable drawable13 = backgroundThreadDrawHolder.thumbDrawable;
                Drawable drawable14 = backgroundThreadDrawHolder.staticThumbDrawable;
                float f7 = backgroundThreadDrawHolder.currentAlpha;
                f3 = backgroundThreadDrawHolder.previousAlpha;
                bitmapShader5 = backgroundThreadDrawHolder.crossfadeShader;
                boolean z10 = backgroundThreadDrawHolder.animationNotReady;
                f = backgroundThreadDrawHolder.overrideAlpha;
                drawable5 = drawable12;
                z3 = z10;
                drawable4 = drawable13;
                drawable3 = drawable14;
                bitmapShader4 = bitmapShader10;
                f2 = f7;
                rLottieDrawable = rLottieDrawable2;
            } else {
                animation = imageReceiver.getAnimation();
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                iArr = imageReceiver.roundRadius;
                Drawable drawable15 = imageReceiver.currentMediaDrawable;
                bitmapShader = imageReceiver.mediaShader;
                drawable = imageReceiver.currentImageDrawable;
                BitmapShader bitmapShader11 = imageReceiver.imageShader;
                Drawable drawable16 = imageReceiver.currentThumbDrawable;
                bitmapShader2 = imageReceiver.thumbShader;
                bitmapShader3 = imageReceiver.staticThumbShader;
                boolean z11 = imageReceiver.crossfadingWithThumb;
                drawable2 = imageReceiver.crossfadeImage;
                Drawable drawable17 = imageReceiver.staticThumbDrawable;
                float f8 = imageReceiver.currentAlpha;
                float f9 = imageReceiver.previousAlpha;
                BitmapShader bitmapShader12 = imageReceiver.crossfadeShader;
                f = imageReceiver.overrideAlpha;
                if ((animation == null || animation.hasBitmap()) && (lottieAnimation == null || lottieAnimation.hasBitmap())) {
                    bitmapShader4 = bitmapShader11;
                    f2 = f8;
                    drawable3 = drawable17;
                    bitmapShader5 = bitmapShader12;
                    drawable4 = drawable16;
                    f3 = f9;
                    rLottieDrawable = lottieAnimation;
                    z2 = z11;
                    drawable5 = drawable15;
                    z3 = false;
                } else {
                    bitmapShader4 = bitmapShader11;
                    f2 = f8;
                    drawable3 = drawable17;
                    bitmapShader5 = bitmapShader12;
                    drawable4 = drawable16;
                    f3 = f9;
                    rLottieDrawable = lottieAnimation;
                    z2 = z11;
                    drawable5 = drawable15;
                    z3 = true;
                }
            }
            try {
                if (!imageReceiver.useRoundRadius) {
                    iArr = imageReceiver.emptyRoundRadius;
                }
                int[] iArr2 = iArr;
                if (animation != null) {
                    animation.setRoundRadius(iArr2);
                }
                if (animation != null || rLottieDrawable != null) {
                    if (!z3 && !imageReceiver.animationReadySent && z9 == 0) {
                        imageReceiver.animationReadySent = true;
                        ImageReceiverDelegate imageReceiverDelegate = imageReceiver.delegate;
                        if (imageReceiverDelegate != null) {
                            imageReceiverDelegate.onAnimationReady(imageReceiver);
                        }
                    }
                }
                boolean z12 = imageReceiver.forcePreview;
                if (z12 || imageReceiver.forceNotMedia || drawable5 == null || z3) {
                    if (!z12 && drawable != null && (!z3 || drawable5 != null)) {
                        i3 = imageReceiver.imageOrientation;
                        i2 = imageReceiver.imageInvert;
                        drawable6 = drawable;
                        bitmapShader3 = bitmapShader3;
                        z3 = false;
                    } else if (drawable2 != null && !z2) {
                        i4 = imageReceiver.imageOrientation;
                        i2 = imageReceiver.imageInvert;
                        drawable6 = drawable2;
                        bitmapShader4 = bitmapShader5;
                    } else if (drawable4 != null) {
                        i4 = imageReceiver.thumbOrientation;
                        i2 = imageReceiver.thumbInvert;
                        drawable6 = drawable4;
                        bitmapShader4 = bitmapShader2;
                    } else if (drawable3 instanceof BitmapDrawable) {
                        if (imageReceiver.useRoundForThumb && bitmapShader3 == null) {
                            imageReceiver.updateDrawableRadius(drawable3);
                            bitmapShader6 = imageReceiver.staticThumbShader;
                        } else {
                            bitmapShader6 = bitmapShader3;
                        }
                        z3 = z3;
                        bitmapShader4 = bitmapShader6;
                        bitmapShader3 = bitmapShader4;
                        i3 = imageReceiver.thumbOrientation;
                        i2 = imageReceiver.thumbInvert;
                        drawable6 = drawable3;
                    } else {
                        bitmapShader3 = bitmapShader3;
                        drawable6 = null;
                        bitmapShader4 = null;
                        i2 = 0;
                        z3 = z3;
                        i3 = 0;
                    }
                    f4 = imageReceiver.crossfadeByScale;
                    BitmapShader bitmapShader13 = bitmapShader2;
                    if (f4 > 0.0f) {
                        fMin = Math.min((f4 * f2) + f2, 1.0f);
                    } else {
                        fMin = f2;
                    }
                    if (drawable6 != null) {
                        if (imageReceiver.crossfadeAlpha != 0) {
                            if (f3 != 1.0f || (drawable6 != drawable && drawable6 != drawable5)) {
                                z = true;
                                drawable9 = drawable3;
                                bitmapShader7 = bitmapShader3;
                            } else if (drawable3 != null) {
                                if (imageReceiver.useRoundForThumb && bitmapShader3 == null) {
                                    imageReceiver.updateDrawableRadius(drawable3);
                                    bitmapShader7 = imageReceiver.staticThumbShader;
                                } else {
                                    bitmapShader7 = bitmapShader3;
                                }
                                z = true;
                                drawable9 = drawable3;
                                imageReceiver = this;
                                imageReceiver.drawDrawable(canvas, drawable9, (int) (f * 255.0f), bitmapShader7, i3, i2, backgroundThreadDrawHolder);
                            } else {
                                z = true;
                                drawable9 = drawable3;
                                bitmapShader7 = bitmapShader3;
                            }
                            try {
                                z7 = imageReceiver.crossfadeWithThumb;
                                if (z7 || z3 == 0) {
                                    int i5 = i3;
                                    drawable10 = drawable6;
                                    int i6 = i2;
                                    if (z7 || fMin == 1.0f) {
                                        canvas2 = canvas;
                                        drawable11 = drawable10;
                                    } else {
                                        if (drawable10 != drawable && drawable10 != drawable5) {
                                            if (drawable10 == drawable4 || drawable10 == drawable2) {
                                                if (drawable9 != null) {
                                                    if (imageReceiver.useRoundForThumb && bitmapShader7 == null) {
                                                        imageReceiver.updateDrawableRadius(drawable9);
                                                        bitmapShader8 = imageReceiver.staticThumbShader;
                                                    } else {
                                                        bitmapShader8 = bitmapShader7;
                                                    }
                                                    bitmapShader9 = bitmapShader8;
                                                }
                                            } else if (drawable10 == drawable9 && drawable2 != null) {
                                                drawable9 = drawable2;
                                                bitmapShader9 = bitmapShader5;
                                            }
                                            drawable9 = null;
                                            bitmapShader9 = null;
                                        } else if (drawable2 != null) {
                                            drawable9 = drawable2;
                                            bitmapShader9 = bitmapShader5;
                                        } else if (drawable4 != null) {
                                            drawable9 = drawable4;
                                            bitmapShader9 = bitmapShader13;
                                        } else if (drawable9 != null) {
                                            if (imageReceiver.useRoundForThumb && bitmapShader7 == null) {
                                                imageReceiver.updateDrawableRadius(drawable9);
                                                bitmapShader8 = imageReceiver.staticThumbShader;
                                            } else {
                                                bitmapShader8 = bitmapShader7;
                                            }
                                            bitmapShader9 = bitmapShader8;
                                        } else {
                                            drawable9 = null;
                                            bitmapShader9 = null;
                                        }
                                        if (drawable9 != null) {
                                            drawable11 = drawable10;
                                            int iM = ((drawable9 instanceof SvgHelper.SvgDrawable) || (drawable9 instanceof Emoji.EmojiDrawable)) ? (int) ImageReceiver$$ExternalSyntheticOutline2.m(1.0f, fMin, f, 255.0f) : (int) (f3 * f * 255.0f);
                                            canvas2 = canvas;
                                            imageReceiver.drawDrawable(canvas2, drawable9, iM, bitmapShader9, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                                            if (iM != 255 && (drawable9 instanceof Emoji.EmojiDrawable)) {
                                                drawable9.setAlpha(255);
                                            }
                                        } else {
                                            canvas2 = canvas;
                                            drawable11 = drawable10;
                                        }
                                    }
                                    if (imageReceiver.crossfadeByScale > 0.0f || fMin >= 1.0f || !z2) {
                                        z8 = false;
                                    } else {
                                        canvas2.save();
                                        imageReceiver.roundPath.rewind();
                                        RectF rectF = AndroidUtilities.rectTmp;
                                        float f10 = imageReceiver.imageX;
                                        float f11 = imageReceiver.imageY;
                                        rectF.set(f10, f11, imageReceiver.imageW + f10, imageReceiver.imageH + f11);
                                        for (int i7 = 0; i7 < iArr2.length; i7++) {
                                            float[] fArr = radii;
                                            int i8 = i7 * 2;
                                            float f12 = iArr2[i7];
                                            fArr[i8] = f12;
                                            fArr[i8 + 1] = f12;
                                        }
                                        imageReceiver.roundPath.addRoundRect(AndroidUtilities.rectTmp, radii, Path.Direction.CW);
                                        canvas2.clipPath(imageReceiver.roundPath);
                                        float fM = DiffUtil.m(1.0f, CubicBezierInterpolator.EASE_IN.getInterpolation(f2), imageReceiver.crossfadeByScale, 1.0f);
                                        canvas2.scale(fM, fM, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                                        z8 = true;
                                    }
                                    int i9 = (int) (f * fMin * 255.0f);
                                    Drawable drawable18 = drawable11;
                                    imageReceiver.drawDrawable(canvas2, drawable18, i9, bitmapShader4, i5, i6, backgroundThreadDrawHolder);
                                    if (z8) {
                                        canvas.restore();
                                    }
                                    imageReceiver = this;
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    drawable8 = drawable18;
                                } else {
                                    Drawable drawable19 = drawable6;
                                    imageReceiver.drawDrawable(canvas, drawable19, (int) (f * 255.0f), bitmapShader4, i3, i2, backgroundThreadDrawHolder);
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    drawable8 = drawable19;
                                }
                            } catch (Exception e) {
                                e = e;
                                imageReceiver = this;
                                canvas3 = canvas;
                                z = false;
                                FileLog.e(e);
                                if (imageReceiver.gradientBitmap != null) {
                                    canvas3.restore();
                                }
                                if (z) {
                                    for (i = 0; i < imageReceiver.decorators.size(); i++) {
                                        imageReceiver.decorators.get(i).onDraw(canvas3, imageReceiver);
                                    }
                                }
                                return z;
                            }
                        } else {
                            Drawable drawable20 = drawable6;
                            z3 = z3;
                            z = true;
                            imageReceiver = this;
                            backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                            imageReceiver.drawDrawable(canvas, drawable20, (int) (f * 255.0f), bitmapShader4, i3, i2, backgroundThreadDrawHolder2);
                            drawable8 = drawable20;
                        }
                        if (z3 || !imageReceiver.crossfadeWithThumb) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        imageReceiver.checkAlphaAnimation(z6, backgroundThreadDrawHolder2);
                        canvas3 = canvas;
                        z5 = z3;
                    } else {
                        drawable7 = drawable3;
                        drawable8 = drawable6;
                        z4 = z3;
                        z = true;
                        if (drawable7 != null) {
                            if (drawable7 instanceof VectorAvatarThumbDrawable) {
                                ((VectorAvatarThumbDrawable) drawable7).currentParent = imageReceiver;
                            }
                            canvas3 = canvas;
                            imageReceiver.drawDrawable(canvas3, drawable7, (int) (f * 255.0f), null, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                            z5 = z4;
                            imageReceiver.checkAlphaAnimation(z5, backgroundThreadDrawHolder);
                        } else {
                            canvas3 = canvas;
                            z5 = z4;
                            imageReceiver.checkAlphaAnimation(z5, backgroundThreadDrawHolder);
                            z = false;
                        }
                    }
                    if (drawable8 == null && z5 && !z9) {
                        try {
                            imageReceiver.invalidate();
                        } catch (Exception e2) {
                            e = e2;
                            FileLog.e(e);
                        }
                    }
                    if (imageReceiver.gradientBitmap != null && imageReceiver.currentImageKey != null) {
                        canvas3.restore();
                    }
                    if (z && imageReceiver.isVisible && imageReceiver.decorators != null) {
                        while (i < imageReceiver.decorators.size()) {
                            imageReceiver.decorators.get(i).onDraw(canvas3, imageReceiver);
                        }
                    }
                    return z;
                }
                i4 = imageReceiver.imageOrientation;
                bitmapShader4 = bitmapShader;
                bitmapShader3 = bitmapShader3;
                i2 = imageReceiver.imageInvert;
                drawable6 = drawable5;
                i3 = i4;
                f4 = imageReceiver.crossfadeByScale;
                BitmapShader bitmapShader14 = bitmapShader2;
                if (f4 > 0.0f) {
                    fMin = Math.min((f4 * f2) + f2, 1.0f);
                } else {
                    fMin = f2;
                }
                if (drawable6 != null) {
                    if (imageReceiver.crossfadeAlpha != 0) {
                        if (f3 != 1.0f) {
                            z = true;
                            drawable9 = drawable3;
                            bitmapShader7 = bitmapShader3;
                        } else {
                            z = true;
                            drawable9 = drawable3;
                            bitmapShader7 = bitmapShader3;
                        }
                        z7 = imageReceiver.crossfadeWithThumb;
                        if (z7) {
                            int i10 = i3;
                            drawable10 = drawable6;
                            int i11 = i2;
                            if (z7) {
                                canvas2 = canvas;
                                drawable11 = drawable10;
                            } else {
                                canvas2 = canvas;
                                drawable11 = drawable10;
                            }
                            if (imageReceiver.crossfadeByScale > 0.0f) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            int i12 = (int) (f * fMin * 255.0f);
                            Drawable drawable110 = drawable11;
                            imageReceiver.drawDrawable(canvas2, drawable110, i12, bitmapShader4, i10, i11, backgroundThreadDrawHolder);
                            if (z8) {
                                canvas.restore();
                            }
                            imageReceiver = this;
                            backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                            drawable8 = drawable110;
                        } else {
                            int i13 = i3;
                            drawable10 = drawable6;
                            int i14 = i2;
                            if (z7) {
                                canvas2 = canvas;
                                drawable11 = drawable10;
                            } else {
                                canvas2 = canvas;
                                drawable11 = drawable10;
                            }
                            if (imageReceiver.crossfadeByScale > 0.0f) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            int i15 = (int) (f * fMin * 255.0f);
                            Drawable drawable111 = drawable11;
                            imageReceiver.drawDrawable(canvas2, drawable111, i15, bitmapShader4, i13, i14, backgroundThreadDrawHolder);
                            if (z8) {
                                canvas.restore();
                            }
                            imageReceiver = this;
                            backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                            drawable8 = drawable111;
                        }
                    } else {
                        Drawable drawable21 = drawable6;
                        z3 = z3;
                        z = true;
                        imageReceiver = this;
                        backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                        imageReceiver.drawDrawable(canvas, drawable21, (int) (f * 255.0f), bitmapShader4, i3, i2, backgroundThreadDrawHolder2);
                        drawable8 = drawable21;
                    }
                    if (z3) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    imageReceiver.checkAlphaAnimation(z6, backgroundThreadDrawHolder2);
                    canvas3 = canvas;
                    z5 = z3;
                } else {
                    drawable7 = drawable3;
                    drawable8 = drawable6;
                    z4 = z3;
                    z = true;
                    if (drawable7 != null) {
                        if (drawable7 instanceof VectorAvatarThumbDrawable) {
                            ((VectorAvatarThumbDrawable) drawable7).currentParent = imageReceiver;
                        }
                        canvas3 = canvas;
                        imageReceiver.drawDrawable(canvas3, drawable7, (int) (f * 255.0f), null, imageReceiver.thumbOrientation, imageReceiver.thumbInvert, backgroundThreadDrawHolder);
                        z5 = z4;
                        imageReceiver.checkAlphaAnimation(z5, backgroundThreadDrawHolder);
                    } else {
                        canvas3 = canvas;
                        z5 = z4;
                        imageReceiver.checkAlphaAnimation(z5, backgroundThreadDrawHolder);
                        z = false;
                    }
                }
                if (drawable8 == null) {
                    imageReceiver.invalidate();
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
        }
        if (imageReceiver.gradientBitmap != null) {
            canvas3.restore();
        }
        if (z) {
            while (i < imageReceiver.decorators.size()) {
                imageReceiver.decorators.get(i).onDraw(canvas3, imageReceiver);
            }
        }
        return z;
    }

    public int[] getRoundRadius(boolean z) {
        return (this.useRoundRadius || !z) ? this.roundRadius : this.emptyRoundRadius;
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj) {
        setForUserOrChat(tLObject, drawable, obj, false, 0, false);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, long j, String str2, Object obj, int i) {
        setImage(imageLocation, str, null, null, drawable, j, str2, obj, i);
    }

    public void setImageBitmap(Drawable drawable) {
        boolean z = true;
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
        if (!this.crossfadeWithOldImage) {
            for (int i = 0; i < 4; i++) {
                recycleBitmap(null, i);
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
            for (int i2 = 0; i2 < 4; i2++) {
                recycleBitmap(null, i2);
            }
            this.crossfadeShader = null;
        }
        Drawable drawable2 = this.staticThumbDrawable;
        if (drawable2 instanceof RecyclableDrawable) {
            OtherDocumentPlaceholderDrawable otherDocumentPlaceholderDrawable = (OtherDocumentPlaceholderDrawable) ((RecyclableDrawable) drawable2);
            DownloadController.getInstance(otherDocumentPlaceholderDrawable.parentMessageObject.currentAccount).removeLoadingFileObserver(otherDocumentPlaceholderDrawable);
            otherDocumentPlaceholderDrawable.parentView = null;
            otherDocumentPlaceholderDrawable.parentMessageObject = null;
        }
        if (drawable instanceof AnimatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
            if (this.attachedToWindow) {
                animatedEmojiDrawable.addView(this);
            }
        } else if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            View view = this.parentView;
            if (animatedFileDrawable.parentView == null) {
                animatedFileDrawable.parentView = view;
            }
            if (this.attachedToWindow) {
                animatedFileDrawable.addParent(this);
            }
            boolean z2 = this.useSharedAnimationQueue || animatedFileDrawable.isWebmSticker;
            if (!animatedFileDrawable.isWebmSticker) {
                animatedFileDrawable.useSharedQueue = z2;
            }
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animatedFileDrawable.checkRepeat();
            }
            boolean z3 = this.allowDecodeSingleFrame;
            animatedFileDrawable.decodeSingleFrame = z3;
            if (z3) {
                animatedFileDrawable.scheduleNextGetFrame(false);
            }
        } else if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            if (this.attachedToWindow) {
                rLottieDrawable.parentViews.add(this);
            }
            if (rLottieDrawable != null) {
                rLottieDrawable.allowVibration = this.allowLottieVibration;
            }
            if (this.allowStartLottieAnimation && (!rLottieDrawable.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
                rLottieDrawable.start();
            }
            rLottieDrawable.decodeSingleFrame = true;
            rLottieDrawable.scheduleNextGetFrame();
        }
        this.staticThumbShader = null;
        this.thumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(drawable);
        updateDrawableRadius(drawable);
        this.currentMediaLocation = null;
        this.currentMediaFilter = null;
        Drawable drawable3 = this.currentMediaDrawable;
        if (drawable3 instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable2 = (AnimatedFileDrawable) drawable3;
            animatedFileDrawable2.parents.remove(this);
            if (animatedFileDrawable2.parents.isEmpty()) {
                animatedFileDrawable2.repeatCount = 0;
            }
            animatedFileDrawable2.checkCacheCancel();
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
                z = false;
            }
            this.crossfadeWithThumb = z;
        }
    }

    public void setOrientation(int i, int i2, boolean z) {
        while (i < 0) {
            i += 360;
        }
        while (i > 360) {
            i -= 360;
        }
        this.thumbOrientation = i;
        this.imageOrientation = i;
        this.thumbInvert = i2;
        this.imageInvert = i2;
        this.centerRotation = z;
    }

    public void setRoundRadius(int i, int i2, int i3, int i4) {
        setRoundRadius(new int[]{i, i2, i3, i4});
    }

    public void startAnimation(boolean z) {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            boolean z2 = this.useSharedAnimationQueue;
            if (!animation.isWebmSticker) {
                animation.useSharedQueue = z2;
            }
            animation.start();
            return;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation == null || lottieAnimation.isRunning) {
            return;
        }
        lottieAnimation.restart(z);
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

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj, boolean z, int i, boolean z2) {
        ImageLocation imageLocation;
        BitmapDrawable bitmapDrawable;
        boolean z3;
        boolean z4;
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
        ImageLocation forPhoto = null;
        videoSize = null;
        videoSize = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z3 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable2 = userProfilePhoto.strippedBitmap;
                z4 = userProfilePhoto.stripped_thumb != null;
                if (i != 3 || (userFull = MessagesController.getInstance(this.currentAccount).getUserFull(user.id)) == null) {
                    vectorMarkupVideoSize = null;
                } else {
                    TLRPC.Photo photo = user.photo.personal ? userFull.personal_photo : userFull.profile_photo;
                    if (photo != null) {
                        vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo);
                    } else {
                        vectorMarkupVideoSize = null;
                    }
                }
                if (vectorMarkupVideoSize == null && z && MessagesController.getInstance(this.currentAccount).isPremiumUser(user) && user.photo.has_video && LiteMode.isEnabled(1024)) {
                    TLRPC.UserFull userFull2 = MessagesController.getInstance(this.currentAccount).getUserFull(user.id);
                    if (userFull2 == null) {
                        MessagesController.getInstance(this.currentAccount).loadFullUser(user, this.currentGuid, false);
                    } else {
                        TLRPC.Photo photo2 = user.photo.personal ? userFull2.personal_photo : userFull2.profile_photo;
                        if (photo2 != null && (vectorMarkupVideoSize = FileLoader.getVectorMarkupVideoSize(photo2)) == null && (arrayList = photo2.video_sizes) != null && !arrayList.isEmpty()) {
                            TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(arrayList, 100);
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                TLRPC.VideoSize videoSize2 = arrayList.get(i2);
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
                imageLocation = forPhoto;
                videoSize = vectorMarkupVideoSize;
            } else {
                imageLocation = null;
                bitmapDrawable2 = null;
                z4 = false;
            }
            bitmapDrawable = bitmapDrawable2;
        } else {
            if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
                imageLocation = null;
                bitmapDrawable = null;
            } else {
                bitmapDrawable = chatPhoto.strippedBitmap;
                if (chatPhoto.stripped_thumb != null) {
                    imageLocation = null;
                    z3 = false;
                    z4 = true;
                } else {
                    imageLocation = null;
                }
            }
            z3 = false;
            z4 = false;
        }
        if (videoSize != null && i != 0) {
            setImageBitmap(new VectorAvatarThumbDrawable(videoSize, z3, i));
            return;
        }
        if (!z2) {
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
        } else if (z4) {
            setImage(imageLocation2, str2, ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 2), "50_50_b", drawable, obj3, 0);
        } else {
            setImage(imageLocation2, str2, drawable, null, obj3, 0);
        }
    }

    public void setImage(String str, String str2, Drawable drawable, String str3, long j) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, j, str3, null, 1);
    }

    public void setRoundRadius(int[] iArr) {
        int i = iArr[0];
        this.isRoundRect = true;
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr2 = this.roundRadius;
            if (i2 >= iArr2.length) {
                break;
            }
            int i3 = iArr2[i2];
            int i4 = iArr[i2];
            if (i3 != i4) {
                z = true;
            }
            if (i != i4) {
                this.isRoundRect = false;
            }
            iArr2[i2] = i4;
            i2++;
        }
        if (z) {
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
        private AnimatedFileDrawable animation;
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
        private RLottieDrawable lottieDrawable;
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
                float f = this.imageX;
                rectF.left = f;
                float f2 = this.imageY;
                rectF.top = f2;
                rectF.right = f + this.imageW;
                rectF.bottom = f2 + this.imageH;
            }
        }

        public void release() {
            this.animation = null;
            this.lottieDrawable = null;
            for (int i = 0; i < 4; i++) {
                int[] iArr = this.roundRadius;
                iArr[i] = iArr[i];
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
                int i = (int) this.imageX;
                rect.left = i;
                int i2 = (int) this.imageY;
                rect.top = i2;
                rect.right = (int) (i + this.imageW);
                rect.bottom = (int) (i2 + this.imageH);
            }
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, String str3, Object obj, int i) {
        setImage(imageLocation, str, imageLocation2, str2, null, 0L, str3, obj, i);
    }

    public static class BitmapHolder {
        public Bitmap bitmap;
        public Drawable drawable;
        private String key;
        public int orientation;
        private boolean recycleOnRelease;

        public BitmapHolder(Bitmap bitmap, String str, int i) {
            this.bitmap = bitmap;
            this.key = str;
            this.orientation = i;
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
                        if (drawable instanceof RLottieDrawable) {
                            ((RLottieDrawable) drawable).recycle(false);
                        } else if (drawable instanceof AnimatedFileDrawable) {
                            ((AnimatedFileDrawable) drawable).recycle();
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

        public BitmapHolder(Drawable drawable, String str, int i) {
            this.drawable = drawable;
            this.key = str;
            this.orientation = i;
            if (str != null) {
                ImageLoader.getInstance().incrementUseCount(this.key);
            }
        }

        public BitmapHolder(Bitmap bitmap) {
            this.bitmap = bitmap;
            this.recycleOnRelease = true;
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j, String str3, Object obj, int i) {
        setImage(imageLocation, str, imageLocation2, str2, null, j, str3, obj, i);
    }

    public void setImageCoords(Rect rect) {
        if (rect != null) {
            this.imageX = rect.left;
            this.imageY = rect.top;
            this.imageW = rect.width();
            this.imageH = rect.height();
        }
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj, int i) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, 0L, null, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, long j, String str3, Object obj, int i) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, j, str3, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, Drawable drawable, long j, String str4, Object obj, int i) {
        String str5;
        ?? r12;
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
            setImageBackup2.size = j;
            setImageBackup2.ext = str4;
            setImageBackup2.cacheType = i;
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
            for (int i2 = 0; i2 < 4; i2++) {
                recycleBitmap(null, i2);
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
            if (document != null && document.dc_id != 0 && document.id != 0) {
                key = "q_" + document.dc_id + "_" + document.id;
                this.currentKeyQuality = true;
            }
        }
        String strM = key;
        if (strM != null && str2 != null) {
            strM = zzit.m(strM, "@", str2);
        }
        if (this.uniqKeyPrefix != null) {
            strM = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.uniqKeyPrefix, strM);
        }
        String key2 = imageLocation4 != null ? imageLocation4.getKey(obj, null, false) : null;
        if (key2 == null && imageLocation4 != null) {
            imageLocation4 = null;
        }
        if (key2 != null && str != null) {
            key2 = zzit.m(key2, "@", str);
        }
        if (this.uniqKeyPrefix != null) {
            key2 = MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.uniqKeyPrefix, key2);
        }
        if ((key2 == null && (str6 = this.currentImageKey) != null && str6.equals(strM)) || ((str5 = this.currentMediaKey) != null && str5.equals(key2))) {
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
            key3 = zzit.m(key3, "@", str3);
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
                if (drawable4 instanceof AnimatedFileDrawable) {
                    AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable4;
                    r12 = 0;
                    animatedFileDrawable.isRunning = false;
                    animatedFileDrawable.checkChoreographer();
                    AnimatedFileDrawable animatedFileDrawable2 = (AnimatedFileDrawable) this.currentMediaDrawable;
                    animatedFileDrawable2.parents.remove(this);
                    if (animatedFileDrawable2.parents.isEmpty()) {
                        animatedFileDrawable2.repeatCount = 0;
                    }
                    animatedFileDrawable2.checkCacheCancel();
                } else {
                    r12 = 0;
                }
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, r12);
                this.crossfadeImage = this.currentMediaDrawable;
                this.crossfadeShader = this.mediaShader;
                this.crossfadeKey = this.currentImageKey;
                this.crossfadingWithThumb = r12;
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
                recycleBitmap(strM, 0);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = this.thumbShader;
                this.crossfadeImage = this.currentThumbDrawable;
                this.crossfadeKey = this.currentThumbKey;
                this.crossfadingWithThumb = false;
                this.currentThumbDrawable = null;
                this.currentThumbKey = null;
            } else if (this.staticThumbDrawable != null) {
                recycleBitmap(strM, 0);
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
                recycleBitmap(strM, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = null;
            }
        } else {
            recycleBitmap(strM, 0);
            recycleBitmap(key3, 1);
            recycleBitmap(null, 2);
            recycleBitmap(key2, 3);
            this.crossfadeShader = null;
        }
        this.currentImageLocation = imageLocation5;
        this.currentImageFilter = str2;
        this.currentImageKey = strM;
        this.currentMediaLocation = imageLocation4;
        this.currentMediaFilter = str;
        this.currentMediaKey = key2;
        this.currentThumbLocation = imageLocation3;
        this.currentThumbFilter = str3;
        this.currentThumbKey = key3;
        this.currentParentObject = obj;
        this.currentExt = str4;
        this.currentSize = j;
        this.currentCacheType = i;
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

    public void drawDrawable(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, int i4, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        float f;
        float f2;
        float f3;
        float f4;
        ColorFilter colorFilter;
        int[] iArr;
        ?? r13;
        ?? r12;
        SvgHelper.SvgDrawable svgDrawable;
        boolean z;
        Paint paint;
        char c;
        int intrinsicHeight;
        int intrinsicWidth;
        int i5;
        boolean z2;
        float f5;
        float f6;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder2;
        float f7;
        float f8;
        BackgroundThreadDrawHolder backgroundThreadDrawHolder3;
        Path path;
        BitmapDrawable bitmapDrawable;
        float f9;
        int width;
        if (backgroundThreadDrawHolder != null) {
            f = backgroundThreadDrawHolder.imageX;
            f2 = backgroundThreadDrawHolder.imageY;
            f3 = backgroundThreadDrawHolder.imageH;
            f4 = backgroundThreadDrawHolder.imageW;
            RectF rectF = backgroundThreadDrawHolder.drawRegion;
            colorFilter = backgroundThreadDrawHolder.colorFilter;
            iArr = backgroundThreadDrawHolder.roundRadius;
            r13 = rectF;
        } else {
            f = this.imageX;
            f2 = this.imageY;
            f3 = this.imageH;
            f4 = this.imageW;
            RectF rectF2 = this.drawRegion;
            colorFilter = this.colorFilter;
            iArr = this.roundRadius;
            r13 = rectF2;
        }
        int[] iArr2 = !this.useRoundRadius ? this.emptyRoundRadius : iArr;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
            int[] iArr3 = iArr2;
            boolean z3 = drawable instanceof RLottieDrawable;
            if (z3) {
                z = z3;
                ((RLottieDrawable) drawable).skipFrameUpdate = this.skipUpdateFrame;
            } else {
                z = z3;
                if (drawable instanceof AnimatedFileDrawable) {
                    ((AnimatedFileDrawable) drawable).skipFrameUpdate = this.skipUpdateFrame;
                }
            }
            if (bitmapShader != null) {
                paint = this.roundPaint;
            } else {
                paint = bitmapDrawable2.getPaint();
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                Object obj = this.blendMode;
                if (obj == null || this.gradientShader != null) {
                    paint.setBlendMode(null);
                } else {
                    paint.setBlendMode(Theme$$ExternalSyntheticApiModelOutline3.m(obj));
                }
            }
            Paint paint2 = paint;
            boolean z4 = (paint2 == null || paint2.getColorFilter() == null) ? false : true;
            if (!z4 || i4 != 0) {
                c = 0;
                if (!z4 && i4 != 0) {
                    if (i4 == 1) {
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
            } else if (bitmapShader != null) {
                c = 0;
                this.roundPaint.setColorFilter(null);
            } else {
                c = 0;
                if (this.staticThumbDrawable != drawable) {
                    bitmapDrawable2.setColorFilter(null);
                }
            }
            if (colorFilter != null && this.gradientShader == null) {
                if (bitmapShader != null) {
                    this.roundPaint.setColorFilter(colorFilter);
                } else {
                    bitmapDrawable2.setColorFilter(colorFilter);
                }
            }
            boolean z5 = bitmapDrawable2 instanceof AnimatedFileDrawable;
            if (!z5 && !(bitmapDrawable2 instanceof RLottieDrawable)) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                if (bitmap != null && bitmap.isRecycled()) {
                    return;
                }
                int i7 = i2 % 360;
                if (i7 != 90 && i7 != 270) {
                    intrinsicHeight = bitmap.getWidth();
                    width = bitmap.getHeight();
                } else {
                    intrinsicHeight = bitmap.getHeight();
                    width = bitmap.getWidth();
                }
                z2 = bitmapDrawable2 instanceof ReactionLastFrame;
                i5 = width;
            } else {
                int i8 = i2 % 360;
                if (i8 != 90 && i8 != 270) {
                    intrinsicHeight = bitmapDrawable2.getIntrinsicWidth();
                    intrinsicWidth = bitmapDrawable2.getIntrinsicHeight();
                } else {
                    intrinsicHeight = bitmapDrawable2.getIntrinsicHeight();
                    intrinsicWidth = bitmapDrawable2.getIntrinsicWidth();
                }
                i5 = intrinsicWidth;
                z2 = false;
            }
            float f10 = this.sideClip * 2.0f;
            float f11 = f4 - f10;
            boolean z6 = z2;
            float f12 = f3 - f10;
            float f13 = f4 == 0.0f ? 1.0f : intrinsicHeight / f11;
            float f14 = f3 == 0.0f ? 1.0f : i5 / f12;
            if (z6) {
                f13 /= 1.2f;
                f14 /= 1.2f;
            }
            float f15 = f14;
            float f16 = f13;
            if (bitmapShader != null && backgroundThreadDrawHolder == null) {
                if (this.isAspectFit) {
                    float fMax = Math.max(f16, f15);
                    float f17 = (int) (intrinsicHeight / fMax);
                    float f18 = (int) (i5 / fMax);
                    r13.set(ImageReceiver$$ExternalSyntheticOutline0.m(f4, f17, 2.0f, f), ImageReceiver$$ExternalSyntheticOutline0.m(f3, f18, 2.0f, f2), AacUtil.m(f4, f17, 2.0f, f), AacUtil.m(f3, f18, 2.0f, f2));
                    if (this.isVisible) {
                        this.shaderMatrix.reset();
                        this.shaderMatrix.setTranslate((int) ((RectF) r13).left, (int) ((RectF) r13).top);
                        if (i3 != 0) {
                            this.shaderMatrix.preScale(i3 == 1 ? -1.0f : 1.0f, i3 == 2 ? -1.0f : 1.0f, r13.width() / 2.0f, r13.height() / 2.0f);
                        }
                        if (i2 == 90) {
                            this.shaderMatrix.preRotate(90.0f);
                            this.shaderMatrix.preTranslate(0.0f, -r13.width());
                        } else if (i2 == 180) {
                            this.shaderMatrix.preRotate(180.0f);
                            this.shaderMatrix.preTranslate(-r13.width(), -r13.height());
                        } else if (i2 == 270) {
                            this.shaderMatrix.preRotate(270.0f);
                            this.shaderMatrix.preTranslate(-r13.height(), 0.0f);
                        }
                        float f19 = 1.0f / fMax;
                        this.shaderMatrix.preScale(f19, f19);
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        this.roundPaint.setShader(bitmapShader);
                        this.roundPaint.setAlpha(i);
                        this.roundRect.set(r13);
                        if (!this.isRoundRect || !this.useRoundRadius) {
                            for (int i9 = 0; i9 < iArr3.length; i9++) {
                                float[] fArr = radii;
                                int i10 = i9 * 2;
                                float f20 = iArr3[i9];
                                fArr[i10] = f20;
                                fArr[i10 + 1] = f20;
                            }
                            this.roundPath.reset();
                            this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                            this.roundPath.close();
                            if (canvas != null) {
                                canvas.drawPath(this.roundPath, this.roundPaint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i11 = iArr3[c];
                                if (i11 == 0) {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                } else {
                                    float f21 = i11;
                                    canvas.drawRoundRect(this.roundRect, f21, f21, this.roundPaint);
                                }
                            } catch (Exception e) {
                                onBitmapException(bitmapDrawable2);
                                FileLog.e(e);
                            }
                        }
                    }
                } else {
                    float f22 = f4;
                    float f23 = f3;
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
                    float fMin = 1.0f / Math.min(f16, f15);
                    RectF rectF3 = this.roundRect;
                    float f24 = this.sideClip;
                    rectF3.set(f + f24, f2 + f24, (f + f22) - f24, (f2 + f23) - f24);
                    if (Math.abs(f16 - f15) > 5.0E-4f) {
                        float f25 = intrinsicHeight / f15;
                        if (f25 > f11) {
                            float f26 = (int) f25;
                            r13.set(ImageReceiver$$ExternalSyntheticOutline1.m(f26, f11, 2.0f, f), f2, AacUtil.m(f26, f11, 2.0f, f), f2 + f12);
                            f9 = f12;
                        } else {
                            float f27 = (int) (i5 / f16);
                            f9 = f12;
                            r13.set(f, ImageReceiver$$ExternalSyntheticOutline1.m(f27, f9, 2.0f, f2), f + f11, AacUtil.m(f27, f9, 2.0f, f2));
                        }
                    } else {
                        f9 = f12;
                        r13.set(f, f2, f + f11, f2 + f9);
                    }
                    if (this.isVisible) {
                        this.shaderMatrix.reset();
                        if (z6) {
                            this.shaderMatrix.setTranslate((((RectF) r13).left + this.sideClip) - (((r13.width() * 1.2f) - r13.width()) / 2.0f), (((RectF) r13).top + this.sideClip) - (((r13.height() * 1.2f) - r13.height()) / 2.0f));
                        } else {
                            Matrix matrix = this.shaderMatrix;
                            float f28 = ((RectF) r13).left;
                            float f29 = this.sideClip;
                            matrix.setTranslate(f28 + f29, ((RectF) r13).top + f29);
                        }
                        if (i3 != 0) {
                            this.shaderMatrix.preScale(i3 == 1 ? -1.0f : 1.0f, i3 == 2 ? -1.0f : 1.0f, r13.width() / 2.0f, r13.height() / 2.0f);
                        }
                        if (i2 == 90) {
                            this.shaderMatrix.preRotate(90.0f);
                            this.shaderMatrix.preTranslate(0.0f, -r13.width());
                        } else if (i2 == 180) {
                            this.shaderMatrix.preRotate(180.0f);
                            this.shaderMatrix.preTranslate(-r13.width(), -r13.height());
                        } else if (i2 == 270) {
                            this.shaderMatrix.preRotate(270.0f);
                            this.shaderMatrix.preTranslate(-r13.height(), 0.0f);
                        }
                        this.shaderMatrix.preScale(fMin, fMin);
                        if (this.isRoundVideo) {
                            float f30 = ((AndroidUtilities.roundMessageInset * 2) + f11) / f11;
                            this.shaderMatrix.postScale(f30, f30, r13.centerX(), r13.centerY());
                        }
                        BitmapShader bitmapShader2 = this.legacyShader;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(this.shaderMatrix);
                        }
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        if (this.composeShader != null) {
                            int width2 = this.gradientBitmap.getWidth();
                            int height = this.gradientBitmap.getHeight();
                            float f31 = f4 == 0.0f ? 1.0f : width2 / f11;
                            float f32 = f3 == 0.0f ? 1.0f : height / f9;
                            if (Math.abs(f31 - f32) > 5.0E-4f) {
                                float f33 = width2 / f32;
                                if (f33 > f11) {
                                    width2 = (int) f33;
                                    float f34 = width2;
                                    r13.set(ImageReceiver$$ExternalSyntheticOutline1.m(f34, f11, 2.0f, f), f2, AacUtil.m(f34, f11, 2.0f, f), f2 + f9);
                                } else {
                                    height = (int) (height / f31);
                                    float f35 = height;
                                    r13.set(f, ImageReceiver$$ExternalSyntheticOutline1.m(f35, f9, 2.0f, f2), f + f11, AacUtil.m(f35, f9, 2.0f, f2));
                                }
                            } else {
                                r13.set(f, f2, f + f11, f2 + f9);
                            }
                            float fMin2 = 1.0f / Math.min(f4 == 0.0f ? 1.0f : width2 / f11, f3 == 0.0f ? 1.0f : height / f9);
                            this.shaderMatrix.reset();
                            Matrix matrix2 = this.shaderMatrix;
                            float f36 = ((RectF) r13).left;
                            float f37 = this.sideClip;
                            matrix2.setTranslate(f36 + f37, ((RectF) r13).top + f37);
                            this.shaderMatrix.preScale(fMin2, fMin2);
                            this.gradientShader.setLocalMatrix(this.shaderMatrix);
                        }
                        this.roundPaint.setAlpha(i);
                        if (!this.isRoundRect || !this.useRoundRadius) {
                            for (int i12 = 0; i12 < iArr3.length; i12++) {
                                float[] fArr2 = radii;
                                int i13 = i12 * 2;
                                float f38 = iArr3[i12];
                                fArr2[i13] = f38;
                                fArr2[i13 + 1] = f38;
                            }
                            this.roundPath.reset();
                            this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                            this.roundPath.close();
                            if (canvas != null) {
                                canvas.drawPath(this.roundPath, this.roundPaint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i14 = iArr3[c];
                                if (i14 != 0) {
                                    float f39 = i14;
                                    canvas.drawRoundRect(this.roundRect, f39, f39, this.roundPaint);
                                } else if (z6) {
                                    RectF rectF4 = AndroidUtilities.rectTmp;
                                    rectF4.set(this.roundRect);
                                    rectF4.inset((-((r13.width() * 1.2f) - r13.width())) / 2.0f, (-((r13.height() * 1.2f) - r13.height())) / 2.0f);
                                    canvas.drawRect(rectF4, this.roundPaint);
                                } else {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                }
                            } catch (Exception e2) {
                                if (backgroundThreadDrawHolder == null) {
                                    onBitmapException(bitmapDrawable);
                                }
                                FileLog.e(e2);
                            }
                        }
                    }
                }
            } else {
                float f40 = f4;
                float f41 = f3;
                if (this.isAspectFit) {
                    float fMax2 = Math.max(f16, f15);
                    canvas.save();
                    int i15 = (int) (intrinsicHeight / fMax2);
                    int i16 = (int) (i5 / fMax2);
                    if (backgroundThreadDrawHolder == null) {
                        float f42 = i15;
                        f8 = f40;
                        float f43 = i16;
                        f7 = f41;
                        r13.set(ImageReceiver$$ExternalSyntheticOutline0.m(f8, f42, 2.0f, f), ImageReceiver$$ExternalSyntheticOutline0.m(f7, f43, 2.0f, f2), AacUtil.m(f8, f42, 2.0f, f), AacUtil.m(f7, f43, 2.0f, f2));
                        bitmapDrawable2.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
                        if (bitmapDrawable2 instanceof AnimatedFileDrawable) {
                            ((AnimatedFileDrawable) bitmapDrawable2).setActualDrawRect(((RectF) r13).left, ((RectF) r13).top, r13.width(), r13.height());
                        }
                    } else {
                        f7 = f41;
                        f8 = f40;
                    }
                    if (backgroundThreadDrawHolder == null || iArr3 == null || iArr3[c] <= 0) {
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
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(f, f2, f + f8, f2 + f7);
                        path.addRoundRect(rectF5, iArr3[c], iArr3[2], Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                    if (this.isVisible) {
                        try {
                            bitmapDrawable2.setAlpha(i);
                            drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder3, i);
                        } catch (Exception e3) {
                            if (backgroundThreadDrawHolder3 == null) {
                                onBitmapException(bitmapDrawable2);
                            }
                            FileLog.e(e3);
                        }
                    }
                    canvas.restore();
                    if (backgroundThreadDrawHolder3 != null && iArr3 != null && iArr3[c] > 0) {
                        canvas.restore();
                    }
                } else if (canvas != null) {
                    if (Math.abs(f16 - f15) > 1.0E-5f) {
                        canvas.save();
                        if (this.clip) {
                            canvas.clipRect(f, f2, f + f40, f2 + f41);
                        }
                        if (i3 == 1) {
                            f6 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f40 / 2.0f, f41 / 2.0f);
                        } else {
                            f6 = 2.0f;
                            if (i3 == 2) {
                                canvas.scale(1.0f, -1.0f, f40 / 2.0f, f41 / 2.0f);
                            }
                        }
                        int i17 = i2 % 360;
                        if (i17 != 0) {
                            if (this.centerRotation) {
                                canvas.rotate(i2, f40 / f6, f41 / f6);
                            } else {
                                canvas.rotate(i2, 0.0f, 0.0f);
                            }
                        }
                        float f44 = intrinsicHeight / f15;
                        if (f44 > f40) {
                            float f45 = (int) f44;
                            r13.set(ImageReceiver$$ExternalSyntheticOutline1.m(f45, f40, 2.0f, f), f2, AacUtil.m(f45, f40, 2.0f, f), f2 + f41);
                        } else {
                            float f46 = (int) (i5 / f16);
                            r13.set(f, ImageReceiver$$ExternalSyntheticOutline1.m(f46, f41, 2.0f, f2), f + f40, AacUtil.m(f46, f41, 2.0f, f2));
                        }
                        if (z5) {
                            ((AnimatedFileDrawable) bitmapDrawable2).setActualDrawRect(f, f2, f40, f41);
                        }
                        if (backgroundThreadDrawHolder == null) {
                            if (i17 != 90 && i17 != 270) {
                                bitmapDrawable2.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
                            } else {
                                float fWidth = r13.width() / 2.0f;
                                float fHeight = r13.height() / 2.0f;
                                float fCenterX = r13.centerX();
                                float fCenterY = r13.centerY();
                                bitmapDrawable2.setBounds((int) (fCenterX - fHeight), (int) (fCenterY - fWidth), (int) (fCenterX + fHeight), (int) (fCenterY + fWidth));
                            }
                        }
                        if (this.isVisible) {
                            if (i6 >= 29) {
                                try {
                                    if (this.blendMode == null) {
                                        bitmapDrawable2.getPaint().setBlendMode(null);
                                    } else {
                                        bitmapDrawable2.getPaint().setBlendMode(Theme$$ExternalSyntheticApiModelOutline3.m(this.blendMode));
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                                    if (backgroundThreadDrawHolder2 == null) {
                                        onBitmapException(bitmapDrawable2);
                                    }
                                    FileLog.e(e);
                                    canvas.restore();
                                    if (z) {
                                        ((RLottieDrawable) drawable).skipFrameUpdate = false;
                                        return;
                                    } else {
                                        if (drawable instanceof AnimatedFileDrawable) {
                                            ((AnimatedFileDrawable) drawable).skipFrameUpdate = false;
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            backgroundThreadDrawHolder2 = backgroundThreadDrawHolder;
                            try {
                                drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder2, i);
                            } catch (Exception e5) {
                                e = e5;
                                if (backgroundThreadDrawHolder2 == null) {
                                    onBitmapException(bitmapDrawable2);
                                }
                                FileLog.e(e);
                            }
                        }
                        canvas.restore();
                    } else {
                        canvas.save();
                        if (i3 == 1) {
                            f5 = 2.0f;
                            canvas.scale(-1.0f, 1.0f, f40 / 2.0f, f41 / 2.0f);
                        } else {
                            f5 = 2.0f;
                            if (i3 == 2) {
                                canvas.scale(1.0f, -1.0f, f40 / 2.0f, f41 / 2.0f);
                            }
                        }
                        int i18 = i2 % 360;
                        if (i18 != 0) {
                            if (this.centerRotation) {
                                canvas.rotate(i2, f40 / f5, f41 / f5);
                            } else {
                                canvas.rotate(i2, 0.0f, 0.0f);
                            }
                        }
                        r13.set(f, f2, f + f40, f2 + f41);
                        if (this.isRoundVideo) {
                            float f47 = -AndroidUtilities.roundMessageInset;
                            r13.inset(f47, f47);
                        }
                        if (z5 != 0) {
                            ((AnimatedFileDrawable) bitmapDrawable2).setActualDrawRect(f, f2, f40, f41);
                        }
                        if (backgroundThreadDrawHolder == null) {
                            if (i18 != 90 && i18 != 270) {
                                bitmapDrawable2.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
                            } else {
                                float fWidth2 = r13.width() / 2.0f;
                                float fHeight2 = r13.height() / 2.0f;
                                float fCenterX2 = r13.centerX();
                                float fCenterY2 = r13.centerY();
                                bitmapDrawable2.setBounds((int) (fCenterX2 - fHeight2), (int) (fCenterY2 - fWidth2), (int) (fCenterX2 + fHeight2), (int) (fCenterY2 + fWidth2));
                            }
                        }
                        if (this.isVisible) {
                            if (i6 >= 29) {
                                try {
                                    if (this.blendMode == null) {
                                        bitmapDrawable2.getPaint().setBlendMode(null);
                                    } else {
                                        bitmapDrawable2.getPaint().setBlendMode(Theme$$ExternalSyntheticApiModelOutline3.m(this.blendMode));
                                    }
                                } catch (Exception e6) {
                                    onBitmapException(bitmapDrawable2);
                                    FileLog.e(e6);
                                }
                            }
                            drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder, i);
                        }
                        canvas.restore();
                    }
                }
            }
            if (z) {
                ((RLottieDrawable) drawable).skipFrameUpdate = false;
                return;
            } else {
                if (drawable instanceof AnimatedFileDrawable) {
                    ((AnimatedFileDrawable) drawable).skipFrameUpdate = false;
                    return;
                }
                return;
            }
        }
        float f48 = f3;
        float f49 = f4;
        if (backgroundThreadDrawHolder == null) {
            if (this.isAspectFit) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                float f50 = this.sideClip * 2.0f;
                float fMax3 = Math.max(f49 == 0.0f ? 1.0f : intrinsicWidth2 / (f49 - f50), f48 != 0.0f ? intrinsicHeight2 / (f48 - f50) : 1.0f);
                float f51 = (int) (intrinsicWidth2 / fMax3);
                float f52 = (int) (intrinsicHeight2 / fMax3);
                r13.set(ImageReceiver$$ExternalSyntheticOutline0.m(f49, f51, 2.0f, f), ImageReceiver$$ExternalSyntheticOutline0.m(f48, f52, 2.0f, f2), AacUtil.m(f49, f51, 2.0f, f), AacUtil.m(f48, f52, 2.0f, f2));
            } else {
                r13.set(f, f2, f + f49, f2 + f48);
            }
            drawable.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
        }
        if (!this.isVisible || canvas == null) {
            return;
        }
        try {
            try {
                if (drawable instanceof SvgHelper.SvgDrawable) {
                    svgDrawable = (SvgHelper.SvgDrawable) drawable;
                    svgDrawable.setParent(this);
                } else {
                    if (drawable instanceof ClipRoundedDrawable) {
                        Drawable drawable2 = ((ClipRoundedDrawable) drawable).drawable;
                        if (drawable2 instanceof SvgHelper.SvgDrawable) {
                            svgDrawable = (SvgHelper.SvgDrawable) drawable2;
                            svgDrawable.setParent(this);
                        }
                        if (colorFilter != null && drawable != null) {
                            drawable.setColorFilter(colorFilter);
                        }
                        drawable.setAlpha(i);
                        if (backgroundThreadDrawHolder == null && r12 != 0) {
                            long jCurrentTimeMillis = backgroundThreadDrawHolder.time;
                            if (jCurrentTimeMillis == 0) {
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            r13 = 0;
                            ((SvgHelper.SvgDrawable) drawable).drawInternal(canvas, true, backgroundThreadDrawHolder.threadIndex, jCurrentTimeMillis, backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY, backgroundThreadDrawHolder.imageW, backgroundThreadDrawHolder.imageH);
                        } else {
                            r13 = 0;
                            drawable.draw(canvas);
                        }
                        if (r12 != 0) {
                            r12.setParent(r13);
                        }
                    }
                    r12 = 0;
                    if (colorFilter != null) {
                        drawable.setColorFilter(colorFilter);
                    }
                    drawable.setAlpha(i);
                    if (backgroundThreadDrawHolder == null) {
                        r13 = 0;
                        drawable.draw(canvas);
                    } else {
                        r13 = 0;
                        drawable.draw(canvas);
                    }
                    if (r12 != 0) {
                        r12.setParent(r13);
                    }
                }
                if (backgroundThreadDrawHolder == null) {
                    r13 = 0;
                    drawable.draw(canvas);
                } else {
                    r13 = 0;
                    drawable.draw(canvas);
                }
            } catch (Exception e7) {
                e = e7;
                r13 = r13;
                FileLog.e(e);
            }
            drawable.setAlpha(i);
        } catch (Exception e8) {
            e = e8;
            r13 = 0;
        }
        r12 = svgDrawable;
        if (colorFilter != null) {
            drawable.setColorFilter(colorFilter);
        }
        if (r12 != 0) {
            r12.setParent(r13);
        }
    }

    public interface ImageReceiverDelegate {
        void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3);

        void didSetImageBitmap(int i, String str, Drawable drawable);

        void onAnimationReady(ImageReceiver imageReceiver);

        public abstract class CC {
            public static void $default$onAnimationReady(ImageReceiverDelegate imageReceiverDelegate, ImageReceiver imageReceiver) {
            }

            public static void $default$didSetImageBitmap(ImageReceiverDelegate imageReceiverDelegate, int i, String str, Drawable drawable) {
            }
        }
    }
}
