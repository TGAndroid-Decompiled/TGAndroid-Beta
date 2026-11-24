package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class jb extends FrameLayout implements tjb {
    public final be0 a;
    public final jia b;
    public final jia c;
    public final pb0 d;
    public final ImageView e;
    public TLRPC.Chat f;
    public boolean h;
    public final int n;
    public final wf2 r;
    public int s;

    public jb(Context context, View.OnClickListener onClickListener, boolean z, int i) {
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
        this.n = y6c.t0;
        this.d = new pb0((wjb) null);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z2 = k96.a0;
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
        addView(be0Var, nme.d(48, 48.0f, i8, f, 6.0f, f2, 6.0f));
        if (z) {
            wf2 wf2Var = new wf2(21, null, context);
            this.r = wf2Var;
            wf2Var.b(-1, bkb.c6, bkb.j7);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(3);
            boolean z3 = k96.a0;
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
            addView(wf2Var, nme.d(24, 24.0f, i9, f8, 32.0f, f9, 0.0f));
        }
        jia jiaVar = new jia(context);
        this.b = jiaVar;
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(17);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jiaVar.setGravity(i3 | 48);
        boolean z4 = k96.a0;
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
        addView(jiaVar, nme.d(-1, 20.0f, i10, f10, 9.5f, f4, 0.0f));
        jia jiaVar2 = new jia(context);
        this.c = jiaVar2;
        jiaVar2.setTextSize(14);
        int i11 = bkb.x6;
        zkb.W(jiaVar2, i11, null);
        jiaVar2.setLinkTextColor(bkb.w0(null, bkb.I6, false));
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        jiaVar2.setGravity(i5 | 48);
        boolean z5 = k96.a0;
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
        addView(jiaVar2, nme.d(-1, 20.0f, i12, f5, 32.5f, z5 ? i + 73 : 62, 6.0f));
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131232276);
        imageView.setOnClickListener(onClickListener);
        int i13 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.w0(null, i13, false), 1, -1);
        vkb M = zkb.M(i13);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, null);
        zkb.s(imageView, i11, null, PorterDuff.Mode.MULTIPLY);
        boolean z6 = k96.a0;
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
        addView(imageView, nme.d(48, 48.0f, i14, f6, 6.0f, f7, 0.0f));
    }

    public final void a(TLRPC.Chat chat, boolean z) {
        String j = b00.j(new StringBuilder(), na7.q1(this.n).N2, "/");
        this.f = chat;
        pb0 pb0Var = this.d;
        pb0Var.p(chat);
        this.b.l(chat.title, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(j + hc2.K(chat, false));
        spannableStringBuilder.setSpan(new g4c("", (vib) null), j.length(), spannableStringBuilder.length(), 33);
        this.c.l(spannableStringBuilder, false);
        this.a.f(chat, pb0Var);
        this.h = z;
    }

    public TLRPC.Chat getCurrentChannel() {
        return this.f;
    }

    public ImageView getDeleteButton() {
        return this.e;
    }

    public jia getNameTextView() {
        return this.b;
    }

    public jia getStatusTextView() {
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
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(i3 + 60), 1073741824));
    }

    @Override
    public final void updateColors() {
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int[] iArr = bkb.o8;
                if (i >= iArr.length) {
                    break;
                }
                i2 = (i2 * 31) + bkb.w0(null, iArr[i], false);
                i++;
            } catch (Exception e) {
                fa4.g(e, true);
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
        jia jiaVar = this.c;
        if (jiaVar != null) {
            jiaVar.setLinkTextColor(bkb.w0(null, bkb.I6, false));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
