package dg;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ft0;
import org.telegram.ui.mq0;
import org.telegram.ui.yh;
public abstract class e1 extends rv0 implements n2, h, i2, pv0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public float A1;
    public final Bitmap B0;
    public boolean B1;
    public final cg.i2 C0;
    public o1.j C1;
    public final DispatchQueue D0;
    public final z0 D1;
    public final MediaController.CropState E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final Paint G1;
    public float H0;
    public final cg.f2 H1;
    public float I0;
    public boolean I1;
    public float J0;
    public o1.j J1;
    public float K0;
    public float K1;
    public float L0;
    public final Paint L1;
    public boolean M0;
    public final int M1;
    public float N0;
    public final h0 N1;
    public jv0 O0;
    public org.telegram.ui.ActionBar.p1 O1;
    public j P0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P1;
    public boolean Q0;
    public Rect Q1;
    public int R0;
    public Runnable R1;
    public final boolean S0;
    public final cg.f1 S1;
    public final s0 T0;
    public boolean T1;
    public final u0 U0;
    public float U1;
    public final x0 V0;
    public boolean V1;
    public final w0 W0;
    public final z5 W1;
    public a11 X0;
    public final Paint X1;
    public final FrameLayout Y0;
    public final Paint Y1;
    public final a1 Z0;
    public pg.b Z1;
    public final y0 f4458a1;
    public final float[] a2;
    public final FrameLayout f4459b1;
    public final int[] f4460b2;
    public k0 f4461c1;
    public kz f4462c2;
    public int f4463d1;
    public boolean f4464d2;
    public int f4465e1;
    public boolean f4466e2;
    public float f4467f1;
    public boolean f4468f2;
    public ValueAnimator f4469g1;
    public int f4470g2;
    public boolean f4471h1;
    public int f4472h2;
    public final t2 f4473i1;
    public int f4474i2;
    public final o5.i f4475j1;
    public int f4476j2;
    public ArrayList f4477k1;
    public boolean f4478k2;
    public final int l1;
    public BigInteger f4479m1;
    public TextView f4480n1;
    public TextView f4481o1;
    public TextView f4482p1;
    public final o2 f4483q1;
    public final k2 f4484r1;
    public final q2 f4485s1;
    public final ImageView f4486t1;
    public final LinearLayout f4487u1;
    public final TextView f4488v1;
    public final TextView f4489w1;
    public final b2 f4490x0;
    public final TextView f4491x1;
    public final f2 f4492y0;
    public final Paint f4493y1;
    public float f4494z0;
    public final Paint f4495z1;

    public e1(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, mq0 mq0Var, f6 f6Var) {
        super(context, activity);
        boolean z4;
        float f10;
        int i12;
        int i13;
        v2 v2Var;
        Emoji.EmojiSpan[] emojiSpanArr;
        boolean z10 = false;
        this.f4463d1 = 0;
        this.f4465e1 = -1;
        final ft0 ft0Var = (ft0) this;
        this.f4475j1 = new o5.i(ft0Var, 12);
        this.f4493y1 = new Paint(1);
        this.f4495z1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        this.G1 = new Paint(1);
        cg.f2 f2Var = new cg.f2(1.0f, 0.016773745f, -1);
        this.H1 = f2Var;
        this.L1 = new Paint(1);
        this.V1 = false;
        this.W1 = new z5((View) this, 350L, nr.h);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        this.Y1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.a2 = new float[2];
        this.f4460b2 = new int[2];
        new androidx.activity.i(ft0Var, 17);
        setDelegate(this);
        this.M1 = i10;
        this.N1 = new h0(0, f6Var);
        this.E0 = cropState;
        this.S0 = context instanceof BubbleActivity;
        cg.f1 e = cg.f1.e(i10);
        this.S1 = e;
        e.i(0, true);
        f2Var.f2401a = e.c();
        f2Var.f2403c = e.f2397i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.D0 = dispatchQueue;
        this.A0 = bitmap;
        this.B0 = bitmap2;
        this.l1 = i11;
        cg.i2 i2Var = new cg.i2();
        this.C0 = i2Var;
        i2Var.f2428a = new a1.c(ft0Var, 12);
        s0 s0Var = new s0(ft0Var, context, new cg.d1(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.T0 = s0Var;
        s0Var.setDelegate(new t0(ft0Var, mq0Var));
        s0Var.setUndoStore(i2Var);
        s0Var.setQueue(dispatchQueue);
        s0Var.setVisibility(4);
        addView(s0Var, b6.e(-1, -1, 51));
        u0 u0Var = new u0(ft0Var, context);
        this.U0 = u0Var;
        u0Var.setVisibility(4);
        addView(u0Var, b6.e(-1, -1, 51));
        w0 w0Var = new w0(ft0Var, context, new v0(ft0Var));
        this.W0 = w0Var;
        addView(w0Var);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                byte b10 = mediaEntity.type;
                if (b10 == 0) {
                    f10 = 2.0f;
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    i13 = i14;
                    v2Var = i02;
                } else {
                    f10 = 2.0f;
                    if (b10 == 1) {
                        ?? j02 = j0(z10);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i15);
                            i15++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            int i16 = size2;
                            u5 u5Var = new u5(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i17 = emojiEntity2.offset;
                            spannableString.setSpan(u5Var, i17, emojiEntity2.length + i17, 33);
                            size = size;
                            i14 = i14;
                            size2 = i16;
                        }
                        i12 = size;
                        i13 = i14;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        u0(j02, mediaEntity.textAlign);
                        cg.f2 swatch = j02.getSwatch();
                        swatch.f2401a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        v2Var = j02;
                    } else {
                        i12 = size;
                        i13 = i14;
                        if (b10 == 2) {
                            v2 h02 = h0(mediaEntity.text, false);
                            h02.f4828y0 = false;
                            if ((mediaEntity.subType & 2) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            v2Var = h02;
                        } else {
                            i14 = i13 + 1;
                            size = i12;
                            z10 = false;
                        }
                    }
                }
                v2Var.setX((mediaEntity.f16693x * this.O0.f26052a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f10));
                v2Var.setY((mediaEntity.f16694y * this.O0.f26053b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f10));
                v2Var.setPosition(new PointF((mediaEntity.viewWidth / f10) + v2Var.getX(), (mediaEntity.viewHeight / f10) + v2Var.getY()));
                v2Var.setScale(mediaEntity.scale);
                v2Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i14 = i13 + 1;
                size = i12;
                z10 = false;
            }
        }
        this.W0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.V0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.Y0 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, b6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f4486t1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(j6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ft0 ft0Var2 = ft0Var;
                        s0 s0Var2 = ft0Var2.T0;
                        if (s0Var2 != null && (s0Var2.getCurrentBrush() instanceof cg.l)) {
                            s0Var2.b();
                            ft0Var2.f4483q1.setSelectedIndex(1);
                            ft0Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        ft0Var2.C0.c();
                        return;
                    case 1:
                        ft0 ft0Var3 = ft0Var;
                        s0 s0Var3 = ft0Var3.T0;
                        cg.i2 i2Var2 = ft0Var3.C0;
                        if (i2Var2.a()) {
                            if (s0Var3 != null && (s0Var3.getCurrentBrush() instanceof cg.l)) {
                                s0Var3.b();
                                ft0Var3.f4483q1.setSelectedIndex(1);
                                ft0Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            s0Var3.a();
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            ft0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ft0 ft0Var4 = ft0Var;
                        j jVar = ft0Var4.P0;
                        if (jVar instanceof b4) {
                            AndroidUtilities.hideKeyboard(((b4) jVar).getFocusedView());
                        }
                        if (ft0Var4.f4464d2) {
                            ft0Var4.l0(false);
                        }
                        ft0Var4.q0(ft0Var4.P0);
                        ft0Var4.r0(null, true);
                        return;
                    default:
                        ft0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, b6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4487u1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, b6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, b6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new m(0));
        frameLayout2.addView(linearLayout, b6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f4488v1 = textView2;
        textView2.setBackground(j6.f0(822083583, 7, -1));
        textView2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        textView2.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ft0 ft0Var2 = ft0Var;
                        s0 s0Var2 = ft0Var2.T0;
                        if (s0Var2 != null && (s0Var2.getCurrentBrush() instanceof cg.l)) {
                            s0Var2.b();
                            ft0Var2.f4483q1.setSelectedIndex(1);
                            ft0Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        ft0Var2.C0.c();
                        return;
                    case 1:
                        ft0 ft0Var3 = ft0Var;
                        s0 s0Var3 = ft0Var3.T0;
                        cg.i2 i2Var2 = ft0Var3.C0;
                        if (i2Var2.a()) {
                            if (s0Var3 != null && (s0Var3.getCurrentBrush() instanceof cg.l)) {
                                s0Var3.b();
                                ft0Var3.f4483q1.setSelectedIndex(1);
                                ft0Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            s0Var3.a();
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            ft0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ft0 ft0Var4 = ft0Var;
                        j jVar = ft0Var4.P0;
                        if (jVar instanceof b4) {
                            AndroidUtilities.hideKeyboard(((b4) jVar).getFocusedView());
                        }
                        if (ft0Var4.f4464d2) {
                            ft0Var4.l0(false);
                        }
                        ft0Var4.q0(ft0Var4.P0);
                        ft0Var4.r0(null, true);
                        return;
                    default:
                        ft0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView i18 = yh.i(frameLayout2, textView2, b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f4489w1 = i18;
        i18.setBackground(j6.f0(822083583, 7, -1));
        i18.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, i18), 0, AndroidUtilities.dp(8.0f), 0);
        i18.setGravity(16);
        i18.setTextColor(-1);
        i18.setTypeface(AndroidUtilities.bold());
        i18.setTextSize(1, 16.0f);
        i18.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ft0 ft0Var2 = ft0Var;
                        s0 s0Var2 = ft0Var2.T0;
                        if (s0Var2 != null && (s0Var2.getCurrentBrush() instanceof cg.l)) {
                            s0Var2.b();
                            ft0Var2.f4483q1.setSelectedIndex(1);
                            ft0Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        ft0Var2.C0.c();
                        return;
                    case 1:
                        ft0 ft0Var3 = ft0Var;
                        s0 s0Var3 = ft0Var3.T0;
                        cg.i2 i2Var2 = ft0Var3.C0;
                        if (i2Var2.a()) {
                            if (s0Var3 != null && (s0Var3.getCurrentBrush() instanceof cg.l)) {
                                s0Var3.b();
                                ft0Var3.f4483q1.setSelectedIndex(1);
                                ft0Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            s0Var3.a();
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            ft0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ft0 ft0Var4 = ft0Var;
                        j jVar = ft0Var4.P0;
                        if (jVar instanceof b4) {
                            AndroidUtilities.hideKeyboard(((b4) jVar).getFocusedView());
                        }
                        if (ft0Var4.f4464d2) {
                            ft0Var4.l0(false);
                        }
                        ft0Var4.q0(ft0Var4.P0);
                        ft0Var4.r0(null, true);
                        return;
                    default:
                        ft0Var.r0(null, true);
                        return;
                }
            }
        });
        i18.setAlpha(0.0f);
        i18.setVisibility(8);
        TextView i19 = yh.i(frameLayout2, i18, b6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f4491x1 = i19;
        i19.setBackground(j6.f0(822083583, 7, -1));
        i19.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, i19), 0, AndroidUtilities.dp(8.0f), 0);
        i19.setGravity(16);
        i19.setTextColor(-1);
        i19.setTypeface(AndroidUtilities.bold());
        i19.setTextSize(1, 16.0f);
        i19.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ft0 ft0Var2 = ft0Var;
                        s0 s0Var2 = ft0Var2.T0;
                        if (s0Var2 != null && (s0Var2.getCurrentBrush() instanceof cg.l)) {
                            s0Var2.b();
                            ft0Var2.f4483q1.setSelectedIndex(1);
                            ft0Var2.x((cg.m) cg.m.f2447a.get(0));
                            return;
                        }
                        ft0Var2.C0.c();
                        return;
                    case 1:
                        ft0 ft0Var3 = ft0Var;
                        s0 s0Var3 = ft0Var3.T0;
                        cg.i2 i2Var2 = ft0Var3.C0;
                        if (i2Var2.a()) {
                            if (s0Var3 != null && (s0Var3.getCurrentBrush() instanceof cg.l)) {
                                s0Var3.b();
                                ft0Var3.f4483q1.setSelectedIndex(1);
                                ft0Var3.x((cg.m) cg.m.f2447a.get(0));
                            }
                            s0Var3.a();
                            i2Var2.f2430c.clear();
                            i2Var2.f2429b.clear();
                            AndroidUtilities.runOnUIThread(new ag.d(i2Var2, 15));
                            ft0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ft0 ft0Var4 = ft0Var;
                        j jVar = ft0Var4.P0;
                        if (jVar instanceof b4) {
                            AndroidUtilities.hideKeyboard(((b4) jVar).getFocusedView());
                        }
                        if (ft0Var4.f4464d2) {
                            ft0Var4.l0(false);
                        }
                        ft0Var4.q0(ft0Var4.P0);
                        ft0Var4.r0(null, true);
                        return;
                    default:
                        ft0Var.r0(null, true);
                        return;
                }
            }
        });
        i19.setAlpha(0.0f);
        i19.setVisibility(8);
        frameLayout2.addView(i19, b6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        a1 a1Var = new a1(ft0Var, context);
        this.Z0 = a1Var;
        a1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        a1Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(a1Var, b6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        o2 o2Var = new o2(context, z4);
        this.f4483q1 = o2Var;
        o2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        o2Var.setDelegate(this);
        o2Var.setSelectedIndex(1);
        a1Var.addView(o2Var, b6.c(48.0f, -1));
        k2 k2Var = new k2(context);
        this.f4484r1 = k2Var;
        k2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        k2Var.setVisibility(8);
        k2Var.setDelegate(this);
        k2Var.setAlignment(cg.f1.e(i10).f2396g);
        a1Var.addView(k2Var, b6.c(48.0f, -1));
        y0 y0Var = new y0(ft0Var, context);
        this.f4458a1 = y0Var;
        addView(y0Var, b6.c(-1.0f, -1));
        q2 q2Var = new q2(context);
        this.f4485s1 = q2Var;
        q2Var.setVisibility(8);
        q2Var.setOnItemClickListener(new n(ft0Var, 0));
        k2Var.setTypefaceListView(q2Var);
        y0Var.addView(q2Var, b6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f4493y1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f4493y1.setColor(1728053247);
        this.f4493y1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f4495z1.setColor(j6.v0(j6.G8, this.N1));
        z0 z0Var = new z0(ft0Var, context);
        this.D1 = z0Var;
        z0Var.setVisibility(8);
        z0Var.setColorPalette(cg.f1.e(i10));
        z0Var.setColorListener(new o(ft0Var, 0));
        a1Var.addView(z0Var, b6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        b2 b2Var = new b2(context);
        this.f4490x0 = b2Var;
        b2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        b2Var.setBackground(j6.f0(1090519039, 1, -1));
        a1Var.addView(b2Var, b6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        f2 f2Var2 = new f2(context);
        this.f4492y0 = f2Var2;
        f2Var2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        f2Var2.setBackground(j6.f0(1090519039, 1, -1));
        f2Var2.setOnClickListener(new p(ft0Var, context, bitmap2, 0));
        a1Var.addView(f2Var2, b6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        t2 t2Var = new t2(context);
        this.f4473i1 = t2Var;
        t2Var.setColorSwatch(this.H1);
        t2Var.setRenderView(this.T0);
        t2Var.setValueOverride(this.f4475j1);
        this.H1.f2403c = this.f4475j1.get();
        t2Var.setOnUpdate(new af.b(ft0Var, i10, 3));
        addView(t2Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f4459b1 = frameLayout3;
        addView(frameLayout3, b6.c(-1.0f, -1));
        this.G1.setStyle(style);
        this.G1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.H1, null);
        x((cg.m) cg.m.f2447a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(ft0 ft0Var, Integer num) {
        ft0Var.setNewColor(num.intValue());
        ft0Var.w0(false);
    }

    public static void a0(dg.e1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: dg.e1.a0(dg.e1):void");
    }

    public static void b0(e1 e1Var) {
        r3 r3Var;
        w0 w0Var = e1Var.W0;
        j jVar = e1Var.P0;
        if (jVar != null) {
            PointF A0 = e1Var.A0(jVar);
            j jVar2 = e1Var.P0;
            if (jVar2 instanceof r3) {
                r3 r3Var2 = new r3(e1Var.getContext(), (r3) e1Var.P0, A0);
                r3Var2.setDelegate(e1Var);
                w0Var.addView(r3Var2);
                r3Var = r3Var2;
            } else if (jVar2 instanceof b4) {
                b4 b4Var = new b4(e1Var.getContext(), (b4) e1Var.P0, A0);
                b4Var.setDelegate(e1Var);
                b4Var.setMaxWidth((int) (e1Var.getPaintingSize().f26052a - 20.0f));
                w0Var.addView(b4Var, b6.c(-2.0f, -2));
                r3Var = b4Var;
            } else {
                r3Var = null;
            }
            e1Var.p0(r3Var);
            e1Var.r0(r3Var, true);
        }
        org.telegram.ui.ActionBar.p1 p1Var = e1Var.O1;
        if (p1Var != null && p1Var.isShowing()) {
            e1Var.O1.d(true);
        }
    }

    public static void c0(ft0 ft0Var, Integer num) {
        cg.f1 f1Var = ft0Var.S1;
        f1Var.h(num.intValue(), true);
        f1Var.g();
        ft0Var.setNewColor(num.intValue());
        z0 z0Var = ft0Var.D1;
        z0Var.setSelectedColorIndex(f1Var.d());
        z0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f4463d1 == 2) {
            return this.f4484r1;
        }
        return this.f4483q1;
    }

    private int getFrameRotation() {
        int i10 = this.l1;
        if (i10 != 90) {
            if (i10 != 180) {
                if (i10 != 270) {
                    return 0;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private jv0 getPaintingSize() {
        int i10;
        jv0 jv0Var = this.O0;
        if (jv0Var != null) {
            return jv0Var;
        }
        Bitmap bitmap = this.A0;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            if (devicePerformanceClass != 2) {
                i10 = 2560;
            } else {
                i10 = 3840;
            }
        } else {
            i10 = 1280;
        }
        jv0 jv0Var2 = new jv0(width, height);
        float f10 = i10;
        jv0Var2.f26052a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        jv0Var2.f26053b = floor;
        if (floor > f10) {
            jv0Var2.f26053b = f10;
            jv0Var2.f26052a = (float) Math.floor((f10 * width) / height);
        }
        this.O0 = jv0Var2;
        return jv0Var2;
    }

    public void setNewColor(int i10) {
        cg.f2 f2Var = this.H1;
        int i11 = f2Var.f2401a;
        f2Var.f2401a = i10;
        s0(f2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new g0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.R0 = i10;
        j jVar = this.P0;
        if (jVar instanceof b4) {
            ((b4) jVar).setType(i10);
        }
        cg.f1 e = cg.f1.e(this.M1);
        e.h = i10;
        e.f2392a.edit().putInt("text_type", i10).apply();
        this.f4484r1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        k0 k0Var = new k0(this, context);
        this.f4461c1 = k0Var;
        k0Var.setClipToPadding(false);
        this.f4461c1.setOrientation(0);
        this.Z0.addView(this.f4461c1, b6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f4480n1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f4480n1;
        int i10 = j6.f19996i6;
        h0 h0Var = this.N1;
        textView2.setBackground(j6.f0(j6.v0(i10, h0Var), 7, -1));
        this.f4480n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f4480n1.setTextColor(-1);
        this.f4480n1.setTextSize(1, 14.0f);
        this.f4480n1.setGravity(1);
        this.f4480n1.setTypeface(AndroidUtilities.bold());
        this.f4480n1.setSingleLine();
        this.f4480n1.setOnClickListener(new k(this, 0));
        this.f4461c1.addView(this.f4480n1, b6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f4481o1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f4481o1.setBackground(j6.f0(j6.v0(i10, h0Var), 7, -1));
        this.f4481o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f4481o1.setOnClickListener(new k(this, 1));
        this.f4481o1.setTextColor(-1);
        this.f4481o1.setTextSize(1, 14.0f);
        this.f4481o1.setGravity(1);
        this.f4481o1.setTypeface(AndroidUtilities.bold());
        this.f4481o1.setAlpha(0.6f);
        this.f4481o1.setSingleLine();
        this.f4461c1.addView(this.f4481o1, b6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f4482p1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f4482p1.setBackground(j6.f0(j6.v0(i10, h0Var), 7, -1));
        this.f4482p1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f4482p1.setTextColor(-1);
        this.f4482p1.setTextSize(1, 14.0f);
        this.f4482p1.setGravity(1);
        this.f4482p1.setTypeface(AndroidUtilities.bold());
        this.f4482p1.setAlpha(0.6f);
        this.f4482p1.setSingleLine();
        this.f4482p1.setOnClickListener(new k(this, 4));
        this.f4461c1.addView(this.f4482p1, b6.l(1.0f, 0, -2));
    }

    public static void u0(b4 b4Var, int i10) {
        int i11;
        b4Var.setAlign(i10);
        int i12 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                i11 = 19;
            } else {
                i11 = 21;
            }
        } else {
            i11 = 17;
        }
        b4Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        b4Var.getEditText().setTextAlignment(i12);
    }

    @Override
    public final void A() {
        y0(new q(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(j jVar) {
        float f10 = 200.0f;
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            f10 = 200.0f / cropState.cropScale;
        }
        if (jVar != null) {
            PointF position = jVar.getPosition();
            return new PointF(position.x + f10, position.y + f10);
        }
        float f11 = 100.0f;
        if (cropState != null) {
            f11 = 100.0f / cropState.cropScale;
        }
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z4 = false;
            while (true) {
                w0 w0Var = this.W0;
                if (i10 >= w0Var.getChildCount()) {
                    break;
                }
                View childAt = w0Var.getChildAt(i10);
                if (childAt instanceof j) {
                    PointF position2 = ((j) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f11) {
                        z4 = true;
                    }
                }
                i10++;
            }
            if (!z4) {
                return g02;
            }
            g02 = new PointF(g02.x + f10, g02.y + f10);
        }
    }

    public final void B0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z4;
        if (this.f4463d1 != i10 && this.f4465e1 != i10) {
            ValueAnimator valueAnimator = this.f4469g1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f4463d1;
            ViewGroup viewGroup3 = this.f4484r1;
            ViewGroup viewGroup4 = this.f4483q1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f4465e1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.M1;
            cg.f1 e = cg.f1.e(i12);
            if (i10 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (e.f2400l != z4) {
                e.f2400l = z4;
                if (z4) {
                    e.i(-1, false);
                } else {
                    e.i(e.f2392a.getInt("brush", 0), false);
                }
            }
            int c3 = cg.f1.e(i12).c();
            cg.f2 f2Var = this.H1;
            f2Var.f2401a = c3;
            s0(f2Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f4469g1 = duration;
            duration.setInterpolator(nr.f27346f);
            this.f4469g1.addUpdateListener(new r(this, viewGroup, viewGroup2, 0));
            this.f4469g1.addListener(new l0(this, viewGroup, viewGroup2, i10, 0));
            this.f4469g1.start();
        }
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            w0 w0Var = this.W0;
            if (i10 < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i10);
                if (childAt != this.P0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f4590i0 && jVar.f4588g0 <= 0.0f) {
                        }
                    }
                    i10++;
                }
                ((j) childAt).m();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void D() {
        z0(true);
    }

    @Override
    public final void G(int i10, boolean z4) {
        boolean z10;
        boolean z11;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f4466e2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z4) {
                this.f4474i2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f4474i2).commit();
            } else {
                this.f4472h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f4472h2).commit();
            }
        }
        if (this.f4464d2) {
            if (z4) {
                i11 = this.f4474i2;
            } else {
                i11 = this.f4472h2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f4462c2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f4462c2.setLayoutParams(layoutParams);
                this.f4470g2 = layoutParams.height;
                requestLayout();
                ph.i3 i3Var = ((ft0) this).f34353l2.H1;
                if (i3Var != null) {
                    i3Var.a();
                }
                getHeight();
            }
        }
        if (this.f4476j2 == i10 && this.f4478k2 == z4) {
            getHeight();
            return;
        }
        this.f4476j2 = i10;
        this.f4478k2 = z4;
        boolean z12 = this.f4466e2;
        j jVar = this.P0;
        if (jVar instanceof b4) {
            if (((b4) jVar).getEditText().isFocused() && i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f4466e2 = z11;
        } else {
            this.f4466e2 = false;
        }
        if (this.f4466e2 && this.f4464d2) {
            x0(0);
        }
        if (this.f4470g2 != 0 && !(z10 = this.f4466e2) && z10 != z12 && !this.f4464d2) {
            this.f4470g2 = 0;
            requestLayout();
            ph.i3 i3Var2 = ((ft0) this).f34353l2.H1;
            if (i3Var2 != null) {
                i3Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final void b(j jVar) {
        int[] k02 = k0(jVar);
        y0(new c0(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    @Override
    public final void d() {
        setTextType((this.R0 + 1) % 4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w0 w0Var;
        b4 b4Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (w0Var = this.W0) != null) {
            for (int i12 = 0; i12 < w0Var.getChildCount(); i12++) {
                View childAt = w0Var.getChildAt(i12);
                if ((childAt instanceof b4) && (str = (b4Var = (b4) childAt).f4416x0) != null) {
                    b4Var.setTypeface(str);
                }
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!super.dispatchTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
        throw new UnsupportedOperationException("Method not decompiled: dg.e1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        this.L1.setColor(-15132391);
    }

    @Override
    public final void f(int i10) {
        j jVar = this.P0;
        if (jVar instanceof b4) {
            u0((b4) jVar, i10);
            cg.f1 e = cg.f1.e(this.M1);
            e.f2396g = i10;
            e.f2392a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new a1.e(17, this, (v2) view)).start();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        jv0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f26052a / 2.0f;
        float f11 = paintingSize.f26053b / 2.0f;
        if (this.E0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float a2 = (float) kh.a2.a(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f10 -= cos * paintingSize.f26052a;
            f11 -= a2 * paintingSize.f26053b;
        }
        return new PointF(f10, f11);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.f4490x0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f4492y0;
    }

    public long getLcm() {
        return this.f4479m1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        u5[] u5VarArr;
        w0 w0Var = this.W0;
        int childCount = w0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = w0Var.getChildAt(i10);
            if (childAt instanceof r3) {
                TLRPC.Document sticker = ((r3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f19196id = sticker.f19190id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof b4) {
                CharSequence text = ((b4) childAt).getText();
                if ((text instanceof Spanned) && (u5VarArr = (u5[]) ((Spanned) text).getSpans(0, text.length(), u5.class)) != null) {
                    for (u5 u5Var : u5VarArr) {
                        if (u5Var != null) {
                            TLRPC.Document document = u5Var.document;
                            if (document == null) {
                                document = l5.f(this.M1, u5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f19196id = document.f19190id;
                                tL_inputDocument2.access_hash = document.access_hash;
                                byte[] bArr2 = document.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public float getOffsetTranslationY() {
        return this.f4494z0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public cg.p1 getRenderView() {
        return this.T0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.P0;
        w0 w0Var = this.W0;
        if (jVar == null) {
            return getY() + w0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (w0Var.getScaleY() * this.P0.getHeight()) + iArr[1];
    }

    public a11 getThanosEffect() {
        if (!a11.c()) {
            return null;
        }
        if (this.X0 == null) {
            a11 a11Var = new a11(getContext(), new q(this, 0));
            this.X0 = a11Var;
            addView(a11Var);
        }
        return this.X0;
    }

    public final v2 h0(String str, boolean z4) {
        float f10;
        jv0 jv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f10 = 1.0f;
        }
        w0 w0Var = this.W0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(w0Var.getMeasuredWidth() * 0.5d);
            jv0Var = new jv0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(w0Var.getMeasuredHeight() * 0.5d);
            jv0Var = new jv0(f10 * floor2, floor2);
        }
        jv0 jv0Var2 = jv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = jv0Var2.f26052a;
            jv0Var2.f26052a = jv0Var2.f26053b;
            jv0Var2.f26053b = f11;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        v2 v2Var = new v2(context, g02, jv0Var2, str, intValue);
        v2Var.setDelegate(this);
        w0Var.addView(v2Var);
        if (z4) {
            p0(v2Var);
            r0(v2Var, true);
        }
        return v2Var;
    }

    public final dg.p0 i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: dg.e1.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):dg.p0");
    }

    public final b4 j0(boolean z4) {
        ((ft0) this).f34353l2.f31723d0.isFocusable();
        jv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        b4 b4Var = new b4(getContext(), A0, (int) (paintingSize.f26052a / 9.0f), "", this.H1, this.R0);
        float f10 = paintingSize.f26052a / 9.0f;
        q qVar = new q(this, 2);
        b4Var.f4412t0 = (int) (0.5f * f10);
        b4Var.f4413u0 = (int) (f10 * 2.0f);
        b4Var.f4414v0 = qVar;
        float f11 = A0.x;
        w0 w0Var = this.W0;
        if (f11 == w0Var.getMeasuredWidth() / 2.0f) {
            b4Var.setStickyX(2);
        }
        if (A0.y == w0Var.getMeasuredHeight() / 2.0f) {
            b4Var.setStickyY(2);
        }
        b4Var.setDelegate(this);
        b4Var.setMaxWidth((int) (paintingSize.f26052a - 20.0f));
        int i10 = this.M1;
        b4Var.setTypeface(cg.f1.e(i10).f2398j);
        b4Var.setType(cg.f1.e(i10).h);
        w0Var.addView(b4Var, b6.c(-2.0f, -2));
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            b4Var.j(1.0f / cropState.cropScale);
            b4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z4) {
            p0(b4Var);
            b4Var.q();
            r0(b4Var, false);
            b4Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(b4Var.getFocusedView());
            this.Q0 = true;
            int i11 = cg.f1.e(i10).f2396g;
            k2 k2Var = this.f4484r1;
            k2Var.d(i11, true);
            k2Var.setOutlineType(cg.f1.e(i10).h);
        }
        return b4Var;
    }

    public final int[] k0(j jVar) {
        float[] fArr = this.a2;
        fArr[0] = jVar.getWidth() / 2.0f;
        fArr[1] = jVar.getHeight() / 2.0f;
        jVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + jVar.getLeft();
        fArr[1] = fArr[1] + jVar.getTop();
        ViewParent parent = jVar.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            fArr[0] = fArr[0] - view.getScrollX();
            fArr[1] = fArr[1] - view.getScrollY();
            view.getMatrix().mapPoints(fArr);
            fArr[0] = fArr[0] + view.getLeft();
            fArr[1] = fArr[1] + view.getTop();
            parent = view.getParent();
        }
        int round = Math.round(fArr[0]);
        int[] iArr = this.f4460b2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f10 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.W0.getRotation());
        double d10 = f10;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) kh.a2.a(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean l(MotionEvent motionEvent) {
        if (this.P0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        s0 s0Var = this.T0;
        float translationX = ((x10 - s0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / s0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - s0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / s0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-s0Var.getRotation());
        double d10 = y10;
        float measuredWidth = (s0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (s0Var.getMeasuredHeight() / 2.0f) + ((float) kh.a2.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        s0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void l0(boolean z4) {
        if (this.f4464d2) {
            x0(0);
        }
        if (z4) {
            kz kzVar = this.f4462c2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f4462c2.getMeasuredHeight());
                ofFloat.addUpdateListener(new s(this, 0));
                this.f4468f2 = true;
                ofFloat.addListener(new q0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f20543w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final void m0() {
        kz kzVar;
        ph.i3 i3Var;
        if (this.f4470g2 > 0 && (i3Var = ((ft0) this).f34353l2.H1) != null) {
            i3Var.a();
        }
        if (!this.f4464d2 && (kzVar = this.f4462c2) != null && kzVar.getVisibility() != 8) {
            this.f4462c2.setVisibility(8);
        }
        this.f4470g2 = 0;
    }

    public final void n0(boolean z4) {
        int i10;
        int i11;
        if (this.f4463d1 == 0) {
            int i12 = 0;
            if (z4) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.f4473i1.setLayerType(i10, null);
            if (z4) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.Z0.setLayerType(i11, null);
            if (z4) {
                i12 = 2;
            }
            this.Y0.setLayerType(i12, null);
        }
    }

    public final boolean o0() {
        if (this.I1) {
            w0(false);
            return true;
        } else if (this.f4464d2) {
            l0(true);
            return true;
        } else if (!this.Q0) {
            return false;
        } else {
            r0(null, true);
            return true;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int R;
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.f4462c2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f4462c2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f4462c2.getMeasuredHeight();
            }
            kz kzVar = this.f4462c2;
            kzVar.layout(0, R, kzVar.getMeasuredWidth(), this.f4462c2.getMeasuredHeight() + R);
        }
        if (!this.S0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        s0 s0Var = this.T0;
        int ceil = (int) Math.ceil((i14 - s0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.y3.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - s0Var.getMeasuredHeight()) / 2, i16);
        s0Var.layout(ceil, additionalTop, s0Var.getMeasuredWidth() + ceil, s0Var.getMeasuredHeight() + additionalTop);
        u0 u0Var = this.U0;
        u0Var.layout(ceil, additionalTop, u0Var.getMeasuredWidth() + ceil, u0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = s0Var.getMeasuredWidth();
        w0 w0Var = this.W0;
        int measuredWidth2 = ((measuredWidth - w0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((s0Var.getMeasuredHeight() - w0Var.getMeasuredHeight()) / 2) + additionalTop;
        w0Var.layout(measuredWidth2, measuredHeight, w0Var.getMeasuredWidth() + measuredWidth2, w0Var.getMeasuredHeight() + measuredHeight);
        a11 a11Var = this.X0;
        if (a11Var != null) {
            a11Var.layout(measuredWidth2, measuredHeight, w0Var.getMeasuredWidth() + measuredWidth2, w0Var.getMeasuredHeight() + measuredHeight);
        }
        x0 x0Var = this.V0;
        x0Var.layout(ceil, additionalTop, x0Var.getMeasuredWidth() + ceil, x0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f10;
        this.M0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.A0;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * currentActionBarHeight) / f10);
        float f12 = currentActionBarHeight2;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / currentActionBarHeight);
            floor = f12;
        }
        int i12 = (int) f11;
        int i13 = (int) floor;
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f13 = f11 / this.O0.f26052a;
        this.N0 = f13;
        w0 w0Var = this.W0;
        w0Var.setScaleX(f13);
        w0Var.setScaleY(this.N0);
        w0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.O0.f26052a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.O0.f26053b, 1073741824));
        a11 a11Var = this.X0;
        if (a11Var != null) {
            a11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.O0.f26052a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.O0.f26053b, 1073741824));
            this.X0.setScaleX(this.N0);
            this.X0.setScaleY(this.N0);
        }
        C0();
        this.V0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.Z0, i10, i11);
        measureChild(this.f4473i1, i10, i11);
        measureChild(this.f4459b1, i10, i11);
        measureChild(this.f4458a1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f4470g2), 1073741824));
        FrameLayout frameLayout = this.Y0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.M0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f4464d2 && !this.f4468f2) {
            this.M0 = true;
            m0();
            this.M0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        kz kzVar = this.f4462c2;
        if (kzVar != null) {
            measureChild(kzVar, i10, i11);
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.C0.b(jVar.getUUID(), new c0(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return !this.Q0;
    }

    public final void q0(j jVar) {
        j jVar2 = this.P0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f4591j0, false);
            this.P0 = null;
            if (jVar instanceof b4) {
                ValueAnimator valueAnimator = this.f4469g1;
                if (valueAnimator != null && this.f4465e1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.W0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            cg.i2 i2Var = this.C0;
            i2Var.f2429b.remove(uuid);
            i2Var.f2430c.remove(uuid);
            AndroidUtilities.runOnUIThread(new ag.d(i2Var, 15));
        }
        t2 t2Var = this.f4473i1;
        o5.i iVar = this.f4475j1;
        t2Var.setValueOverride(iVar);
        t2Var.setShowPreview(true);
        float f10 = iVar.get();
        cg.f2 f2Var = this.H1;
        f2Var.f2403c = f10;
        s0(f2Var, null);
    }

    @Override
    public final int[] r(j jVar) {
        return k0(jVar);
    }

    public final boolean r0(j jVar, boolean z4) {
        e1 e1Var;
        boolean z10;
        int i10;
        boolean z11 = jVar instanceof b4;
        int i11 = 2;
        if (z11 && (((i10 = this.f4465e1) == -1 && this.f4463d1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f4469g1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.I1) {
                w0(false);
            }
            B0(2);
        }
        if (z11 && z4) {
            b4 b4Var = (b4) jVar;
            int gravity = b4Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            k2 k2Var = this.f4484r1;
            k2Var.setAlignment(i11);
            k2Var.setTypeface(b4Var.getTypeface().f2529a);
            k2Var.e(b4Var.getType(), true);
            this.f4458a1.invalidate();
        }
        j jVar2 = this.P0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.Q0) {
                    int[] k02 = k0(jVar2);
                    y0(new c0(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof b4) {
                    AndroidUtilities.showKeyboard(((b4) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            e1Var = this;
            jVar2.l(jVar2.f4591j0, false);
            j jVar3 = e1Var.P0;
            if (jVar3 instanceof b4) {
                b4 b4Var2 = (b4) jVar3;
                z3 z3Var = b4Var2.f4406n0;
                z3Var.clearFocus();
                z3Var.setEnabled(false);
                z3Var.setClickable(false);
                b4Var2.m();
                if (!z11) {
                    e1Var.Q0 = false;
                    AndroidUtilities.hideKeyboard(((b4) e1Var.P0).getFocusedView());
                    l0(false);
                }
            }
            z10 = true;
        } else {
            e1Var = this;
            z10 = false;
        }
        j jVar4 = e1Var.P0;
        e1Var.P0 = jVar;
        if ((jVar4 instanceof b4) && TextUtils.isEmpty(((b4) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = e1Var.P0;
        o5.i iVar = e1Var.f4475j1;
        cg.f2 f2Var = e1Var.H1;
        t2 t2Var = e1Var.f4473i1;
        if (jVar5 != null) {
            x0 x0Var = e1Var.V0;
            jVar5.f4591j0 = x0Var;
            jVar5.l(x0Var, true);
            e1Var.W0.bringChildToFront(e1Var.P0);
            j jVar6 = e1Var.P0;
            if (jVar6 instanceof b4) {
                b4 b4Var3 = (b4) jVar6;
                b4Var3.f4415w0 = false;
                b4Var3.getSwatch().f2403c = f2Var.f2403c;
                s0(b4Var3.getSwatch(), null);
                t2Var.setValueOverride(new j0(b4Var3, (int) (e1Var.O0.f26052a / 9.0f), 0));
                t2Var.setShowPreview(false);
                return true;
            }
            t2Var.setValueOverride(iVar);
            t2Var.setShowPreview(true);
            f2Var.f2403c = iVar.get();
            s0(f2Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = e1Var.f4469g1;
        if (valueAnimator2 != null && e1Var.f4465e1 != 0) {
            valueAnimator2.cancel();
        }
        if (e1Var.I1) {
            w0(false);
        }
        B0(0);
        t2Var.setValueOverride(iVar);
        t2Var.setShowPreview(true);
        f2Var.f2403c = iVar.get();
        s0(f2Var, null);
        return z10;
    }

    @Override
    public final void requestLayout() {
        if (this.M0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(cg.f2 f2Var, Integer num) {
        cg.f2 f2Var2 = this.H1;
        if (f2Var2 != f2Var) {
            f2Var2.f2401a = f2Var.f2401a;
            f2Var2.f2402b = f2Var.f2402b;
            f2Var2.f2403c = f2Var.f2403c;
            int i10 = this.M1;
            cg.f1.e(i10).h(f2Var.f2401a, true);
            cg.f1.e(i10).j(f2Var.f2403c);
        }
        int i11 = f2Var.f2401a;
        s0 s0Var = this.T0;
        s0Var.setColor(i11);
        s0Var.setBrushSize(f2Var.f2403c);
        int i12 = f2Var2.f2401a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new t(this, num, i12, 0));
            duration.start();
        } else {
            a1 a1Var = this.Z0;
            if (a1Var != null) {
                a1Var.invalidate();
            }
        }
        j jVar = this.P0;
        if (jVar instanceof b4) {
            ((b4) jVar).setSwatch(new cg.f2(f2Var.f2402b, f2Var.f2403c, f2Var.f2401a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(pg.b bVar) {
        bVar.o(AndroidUtilities.dp(4.0f));
        this.Z1 = bVar;
    }

    public void setDrawShadow(boolean z4) {
        this.T1 = z4;
        invalidate();
        setClipChildren(!z4);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.f4463d1 == 0) {
            this.f4473i1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.R1 = runnable;
    }

    @Override
    public final void t() {
        ph.i3 i3Var;
        if (!this.f4466e2 && !this.f4464d2) {
            j0(true);
            return;
        }
        boolean z4 = this.f4464d2;
        if (z4 && (i3Var = ((ft0) this).f34353l2.H1) != null) {
            i3Var.e = true;
        }
        x0(!z4 ? 1 : 0);
        if (z4) {
            j jVar = this.P0;
            if (jVar instanceof b4) {
                AndroidUtilities.showKeyboard(((b4) jVar).getEditText());
            }
        }
    }

    public final void t0(float f10) {
        this.f4494z0 = f10;
        this.Y0.setTranslationY(-f10);
        this.Z0.setTranslationY(f10);
    }

    @Override
    public final void u(float f10, float f11, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.W0.getRotation());
        double d10 = f11 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) kh.a2.a(radians, d10, Math.sin(radians) * d));
    }

    @Override
    public final cg.f1 v() {
        return cg.f1.e(this.M1);
    }

    public final void v0(float f10, float f11, float f12, float f13, float f14) {
        View view;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        this.F0 = f10;
        this.K0 = f13;
        this.L0 = f14;
        this.G0 = f11;
        this.H0 = f12;
        this.I0 = f11;
        float f21 = f12 + 0.0f;
        this.J0 = f21;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.W0;
            } else if (i10 == 1) {
                view = this.V0;
            } else if (i10 == 2) {
                view = this.T0;
            } else {
                view = this.U0;
            }
            MediaController.CropState cropState = this.E0;
            if (cropState != null) {
                float f22 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = cropState.transformRotation;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f13 / ((int) (cropState.cropPw * f19)), f14 / ((int) (cropState.cropPh * f20)));
                    f15 = f22 * max;
                    float z4 = e2.c.z(cropState.cropPx, measuredWidth, f10, max);
                    float f23 = cropState.cropScale;
                    f16 = (z4 * f23) + f11;
                    f17 = (cropState.cropPy * measuredHeight * f10 * max * f23) + f21;
                    f18 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                if (i10 == 0) {
                    f15 = this.N0 * 1.0f;
                } else {
                    f15 = 1.0f;
                }
                f16 = f11;
                f17 = f21;
                f18 = 0.0f;
            }
            float f24 = ((-this.f4470g2) / 2.0f) + f17;
            float f25 = f10 * f15;
            if (Float.isNaN(f25)) {
                f25 = 1.0f;
            }
            view.setScaleX(f25);
            view.setScaleY(f25);
            view.setTranslationX(f16);
            view.setTranslationY(f24);
            view.setRotation(f18);
            view.invalidate();
        }
        C0();
        invalidate();
    }

    @Override
    public final boolean w(j jVar) {
        return r0(jVar, true);
    }

    public final void w0(final boolean z4) {
        float f10;
        boolean z10;
        if (this.I1 != z4) {
            this.I1 = z4;
            o1.j jVar = this.J1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new kb.a(f10));
            this.J1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z4) {
                f11 = 0.0f;
            }
            kVar.f16204i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16198u = kVar;
            if (!this.f4466e2 && !this.f4464d2) {
                z10 = false;
            } else {
                z10 = true;
            }
            final boolean[] zArr = {z10};
            final float translationY = this.Z0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.J1.b(new o1.g() {
                @Override
                public final void a(o1.h hVar, float f12, float f13) {
                    int i10;
                    e1 e1Var = e1.this;
                    a1 a1Var = e1Var.Z0;
                    float f14 = f12 / 1000.0f;
                    e1Var.K1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(e1Var.K1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(e1Var.K1, 0.25f) / 0.25f));
                    z0 z0Var = e1Var.D1;
                    float f16 = e1Var.K1;
                    boolean z11 = z4;
                    z0Var.y1(f16, z11);
                    e1Var.f4492y0.setProgress(e1Var.K1);
                    e1Var.f4490x0.setProgress(e1Var.K1);
                    e1Var.f4461c1.setTranslationY(AndroidUtilities.dp(32.0f) * e1Var.K1);
                    if (zArr[0]) {
                        float f17 = e1Var.K1;
                        if (!z11) {
                            f17 = 1.0f - f17;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f17;
                        if (z11) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        a1Var.setTranslationY(translationY - (dp * i10));
                    }
                    a1Var.invalidate();
                    if (view == e1Var.f4484r1) {
                        e1Var.f4458a1.invalidate();
                    }
                }
            });
            this.J1.a(new z(this, z4, 1));
            this.J1.f();
            if (z4) {
                z0 z0Var = this.D1;
                z0Var.setVisibility(0);
                z0Var.setSelectedColorIndex(cg.f1.e(this.M1).d());
            }
        }
    }

    @Override
    public final void x(cg.m mVar) {
        boolean z4 = mVar instanceof cg.b;
        t2 t2Var = this.f4473i1;
        if (!z4 && !(mVar instanceof cg.d)) {
            t2Var.b(0.05f, 1.0f);
        } else {
            t2Var.b(0.4f, 1.75f);
        }
        t2Var.setDrawCenter(!(mVar instanceof cg.l));
        s0 s0Var = this.T0;
        if (s0Var.getCurrentBrush() instanceof cg.l) {
            this.f4471h1 = true;
        }
        s0Var.setBrush(mVar);
        cg.f2 f2Var = this.H1;
        int i10 = f2Var.f2401a;
        f2Var.f2401a = cg.f1.e(this.M1).c();
        f2Var.f2403c = this.f4475j1.get();
        s0(f2Var, Integer.valueOf(i10));
        this.U0.invalidate();
    }

    public final void x0(int i10) {
        boolean z4;
        int i11;
        k2 k2Var = this.f4484r1;
        if (i10 == 1) {
            kz kzVar = this.f4462c2;
            if (kzVar != null && kzVar.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            kz kzVar2 = this.f4462c2;
            if (kzVar2 != null && kzVar2.Z0 != UserConfig.selectedAccount) {
                removeView(kzVar2);
                this.f4462c2 = null;
            }
            if (this.f4462c2 == null) {
                kz kzVar3 = new kz(null, true, false, false, getContext(), false, null, null, true, this.N1, false, false);
                this.f4462c2 = kzVar3;
                kzVar3.R0 = true;
                kzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f4462c2.setForseMultiwindowLayout(true);
                }
                this.f4462c2.setDelegate(new r0(this));
                addView(this.f4462c2);
            }
            this.f4462c2.setVisibility(0);
            this.f4464d2 = true;
            kz kzVar4 = this.f4462c2;
            if (this.f4472h2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f4472h2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f4472h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f4474i2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f4474i2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f4474i2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f4474i2;
            } else {
                i11 = this.f4472h2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar4.getLayoutParams();
            layoutParams.height = i11;
            kzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.P0;
                if (jVar instanceof b4) {
                    AndroidUtilities.hideKeyboard(((b4) jVar).getEditText());
                }
            }
            this.f4470g2 = i11;
            requestLayout();
            ph.i3 i3Var = ((ft0) this).f34353l2.H1;
            if (i3Var != null) {
                i3Var.a();
            }
            qg emojiButton = k2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            getHeight();
            if (!z4 && !this.f4466e2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f4470g2, 0.0f);
                ofFloat.addUpdateListener(new s(this, 1));
                ofFloat.addListener(new q0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        qg emojiButton2 = k2Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(og.e, true);
        }
        kz kzVar5 = this.f4462c2;
        if (kzVar5 != null) {
            this.f4464d2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                kzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f4470g2 = 0;
        }
        ph.i3 i3Var2 = ((ft0) this).f34353l2.H1;
        if (i3Var2 != null) {
            i3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, e1 e1Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.p1 p1Var = this.O1;
        if (p1Var != null && p1Var.isShowing()) {
            this.O1.d(true);
            return;
        }
        if (this.P1 == null) {
            this.Q1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.N1);
            this.P1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.P1.setBackgroundColor(-14145495);
            this.P1.setOnTouchListener(new v(this, 0));
            this.P1.setDispatchKeyEventListener(new w(this));
            this.P1.setShownFromBottom(true);
        }
        this.P1.d();
        runnable.run();
        if (this.O1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.P1, -2, -2);
            this.O1 = p1Var2;
            p1Var2.f20516b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.O1.setOutsideTouchable(true);
            this.O1.setClippingEnabled(true);
            this.O1.setInputMethodMode(2);
            this.O1.setSoftInputMode(0);
            this.O1.getContentView().setFocusableInTouchMode(true);
            this.O1.setOnDismissListener(new x(this, 0));
        }
        this.P1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.O1.setFocusable(true);
        this.O1.showAtLocation(e1Var, i10, i11 - (this.P1.getMeasuredWidth() / 2), i12 - this.P1.getMeasuredHeight());
        org.telegram.ui.ActionBar.p1.i(this.P1);
    }

    public final void z0(boolean z4) {
        float f10;
        if (this.B1 != z4) {
            this.B1 = z4;
            o1.j jVar = this.C1;
            if (jVar != null) {
                jVar.c();
            }
            float f11 = 1000.0f;
            if (z4) {
                f10 = 0.0f;
            } else {
                f10 = 1000.0f;
            }
            o1.j jVar2 = new o1.j(new kb.a(f10));
            this.C1 = jVar2;
            o1.k kVar = new o1.k();
            if (!z4) {
                f11 = 0.0f;
            }
            kVar.f16204i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16198u = kVar;
            if (z4) {
                q2 q2Var = this.f4485s1;
                q2Var.setAlpha(0.0f);
                q2Var.setVisibility(0);
            }
            this.C1.b(new y(0, this));
            this.C1.a(new z(this, z4, 0));
            this.C1.f();
        }
    }

    @Override
    public final void B(boolean z4) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void g(boolean z4) {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h(boolean z4) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m(boolean z4) {
    }

    @Override
    public final void y() {
    }
}
