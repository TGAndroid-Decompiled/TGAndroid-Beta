package lh;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.nw;
public final class e8 implements Utilities.Callback {
    public final int f12349a;
    public final int f12350b;
    public final Object f12351c;
    public final Object d;
    public final Object e;

    public e8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f12349a = i11;
        this.f12351c = obj;
        this.f12350b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f12349a) {
            case 0:
                sc scVar = (sc) this.f12351c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(scVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new cg.v1(this.f12350b, context, f6Var, savedStarGift), f6Var, null));
                    scVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                lv lvVar = (lv) this.f12351c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                org.telegram.ui.ActionBar.p2 p2Var = lvVar.f26879c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f12350b && iArr[1] > 0) {
                    lvVar.dismiss();
                    ic.g(p2Var, new bx0(p2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, p2Var.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f12351c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str = (String) obj;
                if (this.f12350b == photoViewer.N4) {
                    photoViewer.f31773l5 = str;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f31773l5)) {
                        if (photoViewer.f31765k5) {
                            photoViewer.f31769l0.K(20);
                            photoViewer.f31769l0.r(19);
                            return;
                        }
                        photoViewer.f31769l0.K(19);
                        photoViewer.f31769l0.r(20);
                        return;
                    }
                    photoViewer.f31769l0.r(19);
                    photoViewer.f31769l0.r(20);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f12351c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.e).f19159id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f12350b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(p2Var2.getContext(), 3, null);
                    d2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(p2Var2.getParentActivity(), chat.f19159id, p2Var2, new nw(d2Var, p2Var2, i10, j10, booleanValue));
                    return;
                }
                long j11 = chat.f19159id;
                MessagesController.getInstance(i10).linkCommunity(-j11, j10, booleanValue, new kh.l(p2Var2, j11, 3));
                return;
            default:
                vh.w5 w5Var = (vh.w5) this.f12351c;
                vh.a aVar = (vh.a) this.d;
                String str2 = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f12350b == w5Var.F && w5Var.f46346x == aVar) {
                    Editable text = w5Var.f46341f.getText();
                    if (TextUtils.equals(str2, text)) {
                        for (CodeHighlighting.ColorSpan colorSpan : (CodeHighlighting.ColorSpan[]) text.getSpans(0, text.length(), CodeHighlighting.ColorSpan.class)) {
                            text.removeSpan(colorSpan);
                        }
                        CodeHighlighting.ColorSpan[] colorSpanArr = (CodeHighlighting.ColorSpan[]) spannableString.getSpans(0, spannableString.length(), CodeHighlighting.ColorSpan.class);
                        int length = text.length();
                        for (int i11 = 0; i11 < colorSpanArr.length; i11++) {
                            int spanStart = spannableString.getSpanStart(colorSpanArr[i11]);
                            int spanEnd = spannableString.getSpanEnd(colorSpanArr[i11]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(colorSpanArr[i11], spanStart, spanEnd, 33);
                            }
                        }
                        w5Var.E = str2;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e8(lv lvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f12349a = 1;
        this.f12351c = lvVar;
        this.d = iArr;
        this.f12350b = i10;
        this.e = arrayList;
    }
}
