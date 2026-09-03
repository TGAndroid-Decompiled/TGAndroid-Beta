package dg;

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
import k7.b6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.zq0;
import ph.t6;
public final class q3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int f4743o0 = 0;
    public n3 B;
    public float C;
    public boolean D;
    public n3[] E;
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
    public a11 P;
    public int Q;
    public int R;
    public boolean S;
    public o3 T;
    public final f6 U;
    public c3 V;
    public String W;
    public int f4744a;
    public ph.m0 f4745a0;
    public final z5 f4746b;
    public final Matrix f4747b0;
    public final z5 f4748c;
    public float f4749c0;
    public final Paint d;
    public float f4750d0;
    public final Paint e;
    public final t2 f4751e0;
    public final Paint f4752f;
    public boolean f4753f0;
    public final Matrix f4754g0;
    public final Paint h;
    public Path f4755h0;
    public Path f4756i0;
    public final RectF f4757j0;
    public float f4758k0;
    public float f4759l0;
    public final ArrayList m0;
    public final PathMeasure f4760n;
    public final Rect f4761n0;
    public final Path f4762r;
    public final Path f4763s;
    public final Path v;
    public final Path f4764w;
    public volatile boolean f4765x;
    public volatile boolean f4766y;

    public q3(ContextThemeWrapper contextThemeWrapper, f6 f6Var) {
        super(contextThemeWrapper);
        this.f4744a = -1;
        mr mrVar = mr.h;
        this.f4746b = new z5(0.0f, (View) null, 0L, 420L, mrVar);
        this.f4748c = new z5(0.0f, (View) null, 0L, 420L, mrVar);
        Paint paint = new Paint(1);
        this.d = paint;
        Paint paint2 = new Paint(1);
        this.e = paint2;
        Paint paint3 = new Paint(1);
        this.f4752f = paint3;
        Paint paint4 = new Paint(1);
        this.h = paint4;
        this.f4760n = new PathMeasure();
        this.f4762r = new Path();
        this.f4763s = new Path();
        this.v = new Path();
        this.f4764w = new Path();
        this.C = 2.0f;
        this.f4747b0 = new Matrix();
        this.f4754g0 = new Matrix();
        this.f4757j0 = new RectF();
        this.m0 = new ArrayList();
        this.f4761n0 = new Rect();
        this.U = f6Var;
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
        addView(textView, b6.e(-2, -2, 17));
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
        t2 t2Var = new t2(contextThemeWrapper);
        this.f4751e0 = t2Var;
        t2Var.setAlpha(0.0f);
        t2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        t2Var.b(0.33f, 10.0f);
        t2Var.setBrushWeight(this.C);
        t2Var.setValueOverride(new bb.b(this, 10));
        t2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        t2Var.setAlpha(0.0f);
        addView(t2Var, b6.c(-1.0f, -1));
    }

    public static void c(dg.n3 r26, int r27, int r28) {
        throw new UnsupportedOperationException("Method not decompiled: dg.q3.c(dg.n3, int, int):void");
    }

    public static List k(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((m3) arrayList.get(0));
        int i10 = 1;
        while (i10 < arrayList.size() - 1) {
            m3 m3Var = (m3) arrayList.get(i10 - 1);
            m3 m3Var2 = (m3) arrayList.get(i10);
            i10++;
            m3 m3Var3 = (m3) arrayList.get(i10);
            int i11 = ((Point) m3Var2).x;
            int i12 = ((Point) m3Var).x;
            int i13 = ((Point) m3Var3).y;
            int i14 = ((Point) m3Var).y;
            if (Math.abs((((i13 - i14) * (i11 - i12)) - ((((Point) m3Var3).x - i12) * (((Point) m3Var2).y - i14))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(m3Var2);
            }
        }
        arrayList2.add((m3) kf.k0.i(1, arrayList));
        return arrayList2;
    }

    public final void a() {
        final o3 o3Var = this.T;
        if (o3Var != null) {
            final int i10 = UserConfig.selectedAccount;
            o3Var.f4714o = true;
            if (o3Var.f4712m != null) {
                h();
                o3Var.f4712m.run(o3Var.f4704b, o3Var.e.document);
                AndroidUtilities.runOnUIThread(new cg.n0(3), 250L);
            } else if (o3Var.f4710k != null) {
                TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
                tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(o3Var.f4710k, o3Var.f4705c).document;
                tL_stickers_replaceSticker.new_sticker = o3Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                    public final q3 f4555b;

                    {
                        this.f4555b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final q3 q3Var = this.f4555b;
                                final int i11 = i10;
                                final o3 o3Var2 = o3Var;
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
                                                final q3 q3Var2 = q3Var;
                                                final o3 o3Var3 = o3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i11;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var = q3Var2.f4745a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i13 = r4;
                                                            o3 o3Var4 = o3Var3;
                                                            TLObject tLObject3 = tLObject2;
                                                            q3 q3Var3 = q3Var2;
                                                            q3Var3.getClass();
                                                            switch (i13) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var4.f4706f.document;
                                                                    String str = o3Var4.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject3, document, str, bool);
                                                                    q3Var3.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, o3Var4.f4706f.document, o3Var4.f4711l, Boolean.TRUE);
                                                                    q3Var3.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var4.f4706f.document;
                                                                    String str2 = o3Var4.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject3, document2, str2, bool2);
                                                                    q3Var3.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var2.n(tL_error);
                                                    q3Var2.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = o3Var3.f4713n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    o3Var3.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var3 = q3Var;
                                                final o3 o3Var4 = o3Var2;
                                                if (z13) {
                                                    int i13 = i11;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var2 = q3Var3.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            o3 o3Var42 = o3Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var32 = q3Var3;
                                                            q3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i14 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var42.f4706f.document;
                                                                    String str = o3Var42.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject32, document, str, bool);
                                                                    q3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var42.f4706f.document, o3Var42.f4711l, Boolean.TRUE);
                                                                    q3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var42.f4706f.document;
                                                                    String str2 = o3Var42.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var3.n(tL_error);
                                                    q3Var3.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = o3Var4.f4713n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    o3Var4.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var;
                                                final o3 o3Var5 = o3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            o3 o3Var42 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var32 = q3Var4;
                                                            q3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var42.f4706f.document;
                                                                    String str = o3Var42.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var42.f4706f.document, o3Var42.f4711l, Boolean.TRUE);
                                                                    q3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var42.f4706f.document;
                                                                    String str2 = o3Var42.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var5.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final q3 q3Var2 = this.f4555b;
                                final int i12 = i10;
                                final o3 o3Var3 = o3Var;
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
                                                final q3 q3Var22 = q3Var2;
                                                final o3 o3Var32 = o3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var = q3Var22.f4745a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            o3 o3Var42 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var32 = q3Var22;
                                                            q3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var42.f4706f.document;
                                                                    String str = o3Var42.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var42.f4706f.document, o3Var42.f4711l, Boolean.TRUE);
                                                                    q3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var42.f4706f.document;
                                                                    String str2 = o3Var42.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = o3Var32.f4713n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var3 = q3Var2;
                                                final o3 o3Var4 = o3Var3;
                                                if (z13) {
                                                    int i13 = i12;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var2 = q3Var3.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            o3 o3Var42 = o3Var4;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var32 = q3Var3;
                                                            q3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var42.f4706f.document;
                                                                    String str = o3Var42.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var42.f4706f.document, o3Var42.f4711l, Boolean.TRUE);
                                                                    q3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var42.f4706f.document;
                                                                    String str2 = o3Var42.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var3.n(tL_error);
                                                    q3Var3.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = o3Var4.f4713n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    o3Var4.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var2;
                                                final o3 o3Var5 = o3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            o3 o3Var42 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var32 = q3Var4;
                                                            q3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var42.f4706f.document;
                                                                    String str = o3Var42.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var42.f4706f.document, o3Var42.f4711l, Boolean.TRUE);
                                                                    q3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var42.f4706f.document;
                                                                    String str2 = o3Var42.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var5.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final q3 q3Var3 = this.f4555b;
                                final int i13 = i10;
                                final o3 o3Var4 = o3Var;
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
                                                final q3 q3Var22 = q3Var3;
                                                final o3 o3Var32 = o3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var = q3Var22.f4745a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i132 = r4;
                                                            o3 o3Var42 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var32 = q3Var22;
                                                            q3Var32.getClass();
                                                            switch (i132) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var42.f4706f.document;
                                                                    String str = o3Var42.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var32.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var42.f4706f.document, o3Var42.f4711l, Boolean.TRUE);
                                                                    q3Var32.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var42.f4706f.document;
                                                                    String str2 = o3Var42.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var32.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = o3Var32.f4713n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var3;
                                                final o3 o3Var42 = o3Var4;
                                                if (z13) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var2 = q3Var32.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = o3Var42.f4713n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var3;
                                                final o3 o3Var5 = o3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var5.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
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
            } else if (o3Var.d != null) {
                TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
                tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
                tL_stickers_createStickerSet.title = o3Var.d.toString();
                tL_stickers_createStickerSet.short_name = "";
                tL_stickers_createStickerSet.stickers.add(o3Var.e);
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                    public final q3 f4555b;

                    {
                        this.f4555b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final q3 q3Var = this.f4555b;
                                final int i11 = i10;
                                final o3 o3Var2 = o3Var;
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
                                                final q3 q3Var22 = q3Var;
                                                final o3 o3Var32 = o3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var = q3Var22.f4745a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var322 = q3Var22;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = o3Var32.f4713n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var;
                                                final o3 o3Var42 = o3Var2;
                                                if (z13) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var2 = q3Var32.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = o3Var42.f4713n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var;
                                                final o3 o3Var5 = o3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var5.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final q3 q3Var2 = this.f4555b;
                                final int i12 = i10;
                                final o3 o3Var3 = o3Var;
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
                                                final q3 q3Var22 = q3Var2;
                                                final o3 o3Var32 = o3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var = q3Var22.f4745a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var322 = q3Var22;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = o3Var32.f4713n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var2;
                                                final o3 o3Var42 = o3Var3;
                                                if (z13) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var2 = q3Var32.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = o3Var42.f4713n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var2;
                                                final o3 o3Var5 = o3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var5.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final q3 q3Var3 = this.f4555b;
                                final int i13 = i10;
                                final o3 o3Var4 = o3Var;
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
                                                final q3 q3Var22 = q3Var3;
                                                final o3 o3Var32 = o3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var = q3Var22.f4745a0;
                                                    if (m0Var != null) {
                                                        m0Var.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var322 = q3Var22;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback = o3Var32.f4713n;
                                                if (callback != null) {
                                                    callback.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var3;
                                                final o3 o3Var42 = o3Var4;
                                                if (z13) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var2 = q3Var32.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback2 = o3Var42.f4713n;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var3;
                                                final o3 o3Var5 = o3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var5.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
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
            } else if (o3Var.h) {
                h();
                NotificationCenter.getInstance(i10).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
                AndroidUtilities.runOnUIThread(new ag.d(o3Var, 24), 350L);
                Utilities.Callback callback = o3Var.f4713n;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
            } else if (o3Var.f4708i != 0) {
                SendMessagesHelper.getInstance(i10).sendSticker(o3Var.f4706f.document, null, o3Var.f4708i, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
                ph.m0 m0Var = this.f4745a0;
                if (m0Var != null) {
                    m0Var.setProgress(1.0f);
                }
                AndroidUtilities.runOnUIThread(new ah.b(this, i10, 3), 450L);
                Utilities.Callback callback2 = o3Var.f4713n;
                if (callback2 != null) {
                    callback2.run(Boolean.TRUE);
                    o3Var.f4713n = null;
                }
            } else if (o3Var.f4709j != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(o3Var.f4709j);
                tL_stickers_addStickerToSet.sticker = o3Var.e;
                ConnectionsManager.getInstance(i10).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final q3 f4555b;

                    {
                        this.f4555b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r4) {
                            case 0:
                                final q3 q3Var = this.f4555b;
                                final int i11 = i10;
                                final o3 o3Var2 = o3Var;
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
                                                final q3 q3Var22 = q3Var;
                                                final o3 o3Var32 = o3Var2;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i11;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var2 = q3Var22.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var322 = q3Var22;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var32.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var;
                                                final o3 o3Var42 = o3Var2;
                                                if (z13) {
                                                    int i132 = i11;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var22 = q3Var32.f4745a0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = o3Var42.f4713n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var;
                                                final o3 o3Var5 = o3Var2;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i11;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback32 = o3Var5.f4713n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            case 1:
                                final q3 q3Var2 = this.f4555b;
                                final int i12 = i10;
                                final o3 o3Var3 = o3Var;
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
                                                final q3 q3Var22 = q3Var2;
                                                final o3 o3Var32 = o3Var3;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i12;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var2 = q3Var22.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var322 = q3Var22;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var32.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var2;
                                                final o3 o3Var42 = o3Var3;
                                                if (z13) {
                                                    int i132 = i12;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var22 = q3Var32.f4745a0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = o3Var42.f4713n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var2;
                                                final o3 o3Var5 = o3Var3;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i12;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback32 = o3Var5.f4713n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final q3 q3Var3 = this.f4555b;
                                final int i13 = i10;
                                final o3 o3Var4 = o3Var;
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
                                                final q3 q3Var22 = q3Var3;
                                                final o3 o3Var32 = o3Var4;
                                                if (z12) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i122 = i13;
                                                    MediaDataController.getInstance(i122).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i122).isStickerPackInstalled(tL_messages_stickerSet.set.f19186id)) {
                                                        MediaDataController.getInstance(i122).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var2 = q3Var22.f4745a0;
                                                    if (m0Var2 != null) {
                                                        m0Var2.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var32;
                                                            TLObject tLObject32 = tLObject2;
                                                            q3 q3Var322 = q3Var22;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z4 = true;
                                                } else {
                                                    q3Var22.n(tL_error);
                                                    q3Var22.h();
                                                    z4 = false;
                                                }
                                                Utilities.Callback callback3 = o3Var32.f4713n;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z4));
                                                    o3Var32.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            case 1:
                                                final TLObject tLObject3 = tLObject;
                                                boolean z13 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var32 = q3Var3;
                                                final o3 o3Var42 = o3Var4;
                                                if (z13) {
                                                    int i132 = i13;
                                                    MediaDataController.getInstance(i132).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i132).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    ph.m0 m0Var22 = q3Var32.f4745a0;
                                                    if (m0Var22 != null) {
                                                        m0Var22.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var42;
                                                            TLObject tLObject32 = tLObject3;
                                                            q3 q3Var322 = q3Var32;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z10 = true;
                                                } else {
                                                    q3Var32.n(tL_error);
                                                    q3Var32.h();
                                                    z10 = false;
                                                }
                                                Utilities.Callback callback22 = o3Var42.f4713n;
                                                if (callback22 != null) {
                                                    callback22.run(Boolean.valueOf(z10));
                                                    o3Var42.f4713n = null;
                                                    return;
                                                }
                                                return;
                                            default:
                                                final TLObject tLObject4 = tLObject;
                                                boolean z14 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final q3 q3Var4 = q3Var3;
                                                final o3 o3Var5 = o3Var4;
                                                if (z14) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i14 = i13;
                                                    MediaDataController.getInstance(i14).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i14).isStickerPackInstalled(tL_messages_stickerSet2.set.f19186id)) {
                                                        MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    ph.m0 m0Var3 = q3Var4.f4745a0;
                                                    if (m0Var3 != null) {
                                                        m0Var3.setProgress(1.0f);
                                                    }
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            int i1322 = r4;
                                                            o3 o3Var422 = o3Var5;
                                                            TLObject tLObject32 = tLObject4;
                                                            q3 q3Var322 = q3Var4;
                                                            q3Var322.getClass();
                                                            switch (i1322) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i142 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = o3Var422.f4706f.document;
                                                                    String str = o3Var422.f4711l;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i142, bool, tLObject32, document, str, bool);
                                                                    q3Var322.h();
                                                                    return;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject32, o3Var422.f4706f.document, o3Var422.f4711l, Boolean.TRUE);
                                                                    q3Var322.h();
                                                                    return;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i15 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = o3Var422.f4706f.document;
                                                                    String str2 = o3Var422.f4711l;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject32, document2, str2, bool2);
                                                                    q3Var322.h();
                                                                    return;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z11 = true;
                                                } else {
                                                    q3Var4.n(tL_error);
                                                    q3Var4.h();
                                                    z11 = false;
                                                }
                                                Utilities.Callback callback32 = o3Var5.f4713n;
                                                if (callback32 != null) {
                                                    callback32.run(Boolean.valueOf(z11));
                                                    o3Var5.f4713n = null;
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
                n3[] n3VarArr = this.E;
                if (i10 >= n3VarArr.length) {
                    break;
                }
                n3 n3Var = n3VarArr[i10];
                if (n3Var != null) {
                    n3Var.f4682l.reset();
                    Bitmap bitmap = n3Var.e;
                    if (bitmap != null) {
                        bitmap.recycle();
                        n3Var.e = null;
                    }
                    Bitmap bitmap2 = n3Var.d;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        n3Var.d = null;
                    }
                    Bitmap bitmap3 = n3Var.f4678g;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        n3Var.f4678g = null;
                    }
                    Bitmap bitmap4 = n3Var.f4677f;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        n3Var.f4677f = null;
                    }
                }
                i10++;
            }
            this.E = null;
        }
        this.f4766y = false;
        this.f4765x = false;
        this.I = false;
        this.J.setAlpha(0.0f);
        this.J.setScaleX(0.3f);
        this.J.setScaleY(0.3f);
        o3 o3Var = this.T;
        if (o3Var != null) {
            if (!o3Var.f4714o) {
                o3Var.a();
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
        o3 o3Var;
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            o3 o3Var2 = this.T;
            if (o3Var2 != null && str.equalsIgnoreCase(o3Var2.f4704b)) {
                o3 o3Var3 = this.T;
                o3Var3.f4707g = inputFile;
                TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                tL_inputMediaUploadedDocument.file = o3Var3.f4707g;
                if (o3Var3.f4718s != null) {
                    tL_inputMediaUploadedDocument.mime_type = "video/webm";
                } else {
                    tL_inputMediaUploadedDocument.mime_type = "image/webp";
                }
                TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                tL_documentAttributeSticker.alt = o3Var3.f4705c;
                tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new d3(0, this, o3Var3), 2);
            }
        } else if (i10 == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            o3 o3Var4 = this.T;
            if (o3Var4 != null && str2.equalsIgnoreCase(o3Var4.f4704b)) {
                long longValue = ((Long) objArr[1]).longValue();
                long longValue2 = ((Long) objArr[2]).longValue();
                if (longValue2 > 0) {
                    o3 o3Var5 = this.T;
                    o3Var5.f4720u = Utilities.clamp(((float) longValue) / ((float) longValue2), 1.0f, o3Var5.f4720u);
                    ph.m0 m0Var = this.f4745a0;
                    if (m0Var != null) {
                        m0Var.setProgress(this.T.b());
                    }
                }
            }
        } else if (i10 == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            o3 o3Var6 = this.T;
            if (o3Var6 != null && str3.equalsIgnoreCase(o3Var6.f4704b)) {
                h();
            }
        } else if (i10 == NotificationCenter.filePreparingStarted) {
            o3 o3Var7 = this.T;
            if (o3Var7 != null && objArr[0] == o3Var7.f4717r) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.T.f4704b, false, true, 67108864);
            }
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            o3 o3Var8 = this.T;
            if (o3Var8 != null && objArr[0] == o3Var8.f4717r) {
                String str4 = (String) objArr[1];
                long longValue3 = ((Long) objArr[2]).longValue();
                long longValue4 = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                float floatValue = f10.floatValue();
                this.T.f4717r.videoEditedInfo.needUpdateProgress = true;
                FileLoader.getInstance(this.f4744a).checkUploadNewDataAvailable(str4, false, Math.max(1L, longValue3), longValue4, f10);
                o3 o3Var9 = this.T;
                o3Var9.f4719t = Math.max(o3Var9.f4719t, floatValue);
                ph.m0 m0Var2 = this.f4745a0;
                if (m0Var2 != null) {
                    m0Var2.setProgress(this.T.b());
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && (o3Var = this.T) != null && objArr[0] == o3Var.f4717r) {
            h();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.v, this.e);
        canvas.drawPath(this.f4764w, this.d);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: dg.q3.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final Bitmap e(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        n3 n3Var = this.B;
        if (n3Var != null) {
            this.H = bitmap;
            if (n3Var.f4677f != null && this.I) {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                n3 n3Var2 = this.B;
                if (n3Var2.f4676c != 0) {
                    Matrix matrix = new Matrix();
                    n3 n3Var3 = this.B;
                    matrix.postRotate(n3Var3.f4676c, n3Var3.a().getWidth() / 2.0f, this.B.a().getHeight() / 2.0f);
                    n3 n3Var4 = this.B;
                    if ((n3Var4.f4676c / 90) % 2 != 0) {
                        float height = (n3Var4.b().getHeight() - this.B.b().getWidth()) / 2.0f;
                        matrix.postTranslate(height, -height);
                    }
                    matrix.postScale(bitmap.getWidth() / this.B.a().getHeight(), bitmap.getHeight() / this.B.a().getWidth());
                    canvas.drawBitmap(this.B.a(), matrix, paint);
                    return createBitmap;
                }
                canvas.drawBitmap(n3Var2.a(), (Rect) null, rect, paint);
                return createBitmap;
            }
        }
        return bitmap;
    }

    public final void f() {
        this.f4746b.d(0.0f, false);
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.K = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.J;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(mr.h).start();
    }

    public final void g(Canvas canvas, boolean z4, ViewGroup viewGroup, boolean z10) {
        boolean z11;
        float e;
        float f10;
        Paint paint;
        z5 z5Var = this.f4748c;
        z5Var.f31251a = viewGroup;
        boolean z12 = this.f4753f0;
        if (z12 || z5Var.f31253c > 0.0f) {
            if (viewGroup == null) {
                e = 1.0f;
            } else {
                if (z12 && !z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                e = z5Var.e(z11);
            }
            n3[] n3VarArr = this.E;
            if (n3VarArr != null) {
                for (n3 n3Var : n3VarArr) {
                    if (n3Var != null && n3Var == this.B) {
                        if (this.C > 0.0f) {
                            if (n3Var.f4690t.f4755h0 != null) {
                                canvas.save();
                                canvas.clipPath(n3Var.f4690t.f4755h0);
                                if (n3Var.f4690t.F != null) {
                                    if (z4) {
                                        paint = n3Var.f4687q;
                                    } else {
                                        paint = n3Var.f4686p;
                                    }
                                    paint.setAlpha((int) (e * 255.0f));
                                    paint.setStrokeWidth(AndroidUtilities.dp(f10));
                                    canvas.drawPath(n3Var.f4682l, paint);
                                    if (n3Var.f4690t.f4755h0 != null && z4) {
                                        canvas.clipPath(n3Var.f4682l);
                                        paint.setStrokeWidth(AndroidUtilities.dp(f10 * 2.0f));
                                        canvas.drawPath(n3Var.f4690t.f4755h0, paint);
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
        n3 n3Var;
        if (this.I && (n3Var = this.B) != null) {
            return n3Var.a();
        }
        return null;
    }

    public Bitmap getSourceBitmap() {
        return this.F;
    }

    public a11 getThanosEffect() {
        if (!a11.c()) {
            return null;
        }
        if (this.P == null) {
            a11 a11Var = new a11(getContext(), new e3(this, 1));
            this.P = a11Var;
            addView(a11Var, b6.c(-1.0f, -1));
        }
        return this.P;
    }

    public final void h() {
        ph.m0 m0Var = this.f4745a0;
        if (m0Var != null) {
            m0Var.a();
            this.f4745a0 = null;
        }
    }

    public final boolean i() {
        return this.I;
    }

    public final n3 j(float f10, float f11) {
        int width;
        int height;
        if (this.F == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            n3[] n3VarArr = this.E;
            if (i10 >= n3VarArr.length) {
                return null;
            }
            n3 n3Var = n3VarArr[i10];
            if (n3Var != null) {
                if ((n3Var.f4676c / 90) % 2 != 0) {
                    width = this.F.getHeight();
                    height = this.F.getWidth();
                } else {
                    width = this.F.getWidth();
                    height = this.F.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.E[i10].f4679i;
                float f12 = width;
                float f13 = this.f4749c0;
                float f14 = height;
                float f15 = this.f4750d0;
                rectF.set((rectF2.left / f12) * f13, (rectF2.top / f14) * f15, (rectF2.right / f12) * f13, (rectF2.bottom / f14) * f15);
                this.f4747b0.mapRect(rectF);
                if (rectF.contains(f10, f11)) {
                    return n3Var;
                }
            }
            i10++;
        }
    }

    public final void l() {
        Bitmap bitmap;
        n3[] n3VarArr = this.E;
        if (n3VarArr != null) {
            for (n3 n3Var : n3VarArr) {
                if (n3Var != null && (bitmap = n3Var.e) != null) {
                    bitmap.recycle();
                    n3Var.e = null;
                    Bitmap bitmap2 = n3Var.f4678g;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        n3Var.f4678g = null;
                    }
                    c(n3Var, this.Q, this.R);
                }
            }
        }
    }

    public final void m(Bitmap bitmap, int i10, int i11, int i12, zq0 zq0Var) {
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
        if (!this.f4766y && !this.f4765x && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            this.F = bitmap;
            this.G = i10;
            this.W = null;
            j3 j3Var = new j3(this, i10, zq0Var, 0);
            this.f4765x = true;
            mb.d dVar = new mb.d();
            dVar.f13889b = true;
            dVar.f13890c = true;
            zzd a2 = k7.q.a(new mb.e(dVar));
            if (EmuDetector.with(getContext()).detect()) {
                ArrayList arrayList = new ArrayList();
                Bitmap bitmap2 = this.F;
                ?? obj = new Object();
                int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
                obj.e = min;
                obj.d = min;
                obj.f4726a = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                new Canvas(obj.f4726a).drawRect(0.0f, 0.0f, obj.d, obj.e, j6.Jl);
                obj.f4727b = (bitmap2.getWidth() - obj.d) / 2;
                obj.f4728c = (bitmap2.getHeight() - obj.e) / 2;
                arrayList.add(obj);
                j3Var.run(arrayList);
                return;
            }
            hb.a a10 = hb.a.a(bitmap, i10);
            a2.g(a10).addOnSuccessListener(new a1.c(j3Var, 17)).addOnFailureListener(new l3(this, bitmap, i10, zq0Var, j3Var, 0));
            if (this.W == null) {
                kb.b bVar = kb.b.f10260b;
                b6.m.i(bVar, "options cannot be null");
                synchronized (ib.c.class) {
                    cVar = (ib.c) cb.h.c().a(ib.c.class);
                }
                ba.b bVar2 = (ba.b) cVar.f7458a.get(kb.b.class);
                b6.m.h(bVar2);
                lb.d dVar2 = (lb.d) bVar2.get();
                dVar2.getClass();
                la laVar = dVar2.f11955c;
                ?? obj2 = new Object();
                obj2.f144c = s7.TYPE_THIN;
                cb.o.f2260a.execute(new c2.p(laVar, new b4.e0((a9.a) obj2, 1), u7.ON_DEVICE_IMAGE_LABEL_CREATE, laVar.b(), false, 6));
                new ImageLabelerImpl((cb.f) dVar2.f11953a.F(bVar), (Executor) dVar2.f11954b.f2237a.get(), new y5.c("vision.ica", 1L)).g(a10).addOnSuccessListener(new a1.c(this, 18)).addOnFailureListener(new af.a(25));
            }
            List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.f4744a).getEnabledReactionsList();
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
        Path path = this.f4755h0;
        if (path == null) {
            this.f4755h0 = new Path();
        } else {
            path.rewind();
        }
        if (this.f4756i0 == null) {
            this.f4756i0 = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.f4756i0.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.f4755h0.addPath(this.f4756i0, this.f4754g0);
        this.f4755h0.computeBounds(this.f4757j0, true);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f4744a;
        if (i10 >= 0) {
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
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
        Path path = this.f4763s;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f11, f11, direction);
        Path path2 = this.f4762r;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.v;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.f4764w;
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
            if (this.f4753f0) {
                Rect rect = this.f4761n0;
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
                o3 o3Var;
                q3 q3Var = q3.this;
                Utilities.Callback callback3 = callback;
                if (callback3 != null && (o3Var = q3Var.T) != null && o3Var.f4714o) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    o3 o3Var2 = q3Var.T;
                    if (o3Var2 != null) {
                        o3Var2.a();
                    }
                    ?? obj = new Object();
                    obj.f4715p = new ArrayList();
                    obj.f4716q = new ArrayList();
                    obj.f4719t = 0.0f;
                    obj.f4720u = 0.0f;
                    q3Var.T = obj;
                }
                o3 o3Var3 = q3Var.T;
                o3Var3.f4705c = str2;
                String str4 = str;
                o3Var3.f4704b = str4;
                o3Var3.f4703a = str4;
                o3Var3.d = charSequence;
                o3Var3.h = z4;
                o3Var3.f4708i = j10;
                o3Var3.f4709j = stickerSet;
                o3Var3.f4710k = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                o3Var3.f4718s = videoEditedInfo2;
                o3Var3.f4711l = str3;
                o3Var3.f4713n = callback3;
                o3Var3.f4712m = callback2;
                ArrayList arrayList = o3Var3.f4716q;
                if (!TextUtils.isEmpty(str4)) {
                    o3Var3.f4715p.add(new File(o3Var3.f4704b));
                }
                if (!TextUtils.isEmpty(o3Var3.f4703a) && !TextUtils.equals(o3Var3.f4703a, o3Var3.f4704b)) {
                    arrayList.add(new File(o3Var3.f4703a));
                }
                if (!TextUtils.isEmpty(o3Var3.f4711l)) {
                    arrayList.add(new File(o3Var3.f4711l));
                }
                if (!z10) {
                    q3Var.a();
                } else {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        o3 o3Var4 = q3Var.T;
                        o3Var4.e = MediaDataController.getInputStickerSetItem(document3, o3Var4.f4705c);
                        q3Var.T.f4706f = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = q3Var.T.f4706f;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        q3Var.a();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.f19180id = 1;
                        o3 o3Var5 = q3Var.T;
                        String absolutePath = t6.w(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        o3Var5.f4704b = absolutePath;
                        q3Var.T.f4717r = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        q3Var.T.f4717r.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(q3Var.T.f4717r, false, false, false);
                    } else {
                        FileLoader.getInstance(q3Var.f4744a).uploadFile(str4, false, true, 67108864);
                    }
                }
                if (callback3 == null) {
                    if (q3Var.f4745a0 == null) {
                        q3Var.f4745a0 = new ph.m0(q3Var.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    q3Var.f4745a0.setOnCancelListener(new e3(q3Var, 0));
                    if (q3Var.f4745a0.getParent() == null) {
                        q3Var.addView(q3Var.f4745a0, b6.e(-1, -1, 17));
                    }
                    ph.m0 m0Var = q3Var.f4745a0;
                    m0Var.B = true;
                    m0Var.invalidate();
                }
            }
        }, 300L);
    }

    public void setCurrentAccount(int i10) {
        int i11 = this.f4744a;
        if (i11 != i10) {
            if (i11 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f4744a).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.f4744a = i10;
            if (i10 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.f4744a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    public void setOutlineVisible(boolean z4) {
        float f10;
        if (this.f4753f0 != z4) {
            this.f4753f0 = z4;
            ViewPropertyAnimator animate = this.f4751e0.animate();
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
            alpha.translationX(f11).setInterpolator(mr.h).setDuration(320L).start();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.m0;
                arrayList.clear();
                if (this.f4753f0) {
                    Rect rect = this.f4761n0;
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

    public void setStickerCutOutBtn(c3 c3Var) {
        this.V = c3Var;
    }
}
