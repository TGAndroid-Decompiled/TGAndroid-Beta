package gi;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import ji.g6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.PhotoViewer;
public final class m0 implements Utilities.Callback {
    public final int f10727a;
    public final int f10728b;
    public final Object f10729c;
    public final Object d;
    public final Object f10730e;

    public m0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f10727a = i11;
        this.f10729c = obj;
        this.f10728b = i10;
        this.d = obj2;
        this.f10730e = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f10727a) {
            case 0:
                n2 n2Var = (n2) this.f10729c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                long j3 = ((TLRPC.Chat) this.f10730e).f19869id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean isChannel = ChatObject.isChannel(chat);
                int i10 = this.f10728b;
                if (!isChannel) {
                    b2 b2Var = new b2(n2Var.getContext(), 3, null);
                    b2Var.q(250L);
                    MessagesController.getInstance(i10).convertToMegaGroup(n2Var.getParentActivity(), chat.f19869id, n2Var, new n0(b2Var, n2Var, i10, j3, booleanValue));
                    return;
                }
                long j10 = chat.f19869id;
                MessagesController.getInstance(i10).linkCommunity(-j10, j3, booleanValue, new o0(n2Var, j10, 0));
                return;
            case 1:
                g6 g6Var = (g6) this.f10729c;
                ji.a aVar = (ji.a) this.d;
                String str = (String) this.f10730e;
                SpannableString spannableString = (SpannableString) obj;
                if (this.f10728b == g6Var.I && g6Var.f13938x == aVar) {
                    Editable text = g6Var.f13933f.getText();
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
                rv rvVar = (rv) this.f10729c;
                int[] iArr = (int[]) this.d;
                ArrayList arrayList = (ArrayList) this.f10730e;
                n2 n2Var2 = rvVar.f30094c;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == this.f10728b && iArr[1] > 0) {
                    rvVar.dismiss();
                    qc.g(n2Var2, new zw0(n2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, n2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f10729c;
                TranslateController translateController = (TranslateController) this.d;
                MessageObject messageObject = (MessageObject) this.f10730e;
                String str2 = (String) obj;
                if (this.f10728b == photoViewer.Q4) {
                    photoViewer.f33640o5 = str2;
                    if (translateController.isContextTranslateEnabled() && translateController.canTranslatePhoto(messageObject, photoViewer.f33640o5)) {
                        if (photoViewer.f33631n5) {
                            photoViewer.f33635o0.K(20);
                            photoViewer.f33635o0.r(19);
                            return;
                        }
                        photoViewer.f33635o0.K(19);
                        photoViewer.f33635o0.r(20);
                        return;
                    }
                    photoViewer.f33635o0.r(19);
                    photoViewer.f33635o0.r(20);
                    return;
                }
                return;
            default:
                ad adVar = (ad) this.f10729c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.f10730e;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(adVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) bd.b(LocaleController.getString(R.string.StarGiftReasonUpgradeView), new r11(this.f10728b, context, f6Var, savedStarGift, 18), f6Var, null));
                    adVar.setText(spannableStringBuilder);
                    return;
                }
                return;
        }
    }

    public m0(rv rvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f10727a = 2;
        this.f10729c = rvVar;
        this.d = iArr;
        this.f10728b = i10;
        this.f10730e = arrayList;
    }
}
