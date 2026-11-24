package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class l07 extends FrameLayout {
    public final pc0 a;
    public final bf0 b;
    public final lka c;
    public final lka d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public l07(Context context, final k07 k07Var, boolean z) {
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
        this.a = new pc0((ylb) null);
        bf0 bf0Var = new bf0(getContext());
        this.b = bf0Var;
        lka lkaVar = new lka(getContext());
        this.c = lkaVar;
        lka lkaVar2 = new lka(getContext());
        this.d = lkaVar2;
        bf0Var.setRoundRadius(gm.L(23.0f));
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(bf0Var, qoe.d(46, 46.0f, i, 12.0f, 8.0f, 12.0f, 0.0f));
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        lkaVar.setGravity(i2);
        lkaVar.setMaxLines(1);
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(17);
        lkaVar.setTypeface(gm.o());
        boolean z2 = jb6.a0;
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
        addView(lkaVar, qoe.d(-1, -2.0f, 48, f, 12.0f, f2, 0.0f));
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        lkaVar2.setGravity(i3);
        lkaVar2.setMaxLines(1);
        anb.W(lkaVar2, cmb.x6, null);
        lkaVar2.setTextSize(14);
        boolean z3 = jb6.a0;
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
        addView(lkaVar2, qoe.d(-1, -2.0f, 48, f3, 36.0f, f4, 0.0f));
        int L2 = gm.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(ulb.f(cmb.Ei, 16.0f));
        if (jb6.a0) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        textView.setGravity(i4 | 16);
        textView.setMaxLines(1);
        textView.setPadding(L2, 0, L2, 0);
        if (z) {
            i5 = 2131754375;
        } else {
            i5 = 2131754370;
        }
        textView.setText(jb6.M0(i5, null));
        anb.X(textView, cmb.Ii, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(gm.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final l07 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                k07 k07Var2 = k07Var;
                l07 l07Var = this.b;
                switch (b) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = l07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter, true);
                            return;
                        }
                        return;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = l07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter2, false);
                            return;
                        }
                        return;
                }
            }
        });
        boolean z4 = jb6.a0;
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
        addView(textView, qoe.d(-2, 32.0f, i6, f5, 62.0f, f6, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 << 1);
        TextView textView2 = new TextView(getContext());
        int L3 = gm.L(16.0f);
        textView2.setBackground(cmb.i0(L3, L3, L3, L3, 0, cmb.w0(null, cmb.h6, false), -16777216));
        if (jb6.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(jb6.M0(2131751306, null));
        anb.X(textView2, cmb.m6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(gm.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final l07 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                k07 k07Var2 = k07Var;
                l07 l07Var = this.b;
                switch (b) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = l07Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter, true);
                            return;
                        }
                        return;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = l07Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((x07) k07Var2).d(tL_chatInviteImporter2, false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, gm.L(32.0f), jb6.a0 ? 5 : 3);
        layoutParams.topMargin = gm.L(62.0f);
        if (jb6.a0) {
            L = 0;
        } else {
            L = (int) (gm.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = jb6.a0 ? (int) (measureText + gm.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public bf0 getAvatarImageView() {
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
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(107.0f), 1073741824));
    }
}
