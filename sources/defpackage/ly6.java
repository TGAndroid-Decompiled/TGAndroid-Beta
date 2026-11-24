package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ly6 extends FrameLayout {
    public final pb0 a;
    public final be0 b;
    public final jia c;
    public final jia d;
    public TLRPC.TL_chatInviteImporter e;
    public boolean f;

    public ly6(Context context, final ky6 ky6Var, boolean z) {
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
        this.a = new pb0((wjb) null);
        be0 be0Var = new be0(getContext());
        this.b = be0Var;
        jia jiaVar = new jia(getContext());
        this.c = jiaVar;
        jia jiaVar2 = new jia(getContext());
        this.d = jiaVar2;
        be0Var.setRoundRadius(gl.L(23.0f));
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        addView(be0Var, nme.d(46, 46.0f, i, 12.0f, 8.0f, 12.0f, 0.0f));
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        jiaVar.setGravity(i2);
        jiaVar.setMaxLines(1);
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(17);
        jiaVar.setTypeface(gl.o());
        boolean z2 = k96.a0;
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
        addView(jiaVar, nme.d(-1, -2.0f, 48, f, 12.0f, f2, 0.0f));
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jiaVar2.setGravity(i3);
        jiaVar2.setMaxLines(1);
        zkb.W(jiaVar2, bkb.x6, null);
        jiaVar2.setTextSize(14);
        boolean z3 = k96.a0;
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
        addView(jiaVar2, nme.d(-1, -2.0f, 48, f3, 36.0f, f4, 0.0f));
        int L2 = gl.L(17.0f);
        TextView textView = new TextView(getContext());
        textView.setBackground(sjb.f(bkb.Ei, 16.0f));
        if (k96.a0) {
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
        textView.setText(k96.M0(i5, null));
        zkb.X(textView, bkb.Ii, null);
        textView.setTextSize(14.0f);
        textView.setTypeface(gl.o());
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final ly6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                ky6 ky6Var2 = ky6Var;
                ly6 ly6Var = this.b;
                switch (b) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = ly6Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter, true);
                            return;
                        }
                        return;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = ly6Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter2, false);
                            return;
                        }
                        return;
                }
            }
        });
        boolean z4 = k96.a0;
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
        addView(textView, nme.d(-2, 32.0f, i6, f5, 62.0f, f6, 0.0f));
        float measureText = textView.getPaint().measureText(textView.getText().toString()) + (L2 << 1);
        TextView textView2 = new TextView(getContext());
        int L3 = gl.L(16.0f);
        textView2.setBackground(bkb.i0(L3, L3, L3, L3, 0, bkb.w0(null, bkb.h6, false), -16777216));
        if (k96.a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7 | 16);
        textView2.setMaxLines(1);
        textView2.setPadding(L2, 0, L2, 0);
        textView2.setText(k96.M0(2131751357, null));
        zkb.X(textView2, bkb.m6, null);
        textView2.setTextSize(14.0f);
        textView2.setTypeface(gl.o());
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final ly6 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r3;
                ky6 ky6Var2 = ky6Var;
                ly6 ly6Var = this.b;
                switch (b) {
                    case 0:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter = ly6Var.e;
                        if (tL_chatInviteImporter != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter, true);
                            return;
                        }
                        return;
                    default:
                        TLRPC.TL_chatInviteImporter tL_chatInviteImporter2 = ly6Var.e;
                        if (tL_chatInviteImporter2 != null) {
                            ((xy6) ky6Var2).d(tL_chatInviteImporter2, false);
                            return;
                        }
                        return;
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, gl.L(32.0f), k96.a0 ? 5 : 3);
        layoutParams.topMargin = gl.L(62.0f);
        if (k96.a0) {
            L = 0;
        } else {
            L = (int) (gl.L(79.0f) + measureText);
        }
        layoutParams.leftMargin = L;
        layoutParams.rightMargin = k96.a0 ? (int) (measureText + gl.L(79.0f)) : 0;
        addView(textView2, layoutParams);
    }

    public be0 getAvatarImageView() {
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
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(72.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(72.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(107.0f), 1073741824));
    }
}
