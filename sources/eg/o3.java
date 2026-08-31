package eg;

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
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import k7.c6;
import l7.la;
import l7.s7;
import l7.u7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.uq0;
import qh.s6;
public final class o3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f5399o0 = 0;
    public l3 B;
    public float C;
    public boolean D;
    public l3[] E;
    public volatile Bitmap F;
    public int G;
    public Bitmap H;
    public boolean I;
    public final TextView J;
    public ValueAnimator K;
    public float L;
    public float M;
    public float N;
    public float O;
    public b11 P;
    public int Q;
    public int R;
    public boolean S;
    public m3 T;
    public final g6 U;
    public a3 V;
    public String W;
    public int f5400a;
    public qh.m0 f5401a0;
    public final z5 f5402b;
    public final Matrix f5403b0;
    public final z5 f5404c;
    public float f5405c0;
    public final Paint d;
    public float f5406d0;
    public final Paint f5407e;
    public final r2 f5408e0;
    public final Paint f5409f;
    public boolean f5410f0;
    public final Matrix f5411g0;
    public final Paint h;
    public Path f5412h0;
    public Path f5413i0;
    public final RectF f5414j0;
    public float f5415k0;
    public float f5416l0;
    public final ArrayList m0;
    public final PathMeasure f5417n;
    public final Rect f5418n0;
    public final Path f5419r;
    public final Path f5420s;
    public final Path v;
    public final Path f5421w;
    public volatile boolean f5422x;
    public volatile boolean f5423y;

    public o3(ContextThemeWrapper contextThemeWrapper, g6 g6Var) {
        super(contextThemeWrapper);
        this.f5400a = -1;
        pr prVar = pr.h;
        this.f5402b = new z5(0.0f, (View) null, 0L, 420L, prVar);
        this.f5404c = new z5(0.0f, (View) null, 0L, 420L, prVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.f5407e = paint2;
        Paint paint3 = new Paint(1);
        this.f5409f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f5417n = new PathMeasure();
        this.f5419r = new Path();
        this.f5420s = new Path();
        this.v = new Path();
        this.f5421w = new Path();
        this.C = 2.0f;
        this.f5403b0 = new Matrix();
        this.f5411g0 = new Matrix();
        this.f5414j0 = new RectF();
        this.m0 = new ArrayList();
        this.f5418n0 = new Rect();
        this.U = g6Var;
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
        this.J = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, c6.e(-2, -2, 17));
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
        r2 r2Var = new r2(contextThemeWrapper);
        this.f5408e0 = r2Var;
        r2Var.setAlpha(0.0f);
        r2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        r2Var.b(0.33f, 10.0f);
        r2Var.setBrushWeight(this.C);
        r2Var.setValueOverride(new ja.c(this));
        r2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        r2Var.setAlpha(0.0f);
        addView(r2Var, c6.c(-1.0f, -1));
    }

    public static void c(eg.l3 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: eg.o3.c(eg.l3, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((k3) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            k3 k3Var = (k3) arrayList.get(i10 - 1);
            k3 k3Var2 = (k3) arrayList.get(i10);
            i10++;
            k3 k3Var3 = (k3) arrayList.get(i10);
            int i11 = ((Point) k3Var2).x;
            int i12 = ((Point) k3Var).x;
            int i13 = ((Point) k3Var3).y;
            int i14 = ((Point) k3Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) k3Var3).x - i12) * (((Point) k3Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(k3Var2);
            }
        }
        arrayList2.add((k3) l.d.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final m3 m3Var = this.T;
        if (m3Var != null) {
            final int i10 = UserConfig.selectedAccount;
            m3Var.f5368o = true;
            if (m3Var.f5366m != null) {
                h();
                m3Var.f5366m.run(m3Var.f5357b, m3Var.f5359e.document);
                AndroidUtilities.runOnUIThread(new ag.f(6), 250L);
            } else if (m3Var.f5364k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(m3Var.f5364k, m3Var.f5358c).document;
                tL_stickers_replaceSticker.new_sticker = m3Var.f5359e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final o3 f5198b;

                    {
                        this.f5198b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final o3 o3Var = this.f5198b;
                                final int i11 = i10;
                                final m3 m3Var2 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var2 = o3Var;
                                                final m3 m3Var3 = m3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var2.f5401a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            m3 m3Var4 = m3Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            o3 o3Var3 = o3Var2;
                                                            o3Var3.getClass();
                                                            switch (i13) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var4.f5360f.document;
                                                                    String str = m3Var4.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject3, document, str, bool);
                                                                    o3Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, m3Var4.f5360f.document, m3Var4.f5365l, Boolean.TRUE);
                                                                    o3Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var4.f5360f.document;
                                                                    String str2 = m3Var4.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject3, document2, str2, bool2);
                                                                    o3Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var2.n(tL_error);
                                                    o3Var2.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = m3Var3.f5367n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    m3Var3.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var3 = o3Var;
                                                final m3 m3Var4 = m3Var2;
                                                if (z13) {
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var3.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            m3 m3Var42 = m3Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var32 = o3Var3;
                                                            o3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var42.f5360f.document;
                                                                    String str = m3Var42.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject32, document, str, bool);
                                                                    o3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f5360f.document, m3Var42.f5365l, Boolean.TRUE);
                                                                    o3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var42.f5360f.document;
                                                                    String str2 = m3Var42.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var3.n(tL_error);
                                                    o3Var3.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var4.f5367n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m3Var4.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var;
                                                final m3 m3Var5 = m3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            m3 m3Var42 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var32 = o3Var4;
                                                            o3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var42.f5360f.document;
                                                                    String str = m3Var42.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f5360f.document, m3Var42.f5365l, Boolean.TRUE);
                                                                    o3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var42.f5360f.document;
                                                                    String str2 = m3Var42.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final o3 o3Var2 = this.f5198b;
                                final int i12 = i10;
                                final m3 m3Var3 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var2;
                                                final m3 m3Var32 = m3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.f5401a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            m3 m3Var42 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var32 = o3Var22;
                                                            o3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var42.f5360f.document;
                                                                    String str = m3Var42.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f5360f.document, m3Var42.f5365l, Boolean.TRUE);
                                                                    o3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var42.f5360f.document;
                                                                    String str2 = m3Var42.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = m3Var32.f5367n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var3 = o3Var2;
                                                final m3 m3Var4 = m3Var3;
                                                if (z13) {
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var3.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            m3 m3Var42 = m3Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var32 = o3Var3;
                                                            o3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var42.f5360f.document;
                                                                    String str = m3Var42.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f5360f.document, m3Var42.f5365l, Boolean.TRUE);
                                                                    o3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var42.f5360f.document;
                                                                    String str2 = m3Var42.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var3.n(tL_error);
                                                    o3Var3.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var4.f5367n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m3Var4.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var2;
                                                final m3 m3Var5 = m3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            m3 m3Var42 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var32 = o3Var4;
                                                            o3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var42.f5360f.document;
                                                                    String str = m3Var42.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f5360f.document, m3Var42.f5365l, Boolean.TRUE);
                                                                    o3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var42.f5360f.document;
                                                                    String str2 = m3Var42.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final o3 o3Var3 = this.f5198b;
                                final int i13 = i10;
                                final m3 m3Var4 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var3;
                                                final m3 m3Var32 = m3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.f5401a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            m3 m3Var42 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var32 = o3Var22;
                                                            o3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var42.f5360f.document;
                                                                    String str = m3Var42.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var42.f5360f.document, m3Var42.f5365l, Boolean.TRUE);
                                                                    o3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var42.f5360f.document;
                                                                    String str2 = m3Var42.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = m3Var32.f5367n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var3;
                                                final m3 m3Var42 = m3Var4;
                                                if (z13) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var42.f5367n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var3;
                                                final m3 m3Var5 = m3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
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
            } else if (m3Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = m3Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(m3Var.f5359e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final o3 f5198b;

                    {
                        this.f5198b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final o3 o3Var = this.f5198b;
                                final int i11 = i10;
                                final m3 m3Var2 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var;
                                                final m3 m3Var32 = m3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.f5401a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = m3Var32.f5367n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var;
                                                final m3 m3Var42 = m3Var2;
                                                if (z13) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var42.f5367n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var;
                                                final m3 m3Var5 = m3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final o3 o3Var2 = this.f5198b;
                                final int i12 = i10;
                                final m3 m3Var3 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var2;
                                                final m3 m3Var32 = m3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.f5401a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = m3Var32.f5367n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var2;
                                                final m3 m3Var42 = m3Var3;
                                                if (z13) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var42.f5367n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var2;
                                                final m3 m3Var5 = m3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final o3 o3Var3 = this.f5198b;
                                final int i13 = i10;
                                final m3 m3Var4 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var3;
                                                final m3 m3Var32 = m3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var = o3Var22.f5401a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = m3Var32.f5367n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var3;
                                                final m3 m3Var42 = m3Var4;
                                                if (z13) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var2 = o3Var32.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = m3Var42.f5367n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var3;
                                                final m3 m3Var5 = m3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var5.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
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
            } else if (m3Var.h) {
                h();
                NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new ag.e(m3Var, 26), 350L);
                Utilities.Callback callback = m3Var.f5367n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (m3Var.f5362i != 0) {
                SendMessagesHelper.getInstance(i10).sendSticker(m3Var.f5360f.document, null, m3Var.f5362i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                qh.m0 m0Var = this.f5401a0;
                if (m0Var != null) {
                    m0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new af.b(this, i10, 4), 450L);
                Utilities.Callback callback2 = m3Var.f5367n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    m3Var.f5367n = null;
                }
            } else if (m3Var.f5363j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(m3Var.f5363j);
                tL_stickers_addStickerToSet.sticker = m3Var.f5359e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final o3 f5198b;

                    {
                        this.f5198b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final o3 o3Var = this.f5198b;
                                final int i11 = i10;
                                final m3 m3Var2 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var;
                                                final m3 m3Var32 = m3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var2 = o3Var22.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var32.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var;
                                                final m3 m3Var42 = m3Var2;
                                                if (z13) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var22 = o3Var32.f5401a0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = m3Var42.f5367n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var;
                                                final m3 m3Var5 = m3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback32 = m3Var5.f5367n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final o3 o3Var2 = this.f5198b;
                                final int i12 = i10;
                                final m3 m3Var3 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var2;
                                                final m3 m3Var32 = m3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var2 = o3Var22.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var32.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var2;
                                                final m3 m3Var42 = m3Var3;
                                                if (z13) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var22 = o3Var32.f5401a0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = m3Var42.f5367n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var2;
                                                final m3 m3Var5 = m3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback32 = m3Var5.f5367n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final o3 o3Var3 = this.f5198b;
                                final int i13 = i10;
                                final m3 m3Var4 = m3Var;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z4;
                                        boolean z10;
                                        boolean z11;
                                        switch (r6) {
                                            case 0:
                                                final TLObject tLObject2 = tLObject;
                                                boolean z12 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var22 = o3Var3;
                                                final m3 m3Var32 = m3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f20870id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var2 = o3Var22.f5401a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            o3 o3Var322 = o3Var22;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    o3Var22.n(tL_error);
                                                    o3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback3 = m3Var32.f5367n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z4));
                                                    m3Var32.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var32 = o3Var3;
                                                final m3 m3Var42 = m3Var4;
                                                if (z13) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    qh.m0 m0Var22 = o3Var32.f5401a0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            o3 o3Var322 = o3Var32;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    o3Var32.n(tL_error);
                                                    o3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = m3Var42.f5367n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    m3Var42.f5367n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final o3 o3Var4 = o3Var3;
                                                final m3 m3Var5 = m3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f20870id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    qh.m0 m0Var3 = o3Var4.f5401a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            m3 m3Var422 = m3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            o3 o3Var322 = o3Var4;
                                                            o3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = m3Var422.f5360f.document;
                                                                    String str = m3Var422.f5365l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    o3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, m3Var422.f5360f.document, m3Var422.f5365l, Boolean.TRUE);
                                                                    o3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = m3Var422.f5360f.document;
                                                                    String str2 = m3Var422.f5365l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    o3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    o3Var4.n(tL_error);
                                                    o3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback32 = m3Var5.f5367n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z11));
                                                    m3Var5.f5367n = null;
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
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        this.F = null;
        if (this.E != null) {
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = this.E;
                if (i10 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = l3VarArr[i10];
                if (l3Var != null) {
                    l3Var.f5335l.reset();
                    Bitmap bitmap = l3Var.f5329e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        l3Var.f5329e = null;
                    }
                    Bitmap bitmap2 = l3Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        l3Var.d = null;
                    }
                    Bitmap bitmap3 = l3Var.f5331g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        l3Var.f5331g = null;
                    }
                    Bitmap bitmap4 = l3Var.f5330f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        l3Var.f5330f = null;
                    }
                }
                i10++;
            }
            this.E = null;
        }
        this.f5423y = false;
        this.f5422x = false;
        this.I = false;
        this.J.setAlpha(0.0f);
        this.J.setScaleX(0.3f);
        this.J.setScaleY(0.3f);
        m3 m3Var = this.T;
        if (m3Var != null) {
            if (!m3Var.f5368o) {
                m3Var.a();
            }
            this.T = null;
        }
        h();
        this.S = false;
    }

    public final Bitmap d(Bitmap bitmap, int i10, int i11, boolean z4) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap != null && !bitmap.isRecycled() && sourceBitmap != null) {
            Paint paint = new Paint(3);
            int width = sourceBitmap.getWidth();
            int height = sourceBitmap.getHeight();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
            Canvas canvas = new Canvas(createBitmap);
            if (z4) {
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
        m3 m3Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            m3 m3Var2 = this.T;
            if (m3Var2 != null && str.equalsIgnoreCase(m3Var2.f5357b)) {
                m3 m3Var3 = this.T;
                m3Var3.f5361g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = m3Var3.f5361g;
                if (m3Var3.f5372s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = m3Var3.f5358c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new b3(0, this, m3Var3), 2);
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            m3 m3Var4 = this.T;
            if (m3Var4 != null && str2.equalsIgnoreCase(m3Var4.f5357b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    m3 m3Var5 = this.T;
                    m3Var5.f5374u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, m3Var5.f5374u);
                    qh.m0 m0Var = this.f5401a0;
                    if (m0Var != null) {
                        m0Var.setProgress(this.T.b());
                    }
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            m3 m3Var6 = this.T;
            if (m3Var6 != null && str3.equalsIgnoreCase(m3Var6.f5357b)) {
                h();
            }
        } else if (i10 == NotificationCenter.filePreparingStarted) {
            m3 m3Var7 = this.T;
            if (m3Var7 != null && objArr[0] == m3Var7.f5371r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.T.f5357b, false, true, 67108864);
            }
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            m3 m3Var8 = this.T;
            if (m3Var8 != null && objArr[0] == m3Var8.f5371r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.T.f5371r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f5400a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f10);
                m3 m3Var9 = this.T;
                m3Var9.f5373t = Math.max(m3Var9.f5373t, floatValue);
                qh.m0 m0Var2 = this.f5401a0;
                if (m0Var2 != null) {
                    m0Var2.setProgress(this.T.b());
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && (m3Var = this.T) != null && objArr[0] == m3Var.f5371r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.f5407e);
        canvas.drawPath(this.f5421w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: eg.o3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        l3 l3Var = this.B;
        if (l3Var != null) {
            this.H = bitmap;
            if (l3Var.f5330f != null && this.I) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                l3 l3Var2 = this.B;
                if (l3Var2.f5328c != 0) {
                    Matrix matrix = new Matrix();
                    l3 l3Var3 = this.B;
                    matrix.postRotate(l3Var3.f5328c, l3Var3.a().getWidth() / 2.0f, this.B.a().getHeight() / 2.0f);
                    l3 l3Var4 = this.B;
                    if ((l3Var4.f5328c / 90) % 2 != 0) {
                        float height = (l3Var4.b().getHeight() - this.B.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.B.a().getHeight(), bitmap.getHeight() / this.B.a().getWidth());
                    canvas.drawBitmap(this.B.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(l3Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f5402b.d(0.0f, false);
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.J;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(pr.h).start();
    }

    public final void g(Canvas canvas, boolean z4, ViewGroup viewGroup, boolean z10) {
        boolean z11;
        float e6;
        float f10;
        Paint paint;
        z5 z5Var = this.f5404c;
        z5Var.f33723a = viewGroup;
        boolean z12 = this.f5410f0;
        if (z12 || z5Var.f33725c > 0.0f) {
            if (viewGroup == null) {
                e6 = 1.0f;
            } else {
                if (z12 && !z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e6 = z5Var.e(z11);
            }
            l3[] l3VarArr = this.E;
            if (l3VarArr != null) {
                for (l3 l3Var : l3VarArr) {
                    if (l3Var != null && l3Var == this.B) {
                        if (this.C > 0.0f) {
                            if (l3Var.f5343t.f5412h0 != null) {
                                canvas.save();
                                canvas.clipPath(l3Var.f5343t.f5412h0);
                                if (l3Var.f5343t.F != null) {
                                    if (z4) {
                                        paint = l3Var.f5340q;
                                    } else {
                                        paint = l3Var.f5339p;
                                    }
                                    paint.setAlpha((int) (e6 * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f10));
                                    canvas.drawPath(l3Var.f5335l, paint);
                                    if (l3Var.f5343t.f5412h0 != null && z4) {
                                        canvas.clipPath(l3Var.f5335l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f10 * 2.0f));
                                        canvas.drawPath(l3Var.f5343t.f5412h0, paint);
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
        return this.M;
    }

    public float getSegmentBorderImageWidth() {
        return this.L;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        l3 l3Var;
        if (this.I && (l3Var = this.B) != null) {
            return l3Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.F;
    }

    public b11 getThanosEffect() {
        if (!b11.c()) {
            return null;
        }
        if (this.P == null) {
            b11 b11Var = new b11(getContext(), new c3(this, 1));
            this.P = b11Var;
            addView(b11Var, c6.c(-1.0f, -1));
        }
        return this.P;
    }

    public final void h() {
        qh.m0 m0Var = this.f5401a0;
        if (m0Var != null) {
            m0Var.a();
            this.f5401a0 = null;
        }
    }

    public final boolean i() {
        return this.I;
    }

    public final l3 j(float f10, float f11) {
        int width;
        int height;
        if (this.F == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            l3[] l3VarArr = this.E;
            if (i10 >= l3VarArr.length) {
                return null;
            }
            l3 l3Var = l3VarArr[i10];
            if (l3Var != null) {
                if ((l3Var.f5328c / 90) % 2 != 0) {
                    width = this.F.getHeight();
                    height = this.F.getWidth();
                } else {
                    width = this.F.getWidth();
                    height = this.F.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.E[i10].f5332i;
                float f12 = width;
                float f13 = this.f5405c0;
                float f14 = height;
                float f15 = this.f5406d0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f5403b0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return l3Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        l3[] l3VarArr = this.E;
        if (l3VarArr != null) {
            for (l3 l3Var : l3VarArr) {
                if (l3Var != null && (bitmap = l3Var.f5329e) != null) {
                    bitmap.recycle();
                    l3Var.f5329e = null;
                    Bitmap bitmap2 = l3Var.f5331g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        l3Var.f5331g = null;
                    }
                    c(l3Var, this.Q, this.R);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, uq0 uq0Var) {
        int i13;
        int i14;
        ib.c cVar;
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
        this.Q = i13;
        this.R = i14;
        if (!this.f5423y && !this.f5422x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.F = bitmap;
            this.G = i10;
            this.W = null;
            h3 h3Var = new h3(this, i10, uq0Var, 0);
            this.f5422x = true;
            mb.d dVar = new mb.d();
            dVar.f13623b = true;
            dVar.f13624c = true;
            zzd a2 = k7.r.a(new mb.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.F;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.f5382e = min;
                obj.d = min;
                obj.f5379a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f5379a).drawRect(0.0f, 0.0f, obj.d, obj.f5382e, k6.Jl);
                obj.f5380b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f5381c = (bitmap2.getHeight() - obj.f5382e) / 2;
                arrayList.add(obj);
                h3Var.run(arrayList);
                return;
            }
            hb.a a10 = hb.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new a1.c(h3Var, 22)).addOnFailureListener(new j3(this, bitmap, i10, uq0Var, h3Var, 0));
            if (this.W == null) {
                kb.b bVar = kb.b.f11045b;
                b6.m.i(bVar, "options cannot be null");
                synchronized (ib.c.class) {
                    cVar = (ib.c) cb.h.c().a(ib.c.class);
                }
                ba.b bVar2 = (ba.b) cVar.f8048a.get(kb.b.class);
                b6.m.h(bVar2);
                lb.d dVar2 = (lb.d) bVar2.get();
                dVar2.getClass();
                la laVar = dVar2.f12265c;
                ?? obj2 = new Object();
                obj2.f157c = s7.TYPE_THIN;
                cb.o.f2429a.execute(new c2.p(laVar, new b4.e0((a9.a) obj2, 1), u7.ON_DEVICE_IMAGE_LABEL_CREATE, laVar.b(), false, 6));
                new ImageLabelerImpl((cb.f) dVar2.f12263a.F(bVar), (Executor) dVar2.f12264b.f2405a.get(), new y5.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new a1.c(this, 23)).addOnFailureListener(new androidx.emoji2.text.w(27));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f5400a).getEnabledReactionsList();
            for (int i15 = 0; i15 < Math.min(enabledReactionsList.size(), 9); i15++) {
                Emoji.getEmojiDrawable(enabledReactionsList.get(i15).reaction);
            }
        }
    }

    public final void n(TLRPC.TL_error tL_error) {
        if (tL_error != null && !"PACK_TITLE_INVALID".equals(tL_error.text)) {
            new qc((FrameLayout) getParent(), this.U).t(tL_error.text, null).j();
        }
    }

    public final void o() {
        Path path = this.f5412h0;
        if (path == null) {
            this.f5412h0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f5413i0 == null) {
            this.f5413i0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f5413i0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f5412h0.addPath(this.f5413i0, this.f5411g0);
        this.f5412h0.computeBounds(this.f5414j0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f5400a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(10.0f);
        float f10 = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f10;
        float measuredHeight = getMeasuredHeight() - f10;
        float f11 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f12 = measuredWidth + dp;
        rectF.set(dp, dp, f12, f12);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.f5420s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f5419r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f5421w;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f11, f11, direction);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.J.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.m0;
            arrayList.clear();
            if (this.f5410f0) {
                Rect rect = this.f5418n0;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void p(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z4, final long j10, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final String str3, final Utilities.Callback callback, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                boolean z10;
                m3 m3Var;
                o3 o3Var = o3.this;
                Utilities.Callback callback3 = callback;
                if (callback3 != null && (m3Var = o3Var.T) != null && m3Var.f5368o) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    m3 m3Var2 = o3Var.T;
                    if (m3Var2 != null) {
                        m3Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f5369p = new ArrayList();
                    obj.f5370q = new ArrayList();
                    obj.f5373t = 0.0f;
                    obj.f5374u = 0.0f;
                    o3Var.T = obj;
                }
                m3 m3Var3 = o3Var.T;
                m3Var3.f5358c = str2;
                String str4 = str;
                m3Var3.f5357b = str4;
                m3Var3.f5356a = str4;
                m3Var3.d = charSequence;
                m3Var3.h = z4;
                m3Var3.f5362i = j10;
                m3Var3.f5363j = stickerSet;
                m3Var3.f5364k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                m3Var3.f5372s = videoEditedInfo2;
                m3Var3.f5365l = str3;
                m3Var3.f5367n = callback3;
                m3Var3.f5366m = callback2;
                ArrayList arrayList = m3Var3.f5370q;
                if (!TextUtils.isEmpty(str4)) {
                    m3Var3.f5369p.add(new File(m3Var3.f5357b));
                }
                if (!TextUtils.isEmpty(m3Var3.f5356a) && !TextUtils.equals(m3Var3.f5356a, m3Var3.f5357b)) {
                    arrayList.add(new File(m3Var3.f5356a));
                }
                if (!TextUtils.isEmpty(m3Var3.f5365l)) {
                    arrayList.add(new File(m3Var3.f5365l));
                }
                if (!z10) {
                    o3Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        m3 m3Var4 = o3Var.T;
                        m3Var4.f5359e = MediaDataController.getInputStickerSetItem(document3, m3Var4.f5358c);
                        o3Var.T.f5360f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = o3Var.T.f5360f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        o3Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f20864id = 1;
                        m3 m3Var5 = o3Var.T;
                        String absolutePath = s6.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        m3Var5.f5357b = absolutePath;
                        o3Var.T.f5371r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        o3Var.T.f5371r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(o3Var.T.f5371r, false, false, false);
                    } else {
                        FileLoader.getInstance(o3Var.f5400a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (o3Var.f5401a0 == null) {
                        o3Var.f5401a0 = new qh.m0(o3Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    o3Var.f5401a0.setOnCancelListener(new c3(o3Var, 0));
                    if (o3Var.f5401a0.getParent() == null) {
                        o3Var.addView(o3Var.f5401a0, c6.e(-1, -1, 17));
                    }
                    qh.m0 m0Var = o3Var.f5401a0;
                    m0Var.B = true;
                    m0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f5400a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f5400a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f5400a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f5400a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z4) {
        float f10;
        if (this.f5410f0 != z4) {
            this.f5410f0 = z4;
            ViewPropertyAnimator animate = this.f5408e0.animate();
            float f11 = 0.0f;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f10);
            if (!z4) {
                f11 = AndroidUtilities.dp(-18.0f);
            }
            alpha.translationX(f11).setInterpolator(pr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.m0;
                arrayList.clear();
                if (this.f5410f0) {
                    Rect rect = this.f5418n0;
                    arrayList.add(rect);
                    int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                    rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
                }
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    public void setOutlineWidth(float f10) {
        this.C = f10;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(a3 a3Var) {
        this.V = a3Var;
    }
}
