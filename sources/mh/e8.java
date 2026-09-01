package mh;

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
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.mw;
public final class e8 implements Utilities.Callback {
    public final int f13971a;
    public final int f13972b;
    public final Object f13973c;
    public final Object d;
    public final Object f13974e;

    public e8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f13971a = i11;
        this.f13973c = obj;
        this.f13972b = i10;
        this.d = obj2;
        this.f13974e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f13971a) {
            case 0:
                sc scVar = (sc) this.f13973c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f13974e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(scVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) tc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new dg.u1(this.f13972b, context, g6Var, savedStarGift), g6Var, null));
                    scVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                ov ovVar = (ov) this.f13973c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.f13974e;
                org.telegram.ui.ActionBar.p2 p2Var = ovVar.f29873c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f13972b && iArr[1] > 0) {
                    ovVar.dismiss();
                    ic.g(p2Var, new cx0(p2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, p2Var.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) this.f13973c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.f13974e;
                String str = (String) obj;
                if (this.f13972b == photoViewer.N4) {
                    photoViewer.f34325l5 = str;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f34325l5)) {
                        if (photoViewer.f34317k5) {
                            photoViewer.f34321l0.K(20);
                            photoViewer.f34321l0.r(19);
                            return;
                        }
                        photoViewer.f34321l0.K(19);
                        photoViewer.f34321l0.r(20);
                        return;
                    }
                    photoViewer.f34321l0.r(19);
                    photoViewer.f34321l0.r(20);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.f13973c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j10 = ((TLRPC.Chat) this.f13974e).f20843id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f13972b;
                if (!isChannel) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(p2Var2.getContext(), 3, null);
                    d2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(p2Var2.getParentActivity(), chat.f20843id, p2Var2, new mw(d2Var, p2Var2, i10, j10, booleanValue));
                    return;
                }
                long j11 = chat.f20843id;
                MessagesController.getInstance(i10).linkCommunity(-j11, j10, booleanValue, new lh.l(p2Var2, j11, 3));
                return;
            default:
                wh.v5 v5Var = (wh.v5) this.f13973c;
                wh.a aVar = (wh.a) this.d;
                String str2 = (String) this.f13974e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f13972b == v5Var.F && v5Var.f50119x == aVar) {
                    Editable text = v5Var.f50114f.getText();
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
                        v5Var.E = str2;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e8(ov ovVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f13971a = 1;
        this.f13973c = ovVar;
        this.d = iArr;
        this.f13972b = i10;
        this.f13974e = arrayList;
    }
}
