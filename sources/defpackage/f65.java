package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class f65 extends g95 {
    public final k65 r1;

    public f65(k65 k65Var, Context context, TLRPC.Chat chat, boolean z) {
        super(context, false);
        int i;
        int i2;
        int i3;
        this.r1 = k65Var;
        int i4 = bkb.Vg;
        int w0 = bkb.w0(null, i4, false);
        zkb.x(this.b, this.s0, i4, null, PorterDuff.Mode.MULTIPLY);
        c95 c95Var = new c95(this, context);
        this.b = c95Var;
        c95Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.s0);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        TextView textView = new TextView(getContext());
        if (hc2.W(chat)) {
            textView.setText(k96.M0(2131743224, null));
        } else {
            textView.setText(k96.M0(2131743006, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gl.o());
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        ViewGroup viewGroup2 = this.b;
        if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        viewGroup2.addView(textView, nme.d(-2, -2.0f, i2 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(k96.M0(2131743005, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3 | 48);
        this.b.addView(textView2, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.o1 = new TextView[3];
        gec gecVar = new gec(context);
        this.l1 = gecVar;
        gecVar.setClipChildren(false);
        gecVar.setOffscreenPageLimit(4);
        gecVar.setClipToPadding(false);
        gl.x3(gecVar, 2130706432);
        gecVar.setAdapter(new f95(this, (byte) 0));
        gecVar.setPageMargin(0);
        this.b.addView(gecVar, nme.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        gecVar.b(new d95(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w0, 0}));
        this.b.addView(view, nme.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w0}));
        this.b.addView(view2, nme.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        e95 e95Var = new e95(this, getContext());
        this.m1 = e95Var;
        e95Var.setMinWidth(gl.L(64.0f));
        e95Var.setTag(-1);
        e95Var.setTextSize(1, 14.0f);
        int i6 = bkb.dh;
        zkb.X(e95Var, i6, null);
        e95Var.setGravity(17);
        e95Var.setTypeface(gl.o());
        e95Var.setText(k96.M0(2131743007, null));
        int L = gl.L(6.0f);
        int o = bm2.o(bkb.w0(null, i6, false), 76);
        e95Var.setForeground(bkb.i0(L, L, L, L, 0, o, o));
        e95Var.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
        e95Var.setOnClickListener(new b95(this, (byte) 0));
        this.b.addView(e95Var, nme.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        this.b.addView(linearLayout, nme.e(-2, 64, 80));
        int i7 = 0;
        while (true) {
            TextView[] textViewArr = this.o1;
            if (i7 >= textViewArr.length) {
                break;
            }
            textViewArr[i7] = new TextView(context);
            this.o1[i7].setTextSize(1, 12.0f);
            this.o1[i7].setTextColor(-1);
            this.o1[i7].setTypeface(gl.o());
            this.o1[i7].setPadding(gl.L(10.0f), 0, gl.L(10.0f), 0);
            this.o1[i7].setGravity(16);
            this.o1[i7].setSingleLine(true);
            this.n1.addView(this.o1[i7], nme.o(-2, -1));
            TextView[] textViewArr2 = this.o1;
            if (i7 == 0) {
                textViewArr2[i7].setText(k96.M0(2131743010, null));
            } else if (i7 == 1) {
                textViewArr2[i7].setText(k96.M0(2131743008, null));
            } else {
                textViewArr2[i7].setText(k96.M0(2131743009, null));
            }
            this.o1[i7].setOnClickListener(new v0(this, i7, (byte) 7));
            i7++;
        }
        if (z) {
            this.l1.setCurrentItem(1);
        }
    }

    public final void E0(int i) {
        int i2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i3 = bkb.fh;
        hd hdVar = alertDialog$Builder.a;
        hdVar.J = i3;
        h75 h75Var = this.r1.b;
        h75Var.q2 = false;
        hdVar.S = k96.M0(2131743084, null);
        if (i == 0) {
            if (h75Var.T2.b.rtmp_stream) {
                i2 = 2131743087;
            } else {
                i2 = 2131743085;
            }
            hdVar.U = k96.M0(i2, null);
        } else {
            int i4 = 2131743086;
            if (hc2.W(h75Var.S2)) {
                if (!h75Var.T2.b.rtmp_stream) {
                    i4 = 2131743215;
                }
                hdVar.U = k96.M0(i4, null);
            } else {
                if (!h75Var.T2.b.rtmp_stream) {
                    i4 = 2131743083;
                }
                hdVar.U = k96.M0(i4, null);
            }
        }
        hdVar.z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(bkb.U(getContext(), bkb.w0(null, bkb.di, false), bkb.w0(null, bkb.ei, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i5 = bkb.dh;
        zkb.X(editTextBoldCursor, i5, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(k96.M0(2131743101, null));
        editTextBoldCursor.setImeOptions(6);
        zkb.D(editTextBoldCursor, bkb.eh, null);
        zkb.l(editTextBoldCursor, 30, i5, null);
        editTextBoldCursor.setCursorSize(gl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, nme.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new gc4(alertDialog$Builder, (byte) 2));
        hdVar.j(bkb.w0(null, bkb.Vg, false));
        hdVar.setOnShowListener(new e65(this, hdVar, editTextBoldCursor, (byte) 1));
        hdVar.setOnDismissListener(new ic4(editTextBoldCursor, (byte) 2));
        alertDialog$Builder.j(k96.M0(2131744678, null), new zf(this, editTextBoldCursor, i, (byte) 5));
        alertDialog$Builder.g(k96.M0(2131752577, null), new kt3(editTextBoldCursor, (byte) 3));
        hdVar.j(bkb.w0(null, bkb.kh, false));
        hdVar.show();
        hdVar.o(bkb.w0(null, i5, false));
        editTextBoldCursor.requestFocus();
    }
}
