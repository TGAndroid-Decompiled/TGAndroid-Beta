package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i84 extends FrameLayout implements gk7, tjb {
    public boolean E;
    public Long F;
    public boolean G;
    public Drawable H;
    public boolean a;
    public final int b;
    public final TextView c;
    public final TextView d;
    public final be0 e;
    public final ls8 f;
    public final TextView h;
    public final ah8 n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public boolean w;
    public boolean x;
    public boolean y;

    public i84(Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        float f5;
        float f6;
        this.a = bkb.I.o();
        this.b = y6c.t0;
        TextView textView = new TextView(context);
        this.c = textView;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i);
        boolean z = k96.a0;
        if (z) {
            i2 = 5;
            f = 22.0f;
        } else {
            i2 = 3;
            f = 71.0f;
        }
        if (z) {
            f2 = 71.0f;
        } else {
            f2 = 22.0f;
        }
        addView(textView, nme.d(-2, -2.0f, i2, f, 10.0f, f2, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        zkb.X(textView2, bkb.y6, null);
        ug8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3);
        boolean z2 = k96.a0;
        if (z2) {
            f3 = 100.0f;
            i4 = 5;
        } else {
            i4 = 3;
            f3 = 71.0f;
        }
        if (z2) {
            f4 = 71.0f;
        } else {
            f4 = 100.0f;
        }
        addView(textView2, nme.d(-2, -2.0f, i4, f3, 35.0f, f4, 0.0f));
        be0 be0Var = new be0(context);
        this.e = be0Var;
        be0Var.setAspectFit(true);
        be0Var.setLayerNum(1);
        boolean z3 = k96.a0;
        int i5 = (z3 ? 5 : 3) | 48;
        if (z3) {
            f5 = 0.0f;
        } else {
            f5 = 12.0f;
        }
        if (z3) {
            f6 = 12.0f;
        } else {
            f6 = 0.0f;
        }
        addView(be0Var, nme.d(48, 48.0f, i5, f5, 8.0f, f6, 0.0f));
        ls8 ls8Var = new ls8(context);
        this.f = ls8Var;
        ls8Var.setText(k96.M0(2131754483, null));
        zkb.X(ls8Var, bkb.Ii, null);
        addView(ls8Var, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setGravity(17);
        tb4.w(textView3, bkb.Hi, null, 1, 14.0f);
        textView3.setText(k96.M0(2131744618, null));
        addView(textView3, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
        ah8 ah8Var = new ah8(gl.L(4.0f), wjbVar, context, false);
        this.n = ah8Var;
        ah8Var.setIcon(2131624309);
        ah8Var.b(k96.M0(2131743637, null), new x00(this, (byte) 5), false);
        ah8Var.setVisibility(8);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ah8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = gl.L(1.0f);
            marginLayoutParams.topMargin = gl.L(1.0f);
            int L = gl.L(20.0f);
            marginLayoutParams.height = L;
            marginLayoutParams.width = L;
            ((ViewGroup.MarginLayoutParams) ah8Var.getTextView().getLayoutParams()).leftMargin = gl.L(3.0f);
            ah8Var.getChildAt(0).setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        addView(this.n, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 10.0f, 0.0f));
        updateColors();
    }

    public final void a(TLRPC.StickerSetCovered stickerSetCovered, boolean z, boolean z2, boolean z3) {
        String str;
        TLRPC.Document document;
        TLRPC.Document document2;
        TLRPC.StickerSetCovered stickerSetCovered2;
        boolean z4;
        boolean z5;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        gl5 k;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList;
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r = null;
        }
        this.y = z;
        this.s = stickerSetCovered;
        setWillNotDraw(!z);
        String str2 = this.s.set.title;
        TextView textView = this.c;
        textView.setText(str2);
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
        if (stickerSet2.emojis) {
            str = "EmojiCount";
        } else {
            str = "Stickers";
        }
        this.d.setText(k96.G(stickerSet2.count, str, new Object[0]));
        boolean z6 = stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered;
        int i = this.b;
        if (z6 && (stickerSet = stickerSetCovered.set) != null) {
            this.F = Long.valueOf(stickerSet.id);
            if (!this.E) {
                kk7.f(i).b(this, kk7.A0);
                this.E = true;
            }
            TLRPC.TL_messages_stickerSet m0 = hq6.d0(i).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), false, false, null);
            if (m0 != null && (arrayList = m0.documents) != null && !arrayList.isEmpty()) {
                document = m0.documents.get(0);
                int i2 = 0;
                while (true) {
                    if (i2 >= m0.documents.size()) {
                        break;
                    } else if (m0.documents.get(i2).id == stickerSetCovered.set.thumb_document_id) {
                        document = m0.documents.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            document = null;
        } else {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                    if (stickerSetCovered.set != null) {
                        for (int i3 = 0; i3 < stickerSetCovered.covers.size(); i3++) {
                            if (stickerSetCovered.covers.get(i3).id == stickerSetCovered.set.thumb_document_id) {
                                document2 = stickerSetCovered.covers.get(i3);
                                document = document2;
                                break;
                            }
                        }
                    }
                } else {
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                        if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                            ArrayList<TLRPC.Document> arrayList2 = tL_stickerSetFullCovered.documents;
                            document = arrayList2.get(0);
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                if (arrayList2.get(i4).id == stickerSetCovered.set.thumb_document_id) {
                                    document2 = arrayList2.get(i4);
                                    document = document2;
                                    break;
                                }
                            }
                        }
                    }
                    document = null;
                }
            }
        }
        be0 be0Var = this.e;
        if (document != null) {
            if (k27.p(document)) {
                TLObject w = ba4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
                if (w == null) {
                    w = document;
                }
                kcb d = uo3.d(stickerSetCovered.set.thumbs, bkb.Z6, 1.0f, false);
                boolean z7 = w instanceof TLRPC.Document;
                if (z7) {
                    k = gl5.c(ba4.w(document.thumbs, 90, false, null, false), document);
                } else {
                    k = gl5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
                }
                gl5 gl5Var = k;
                if (z7 && (k27.K2(document, true) || k27.M4(document))) {
                    if (d != null) {
                        be0Var.p(gl5.b(document), "50_50", d, stickerSetCovered);
                    } else {
                        be0Var.h(gl5.b(document), "50_50", gl5Var, null, 0, stickerSetCovered);
                    }
                } else if (gl5Var != null && gl5Var.p == 1) {
                    be0Var.n(gl5Var, "50_50", "tgs", d, stickerSetCovered);
                } else {
                    be0Var.n(gl5Var, "50_50", "webp", d, stickerSetCovered);
                }
            } else {
                TLRPC.PhotoSize w2 = ba4.w(document.thumbs, 90, false, null, false);
                if (w2 != null) {
                    be0Var.n(gl5.c(w2, document), "50_50", "webp", null, stickerSetCovered);
                } else {
                    be0Var.n(gl5.b(document), "50_50", "webp", null, stickerSetCovered);
                }
            }
            stickerSetCovered2 = stickerSetCovered;
        } else {
            stickerSetCovered2 = stickerSetCovered;
            be0Var.n(null, null, "webp", null, stickerSetCovered2);
        }
        ls8 ls8Var = this.f;
        ls8Var.setVisibility(0);
        this.G = z2;
        if (!z2 && !hq6.d0(i).D0(stickerSetCovered2.set.id, true)) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.w = z4;
        if (!y6c.h(i).p() && k27.T3(stickerSetCovered2)) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.x = z5;
        ah8 ah8Var = this.n;
        TextView textView2 = this.h;
        if (z3) {
            if (z5) {
                ah8Var.setVisibility(0);
                textView2.setVisibility(0);
                ls8Var.setVisibility(0);
            } else {
                ah8Var.setVisibility(0);
                if (this.w) {
                    textView2.setVisibility(0);
                } else {
                    ls8Var.setVisibility(0);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.r = animatorSet2;
            animatorSet2.setDuration(250L);
            AnimatorSet animatorSet3 = this.r;
            if (this.w && !this.x) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            float[] fArr = {f};
            Property property = View.ALPHA;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, fArr);
            if (this.w && !this.x) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            float[] fArr2 = {f2};
            Property property2 = View.SCALE_X;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView2, property2, fArr2);
            if (this.w && !this.x) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            float[] fArr3 = {f3};
            Property property3 = View.SCALE_Y;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView2, property3, fArr3);
            if (!this.w && !this.x) {
                f4 = 1.0f;
            } else {
                f4 = 0.0f;
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ls8Var, property, f4);
            if (!this.w && !this.x) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ls8Var, property2, f5);
            if (!this.x) {
                f6 = 0.0f;
            } else {
                f6 = 1.0f;
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ah8Var, property3, f6);
            if (!this.x) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(ah8Var, property2, f7);
            if (!this.x) {
                f8 = 0.0f;
            } else {
                f8 = 1.0f;
            }
            animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ObjectAnimator.ofFloat(ah8Var, property3, f8));
            this.r.addListener(new g84(this));
            this.r.setInterpolator(new OvershootInterpolator(1.02f));
            this.r.start();
        } else if (z5) {
            ah8Var.setVisibility(0);
            ah8Var.setAlpha(1.0f);
            ah8Var.setScaleX(1.0f);
            ah8Var.setScaleY(1.0f);
            ls8Var.setVisibility(4);
            ls8Var.setAlpha(0.0f);
            ls8Var.setScaleX(0.0f);
            ls8Var.setScaleY(0.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        } else {
            ah8Var.setVisibility(8);
            ah8Var.setAlpha(0.0f);
            ah8Var.setScaleX(0.0f);
            ah8Var.setScaleY(0.0f);
            if (this.w) {
                textView2.setVisibility(0);
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                ls8Var.setVisibility(4);
                ls8Var.setAlpha(0.0f);
                ls8Var.setScaleX(0.0f);
                ls8Var.setScaleY(0.0f);
                return;
            }
            ls8Var.setVisibility(0);
            ls8Var.setAlpha(1.0f);
            ls8Var.setScaleX(1.0f);
            ls8Var.setScaleY(1.0f);
            textView2.setVisibility(4);
            textView2.setAlpha(0.0f);
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Di));
        hashSet.add(Integer.valueOf(bkb.Ei));
        hashSet.add(Integer.valueOf(bkb.c7));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.A0) {
            long longValue = ((Long) objArr[0]).longValue();
            Long l = this.F;
            if (l != null && l.longValue() == longValue) {
                this.F = null;
                TLRPC.TL_stickerSetNoCovered tL_stickerSetNoCovered = new TLRPC.TL_stickerSetNoCovered();
                tL_stickerSetNoCovered.set = ((TLRPC.TL_messages_stickerSet) objArr[1]).set;
                a(tL_stickerSetNoCovered, this.y, this.G, true);
            }
        }
    }

    public be0 getImageView() {
        return this.e;
    }

    public TLRPC.StickerSetCovered getStickerSet() {
        return this.s;
    }

    public TextView getTextView() {
        return this.c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.E) {
            kk7.f(this.b).n(this, kk7.A0);
            this.E = false;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (this.y) {
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(71.0f);
            }
            float f = L;
            float height = getHeight() - 1;
            int width = getWidth();
            if (k96.a0) {
                i = gl.L(71.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, height, width - i, getHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.y ? 1 : 0), 1073741824));
        int measuredWidth = this.f.getMeasuredWidth();
        TextView textView = this.h;
        int measuredWidth2 = textView.getMeasuredWidth();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (measuredWidth2 < measuredWidth) {
            layoutParams.rightMargin = ug8.g(measuredWidth, measuredWidth2, 2, gl.L(14.0f));
        } else {
            layoutParams.rightMargin = gl.L(14.0f);
        }
        measureChildWithMargins(this.c, i, measuredWidth, i2, 0);
    }

    public void setAddOnClickListener(View.OnClickListener onClickListener) {
        this.f.setOnClickListener(onClickListener);
        this.h.setOnClickListener(onClickListener);
    }

    @Override
    public final void updateColors() {
        ls8 ls8Var = this.f;
        if (ls8Var != null) {
            ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
            try {
                Drawable background = ls8Var.getBackground();
                if (background != null && background == this.H && (background instanceof RippleDrawable)) {
                    RippleDrawable rippleDrawable = (RippleDrawable) background;
                    if (rippleDrawable.getNumberOfLayers() > 0 && rippleDrawable.getId(0) != 16908334 && (rippleDrawable.getDrawable(0) instanceof ShapeDrawable)) {
                        int w0 = bkb.w0(null, bkb.Ei, false);
                        ShapeDrawable shapeDrawable = (ShapeDrawable) rippleDrawable.getDrawable(0);
                        if (shapeDrawable.getPaint().getColor() == w0 && this.a == bkb.I.o()) {
                            return;
                        }
                        this.a = bkb.I.o();
                        shapeDrawable.getPaint().setColor(w0);
                        rippleDrawable.setColor(ColorStateList.valueOf(sjb.b(w0)));
                        rippleDrawable.invalidateSelf();
                        return;
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            int w02 = bkb.w0(null, bkb.Ei, false);
            bkb.w0(null, bkb.Gi, false);
            ls8Var.setBackground(sjb.e(w02, 14.0f));
            this.H = ls8Var.getBackground();
        }
    }
}
