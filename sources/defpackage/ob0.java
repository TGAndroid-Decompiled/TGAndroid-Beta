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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class ob0 extends e {
    public static final int[][] d0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] e0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public a I;
    public h01 J;
    public kb0 K;
    public za1 L;
    public boolean M;
    public ValueAnimator N;
    public float O;
    public final Paint P;
    public int Q;
    public boolean R;
    public s7 S;
    public ab0 T;
    public final xn5 U;
    public boolean V;
    public TextView W;
    public TextView X;
    public final zn5 Y;
    public jb0 Z;
    public fb0 a;
    public boolean a0;
    public hb0 b;
    public float b0;
    public int c;
    public ValueAnimator c0;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public oob r;
    public CharSequence s;
    public SpannableStringBuilder w;
    public boolean x;
    public c51 y;

    public ob0(zn5 zn5Var, xn5 xn5Var) {
        super(null);
        this.P = new Paint();
        this.R = true;
        this.a0 = false;
        this.b0 = 0.0f;
        this.Y = zn5Var;
        this.U = xn5Var;
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
        int i = aob.G6;
        yob.l(aVar, 5, i, null);
        yob.l(this.actionBar, 1, i, null);
        yob.l(this.actionBar, 3, aob.i6, null);
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(ob6.M0(2131747007, null));
        this.actionBar.setActionBarMenuOnItemClick(new db0(this, (byte) 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        a aVar2 = new a(getParentActivity(), null);
        this.I = aVar2;
        aVar2.setCastShadows(false);
        this.I.setAddToContainer(false);
        this.I.setOccupyStatusBar(true);
        this.I.setClipChildren(false);
        int o = vm2.o(-1, 60);
        this.I.H(-1, false);
        this.I.setBackButtonDrawable(new gd0(false));
        this.I.setAllowOverlayTitle(false);
        this.I.G(o, false);
        s6 u = this.I.u();
        u.setClipChildren(false);
        xn5 xn5Var = this.U;
        if (xn5Var != null && xn5Var.c == 2) {
            M0 = ob6.M0(2131744061, null);
        } else {
            M0 = ob6.M0(2131745247, null);
        }
        s7 e = u.e(1, M0);
        this.S = e;
        e.setBackground(aob.f0(o, 3, -1));
        this.I.setActionBarMenuOnItemClick(new db0(this, (byte) 1));
        this.r = new oob((byte) 2, getParentActivity(), this);
        eb0 eb0Var = new eb0(this, context);
        eb0Var.setFitsSystemWindows(true);
        yob.h(aob.a7, null, eb0Var);
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, hl.m, 0, 0);
        this.r.setOrientation(1);
        oob oobVar = this.r;
        fb0 fb0Var = new fb0(this, getParentActivity(), eb0Var);
        this.a = fb0Var;
        oobVar.addView(fb0Var);
        TextView textView = new TextView(getParentActivity());
        this.X = textView;
        textView.setText(ob6.M0(2131752104, null));
        TextView textView2 = this.X;
        int i2 = aob.y6;
        yob.X(textView2, i2, null);
        this.X.setTextSize(1, 14.0f);
        this.X.setGravity(17);
        this.r.addView(this.X, tre.t(-1, -2, 0, 21, 10, 21, 10));
        gb0 gb0Var = new gb0(this, getParentActivity());
        kb0 kb0Var = new kb0(this, getParentActivity());
        this.K = kb0Var;
        gb0Var.addView(kb0Var);
        this.r.addView(gb0Var, tre.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.W = textView3;
        textView3.setText(ob6.M0(2131752096, null));
        yob.X(this.W, i2, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, tre.t(-1, -2, 0, 21, 18, 21, 10));
        hb0 hb0Var = new hb0(this, this, getParentActivity(), getThemedColor(i));
        this.b = hb0Var;
        hb0Var.S = true;
        hb0Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, tre.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        eb0Var.addView(this.r, tre.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        c51 c51Var = new c51(this.resourceProvider, context, true);
        this.y = c51Var;
        c51Var.f();
        this.y.d.r(false, false);
        byte b = this.Y.W;
        if (b == 1) {
            this.s = ob6.M0(2131745267, null);
        } else if (b == 3) {
            this.s = ob6.M0(2131745264, null);
        } else if (b == 2) {
            this.s = ob6.M0(2131745253, null);
        } else if (xn5Var != null && xn5Var.c == 2) {
            this.s = ob6.M0(2131744061, null);
        } else {
            this.s = ob6.M0(2131745251, null);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new wm2(2131232247, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.w = spannableStringBuilder;
        this.x = false;
        this.y.i(this.s, false, true);
        this.y.setOnClickListener(new k1(this, (byte) 14));
        this.E = new FrameLayout(context);
        eb0Var.addView(this.y, tre.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        eb0Var.addView(this.E, tre.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        eb0Var.addView(this.actionBar);
        eb0Var.addView(this.I);
        eb0Var.addView(this.e, tre.c(-1.0f, -1));
        za1 za1Var = new za1(eb0Var);
        this.L = za1Var;
        za1Var.h = new ya0(this, (byte) 0);
        this.fragmentView = eb0Var;
        return eb0Var;
    }

    public final void g0() {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.H.cancel();
            this.H = null;
        }
    }

    public final void h0() {
        if (getParentActivity() == null) {
            return;
        }
        if (this.n) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = ob6.M0(2131747005, null);
            id idVar = alertDialog$Builder.a;
            idVar.U = M0;
            idVar.S = ob6.M0(2131751370, null);
            alertDialog$Builder.j(ob6.M0(2131747307, null), new za0(this, (byte) 1));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            showDialog(idVar);
            idVar.h();
            return;
        }
        finishFragment();
    }

    public final boolean i0() {
        if (yac.h(this.currentAccount).p()) {
            return false;
        }
        fb0 fb0Var = this.a;
        jb0 jb0Var = fb0Var.h;
        if ((jb0Var == null || !jb0Var.b) && !fb0Var.n) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob0.isLightStatusBar():boolean");
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void j0() {
        int i;
        File file;
        no6 no6Var;
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().C()) {
            if (i0()) {
                new d31(this.E, this.resourceProvider).Q(2131624211, 36, hl.N2(ob6.M0(2131746794, null), -1, 2, new ya0(this, (byte) 1), null)).j();
                return;
            }
            h01 h01Var = this.J;
            if (h01Var != null) {
                fb0 fb0Var = this.a;
                jb0 jb0Var = fb0Var.h;
                long j = fb0Var.a;
                TLRPC.Document document = fb0Var.b;
                ob0 ob0Var = (ob0) h01Var.c;
                boolean z = ChatAttachAlertPhotoLayout.r1;
                n12 n12Var = ((ChatAttachAlertPhotoLayout) h01Var.b).b;
                HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
                hashMap.clear();
                Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                o15 o15Var = new o15();
                if (jb0Var != null) {
                    i = 0;
                    o15Var.d(jb0Var.c, jb0Var.d, jb0Var.e, jb0Var.f);
                } else {
                    i = 0;
                    int[] iArr = d0[0];
                    o15Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
                }
                o15Var.b(0.0f, 0.0f, 800.0f, 800.0f);
                canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, o15Var.c);
                File z2 = xb4.z(4);
                StringBuilder sb = new StringBuilder();
                byte b = 4;
                sb.append(xea.p());
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
                ImageReceiver imageReceiver = fb0Var.getImageReceiver();
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
                File file3 = new File(xb4.z(4), xea.p() + "avatar_background.png");
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
                if (fb0Var.getImageReceiver().m() == null && fb0Var.getImageReceiver().y() == null) {
                    no6Var = new no6(0, file3.getPath(), 0, false, 0, 0);
                } else {
                    no6Var = new no6(0, file.getPath(), 0, false, 0, 0);
                    no6Var.c = file3.getPath();
                    if (fb0Var.a != 0) {
                        TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                        tL_videoSizeEmojiMarkup.emoji_id = fb0Var.a;
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(fb0Var.h.c));
                        int i2 = fb0Var.h.d;
                        if (i2 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i2));
                        }
                        int i3 = fb0Var.h.e;
                        if (i3 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i3));
                        }
                        int i4 = fb0Var.h.f;
                        if (i4 != 0) {
                            tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i4));
                        }
                        no6Var.S = tL_videoSizeEmojiMarkup;
                    } else if (fb0Var.b != null) {
                        TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                        TLRPC.Document document2 = fb0Var.b;
                        tL_videoSizeStickerMarkup.sticker_id = document2.id;
                        tL_videoSizeStickerMarkup.stickerset = r47.i1(document2);
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(fb0Var.h.c));
                        int i5 = fb0Var.h.d;
                        if (i5 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i5));
                        }
                        int i6 = fb0Var.h.e;
                        if (i6 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i6));
                        }
                        int i7 = fb0Var.h.f;
                        if (i7 != 0) {
                            tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i7));
                        }
                        no6Var.S = tL_videoSizeStickerMarkup;
                    }
                    oec oecVar = new oec();
                    no6Var.s = oecVar;
                    oecVar.o = file.getPath();
                    oec oecVar2 = no6Var.s;
                    oecVar2.k = 800;
                    oecVar2.l = 800;
                    oecVar2.h = 800;
                    oecVar2.i = 800;
                    oecVar2.I = true;
                    oecVar2.m = -1;
                    oecVar2.t = true;
                    oecVar2.a = 0L;
                    oecVar2.d = 0.0f;
                    oecVar2.b = fb0Var.getDuration();
                    oec oecVar3 = no6Var.s;
                    oecVar3.n = 30;
                    oecVar3.c = 0L;
                    long j2 = oecVar3.b;
                    oecVar3.q = (int) ((((float) j2) / 1000.0f) * 115200.0f);
                    oecVar3.r = j2;
                    mec mecVar = new mec();
                    mecVar.a = (byte) 0;
                    if (document == null) {
                        document = wl.e(yac.t0, j);
                    }
                    if (document != null) {
                        mecVar.q = 560;
                        mecVar.r = 560;
                        mecVar.f = 0.7f;
                        mecVar.g = 0.7f;
                        mecVar.c = 0.15f;
                        mecVar.d = 0.15f;
                        mecVar.B = document;
                        mecVar.C = null;
                        xb4.G(yac.t0);
                        mecVar.j = xb4.J(document, null, true, true).getAbsolutePath();
                        mecVar.s = 0.13f;
                        if (r47.K2(document, true) || r47.N4(document)) {
                            boolean K2 = r47.K2(document, true);
                            byte b2 = mecVar.b;
                            if (K2) {
                                b = 1;
                            }
                            mecVar.b = (byte) (b2 | b);
                        }
                        if (r47.B4(document)) {
                            mecVar.l = -1;
                            mecVar.b = (byte) (mecVar.b | 8);
                        }
                        no6Var.s.G = new ArrayList();
                        no6Var.s.G.add(mecVar);
                    }
                }
                hashMap.put(-1, no6Var);
                ChatAttachAlertPhotoLayout.u1.add(-1);
                n12Var.W3.z0(7, true, false, 0, 0, 0L, n12Var.b1(), false, 0L);
                if (!ob0Var.R) {
                    e eVar = n12Var.Z1;
                    if (eVar != null) {
                        eVar.removeSelfFromStack();
                    }
                    ob0Var.finishFragment();
                }
            }
            if (this.R) {
                finishFragment();
            }
        }
    }

    public final void k0(boolean z, boolean z2, boolean z3) {
        float f;
        if (this.V) {
            return;
        }
        g0();
        float f2 = this.F;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.H = ValueAnimator.ofFloat(f2, f);
        if (z2) {
            this.a.x = this.F;
            jn7.e().k(jn7.u4, new Object[0]);
        }
        this.H.addUpdateListener(new e20((byte) 1, this, z2));
        this.H.addListener(new y5(this, z, z2, (byte) 2));
        ValueAnimator valueAnimator = this.H;
        if (z3) {
            valueAnimator.setInterpolator(k43.h);
            this.H.setDuration(350L);
            this.H.setStartDelay(150L);
        } else {
            valueAnimator.setInterpolator(k43.f);
            this.H.setDuration(250L);
        }
        this.H.start();
    }

    public final void l0(boolean z, long j, TLRPC.Document document) {
        fb0 fb0Var = this.a;
        fb0Var.a = j;
        fb0Var.b = document;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        mb0 mb0Var = fb0Var.c;
        if (i == 0) {
            mb0Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().Z(jn5.b(document), "100_100", null, null, lp3.f(document, aob.m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            mb0Var.setAnimatedEmojiDrawable(new wl(14, this.currentAccount, j));
            this.a.c.getImageReceiver().f();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().m() != null) {
            this.a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().y() != null) {
            this.a.getImageReceiver().y().I(0, false, true);
        }
        this.n = true;
        r0();
    }

    public final void m0(boolean z, float f) {
        boolean z2;
        this.F = f;
        float f2 = ((this.d - this.c) - hl.m) * f;
        if (this.O == 0.0f) {
            this.r.setTranslationY(f2);
            this.y.setTranslationY(f2);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f);
        this.fragmentView.invalidate();
        if (z) {
            fb0 fb0Var = this.a;
            if (f > 0.5f) {
                z2 = true;
            } else {
                z2 = false;
            }
            fb0Var.setExpanded(z2);
        }
    }

    public final void n0(float f) {
        if (this.b0 != f) {
            this.b0 = f;
            int f2 = vm2.f(f, -16777216, -1);
            int o = vm2.o(f2, 60);
            this.I.H(f2, false);
            this.S.setBackground(aob.f0(o, 3, -1));
        }
    }

    public final void o0(long j) {
        fb0 fb0Var = this.a;
        if (fb0Var == 0) {
            return;
        }
        ?? obj = new Object();
        int[] iArr = d0[0];
        obj.c = iArr[0];
        obj.d = iArr[1];
        obj.e = iArr[2];
        obj.f = iArr[3];
        fb0Var.b(obj, false);
        r0();
        fb0 fb0Var2 = this.a;
        fb0Var2.a = j;
        fb0Var2.c.setAnimatedEmojiDrawable(new wl(14, this.currentAccount, j));
        this.K.A1(obj);
        this.b.setForUser(false);
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.n) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131747005, null);
                id idVar = alertDialog$Builder.a;
                idVar.U = M0;
                idVar.S = ob6.M0(2131751370, null);
                alertDialog$Builder.j(ob6.M0(2131747307, null), new za0(this, (byte) 0));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                showDialog(idVar);
                idVar.h();
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), getClassGuid());
    }

    public final void p0(qb0 qb0Var) {
        jb0 backgroundGradient = qb0Var.getBackgroundGradient();
        fb0 fb0Var = this.a;
        if (fb0Var == null) {
            return;
        }
        fb0Var.b(backgroundGradient, false);
        r0();
        if (qb0Var.getAnimatedEmoji() != null) {
            long h = qb0Var.getAnimatedEmoji().h();
            fb0 fb0Var2 = this.a;
            fb0Var2.a = h;
            fb0Var2.c.setAnimatedEmojiDrawable(new wl(14, this.currentAccount, h));
        }
        this.K.A1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        int i;
        int i2;
        int i3;
        ?? obj = new Object();
        obj.c = vm2.o(videoSize.background_colors.get(0).intValue(), 255);
        if (videoSize.background_colors.size() > 1) {
            i = vm2.o(videoSize.background_colors.get(1).intValue(), 255);
        } else {
            i = 0;
        }
        obj.d = i;
        if (videoSize.background_colors.size() > 2) {
            i2 = vm2.o(videoSize.background_colors.get(2).intValue(), 255);
        } else {
            i2 = 0;
        }
        obj.e = i2;
        if (videoSize.background_colors.size() > 3) {
            i3 = vm2.o(videoSize.background_colors.get(3).intValue(), 255);
        } else {
            i3 = 0;
        }
        obj.f = i3;
        this.a.b(obj, false);
        r0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            l0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet n0 = ls6.d0(this.currentAccount).n0(tL_videoSizeStickerMarkup.stickerset, false);
            if (n0 != null) {
                for (int i4 = 0; i4 < n0.documents.size(); i4++) {
                    if (n0.documents.get(i4).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = n0.documents.get(i4);
                    }
                }
            }
            l0(false, 0L, document);
        }
        this.K.A1(obj);
        this.b.setForUser(true);
    }

    public final void r0() {
        CharSequence charSequence;
        boolean i0 = i0();
        if (this.x != i0) {
            c51 c51Var = this.y;
            this.x = i0;
            if (i0) {
                charSequence = this.w;
            } else {
                charSequence = this.s;
            }
            c51Var.i(charSequence, true, true);
        }
    }
}
