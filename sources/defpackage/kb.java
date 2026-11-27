package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class kb extends FrameLayout implements snb {
    public final de0 a;
    public final ema b;
    public final ema c;
    public final rb0 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final og2 r;
    public int s;

    public kb(Context context, View.OnClickListener onClickListener, boolean z, int i) {
        super(context);
        int i2;
        float f;
        float f2;
        int i3;
        int i4;
        float f3;
        float f4;
        int i5;
        int i6;
        float f5;
        float f6;
        float f7;
        int i7;
        float f8;
        float f9;
        this.n = yac.t0;
        this.d = new rb0((vnb) null);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z2 = ob6.a0;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i8 = i2 | 48;
        if (z2) {
            f = 0.0f;
        } else {
            f = i + 12;
        }
        if (z2) {
            f2 = i + 12;
        } else {
            f2 = 0.0f;
        }
        addView(de0Var, tre.d(48, 48.0f, i8, f, 6.0f, f2, 6.0f));
        if (z) {
            og2 og2Var = new og2(21, null, context);
            this.r = og2Var;
            og2Var.b(-1, aob.d6, aob.k7);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(3);
            boolean z3 = ob6.a0;
            if (z3) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i9 = i7 | 48;
            if (z3) {
                f8 = 0.0f;
            } else {
                f8 = i + 42;
            }
            if (z3) {
                f9 = i + 42;
            } else {
                f9 = 0.0f;
            }
            addView(og2Var, tre.d(24, 24.0f, i9, f8, 32.0f, f9, 0.0f));
        }
        ema emaVar = new ema(context);
        this.b = emaVar;
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(17);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar.setGravity(i3 | 48);
        boolean z4 = ob6.a0;
        if (z4) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i10 = i4 | 48;
        if (z4) {
            f3 = 62;
        } else {
            f3 = i + 73;
        }
        float f10 = f3;
        if (z4) {
            f4 = i + 73;
        } else {
            f4 = 62;
        }
        addView(emaVar, tre.d(-1, 20.0f, i10, f10, 9.5f, f4, 0.0f));
        ema emaVar2 = new ema(context);
        this.c = emaVar2;
        emaVar2.setTextSize(14);
        int i11 = aob.y6;
        yob.W(emaVar2, i11, null);
        emaVar2.setLinkTextColor(aob.w0(null, aob.J6, false));
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        emaVar2.setGravity(i5 | 48);
        boolean z5 = ob6.a0;
        if (z5) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        int i12 = i6 | 48;
        if (z5) {
            f5 = 62;
        } else {
            f5 = i + 73;
        }
        addView(emaVar2, tre.d(-1, 20.0f, i12, f5, 32.5f, z5 ? i + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232276);
        imageView.setOnClickListener(onClickListener);
        int i13 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i13, false), 1, -1);
        uob M = yob.M(i13);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        yob.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z6 = ob6.a0;
        int i14 = (z6 ? 3 : 5) | 48;
        if (z6) {
            f6 = 7.0f;
        } else {
            f6 = 0.0f;
        }
        if (z6) {
            f7 = 0.0f;
        } else {
            f7 = 7.0f;
        }
        addView(imageView, tre.d(48, 48.0f, i14, f6, 6.0f, f7, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z) {
        String k = c00.k(new StringBuilder(), uc7.s1(this.n).N2, "/");
        this.f = chat;
        rb0 rb0Var = this.d;
        rb0Var.p(chat);
        this.b.l(chat.title, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k + xc2.K(chat, false));
        spannableStringBuilder.setSpan(new f8c("", (rmb) null), k.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, rb0Var);
        this.h = z;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public ema getNameTextView() {
        return this.b;
    }

    public ema getStatusTextView() {
        return this.c;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.h) {
            i3 = 12;
        } else {
            i3 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(i3 + 60), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int[] iArr = aob.p8;
                if (i >= iArr.length) {
                    break;
                }
                i2 = (i2 * 31) + aob.w0(null, iArr[i], false);
                i++;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        if (i2 != this.s) {
            this.s = i2;
            TLRPC.Chat chat = this.f;
            if (chat != null) {
                this.d.p(chat);
                this.a.invalidate();
            }
        }
        ema emaVar = this.c;
        if (emaVar != null) {
            emaVar.setLinkTextColor(aob.w0(null, aob.J6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
