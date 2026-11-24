package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
public abstract class c3b {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, ylb ylbVar) {
        int i = z8c.t0;
        Context context = dVar.getContext();
        px3 px3Var = new px3(ylbVar, context, true, false);
        px3Var.y1 = new yg(i, context, tL_messages_stickerSet);
        if (dVar.visibleDialog != null) {
            px3Var.show();
        } else {
            dVar.showDialog(px3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, ylb ylbVar, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
            String M0 = jb6.M0(2131744548, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131744549, null);
            alertDialog$Builder.j(jb6.M0(2131751535, null), new xr8(runnable, stickerSet, (byte) 21));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            heVar.show();
            TextView textView = (TextView) heVar.c(-1);
            if (textView != null) {
                anb.X(textView, cmb.p7, ylbVar);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, ylb ylbVar, Context context, jac jacVar) {
        boolean z;
        int i;
        float f;
        int i2;
        int i3;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar, context);
        if (stickerSet != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131751159;
        } else {
            i = 2131748019;
        }
        String M0 = jb6.M0(i, null);
        he heVar = alertDialog$Builder.a;
        heVar.S = M0;
        heVar.U = jb6.M0(2131744553, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gm.L(24.0f), 0, gm.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i4 = cmb.i5;
        anb.X(editTextBoldCursor, i4, ylbVar);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        anb.X(editTextBoldCursor, i4, ylbVar);
        anb.l(editTextBoldCursor, 36, cmb.lg, ylbVar);
        anb.l(editTextBoldCursor, 35, cmb.K6, ylbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new s42(editTextBoldCursor, (byte) 2)});
        anb.F(editTextBoldCursor, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f2 = 0.0f;
        if (jb6.a0) {
            f = 28.0f;
        } else {
            f = 0.0f;
        }
        int L = gm.L(f);
        if (!jb6.a0) {
            f2 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, gm.L(f2), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(cmb.w0(null, cmb.A6, false));
        numberTextView.setImportantForAccessibility(2);
        if (jb6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        frameLayout.addView(numberTextView, qoe.d(26, 20.0f, i2 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new b3b(numberTextView, editTextBoldCursor));
        if (z) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        heVar.H = (byte) 4;
        if (z) {
            i3 = 2131751291;
        } else {
            i3 = 2131751690;
        }
        alertDialog$Builder.j(jb6.M0(i3, null), new wg(editTextBoldCursor, jacVar, context, z));
        alertDialog$Builder.g(jb6.M0(2131752542, null), new wta(editTextBoldCursor, (byte) 7));
        he o = alertDialog$Builder.o();
        o.k0 = false;
        editTextBoldCursor.setOnEditorActionListener(new dp9(o, (byte) 1));
    }
}
