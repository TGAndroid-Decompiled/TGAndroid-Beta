package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RadialProgressView;
public class u0b extends fx0 implements gk7 {
    public TextView A1;
    public f09 B1;
    public final AnimatorSet[] C1;
    public final View[] D1;
    public oc6 E1;
    public final d F1;
    public ar0 G1;
    public final Activity H1;
    public int I1;
    public int J1;
    public boolean K1;
    public boolean L1;
    public TLRPC.TL_messages_stickerSet M1;
    public TLRPC.Document N1;
    public s3a O1;
    public TLRPC.InputStickerSet P1;
    public ArrayList Q1;
    public final ArrayList R1;
    public ArrayList S1;
    public HashMap T1;
    public final String U1;
    public final r0b V1;
    public s0b W1;
    public gb5 X1;
    public int Y1;
    public int Z1;
    public boolean a2;
    public boolean b2;
    public boolean c2;
    public boolean d2;
    public int e2;
    public final ep f2;
    public final j0b g2;
    public q3a h2;
    public String i2;
    public int j2;
    public boolean k2;
    public Pattern l1;
    public String l2;
    public ns9 m1;
    public Runnable m2;
    public q0b n1;
    public ArrayList n2;
    public is5 o1;
    public int o2;
    public TLRPC.Document p1;
    public int p2;
    public l46 q1;
    public r7 r1;
    public a8 s1;
    public hn t1;
    public ah8 u1;
    public FrameLayout v1;
    public FrameLayout w1;
    public TextView x1;
    public View y1;
    public be0 z1;

    public u0b(Context context, Object obj, TLObject tLObject, wjb wjbVar) {
        super(1, wjbVar, context, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new ep((byte) 6);
        this.g2 = new j0b(this);
        this.J0 = wjbVar;
        K();
        this.H1 = (Activity) context;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        o78 o78Var = (o78) this;
        this.Z1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new rt0(o78Var, obj, tL_messages_getAttachedStickers, new apa(o78Var, tL_messages_getAttachedStickers, (byte) 6), (byte) 24));
        J0(context);
    }

    public static void G0(d dVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, TLRPC.Document document) {
        mu1 mu1Var;
        boolean z;
        TLRPC.StickerSet stickerSet;
        if (dVar != null) {
            if (dVar instanceof mu1) {
                mu1Var = (mu1) dVar;
            } else {
                mu1Var = null;
            }
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.creator) {
                z = true;
            } else {
                z = false;
            }
            if (document != null && document.mime_type.equals("image/webp")) {
                ArrayList arrayList = new ArrayList();
                ba4.G(y6c.t0);
                File J = ba4.J(document, null, true, true);
                if (J != null && J.exists()) {
                    gl.e3(new o2a(J, arrayList, dVar, mu1Var, document, z, tL_messages_stickerSet), 300L);
                    return;
                }
                return;
            }
            gl.e3(new z77(dVar, (Object) tL_messages_stickerSet, (Object) document, (Object) mu1Var, z, (byte) 21), 300L);
        }
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F8));
        hashSet.add(Integer.valueOf(bkb.H5));
        hashSet.add(Integer.valueOf(bkb.E8));
        hashSet.add(Integer.valueOf(bkb.D8));
        hashSet.add(Integer.valueOf(bkb.zj));
        hashSet.add(Integer.valueOf(bkb.k5));
    }

    public final void D0() {
        if (this.M1 != null) {
            TLRPC.TL_messages_stickerSet v0 = na7.q1(this.a).v0(this.M1);
            this.M1 = v0;
            if (v0 == null) {
                dismiss();
            }
        }
    }

    @Override
    public final boolean E() {
        return false;
    }

    public final void E0(TextView textView, String str, boolean z) {
        if (z) {
            textView.setText(k96.M0(2131749043, null));
            zkb.X(textView, bkb.v6, this.J0);
            this.k2 = true;
            this.i2 = str;
            return;
        }
        q3a q3aVar = this.h2;
        if (q3aVar != null) {
            gl.r(q3aVar);
            this.h2 = null;
            this.i2 = null;
            if (this.j2 != 0) {
                ConnectionsManager.getInstance(this.a).cancelRequest(this.j2, true);
            }
        }
        if (TextUtils.isEmpty(str)) {
            textView.setText(k96.M0(2131749045, null));
            zkb.X(textView, bkb.p5, this.J0);
            return;
        }
        this.k2 = false;
        if (str != null) {
            if (!str.startsWith("_") && !str.endsWith("_")) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != '_'))) {
                        textView.setText(k96.M0(2131749045, null));
                        zkb.X(textView, bkb.o7, this.J0);
                        return;
                    }
                }
            } else {
                textView.setText(k96.M0(2131749041, null));
                zkb.X(textView, bkb.o7, this.J0);
                return;
            }
        }
        if (str != null && str.length() >= 5) {
            if (str.length() > 32) {
                textView.setText(k96.M0(2131749040, null));
                zkb.X(textView, bkb.o7, this.J0);
                return;
            }
            textView.setText(k96.M0(2131749042, null));
            zkb.X(textView, bkb.E6, this.J0);
            this.i2 = str;
            q3a q3aVar2 = new q3a(this, str, textView, (byte) 26);
            this.h2 = q3aVar2;
            gl.e3(q3aVar2, 300L);
            return;
        }
        textView.setText(k96.M0(2131749039, null));
        zkb.X(textView, bkb.o7, this.J0);
    }

    public final void F0() {
        if (!this.L1) {
            return;
        }
        this.o1.h(null);
        this.L1 = false;
        this.f2.o(true);
        gl.d0(this.m1, new bm0((byte) 28));
        this.r1.postDelayed(new h0b(this, (byte) 0), 200L);
        this.t1.c(k96.M0(2131751209, null), true, true);
    }

    public final void H0() {
        if (this.L1) {
            return;
        }
        this.o1.h(this.m1);
        this.L1 = true;
        ep epVar = this.f2;
        char c = 0;
        epVar.o(false);
        float f = 0.0f;
        Float valueOf = Float.valueOf(0.0f);
        ArrayList arrayList = (ArrayList) epVar.d;
        if (arrayList.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                arrayList.add(valueOf);
                ((ArrayList) epVar.e).add(valueOf);
                ((ArrayList) epVar.f).add(valueOf);
            }
        }
        int i2 = 0;
        for (int i3 = 6; i2 < i3; i3 = 6) {
            long nextFloat = Utilities.b.nextFloat() * 300.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -2.0f, 0.0f, 2.0f, 0.0f);
            ofFloat.addUpdateListener(new t0b(epVar, i2, (byte) 3));
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setCurrentPlayTime(nextFloat);
            ofFloat.setDuration(300L);
            ofFloat.start();
            float L = gl.L(0.5f);
            char c2 = c;
            float f2 = f;
            float[] fArr = new float[5];
            fArr[c2] = f2;
            fArr[1] = L;
            fArr[2] = f2;
            fArr[3] = -L;
            fArr[4] = f2;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr);
            ofFloat2.addUpdateListener(new t0b(epVar, i2, (byte) 4));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setCurrentPlayTime(nextFloat);
            ofFloat2.setDuration(360L);
            ofFloat2.start();
            float[] fArr2 = new float[4];
            fArr2[c2] = f2;
            fArr2[1] = L;
            fArr2[2] = f2 - L;
            fArr2[3] = f2;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr2);
            ofFloat3.addUpdateListener(new t0b(epVar, i2, (byte) 5));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setInterpolator(new LinearInterpolator());
            ofFloat3.setCurrentPlayTime(nextFloat);
            ofFloat3.setDuration(300L);
            ofFloat3.start();
            ((ArrayList) epVar.a).add(ofFloat);
            ((ArrayList) epVar.b).add(ofFloat2);
            ((ArrayList) epVar.c).add(ofFloat3);
            i2++;
            c = c2;
            f = f2;
        }
        gl.d0(this.m1, new bm0((byte) 29));
        this.r1.postDelayed(new h0b(this, (byte) 1), 200L);
        this.t1.c(k96.M0(2131751342, null), true, true);
    }

    public final void I0() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.w1, View.ALPHA, 0.0f));
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ng9(this, (byte) 23));
        animatorSet.start();
    }

    public final void J0(Context context) {
        int i;
        m0b m0bVar = new m0b(this, context);
        this.b = m0bVar;
        m0bVar.setWillNotDraw(false);
        ViewGroup viewGroup = this.b;
        int i2 = this.u0;
        viewGroup.setPadding(i2, 0, i2, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, gl.e1(), 51);
        layoutParams.topMargin = gl.L(48.0f);
        View view = new View(context);
        View[] viewArr = this.D1;
        viewArr[0] = view;
        int i3 = bkb.U5;
        zkb.h(i3, this.J0, view);
        viewArr[0].setAlpha(0.0f);
        viewArr[0].setVisibility(4);
        viewArr[0].setTag(1);
        this.b.addView(viewArr[0], layoutParams);
        ns9 ns9Var = new ns9((byte) 5, context, this);
        this.m1 = ns9Var;
        ns9Var.setTag(14);
        ns9 ns9Var2 = this.m1;
        getContext();
        ar0 ar0Var = new ar0(this);
        this.G1 = ar0Var;
        ns9Var2.setLayoutManager(ar0Var);
        this.G1.O = new nq1(this, (byte) 18);
        this.o1 = new is5(new n0b(this));
        ns9 ns9Var3 = this.m1;
        q0b q0bVar = new q0b(this, context);
        this.n1 = q0bVar;
        ns9Var3.setAdapter(q0bVar);
        this.m1.setVerticalScrollBarEnabled(false);
        this.m1.i(new oq1((byte) 14));
        this.m1.setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
        this.m1.setClipToPadding(false);
        this.m1.setEnabled(true);
        zkb.H(this.m1, bkb.z5, this.J0);
        this.m1.setOnTouchListener(new a7(this, (byte) 16));
        this.m1.setOnScrollListener(new n58(this, (byte) 29));
        f09 f09Var = new f09(this, (byte) 17);
        this.B1 = f09Var;
        this.m1.setOnItemClickListener(f09Var);
        this.b.addView(this.m1, nme.d(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 48.0f));
        oc6 oc6Var = new oc6((byte) 27, context, this);
        this.E1 = oc6Var;
        this.b.addView(oc6Var, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.m1.setEmptyView(this.E1);
        this.E1.setOnTouchListener(new jz1((byte) 26));
        l46 l46Var = new l46(context, null);
        this.q1 = l46Var;
        l46Var.setLines(1);
        this.q1.setSingleLine(true);
        zkb.X(this.q1, bkb.i5, this.J0);
        this.q1.setTextSize(1, 20.0f);
        zkb.G(this.q1, bkb.j5, this.J0);
        this.q1.setEllipsize(TextUtils.TruncateAt.END);
        this.q1.setPadding(gl.L(18.0f), gl.L(6.0f), gl.L(18.0f), gl.L(6.0f));
        this.q1.setGravity(16);
        this.q1.setTypeface(gl.o());
        this.b.addView(this.q1, nme.d(-1, 50.0f, 51, 0.0f, 0.0f, 40.0f, 0.0f));
        r7 r7Var = new r7(context, null, 0, bkb.v0(bkb.zj, this.J0), false, this.J0);
        this.r1 = r7Var;
        r7Var.setLongClickEnabled(false);
        this.r1.setSubMenuOpenSide(2);
        this.r1.setIcon(2131231247);
        r7 r7Var2 = this.r1;
        int i4 = bkb.Dj;
        zkb.R(r7Var2, bkb.f0(bkb.v0(i4, this.J0), 1, -1), null, zkb.M(i4), this.J0);
        this.b.addView(this.r1, nme.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
        this.r1.e(1, 2131232368, k96.M0(2131744609, null));
        this.r1.e(2, 2131232208, k96.M0(2131751750, null));
        this.r1.setOnClickListener(new f0b(this, (byte) 1));
        this.r1.setDelegate(new g0b(this));
        this.r1.setContentDescription(k96.M0(2131754838, null));
        r7 r7Var3 = this.r1;
        if (this.P1 != null) {
            i = 0;
        } else {
            i = 8;
        }
        r7Var3.setVisibility(i);
        this.E1.addView(new RadialProgressView(context, null), nme.e(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gl.e1(), 83);
        layoutParams2.bottomMargin = gl.L(48.0f);
        View view2 = new View(context);
        viewArr[1] = view2;
        zkb.h(i3, this.J0, view2);
        this.b.addView(viewArr[1], layoutParams2);
        hn hnVar = new hn(context, false, false, false);
        this.t1 = hnVar;
        int i5 = bkb.g5;
        int v0 = bkb.v0(i5, this.J0);
        int i6 = bkb.h6;
        ff0 g0 = bkb.g0(v0, bkb.v0(i6, this.J0));
        vkb M = zkb.M(i5);
        vkb M2 = zkb.M(i6);
        wjb wjbVar = this.J0;
        hnVar.setBackground(g0);
        zkb.j(hnVar, g0, M, M2, wjbVar);
        hn hnVar2 = this.t1;
        int i7 = bkb.m5;
        this.e2 = i7;
        zkb.U(hnVar2, i7, this.J0);
        this.t1.setTextSize(gl.L(14.0f));
        this.t1.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        this.t1.setTypeface(gl.o());
        this.t1.setGravity(17);
        FrameLayout frameLayout = new FrameLayout(context);
        this.v1 = frameLayout;
        frameLayout.addView(this.t1, nme.c(48.0f, -1));
        this.b.addView(this.v1, nme.e(-1, -2, 83));
        ah8 ah8Var = new ah8(gl.L(24.0f), this.J0, context, false);
        this.u1 = ah8Var;
        ah8Var.setIcon(2131624310);
        this.u1.setVisibility(4);
        this.b.addView(this.u1, nme.d(-1, 48.0f, 87, 8.0f, 0.0f, 8.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.w1 = frameLayout2;
        frameLayout2.setVisibility(8);
        this.w1.setSoundEffectsEnabled(false);
        this.b.addView(this.w1, nme.c(-1.0f, -1));
        this.w1.setOnClickListener(new f0b(this, (byte) 2));
        be0 be0Var = new be0(context);
        this.z1 = be0Var;
        be0Var.setAspectFit(true);
        this.z1.setLayerNum(7);
        this.w1.addView(this.z1);
        TextView textView = new TextView(context);
        this.A1 = textView;
        textView.setTextSize(1, 30.0f);
        this.A1.setGravity(85);
        this.w1.addView(this.A1);
        TextView textView2 = new TextView(context);
        this.x1 = textView2;
        textView2.setTextSize(1, 14.0f);
        zkb.X(this.x1, i7, this.J0);
        zkb.R(this.x1, bkb.g0(bkb.v0(i5, this.J0), bkb.v0(i6, this.J0)), zkb.M(i5), zkb.M(i6), this.J0);
        this.x1.setGravity(17);
        this.x1.setPadding(gl.L(29.0f), 0, gl.L(29.0f), 0);
        this.x1.setTypeface(gl.o());
        this.w1.addView(this.x1, nme.e(-1, 48, 83));
        this.x1.setOnClickListener(new f0b(this, (byte) 3));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, gl.e1(), 83);
        layoutParams3.bottomMargin = gl.L(48.0f);
        View view3 = new View(context);
        this.y1 = view3;
        zkb.h(i3, this.J0, view3);
        this.w1.addView(this.y1, layoutParams3);
        kk7.e().b(this, kk7.k4);
        if (this.R1 != null) {
            kk7.f(this.a).b(this, kk7.T1);
            kk7.f(this.a).b(this, kk7.U1);
        }
        kk7.f(this.a).b(this, kk7.w0);
        T0();
        V0();
        S0();
        R0(false);
        this.n1.f();
    }

    public final boolean K0() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || !stickerSet.emojis) {
            if (tL_messages_stickerSet == null && this.K1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void L0() {
        String str;
        if (this.P1 != null) {
            hq6 d0 = hq6.d0(this.a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
            if (tL_messages_stickerSet == null && (str = this.P1.short_name) != null) {
                tL_messages_stickerSet = d0.q0(str);
                this.M1 = tL_messages_stickerSet;
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
            if (tL_messages_stickerSet == null) {
                tL_messages_stickerSet2 = d0.p0(this.P1.id);
                this.M1 = tL_messages_stickerSet2;
            }
            if (tL_messages_stickerSet2 == null) {
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                tL_messages_getStickerSet.stickerset = this.P1;
                ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getStickerSet, new apa(this, d0, (byte) 5));
            } else {
                if (this.n1 != null) {
                    V0();
                    T0();
                    this.n1.f();
                }
                S0();
                d0.r1(this.M1);
                D0();
            }
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.M1;
        if (tL_messages_stickerSet3 != null) {
            this.b2 = !tL_messages_stickerSet3.set.masks;
        }
        D0();
    }

    public final void M0(s3a s3aVar) {
        int indexOf = this.S1.indexOf(s3aVar);
        if (indexOf >= 0) {
            this.S1.remove(indexOf);
            this.n1.r(indexOf);
            if (this.S1.isEmpty()) {
                dismiss();
            } else {
                T0();
            }
        }
    }

    public final void N0(int i, boolean z) {
        Integer num;
        float f;
        if (this.Q1 == null) {
            View[] viewArr = this.D1;
            if (z) {
                if (viewArr[i].getTag() == null) {
                    return;
                }
            } else if (viewArr[i].getTag() != null) {
                return;
            }
            View view = viewArr[i];
            if (z) {
                num = null;
            } else {
                num = 1;
            }
            view.setTag(num);
            if (z) {
                viewArr[i].setVisibility(0);
            }
            AnimatorSet[] animatorSetArr = this.C1;
            AnimatorSet animatorSet = animatorSetArr[i];
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSetArr[i] = animatorSet2;
            View view2 = viewArr[i];
            Property property = View.ALPHA;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, property, f));
            animatorSetArr[i].setDuration(150L);
            animatorSetArr[i].addListener(new x5(this, i, z));
            animatorSetArr[i].start();
        }
    }

    public final void O0(View.OnClickListener onClickListener, String str, int i) {
        P0(onClickListener, str, i, -1, -1);
    }

    public final void P0(View.OnClickListener onClickListener, String str, int i, int i2, int i3) {
        if (i >= 0) {
            hn hnVar = this.t1;
            this.e2 = i;
            zkb.U(hnVar, i, this.J0);
        }
        this.t1.c(str, false, true);
        this.t1.setOnClickListener(onClickListener);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.t1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.D1[1].getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.m1.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.E1.getLayoutParams();
        if (onClickListener == null) {
            this.t1.setAlpha(0.0f);
        } else if (i2 >= 0 && i3 >= 0) {
            hn hnVar2 = this.t1;
            int L = gl.L(24.0f);
            int v0 = bkb.v0(i2, this.J0);
            int v02 = bkb.v0(i3, this.J0);
            zkb.R(hnVar2, bkb.i0(L, L, L, L, v0, v02, v02), zkb.M(i2), zkb.M(i3), this.J0);
            zkb.h(bkb.g5, this.J0, this.v1);
            int L2 = gl.L(8.0f);
            marginLayoutParams.bottomMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.topMargin = L2;
            marginLayoutParams.leftMargin = L2;
            int L3 = gl.L(64.0f);
            marginLayoutParams2.bottomMargin = L3;
            marginLayoutParams3.bottomMargin = L3;
            marginLayoutParams4.bottomMargin = L3;
            if (this.t1.getAlpha() < 1.0f) {
                ug8.t(this.t1.animate().alpha(1.0f), s33.h, 240L);
            }
        } else {
            hn hnVar3 = this.t1;
            int i4 = bkb.g5;
            int v03 = bkb.v0(i4, this.J0);
            int i5 = bkb.p7;
            zkb.R(hnVar3, bkb.g0(v03, bkb.p1(0.1f, bkb.v0(i5, this.J0))), zkb.M(i4), zkb.K(0.1f, i5), this.J0);
            this.v1.setBackgroundColor(0);
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            int L4 = gl.L(48.0f);
            marginLayoutParams2.bottomMargin = L4;
            marginLayoutParams3.bottomMargin = L4;
            marginLayoutParams4.bottomMargin = L4;
            if (this.t1.getAlpha() < 1.0f) {
                ug8.t(this.t1.animate().alpha(1.0f), s33.h, 240L);
            }
        }
        this.b.requestLayout();
    }

    public final void Q0(int i) {
        this.Y1 = i;
        if (this.Q1 == null) {
            float f = i;
            this.q1.setTranslationY(f);
            if (this.R1 == null) {
                this.r1.setTranslationY(f);
            }
            this.D1[0].setTranslationY(f);
        }
        this.b.invalidate();
    }

    public final void R0(boolean z) {
        this.n1.getClass();
        this.q1.setHighlightColor(bkb.v0(bkb.k5, this.J0));
        this.w1.setBackgroundColor(bkb.v0(bkb.g5, this.J0) & (-536870913));
        this.r1.setIconColor(bkb.v0(bkb.zj, this.J0));
        this.r1.O(bkb.v0(bkb.D8, this.J0), false);
        this.r1.O(bkb.v0(bkb.E8, this.J0), true);
        this.r1.setPopupItemsSelectorColor(bkb.v0(bkb.H5, this.J0));
        this.r1.I(bkb.v0(bkb.F8, this.J0));
        if (this.s1 != null) {
            int v0 = bkb.v0(bkb.p7, this.J0);
            this.s1.d(v0, v0);
            this.s1.setSelectorColor(bkb.p1(0.1f, v0));
            if (this.s1.getRightIcon() != null && v0 != this.o2) {
                this.o2 = v0;
                this.s1.getRightIcon().setColorFilter(v0);
            }
        }
        if (z) {
            if (bkb.f1() && this.n2 == null) {
                ArrayList S = S();
                this.n2 = S;
                int size = S.size();
                for (int i = 0; i < size; i++) {
                    ((blb) this.n2.get(i)).g = null;
                }
            }
            int size2 = this.n2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                blb blbVar = (blb) this.n2.get(i2);
                blbVar.e(bkb.v0(blbVar.e, this.J0), false, false);
            }
        }
        if (!bkb.f1() && this.n2 != null) {
            this.n2 = null;
        }
    }

    @Override
    public final ArrayList S() {
        ArrayList arrayList = new ArrayList();
        t00 t00Var = new t00(this, (byte) 20);
        ViewGroup viewGroup = this.b;
        Drawable[] drawableArr = {this.s0};
        int i = bkb.g5;
        arrayList.add(new blb(viewGroup, 0, (Class[]) null, (Paint) null, drawableArr, (alb) null, i));
        arrayList.add(new blb(this.b, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.yj));
        if (this.n1.r.Q1 != null) {
            m84.a(arrayList, t00Var);
        }
        arrayList.add(new blb(this.r1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Dj));
        arrayList.add(new blb(this.t1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        hn hnVar = this.t1;
        int i2 = bkb.h6;
        arrayList.add(new blb(hnVar, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(this.t1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, this.e2));
        arrayList.add(new blb(this.x1, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.x1, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        return arrayList;
    }

    public final void S0() {
        if (this.b != null && !y6c.h(this.a).p()) {
            k27.U3(this.M1);
        }
    }

    public final void T0() {
        int size;
        int size2;
        ArrayList<TLRPC.Document> arrayList;
        boolean z;
        TLRPC.StickerSet stickerSet;
        String G;
        int i;
        int i2;
        String G2;
        ArrayList<TLRPC.Document> arrayList2;
        TLRPC.StickerSet stickerSet2;
        int size3;
        TLRPC.StickerSet stickerSet3;
        int size4;
        TLRPC.StickerSet stickerSet4;
        TLRPC.StickerSet stickerSet5;
        int i3;
        String M0;
        int i4;
        int i5;
        int i6;
        TLRPC.StickerSet stickerSet6;
        boolean z2;
        TLRPC.StickerSet stickerSet7;
        float f;
        if (this.q1 == null) {
            return;
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.M1;
        int i7 = 1;
        if (tL_messages_stickerSet != null && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
            CharSequence m = vu3.m(this.M1.set.title, this.q1.getPaint().getFontMetricsInt(), false, null, 0);
            try {
                Pattern pattern = this.l1;
                if (pattern == null) {
                    pattern = Pattern.compile("@[a-zA-Z\\d_]{1,32}");
                    this.l1 = pattern;
                }
                Matcher matcher = pattern.matcher(m);
                SpannableStringBuilder spannableStringBuilder = null;
                while (matcher.find()) {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder(m);
                    }
                    int start = matcher.start();
                    int end = matcher.end();
                    if (this.M1.set.title.charAt(start) != '@') {
                        start++;
                    }
                    spannableStringBuilder.setSpan(new ui((byte) 4, this, m.subSequence(start + 1, end).toString()), start, end, 0);
                }
                if (spannableStringBuilder != null) {
                    m = spannableStringBuilder;
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            this.q1.setText(m);
            if (K0()) {
                int measuredWidth = this.m1.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = gl.q.x;
                }
                q0b q0bVar = this.n1;
                if (gl.O1()) {
                    f = 60.0f;
                } else {
                    f = 45.0f;
                }
                q0bVar.d = Math.max(1, measuredWidth / gl.L(f));
            } else {
                this.n1.d = 5;
            }
            this.G1.x1(this.n1.d);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.M1;
            int i8 = -1;
            if (tL_messages_stickerSet2 != null && (stickerSet7 = tL_messages_stickerSet2.set) != null && stickerSet7.emojis && !y6c.h(this.a).p() && this.X1 == null) {
                if (this.M1.documents != null) {
                    for (int i9 = 0; i9 < this.M1.documents.size(); i9++) {
                        if (!k27.m3(this.M1.documents.get(i9))) {
                            this.u1.setVisibility(0);
                            this.t1.setBackground(null);
                            O0(null, null, -1);
                            this.u1.b(k96.M0(2131743626, null), new f0b(this, (byte) 0), false);
                            return;
                        }
                    }
                }
            } else {
                this.u1.setVisibility(4);
            }
            hq6 d0 = hq6.d0(this.a);
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = this.M1;
            if (tL_messages_stickerSet3 != null && (stickerSet6 = tL_messages_stickerSet3.set) != null && stickerSet6.emojis) {
                ArrayList t0 = d0.t0(5);
                for (int i10 = 0; t0 != null && i10 < t0.size(); i10++) {
                    if (t0.get(i10) != null && ((TLRPC.TL_messages_stickerSet) t0.get(i10)).set != null && ((TLRPC.TL_messages_stickerSet) t0.get(i10)).set.id == this.M1.set.id) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
                z = !z2;
            } else if (tL_messages_stickerSet3 != null && (stickerSet = tL_messages_stickerSet3.set) != null && d0.D0(stickerSet.id, true)) {
                z = false;
            } else {
                z = true;
            }
            gb5 gb5Var = this.X1;
            if (gb5Var != null) {
                f0b f0bVar = new f0b(this, (byte) 5);
                boolean z3 = gb5Var.c.O;
                boolean z4 = gb5Var.a;
                if (z3) {
                    if (z4) {
                        i6 = 2131746117;
                    } else {
                        i6 = 2131745352;
                    }
                    M0 = k96.M0(i6, null);
                } else {
                    if (z4) {
                        i3 = 2131746116;
                    } else {
                        i3 = 2131745351;
                    }
                    M0 = k96.M0(i3, null);
                }
                String str = M0;
                boolean z5 = this.X1.a;
                if (z5) {
                    i4 = bkb.p7;
                } else {
                    i4 = bkb.Ii;
                }
                if (!z5) {
                    i5 = bkb.Ei;
                } else {
                    i5 = -1;
                }
                if (!z5) {
                    i8 = bkb.Gi;
                }
                P0(f0bVar, str, i4, i5, i8);
                return;
            }
            if (z) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = this.M1;
                if (tL_messages_stickerSet4 != null && (stickerSet5 = tL_messages_stickerSet4.set) != null && stickerSet5.emojis) {
                    i7 = 5;
                } else if (tL_messages_stickerSet4 == null || (stickerSet4 = tL_messages_stickerSet4.set) == null || !stickerSet4.masks) {
                    i7 = 0;
                }
                if (!d0.X[i7]) {
                    d0.D(i7);
                    P0(null, "", -1, -1, -1);
                    return;
                }
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet5 = this.M1;
            if (z) {
                if (tL_messages_stickerSet5 != null && (stickerSet3 = tL_messages_stickerSet5.set) != null && stickerSet3.masks) {
                    ArrayList<TLRPC.Document> arrayList3 = tL_messages_stickerSet5.documents;
                    if (arrayList3 == null) {
                        size4 = 0;
                    } else {
                        size4 = arrayList3.size();
                    }
                    G2 = k96.G(size4, "AddManyMasksCount", new Object[0]);
                } else if (tL_messages_stickerSet5 != null && (stickerSet2 = tL_messages_stickerSet5.set) != null && stickerSet2.emojis) {
                    ArrayList<TLRPC.Document> arrayList4 = tL_messages_stickerSet5.documents;
                    if (arrayList4 == null) {
                        size3 = 0;
                    } else {
                        size3 = arrayList4.size();
                    }
                    G2 = k96.G(size3, "AddManyEmojiCount", new Object[0]);
                } else {
                    if (tL_messages_stickerSet5 != null && (arrayList2 = tL_messages_stickerSet5.documents) != null) {
                        i2 = arrayList2.size();
                    } else {
                        i2 = 0;
                    }
                    G2 = k96.G(i2, "AddManyStickersCount", new Object[0]);
                }
                P0(new f0b(this, (byte) 9), G2, bkb.Ii, bkb.Ei, bkb.Gi);
            } else {
                TLRPC.StickerSet stickerSet8 = tL_messages_stickerSet5.set;
                boolean z6 = stickerSet8.creator;
                if (z6) {
                    if (this.L1) {
                        i = 2131751342;
                    } else {
                        i = 2131751209;
                    }
                    G = k96.M0(i, null);
                } else if (stickerSet8.masks) {
                    G = k96.G(tL_messages_stickerSet5.documents.size(), "RemoveManyMasksCount", new Object[0]);
                } else {
                    boolean z7 = stickerSet8.emojis;
                    ArrayList<TLRPC.Document> arrayList5 = tL_messages_stickerSet5.documents;
                    if (z7) {
                        G = k96.G(arrayList5.size(), "RemoveManyEmojiCount", new Object[0]);
                    } else {
                        G = k96.G(arrayList5.size(), "RemoveManyStickersCount", new Object[0]);
                    }
                }
                String str2 = G;
                if (z6) {
                    P0(new f0b(this, (byte) 10), str2, bkb.Ii, bkb.Ei, bkb.Gi);
                } else if (this.M1.set.official) {
                    O0(new f0b(this, (byte) 11), str2, bkb.p7);
                } else {
                    O0(new f0b(this, (byte) 12), str2, bkb.p7);
                }
            }
            this.n1.f();
            return;
        }
        ArrayList arrayList6 = this.R1;
        if (arrayList6 != null) {
            l46 l46Var = this.q1;
            ArrayList arrayList7 = this.S1;
            if (arrayList7 != null) {
                size = arrayList7.size();
            } else {
                size = arrayList6.size();
            }
            l46Var.setText(k96.G(size, "Stickers", new Object[0]));
            HashMap hashMap = this.T1;
            if (hashMap != null && !hashMap.isEmpty()) {
                O0(null, k96.M0(2131749037, null), bkb.p5);
                this.t1.setEnabled(false);
                return;
            }
            f0b f0bVar2 = new f0b(this, (byte) 13);
            ArrayList arrayList8 = this.S1;
            if (arrayList8 != null) {
                size2 = arrayList8.size();
            } else {
                size2 = arrayList6.size();
            }
            O0(f0bVar2, k96.a0("ImportStickers", null, 2131749050, k96.G(size2, "Stickers", new Object[0])), bkb.m5);
            this.t1.setEnabled(true);
            return;
        }
        O0(new f0b(this, (byte) 14), k96.M0(2131752029, null), bkb.m5);
    }

    public final void U0() {
        if (this.m1.getChildCount() <= 0) {
            Q0(this.m1.getPaddingTop());
            return;
        }
        int i = 0;
        View view = null;
        int i2 = -1;
        for (int i3 = 0; i3 < this.m1.getChildCount(); i3++) {
            View childAt = this.m1.getChildAt(i3);
            this.m1.getClass();
            int R = RecyclerView.R(childAt);
            if (i2 == -1 || i2 > R) {
                view = childAt;
                i2 = R;
            }
        }
        if (view != null && view.getTop() >= 0) {
            int top = view.getTop();
            N0(0, false);
            i = top;
        } else {
            N0(0, true);
        }
        N0(1, true);
        if (this.Y1 != i) {
            Q0(i);
        }
    }

    public final void V0() {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        Point point = gl.q;
        int min = (int) ((Math.min(point.x, point.y) / 2) / gl.p);
        if (this.R1 != null) {
            this.x1.setText(k96.M0(2131749036, null));
            zkb.X(this.x1, bkb.p7, this.J0);
            float f = min;
            this.z1.setLayoutParams(nme.d(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.A1.setLayoutParams(nme.d(min, f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.x1.setVisibility(0);
            this.y1.setVisibility(0);
        } else if (this.V1 != null && ((tL_messages_stickerSet = this.M1) == null || !tL_messages_stickerSet.set.masks)) {
            this.x1.setText(k96.M0(2131745397, null));
            float f2 = min;
            this.z1.setLayoutParams(nme.d(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.A1.setLayoutParams(nme.d(min, f2, 17, 0.0f, 0.0f, 0.0f, 30.0f));
            this.x1.setVisibility(0);
            this.y1.setVisibility(0);
        } else {
            this.x1.setText(k96.M0(2131752029, null));
            this.z1.setLayoutParams(nme.e(min, min, 17));
            this.A1.setLayoutParams(nme.e(min, min, 17));
            this.x1.setVisibility(8);
            this.y1.setVisibility(8);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            ns9 ns9Var = this.m1;
            if (ns9Var != null) {
                int childCount = ns9Var.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.m1.getChildAt(i3).invalidate();
                }
            }
        } else if (i == kk7.T1) {
            HashMap hashMap = this.T1;
            if (hashMap != null) {
                String str = (String) objArr[0];
                s3a s3aVar = (s3a) hashMap.get(str);
                if (s3aVar != null) {
                    s3aVar.a(this.a, (TLRPC.InputFile) objArr[1], new q3a(this, str, s3aVar, (byte) 23));
                }
            }
        } else if (i == kk7.U1) {
            HashMap hashMap2 = this.T1;
            if (hashMap2 != null) {
                s3a s3aVar2 = (s3a) hashMap2.remove((String) objArr[0]);
                if (s3aVar2 != null) {
                    M0(s3aVar2);
                }
                if (this.T1.isEmpty()) {
                    T0();
                }
            }
        } else if (i == kk7.w0) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = null;
            if (this.P1 != null) {
                hq6 d0 = hq6.d0(this.a);
                String str2 = this.P1.short_name;
                if (str2 != null) {
                    tL_messages_stickerSet = d0.q0(str2);
                }
                if (tL_messages_stickerSet == null) {
                    tL_messages_stickerSet = d0.p0(this.P1.id);
                }
            }
            if (tL_messages_stickerSet != null && tL_messages_stickerSet != this.M1) {
                this.M1 = tL_messages_stickerSet;
                L0();
            }
            T0();
        }
    }

    @Override
    public void dismiss() {
        super.dismiss();
        this.f2.o(false);
        Runnable runnable = this.m2;
        if (runnable != null) {
            runnable.run();
        }
        if (this.Z1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.Z1, true);
            this.Z1 = 0;
        }
        kk7.e().n(this, kk7.k4);
        if (this.R1 != null) {
            ArrayList arrayList = this.S1;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    s3a s3aVar = (s3a) this.S1.get(i);
                    if (!s3aVar.c) {
                        ba4.G(this.a).b(s3aVar.a, false);
                    }
                    if (s3aVar.e) {
                        new File(s3aVar.a).delete();
                    }
                }
            }
            kk7.f(this.a).n(this, kk7.T1);
            kk7.f(this.a).n(this, kk7.U1);
        }
        kk7.f(this.a).n(this, kk7.w0);
        kk7.e().k(kk7.j1, 4);
    }

    @Override
    public final void n(Runnable runnable) {
        this.m2 = runnable;
    }

    @Override
    public final void onBackPressed() {
        if (xv2.e().E) {
            xv2.e().c();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onStart() {
        super.onStart();
        m21.a((FrameLayout) this.b, new s10(this, (byte) 19));
    }

    @Override
    public final void onStop() {
        super.onStop();
        m21.h((FrameLayout) this.b);
    }

    @Override
    public final void p0() {
        super.p0();
        R0(false);
        try {
            int v0 = bkb.v0(bkb.g5, this.J0);
            if (this.s0 != null && v0 != this.p2) {
                this.p2 = v0;
                s0(v0);
            }
            ViewGroup viewGroup = this.b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void show() {
        super.show();
        kk7.e().k(kk7.i1, 4);
    }

    public u0b(Context context, String str, ArrayList arrayList, ArrayList arrayList2) {
        super(1, (wjb) null, context, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new ep((byte) 6);
        this.g2 = new j0b(this);
        K();
        this.H1 = (Activity) context;
        this.R1 = arrayList;
        this.U1 = str;
        Utilities.e.c(new q3a(this, arrayList, arrayList2, (byte) 27));
        J0(context);
    }

    public u0b(Context context, d dVar, TLRPC.InputStickerSet inputStickerSet, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, r0b r0bVar, wjb wjbVar) {
        super(1, wjbVar, context, false);
        this.C1 = new AnimatorSet[2];
        this.D1 = new View[2];
        this.d2 = true;
        this.f2 = new ep((byte) 6);
        this.g2 = new j0b(this);
        K();
        this.V1 = r0bVar;
        this.P1 = inputStickerSet;
        this.M1 = tL_messages_stickerSet;
        this.F1 = dVar;
        L0();
        J0(context);
    }
}
