package org.telegram.messenger;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
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
import androidx.annotation.Keep;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclableDrawable;

public class ImageReceiver implements NotificationCenter.NotificationCenterDelegate {
    public static final int DEFAULT_CROSSFADE_DURATION = 150;
    private static final int TYPE_CROSSFDADE = 2;
    public static final int TYPE_IMAGE = 0;
    public static final int TYPE_MEDIA = 3;
    public static final int TYPE_THUMB = 1;
    private boolean allowDecodeSingleFrame;
    private boolean allowStartAnimation;
    private boolean allowStartLottieAnimation;
    private int animateFromIsPressed;
    private boolean animationReadySent;
    private boolean attachedToWindow;
    private int autoRepeat;
    private RectF bitmapRect;
    private Object blendMode;
    private boolean canceledLoading;
    private boolean centerRotation;
    private ColorFilter colorFilter;
    private ComposeShader composeShader;
    private byte crossfadeAlpha;
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
    private int currentSize;
    private Drawable currentThumbDrawable;
    private String currentThumbFilter;
    private String currentThumbKey;
    private ImageLocation currentThumbLocation;
    private ImageReceiverDelegate delegate;
    private RectF drawRegion;
    private long endTime;
    private boolean forceCrossfade;
    private boolean forceLoding;
    private boolean forcePreview;
    private Bitmap gradientBitmap;
    private BitmapShader gradientShader;
    private boolean ignoreImageSet;
    private float imageH;
    private int imageOrientation;
    private BitmapShader imageShader;
    private int imageTag;
    private float imageW;
    private float imageX;
    private float imageY;
    private boolean invalidateAll;
    private boolean isAspectFit;
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
    private BitmapShader mediaShader;
    private int mediaTag;
    private boolean needsQualityThumb;
    private float overrideAlpha;
    private int param;
    private View parentView;
    private float pressedProgress;
    private float previousAlpha;
    private TLRPC$Document qulityThumbDocument;
    private Paint roundPaint;
    private Path roundPath;
    private int[] roundRadius;
    private RectF roundRect;
    private SetImageBackup setImageBackup;
    private Matrix shaderMatrix;
    private boolean shouldGenerateQualityThumb;
    private float sideClip;
    private long startTime;
    private Drawable staticThumbDrawable;
    private ImageLocation strippedLocation;
    private int thumbOrientation;
    private BitmapShader thumbShader;
    private int thumbTag;
    private String uniqKeyPrefix;
    private boolean useRoundForThumb;
    private boolean useSharedAnimationQueue;
    private static PorterDuffColorFilter selectedColorFilter = new PorterDuffColorFilter(-2236963, PorterDuff.Mode.MULTIPLY);
    private static PorterDuffColorFilter selectedGroupColorFilter = new PorterDuffColorFilter(-4473925, PorterDuff.Mode.MULTIPLY);
    private static float[] radii = new float[8];

    public interface ImageReceiverDelegate {

        public final class CC {
            public static void $default$onAnimationReady(ImageReceiverDelegate imageReceiverDelegate, ImageReceiver imageReceiver) {
            }
        }

        void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3);

        void onAnimationReady(ImageReceiver imageReceiver);
    }

    private boolean hasRoundRadius() {
        return true;
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

        public int getWidth() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                return bitmap.getWidth();
            }
            return 0;
        }

        public int getHeight() {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                return bitmap.getHeight();
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
            boolean decrementUseCount = ImageLoader.getInstance().decrementUseCount(this.key);
            if (!ImageLoader.getInstance().isInMemCache(this.key, false) && decrementUseCount) {
                Bitmap bitmap2 = this.bitmap;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                } else {
                    Drawable drawable = this.drawable;
                    if (drawable != null) {
                        if (drawable instanceof RLottieDrawable) {
                            ((RLottieDrawable) drawable).recycle();
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
    }

    public static class SetImageBackup {
        public int cacheType;
        public String ext;
        public String imageFilter;
        public ImageLocation imageLocation;
        public String mediaFilter;
        public ImageLocation mediaLocation;
        public Object parentObject;
        public int size;
        public Drawable thumb;
        public String thumbFilter;
        public ImageLocation thumbLocation;

        private SetImageBackup() {
        }

        public boolean isSet() {
            return (this.imageLocation == null && this.thumbLocation == null && this.mediaLocation == null && this.thumb == null) ? false : true;
        }

        public boolean isWebfileSet() {
            ImageLocation imageLocation;
            ImageLocation imageLocation2;
            ImageLocation imageLocation3 = this.imageLocation;
            return ((imageLocation3 == null || (imageLocation3.webFile == null && imageLocation3.path == null)) && ((imageLocation = this.thumbLocation) == null || (imageLocation.webFile == null && imageLocation.path == null)) && ((imageLocation2 = this.mediaLocation) == null || (imageLocation2.webFile == null && imageLocation2.path == null))) ? false : true;
        }

        public void clear() {
            this.imageLocation = null;
            this.thumbLocation = null;
            this.mediaLocation = null;
            this.thumb = null;
        }
    }

    public ImageReceiver() {
        this(null);
    }

    public ImageReceiver(View view) {
        this.useRoundForThumb = true;
        this.allowStartAnimation = true;
        this.allowStartLottieAnimation = true;
        this.autoRepeat = 1;
        this.drawRegion = new RectF();
        this.isVisible = true;
        this.roundRadius = new int[4];
        this.isRoundRect = true;
        this.roundRect = new RectF();
        this.bitmapRect = new RectF();
        this.shaderMatrix = new Matrix();
        this.roundPath = new Path();
        this.overrideAlpha = 1.0f;
        this.previousAlpha = 1.0f;
        this.crossfadeAlpha = (byte) 1;
        this.crossfadeDuration = DEFAULT_CROSSFADE_DURATION;
        this.loadingOperations = new ArrayList<>();
        this.parentView = view;
        this.roundPaint = new Paint(3);
        this.currentAccount = UserConfig.selectedAccount;
    }

    public void cancelLoadImage() {
        this.forceLoding = false;
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
        this.canceledLoading = true;
    }

    public void setForceLoading(boolean z) {
        this.forceLoding = z;
    }

    public boolean isForceLoding() {
        return this.forceLoding;
    }

    public void setStrippedLocation(ImageLocation imageLocation) {
        this.strippedLocation = imageLocation;
    }

    public void setIgnoreImageSet(boolean z) {
        this.ignoreImageSet = z;
    }

    public ImageLocation getStrippedLocation() {
        return this.strippedLocation;
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, String str2, Object obj, int i) {
        setImage(imageLocation, str, null, null, drawable, 0, str2, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, int i, String str2, Object obj, int i2) {
        setImage(imageLocation, str, null, null, drawable, i, str2, obj, i2);
    }

    public void setImage(String str, String str2, Drawable drawable, String str3, int i) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, i, str3, null, 1);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, String str3, Object obj, int i) {
        setImage(imageLocation, str, imageLocation2, str2, null, 0, str3, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, int i, String str3, Object obj, int i2) {
        setImage(imageLocation, str, imageLocation2, str2, null, i, str3, obj, i2);
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable) {
        setForUserOrChat(tLObject, drawable, null);
    }

    public void setForUserOrChat(org.telegram.tgnet.TLObject r10, android.graphics.drawable.Drawable r11, java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.setForUserOrChat(org.telegram.tgnet.TLObject, android.graphics.drawable.Drawable, java.lang.Object):void");
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj, int i) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, 0, null, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, int i, String str3, Object obj, int i2) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, i, str3, obj, i2);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, Drawable drawable, int i, String str4, Object obj, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str5;
        String str6;
        SetImageBackup setImageBackup;
        ImageLocation imageLocation4 = imageLocation;
        ImageLocation imageLocation5 = imageLocation2;
        if (!this.ignoreImageSet) {
            if (this.crossfadeWithOldImage && (setImageBackup = this.setImageBackup) != null && setImageBackup.isWebfileSet()) {
                setBackupImage();
            }
            SetImageBackup setImageBackup2 = this.setImageBackup;
            if (setImageBackup2 != null) {
                setImageBackup2.clear();
            }
            boolean z5 = true;
            if (imageLocation5 == null && imageLocation3 == null && imageLocation4 == null) {
                for (int i3 = 0; i3 < 4; i3++) {
                    recycleBitmap(null, i3);
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
                this.staticThumbDrawable = drawable;
                this.currentAlpha = 1.0f;
                this.previousAlpha = 1.0f;
                this.currentSize = 0;
                if (drawable instanceof SvgHelper.SvgDrawable) {
                    ((SvgHelper.SvgDrawable) drawable).setParent(this);
                }
                ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
                View view = this.parentView;
                if (view != null) {
                    if (this.invalidateAll) {
                        view.invalidate();
                    } else {
                        float f = this.imageX;
                        float f2 = this.imageY;
                        view.invalidate((int) f, (int) f2, (int) (f + this.imageW), (int) (f2 + this.imageH));
                    }
                }
                ImageReceiverDelegate imageReceiverDelegate = this.delegate;
                if (imageReceiverDelegate != null) {
                    Drawable drawable2 = this.currentImageDrawable;
                    boolean z6 = (drawable2 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
                    if (!(drawable2 == null && this.currentMediaDrawable == null)) {
                        z5 = false;
                    }
                    imageReceiverDelegate.didSetImage(this, z6, z5, false);
                    return;
                }
                return;
            }
            String key = imageLocation5 != null ? imageLocation5.getKey(obj, null, false) : null;
            if (key == null && imageLocation5 != null) {
                imageLocation5 = null;
            }
            this.currentKeyQuality = false;
            if (key == null && this.needsQualityThumb && ((obj instanceof MessageObject) || this.qulityThumbDocument != null)) {
                TLRPC$Document tLRPC$Document = this.qulityThumbDocument;
                if (tLRPC$Document == null) {
                    tLRPC$Document = ((MessageObject) obj).getDocument();
                }
                if (!(tLRPC$Document == null || tLRPC$Document.dc_id == 0 || tLRPC$Document.id == 0)) {
                    key = "q_" + tLRPC$Document.dc_id + "_" + tLRPC$Document.id;
                    this.currentKeyQuality = true;
                }
            }
            if (!(key == null || str2 == null)) {
                key = key + "@" + str2;
            }
            if (this.uniqKeyPrefix != null) {
                key = this.uniqKeyPrefix + key;
            }
            String key2 = imageLocation4 != null ? imageLocation4.getKey(obj, null, false) : null;
            if (key2 == null && imageLocation4 != null) {
                imageLocation4 = null;
            }
            if (!(key2 == null || str == null)) {
                key2 = key2 + "@" + str;
            }
            if ((key2 == null && (str6 = this.currentImageKey) != null && str6.equals(key)) || ((str5 = this.currentMediaKey) != null && str5.equals(key2))) {
                ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
                if (imageReceiverDelegate2 != null) {
                    Drawable drawable3 = this.currentImageDrawable;
                    boolean z7 = (drawable3 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
                    if (drawable3 == null && this.currentMediaDrawable == null) {
                        z4 = false;
                        z3 = true;
                    } else {
                        z4 = false;
                        z3 = false;
                    }
                    imageReceiverDelegate2.didSetImage(this, z7, z3, z4);
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
            if (!(key3 == null || str3 == null)) {
                key3 = key3 + "@" + str3;
            }
            if (this.crossfadeWithOldImage) {
                Drawable drawable4 = this.currentMediaDrawable;
                if (drawable4 != null) {
                    if (drawable4 instanceof AnimatedFileDrawable) {
                        ((AnimatedFileDrawable) drawable4).stop();
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
                    recycleBitmap(key, 0);
                    recycleBitmap(null, 2);
                    recycleBitmap(key2, 3);
                    this.crossfadeShader = this.thumbShader;
                    this.crossfadeImage = this.currentThumbDrawable;
                    this.crossfadeKey = this.currentThumbKey;
                    this.crossfadingWithThumb = false;
                    this.currentThumbDrawable = null;
                    this.currentThumbKey = null;
                } else if (this.staticThumbDrawable != null) {
                    recycleBitmap(key, 0);
                    recycleBitmap(key3, 1);
                    recycleBitmap(null, 2);
                    recycleBitmap(key2, 3);
                    this.crossfadeShader = this.thumbShader;
                    this.crossfadeImage = this.staticThumbDrawable;
                    this.crossfadingWithThumb = false;
                    this.crossfadeKey = null;
                    this.currentThumbDrawable = null;
                    this.currentThumbKey = null;
                } else {
                    recycleBitmap(key, 0);
                    recycleBitmap(key3, 1);
                    recycleBitmap(null, 2);
                    recycleBitmap(key2, 3);
                    this.crossfadeShader = null;
                }
            } else {
                recycleBitmap(key, 0);
                recycleBitmap(key3, 1);
                recycleBitmap(null, 2);
                recycleBitmap(key2, 3);
                this.crossfadeShader = null;
            }
            this.currentImageLocation = imageLocation5;
            this.currentImageFilter = str2;
            this.currentImageKey = key;
            this.currentMediaLocation = imageLocation4;
            this.currentMediaFilter = str;
            this.currentMediaKey = key2;
            this.currentThumbLocation = imageLocation3;
            this.currentThumbFilter = str3;
            this.currentThumbKey = key3;
            this.currentParentObject = obj;
            this.currentExt = str4;
            this.currentSize = i;
            this.currentCacheType = i2;
            this.staticThumbDrawable = drawable;
            this.imageShader = null;
            this.composeShader = null;
            this.thumbShader = null;
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
            Drawable drawable5 = this.staticThumbDrawable;
            if (drawable5 instanceof SvgHelper.SvgDrawable) {
                ((SvgHelper.SvgDrawable) drawable5).setParent(this);
            }
            updateDrawableRadius(this.staticThumbDrawable);
            ImageReceiverDelegate imageReceiverDelegate3 = this.delegate;
            if (imageReceiverDelegate3 != null) {
                Drawable drawable6 = this.currentImageDrawable;
                boolean z8 = (drawable6 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
                if (drawable6 == null && this.currentMediaDrawable == null) {
                    z2 = false;
                    z = true;
                } else {
                    z2 = false;
                    z = false;
                }
                imageReceiverDelegate3.didSetImage(this, z8, z, z2);
            }
            ImageLoader.getInstance().loadImageForImageReceiver(this);
            View view2 = this.parentView;
            if (view2 != null) {
                if (this.invalidateAll) {
                    view2.invalidate();
                } else {
                    float f3 = this.imageX;
                    float f4 = this.imageY;
                    view2.invalidate((int) f3, (int) f4, (int) (f3 + this.imageW), (int) (f4 + this.imageH));
                }
            }
            this.isRoundVideo = (obj instanceof MessageObject) && ((MessageObject) obj).isRoundVideo();
        }
    }

    public boolean canInvertBitmap() {
        return (this.currentMediaDrawable instanceof ExtendedBitmapDrawable) || (this.currentImageDrawable instanceof ExtendedBitmapDrawable) || (this.currentThumbDrawable instanceof ExtendedBitmapDrawable) || (this.staticThumbDrawable instanceof ExtendedBitmapDrawable);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public void setDelegate(ImageReceiverDelegate imageReceiverDelegate) {
        this.delegate = imageReceiverDelegate;
    }

    public void setPressed(int i) {
        this.isPressed = i;
    }

    public boolean getPressed() {
        return this.isPressed != 0;
    }

    public void setOrientation(int i, boolean z) {
        while (i < 0) {
            i += 360;
        }
        while (i > 360) {
            i -= 360;
        }
        this.thumbOrientation = i;
        this.imageOrientation = i;
        this.centerRotation = z;
    }

    public void setInvalidateAll(boolean z) {
        this.invalidateAll = z;
    }

    public Drawable getStaticThumb() {
        return this.staticThumbDrawable;
    }

    public int getAnimatedOrientation() {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            return animation.getOrientation();
        }
        return 0;
    }

    public int getOrientation() {
        return this.imageOrientation;
    }

    public void setLayerNum(int i) {
        this.currentLayerNum = i;
    }

    public void setImageBitmap(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = null;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        }
        setImageBitmap(bitmapDrawable);
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
            this.crossfadeShader = this.thumbShader;
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
            ((RecyclableDrawable) drawable2).recycle();
        }
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            animatedFileDrawable.setParentView(this.parentView);
            if (this.attachedToWindow) {
                animatedFileDrawable.addParent(this.parentView);
            }
            animatedFileDrawable.setUseSharedQueue(this.useSharedAnimationQueue || animatedFileDrawable.isWebmSticker);
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animatedFileDrawable.start();
            }
            animatedFileDrawable.setAllowDecodeSingleFrame(this.allowDecodeSingleFrame);
        } else if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            rLottieDrawable.addParentView(this.parentView);
            if (this.allowStartLottieAnimation && (!rLottieDrawable.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
                rLottieDrawable.start();
            }
            rLottieDrawable.setAllowDecodeSingleFrame(true);
        }
        this.thumbShader = null;
        this.roundPaint.setShader(null);
        this.staticThumbDrawable = drawable;
        updateDrawableRadius(drawable);
        this.currentMediaLocation = null;
        this.currentMediaFilter = null;
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
        this.currentSize = 0;
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
        View view = this.parentView;
        if (view != null) {
            if (this.invalidateAll) {
                view.invalidate();
            } else {
                float f = this.imageX;
                float f2 = this.imageY;
                view.invalidate((int) f, (int) f2, (int) (f + this.imageW), (int) (f2 + this.imageH));
            }
        }
        if (this.forceCrossfade && this.crossfadeWithOldImage && this.crossfadeImage != null) {
            this.currentAlpha = 0.0f;
            this.lastUpdateAlphaTime = System.currentTimeMillis();
            if (this.currentThumbDrawable == null && this.staticThumbDrawable == null) {
                z = false;
            }
            this.crossfadeWithThumb = z;
        }
    }

    private void setDrawableShader(Drawable drawable, BitmapShader bitmapShader) {
        if (drawable == this.currentThumbDrawable || drawable == this.staticThumbDrawable) {
            this.thumbShader = bitmapShader;
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

    private void updateDrawableRadius(Drawable drawable) {
        if (drawable != null) {
            if ((hasRoundRadius() || this.gradientShader != null) && (drawable instanceof BitmapDrawable)) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (!(bitmapDrawable instanceof RLottieDrawable)) {
                    if (bitmapDrawable instanceof AnimatedFileDrawable) {
                        ((AnimatedFileDrawable) drawable).setRoundRadius(this.roundRadius);
                    } else if (bitmapDrawable.getBitmap() != null) {
                        Bitmap bitmap = bitmapDrawable.getBitmap();
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        setDrawableShader(drawable, new BitmapShader(bitmap, tileMode, tileMode));
                    }
                }
            } else {
                setDrawableShader(drawable, null);
            }
        }
    }

    public void clearImage() {
        for (int i = 0; i < 4; i++) {
            recycleBitmap(null, i);
        }
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
    }

    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
        if (!(this.currentImageLocation == null && this.currentMediaLocation == null && this.currentThumbLocation == null && this.staticThumbDrawable == null)) {
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
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReplacedPhotoInMemCache);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.stopAllHeavyOperations);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.startAllHeavyOperations);
        if (this.staticThumbDrawable != null) {
            this.staticThumbDrawable = null;
            this.thumbShader = null;
            this.roundPaint.setShader(null);
        }
        clearImage();
        if (this.isPressed == 0) {
            this.pressedProgress = 0.0f;
        }
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.removeParent(this.parentView);
        }
    }

    private boolean setBackupImage() {
        SetImageBackup setImageBackup = this.setImageBackup;
        if (setImageBackup == null || !setImageBackup.isSet()) {
            return false;
        }
        SetImageBackup setImageBackup2 = this.setImageBackup;
        this.setImageBackup = null;
        setImage(setImageBackup2.mediaLocation, setImageBackup2.mediaFilter, setImageBackup2.imageLocation, setImageBackup2.imageFilter, setImageBackup2.thumbLocation, setImageBackup2.thumbFilter, setImageBackup2.thumb, setImageBackup2.size, setImageBackup2.ext, setImageBackup2.parentObject, setImageBackup2.cacheType);
        setImageBackup2.clear();
        this.setImageBackup = setImageBackup2;
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation == null || !this.allowStartLottieAnimation) {
            return true;
        }
        if (lottieAnimation.isHeavyDrawable() && this.currentOpenedLayerFlags != 0) {
            return true;
        }
        lottieAnimation.start();
        return true;
    }

    public boolean onAttachedToWindow() {
        View view;
        this.attachedToWindow = true;
        int currentHeavyOperationFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags();
        this.currentOpenedLayerFlags = currentHeavyOperationFlags;
        this.currentOpenedLayerFlags = currentHeavyOperationFlags & (this.currentLayerNum ^ (-1));
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReplacedPhotoInMemCache);
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i = NotificationCenter.stopAllHeavyOperations;
        globalInstance.addObserver(this, i);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.startAllHeavyOperations);
        if (setBackupImage()) {
            return true;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && this.allowStartLottieAnimation && (!lottieAnimation.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
            lottieAnimation.start();
        }
        AnimatedFileDrawable animation = getAnimation();
        if (!(animation == null || (view = this.parentView) == null)) {
            animation.addParent(view);
        }
        if (animation != null && this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
            animation.start();
            View view2 = this.parentView;
            if (view2 != null) {
                view2.invalidate();
            }
        }
        if (NotificationCenter.getGlobalInstance().isAnimationInProgress()) {
            didReceivedNotification(i, this.currentAccount, 512);
        }
        return false;
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2) {
        if (this.isPressed == 0) {
            float f = this.pressedProgress;
            if (f != 0.0f) {
                float f2 = f - 0.10666667f;
                this.pressedProgress = f2;
                if (f2 < 0.0f) {
                    this.pressedProgress = 0.0f;
                }
                View view = this.parentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        int i3 = this.isPressed;
        if (i3 != 0) {
            this.pressedProgress = 1.0f;
            this.animateFromIsPressed = i3;
        }
        float f3 = this.pressedProgress;
        if (f3 == 0.0f || f3 == 1.0f) {
            drawDrawable(canvas, drawable, i, bitmapShader, i2, i3);
            return;
        }
        drawDrawable(canvas, drawable, i, bitmapShader, i2, i3);
        drawDrawable(canvas, drawable, (int) (i * this.pressedProgress), bitmapShader, i2, this.animateFromIsPressed);
    }

    public void setUseRoundForThumbDrawable(boolean z) {
        this.useRoundForThumb = z;
    }

    private void drawDrawable(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3) {
        Paint paint;
        int i4;
        int i5;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapShader != null) {
                paint = this.roundPaint;
            } else {
                paint = bitmapDrawable.getPaint();
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 29) {
                Object obj = this.blendMode;
                if (obj == null || this.gradientShader != null) {
                    paint.setBlendMode(null);
                } else {
                    paint.setBlendMode((BlendMode) obj);
                }
            }
            boolean z = (paint == null || paint.getColorFilter() == null) ? false : true;
            if (!z || i3 != 0) {
                if (!z && i3 != 0) {
                    if (i3 == 1) {
                        if (bitmapShader != null) {
                            this.roundPaint.setColorFilter(selectedColorFilter);
                        } else {
                            bitmapDrawable.setColorFilter(selectedColorFilter);
                        }
                    } else if (bitmapShader != null) {
                        this.roundPaint.setColorFilter(selectedGroupColorFilter);
                    } else {
                        bitmapDrawable.setColorFilter(selectedGroupColorFilter);
                    }
                }
            } else if (bitmapShader != null) {
                this.roundPaint.setColorFilter(null);
            } else if (this.staticThumbDrawable != drawable) {
                bitmapDrawable.setColorFilter(null);
            }
            ColorFilter colorFilter = this.colorFilter;
            if (colorFilter != null && this.gradientShader == null) {
                if (bitmapShader != null) {
                    this.roundPaint.setColorFilter(colorFilter);
                } else {
                    bitmapDrawable.setColorFilter(colorFilter);
                }
            }
            boolean z2 = bitmapDrawable instanceof AnimatedFileDrawable;
            if (z2 || (bitmapDrawable instanceof RLottieDrawable)) {
                int i7 = i2 % 360;
                if (i7 == 90 || i7 == 270) {
                    i5 = bitmapDrawable.getIntrinsicHeight();
                    i4 = bitmapDrawable.getIntrinsicWidth();
                } else {
                    i5 = bitmapDrawable.getIntrinsicWidth();
                    i4 = bitmapDrawable.getIntrinsicHeight();
                }
            } else {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (bitmap == null || !bitmap.isRecycled()) {
                    int i8 = i2 % 360;
                    if (i8 == 90 || i8 == 270) {
                        i5 = bitmap.getHeight();
                        i4 = bitmap.getWidth();
                    } else {
                        i5 = bitmap.getWidth();
                        i4 = bitmap.getHeight();
                    }
                } else {
                    return;
                }
            }
            float f = this.imageW;
            float f2 = this.sideClip;
            float f3 = f - (f2 * 2.0f);
            float f4 = this.imageH;
            float f5 = f4 - (f2 * 2.0f);
            float f6 = f == 0.0f ? 1.0f : i5 / f3;
            float f7 = f4 == 0.0f ? 1.0f : i4 / f5;
            if (bitmapShader != null) {
                if (this.isAspectFit) {
                    float max = Math.max(f6, f7);
                    RectF rectF = this.drawRegion;
                    float f8 = this.imageX;
                    float f9 = this.imageW;
                    float f10 = (int) (i5 / max);
                    float f11 = this.imageY;
                    float f12 = this.imageH;
                    float f13 = (int) (i4 / max);
                    rectF.set(((f9 - f10) / 2.0f) + f8, f11 + ((f12 - f13) / 2.0f), f8 + ((f9 + f10) / 2.0f), f11 + ((f12 + f13) / 2.0f));
                    if (this.isVisible) {
                        this.roundPaint.setShader(bitmapShader);
                        this.shaderMatrix.reset();
                        Matrix matrix = this.shaderMatrix;
                        RectF rectF2 = this.drawRegion;
                        matrix.setTranslate(rectF2.left, rectF2.top);
                        float f14 = 1.0f / max;
                        this.shaderMatrix.preScale(f14, f14);
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        this.roundPaint.setAlpha(i);
                        this.roundRect.set(this.drawRegion);
                        if (this.isRoundRect) {
                            try {
                                if (this.roundRadius[0] == 0) {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                } else {
                                    canvas.drawRoundRect(this.roundRect, iArr3[0], iArr3[0], this.roundPaint);
                                }
                            } catch (Exception e) {
                                onBitmapException(bitmapDrawable);
                                FileLog.e(e);
                            }
                        } else {
                            int i9 = 0;
                            while (true) {
                                if (i9 < this.roundRadius.length) {
                                    float[] fArr = radii;
                                    int i10 = i9 * 2;
                                    fArr[i10] = iArr4[i9];
                                    fArr[i10 + 1] = iArr4[i9];
                                    i9++;
                                } else {
                                    this.roundPath.reset();
                                    this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                                    this.roundPath.close();
                                    canvas.drawPath(this.roundPath, this.roundPaint);
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    if (this.legacyCanvas != null) {
                        this.roundRect.set(0.0f, 0.0f, this.legacyBitmap.getWidth(), this.legacyBitmap.getHeight());
                        this.legacyCanvas.drawBitmap(this.gradientBitmap, (Rect) null, this.roundRect, (Paint) null);
                        this.legacyCanvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, this.roundRect, this.legacyPaint);
                    }
                    if (bitmapShader != this.imageShader || this.gradientShader == null) {
                        this.roundPaint.setShader(bitmapShader);
                    } else {
                        ComposeShader composeShader = this.composeShader;
                        if (composeShader != null) {
                            this.roundPaint.setShader(composeShader);
                        } else {
                            this.roundPaint.setShader(this.legacyShader);
                        }
                    }
                    float min = 1.0f / Math.min(f6, f7);
                    RectF rectF3 = this.roundRect;
                    float f15 = this.imageX;
                    float f16 = this.sideClip;
                    float f17 = this.imageY;
                    rectF3.set(f15 + f16, f17 + f16, (f15 + this.imageW) - f16, (f17 + this.imageH) - f16);
                    if (Math.abs(f6 - f7) > 5.0E-4f) {
                        float f18 = i5 / f7;
                        if (f18 > f3) {
                            RectF rectF4 = this.drawRegion;
                            float f19 = this.imageX;
                            float f20 = (int) f18;
                            float f21 = this.imageY;
                            rectF4.set(f19 - ((f20 - f3) / 2.0f), f21, f19 + ((f20 + f3) / 2.0f), f21 + f5);
                        } else {
                            RectF rectF5 = this.drawRegion;
                            float f22 = this.imageX;
                            float f23 = this.imageY;
                            float f24 = (int) (i4 / f6);
                            rectF5.set(f22, f23 - ((f24 - f5) / 2.0f), f22 + f3, f23 + ((f24 + f5) / 2.0f));
                        }
                    } else {
                        RectF rectF6 = this.drawRegion;
                        float f25 = this.imageX;
                        float f26 = this.imageY;
                        rectF6.set(f25, f26, f25 + f3, f26 + f5);
                    }
                    if (this.isVisible) {
                        this.shaderMatrix.reset();
                        Matrix matrix2 = this.shaderMatrix;
                        RectF rectF7 = this.drawRegion;
                        float f27 = rectF7.left;
                        float f28 = this.sideClip;
                        matrix2.setTranslate(f27 + f28, rectF7.top + f28);
                        if (i2 == 90) {
                            this.shaderMatrix.preRotate(90.0f);
                            this.shaderMatrix.preTranslate(0.0f, -this.drawRegion.width());
                        } else if (i2 == 180) {
                            this.shaderMatrix.preRotate(180.0f);
                            this.shaderMatrix.preTranslate(-this.drawRegion.width(), -this.drawRegion.height());
                        } else if (i2 == 270) {
                            this.shaderMatrix.preRotate(270.0f);
                            this.shaderMatrix.preTranslate(-this.drawRegion.height(), 0.0f);
                        }
                        this.shaderMatrix.preScale(min, min);
                        if (this.isRoundVideo) {
                            float f29 = (f3 + (AndroidUtilities.roundMessageInset * 2)) / f3;
                            this.shaderMatrix.postScale(f29, f29, this.drawRegion.centerX(), this.drawRegion.centerY());
                        }
                        BitmapShader bitmapShader2 = this.legacyShader;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(this.shaderMatrix);
                        }
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        if (this.composeShader != null) {
                            int width = this.gradientBitmap.getWidth();
                            int height = this.gradientBitmap.getHeight();
                            float f30 = this.imageW == 0.0f ? 1.0f : width / f3;
                            float f31 = this.imageH == 0.0f ? 1.0f : height / f5;
                            if (Math.abs(f30 - f31) > 5.0E-4f) {
                                float f32 = width / f31;
                                if (f32 > f3) {
                                    width = (int) f32;
                                    RectF rectF8 = this.drawRegion;
                                    float f33 = this.imageX;
                                    float f34 = width;
                                    float f35 = this.imageY;
                                    rectF8.set(f33 - ((f34 - f3) / 2.0f), f35, f33 + ((f34 + f3) / 2.0f), f35 + f5);
                                } else {
                                    height = (int) (height / f30);
                                    RectF rectF9 = this.drawRegion;
                                    float f36 = this.imageX;
                                    float f37 = this.imageY;
                                    float f38 = height;
                                    rectF9.set(f36, f37 - ((f38 - f5) / 2.0f), f36 + f3, f37 + ((f38 + f5) / 2.0f));
                                }
                            } else {
                                RectF rectF10 = this.drawRegion;
                                float f39 = this.imageX;
                                float f40 = this.imageY;
                                rectF10.set(f39, f40, f39 + f3, f40 + f5);
                            }
                            float min2 = 1.0f / Math.min(this.imageW == 0.0f ? 1.0f : width / f3, this.imageH == 0.0f ? 1.0f : height / f5);
                            this.shaderMatrix.reset();
                            Matrix matrix3 = this.shaderMatrix;
                            RectF rectF11 = this.drawRegion;
                            float f41 = rectF11.left;
                            float f42 = this.sideClip;
                            matrix3.setTranslate(f41 + f42, rectF11.top + f42);
                            this.shaderMatrix.preScale(min2, min2);
                            this.gradientShader.setLocalMatrix(this.shaderMatrix);
                        }
                        this.roundPaint.setAlpha(i);
                        if (this.isRoundRect) {
                            try {
                                if (this.roundRadius[0] == 0) {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                } else {
                                    canvas.drawRoundRect(this.roundRect, iArr[0], iArr[0], this.roundPaint);
                                }
                            } catch (Exception e2) {
                                onBitmapException(bitmapDrawable);
                                FileLog.e(e2);
                            }
                        } else {
                            int i11 = 0;
                            while (true) {
                                if (i11 < this.roundRadius.length) {
                                    float[] fArr2 = radii;
                                    int i12 = i11 * 2;
                                    fArr2[i12] = iArr2[i11];
                                    fArr2[i12 + 1] = iArr2[i11];
                                    i11++;
                                } else {
                                    this.roundPath.reset();
                                    this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                                    this.roundPath.close();
                                    canvas.drawPath(this.roundPath, this.roundPaint);
                                    return;
                                }
                            }
                        }
                    }
                }
            } else if (this.isAspectFit) {
                float max2 = Math.max(f6, f7);
                canvas.save();
                RectF rectF12 = this.drawRegion;
                float f43 = this.imageX;
                float f44 = this.imageW;
                float f45 = (int) (i5 / max2);
                float f46 = this.imageY;
                float f47 = this.imageH;
                float f48 = (int) (i4 / max2);
                rectF12.set(((f44 - f45) / 2.0f) + f43, ((f47 - f48) / 2.0f) + f46, f43 + ((f44 + f45) / 2.0f), f46 + ((f47 + f48) / 2.0f));
                RectF rectF13 = this.drawRegion;
                bitmapDrawable.setBounds((int) rectF13.left, (int) rectF13.top, (int) rectF13.right, (int) rectF13.bottom);
                if (bitmapDrawable instanceof AnimatedFileDrawable) {
                    RectF rectF14 = this.drawRegion;
                    ((AnimatedFileDrawable) bitmapDrawable).setActualDrawRect(rectF14.left, rectF14.top, rectF14.width(), this.drawRegion.height());
                }
                if (this.isVisible) {
                    try {
                        bitmapDrawable.setAlpha(i);
                        bitmapDrawable.draw(canvas);
                    } catch (Exception e3) {
                        onBitmapException(bitmapDrawable);
                        FileLog.e(e3);
                    }
                }
                canvas.restore();
            } else if (Math.abs(f6 - f7) > 1.0E-5f) {
                canvas.save();
                float f49 = this.imageX;
                float f50 = this.imageY;
                canvas.clipRect(f49, f50, this.imageW + f49, this.imageH + f50);
                int i13 = i2 % 360;
                if (i13 != 0) {
                    if (this.centerRotation) {
                        canvas.rotate(i2, this.imageW / 2.0f, this.imageH / 2.0f);
                    } else {
                        canvas.rotate(i2, 0.0f, 0.0f);
                    }
                }
                float f51 = i5 / f7;
                float f52 = this.imageW;
                if (f51 > f52) {
                    RectF rectF15 = this.drawRegion;
                    float f53 = this.imageX;
                    float f54 = (int) f51;
                    float f55 = this.imageY;
                    rectF15.set(f53 - ((f54 - f52) / 2.0f), f55, f53 + ((f54 + f52) / 2.0f), this.imageH + f55);
                } else {
                    RectF rectF16 = this.drawRegion;
                    float f56 = this.imageX;
                    float f57 = this.imageY;
                    float f58 = (int) (i4 / f6);
                    float f59 = this.imageH;
                    rectF16.set(f56, f57 - ((f58 - f59) / 2.0f), f52 + f56, f57 + ((f58 + f59) / 2.0f));
                }
                if (z2) {
                    ((AnimatedFileDrawable) bitmapDrawable).setActualDrawRect(this.imageX, this.imageY, this.imageW, this.imageH);
                }
                if (i13 == 90 || i13 == 270) {
                    float width2 = this.drawRegion.width() / 2.0f;
                    float height2 = this.drawRegion.height() / 2.0f;
                    float centerX = this.drawRegion.centerX();
                    float centerY = this.drawRegion.centerY();
                    bitmapDrawable.setBounds((int) (centerX - height2), (int) (centerY - width2), (int) (centerX + height2), (int) (centerY + width2));
                } else {
                    RectF rectF17 = this.drawRegion;
                    bitmapDrawable.setBounds((int) rectF17.left, (int) rectF17.top, (int) rectF17.right, (int) rectF17.bottom);
                }
                if (this.isVisible) {
                    if (i6 >= 29) {
                        try {
                            if (this.blendMode != null) {
                                bitmapDrawable.getPaint().setBlendMode((BlendMode) this.blendMode);
                            } else {
                                bitmapDrawable.getPaint().setBlendMode(null);
                            }
                        } catch (Exception e4) {
                            onBitmapException(bitmapDrawable);
                            FileLog.e(e4);
                        }
                    }
                    bitmapDrawable.setAlpha(i);
                    bitmapDrawable.draw(canvas);
                }
                canvas.restore();
            } else {
                canvas.save();
                int i14 = i2 % 360;
                if (i14 != 0) {
                    if (this.centerRotation) {
                        canvas.rotate(i2, this.imageW / 2.0f, this.imageH / 2.0f);
                    } else {
                        canvas.rotate(i2, 0.0f, 0.0f);
                    }
                }
                RectF rectF18 = this.drawRegion;
                float f60 = this.imageX;
                float f61 = this.imageY;
                rectF18.set(f60, f61, this.imageW + f60, this.imageH + f61);
                if (this.isRoundVideo) {
                    RectF rectF19 = this.drawRegion;
                    int i15 = AndroidUtilities.roundMessageInset;
                    rectF19.inset(-i15, -i15);
                }
                if (z2) {
                    ((AnimatedFileDrawable) bitmapDrawable).setActualDrawRect(this.imageX, this.imageY, this.imageW, this.imageH);
                }
                if (i14 == 90 || i14 == 270) {
                    float width3 = this.drawRegion.width() / 2.0f;
                    float height3 = this.drawRegion.height() / 2.0f;
                    float centerX2 = this.drawRegion.centerX();
                    float centerY2 = this.drawRegion.centerY();
                    bitmapDrawable.setBounds((int) (centerX2 - height3), (int) (centerY2 - width3), (int) (centerX2 + height3), (int) (centerY2 + width3));
                } else {
                    RectF rectF20 = this.drawRegion;
                    bitmapDrawable.setBounds((int) rectF20.left, (int) rectF20.top, (int) rectF20.right, (int) rectF20.bottom);
                }
                if (this.isVisible) {
                    if (i6 >= 29) {
                        try {
                            if (this.blendMode != null) {
                                bitmapDrawable.getPaint().setBlendMode((BlendMode) this.blendMode);
                            } else {
                                bitmapDrawable.getPaint().setBlendMode(null);
                            }
                        } catch (Exception e5) {
                            onBitmapException(bitmapDrawable);
                            FileLog.e(e5);
                        }
                    }
                    bitmapDrawable.setAlpha(i);
                    bitmapDrawable.draw(canvas);
                }
                canvas.restore();
            }
        } else {
            if (this.isAspectFit) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float f62 = this.imageW;
                float f63 = this.sideClip;
                float f64 = f62 - (f63 * 2.0f);
                float f65 = this.imageH;
                float max3 = Math.max(f62 == 0.0f ? 1.0f : intrinsicWidth / f64, f65 == 0.0f ? 1.0f : intrinsicHeight / (f65 - (f63 * 2.0f)));
                RectF rectF21 = this.drawRegion;
                float f66 = this.imageX;
                float f67 = this.imageW;
                float f68 = (int) (intrinsicWidth / max3);
                float f69 = this.imageY;
                float f70 = this.imageH;
                float f71 = (int) (intrinsicHeight / max3);
                rectF21.set(((f67 - f68) / 2.0f) + f66, ((f70 - f71) / 2.0f) + f69, f66 + ((f67 + f68) / 2.0f), f69 + ((f70 + f71) / 2.0f));
            } else {
                RectF rectF22 = this.drawRegion;
                float f72 = this.imageX;
                float f73 = this.imageY;
                rectF22.set(f72, f73, this.imageW + f72, this.imageH + f73);
            }
            RectF rectF23 = this.drawRegion;
            drawable.setBounds((int) rectF23.left, (int) rectF23.top, (int) rectF23.right, (int) rectF23.bottom);
            if (this.isVisible) {
                try {
                    drawable.setAlpha(i);
                    drawable.draw(canvas);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public void setBlendMode(Object obj) {
        this.blendMode = obj;
        invalidate();
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

    private void checkAlphaAnimation(boolean z) {
        if (!this.manualAlphaAnimator && this.currentAlpha != 1.0f) {
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis() - this.lastUpdateAlphaTime;
                if (currentTimeMillis > 18) {
                    currentTimeMillis = 18;
                }
                float f = this.currentAlpha + (((float) currentTimeMillis) / this.crossfadeDuration);
                this.currentAlpha = f;
                if (f > 1.0f) {
                    this.currentAlpha = 1.0f;
                    this.previousAlpha = 1.0f;
                    if (this.crossfadeImage != null) {
                        recycleBitmap(null, 2);
                        this.crossfadeShader = null;
                    }
                }
            }
            this.lastUpdateAlphaTime = System.currentTimeMillis();
            View view = this.parentView;
            if (view == null) {
                return;
            }
            if (this.invalidateAll) {
                view.invalidate();
                return;
            }
            float f2 = this.imageX;
            float f3 = this.imageY;
            view.invalidate((int) f2, (int) f3, (int) (f2 + this.imageW), (int) (f3 + this.imageH));
        }
    }

    public void skipDraw() {
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.setCurrentParentView(this.parentView);
            lottieAnimation.updateCurrentFrame();
        }
    }

    public boolean draw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.draw(android.graphics.Canvas):boolean");
    }

    public void setManualAlphaAnimator(boolean z) {
        this.manualAlphaAnimator = z;
    }

    @Keep
    public float getCurrentAlpha() {
        return this.currentAlpha;
    }

    @Keep
    public void setCurrentAlpha(float f) {
        this.currentAlpha = f;
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

    public Bitmap getBitmap() {
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && lottieAnimation.hasBitmap()) {
            return lottieAnimation.getAnimatedBitmap();
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

    public org.telegram.messenger.ImageReceiver.BitmapHolder getBitmapSafe() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.getBitmapSafe():org.telegram.messenger.ImageReceiver$BitmapHolder");
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
            drawable = drawable2;
            str = str2;
        } else {
            str = this.currentMediaKey;
        }
        if (drawable != null) {
            return new BitmapHolder(drawable, str, 0);
        }
        return null;
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
        String str;
        Bitmap bitmap;
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

    public int getBitmapWidth() {
        getDrawable();
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            int i = this.imageOrientation;
            return (i % 360 == 0 || i % 360 == 180) ? animation.getIntrinsicWidth() : animation.getIntrinsicHeight();
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.getIntrinsicWidth();
        }
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            Drawable drawable = this.staticThumbDrawable;
            if (drawable != null) {
                return drawable.getIntrinsicWidth();
            }
            return 1;
        }
        int i2 = this.imageOrientation;
        return (i2 % 360 == 0 || i2 % 360 == 180) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getBitmapHeight() {
        getDrawable();
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            int i = this.imageOrientation;
            return (i % 360 == 0 || i % 360 == 180) ? animation.getIntrinsicHeight() : animation.getIntrinsicWidth();
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            return lottieAnimation.getIntrinsicHeight();
        }
        Bitmap bitmap = getBitmap();
        if (bitmap == null) {
            Drawable drawable = this.staticThumbDrawable;
            if (drawable != null) {
                return drawable.getIntrinsicHeight();
            }
            return 1;
        }
        int i2 = this.imageOrientation;
        return (i2 % 360 == 0 || i2 % 360 == 180) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public void setVisible(boolean z, boolean z2) {
        if (this.isVisible != z) {
            this.isVisible = z;
            if (z2) {
                invalidate();
            }
        }
    }

    public void invalidate() {
        View view = this.parentView;
        if (view != null) {
            if (this.invalidateAll) {
                view.invalidate();
                return;
            }
            float f = this.imageX;
            float f2 = this.imageY;
            view.invalidate((int) f, (int) f2, (int) (f + this.imageW), (int) (f2 + this.imageH));
        }
    }

    public void getParentPosition(int[] iArr) {
        View view = this.parentView;
        if (view != null) {
            view.getLocationInWindow(iArr);
        }
    }

    public boolean getVisible() {
        return this.isVisible;
    }

    @Keep
    public void setAlpha(float f) {
        this.overrideAlpha = f;
    }

    @Keep
    public float getAlpha() {
        return this.overrideAlpha;
    }

    public void setCrossfadeAlpha(byte b) {
        this.crossfadeAlpha = b;
    }

    public boolean hasImageSet() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentImageKey == null && this.currentMediaKey == null) ? false : true;
    }

    public boolean hasBitmapImage() {
        return (this.currentImageDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasNotThumb() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasStaticThumb() {
        return this.staticThumbDrawable != null;
    }

    public void setAspectFit(boolean z) {
        this.isAspectFit = z;
    }

    public boolean isAspectFit() {
        return this.isAspectFit;
    }

    public void setParentView(View view) {
        this.parentView = view;
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.setParentView(this.parentView);
        }
    }

    public void setImageX(int i) {
        this.imageX = i;
    }

    public void setImageY(float f) {
        this.imageY = f;
    }

    public void setImageWidth(int i) {
        this.imageW = i;
    }

    public void setImageCoords(float f, float f2, float f3, float f4) {
        this.imageX = f;
        this.imageY = f2;
        this.imageW = f3;
        this.imageH = f4;
    }

    public void setSideClip(float f) {
        this.sideClip = f;
    }

    public float getCenterX() {
        return this.imageX + (this.imageW / 2.0f);
    }

    public float getCenterY() {
        return this.imageY + (this.imageH / 2.0f);
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

    public float getImageWidth() {
        return this.imageW;
    }

    public float getImageHeight() {
        return this.imageH;
    }

    public float getImageAspectRatio() {
        float f;
        float f2;
        if (this.imageOrientation % 180 != 0) {
            f2 = this.drawRegion.height();
            f = this.drawRegion.width();
        } else {
            f2 = this.drawRegion.width();
            f = this.drawRegion.height();
        }
        return f2 / f;
    }

    public String getExt() {
        return this.currentExt;
    }

    public boolean isInsideImage(float f, float f2) {
        float f3 = this.imageX;
        if (f >= f3 && f <= f3 + this.imageW) {
            float f4 = this.imageY;
            if (f2 >= f4 && f2 <= f4 + this.imageH) {
                return true;
            }
        }
        return false;
    }

    public RectF getDrawRegion() {
        return this.drawRegion;
    }

    public int getNewGuid() {
        int i = this.currentGuid + 1;
        this.currentGuid = i;
        return i;
    }

    public String getImageKey() {
        return this.currentImageKey;
    }

    public String getMediaKey() {
        return this.currentMediaKey;
    }

    public String getThumbKey() {
        return this.currentThumbKey;
    }

    public int getSize() {
        return this.currentSize;
    }

    public ImageLocation getMediaLocation() {
        return this.currentMediaLocation;
    }

    public ImageLocation getImageLocation() {
        return this.currentImageLocation;
    }

    public ImageLocation getThumbLocation() {
        return this.currentThumbLocation;
    }

    public String getMediaFilter() {
        return this.currentMediaFilter;
    }

    public String getImageFilter() {
        return this.currentImageFilter;
    }

    public String getThumbFilter() {
        return this.currentThumbFilter;
    }

    public int getCacheType() {
        return this.currentCacheType;
    }

    public void setForcePreview(boolean z) {
        this.forcePreview = z;
    }

    public void setForceCrossfade(boolean z) {
        this.forceCrossfade = z;
    }

    public boolean isForcePreview() {
        return this.forcePreview;
    }

    public void setRoundRadius(int i) {
        setRoundRadius(new int[]{i, i, i, i});
    }

    public void setRoundRadius(int i, int i2, int i3, int i4) {
        setRoundRadius(new int[]{i, i2, i3, i4});
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
            if (iArr2[i2] != iArr[i2]) {
                z = true;
            }
            if (i != iArr[i2]) {
                this.isRoundRect = false;
            }
            iArr2[i2] = iArr[i2];
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
                return;
            }
            Drawable drawable4 = this.staticThumbDrawable;
            if (drawable4 != null) {
                updateDrawableRadius(drawable4);
            }
        }
    }

    public void setCurrentAccount(int i) {
        this.currentAccount = i;
    }

    public int[] getRoundRadius() {
        return this.roundRadius;
    }

    public Object getParentObject() {
        return this.currentParentObject;
    }

    public void setNeedsQualityThumb(boolean z) {
        this.needsQualityThumb = z;
    }

    public void setQualityThumbDocument(TLRPC$Document tLRPC$Document) {
        this.qulityThumbDocument = tLRPC$Document;
    }

    public TLRPC$Document getQulityThumbDocument() {
        return this.qulityThumbDocument;
    }

    public void setCrossfadeWithOldImage(boolean z) {
        this.crossfadeWithOldImage = z;
    }

    public boolean isNeedsQualityThumb() {
        return this.needsQualityThumb;
    }

    public boolean isCurrentKeyQuality() {
        return this.currentKeyQuality;
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public void setShouldGenerateQualityThumb(boolean z) {
        this.shouldGenerateQualityThumb = z;
    }

    public boolean isShouldGenerateQualityThumb() {
        return this.shouldGenerateQualityThumb;
    }

    public void setAllowStartAnimation(boolean z) {
        this.allowStartAnimation = z;
    }

    public boolean getAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public void setAllowStartLottieAnimation(boolean z) {
        this.allowStartLottieAnimation = z;
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.allowDecodeSingleFrame = z;
    }

    public void setAutoRepeat(int i) {
        this.autoRepeat = i;
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.setAutoRepeat(i);
        }
    }

    public void setUseSharedAnimationQueue(boolean z) {
        this.useSharedAnimationQueue = z;
    }

    public boolean isAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public void startAnimation() {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.setUseSharedQueue(this.useSharedAnimationQueue);
            animation.start();
            return;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && !lottieAnimation.isRunning()) {
            lottieAnimation.restart();
        }
    }

    public void stopAnimation() {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.stop();
            return;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null && !lottieAnimation.isRunning()) {
            lottieAnimation.stop();
        }
    }

    public boolean isAnimationRunning() {
        AnimatedFileDrawable animation = getAnimation();
        return animation != null && animation.isRunning();
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

    public int getTag(int i) {
        if (i == 1) {
            return this.thumbTag;
        }
        if (i == 3) {
            return this.mediaTag;
        }
        return this.imageTag;
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

    public void setParam(int i) {
        this.param = i;
    }

    public int getParam() {
        return this.param;
    }

    public boolean setImageBitmapByKey(android.graphics.drawable.Drawable r8, java.lang.String r9, int r10, boolean r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ImageReceiver.setImageBitmapByKey(android.graphics.drawable.Drawable, java.lang.String, int, boolean, int):boolean");
    }

    public void setMediaStartEndTime(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof AnimatedFileDrawable) {
            ((AnimatedFileDrawable) drawable).setStartEndTime(j, j2);
        }
    }

    private void recycleBitmap(String str, int i) {
        Object obj;
        String str2;
        String replacedKey;
        if (i == 3) {
            str2 = this.currentMediaKey;
            obj = this.currentMediaDrawable;
        } else if (i == 2) {
            str2 = this.crossfadeKey;
            obj = this.crossfadeImage;
        } else if (i == 1) {
            str2 = this.currentThumbKey;
            obj = this.currentThumbDrawable;
        } else {
            str2 = this.currentImageKey;
            obj = this.currentImageDrawable;
        }
        if (str2 != null && ((str2.startsWith("-") || str2.startsWith("strippedmessage-")) && (replacedKey = ImageLoader.getInstance().getReplacedKey(str2)) != null)) {
            str2 = replacedKey;
        }
        if (obj instanceof RLottieDrawable) {
            ((RLottieDrawable) obj).removeParentView(this.parentView);
        }
        if (obj instanceof AnimatedFileDrawable) {
            ((AnimatedFileDrawable) obj).removeParent(this.parentView);
        }
        if (str2 != null && ((str == null || !str.equals(str2)) && obj != null)) {
            if (obj instanceof RLottieDrawable) {
                RLottieDrawable rLottieDrawable = (RLottieDrawable) obj;
                boolean decrementUseCount = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, true) && decrementUseCount) {
                    rLottieDrawable.recycle();
                }
            } else if (obj instanceof AnimatedFileDrawable) {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) obj;
                if (animatedFileDrawable.isWebmSticker) {
                    boolean decrementUseCount2 = ImageLoader.getInstance().decrementUseCount(str2);
                    if (!ImageLoader.getInstance().isInMemCache(str2, true)) {
                        if (decrementUseCount2) {
                            animatedFileDrawable.recycle();
                        }
                    } else if (decrementUseCount2) {
                        animatedFileDrawable.stop();
                    }
                } else {
                    animatedFileDrawable.recycle();
                }
            } else if (obj instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) obj).getBitmap();
                boolean decrementUseCount3 = ImageLoader.getInstance().decrementUseCount(str2);
                if (!ImageLoader.getInstance().isInMemCache(str2, false) && decrementUseCount3) {
                    bitmap.recycle();
                }
            }
        }
        if (i == 3) {
            this.currentMediaKey = null;
            this.currentMediaDrawable = null;
        } else if (i == 2) {
            this.crossfadeKey = null;
            this.crossfadeImage = null;
        } else if (i == 1) {
            this.currentThumbDrawable = null;
            this.currentThumbKey = null;
        } else {
            this.currentImageDrawable = null;
            this.currentImageKey = null;
        }
    }

    public void setCrossfadeDuration(int i) {
        this.crossfadeDuration = i;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        if (i == NotificationCenter.didReplacedPhotoInMemCache) {
            String str = (String) objArr[0];
            String str2 = this.currentMediaKey;
            if (str2 != null && str2.equals(str)) {
                this.currentMediaKey = (String) objArr[1];
                this.currentMediaLocation = (ImageLocation) objArr[2];
                SetImageBackup setImageBackup = this.setImageBackup;
                if (setImageBackup != null) {
                    setImageBackup.mediaLocation = (ImageLocation) objArr[2];
                }
            }
            String str3 = this.currentImageKey;
            if (str3 != null && str3.equals(str)) {
                this.currentImageKey = (String) objArr[1];
                this.currentImageLocation = (ImageLocation) objArr[2];
                SetImageBackup setImageBackup2 = this.setImageBackup;
                if (setImageBackup2 != null) {
                    setImageBackup2.imageLocation = (ImageLocation) objArr[2];
                }
            }
            String str4 = this.currentThumbKey;
            if (str4 != null && str4.equals(str)) {
                this.currentThumbKey = (String) objArr[1];
                this.currentThumbLocation = (ImageLocation) objArr[2];
                SetImageBackup setImageBackup3 = this.setImageBackup;
                if (setImageBackup3 != null) {
                    setImageBackup3.thumbLocation = (ImageLocation) objArr[2];
                }
            }
        } else if (i == NotificationCenter.stopAllHeavyOperations) {
            Integer num = (Integer) objArr[0];
            if (this.currentLayerNum < num.intValue()) {
                int intValue = num.intValue() | this.currentOpenedLayerFlags;
                this.currentOpenedLayerFlags = intValue;
                if (intValue != 0) {
                    RLottieDrawable lottieAnimation = getLottieAnimation();
                    if (lottieAnimation != null && lottieAnimation.isHeavyDrawable()) {
                        lottieAnimation.stop();
                    }
                    AnimatedFileDrawable animation = getAnimation();
                    if (animation != null) {
                        animation.stop();
                    }
                }
            }
        } else if (i == NotificationCenter.startAllHeavyOperations) {
            Integer num2 = (Integer) objArr[0];
            if (this.currentLayerNum < num2.intValue() && (i3 = this.currentOpenedLayerFlags) != 0) {
                int intValue2 = (num2.intValue() ^ (-1)) & i3;
                this.currentOpenedLayerFlags = intValue2;
                if (intValue2 == 0) {
                    RLottieDrawable lottieAnimation2 = getLottieAnimation();
                    if (this.allowStartLottieAnimation && lottieAnimation2 != null && lottieAnimation2.isHeavyDrawable()) {
                        lottieAnimation2.start();
                    }
                    AnimatedFileDrawable animation2 = getAnimation();
                    if (this.allowStartAnimation && animation2 != null) {
                        animation2.start();
                        View view = this.parentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                }
            }
        }
    }

    public void startCrossfadeFromStaticThumb(Bitmap bitmap) {
        this.currentThumbKey = null;
        this.currentThumbDrawable = null;
        this.thumbShader = null;
        this.roundPaint.setShader(null);
        BitmapDrawable bitmapDrawable = new BitmapDrawable((Resources) null, bitmap);
        this.staticThumbDrawable = bitmapDrawable;
        this.crossfadeWithThumb = true;
        this.currentAlpha = 0.0f;
        updateDrawableRadius(bitmapDrawable);
    }

    public void setUniqKeyPrefix(String str) {
        this.uniqKeyPrefix = str;
    }

    public String getUniqKeyPrefix() {
        return this.uniqKeyPrefix;
    }

    public void addLoadingImageRunnable(Runnable runnable) {
        this.loadingOperations.add(runnable);
    }

    public ArrayList<Runnable> getLoadingOperations() {
        return this.loadingOperations;
    }

    public void moveImageToFront() {
        ImageLoader.getInstance().moveToFront(this.currentImageKey);
        ImageLoader.getInstance().moveToFront(this.currentThumbKey);
    }
}
