package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class tx1 extends wy1 {
    public boolean h2;
    public float i2;
    public float j2;
    public boolean k2;
    public final ChatActivityEnterView l2;

    public tx1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(chatActivityEnterView, context, vnbVar);
        this.l2 = chatActivityEnterView;
        this.h2 = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.l2;
        zu1 zu1Var = chatActivityEnterView.E3;
        View view = chatActivityEnterView.t6;
        if (view != null) {
            setWindowView(view);
        } else if (zu1Var != null && zu1Var.getParentLayout() != null && ((ActionBarLayout) zu1Var.getParentLayout()).b) {
            setWindowView(zu1Var.getParentLayout().getWindow().getDecorView());
        } else {
            setWindowView(chatActivityEnterView.D3.getWindow().getDecorView());
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.l2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z2 = false;
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z = true;
            } else {
                z = false;
            }
            chatActivityEnterView.d2(z);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z2 = true;
            }
            chatActivityEnterView.k2(z2);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        if (i == 16908322) {
            int i2 = ChatActivityEnterView.X7;
            ChatActivityEnterView chatActivityEnterView = this.l2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    if (clipboardManager == null) {
                        primaryClip = null;
                    } else {
                        primaryClip = clipboardManager.getPrimaryClip();
                    }
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z = wi9.z(htmlText, hashMap);
                            if (!z.isEmpty()) {
                                if (uj9.d(z, hashMap)) {
                                    uc7.s1(chatActivityEnterView.R);
                                    boolean z2 = f11.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.r1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uj9.f(z, false));
                                pv3.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class);
                                if (hmVarArr != null) {
                                    for (hm hmVar : hmVarArr) {
                                        hmVar.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), wl.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                q19[] q19VarArr = (q19[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, q19.class);
                                if (q19VarArr != null && q19VarArr.length > 0) {
                                    q19[] q19VarArr2 = (q19[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q19.class);
                                    for (int i3 = 0; i3 < q19VarArr2.length; i3++) {
                                        spannableStringBuilder.removeSpan(q19VarArr2[i3]);
                                        spannableStringBuilder.removeSpan(q19VarArr2[i3].a);
                                    }
                                } else {
                                    r19.a(spannableStringBuilder);
                                }
                                tx1 tx1Var = chatActivityEnterView.F0;
                                tx1Var.setText(tx1Var.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.F0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.F0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.l2;
        if (chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0) {
                this.i2 = motionEvent.getX();
                this.j2 = motionEvent.getY();
                this.k2 = true;
            } else if (this.k2 && motionEvent.getAction() == 2) {
                if (Math.abs(motionEvent.getX() - this.i2) > hl.e || Math.abs(motionEvent.getY() - this.j2) > hl.e) {
                    this.k2 = false;
                }
            } else if (this.k2) {
                if (chatActivityEnterView.O3 != null) {
                    yob.l(this, 36, aob.mg, chatActivityEnterView.K4);
                    chatActivityEnterView.O3.X0();
                }
                tx1 tx1Var = chatActivityEnterView.F0;
                if (tx1Var != null && !hl.E3(tx1Var)) {
                    chatActivityEnterView.F0.clearFocus();
                    chatActivityEnterView.F0.requestFocus();
                }
            }
            return this.k2;
        }
        if (motionEvent.getAction() == 0 && chatActivityEnterView.O3 != null) {
            yob.l(this, 36, aob.mg, chatActivityEnterView.K4);
            chatActivityEnterView.O3.X0();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void setOffsetY(float f) {
        super.setOffsetY(f);
        this.l2.n2.invalidate();
    }
}
