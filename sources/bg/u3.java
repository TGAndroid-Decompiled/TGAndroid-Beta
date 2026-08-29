package bg;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import i7.f6;
import j7.la;
import j7.s7;
import j7.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import nh.o7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.tc;
import org.telegram.ui.mq0;
public final class u3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f2549n0 = 0;
    public r3 A;
    public float B;
    public boolean C;
    public r3[] D;
    public volatile Bitmap E;
    public int F;
    public Bitmap G;
    public boolean H;
    public final TextView I;
    public ValueAnimator J;
    public float K;
    public float L;
    public float M;
    public float N;
    public p01 O;
    public int P;
    public int Q;
    public boolean R;
    public s3 S;
    public final c6 T;
    public g3 U;
    public String V;
    public nh.t0 W;
    public int f2550a;
    public final Matrix f2551a0;
    public final d6 f2552b;
    public float f2553b0;
    public final d6 f2554c;
    public float f2555c0;
    public final Paint d;
    public final w2 f2556d0;
    public final Paint f2557e;
    public boolean f2558e0;
    public final Paint f2559f;
    public final Matrix f2560f0;
    public Path f2561g0;
    public final Paint h;
    public Path f2562h0;
    public final RectF f2563i0;
    public float f2564j0;
    public float f2565k0;
    public final ArrayList f2566l0;
    public final Rect m0;
    public final PathMeasure f2567n;
    public final Path f2568r;
    public final Path f2569s;
    public final Path v;
    public final Path f2570w;
    public volatile boolean f2571x;
    public volatile boolean f2572y;

    public u3(ContextThemeWrapper contextThemeWrapper, c6 c6Var) {
        super(contextThemeWrapper);
        this.f2550a = -1;
        jr jrVar = jr.h;
        this.f2552b = new d6(0.0f, (View) null, 0L, 420L, jrVar);
        this.f2554c = new d6(0.0f, (View) null, 0L, 420L, jrVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f2557e = paint2;
        Paint paint3 = new Paint(1);
        this.f2559f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f2567n = new PathMeasure();
        this.f2568r = new Path();
        this.f2569s = new Path();
        this.v = new Path();
        this.f2570w = new Path();
        this.B = 2.0f;
        this.f2551a0 = new Matrix();
        this.f2560f0 = new Matrix();
        this.f2563i0 = new RectF();
        this.f2566l0 = new ArrayList();
        this.m0 = new Rect();
        this.T = c6Var;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(contextThemeWrapper);
        this.I = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, f6.e(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        w2 w2Var = new w2(contextThemeWrapper);
        this.f2556d0 = w2Var;
        w2Var.setAlpha(0.0f);
        w2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w2Var.b(0.33f, 10.0f);
        w2Var.setBrushWeight(this.B);
        w2Var.setValueOverride(new m5.i(this, 6));
        w2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        w2Var.setAlpha(0.0f);
        addView(w2Var, f6.c(-1.0f, -1));
    }

    public static void c(bg.r3 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: bg.u3.c(bg.r3, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((q3) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            q3 q3Var = (q3) arrayList.get(i10 - 1);
            q3 q3Var2 = (q3) arrayList.get(i10);
            i10++;
            q3 q3Var3 = (q3) arrayList.get(i10);
            int i11 = ((Point) q3Var2).x;
            int i12 = ((Point) q3Var).x;
            int i13 = ((Point) q3Var3).y;
            int i14 = ((Point) q3Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) q3Var3).x - i12) * (((Point) q3Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(q3Var2);
            }
        }
        arrayList2.add((q3) j7.l1.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final s3 s3Var = this.S;
        if (s3Var != null) {
            final int i10 = UserConfig.selectedAccount;
            s3Var.f2522o = true;
            if (s3Var.f2520m != null) {
                h();
                s3Var.f2520m.run(s3Var.f2511b, s3Var.f2513e.document);
                AndroidUtilities.runOnUIThread(new ag.o0(3), 250L);
            } else if (s3Var.f2518k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(s3Var.f2518k, s3Var.f2512c).document;
                tL_stickers_replaceSticker.new_sticker = s3Var.f2513e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final u3 f2376b;

                    {
                        this.f2376b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final u3 u3Var = this.f2376b;
                                final int i11 = i10;
                                final s3 s3Var2 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var2 = u3Var;
                                                final s3 s3Var3 = s3Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var2.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            s3 s3Var4 = s3Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            u3 u3Var3 = u3Var2;
                                                            u3Var3.getClass();
                                                            switch (i13) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var4.f2514f.document;
                                                                    String str = s3Var4.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject3, document, str, bool);
                                                                    u3Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, s3Var4.f2514f.document, s3Var4.f2519l, Boolean.TRUE);
                                                                    u3Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var4.f2514f.document;
                                                                    String str2 = s3Var4.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject3, document2, str2, bool2);
                                                                    u3Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var2.n(tL_error);
                                                    u3Var2.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = s3Var3.f2521n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    s3Var3.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var3 = u3Var;
                                                final s3 s3Var4 = s3Var2;
                                                if (z14) {
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var3.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            s3 s3Var42 = s3Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var32 = u3Var3;
                                                            u3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var42.f2514f.document;
                                                                    String str = s3Var42.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject32, document, str, bool);
                                                                    u3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f2514f.document, s3Var42.f2519l, Boolean.TRUE);
                                                                    u3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var42.f2514f.document;
                                                                    String str2 = s3Var42.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var3.n(tL_error);
                                                    u3Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var4.f2521n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    s3Var4.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var;
                                                final s3 s3Var5 = s3Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            s3 s3Var42 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var32 = u3Var4;
                                                            u3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var42.f2514f.document;
                                                                    String str = s3Var42.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f2514f.document, s3Var42.f2519l, Boolean.TRUE);
                                                                    u3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var42.f2514f.document;
                                                                    String str2 = s3Var42.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final u3 u3Var2 = this.f2376b;
                                final int i12 = i10;
                                final s3 s3Var3 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var2;
                                                final s3 s3Var32 = s3Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            s3 s3Var42 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var32 = u3Var22;
                                                            u3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var42.f2514f.document;
                                                                    String str = s3Var42.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f2514f.document, s3Var42.f2519l, Boolean.TRUE);
                                                                    u3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var42.f2514f.document;
                                                                    String str2 = s3Var42.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = s3Var32.f2521n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var3 = u3Var2;
                                                final s3 s3Var4 = s3Var3;
                                                if (z14) {
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var3.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            s3 s3Var42 = s3Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var32 = u3Var3;
                                                            u3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var42.f2514f.document;
                                                                    String str = s3Var42.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f2514f.document, s3Var42.f2519l, Boolean.TRUE);
                                                                    u3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var42.f2514f.document;
                                                                    String str2 = s3Var42.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var3.n(tL_error);
                                                    u3Var3.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var4.f2521n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    s3Var4.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var2;
                                                final s3 s3Var5 = s3Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            s3 s3Var42 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var32 = u3Var4;
                                                            u3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var42.f2514f.document;
                                                                    String str = s3Var42.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f2514f.document, s3Var42.f2519l, Boolean.TRUE);
                                                                    u3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var42.f2514f.document;
                                                                    String str2 = s3Var42.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final u3 u3Var3 = this.f2376b;
                                final int i13 = i10;
                                final s3 s3Var4 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var3;
                                                final s3 s3Var32 = s3Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            s3 s3Var42 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var32 = u3Var22;
                                                            u3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var42.f2514f.document;
                                                                    String str = s3Var42.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var42.f2514f.document, s3Var42.f2519l, Boolean.TRUE);
                                                                    u3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var42.f2514f.document;
                                                                    String str2 = s3Var42.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = s3Var32.f2521n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var3;
                                                final s3 s3Var42 = s3Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var42.f2521n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var3;
                                                final s3 s3Var5 = s3Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            } else if (s3Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = s3Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(s3Var.f2513e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final u3 f2376b;

                    {
                        this.f2376b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final u3 u3Var = this.f2376b;
                                final int i11 = i10;
                                final s3 s3Var2 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var;
                                                final s3 s3Var32 = s3Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = s3Var32.f2521n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var;
                                                final s3 s3Var42 = s3Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var42.f2521n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var;
                                                final s3 s3Var5 = s3Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final u3 u3Var2 = this.f2376b;
                                final int i12 = i10;
                                final s3 s3Var3 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var2;
                                                final s3 s3Var32 = s3Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = s3Var32.f2521n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var2;
                                                final s3 s3Var42 = s3Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var42.f2521n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var2;
                                                final s3 s3Var5 = s3Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final u3 u3Var3 = this.f2376b;
                                final int i13 = i10;
                                final s3 s3Var4 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var3;
                                                final s3 s3Var32 = s3Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var = u3Var22.W;
                                                    if (t0Var != null) {
                                                        t0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback = s3Var32.f2521n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var3;
                                                final s3 s3Var42 = s3Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var2 = u3Var32.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback2 = s3Var42.f2521n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var3;
                                                final s3 s3Var5 = s3Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var5.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            } else if (s3Var.h) {
                h();
                NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new a4.g(s3Var, 15), 350L);
                Utilities.Callback callback = s3Var.f2521n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (s3Var.f2516i != 0) {
                SendMessagesHelper.getInstance(i10).sendSticker(s3Var.f2514f.document, null, s3Var.f2516i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                nh.t0 t0Var = this.W;
                if (t0Var != null) {
                    t0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new f(this, i10, 2), 450L);
                Utilities.Callback callback2 = s3Var.f2521n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    s3Var.f2521n = null;
                }
            } else if (s3Var.f2517j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(s3Var.f2517j);
                tL_stickers_addStickerToSet.sticker = s3Var.f2513e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final u3 f2376b;

                    {
                        this.f2376b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final u3 u3Var = this.f2376b;
                                final int i11 = i10;
                                final s3 s3Var2 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var;
                                                final s3 s3Var32 = s3Var2;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var2 = u3Var22.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var32.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var;
                                                final s3 s3Var42 = s3Var2;
                                                if (z14) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var22 = u3Var32.W;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = s3Var42.f2521n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var;
                                                final s3 s3Var5 = s3Var2;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = s3Var5.f2521n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final u3 u3Var2 = this.f2376b;
                                final int i12 = i10;
                                final s3 s3Var3 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var2;
                                                final s3 s3Var32 = s3Var3;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var2 = u3Var22.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var32.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var2;
                                                final s3 s3Var42 = s3Var3;
                                                if (z14) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var22 = u3Var32.W;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = s3Var42.f2521n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var2;
                                                final s3 s3Var5 = s3Var3;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = s3Var5.f2521n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final u3 u3Var3 = this.f2376b;
                                final int i13 = i10;
                                final s3 s3Var4 = s3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z10;
                                        boolean z11;
                                        boolean z12;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z13 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var22 = u3Var3;
                                                final s3 s3Var32 = s3Var4;
                                                if (z13) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f22419id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var2 = u3Var22.W;
                                                    if (t0Var2 != null) {
                                                        t0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            u3 u3Var322 = u3Var22;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z10 = true;
                                                } else {
                                                    u3Var22.n(tL_error);
                                                    u3Var22.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback3 = s3Var32.f2521n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z10));
                                                    s3Var32.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z14 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var32 = u3Var3;
                                                final s3 s3Var42 = s3Var4;
                                                if (z14) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    nh.t0 t0Var22 = u3Var32.W;
                                                    if (t0Var22 != null) {
                                                        t0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            u3 u3Var322 = u3Var32;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z11 = true;
                                                } else {
                                                    u3Var32.n(tL_error);
                                                    u3Var32.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback22 = s3Var42.f2521n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z11));
                                                    s3Var42.f2521n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z15 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final u3 u3Var4 = u3Var3;
                                                final s3 s3Var5 = s3Var4;
                                                if (z15) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f22419id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    nh.t0 t0Var3 = u3Var4.W;
                                                    if (t0Var3 != null) {
                                                        t0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            s3 s3Var422 = s3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            u3 u3Var322 = u3Var4;
                                                            u3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = s3Var422.f2514f.document;
                                                                    String str = s3Var422.f2519l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    u3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, s3Var422.f2514f.document, s3Var422.f2519l, Boolean.TRUE);
                                                                    u3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = s3Var422.f2514f.document;
                                                                    String str2 = s3Var422.f2519l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    u3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z12 = true;
                                                } else {
                                                    u3Var4.n(tL_error);
                                                    u3Var4.h();
                                                    z12 = false;
                                                }
                                                Utilities.Callback callback32 = s3Var5.f2521n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z12));
                                                    s3Var5.f2521n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                });
            }
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        this.E = null;
        if (this.D != null) {
            int i10 = 0;
            while (true) {
                r3[] r3VarArr = this.D;
                if (i10 >= r3VarArr.length) {
                    break;
                }
                r3 r3Var = r3VarArr[i10];
                if (r3Var != null) {
                    r3Var.f2486l.reset();
                    Bitmap bitmap = r3Var.f2480e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        r3Var.f2480e = null;
                    }
                    Bitmap bitmap2 = r3Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        r3Var.d = null;
                    }
                    Bitmap bitmap3 = r3Var.f2482g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        r3Var.f2482g = null;
                    }
                    Bitmap bitmap4 = r3Var.f2481f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        r3Var.f2481f = null;
                    }
                }
                i10++;
            }
            this.D = null;
        }
        this.f2572y = false;
        this.f2571x = false;
        this.H = false;
        this.I.setAlpha(0.0f);
        this.I.setScaleX(0.3f);
        this.I.setScaleY(0.3f);
        s3 s3Var = this.S;
        if (s3Var != null) {
            if (!s3Var.f2522o) {
                s3Var.a();
            }
            this.S = null;
        }
        h();
        this.R = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z10) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap != null && !bitmap.isRecycled() && sourceBitmap != null) {
            Paint paint = new Paint(3);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap);
            if (z10) {
                canvas.scale(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, i10, i11, paint);
            } else {
                canvas.drawBitmap(bitmap, i10, i11, paint);
            }
            Utilities.stackBlurBitmap(createBitmap, 5);
            Bitmap createBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
            Paint paint2 = new Paint(3);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
            createBitmap.recycle();
            return createBitmap2;
        }
        return null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s3 s3Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            s3 s3Var2 = this.S;
            if (s3Var2 != null && str.equalsIgnoreCase(s3Var2.f2511b)) {
                s3 s3Var3 = this.S;
                s3Var3.f2515g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = s3Var3.f2515g;
                if (s3Var3.f2526s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = s3Var3.f2512c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new h3(0, this, s3Var3), 2);
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            s3 s3Var4 = this.S;
            if (s3Var4 != null && str2.equalsIgnoreCase(s3Var4.f2511b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    s3 s3Var5 = this.S;
                    s3Var5.f2528u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, s3Var5.f2528u);
                    nh.t0 t0Var = this.W;
                    if (t0Var != null) {
                        t0Var.setProgress(this.S.b());
                    }
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            s3 s3Var6 = this.S;
            if (s3Var6 != null && str3.equalsIgnoreCase(s3Var6.f2511b)) {
                h();
            }
        } else if (i10 == NotificationCenter.filePreparingStarted) {
            s3 s3Var7 = this.S;
            if (s3Var7 != null && objArr[0] == s3Var7.f2525r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.S.f2511b, false, true, 67108864);
            }
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            s3 s3Var8 = this.S;
            if (s3Var8 != null && objArr[0] == s3Var8.f2525r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f9 = (Float) objArr[4];
                float floatValue = f9.floatValue();
                this.S.f2525r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f2550a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f9);
                s3 s3Var9 = this.S;
                s3Var9.f2527t = Math.max(s3Var9.f2527t, floatValue);
                nh.t0 t0Var2 = this.W;
                if (t0Var2 != null) {
                    t0Var2.setProgress(this.S.b());
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && (s3Var = this.S) != null && objArr[0] == s3Var.f2525r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.f2557e);
        canvas.drawPath(this.f2570w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: bg.u3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        r3 r3Var = this.A;
        if (r3Var != null) {
            this.G = bitmap;
            if (r3Var.f2481f != null && this.H) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                r3 r3Var2 = this.A;
                if (r3Var2.f2479c != 0) {
                    Matrix matrix = new Matrix();
                    r3 r3Var3 = this.A;
                    matrix.postRotate(r3Var3.f2479c, r3Var3.a().getWidth() / 2.0f, this.A.a().getHeight() / 2.0f);
                    r3 r3Var4 = this.A;
                    if ((r3Var4.f2479c / 90) % 2 != 0) {
                        float height = (r3Var4.b().getHeight() - this.A.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.A.a().getHeight(), bitmap.getHeight() / this.A.a().getWidth());
                    canvas.drawBitmap(this.A.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(r3Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f2552b.d(0.0f, false);
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.I;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(jr.h).start();
    }

    public final void g(Canvas canvas, boolean z10, ViewGroup viewGroup, boolean z11) {
        boolean z12;
        float e10;
        float f9;
        Paint paint;
        d6 d6Var = this.f2554c;
        d6Var.f27664a = viewGroup;
        boolean z13 = this.f2558e0;
        if (z13 || d6Var.f27666c > 0.0f) {
            if (viewGroup == null) {
                e10 = 1.0f;
            } else {
                if (z13 && !z11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                e10 = d6Var.e(z12);
            }
            r3[] r3VarArr = this.D;
            if (r3VarArr != null) {
                for (r3 r3Var : r3VarArr) {
                    if (r3Var != null && r3Var == this.A) {
                        if (this.B > 0.0f) {
                            if (r3Var.f2494t.f2561g0 != null) {
                                canvas.save();
                                canvas.clipPath(r3Var.f2494t.f2561g0);
                                if (r3Var.f2494t.E != null) {
                                    if (z10) {
                                        paint = r3Var.f2491q;
                                    } else {
                                        paint = r3Var.f2490p;
                                    }
                                    paint.setAlpha((int) (e10 * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f9));
                                    canvas.drawPath(r3Var.f2486l, paint);
                                    if (r3Var.f2494t.f2561g0 != null && z10) {
                                        canvas.clipPath(r3Var.f2486l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f9 * 2.0f));
                                        canvas.drawPath(r3Var.f2494t.f2561g0, paint);
                                    }
                                }
                                canvas.restore();
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.L;
    }

    public float getSegmentBorderImageWidth() {
        return this.K;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        r3 r3Var;
        if (this.H && (r3Var = this.A) != null) {
            return r3Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.E;
    }

    public p01 getThanosEffect() {
        if (!p01.c()) {
            return null;
        }
        if (this.O == null) {
            p01 p01Var = new p01(getContext(), new i3(this, 1));
            this.O = p01Var;
            addView(p01Var, f6.c(-1.0f, -1));
        }
        return this.O;
    }

    public final void h() {
        nh.t0 t0Var = this.W;
        if (t0Var != null) {
            t0Var.a();
            this.W = null;
        }
    }

    public final boolean i() {
        return this.H;
    }

    public final r3 j(float f9, float f10) {
        int width;
        int height;
        if (this.E == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.D;
            if (i10 >= r3VarArr.length) {
                return null;
            }
            r3 r3Var = r3VarArr[i10];
            if (r3Var != null) {
                if ((r3Var.f2479c / 90) % 2 != 0) {
                    width = this.E.getHeight();
                    height = this.E.getWidth();
                } else {
                    width = this.E.getWidth();
                    height = this.E.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.D[i10].f2483i;
                float f11 = width;
                float f12 = this.f2553b0;
                float f13 = height;
                float f14 = this.f2555c0;
                rectF.set((rectF2.left / f11) * f12, (rectF2.top / f13) * f14, (rectF2.right / f11) * f12, (rectF2.bottom / f13) * f14);
                this.f2551a0.mapRect(rectF);
                if (rectF.contains(f9, f10)) {
                    return r3Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        r3[] r3VarArr = this.D;
        if (r3VarArr != null) {
            for (r3 r3Var : r3VarArr) {
                if (r3Var != null && (bitmap = r3Var.f2480e) != null) {
                    bitmap.recycle();
                    r3Var.f2480e = null;
                    Bitmap bitmap2 = r3Var.f2482g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        r3Var.f2482g = null;
                    }
                    c(r3Var, this.P, this.Q);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, mq0 mq0Var) {
        int i13;
        int i14;
        gb.c cVar;
        if (i11 <= 0) {
            i13 = AndroidUtilities.displaySize.x;
        } else {
            i13 = i11;
        }
        if (i12 <= 0) {
            i14 = AndroidUtilities.displaySize.y;
        } else {
            i14 = i12;
        }
        this.P = i13;
        this.Q = i14;
        if (!this.f2572y && !this.f2571x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.E = bitmap;
            this.F = i10;
            this.V = null;
            n3 n3Var = new n3(this, i10, mq0Var, 0);
            this.f2571x = true;
            kb.d dVar = new kb.d();
            dVar.f13607b = true;
            dVar.f13608c = true;
            zzd a2 = i7.g.a(new kb.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.E;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f2536e = min;
                obj.d = min;
                obj.f2533a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f2533a).drawRect(0.0f, 0.0f, obj.d, obj.f2536e, g6.Jl);
                obj.f2534b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f2535c = (bitmap2.getHeight() - obj.f2536e) / 2;
                arrayList.add(obj);
                n3Var.run(arrayList);
                return;
            }
            fb.a a10 = fb.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new a1.c(n3Var, 9)).addOnFailureListener(new p3(this, bitmap, i10, mq0Var, n3Var, 0));
            if (this.V == null) {
                ib.b bVar = ib.b.f8825b;
                z5.l.i(bVar, "options cannot be null");
                synchronized (gb.c.class) {
                    cVar = (gb.c) ab.h.c().a(gb.c.class);
                }
                z9.b bVar2 = (z9.b) cVar.f7262a.get(ib.b.class);
                z5.l.h(bVar2);
                jb.d dVar2 = (jb.d) bVar2.get();
                dVar2.getClass();
                la laVar = dVar2.f11429c;
                ?? obj2 = new Object();
                obj2.f2120c = s7.TYPE_THIN;
                ab.q.f333a.execute(new c2.p(laVar, new ag.j2((c2) obj2, 1), u7.ON_DEVICE_IMAGE_LABEL_CREATE, laVar.b(), false, 5));
                new ImageLabelerImpl((ab.f) dVar2.f11427a.G(bVar), (Executor) dVar2.f11428b.f305a.get(), new w5.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new a1.c(this, 10)).addOnFailureListener(new a9.f(16));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f2550a).getEnabledReactionsList();
            for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
                Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new tc((FrameLayout) getParent(), this.T).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f2561g0;
        if (path == null) {
            this.f2561g0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f2562h0 == null) {
            this.f2562h0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f2562h0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f2561g0.addPath(this.f2562h0, this.f2560f0);
        this.f2561g0.computeBounds(this.f2563i0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f2550a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(10.0f);
        float f9 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f9;
        float measuredHeight = getMeasuredHeight() - f9;
        float f10 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f11 = measuredWidth + dp;
        rectF.set(dp, dp, f11, f11);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f2569s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        Path path2 = this.f2568r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f2570w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f10, f10, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.I.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f2566l0;
            arrayList.clear();
            if (this.f2558e0) {
                Rect rect = this.m0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z10, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                boolean z11;
                s3 s3Var;
                u3 u3Var = u3.this;
                Utilities.Callback callback3 = callback;
                if (callback3 != null && (s3Var = u3Var.S) != null && s3Var.f2522o) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    s3 s3Var2 = u3Var.S;
                    if (s3Var2 != null) {
                        s3Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f2523p = new ArrayList();
                    obj.f2524q = new ArrayList();
                    obj.f2527t = 0.0f;
                    obj.f2528u = 0.0f;
                    u3Var.S = obj;
                }
                s3 s3Var3 = u3Var.S;
                s3Var3.f2512c = str2;
                String str4 = str;
                s3Var3.f2511b = str4;
                s3Var3.f2510a = str4;
                s3Var3.d = charSequence;
                s3Var3.h = z10;
                s3Var3.f2516i = j10;
                s3Var3.f2517j = stickerSet;
                s3Var3.f2518k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                s3Var3.f2526s = videoEditedInfo2;
                s3Var3.f2519l = str3;
                s3Var3.f2521n = callback3;
                s3Var3.f2520m = callback2;
                ArrayList arrayList = s3Var3.f2524q;
                if (!TextUtils.isEmpty(str4)) {
                    s3Var3.f2523p.add(new File(s3Var3.f2511b));
                }
                if (!TextUtils.isEmpty(s3Var3.f2510a) && !TextUtils.equals(s3Var3.f2510a, s3Var3.f2511b)) {
                    arrayList.add(new File(s3Var3.f2510a));
                }
                if (!TextUtils.isEmpty(s3Var3.f2519l)) {
                    arrayList.add(new File(s3Var3.f2519l));
                }
                if (!z11) {
                    u3Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        s3 s3Var4 = u3Var.S;
                        s3Var4.f2513e = MediaDataController.getInputStickerSetItem(document3, s3Var4.f2512c);
                        u3Var.S.f2514f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = u3Var.S.f2514f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        u3Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f22413id = 1;
                        s3 s3Var5 = u3Var.S;
                        String absolutePath = o7.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        s3Var5.f2511b = absolutePath;
                        u3Var.S.f2525r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        u3Var.S.f2525r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(u3Var.S.f2525r, false, false, false);
                    } else {
                        FileLoader.getInstance(u3Var.f2550a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (u3Var.W == null) {
                        u3Var.W = new nh.t0(u3Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    u3Var.W.setOnCancelListener(new i3(u3Var, 0));
                    if (u3Var.W.getParent() == null) {
                        u3Var.addView(u3Var.W, f6.e(-1, -1, 17));
                    }
                    nh.t0 t0Var = u3Var.W;
                    t0Var.A = true;
                    t0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f2550a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f2550a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f2550a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f2550a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z10) {
        float f9;
        if (this.f2558e0 != z10) {
            this.f2558e0 = z10;
            ViewPropertyAnimator animate = this.f2556d0.animate();
            float f10 = 0.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (!z10) {
                f10 = AndroidUtilities.dp(-18.0f);
            }
            alpha.translationX(f10).setInterpolator(jr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f2566l0;
                arrayList.clear();
                if (this.f2558e0) {
                    Rect rect = this.m0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f9) {
        this.B = f9;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(g3 g3Var) {
        this.U = g3Var;
    }
}
