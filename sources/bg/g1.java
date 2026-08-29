package bg;

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
import i7.f6;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.y5;
import org.telegram.ui.gq0;
import org.telegram.ui.th;
import org.telegram.ui.ws0;
public abstract class g1 extends iv0 implements q2, i, l2, gv0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public boolean A1;
    public final ag.n2 B0;
    public o1.k B1;
    public final DispatchQueue C0;
    public final a1 C1;
    public final MediaController.CropState D0;
    public final Paint D1;
    public float E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final ag.k2 G1;
    public float H0;
    public boolean H1;
    public float I0;
    public o1.k I1;
    public float J0;
    public float J1;
    public float K0;
    public final Paint K1;
    public boolean L0;
    public final int L1;
    public float M0;
    public final i0 M1;
    public bv0 N0;
    public org.telegram.ui.ActionBar.o1 N1;
    public k O0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout O1;
    public boolean P0;
    public Rect P1;
    public int Q0;
    public Runnable Q1;
    public final boolean R0;
    public final ag.h1 R1;
    public final t0 S0;
    public boolean S1;
    public final v0 T0;
    public float T1;
    public final y0 U0;
    public boolean U1;
    public final x0 V0;
    public final d6 V1;
    public p01 W0;
    public final Paint W1;
    public final FrameLayout X0;
    public final Paint X1;
    public final b1 Y0;
    public ng.d Y1;
    public final z0 Z0;
    public final float[] Z1;
    public final FrameLayout f2224a1;
    public final int[] a2;
    public l0 f2225b1;
    public fz f2226b2;
    public int f2227c1;
    public boolean f2228c2;
    public int f2229d1;
    public boolean f2230d2;
    public float f2231e1;
    public boolean f2232e2;
    public ValueAnimator f2233f1;
    public int f2234f2;
    public boolean f2235g1;
    public int f2236g2;
    public final w2 f2237h1;
    public int f2238h2;
    public final za.c f2239i1;
    public int f2240i2;
    public ArrayList f2241j1;
    public boolean f2242j2;
    public final int f2243k1;
    public BigInteger l1;
    public TextView f2244m1;
    public TextView f2245n1;
    public TextView f2246o1;
    public final r2 f2247p1;
    public final n2 f2248q1;
    public final t2 f2249r1;
    public final ImageView f2250s1;
    public final LinearLayout f2251t1;
    public final TextView f2252u1;
    public final TextView f2253v1;
    public final e2 f2254w0;
    public final TextView f2255w1;
    public final i2 f2256x0;
    public final Paint f2257x1;
    public float f2258y0;
    public final Paint f2259y1;
    public final Bitmap f2260z0;
    public float f2261z1;

    public g1(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, gq0 gq0Var, c6 c6Var) {
        super(context, activity);
        boolean z10;
        float f9;
        int i12;
        y2 y2Var;
        Emoji.EmojiSpan[] emojiSpanArr;
        ArrayList arrayList2 = arrayList;
        boolean z11 = false;
        this.f2227c1 = 0;
        this.f2229d1 = -1;
        final ws0 ws0Var = (ws0) this;
        this.f2239i1 = new za.c(ws0Var, 5);
        this.f2257x1 = new Paint(1);
        this.f2259y1 = new Paint(1);
        this.D1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        ag.k2 k2Var = new ag.k2(1.0f, 0.016773745f, -1);
        this.G1 = k2Var;
        this.K1 = new Paint(1);
        this.U1 = false;
        this.V1 = new d6((View) this, 350L, jr.h);
        this.W1 = new Paint(1);
        Paint paint = new Paint(1);
        this.X1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.Z1 = new float[2];
        this.a2 = new int[2];
        new ag.q1(ws0Var, 10);
        setDelegate(this);
        this.L1 = i10;
        this.M1 = new i0(0, c6Var);
        this.D0 = cropState;
        this.R0 = context instanceof BubbleActivity;
        ag.h1 e10 = ag.h1.e(i10);
        this.R1 = e10;
        e10.i(0, true);
        k2Var.f571a = e10.c();
        k2Var.f573c = e10.f521i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.C0 = dispatchQueue;
        this.f2260z0 = bitmap;
        this.A0 = bitmap2;
        this.f2243k1 = i11;
        ag.n2 n2Var = new ag.n2();
        this.B0 = n2Var;
        n2Var.f617a = new a1.c(ws0Var, 4);
        t0 t0Var = new t0(ws0Var, context, new ag.f1(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.S0 = t0Var;
        t0Var.setDelegate(new u0(ws0Var, gq0Var));
        t0Var.setUndoStore(n2Var);
        t0Var.setQueue(dispatchQueue);
        t0Var.setVisibility(4);
        addView(t0Var, f6.e(-1, -1, 51));
        v0 v0Var = new v0(ws0Var, context);
        this.T0 = v0Var;
        v0Var.setVisibility(4);
        addView(v0Var, f6.e(-1, -1, 51));
        x0 x0Var = new x0(ws0Var, context, new w0(ws0Var));
        this.V0 = x0Var;
        addView(x0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i13);
                byte b10 = mediaEntity.type;
                if (b10 == 0) {
                    f9 = 2.0f;
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z11);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z11);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i12 = size;
                    y2Var = i02;
                } else {
                    f9 = 2.0f;
                    if (b10 == 1) {
                        ?? j02 = j0(z11);
                        j02.setType(mediaEntity.subType);
                        j02.setTypeface(mediaEntity.textTypeface);
                        j02.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                        int size2 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i14);
                            i14++;
                            VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                            int i15 = size2;
                            y5 y5Var = new y5(emojiEntity2.document_id, j02.getFontMetricsInt());
                            int i16 = emojiEntity2.offset;
                            spannableString.setSpan(y5Var, i16, emojiEntity2.length + i16, 33);
                            size = size;
                            size2 = i15;
                        }
                        i12 = size;
                        CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                        if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        j02.setText(replaceEmoji);
                        u0(j02, mediaEntity.textAlign);
                        ag.k2 swatch = j02.getSwatch();
                        swatch.f571a = mediaEntity.color;
                        j02.setSwatch(swatch);
                        y2Var = j02;
                    } else {
                        i12 = size;
                        if (b10 == 2) {
                            y2 h02 = h0(mediaEntity.text, false);
                            h02.f2627x0 = false;
                            if ((mediaEntity.subType & 2) != 0) {
                                h02.r(false);
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                h02.t(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            y2Var = h02;
                        } else {
                            i13++;
                            arrayList2 = arrayList;
                            size = i12;
                            z11 = false;
                        }
                    }
                }
                y2Var.setX((mediaEntity.f19644x * this.N0.f27238a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / f9));
                y2Var.setY((mediaEntity.f19645y * this.N0.f27239b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / f9));
                y2Var.setPosition(new PointF((mediaEntity.viewWidth / f9) + y2Var.getX(), (mediaEntity.viewHeight / f9) + y2Var.getY()));
                y2Var.setScale(mediaEntity.scale);
                y2Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i13++;
                arrayList2 = arrayList;
                size = i12;
                z11 = false;
            }
        }
        this.V0.setVisibility(4);
        ?? frameLayout = new FrameLayout(context);
        this.U0 = frameLayout;
        addView(frameLayout);
        ?? frameLayout2 = new FrameLayout(context);
        this.X0 = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(frameLayout2, f6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f2250s1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(g6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.f2247p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        ws0Var2.B0.c();
                        return;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.f2247p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.f584a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.f2228c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        return;
                    default:
                        ws0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, f6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2251t1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(g6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, f6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, f6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new n(0));
        frameLayout2.addView(linearLayout, f6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f2252u1 = textView2;
        textView2.setBackground(g6.f0(822083583, 7, -1));
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
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.f2247p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        ws0Var2.B0.c();
                        return;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.f2247p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.f584a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.f2228c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        return;
                    default:
                        ws0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = th.h(frameLayout2, textView2, f6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f2253v1 = h;
        h.setBackground(g6.f0(822083583, 7, -1));
        h.setPadding(org.telegram.ui.b.e(8.0f, R.string.Clear, h), 0, AndroidUtilities.dp(8.0f), 0);
        h.setGravity(16);
        h.setTextColor(-1);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextSize(1, 16.0f);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.f2247p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        ws0Var2.B0.c();
                        return;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.f2247p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.f584a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.f2228c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        return;
                    default:
                        ws0Var.r0(null, true);
                        return;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h10 = th.h(frameLayout2, h, f6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f2255w1 = h10;
        h10.setBackground(g6.f0(822083583, 7, -1));
        h10.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, h10), 0, AndroidUtilities.dp(8.0f), 0);
        h10.setGravity(16);
        h10.setTextColor(-1);
        h10.setTypeface(AndroidUtilities.bold());
        h10.setTextSize(1, 16.0f);
        h10.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ws0 ws0Var2 = ws0Var;
                        t0 t0Var2 = ws0Var2.S0;
                        if (t0Var2 != null && (t0Var2.getCurrentBrush() instanceof ag.l)) {
                            t0Var2.b();
                            ws0Var2.f2247p1.setSelectedIndex(1);
                            ws0Var2.q((ag.m) ag.m.f584a.get(0));
                            return;
                        }
                        ws0Var2.B0.c();
                        return;
                    case 1:
                        ws0 ws0Var3 = ws0Var;
                        t0 t0Var3 = ws0Var3.S0;
                        ag.n2 n2Var2 = ws0Var3.B0;
                        if (n2Var2.a()) {
                            if (t0Var3 != null && (t0Var3.getCurrentBrush() instanceof ag.l)) {
                                t0Var3.b();
                                ws0Var3.f2247p1.setSelectedIndex(1);
                                ws0Var3.q((ag.m) ag.m.f584a.get(0));
                            }
                            t0Var3.a();
                            n2Var2.f619c.clear();
                            n2Var2.f618b.clear();
                            AndroidUtilities.runOnUIThread(new a4.g(n2Var2, 4));
                            ws0Var3.V0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ws0 ws0Var4 = ws0Var;
                        k kVar = ws0Var4.O0;
                        if (kVar instanceof f4) {
                            AndroidUtilities.hideKeyboard(((f4) kVar).getFocusedView());
                        }
                        if (ws0Var4.f2228c2) {
                            ws0Var4.l0(false);
                        }
                        ws0Var4.q0(ws0Var4.O0);
                        ws0Var4.r0(null, true);
                        return;
                    default:
                        ws0Var.r0(null, true);
                        return;
                }
            }
        });
        h10.setAlpha(0.0f);
        h10.setVisibility(8);
        frameLayout2.addView(h10, f6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        b1 b1Var = new b1(ws0Var, context);
        this.Y0 = b1Var;
        b1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        b1Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(b1Var, f6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r2 r2Var = new r2(context, z10);
        this.f2247p1 = r2Var;
        r2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        r2Var.setDelegate(this);
        r2Var.setSelectedIndex(1);
        b1Var.addView(r2Var, f6.c(48.0f, -1));
        n2 n2Var2 = new n2(context);
        this.f2248q1 = n2Var2;
        n2Var2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        n2Var2.setVisibility(8);
        n2Var2.setDelegate(this);
        n2Var2.setAlignment(ag.h1.e(i10).f520g);
        b1Var.addView(n2Var2, f6.c(48.0f, -1));
        z0 z0Var = new z0(ws0Var, context);
        this.Z0 = z0Var;
        addView(z0Var, f6.c(-1.0f, -1));
        t2 t2Var = new t2(context);
        this.f2249r1 = t2Var;
        t2Var.setVisibility(8);
        t2Var.setOnItemClickListener(new o(ws0Var, 0));
        n2Var2.setTypefaceListView(t2Var);
        z0Var.addView(t2Var, f6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f2257x1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f2257x1.setColor(1728053247);
        this.f2257x1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f2259y1.setColor(g6.v0(g6.G8, this.M1));
        a1 a1Var = new a1(ws0Var, context);
        this.C1 = a1Var;
        a1Var.setVisibility(8);
        a1Var.setColorPalette(ag.h1.e(i10));
        a1Var.setColorListener(new p(ws0Var, 0));
        b1Var.addView(a1Var, f6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        e2 e2Var = new e2(context);
        this.f2254w0 = e2Var;
        e2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        e2Var.setBackground(g6.f0(1090519039, 1, -1));
        b1Var.addView(e2Var, f6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        i2 i2Var = new i2(context);
        this.f2256x0 = i2Var;
        i2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        i2Var.setBackground(g6.f0(1090519039, 1, -1));
        i2Var.setOnClickListener(new q(ws0Var, context, bitmap2, 0));
        b1Var.addView(i2Var, f6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        w2 w2Var = new w2(context);
        this.f2237h1 = w2Var;
        w2Var.setColorSwatch(this.G1);
        w2Var.setRenderView(this.S0);
        w2Var.setValueOverride(this.f2239i1);
        this.G1.f573c = this.f2239i1.get();
        w2Var.setOnUpdate(new f(ws0Var, i10, 1));
        addView(w2Var, f6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f2224a1 = frameLayout3;
        addView(frameLayout3, f6.c(-1.0f, -1));
        this.F1.setStyle(style);
        this.F1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.G1, null);
        q((ag.m) ag.m.f584a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(ws0 ws0Var, Integer num) {
        ws0Var.setNewColor(num.intValue());
        ws0Var.w0(false);
    }

    public static void a0(bg.g1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: bg.g1.a0(bg.g1):void");
    }

    public static void b0(g1 g1Var) {
        v3 v3Var;
        x0 x0Var = g1Var.V0;
        k kVar = g1Var.O0;
        if (kVar != null) {
            PointF A0 = g1Var.A0(kVar);
            k kVar2 = g1Var.O0;
            if (kVar2 instanceof v3) {
                v3 v3Var2 = new v3(g1Var.getContext(), (v3) g1Var.O0, A0);
                v3Var2.setDelegate(g1Var);
                x0Var.addView(v3Var2);
                v3Var = v3Var2;
            } else if (kVar2 instanceof f4) {
                f4 f4Var = new f4(g1Var.getContext(), (f4) g1Var.O0, A0);
                f4Var.setDelegate(g1Var);
                f4Var.setMaxWidth((int) (g1Var.getPaintingSize().f27238a - 20.0f));
                x0Var.addView(f4Var, f6.c(-2.0f, -2));
                v3Var = f4Var;
            } else {
                v3Var = null;
            }
            g1Var.p0(v3Var);
            g1Var.r0(v3Var, true);
        }
        org.telegram.ui.ActionBar.o1 o1Var = g1Var.N1;
        if (o1Var != null && o1Var.isShowing()) {
            g1Var.N1.d(true);
        }
    }

    public static void c0(ws0 ws0Var, Integer num) {
        ag.h1 h1Var = ws0Var.R1;
        h1Var.h(num.intValue(), true);
        h1Var.g();
        ws0Var.setNewColor(num.intValue());
        a1 a1Var = ws0Var.C1;
        a1Var.setSelectedColorIndex(h1Var.d());
        a1Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f2227c1 == 2) {
            return this.f2248q1;
        }
        return this.f2247p1;
    }

    private int getFrameRotation() {
        int i10 = this.f2243k1;
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

    private bv0 getPaintingSize() {
        int i10;
        bv0 bv0Var = this.N0;
        if (bv0Var != null) {
            return bv0Var;
        }
        Bitmap bitmap = this.f2260z0;
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
        bv0 bv0Var2 = new bv0(width, height);
        float f9 = i10;
        bv0Var2.f27238a = f9;
        float floor = (float) Math.floor((f9 * height) / width);
        bv0Var2.f27239b = floor;
        if (floor > f9) {
            bv0Var2.f27239b = f9;
            bv0Var2.f27238a = (float) Math.floor((f9 * width) / height);
        }
        this.N0 = bv0Var2;
        return bv0Var2;
    }

    public void setNewColor(int i10) {
        ag.k2 k2Var = this.G1;
        int i11 = k2Var.f571a;
        k2Var.f571a = i10;
        s0(k2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new h0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.Q0 = i10;
        k kVar = this.O0;
        if (kVar instanceof f4) {
            ((f4) kVar).setType(i10);
        }
        ag.h1 e10 = ag.h1.e(this.L1);
        e10.h = i10;
        e10.f515a.edit().putInt("text_type", i10).apply();
        this.f2248q1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        l0 l0Var = new l0(this, context);
        this.f2225b1 = l0Var;
        l0Var.setClipToPadding(false);
        this.f2225b1.setOrientation(0);
        this.Y0.addView(this.f2225b1, f6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f2244m1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f2244m1;
        int i10 = g6.f23152i6;
        i0 i0Var = this.M1;
        textView2.setBackground(g6.f0(g6.v0(i10, i0Var), 7, -1));
        this.f2244m1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f2244m1.setTextColor(-1);
        this.f2244m1.setTextSize(1, 14.0f);
        this.f2244m1.setGravity(1);
        this.f2244m1.setTypeface(AndroidUtilities.bold());
        this.f2244m1.setSingleLine();
        this.f2244m1.setOnClickListener(new l(this, 0));
        this.f2225b1.addView(this.f2244m1, f6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f2245n1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f2245n1.setBackground(g6.f0(g6.v0(i10, i0Var), 7, -1));
        this.f2245n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f2245n1.setOnClickListener(new l(this, 1));
        this.f2245n1.setTextColor(-1);
        this.f2245n1.setTextSize(1, 14.0f);
        this.f2245n1.setGravity(1);
        this.f2245n1.setTypeface(AndroidUtilities.bold());
        this.f2245n1.setAlpha(0.6f);
        this.f2245n1.setSingleLine();
        this.f2225b1.addView(this.f2245n1, f6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f2246o1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f2246o1.setBackground(g6.f0(g6.v0(i10, i0Var), 7, -1));
        this.f2246o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f2246o1.setTextColor(-1);
        this.f2246o1.setTextSize(1, 14.0f);
        this.f2246o1.setGravity(1);
        this.f2246o1.setTypeface(AndroidUtilities.bold());
        this.f2246o1.setAlpha(0.6f);
        this.f2246o1.setSingleLine();
        this.f2246o1.setOnClickListener(new l(this, 4));
        this.f2225b1.addView(this.f2246o1, f6.l(1.0f, 0, -2));
    }

    public static void u0(f4 f4Var, int i10) {
        int i11;
        f4Var.setAlign(i10);
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
        f4Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        f4Var.getEditText().setTextAlignment(i12);
    }

    @Override
    public final void A() {
        y0(new r(this, 4), this, 53, 0, getHeight());
    }

    public final PointF A0(k kVar) {
        float f9 = 200.0f;
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f9 = 200.0f / cropState.cropScale;
        }
        if (kVar != null) {
            PointF position = kVar.getPosition();
            return new PointF(position.x + f9, position.y + f9);
        }
        float f10 = 100.0f;
        if (cropState != null) {
            f10 = 100.0f / cropState.cropScale;
        }
        PointF g02 = g0();
        while (true) {
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                x0 x0Var = this.V0;
                if (i10 >= x0Var.getChildCount()) {
                    break;
                }
                View childAt = x0Var.getChildAt(i10);
                if (childAt instanceof k) {
                    PointF position2 = ((k) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.y - g02.y, 2.0d) + Math.pow(position2.x - g02.x, 2.0d))) < f10) {
                        z10 = true;
                    }
                }
                i10++;
            }
            if (!z10) {
                return g02;
            }
            g02 = new PointF(g02.x + f9, g02.y + f9);
        }
    }

    public final void B0(int i10) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        boolean z10;
        if (this.f2227c1 != i10 && this.f2229d1 != i10) {
            ValueAnimator valueAnimator = this.f2233f1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f2227c1;
            ViewGroup viewGroup3 = this.f2248q1;
            ViewGroup viewGroup4 = this.f2247p1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f2229d1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.L1;
            ag.h1 e10 = ag.h1.e(i12);
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e10.f524l != z10) {
                e10.f524l = z10;
                if (z10) {
                    e10.i(-1, false);
                } else {
                    e10.i(e10.f515a.getInt("brush", 0), false);
                }
            }
            int c3 = ag.h1.e(i12).c();
            ag.k2 k2Var = this.G1;
            k2Var.f571a = c3;
            s0(k2Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f2233f1 = duration;
            duration.setInterpolator(jr.f29800f);
            this.f2233f1.addUpdateListener(new s(this, viewGroup, viewGroup2, 0));
            this.f2233f1.addListener(new m0(this, viewGroup, viewGroup2, i10, 0));
            this.f2233f1.start();
        }
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            x0 x0Var = this.V0;
            if (i10 < x0Var.getChildCount()) {
                View childAt = x0Var.getChildAt(i10);
                if (childAt != this.O0) {
                    if (childAt instanceof k) {
                        k kVar = (k) childAt;
                        if (!kVar.f2355h0 && kVar.f2353f0 <= 0.0f) {
                        }
                    }
                    i10++;
                }
                ((k) childAt).m();
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
    public final void G(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        int i11;
        if (i10 > AndroidUtilities.dp(50.0f) && this.f2230d2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z10) {
                this.f2238h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f2238h2).commit();
            } else {
                this.f2236g2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f2236g2).commit();
            }
        }
        if (this.f2228c2) {
            if (z10) {
                i11 = this.f2238h2;
            } else {
                i11 = this.f2236g2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f2226b2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f2226b2.setLayoutParams(layoutParams);
                this.f2234f2 = layoutParams.height;
                requestLayout();
                nh.w3 w3Var = ((ws0) this).f44369k2.G1;
                if (w3Var != null) {
                    w3Var.a();
                }
                getHeight();
            }
        }
        if (this.f2240i2 == i10 && this.f2242j2 == z10) {
            getHeight();
            return;
        }
        this.f2240i2 = i10;
        this.f2242j2 = z10;
        boolean z13 = this.f2230d2;
        k kVar = this.O0;
        if (kVar instanceof f4) {
            if (((f4) kVar).getEditText().isFocused() && i10 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f2230d2 = z12;
        } else {
            this.f2230d2 = false;
        }
        if (this.f2230d2 && this.f2228c2) {
            x0(0);
        }
        if (this.f2234f2 != 0 && !(z11 = this.f2230d2) && z11 != z13 && !this.f2228c2) {
            this.f2234f2 = 0;
            requestLayout();
            nh.w3 w3Var2 = ((ws0) this).f44369k2.G1;
            if (w3Var2 != null) {
                w3Var2.a();
            }
        }
        getHeight();
    }

    @Override
    public final void a() {
        w0(true);
    }

    @Override
    public final void b(k kVar) {
        int[] k02 = k0(kVar);
        y0(new d0(this, kVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    @Override
    public final void d() {
        setTextType((this.Q0 + 1) % 4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        x0 x0Var;
        f4 f4Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (x0Var = this.V0) != null) {
            for (int i12 = 0; i12 < x0Var.getChildCount(); i12++) {
                View childAt = x0Var.getChildAt(i12);
                if ((childAt instanceof f4) && (str = (f4Var = (f4) childAt).f2219w0) != null) {
                    f4Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: bg.g1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        this.K1.setColor(-15132391);
    }

    @Override
    public final void f(int i10) {
        k kVar = this.O0;
        if (kVar instanceof f4) {
            u0((f4) kVar, i10);
            ag.h1 e10 = ag.h1.e(this.L1);
            e10.f520g = i10;
            e10.f515a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new a1.e(11, this, (y2) view)).start();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        bv0 paintingSize = getPaintingSize();
        float f9 = paintingSize.f27238a / 2.0f;
        float f10 = paintingSize.f27239b / 2.0f;
        if (this.D0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float b10 = (float) j7.l1.b(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f9 -= cos * paintingSize.f27238a;
            f10 -= b10 * paintingSize.f27239b;
        }
        return new PointF(f9, f10);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public View getCancelView() {
        return this.f2254w0;
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    public View getDoneView() {
        return this.f2256x0;
    }

    public long getLcm() {
        return this.l1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        y5[] y5VarArr;
        x0 x0Var = this.V0;
        int childCount = x0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = x0Var.getChildAt(i10);
            if (childAt instanceof v3) {
                TLRPC.Document sticker = ((v3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f22404id = sticker.f22398id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof f4) {
                CharSequence text = ((f4) childAt).getText();
                if ((text instanceof Spanned) && (y5VarArr = (y5[]) ((Spanned) text).getSpans(0, text.length(), y5.class)) != null) {
                    for (y5 y5Var : y5VarArr) {
                        if (y5Var != null) {
                            TLRPC.Document document = y5Var.document;
                            if (document == null) {
                                document = p5.f(this.L1, y5Var.getDocumentId());
                            }
                            if (document != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.f22404id = document.f22398id;
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
        return this.f2258y0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public ag.t1 getRenderView() {
        return this.S0;
    }

    public float getSelectedEntityBottom() {
        k kVar = this.O0;
        x0 x0Var = this.V0;
        if (kVar == null) {
            return getY() + x0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        kVar.getLocationInWindow(iArr);
        return (x0Var.getScaleY() * this.O0.getHeight()) + iArr[1];
    }

    public p01 getThanosEffect() {
        if (!p01.c()) {
            return null;
        }
        if (this.W0 == null) {
            p01 p01Var = new p01(getContext(), new r(this, 0));
            this.W0 = p01Var;
            addView(p01Var);
        }
        return this.W0;
    }

    public final y2 h0(String str, boolean z10) {
        float f9;
        bv0 bv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f9 = options.outWidth / options.outHeight;
        } catch (Exception e10) {
            FileLog.e(e10);
            f9 = 1.0f;
        }
        x0 x0Var = this.V0;
        if (f9 > 1.0f) {
            float floor = (float) Math.floor(x0Var.getMeasuredWidth() * 0.5d);
            bv0Var = new bv0(floor, floor / f9);
        } else {
            float floor2 = (float) Math.floor(x0Var.getMeasuredHeight() * 0.5d);
            bv0Var = new bv0(f9 * floor2, floor2);
        }
        bv0 bv0Var2 = bv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f10 = bv0Var2.f27238a;
            bv0Var2.f27238a = bv0Var2.f27239b;
            bv0Var2.f27239b = f10;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        y2 y2Var = new y2(context, g02, bv0Var2, str, intValue);
        y2Var.setDelegate(this);
        x0Var.addView(y2Var);
        if (z10) {
            p0(y2Var);
            r0(y2Var, true);
        }
        return y2Var;
    }

    public final bg.q0 i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: bg.g1.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):bg.q0");
    }

    public final f4 j0(boolean z10) {
        ((ws0) this).f44369k2.f35666c0.isFocusable();
        bv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        f4 f4Var = new f4(getContext(), A0, (int) (paintingSize.f27238a / 9.0f), "", this.G1, this.Q0);
        float f9 = paintingSize.f27238a / 9.0f;
        r rVar = new r(this, 2);
        f4Var.f2215s0 = (int) (0.5f * f9);
        f4Var.f2216t0 = (int) (f9 * 2.0f);
        f4Var.f2217u0 = rVar;
        float f10 = A0.x;
        x0 x0Var = this.V0;
        if (f10 == x0Var.getMeasuredWidth() / 2.0f) {
            f4Var.setStickyX(2);
        }
        if (A0.y == x0Var.getMeasuredHeight() / 2.0f) {
            f4Var.setStickyY(2);
        }
        f4Var.setDelegate(this);
        f4Var.setMaxWidth((int) (paintingSize.f27238a - 20.0f));
        int i10 = this.L1;
        f4Var.setTypeface(ag.h1.e(i10).f522j);
        f4Var.setType(ag.h1.e(i10).h);
        x0Var.addView(f4Var, f6.c(-2.0f, -2));
        MediaController.CropState cropState = this.D0;
        if (cropState != null) {
            f4Var.j(1.0f / cropState.cropScale);
            f4Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z10) {
            p0(f4Var);
            f4Var.q();
            r0(f4Var, false);
            f4Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(f4Var.getFocusedView());
            this.P0 = true;
            int i11 = ag.h1.e(i10).f520g;
            n2 n2Var = this.f2248q1;
            n2Var.d(i11, true);
            n2Var.setOutlineType(ag.h1.e(i10).h);
        }
        return f4Var;
    }

    public final int[] k0(k kVar) {
        float[] fArr = this.Z1;
        fArr[0] = kVar.getWidth() / 2.0f;
        fArr[1] = kVar.getHeight() / 2.0f;
        kVar.getMatrix().mapPoints(fArr);
        fArr[0] = fArr[0] + kVar.getLeft();
        fArr[1] = fArr[1] + kVar.getTop();
        ViewParent parent = kVar.getParent();
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
        int[] iArr = this.a2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f9 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f9;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) j7.l1.b(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final boolean l(MotionEvent motionEvent) {
        if (this.O0 != null) {
            r0(null, true);
        }
        float x4 = motionEvent.getX();
        t0 t0Var = this.S0;
        float translationX = ((x4 - t0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / t0Var.getScaleX();
        float y8 = ((((motionEvent.getY() - t0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / t0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-t0Var.getRotation());
        double d10 = y8;
        float measuredWidth = (t0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (t0Var.getMeasuredHeight() / 2.0f) + ((float) j7.l1.b(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        t0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void l0(boolean z10) {
        if (this.f2228c2) {
            x0(0);
        }
        if (z10) {
            fz fzVar = this.f2226b2;
            if (fzVar != null && fzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f2226b2.getMeasuredHeight());
                ofFloat.addUpdateListener(new t(this, 0));
                this.f2232e2 = true;
                ofFloat.addListener(new r0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final void m0() {
        fz fzVar;
        nh.w3 w3Var;
        if (this.f2234f2 > 0 && (w3Var = ((ws0) this).f44369k2.G1) != null) {
            w3Var.a();
        }
        if (!this.f2228c2 && (fzVar = this.f2226b2) != null && fzVar.getVisibility() != 8) {
            this.f2226b2.setVisibility(8);
        }
        this.f2234f2 = 0;
    }

    public final void n0(boolean z10) {
        int i10;
        int i11;
        if (this.f2227c1 == 0) {
            int i12 = 0;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.f2237h1.setLayerType(i10, null);
            if (z10) {
                i11 = 2;
            } else {
                i11 = 0;
            }
            this.Y0.setLayerType(i11, null);
            if (z10) {
                i12 = 2;
            }
            this.X0.setLayerType(i12, null);
        }
    }

    public final boolean o0() {
        if (this.H1) {
            w0(false);
            return true;
        } else if (this.f2228c2) {
            l0(true);
            return true;
        } else if (!this.P0) {
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int R;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        if (this.f2226b2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f2226b2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f2226b2.getMeasuredHeight();
            }
            fz fzVar = this.f2226b2;
            fzVar.layout(0, R, fzVar.getMeasuredWidth(), this.f2226b2.getMeasuredHeight() + R);
        }
        if (!this.R0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        t0 t0Var = this.S0;
        int ceil = (int) Math.ceil((i14 - t0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.x3.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - t0Var.getMeasuredHeight()) / 2, i16);
        t0Var.layout(ceil, additionalTop, t0Var.getMeasuredWidth() + ceil, t0Var.getMeasuredHeight() + additionalTop);
        v0 v0Var = this.T0;
        v0Var.layout(ceil, additionalTop, v0Var.getMeasuredWidth() + ceil, v0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = t0Var.getMeasuredWidth();
        x0 x0Var = this.V0;
        int measuredWidth2 = ((measuredWidth - x0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((t0Var.getMeasuredHeight() - x0Var.getMeasuredHeight()) / 2) + additionalTop;
        x0Var.layout(measuredWidth2, measuredHeight, x0Var.getMeasuredWidth() + measuredWidth2, x0Var.getMeasuredHeight() + measuredHeight);
        p01 p01Var = this.W0;
        if (p01Var != null) {
            p01Var.layout(measuredWidth2, measuredHeight, x0Var.getMeasuredWidth() + measuredWidth2, x0Var.getMeasuredHeight() + measuredHeight);
        }
        y0 y0Var = this.U0;
        y0Var.layout(ceil, additionalTop, y0Var.getMeasuredWidth() + ceil, y0Var.getMeasuredHeight() + additionalTop);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float currentActionBarHeight;
        float f9;
        this.L0 = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.f2260z0;
        if (bitmap != null) {
            f9 = bitmap.getWidth();
            currentActionBarHeight = bitmap.getHeight();
        } else {
            currentActionBarHeight = (size2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            f9 = size;
        }
        float f10 = size;
        float floor = (float) Math.floor((f10 * currentActionBarHeight) / f9);
        float f11 = currentActionBarHeight2;
        if (floor > f11) {
            f10 = (float) Math.floor((f9 * f11) / currentActionBarHeight);
            floor = f11;
        }
        int i12 = (int) f10;
        int i13 = (int) floor;
        this.S0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        this.T0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        float f12 = f10 / this.N0.f27238a;
        this.M0 = f12;
        x0 x0Var = this.V0;
        x0Var.setScaleX(f12);
        x0Var.setScaleY(this.M0);
        x0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.f27238a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.N0.f27239b, 1073741824));
        p01 p01Var = this.W0;
        if (p01Var != null) {
            p01Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.N0.f27238a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.N0.f27239b, 1073741824));
            this.W0.setScaleX(this.M0);
            this.W0.setScaleY(this.M0);
        }
        C0();
        this.U0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.Y0, i10, i11);
        measureChild(this.f2237h1, i10, i11);
        measureChild(this.f2224a1, i10, i11);
        measureChild(this.Z0, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f2234f2), 1073741824));
        FrameLayout frameLayout = this.X0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.L0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f2228c2 && !this.f2232e2) {
            this.L0 = true;
            m0();
            this.L0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        fz fzVar = this.f2226b2;
        if (fzVar != null) {
            measureChild(fzVar, i10, i11);
        }
    }

    @Override
    public final boolean p() {
        return true;
    }

    public final void p0(k kVar) {
        if (kVar == null) {
            return;
        }
        this.B0.b(kVar.getUUID(), new d0(this, kVar, 0));
    }

    @Override
    public final void q(ag.m mVar) {
        boolean z10 = mVar instanceof ag.b;
        w2 w2Var = this.f2237h1;
        if (!z10 && !(mVar instanceof ag.d)) {
            w2Var.b(0.05f, 1.0f);
        } else {
            w2Var.b(0.4f, 1.75f);
        }
        w2Var.setDrawCenter(!(mVar instanceof ag.l));
        t0 t0Var = this.S0;
        if (t0Var.getCurrentBrush() instanceof ag.l) {
            this.f2235g1 = true;
        }
        t0Var.setBrush(mVar);
        ag.k2 k2Var = this.G1;
        int i10 = k2Var.f571a;
        k2Var.f571a = ag.h1.e(this.L1).c();
        k2Var.f573c = this.f2239i1.get();
        s0(k2Var, Integer.valueOf(i10));
        this.T0.invalidate();
    }

    public final void q0(k kVar) {
        k kVar2 = this.O0;
        if (kVar == kVar2 && kVar2 != null) {
            kVar2.l(kVar2.f2356i0, false);
            this.O0 = null;
            if (kVar instanceof f4) {
                ValueAnimator valueAnimator = this.f2233f1;
                if (valueAnimator != null && this.f2229d1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.V0.removeView(kVar);
        if (kVar != null) {
            UUID uuid = kVar.getUUID();
            ag.n2 n2Var = this.B0;
            n2Var.f618b.remove(uuid);
            n2Var.f619c.remove(uuid);
            AndroidUtilities.runOnUIThread(new a4.g(n2Var, 4));
        }
        w2 w2Var = this.f2237h1;
        za.c cVar = this.f2239i1;
        w2Var.setValueOverride(cVar);
        w2Var.setShowPreview(true);
        float f9 = cVar.get();
        ag.k2 k2Var = this.G1;
        k2Var.f573c = f9;
        s0(k2Var, null);
    }

    @Override
    public final boolean r() {
        return !this.P0;
    }

    public final boolean r0(k kVar, boolean z10) {
        g1 g1Var;
        boolean z11;
        int i10;
        boolean z12 = kVar instanceof f4;
        int i11 = 2;
        if (z12 && (((i10 = this.f2229d1) == -1 && this.f2227c1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f2233f1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.H1) {
                w0(false);
            }
            B0(2);
        }
        if (z12 && z10) {
            f4 f4Var = (f4) kVar;
            int gravity = f4Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            n2 n2Var = this.f2248q1;
            n2Var.setAlignment(i11);
            n2Var.setTypeface(f4Var.getTypeface().f674a);
            n2Var.e(f4Var.getType(), true);
            this.Z0.invalidate();
        }
        k kVar2 = this.O0;
        if (kVar2 != null) {
            if (kVar2 == kVar) {
                if (!this.P0) {
                    int[] k02 = k0(kVar2);
                    y0(new d0(this, kVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (kVar2 instanceof f4) {
                    AndroidUtilities.showKeyboard(((f4) kVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            g1Var = this;
            kVar2.l(kVar2.f2356i0, false);
            k kVar3 = g1Var.O0;
            if (kVar3 instanceof f4) {
                f4 f4Var2 = (f4) kVar3;
                d4 d4Var = f4Var2.m0;
                d4Var.clearFocus();
                d4Var.setEnabled(false);
                d4Var.setClickable(false);
                f4Var2.m();
                if (!z12) {
                    g1Var.P0 = false;
                    AndroidUtilities.hideKeyboard(((f4) g1Var.O0).getFocusedView());
                    l0(false);
                }
            }
            z11 = true;
        } else {
            g1Var = this;
            z11 = false;
        }
        k kVar4 = g1Var.O0;
        g1Var.O0 = kVar;
        if ((kVar4 instanceof f4) && TextUtils.isEmpty(((f4) kVar4).getText())) {
            q0(kVar4);
        }
        k kVar5 = g1Var.O0;
        za.c cVar = g1Var.f2239i1;
        ag.k2 k2Var = g1Var.G1;
        w2 w2Var = g1Var.f2237h1;
        if (kVar5 != null) {
            y0 y0Var = g1Var.U0;
            kVar5.f2356i0 = y0Var;
            kVar5.l(y0Var, true);
            g1Var.V0.bringChildToFront(g1Var.O0);
            k kVar6 = g1Var.O0;
            if (kVar6 instanceof f4) {
                f4 f4Var3 = (f4) kVar6;
                f4Var3.f2218v0 = false;
                f4Var3.getSwatch().f573c = k2Var.f573c;
                s0(f4Var3.getSwatch(), null);
                w2Var.setValueOverride(new k0(f4Var3, (int) (g1Var.N0.f27238a / 9.0f), 0));
                w2Var.setShowPreview(false);
                return true;
            }
            w2Var.setValueOverride(cVar);
            w2Var.setShowPreview(true);
            k2Var.f573c = cVar.get();
            s0(k2Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = g1Var.f2233f1;
        if (valueAnimator2 != null && g1Var.f2229d1 != 0) {
            valueAnimator2.cancel();
        }
        if (g1Var.H1) {
            w0(false);
        }
        B0(0);
        w2Var.setValueOverride(cVar);
        w2Var.setShowPreview(true);
        k2Var.f573c = cVar.get();
        s0(k2Var, null);
        return z11;
    }

    @Override
    public final void requestLayout() {
        if (this.L0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(ag.k2 k2Var, Integer num) {
        ag.k2 k2Var2 = this.G1;
        if (k2Var2 != k2Var) {
            k2Var2.f571a = k2Var.f571a;
            k2Var2.f572b = k2Var.f572b;
            k2Var2.f573c = k2Var.f573c;
            int i10 = this.L1;
            ag.h1.e(i10).h(k2Var.f571a, true);
            ag.h1.e(i10).j(k2Var.f573c);
        }
        int i11 = k2Var.f571a;
        t0 t0Var = this.S0;
        t0Var.setColor(i11);
        t0Var.setBrushSize(k2Var.f573c);
        int i12 = k2Var2.f571a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new u(this, num, i12, 0));
            duration.start();
        } else {
            b1 b1Var = this.Y0;
            if (b1Var != null) {
                b1Var.invalidate();
            }
        }
        k kVar = this.O0;
        if (kVar instanceof f4) {
            ((f4) kVar).setSwatch(new ag.k2(k2Var.f572b, k2Var.f573c, k2Var.f571a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(ng.d dVar) {
        dVar.o(AndroidUtilities.dp(4.0f));
        this.Y1 = dVar;
    }

    public void setDrawShadow(boolean z10) {
        this.S1 = z10;
        invalidate();
        setClipChildren(!z10);
    }

    public void setOffsetTranslationX(float f9) {
        if (this.f2227c1 == 0) {
            this.f2237h1.setTranslationX(f9);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.Q1 = runnable;
    }

    @Override
    public final int[] t(k kVar) {
        return k0(kVar);
    }

    public final void t0(float f9) {
        this.f2258y0 = f9;
        this.X0.setTranslationY(-f9);
        this.Y0.setTranslationY(f9);
    }

    @Override
    public final void u() {
        nh.w3 w3Var;
        if (!this.f2230d2 && !this.f2228c2) {
            j0(true);
            return;
        }
        boolean z10 = this.f2228c2;
        if (z10 && (w3Var = ((ws0) this).f44369k2.G1) != null) {
            w3Var.f18780e = true;
        }
        x0(!z10 ? 1 : 0);
        if (z10) {
            k kVar = this.O0;
            if (kVar instanceof f4) {
                AndroidUtilities.showKeyboard(((f4) kVar).getEditText());
            }
        }
    }

    @Override
    public final void v(float f9, float f10, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f9 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.V0.getRotation());
        double d10 = f10 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) j7.l1.b(radians, d10, Math.sin(radians) * d));
    }

    public final void v0(float f9, float f10, float f11, float f12, float f13) {
        View view;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        this.E0 = f9;
        this.J0 = f12;
        this.K0 = f13;
        this.F0 = f10;
        this.G0 = f11;
        this.H0 = f10;
        float f20 = f11 + 0.0f;
        this.I0 = f20;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10 == 0) {
                view = this.V0;
            } else if (i10 == 1) {
                view = this.U0;
            } else if (i10 == 2) {
                view = this.S0;
            } else {
                view = this.T0;
            }
            MediaController.CropState cropState = this.D0;
            if (cropState != null) {
                float f21 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i11 = cropState.transformRotation;
                    if (i11 == 90 || i11 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float max = Math.max(f12 / ((int) (cropState.cropPw * f18)), f13 / ((int) (cropState.cropPh * f19)));
                    f14 = f21 * max;
                    float C = com.google.android.recaptcha.internal.a.C(cropState.cropPx, measuredWidth, f9, max);
                    float f22 = cropState.cropScale;
                    f15 = (C * f22) + f10;
                    f16 = (cropState.cropPy * measuredHeight * f9 * max * f22) + f20;
                    f17 = cropState.cropRotate + i11;
                } else {
                    return;
                }
            } else {
                if (i10 == 0) {
                    f14 = this.M0 * 1.0f;
                } else {
                    f14 = 1.0f;
                }
                f15 = f10;
                f16 = f20;
                f17 = 0.0f;
            }
            float f23 = ((-this.f2234f2) / 2.0f) + f16;
            float f24 = f9 * f14;
            if (Float.isNaN(f24)) {
                f24 = 1.0f;
            }
            view.setScaleX(f24);
            view.setScaleY(f24);
            view.setTranslationX(f15);
            view.setTranslationY(f23);
            view.setRotation(f17);
            view.invalidate();
        }
        C0();
        invalidate();
    }

    @Override
    public final ag.h1 w() {
        return ag.h1.e(this.L1);
    }

    public final void w0(final boolean z10) {
        float f9;
        boolean z11;
        if (this.H1 != z10) {
            this.H1 = z10;
            o1.k kVar = this.I1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new ib.a(f9));
            this.I1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f19052i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            if (!this.f2230d2 && !this.f2228c2) {
                z11 = false;
            } else {
                z11 = true;
            }
            final boolean[] zArr = {z11};
            final float translationY = this.Y0.getTranslationY();
            final ViewGroup barView = getBarView();
            this.I1.b(new o1.h() {
                @Override
                public final void a(o1.i iVar, float f11, float f12) {
                    int i10;
                    g1 g1Var = g1.this;
                    b1 b1Var = g1Var.Y0;
                    float f13 = f11 / 1000.0f;
                    g1Var.J1 = f13;
                    float f14 = ((1.0f - f13) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f14);
                    view.setScaleY(f14);
                    view.setTranslationY((Math.min(g1Var.J1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(g1Var.J1, 0.25f) / 0.25f));
                    a1 a1Var = g1Var.C1;
                    float f15 = g1Var.J1;
                    boolean z12 = z10;
                    a1Var.y1(f15, z12);
                    g1Var.f2256x0.setProgress(g1Var.J1);
                    g1Var.f2254w0.setProgress(g1Var.J1);
                    g1Var.f2225b1.setTranslationY(AndroidUtilities.dp(32.0f) * g1Var.J1);
                    if (zArr[0]) {
                        float f16 = g1Var.J1;
                        if (!z12) {
                            f16 = 1.0f - f16;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f16;
                        if (z12) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        b1Var.setTranslationY(translationY - (dp * i10));
                    }
                    b1Var.invalidate();
                    if (view == g1Var.f2248q1) {
                        g1Var.Z0.invalidate();
                    }
                }
            });
            this.I1.a(new a0(this, z10, 1));
            this.I1.f();
            if (z10) {
                a1 a1Var = this.C1;
                a1Var.setVisibility(0);
                a1Var.setSelectedColorIndex(ag.h1.e(this.L1).d());
            }
        }
    }

    public final void x0(int i10) {
        boolean z10;
        int i11;
        n2 n2Var = this.f2248q1;
        if (i10 == 1) {
            fz fzVar = this.f2226b2;
            if (fzVar != null && fzVar.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            fz fzVar2 = this.f2226b2;
            if (fzVar2 != null && fzVar2.Y0 != UserConfig.selectedAccount) {
                removeView(fzVar2);
                this.f2226b2 = null;
            }
            if (this.f2226b2 == null) {
                fz fzVar3 = new fz(null, true, false, false, getContext(), false, null, null, true, this.M1, false, false);
                this.f2226b2 = fzVar3;
                fzVar3.Q0 = true;
                fzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f2226b2.setForseMultiwindowLayout(true);
                }
                this.f2226b2.setDelegate(new s0(this));
                addView(this.f2226b2);
            }
            this.f2226b2.setVisibility(0);
            this.f2228c2 = true;
            fz fzVar4 = this.f2226b2;
            if (this.f2236g2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f2236g2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f2236g2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f2238h2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f2238h2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f2238h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f2238h2;
            } else {
                i11 = this.f2236g2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fzVar4.getLayoutParams();
            layoutParams.height = i11;
            fzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                k kVar = this.O0;
                if (kVar instanceof f4) {
                    AndroidUtilities.hideKeyboard(((f4) kVar).getEditText());
                }
            }
            this.f2234f2 = i11;
            requestLayout();
            nh.w3 w3Var = ((ws0) this).f44369k2.G1;
            if (w3Var != null) {
                w3Var.a();
            }
            tg emojiButton = n2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(rg.d, true);
            }
            getHeight();
            if (!z10 && !this.f2230d2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f2234f2, 0.0f);
                ofFloat.addUpdateListener(new t(this, 1));
                ofFloat.addListener(new r0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        tg emojiButton2 = n2Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(rg.f32296e, true);
        }
        fz fzVar5 = this.f2226b2;
        if (fzVar5 != null) {
            this.f2228c2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                fzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f2234f2 = 0;
        }
        nh.w3 w3Var2 = ((ws0) this).f44369k2.G1;
        if (w3Var2 != null) {
            w3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    @Override
    public final boolean y(k kVar) {
        return r0(kVar, true);
    }

    public final void y0(Runnable runnable, g1 g1Var, int i10, int i11, int i12) {
        org.telegram.ui.ActionBar.o1 o1Var = this.N1;
        if (o1Var != null && o1Var.isShowing()) {
            this.N1.d(true);
            return;
        }
        if (this.O1 == null) {
            this.P1 = new Rect();
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(getContext(), this.M1);
            this.O1 = actionBarPopupWindow$ActionBarPopupWindowLayout;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(true);
            this.O1.setBackgroundColor(-14145495);
            this.O1.setOnTouchListener(new w(this, 0));
            this.O1.setDispatchKeyEventListener(new x(this));
            this.O1.setShownFromBottom(true);
        }
        this.O1.d();
        runnable.run();
        if (this.N1 == null) {
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(this.O1, -2, -2);
            this.N1 = o1Var2;
            o1Var2.f23710b = true;
            o1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.N1.setOutsideTouchable(true);
            this.N1.setClippingEnabled(true);
            this.N1.setInputMethodMode(2);
            this.N1.setSoftInputMode(0);
            this.N1.getContentView().setFocusableInTouchMode(true);
            this.N1.setOnDismissListener(new y(this, 0));
        }
        this.O1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.N1.setFocusable(true);
        this.N1.showAtLocation(g1Var, i10, i11 - (this.O1.getMeasuredWidth() / 2), i12 - this.O1.getMeasuredHeight());
        org.telegram.ui.ActionBar.o1.i(this.O1);
    }

    public final void z0(boolean z10) {
        float f9;
        if (this.A1 != z10) {
            this.A1 = z10;
            o1.k kVar = this.B1;
            if (kVar != null) {
                kVar.c();
            }
            float f10 = 1000.0f;
            if (z10) {
                f9 = 0.0f;
            } else {
                f9 = 1000.0f;
            }
            o1.k kVar2 = new o1.k(new ib.a(f9));
            this.B1 = kVar2;
            o1.l lVar = new o1.l();
            if (!z10) {
                f10 = 0.0f;
            }
            lVar.f19052i = f10;
            lVar.b(1250.0f);
            lVar.a(1.0f);
            kVar2.f19045u = lVar;
            if (z10) {
                t2 t2Var = this.f2249r1;
                t2Var.setAlpha(0.0f);
                t2Var.setVisibility(0);
            }
            this.B1.b(new z(0, this));
            this.B1.a(new a0(this, z10, 0));
            this.B1.f();
        }
    }

    @Override
    public final void B(boolean z10) {
    }

    @Override
    public final void C() {
    }

    @Override
    public final void g(boolean z10) {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h(boolean z10) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void m(boolean z10) {
    }

    @Override
    public final void x() {
    }
}
