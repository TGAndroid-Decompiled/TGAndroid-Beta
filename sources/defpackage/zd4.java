package defpackage;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class zd4 implements View.OnClickListener {
    public final byte a;
    public final he4 b;

    public zd4(he4 he4Var, byte b) {
        this.a = b;
        this.b = he4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        he4 he4Var = this.b;
        switch (b) {
            case 0:
                String str = he4Var.s;
                if (str != null) {
                    hl.g(str);
                    d31.b0(he4Var.r).i(ob6.M0(2131748675, null)).j();
                    return;
                }
                return;
            case 1:
                he4 he4Var2 = this.b;
                FrameLayout frameLayout = he4Var2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    he4Var2.postDelayed(new lw3(he4Var2, (byte) 22), 180L);
                }
                float[] fArr = he4Var2.E;
                if (he4Var2.y == null && he4Var2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(he4Var2.getContext(), null);
                    b8 b8Var = new b8(he4Var2.getContext(), true, false);
                    b8Var.j(ob6.M0(2131751229, null), 2131232121, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var, tre.o(-1, 48));
                    b8Var.setOnClickListener(new zd4(he4Var2, (byte) 4));
                    b8 b8Var2 = new b8(he4Var2.getContext(), false, false);
                    b8Var2.j(ob6.M0(2131750433, null), 2131232325, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var2, tre.o(-1, 48));
                    b8Var2.setOnClickListener(new zd4(he4Var2, (byte) 5));
                    b8 b8Var3 = new b8(he4Var2.getContext(), false, true);
                    b8Var3.j(ob6.M0(2131751499, null), 2131232113, null);
                    int i = aob.p7;
                    b8Var3.c(i, i);
                    b8Var3.h(0.12f, i);
                    b8Var3.setOnClickListener(new zd4(he4Var2, (byte) 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var3, tre.o(-1, 48));
                    FrameLayout overlayContainerView = he4Var2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        ce4.a(frameLayout, overlayContainerView, fArr);
                        float f = fArr[1];
                        a81 a81Var = new a81(he4Var2, he4Var2.getContext(), overlayContainerView, (byte) 7);
                        gb gbVar = new gb(a81Var, (byte) 3);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(gbVar);
                        overlayContainerView.addView(a81Var, tre.c(-1.0f, -1));
                        float f2 = 0.0f;
                        a81Var.setAlpha(0.0f);
                        a81Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        n8 n8Var = new n8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        he4Var2.y = n8Var;
                        n8Var.setOnDismissListener(new ae4(he4Var2, a81Var, overlayContainerView, gbVar, (byte) 0));
                        he4Var2.y.setOutsideTouchable(true);
                        he4Var2.y.setFocusable(true);
                        he4Var2.y.setBackgroundDrawable(new ColorDrawable(0));
                        he4Var2.y.setAnimationStyle(2131755192);
                        he4Var2.y.setInputMethodMode(2);
                        he4Var2.y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new lu3(he4Var2, (byte) 19));
                        if (hl.O1()) {
                            f += overlayContainerView.getPaddingTop();
                            f2 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        he4Var2.y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - hl.L(16.0f)) + f2), (int) (overlayContainerView.getY() + f + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = he4Var.s;
                if (str2 != null) {
                    hl.g(str2);
                    d31.b0(he4Var.r).i(ob6.M0(2131748675, null)).j();
                    return;
                }
                return;
            case 3:
                if (he4Var.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", he4Var.s);
                        he4Var.r.startActivityForResult(Intent.createChooser(intent, ob6.M0(2131748864, null)), 500);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                he4 he4Var3 = this.b;
                n8 n8Var2 = he4Var3.y;
                if (n8Var2 != null) {
                    n8Var2.d(true);
                }
                je4 je4Var = he4Var3.F.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = je4Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(he4Var3.getContext());
                    editTextBoldCursor.setBackgroundDrawable(aob.T(he4Var3.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(he4Var3.getContext());
                    int i2 = aob.H5;
                    id idVar = alertDialog$Builder.a;
                    idVar.J = i2;
                    idVar.S = ob6.M0(2131750729, null);
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new bu3(editTextBoldCursor, (byte) 1));
                    LinearLayout linearLayout = new LinearLayout(he4Var3.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i3 = aob.j5;
                    yob.X(editTextBoldCursor, i3, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(je4Var.c.b);
                    yob.D(editTextBoldCursor, aob.t5, null);
                    yob.l(editTextBoldCursor, 30, i3, null);
                    editTextBoldCursor.setCursorSize(hl.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, tre.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new de4(alertDialog$Builder, (byte) 0));
                    editTextBoldCursor.addTextChangedListener(new ge4(editTextBoldCursor, (byte) 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.j(ob6.M0(2131745674, null), new fu2(he4Var3, editTextBoldCursor, alertDialog$Builder, false, (byte) 11));
                    idVar.setOnShowListener(new ee4(editTextBoldCursor, (byte) 0));
                    idVar.setOnDismissListener(new fe4(editTextBoldCursor, (byte) 0));
                    idVar.show();
                    idVar.o(aob.w0(null, i3, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                n8 n8Var3 = he4Var.y;
                if (n8Var3 != null) {
                    n8Var3.d(true);
                }
                if (he4Var.s != null) {
                    ky8 ky8Var = new ky8(he4Var.getContext(), ob6.M0(2131748924, null), he4Var.s, ob6.M0(2131746233, null), false);
                    ky8Var.E0();
                    ky8Var.show();
                    return;
                }
                return;
            default:
                n8 n8Var4 = he4Var.y;
                if (n8Var4 != null) {
                    n8Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                je4 je4Var2 = he4Var.F.c;
                tL_inputChatlistDialogFilter.filter_id = je4Var2.c.a;
                tL_chatlists_deleteExportedInvite.slug = je4Var2.d0();
                id idVar2 = new id(3, null, he4Var.getContext());
                idVar2.q(180L);
                je4Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new mw3(he4Var, idVar2, (byte) 1));
                return;
        }
    }
}
