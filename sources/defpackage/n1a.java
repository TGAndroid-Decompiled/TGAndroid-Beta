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
import org.telegram.ui.ActionBar.e;
public abstract class n1a extends FrameLayout implements fn7, snb {
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
    public r0a H;
    public final ArrayList H0;
    public boolean H1;
    public l1a I;
    public final ArrayList I0;
    public boolean I1;
    public boolean J;
    public final ArrayList J0;
    public ValueAnimator J1;
    public HashSet K;
    public ArrayList K0;
    public qz9 K1;
    public final HashSet L;
    public final ArrayList L0;
    public my6 L1;
    public final Paint M;
    public ArrayList M0;
    public boolean M1;
    public final Paint N;
    public final ArrayList N0;
    public boolean N1;
    public Drawable O;
    public final boolean O0;
    public View O1;
    public w0a P;
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
    public yza S1;
    public final ArrayList T;
    public w0a T0;
    public final qz9 T1;
    public boolean U;
    public boolean U0;
    public final qz9 U1;
    public n0a V;
    public float V0;
    public c1a V1;
    public final int W;
    public final ImageReceiver W0;
    public ValueAnimator W1;
    public wl X0;
    public ValueAnimator X1;
    public c0a Y0;
    public final pn Y1;
    public final Integer Z0;
    public final Paint Z1;
    public int a;
    public final int a0;
    public final vnb a1;
    public Integer a2;
    public int b;
    public final h0a b0;
    public float b1;
    public int c;
    public final a81 c0;
    public float c1;
    public int d;
    public final xy3[] d0;
    public final e d1;
    public int e;
    public xy3 e0;
    public final byte e1;
    public int f;
    public final f0a f0;
    public final l0a f1;
    public final e0a g0;
    public int g1;
    public int h;
    public final ir8 h0;
    public boolean h1;
    public final k0a i0;
    public boolean i1;
    public final a0a j0;
    public ValueAnimator j1;
    public final FrameLayout k0;
    public Drawable k1;
    public final iy9 l0;
    public PorterDuffColorFilter l1;
    public final de0 m0;
    public final boolean m1;
    public int n;
    public final View n0;
    public float n1;
    public final t62 o0;
    public int o1;
    public final View p0;
    public ul p1;
    public final m0a q0;
    public Rect q1;
    public int r;
    public final x0a r0;
    public View r1;
    public int s;
    public final b0a s0;
    public float s1;
    public final hw6 t0;
    public w0a t1;
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

    public n1a(org.telegram.ui.ActionBar.e r40, android.content.Context r41, boolean r42, java.lang.Integer r43, int r44, boolean r45, defpackage.vnb r46, int r47, int r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1a.<init>(org.telegram.ui.ActionBar.e, android.content.Context, boolean, java.lang.Integer, int, boolean, vnb, int, int):void");
    }

    public static void D(int i, de0 de0Var) {
        List list;
        jn5 b;
        String str;
        if (de0Var != null) {
            ArrayList arrayList = new ArrayList(ls6.d0(i).t0[1]);
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
                        if (document2 != null && list.contains(r47.V(document2, null, null))) {
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
                ArrayList arrayList3 = new ArrayList(ls6.d0(i).t0(5));
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
                            if (document3 != null && list.contains(r47.V(document3, null, null))) {
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
                ggb d = lp3.d(document.thumbs, aob.m6, 0.2f, false);
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
                if ("video/webm".equals(document.mime_type)) {
                    b = jn5.b(document);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    str = "36_36_g";
                } else {
                    if (d != null && r47.K2(document, false)) {
                        d.e = 512;
                        d.f = 512;
                    }
                    b = jn5.b(document);
                    str = "36_36";
                }
                de0Var.setLayerNum(7);
                de0Var.setRoundRadius(hl.L(4.0f));
                de0Var.j(b, str, jn5.c(w, document), "36_36", d, document);
            }
        }
    }

    public static void c(n1a n1aVar, wl wlVar) {
        n1aVar.setBigReactionAnimatedEmoji(wlVar);
    }

    public int getCacheType() {
        int i = 13;
        int i2 = this.a0;
        if (i2 != 5 && i2 != 7) {
            if (i2 == 6) {
                return wl.f();
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
        Drawable e;
        if (this.k1 == null) {
            int i = this.a0;
            if (i != 5 && i != 9 && i != 10 && i != 7) {
                e = c00.e(a.b, 2131232367);
                this.k1 = e;
            } else {
                e = c00.e(a.b, 2131232138);
                this.k1 = e;
            }
            e.setColorFilter(this.l1);
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
        String c = pv3.c(str);
        int i = 0;
        while (true) {
            if (i < tL_messages_stickerSet.packs.size()) {
                if (!tL_messages_stickerSet.packs.get(i).documents.isEmpty() && TextUtils.equals(pv3.c(tL_messages_stickerSet.packs.get(i).emoticon), c)) {
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
            ls6.d0(i);
            zArr[i] = true;
            ls6.d0(i).D(5);
            ls6.d0(i).N(0, true);
            ls6.d0(i).C();
            ls6.d0(i).n0(new TLRPC.TL_inputStickerSetEmojiDefaultStatuses(), false);
            ls6.d0(i).R();
            ls6.d0(i).x();
            t2b.F3.c(i, 1, new fg3(i, (byte) 1));
        }
    }

    public void setBigReactionAnimatedEmoji(wl wlVar) {
        wl wlVar2;
        if (this.J && (wlVar2 = this.X0) != wlVar) {
            if (wlVar2 != null) {
                wlVar2.o(this);
            }
            this.X0 = wlVar;
            if (wlVar != null) {
                wlVar.setColorFilter(this.l1);
                this.X0.b(this);
            }
        }
    }

    public final void A(Long l) {
        this.L.remove(l);
        k0a k0aVar = this.i0;
        if (k0aVar != null) {
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < k0aVar.getChildCount(); i2++) {
                if (k0aVar.getChildAt(i2) instanceof w0a) {
                    w0a w0aVar = (w0a) k0aVar.getChildAt(i2);
                    hm hmVar = w0aVar.e;
                    if (hmVar != null && hmVar.getDocumentId() == l.longValue()) {
                        w0aVar.f();
                    } else {
                        TLRPC.Document document = w0aVar.d;
                        if (document != null && document.id == l.longValue()) {
                            w0aVar.f();
                        }
                    }
                    z = true;
                }
            }
            k0aVar.invalidate();
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
                m0a m0aVar = this.q0;
                if (m0aVar != null) {
                    m0aVar.g(i);
                }
            }
        }
    }

    public final void B(boolean r47, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1a.B(boolean, boolean, boolean):void");
    }

    public final void C() {
        e0a e0aVar = this.g0;
        if (e0aVar == null) {
            return;
        }
        if (this.A1) {
            e0aVar.clearAnimation();
            e0aVar.setVisibility(0);
            e0aVar.animate().translationY(0.0f).start();
            return;
        }
        k0a k0aVar = this.i0;
        if (k0aVar.getChildCount() > 0) {
            View childAt = k0aVar.getChildAt(0);
            if (RecyclerView.S(childAt) == this.a && "searchbox".equals(childAt.getTag())) {
                e0aVar.setVisibility(0);
                e0aVar.setTranslationY(childAt.getY());
                return;
            }
            e0aVar.setTranslationY(-hl.L(52.0f));
            return;
        }
        e0aVar.setTranslationY(-hl.L(52.0f));
    }

    public final void E(float f) {
        int i;
        int i2 = -1;
        View view = this.n0;
        if (view != null) {
            float interpolation = k43.g.getInterpolation(ete.a((((f * 800.0f) - 0.0f) / 120.0f) / 1.0f, 0.0f, 1.0f));
            view.setAlpha(interpolation);
            view.setScaleX(interpolation);
            if (m()) {
                i = -1;
            } else {
                i = 1;
            }
            view.setScaleY(interpolation * i);
        }
        t62 t62Var = this.o0;
        if (t62Var != null) {
            float a = ete.a((((f * 800.0f) - 30.0f) / 120.0f) / 1.0f, 0.0f, 1.0f);
            t62Var.setAlpha(a);
            t62Var.setScaleX(a);
            if (!m()) {
                i2 = 1;
            }
            t62Var.setScaleY(a * i2);
        }
        float f2 = 800.0f * f;
        float f3 = f2 - 40.0f;
        float a2 = ete.a(f3 / 700.0f, 0.0f, 1.0f);
        float a3 = ete.a((f2 - 80.0f) / 700.0f, 0.0f, 1.0f);
        float a4 = ete.a(f3 / 750.0f, 0.0f, 1.0f);
        float a5 = ete.a((f2 - 30.0f) / 120.0f, 0.0f, 1.0f);
        k43 k43Var = k43.h;
        float interpolation2 = k43Var.getInterpolation(a2);
        float interpolation3 = k43Var.getInterpolation(a3);
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
        h0a h0aVar = this.b0;
        h0aVar.setTranslationY(hl.L(-5.0f) * f4);
        if (t62Var != null) {
            t62Var.setTranslationY(hl.L(-5.0f) * f4);
        }
        this.b1 = (interpolation2 * 0.85f) + 0.15f;
        this.c1 = (interpolation3 * 0.925f) + 0.075f;
        h0aVar.invalidateOutline();
        if (t62Var != null) {
            t62Var.setAlpha(a5);
        }
        f0a f0aVar = this.f0;
        f0aVar.setAlpha(a5);
        f0aVar.setScaleX(Math.min(this.b1, 1.0f));
        float pivotX = f0aVar.getPivotX();
        float sqrt = (float) Math.sqrt(Math.max(Math.pow(h0aVar.getHeight(), 2.0d) + (pivotX * pivotX), Math.pow(h0aVar.getHeight(), 2.0d) + Math.pow(h0aVar.getWidth() - pivotX, 2.0d)));
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
            float s = hl.s(a4, (float) Math.sqrt(c00.x(height, height, 0.4f, width * width)), sqrt, childAt.getHeight() * 1.75f);
            if (Float.isNaN(s)) {
                s = 0.0f;
            }
            childAt.setScaleX(s);
            childAt.setScaleY(s);
        }
        while (true) {
            k0a k0aVar = this.i0;
            if (i3 < k0aVar.getChildCount()) {
                View childAt2 = k0aVar.getChildAt(i3);
                if (childAt2 instanceof w0a) {
                    w0a w0aVar = (w0a) childAt2;
                    float width2 = ((childAt2.getWidth() / 2.0f) + childAt2.getLeft()) - pivotX;
                    float height2 = (childAt2.getHeight() / 2.0f) + childAt2.getTop();
                    if (m()) {
                        height2 = getMeasuredHeight() - height2;
                    }
                    float s2 = hl.s(a4, (float) Math.sqrt(c00.x(height2, height2, 0.2f, width2 * width2)), sqrt, childAt2.getHeight() * 1.75f);
                    if (Float.isNaN(s2)) {
                        s2 = 0.0f;
                    }
                    w0aVar.setAnimatedScale(s2);
                }
                i3++;
            } else {
                this.l0.invalidate();
                k0aVar.invalidate();
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
        int i3 = jn7.x0;
        qz9 qz9Var = this.U1;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == 5 || (((Integer) objArr[0]).intValue() == 0 && this.R)) {
                hl.r(qz9Var);
                hl.c3(qz9Var);
            }
        } else if (i == jn7.A0) {
            hl.r(qz9Var);
            hl.c3(qz9Var);
        } else if (i == jn7.C1) {
            hl.r(qz9Var);
            hl.c3(qz9Var);
        } else if (i == jn7.B0) {
            hl.r(qz9Var);
            hl.c3(qz9Var);
        } else if (i == jn7.l4) {
            bm0 bm0Var = new bm0((byte) 12);
            k0a k0aVar = this.i0;
            hl.d0(k0aVar, bm0Var);
            if (k0aVar != null) {
                k0aVar.invalidate();
            }
        } else if (i == jn7.I3 && ((Long) objArr[0]).longValue() == yac.h(this.W).e()) {
            hl.r(qz9Var);
            hl.c3(qz9Var);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Integer num;
        float scaleY;
        int i;
        float f;
        float measuredHeight;
        ul ulVar = this.p1;
        if (ulVar != null && (num = this.Z0) != null) {
            Rect bounds = ulVar.getBounds();
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
            float A = qd4.A(scaleY, 1.0f, bounds.centerY(), -f);
            boolean m = m();
            byte b = this.e1;
            if (!m) {
                measuredHeight = hl.L(b);
            } else {
                measuredHeight = getMeasuredHeight() - (hl.L(b) / 2.0f);
            }
            float scrimDrawableTranslationY = getScrimDrawableTranslationY() + A + measuredHeight;
            float width = (bounds.width() * scaleY) / 2.0f;
            float height = (bounds.height() * scaleY) / 2.0f;
            this.q1.set((int) (intValue - width), (int) (scrimDrawableTranslationY - height), (int) (intValue + width), (int) (scrimDrawableTranslationY + height));
            ul ulVar2 = this.p1;
            Rect rect = this.q1;
            int i2 = rect.left;
            Rect rect2 = this.q1;
            ulVar2.setBounds(i2, rect.top, (int) ((rect.width() / scaleY) + i2), (int) ((rect2.height() / scaleY) + rect2.top));
            Rect rect3 = this.q1;
            canvas.scale(scaleY, scaleY, rect3.left, rect3.top);
            this.p1.draw(canvas);
            ul ulVar3 = this.p1;
            ulVar3.w = alpha;
            ulVar3.setBounds(bounds);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        w0a w0aVar = this.t1;
        if (w0aVar != null && this.u1 != null && w0aVar.F != null) {
            canvas.save();
            canvas.translate(0.0f, -getTranslationY());
            this.t1.F.setAlpha((int) (this.s1 * 255.0f));
            this.t1.F.setBounds(this.u1);
            this.t1.F.setColorFilter(new PorterDuffColorFilter(vm2.f(1.0f - this.n1, this.g1, this.o1), PorterDuff.Mode.SRC_IN));
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
            ik8.s(animate, f, 200L);
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

    public yza getCollectionParticles() {
        yza yzaVar = this.S1;
        if (yzaVar == null) {
            yza yzaVar2 = new yza(1, 8);
            this.S1 = yzaVar2;
            return yzaVar2;
        }
        return yzaVar;
    }

    public long getDialogId() {
        return yac.h(this.W).e();
    }

    public float getScrimDrawableTranslationY() {
        return 0.0f;
    }

    public final void h(int r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1a.h(int, android.view.View):void");
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
            String k = c00.k(sb, str, "usehint");
            int i2 = uc7.e1().getInt(k, 0);
            if (i2 <= 3) {
                uc7.e1().edit().putInt(k, i2 + 1).apply();
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

    public final void n(android.view.View r14, defpackage.hm r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1a.n(android.view.View, hm):void");
    }

    public abstract void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num);

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
        int i = this.W;
        jn7.f(i).b(this, jn7.A0);
        jn7.f(i).b(this, jn7.x0);
        jn7.f(i).b(this, jn7.C1);
        jn7.f(i).b(this, jn7.B0);
        jn7.e().b(this, jn7.l4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            jn7.f(i).b(this, jn7.I3);
        }
        ul ulVar = this.p1;
        if (ulVar != null) {
            ulVar.n = this;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setBigReactionAnimatedEmoji(null);
        this.J = false;
        int i = this.W;
        jn7.f(i).n(this, jn7.A0);
        jn7.f(i).n(this, jn7.x0);
        jn7.f(i).n(this, jn7.C1);
        jn7.f(i).n(this, jn7.B0);
        jn7.e().n(this, jn7.l4);
        int i2 = this.a0;
        if (i2 == 0 || i2 == 12) {
            jn7.f(i).n(this, jn7.I3);
        }
        ul ulVar = this.p1;
        if (ulVar != null) {
            ulVar.n = null;
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.a0 == 6) {
            this.s0.x1((getMeasuredWidth() / hl.L(42.0f)) * 5);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z = this.R0;
        int i3 = this.a0;
        if (z && i3 != 3 && i3 != 4) {
            Point point = hl.q;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) Math.min(hl.L(324.0f), point.x * 0.95f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) Math.min(hl.L(330.0f), point.y * 0.75f), Integer.MIN_VALUE));
        } else if (i3 == 6) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (hl.q.y * 0.35f), Integer.MIN_VALUE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void r(c1a c1aVar) {
        Integer num = this.a2;
        if (num != null) {
            Parcelable parcelable = (Parcelable) e2.get(num);
        }
        this.V1 = c1aVar;
        boolean z = this.R0;
        k0a k0aVar = this.i0;
        if (!z) {
            f();
            for (int i = 0; i < k0aVar.getChildCount(); i++) {
                View childAt = k0aVar.getChildAt(i);
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
            ofFloat.addUpdateListener(new pz9(this, (byte) 0));
            this.W1.addListener(new po9(this, (byte) 7));
            qz9 qz9Var = new qz9(this, (byte) 0);
            ri5.f = true;
            ri5.e = true;
            ri5.g = false;
            if (ri5.d) {
                ri5.d = false;
            }
            ri5.c = qz9Var;
            jn7.e().k(jn7.j1, 512);
            this.Y1.d();
            this.W1.setDuration(800L);
            k0aVar.setLayerType(2, null);
            this.g0.setLayerType(2, null);
            this.f0.setLayerType(2, null);
            this.c0.setLayerType(2, null);
            t62 t62Var = this.o0;
            if (t62Var != null) {
                t62Var.setLayerType(2, null);
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

    public void setBackgroundDelegate(n0a n0aVar) {
        this.V = n0aVar;
    }

    public void setDrawBackground(boolean z) {
        this.R0 = z;
        this.b0.setClipToOutline(z);
        a81 a81Var = this.c0;
        if (!z) {
            a81Var.setVisibility(8);
        } else {
            a81Var.setVisibility(0);
        }
    }

    public void setEnterAnimationInProgress(boolean z) {
        if (this.U != z) {
            this.U = z;
            if (!z) {
                hl.d0(this.i0, new bm0((byte) 26));
                int i = 0;
                while (true) {
                    int childCount = this.e0.b.getChildCount();
                    xy3 xy3Var = this.e0;
                    if (i < childCount) {
                        View childAt = xy3Var.b.getChildAt(i);
                        childAt.setScaleX(1.0f);
                        childAt.setScaleY(1.0f);
                        i++;
                    } else {
                        xy3Var.b.invalidate();
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
        w0a w0aVar = this.P;
        if (w0aVar != null) {
            w0aVar.h.g0(drawable);
        }
    }

    public void setLongPressEnabled(boolean z) {
        this.i1 = z;
    }

    public void setOnLongPressedListener(l1a l1aVar) {
        this.I = l1aVar;
    }

    public void setRecentReactions(List<w49> list) {
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
        k0a k0aVar = this.i0;
        if (k0aVar != null) {
            for (int i = 0; i < k0aVar.getChildCount(); i++) {
                if (k0aVar.getChildAt(i) instanceof w0a) {
                    w0a w0aVar = (w0a) k0aVar.getChildAt(i);
                    hm hmVar = w0aVar.e;
                    if (hmVar != null) {
                        w0aVar.d(hashSet.contains(Long.valueOf(hmVar.getDocumentId())), true);
                    } else {
                        w0aVar.d(hashSet.contains(0L), true);
                    }
                }
            }
            k0aVar.invalidate();
        }
    }

    public void setSelectedReaction(w49 w49Var) {
        this.K.clear();
        this.K.add(w49Var);
        k0a k0aVar = this.i0;
        if (k0aVar != null) {
            for (int i = 0; i < k0aVar.getChildCount(); i++) {
                if (k0aVar.getChildAt(i) instanceof w0a) {
                    w0a w0aVar = (w0a) k0aVar.getChildAt(i);
                    w0aVar.d(this.K.contains(w0aVar.y), true);
                }
            }
            k0aVar.invalidate();
        }
        a0a a0aVar = this.j0;
        if (a0aVar != null) {
            for (int i2 = 0; i2 < a0aVar.getChildCount(); i2++) {
                if (a0aVar.getChildAt(i2) instanceof w0a) {
                    w0a w0aVar2 = (w0a) a0aVar.getChildAt(i2);
                    w0aVar2.d(this.K.contains(w0aVar2.y), true);
                }
            }
            a0aVar.invalidate();
        }
    }

    public void setSelectedReactions(ArrayList<String> arrayList) {
        this.K.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            this.K.add(w49.b(str));
        }
        k0a k0aVar = this.i0;
        if (k0aVar != null) {
            for (int i2 = 0; i2 < k0aVar.getChildCount(); i2++) {
                if (k0aVar.getChildAt(i2) instanceof w0a) {
                    w0a w0aVar = (w0a) k0aVar.getChildAt(i2);
                    w0aVar.d(this.K.contains(w0aVar.y), true);
                }
            }
            k0aVar.invalidate();
        }
    }

    public boolean t() {
        return false;
    }

    public final void u(int i, int i2) {
        int i3;
        b0a b0aVar = this.s0;
        View m = b0aVar.m(i);
        int K0 = b0aVar.K0();
        if ((m == null && Math.abs(i - K0) > 72.0f) || !xea.c()) {
            if (b0aVar.K0() < i) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            hw6 hw6Var = this.t0;
            hw6Var.b = i3;
            hw6Var.k(i, i2, false, false);
            return;
        }
        aw3 aw3Var = new aw3((byte) 4, this.i0.getContext(), this);
        aw3Var.a = i;
        aw3Var.p = i2;
        b0aVar.v0(aw3Var);
    }

    @Override
    public final void updateColors() {
        int v0;
        try {
            if (!this.m1 || (v0 = aob.v0(aob.v6, this.a1)) == this.g1) {
                return;
            }
            this.g1 = v0;
            this.N.setColor(vm2.o(v0, 30));
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.g1, PorterDuff.Mode.SRC_IN);
            this.l1 = porterDuffColorFilter;
            wl wlVar = this.X0;
            if (wlVar != null) {
                wlVar.setColorFilter(porterDuffColorFilter);
            }
            k0a k0aVar = this.i0;
            if (k0aVar != null) {
                k0aVar.invalidate();
            }
            a0a a0aVar = this.j0;
            if (a0aVar != null) {
                a0aVar.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void v(String str, boolean z, boolean z2) {
        long j;
        qz9 qz9Var = this.K1;
        if (qz9Var != null) {
            hl.r(qz9Var);
            this.K1 = null;
        }
        my6 my6Var = this.L1;
        if (my6Var != null) {
            hl.r(my6Var);
            this.L1 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        x0a x0aVar = this.r0;
        e0a e0aVar = this.g0;
        if (isEmpty) {
            this.z1 = false;
            this.A1 = false;
            z(false, z);
            if (e0aVar != null) {
                e0aVar.d(true);
                e0aVar.c(false);
            }
            x0aVar.E(true);
            this.B1 = null;
        } else {
            boolean z3 = this.z1;
            boolean z4 = !z3;
            this.z1 = true;
            this.A1 = false;
            if (e0aVar != null) {
                e0aVar.f.b(2);
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
                x0aVar.E(false);
            } else if (!str.equals(this.B1)) {
                qz9 qz9Var2 = new qz9(this, (byte) 1);
                this.K1 = qz9Var2;
                hl.d3(qz9Var2, 120L);
            }
            this.B1 = str;
            String[] F0 = hl.F0();
            if (!Arrays.equals(F0, c2)) {
                ls6.d0(this.W).O(F0, false);
            }
            c2 = F0;
            my6 my6Var2 = new my6(this, str, z, z4, F0, (byte) 4);
            this.L1 = my6Var2;
            if (z2) {
                j = 425;
            } else {
                j = 0;
            }
            hl.d3(my6Var2, j);
            if (e0aVar != null) {
                e0aVar.f.b(2);
                e0aVar.c(z);
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
        ofFloat.addUpdateListener(new pz9(this, (byte) 3));
        this.j1.setDuration(200L);
        this.j1.setInterpolator(k43.f);
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
        k0a k0aVar = this.i0;
        if (k0aVar != null) {
            for (int i = 0; i < k0aVar.getChildCount(); i++) {
                if (k0aVar.getChildAt(i) instanceof w0a) {
                    w0a w0aVar = (w0a) k0aVar.getChildAt(i);
                    hm hmVar = w0aVar.e;
                    if (hmVar != null && hmVar.getDocumentId() == l.longValue()) {
                        w0aVar.e(z2, z);
                    } else {
                        TLRPC.Document document = w0aVar.d;
                        if (document != null && document.id == l.longValue()) {
                            w0aVar.e(z2, z);
                        }
                    }
                }
            }
            k0aVar.invalidate();
        }
    }

    public final void y(ul ulVar, View view) {
        int i;
        Integer num;
        if (ulVar != null && (num = ulVar.G) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        this.o1 = i;
        this.p1 = ulVar;
        this.r1 = view;
        if (this.J && ulVar != null) {
            ulVar.n = this;
        }
        invalidate();
    }

    public final void z(boolean z, boolean z2) {
        float f;
        if (this.H1 == z) {
            return;
        }
        this.H1 = z;
        k0a k0aVar = this.i0;
        k0aVar.setVisibility(0);
        a0a a0aVar = this.j0;
        a0aVar.setVisibility(0);
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
        ofFloat.addUpdateListener(new tz9(this, z, (byte) 0));
        this.G1.addListener(new g0a(this, z, (byte) 0));
        this.G1.setDuration(320L);
        this.G1.setInterpolator(k43.h);
        this.G1.start();
        ViewPropertyAnimator animate = ((View) k0aVar.getParent()).animate();
        if (this.H1 && z2) {
            f = -hl.L(36.0f);
        } else {
            f = 0.0f;
        }
        ik8.t(animate.translationY(f).setUpdateListener(new pz9(this, (byte) 2)), k43.f, 160L);
        if (this.H1 && z2) {
            a0aVar.setPadding(hl.L(5.0f), hl.L(54.0f), hl.L(5.0f), hl.L(38.0f));
        } else {
            a0aVar.setPadding(hl.L(5.0f), hl.L(54.0f), hl.L(5.0f), hl.L(38.0f));
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

    public void setOnRecentClearedListener(m1a m1aVar) {
    }

    @Override
    public void setPressed(boolean z) {
    }

    public void q(w0a w0aVar, w49 w49Var) {
    }

    public void setSelectedReactions(HashSet<w49> hashSet) {
        this.K = hashSet;
        HashSet hashSet2 = this.L;
        hashSet2.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null && ((w49) arrayList.get(i)).g != 0) {
                hashSet2.add(Long.valueOf(((w49) arrayList.get(i)).g));
            }
        }
    }

    public n1a(e eVar, Context context, boolean z, Integer num, int i, boolean z2, vnb vnbVar, int i2) {
        this(eVar, context, z, num, i, z2, vnbVar, i2, aob.v0(aob.v6, vnbVar));
    }

    public n1a(e eVar, Context context, boolean z, Integer num, int i, vnb vnbVar) {
        this(eVar, context, z, num, i, true, vnbVar, 16);
    }
}
