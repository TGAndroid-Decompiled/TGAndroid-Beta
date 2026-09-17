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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.PhotoViewer;
public final class m0 implements Utilities.Callback {
    public final int f9141a;
    public final int f9142b;
    public final Object f9143c;
    public final Object d;
    public final Object e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9141a = i11;
        this.f9143c = obj;
        this.f9142b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f9141a) {
            case 0:
                o2 o2Var = (o2) this.f9143c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j3 = ((TLRPC.Chat) this.e).f18121id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f9142b;
                if (!isChannel) {
                    c2 c2Var = new c2(o2Var.getContext(), 3, null);
                    c2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(o2Var.getParentActivity(), chat.f18121id, o2Var, new n0(c2Var, o2Var, i10, j3, booleanValue));
                    return;
                }
                long j10 = chat.f18121id;
                MessagesController.getInstance(i10).linkCommunity(-j10, j3, booleanValue, new o0(o2Var, j10, 0));
                return;
            case 1:
                d6 d6Var = (d6) this.f9143c;
                ii.a aVar = (ii.a) this.d;
                String str = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f9142b == d6Var.I && d6Var.f11345x == aVar) {
                    Editable text = d6Var.f11340f.getText();
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
                sv svVar = (sv) this.f9143c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                o2 o2Var2 = svVar.f27929c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f9142b && iArr[1] > 0) {
                    svVar.dismiss();
                    oc.g(o2Var2, new bx0(o2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, o2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f9143c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str2 = (String) obj;
                if (this.f9142b == photoViewer.Q4) {
                    photoViewer.f31041o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f31041o5)) {
                        if (photoViewer.f31032n5) {
                            photoViewer.f31036o0.K(20);
                            photoViewer.f31036o0.r(19);
                            return;
                        }
                        photoViewer.f31036o0.K(19);
                        photoViewer.f31036o0.r(20);
                        return;
                    }
                    photoViewer.f31036o0.r(19);
                    photoViewer.f31036o0.r(20);
                    return;
                }
                return;
            default:
                xc xcVar = (xc) this.f9143c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new t11(this.f9142b, context, f6Var, savedStarGift, 18), f6Var, null));
                    xcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(sv svVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f9141a = 2;
        this.f9143c = svVar;
        this.d = iArr;
        this.f9142b = i10;
        this.e = arrayList;
    }
}
