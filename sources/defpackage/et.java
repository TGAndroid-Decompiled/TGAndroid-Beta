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
public final class et extends FrameLayout implements Checkable {
    public final boolean a;
    public final TextView b;
    public final TextView c;
    public final bf0 d;
    public final mu8 e;
    public final mu8 f;
    public boolean h;
    public Button n;
    public AnimatorSet r;
    public TLRPC.StickerSetCovered s;
    public dt w;
    public boolean x;

    public et(Context context, boolean z) {
        super(context);
        this.a = z;
        if (z) {
            mu8 mu8Var = new mu8(context);
            this.f = mu8Var;
            this.n = mu8Var;
            mu8Var.setText(jb6.M0(2131754483, null));
            anb.X(mu8Var, cmb.Ii, null);
            mu8Var.setProgressColor(cmb.w0(null, cmb.Di, false));
            int i = cmb.Ei;
            int w0 = cmb.w0(null, i, false);
            cmb.w0(null, cmb.Gi, false);
            mu8Var.setBackground(ulb.e(w0, 14.0f));
            Drawable background = mu8Var.getBackground();
            wmb M = anb.M(i);
            mu8Var.setBackground(background);
            anb.j(mu8Var, background, M, null, null);
            addView(mu8Var, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            int L = gm.L(60.0f);
            mu8 mu8Var2 = new mu8(context);
            this.e = mu8Var2;
            mu8Var2.setAllCaps(false);
            mu8Var2.setMinWidth(L);
            mu8Var2.setMinimumWidth(L);
            mu8Var2.setTextSize(1, 14.0f);
            int i2 = cmb.Hi;
            anb.X(mu8Var2, i2, null);
            mu8Var2.setText(jb6.M0(2131744544, null));
            fg0 H0 = cmb.H0(gm.L(3.0f), cmb.w0(null, i2, false));
            wmb g = anb.g(i2, 25);
            mu8Var2.setBackground(H0);
            anb.j(mu8Var2, H0, null, g, null);
            mu8Var2.setTypeface(gm.o());
            vze.a(mu8Var2, 8.0f, 0.0f, 8.0f, 0.0f);
            mu8Var2.setOutlineProvider(null);
            addView(mu8Var2, qoe.i(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
            j1 j1Var = new j1(this, (byte) 11);
            mu8Var.setOnClickListener(j1Var);
            mu8Var2.setOnClickListener(j1Var);
            c(false);
        } else {
            this.f = null;
            this.e = null;
        }
        TextView textView = new TextView(context);
        this.b = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(qoe.y());
        addView(textView, qoe.i(-2.0f, -2.0f, 8388611, 71.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.X(textView2, cmb.y6, null);
        wi8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(qoe.y());
        addView(textView2, qoe.i(-2.0f, -2.0f, 8388611, 71.0f, 35.0f, 21.0f, 0.0f));
        bf0 bf0Var = new bf0(context);
        this.d = bf0Var;
        bf0Var.setAspectFit(true);
        bf0Var.setLayerNum(1);
        addView(bf0Var, qoe.i(48.0f, 48.0f, 8388659, 12.0f, 8.0f, 0.0f, 0.0f));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        dt dtVar;
        int i;
        if (this.a && this.x != z) {
            this.x = z;
            c(z2);
            if (z3 && (dtVar = this.w) != null) {
                o oVar = (o) dtVar;
                ht htVar = ((gt) oVar.b).d;
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) oVar.c;
                vh6 vh6Var = htVar.a;
                int i2 = 1;
                if (z) {
                    a(false, false, false);
                    if (vh6Var.h(stickerSetCovered.set.id) < 0) {
                        mu8 mu8Var = this.f;
                        if (mu8Var != null) {
                            mu8Var.a(true, true);
                        }
                        vh6Var.k(stickerSetCovered, stickerSetCovered.set.id);
                    } else {
                        return;
                    }
                }
                i = ((d) htVar).currentAccount;
                hs6 d0 = hs6.d0(i);
                Activity parentActivity = htVar.getParentActivity();
                if (z) {
                    i2 = 2;
                }
                d0.h2(parentActivity, stickerSetCovered, i2, htVar, false, false);
            }
        }
    }

    public final void b(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        TLRPC.Document document;
        gn5 k;
        this.h = z;
        this.s = stickerSetCovered;
        setWillNotDraw(!z);
        this.b.setText(this.s.set.title);
        TLRPC.StickerSet stickerSet = stickerSetCovered.set;
        boolean z2 = stickerSet.emojis;
        int i = stickerSet.count;
        TextView textView = this.c;
        if (z2) {
            textView.setText(jb6.G(i, "EmojiCount", new Object[0]));
        } else {
            textView.setText(jb6.G(i, "Stickers", new Object[0]));
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
        bf0 bf0Var = this.d;
        if (document != null) {
            TLObject w = bc4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            if (w == null) {
                w = document;
            }
            meb d = eq3.d(stickerSetCovered.set.thumbs, cmb.Z6, 1.0f, false);
            boolean z3 = w instanceof TLRPC.Document;
            if (z3) {
                k = gn5.c(bc4.w(document.thumbs, 90, false, null, false), document);
            } else {
                k = gn5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            }
            if (z3 && (k47.K2(document, true) || k47.M4(document))) {
                if (d != null) {
                    bf0Var.p(gn5.b(document), "50_50", d, stickerSetCovered);
                    return;
                } else {
                    bf0Var.h(gn5.b(document), "50_50", k, null, 0, stickerSetCovered);
                    return;
                }
            } else if (k != null && k.p == 1) {
                bf0Var.n(k, "50_50", "tgs", d, stickerSetCovered);
                return;
            } else {
                bf0Var.n(k, "50_50", "webp", d, stickerSetCovered);
                return;
            }
        }
        bf0Var.n(null, null, "webp", null, stickerSetCovered);
    }

    public final void c(boolean z) {
        int i;
        mu8 mu8Var;
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
            mu8 mu8Var2 = this.f;
            mu8 mu8Var3 = this.e;
            if (z) {
                if (z2) {
                    mu8Var = mu8Var3;
                } else {
                    mu8Var = mu8Var2;
                }
                this.n = mu8Var;
                mu8Var2.setVisibility(0);
                mu8Var3.setVisibility(0);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.r = animatorSet2;
                animatorSet2.setDuration(250L);
                AnimatorSet animatorSet3 = this.r;
                Property property = View.ALPHA;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mu8Var3, property, f2);
                Property property2 = View.SCALE_X;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mu8Var3, property2, f2);
                float[] fArr = {f2};
                Property property3 = View.SCALE_Y;
                animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(mu8Var3, property3, fArr), ObjectAnimator.ofFloat(mu8Var2, property, f), ObjectAnimator.ofFloat(mu8Var2, property2, f), ObjectAnimator.ofFloat(mu8Var2, property3, f));
                this.r.addListener(new g0(this, (byte) 12));
                this.r.setInterpolator(new OvershootInterpolator(1.02f));
                this.r.start();
                return;
            }
            if (z2) {
                i = 0;
            } else {
                i = 4;
            }
            mu8Var3.setVisibility(i);
            mu8Var3.setAlpha(f2);
            mu8Var3.setScaleX(f2);
            mu8Var3.setScaleY(f2);
            if (!this.x) {
                i2 = 0;
            }
            mu8Var2.setVisibility(i2);
            mu8Var2.setAlpha(f);
            mu8Var2.setScaleX(f);
            mu8Var2.setScaleY(f);
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
            canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.h ? 1 : 0), 1073741824));
    }

    @Override
    public void setChecked(boolean z) {
        a(z, true, true);
    }

    public void setOnCheckedChangeListener(dt dtVar) {
        this.w = dtVar;
    }

    @Override
    public final void toggle() {
        if (this.a) {
            setChecked(!this.x);
        }
    }
}
