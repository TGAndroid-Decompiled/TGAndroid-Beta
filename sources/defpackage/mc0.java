package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class mc0 extends d {
    public static final int[][] d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public a I;
    public g11 J;
    public ic0 K;
    public zb1 L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public r7 S;
    public yb0 T;
    public final un5 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final wn5 Y;
    public hc0 Z;
    public dc0 a;
    public boolean a0;
    public fc0 b;
    public float b0;
    public int c;
    public ValueAnimator c0;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public qmb r;
    public CharSequence s;
    public SpannableStringBuilder w;
    public boolean x;
    public b61 y;

    public mc0(wn5 wn5Var, un5 un5Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.a0 = false;
        this.b0 = 0.0f;
        this.Y = wn5Var;
        this.U = un5Var;
    }

    @Override
    public final View createView(Context context) {
        String M0;
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        a aVar = this.actionBar;
        int i = cmb.F6;
        anb.l(aVar, 5, i, null);
        anb.l(this.actionBar, 1, i, null);
        anb.l(this.actionBar, 3, cmb.h6, null);
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(jb6.M0(2131747013, null));
        this.actionBar.setActionBarMenuOnItemClick(new bc0(this, (byte) 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        a aVar2 = new a(getParentActivity(), null);
        this.I = aVar2;
        aVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int p = on2.p(-1, 60);
        this.I.H(-1, false);
        this.I.setBackButtonDrawable(new ee0(false));
        this.I.setAllowOverlayTitle(false);
        this.I.G(p, false);
        r6 t = this.I.t();
        t.setClipChildren(false);
        un5 un5Var = this.U;
        if (un5Var != null && un5Var.c == 2) {
            M0 = jb6.M0(2131744093, null);
        } else {
            M0 = jb6.M0(2131745253, null);
        }
        r7 e = t.e(1, M0);
        this.S = e;
        e.setBackground(cmb.f0(p, 3, -1));
        this.I.setActionBarMenuOnItemClick(new bc0(this, (byte) 1));
        this.r = new qmb((byte) 2, getParentActivity(), this);
        cc0 cc0Var = new cc0(this, context);
        cc0Var.setFitsSystemWindows(true);
        anb.h(cmb.Z6, null, cc0Var);
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, gm.m, 0, 0);
        this.r.setOrientation(1);
        qmb qmbVar = this.r;
        dc0 dc0Var = new dc0(this, getParentActivity(), cc0Var);
        this.a = dc0Var;
        qmbVar.addView(dc0Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(jb6.M0(2131752076, null));
        TextView textView2 = this.X;
        int i2 = cmb.x6;
        anb.X(textView2, i2, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.r.addView(this.X, qoe.t(-1, -2, 0, 21, 10, 21, 10));
        ec0 ec0Var = new ec0(this, getParentActivity());
        ic0 ic0Var = new ic0(this, getParentActivity());
        this.K = ic0Var;
        ec0Var.addView(ic0Var);
        this.r.addView(ec0Var, qoe.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(jb6.M0(2131752068, null));
        anb.X(this.W, i2, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, qoe.t(-1, -2, 0, 21, 18, 21, 10));
        fc0 fc0Var = new fc0(this, this, getParentActivity(), getThemedColor(i));
        this.b = fc0Var;
        fc0Var.S = true;
        fc0Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, qoe.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        cc0Var.addView(this.r, qoe.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        b61 b61Var = new b61(this.resourceProvider, context, true);
        this.y = b61Var;
        b61Var.f();
        this.y.d.r(false, false);
        byte b = this.Y.W;
        if (b == 1) {
            this.s = jb6.M0(2131745273, null);
        } else if (b == 3) {
            this.s = jb6.M0(2131745270, null);
        } else if (b == 2) {
            this.s = jb6.M0(2131745259, null);
        } else if (un5Var != null && un5Var.c == 2) {
            this.s = jb6.M0(2131744093, null);
        } else {
            this.s = jb6.M0(2131745257, null);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new pn2(2131232248, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.w = spannableStringBuilder;
        this.x = false;
        this.y.i(this.s, false, true);
        this.y.setOnClickListener(new j1(this, (byte) 15));
        this.E = new FrameLayout(context);
        cc0Var.addView(this.y, qoe.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        cc0Var.addView(this.E, qoe.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        cc0Var.addView(this.actionBar);
        cc0Var.addView(this.I);
        cc0Var.addView(this.e, qoe.c(-1.0f, -1));
        zb1 zb1Var = new zb1(cc0Var);
        this.L = zb1Var;
        zb1Var.h = new wb0(this, (byte) 0);
        this.fragmentView = cc0Var;
        return cc0Var;
    }

    public final void h0() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
            this.H = null;
        }
    }

    public final void i0() {
        if (getParentActivity() == null) {
            return;
        }
        if (this.n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131747011, null);
            he heVar = alertDialog$Builder.a;
            heVar.U = M0;
            heVar.S = jb6.M0(2131751342, null);
            alertDialog$Builder.j(jb6.M0(2131747313, null), new xb0(this, (byte) 1));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
            heVar.h();
            return;
        }
        finishFragment();
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc0.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (z8c.h(this.currentAccount).p()) {
            return false;
        }
        dc0 dc0Var = this.a;
        hc0 hc0Var = dc0Var.h;
        if ((hc0Var == null || !hc0Var.b) && !dc0Var.n) {
            return false;
        }
        return true;
    }

    public final void k0() {
        int i;
        File file;
        jo6 jo6Var;
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().C()) {
            if (j0()) {
                new c41(this.E, this.resourceProvider).Q(2131624211, 36, gm.N2(jb6.M0(2131746800, null), -1, 2, new wb0(this, (byte) 1), null)).j();
                return;
            }
            g11 g11Var = this.J;
            if (g11Var != null) {
                dc0 dc0Var = this.a;
                hc0 hc0Var = dc0Var.h;
                long j = dc0Var.a;
                TLRPC.Document document = dc0Var.b;
                mc0 mc0Var = (mc0) g11Var.c;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                i22 i22Var = ((ChatAttachAlertPhotoLayout) g11Var.b).b;
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j15 j15Var = new j15();
                if (hc0Var != null) {
                    i = 0;
                    j15Var.d(hc0Var.c, hc0Var.d, hc0Var.e, hc0Var.f);
                } else {
                    i = 0;
                    int[] iArr = d0[0];
                    j15Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
                }
                j15Var.b(0.0f, 0.0f, 800.0f, 800.0f);
                canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, j15Var.c);
                File z2 = bc4.z(4);
                StringBuilder sb = new StringBuilder();
                byte b = 4;
                sb.append(gda.p());
                sb.append("avatar_background.png");
                File file2 = new File(z2, sb.toString());
                try {
                    file2.createNewFile();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, i, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ImageReceiver imageReceiver = dc0Var.getImageReceiver();
                if (imageReceiver.m() != null) {
                    Bitmap p = imageReceiver.m().p();
                    ImageReceiver imageReceiver2 = new ImageReceiver(null);
                    imageReceiver2.f0(p);
                    imageReceiver2.i0(120.0f, 120.0f, 560.0f, 560.0f);
                    imageReceiver2.q0(72);
                    imageReceiver2.h(canvas, null);
                    imageReceiver2.f();
                    p.recycle();
                    file = file2;
                } else {
                    if (imageReceiver.y() != null) {
                        file = file2;
                        imageReceiver.y().I(0, false, true);
                    } else {
                        file = file2;
                    }
                    imageReceiver.i0(120.0f, 120.0f, 560.0f, 560.0f);
                    imageReceiver.q0(72);
                    imageReceiver.h(canvas, null);
                }
                File file3 = new File(bc4.z(4), gda.p() + "avatar_background.png");
                try {
                    file3.createNewFile();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
                    fileOutputStream2.write(byteArray2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (dc0Var.getImageReceiver().m() == null && dc0Var.getImageReceiver().y() == null) {
                    jo6Var = new jo6(0, file3.getPath(), 0, false, 0, 0);
                } else {
                    jo6Var = new jo6(0, file.getPath(), 0, false, 0, 0);
                    jo6Var.c = file3.getPath();
                    if (dc0Var.a != 0) {
                        TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                        tL_videoSizeEmojiMarkup.emoji_id = dc0Var.a;
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(dc0Var.h.c));
                        int i2 = dc0Var.h.d;
                        if (i2 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i2));
                        }
                        int i3 = dc0Var.h.e;
                        if (i3 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i3));
                        }
                        int i4 = dc0Var.h.f;
                        if (i4 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i4));
                        }
                        jo6Var.S = tL_videoSizeEmojiMarkup;
                    } else if (dc0Var.b != null) {
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                        TLRPC.Document document2 = dc0Var.b;
                        tL_videoSizeStickerMarkup.sticker_id = document2.id;
                        tL_videoSizeStickerMarkup.stickerset = k47.i1(document2);
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(dc0Var.h.c));
                        int i5 = dc0Var.h.d;
                        if (i5 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i5));
                        }
                        int i6 = dc0Var.h.e;
                        if (i6 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i6));
                        }
                        int i7 = dc0Var.h.f;
                        if (i7 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i7));
                        }
                        jo6Var.S = tL_videoSizeStickerMarkup;
                    }
                    rcc rccVar = new rcc();
                    jo6Var.s = rccVar;
                    rccVar.o = file.getPath();
                    rcc rccVar2 = jo6Var.s;
                    rccVar2.k = 800;
                    rccVar2.l = 800;
                    rccVar2.h = 800;
                    rccVar2.i = 800;
                    rccVar2.I = true;
                    rccVar2.m = -1;
                    rccVar2.t = true;
                    rccVar2.a = 0L;
                    rccVar2.d = 0.0f;
                    rccVar2.b = dc0Var.getDuration();
                    rcc rccVar3 = jo6Var.s;
                    rccVar3.n = 30;
                    rccVar3.c = 0L;
                    long j2 = rccVar3.b;
                    rccVar3.q = (int) ((((float) j2) / 1000.0f) * 115200.0f);
                    rccVar3.r = j2;
                    pcc pccVar = new pcc();
                    pccVar.a = (byte) 0;
                    if (document == null) {
                        document = vm.e(z8c.t0, j);
                    }
                    if (document != null) {
                        pccVar.q = 560;
                        pccVar.r = 560;
                        pccVar.f = 0.7f;
                        pccVar.g = 0.7f;
                        pccVar.c = 0.15f;
                        pccVar.d = 0.15f;
                        pccVar.B = document;
                        pccVar.C = null;
                        bc4.G(z8c.t0);
                        pccVar.j = bc4.J(document, null, true, true).getAbsolutePath();
                        pccVar.s = 0.13f;
                        if (k47.K2(document, true) || k47.N4(document)) {
                            boolean K2 = k47.K2(document, true);
                            byte b2 = pccVar.b;
                            if (K2) {
                                b = 1;
                            }
                            pccVar.b = (byte) (b2 | b);
                        }
                        if (k47.B4(document)) {
                            pccVar.l = -1;
                            pccVar.b = (byte) (pccVar.b | 8);
                        }
                        jo6Var.s.G = new ArrayList();
                        jo6Var.s.G.add(pccVar);
                    }
                }
                hashMap.put(-1, jo6Var);
                ChatAttachAlertPhotoLayout.u1.add(-1);
                i22Var.W3.E0(7, true, false, 0, 0, 0L, i22Var.a1(), false, 0L);
                if (!mc0Var.R) {
                    d dVar = i22Var.Z1;
                    if (dVar != null) {
                        dVar.removeSelfFromStack();
                    }
                    mc0Var.finishFragment();
                }
            }
            if (this.R) {
                finishFragment();
            }
        }
    }

    public final void l0(boolean z, boolean z2, boolean z3) {
        float f;
        if (this.V) {
            return;
        }
        h0();
        float f2 = this.F;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.H = ValueAnimator.ofFloat(f2, f);
        if (z2) {
            this.a.x = this.F;
            nm7.e().k(nm7.v4, new Object[0]);
        }
        this.H.addUpdateListener(new d30((byte) 1, this, z2));
        this.H.addListener(new x5(this, z, z2, (byte) 2));
        ValueAnimator valueAnimator = this.H;
        if (z3) {
            valueAnimator.setInterpolator(d53.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            valueAnimator.setInterpolator(d53.f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void m0(boolean z, long j, TLRPC.Document document) {
        dc0 dc0Var = this.a;
        dc0Var.a = j;
        dc0Var.b = document;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        kc0 kc0Var = dc0Var.c;
        if (i == 0) {
            kc0Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().Z(gn5.b(document), "100_100", null, null, eq3.f(document, cmb.l6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            kc0Var.setAnimatedEmojiDrawable(new vm(14, this.currentAccount, j));
            this.a.c.getImageReceiver().f();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().m() != null) {
            this.a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().y() != null) {
            this.a.getImageReceiver().y().I(0, false, true);
        }
        this.n = true;
        s0();
    }

    public final void n0(boolean z, float f) {
        boolean z2;
        this.F = f;
        float f2 = ((this.d - this.c) - gm.m) * f;
        if (this.O == 0.0f) {
            this.r.setTranslationY(f2);
            this.y.setTranslationY(f2);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f);
        this.fragmentView.invalidate();
        if (z) {
            dc0 dc0Var = this.a;
            if (f > 0.5f) {
                z2 = true;
            } else {
                z2 = false;
            }
            dc0Var.setExpanded(z2);
        }
    }

    public final void o0(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            int f2 = on2.f(f, -16777216, -1);
            int p = on2.p(f2, 60);
            this.I.H(f2, false);
            this.S.setBackground(cmb.f0(p, 3, -1));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.n) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131747011, null);
                he heVar = alertDialog$Builder.a;
                heVar.U = M0;
                heVar.S = jb6.M0(2131751342, null);
                alertDialog$Builder.j(jb6.M0(2131747313, null), new xb0(this, (byte) 0));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
                heVar.h();
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onResume() {
        super.onResume();
        gm.V2(getParentActivity(), getClassGuid());
    }

    public final void p0(long j) {
        dc0 dc0Var = this.a;
        if (dc0Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = d0[0];
        obj.c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f = iArr[3];
        dc0Var.b(obj, false);
        s0();
        dc0 dc0Var2 = this.a;
        dc0Var2.a = j;
        dc0Var2.c.setAnimatedEmojiDrawable(new vm(14, this.currentAccount, j));
        this.K.z1(obj);
        this.b.setForUser(false);
    }

    public final void q0(oc0 oc0Var) {
        hc0 backgroundGradient = oc0Var.getBackgroundGradient();
        dc0 dc0Var = this.a;
        if (dc0Var == null) {
            return;
        }
        dc0Var.b(backgroundGradient, false);
        s0();
        if (oc0Var.getAnimatedEmoji() != null) {
            long h = oc0Var.getAnimatedEmoji().h();
            dc0 dc0Var2 = this.a;
            dc0Var2.a = h;
            dc0Var2.c.setAnimatedEmojiDrawable(new vm(14, this.currentAccount, h));
        }
        this.K.z1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void r0(TLRPC.VideoSize videoSize) {
        int i;
        int i2;
        int i3;
        ?? obj = new Object();
        obj.c = on2.p(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i = on2.p(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i = 0;
        }
        obj.d = i;
        if (videoSize.background_colors.size() > 2) {
            i2 = on2.p(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i2 = 0;
        }
        obj.e = i2;
        if (videoSize.background_colors.size() > 3) {
            i3 = on2.p(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i3 = 0;
        }
        obj.f = i3;
        this.a.b(obj, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet n0 = hs6.d0(this.currentAccount).n0(tL_videoSizeStickerMarkup.stickerset, false);
            if (n0 != null) {
                for (int i4 = 0; i4 < n0.documents.size(); i4++) {
                    if (n0.documents.get(i4).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = n0.documents.get(i4);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.K.z1(obj);
        this.b.setForUser(true);
    }

    public final void s0() {
        CharSequence charSequence;
        boolean j0 = j0();
        if (this.x != j0) {
            b61 b61Var = this.y;
            this.x = j0;
            if (j0) {
                charSequence = this.w;
            } else {
                charSequence = this.s;
            }
            b61Var.i(charSequence, true, true);
        }
    }
}
