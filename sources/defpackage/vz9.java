package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public abstract class vz9 extends FrameLayout implements jm7, vlb {
    public static String[] c2;
    public final SparseIntArray A0;
    public boolean A1;
    public final ArrayList B0;
    public String B1;
    public final ArrayList C0;
    public ArrayList C1;
    public boolean D0;
    public ArrayList D1;
    public int E;
    public final ArrayList E0;
    public ArrayList E1;
    public int F;
    public final ArrayList F0;
    public ArrayList F1;
    public int G;
    public final ArrayList G0;
    public ValueAnimator G1;
    public az9 H;
    public final ArrayList H0;
    public boolean H1;
    public tz9 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public zx9 K1;
    public final HashSet L;
    public final ArrayList L0;
    public hy6 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public fz9 P;
    public boolean P0;
    public int P1;
    public boolean Q;
    public Integer Q0;
    public int Q1;
    public boolean R;
    public boolean R0;
    public long R1;
    public boolean S;
    public List S0;
    public yxa S1;
    public final ArrayList T;
    public fz9 T0;
    public final zx9 T1;
    public boolean U;
    public boolean U0;
    public final zx9 U1;
    public wy9 V;
    public float V0;
    public lz9 V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public vm X0;
    public ValueAnimator X1;
    public ly9 Y0;
    public final po Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int a;
    public final int a0;
    public final ylb a1;
    public Integer a2;
    public int b;
    public final qy9 b0;
    public float b1;
    public int c;
    public final a91 c0;
    public float c1;
    public int d;
    public final mz3[] d0;
    public final d d1;
    public int e;
    public mz3 e0;
    public final byte e1;
    public int f;
    public final oy9 f0;
    public final uy9 f1;
    public final ny9 g0;
    public int g1;
    public int h;
    public final ct8 h0;
    public boolean h1;
    public final ty9 i0;
    public boolean i1;
    public final jy9 j0;
    public ValueAnimator j1;
    public final FrameLayout k0;
    public Drawable k1;
    public final qw9 l0;
    public PorterDuffColorFilter l1;
    public final bf0 m0;
    public final boolean m1;
    public int n;
    public final View n0;
    public float n1;
    public final o72 o0;
    public int o1;
    public final View p0;
    public tm p1;
    public final vy9 q0;
    public Rect q1;
    public int r;
    public final gz9 r0;
    public View r1;
    public int s;
    public final ky9 s0;
    public float s1;
    public final cw6 t0;
    public fz9 t1;
    public final View u0;
    public Rect u1;
    public int v0;
    public final OvershootInterpolator v1;
    public int w;
    public final ArrayList w0;
    public ValueAnimator w1;
    public int x;
    public final SparseIntArray x0;
    public boolean x1;
    public int y;
    public final SparseIntArray y0;
    public boolean y1;
    public final SparseIntArray z0;
    public boolean z1;
    public static final List b2 = Arrays.asList("😖", "😫", "🫠", "😨", "❓");
    public static final boolean[] d2 = new boolean[4];
    public static final HashMap e2 = new HashMap();

    public vz9(org.telegram.ui.ActionBar.d r40, android.content.Context r41, boolean r42, java.lang.Integer r43, int r44, boolean r45, defpackage.ylb r46, int r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz9.<init>(org.telegram.ui.ActionBar.d, android.content.Context, boolean, java.lang.Integer, int, boolean, ylb, int, int):void");
    }

    public static void D(int i, bf0 bf0Var) {
        List list;
        gn5 b;
        String str;
        if (bf0Var != null) {
            ArrayList arrayList = new ArrayList(hs6.d0(i).t0[1]);
            Collections.shuffle(arrayList);
            int round = (int) Math.round(Math.random() * 10.0d);
            TLRPC.Document document = null;
            int i2 = 0;
            while (true) {
                int size = arrayList.size();
                list = b2;
                if (i2 >= size) {
                    break;
                }
                if ((arrayList.get(i2) instanceof TLRPC.TL_stickerSetFullCovered) && ((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents != null) {
                    ArrayList arrayList2 = new ArrayList(((TLRPC.TL_stickerSetFullCovered) arrayList.get(i2)).documents);
                    Collections.shuffle(arrayList2);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
                        if (document2 != null && list.contains(k47.V(document2, null, null))) {
                            int i4 = round - 1;
                            if (round <= 0) {
                                round = i4;
                                document = document2;
                                break;
                            }
                            round = i4;
                            document = document2;
                        }
                        i3++;
                    }
                }
                if (document != null && round <= 0) {
                    break;
                }
                i2++;
            }
            if (document == null || round > 0) {
                ArrayList arrayList3 = new ArrayList(hs6.d0(i).t0(5));
                Collections.shuffle(arrayList3);
                for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                    if (arrayList3.get(i5) != null && ((TLRPC.TL_messages_stickerSet) arrayList3.get(i5)).documents != null) {
                        ArrayList arrayList4 = new ArrayList(((TLRPC.TL_messages_stickerSet) arrayList3.get(i5)).documents);
                        Collections.shuffle(arrayList4);
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList4.size()) {
                                break;
                            }
                            TLRPC.Document document3 = (TLRPC.Document) arrayList4.get(i6);
                            if (document3 != null && list.contains(k47.V(document3, null, null))) {
                                int i7 = round - 1;
                                if (round <= 0) {
                                    round = i7;
                                    document = document3;
                                    break;
                                }
                                round = i7;
                                document = document3;
                            }
                            i6++;
                        }
                    }
                    if (document != null && round <= 0) {
                        break;
                    }
                }
            }
            if (document != null) {
                meb d = eq3.d(document.thumbs, cmb.l6, 0.2f, false);
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = gn5.b(document);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && k47.K2(document, false)) {
                        d.e = 512;
                        d.f = 512;
                    }
                    b = gn5.b(document);
                    str = "36_36";
                }
                bf0Var.setLayerNum(7);
                bf0Var.setRoundRadius(gm.L(4.0f));
                bf0Var.j(b, str, gn5.c(w, document), "36_36", d, document);
            }
        }
    }

    public static void a(vz9 vz9Var, vm vmVar) {
        vz9Var.setBigReactionAnimatedEmoji(vmVar);
    }

    public int getCacheType() {
        int i = 13;
        int i2 = this.a0;
        if (i2 != 5 && i2 != 7) {
            if (i2 == 6) {
                return vm.f();
            }
            if (i2 != 3 && i2 != 4) {
                i = 2;
                if (i2 != 0 && i2 != 12 && i2 != 9 && i2 != 10 && i2 != 2) {
                    return 3;
                }
            }
        }
        return i;
    }

    public Drawable getPremiumStar() {
        Drawable d;
        if (this.k1 == null) {
            int i = this.a0;
            if (i != 5 && i != 9 && i != 10 && i != 7) {
                d = b10.d(a.b, 2131232368);
                this.k1 = d;
            } else {
                d = b10.d(a.b, 2131232139);
                this.k1 = d;
            }
            d.setColorFilter(this.l1);
        }
        return this.k1;
    }

    public static ArrayList i(ArrayList arrayList, HashSet hashSet) {
        if (hashSet == null) {
            return arrayList;
        }
        int i = 0;
        while (i < arrayList.size()) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            if (document == null || hashSet.contains(Long.valueOf(document.id))) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        return arrayList;
    }

    public static TLRPC.Document j(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        long j;
        if (tL_messages_stickerSet == null) {
            return null;
        }
        String c = gw3.c(str);
        int i = 0;
        while (true) {
            if (i < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i).documents.isEmpty() && TextUtils.equals(gw3.c(tL_messages_stickerSet.packs.get(i).emoticon), c)) {
                    j = tL_messages_stickerSet.packs.get(i).documents.get(0).longValue();
                    break;
                }
                i++;
            } else {
                j = 0;
                break;
            }
        }
        if (j == 0) {
            return null;
        }
        for (int i2 = 0; i2 < tL_messages_stickerSet.documents.size(); i2++) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(i2);
            if (document.id == j) {
                return document;
            }
        }
        return null;
    }

    public static void s(int i) {
        boolean[] zArr = d2;
        if (!zArr[i]) {
            hs6.d0(i);
            zArr[i] = true;
            hs6.d0(i).D(5);
            hs6.d0(i).N(0, true);
            hs6.d0(i).C();
            hs6.d0(i).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            hs6.d0(i).R();
            hs6.d0(i).x();
            u0b.F3.c(i, 1, new yg3(i, (byte) 1));
        }
    }

    public void setBigReactionAnimatedEmoji(vm vmVar) {
        vm vmVar2;
        if (this.J && (vmVar2 = this.X0) != vmVar) {
            if (vmVar2 != null) {
                vmVar2.o(this);
            }
            this.X0 = vmVar;
            if (vmVar != null) {
                vmVar.setColorFilter(this.l1);
                this.X0.b(this);
            }
        }
    }

    public final void A(Long l) {
        this.L.remove(l);
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < ty9Var.getChildCount(); i2++) {
                if (ty9Var.getChildAt(i2) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i2);
                    gn gnVar = fz9Var.e;
                    if (gnVar != null && gnVar.getDocumentId() == l.longValue()) {
                        fz9Var.f();
                    } else {
                        TLRPC.Document document = fz9Var.d;
                        if (document != null && document.id == l.longValue()) {
                            fz9Var.f();
                        }
                    }
                    z = true;
                }
            }
            ty9Var.invalidate();
            if (!z) {
                while (true) {
                    ArrayList arrayList = this.w0;
                    if (i < arrayList.size()) {
                        long longValue = ((Long) arrayList.get(i)).longValue();
                        if (longValue == (l.longValue() * 13) + 62425 || longValue == (l.longValue() * 13) + 3212) {
                            break;
                        }
                        i++;
                    } else {
                        return;
                    }
                }
                vy9 vy9Var = this.q0;
                if (vy9Var != null) {
                    vy9Var.g(i);
                }
            }
        }
    }

    public final void B(boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz9.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        ny9 ny9Var = this.g0;
        if (ny9Var == null) {
            return;
        }
        if (this.A1) {
            ny9Var.clearAnimation();
            ny9Var.setVisibility(0);
            ny9Var.animate().translationY(0.0f).start();
            return;
        }
        ty9 ty9Var = this.i0;
        if (ty9Var.getChildCount() > 0) {
            View childAt = ty9Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.a && "searchbox".equals(childAt.getTag())) {
                ny9Var.setVisibility(0);
                ny9Var.setTranslationY(childAt.getY());
                return;
            }
            ny9Var.setTranslationY(-gm.L(52.0f));
            return;
        }
        ny9Var.setTranslationY(-gm.L(52.0f));
    }

    public final void E(float f) {
        int i;
        int i2 = -1;
        View view = this.n0;
        if (view != null) {
            float interpolation = d53.g.getInterpolation(pqe.a((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (m()) {
                i = -1;
            } else {
                i = 1;
            }
            view.setScaleY(interpolation * i);
        }
        o72 o72Var = this.o0;
        if (o72Var != null) {
            float a = pqe.a((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            o72Var.setAlpha(a);
            o72Var.setScaleX(a);
            if (!m()) {
                i2 = 1;
            }
            o72Var.setScaleY(a * i2);
        }
        float f2 = 800.0f * f;
        float f3 = f2 - 40.0f;
        float a2 = pqe.a(f3 / 700.0f, 0.0f, 1.0f);
        float a3 = pqe.a((f2 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a4 = pqe.a(f3 / 750.0f, 0.0f, 1.0f);
        float a5 = pqe.a((f2 - 30.0f) / 120.0f, 0.0f, 1.0f);
        d53 d53Var = d53.h;
        float interpolation2 = d53Var.getInterpolation(a2);
        float interpolation3 = d53Var.getInterpolation(a3);
        this.c0.setAlpha(a5);
        this.g0.setAlpha(a5);
        int i3 = 0;
        for (int i4 = 0; i4 < this.e0.b.getChildCount(); i4++) {
            this.e0.b.getChildAt(i4).setAlpha(a5);
        }
        if (this.p1 != null) {
            invalidate();
        }
        float f4 = 1.0f - a5;
        qy9 qy9Var = this.b0;
        qy9Var.setTranslationY(gm.L(-5.0f) * f4);
        if (o72Var != null) {
            o72Var.setTranslationY(gm.L(-5.0f) * f4);
        }
        this.b1 = (interpolation2 * 0.85f) + 0.15f;
        this.c1 = (interpolation3 * 0.925f) + 0.075f;
        qy9Var.invalidateOutline();
        if (o72Var != null) {
            o72Var.setAlpha(a5);
        }
        oy9 oy9Var = this.f0;
        oy9Var.setAlpha(a5);
        oy9Var.setScaleX(Math.min(this.b1, 1.0f));
        float pivotX = oy9Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(qy9Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(qy9Var.getHeight(), 2.0d) + Math.pow(qy9Var.getWidth() - pivotX, 2.0d)));
        for (int i5 = 0; i5 < this.e0.b.getChildCount(); i5++) {
            View childAt = this.e0.b.getChildAt(i5);
            if (f == 0.0f) {
                childAt.setLayerType(2, null);
            } else if (f == 1.0f) {
                childAt.setLayerType(0, null);
            }
            float width = ((childAt.getWidth() / 2.0f) + childAt.getLeft()) - pivotX;
            float height = (childAt.getHeight() / 2.0f) + childAt.getTop();
            if (m()) {
                height = getMeasuredHeight() - height;
            }
            float s = gm.s(a4, (float) Math.sqrt(b10.w(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s)) {
                s = 0.0f;
            }
            childAt.setScaleX(s);
            childAt.setScaleY(s);
        }
        while (true) {
            ty9 ty9Var = this.i0;
            if (i3 < ty9Var.getChildCount()) {
                View childAt2 = ty9Var.getChildAt(i3);
                if (childAt2 instanceof fz9) {
                    fz9 fz9Var = (fz9) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (m()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s2 = gm.s(a4, (float) Math.sqrt(b10.w(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s2)) {
                        s2 = 0.0f;
                    }
                    fz9Var.setAnimatedScale(s2);
                }
                i3++;
            } else {
                this.l0.invalidate();
                ty9Var.invalidate();
                return;
            }
        }
    }

    public boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        return true;
    }

    public final long d() {
        return Math.max(450L, Math.min(55, this.Q1 - this.P1) * 30);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x0;
        zx9 zx9Var = this.U1;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                gm.r(zx9Var);
                gm.c3(zx9Var);
            }
        } else if (i == nm7.A0) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
        } else if (i == nm7.C1) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
        } else if (i == nm7.B0) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
        } else if (i == nm7.m4) {
            bn0 bn0Var = new bn0((byte) 12);
            ty9 ty9Var = this.i0;
            gm.d0(ty9Var, bn0Var);
            if (ty9Var != null) {
                ty9Var.invalidate();
            }
        } else if (i == nm7.I3 && ((Long) objArr[0]).longValue() == z8c.h(this.W).e()) {
            gm.r(zx9Var);
            gm.c3(zx9Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i;
        float f;
        float measuredHeight;
        tm tmVar = this.p1;
        if (tmVar != null && (num = this.Z0) != null) {
            Rect bounds = tmVar.getBounds();
            View view = this.r1;
            if (view == null) {
                scaleY = 1.0f;
            } else {
                scaleY = view.getScaleY();
            }
            int alpha = this.p1.getAlpha();
            View view2 = this.r1;
            if (view2 == null) {
                bounds.height();
            } else {
                view2.getHeight();
            }
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.p1.w = (int) (Math.pow(this.b0.getAlpha(), 0.25d) * alpha * this.n1);
            if (this.q1 == null) {
                this.q1 = new Rect();
            }
            if (scaleY > 1.0f && scaleY < 1.5f) {
                i = 2;
            } else {
                i = 0;
            }
            float f2 = i;
            if (scaleY > 1.5f) {
                f = (bounds.height() * 0.81f) + 1.0f;
            } else {
                f = 0.0f;
            }
            float intValue = num.intValue() + f2;
            float A = td4.A(scaleY, 1.0f, bounds.centerY(), -f);
            boolean m = m();
            byte b = this.e1;
            if (!m) {
                measuredHeight = gm.L(b);
            } else {
                measuredHeight = getMeasuredHeight() - (gm.L(b) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + A + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            tm tmVar2 = this.p1;
            Rect rect = this.q1;
            int i2 = rect.left;
            Rect rect2 = this.q1;
            tmVar2.setBounds(i2, rect.top, (int) ((rect.width() / scaleY) + i2), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.p1.draw(canvas);
            tm tmVar3 = this.p1;
            tmVar3.w = alpha;
            tmVar3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        fz9 fz9Var = this.t1;
        if (fz9Var != null && this.u1 != null && fz9Var.F != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.t1.F.setAlpha((int) (this.s1 * 255.0f));
            this.t1.F.setBounds(this.u1);
            this.t1.F.setColorFilter(new PorterDuffColorFilter(on2.f(1.0f - this.n1, this.g1, this.o1), PorterDuff.Mode.SRC_IN));
            this.t1.F.draw(canvas);
            canvas.restore();
        }
    }

    public final long e() {
        return Math.max(300L, Math.min(45, this.Q1 - this.P1) * 25) + d() + 16;
    }

    public final void f() {
        View view;
        float f;
        if (this.H1) {
            view = this.j0;
        } else {
            view = this.i0;
        }
        boolean canScrollVertically = view.canScrollVertically(1);
        if (canScrollVertically != this.x1) {
            this.x1 = canScrollVertically;
            ViewPropertyAnimator animate = this.p0.animate();
            if (canScrollVertically) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            wi8.s(animate, f, 200L);
        }
    }

    public final boolean g() {
        if (!this.U) {
            ValueAnimator valueAnimator = this.W1;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public yxa getCollectionParticles() {
        yxa yxaVar = this.S1;
        if (yxaVar == null) {
            yxa yxaVar2 = new yxa(1, 8);
            this.S1 = yxaVar2;
            return yxaVar2;
        }
        return yxaVar;
    }

    public long getDialogId() {
        return z8c.h(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz9.h(int, android.view.View):void");
    }

    public final void k() {
        String str;
        int i = this.a0;
        if (i != 2) {
            StringBuilder sb = new StringBuilder("emoji");
            if (i != 0 && i != 12 && i != 9 && i != 10) {
                str = "reaction";
            } else {
                str = "status";
            }
            String j = b10.j(sb, str, "usehint");
            int i2 = oc7.d1().getInt(j, 0);
            if (i2 <= 3) {
                oc7.d1().edit().putInt(j, i2 + 1).apply();
            }
        }
    }

    public final boolean m() {
        int i = this.a0;
        if (i != 5 && i != 10 && i != 12 && i != 15) {
            return false;
        }
        return true;
    }

    public final void n(android.view.View r14, defpackage.gn r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz9.n(android.view.View, gn):void");
    }

    public abstract void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i = this.W;
        nm7.f(i).b(this, nm7.A0);
        nm7.f(i).b(this, nm7.x0);
        nm7.f(i).b(this, nm7.C1);
        nm7.f(i).b(this, nm7.B0);
        nm7.e().b(this, nm7.m4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            nm7.f(i).b(this, nm7.I3);
        }
        tm tmVar = this.p1;
        if (tmVar != null) {
            tmVar.n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i = this.W;
        nm7.f(i).n(this, nm7.A0);
        nm7.f(i).n(this, nm7.x0);
        nm7.f(i).n(this, nm7.C1);
        nm7.f(i).n(this, nm7.B0);
        nm7.e().n(this, nm7.m4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            nm7.f(i).n(this, nm7.I3);
        }
        tm tmVar = this.p1;
        if (tmVar != null) {
            tmVar.n = null;
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.a0 == 6) {
            this.s0.x1((getMeasuredWidth() / gm.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.R0;
        int i3 = this.a0;
        if (z && i3 != 3 && i3 != 4) {
            Point point = gm.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(gm.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(gm.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i3 == 6) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (gm.q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void r(lz9 lz9Var) {
        Integer num = this.a2;
        if (num != null) {
            Parcelable parcelable = (Parcelable) e2.get(num);
        }
        this.V1 = lz9Var;
        boolean z = this.R0;
        ty9 ty9Var = this.i0;
        if (!z) {
            f();
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                View childAt = ty9Var.getChildAt(i);
                childAt.setScaleX(1.0f);
                childAt.setScaleY(1.0f);
            }
            return;
        }
        ValueAnimator valueAnimator = this.W1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.W1 = null;
        }
        ValueAnimator valueAnimator2 = this.X1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.X1 = null;
        }
        int i2 = this.a0;
        if (i2 != 3 && i2 != 4 && i2 != 6) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.W1 = ofFloat;
            ofFloat.addUpdateListener(new yx9(this, (byte) 0));
            this.W1.addListener(new c39(this, (byte) 10));
            zx9 zx9Var = new zx9(this, (byte) 0);
            oi5.f = true;
            oi5.e = true;
            oi5.g = false;
            if (oi5.d) {
                oi5.d = false;
            }
            oi5.c = zx9Var;
            nm7.e().k(nm7.j1, 512);
            this.Y1.d();
            this.W1.setDuration(800L);
            ty9Var.setLayerType(2, null);
            this.g0.setLayerType(2, null);
            this.f0.setLayerType(2, null);
            this.c0.setLayerType(2, null);
            o72 o72Var = this.o0;
            if (o72Var != null) {
                o72Var.setLayerType(2, null);
            }
            View view = this.n0;
            if (view != null) {
                view.setLayerType(2, null);
            }
            this.e0.m(true);
            E(0.0f);
            return;
        }
        f();
        E(1.0f);
    }

    public void setAnimationsEnabled(boolean z) {
        this.Q = z;
    }

    public void setBackgroundDelegate(wy9 wy9Var) {
        this.V = wy9Var;
    }

    public void setDrawBackground(boolean z) {
        this.R0 = z;
        this.b0.setClipToOutline(z);
        a91 a91Var = this.c0;
        if (!z) {
            a91Var.setVisibility(8);
        } else {
            a91Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z) {
        if (this.U != z) {
            this.U = z;
            if (!z) {
                gm.d0(this.i0, new bn0((byte) 26));
                int i = 0;
                while (true) {
                    int childCount = this.e0.b.getChildCount();
                    mz3 mz3Var = this.e0;
                    if (i < childCount) {
                        View childAt = mz3Var.b.getChildAt(i);
                        childAt.setScaleX(1.0f);
                        childAt.setScaleY(1.0f);
                        i++;
                    } else {
                        mz3Var.b.invalidate();
                        return;
                    }
                }
            }
        }
    }

    public void setExpireDateHint(int i) {
        if (i <= 0) {
            return;
        }
        this.P0 = true;
        this.Q0 = Integer.valueOf(i);
        B(true, false, true);
    }

    public void setForUser(boolean z) {
        this.S = z;
        B(false, false, true);
    }

    public void setForumIconDrawable(Drawable drawable) {
        this.O = drawable;
        fz9 fz9Var = this.P;
        if (fz9Var != null) {
            fz9Var.h.g0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z) {
        this.i1 = z;
    }

    public void setOnLongPressedListener(tz9 tz9Var) {
        this.I = tz9Var;
    }

    public void setRecentReactions(List<k39> list) {
        this.S0 = list;
        B(false, true, true);
    }

    public void setSaveState(int i) {
        this.a2 = Integer.valueOf(i);
    }

    public void setSelected(Long l) {
        HashSet hashSet = this.L;
        hashSet.clear();
        hashSet.add(l);
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                if (ty9Var.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i);
                    gn gnVar = fz9Var.e;
                    if (gnVar != null) {
                        fz9Var.d(hashSet.contains(Long.valueOf(gnVar.getDocumentId())), true);
                    } else {
                        fz9Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            ty9Var.invalidate();
        }
    }

    public void setSelectedReaction(k39 k39Var) {
        this.K.clear();
        this.K.add(k39Var);
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                if (ty9Var.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i);
                    fz9Var.d(this.K.contains(fz9Var.y), true);
                }
            }
            ty9Var.invalidate();
        }
        jy9 jy9Var = this.j0;
        if (jy9Var != null) {
            for (int i2 = 0; i2 < jy9Var.getChildCount(); i2++) {
                if (jy9Var.getChildAt(i2) instanceof fz9) {
                    fz9 fz9Var2 = (fz9) jy9Var.getChildAt(i2);
                    fz9Var2.d(this.K.contains(fz9Var2.y), true);
                }
            }
            jy9Var.invalidate();
        }
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            this.K.add(k39.b(str));
        }
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i2 = 0; i2 < ty9Var.getChildCount(); i2++) {
                if (ty9Var.getChildAt(i2) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i2);
                    fz9Var.d(this.K.contains(fz9Var.y), true);
                }
            }
            ty9Var.invalidate();
        }
    }

    public boolean t() {
        return false;
    }

    public final void u(int i, int i2) {
        int i3;
        ky9 ky9Var = this.s0;
        View m = ky9Var.m(i);
        int K0 = ky9Var.K0();
        if ((m == null && Math.abs(i - K0) > 72.0f) || !gda.c()) {
            if (ky9Var.K0() < i) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            cw6 cw6Var = this.t0;
            cw6Var.b = i3;
            cw6Var.l(i, i2, false, false);
            return;
        }
        rw3 rw3Var = new rw3((byte) 4, this.i0.getContext(), this);
        rw3Var.a = i;
        rw3Var.p = i2;
        ky9Var.v0(rw3Var);
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            if (!this.m1 || (v0 = cmb.v0(cmb.u6, this.a1)) == this.g1) {
                return;
            }
            this.g1 = v0;
            this.N.setColor(on2.p(v0, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.g1, PorterDuff.Mode.SRC_IN);
            this.l1 = porterDuffColorFilter;
            vm vmVar = this.X0;
            if (vmVar != null) {
                vmVar.setColorFilter(porterDuffColorFilter);
            }
            ty9 ty9Var = this.i0;
            if (ty9Var != null) {
                ty9Var.invalidate();
            }
            jy9 jy9Var = this.j0;
            if (jy9Var != null) {
                jy9Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v(String str, boolean z, boolean z2) {
        long j;
        zx9 zx9Var = this.K1;
        if (zx9Var != null) {
            gm.r(zx9Var);
            this.K1 = null;
        }
        hy6 hy6Var = this.L1;
        if (hy6Var != null) {
            gm.r(hy6Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        gz9 gz9Var = this.r0;
        ny9 ny9Var = this.g0;
        if (isEmpty) {
            this.z1 = false;
            this.A1 = false;
            z(false, z);
            if (ny9Var != null) {
                ny9Var.d(true);
                ny9Var.c(false);
            }
            gz9Var.E(true);
            this.B1 = null;
        } else {
            boolean z3 = this.z1;
            boolean z4 = !z3;
            this.z1 = true;
            this.A1 = false;
            if (ny9Var != null) {
                ny9Var.f.b(2);
            }
            if (!z3) {
                ArrayList arrayList = this.C1;
                if (arrayList != null) {
                    arrayList.clear();
                }
                ArrayList arrayList2 = this.D1;
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                ArrayList arrayList3 = this.F1;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                gz9Var.E(false);
            } else if (!str.equals(this.B1)) {
                zx9 zx9Var2 = new zx9(this, (byte) 1);
                this.K1 = zx9Var2;
                gm.d3(zx9Var2, 120L);
            }
            this.B1 = str;
            String[] F0 = gm.F0();
            if (!Arrays.equals(F0, c2)) {
                hs6.d0(this.W).O(F0, false);
            }
            c2 = F0;
            hy6 hy6Var2 = new hy6(this, str, z, z4, F0, (byte) 4);
            this.L1 = hy6Var2;
            if (z2) {
                j = 425;
            } else {
                j = 0;
            }
            gm.d3(hy6Var2, j);
            if (ny9Var != null) {
                ny9Var.f.b(2);
                ny9Var.c(z);
            }
        }
        C();
    }

    public final void w(float f) {
        ValueAnimator valueAnimator = this.j1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.j1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u0.getAlpha(), f * 0.25f);
        this.j1 = ofFloat;
        ofFloat.addUpdateListener(new yx9(this, (byte) 2));
        this.j1.setDuration(200L);
        this.j1.setInterpolator(d53.f);
        this.j1.start();
    }

    public final void x(Long l, boolean z) {
        boolean z2;
        HashSet hashSet = this.L;
        if (!hashSet.contains(l)) {
            hashSet.add(l);
            z2 = true;
        } else {
            hashSet.remove(l);
            z2 = false;
        }
        ty9 ty9Var = this.i0;
        if (ty9Var != null) {
            for (int i = 0; i < ty9Var.getChildCount(); i++) {
                if (ty9Var.getChildAt(i) instanceof fz9) {
                    fz9 fz9Var = (fz9) ty9Var.getChildAt(i);
                    gn gnVar = fz9Var.e;
                    if (gnVar != null && gnVar.getDocumentId() == l.longValue()) {
                        fz9Var.e(z2, z);
                    } else {
                        TLRPC.Document document = fz9Var.d;
                        if (document != null && document.id == l.longValue()) {
                            fz9Var.e(z2, z);
                        }
                    }
                }
            }
            ty9Var.invalidate();
        }
    }

    public final void y(tm tmVar, View view) {
        int i;
        Integer num;
        if (tmVar != null && (num = tmVar.G) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.o1 = i;
        this.p1 = tmVar;
        this.r1 = view;
        if (this.J && tmVar != null) {
            tmVar.n = this;
        }
        invalidate();
    }

    public final void z(boolean z, boolean z2) {
        float f;
        if (this.H1 == z) {
            return;
        }
        this.H1 = z;
        ty9 ty9Var = this.i0;
        ty9Var.setVisibility(0);
        jy9 jy9Var = this.j0;
        jy9Var.setVisibility(0);
        ValueAnimator valueAnimator = this.G1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.J1;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.J1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.G1 = ofFloat;
        ofFloat.addUpdateListener(new cy9(this, z, (byte) 0));
        this.G1.addListener(new py9(this, z, (byte) 0));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(d53.h);
        this.G1.start();
        ViewPropertyAnimator animate = ((View) ty9Var.getParent()).animate();
        if (this.H1 && z2) {
            f = -gm.L(36.0f);
        } else {
            f = 0.0f;
        }
        wi8.t(animate.translationY(f).setUpdateListener(new yx9(this, (byte) 1)), d53.f, 160L);
        if (this.H1 && z2) {
            jy9Var.setPadding(gm.L(5.0f), gm.L(54.0f), gm.L(5.0f), gm.L(38.0f));
        } else {
            jy9Var.setPadding(gm.L(5.0f), gm.L(54.0f), gm.L(5.0f), gm.L(38.0f));
        }
        f();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void l() {
    }

    public void p() {
    }

    public void setOnRecentClearedListener(uz9 uz9Var) {
    }

    @Override
    public void setPressed(boolean z) {
    }

    public void q(fz9 fz9Var, k39 k39Var) {
    }

    public void setSelectedReactions(HashSet<k39> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && ((k39) arrayList.get(i)).g != 0) {
                hashSet2.add(Long.valueOf(((k39) arrayList.get(i)).g));
            }
        }
    }

    public vz9(d dVar, Context context, boolean z, Integer num, int i, boolean z2, ylb ylbVar, int i2) {
        this(dVar, context, z, num, i, z2, ylbVar, i2, cmb.v0(cmb.u6, ylbVar));
    }

    public vz9(d dVar, Context context, boolean z, Integer num, int i, ylb ylbVar) {
        this(dVar, context, z, num, i, true, ylbVar, 16);
    }
}
