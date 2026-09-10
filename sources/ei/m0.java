package ei;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import hi.g6;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.PhotoViewer;
public final class m0 implements Utilities.Callback {
    public final int f7585a;
    public final int f7586b;
    public final Object f7587c;
    public final Object d;
    public final Object e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f7585a = i11;
        this.f7587c = obj;
        this.f7586b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f7585a) {
            case 0:
                p2 p2Var = (p2) this.f7587c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j3 = ((TLRPC.Chat) this.e).f17195id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f7586b;
                if (!isChannel) {
                    d2 d2Var = new d2(p2Var.getContext(), 3, null);
                    d2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(p2Var.getParentActivity(), chat.f17195id, p2Var, new n0(d2Var, p2Var, i10, j3, booleanValue));
                    return;
                }
                long j10 = chat.f17195id;
                MessagesController.getInstance(i10).linkCommunity(-j10, j3, booleanValue, new o0(p2Var, j10, 0));
                return;
            case 1:
                g6 g6Var = (g6) this.f7587c;
                hi.a aVar = (hi.a) this.d;
                String str = (String) this.e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f7586b == g6Var.I && g6Var.f9626x == aVar) {
                    Editable text = g6Var.f9621f.getText();
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
                        g6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 2:
                wv wvVar = (wv) this.f7587c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                p2 p2Var2 = wvVar.f28842c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f7586b && iArr[1] > 0) {
                    wvVar.dismiss();
                    pc.g(p2Var2, new lx0(p2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, p2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f7587c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.e;
                String str2 = (String) obj;
                if (this.f7586b == photoViewer.Q4) {
                    photoViewer.f30140o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f30140o5)) {
                        if (photoViewer.f30131n5) {
                            photoViewer.f30135o0.K(20);
                            photoViewer.f30135o0.r(19);
                            return;
                        }
                        photoViewer.f30135o0.K(19);
                        photoViewer.f30135o0.r(20);
                        return;
                    }
                    photoViewer.f30135o0.r(19);
                    photoViewer.f30135o0.r(20);
                    return;
                }
                return;
            default:
                yc ycVar = (yc) this.f7587c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ycVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) zc.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new g21(this.f7586b, context, f6Var, savedStarGift, 17), f6Var, null));
                    ycVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(wv wvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f7585a = 2;
        this.f7587c = wvVar;
        this.d = iArr;
        this.f7586b = i10;
        this.e = arrayList;
    }
}
