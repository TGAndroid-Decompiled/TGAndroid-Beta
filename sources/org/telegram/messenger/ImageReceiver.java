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
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.AttachableDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ClipRoundedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LoadingStickerDrawable;
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

        protected abstract void onDraw(Canvas canvas, ImageReceiver imageReceiver);
    }

    public interface ImageReceiverDelegate {

        public abstract class CC {
            public static void $default$didSetImageBitmap(ImageReceiverDelegate imageReceiverDelegate, int i, String str, Drawable drawable) {
            }

            public static void $default$onAnimationReady(ImageReceiverDelegate imageReceiverDelegate, ImageReceiver imageReceiver) {
            }
        }

        void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3);

        void didSetImageBitmap(int i, String str, Drawable drawable);

        void onAnimationReady(ImageReceiver imageReceiver);
    }

    private boolean hasRoundRadius() {
        return true;
    }

    public void skipDraw() {
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

    public void setPreloadingReceivers(List<ImageReceiver> list) {
        this.preloadReceivers = list;
    }

    public Drawable getImageDrawable() {
        return this.currentImageDrawable;
    }

    public Drawable getMediaDrawable() {
        return this.currentMediaDrawable;
    }

    public void updateStaticDrawableThump(Bitmap bitmap) {
        this.staticThumbShader = null;
        this.roundPaint.setShader(null);
        setStaticDrawable(new BitmapDrawable(bitmap));
    }

    public void setAllowDrawWhileCacheGenerating(boolean z) {
        this.allowDrawWhileCacheGenerating = z;
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
    }

    private static class SetImageBackup {
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

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        selectedColorFilter = new PorterDuffColorFilter(-2236963, mode);
        selectedGroupColorFilter = new PorterDuffColorFilter(-4473925, mode);
        radii = new float[8];
    }

    public ImageReceiver() {
        this(null);
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
        this.invalidateRunnable = new ImageReceiver$$ExternalSyntheticLambda2(this);
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
        setImage(imageLocation, str, null, null, drawable, 0L, str2, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, Drawable drawable, long j, String str2, Object obj, int i) {
        setImage(imageLocation, str, null, null, drawable, j, str2, obj, i);
    }

    public void setImage(String str, String str2, Drawable drawable, String str3, long j) {
        setImage(ImageLocation.getForPath(str), str2, null, null, drawable, j, str3, null, 1);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, String str3, Object obj, int i) {
        setImage(imageLocation, str, imageLocation2, str2, null, 0L, str3, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, long j, String str3, Object obj, int i) {
        setImage(imageLocation, str, imageLocation2, str2, null, j, str3, obj, i);
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable) {
        setForUserOrChat(tLObject, drawable, null);
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj) {
        setForUserOrChat(tLObject, drawable, obj, false, 0, false);
    }

    public void setForUserOrChat(TLObject tLObject, Drawable drawable, Object obj, boolean z, int i, boolean z2) {
        Object obj2;
        BitmapDrawable bitmapDrawable;
        boolean z3;
        boolean z4;
        TLRPC.ChatPhoto chatPhoto;
        ?? r3;
        ImageLocation forUserOrChat;
        String str;
        Object obj3;
        Object vectorMarkupVideoSize;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.UserFull userFull;
        Object obj4 = obj == null ? tLObject : obj;
        setUseRoundForThumbDrawable(true);
        Object forPhoto = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            z3 = user.premium;
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            if (userProfilePhoto != null) {
                bitmapDrawable = userProfilePhoto.strippedBitmap;
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
                                TLRPC.VideoSize videoSize = arrayList.get(i2);
                                if ("p".equals(videoSize.type)) {
                                    closestVideoSizeWithSize = videoSize;
                                }
                                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                                    vectorMarkupVideoSize = videoSize;
                                }
                            }
                            forPhoto = ImageLocation.getForPhoto(closestVideoSizeWithSize, photo2);
                        }
                    }
                }
                obj3 = forPhoto;
                forPhoto = vectorMarkupVideoSize;
            } else {
                obj3 = null;
                bitmapDrawable = null;
                z4 = false;
            }
            Object obj5 = forPhoto;
            forPhoto = obj3;
            r3 = obj5;
        } else {
            if (!(tLObject instanceof TLRPC.Chat) || (chatPhoto = ((TLRPC.Chat) tLObject).photo) == null) {
                obj2 = null;
                bitmapDrawable = null;
            } else {
                BitmapDrawable bitmapDrawable2 = chatPhoto.strippedBitmap;
                if (chatPhoto.stripped_thumb != null) {
                    r3 = 0;
                    bitmapDrawable = bitmapDrawable2;
                    z3 = false;
                    z4 = true;
                } else {
                    obj2 = null;
                    bitmapDrawable = bitmapDrawable2;
                }
            }
            z3 = false;
            z4 = false;
            r3 = obj2;
        }
        if (r3 != 0 && i != 0) {
            setImageBitmap(new VectorAvatarThumbDrawable(r3, z3, i));
            return;
        }
        if (!z2) {
            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 1);
            str = "50_50";
        } else {
            forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 0);
            str = "100_100";
        }
        ImageLocation imageLocation = forUserOrChat;
        String str2 = str;
        if (forPhoto != null) {
            setImage(forPhoto, "avatar", imageLocation, str2, null, null, bitmapDrawable, 0L, null, obj4, 0);
            this.animatedFileDrawableRepeatMaxCount = 3;
        } else if (bitmapDrawable != null) {
            setImage(imageLocation, str2, bitmapDrawable, null, obj4, 0);
        } else if (z4) {
            setImage(imageLocation, str2, ImageLocation.getForUserOrChat(this.currentAccount, tLObject, 2), "50_50_b", drawable, obj4, 0);
        } else {
            setImage(imageLocation, str2, drawable, null, obj4, 0);
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

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, Object obj, int i) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, 0L, null, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, Drawable drawable, long j, String str3, Object obj, int i) {
        setImage(null, null, imageLocation, str, imageLocation2, str2, drawable, j, str3, obj, i);
    }

    public void setImage(ImageLocation imageLocation, String str, ImageLocation imageLocation2, String str2, ImageLocation imageLocation3, String str3, Drawable drawable, long j, String str4, Object obj, int i) {
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
        String str7 = key;
        if (str7 != null && str2 != null) {
            str7 = str7 + "@" + str2;
        }
        if (this.uniqKeyPrefix != null) {
            str7 = this.uniqKeyPrefix + str7;
        }
        String key2 = imageLocation4 != null ? imageLocation4.getKey(obj, null, false) : null;
        if (key2 == null && imageLocation4 != null) {
            imageLocation4 = null;
        }
        if (key2 != null && str != null) {
            key2 = key2 + "@" + str;
        }
        if (this.uniqKeyPrefix != null) {
            key2 = this.uniqKeyPrefix + key2;
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
            key3 = key3 + "@" + str3;
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
                    ((AnimatedFileDrawable) drawable4).stop();
                    ((AnimatedFileDrawable) this.currentMediaDrawable).removeParent(this);
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

    private void loadImage() {
        ImageLoader.getInstance().loadImageForImageReceiver(this, this.preloadReceivers);
        invalidate();
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
        setOrientation(i, 0, z);
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

    public int getInvert() {
        return this.imageInvert;
    }

    public void setLayerNum(int i) {
        this.currentLayerNum = i;
        if (this.attachedToWindow) {
            this.currentOpenedLayerFlags = NotificationCenter.getGlobalInstance().getCurrentHeavyOperationFlags() & (~this.currentLayerNum);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap != null ? new BitmapDrawable((Resources) null, bitmap) : null);
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
            ((RecyclableDrawable) drawable2).recycle();
        }
        if (drawable instanceof AnimatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
            if (this.attachedToWindow) {
                animatedEmojiDrawable.addView(this);
            }
        } else if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            animatedFileDrawable.setParentView(this.parentView);
            if (this.attachedToWindow) {
                animatedFileDrawable.addParent(this);
            }
            animatedFileDrawable.setUseSharedQueue(this.useSharedAnimationQueue || animatedFileDrawable.isWebmSticker);
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animatedFileDrawable.checkRepeat();
            }
            animatedFileDrawable.setAllowDecodeSingleFrame(this.allowDecodeSingleFrame);
        } else if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            if (this.attachedToWindow) {
                rLottieDrawable.addParentView(this);
            }
            if (rLottieDrawable != null) {
                rLottieDrawable.setAllowVibration(this.allowLottieVibration);
            }
            if (this.allowStartLottieAnimation && (!rLottieDrawable.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
                rLottieDrawable.start();
            }
            rLottieDrawable.setAllowDecodeSingleFrame(true);
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
            ((AnimatedFileDrawable) drawable3).removeParent(this);
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

    private void updateDrawableRadius(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int[] roundRadius = getRoundRadius(true);
        if (drawable instanceof ClipRoundedDrawable) {
            ((ClipRoundedDrawable) drawable).setRadii(roundRadius[0], roundRadius[1], roundRadius[2], roundRadius[3]);
            return;
        }
        if ((hasRoundRadius() || this.gradientShader != null) && ((drawable instanceof BitmapDrawable) || (drawable instanceof AvatarDrawable))) {
            if (drawable instanceof AvatarDrawable) {
                ((AvatarDrawable) drawable).setRoundRadius(roundRadius[0]);
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
        setDrawableShader(drawable, null);
    }

    public void clearImage() {
        for (int i = 0; i < 4; i++) {
            recycleBitmap(null, i);
        }
        ImageLoader.getInstance().cancelLoadingForImageReceiver(this, true);
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
                animation.removeParent(this);
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
            lottieAnimation.setAllowVibration(this.allowLottieVibration);
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

    public boolean onAttachedToWindow() {
        if (this.attachedToWindow) {
            return false;
        }
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
            lottieAnimation.addParentView(this);
            lottieAnimation.setAllowVibration(this.allowLottieVibration);
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
        return false;
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

    public void setUseRoundForThumbDrawable(boolean z) {
        this.useRoundForThumb = z;
    }

    protected void drawDrawable(Canvas canvas, Drawable drawable, int i, BitmapShader bitmapShader, int i2, int i3, int i4, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
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
        int i5;
        int intrinsicHeight;
        int intrinsicWidth;
        boolean z2;
        BitmapDrawable bitmapDrawable;
        Object obj;
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
        int[] iArr2 = iArr;
        if (!this.useRoundRadius) {
            iArr2 = this.emptyRoundRadius;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) drawable;
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
                Object obj2 = this.blendMode;
                i5 = i6;
                if (obj2 != null && this.gradientShader == null) {
                    paint.setBlendMode(ImageReceiver$$ExternalSyntheticApiModelOutline0.m(obj2));
                } else {
                    paint.setBlendMode(null);
                }
            } else {
                i5 = i6;
            }
            boolean z4 = (paint == null || paint.getColorFilter() == null) ? false : true;
            if (z4 && i4 == 0) {
                if (bitmapShader != null) {
                    obj = null;
                    this.roundPaint.setColorFilter(null);
                } else {
                    obj = null;
                    if (this.staticThumbDrawable != drawable) {
                        bitmapDrawable2.setColorFilter(null);
                    }
                }
            } else if (!z4 && i4 != 0) {
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
            if (colorFilter != null && this.gradientShader == null) {
                if (bitmapShader != null) {
                    this.roundPaint.setColorFilter(colorFilter);
                } else {
                    bitmapDrawable2.setColorFilter(colorFilter);
                }
            }
            boolean z5 = bitmapDrawable2 instanceof AnimatedFileDrawable;
            if (z5 || (bitmapDrawable2 instanceof RLottieDrawable)) {
                int i7 = i2 % 360;
                if (i7 == 90 || i7 == 270) {
                    intrinsicHeight = bitmapDrawable2.getIntrinsicHeight();
                    intrinsicWidth = bitmapDrawable2.getIntrinsicWidth();
                } else {
                    intrinsicHeight = bitmapDrawable2.getIntrinsicWidth();
                    intrinsicWidth = bitmapDrawable2.getIntrinsicHeight();
                }
                z2 = false;
            } else {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                if (bitmap != null && bitmap.isRecycled()) {
                    return;
                }
                int i8 = i2 % 360;
                if (i8 == 90 || i8 == 270) {
                    intrinsicHeight = bitmap.getHeight();
                    intrinsicWidth = bitmap.getWidth();
                } else {
                    intrinsicHeight = bitmap.getWidth();
                    intrinsicWidth = bitmap.getHeight();
                }
                z2 = bitmapDrawable2 instanceof ReactionLastFrame;
            }
            float f5 = this.sideClip * 2.0f;
            float f6 = f4 - f5;
            float f7 = f3 - f5;
            float f8 = f4 == 0.0f ? 1.0f : intrinsicHeight / f6;
            float f9 = f3 == 0.0f ? 1.0f : intrinsicWidth / f7;
            if (z2) {
                f8 /= 1.2f;
                f9 /= 1.2f;
            }
            boolean z6 = z2;
            if (bitmapShader != null && backgroundThreadDrawHolder == null) {
                if (this.isAspectFit) {
                    float fMax = Math.max(f8, f9);
                    float f10 = (int) (intrinsicHeight / fMax);
                    float f11 = (int) (intrinsicWidth / fMax);
                    r13.set(((f4 - f10) / 2.0f) + f, ((f3 - f11) / 2.0f) + f2, f + ((f4 + f10) / 2.0f), f2 + ((f3 + f11) / 2.0f));
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
                        float f12 = 1.0f / fMax;
                        this.shaderMatrix.preScale(f12, f12);
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        this.roundPaint.setShader(bitmapShader);
                        this.roundPaint.setAlpha(i);
                        this.roundRect.set(r13);
                        if (!this.isRoundRect || !this.useRoundRadius) {
                            int[] iArr3 = iArr2;
                            for (int i9 = 0; i9 < iArr3.length; i9++) {
                                float[] fArr = radii;
                                int i10 = i9 * 2;
                                float f13 = iArr3[i9];
                                fArr[i10] = f13;
                                fArr[i10 + 1] = f13;
                            }
                            this.roundPath.reset();
                            this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                            this.roundPath.close();
                            if (canvas != null) {
                                canvas.drawPath(this.roundPath, this.roundPaint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i11 = iArr2[0];
                                if (i11 == 0) {
                                    canvas.drawRect(this.roundRect, this.roundPaint);
                                } else {
                                    float f14 = i11;
                                    canvas.drawRoundRect(this.roundRect, f14, f14, this.roundPaint);
                                }
                            } catch (Exception e) {
                                onBitmapException(bitmapDrawable2);
                                FileLog.e(e);
                            }
                        }
                    }
                } else {
                    int[] iArr4 = iArr2;
                    if (this.legacyCanvas != null) {
                        this.roundRect.set(0.0f, 0.0f, this.legacyBitmap.getWidth(), this.legacyBitmap.getHeight());
                        this.legacyCanvas.drawBitmap(this.gradientBitmap, (Rect) null, this.roundRect, (Paint) null);
                        this.legacyCanvas.drawBitmap(bitmapDrawable2.getBitmap(), (Rect) null, this.roundRect, this.legacyPaint);
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
                    float fMin = 1.0f / Math.min(f8, f9);
                    RectF rectF3 = this.roundRect;
                    float f15 = this.sideClip;
                    rectF3.set(f + f15, f2 + f15, (f4 + f) - f15, (f3 + f2) - f15);
                    if (Math.abs(f8 - f9) > 5.0E-4f) {
                        float f16 = intrinsicHeight / f9;
                        if (f16 > f6) {
                            float f17 = (int) f16;
                            r13.set(f - ((f17 - f6) / 2.0f), f2, ((f17 + f6) / 2.0f) + f, f2 + f7);
                        } else {
                            float f18 = (int) (intrinsicWidth / f8);
                            r13.set(f, f2 - ((f18 - f7) / 2.0f), f + f6, ((f18 + f7) / 2.0f) + f2);
                        }
                    } else {
                        r13.set(f, f2, f + f6, f2 + f7);
                    }
                    if (this.isVisible) {
                        this.shaderMatrix.reset();
                        if (z6) {
                            this.shaderMatrix.setTranslate((((RectF) r13).left + this.sideClip) - (((r13.width() * 1.2f) - r13.width()) / 2.0f), (((RectF) r13).top + this.sideClip) - (((r13.height() * 1.2f) - r13.height()) / 2.0f));
                        } else {
                            Matrix matrix = this.shaderMatrix;
                            float f19 = ((RectF) r13).left;
                            float f20 = this.sideClip;
                            matrix.setTranslate(f19 + f20, ((RectF) r13).top + f20);
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
                            float f21 = (f6 + (AndroidUtilities.roundMessageInset * 2)) / f6;
                            this.shaderMatrix.postScale(f21, f21, r13.centerX(), r13.centerY());
                        }
                        BitmapShader bitmapShader2 = this.legacyShader;
                        if (bitmapShader2 != null) {
                            bitmapShader2.setLocalMatrix(this.shaderMatrix);
                        }
                        bitmapShader.setLocalMatrix(this.shaderMatrix);
                        if (this.composeShader != null) {
                            int width = this.gradientBitmap.getWidth();
                            int height = this.gradientBitmap.getHeight();
                            float f22 = f4 == 0.0f ? 1.0f : width / f6;
                            float f23 = f3 == 0.0f ? 1.0f : height / f7;
                            if (Math.abs(f22 - f23) > 5.0E-4f) {
                                float f24 = width / f23;
                                if (f24 > f6) {
                                    width = (int) f24;
                                    float f25 = width;
                                    r13.set(f - ((f25 - f6) / 2.0f), f2, f + ((f25 + f6) / 2.0f), f2 + f7);
                                } else {
                                    height = (int) (height / f22);
                                    float f26 = height;
                                    r13.set(f, f2 - ((f26 - f7) / 2.0f), f + f6, f2 + ((f26 + f7) / 2.0f));
                                }
                            } else {
                                r13.set(f, f2, f + f6, f2 + f7);
                            }
                            float fMin2 = 1.0f / Math.min(f4 == 0.0f ? 1.0f : width / f6, f3 == 0.0f ? 1.0f : height / f7);
                            this.shaderMatrix.reset();
                            Matrix matrix2 = this.shaderMatrix;
                            float f27 = ((RectF) r13).left;
                            float f28 = this.sideClip;
                            matrix2.setTranslate(f27 + f28, ((RectF) r13).top + f28);
                            this.shaderMatrix.preScale(fMin2, fMin2);
                            this.gradientShader.setLocalMatrix(this.shaderMatrix);
                        }
                        this.roundPaint.setAlpha(i);
                        if (!this.isRoundRect || !this.useRoundRadius) {
                            for (int i12 = 0; i12 < iArr4.length; i12++) {
                                float[] fArr2 = radii;
                                int i13 = i12 * 2;
                                float f29 = iArr4[i12];
                                fArr2[i13] = f29;
                                fArr2[i13 + 1] = f29;
                            }
                            this.roundPath.reset();
                            this.roundPath.addRoundRect(this.roundRect, radii, Path.Direction.CW);
                            this.roundPath.close();
                            if (canvas != null) {
                                canvas.drawPath(this.roundPath, this.roundPaint);
                            }
                        } else if (canvas != null) {
                            try {
                                int i14 = iArr4[0];
                                if (i14 != 0) {
                                    float f30 = i14;
                                    canvas.drawRoundRect(this.roundRect, f30, f30, this.roundPaint);
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
                                    onBitmapException(bitmapDrawable2);
                                }
                                FileLog.e(e2);
                            }
                        }
                    }
                }
            } else {
                int[] iArr5 = iArr2;
                if (this.isAspectFit) {
                    float fMax2 = Math.max(f8, f9);
                    canvas.save();
                    int i15 = (int) (intrinsicHeight / fMax2);
                    int i16 = (int) (intrinsicWidth / fMax2);
                    if (backgroundThreadDrawHolder == null) {
                        float f31 = i15;
                        float f32 = i16;
                        r13.set(((f4 - f31) / 2.0f) + f, ((f3 - f32) / 2.0f) + f2, ((f31 + f4) / 2.0f) + f, ((f32 + f3) / 2.0f) + f2);
                        bitmapDrawable2.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
                        if (bitmapDrawable2 instanceof AnimatedFileDrawable) {
                            ((AnimatedFileDrawable) bitmapDrawable2).setActualDrawRect(((RectF) r13).left, ((RectF) r13).top, r13.width(), r13.height());
                        }
                    }
                    if (backgroundThreadDrawHolder != null && iArr5 != null && iArr5[0] > 0) {
                        canvas.save();
                        Path path = backgroundThreadDrawHolder.roundPath == null ? backgroundThreadDrawHolder.roundPath = new Path() : backgroundThreadDrawHolder.roundPath;
                        path.rewind();
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(f, f2, f4 + f, f3 + f2);
                        path.addRoundRect(rectF5, iArr5[0], iArr5[2], Path.Direction.CW);
                        canvas.clipPath(path);
                    }
                    if (this.isVisible) {
                        try {
                            bitmapDrawable2.setAlpha(i);
                            drawBitmapDrawable(canvas, bitmapDrawable2, backgroundThreadDrawHolder, i);
                        } catch (Exception e3) {
                            if (backgroundThreadDrawHolder == null) {
                                onBitmapException(bitmapDrawable2);
                            }
                            FileLog.e(e3);
                        }
                    }
                    canvas.restore();
                    if (backgroundThreadDrawHolder != null && iArr5 != null && iArr5[0] > 0) {
                        canvas.restore();
                    }
                } else if (canvas != null) {
                    if (Math.abs(f8 - f9) > 1.0E-5f) {
                        canvas.save();
                        if (this.clip) {
                            canvas.clipRect(f, f2, f + f4, f2 + f3);
                        }
                        if (i3 == 1) {
                            bitmapDrawable = bitmapDrawable2;
                            canvas.scale(-1.0f, 1.0f, f4 / 2.0f, f3 / 2.0f);
                        } else {
                            bitmapDrawable = bitmapDrawable2;
                            if (i3 == 2) {
                                canvas.scale(1.0f, -1.0f, f4 / 2.0f, f3 / 2.0f);
                            }
                        }
                        BitmapDrawable bitmapDrawable3 = bitmapDrawable;
                        int i17 = i2 % 360;
                        if (i17 != 0) {
                            if (this.centerRotation) {
                                canvas.rotate(i2, f4 / 2.0f, f3 / 2.0f);
                            } else {
                                canvas.rotate(i2, 0.0f, 0.0f);
                            }
                        }
                        float f33 = intrinsicHeight / f9;
                        if (f33 > f4) {
                            float f34 = (int) f33;
                            r13.set(f - ((f34 - f4) / 2.0f), f2, ((f34 + f4) / 2.0f) + f, f2 + f3);
                        } else {
                            float f35 = (int) (intrinsicWidth / f8);
                            r13.set(f, f2 - ((f35 - f3) / 2.0f), f + f4, ((f35 + f3) / 2.0f) + f2);
                        }
                        if (z5) {
                            ((AnimatedFileDrawable) bitmapDrawable3).setActualDrawRect(f, f2, f4, f3);
                        }
                        if (backgroundThreadDrawHolder == null) {
                            if (i17 == 90 || i17 == 270) {
                                float fWidth = r13.width() / 2.0f;
                                float fHeight = r13.height() / 2.0f;
                                float fCenterX = r13.centerX();
                                float fCenterY = r13.centerY();
                                bitmapDrawable3.setBounds((int) (fCenterX - fHeight), (int) (fCenterY - fWidth), (int) (fCenterX + fHeight), (int) (fCenterY + fWidth));
                            } else {
                                bitmapDrawable3.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
                            }
                        }
                        if (this.isVisible) {
                            if (i5 >= 29) {
                                try {
                                    if (this.blendMode != null) {
                                        bitmapDrawable3.getPaint().setBlendMode(ImageReceiver$$ExternalSyntheticApiModelOutline0.m(this.blendMode));
                                    } else {
                                        bitmapDrawable3.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e4) {
                                    if (backgroundThreadDrawHolder == null) {
                                        onBitmapException(bitmapDrawable3);
                                    }
                                    FileLog.e(e4);
                                }
                            }
                            drawBitmapDrawable(canvas, bitmapDrawable3, backgroundThreadDrawHolder, i);
                        }
                        canvas.restore();
                    } else {
                        int i18 = i5;
                        canvas.save();
                        if (i3 == 1) {
                            canvas.scale(-1.0f, 1.0f, f4 / 2.0f, f3 / 2.0f);
                        } else if (i3 == 2) {
                            canvas.scale(1.0f, -1.0f, f4 / 2.0f, f3 / 2.0f);
                        }
                        int i19 = i2 % 360;
                        if (i19 != 0) {
                            if (this.centerRotation) {
                                canvas.rotate(i2, f4 / 2.0f, f3 / 2.0f);
                            } else {
                                canvas.rotate(i2, 0.0f, 0.0f);
                            }
                        }
                        r13.set(f, f2, f + f4, f2 + f3);
                        if (this.isRoundVideo) {
                            float f36 = -AndroidUtilities.roundMessageInset;
                            r13.inset(f36, f36);
                        }
                        if (z5) {
                            ((AnimatedFileDrawable) bitmapDrawable2).setActualDrawRect(f, f2, f4, f3);
                        }
                        if (backgroundThreadDrawHolder == null) {
                            if (i19 == 90 || i19 == 270) {
                                float fWidth2 = r13.width() / 2.0f;
                                float fHeight2 = r13.height() / 2.0f;
                                float fCenterX2 = r13.centerX();
                                float fCenterY2 = r13.centerY();
                                bitmapDrawable2.setBounds((int) (fCenterX2 - fHeight2), (int) (fCenterY2 - fWidth2), (int) (fCenterX2 + fHeight2), (int) (fCenterY2 + fWidth2));
                            } else {
                                bitmapDrawable2.setBounds((int) ((RectF) r13).left, (int) ((RectF) r13).top, (int) ((RectF) r13).right, (int) ((RectF) r13).bottom);
                            }
                        }
                        if (this.isVisible) {
                            if (i18 >= 29) {
                                try {
                                    if (this.blendMode != null) {
                                        bitmapDrawable2.getPaint().setBlendMode(ImageReceiver$$ExternalSyntheticApiModelOutline0.m(this.blendMode));
                                    } else {
                                        bitmapDrawable2.getPaint().setBlendMode(null);
                                    }
                                } catch (Exception e5) {
                                    onBitmapException(bitmapDrawable2);
                                    FileLog.e(e5);
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
        if (backgroundThreadDrawHolder == null) {
            if (this.isAspectFit) {
                int intrinsicWidth2 = drawable.getIntrinsicWidth();
                int intrinsicHeight2 = drawable.getIntrinsicHeight();
                float f37 = this.sideClip * 2.0f;
                float fMax3 = Math.max(f4 == 0.0f ? 1.0f : intrinsicWidth2 / (f4 - f37), f3 == 0.0f ? 1.0f : intrinsicHeight2 / (f3 - f37));
                float f38 = (int) (intrinsicWidth2 / fMax3);
                float f39 = (int) (intrinsicHeight2 / fMax3);
                r13.set(((f4 - f38) / 2.0f) + f, ((f3 - f39) / 2.0f) + f2, f + ((f4 + f38) / 2.0f), f2 + ((f3 + f39) / 2.0f));
            } else {
                r13.set(f, f2, f4 + f, f3 + f2);
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
                        ClipRoundedDrawable clipRoundedDrawable = (ClipRoundedDrawable) drawable;
                        if (clipRoundedDrawable.getDrawable() instanceof SvgHelper.SvgDrawable) {
                            svgDrawable = (SvgHelper.SvgDrawable) clipRoundedDrawable.getDrawable();
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
            } catch (Exception e6) {
                e = e6;
                r13 = r13;
                FileLog.e(e);
            }
            drawable.setAlpha(i);
        } catch (Exception e7) {
            e = e7;
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

    private void drawBitmapDrawable(Canvas canvas, BitmapDrawable bitmapDrawable, BackgroundThreadDrawHolder backgroundThreadDrawHolder, int i) {
        if (backgroundThreadDrawHolder != null) {
            if (bitmapDrawable instanceof RLottieDrawable) {
                ((RLottieDrawable) bitmapDrawable).drawInBackground(canvas, backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY, backgroundThreadDrawHolder.imageW, backgroundThreadDrawHolder.imageH, i, backgroundThreadDrawHolder.colorFilter, backgroundThreadDrawHolder.threadIndex);
                return;
            }
            if (bitmapDrawable instanceof AnimatedFileDrawable) {
                ((AnimatedFileDrawable) bitmapDrawable).drawInBackground(canvas, backgroundThreadDrawHolder.imageX, backgroundThreadDrawHolder.imageY, backgroundThreadDrawHolder.imageW, backgroundThreadDrawHolder.imageH, i, backgroundThreadDrawHolder.colorFilter, backgroundThreadDrawHolder.threadIndex);
                return;
            }
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
        bitmapDrawable.setAlpha(i);
        if (bitmapDrawable instanceof RLottieDrawable) {
            ((RLottieDrawable) bitmapDrawable).drawInternal(canvas, null, false, this.currentTime, 0);
        } else if (bitmapDrawable instanceof AnimatedFileDrawable) {
            ((AnimatedFileDrawable) bitmapDrawable).drawInternal(canvas, false, this.currentTime, 0);
        } else {
            bitmapDrawable.draw(canvas);
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
                    this.currentAlpha += j2 / this.crossfadeDuration;
                } else {
                    this.currentAlpha = f + (16.0f / this.crossfadeDuration);
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
                AndroidUtilities.runOnUIThread(new ImageReceiver$$ExternalSyntheticLambda2(this));
            } else {
                invalidate();
            }
        }
    }

    public boolean draw(Canvas canvas) {
        return draw(canvas, null);
    }

    public boolean draw(Canvas canvas, BackgroundThreadDrawHolder backgroundThreadDrawHolder) {
        boolean z;
        int i;
        AnimatedFileDrawable animation;
        RLottieDrawable lottieAnimation;
        Drawable drawable;
        BitmapShader bitmapShader;
        BitmapShader bitmapShader2;
        BitmapShader bitmapShader3;
        boolean z2;
        int[] iArr;
        Drawable drawable2;
        float f;
        float f2;
        BitmapShader bitmapShader4;
        float f3;
        boolean z3;
        Drawable drawable3;
        BitmapShader bitmapShader5;
        Drawable drawable4;
        Drawable drawable5;
        boolean z4;
        Drawable drawable6;
        BitmapShader bitmapShader6;
        int i2;
        int i3;
        Drawable drawable7;
        Drawable drawable8;
        float f4;
        boolean z5;
        BitmapShader bitmapShader7;
        BitmapShader bitmapShader8;
        Canvas canvas2 = canvas;
        if (this.gradientBitmap != null && this.currentImageKey != null) {
            canvas.save();
            float f5 = this.imageX;
            float f6 = this.imageY;
            canvas2.clipRect(f5, f6, this.imageW + f5, this.imageH + f6);
            canvas2.drawColor(-16777216);
        }
        boolean z6 = backgroundThreadDrawHolder != null;
        try {
            if (!z6) {
                animation = getAnimation();
                lottieAnimation = getLottieAnimation();
                int[] iArr2 = this.roundRadius;
                drawable = this.currentMediaDrawable;
                bitmapShader = this.mediaShader;
                Drawable drawable9 = this.currentImageDrawable;
                bitmapShader2 = this.imageShader;
                Drawable drawable10 = this.currentThumbDrawable;
                bitmapShader3 = this.thumbShader;
                BitmapShader bitmapShader9 = this.staticThumbShader;
                z2 = this.crossfadingWithThumb;
                Drawable drawable11 = this.crossfadeImage;
                iArr = iArr2;
                drawable2 = this.staticThumbDrawable;
                f = this.currentAlpha;
                f2 = this.previousAlpha;
                bitmapShader4 = this.crossfadeShader;
                f3 = this.overrideAlpha;
                z3 = ((animation == null || animation.hasBitmap()) && (lottieAnimation == null || lottieAnimation.hasBitmap())) ? false : true;
                drawable3 = drawable9;
                bitmapShader5 = bitmapShader9;
                drawable4 = drawable10;
                drawable5 = drawable11;
            } else {
                animation = backgroundThreadDrawHolder.animation;
                lottieAnimation = backgroundThreadDrawHolder.lottieDrawable;
                int[] iArr3 = backgroundThreadDrawHolder.roundRadius;
                Drawable drawable12 = backgroundThreadDrawHolder.mediaDrawable;
                bitmapShader = backgroundThreadDrawHolder.mediaShader;
                Drawable drawable13 = backgroundThreadDrawHolder.imageDrawable;
                bitmapShader2 = backgroundThreadDrawHolder.imageShader;
                BitmapShader bitmapShader10 = backgroundThreadDrawHolder.thumbShader;
                BitmapShader bitmapShader11 = backgroundThreadDrawHolder.staticThumbShader;
                Drawable drawable14 = backgroundThreadDrawHolder.crossfadeImage;
                boolean unused = backgroundThreadDrawHolder.crossfadeWithOldImage;
                boolean z7 = backgroundThreadDrawHolder.crossfadingWithThumb;
                Drawable drawable15 = backgroundThreadDrawHolder.thumbDrawable;
                Drawable drawable16 = backgroundThreadDrawHolder.staticThumbDrawable;
                float f7 = backgroundThreadDrawHolder.currentAlpha;
                f2 = backgroundThreadDrawHolder.previousAlpha;
                bitmapShader4 = backgroundThreadDrawHolder.crossfadeShader;
                f = f7;
                iArr = iArr3;
                drawable = drawable12;
                z3 = backgroundThreadDrawHolder.animationNotReady;
                drawable3 = drawable13;
                bitmapShader5 = bitmapShader11;
                bitmapShader3 = bitmapShader10;
                drawable5 = drawable14;
                drawable4 = drawable15;
                z2 = z7;
                f3 = backgroundThreadDrawHolder.overrideAlpha;
                drawable2 = drawable16;
            }
            int[] iArr4 = !this.useRoundRadius ? this.emptyRoundRadius : iArr;
            if (animation != null) {
                animation.setRoundRadius(iArr4);
            }
            if (animation != null || lottieAnimation != null) {
                if (!z3 && !this.animationReadySent && !z6) {
                    this.animationReadySent = true;
                    ImageReceiverDelegate imageReceiverDelegate = this.delegate;
                    if (imageReceiverDelegate != null) {
                        imageReceiverDelegate.onAnimationReady(this);
                    }
                }
            }
            boolean z8 = this.forcePreview;
            if (!z8 && !this.forceNotMedia && drawable != null && !z3) {
                i2 = this.imageOrientation;
                i3 = this.imageInvert;
                z4 = z3;
                bitmapShader6 = bitmapShader;
                drawable6 = drawable;
            } else if (!z8 && drawable3 != null && (!z3 || drawable != null)) {
                i2 = this.imageOrientation;
                i3 = this.imageInvert;
                bitmapShader6 = bitmapShader2;
                drawable6 = drawable3;
                z4 = false;
            } else if (drawable5 != null && !z2) {
                i2 = this.imageOrientation;
                i3 = this.imageInvert;
                z4 = z3;
                drawable6 = drawable5;
                bitmapShader6 = bitmapShader4;
            } else if (drawable4 != null) {
                i2 = this.thumbOrientation;
                i3 = this.thumbInvert;
                z4 = z3;
                drawable6 = drawable4;
                bitmapShader6 = bitmapShader3;
            } else if (drawable2 instanceof BitmapDrawable) {
                if (this.useRoundForThumb && bitmapShader5 == null) {
                    updateDrawableRadius(drawable2);
                    bitmapShader5 = this.staticThumbShader;
                }
                i2 = this.thumbOrientation;
                i3 = this.thumbInvert;
                z4 = z3;
                bitmapShader6 = bitmapShader5;
                drawable6 = drawable2;
            } else {
                z4 = z3;
                drawable6 = null;
                bitmapShader6 = null;
                i2 = 0;
                i3 = 0;
            }
            float f8 = this.crossfadeByScale;
            float fMin = f8 > 0.0f ? Math.min((f8 * f) + f, 1.0f) : f;
            if (drawable6 != null) {
                if (this.crossfadeAlpha != 0) {
                    if (f2 == 1.0f || (!(drawable6 == drawable3 || drawable6 == drawable) || drawable2 == null)) {
                        drawable8 = drawable6;
                        f4 = 1.0f;
                    } else {
                        try {
                            if (this.useRoundForThumb && bitmapShader5 == null) {
                                updateDrawableRadius(drawable2);
                                bitmapShader5 = this.staticThumbShader;
                            }
                            BitmapShader bitmapShader12 = bitmapShader5;
                            f4 = 1.0f;
                            drawable8 = drawable6;
                            drawDrawable(canvas, drawable2, (int) (f3 * 255.0f), bitmapShader12, i2, i3, backgroundThreadDrawHolder);
                            bitmapShader5 = bitmapShader12;
                        } catch (Exception e) {
                            e = e;
                            canvas2 = canvas;
                            z = false;
                            FileLog.e(e);
                            if (this.gradientBitmap != null) {
                                canvas.restore();
                            }
                            if (z) {
                                for (i = 0; i < this.decorators.size(); i++) {
                                    this.decorators.get(i).onDraw(canvas2, this);
                                }
                            }
                            return z;
                        }
                    }
                    boolean z9 = this.crossfadeWithThumb;
                    if (z9 && z4 != 0) {
                        drawDrawable(canvas, drawable8, (int) (f3 * 255.0f), bitmapShader6, i2, i3, backgroundThreadDrawHolder);
                        canvas2 = canvas;
                        drawable7 = drawable8;
                    } else {
                        if (!z9 || fMin == f4) {
                            drawable7 = drawable8;
                        } else {
                            Drawable drawable17 = drawable8;
                            if (drawable17 != drawable3 && drawable17 != drawable) {
                                if (drawable17 == drawable4 || drawable17 == drawable5) {
                                    if (drawable2 != null) {
                                        if (this.useRoundForThumb && bitmapShader5 == null) {
                                            updateDrawableRadius(drawable2);
                                            bitmapShader7 = this.staticThumbShader;
                                            bitmapShader5 = bitmapShader7;
                                        }
                                        bitmapShader8 = bitmapShader5;
                                    }
                                } else if (drawable17 == drawable2 && drawable5 != null) {
                                    drawable2 = drawable5;
                                    bitmapShader8 = bitmapShader4;
                                }
                                bitmapShader8 = null;
                                drawable2 = null;
                            } else if (drawable5 != 0) {
                                drawable2 = drawable5;
                                bitmapShader8 = bitmapShader4;
                            } else if (drawable4 != null) {
                                drawable2 = drawable4;
                                bitmapShader8 = bitmapShader3;
                            } else if (drawable2 != null) {
                                if (this.useRoundForThumb && bitmapShader5 == null) {
                                    updateDrawableRadius(drawable2);
                                    bitmapShader7 = this.staticThumbShader;
                                    bitmapShader5 = bitmapShader7;
                                }
                                bitmapShader8 = bitmapShader5;
                            } else {
                                bitmapShader8 = null;
                                drawable2 = null;
                            }
                            if (drawable2 != null) {
                                int i4 = ((drawable2 instanceof SvgHelper.SvgDrawable) || (drawable2 instanceof Emoji.EmojiDrawable)) ? (int) ((f4 - fMin) * f3 * 255.0f) : (int) (f2 * f3 * 255.0f);
                                drawable7 = drawable17;
                                drawDrawable(canvas, drawable2, i4, bitmapShader8, this.thumbOrientation, this.thumbInvert, backgroundThreadDrawHolder);
                                if (i4 != 255 && (drawable2 instanceof Emoji.EmojiDrawable)) {
                                    drawable2.setAlpha(255);
                                }
                            } else {
                                drawable7 = drawable17;
                            }
                        }
                        if (this.crossfadeByScale <= 0.0f || fMin >= f4 || !z2) {
                            canvas2 = canvas;
                            z5 = false;
                        } else {
                            canvas.save();
                            this.roundPath.rewind();
                            RectF rectF = AndroidUtilities.rectTmp;
                            float f9 = this.imageX;
                            float f10 = this.imageY;
                            rectF.set(f9, f10, this.imageW + f9, this.imageH + f10);
                            for (int i5 = 0; i5 < iArr4.length; i5++) {
                                float[] fArr = radii;
                                int i6 = i5 * 2;
                                float f11 = iArr4[i5];
                                fArr[i6] = f11;
                                fArr[i6 + 1] = f11;
                            }
                            this.roundPath.addRoundRect(AndroidUtilities.rectTmp, radii, Path.Direction.CW);
                            canvas2 = canvas;
                            canvas2.clipPath(this.roundPath);
                            float interpolation = (this.crossfadeByScale * (f4 - CubicBezierInterpolator.EASE_IN.getInterpolation(f))) + f4;
                            canvas2.scale(interpolation, interpolation, getCenterX(), getCenterY());
                            z5 = true;
                        }
                        drawDrawable(canvas, drawable7, (int) (f3 * fMin * 255.0f), bitmapShader6, i2, i3, backgroundThreadDrawHolder);
                        if (z5) {
                            canvas.restore();
                        }
                    }
                } else {
                    drawable7 = drawable6;
                    z4 = z4;
                    z6 = z6;
                    drawDrawable(canvas, drawable7, (int) (f3 * 255.0f), bitmapShader6, i2, i3, backgroundThreadDrawHolder);
                }
                checkAlphaAnimation(z4 && this.crossfadeWithThumb, backgroundThreadDrawHolder);
            } else {
                drawable7 = drawable6;
                z4 = z4;
                z6 = z6;
                if (drawable2 != null) {
                    if (drawable2 instanceof VectorAvatarThumbDrawable) {
                        ((VectorAvatarThumbDrawable) drawable2).setParent(this);
                    }
                    drawDrawable(canvas, drawable2, (int) (f3 * 255.0f), null, this.thumbOrientation, this.thumbInvert, backgroundThreadDrawHolder);
                    checkAlphaAnimation(z4, backgroundThreadDrawHolder);
                } else {
                    checkAlphaAnimation(z4, backgroundThreadDrawHolder);
                    z = false;
                }
                if (drawable7 == null && z4 && !z6) {
                    try {
                        invalidate();
                    } catch (Exception e2) {
                        e = e2;
                        FileLog.e(e);
                    }
                }
                if (this.gradientBitmap != null && this.currentImageKey != null) {
                    canvas.restore();
                }
                if (z && this.isVisible && this.decorators != null) {
                    while (i < this.decorators.size()) {
                        this.decorators.get(i).onDraw(canvas2, this);
                    }
                }
                return z;
            }
            z = true;
            if (drawable7 == null) {
                invalidate();
            }
        } catch (Exception e3) {
            e = e3;
        }
        if (this.gradientBitmap != null) {
            canvas.restore();
        }
        if (z) {
            while (i < this.decorators.size()) {
                this.decorators.get(i).onDraw(canvas2, this);
            }
        }
        return z;
    }

    public void setManualAlphaAnimator(boolean z) {
        this.manualAlphaAnimator = z;
    }

    public float getCurrentAlpha() {
        return this.currentAlpha;
    }

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

    public BitmapHolder getBitmapSafe() {
        Bitmap bitmap;
        String str;
        AnimatedFileDrawable animation = getAnimation();
        RLottieDrawable lottieAnimation = getLottieAnimation();
        int orientation = 0;
        if (lottieAnimation != null && lottieAnimation.hasBitmap()) {
            bitmap = lottieAnimation.getAnimatedBitmap();
        } else if (animation != null && animation.hasBitmap()) {
            Bitmap animatedBitmap = animation.getAnimatedBitmap();
            orientation = animation.getOrientation();
            if (orientation != 0) {
                return new BitmapHolder(Bitmap.createBitmap(animatedBitmap), (String) null, orientation);
            }
            bitmap = animatedBitmap;
        } else {
            Drawable drawable = this.currentMediaDrawable;
            if ((drawable instanceof BitmapDrawable) && !(drawable instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                str = this.currentMediaKey;
            } else {
                Drawable drawable2 = this.currentImageDrawable;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
                    bitmap = ((BitmapDrawable) drawable2).getBitmap();
                    str = this.currentImageKey;
                } else {
                    Drawable drawable3 = this.currentThumbDrawable;
                    if ((drawable3 instanceof BitmapDrawable) && !(drawable3 instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
                        bitmap = ((BitmapDrawable) drawable3).getBitmap();
                        str = this.currentThumbKey;
                    } else {
                        Drawable drawable4 = this.staticThumbDrawable;
                        if (drawable4 instanceof BitmapDrawable) {
                            bitmap = ((BitmapDrawable) drawable4).getBitmap();
                        } else {
                            bitmap = null;
                            str = null;
                        }
                    }
                }
            }
            if (bitmap != null) {
                return new BitmapHolder(bitmap, str, orientation);
            }
            return null;
        }
        str = null;
        if (bitmap != null) {
            return new BitmapHolder(bitmap, str, orientation);
        }
        return null;
    }

    public BitmapHolder getDrawableSafe() {
        String str;
        String str2;
        Drawable drawable = this.currentMediaDrawable;
        if ((drawable instanceof BitmapDrawable) && !(drawable instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
            str = this.currentMediaKey;
        } else {
            Drawable drawable2 = this.currentImageDrawable;
            if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
                str2 = this.currentImageKey;
            } else {
                drawable2 = this.currentThumbDrawable;
                if ((drawable2 instanceof BitmapDrawable) && !(drawable2 instanceof AnimatedFileDrawable) && !(drawable instanceof RLottieDrawable)) {
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
        if (drawable != null) {
            return new BitmapHolder(drawable, str, 0);
        }
        return null;
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

    public int getBitmapWidth() {
        getDrawable();
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            int i = this.imageOrientation % 360;
            return (i == 0 || i == 180) ? animation.getIntrinsicWidth() : animation.getIntrinsicHeight();
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
        int i2 = this.imageOrientation % 360;
        return (i2 == 0 || i2 == 180) ? bitmap.getWidth() : bitmap.getHeight();
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
        int i2 = this.imageOrientation % 360;
        return (i2 == 0 || i2 == 180) ? bitmap.getHeight() : bitmap.getWidth();
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

    public void getParentPosition(int[] iArr) {
        View view = this.parentView;
        if (view == null) {
            return;
        }
        view.getLocationInWindow(iArr);
    }

    public boolean getVisible() {
        return this.isVisible;
    }

    public void setAlpha(float f) {
        this.overrideAlpha = f;
    }

    public float getAlpha() {
        return this.overrideAlpha;
    }

    public void setCrossfadeAlpha(byte b) {
        this.crossfadeAlpha = b;
    }

    public boolean hasImageSet() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentImageKey == null && this.currentMediaKey == null) ? false : true;
    }

    public boolean hasMediaSet() {
        return this.currentMediaDrawable != null;
    }

    public boolean hasBitmapImage() {
        return (this.currentImageDrawable == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasImageLoaded() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null) ? false : true;
    }

    public boolean hasNotThumb() {
        return (this.currentImageDrawable == null && this.currentMediaDrawable == null && !(this.staticThumbDrawable instanceof VectorAvatarThumbDrawable)) ? false : true;
    }

    public boolean hasNotThumbOrOnlyStaticThumb() {
        if (this.currentImageDrawable == null && this.currentMediaDrawable == null) {
            Drawable drawable = this.staticThumbDrawable;
            if (!(drawable instanceof VectorAvatarThumbDrawable) && (drawable == null || (drawable instanceof AvatarDrawable) || this.currentImageKey != null || this.currentMediaKey != null)) {
                return false;
            }
        }
        return true;
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
        if (animation == null || !this.attachedToWindow) {
            return;
        }
        animation.setParentView(this.parentView);
    }

    public void setImageX(float f) {
        this.imageX = f;
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

    public void setImageCoords(Rect rect) {
        if (rect != null) {
            this.imageX = rect.left;
            this.imageY = rect.top;
            this.imageW = rect.width();
            this.imageH = rect.height();
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

    public long getSize() {
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

    public void setForceNotMedia(boolean z) {
        this.forceNotMedia = z;
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

    public void setMark(Object obj) {
        this.mark = obj;
    }

    public Object getMark() {
        return this.mark;
    }

    public void setCurrentAccount(int i) {
        this.currentAccount = i;
    }

    public int[] getRoundRadius() {
        return this.roundRadius;
    }

    public int[] getRoundRadius(boolean z) {
        return (this.useRoundRadius || !z) ? this.roundRadius : this.emptyRoundRadius;
    }

    public Object getParentObject() {
        return this.currentParentObject;
    }

    public void setNeedsQualityThumb(boolean z) {
        this.needsQualityThumb = z;
    }

    public void setQualityThumbDocument(TLRPC.Document document) {
        this.qulityThumbDocument = document;
    }

    public TLRPC.Document getQualityThumbDocument() {
        return this.qulityThumbDocument;
    }

    public void setCrossfadeWithOldImage(boolean z) {
        this.crossfadeWithOldImage = z;
    }

    public boolean isCrossfadingWithOldImage() {
        return (!this.crossfadeWithOldImage || this.crossfadeImage == null || this.crossfadingWithThumb) ? false : true;
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

    public void setAllowLottieVibration(boolean z) {
        this.allowLottieVibration = z;
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

    public int getAutoRepeat() {
        return this.autoRepeat;
    }

    public void setAutoRepeatCount(int i) {
        this.autoRepeatCount = i;
        if (getLottieAnimation() != null) {
            getLottieAnimation().setAutoRepeatCount(i);
            return;
        }
        this.animatedFileDrawableRepeatMaxCount = i;
        if (getAnimation() != null) {
            getAnimation().repeatCount = 0;
        }
    }

    public void setAutoRepeatTimeout(long j) {
        this.autoRepeatTimeout = j;
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.setAutoRepeatTimeout(this.autoRepeatTimeout);
        }
    }

    public void setUseSharedAnimationQueue(boolean z) {
        this.useSharedAnimationQueue = z;
    }

    public boolean isAllowStartAnimation() {
        return this.allowStartAnimation;
    }

    public void startAnimation() {
        startAnimation(false);
    }

    public void startAnimation(boolean z) {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.setUseSharedQueue(this.useSharedAnimationQueue);
            animation.start();
            return;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation == null || lottieAnimation.isRunning()) {
            return;
        }
        lottieAnimation.restart(z);
    }

    public void stopAnimation() {
        AnimatedFileDrawable animation = getAnimation();
        if (animation != null) {
            animation.stop();
            return;
        }
        RLottieDrawable lottieAnimation = getLottieAnimation();
        if (lottieAnimation != null) {
            lottieAnimation.stop();
        }
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
                lottieAnimation.stop();
            } else {
                if (lottieAnimation.isRunning()) {
                    return;
                }
                lottieAnimation.start();
            }
        }
    }

    public boolean isAnimationRunning() {
        AnimatedFileDrawable animation = getAnimation();
        return animation != null && animation.isRunning();
    }

    public boolean isLottieRunning() {
        RLottieDrawable lottieAnimation = getLottieAnimation();
        return lottieAnimation != null && lottieAnimation.isRunning();
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

    protected int getTag(int i) {
        if (i == 1) {
            return this.thumbTag;
        }
        if (i == 3) {
            return this.mediaTag;
        }
        return this.imageTag;
    }

    protected void setTag(int i, int i2) {
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

    protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
        Drawable drawable2;
        Drawable drawable3;
        boolean z2;
        boolean z3;
        Drawable drawable4;
        boolean z4;
        if (drawable == null || str == null || this.currentGuid != i2) {
            return false;
        }
        if (i == 0) {
            if (!str.equals(this.currentImageKey)) {
                return false;
            }
            ImageReceiverDelegate imageReceiverDelegate = this.delegate;
            if (imageReceiverDelegate != null) {
                imageReceiverDelegate.didSetImageBitmap(i, str, drawable);
            }
            if (!(drawable instanceof AnimatedFileDrawable)) {
                ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                if (!this.videoThumbIsSame || (drawable != this.currentImageDrawable && this.currentAlpha >= 1.0f)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                animatedFileDrawable.setStartEndTime(this.startTime, this.endTime);
                if (animatedFileDrawable.isWebmSticker) {
                    ImageLoader.getInstance().incrementUseCount(this.currentImageKey);
                }
                if (this.videoThumbIsSame) {
                    z3 = !animatedFileDrawable.hasBitmap();
                } else {
                    z3 = true;
                }
            }
            this.currentImageDrawable = drawable;
            if (drawable instanceof ExtendedBitmapDrawable) {
                ExtendedBitmapDrawable extendedBitmapDrawable = (ExtendedBitmapDrawable) drawable;
                this.imageOrientation = extendedBitmapDrawable.getOrientation();
                this.imageInvert = extendedBitmapDrawable.getInvert();
            }
            updateDrawableRadius(drawable);
            if (z3 && this.isVisible && (((!z && !this.forcePreview) || this.forceCrossfade) && this.crossfadeDuration != 0)) {
                Drawable drawable5 = this.currentMediaDrawable;
                if (!(drawable5 instanceof RLottieDrawable) || !((RLottieDrawable) drawable5).hasBitmap()) {
                    Drawable drawable6 = this.currentMediaDrawable;
                    if (!(drawable6 instanceof AnimatedFileDrawable) || !((AnimatedFileDrawable) drawable6).hasBitmap()) {
                        if (this.currentImageDrawable instanceof RLottieDrawable) {
                            Drawable drawable7 = this.staticThumbDrawable;
                            if ((drawable7 instanceof LoadingStickerDrawable) || (drawable7 instanceof SvgHelper.SvgDrawable) || (drawable7 instanceof Emoji.EmojiDrawable)) {
                                drawable4 = this.currentThumbDrawable;
                                if (drawable4 == null || this.staticThumbDrawable != null || this.forceCrossfade) {
                                    if (drawable4 == null && this.staticThumbDrawable != null) {
                                        this.previousAlpha = this.currentAlpha;
                                    } else {
                                        this.previousAlpha = 1.0f;
                                    }
                                    this.currentAlpha = 0.0f;
                                    this.lastUpdateAlphaTime = System.currentTimeMillis();
                                    if (this.crossfadeImage != null && this.currentThumbDrawable == null && this.staticThumbDrawable == null) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    this.crossfadeWithThumb = z4;
                                }
                            }
                        } else {
                            drawable4 = this.currentThumbDrawable;
                            if (drawable4 == null) {
                                if (drawable4 == null) {
                                    this.previousAlpha = 1.0f;
                                } else {
                                    this.previousAlpha = 1.0f;
                                }
                                this.currentAlpha = 0.0f;
                                this.lastUpdateAlphaTime = System.currentTimeMillis();
                                if (this.crossfadeImage != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                this.crossfadeWithThumb = z4;
                            } else {
                                if (drawable4 == null) {
                                    this.previousAlpha = 1.0f;
                                } else {
                                    this.previousAlpha = 1.0f;
                                }
                                this.currentAlpha = 0.0f;
                                this.lastUpdateAlphaTime = System.currentTimeMillis();
                                if (this.crossfadeImage != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                this.crossfadeWithThumb = z4;
                            }
                        }
                    }
                }
            } else {
                this.currentAlpha = 1.0f;
                this.previousAlpha = 1.0f;
            }
        } else if (i == 3) {
            if (!str.equals(this.currentMediaKey)) {
                return false;
            }
            ImageReceiverDelegate imageReceiverDelegate2 = this.delegate;
            if (imageReceiverDelegate2 != null) {
                imageReceiverDelegate2.didSetImageBitmap(i, str, drawable);
            }
            if (!(drawable instanceof AnimatedFileDrawable)) {
                ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
            } else {
                AnimatedFileDrawable animatedFileDrawable2 = (AnimatedFileDrawable) drawable;
                animatedFileDrawable2.setStartEndTime(this.startTime, this.endTime);
                if (animatedFileDrawable2.isWebmSticker) {
                    ImageLoader.getInstance().incrementUseCount(this.currentMediaKey);
                }
                if (this.videoThumbIsSame && (((z2 = (drawable3 = this.currentThumbDrawable) instanceof AnimatedFileDrawable)) || (this.currentImageDrawable instanceof AnimatedFileDrawable))) {
                    animatedFileDrawable2.seekTo(z2 ? ((AnimatedFileDrawable) drawable3).getLastFrameTimestamp() : 0L, true, true);
                }
            }
            this.currentMediaDrawable = drawable;
            updateDrawableRadius(drawable);
            if (this.currentImageDrawable == null) {
                if ((!z && !this.forcePreview) || this.forceCrossfade) {
                    Drawable drawable8 = this.currentThumbDrawable;
                    if ((drawable8 == null && this.staticThumbDrawable == null) || this.currentAlpha == 1.0f || this.forceCrossfade) {
                        if (drawable8 != null && this.staticThumbDrawable != null) {
                            this.previousAlpha = this.currentAlpha;
                        } else {
                            this.previousAlpha = 1.0f;
                        }
                        this.currentAlpha = 0.0f;
                        this.lastUpdateAlphaTime = System.currentTimeMillis();
                        this.crossfadeWithThumb = (this.crossfadeImage == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null) ? false : true;
                    }
                } else {
                    this.currentAlpha = 1.0f;
                    this.previousAlpha = 1.0f;
                }
            }
        } else if (i == 1) {
            if (this.currentThumbDrawable != null) {
                return false;
            }
            if (!this.forcePreview) {
                AnimatedFileDrawable animation = getAnimation();
                if (animation != null && animation.hasBitmap()) {
                    return false;
                }
                Drawable drawable9 = this.currentImageDrawable;
                if ((drawable9 != null && !(drawable9 instanceof AnimatedFileDrawable)) || ((drawable2 = this.currentMediaDrawable) != null && !(drawable2 instanceof AnimatedFileDrawable))) {
                    return false;
                }
            }
            if (!str.equals(this.currentThumbKey)) {
                return false;
            }
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
            if (!z && this.crossfadeAlpha != 2) {
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
            } else {
                this.currentAlpha = 1.0f;
                this.previousAlpha = 1.0f;
            }
        }
        ImageReceiverDelegate imageReceiverDelegate4 = this.delegate;
        if (imageReceiverDelegate4 != null) {
            Drawable drawable10 = this.currentImageDrawable;
            imageReceiverDelegate4.didSetImage(this, (drawable10 == null && this.currentThumbDrawable == null && this.staticThumbDrawable == null && this.currentMediaDrawable == null) ? false : true, drawable10 == null && this.currentMediaDrawable == null, z);
        }
        if (drawable instanceof AnimatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable = (AnimatedEmojiDrawable) drawable;
            if (this.attachedToWindow) {
                animatedEmojiDrawable.addView(this);
            }
        } else if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable3 = (AnimatedFileDrawable) drawable;
            animatedFileDrawable3.setUseSharedQueue(this.useSharedAnimationQueue);
            if (this.attachedToWindow) {
                animatedFileDrawable3.addParent(this);
            }
            if (this.allowStartAnimation && this.currentOpenedLayerFlags == 0) {
                animatedFileDrawable3.checkRepeat();
            }
            animatedFileDrawable3.setAllowDecodeSingleFrame(this.allowDecodeSingleFrame);
            this.animationReadySent = false;
            View view = this.parentView;
            if (view != null) {
                view.invalidate();
            }
        } else if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            if (this.attachedToWindow) {
                rLottieDrawable.addParentView(this);
            }
            if (this.allowStartLottieAnimation && (!rLottieDrawable.isHeavyDrawable() || this.currentOpenedLayerFlags == 0)) {
                rLottieDrawable.start();
            }
            rLottieDrawable.setAllowDecodeSingleFrame(true);
            rLottieDrawable.setAutoRepeat(this.autoRepeat);
            rLottieDrawable.setAutoRepeatCount(this.autoRepeatCount);
            rLottieDrawable.setAutoRepeatTimeout(this.autoRepeatTimeout);
            rLottieDrawable.setAllowDrawFramesWhileCacheGenerating(this.allowDrawWhileCacheGenerating);
            this.animationReadySent = false;
        }
        invalidate();
        return true;
    }

    public void setMediaStartEndTime(long j, long j2) {
        this.startTime = j;
        this.endTime = j2;
        Drawable drawable = this.currentMediaDrawable;
        if (drawable instanceof AnimatedFileDrawable) {
            ((AnimatedFileDrawable) drawable).setStartEndTime(j, j2);
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
            ((AnimatedFileDrawable) drawable).removeParent(this);
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
                AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
                if (animatedFileDrawable.isWebmSticker) {
                    boolean zDecrementUseCount2 = ImageLoader.getInstance().decrementUseCount(str2);
                    if (ImageLoader.getInstance().isInMemCache(str2, true)) {
                        if (zDecrementUseCount2) {
                            animatedFileDrawable.stop();
                        }
                    } else if (zDecrementUseCount2) {
                        animatedFileDrawable.recycle();
                    }
                } else if (animatedFileDrawable.getParents().isEmpty()) {
                    animatedFileDrawable.recycle();
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

    public void setCrossfadeDuration(int i) {
        this.crossfadeDuration = i;
    }

    public void setCrossfadeByScale(float f) {
        this.crossfadeByScale = f;
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
                    lottieAnimation.stop();
                }
                AnimatedFileDrawable animation = getAnimation();
                if (animation != null) {
                    animation.stop();
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
                    lottieAnimation2.setAllowVibration(this.allowLottieVibration);
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

    public void startCrossfadeFromStaticThumb(Bitmap bitmap) {
        startCrossfadeFromStaticThumb(new BitmapDrawable((Resources) null, bitmap));
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

    public View getParentView() {
        return this.parentView;
    }

    public boolean isAttachedToWindow() {
        return this.attachedToWindow;
    }

    public void setVideoThumbIsSame(boolean z) {
        this.videoThumbIsSame = z;
    }

    public void setAllowLoadingOnAttachedOnly(boolean z) {
        this.allowLoadingOnAttachedOnly = z;
    }

    public void setSkipUpdateFrame(boolean z) {
        this.skipUpdateFrame = z;
    }

    public void setCurrentTime(long j) {
        this.currentTime = j;
    }

    public void setFileLoadingPriority(int i) {
        if (this.fileLoadingPriority != i) {
            this.fileLoadingPriority = i;
            if (this.attachedToWindow && hasImageSet()) {
                ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
            }
        }
    }

    public void bumpPriority() {
        ImageLoader.getInstance().changeFileLoadingPriorityForImageReceiver(this);
    }

    public int getFileLoadingPriority() {
        return this.fileLoadingPriority;
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

    public void addDecorator(Decorator decorator) {
        if (this.decorators == null) {
            this.decorators = new ArrayList<>();
        }
        this.decorators.add(decorator);
        if (this.attachedToWindow) {
            decorator.onAttachedToWindow(this);
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

    public static class ReactionLastFrame extends BitmapDrawable {
        public static final float LAST_FRAME_SCALE = 1.2f;

        public ReactionLastFrame(Bitmap bitmap) {
            super(bitmap);
        }
    }
}
