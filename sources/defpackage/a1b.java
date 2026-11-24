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
public abstract class a1b {
    public static void a(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, wjb wjbVar) {
        int i = y6c.t0;
        Context context = dVar.getContext();
        ew3 ew3Var = new ew3(wjbVar, context, true, false);
        ew3Var.y1 = new zf(i, context, tL_messages_stickerSet);
        if (dVar.visibleDialog != null) {
            ew3Var.show();
        } else {
            dVar.showDialog(ew3Var);
        }
    }

    public static void b(TLRPC.StickerSet stickerSet, wjb wjbVar, Context context, Runnable runnable) {
        if (stickerSet != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
            String M0 = k96.M0(2131744622, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131744623, null);
            alertDialog$Builder.j(k96.M0(2131751586, null), new kq8(runnable, stickerSet, (byte) 20));
            alertDialog$Builder.g(k96.M0(2131752577, null), null);
            hdVar.show();
            TextView textView = (TextView) hdVar.c(-1);
            if (textView != null) {
                zkb.X(textView, bkb.p7, wjbVar);
            }
        }
    }

    public static void c(TLRPC.StickerSet stickerSet, wjb wjbVar, Context context, i8c i8cVar) {
        boolean z;
        int i;
        float f;
        int i2;
        int i3;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        if (stickerSet != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 2131751210;
        } else {
            i = 2131748070;
        }
        String M0 = k96.M0(i, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131744627, null);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(gl.L(24.0f), 0, gl.L(20.0f), 0);
        ?? editTextBoldCursor = new EditTextBoldCursor(context);
        int i4 = bkb.i5;
        zkb.X(editTextBoldCursor, i4, wjbVar);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setTextSize(1, 16.0f);
        zkb.X(editTextBoldCursor, i4, wjbVar);
        zkb.l(editTextBoldCursor, 36, bkb.lg, wjbVar);
        zkb.l(editTextBoldCursor, 35, bkb.K6, wjbVar);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setFocusable(true);
        editTextBoldCursor.setFilters(new InputFilter[]{new InputFilter.LengthFilter(50), new g32(editTextBoldCursor, (byte) 2)});
        zkb.F(editTextBoldCursor, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.requestFocus();
        float f2 = 0.0f;
        if (k96.a0) {
            f = 28.0f;
        } else {
            f = 0.0f;
        }
        int L = gl.L(f);
        if (!k96.a0) {
            f2 = 28.0f;
        }
        editTextBoldCursor.setPadding(L, 0, gl.L(f2), 0);
        frameLayout.addView(editTextBoldCursor);
        NumberTextView numberTextView = new NumberTextView(context);
        numberTextView.setCenterAlign(true);
        numberTextView.setTextSize(15);
        numberTextView.a(50, false);
        numberTextView.setTextColor(bkb.w0(null, bkb.A6, false));
        numberTextView.setImportantForAccessibility(2);
        if (k96.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        frameLayout.addView(numberTextView, nme.d(26, 20.0f, i2 | 16, 0.0f, 2.0f, 4.0f, 0.0f));
        editTextBoldCursor.addTextChangedListener(new z0b(numberTextView, editTextBoldCursor));
        if (z) {
            editTextBoldCursor.setText(stickerSet.title);
            editTextBoldCursor.setSelection(stickerSet.title.length());
        }
        alertDialog$Builder.n(frameLayout);
        hdVar.H = (byte) 4;
        if (z) {
            i3 = 2131751342;
        } else {
            i3 = 2131751741;
        }
        alertDialog$Builder.j(k96.M0(i3, null), new xf(editTextBoldCursor, i8cVar, context, z));
        alertDialog$Builder.g(k96.M0(2131752577, null), new hza(editTextBoldCursor, (byte) 3));
        hd o = alertDialog$Builder.o();
        o.k0 = false;
        editTextBoldCursor.setOnEditorActionListener(new cn9(o, (byte) 1));
    }
}
