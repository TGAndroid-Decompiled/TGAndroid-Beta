package org.telegram.messenger;

import android.text.SpannableString;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class w8 implements Runnable {
    public final int f19447a = 0;
    public final boolean f19448b;
    public final int f19449c;
    public final long d;
    public final boolean f19450e;
    public final Object f19451f;
    public final Object h;
    public final Serializable f19452n;
    public final Object f19453r;

    public w8(MediaDataController mediaDataController, boolean z10, ArrayList arrayList, a0.i iVar, ArrayList arrayList2, long j3, int i10, boolean z11) {
        this.f19451f = mediaDataController;
        this.f19448b = z10;
        this.h = arrayList;
        this.f19453r = iVar;
        this.f19452n = arrayList2;
        this.d = j3;
        this.f19449c = i10;
        this.f19450e = z11;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.b6 b6Var;
        switch (this.f19447a) {
            case 0:
                ((MediaDataController) this.f19451f).lambda$processLoadedFeaturedStickers$61(this.f19448b, (ArrayList) this.h, (a0.i) this.f19453r, (ArrayList) this.f19452n, this.d, this.f19449c, this.f19450e);
                return;
            default:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.h;
                String str = (String) this.f19452n;
                TLRPC.Document document = (TLRPC.Document) this.f19453r;
                long j3 = this.d;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.lg) this.f19451f).f28188a;
                if (this.f19448b) {
                    if (chatActivityEnterView.f23691m3) {
                        if (this.f19449c != chatActivityEnterView.j3 || !chatActivityEnterView.x0()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (editTextBoldCursor != null) {
                    int selectionEnd = editTextBoldCursor.getSelectionEnd();
                    if (selectionEnd < 0) {
                        selectionEnd = 0;
                    }
                    try {
                        try {
                            chatActivityEnterView.S2 = 2;
                            if (str == null) {
                                str = "😀";
                            }
                            SpannableString spannableString = new SpannableString(str);
                            if (document != null) {
                                b6Var = new org.telegram.ui.Components.b6(document, editTextBoldCursor.getPaint().getFontMetricsInt());
                            } else {
                                b6Var = new org.telegram.ui.Components.b6(j3, editTextBoldCursor.getPaint().getFontMetricsInt());
                            }
                            if (!this.f19450e) {
                                b6Var.fromEmojiKeyboard = true;
                            }
                            b6Var.cacheType = org.telegram.ui.Components.s5.g();
                            spannableString.setSpan(b6Var, 0, spannableString.length(), 33);
                            editTextBoldCursor.setText(editTextBoldCursor.getText().insert(selectionEnd, spannableString));
                            editTextBoldCursor.setSelection(spannableString.length() + selectionEnd, selectionEnd + spannableString.length());
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        chatActivityEnterView.S2 = 0;
                        return;
                    } catch (Throwable th2) {
                        chatActivityEnterView.S2 = 0;
                        throw th2;
                    }
                }
                return;
        }
    }

    public w8(org.telegram.ui.Components.lg lgVar, boolean z10, int i10, EditTextBoldCursor editTextBoldCursor, String str, TLRPC.Document document, long j3, boolean z11) {
        this.f19451f = lgVar;
        this.f19448b = z10;
        this.f19449c = i10;
        this.h = editTextBoldCursor;
        this.f19452n = str;
        this.f19453r = document;
        this.d = j3;
        this.f19450e = z11;
    }
}
