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
public abstract class tx9 extends FrameLayout implements gk7, tjb {
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
    public yw9 H;
    public final ArrayList H0;
    public boolean H1;
    public rx9 I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public wv9 K1;
    public final HashSet L;
    public final ArrayList L0;
    public hw6 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public dx9 P;
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
    public vva S1;
    public final ArrayList T;
    public dx9 T0;
    public final wv9 T1;
    public boolean U;
    public boolean U0;
    public final wv9 U1;
    public uw9 V;
    public float V0;
    public jx9 V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public vl X0;
    public ValueAnimator X1;
    public jw9 Y0;
    public final on Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int a;
    public final int a0;
    public final wjb a1;
    public Integer a2;
    public int b;
    public final ow9 b0;
    public float b1;
    public int c;
    public final s71 c0;
    public float c1;
    public int d;
    public final cy3[] d0;
    public final d d1;
    public int e;
    public cy3 e0;
    public final byte e1;
    public int f;
    public final mw9 f0;
    public final sw9 f1;
    public final lw9 g0;
    public int g1;
    public int h;
    public final ar8 h0;
    public boolean h1;
    public final rw9 i0;
    public boolean i1;
    public final hw9 j0;
    public ValueAnimator j1;
    public final FrameLayout k0;
    public Drawable k1;
    public final gw9 l0;
    public PorterDuffColorFilter l1;
    public final be0 m0;
    public final boolean m1;
    public int n;
    public final View n0;
    public float n1;
    public final d62 o0;
    public int o1;
    public final View p0;
    public tl p1;
    public final tw9 q0;
    public Rect q1;
    public int r;
    public final ex9 r0;
    public View r1;
    public int s;
    public final iw9 s0;
    public float s1;
    public final cu6 t0;
    public dx9 t1;
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

    public tx9(org.telegram.ui.ActionBar.d r40, android.content.Context r41, boolean r42, java.lang.Integer r43, int r44, boolean r45, defpackage.wjb r46, int r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx9.<init>(org.telegram.ui.ActionBar.d, android.content.Context, boolean, java.lang.Integer, int, boolean, wjb, int, int):void");
    }

    public static void D(int i, be0 be0Var) {
        List list;
        gl5 b;
        String str;
        if (be0Var != null) {
            ArrayList arrayList = new ArrayList(hq6.d0(i).t0[1]);
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
                        if (document2 != null && list.contains(k27.V(document2, null, null))) {
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
                ArrayList arrayList3 = new ArrayList(hq6.d0(i).t0(5));
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
                            if (document3 != null && list.contains(k27.V(document3, null, null))) {
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
                kcb d = uo3.d(document.thumbs, bkb.l6, 0.2f, false);
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = gl5.b(document);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && k27.K2(document, false)) {
                        d.e = 512;
                        d.f = 512;
                    }
                    b = gl5.b(document);
                    str = "36_36";
                }
                be0Var.setLayerNum(7);
                be0Var.setRoundRadius(gl.L(4.0f));
                be0Var.j(b, str, gl5.c(w, document), "36_36", d, document);
            }
        }
    }

    public static void a(tx9 tx9Var, vl vlVar) {
        tx9Var.setBigReactionAnimatedEmoji(vlVar);
    }

    public int getCacheType() {
        int i = 13;
        int i2 = this.a0;
        if (i2 != 5 && i2 != 7) {
            if (i2 == 6) {
                return vl.f();
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
                d = b00.d(a.b, 2131232367);
                this.k1 = d;
            } else {
                d = b00.d(a.b, 2131232138);
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
        String c = vu3.c(str);
        int i = 0;
        while (true) {
            if (i < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i).documents.isEmpty() && TextUtils.equals(vu3.c(tL_messages_stickerSet.packs.get(i).emoticon), c)) {
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
            hq6.d0(i);
            zArr[i] = true;
            hq6.d0(i).D(5);
            hq6.d0(i).N(0, true);
            hq6.d0(i).C();
            hq6.d0(i).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            hq6.d0(i).R();
            hq6.d0(i).x();
            tya.F3.c(i, 1, new lf3(i, (byte) 1));
        }
    }

    public void setBigReactionAnimatedEmoji(vl vlVar) {
        vl vlVar2;
        if (this.J && (vlVar2 = this.X0) != vlVar) {
            if (vlVar2 != null) {
                vlVar2.o(this);
            }
            this.X0 = vlVar;
            if (vlVar != null) {
                vlVar.setColorFilter(this.l1);
                this.X0.b(this);
            }
        }
    }

    public final void A(Long l) {
        this.L.remove(l);
        rw9 rw9Var = this.i0;
        if (rw9Var != null) {
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < rw9Var.getChildCount(); i2++) {
                if (rw9Var.getChildAt(i2) instanceof dx9) {
                    dx9 dx9Var = (dx9) rw9Var.getChildAt(i2);
                    gm gmVar = dx9Var.e;
                    if (gmVar != null && gmVar.getDocumentId() == l.longValue()) {
                        dx9Var.f();
                    } else {
                        TLRPC.Document document = dx9Var.d;
                        if (document != null && document.id == l.longValue()) {
                            dx9Var.f();
                        }
                    }
                    z = true;
                }
            }
            rw9Var.invalidate();
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
                tw9 tw9Var = this.q0;
                if (tw9Var != null) {
                    tw9Var.g(i);
                }
            }
        }
    }

    public final void B(boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx9.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        lw9 lw9Var = this.g0;
        if (lw9Var == null) {
            return;
        }
        if (this.A1) {
            lw9Var.clearAnimation();
            lw9Var.setVisibility(0);
            lw9Var.animate().translationY(0.0f).start();
            return;
        }
        rw9 rw9Var = this.i0;
        if (rw9Var.getChildCount() > 0) {
            View childAt = rw9Var.getChildAt(0);
            if (RecyclerView.R(childAt) == this.a && "searchbox".equals(childAt.getTag())) {
                lw9Var.setVisibility(0);
                lw9Var.setTranslationY(childAt.getY());
                return;
            }
            lw9Var.setTranslationY(-gl.L(52.0f));
            return;
        }
        lw9Var.setTranslationY(-gl.L(52.0f));
    }

    public final void E(float f) {
        int i;
        int i2 = -1;
        View view = this.n0;
        if (view != null) {
            float interpolation = s33.g.getInterpolation(moe.a((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (m()) {
                i = -1;
            } else {
                i = 1;
            }
            view.setScaleY(interpolation * i);
        }
        d62 d62Var = this.o0;
        if (d62Var != null) {
            float a = moe.a((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            d62Var.setAlpha(a);
            d62Var.setScaleX(a);
            if (!m()) {
                i2 = 1;
            }
            d62Var.setScaleY(a * i2);
        }
        float f2 = 800.0f * f;
        float f3 = f2 - 40.0f;
        float a2 = moe.a(f3 / 700.0f, 0.0f, 1.0f);
        float a3 = moe.a((f2 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a4 = moe.a(f3 / 750.0f, 0.0f, 1.0f);
        float a5 = moe.a((f2 - 30.0f) / 120.0f, 0.0f, 1.0f);
        s33 s33Var = s33.h;
        float interpolation2 = s33Var.getInterpolation(a2);
        float interpolation3 = s33Var.getInterpolation(a3);
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
        ow9 ow9Var = this.b0;
        ow9Var.setTranslationY(gl.L(-5.0f) * f4);
        if (d62Var != null) {
            d62Var.setTranslationY(gl.L(-5.0f) * f4);
        }
        this.b1 = (interpolation2 * 0.85f) + 0.15f;
        this.c1 = (interpolation3 * 0.925f) + 0.075f;
        ow9Var.invalidateOutline();
        if (d62Var != null) {
            d62Var.setAlpha(a5);
        }
        mw9 mw9Var = this.f0;
        mw9Var.setAlpha(a5);
        mw9Var.setScaleX(Math.min(this.b1, 1.0f));
        float pivotX = mw9Var.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(ow9Var.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(ow9Var.getHeight(), 2.0d) + Math.pow(ow9Var.getWidth() - pivotX, 2.0d)));
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
            float s = gl.s(a4, (float) Math.sqrt(b00.w(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s)) {
                s = 0.0f;
            }
            childAt.setScaleX(s);
            childAt.setScaleY(s);
        }
        while (true) {
            rw9 rw9Var = this.i0;
            if (i3 < rw9Var.getChildCount()) {
                View childAt2 = rw9Var.getChildAt(i3);
                if (childAt2 instanceof dx9) {
                    dx9 dx9Var = (dx9) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (m()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s2 = gl.s(a4, (float) Math.sqrt(b00.w(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s2)) {
                        s2 = 0.0f;
                    }
                    dx9Var.setAnimatedScale(s2);
                }
                i3++;
            } else {
                this.l0.invalidate();
                rw9Var.invalidate();
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
        int i3 = kk7.w0;
        wv9 wv9Var = this.U1;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                gl.r(wv9Var);
                gl.d3(wv9Var);
            }
        } else if (i == kk7.z0) {
            gl.r(wv9Var);
            gl.d3(wv9Var);
        } else if (i == kk7.B1) {
            gl.r(wv9Var);
            gl.d3(wv9Var);
        } else if (i == kk7.A0) {
            gl.r(wv9Var);
            gl.d3(wv9Var);
        } else if (i == kk7.k4) {
            bm0 bm0Var = new bm0((byte) 12);
            rw9 rw9Var = this.i0;
            gl.d0(rw9Var, bm0Var);
            if (rw9Var != null) {
                rw9Var.invalidate();
            }
        } else if (i == kk7.H3 && ((Long) objArr[0]).longValue() == y6c.h(this.W).e()) {
            gl.r(wv9Var);
            gl.d3(wv9Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i;
        float f;
        float measuredHeight;
        tl tlVar = this.p1;
        if (tlVar != null && (num = this.Z0) != null) {
            Rect bounds = tlVar.getBounds();
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
            float A = tb4.A(scaleY, 1.0f, bounds.centerY(), -f);
            boolean m = m();
            byte b = this.e1;
            if (!m) {
                measuredHeight = gl.L(b);
            } else {
                measuredHeight = getMeasuredHeight() - (gl.L(b) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + A + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            tl tlVar2 = this.p1;
            Rect rect = this.q1;
            int i2 = rect.left;
            Rect rect2 = this.q1;
            tlVar2.setBounds(i2, rect.top, (int) ((rect.width() / scaleY) + i2), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.p1.draw(canvas);
            tl tlVar3 = this.p1;
            tlVar3.w = alpha;
            tlVar3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        dx9 dx9Var = this.t1;
        if (dx9Var != null && this.u1 != null && dx9Var.F != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.t1.F.setAlpha((int) (this.s1 * 255.0f));
            this.t1.F.setBounds(this.u1);
            this.t1.F.setColorFilter(new PorterDuffColorFilter(bm2.f(1.0f - this.n1, this.g1, this.o1), PorterDuff.Mode.SRC_IN));
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
            ug8.s(animate, f, 200L);
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

    public vva getCollectionParticles() {
        vva vvaVar = this.S1;
        if (vvaVar == null) {
            vva vvaVar2 = new vva(1, 8);
            this.S1 = vvaVar2;
            return vvaVar2;
        }
        return vvaVar;
    }

    public long getDialogId() {
        return y6c.h(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx9.h(int, android.view.View):void");
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
            String j = b00.j(sb, str, "usehint");
            int i2 = na7.c1().getInt(j, 0);
            if (i2 <= 3) {
                na7.c1().edit().putInt(j, i2 + 1).apply();
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

    public final void n(android.view.View r15, defpackage.gm r16) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx9.n(android.view.View, gm):void");
    }

    public abstract void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i = this.W;
        kk7.f(i).b(this, kk7.z0);
        kk7.f(i).b(this, kk7.w0);
        kk7.f(i).b(this, kk7.B1);
        kk7.f(i).b(this, kk7.A0);
        kk7.e().b(this, kk7.k4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            kk7.f(i).b(this, kk7.H3);
        }
        tl tlVar = this.p1;
        if (tlVar != null) {
            tlVar.n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i = this.W;
        kk7.f(i).n(this, kk7.z0);
        kk7.f(i).n(this, kk7.w0);
        kk7.f(i).n(this, kk7.B1);
        kk7.f(i).n(this, kk7.A0);
        kk7.e().n(this, kk7.k4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            kk7.f(i).n(this, kk7.H3);
        }
        tl tlVar = this.p1;
        if (tlVar != null) {
            tlVar.n = null;
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.a0 == 6) {
            this.s0.x1((getMeasuredWidth() / gl.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.R0;
        int i3 = this.a0;
        if (z && i3 != 3 && i3 != 4) {
            Point point = gl.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(gl.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(gl.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i3 == 6) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (gl.q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void r(jx9 jx9Var) {
        Integer num = this.a2;
        if (num != null) {
            Parcelable parcelable = (Parcelable) e2.get(num);
        }
        this.V1 = jx9Var;
        boolean z = this.R0;
        rw9 rw9Var = this.i0;
        if (!z) {
            f();
            for (int i = 0; i < rw9Var.getChildCount(); i++) {
                View childAt = rw9Var.getChildAt(i);
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
            ofFloat.addUpdateListener(new vv9(this, (byte) 0));
            this.W1.addListener(new ng9(this, (byte) 8));
            wv9 wv9Var = new wv9(this, (byte) 0);
            pg5.f = true;
            pg5.e = true;
            pg5.g = false;
            if (pg5.d) {
                pg5.d = false;
            }
            pg5.c = wv9Var;
            kk7.e().k(kk7.i1, 512);
            this.Y1.d();
            this.W1.setDuration(800L);
            rw9Var.setLayerType(2, null);
            this.g0.setLayerType(2, null);
            this.f0.setLayerType(2, null);
            this.c0.setLayerType(2, null);
            d62 d62Var = this.o0;
            if (d62Var != null) {
                d62Var.setLayerType(2, null);
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

    public void setBackgroundDelegate(uw9 uw9Var) {
        this.V = uw9Var;
    }

    public void setDrawBackground(boolean z) {
        this.R0 = z;
        this.b0.setClipToOutline(z);
        s71 s71Var = this.c0;
        if (!z) {
            s71Var.setVisibility(8);
        } else {
            s71Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z) {
        if (this.U != z) {
            this.U = z;
            if (!z) {
                gl.d0(this.i0, new bm0((byte) 26));
                int i = 0;
                while (true) {
                    int childCount = this.e0.b.getChildCount();
                    cy3 cy3Var = this.e0;
                    if (i < childCount) {
                        View childAt = cy3Var.b.getChildAt(i);
                        childAt.setScaleX(1.0f);
                        childAt.setScaleY(1.0f);
                        i++;
                    } else {
                        cy3Var.b.invalidate();
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
        dx9 dx9Var = this.P;
        if (dx9Var != null) {
            dx9Var.h.g0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z) {
        this.i1 = z;
    }

    public void setOnLongPressedListener(rx9 rx9Var) {
        this.I = rx9Var;
    }

    public void setRecentReactions(List<h19> list) {
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
        rw9 rw9Var = this.i0;
        if (rw9Var != null) {
            for (int i = 0; i < rw9Var.getChildCount(); i++) {
                if (rw9Var.getChildAt(i) instanceof dx9) {
                    dx9 dx9Var = (dx9) rw9Var.getChildAt(i);
                    gm gmVar = dx9Var.e;
                    if (gmVar != null) {
                        dx9Var.d(hashSet.contains(Long.valueOf(gmVar.getDocumentId())), true);
                    } else {
                        dx9Var.d(hashSet.contains(0L), true);
                    }
                }
            }
            rw9Var.invalidate();
        }
    }

    public void setSelectedReaction(h19 h19Var) {
        this.K.clear();
        this.K.add(h19Var);
        rw9 rw9Var = this.i0;
        if (rw9Var != null) {
            for (int i = 0; i < rw9Var.getChildCount(); i++) {
                if (rw9Var.getChildAt(i) instanceof dx9) {
                    dx9 dx9Var = (dx9) rw9Var.getChildAt(i);
                    dx9Var.d(this.K.contains(dx9Var.y), true);
                }
            }
            rw9Var.invalidate();
        }
        hw9 hw9Var = this.j0;
        if (hw9Var != null) {
            for (int i2 = 0; i2 < hw9Var.getChildCount(); i2++) {
                if (hw9Var.getChildAt(i2) instanceof dx9) {
                    dx9 dx9Var2 = (dx9) hw9Var.getChildAt(i2);
                    dx9Var2.d(this.K.contains(dx9Var2.y), true);
                }
            }
            hw9Var.invalidate();
        }
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            this.K.add(h19.b(str));
        }
        rw9 rw9Var = this.i0;
        if (rw9Var != null) {
            for (int i2 = 0; i2 < rw9Var.getChildCount(); i2++) {
                if (rw9Var.getChildAt(i2) instanceof dx9) {
                    dx9 dx9Var = (dx9) rw9Var.getChildAt(i2);
                    dx9Var.d(this.K.contains(dx9Var.y), true);
                }
            }
            rw9Var.invalidate();
        }
    }

    public boolean t() {
        return false;
    }

    public final void u(int i, int i2) {
        int i3;
        iw9 iw9Var = this.s0;
        View m = iw9Var.m(i);
        int K0 = iw9Var.K0();
        if ((m == null && Math.abs(i - K0) > 72.0f) || !gba.c()) {
            if (iw9Var.K0() < i) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            cu6 cu6Var = this.t0;
            cu6Var.b = i3;
            cu6Var.k(i, i2, false, false);
            return;
        }
        gv3 gv3Var = new gv3((byte) 4, this.i0.getContext(), this);
        gv3Var.a = i;
        gv3Var.p = i2;
        iw9Var.v0(gv3Var);
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            if (!this.m1 || (v0 = bkb.v0(bkb.u6, this.a1)) == this.g1) {
                return;
            }
            this.g1 = v0;
            this.N.setColor(bm2.o(v0, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.g1, PorterDuff.Mode.SRC_IN);
            this.l1 = porterDuffColorFilter;
            vl vlVar = this.X0;
            if (vlVar != null) {
                vlVar.setColorFilter(porterDuffColorFilter);
            }
            rw9 rw9Var = this.i0;
            if (rw9Var != null) {
                rw9Var.invalidate();
            }
            hw9 hw9Var = this.j0;
            if (hw9Var != null) {
                hw9Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v(String str, boolean z, boolean z2) {
        long j;
        wv9 wv9Var = this.K1;
        if (wv9Var != null) {
            gl.r(wv9Var);
            this.K1 = null;
        }
        hw6 hw6Var = this.L1;
        if (hw6Var != null) {
            gl.r(hw6Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ex9 ex9Var = this.r0;
        lw9 lw9Var = this.g0;
        if (isEmpty) {
            this.z1 = false;
            this.A1 = false;
            z(false, z);
            if (lw9Var != null) {
                lw9Var.d(true);
                lw9Var.c(false);
            }
            ex9Var.E(true);
            this.B1 = null;
        } else {
            boolean z3 = this.z1;
            boolean z4 = !z3;
            this.z1 = true;
            this.A1 = false;
            if (lw9Var != null) {
                lw9Var.f.b(2);
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
                ex9Var.E(false);
            } else if (!str.equals(this.B1)) {
                wv9 wv9Var2 = new wv9(this, (byte) 1);
                this.K1 = wv9Var2;
                gl.e3(wv9Var2, 120L);
            }
            this.B1 = str;
            String[] F0 = gl.F0();
            if (!Arrays.equals(F0, c2)) {
                hq6.d0(this.W).O(F0, false);
            }
            c2 = F0;
            hw6 hw6Var2 = new hw6(this, str, z, z4, F0, (byte) 4);
            this.L1 = hw6Var2;
            if (z2) {
                j = 425;
            } else {
                j = 0;
            }
            gl.e3(hw6Var2, j);
            if (lw9Var != null) {
                lw9Var.f.b(2);
                lw9Var.c(z);
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
        ofFloat.addUpdateListener(new vv9(this, (byte) 2));
        this.j1.setDuration(200L);
        this.j1.setInterpolator(s33.f);
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
        rw9 rw9Var = this.i0;
        if (rw9Var != null) {
            for (int i = 0; i < rw9Var.getChildCount(); i++) {
                if (rw9Var.getChildAt(i) instanceof dx9) {
                    dx9 dx9Var = (dx9) rw9Var.getChildAt(i);
                    gm gmVar = dx9Var.e;
                    if (gmVar != null && gmVar.getDocumentId() == l.longValue()) {
                        dx9Var.e(z2, z);
                    } else {
                        TLRPC.Document document = dx9Var.d;
                        if (document != null && document.id == l.longValue()) {
                            dx9Var.e(z2, z);
                        }
                    }
                }
            }
            rw9Var.invalidate();
        }
    }

    public final void y(tl tlVar, View view) {
        int i;
        Integer num;
        if (tlVar != null && (num = tlVar.G) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.o1 = i;
        this.p1 = tlVar;
        this.r1 = view;
        if (this.J && tlVar != null) {
            tlVar.n = this;
        }
        invalidate();
    }

    public final void z(boolean z, boolean z2) {
        float f;
        if (this.H1 == z) {
            return;
        }
        this.H1 = z;
        rw9 rw9Var = this.i0;
        rw9Var.setVisibility(0);
        hw9 hw9Var = this.j0;
        hw9Var.setVisibility(0);
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
        ofFloat.addUpdateListener(new zv9(this, z, (byte) 0));
        this.G1.addListener(new nw9(this, z, (byte) 0));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(s33.h);
        this.G1.start();
        ViewPropertyAnimator animate = ((View) rw9Var.getParent()).animate();
        if (this.H1 && z2) {
            f = -gl.L(36.0f);
        } else {
            f = 0.0f;
        }
        ug8.t(animate.translationY(f).setUpdateListener(new vv9(this, (byte) 1)), s33.f, 160L);
        if (this.H1 && z2) {
            hw9Var.setPadding(gl.L(5.0f), gl.L(54.0f), gl.L(5.0f), gl.L(38.0f));
        } else {
            hw9Var.setPadding(gl.L(5.0f), gl.L(54.0f), gl.L(5.0f), gl.L(38.0f));
        }
        f();
    }

    public void l() {
    }

    public void p() {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setOnRecentClearedListener(sx9 sx9Var) {
    }

    @Override
    public void setPressed(boolean z) {
    }

    public void q(dx9 dx9Var, h19 h19Var) {
    }

    public void setSelectedReactions(HashSet<h19> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && ((h19) arrayList.get(i)).g != 0) {
                hashSet2.add(Long.valueOf(((h19) arrayList.get(i)).g));
            }
        }
    }

    public tx9(d dVar, Context context, boolean z, Integer num, int i, boolean z2, wjb wjbVar, int i2) {
        this(dVar, context, z, num, i, z2, wjbVar, i2, bkb.v0(bkb.u6, wjbVar));
    }

    public tx9(d dVar, Context context, boolean z, Integer num, int i, wjb wjbVar) {
        this(dVar, context, z, num, i, true, wjbVar, 16);
    }
}
