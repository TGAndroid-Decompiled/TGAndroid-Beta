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
public final class h85 extends hb5 {
    public final m85 r1;

    public h85(m85 m85Var, Context context, TLRPC.Chat chat, boolean z) {
        super(context, false);
        int i;
        int i2;
        int i3;
        this.r1 = m85Var;
        int i4 = aob.Wg;
        int w0 = aob.w0(null, i4, false);
        yob.x(this.b, this.s0, i4, null, PorterDuff.Mode.MULTIPLY);
        db5 db5Var = new db5(this, context);
        this.b = db5Var;
        db5Var.setWillNotDraw(false);
        this.b.setClipChildren(false);
        this.b.setBackgroundDrawable(this.s0);
        ViewGroup viewGroup = this.b;
        int i5 = this.u0;
        viewGroup.setPadding(i5, 0, i5, 0);
        TextView textView = new TextView(getContext());
        if (xc2.W(chat)) {
            textView.setText(ob6.M0(2131743118, null));
        } else {
            textView.setText(ob6.M0(2131742900, null));
        }
        textView.setTextColor(-1);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(hl.o());
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        textView.setGravity(i | 48);
        ViewGroup viewGroup2 = this.b;
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        viewGroup2.addView(textView, tre.d(-2, -2.0f, i2 | 48, 24.0f, 29.0f, 24.0f, 0.0f));
        TextView textView2 = new TextView(getContext());
        textView2.setText(ob6.M0(2131742899, null));
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 14.0f);
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3 | 48);
        this.b.addView(textView2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 24.0f, 62.0f, 24.0f, 0.0f));
        this.o1 = new TextView[3];
        fic ficVar = new fic(context);
        this.l1 = ficVar;
        ficVar.setClipChildren(false);
        ficVar.setOffscreenPageLimit(4);
        ficVar.setClipToPadding(false);
        hl.w3(ficVar, 2130706432);
        ficVar.setAdapter(new gb5(this, (byte) 0));
        ficVar.setPageMargin(0);
        this.b.addView(ficVar, tre.d(-1, -1.0f, 1, 0.0f, 100.0f, 0.0f, 130.0f));
        ficVar.b(new eb5(this));
        View view = new View(getContext());
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        view.setBackground(new GradientDrawable(orientation, new int[]{w0, 0}));
        this.b.addView(view, tre.d(120, -1.0f, 51, 0.0f, 100.0f, 0.0f, 130.0f));
        View view2 = new View(getContext());
        view2.setBackground(new GradientDrawable(orientation, new int[]{0, w0}));
        this.b.addView(view2, tre.d(120, -1.0f, 53, 0.0f, 100.0f, 0.0f, 130.0f));
        fb5 fb5Var = new fb5(this, getContext());
        this.m1 = fb5Var;
        fb5Var.setMinWidth(hl.L(64.0f));
        fb5Var.setTag(-1);
        fb5Var.setTextSize(1, 14.0f);
        int i6 = aob.eh;
        yob.X(fb5Var, i6, null);
        fb5Var.setGravity(17);
        fb5Var.setTypeface(hl.o());
        fb5Var.setText(ob6.M0(2131742901, null));
        int L = hl.L(6.0f);
        int o = vm2.o(aob.w0(null, i6, false), 76);
        fb5Var.setForeground(aob.i0(L, L, L, L, 0, o, o));
        fb5Var.setPadding(0, hl.L(12.0f), 0, hl.L(12.0f));
        fb5Var.setOnClickListener(new sa5(this, (byte) 1));
        this.b.addView(fb5Var, tre.d(-1, 48.0f, 80, 0.0f, 0.0f, 0.0f, 64.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.n1 = linearLayout;
        this.b.addView(linearLayout, tre.e(-2, 64, 80));
        int i7 = 0;
        while (true) {
            TextView[] textViewArr = this.o1;
            if (i7 >= textViewArr.length) {
                break;
            }
            textViewArr[i7] = new TextView(context);
            this.o1[i7].setTextSize(1, 12.0f);
            this.o1[i7].setTextColor(-1);
            this.o1[i7].setTypeface(hl.o());
            this.o1[i7].setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            this.o1[i7].setGravity(16);
            this.o1[i7].setSingleLine(true);
            this.n1.addView(this.o1[i7], tre.o(-2, -1));
            TextView[] textViewArr2 = this.o1;
            if (i7 == 0) {
                textViewArr2[i7].setText(ob6.M0(2131742904, null));
            } else if (i7 == 1) {
                textViewArr2[i7].setText(ob6.M0(2131742902, null));
            } else {
                textViewArr2[i7].setText(ob6.M0(2131742903, null));
            }
            this.o1[i7].setOnClickListener(new w0(this, i7, (byte) 8));
            i7++;
        }
        if (z) {
            this.l1.setCurrentItem(1);
        }
    }

    public final void F0(int i) {
        int i2;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        int i3 = aob.gh;
        id idVar = alertDialog$Builder.a;
        idVar.J = i3;
        j95 j95Var = this.r1.b;
        j95Var.q2 = false;
        idVar.S = ob6.M0(2131742978, null);
        if (i == 0) {
            if (j95Var.T2.b.rtmp_stream) {
                i2 = 2131742981;
            } else {
                i2 = 2131742979;
            }
            idVar.U = ob6.M0(i2, null);
        } else {
            int i4 = 2131742980;
            if (xc2.W(j95Var.S2)) {
                if (!j95Var.T2.b.rtmp_stream) {
                    i4 = 2131743109;
                }
                idVar.U = ob6.M0(i4, null);
            } else {
                if (!j95Var.T2.b.rtmp_stream) {
                    i4 = 2131742977;
                }
                idVar.U = ob6.M0(i4, null);
            }
        }
        idVar.z0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(aob.U(getContext(), aob.w0(null, aob.ei, false), aob.w0(null, aob.fi, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i5 = aob.eh;
        yob.X(editTextBoldCursor, i5, null);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(ob6.M0(2131742995, null));
        editTextBoldCursor.setImeOptions(6);
        yob.D(editTextBoldCursor, aob.fh, null);
        yob.l(editTextBoldCursor, 30, i5, null);
        editTextBoldCursor.setCursorSize(hl.L(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, tre.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new de4(alertDialog$Builder, (byte) 2));
        idVar.j(aob.w0(null, aob.Wg, false));
        idVar.setOnShowListener(new g85(this, idVar, editTextBoldCursor, (byte) 1));
        idVar.setOnDismissListener(new fe4(editTextBoldCursor, (byte) 2));
        alertDialog$Builder.j(ob6.M0(2131744572, null), new bf(this, editTextBoldCursor, i, (byte) 6));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new bu3(editTextBoldCursor, (byte) 3));
        idVar.j(aob.w0(null, aob.lh, false));
        idVar.show();
        idVar.o(aob.w0(null, i5, false));
        editTextBoldCursor.requestFocus();
    }
}
