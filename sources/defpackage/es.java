package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class es extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final be0 d;
    public final ls8 e;
    public final ls8 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public ds w;
    public boolean x;

    public es(Context context, boolean z) {
        super(context);
        this.a = z;
        if (z) {
            ls8 ls8Var = new ls8(context);
            this.f = ls8Var;
            this.n = ls8Var;
            ls8Var.setText(k96.M0(2131754483, null));
            zkb.X(ls8Var, bkb.Ii, null);
            ls8Var.setProgressColor(bkb.w0(null, bkb.Di, false));
            int i = bkb.Ei;
            int w0 = bkb.w0(null, i, false);
            bkb.w0(null, bkb.Gi, false);
            ls8Var.setBackground(sjb.e(w0, 14.0f));
            Drawable background = ls8Var.getBackground();
            vkb M = zkb.M(i);
            ls8Var.setBackground(background);
            zkb.j(ls8Var, background, M, null, null);
            addView(ls8Var, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = gl.L(60.0f);
            ls8 ls8Var2 = new ls8(context);
            this.e = ls8Var2;
            ls8Var2.setAllCaps(false);
            ls8Var2.setMinWidth(L);
            ls8Var2.setMinimumWidth(L);
            ls8Var2.setTextSize(1, 14.0f);
            int i2 = bkb.Hi;
            zkb.X(ls8Var2, i2, null);
            ls8Var2.setText(k96.M0(2131744618, null));
            ff0 H0 = bkb.H0(gl.L(3.0f), bkb.w0(null, i2, false));
            vkb g = zkb.g(i2, 25);
            ls8Var2.setBackground(H0);
            zkb.j(ls8Var2, H0, null, g, null);
            ls8Var2.setTypeface(gl.o());
            txe.a(ls8Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            ls8Var2.setOutlineProvider(null);
            addView(ls8Var2, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            j1 j1Var = new j1(this, (byte) 10);
            ls8Var.setOnClickListener(j1Var);
            ls8Var2.setOnClickListener(j1Var);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(nme.y());
        addView(textView, nme.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.X(textView2, bkb.y6, null);
        ug8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(nme.y());
        addView(textView2, nme.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        be0 be0Var = new be0(context);
        this.d = be0Var;
        be0Var.setAspectFit(true);
        be0Var.setLayerNum(1);
        addView(be0Var, nme.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        ds dsVar;
        int i;
        if (this.a && this.x != z) {
            this.x = z;
            c(z2);
            if (z3 && (dsVar = this.w) != null) {
                o oVar = (o) dsVar;
                hs hsVar = ((gs) oVar.b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.c;
                vf6 vf6Var = hsVar.a;
                int i2 = 1;
                if (z) {
                    a(false, false, false);
                    if (vf6Var.h(stickerSetCovered.set.id) < 0) {
                        ls8 ls8Var = this.f;
                        if (ls8Var != null) {
                            ls8Var.a(true, true);
                        }
                        vf6Var.k(stickerSetCovered, stickerSetCovered.set.id);
                    } else {
                        return;
                    }
                }
                i = ((d) hsVar).currentAccount;
                hq6 d0 = hq6.d0(i);
                Activity parentActivity = hsVar.getParentActivity();
                if (z) {
                    i2 = 2;
                }
                d0.h2(parentActivity, stickerSetCovered, i2, hsVar, false, false);
            }
        }
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        TLRPC.Document document;
        gl5 k;
        this.h = z;
        this.s = stickerSetCovered;
        setWillNotDraw(!z);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z2 = stickerSet.emojis;
        int i = stickerSet.count;
        TextView textView = this.c;
        if (z2) {
            textView.setText(k96.G(i, "EmojiCount", new Object[0]));
        } else {
            textView.setText(k96.G(i, "Stickers", new Object[0]));
        }
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            if (arrayList == null) {
                return;
            }
            long j = stickerSetCovered.set.thumb_document_id;
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    document = arrayList.get(i2);
                    if (document != null && document.id == j) {
                        break;
                    }
                    i2++;
                } else {
                    document = null;
                    break;
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        } else {
            document = stickerSetCovered.cover;
            if (document == null) {
                if (!stickerSetCovered.covers.isEmpty()) {
                    document = stickerSetCovered.covers.get(0);
                } else {
                    document = null;
                }
            }
        }
        be0 be0Var = this.d;
        if (document != null) {
            TLObject w = ba4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w == null) {
                w = document;
            }
            kcb d = uo3.d(stickerSetCovered.set.thumbs, bkb.Z6, 1.0f, false);
            boolean z3 = w instanceof TLRPC.Document;
            if (z3) {
                k = gl5.c(ba4.w(document.thumbs, 90, false, null, false), document);
            } else {
                k = gl5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            }
            if (z3 && (k27.K2(document, true) || k27.M4(document))) {
                if (d != null) {
                    be0Var.p(gl5.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    be0Var.h(gl5.b(document), "50_50", k, null, 0, stickerSetCovered);
                    return;
                }
            } else if (k != null && k.p == 1) {
                be0Var.n(k, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                be0Var.n(k, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        be0Var.n(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z) {
        int i;
        ls8 ls8Var;
        if (this.a) {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            boolean z2 = this.x;
            float f = 0.0f;
            float f2 = 1.0f;
            if (!z2) {
                f2 = 0.0f;
                f = 1.0f;
            }
            int i2 = 4;
            ls8 ls8Var2 = this.f;
            ls8 ls8Var3 = this.e;
            if (z) {
                if (z2) {
                    ls8Var = ls8Var3;
                } else {
                    ls8Var = ls8Var2;
                }
                this.n = ls8Var;
                ls8Var2.setVisibility(0);
                ls8Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ls8Var3, property, f2);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ls8Var3, property2, f2);
                float[] fArr = {f2};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ls8Var3, property3, fArr), ObjectAnimator.ofFloat(ls8Var2, property, f), ObjectAnimator.ofFloat(ls8Var2, property2, f), ObjectAnimator.ofFloat(ls8Var2, property3, f));
                this.r.addListener(new g0(this, (byte) 10));
                this.r.setInterpolator(new OvershootInterpolator(1.02f));
                this.r.start();
                return;
            }
            if (z2) {
                i = 0;
            } else {
                i = 4;
            }
            ls8Var3.setVisibility(i);
            ls8Var3.setAlpha(f2);
            ls8Var3.setScaleX(f2);
            ls8Var3.setScaleY(f2);
            if (!this.x) {
                i2 = 0;
            }
            ls8Var2.setVisibility(i2);
            ls8Var2.setAlpha(f);
            ls8Var2.setScaleX(f);
            ls8Var2.setScaleY(f);
        }
    }

    public TLRPC.StickerSetCovered getStickersSet() {
        return this.s;
    }

    @Override
    public final boolean isChecked() {
        return this.x;
    }

    @Override
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (this.a && view == this.b) {
            i2 += Math.max(this.f.getMeasuredWidth(), this.e.getMeasuredWidth());
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.h) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z) {
        a(z, true, true);
    }

    public void setOnCheckedChangeListener(ds dsVar) {
        this.w = dsVar;
    }

    @Override
    public final void toggle() {
        if (this.a) {
            setChecked(!this.x);
        }
    }
}
