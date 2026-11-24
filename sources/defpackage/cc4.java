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
public final class cc4 implements View.OnClickListener {
    public final byte a;
    public final kc4 b;

    public cc4(kc4 kc4Var, byte b) {
        this.a = b;
        this.b = kc4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        kc4 kc4Var = this.b;
        switch (b) {
            case 0:
                String str = kc4Var.s;
                if (str != null) {
                    gl.g(str);
                    u21.b0(kc4Var.r).i(k96.M0(2131748729, null)).j();
                    return;
                }
                return;
            case 1:
                kc4 kc4Var2 = this.b;
                FrameLayout frameLayout = kc4Var2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    kc4Var2.postDelayed(new s54(kc4Var2, (byte) 9), 180L);
                }
                float[] fArr = kc4Var2.E;
                if (kc4Var2.y == null && kc4Var2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(kc4Var2.getContext(), null);
                    a8 a8Var = new a8(kc4Var2.getContext(), true, false);
                    a8Var.j(k96.M0(2131751252, null), 2131232121, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var, nme.o(-1, 48));
                    a8Var.setOnClickListener(new cc4(kc4Var2, (byte) 4));
                    a8 a8Var2 = new a8(kc4Var2.getContext(), false, false);
                    a8Var2.j(k96.M0(2131750456, null), 2131232325, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, nme.o(-1, 48));
                    a8Var2.setOnClickListener(new cc4(kc4Var2, (byte) 5));
                    a8 a8Var3 = new a8(kc4Var2.getContext(), false, true);
                    a8Var3.j(k96.M0(2131751522, null), 2131232113, null);
                    int i = bkb.o7;
                    a8Var3.c(i, i);
                    a8Var3.h(0.12f, i);
                    a8Var3.setOnClickListener(new cc4(kc4Var2, (byte) 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var3, nme.o(-1, 48));
                    FrameLayout overlayContainerView = kc4Var2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        fc4.a(frameLayout, overlayContainerView, fArr);
                        float f = fArr[1];
                        s71 s71Var = new s71(kc4Var2, kc4Var2.getContext(), overlayContainerView, (byte) 7);
                        fb fbVar = new fb(s71Var, (byte) 3);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(fbVar);
                        overlayContainerView.addView(s71Var, nme.c(-1.0f, -1));
                        float f2 = 0.0f;
                        s71Var.setAlpha(0.0f);
                        s71Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        kc4Var2.y = m8Var;
                        m8Var.setOnDismissListener(new dc4(kc4Var2, s71Var, overlayContainerView, fbVar, (byte) 0));
                        kc4Var2.y.setOutsideTouchable(true);
                        kc4Var2.y.setFocusable(true);
                        kc4Var2.y.setBackgroundDrawable(new ColorDrawable(0));
                        kc4Var2.y.setAnimationStyle(2131755192);
                        kc4Var2.y.setInputMethodMode(2);
                        kc4Var2.y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new kx3(kc4Var2, (byte) 16));
                        if (gl.O1()) {
                            f += overlayContainerView.getPaddingTop();
                            f2 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        kc4Var2.y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - gl.L(16.0f)) + f2), (int) (overlayContainerView.getY() + f + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = kc4Var.s;
                if (str2 != null) {
                    gl.g(str2);
                    u21.b0(kc4Var.r).i(k96.M0(2131748729, null)).j();
                    return;
                }
                return;
            case 3:
                if (kc4Var.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", kc4Var.s);
                        kc4Var.r.startActivityForResult(Intent.createChooser(intent, k96.M0(2131748918, null)), 500);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                kc4 kc4Var3 = this.b;
                m8 m8Var2 = kc4Var3.y;
                if (m8Var2 != null) {
                    m8Var2.d(true);
                }
                mc4 mc4Var = kc4Var3.F.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = mc4Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(kc4Var3.getContext());
                    editTextBoldCursor.setBackgroundDrawable(bkb.T(kc4Var3.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kc4Var3.getContext());
                    int i2 = bkb.G5;
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.J = i2;
                    hdVar.S = k96.M0(2131750752, null);
                    alertDialog$Builder.g(k96.M0(2131752577, null), new kt3(editTextBoldCursor, (byte) 1));
                    LinearLayout linearLayout = new LinearLayout(kc4Var3.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i3 = bkb.i5;
                    zkb.X(editTextBoldCursor, i3, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(mc4Var.c.b);
                    zkb.D(editTextBoldCursor, bkb.s5, null);
                    zkb.l(editTextBoldCursor, 30, i3, null);
                    editTextBoldCursor.setCursorSize(gl.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, gl.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, nme.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new gc4(alertDialog$Builder, (byte) 0));
                    editTextBoldCursor.addTextChangedListener(new jc4(editTextBoldCursor, (byte) 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.j(k96.M0(2131745754, null), new lt2(kc4Var3, editTextBoldCursor, alertDialog$Builder, false, (byte) 11));
                    hdVar.setOnShowListener(new hc4(editTextBoldCursor, (byte) 0));
                    hdVar.setOnDismissListener(new ic4(editTextBoldCursor, (byte) 0));
                    hdVar.show();
                    hdVar.o(bkb.w0(null, i3, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                m8 m8Var3 = kc4Var.y;
                if (m8Var3 != null) {
                    m8Var3.d(true);
                }
                if (kc4Var.s != null) {
                    zu8 zu8Var = new zu8(kc4Var.getContext(), k96.M0(2131748978, null), kc4Var.s, k96.M0(2131746313, null), false);
                    zu8Var.D0();
                    zu8Var.show();
                    return;
                }
                return;
            default:
                m8 m8Var4 = kc4Var.y;
                if (m8Var4 != null) {
                    m8Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                mc4 mc4Var2 = kc4Var.F.c;
                tL_inputChatlistDialogFilter.filter_id = mc4Var2.c.a;
                tL_chatlists_deleteExportedInvite.slug = mc4Var2.d0();
                hd hdVar2 = new hd(3, null, kc4Var.getContext());
                hdVar2.q(180L);
                mc4Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new rv3(kc4Var, hdVar2, (byte) 1));
                return;
        }
    }
}
