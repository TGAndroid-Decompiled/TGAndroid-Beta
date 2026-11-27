package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class s07 extends FrameLayout {
    public final rb0 a;
    public final de0 b;
    public final ema c;
    public final ema d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public s07(Context context, final r07 r07Var, boolean z) {
        super(context);
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        float f4;
        int i4;
        int i5;
        int i6;
        float f5;
        float f6;
        int i7;
        int L;
        this.a = new rb0((vnb) null);
        de0 de0Var = new de0(getContext());
        this.b = de0Var;
        ema emaVar = new ema(getContext());
        this.c = emaVar;
        ema emaVar2 = new ema(getContext());
        this.d = emaVar2;
        de0Var.setRoundRadius(hl.L(23.0f));
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(de0Var, tre.d(46, 46.0f, i, 12.0f, 8.0f, 12.0f, 0.0f));
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        emaVar.setGravity(i2);
        emaVar.setMaxLines(1);
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(17);
        emaVar.setTypeface(hl.o());
        boolean z2 = ob6.a0;
        if (z2) {
            f = 12.0f;
        } else {
            f = 74.0f;
        }
        if (z2) {
            f2 = 74.0f;
        } else {
            f2 = 12.0f;
        }
        addView(emaVar, tre.d(-1, -2.0f, 48, f, 12.0f, f2, 0.0f));
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar2.setGravity(i3);
        emaVar2.setMaxLines(1);
        yob.W(emaVar2, aob.y6, null);
        emaVar2.setTextSize(14);
        boolean z3 = ob6.a0;
        if (z3) {
            f3 = 12.0f;
        } else {
            f3 = 74.0f;
        }
        if (z3) {
            f4 = 74.0f;
        } else {
            f4 = 12.0f;
        }
        addView(emaVar2, tre.d(-1, -2.0f, 48, f3, 36.0f, f4, 0.0f));
        int L2 = hl.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(rnb.f(aob.Fi, 16.0f));
        if (ob6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView.setGravity(i4 | 16);
        textView.setMaxLines(1);
        textView.setPadding(L2, 0, L2, 0);
        if (z) {
            i5 = 2131754371;
        } else {
            i5 = 2131754366;
        }
        textView.setText(ob6.M0(i5, null));
        yob.X(textView, aob.Ji, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(hl.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final s07 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                r07 r07Var2 = r07Var;
                s07 s07Var = this.b;
                switch (b) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = s07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter, true);
                            return;
                        }
                        return;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = s07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter2, false);
                            return;
                        }
                        return;
                }
            }
        });
        boolean z4 = ob6.a0;
        if (z4) {
            i6 = 5;
            f5 = 0.0f;
        } else {
            i6 = 3;
            f5 = 73.0f;
        }
        if (z4) {
            f6 = 73.0f;
        } else {
            f6 = 0.0f;
        }
        addView(textView, tre.d(-2, 32.0f, i6, f5, 62.0f, f6, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 << 1);
        TextView textView2 = new TextView(getContext());
        int L3 = hl.L(16.0f);
        textView2.setBackground(aob.i0(L3, L3, L3, L3, 0, aob.w0(null, aob.i6, false), -16777216));
        if (ob6.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(ob6.M0(2131751334, null));
        yob.X(textView2, aob.n6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(hl.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final s07 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                r07 r07Var2 = r07Var;
                s07 s07Var = this.b;
                switch (b) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = s07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter, true);
                            return;
                        }
                        return;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = s07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((e17) r07Var2).d(tL_chatInviteImporter2, false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, hl.L(32.0f), ob6.a0 ? 5 : 3);
        layoutParams.topMargin = hl.L(62.0f);
        if (ob6.a0) {
            L = 0;
        } else {
            L = (int) (hl.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = ob6.a0 ? (int) (measureText + hl.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public de0 getAvatarImageView() {
        return this.b;
    }

    public TLRPC.TL_chatInviteImporter getImporter() {
        return this.e;
    }

    public String getStatus() {
        return this.d.getText().toString();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.f) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(107.0f), 1073741824));
    }
}
