package fi;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import ii.d6;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.PhotoViewer;
public final class m0 implements Utilities.Callback {
    public final int f9138a;
    public final int f9139b;
    public final Object f9140c;
    public final Object d;
    public final Object e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9138a = i11;
        this.f9140c = obj;
        this.f9139b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9138a) {
            case 0:
                n2 n2Var = (n2) this.f9140c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j3 = ((TLRPC.Chat) this.e).f18109id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f9139b;
                if (!isChannel) {
                    b2 b2Var = new b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(n2Var.getParentActivity(), chat.f18109id, n2Var, new n0(b2Var, n2Var, i10, j3, booleanValue));
                    return;
                }
                long j10 = chat.f18109id;
                MessagesController.getInstance(i10).linkCommunity(-j10, j3, booleanValue, new o0(n2Var, j10, 0));
                return;
            case 1:
                d6 d6Var = (d6) this.f9140c;
                ii.a aVar = (ii.a) this.d;
                String str = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f9139b == d6Var.I && d6Var.f11344x == aVar) {
                    Editable text = d6Var.f11339f.getText();
                    if (TextUtils.equals(str, text)) {
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
                        d6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                sv svVar = (sv) this.f9140c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                n2 n2Var2 = svVar.f27972c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f9139b && iArr[1] > 0) {
                    svVar.dismiss();
                    oc.g(n2Var2, new ax0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f9140c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str2 = (String) obj;
                if (this.f9139b == photoViewer.Q4) {
                    photoViewer.f31025o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f31025o5)) {
                        if (photoViewer.f31016n5) {
                            photoViewer.f31020o0.K(20);
                            photoViewer.f31020o0.r(19);
                            return;
                        }
                        photoViewer.f31020o0.K(19);
                        photoViewer.f31020o0.r(20);
                        return;
                    }
                    photoViewer.f31020o0.r(19);
                    photoViewer.f31020o0.r(20);
                    return;
                }
                return;
            default:
                xc xcVar = (xc) this.f9140c;
                Context context = (Context) this.d;
                e6 e6Var = (e6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new s11(this.f9139b, context, e6Var, savedStarGift, 18), e6Var, null));
                    xcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(sv svVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f9138a = 2;
        this.f9140c = svVar;
        this.d = iArr;
        this.f9139b = i10;
        this.e = arrayList;
    }
}
