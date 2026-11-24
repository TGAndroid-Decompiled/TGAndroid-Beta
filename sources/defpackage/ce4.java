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
public final class ce4 implements View.OnClickListener {
    public final byte a;
    public final ke4 b;

    public ce4(ke4 ke4Var, byte b) {
        this.a = b;
        this.b = ke4Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ke4 ke4Var = this.b;
        switch (b) {
            case 0:
                String str = ke4Var.s;
                if (str != null) {
                    gm.g(str);
                    c41.b0(ke4Var.r).i(jb6.M0(2131748678, null)).j();
                    return;
                }
                return;
            case 1:
                ke4 ke4Var2 = this.b;
                FrameLayout frameLayout = ke4Var2.a;
                if (frameLayout.getBackground() instanceof RippleDrawable) {
                    frameLayout.getBackground().setState(new int[]{16842919, 16842910});
                    ke4Var2.postDelayed(new a14(ke4Var2, (byte) 16), 180L);
                }
                float[] fArr = ke4Var2.E;
                if (ke4Var2.y == null && ke4Var2.s != null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(ke4Var2.getContext(), null);
                    a8 a8Var = new a8(ke4Var2.getContext(), true, false);
                    a8Var.j(jb6.M0(2131751201, null), 2131232122, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var, qoe.o(-1, 48));
                    a8Var.setOnClickListener(new ce4(ke4Var2, (byte) 4));
                    a8 a8Var2 = new a8(ke4Var2.getContext(), false, false);
                    a8Var2.j(jb6.M0(2131750405, null), 2131232326, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, qoe.o(-1, 48));
                    a8Var2.setOnClickListener(new ce4(ke4Var2, (byte) 5));
                    a8 a8Var3 = new a8(ke4Var2.getContext(), false, true);
                    a8Var3.j(jb6.M0(2131751471, null), 2131232114, null);
                    int i = cmb.o7;
                    a8Var3.c(i, i);
                    a8Var3.h(0.12f, i);
                    a8Var3.setOnClickListener(new ce4(ke4Var2, (byte) 6));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var3, qoe.o(-1, 48));
                    FrameLayout overlayContainerView = ke4Var2.r.getParentLayout().getOverlayContainerView();
                    if (overlayContainerView != null) {
                        fe4.a(frameLayout, overlayContainerView, fArr);
                        float f = fArr[1];
                        a91 a91Var = new a91(ke4Var2, ke4Var2.getContext(), overlayContainerView, (byte) 7);
                        fb fbVar = new fb(a91Var, (byte) 3);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(fbVar);
                        overlayContainerView.addView(a91Var, qoe.c(-1.0f, -1));
                        float f2 = 0.0f;
                        a91Var.setAlpha(0.0f);
                        a91Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        ke4Var2.y = m8Var;
                        m8Var.setOnDismissListener(new de4(ke4Var2, a91Var, overlayContainerView, fbVar, (byte) 0));
                        ke4Var2.y.setOutsideTouchable(true);
                        ke4Var2.y.setFocusable(true);
                        ke4Var2.y.setBackgroundDrawable(new ColorDrawable(0));
                        ke4Var2.y.setAnimationStyle(2131755192);
                        ke4Var2.y.setInputMethodMode(2);
                        ke4Var2.y.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new yu3(ke4Var2, (byte) 19));
                        if (gm.O1()) {
                            f += overlayContainerView.getPaddingTop();
                            f2 = 0.0f - overlayContainerView.getPaddingLeft();
                        }
                        ke4Var2.y.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - gm.L(16.0f)) + f2), (int) (overlayContainerView.getY() + f + frameLayout.getMeasuredHeight()));
                        return;
                    }
                    return;
                }
                return;
            case 2:
                String str2 = ke4Var.s;
                if (str2 != null) {
                    gm.g(str2);
                    c41.b0(ke4Var.r).i(jb6.M0(2131748678, null)).j();
                    return;
                }
                return;
            case 3:
                if (ke4Var.s != null) {
                    try {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", ke4Var.s);
                        ke4Var.r.startActivityForResult(Intent.createChooser(intent, jb6.M0(2131748867, null)), 500);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
            case 4:
                ke4 ke4Var3 = this.b;
                m8 m8Var2 = ke4Var3.y;
                if (m8Var2 != null) {
                    m8Var2.d(true);
                }
                me4 me4Var = ke4Var3.F.c;
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = me4Var.d;
                if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null) {
                    EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(ke4Var3.getContext());
                    editTextBoldCursor.setBackgroundDrawable(cmb.T(ke4Var3.getContext()));
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ke4Var3.getContext());
                    int i2 = cmb.G5;
                    he heVar = alertDialog$Builder.a;
                    heVar.J = i2;
                    heVar.S = jb6.M0(2131750701, null);
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new uu3(editTextBoldCursor, (byte) 1));
                    LinearLayout linearLayout = new LinearLayout(ke4Var3.getContext());
                    linearLayout.setOrientation(1);
                    alertDialog$Builder.n(linearLayout);
                    editTextBoldCursor.setTextSize(1, 16.0f);
                    int i3 = cmb.i5;
                    anb.X(editTextBoldCursor, i3, null);
                    editTextBoldCursor.setMaxLines(1);
                    editTextBoldCursor.setLines(1);
                    editTextBoldCursor.setInputType(16385);
                    editTextBoldCursor.setGravity(51);
                    editTextBoldCursor.setSingleLine(true);
                    editTextBoldCursor.setImeOptions(6);
                    editTextBoldCursor.setHint(me4Var.c.b);
                    anb.D(editTextBoldCursor, cmb.s5, null);
                    anb.l(editTextBoldCursor, 30, i3, null);
                    editTextBoldCursor.setCursorSize(gm.L(20.0f));
                    editTextBoldCursor.setCursorWidth(1.5f);
                    editTextBoldCursor.setPadding(0, gm.L(4.0f), 0, 0);
                    linearLayout.addView(editTextBoldCursor, qoe.t(-1, 36, 51, 24, 6, 24, 0));
                    editTextBoldCursor.setOnEditorActionListener(new ge4(alertDialog$Builder, (byte) 0));
                    editTextBoldCursor.addTextChangedListener(new je4(editTextBoldCursor, (byte) 0));
                    if (!TextUtils.isEmpty(tL_exportedChatlistInvite.title)) {
                        editTextBoldCursor.setText(tL_exportedChatlistInvite.title);
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    }
                    alertDialog$Builder.j(jb6.M0(2131745680, null), new wu2(ke4Var3, editTextBoldCursor, alertDialog$Builder, false, (byte) 11));
                    heVar.setOnShowListener(new he4(editTextBoldCursor, (byte) 0));
                    heVar.setOnDismissListener(new ie4(editTextBoldCursor, (byte) 0));
                    heVar.show();
                    heVar.o(cmb.w0(null, i3, false));
                    editTextBoldCursor.requestFocus();
                    return;
                }
                return;
            case 5:
                m8 m8Var3 = ke4Var.y;
                if (m8Var3 != null) {
                    m8Var3.d(true);
                }
                if (ke4Var.s != null) {
                    ax8 ax8Var = new ax8(ke4Var.getContext(), jb6.M0(2131748927, null), ke4Var.s, jb6.M0(2131746239, null), false);
                    ax8Var.D0();
                    ax8Var.show();
                    return;
                }
                return;
            default:
                m8 m8Var4 = ke4Var.y;
                if (m8Var4 != null) {
                    m8Var4.d(true);
                }
                TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
                me4 me4Var2 = ke4Var.F.c;
                tL_inputChatlistDialogFilter.filter_id = me4Var2.c.a;
                tL_chatlists_deleteExportedInvite.slug = me4Var2.e0();
                he heVar2 = new he(3, null, ke4Var.getContext());
                heVar2.q(180L);
                me4Var2.getConnectionsManager().sendRequest(tL_chatlists_deleteExportedInvite, new cx3(ke4Var, heVar2, (byte) 1));
                return;
        }
    }
}
