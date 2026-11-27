package defpackage;

import android.content.Context;
import android.text.InputFilter;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberTextView;
public abstract class x4b {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, e eVar, vnb vnbVar) {
        int i = yac.t0;
        Context context = eVar.getContext();
        zw3 zw3Var = new zw3(vnbVar, context, true, false);
        zw3Var.y1 = new bf(i, context, tL_messages_stickerSet);
        if (eVar.visibleDialog != null) {
            zw3Var.show();
        } else {
            eVar.showDialog(zw3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, vnb vnbVar, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
            String M0 = ob6.M0(2131744516, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131744517, null);
            alertDialog$Builder.j(ob6.M0(2131751563, null), new yw9(runnable, stickerSet, (byte) 6));
            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
            idVar.show();
            TextView textView = (TextView) idVar.c(-1);
            if (textView != null) {
                yob.X(textView, aob.q7, vnbVar);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, vnb vnbVar, Context context, icc iccVar) {
        boolean z;
        int i;
        float f;
        int i2;
        int i3;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar, context);
        if (stickerSet != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131751187;
        } else {
            i = 2131748016;
        }
        String M0 = ob6.M0(i, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(2131744521, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(hl.L(24.0f), 0, hl.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i4 = aob.j5;
        yob.X(editTextBoldCursor, i4, vnbVar);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        yob.X(editTextBoldCursor, i4, vnbVar);
        yob.l(editTextBoldCursor, 36, aob.mg, vnbVar);
        yob.l(editTextBoldCursor, 35, aob.L6, vnbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new x32(editTextBoldCursor, (byte) 2)});
        yob.F(editTextBoldCursor, aob.k6, aob.l6, aob.p7, vnbVar);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f2 = 0.0f;
        if (ob6.a0) {
            f = 28.0f;
        } else {
            f = 0.0f;
        }
        int L = hl.L(f);
        if (!ob6.a0) {
            f2 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, hl.L(f2), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(aob.w0(null, aob.B6, false));
        numberTextView.setImportantForAccessibility(2);
        if (ob6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        frameLayout.addView(numberTextView, tre.d(26, 20.0f, i2 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new w4b(numberTextView, editTextBoldCursor));
        if (z) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        idVar.H = (byte) 4;
        if (z) {
            i3 = 2131751319;
        } else {
            i3 = 2131751718;
        }
        alertDialog$Builder.j(ob6.M0(i3, null), new ag(editTextBoldCursor, iccVar, context, z));
        alertDialog$Builder.g(ob6.M0(2131752570, null), new hja(editTextBoldCursor, (byte) 16));
        id o = alertDialog$Builder.o();
        o.k0 = false;
        editTextBoldCursor.setOnEditorActionListener(new sq9(o, (byte) 1));
    }
}
