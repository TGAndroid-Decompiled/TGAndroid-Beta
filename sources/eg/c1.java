package eg;

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
import k7.c6;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ht0;
import org.telegram.ui.oq0;
import org.telegram.ui.yh;
public abstract class c1 extends sv0 implements l2, h, g2, pv0, NotificationCenter.NotificationCenterDelegate {
    public final Bitmap A0;
    public float A1;
    public final Bitmap B0;
    public boolean B1;
    public final dg.h2 C0;
    public o1.j C1;
    public final DispatchQueue D0;
    public final x0 D1;
    public final MediaController.CropState E0;
    public final Paint E1;
    public float F0;
    public final Paint F1;
    public float G0;
    public final Paint G1;
    public float H0;
    public final dg.e2 H1;
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
    public final f0 N1;
    public kv0 O0;
    public org.telegram.ui.ActionBar.p1 O1;
    public j P0;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout P1;
    public boolean Q0;
    public Rect Q1;
    public int R0;
    public Runnable R1;
    public final boolean S0;
    public final dg.e1 S1;
    public final q0 T0;
    public boolean T1;
    public final s0 U0;
    public float U1;
    public final v0 V0;
    public boolean V1;
    public final u0 W0;
    public final z5 W1;
    public b11 X0;
    public final Paint X1;
    public final FrameLayout Y0;
    public final Paint Y1;
    public final y0 Z0;
    public qg.b Z1;
    public final w0 f5101a1;
    public final float[] a2;
    public final FrameLayout f5102b1;
    public final int[] f5103b2;
    public i0 f5104c1;
    public mz f5105c2;
    public int f5106d1;
    public boolean f5107d2;
    public int f5108e1;
    public boolean f5109e2;
    public float f5110f1;
    public boolean f5111f2;
    public ValueAnimator f5112g1;
    public int f5113g2;
    public boolean f5114h1;
    public int f5115h2;
    public final r2 f5116i1;
    public int f5117i2;
    public final y5.h f5118j1;
    public int f5119j2;
    public ArrayList f5120k1;
    public boolean f5121k2;
    public final int l1;
    public BigInteger f5122m1;
    public TextView f5123n1;
    public TextView f5124o1;
    public TextView f5125p1;
    public final m2 f5126q1;
    public final i2 f5127r1;
    public final o2 f5128s1;
    public final ImageView f5129t1;
    public final LinearLayout f5130u1;
    public final TextView f5131v1;
    public final TextView f5132w1;
    public final z1 f5133x0;
    public final TextView f5134x1;
    public final d2 f5135y0;
    public final Paint f5136y1;
    public float f5137z0;
    public final Paint f5138z1;

    public c1(Context context, Activity activity, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ArrayList arrayList, MediaController.CropState cropState, oq0 oq0Var, g6 g6Var) {
        super(context, activity);
        boolean z4;
        Emoji.EmojiSpan[] emojiSpanArr;
        t2 t2Var;
        ArrayList arrayList2 = arrayList;
        boolean z10 = false;
        this.f5106d1 = 0;
        this.f5108e1 = -1;
        final ht0 ht0Var = (ht0) this;
        this.f5118j1 = new y5.h(ht0Var, 12);
        byte b10 = 1;
        this.f5136y1 = new Paint(1);
        this.f5138z1 = new Paint(1);
        this.E1 = new Paint(1);
        this.F1 = new Paint(1);
        this.G1 = new Paint(1);
        dg.e2 e2Var = new dg.e2(1.0f, 0.016773745f, -1);
        this.H1 = e2Var;
        this.L1 = new Paint(1);
        this.V1 = false;
        this.W1 = new z5((View) this, 350L, pr.h);
        this.X1 = new Paint(1);
        Paint paint = new Paint(1);
        this.Y1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        new Matrix();
        this.a2 = new float[2];
        this.f5103b2 = new int[2];
        new androidx.activity.i(ht0Var, 17);
        setDelegate(this);
        this.M1 = i10;
        this.N1 = new f0(0, g6Var);
        this.E0 = cropState;
        this.S0 = context instanceof BubbleActivity;
        dg.e1 e6 = dg.e1.e(i10);
        this.S1 = e6;
        e6.i(0, true);
        e2Var.f4524a = e6.c();
        e2Var.f4526c = e6.f4520i;
        DispatchQueue dispatchQueue = new DispatchQueue("Paint");
        this.D0 = dispatchQueue;
        this.A0 = bitmap;
        this.B0 = bitmap2;
        this.l1 = i11;
        dg.h2 h2Var = new dg.h2();
        this.C0 = h2Var;
        h2Var.f4556a = new a1.c(ht0Var, 17);
        q0 q0Var = new q0(ht0Var, context, new dg.c1(getPaintingSize(), bitmap2, i11, null), bitmap, bitmap2);
        this.T0 = q0Var;
        q0Var.setDelegate(new r0(ht0Var, oq0Var));
        q0Var.setUndoStore(h2Var);
        q0Var.setQueue(dispatchQueue);
        q0Var.setVisibility(4);
        addView(q0Var, c6.e(-1, -1, 51));
        s0 s0Var = new s0(ht0Var, context);
        this.U0 = s0Var;
        s0Var.setVisibility(4);
        addView(s0Var, c6.e(-1, -1, 51));
        u0 u0Var = new u0(ht0Var, context, new t0(ht0Var));
        this.W0 = u0Var;
        addView(u0Var);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList2.get(i12);
                byte b11 = mediaEntity.type;
                if (b11 == 0) {
                    ?? i02 = i0(mediaEntity.parentObject, mediaEntity.document, z10);
                    if ((mediaEntity.subType & 2) != 0) {
                        i02.r(z10);
                    }
                    ViewGroup.LayoutParams layoutParams = i02.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    t2Var = i02;
                } else if (b11 == b10) {
                    ?? j02 = j0(z10);
                    j02.setType(mediaEntity.subType);
                    j02.setTypeface(mediaEntity.textTypeface);
                    j02.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList3 = mediaEntity.entities;
                    int size2 = arrayList3.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList3.get(i13);
                        u5 u5Var = new u5(emojiEntity.document_id, j02.getFontMetricsInt());
                        int i14 = emojiEntity.offset;
                        spannableString.setSpan(u5Var, i14, emojiEntity.length + i14, 33);
                        size2 = size2;
                    }
                    CharSequence replaceEmoji = Emoji.replaceEmoji(spannableString, j02.getFontMetricsInt(), false);
                    if ((replaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) replaceEmoji).getSpans(0, replaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    j02.setText(replaceEmoji);
                    u0(j02, mediaEntity.textAlign);
                    dg.e2 swatch = j02.getSwatch();
                    swatch.f4524a = mediaEntity.color;
                    j02.setSwatch(swatch);
                    t2Var = j02;
                } else if (b11 == 2) {
                    t2 h02 = h0(mediaEntity.text, false);
                    h02.f5493y0 = false;
                    if ((mediaEntity.subType & 2) != 0) {
                        h02.r(false);
                    }
                    if ((mediaEntity.subType & 16) != 0) {
                        h02.t(false);
                    }
                    ViewGroup.LayoutParams layoutParams2 = h02.getLayoutParams();
                    layoutParams2.width = mediaEntity.viewWidth;
                    layoutParams2.height = mediaEntity.viewHeight;
                    t2Var = h02;
                } else {
                    i12++;
                    arrayList2 = arrayList;
                    z10 = false;
                    b10 = 1;
                }
                t2Var.setX((mediaEntity.f18079x * this.O0.f28463a) - (((1.0f - mediaEntity.scale) * mediaEntity.viewWidth) / 2.0f));
                t2Var.setY((mediaEntity.f18080y * this.O0.f28464b) - (((1.0f - mediaEntity.scale) * mediaEntity.viewHeight) / 2.0f));
                t2Var.setPosition(new PointF((mediaEntity.viewWidth / 2.0f) + t2Var.getX(), (mediaEntity.viewHeight / 2.0f) + t2Var.getY()));
                t2Var.setScale(mediaEntity.scale);
                t2Var.setRotation((float) (((-mediaEntity.rotation) / 3.141592653589793d) * 180.0d));
                i12++;
                arrayList2 = arrayList;
                z10 = false;
                b10 = 1;
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
        addView(frameLayout2, c6.e(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.f5129t1 = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        imageView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        imageView.setBackground(k6.f0(1090519039, 1, -1));
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.f5126q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        ht0Var2.C0.c();
                        return;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.f5126q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.f5107d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        return;
                    default:
                        ht0Var.r0(null, true);
                        return;
                }
            }
        });
        imageView.setAlpha(0.6f);
        imageView.setClickable(false);
        frameLayout2.addView(imageView, c6.d(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f5130u1 = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(k6.f0(822083583, 7, -1));
        linearLayout.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        org.telegram.ui.b.g(16.0f, 1, textView);
        textView.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.photo_zoomout);
        linearLayout.addView(imageView2, c6.t(24, 24, 16, 0, 0, 8, 0));
        linearLayout.addView(textView, c6.q(-2, -2, 16));
        linearLayout.setAlpha(0.0f);
        linearLayout.setOnClickListener(new m(0));
        frameLayout2.addView(linearLayout, c6.e(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.f5131v1 = textView2;
        textView2.setBackground(k6.f0(822083583, 7, -1));
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
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.f5126q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        ht0Var2.C0.c();
                        return;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.f5126q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.f5107d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        return;
                    default:
                        ht0Var.r0(null, true);
                        return;
                }
            }
        });
        textView2.setAlpha(0.6f);
        TextView h = yh.h(frameLayout2, textView2, c6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f), context);
        this.f5132w1 = h;
        h.setBackground(k6.f0(822083583, 7, -1));
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
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.f5126q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        ht0Var2.C0.c();
                        return;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.f5126q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.f5107d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        return;
                    default:
                        ht0Var.r0(null, true);
                        return;
                }
            }
        });
        h.setAlpha(0.0f);
        h.setVisibility(8);
        TextView h9 = yh.h(frameLayout2, h, c6.d(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f), context);
        this.f5134x1 = h9;
        h9.setBackground(k6.f0(822083583, 7, -1));
        h9.setPadding(org.telegram.ui.b.e(8.0f, R.string.Done, h9), 0, AndroidUtilities.dp(8.0f), 0);
        h9.setGravity(16);
        h9.setTextColor(-1);
        h9.setTypeface(AndroidUtilities.bold());
        h9.setTextSize(1, 16.0f);
        h9.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        ht0 ht0Var2 = ht0Var;
                        q0 q0Var2 = ht0Var2.T0;
                        if (q0Var2 != null && (q0Var2.getCurrentBrush() instanceof dg.l)) {
                            q0Var2.b();
                            ht0Var2.f5126q1.setSelectedIndex(1);
                            ht0Var2.g((dg.m) dg.m.f4581a.get(0));
                            return;
                        }
                        ht0Var2.C0.c();
                        return;
                    case 1:
                        ht0 ht0Var3 = ht0Var;
                        q0 q0Var3 = ht0Var3.T0;
                        dg.h2 h2Var2 = ht0Var3.C0;
                        if (h2Var2.a()) {
                            if (q0Var3 != null && (q0Var3.getCurrentBrush() instanceof dg.l)) {
                                q0Var3.b();
                                ht0Var3.f5126q1.setSelectedIndex(1);
                                ht0Var3.g((dg.m) dg.m.f4581a.get(0));
                            }
                            q0Var3.a();
                            h2Var2.f4558c.clear();
                            h2Var2.f4557b.clear();
                            AndroidUtilities.runOnUIThread(new ag.e(h2Var2, 20));
                            ht0Var3.W0.removeAllViews();
                            return;
                        }
                        return;
                    case 2:
                        ht0 ht0Var4 = ht0Var;
                        j jVar = ht0Var4.P0;
                        if (jVar instanceof z3) {
                            AndroidUtilities.hideKeyboard(((z3) jVar).getFocusedView());
                        }
                        if (ht0Var4.f5107d2) {
                            ht0Var4.l0(false);
                        }
                        ht0Var4.q0(ht0Var4.P0);
                        ht0Var4.r0(null, true);
                        return;
                    default:
                        ht0Var.r0(null, true);
                        return;
                }
            }
        });
        h9.setAlpha(0.0f);
        h9.setVisibility(8);
        frameLayout2.addView(h9, c6.d(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        y0 y0Var = new y0(ht0Var, context);
        this.Z0 = y0Var;
        y0Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        y0Var.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(y0Var, c6.e(-1, 104, 80));
        if (bitmap2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        m2 m2Var = new m2(context, z4);
        this.f5126q1 = m2Var;
        m2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        m2Var.setDelegate(this);
        m2Var.setSelectedIndex(1);
        y0Var.addView(m2Var, c6.c(48.0f, -1));
        i2 i2Var = new i2(context);
        this.f5127r1 = i2Var;
        i2Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        i2Var.setVisibility(8);
        i2Var.setDelegate(this);
        i2Var.setAlignment(dg.e1.e(i10).f4519g);
        y0Var.addView(i2Var, c6.c(48.0f, -1));
        w0 w0Var = new w0(ht0Var, context);
        this.f5101a1 = w0Var;
        addView(w0Var, c6.c(-1.0f, -1));
        o2 o2Var = new o2(context);
        this.f5128s1 = o2Var;
        o2Var.setVisibility(8);
        o2Var.setOnItemClickListener(new ag.h(ht0Var, 1));
        i2Var.setTypefaceListView(o2Var);
        w0Var.addView(o2Var, c6.d(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.f5136y1;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.f5136y1.setColor(1728053247);
        this.f5136y1.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.f5138z1.setColor(k6.v0(k6.G8, this.N1));
        x0 x0Var = new x0(ht0Var, context);
        this.D1 = x0Var;
        x0Var.setVisibility(8);
        x0Var.setColorPalette(dg.e1.e(i10));
        x0Var.setColorListener(new n(ht0Var, 0));
        y0Var.addView(x0Var, c6.d(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        z1 z1Var = new z1(context);
        this.f5133x0 = z1Var;
        z1Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        z1Var.setBackground(k6.f0(1090519039, 1, -1));
        y0Var.addView(z1Var, c6.d(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        d2 d2Var = new d2(context);
        this.f5135y0 = d2Var;
        d2Var.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        d2Var.setBackground(k6.f0(1090519039, 1, -1));
        d2Var.setOnClickListener(new o(ht0Var, context, bitmap2, 0));
        y0Var.addView(d2Var, c6.d(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        r2 r2Var = new r2(context);
        this.f5116i1 = r2Var;
        r2Var.setColorSwatch(this.H1);
        r2Var.setRenderView(this.T0);
        r2Var.setValueOverride(this.f5118j1);
        this.H1.f4526c = this.f5118j1.get();
        r2Var.setOnUpdate(new af.b(ht0Var, i10, 3));
        addView(r2Var, c6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f5102b1 = frameLayout3;
        addView(frameLayout3, c6.c(-1.0f, -1));
        this.G1.setStyle(style);
        this.G1.setStrokeWidth(AndroidUtilities.dp(2.0f));
        s0(this.H1, null);
        g((dg.m) dg.m.f4581a.get(0));
        e();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (AndroidUtilities.displaySize.y * 0.65d))));
        }
    }

    public static void Z(ht0 ht0Var, Integer num) {
        ht0Var.setNewColor(num.intValue());
        ht0Var.w0(false);
    }

    public static void a0(eg.c1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: eg.c1.a0(eg.c1):void");
    }

    public static void b0(c1 c1Var) {
        p3 p3Var;
        u0 u0Var = c1Var.W0;
        j jVar = c1Var.P0;
        if (jVar != null) {
            PointF A0 = c1Var.A0(jVar);
            j jVar2 = c1Var.P0;
            if (jVar2 instanceof p3) {
                p3 p3Var2 = new p3(c1Var.getContext(), (p3) c1Var.P0, A0);
                p3Var2.setDelegate(c1Var);
                u0Var.addView(p3Var2);
                p3Var = p3Var2;
            } else if (jVar2 instanceof z3) {
                z3 z3Var = new z3(c1Var.getContext(), (z3) c1Var.P0, A0);
                z3Var.setDelegate(c1Var);
                z3Var.setMaxWidth((int) (c1Var.getPaintingSize().f28463a - 20.0f));
                u0Var.addView(z3Var, c6.c(-2.0f, -2));
                p3Var = z3Var;
            } else {
                p3Var = null;
            }
            c1Var.p0(p3Var);
            c1Var.r0(p3Var, true);
        }
        org.telegram.ui.ActionBar.p1 p1Var = c1Var.O1;
        if (p1Var != null && p1Var.isShowing()) {
            c1Var.O1.d(true);
        }
    }

    public static void c0(ht0 ht0Var, Integer num) {
        dg.e1 e1Var = ht0Var.S1;
        e1Var.h(num.intValue(), true);
        e1Var.g();
        ht0Var.setNewColor(num.intValue());
        x0 x0Var = ht0Var.D1;
        x0Var.setSelectedColorIndex(e1Var.d());
        x0Var.getAdapter().l();
    }

    public ViewGroup getBarView() {
        if (this.f5106d1 == 2) {
            return this.f5127r1;
        }
        return this.f5126q1;
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

    private kv0 getPaintingSize() {
        int i10;
        kv0 kv0Var = this.O0;
        if (kv0Var != null) {
            return kv0Var;
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
        kv0 kv0Var2 = new kv0(width, height);
        float f10 = i10;
        kv0Var2.f28463a = f10;
        float floor = (float) Math.floor((f10 * height) / width);
        kv0Var2.f28464b = floor;
        if (floor > f10) {
            kv0Var2.f28464b = f10;
            kv0Var2.f28463a = (float) Math.floor((f10 * width) / height);
        }
        this.O0 = kv0Var2;
        return kv0Var2;
    }

    public void setNewColor(int i10) {
        dg.e2 e2Var = this.H1;
        int i11 = e2Var.f4524a;
        e2Var.f4524a = i10;
        s0(e2Var, null);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new e0(this, i11, i10, 0));
        duration.start();
    }

    private void setTextType(int i10) {
        this.R0 = i10;
        j jVar = this.P0;
        if (jVar instanceof z3) {
            ((z3) jVar).setType(i10);
        }
        dg.e1 e6 = dg.e1.e(this.M1);
        e6.h = i10;
        e6.f4514a.edit().putInt("text_type", i10).apply();
        this.f5127r1.setOutlineType(i10);
    }

    private void setupTabsLayout(Context context) {
        i0 i0Var = new i0(this, context);
        this.f5104c1 = i0Var;
        i0Var.setClipToPadding(false);
        this.f5104c1.setOrientation(0);
        this.Z0.addView(this.f5104c1, c6.d(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f5123n1 = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.f5123n1;
        int i10 = k6.f21750i6;
        f0 f0Var = this.N1;
        textView2.setBackground(k6.f0(k6.v0(i10, f0Var), 7, -1));
        this.f5123n1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5123n1.setTextColor(-1);
        this.f5123n1.setTextSize(1, 14.0f);
        this.f5123n1.setGravity(1);
        this.f5123n1.setTypeface(AndroidUtilities.bold());
        this.f5123n1.setSingleLine();
        this.f5123n1.setOnClickListener(new k(this, 0));
        this.f5104c1.addView(this.f5123n1, c6.l(1.0f, 0, -2));
        TextView textView3 = new TextView(context);
        this.f5124o1 = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.f5124o1.setBackground(k6.f0(k6.v0(i10, f0Var), 7, -1));
        this.f5124o1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5124o1.setOnClickListener(new k(this, 1));
        this.f5124o1.setTextColor(-1);
        this.f5124o1.setTextSize(1, 14.0f);
        this.f5124o1.setGravity(1);
        this.f5124o1.setTypeface(AndroidUtilities.bold());
        this.f5124o1.setAlpha(0.6f);
        this.f5124o1.setSingleLine();
        this.f5104c1.addView(this.f5124o1, c6.l(1.0f, 0, -2));
        TextView textView4 = new TextView(context);
        this.f5125p1 = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.f5125p1.setBackground(k6.f0(k6.v0(i10, f0Var), 7, -1));
        this.f5125p1.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.f5125p1.setTextColor(-1);
        this.f5125p1.setTextSize(1, 14.0f);
        this.f5125p1.setGravity(1);
        this.f5125p1.setTypeface(AndroidUtilities.bold());
        this.f5125p1.setAlpha(0.6f);
        this.f5125p1.setSingleLine();
        this.f5125p1.setOnClickListener(new k(this, 4));
        this.f5104c1.addView(this.f5125p1, c6.l(1.0f, 0, -2));
    }

    public static void u0(z3 z3Var, int i10) {
        int i11;
        z3Var.setAlign(i10);
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
        z3Var.getEditText().setGravity(i11);
        if (i10 != 1) {
            if (i10 == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
                i12 = 3;
            }
        } else {
            i12 = 4;
        }
        z3Var.getEditText().setTextAlignment(i12);
    }

    @Override
    public final void A() {
        y0(new p(this, 4), this, 53, 0, getHeight());
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
                u0 u0Var = this.W0;
                if (i10 >= u0Var.getChildCount()) {
                    break;
                }
                View childAt = u0Var.getChildAt(i10);
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
        if (this.f5106d1 != i10 && this.f5108e1 != i10) {
            ValueAnimator valueAnimator = this.f5112g1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i11 = this.f5106d1;
            ViewGroup viewGroup3 = this.f5127r1;
            ViewGroup viewGroup4 = this.f5126q1;
            if (i11 == 0) {
                viewGroup = viewGroup4;
            } else if (i11 == 2) {
                viewGroup = viewGroup3;
            } else {
                viewGroup = null;
            }
            this.f5108e1 = i10;
            if (i10 == 0) {
                viewGroup2 = viewGroup4;
            } else if (i10 == 2) {
                viewGroup2 = viewGroup3;
            } else {
                viewGroup2 = null;
            }
            int i12 = this.M1;
            dg.e1 e6 = dg.e1.e(i12);
            if (i10 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (e6.f4523l != z4) {
                e6.f4523l = z4;
                if (z4) {
                    e6.i(-1, false);
                } else {
                    e6.i(e6.f4514a.getInt("brush", 0), false);
                }
            }
            int c3 = dg.e1.e(i12).c();
            dg.e2 e2Var = this.H1;
            e2Var.f4524a = c3;
            s0(e2Var, null);
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
            this.f5112g1 = duration;
            duration.setInterpolator(pr.f30183f);
            this.f5112g1.addUpdateListener(new q(this, viewGroup, viewGroup2, 0));
            this.f5112g1.addListener(new j0(this, viewGroup, viewGroup2, i10, 0));
            this.f5112g1.start();
        }
    }

    public final void C0() {
        int i10 = 0;
        while (true) {
            u0 u0Var = this.W0;
            if (i10 < u0Var.getChildCount()) {
                View childAt = u0Var.getChildAt(i10);
                if (childAt != this.P0) {
                    if (childAt instanceof j) {
                        j jVar = (j) childAt;
                        if (!jVar.f5281i0 && jVar.f5279g0 <= 0.0f) {
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
        if (i10 > AndroidUtilities.dp(50.0f) && this.f5109e2 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z4) {
                this.f5117i2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.f5117i2).commit();
            } else {
                this.f5115h2 = i10;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.f5115h2).commit();
            }
        }
        if (this.f5107d2) {
            if (z4) {
                i11 = this.f5117i2;
            } else {
                i11 = this.f5115h2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5105c2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = AndroidUtilities.displaySize.x;
            if (i12 != i13 || layoutParams.height != i11) {
                layoutParams.width = i13;
                layoutParams.height = i11;
                this.f5105c2.setLayoutParams(layoutParams);
                this.f5113g2 = layoutParams.height;
                requestLayout();
                qh.i3 i3Var = ((ht0) this).f37617l2.H1;
                if (i3Var != null) {
                    i3Var.a();
                }
                getHeight();
            }
        }
        if (this.f5119j2 == i10 && this.f5121k2 == z4) {
            getHeight();
            return;
        }
        this.f5119j2 = i10;
        this.f5121k2 = z4;
        boolean z12 = this.f5109e2;
        j jVar = this.P0;
        if (jVar instanceof z3) {
            if (((z3) jVar).getEditText().isFocused() && i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f5109e2 = z11;
        } else {
            this.f5109e2 = false;
        }
        if (this.f5109e2 && this.f5107d2) {
            x0(0);
        }
        if (this.f5113g2 != 0 && !(z10 = this.f5109e2) && z10 != z12 && !this.f5107d2) {
            this.f5113g2 = 0;
            requestLayout();
            qh.i3 i3Var2 = ((ht0) this).f37617l2.H1;
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
    public final int[] b(j jVar) {
        return k0(jVar);
    }

    @Override
    public final void d() {
        setTextType((this.R0 + 1) % 4);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u0 u0Var;
        z3 z3Var;
        String str;
        if (i10 == NotificationCenter.customTypefacesLoaded && (u0Var = this.W0) != null) {
            for (int i12 = 0; i12 < u0Var.getChildCount(); i12++) {
                View childAt = u0Var.getChildAt(i12);
                if ((childAt instanceof z3) && (str = (z3Var = (z3) childAt).f5609x0) != null) {
                    z3Var.setTypeface(str);
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
        throw new UnsupportedOperationException("Method not decompiled: eg.c1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public final void e() {
        this.L1.setColor(-15132391);
    }

    @Override
    public final void f(int i10) {
        j jVar = this.P0;
        if (jVar instanceof z3) {
            u0((z3) jVar, i10);
            dg.e1 e6 = dg.e1.e(this.M1);
            e6.f4519g = i10;
            e6.f4514a.edit().putInt("text_alignment", i10).apply();
        }
    }

    public final void f0(View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new a1.e(21, this, (t2) view)).start();
    }

    @Override
    public final void g(dg.m mVar) {
        boolean z4 = mVar instanceof dg.b;
        r2 r2Var = this.f5116i1;
        if (!z4 && !(mVar instanceof dg.d)) {
            r2Var.b(0.05f, 1.0f);
        } else {
            r2Var.b(0.4f, 1.75f);
        }
        r2Var.setDrawCenter(!(mVar instanceof dg.l));
        q0 q0Var = this.T0;
        if (q0Var.getCurrentBrush() instanceof dg.l) {
            this.f5114h1 = true;
        }
        q0Var.setBrush(mVar);
        dg.e2 e2Var = this.H1;
        int i10 = e2Var.f4524a;
        e2Var.f4524a = dg.e1.e(this.M1).c();
        e2Var.f4526c = this.f5118j1.get();
        s0(e2Var, Integer.valueOf(i10));
        this.U0.invalidate();
    }

    public final PointF g0() {
        MediaController.CropState cropState;
        kv0 paintingSize = getPaintingSize();
        float f10 = paintingSize.f28463a / 2.0f;
        float f11 = paintingSize.f28464b / 2.0f;
        if (this.E0 != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float cos = (float) ((Math.cos(radians) * cropState.cropPx) - (Math.sin(radians) * cropState.cropPy));
            float a2 = (float) l.d.a(radians, cropState.cropPy, Math.sin(radians) * cropState.cropPx);
            f10 -= cos * paintingSize.f28463a;
            f11 -= a2 * paintingSize.f28464b;
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
        return this.f5133x0;
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
        return this.f5135y0;
    }

    public long getLcm() {
        return this.f5122m1.longValue();
    }

    public List<TLRPC.InputDocument> getMasks() {
        u5[] u5VarArr;
        u0 u0Var = this.W0;
        int childCount = u0Var.getChildCount();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = u0Var.getChildAt(i10);
            if (childAt instanceof p3) {
                TLRPC.Document sticker = ((p3) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.f20855id = sticker.f20849id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof z3) {
                CharSequence text = ((z3) childAt).getText();
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
                                tL_inputDocument2.f20855id = document.f20849id;
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
        return this.f5137z0;
    }

    public int getPKeyboardHeight() {
        return 0;
    }

    public dg.o1 getRenderView() {
        return this.T0;
    }

    public float getSelectedEntityBottom() {
        j jVar = this.P0;
        u0 u0Var = this.W0;
        if (jVar == null) {
            return getY() + u0Var.getMeasuredHeight();
        }
        int[] iArr = new int[2];
        jVar.getLocationInWindow(iArr);
        return (u0Var.getScaleY() * this.P0.getHeight()) + iArr[1];
    }

    public b11 getThanosEffect() {
        if (!b11.c()) {
            return null;
        }
        if (this.X0 == null) {
            b11 b11Var = new b11(getContext(), new p(this, 0));
            this.X0 = b11Var;
            addView(b11Var);
        }
        return this.X0;
    }

    public final t2 h0(String str, boolean z4) {
        float f10;
        kv0 kv0Var;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f10 = options.outWidth / options.outHeight;
        } catch (Exception e6) {
            FileLog.e(e6);
            f10 = 1.0f;
        }
        u0 u0Var = this.W0;
        if (f10 > 1.0f) {
            float floor = (float) Math.floor(u0Var.getMeasuredWidth() * 0.5d);
            kv0Var = new kv0(floor, floor / f10);
        } else {
            float floor2 = (float) Math.floor(u0Var.getMeasuredHeight() * 0.5d);
            kv0Var = new kv0(f10 * floor2, floor2);
        }
        kv0 kv0Var2 = kv0Var;
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f11 = kv0Var2.f28463a;
            kv0Var2.f28463a = kv0Var2.f28464b;
            kv0Var2.f28464b = f11;
        }
        Context context = getContext();
        PointF g02 = g0();
        int intValue = ((Integer) imageOrientation.first).intValue();
        ((Integer) imageOrientation.second).getClass();
        t2 t2Var = new t2(context, g02, kv0Var2, str, intValue);
        t2Var.setDelegate(this);
        u0Var.addView(t2Var);
        if (z4) {
            p0(t2Var);
            r0(t2Var, true);
        }
        return t2Var;
    }

    public final eg.n0 i0(java.lang.Object r24, org.telegram.tgnet.TLRPC.Document r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: eg.c1.i0(java.lang.Object, org.telegram.tgnet.TLRPC$Document, boolean):eg.n0");
    }

    public final z3 j0(boolean z4) {
        ((ht0) this).f37617l2.f34248d0.isFocusable();
        kv0 paintingSize = getPaintingSize();
        PointF A0 = A0(null);
        z3 z3Var = new z3(getContext(), A0, (int) (paintingSize.f28463a / 9.0f), "", this.H1, this.R0);
        float f10 = paintingSize.f28463a / 9.0f;
        p pVar = new p(this, 2);
        z3Var.f5605t0 = (int) (0.5f * f10);
        z3Var.f5606u0 = (int) (f10 * 2.0f);
        z3Var.f5607v0 = pVar;
        float f11 = A0.x;
        u0 u0Var = this.W0;
        if (f11 == u0Var.getMeasuredWidth() / 2.0f) {
            z3Var.setStickyX(2);
        }
        if (A0.y == u0Var.getMeasuredHeight() / 2.0f) {
            z3Var.setStickyY(2);
        }
        z3Var.setDelegate(this);
        z3Var.setMaxWidth((int) (paintingSize.f28463a - 20.0f));
        int i10 = this.M1;
        z3Var.setTypeface(dg.e1.e(i10).f4521j);
        z3Var.setType(dg.e1.e(i10).h);
        u0Var.addView(z3Var, c6.c(-2.0f, -2));
        MediaController.CropState cropState = this.E0;
        if (cropState != null) {
            z3Var.j(1.0f / cropState.cropScale);
            z3Var.f(-(cropState.transformRotation + cropState.cropRotate));
        }
        if (z4) {
            p0(z3Var);
            z3Var.q();
            r0(z3Var, false);
            z3Var.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(z3Var.getFocusedView());
            this.Q0 = true;
            int i11 = dg.e1.e(i10).f4519g;
            i2 i2Var = this.f5127r1;
            i2Var.d(i11, true);
            i2Var.setOutlineType(dg.e1.e(i10).h);
        }
        return z3Var;
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
        int[] iArr = this.f5103b2;
        iArr[0] = round;
        int round2 = Math.round(fArr[1]);
        iArr[1] = round2;
        Point point = AndroidUtilities.displaySize;
        float f10 = round2 - (point.y / 2.0f);
        double d = iArr[0] - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.W0.getRotation());
        double d10 = f10;
        iArr[0] = (AndroidUtilities.displaySize.x / 2) + ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        iArr[1] = (AndroidUtilities.displaySize.y / 2) + ((int) l.d.a(radians, d10, Math.sin(radians) * d));
        return iArr;
    }

    public final void l0(boolean z4) {
        if (this.f5107d2) {
            x0(0);
        }
        if (z4) {
            mz mzVar = this.f5105c2;
            if (mzVar != null && mzVar.getVisibility() == 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f5105c2.getMeasuredHeight());
                ofFloat.addUpdateListener(new r(this, 0));
                this.f5111f2 = true;
                ofFloat.addListener(new o0(this, 1));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.f22249w);
                ofFloat.start();
                return;
            }
            m0();
        }
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.P0 != null) {
            r0(null, true);
        }
        float x10 = motionEvent.getX();
        q0 q0Var = this.T0;
        float translationX = ((x10 - q0Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / q0Var.getScaleX();
        float y10 = ((((motionEvent.getY() - q0Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / q0Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-q0Var.getRotation());
        double d10 = y10;
        float measuredWidth = (q0Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (q0Var.getMeasuredHeight() / 2.0f) + ((float) l.d.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        q0Var.e(obtain);
        obtain.recycle();
        return true;
    }

    public final void m0() {
        mz mzVar;
        qh.i3 i3Var;
        if (this.f5113g2 > 0 && (i3Var = ((ht0) this).f37617l2.H1) != null) {
            i3Var.a();
        }
        if (!this.f5107d2 && (mzVar = this.f5105c2) != null && mzVar.getVisibility() != 8) {
            this.f5105c2.setVisibility(8);
        }
        this.f5113g2 = 0;
    }

    public final void n0(boolean z4) {
        int i10;
        int i11;
        if (this.f5106d1 == 0) {
            int i12 = 0;
            if (z4) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.f5116i1.setLayerType(i10, null);
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
        } else if (this.f5107d2) {
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
        if (this.f5105c2 != null) {
            if (AndroidUtilities.isTablet()) {
                R = i15 - this.f5105c2.getMeasuredHeight();
            } else {
                R = (R() + i15) - this.f5105c2.getMeasuredHeight();
            }
            mz mzVar = this.f5105c2;
            mzVar.layout(0, R, mzVar.getMeasuredWidth(), this.f5105c2.getMeasuredHeight() + R);
        }
        if (!this.S0) {
            i16 = AndroidUtilities.statusBarHeight;
        }
        q0 q0Var = this.T0;
        int ceil = (int) Math.ceil((i14 - q0Var.getMeasuredWidth()) / 2.0f);
        int additionalTop = ((getAdditionalTop() - getAdditionalBottom()) / 2) + org.telegram.messenger.y3.C(8.0f, (((i15 - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i16)) - AndroidUtilities.dp(48.0f)) - q0Var.getMeasuredHeight()) / 2, i16);
        q0Var.layout(ceil, additionalTop, q0Var.getMeasuredWidth() + ceil, q0Var.getMeasuredHeight() + additionalTop);
        s0 s0Var = this.U0;
        s0Var.layout(ceil, additionalTop, s0Var.getMeasuredWidth() + ceil, s0Var.getMeasuredHeight() + additionalTop);
        int measuredWidth = q0Var.getMeasuredWidth();
        u0 u0Var = this.W0;
        int measuredWidth2 = ((measuredWidth - u0Var.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((q0Var.getMeasuredHeight() - u0Var.getMeasuredHeight()) / 2) + additionalTop;
        u0Var.layout(measuredWidth2, measuredHeight, u0Var.getMeasuredWidth() + measuredWidth2, u0Var.getMeasuredHeight() + measuredHeight);
        b11 b11Var = this.X0;
        if (b11Var != null) {
            b11Var.layout(measuredWidth2, measuredHeight, u0Var.getMeasuredWidth() + measuredWidth2, u0Var.getMeasuredHeight() + measuredHeight);
        }
        v0 v0Var = this.V0;
        v0Var.layout(ceil, additionalTop, v0Var.getMeasuredWidth() + ceil, v0Var.getMeasuredHeight() + additionalTop);
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
        float f13 = f11 / this.O0.f28463a;
        this.N0 = f13;
        u0 u0Var = this.W0;
        u0Var.setScaleX(f13);
        u0Var.setScaleY(this.N0);
        u0Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.O0.f28463a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.O0.f28464b, 1073741824));
        b11 b11Var = this.X0;
        if (b11Var != null) {
            b11Var.measure(View.MeasureSpec.makeMeasureSpec((int) this.O0.f28463a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.O0.f28464b, 1073741824));
            this.X0.setScaleX(this.N0);
            this.X0.setScaleY(this.N0);
        }
        C0();
        this.V0.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
        measureChild(this.Z0, i10, i11);
        measureChild(this.f5116i1, i10, i11);
        measureChild(this.f5102b1, i10, i11);
        measureChild(this.f5101a1, i10, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.f5113g2), 1073741824));
        FrameLayout frameLayout = this.Y0;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
        measureChild(frameLayout, i10, i11);
        this.M0 = false;
        if (AndroidUtilities.dp(20.0f) >= 0 && !this.f5107d2 && !this.f5111f2) {
            this.M0 = true;
            m0();
            this.M0 = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            m0();
        }
        mz mzVar = this.f5105c2;
        if (mzVar != null) {
            measureChild(mzVar, i10, i11);
        }
    }

    public final void p0(j jVar) {
        if (jVar == null) {
            return;
        }
        this.C0.b(jVar.getUUID(), new a0(this, jVar, 0));
    }

    @Override
    public final boolean q() {
        return true;
    }

    public final void q0(j jVar) {
        j jVar2 = this.P0;
        if (jVar == jVar2 && jVar2 != null) {
            jVar2.l(jVar2.f5282j0, false);
            this.P0 = null;
            if (jVar instanceof z3) {
                ValueAnimator valueAnimator = this.f5112g1;
                if (valueAnimator != null && this.f5108e1 != 0) {
                    valueAnimator.cancel();
                }
                B0(0);
            }
        }
        this.W0.removeView(jVar);
        if (jVar != null) {
            UUID uuid = jVar.getUUID();
            dg.h2 h2Var = this.C0;
            h2Var.f4557b.remove(uuid);
            h2Var.f4558c.remove(uuid);
            AndroidUtilities.runOnUIThread(new ag.e(h2Var, 20));
        }
        r2 r2Var = this.f5116i1;
        y5.h hVar = this.f5118j1;
        r2Var.setValueOverride(hVar);
        r2Var.setShowPreview(true);
        float f10 = hVar.get();
        dg.e2 e2Var = this.H1;
        e2Var.f4526c = f10;
        s0(e2Var, null);
    }

    @Override
    public final boolean r() {
        return !this.Q0;
    }

    public final boolean r0(j jVar, boolean z4) {
        c1 c1Var;
        boolean z10;
        int i10;
        boolean z11 = jVar instanceof z3;
        int i11 = 2;
        if (z11 && (((i10 = this.f5108e1) == -1 && this.f5106d1 != 2) || (i10 != -1 && i10 != 2))) {
            ValueAnimator valueAnimator = this.f5112g1;
            if (valueAnimator != null && i10 != 2) {
                valueAnimator.cancel();
            }
            if (this.I1) {
                w0(false);
            }
            B0(2);
        }
        if (z11 && z4) {
            z3 z3Var = (z3) jVar;
            int gravity = z3Var.getEditText().getGravity();
            if (gravity != 17) {
                if (gravity != 21) {
                    i11 = 0;
                }
            } else {
                i11 = 1;
            }
            i2 i2Var = this.f5127r1;
            i2Var.setAlignment(i11);
            i2Var.setTypeface(z3Var.getTypeface().f4665a);
            i2Var.e(z3Var.getType(), true);
            this.f5101a1.invalidate();
        }
        j jVar2 = this.P0;
        if (jVar2 != null) {
            if (jVar2 == jVar) {
                if (!this.Q0) {
                    int[] k02 = k0(jVar2);
                    y0(new a0(this, jVar2, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
                    return true;
                }
                if (jVar2 instanceof z3) {
                    AndroidUtilities.showKeyboard(((z3) jVar2).getFocusedView());
                    l0(false);
                }
                return true;
            }
            c1Var = this;
            jVar2.l(jVar2.f5282j0, false);
            j jVar3 = c1Var.P0;
            if (jVar3 instanceof z3) {
                z3 z3Var2 = (z3) jVar3;
                x3 x3Var = z3Var2.f5599n0;
                x3Var.clearFocus();
                x3Var.setEnabled(false);
                x3Var.setClickable(false);
                z3Var2.m();
                if (!z11) {
                    c1Var.Q0 = false;
                    AndroidUtilities.hideKeyboard(((z3) c1Var.P0).getFocusedView());
                    l0(false);
                }
            }
            z10 = true;
        } else {
            c1Var = this;
            z10 = false;
        }
        j jVar4 = c1Var.P0;
        c1Var.P0 = jVar;
        if ((jVar4 instanceof z3) && TextUtils.isEmpty(((z3) jVar4).getText())) {
            q0(jVar4);
        }
        j jVar5 = c1Var.P0;
        y5.h hVar = c1Var.f5118j1;
        dg.e2 e2Var = c1Var.H1;
        r2 r2Var = c1Var.f5116i1;
        if (jVar5 != null) {
            v0 v0Var = c1Var.V0;
            jVar5.f5282j0 = v0Var;
            jVar5.l(v0Var, true);
            c1Var.W0.bringChildToFront(c1Var.P0);
            j jVar6 = c1Var.P0;
            if (jVar6 instanceof z3) {
                z3 z3Var3 = (z3) jVar6;
                z3Var3.f5608w0 = false;
                z3Var3.getSwatch().f4526c = e2Var.f4526c;
                s0(z3Var3.getSwatch(), null);
                r2Var.setValueOverride(new h0(z3Var3, (int) (c1Var.O0.f28463a / 9.0f), 0));
                r2Var.setShowPreview(false);
                return true;
            }
            r2Var.setValueOverride(hVar);
            r2Var.setShowPreview(true);
            e2Var.f4526c = hVar.get();
            s0(e2Var, null);
            return true;
        }
        ValueAnimator valueAnimator2 = c1Var.f5112g1;
        if (valueAnimator2 != null && c1Var.f5108e1 != 0) {
            valueAnimator2.cancel();
        }
        if (c1Var.I1) {
            w0(false);
        }
        B0(0);
        r2Var.setValueOverride(hVar);
        r2Var.setShowPreview(true);
        e2Var.f4526c = hVar.get();
        s0(e2Var, null);
        return z10;
    }

    @Override
    public final void requestLayout() {
        if (this.M0) {
            return;
        }
        super.requestLayout();
    }

    public final void s0(dg.e2 e2Var, Integer num) {
        dg.e2 e2Var2 = this.H1;
        if (e2Var2 != e2Var) {
            e2Var2.f4524a = e2Var.f4524a;
            e2Var2.f4525b = e2Var.f4525b;
            e2Var2.f4526c = e2Var.f4526c;
            int i10 = this.M1;
            dg.e1.e(i10).h(e2Var.f4524a, true);
            dg.e1.e(i10).j(e2Var.f4526c);
        }
        int i11 = e2Var.f4524a;
        q0 q0Var = this.T0;
        q0Var.setColor(i11);
        q0Var.setBrushSize(e2Var.f4526c);
        int i12 = e2Var2.f4524a;
        if (num != null && num.intValue() != i12) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            duration.addUpdateListener(new s(this, num, i12, 0));
            duration.start();
        } else {
            y0 y0Var = this.Z0;
            if (y0Var != null) {
                y0Var.invalidate();
            }
        }
        j jVar = this.P0;
        if (jVar instanceof z3) {
            ((z3) jVar).setSwatch(new dg.e2(e2Var.f4525b, e2Var.f4526c, e2Var.f4524a));
        }
    }

    public void setBlurredBackgroundDrawableForTools(qg.b bVar) {
        bVar.o(AndroidUtilities.dp(4.0f));
        this.Z1 = bVar;
    }

    public void setDrawShadow(boolean z4) {
        this.T1 = z4;
        invalidate();
        setClipChildren(!z4);
    }

    public void setOffsetTranslationX(float f10) {
        if (this.f5106d1 == 0) {
            this.f5116i1.setTranslationX(f10);
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.R1 = runnable;
    }

    @Override
    public final void t(j jVar) {
        int[] k02 = k0(jVar);
        y0(new a0(this, jVar, 1), this, 51, k02[0], k02[1] - AndroidUtilities.dp(32.0f));
    }

    public final void t0(float f10) {
        this.f5137z0 = f10;
        this.Y0.setTranslationY(-f10);
        this.Z0.setTranslationY(f10);
    }

    @Override
    public final void u() {
        qh.i3 i3Var;
        if (!this.f5109e2 && !this.f5107d2) {
            j0(true);
            return;
        }
        boolean z4 = this.f5107d2;
        if (z4 && (i3Var = ((ht0) this).f37617l2.H1) != null) {
            i3Var.f45412e = true;
        }
        x0(!z4 ? 1 : 0);
        if (z4) {
            j jVar = this.P0;
            if (jVar instanceof z3) {
                AndroidUtilities.showKeyboard(((z3) jVar).getEditText());
            }
        }
    }

    @Override
    public final void v(float f10, float f11, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        double d = f10 - (point.x / 2.0f);
        double radians = (float) Math.toRadians(-this.W0.getRotation());
        double d10 = f11 - (point.y / 2.0f);
        fArr[0] = (AndroidUtilities.displaySize.x / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        fArr[1] = (AndroidUtilities.displaySize.y / 2.0f) + ((float) l.d.a(radians, d10, Math.sin(radians) * d));
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
            float f24 = ((-this.f5113g2) / 2.0f) + f17;
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
    public final dg.e1 w() {
        return dg.e1.e(this.M1);
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
            kVar.f16343i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16336u = kVar;
            if (!this.f5109e2 && !this.f5107d2) {
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
                    c1 c1Var = c1.this;
                    y0 y0Var = c1Var.Z0;
                    float f14 = f12 / 1000.0f;
                    c1Var.K1 = f14;
                    float f15 = ((1.0f - f14) * 0.4f) + 0.6f;
                    View view = barView;
                    view.setScaleX(f15);
                    view.setScaleY(f15);
                    view.setTranslationY((Math.min(c1Var.K1, 0.25f) * AndroidUtilities.dp(16.0f)) / 0.25f);
                    view.setAlpha(1.0f - (Math.min(c1Var.K1, 0.25f) / 0.25f));
                    x0 x0Var = c1Var.D1;
                    float f16 = c1Var.K1;
                    boolean z11 = z4;
                    x0Var.y1(f16, z11);
                    c1Var.f5135y0.setProgress(c1Var.K1);
                    c1Var.f5133x0.setProgress(c1Var.K1);
                    c1Var.f5104c1.setTranslationY(AndroidUtilities.dp(32.0f) * c1Var.K1);
                    if (zArr[0]) {
                        float f17 = c1Var.K1;
                        if (!z11) {
                            f17 = 1.0f - f17;
                        }
                        float dp = AndroidUtilities.dp(40.0f) * f17;
                        if (z11) {
                            i10 = 1;
                        } else {
                            i10 = -1;
                        }
                        y0Var.setTranslationY(translationY - (dp * i10));
                    }
                    y0Var.invalidate();
                    if (view == c1Var.f5127r1) {
                        c1Var.f5101a1.invalidate();
                    }
                }
            });
            this.J1.a(new x(this, z4, 1));
            this.J1.f();
            if (z4) {
                x0 x0Var = this.D1;
                x0Var.setVisibility(0);
                x0Var.setSelectedColorIndex(dg.e1.e(this.M1).d());
            }
        }
    }

    @Override
    public final boolean x(j jVar) {
        return r0(jVar, true);
    }

    public final void x0(int i10) {
        boolean z4;
        int i11;
        i2 i2Var = this.f5127r1;
        if (i10 == 1) {
            mz mzVar = this.f5105c2;
            if (mzVar != null && mzVar.getVisibility() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            mz mzVar2 = this.f5105c2;
            if (mzVar2 != null && mzVar2.Z0 != UserConfig.selectedAccount) {
                removeView(mzVar2);
                this.f5105c2 = null;
            }
            if (this.f5105c2 == null) {
                mz mzVar3 = new mz(null, true, false, false, getContext(), false, null, null, true, this.N1, false, false);
                this.f5105c2 = mzVar3;
                mzVar3.R0 = true;
                mzVar3.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.f5105c2.setForseMultiwindowLayout(true);
                }
                this.f5105c2.setDelegate(new p0(this));
                addView(this.f5105c2);
            }
            this.f5105c2.setVisibility(0);
            this.f5107d2 = true;
            mz mzVar4 = this.f5105c2;
            if (this.f5115h2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5115h2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5115h2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.f5117i2 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.f5117i2 = AndroidUtilities.dp(150.0f);
                } else {
                    this.f5117i2 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i11 = this.f5117i2;
            } else {
                i11 = this.f5115h2;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mzVar4.getLayoutParams();
            layoutParams.height = i11;
            mzVar4.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                j jVar = this.P0;
                if (jVar instanceof z3) {
                    AndroidUtilities.hideKeyboard(((z3) jVar).getEditText());
                }
            }
            this.f5113g2 = i11;
            requestLayout();
            qh.i3 i3Var = ((ht0) this).f37617l2.H1;
            if (i3Var != null) {
                i3Var.a();
            }
            qg emojiButton = i2Var.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            getHeight();
            if (!z4 && !this.f5109e2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f5113g2, 0.0f);
                ofFloat.addUpdateListener(new r(this, 1));
                ofFloat.addListener(new o0(this, 0));
                ofFloat.start();
                return;
            }
            return;
        }
        qg emojiButton2 = i2Var.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.j(og.f29750e, true);
        }
        mz mzVar5 = this.f5105c2;
        if (mzVar5 != null) {
            this.f5107d2 = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                mzVar5.setVisibility(8);
            }
        }
        if (i10 == 0) {
            this.f5113g2 = 0;
        }
        qh.i3 i3Var2 = ((ht0) this).f37617l2.H1;
        if (i3Var2 != null) {
            i3Var2.a();
        }
        requestLayout();
        getHeight();
    }

    public final void y0(Runnable runnable, c1 c1Var, int i10, int i11, int i12) {
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
            this.P1.setOnTouchListener(new u(this, 0));
            this.P1.setDispatchKeyEventListener(new v(this));
            this.P1.setShownFromBottom(true);
        }
        this.P1.d();
        runnable.run();
        if (this.O1 == null) {
            org.telegram.ui.ActionBar.p1 p1Var2 = new org.telegram.ui.ActionBar.p1(this.P1, -2, -2);
            this.O1 = p1Var2;
            p1Var2.f22216b = true;
            p1Var2.setAnimationStyle(R.style.PopupAnimation);
            this.O1.setOutsideTouchable(true);
            this.O1.setClippingEnabled(true);
            this.O1.setInputMethodMode(2);
            this.O1.setSoftInputMode(0);
            this.O1.getContentView().setFocusableInTouchMode(true);
            this.O1.setOnDismissListener(new w(this, 0));
        }
        this.P1.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.O1.setFocusable(true);
        this.O1.showAtLocation(c1Var, i10, i11 - (this.P1.getMeasuredWidth() / 2), i12 - this.P1.getMeasuredHeight());
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
            kVar.f16343i = f11;
            kVar.b(1250.0f);
            kVar.a(1.0f);
            jVar2.f16336u = kVar;
            if (z4) {
                o2 o2Var = this.f5128s1;
                o2Var.setAlpha(0.0f);
                o2Var.setVisibility(0);
            }
            this.C1.b(new ag.c(1, this));
            this.C1.a(new x(this, z4, 0));
            this.C1.f();
        }
    }

    @Override
    public final void B(boolean z4) {
    }

    @Override
    public final void C() {
    }

    public View getView() {
        return this;
    }

    @Override
    public final void h(boolean z4) {
    }

    @Override
    public final void i(boolean z4) {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void l() {
    }

    @Override
    public final void n(boolean z4) {
    }

    @Override
    public final void y() {
    }
}
